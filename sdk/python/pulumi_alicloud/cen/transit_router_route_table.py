# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TransitRouterRouteTableArgs', 'TransitRouterRouteTable']

@pulumi.input_type
class TransitRouterRouteTableArgs:
    def __init__(__self__, *,
                 transit_router_id: pulumi.Input[str],
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TransitRouterRouteTable resource.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_name: The name of the transit router route table.
        """
        pulumi.set(__self__, "transit_router_id", transit_router_id)
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_route_table_description is not None:
            pulumi.set(__self__, "transit_router_route_table_description", transit_router_route_table_description)
        if transit_router_route_table_name is not None:
            pulumi.set(__self__, "transit_router_route_table_name", transit_router_route_table_name)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Input[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
        """
        return pulumi.get(self, "dry_run")

    @dry_run.setter
    def dry_run(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "dry_run", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @transit_router_route_table_description.setter
    def transit_router_route_table_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_description", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @transit_router_route_table_name.setter
    def transit_router_route_table_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_name", value)


@pulumi.input_type
class _TransitRouterRouteTableState:
    def __init__(__self__, *,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TransitRouterRouteTable resources.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_id: The id of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_name: The name of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_type: The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        if dry_run is not None:
            pulumi.set(__self__, "dry_run", dry_run)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if transit_router_id is not None:
            pulumi.set(__self__, "transit_router_id", transit_router_id)
        if transit_router_route_table_description is not None:
            pulumi.set(__self__, "transit_router_route_table_description", transit_router_route_table_description)
        if transit_router_route_table_id is not None:
            pulumi.set(__self__, "transit_router_route_table_id", transit_router_route_table_id)
        if transit_router_route_table_name is not None:
            pulumi.set(__self__, "transit_router_route_table_name", transit_router_route_table_name)
        if transit_router_route_table_type is not None:
            pulumi.set(__self__, "transit_router_route_table_type", transit_router_route_table_type)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> Optional[pulumi.Input[bool]]:
        """
        The dry run.
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
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @transit_router_id.setter
    def transit_router_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_id", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @transit_router_route_table_description.setter
    def transit_router_route_table_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_description", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @transit_router_route_table_id.setter
    def transit_router_route_table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_id", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @transit_router_route_table_name.setter
    def transit_router_route_table_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_name", value)

    @property
    @pulumi.getter(name="transitRouterRouteTableType")
    def transit_router_route_table_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        return pulumi.get(self, "transit_router_route_table_type")

    @transit_router_route_table_type.setter
    def transit_router_route_table_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "transit_router_route_table_type", value)


class TransitRouterRouteTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CEN transit router route table resource.[What is Cen Transit Router Route Table](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterroutetable)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name="tf_example",
            cen_id=example_instance.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("exampleTransitRouterRouteTable", transit_router_id=example_transit_router.transit_router_id)
        ```

        ## Import

        CEN transit router route table

        can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable default tr-*********:vtb-********
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_name: The name of the transit router route table.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TransitRouterRouteTableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CEN transit router route table resource.[What is Cen Transit Router Route Table](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitrouterroutetable)

        > **NOTE:** Available since v1.126.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.cen.Instance("exampleInstance",
            cen_instance_name="tf_example",
            description="an example for cen")
        example_transit_router = alicloud.cen.TransitRouter("exampleTransitRouter",
            transit_router_name="tf_example",
            cen_id=example_instance.id)
        example_transit_router_route_table = alicloud.cen.TransitRouterRouteTable("exampleTransitRouterRouteTable", transit_router_id=example_transit_router.transit_router_id)
        ```

        ## Import

        CEN transit router route table

        can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable default tr-*********:vtb-********
        ```

        :param str resource_name: The name of the resource.
        :param TransitRouterRouteTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TransitRouterRouteTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dry_run: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 transit_router_id: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_description: Optional[pulumi.Input[str]] = None,
                 transit_router_route_table_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TransitRouterRouteTableArgs.__new__(TransitRouterRouteTableArgs)

            __props__.__dict__["dry_run"] = dry_run
            __props__.__dict__["tags"] = tags
            if transit_router_id is None and not opts.urn:
                raise TypeError("Missing required property 'transit_router_id'")
            __props__.__dict__["transit_router_id"] = transit_router_id
            __props__.__dict__["transit_router_route_table_description"] = transit_router_route_table_description
            __props__.__dict__["transit_router_route_table_name"] = transit_router_route_table_name
            __props__.__dict__["status"] = None
            __props__.__dict__["transit_router_route_table_id"] = None
            __props__.__dict__["transit_router_route_table_type"] = None
        super(TransitRouterRouteTable, __self__).__init__(
            'alicloud:cen/transitRouterRouteTable:TransitRouterRouteTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dry_run: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            transit_router_id: Optional[pulumi.Input[str]] = None,
            transit_router_route_table_description: Optional[pulumi.Input[str]] = None,
            transit_router_route_table_id: Optional[pulumi.Input[str]] = None,
            transit_router_route_table_name: Optional[pulumi.Input[str]] = None,
            transit_router_route_table_type: Optional[pulumi.Input[str]] = None) -> 'TransitRouterRouteTable':
        """
        Get an existing TransitRouterRouteTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] dry_run: The dry run.
        :param pulumi.Input[str] status: The associating status of the Transit Router.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] transit_router_id: The ID of the transit router.
        :param pulumi.Input[str] transit_router_route_table_description: The description of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_id: The id of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_name: The name of the transit router route table.
        :param pulumi.Input[str] transit_router_route_table_type: The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TransitRouterRouteTableState.__new__(_TransitRouterRouteTableState)

        __props__.__dict__["dry_run"] = dry_run
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["transit_router_id"] = transit_router_id
        __props__.__dict__["transit_router_route_table_description"] = transit_router_route_table_description
        __props__.__dict__["transit_router_route_table_id"] = transit_router_route_table_id
        __props__.__dict__["transit_router_route_table_name"] = transit_router_route_table_name
        __props__.__dict__["transit_router_route_table_type"] = transit_router_route_table_type
        return TransitRouterRouteTable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dryRun")
    def dry_run(self) -> pulumi.Output[Optional[bool]]:
        """
        The dry run.
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
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitRouterId")
    def transit_router_id(self) -> pulumi.Output[str]:
        """
        The ID of the transit router.
        """
        return pulumi.get(self, "transit_router_id")

    @property
    @pulumi.getter(name="transitRouterRouteTableDescription")
    def transit_router_route_table_description(self) -> pulumi.Output[str]:
        """
        The description of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_description")

    @property
    @pulumi.getter(name="transitRouterRouteTableId")
    def transit_router_route_table_id(self) -> pulumi.Output[str]:
        """
        The id of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_id")

    @property
    @pulumi.getter(name="transitRouterRouteTableName")
    def transit_router_route_table_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the transit router route table.
        """
        return pulumi.get(self, "transit_router_route_table_name")

    @property
    @pulumi.getter(name="transitRouterRouteTableType")
    def transit_router_route_table_type(self) -> pulumi.Output[str]:
        """
        The type of the transit router route table. Valid values: `Custom`, `System`.
        """
        return pulumi.get(self, "transit_router_route_table_type")

