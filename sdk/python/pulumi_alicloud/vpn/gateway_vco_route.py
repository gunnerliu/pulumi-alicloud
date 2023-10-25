# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['GatewayVcoRouteArgs', 'GatewayVcoRoute']

@pulumi.input_type
class GatewayVcoRouteArgs:
    def __init__(__self__, *,
                 next_hop: pulumi.Input[str],
                 route_dest: pulumi.Input[str],
                 vpn_connection_id: pulumi.Input[str],
                 weight: pulumi.Input[int]):
        """
        The set of arguments for constructing a GatewayVcoRoute resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_connection_id: The id of the vpn attachment.
        :param pulumi.Input[int] weight: The weight value of the destination route. Valid values: `0`, `100`.
        """
        GatewayVcoRouteArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            next_hop=next_hop,
            route_dest=route_dest,
            vpn_connection_id=vpn_connection_id,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             next_hop: Optional[pulumi.Input[str]] = None,
             route_dest: Optional[pulumi.Input[str]] = None,
             vpn_connection_id: Optional[pulumi.Input[str]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if next_hop is None and 'nextHop' in kwargs:
            next_hop = kwargs['nextHop']
        if next_hop is None:
            raise TypeError("Missing 'next_hop' argument")
        if route_dest is None and 'routeDest' in kwargs:
            route_dest = kwargs['routeDest']
        if route_dest is None:
            raise TypeError("Missing 'route_dest' argument")
        if vpn_connection_id is None and 'vpnConnectionId' in kwargs:
            vpn_connection_id = kwargs['vpnConnectionId']
        if vpn_connection_id is None:
            raise TypeError("Missing 'vpn_connection_id' argument")
        if weight is None:
            raise TypeError("Missing 'weight' argument")

        _setter("next_hop", next_hop)
        _setter("route_dest", route_dest)
        _setter("vpn_connection_id", vpn_connection_id)
        _setter("weight", weight)

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
    @pulumi.getter(name="vpnConnectionId")
    def vpn_connection_id(self) -> pulumi.Input[str]:
        """
        The id of the vpn attachment.
        """
        return pulumi.get(self, "vpn_connection_id")

    @vpn_connection_id.setter
    def vpn_connection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpn_connection_id", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[int]:
        """
        The weight value of the destination route. Valid values: `0`, `100`.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[int]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class _GatewayVcoRouteState:
    def __init__(__self__, *,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 vpn_connection_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering GatewayVcoRoute resources.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] status: The status of the vpn route entry.
        :param pulumi.Input[str] vpn_connection_id: The id of the vpn attachment.
        :param pulumi.Input[int] weight: The weight value of the destination route. Valid values: `0`, `100`.
        """
        _GatewayVcoRouteState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            next_hop=next_hop,
            route_dest=route_dest,
            status=status,
            vpn_connection_id=vpn_connection_id,
            weight=weight,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             next_hop: Optional[pulumi.Input[str]] = None,
             route_dest: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             vpn_connection_id: Optional[pulumi.Input[str]] = None,
             weight: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if next_hop is None and 'nextHop' in kwargs:
            next_hop = kwargs['nextHop']
        if route_dest is None and 'routeDest' in kwargs:
            route_dest = kwargs['routeDest']
        if vpn_connection_id is None and 'vpnConnectionId' in kwargs:
            vpn_connection_id = kwargs['vpnConnectionId']

        if next_hop is not None:
            _setter("next_hop", next_hop)
        if route_dest is not None:
            _setter("route_dest", route_dest)
        if status is not None:
            _setter("status", status)
        if vpn_connection_id is not None:
            _setter("vpn_connection_id", vpn_connection_id)
        if weight is not None:
            _setter("weight", weight)

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
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the vpn route entry.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="vpnConnectionId")
    def vpn_connection_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the vpn attachment.
        """
        return pulumi.get(self, "vpn_connection_id")

    @vpn_connection_id.setter
    def vpn_connection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpn_connection_id", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[int]]:
        """
        The weight value of the destination route. Valid values: `0`, `100`.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "weight", value)


class GatewayVcoRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 vpn_connection_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a VPN Gateway Vco Route resource.

        For information about VPN Gateway Vco Route and how to use it, see [What is Vco Route](https://www.alibabacloud.com/help/zh/virtual-private-cloud/latest/createvcorouteentry).

        > **NOTE:** Available in v1.183.0+.

        ## Import

        VPN Gateway Vco Route can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/gatewayVcoRoute:GatewayVcoRoute example <vpn_connection_id>:<route_dest>:<next_hop>:<weight>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] vpn_connection_id: The id of the vpn attachment.
        :param pulumi.Input[int] weight: The weight value of the destination route. Valid values: `0`, `100`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GatewayVcoRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPN Gateway Vco Route resource.

        For information about VPN Gateway Vco Route and how to use it, see [What is Vco Route](https://www.alibabacloud.com/help/zh/virtual-private-cloud/latest/createvcorouteentry).

        > **NOTE:** Available in v1.183.0+.

        ## Import

        VPN Gateway Vco Route can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpn/gatewayVcoRoute:GatewayVcoRoute example <vpn_connection_id>:<route_dest>:<next_hop>:<weight>
        ```

        :param str resource_name: The name of the resource.
        :param GatewayVcoRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GatewayVcoRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            GatewayVcoRouteArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 next_hop: Optional[pulumi.Input[str]] = None,
                 route_dest: Optional[pulumi.Input[str]] = None,
                 vpn_connection_id: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GatewayVcoRouteArgs.__new__(GatewayVcoRouteArgs)

            if next_hop is None and not opts.urn:
                raise TypeError("Missing required property 'next_hop'")
            __props__.__dict__["next_hop"] = next_hop
            if route_dest is None and not opts.urn:
                raise TypeError("Missing required property 'route_dest'")
            __props__.__dict__["route_dest"] = route_dest
            if vpn_connection_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpn_connection_id'")
            __props__.__dict__["vpn_connection_id"] = vpn_connection_id
            if weight is None and not opts.urn:
                raise TypeError("Missing required property 'weight'")
            __props__.__dict__["weight"] = weight
            __props__.__dict__["status"] = None
        super(GatewayVcoRoute, __self__).__init__(
            'alicloud:vpn/gatewayVcoRoute:GatewayVcoRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            next_hop: Optional[pulumi.Input[str]] = None,
            route_dest: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vpn_connection_id: Optional[pulumi.Input[str]] = None,
            weight: Optional[pulumi.Input[int]] = None) -> 'GatewayVcoRoute':
        """
        Get an existing GatewayVcoRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] next_hop: The next hop of the destination route.
        :param pulumi.Input[str] route_dest: The destination network segment of the destination route.
        :param pulumi.Input[str] status: The status of the vpn route entry.
        :param pulumi.Input[str] vpn_connection_id: The id of the vpn attachment.
        :param pulumi.Input[int] weight: The weight value of the destination route. Valid values: `0`, `100`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GatewayVcoRouteState.__new__(_GatewayVcoRouteState)

        __props__.__dict__["next_hop"] = next_hop
        __props__.__dict__["route_dest"] = route_dest
        __props__.__dict__["status"] = status
        __props__.__dict__["vpn_connection_id"] = vpn_connection_id
        __props__.__dict__["weight"] = weight
        return GatewayVcoRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="nextHop")
    def next_hop(self) -> pulumi.Output[str]:
        """
        The next hop of the destination route.
        """
        return pulumi.get(self, "next_hop")

    @property
    @pulumi.getter(name="routeDest")
    def route_dest(self) -> pulumi.Output[str]:
        """
        The destination network segment of the destination route.
        """
        return pulumi.get(self, "route_dest")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the vpn route entry.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpnConnectionId")
    def vpn_connection_id(self) -> pulumi.Output[str]:
        """
        The id of the vpn attachment.
        """
        return pulumi.get(self, "vpn_connection_id")

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Output[int]:
        """
        The weight value of the destination route. Valid values: `0`, `100`.
        """
        return pulumi.get(self, "weight")

