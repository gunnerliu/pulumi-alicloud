# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RouteTableArgs', 'RouteTable']

@pulumi.input_type
class RouteTableArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 route_table_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a RouteTable resource.
        :param pulumi.Input[str] vpc_id: The vpc_id of the route table, the field can't be changed.
        :param pulumi.Input[str] description: The description of the route table instance.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        :param pulumi.Input[str] route_table_name: The name of the route table.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if route_table_name is not None:
            pulumi.set(__self__, "route_table_name", route_table_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The vpc_id of the route table, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the route table instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="routeTableName")
    def route_table_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the route table.
        """
        return pulumi.get(self, "route_table_name")

    @route_table_name.setter
    def route_table_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_table_name", value)

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


@pulumi.input_type
class _RouteTableState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 route_table_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RouteTable resources.
        :param pulumi.Input[str] description: The description of the route table instance.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        :param pulumi.Input[str] route_table_name: The name of the route table.
        :param pulumi.Input[str] status: (Available in v1.119.1+) The status of the route table.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The vpc_id of the route table, the field can't be changed.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""")
        if name is not None:
            pulumi.set(__self__, "name", name)
        if route_table_name is not None:
            pulumi.set(__self__, "route_table_name", route_table_name)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the route table instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="routeTableName")
    def route_table_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the route table.
        """
        return pulumi.get(self, "route_table_name")

    @route_table_name.setter
    def route_table_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "route_table_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in v1.119.1+) The status of the route table.
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
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The vpc_id of the route table, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)


class RouteTable(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 route_table_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        foo_network = alicloud.vpc.Network("fooNetwork",
            cidr_block="172.16.0.0/12",
            vpc_name="vpc-example-name")
        foo_route_table = alicloud.vpc.RouteTable("fooRouteTable",
            vpc_id=foo_network.id,
            route_table_name="route-table-example-name",
            description="route-table-example-description")
        ```

        ## Import

        The route table can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/routeTable:RouteTable foo vtb-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the route table instance.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        :param pulumi.Input[str] route_table_name: The name of the route table.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The vpc_id of the route table, the field can't be changed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RouteTableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        foo_network = alicloud.vpc.Network("fooNetwork",
            cidr_block="172.16.0.0/12",
            vpc_name="vpc-example-name")
        foo_route_table = alicloud.vpc.RouteTable("fooRouteTable",
            vpc_id=foo_network.id,
            route_table_name="route-table-example-name",
            description="route-table-example-description")
        ```

        ## Import

        The route table can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/routeTable:RouteTable foo vtb-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param RouteTableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RouteTableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 route_table_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RouteTableArgs.__new__(RouteTableArgs)

            __props__.__dict__["description"] = description
            if name is not None and not opts.urn:
                warnings.warn("""Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.""")
            __props__.__dict__["name"] = name
            __props__.__dict__["route_table_name"] = route_table_name
            __props__.__dict__["tags"] = tags
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["status"] = None
        super(RouteTable, __self__).__init__(
            'alicloud:vpc/routeTable:RouteTable',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            route_table_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None) -> 'RouteTable':
        """
        Get an existing RouteTable resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the route table instance.
        :param pulumi.Input[str] name: Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        :param pulumi.Input[str] route_table_name: The name of the route table.
        :param pulumi.Input[str] status: (Available in v1.119.1+) The status of the route table.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The vpc_id of the route table, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RouteTableState.__new__(_RouteTableState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["route_table_name"] = route_table_name
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        return RouteTable(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the route table instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Field `name` has been deprecated from provider version 1.119.1. New field `route_table_name` instead.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="routeTableName")
    def route_table_name(self) -> pulumi.Output[str]:
        """
        The name of the route table.
        """
        return pulumi.get(self, "route_table_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in v1.119.1+) The status of the route table.
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
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The vpc_id of the route table, the field can't be changed.
        """
        return pulumi.get(self, "vpc_id")

