# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ServerGroup(pulumi.CustomResource):
    delete_protection_validation: pulumi.Output[bool]
    """
    Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
    """
    load_balancer_id: pulumi.Output[str]
    """
    The Load Balancer ID which is used to launch a new virtual server group.
    """
    name: pulumi.Output[str]
    """
    Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
    """
    servers: pulumi.Output[list]
    """
    A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.

      * `port` (`float`)
      * `serverIds` (`list`)
      * `type` (`str`)
      * `weight` (`float`)
    """
    def __init__(__self__, resource_name, opts=None, delete_protection_validation=None, load_balancer_id=None, name=None, servers=None, __props__=None, __name__=None, __opts__=None):
        """
        A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
        and to meet the personalized requirements of domain name and URL forwarding.

        > **NOTE:** One ECS instance can be added into multiple virtual server groups.

        > **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.

        > **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.

        > **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.

        > **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "slbservergroupvpc"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0]["id"],
            cpu_core_count=1,
            memory_size=2)
        default_images = alicloud.ecs.get_images(most_recent=True,
            name_regex="^ubuntu_18.*64",
            owners="system")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0]["id"],
            cidr_block="172.16.0.0/16",
            vpc_id=default_network.id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        instance = []
        for range in [{"value": i} for i in range(0, 2)]:
            instance.append(alicloud.ecs.Instance(f"instance-{range['value']}",
                availability_zone=default_zones.zones[0]["id"],
                image_id=default_images.images[0]["id"],
                instance_charge_type="PostPaid",
                instance_name=name,
                instance_type=default_instance_types.instance_types[0]["id"],
                internet_charge_type="PayByTraffic",
                internet_max_bandwidth_out="10",
                security_groups=[__item.id for __item in [default_security_group]],
                system_disk_category="cloud_efficiency",
                vswitch_id=default_switch.id))
        default_load_balancer = alicloud.slb.LoadBalancer("defaultLoadBalancer", vswitch_id=default_switch.id)
        default_server_group = alicloud.slb.ServerGroup("defaultServerGroup",
            load_balancer_id=default_load_balancer.id,
            servers=[
                {
                    "port": 100,
                    "serverIds": [
                        instance[0].id,
                        instance[1].id,
                    ],
                    "weight": 10,
                },
                {
                    "port": 80,
                    "serverIds": [__item.id for __item in instance],
                    "weight": 100,
                },
            ])
        ```

        ## Block servers

        The servers mapping supports the following:

        * `server_ids` - (Required) A list backend server ID (ECS instance ID).
        * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
        * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[list] servers: A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.

        The **servers** object supports the following:

          * `port` (`pulumi.Input[float]`)
          * `serverIds` (`pulumi.Input[list]`)
          * `type` (`pulumi.Input[str]`)
          * `weight` (`pulumi.Input[float]`)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['delete_protection_validation'] = delete_protection_validation
            if load_balancer_id is None:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__['load_balancer_id'] = load_balancer_id
            __props__['name'] = name
            __props__['servers'] = servers
        super(ServerGroup, __self__).__init__(
            'alicloud:slb/serverGroup:ServerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, delete_protection_validation=None, load_balancer_id=None, name=None, servers=None):
        """
        Get an existing ServerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[list] servers: A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.

        The **servers** object supports the following:

          * `port` (`pulumi.Input[float]`)
          * `serverIds` (`pulumi.Input[list]`)
          * `type` (`pulumi.Input[str]`)
          * `weight` (`pulumi.Input[float]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["delete_protection_validation"] = delete_protection_validation
        __props__["load_balancer_id"] = load_balancer_id
        __props__["name"] = name
        __props__["servers"] = servers
        return ServerGroup(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

