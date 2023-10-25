# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetAppsAppResult',
    'GetProductsProductResult',
]

@pulumi.output_type
class GetAppsAppResult(dict):
    def __init__(__self__, *,
                 app_key: str,
                 app_name: str,
                 bundle_id: str,
                 create_time: str,
                 encoded_icon: str,
                 id: str,
                 industry_id: str,
                 package_name: str,
                 product_id: str,
                 type: str):
        """
        :param str app_key: Application AppKey, which uniquely identifies an application when requested by the interface
        :param str app_name: The Name of the App.
        :param str bundle_id: iOS application ID. Required when creating an iOS app. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param str create_time: The CreateTime of the App.
        :param str encoded_icon: Base64 string of picture.
        :param str id: The ID of the App.
        :param str industry_id: The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        :param str package_name: Android App package name.  **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param str product_id: The ID of the Product.
        :param str type: The type of the App. Valid values: `Android` and `iOS`.
        """
        GetAppsAppResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_key=app_key,
            app_name=app_name,
            bundle_id=bundle_id,
            create_time=create_time,
            encoded_icon=encoded_icon,
            id=id,
            industry_id=industry_id,
            package_name=package_name,
            product_id=product_id,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_key: Optional[str] = None,
             app_name: Optional[str] = None,
             bundle_id: Optional[str] = None,
             create_time: Optional[str] = None,
             encoded_icon: Optional[str] = None,
             id: Optional[str] = None,
             industry_id: Optional[str] = None,
             package_name: Optional[str] = None,
             product_id: Optional[str] = None,
             type: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_key is None and 'appKey' in kwargs:
            app_key = kwargs['appKey']
        if app_key is None:
            raise TypeError("Missing 'app_key' argument")
        if app_name is None and 'appName' in kwargs:
            app_name = kwargs['appName']
        if app_name is None:
            raise TypeError("Missing 'app_name' argument")
        if bundle_id is None and 'bundleId' in kwargs:
            bundle_id = kwargs['bundleId']
        if bundle_id is None:
            raise TypeError("Missing 'bundle_id' argument")
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if encoded_icon is None and 'encodedIcon' in kwargs:
            encoded_icon = kwargs['encodedIcon']
        if encoded_icon is None:
            raise TypeError("Missing 'encoded_icon' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if industry_id is None and 'industryId' in kwargs:
            industry_id = kwargs['industryId']
        if industry_id is None:
            raise TypeError("Missing 'industry_id' argument")
        if package_name is None and 'packageName' in kwargs:
            package_name = kwargs['packageName']
        if package_name is None:
            raise TypeError("Missing 'package_name' argument")
        if product_id is None and 'productId' in kwargs:
            product_id = kwargs['productId']
        if product_id is None:
            raise TypeError("Missing 'product_id' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")

        _setter("app_key", app_key)
        _setter("app_name", app_name)
        _setter("bundle_id", bundle_id)
        _setter("create_time", create_time)
        _setter("encoded_icon", encoded_icon)
        _setter("id", id)
        _setter("industry_id", industry_id)
        _setter("package_name", package_name)
        _setter("product_id", product_id)
        _setter("type", type)

    @property
    @pulumi.getter(name="appKey")
    def app_key(self) -> str:
        """
        Application AppKey, which uniquely identifies an application when requested by the interface
        """
        return pulumi.get(self, "app_key")

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> str:
        """
        The Name of the App.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> str:
        """
        iOS application ID. Required when creating an iOS app. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "bundle_id")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The CreateTime of the App.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="encodedIcon")
    def encoded_icon(self) -> str:
        """
        Base64 string of picture.
        """
        return pulumi.get(self, "encoded_icon")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the App.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="industryId")
    def industry_id(self) -> str:
        """
        The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        """
        return pulumi.get(self, "industry_id")

    @property
    @pulumi.getter(name="packageName")
    def package_name(self) -> str:
        """
        Android App package name.  **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "package_name")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> str:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the App. Valid values: `Android` and `iOS`.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetProductsProductResult(dict):
    def __init__(__self__, *,
                 id: str,
                 product_id: str,
                 product_name: str):
        """
        :param str id: The ID of the Product.
        :param str product_id: The ID of the Product.
        :param str product_name: The name of the Product.
        """
        GetProductsProductResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            id=id,
            product_id=product_id,
            product_name=product_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             id: Optional[str] = None,
             product_id: Optional[str] = None,
             product_name: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if id is None:
            raise TypeError("Missing 'id' argument")
        if product_id is None and 'productId' in kwargs:
            product_id = kwargs['productId']
        if product_id is None:
            raise TypeError("Missing 'product_id' argument")
        if product_name is None and 'productName' in kwargs:
            product_name = kwargs['productName']
        if product_name is None:
            raise TypeError("Missing 'product_name' argument")

        _setter("id", id)
        _setter("product_id", product_id)
        _setter("product_name", product_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> str:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> str:
        """
        The name of the Product.
        """
        return pulumi.get(self, "product_name")


