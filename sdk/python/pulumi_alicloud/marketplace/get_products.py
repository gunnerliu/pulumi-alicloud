# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetProductsResult',
    'AwaitableGetProductsResult',
    'get_products',
    'get_products_output',
]

@pulumi.output_type
class GetProductsResult:
    """
    A collection of values returned by getProducts.
    """
    def __init__(__self__, category_id=None, id=None, ids=None, name_regex=None, output_file=None, product_type=None, products=None, search_term=None, sort=None, suggested_price=None, supplier_id=None, supplier_name_keyword=None):
        if category_id and not isinstance(category_id, str):
            raise TypeError("Expected argument 'category_id' to be a str")
        pulumi.set(__self__, "category_id", category_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if product_type and not isinstance(product_type, str):
            raise TypeError("Expected argument 'product_type' to be a str")
        pulumi.set(__self__, "product_type", product_type)
        if products and not isinstance(products, list):
            raise TypeError("Expected argument 'products' to be a list")
        pulumi.set(__self__, "products", products)
        if search_term and not isinstance(search_term, str):
            raise TypeError("Expected argument 'search_term' to be a str")
        pulumi.set(__self__, "search_term", search_term)
        if sort and not isinstance(sort, str):
            raise TypeError("Expected argument 'sort' to be a str")
        pulumi.set(__self__, "sort", sort)
        if suggested_price and not isinstance(suggested_price, float):
            raise TypeError("Expected argument 'suggested_price' to be a float")
        pulumi.set(__self__, "suggested_price", suggested_price)
        if supplier_id and not isinstance(supplier_id, str):
            raise TypeError("Expected argument 'supplier_id' to be a str")
        pulumi.set(__self__, "supplier_id", supplier_id)
        if supplier_name_keyword and not isinstance(supplier_name_keyword, str):
            raise TypeError("Expected argument 'supplier_name_keyword' to be a str")
        pulumi.set(__self__, "supplier_name_keyword", supplier_name_keyword)

    @property
    @pulumi.getter(name="categoryId")
    def category_id(self) -> Optional[str]:
        """
        The category id of the product.
        """
        return pulumi.get(self, "category_id")

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
        """
        A list of product codes.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="productType")
    def product_type(self) -> Optional[str]:
        return pulumi.get(self, "product_type")

    @property
    @pulumi.getter
    def products(self) -> Sequence['outputs.GetProductsProductResult']:
        """
        A list of products. Each element contains the following attributes:
        """
        return pulumi.get(self, "products")

    @property
    @pulumi.getter(name="searchTerm")
    def search_term(self) -> Optional[str]:
        return pulumi.get(self, "search_term")

    @property
    @pulumi.getter
    def sort(self) -> Optional[str]:
        return pulumi.get(self, "sort")

    @property
    @pulumi.getter(name="suggestedPrice")
    def suggested_price(self) -> Optional[float]:
        """
        The suggested price of the product.
        """
        return pulumi.get(self, "suggested_price")

    @property
    @pulumi.getter(name="supplierId")
    def supplier_id(self) -> Optional[str]:
        """
        The supplier id of the product.
        """
        return pulumi.get(self, "supplier_id")

    @property
    @pulumi.getter(name="supplierNameKeyword")
    def supplier_name_keyword(self) -> Optional[str]:
        return pulumi.get(self, "supplier_name_keyword")


class AwaitableGetProductsResult(GetProductsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProductsResult(
            category_id=self.category_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            output_file=self.output_file,
            product_type=self.product_type,
            products=self.products,
            search_term=self.search_term,
            sort=self.sort,
            suggested_price=self.suggested_price,
            supplier_id=self.supplier_id,
            supplier_name_keyword=self.supplier_name_keyword)


def get_products(category_id: Optional[str] = None,
                 ids: Optional[Sequence[str]] = None,
                 name_regex: Optional[str] = None,
                 output_file: Optional[str] = None,
                 product_type: Optional[str] = None,
                 search_term: Optional[str] = None,
                 sort: Optional[str] = None,
                 suggested_price: Optional[float] = None,
                 supplier_id: Optional[str] = None,
                 supplier_name_keyword: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProductsResult:
    """
    This data source provides the Market product items of Alibaba Cloud.

    > **NOTE:** Available in 1.64.0+


    :param str category_id: The Category ID of products.
    :param Sequence[str] ids: A list of product code.
    :param str name_regex: A regex string to apply to the product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_type: The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
    :param str search_term: Search term in this query.
    :param str sort: This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
    :param float suggested_price: The suggested price of the product.
    :param str supplier_id: The supplier id of the product.
    :param str supplier_name_keyword: The supplier name keyword of the product.
    """
    __args__ = dict()
    __args__['categoryId'] = category_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['productType'] = product_type
    __args__['searchTerm'] = search_term
    __args__['sort'] = sort
    __args__['suggestedPrice'] = suggested_price
    __args__['supplierId'] = supplier_id
    __args__['supplierNameKeyword'] = supplier_name_keyword
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:marketplace/getProducts:getProducts', __args__, opts=opts, typ=GetProductsResult).value

    return AwaitableGetProductsResult(
        category_id=pulumi.get(__ret__, 'category_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        output_file=pulumi.get(__ret__, 'output_file'),
        product_type=pulumi.get(__ret__, 'product_type'),
        products=pulumi.get(__ret__, 'products'),
        search_term=pulumi.get(__ret__, 'search_term'),
        sort=pulumi.get(__ret__, 'sort'),
        suggested_price=pulumi.get(__ret__, 'suggested_price'),
        supplier_id=pulumi.get(__ret__, 'supplier_id'),
        supplier_name_keyword=pulumi.get(__ret__, 'supplier_name_keyword'))


@_utilities.lift_output_func(get_products)
def get_products_output(category_id: Optional[pulumi.Input[Optional[str]]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                        product_type: Optional[pulumi.Input[Optional[str]]] = None,
                        search_term: Optional[pulumi.Input[Optional[str]]] = None,
                        sort: Optional[pulumi.Input[Optional[str]]] = None,
                        suggested_price: Optional[pulumi.Input[Optional[float]]] = None,
                        supplier_id: Optional[pulumi.Input[Optional[str]]] = None,
                        supplier_name_keyword: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProductsResult]:
    """
    This data source provides the Market product items of Alibaba Cloud.

    > **NOTE:** Available in 1.64.0+


    :param str category_id: The Category ID of products.
    :param Sequence[str] ids: A list of product code.
    :param str name_regex: A regex string to apply to the product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_type: The type of products, Valid values: `APP`, `SERVICE`, `MIRROR`, `DOWNLOAD` and `API_SERVICE`.
    :param str search_term: Search term in this query.
    :param str sort: This field determines how to sort the filtered results, Valid values: `user_count-desc`, `created_on-desc`, `price-desc` and `score-desc`.
    :param float suggested_price: The suggested price of the product.
    :param str supplier_id: The supplier id of the product.
    :param str supplier_name_keyword: The supplier name keyword of the product.
    """
    ...
