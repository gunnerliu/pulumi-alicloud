# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['LoadbalancerCommonBandwidthPackageAttachmentArgs', 'LoadbalancerCommonBandwidthPackageAttachment']

@pulumi.input_type
class LoadbalancerCommonBandwidthPackageAttachmentArgs:
    def __init__(__self__, *,
                 bandwidth_package_id: pulumi.Input[str],
                 load_balancer_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a LoadbalancerCommonBandwidthPackageAttachment resource.
        :param pulumi.Input[str] bandwidth_package_id: The ID of the bound shared bandwidth package.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance.
        """
        LoadbalancerCommonBandwidthPackageAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth_package_id=bandwidth_package_id,
            load_balancer_id=load_balancer_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth_package_id: Optional[pulumi.Input[str]] = None,
             load_balancer_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if bandwidth_package_id is None and 'bandwidthPackageId' in kwargs:
            bandwidth_package_id = kwargs['bandwidthPackageId']
        if bandwidth_package_id is None:
            raise TypeError("Missing 'bandwidth_package_id' argument")
        if load_balancer_id is None and 'loadBalancerId' in kwargs:
            load_balancer_id = kwargs['loadBalancerId']
        if load_balancer_id is None:
            raise TypeError("Missing 'load_balancer_id' argument")

        _setter("bandwidth_package_id", bandwidth_package_id)
        _setter("load_balancer_id", load_balancer_id)

    @property
    @pulumi.getter(name="bandwidthPackageId")
    def bandwidth_package_id(self) -> pulumi.Input[str]:
        """
        The ID of the bound shared bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_id")

    @bandwidth_package_id.setter
    def bandwidth_package_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "bandwidth_package_id", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Input[str]:
        """
        The ID of the network-based server load balancer instance.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "load_balancer_id", value)


@pulumi.input_type
class _LoadbalancerCommonBandwidthPackageAttachmentState:
    def __init__(__self__, *,
                 bandwidth_package_id: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LoadbalancerCommonBandwidthPackageAttachment resources.
        :param pulumi.Input[str] bandwidth_package_id: The ID of the bound shared bandwidth package.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance.
        :param pulumi.Input[str] status: Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
        """
        _LoadbalancerCommonBandwidthPackageAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            bandwidth_package_id=bandwidth_package_id,
            load_balancer_id=load_balancer_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             bandwidth_package_id: Optional[pulumi.Input[str]] = None,
             load_balancer_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if bandwidth_package_id is None and 'bandwidthPackageId' in kwargs:
            bandwidth_package_id = kwargs['bandwidthPackageId']
        if load_balancer_id is None and 'loadBalancerId' in kwargs:
            load_balancer_id = kwargs['loadBalancerId']

        if bandwidth_package_id is not None:
            _setter("bandwidth_package_id", bandwidth_package_id)
        if load_balancer_id is not None:
            _setter("load_balancer_id", load_balancer_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="bandwidthPackageId")
    def bandwidth_package_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the bound shared bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_id")

    @bandwidth_package_id.setter
    def bandwidth_package_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bandwidth_package_id", value)

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the network-based server load balancer instance.
        """
        return pulumi.get(self, "load_balancer_id")

    @load_balancer_id.setter
    def load_balancer_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "load_balancer_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class LoadbalancerCommonBandwidthPackageAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_package_id: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a NLB Loadbalancer Common Bandwidth Package Attachment resource. Bandwidth Package Operation.

        For information about NLB Loadbalancer Common Bandwidth Package Attachment and how to use it, see [What is Loadbalancer Common Bandwidth Package Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/nlb-instances-change).

        > **NOTE:** Available since v1.209.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_zones = alicloud.nlb.get_zones()
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default1 = alicloud.vpc.Switch("default1",
            vswitch_name=name,
            cidr_block="10.4.1.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_load_balancer = alicloud.nlb.LoadBalancer("defaultLoadBalancer",
            load_balancer_name=name,
            resource_group_id=default_resource_groups.ids[0],
            load_balancer_type="Network",
            address_type="Internet",
            address_ip_version="Ipv4",
            vpc_id=default_network.id,
            tags={
                "Created": "TF",
                "For": "example",
            },
            zone_mappings=[
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=default_switch.id,
                    zone_id=default_zones.zones[0].id,
                ),
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=default1.id,
                    zone_id=default_zones.zones[1].id,
                ),
            ])
        default_common_bandwith_package = alicloud.vpc.CommonBandwithPackage("defaultCommonBandwithPackage",
            bandwidth="2",
            internet_charge_type="PayByBandwidth",
            bandwidth_package_name=name,
            description=name)
        default_loadbalancer_common_bandwidth_package_attachment = alicloud.nlb.LoadbalancerCommonBandwidthPackageAttachment("defaultLoadbalancerCommonBandwidthPackageAttachment",
            bandwidth_package_id=default_common_bandwith_package.id,
            load_balancer_id=default_load_balancer.id)
        ```

        ## Import

        NLB Loadbalancer Common Bandwidth Package Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment example <load_balancer_id>:<bandwidth_package_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth_package_id: The ID of the bound shared bandwidth package.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LoadbalancerCommonBandwidthPackageAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a NLB Loadbalancer Common Bandwidth Package Attachment resource. Bandwidth Package Operation.

        For information about NLB Loadbalancer Common Bandwidth Package Attachment and how to use it, see [What is Loadbalancer Common Bandwidth Package Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/nlb-instances-change).

        > **NOTE:** Available since v1.209.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_resource_groups = alicloud.resourcemanager.get_resource_groups()
        default_zones = alicloud.nlb.get_zones()
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default1 = alicloud.vpc.Switch("default1",
            vswitch_name=name,
            cidr_block="10.4.1.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[1].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_load_balancer = alicloud.nlb.LoadBalancer("defaultLoadBalancer",
            load_balancer_name=name,
            resource_group_id=default_resource_groups.ids[0],
            load_balancer_type="Network",
            address_type="Internet",
            address_ip_version="Ipv4",
            vpc_id=default_network.id,
            tags={
                "Created": "TF",
                "For": "example",
            },
            zone_mappings=[
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=default_switch.id,
                    zone_id=default_zones.zones[0].id,
                ),
                alicloud.nlb.LoadBalancerZoneMappingArgs(
                    vswitch_id=default1.id,
                    zone_id=default_zones.zones[1].id,
                ),
            ])
        default_common_bandwith_package = alicloud.vpc.CommonBandwithPackage("defaultCommonBandwithPackage",
            bandwidth="2",
            internet_charge_type="PayByBandwidth",
            bandwidth_package_name=name,
            description=name)
        default_loadbalancer_common_bandwidth_package_attachment = alicloud.nlb.LoadbalancerCommonBandwidthPackageAttachment("defaultLoadbalancerCommonBandwidthPackageAttachment",
            bandwidth_package_id=default_common_bandwith_package.id,
            load_balancer_id=default_load_balancer.id)
        ```

        ## Import

        NLB Loadbalancer Common Bandwidth Package Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment example <load_balancer_id>:<bandwidth_package_id>
        ```

        :param str resource_name: The name of the resource.
        :param LoadbalancerCommonBandwidthPackageAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LoadbalancerCommonBandwidthPackageAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            LoadbalancerCommonBandwidthPackageAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth_package_id: Optional[pulumi.Input[str]] = None,
                 load_balancer_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LoadbalancerCommonBandwidthPackageAttachmentArgs.__new__(LoadbalancerCommonBandwidthPackageAttachmentArgs)

            if bandwidth_package_id is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth_package_id'")
            __props__.__dict__["bandwidth_package_id"] = bandwidth_package_id
            if load_balancer_id is None and not opts.urn:
                raise TypeError("Missing required property 'load_balancer_id'")
            __props__.__dict__["load_balancer_id"] = load_balancer_id
            __props__.__dict__["status"] = None
        super(LoadbalancerCommonBandwidthPackageAttachment, __self__).__init__(
            'alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth_package_id: Optional[pulumi.Input[str]] = None,
            load_balancer_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'LoadbalancerCommonBandwidthPackageAttachment':
        """
        Get an existing LoadbalancerCommonBandwidthPackageAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] bandwidth_package_id: The ID of the bound shared bandwidth package.
        :param pulumi.Input[str] load_balancer_id: The ID of the network-based server load balancer instance.
        :param pulumi.Input[str] status: Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LoadbalancerCommonBandwidthPackageAttachmentState.__new__(_LoadbalancerCommonBandwidthPackageAttachmentState)

        __props__.__dict__["bandwidth_package_id"] = bandwidth_package_id
        __props__.__dict__["load_balancer_id"] = load_balancer_id
        __props__.__dict__["status"] = status
        return LoadbalancerCommonBandwidthPackageAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bandwidthPackageId")
    def bandwidth_package_id(self) -> pulumi.Output[str]:
        """
        The ID of the bound shared bandwidth package.
        """
        return pulumi.get(self, "bandwidth_package_id")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> pulumi.Output[str]:
        """
        The ID of the network-based server load balancer instance.
        """
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
        """
        return pulumi.get(self, "status")

