# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['RouteEntry']


class RouteEntry(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 publish_vpc: Optional[pulumi.Input[bool]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 vpn_gateway_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[float]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a RouteEntry resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[float] weight: The value should be 0 or 100.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if next_hop is None:
                raise TypeError("Missing required property 'next_hop'")
            __props__['next_hop'] = next_hop
            if publish_vpc is None:
                raise TypeError("Missing required property 'publish_vpc'")
            __props__['publish_vpc'] = publish_vpc
            if route_dest is None:
                raise TypeError("Missing required property 'route_dest'")
            __props__['route_dest'] = route_dest
            if vpn_gateway_id is None:
                raise TypeError("Missing required property 'vpn_gateway_id'")
            __props__['vpn_gateway_id'] = vpn_gateway_id
            if weight is None:
                raise TypeError("Missing required property 'weight'")
            __props__['weight'] = weight
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
            vpn_gateway_id: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[float]] = None) -> 'RouteEntry':
        """
        Get an existing RouteEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[bool] publish_vpc: Whether to issue the destination route to the VPC.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_gateway_id: The id of the vpn gateway.
        :param pulumi.Input[float] weight: The value should be 0 or 100.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["next_hop"] = next_hop
        __props__["publish_vpc"] = publish_vpc
        __props__["route_dest"] = route_dest
        __props__["vpn_gateway_id"] = vpn_gateway_id
        __props__["weight"] = weight
        return RouteEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="nextHop")
    def next_hop(self) -> str:
        """
        The next hop of the destination route.
        """
        return pulumi.get(self, "next_hop")

    @property
    @pulumi.getter(name="publishVpc")
    def publish_vpc(self) -> bool:
        """
        Whether to issue the destination route to the VPC.
        """
        return pulumi.get(self, "publish_vpc")

    @property
    @pulumi.getter(name="routeDest")
    def route_dest(self) -> str:
        """
        The destination network segment of the destination route.
        """
        return pulumi.get(self, "route_dest")

    @property
    @pulumi.getter(name="vpnGatewayId")
    def vpn_gateway_id(self) -> str:
        """
        The id of the vpn gateway.
        """
        return pulumi.get(self, "vpn_gateway_id")

    @property
    @pulumi.getter
    def weight(self) -> float:
        """
        The value should be 0 or 100.
        """
        return pulumi.get(self, "weight")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

