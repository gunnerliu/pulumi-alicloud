# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ServerGroupArgs', 'ServerGroup']

@pulumi.input_type
class ServerGroupArgs:
    def __init__(__self__, *,
                 load_balancer_id: pulumi.Input[str],
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]] = None):
        """
        The set of arguments for constructing a ServerGroup resource.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]] servers: A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        ServerGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            load_balancer_id=load_balancer_id,
            delete_protection_validation=delete_protection_validation,
            name=name,
            servers=servers,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             load_balancer_id: pulumi.Input[str],
             delete_protection_validation: Optional[pulumi.Input[bool]] = None,
             name: Optional[pulumi.Input[str]] = None,
             servers: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("load_balancer_id", load_balancer_id)
        if delete_protection_validation is not None:
            _setter("delete_protection_validation", delete_protection_validation)
        if name is not None:
            _setter("name", name)
        if servers is not None:
            warnings.warn("""Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""", DeprecationWarning)
            pulumi.log.warn("""servers is deprecated: Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""")
        if servers is not None:
            _setter("servers", servers)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[str]:
        """
        The Load Balancer ID which is used to launch a new virtual server group.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @delete_protection_validation.setter
    def delete_protection_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection_validation", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]]:
        """
        A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        warnings.warn("""Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""", DeprecationWarning)
        pulumi.log.warn("""servers is deprecated: Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""")

        return pulumi.get(self, "servers")

    @servers.setter
    def servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]]):
        pulumi.set(self, "servers", value)


@pulumi.input_type
class _ServerGroupState:
    def __init__(__self__, *,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]] = None):
        """
        Input properties used for looking up and filtering ServerGroup resources.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]] servers: A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        _ServerGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delete_protection_validation=delete_protection_validation,
            load_balancer_id=load_balancer_id,
            name=name,
            servers=servers,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delete_protection_validation: Optional[pulumi.Input[bool]] = None,
             load_balancer_id: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             servers: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if delete_protection_validation is not None:
            _setter("delete_protection_validation", delete_protection_validation)
        if load_balancer_id is not None:
            _setter("load_balancer_id", load_balancer_id)
        if name is not None:
            _setter("name", name)
        if servers is not None:
            warnings.warn("""Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""", DeprecationWarning)
            pulumi.log.warn("""servers is deprecated: Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""")
        if servers is not None:
            _setter("servers", servers)

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @delete_protection_validation.setter
    def delete_protection_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_protection_validation", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Load Balancer ID which is used to launch a new virtual server group.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]]:
        """
        A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        warnings.warn("""Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""", DeprecationWarning)
        pulumi.log.warn("""servers is deprecated: Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""")

        return pulumi.get(self, "servers")

    @servers.setter
    def servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerGroupServerArgs']]]]):
        pulumi.set(self, "servers", value)


class ServerGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerGroupServerArgs']]]]] = None,
                 __props__=None):
        """
        A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
        and to meet the personalized requirements of domain name and URL forwarding.

        > **NOTE:** One ECS instance can be added into multiple virtual server groups.

        > **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.

        > **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.

        > **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.

        > **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.

        For information about server group and how to use it, see [Configure a server group](https://www.alibabacloud.com/help/en/doc-detail/35215.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        slb_server_group_name = config.get("slbServerGroupName")
        if slb_server_group_name is None:
            slb_server_group_name = "forSlbServerGroup"
        server_group_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        server_group_network = alicloud.vpc.Network("serverGroupNetwork",
            vpc_name=slb_server_group_name,
            cidr_block="172.16.0.0/16")
        server_group_switch = alicloud.vpc.Switch("serverGroupSwitch",
            vpc_id=server_group_network.id,
            cidr_block="172.16.0.0/16",
            zone_id=server_group_zones.zones[0].id,
            vswitch_name=slb_server_group_name)
        server_group_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("serverGroupApplicationLoadBalancer",
            load_balancer_name=slb_server_group_name,
            vswitch_id=server_group_switch.id,
            instance_charge_type="PayByCLCU")
        server_group_server_group = alicloud.slb.ServerGroup("serverGroupServerGroup", load_balancer_id=server_group_application_load_balancer.id)
        ```
        ## Block servers

        The servers mapping supports the following:

        * `server_ids` - (Required) A list backend server ID (ECS instance ID).
        * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
        * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.

        ## Import

        Load balancer backend server group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:slb/serverGroup:ServerGroup example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerGroupServerArgs']]]] servers: A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
        and to meet the personalized requirements of domain name and URL forwarding.

        > **NOTE:** One ECS instance can be added into multiple virtual server groups.

        > **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.

        > **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.

        > **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.

        > **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.

        For information about server group and how to use it, see [Configure a server group](https://www.alibabacloud.com/help/en/doc-detail/35215.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        slb_server_group_name = config.get("slbServerGroupName")
        if slb_server_group_name is None:
            slb_server_group_name = "forSlbServerGroup"
        server_group_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        server_group_network = alicloud.vpc.Network("serverGroupNetwork",
            vpc_name=slb_server_group_name,
            cidr_block="172.16.0.0/16")
        server_group_switch = alicloud.vpc.Switch("serverGroupSwitch",
            vpc_id=server_group_network.id,
            cidr_block="172.16.0.0/16",
            zone_id=server_group_zones.zones[0].id,
            vswitch_name=slb_server_group_name)
        server_group_application_load_balancer = alicloud.slb.ApplicationLoadBalancer("serverGroupApplicationLoadBalancer",
            load_balancer_name=slb_server_group_name,
            vswitch_id=server_group_switch.id,
            instance_charge_type="PayByCLCU")
        server_group_server_group = alicloud.slb.ServerGroup("serverGroupServerGroup", load_balancer_id=server_group_application_load_balancer.id)
        ```
        ## Block servers

        The servers mapping supports the following:

        * `server_ids` - (Required) A list backend server ID (ECS instance ID).
        * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
        * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
        * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.

        ## Import

        Load balancer backend server group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:slb/serverGroup:ServerGroup example abc123456
        ```

        :param str resource_name: The name of the resource.
        :param ServerGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServerGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_protection_validation: Optional[pulumi.Input[bool]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerGroupServerArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerGroupArgs.__new__(ServerGroupArgs)

            __props__.__dict__["delete_protection_validation"] = delete_protection_validation
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            __props__.__dict__["name"] = name
            __props__.__dict__["servers"] = servers
        super(ServerGroup, __self__).__init__(
            'alicloud:slb/serverGroup:ServerGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_protection_validation: Optional[pulumi.Input[bool]] = None,
            load_balancer_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            servers: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerGroupServerArgs']]]]] = None) -> 'ServerGroup':
        """
        Get an existing ServerGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_protection_validation: Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        :param pulumi.Input[str] load_balancer_id: The Load Balancer ID which is used to launch a new virtual server group.
        :param pulumi.Input[str] name: Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerGroupServerArgs']]]] servers: A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerGroupState.__new__(_ServerGroupState)

        __props__.__dict__["delete_protection_validation"] = delete_protection_validation
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["name"] = name
        __props__.__dict__["servers"] = servers
        return ServerGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deleteProtectionValidation")
    def delete_protection_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        """
        return pulumi.get(self, "delete_protection_validation")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[str]:
        """
        The Load Balancer ID which is used to launch a new virtual server group.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def servers(self) -> pulumi.Output[Sequence['outputs.ServerGroupServer']]:
        """
        A list of ECS instances to be added. **NOTE:** Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        """
        warnings.warn("""Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""", DeprecationWarning)
        pulumi.log.warn("""servers is deprecated: Field 'servers' has been deprecated from provider version 1.163.0 and it will be removed in the future version. Please use the new resource 'alicloud_slb_server_group_server_attachment'.""")

        return pulumi.get(self, "servers")

