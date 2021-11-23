# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SlrArgs', 'Slr']

@pulumi.input_type
class SlrArgs:
    def __init__(__self__, *,
                 product_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a Slr resource.
        """
        pulumi.set(__self__, "product_name", product_name)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_name", value)


@pulumi.input_type
class _SlrState:
    def __init__(__self__, *,
                 product_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Slr resources.
        """
        if product_name is not None:
            pulumi.set(__self__, "product_name", product_name)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_name", value)


class Slr(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a Slr resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SlrArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Slr resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SlrArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SlrArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SlrArgs.__new__(SlrArgs)

            if product_name is None and not opts.urn:
                raise TypeError("Missing required property 'product_name'")
            __props__.__dict__["product_name"] = product_name
        super(Slr, __self__).__init__(
            'alicloud:eventbridge/slr:Slr',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            product_name: Optional[pulumi.Input[str]] = None) -> 'Slr':
        """
        Get an existing Slr resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SlrState.__new__(_SlrState)

        __props__.__dict__["product_name"] = product_name
        return Slr(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "product_name")

