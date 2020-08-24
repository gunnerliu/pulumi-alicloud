# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['RouteTableAttachment']


class RouteTableAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 route_table_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a RouteTableAttachment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] route_table_id: The route_table_id of the route table attachment, the field can't be changed.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the route table attachment, the field can't be changed.
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

            if route_table_id is None:
                raise TypeError("Missing required property 'route_table_id'")
            __props__['route_table_id'] = route_table_id
            if vswitch_id is None:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
        super(RouteTableAttachment, __self__).__init__(
            'alicloud:vpc/routeTableAttachment:RouteTableAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            route_table_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'RouteTableAttachment':
        """
        Get an existing RouteTableAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] route_table_id: The route_table_id of the route table attachment, the field can't be changed.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the route table attachment, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["route_table_id"] = route_table_id
        __props__["vswitch_id"] = vswitch_id
        return RouteTableAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="routeTableId")
    def route_table_id(self) -> str:
        """
        The route_table_id of the route table attachment, the field can't be changed.
        """
        return pulumi.get(self, "route_table_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        The vswitch_id of the route table attachment, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

