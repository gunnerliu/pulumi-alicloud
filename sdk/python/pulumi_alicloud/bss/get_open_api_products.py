# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetOpenApiProductsResult',
    'AwaitableGetOpenApiProductsResult',
    'get_open_api_products',
    'get_open_api_products_output',
]

@pulumi.output_type
class GetOpenApiProductsResult:
    """
    A collection of values returned by getOpenApiProducts.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, products=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if products and not isinstance(products, list):
            raise TypeError("Expected argument 'products' to be a list")
        pulumi.set(__self__, "products", products)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of name of Products.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def products(self) -> Sequence['outputs.GetOpenApiProductsProductResult']:
        """
        A list of Product Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "products")


class AwaitableGetOpenApiProductsResult(GetOpenApiProductsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOpenApiProductsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            products=self.products)


def get_open_api_products(ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOpenApiProductsResult:
    """
    This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/bss-openapi/latest/api-bssopenapi-2017-12-14-queryproductlist)

    > **NOTE:** Available in 1.195.0+


    :param Sequence[str] ids: A list of product IDs.
    :param str name_regex: A regex string to filter results by Product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:bss/getOpenApiProducts:getOpenApiProducts', __args__, opts=opts, typ=GetOpenApiProductsResult).value

    return AwaitableGetOpenApiProductsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        products=pulumi.get(__ret__, 'products'))


@_utilities.lift_output_func(get_open_api_products)
def get_open_api_products_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOpenApiProductsResult]:
    """
    This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/bss-openapi/latest/api-bssopenapi-2017-12-14-queryproductlist)

    > **NOTE:** Available in 1.195.0+


    :param Sequence[str] ids: A list of product IDs.
    :param str name_regex: A regex string to filter results by Product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
