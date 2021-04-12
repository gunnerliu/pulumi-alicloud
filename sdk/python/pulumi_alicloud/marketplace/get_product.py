# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetProductResult',
    'AwaitableGetProductResult',
    'get_product',
]

@pulumi.output_type
class GetProductResult:
    """
    A collection of values returned by getProduct.
    """
    def __init__(__self__, available_region=None, id=None, product_code=None, products=None):
        if available_region and not isinstance(available_region, str):
            raise TypeError("Expected argument 'available_region' to be a str")
        pulumi.set(__self__, "available_region", available_region)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if product_code and not isinstance(product_code, str):
            raise TypeError("Expected argument 'product_code' to be a str")
        pulumi.set(__self__, "product_code", product_code)
        if products and not isinstance(products, list):
            raise TypeError("Expected argument 'products' to be a list")
        pulumi.set(__self__, "products", products)

    @property
    @pulumi.getter(name="availableRegion")
    def available_region(self) -> Optional[str]:
        return pulumi.get(self, "available_region")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="productCode")
    def product_code(self) -> str:
        return pulumi.get(self, "product_code")

    @property
    @pulumi.getter
    def products(self) -> Sequence['outputs.GetProductProductResult']:
        """
        A product. It contains the following attributes:
        """
        return pulumi.get(self, "products")


class AwaitableGetProductResult(GetProductResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProductResult(
            available_region=self.available_region,
            id=self.id,
            product_code=self.product_code,
            products=self.products)


def get_product(available_region: Optional[str] = None,
                product_code: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProductResult:
    """
    This data source provides the Market product item details of Alibaba Cloud.

    > **NOTE:** Available in 1.69.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.marketplace.get_product(product_code="cmapi022206")
    pulumi.export("productName", default.products[0].name)
    pulumi.export("firstProductSkuCode", default.products[0].skuses[0].sku_code)
    pulumi.export("firstProductPackageVersion", default.products[0].skuses[0].package_versions[0].package_version)
    ```


    :param str available_region: A available region id used to filter market place Ecs images.
    :param str product_code: The product code of the market product.
    """
    __args__ = dict()
    __args__['availableRegion'] = available_region
    __args__['productCode'] = product_code
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:marketplace/getProduct:getProduct', __args__, opts=opts, typ=GetProductResult).value

    return AwaitableGetProductResult(
        available_region=__ret__.available_region,
        id=__ret__.id,
        product_code=__ret__.product_code,
        products=__ret__.products)
