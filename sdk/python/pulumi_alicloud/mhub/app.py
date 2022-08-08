# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AppArgs', 'App']

@pulumi.input_type
class AppArgs:
    def __init__(__self__, *,
                 app_name: pulumi.Input[str],
                 product_id: pulumi.Input[str],
                 type: pulumi.Input[str],
                 bundle_id: Optional[pulumi.Input[str]] = None,
                 encoded_icon: Optional[pulumi.Input[str]] = None,
                 industry_id: Optional[pulumi.Input[str]] = None,
                 package_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a App resource.
        :param pulumi.Input[str] app_name: AppName.
        :param pulumi.Input[str] product_id: The ID of the Product.
        :param pulumi.Input[str] type: The type of the Product. Valid values: `Android` and `iOS`.
        :param pulumi.Input[str] bundle_id: The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] encoded_icon: Base64 string of picture.
        :param pulumi.Input[str] industry_id: The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        :param pulumi.Input[str] package_name: Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        pulumi.set(__self__, "app_name", app_name)
        pulumi.set(__self__, "product_id", product_id)
        pulumi.set(__self__, "type", type)
        if bundle_id is not None:
            pulumi.set(__self__, "bundle_id", bundle_id)
        if encoded_icon is not None:
            pulumi.set(__self__, "encoded_icon", encoded_icon)
        if industry_id is not None:
            pulumi.set(__self__, "industry_id", industry_id)
        if package_name is not None:
            pulumi.set(__self__, "package_name", package_name)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> pulumi.Input[str]:
        """
        AppName.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Input[str]:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the Product. Valid values: `Android` and `iOS`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> Optional[pulumi.Input[str]]:
        """
        The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "bundle_id")

    @bundle_id.setter
    def bundle_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bundle_id", value)

    @property
    @pulumi.getter(name="encodedIcon")
    def encoded_icon(self) -> Optional[pulumi.Input[str]]:
        """
        Base64 string of picture.
        """
        return pulumi.get(self, "encoded_icon")

    @encoded_icon.setter
    def encoded_icon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoded_icon", value)

    @property
    @pulumi.getter(name="industryId")
    def industry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        """
        return pulumi.get(self, "industry_id")

    @industry_id.setter
    def industry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "industry_id", value)

    @property
    @pulumi.getter(name="packageName")
    def package_name(self) -> Optional[pulumi.Input[str]]:
        """
        Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "package_name")

    @package_name.setter
    def package_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package_name", value)


@pulumi.input_type
class _AppState:
    def __init__(__self__, *,
                 app_name: Optional[pulumi.Input[str]] = None,
                 bundle_id: Optional[pulumi.Input[str]] = None,
                 encoded_icon: Optional[pulumi.Input[str]] = None,
                 industry_id: Optional[pulumi.Input[str]] = None,
                 package_name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering App resources.
        :param pulumi.Input[str] app_name: AppName.
        :param pulumi.Input[str] bundle_id: The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] encoded_icon: Base64 string of picture.
        :param pulumi.Input[str] industry_id: The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        :param pulumi.Input[str] package_name: Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] product_id: The ID of the Product.
        :param pulumi.Input[str] type: The type of the Product. Valid values: `Android` and `iOS`.
        """
        if app_name is not None:
            pulumi.set(__self__, "app_name", app_name)
        if bundle_id is not None:
            pulumi.set(__self__, "bundle_id", bundle_id)
        if encoded_icon is not None:
            pulumi.set(__self__, "encoded_icon", encoded_icon)
        if industry_id is not None:
            pulumi.set(__self__, "industry_id", industry_id)
        if package_name is not None:
            pulumi.set(__self__, "package_name", package_name)
        if product_id is not None:
            pulumi.set(__self__, "product_id", product_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> Optional[pulumi.Input[str]]:
        """
        AppName.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> Optional[pulumi.Input[str]]:
        """
        The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "bundle_id")

    @bundle_id.setter
    def bundle_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bundle_id", value)

    @property
    @pulumi.getter(name="encodedIcon")
    def encoded_icon(self) -> Optional[pulumi.Input[str]]:
        """
        Base64 string of picture.
        """
        return pulumi.get(self, "encoded_icon")

    @encoded_icon.setter
    def encoded_icon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encoded_icon", value)

    @property
    @pulumi.getter(name="industryId")
    def industry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        """
        return pulumi.get(self, "industry_id")

    @industry_id.setter
    def industry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "industry_id", value)

    @property
    @pulumi.getter(name="packageName")
    def package_name(self) -> Optional[pulumi.Input[str]]:
        """
        Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "package_name")

    @package_name.setter
    def package_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "package_name", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Product. Valid values: `Android` and `iOS`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class App(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 bundle_id: Optional[pulumi.Input[str]] = None,
                 encoded_icon: Optional[pulumi.Input[str]] = None,
                 industry_id: Optional[pulumi.Input[str]] = None,
                 package_name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a MHUB App resource.

        For information about MHUB App and how to use it, see [What is App](https://help.aliyun.com/product/65109.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** At present, the resource only supports cn-shanghai region.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_value"
        default = alicloud.mhub.App("default",
            app_name=name,
            product_id=alicloud_mhub_product["default"]["id"],
            package_name="com.test.android",
            type="Android")
        ```

        ## Import

        MHUB App can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:mhub/app:App example <product_id>:<app_key>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_name: AppName.
        :param pulumi.Input[str] bundle_id: The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] encoded_icon: Base64 string of picture.
        :param pulumi.Input[str] industry_id: The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        :param pulumi.Input[str] package_name: Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] product_id: The ID of the Product.
        :param pulumi.Input[str] type: The type of the Product. Valid values: `Android` and `iOS`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a MHUB App resource.

        For information about MHUB App and how to use it, see [What is App](https://help.aliyun.com/product/65109.html).

        > **NOTE:** Available in v1.138.0+.

        > **NOTE:** At present, the resource only supports cn-shanghai region.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_value"
        default = alicloud.mhub.App("default",
            app_name=name,
            product_id=alicloud_mhub_product["default"]["id"],
            package_name="com.test.android",
            type="Android")
        ```

        ## Import

        MHUB App can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:mhub/app:App example <product_id>:<app_key>
        ```

        :param str resource_name: The name of the resource.
        :param AppArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 bundle_id: Optional[pulumi.Input[str]] = None,
                 encoded_icon: Optional[pulumi.Input[str]] = None,
                 industry_id: Optional[pulumi.Input[str]] = None,
                 package_name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppArgs.__new__(AppArgs)

            if app_name is None and not opts.urn:
                raise TypeError("Missing required property 'app_name'")
            __props__.__dict__["app_name"] = app_name
            __props__.__dict__["bundle_id"] = bundle_id
            __props__.__dict__["encoded_icon"] = encoded_icon
            __props__.__dict__["industry_id"] = industry_id
            __props__.__dict__["package_name"] = package_name
            if product_id is None and not opts.urn:
                raise TypeError("Missing required property 'product_id'")
            __props__.__dict__["product_id"] = product_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(App, __self__).__init__(
            'alicloud:mhub/app:App',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_name: Optional[pulumi.Input[str]] = None,
            bundle_id: Optional[pulumi.Input[str]] = None,
            encoded_icon: Optional[pulumi.Input[str]] = None,
            industry_id: Optional[pulumi.Input[str]] = None,
            package_name: Optional[pulumi.Input[str]] = None,
            product_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'App':
        """
        Get an existing App resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_name: AppName.
        :param pulumi.Input[str] bundle_id: The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] encoded_icon: Base64 string of picture.
        :param pulumi.Input[str] industry_id: The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        :param pulumi.Input[str] package_name: Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        :param pulumi.Input[str] product_id: The ID of the Product.
        :param pulumi.Input[str] type: The type of the Product. Valid values: `Android` and `iOS`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppState.__new__(_AppState)

        __props__.__dict__["app_name"] = app_name
        __props__.__dict__["bundle_id"] = bundle_id
        __props__.__dict__["encoded_icon"] = encoded_icon
        __props__.__dict__["industry_id"] = industry_id
        __props__.__dict__["package_name"] = package_name
        __props__.__dict__["product_id"] = product_id
        __props__.__dict__["type"] = type
        return App(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> pulumi.Output[str]:
        """
        AppName.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="bundleId")
    def bundle_id(self) -> pulumi.Output[Optional[str]]:
        """
        The app id of iOS. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "bundle_id")

    @property
    @pulumi.getter(name="encodedIcon")
    def encoded_icon(self) -> pulumi.Output[Optional[str]]:
        """
        Base64 string of picture.
        """
        return pulumi.get(self, "encoded_icon")

    @property
    @pulumi.getter(name="industryId")
    def industry_id(self) -> pulumi.Output[str]:
        """
        The Industry ID of the app. For information about Industry and how to use it, MHUB[Industry](https://help.aliyun.com/document_detail/201638.html).
        """
        return pulumi.get(self, "industry_id")

    @property
    @pulumi.getter(name="packageName")
    def package_name(self) -> pulumi.Output[Optional[str]]:
        """
        Android App package name. **NOTE:** Either `bundle_id` or `package_name` must be set.
        """
        return pulumi.get(self, "package_name")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Output[str]:
        """
        The ID of the Product.
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the Product. Valid values: `Android` and `iOS`.
        """
        return pulumi.get(self, "type")

