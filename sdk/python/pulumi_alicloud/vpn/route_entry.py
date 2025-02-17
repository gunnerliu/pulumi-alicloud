# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RouteEntryArgs', 'RouteEntry']

@pulumi.input_type
class RouteEntryArgs:
    def __init__(__self__, *,
                 next_hop: pulumi.Input[str],
                 publish_vpc: pulumi.Input[bool],
                 route_dest: pulumi.Input[str],
                 vpn_gateway_id: pulumi.Input[str],
                 weight: pulumi.Input[int]):
        """
        The set of arguments for constructing a RouteEntry resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[int] weight: The value should be 0 or 100.
        """
        pulumi.set(__self__, "next_hop", next_hop)
        pulumi.set(__self__, "publish_vpc", publish_vpc)
        pulumi.set(__self__, "route_dest", route_dest)
        pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="nextHop")
    def next_hop(self) -> pulumi.Input[str]:
        """
        The next hop of the destination route.
        """
        return pulumi.get(self, "next_hop")

    @next_hop.setter
    def next_hop(self, value: pulumi.Input[str]):
        pulumi.set(self, "next_hop", value)

    @property
    @pulumi.getter(name="publishVpc")
    def publish_vpc(self) -> pulumi.Input[bool]:
        """
        Whether to issue the destination route to the VPC.
        """
        return pulumi.get(self, "publish_vpc")

    @publish_vpc.setter
    def publish_vpc(self, value: pulumi.Input[bool]):
        pulumi.set(self, "publish_vpc", value)

    @property
    @pulumi.getter(name="routeDest")
    def route_dest(self) -> pulumi.Input[str]:
        """
        The destination network segment of the destination route.
        """
        return pulumi.get(self, "route_dest")

    @route_dest.setter
    def route_dest(self, value: pulumi.Input[str]):
        pulumi.set(self, "route_dest", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Input[str]:
        """
        The id of the vpn gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_gateway_id", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[int]:
        """
        The value should be 0 or 100.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[int]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _RouteEntryState:
    def __init__(__self__, *,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 publish_vpc: Optional[pulumi.Input[bool]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 route_entry_type: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering RouteEntry resources.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] route_entry_type: (Available in 1.161.0+) The type of the vpn route entry.
        :param pulumi.Input[str] status: (Available in 1.161.0+) The status of the vpn route entry.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[int] weight: The value should be 0 or 100.
        """
        if next_hop is not None:
            pulumi.set(__self__, "next_hop", next_hop)
        if publish_vpc is not None:
            pulumi.set(__self__, "publish_vpc", publish_vpc)
        if route_dest is not None:
            pulumi.set(__self__, "route_dest", route_dest)
        if route_entry_type is not None:
            pulumi.set(__self__, "route_entry_type", route_entry_type)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if vpn_gateway_id is not None:
            pulumi.set(__self__, "vpn_gateway_id", vpn_gateway_id)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="nextHop")
    def next_hop(self) -> Optional[pulumi.Input[str]]:
        """
        The next hop of the destination route.
        """
        return pulumi.get(self, "next_hop")

    @next_hop.setter
    def next_hop(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_hop", value)

    @property
    @pulumi.getter(name="publishVpc")
    def publish_vpc(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to issue the destination route to the VPC.
        """
        return pulumi.get(self, "publish_vpc")

    @publish_vpc.setter
    def publish_vpc(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "publish_vpc", value)

    @property
    @pulumi.getter(name="routeDest")
    def route_dest(self) -> Optional[pulumi.Input[str]]:
        """
        The destination network segment of the destination route.
        """
        return pulumi.get(self, "route_dest")

    @route_dest.setter
    def route_dest(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_dest", value)

    @property
    @pulumi.getter(name="routeEntryType")
    def route_entry_type(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.161.0+) The type of the vpn route entry.
        """
        return pulumi.get(self, "route_entry_type")

    @route_entry_type.setter
    def route_entry_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_entry_type", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.161.0+) The status of the vpn route entry.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the vpn gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @vpn_gateway_id.setter
    def vpn_gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_gateway_id", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The value should be 0 or 100.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class RouteEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 publish_vpc: Optional[pulumi.Input[bool]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
        default_switches = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.ids[0])
        default_gateway = alicloud.vpn.Gateway("defaultGateway",
            vpc_id=default_networks.ids[0],
            bandwidth=10,
            instance_charge_type="PrePaid",
            enable_ssl=False,
            vswitch_id=default_switches.ids[0])
        default_customer_gateway = alicloud.vpn.CustomerGateway("defaultCustomerGateway", ip_address="192.168.1.1")
        default_connection = alicloud.vpn.Connection("defaultConnection",
            customer_gateway_id=default_customer_gateway.id,
            vpn_gateway_id=default_gateway.id,
            local_subnets=["192.168.2.0/24"],
            remote_subnets=["192.168.3.0/24"])
        default_route_entry = alicloud.vpn.RouteEntry("defaultRouteEntry",
            vpn_gateway_id=default_gateway.id,
            route_dest="10.0.0.0/24",
            next_hop=default_connection.id,
            weight=0,
            publish_vpc=False)
        ```

        ## Import

        VPN route entry can be imported using the id(VpnGatewayId +":"+ NextHop +":"+ RouteDest), e.g.

        ```sh
        $ pulumi import alicloud:vpn/routeEntry:RouteEntry example vpn-abc123456:vco-abc123456:10.0.0.10/24
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[int] weight: The value should be 0 or 100.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
        default_switches = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
            zone_id=default_zones.ids[0])
        default_gateway = alicloud.vpn.Gateway("defaultGateway",
            vpc_id=default_networks.ids[0],
            bandwidth=10,
            instance_charge_type="PrePaid",
            enable_ssl=False,
            vswitch_id=default_switches.ids[0])
        default_customer_gateway = alicloud.vpn.CustomerGateway("defaultCustomerGateway", ip_address="192.168.1.1")
        default_connection = alicloud.vpn.Connection("defaultConnection",
            customer_gateway_id=default_customer_gateway.id,
            vpn_gateway_id=default_gateway.id,
            local_subnets=["192.168.2.0/24"],
            remote_subnets=["192.168.3.0/24"])
        default_route_entry = alicloud.vpn.RouteEntry("defaultRouteEntry",
            vpn_gateway_id=default_gateway.id,
            route_dest="10.0.0.0/24",
            next_hop=default_connection.id,
            weight=0,
            publish_vpc=False)
        ```

        ## Import

        VPN route entry can be imported using the id(VpnGatewayId +":"+ NextHop +":"+ RouteDest), e.g.

        ```sh
        $ pulumi import alicloud:vpn/routeEntry:RouteEntry example vpn-abc123456:vco-abc123456:10.0.0.10/24
        ```

        :param str resource_name: The name of the resource.
        :param RouteEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 publish_vpc: Optional[pulumi.Input[bool]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteEntryArgs.__new__(RouteEntryArgs)

            if next_hop is None and not opts.urn:
                raise TypeError("Missing required property 'next_hop'")
            __props__.__dict__["next_hop"] = next_hop
            if publish_vpc is None and not opts.urn:
                raise TypeError("Missing required property 'publish_vpc'")
            __props__.__dict__["publish_vpc"] = publish_vpc
            if route_dest is None and not opts.urn:
                raise TypeError("Missing required property 'route_dest'")
            __props__.__dict__["route_dest"] = route_dest
            if vpn_gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_gateway_id'")
            __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
            if weight is None and not opts.urn:
                raise TypeError("Missing required property 'weight'")
            __props__.__dict__["weight"] = weight
            __props__.__dict__["route_entry_type"] = None
            __props__.__dict__["status"] = None
        super(RouteEntry, __self__).__init__(
            'alicloud:vpn/routeEntry:RouteEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            next_hop: Optional[pulumi.Input[str]] = None,
            publish_vpc: Optional[pulumi.Input[bool]] = None,
            route_dest: Optional[pulumi.Input[str]] = None,
            route_entry_type: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpn_gateway_id: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'RouteEntry':
        """
        Get an existing RouteEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] route_entry_type: (Available in 1.161.0+) The type of the vpn route entry.
        :param pulumi.Input[str] status: (Available in 1.161.0+) The status of the vpn route entry.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[int] weight: The value should be 0 or 100.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteEntryState.__new__(_RouteEntryState)

        __props__.__dict__["next_hop"] = next_hop
        __props__.__dict__["publish_vpc"] = publish_vpc
        __props__.__dict__["route_dest"] = route_dest
        __props__.__dict__["route_entry_type"] = route_entry_type
        __props__.__dict__["status"] = status
        __props__.__dict__["vpn_gateway_id"] = vpn_gateway_id
        __props__.__dict__["weight"] = weight
        return RouteEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="nextHop")
    def next_hop(self) -> pulumi.Output[str]:
        """
        The next hop of the destination route.
        """
        return pulumi.get(self, "next_hop")

    @property
    @pulumi.getter(name="publishVpc")
    def publish_vpc(self) -> pulumi.Output[bool]:
        """
        Whether to issue the destination route to the VPC.
        """
        return pulumi.get(self, "publish_vpc")

    @property
    @pulumi.getter(name="routeDest")
    def route_dest(self) -> pulumi.Output[str]:
        """
        The destination network segment of the destination route.
        """
        return pulumi.get(self, "route_dest")

    @property
    @pulumi.getter(name="routeEntryType")
    def route_entry_type(self) -> pulumi.Output[str]:
        """
        (Available in 1.161.0+) The type of the vpn route entry.
        """
        return pulumi.get(self, "route_entry_type")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in 1.161.0+) The status of the vpn route entry.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> pulumi.Output[str]:
        """
        The id of the vpn gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[int]:
        """
        The value should be 0 or 100.
        """
        return pulumi.get(self, "weight")

