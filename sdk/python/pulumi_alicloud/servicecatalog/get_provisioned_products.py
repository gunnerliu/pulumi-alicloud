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
    'GetProvisionedProductsResult',
    'AwaitableGetProvisionedProductsResult',
    'get_provisioned_products',
    'get_provisioned_products_output',
]

@pulumi.output_type
class GetProvisionedProductsResult:
    """
    A collection of values returned by getProvisionedProducts.
    """
    def __init__(__self__, access_level_filter=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None, products=None, provisioned_products=None, sort_by=None, sort_order=None):
        if access_level_filter and not isinstance(access_level_filter, str):
            raise TypeError("Expected argument 'access_level_filter' to be a str")
        pulumi.set(__self__, "access_level_filter", access_level_filter)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
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
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if products and not isinstance(products, list):
            raise TypeError("Expected argument 'products' to be a list")
        pulumi.set(__self__, "products", products)
        if provisioned_products and not isinstance(provisioned_products, list):
            raise TypeError("Expected argument 'provisioned_products' to be a list")
        pulumi.set(__self__, "provisioned_products", provisioned_products)
        if sort_by and not isinstance(sort_by, str):
            raise TypeError("Expected argument 'sort_by' to be a str")
        pulumi.set(__self__, "sort_by", sort_by)
        if sort_order and not isinstance(sort_order, str):
            raise TypeError("Expected argument 'sort_order' to be a str")
        pulumi.set(__self__, "sort_order", sort_order)

    @property
    @pulumi.getter(name="accessLevelFilter")
    def access_level_filter(self) -> Optional[str]:
        return pulumi.get(self, "access_level_filter")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
        A list of Provisioned Product IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of name of Provisioned Products.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter
    def products(self) -> Sequence['outputs.GetProvisionedProductsProductResult']:
        """
        (Deprecated since v1.197.0) A list of Provisioned Product Entries. Each element contains the following attributes:
        """
        warnings.warn("""Field 'products' has been deprecated from provider version 1.197.0.""", DeprecationWarning)
        pulumi.log.warn("""products is deprecated: Field 'products' has been deprecated from provider version 1.197.0.""")

        return pulumi.get(self, "products")

    @property
    @pulumi.getter(name="provisionedProducts")
    def provisioned_products(self) -> Sequence['outputs.GetProvisionedProductsProvisionedProductResult']:
        """
        (Available since v1.197.0) A list of Provisioned Product Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "provisioned_products")

    @property
    @pulumi.getter(name="sortBy")
    def sort_by(self) -> Optional[str]:
        return pulumi.get(self, "sort_by")

    @property
    @pulumi.getter(name="sortOrder")
    def sort_order(self) -> Optional[str]:
        return pulumi.get(self, "sort_order")


class AwaitableGetProvisionedProductsResult(GetProvisionedProductsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProvisionedProductsResult(
            access_level_filter=self.access_level_filter,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            products=self.products,
            provisioned_products=self.provisioned_products,
            sort_by=self.sort_by,
            sort_order=self.sort_order)


def get_provisioned_products(access_level_filter: Optional[str] = None,
                             enable_details: Optional[bool] = None,
                             ids: Optional[Sequence[str]] = None,
                             name_regex: Optional[str] = None,
                             output_file: Optional[str] = None,
                             page_number: Optional[int] = None,
                             page_size: Optional[int] = None,
                             sort_by: Optional[str] = None,
                             sort_order: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProvisionedProductsResult:
    """
    This data source provides Service Catalog Provisioned Product available to the user. [What is Provisioned Product](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-launchproduct)

    > **NOTE:** Available since v1.196.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.servicecatalog.get_provisioned_products(ids=["IdExample"],
        name_regex="NameRegexExample")
    pulumi.export("alicloudServiceCatalogProvisionedProductExampleId", default.provisioned_products[0].id)
    ```


    :param str access_level_filter: The access filter.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Provisioned Product IDs.
    :param str name_regex: A regex string to filter results by Product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str sort_by: The field that is used to sort the queried data.
    :param str sort_order: The sorting method.
    """
    __args__ = dict()
    __args__['accessLevelFilter'] = access_level_filter
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['sortBy'] = sort_by
    __args__['sortOrder'] = sort_order
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:servicecatalog/getProvisionedProducts:getProvisionedProducts', __args__, opts=opts, typ=GetProvisionedProductsResult).value

    return AwaitableGetProvisionedProductsResult(
        access_level_filter=pulumi.get(__ret__, 'access_level_filter'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        products=pulumi.get(__ret__, 'products'),
        provisioned_products=pulumi.get(__ret__, 'provisioned_products'),
        sort_by=pulumi.get(__ret__, 'sort_by'),
        sort_order=pulumi.get(__ret__, 'sort_order'))


@_utilities.lift_output_func(get_provisioned_products)
def get_provisioned_products_output(access_level_filter: Optional[pulumi.Input[Optional[str]]] = None,
                                    enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                    ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                    name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                    page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                    page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                    sort_by: Optional[pulumi.Input[Optional[str]]] = None,
                                    sort_order: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProvisionedProductsResult]:
    """
    This data source provides Service Catalog Provisioned Product available to the user. [What is Provisioned Product](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-launchproduct)

    > **NOTE:** Available since v1.196.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.servicecatalog.get_provisioned_products(ids=["IdExample"],
        name_regex="NameRegexExample")
    pulumi.export("alicloudServiceCatalogProvisionedProductExampleId", default.provisioned_products[0].id)
    ```


    :param str access_level_filter: The access filter.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Provisioned Product IDs.
    :param str name_regex: A regex string to filter results by Product name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str sort_by: The field that is used to sort the queried data.
    :param str sort_order: The sorting method.
    """
    ...
