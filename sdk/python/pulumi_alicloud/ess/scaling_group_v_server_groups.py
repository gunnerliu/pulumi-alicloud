# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ScalingGroupVServerGroups(pulumi.CustomResource):
    force: pulumi.Output[bool]
    """
    If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
    """
    scaling_group_id: pulumi.Output[str]
    """
    ID of the scaling group.
    """
    vserver_groups: pulumi.Output[list]
    """
    A list of vserver groups attached on scaling group. See Block vserver_group below for details.

      * `loadbalancerId` (`str`)
      * `vserverAttributes` (`list`)
        * `port` (`float`)
        * `vserver_group_id` (`str`)
        * `weight` (`float`)
    """
    def __init__(__self__, resource_name, opts=None, force=None, scaling_group_id=None, vserver_groups=None, __props__=None, __name__=None, __opts__=None):
        """
        Attaches/Detaches vserver groups to a specified scaling group.

        > **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.

        > **NOTE:** If scaling group's network type is `VPC`, the vserver groups must be in the same `VPC`.
         
        > **NOTE:** A scaling group can have at most 5 vserver groups attached by default.

        > **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.

        > **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.

        > **NOTE:** Detach action will be executed before attach action.

        > **NOTE:** Vserver group is defined uniquely by `loadbalancer_id`, `vserver_group_id`, `port`.

        > **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.

        > **NOTE:** Resource `ess.ScalingGroupVServerGroups` is available in 1.53.0+.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "testAccEssVserverGroupsAttachment"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0]["id"],
            cidr_block="172.16.0.0/24",
            vpc_id=default_network.id)
        default_load_balancer = alicloud.slb.LoadBalancer("defaultLoadBalancer", vswitch_id=default_switch.id)
        default_server_group = alicloud.slb.ServerGroup("defaultServerGroup", load_balancer_id=default_load_balancer.id)
        default_listener = []
        for range in [{"value": i} for i in range(0, 2)]:
            default_listener.append(alicloud.slb.Listener(f"defaultListener-{range['value']}",
                backend_port="22",
                bandwidth="10",
                frontend_port="22",
                health_check_type="tcp",
                load_balancer_id=[__item.id for __item in [default_load_balancer]][range["value"]],
                protocol="tcp"))
        default_scaling_group = alicloud.ess.ScalingGroup("defaultScalingGroup",
            max_size="2",
            min_size="2",
            scaling_group_name=name,
            vswitch_ids=[default_switch.id])
        default_scaling_group_v_server_groups = alicloud.ess.ScalingGroupVServerGroups("defaultScalingGroupVServerGroups",
            scaling_group_id=default_scaling_group.id,
            vserver_groups=[{
                "loadbalancerId": default_load_balancer.id,
                "vserverAttributes": [{
                    "port": "100",
                    "vserverGroupId": default_server_group.id,
                    "weight": "60",
                }],
            }])
        ```

        ## Block vserver_group

        the vserver_group supports the following:

        * `loadbalancer_id` - (Required) Loadbalancer server ID of VServer Group.
        * `vserver_attributes` - (Required) A list of VServer Group attributes. See Block vserver_attribute below for details.

        ## Block vserver_attribute

        * `vserver_group_id` - (Required) ID of VServer Group.
        * `port` - (Required) - The port will be used for VServer Group backend server.
        * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group.
        :param pulumi.Input[list] vserver_groups: A list of vserver groups attached on scaling group. See Block vserver_group below for details.

        The **vserver_groups** object supports the following:

          * `loadbalancerId` (`pulumi.Input[str]`)
          * `vserverAttributes` (`pulumi.Input[list]`)
            * `port` (`pulumi.Input[float]`)
            * `vserver_group_id` (`pulumi.Input[str]`)
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

            __props__['force'] = force
            if scaling_group_id is None:
                raise TypeError("Missing required property 'scaling_group_id'")
            __props__['scaling_group_id'] = scaling_group_id
            if vserver_groups is None:
                raise TypeError("Missing required property 'vserver_groups'")
            __props__['vserver_groups'] = vserver_groups
        super(ScalingGroupVServerGroups, __self__).__init__(
            'alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, force=None, scaling_group_id=None, vserver_groups=None):
        """
        Get an existing ScalingGroupVServerGroups resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group.
        :param pulumi.Input[list] vserver_groups: A list of vserver groups attached on scaling group. See Block vserver_group below for details.

        The **vserver_groups** object supports the following:

          * `loadbalancerId` (`pulumi.Input[str]`)
          * `vserverAttributes` (`pulumi.Input[list]`)
            * `port` (`pulumi.Input[float]`)
            * `vserver_group_id` (`pulumi.Input[str]`)
            * `weight` (`pulumi.Input[float]`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["force"] = force
        __props__["scaling_group_id"] = scaling_group_id
        __props__["vserver_groups"] = vserver_groups
        return ScalingGroupVServerGroups(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

