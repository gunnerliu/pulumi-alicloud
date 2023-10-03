# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BgpNetworkArgs', 'BgpNetwork']

@pulumi.input_type
class BgpNetworkArgs:
    def __init__(__self__, *,
                 dst_cidr_block: pulumi.Input[str],
                 router_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a BgpNetwork resource.
        :param pulumi.Input[str] dst_cidr_block: The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        :param pulumi.Input[str] router_id: The ID of the vRouter associated with the router interface.
        """
        BgpNetworkArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dst_cidr_block=dst_cidr_block,
            router_id=router_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dst_cidr_block: pulumi.Input[str],
             router_id: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("dst_cidr_block", dst_cidr_block)
        _setter("router_id", router_id)

    @property
    @pulumi.getter(name="dstCidrBlock")
    def dst_cidr_block(self) -> pulumi.Input[str]:
        """
        The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        """
        return pulumi.get(self, "dst_cidr_block")

    @dst_cidr_block.setter
    def dst_cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "dst_cidr_block", value)

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> pulumi.Input[str]:
        """
        The ID of the vRouter associated with the router interface.
        """
        return pulumi.get(self, "router_id")

    @router_id.setter
    def router_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "router_id", value)


@pulumi.input_type
class _BgpNetworkState:
    def __init__(__self__, *,
                 dst_cidr_block: Optional[pulumi.Input[str]] = None,
                 router_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering BgpNetwork resources.
        :param pulumi.Input[str] dst_cidr_block: The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        :param pulumi.Input[str] router_id: The ID of the vRouter associated with the router interface.
        :param pulumi.Input[str] status: The state of the advertised BGP network.
        """
        _BgpNetworkState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dst_cidr_block=dst_cidr_block,
            router_id=router_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dst_cidr_block: Optional[pulumi.Input[str]] = None,
             router_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if dst_cidr_block is not None:
            _setter("dst_cidr_block", dst_cidr_block)
        if router_id is not None:
            _setter("router_id", router_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="dstCidrBlock")
    def dst_cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        """
        return pulumi.get(self, "dst_cidr_block")

    @dst_cidr_block.setter
    def dst_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dst_cidr_block", value)

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the vRouter associated with the router interface.
        """
        return pulumi.get(self, "router_id")

    @router_id.setter
    def router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "router_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the advertised BGP network.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class BgpNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dst_cidr_block: Optional[pulumi.Input[str]] = None,
                 router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a VPC Bgp Network resource.

        For information about VPC Bgp Network and how to use it, see [What is Bgp Network](https://www.alibabacloud.com/help/en/doc-detail/91267.html).

        > **NOTE:** Available since v1.153.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example_physical_connections = alicloud.expressconnect.get_physical_connections(name_regex="^preserved-NODELETING")
        vlan_id = random.RandomInteger("vlanId",
            max=2999,
            min=1)
        example_virtual_border_router = alicloud.expressconnect.VirtualBorderRouter("exampleVirtualBorderRouter",
            local_gateway_ip="10.0.0.1",
            peer_gateway_ip="10.0.0.2",
            peering_subnet_mask="255.255.255.252",
            physical_connection_id=example_physical_connections.connections[0].id,
            virtual_border_router_name=name,
            vlan_id=vlan_id.id,
            min_rx_interval=1000,
            min_tx_interval=1000,
            detect_multiplier=10)
        example_bgp_network = alicloud.vpc.BgpNetwork("exampleBgpNetwork",
            dst_cidr_block="192.168.0.0/24",
            router_id=example_virtual_border_router.id)
        ```

        ## Import

        VPC Bgp Network can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/bgpNetwork:BgpNetwork example <router_id>:<dst_cidr_block>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dst_cidr_block: The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        :param pulumi.Input[str] router_id: The ID of the vRouter associated with the router interface.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BgpNetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a VPC Bgp Network resource.

        For information about VPC Bgp Network and how to use it, see [What is Bgp Network](https://www.alibabacloud.com/help/en/doc-detail/91267.html).

        > **NOTE:** Available since v1.153.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example_physical_connections = alicloud.expressconnect.get_physical_connections(name_regex="^preserved-NODELETING")
        vlan_id = random.RandomInteger("vlanId",
            max=2999,
            min=1)
        example_virtual_border_router = alicloud.expressconnect.VirtualBorderRouter("exampleVirtualBorderRouter",
            local_gateway_ip="10.0.0.1",
            peer_gateway_ip="10.0.0.2",
            peering_subnet_mask="255.255.255.252",
            physical_connection_id=example_physical_connections.connections[0].id,
            virtual_border_router_name=name,
            vlan_id=vlan_id.id,
            min_rx_interval=1000,
            min_tx_interval=1000,
            detect_multiplier=10)
        example_bgp_network = alicloud.vpc.BgpNetwork("exampleBgpNetwork",
            dst_cidr_block="192.168.0.0/24",
            router_id=example_virtual_border_router.id)
        ```

        ## Import

        VPC Bgp Network can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/bgpNetwork:BgpNetwork example <router_id>:<dst_cidr_block>
        ```

        :param str resource_name: The name of the resource.
        :param BgpNetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BgpNetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BgpNetworkArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dst_cidr_block: Optional[pulumi.Input[str]] = None,
                 router_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BgpNetworkArgs.__new__(BgpNetworkArgs)

            if dst_cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'dst_cidr_block'")
            __props__.__dict__["dst_cidr_block"] = dst_cidr_block
            if router_id is None and not opts.urn:
                raise TypeError("Missing required property 'router_id'")
            __props__.__dict__["router_id"] = router_id
            __props__.__dict__["status"] = None
        super(BgpNetwork, __self__).__init__(
            'alicloud:vpc/bgpNetwork:BgpNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dst_cidr_block: Optional[pulumi.Input[str]] = None,
            router_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'BgpNetwork':
        """
        Get an existing BgpNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dst_cidr_block: The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        :param pulumi.Input[str] router_id: The ID of the vRouter associated with the router interface.
        :param pulumi.Input[str] status: The state of the advertised BGP network.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BgpNetworkState.__new__(_BgpNetworkState)

        __props__.__dict__["dst_cidr_block"] = dst_cidr_block
        __props__.__dict__["router_id"] = router_id
        __props__.__dict__["status"] = status
        return BgpNetwork(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dstCidrBlock")
    def dst_cidr_block(self) -> pulumi.Output[str]:
        """
        The CIDR block of the virtual private cloud (VPC) or vSwitch that you want to connect to a data center.
        """
        return pulumi.get(self, "dst_cidr_block")

    @property
    @pulumi.getter(name="routerId")
    def router_id(self) -> pulumi.Output[str]:
        """
        The ID of the vRouter associated with the router interface.
        """
        return pulumi.get(self, "router_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The state of the advertised BGP network.
        """
        return pulumi.get(self, "status")

