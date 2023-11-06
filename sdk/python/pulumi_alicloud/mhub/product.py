# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProductArgs', 'Product']

@pulumi.input_type
class ProductArgs:
    def __init__(__self__, *,
                 product_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a Product resource.
        :param pulumi.Input[str] product_name: ProductName.
        """
        ProductArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            product_name=product_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             product_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if product_name is None and 'productName' in kwargs:
            product_name = kwargs['productName']
        if product_name is None:
            raise TypeError("Missing 'product_name' argument")

        _setter("product_name", product_name)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Input[str]:
        """
        ProductName.
        """
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_name", value)


@pulumi.input_type
class _ProductState:
    def __init__(__self__, *,
                 product_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Product resources.
        :param pulumi.Input[str] product_name: ProductName.
        """
        _ProductState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            product_name=product_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             product_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if product_name is None and 'productName' in kwargs:
            product_name = kwargs['productName']

        if product_name is not None:
            _setter("product_name", product_name)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> Optional[pulumi.Input[str]]:
        """
        ProductName.
        """
        return pulumi.get(self, "product_name")

    @product_name.setter
    def product_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_name", value)


class Product(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a MHUB Product resource.

        For information about MHUB Product and how to use it, see [What is Product](https://help.aliyun.com/product/65109.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** At present, the resource only supports cn-shanghai region.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.mhub.Product("example", product_name="example_value")
        ```

        ## Import

        MHUB Product can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:mhub/product:Product example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] product_name: ProductName.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProductArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a MHUB Product resource.

        For information about MHUB Product and how to use it, see [What is Product](https://help.aliyun.com/product/65109.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** At present, the resource only supports cn-shanghai region.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.mhub.Product("example", product_name="example_value")
        ```

        ## Import

        MHUB Product can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:mhub/product:Product example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ProductArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProductArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ProductArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 product_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProductArgs.__new__(ProductArgs)

            if product_name is None and not opts.urn:
                raise TypeError("Missing required property 'product_name'")
            __props__.__dict__["product_name"] = product_name
        super(Product, __self__).__init__(
            'alicloud:mhub/product:Product',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            product_name: Optional[pulumi.Input[str]] = None) -> 'Product':
        """
        Get an existing Product resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] product_name: ProductName.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProductState.__new__(_ProductState)

        __props__.__dict__["product_name"] = product_name
        return Product(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> pulumi.Output[str]:
        """
        ProductName.
        """
        return pulumi.get(self, "product_name")

