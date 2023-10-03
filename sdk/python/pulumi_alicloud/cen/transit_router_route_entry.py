# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterRouteEntryArgs', 'TransitRouterRouteEntry']

@pulumi.input_type
class TransitRouterRouteEntryArgs:
    def __init__(__self__, *,
                 transit_router_route_entry_destination_cidr_block: pulumi.Input[str],
                 transit_router_route_entry_next_hop_type: pulumi.Input[str],
                 transit_router_route_table_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouterRouteEntry resource.
        :param pulumi.Input[str] transit_router_route_entry_destination_cidr_block: The CIDR of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_type: The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        :param pulumi.Input[str] transit_router_route_table_id: The ID of the transit router route table.
        :param pulumi.Input[bool] dry_run: The dry run.
               
               > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
               If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        :param pulumi.Input[str] transit_router_route_entry_description: The description of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_name: The name of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_id: The ID of the transit router route entry next hop.
        """
        TransitRouterRouteEntryArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            transit_router_route_entry_destination_cidr_block=transit_router_route_entry_destination_cidr_block,
            transit_router_route_entry_next_hop_type=transit_router_route_entry_next_hop_type,
            transit_router_route_table_id=transit_router_route_table_id,
            dry_run=dry_run,
            transit_router_route_entry_description=transit_router_route_entry_description,
            transit_router_route_entry_name=transit_router_route_entry_name,
            transit_router_route_entry_next_hop_id=transit_router_route_entry_next_hop_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             transit_router_route_entry_destination_cidr_block: pulumi.Input[str],
             transit_router_route_entry_next_hop_type: pulumi.Input[str],
             transit_router_route_table_id: pulumi.Input[str],
             dry_run: Optional[pulumi.Input[bool]] = None,
             transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("transit_router_route_entry_destination_cidr_block", transit_router_route_entry_destination_cidr_block)
        _setter("transit_router_route_entry_next_hop_type", transit_router_route_entry_next_hop_type)
        _setter("transit_router_route_table_id", transit_router_route_table_id)
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if transit_router_route_entry_description is not None:
            _setter("transit_router_route_entry_description", transit_router_route_entry_description)
        if transit_router_route_entry_name is not None:
            _setter("transit_router_route_entry_name", transit_router_route_entry_name)
        if transit_router_route_entry_next_hop_id is not None:
            _setter("transit_router_route_entry_next_hop_id", transit_router_route_entry_next_hop_id)

    @property
    @pulumi.getter(name="transitRouterRouteEntryDestinationCidrBlock")
    def transit_router_route_entry_destination_cidr_block(self) -> pulumi.Input[str]:
        """
        The CIDR of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_destination_cidr_block")

    @transit_router_route_entry_destination_cidr_block.setter
    def transit_router_route_entry_destination_cidr_block(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_route_entry_destination_cidr_block", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopType")
    def transit_router_route_entry_next_hop_type(self) -> pulumi.Input[str]:
        """
        The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_type")

    @transit_router_route_entry_next_hop_type.setter
    def transit_router_route_entry_next_hop_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_route_entry_next_hop_type", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @transit_router_route_table_id.setter
    def transit_router_route_table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_route_table_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.

        > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
        If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryDescription")
    def transit_router_route_entry_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_description")

    @transit_router_route_entry_description.setter
    def transit_router_route_entry_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_description", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryName")
    def transit_router_route_entry_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_name")

    @transit_router_route_entry_name.setter
    def transit_router_route_entry_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_name", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopId")
    def transit_router_route_entry_next_hop_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router route entry next hop.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_id")

    @transit_router_route_entry_next_hop_id.setter
    def transit_router_route_entry_next_hop_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_next_hop_id", value)


@pulumi.input_type
class _TransitRouterRouteEntryState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_type: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterRouteEntry resources.
        :param pulumi.Input[bool] dry_run: The dry run.
               
               > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
               If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[str] transit_router_route_entry_description: The description of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_destination_cidr_block: The CIDR of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_id: The ID of the route entry.
        :param pulumi.Input[str] transit_router_route_entry_name: The name of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_id: The ID of the transit router route entry next hop.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_type: The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        :param pulumi.Input[str] transit_router_route_table_id: The ID of the transit router route table.
        """
        _TransitRouterRouteEntryState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dry_run=dry_run,
            status=status,
            transit_router_route_entry_description=transit_router_route_entry_description,
            transit_router_route_entry_destination_cidr_block=transit_router_route_entry_destination_cidr_block,
            transit_router_route_entry_id=transit_router_route_entry_id,
            transit_router_route_entry_name=transit_router_route_entry_name,
            transit_router_route_entry_next_hop_id=transit_router_route_entry_next_hop_id,
            transit_router_route_entry_next_hop_type=transit_router_route_entry_next_hop_type,
            transit_router_route_table_id=transit_router_route_table_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dry_run: Optional[pulumi.Input[bool]] = None,
             status: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_destination_cidr_block: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_id: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
             transit_router_route_entry_next_hop_type: Optional[pulumi.Input[str]] = None,
             transit_router_route_table_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if dry_run is not None:
            _setter("dry_run", dry_run)
        if status is not None:
            _setter("status", status)
        if transit_router_route_entry_description is not None:
            _setter("transit_router_route_entry_description", transit_router_route_entry_description)
        if transit_router_route_entry_destination_cidr_block is not None:
            _setter("transit_router_route_entry_destination_cidr_block", transit_router_route_entry_destination_cidr_block)
        if transit_router_route_entry_id is not None:
            _setter("transit_router_route_entry_id", transit_router_route_entry_id)
        if transit_router_route_entry_name is not None:
            _setter("transit_router_route_entry_name", transit_router_route_entry_name)
        if transit_router_route_entry_next_hop_id is not None:
            _setter("transit_router_route_entry_next_hop_id", transit_router_route_entry_next_hop_id)
        if transit_router_route_entry_next_hop_type is not None:
            _setter("transit_router_route_entry_next_hop_type", transit_router_route_entry_next_hop_type)
        if transit_router_route_table_id is not None:
            _setter("transit_router_route_table_id", transit_router_route_table_id)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.

        > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
        If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The associating status of the Transit Router.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryDescription")
    def transit_router_route_entry_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_description")

    @transit_router_route_entry_description.setter
    def transit_router_route_entry_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_description", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryDestinationCidrBlock")
    def transit_router_route_entry_destination_cidr_block(self) -> Optional[pulumi.Input[str]]:
        """
        The CIDR of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_destination_cidr_block")

    @transit_router_route_entry_destination_cidr_block.setter
    def transit_router_route_entry_destination_cidr_block(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_destination_cidr_block", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryId")
    def transit_router_route_entry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_id")

    @transit_router_route_entry_id.setter
    def transit_router_route_entry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_id", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryName")
    def transit_router_route_entry_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_name")

    @transit_router_route_entry_name.setter
    def transit_router_route_entry_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_name", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopId")
    def transit_router_route_entry_next_hop_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router route entry next hop.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_id")

    @transit_router_route_entry_next_hop_id.setter
    def transit_router_route_entry_next_hop_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_next_hop_id", value)

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopType")
    def transit_router_route_entry_next_hop_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_type")

    @transit_router_route_entry_next_hop_type.setter
    def transit_router_route_entry_next_hop_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_entry_next_hop_type", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @transit_router_route_table_id.setter
    def transit_router_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_id", value)


class TransitRouterRouteEntry(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_type: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CEN transit router route entry resource.[What is Cen Transit Router Route Entry](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitrouterrouteentry)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name=name,
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name=name,
            cen_id=example_instance.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("exampleTransitRouterRouteTable", transit_router_id=example_transit_router.transit_router_id)
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
        example_transit_router_vbr_attachment = alicloud.cen.TransitRouterVbrAttachment("exampleTransitRouterVbrAttachment",
            vbr_id=example_virtual_border_router.id,
            cen_id=example_instance.id,
            transit_router_id=example_transit_router.transit_router_id,
            auto_publish_route_enabled=True,
            transit_router_attachment_name=name,
            transit_router_attachment_description=name)
        example_transit_router_route_entry = alicloud.cen.TransitRouterRouteEntry("exampleTransitRouterRouteEntry",
            transit_router_route_table_id=example_transit_router_route_table.transit_router_route_table_id,
            transit_router_route_entry_destination_cidr_block="192.168.0.0/24",
            transit_router_route_entry_next_hop_type="Attachment",
            transit_router_route_entry_name=name,
            transit_router_route_entry_description=name,
            transit_router_route_entry_next_hop_id=example_transit_router_vbr_attachment.transit_router_attachment_id)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterRouteEntry:TransitRouterRouteEntry default vtb-*********:rte-*******
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
               
               > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
               If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        :param pulumi.Input[str] transit_router_route_entry_description: The description of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_destination_cidr_block: The CIDR of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_name: The name of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_id: The ID of the transit router route entry next hop.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_type: The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        :param pulumi.Input[str] transit_router_route_table_id: The ID of the transit router route table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterRouteEntryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN transit router route entry resource.[What is Cen Transit Router Route Entry](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-createtransitrouterrouteentry)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud
        import pulumi_random as random

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name=name,
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name=name,
            cen_id=example_instance.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("exampleTransitRouterRouteTable", transit_router_id=example_transit_router.transit_router_id)
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
        example_transit_router_vbr_attachment = alicloud.cen.TransitRouterVbrAttachment("exampleTransitRouterVbrAttachment",
            vbr_id=example_virtual_border_router.id,
            cen_id=example_instance.id,
            transit_router_id=example_transit_router.transit_router_id,
            auto_publish_route_enabled=True,
            transit_router_attachment_name=name,
            transit_router_attachment_description=name)
        example_transit_router_route_entry = alicloud.cen.TransitRouterRouteEntry("exampleTransitRouterRouteEntry",
            transit_router_route_table_id=example_transit_router_route_table.transit_router_route_table_id,
            transit_router_route_entry_destination_cidr_block="192.168.0.0/24",
            transit_router_route_entry_next_hop_type="Attachment",
            transit_router_route_entry_name=name,
            transit_router_route_entry_description=name,
            transit_router_route_entry_next_hop_id=example_transit_router_vbr_attachment.transit_router_attachment_id)
        ```

        ## Import

        CEN instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterRouteEntry:TransitRouterRouteEntry default vtb-*********:rte-*******
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterRouteEntryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterRouteEntryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TransitRouterRouteEntryArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_destination_cidr_block: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_entry_next_hop_type: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterRouteEntryArgs.__new__(TransitRouterRouteEntryArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["transit_router_route_entry_description"] = transit_router_route_entry_description
            if transit_router_route_entry_destination_cidr_block is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_route_entry_destination_cidr_block'")
            __props__.__dict__["transit_router_route_entry_destination_cidr_block"] = transit_router_route_entry_destination_cidr_block
            __props__.__dict__["transit_router_route_entry_name"] = transit_router_route_entry_name
            __props__.__dict__["transit_router_route_entry_next_hop_id"] = transit_router_route_entry_next_hop_id
            if transit_router_route_entry_next_hop_type is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_route_entry_next_hop_type'")
            __props__.__dict__["transit_router_route_entry_next_hop_type"] = transit_router_route_entry_next_hop_type
            if transit_router_route_table_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_route_table_id'")
            __props__.__dict__["transit_router_route_table_id"] = transit_router_route_table_id
            __props__.__dict__["status"] = None
            __props__.__dict__["transit_router_route_entry_id"] = None
        super(TransitRouterRouteEntry, __self__).__init__(
            'alicloud:cen/transitRouterRouteEntry:TransitRouterRouteEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_description: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_destination_cidr_block: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_id: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_name: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_next_hop_id: Optional[pulumi.Input[str]] = None,
            transit_router_route_entry_next_hop_type: Optional[pulumi.Input[str]] = None,
            transit_router_route_table_id: Optional[pulumi.Input[str]] = None) -> 'TransitRouterRouteEntry':
        """
        Get an existing TransitRouterRouteEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
               
               > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
               If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[str] transit_router_route_entry_description: The description of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_destination_cidr_block: The CIDR of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_id: The ID of the route entry.
        :param pulumi.Input[str] transit_router_route_entry_name: The name of the transit router route entry.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_id: The ID of the transit router route entry next hop.
        :param pulumi.Input[str] transit_router_route_entry_next_hop_type: The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        :param pulumi.Input[str] transit_router_route_table_id: The ID of the transit router route table.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterRouteEntryState.__new__(_TransitRouterRouteEntryState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
        __props__.__dict__["transit_router_route_entry_description"] = transit_router_route_entry_description
        __props__.__dict__["transit_router_route_entry_destination_cidr_block"] = transit_router_route_entry_destination_cidr_block
        __props__.__dict__["transit_router_route_entry_id"] = transit_router_route_entry_id
        __props__.__dict__["transit_router_route_entry_name"] = transit_router_route_entry_name
        __props__.__dict__["transit_router_route_entry_next_hop_id"] = transit_router_route_entry_next_hop_id
        __props__.__dict__["transit_router_route_entry_next_hop_type"] = transit_router_route_entry_next_hop_type
        __props__.__dict__["transit_router_route_table_id"] = transit_router_route_table_id
        return TransitRouterRouteEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.

        > **NOTE:** If transit_router_route_entry_next_hop_type is `Attachment`, transit_router_route_entry_next_hop_id is required.
        If transit_router_route_entry_next_hop_type is `BlackHole`, transit_router_route_entry_next_hop_id cannot be filled.
        """
        return pulumi.get(self, "dry_run")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The associating status of the Transit Router.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="transitRouterRouteEntryDescription")
    def transit_router_route_entry_description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_description")

    @property
    @pulumi.getter(name="transitRouterRouteEntryDestinationCidrBlock")
    def transit_router_route_entry_destination_cidr_block(self) -> pulumi.Output[str]:
        """
        The CIDR of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_destination_cidr_block")

    @property
    @pulumi.getter(name="transitRouterRouteEntryId")
    def transit_router_route_entry_id(self) -> pulumi.Output[str]:
        """
        The ID of the route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_id")

    @property
    @pulumi.getter(name="transitRouterRouteEntryName")
    def transit_router_route_entry_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the transit router route entry.
        """
        return pulumi.get(self, "transit_router_route_entry_name")

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopId")
    def transit_router_route_entry_next_hop_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the transit router route entry next hop.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_id")

    @property
    @pulumi.getter(name="transitRouterRouteEntryNextHopType")
    def transit_router_route_entry_next_hop_type(self) -> pulumi.Output[str]:
        """
        The Type of the transit router route entry next hop,Valid values `Attachment` and `BlackHole`.
        """
        return pulumi.get(self, "transit_router_route_entry_next_hop_type")

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

