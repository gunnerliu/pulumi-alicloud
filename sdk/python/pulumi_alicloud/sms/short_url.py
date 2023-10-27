# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ShortUrlArgs', 'ShortUrl']

@pulumi.input_type
class ShortUrlArgs:
    def __init__(__self__, *,
                 effective_days: pulumi.Input[int],
                 short_url_name: pulumi.Input[str],
                 source_url: pulumi.Input[str]):
        """
        The set of arguments for constructing a ShortUrl resource.
        :param pulumi.Input[int] effective_days: Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        :param pulumi.Input[str] short_url_name: The name of the resource.
        :param pulumi.Input[str] source_url: The original link address.
        """
        pulumi.set(__self__, "effective_days", effective_days)
        pulumi.set(__self__, "short_url_name", short_url_name)
        pulumi.set(__self__, "source_url", source_url)

    @property
    @pulumi.getter(name="effectiveDays")
    def effective_days(self) -> pulumi.Input[int]:
        """
        Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        """
        return pulumi.get(self, "effective_days")

    @effective_days.setter
    def effective_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "effective_days", value)

    @property
    @pulumi.getter(name="shortUrlName")
    def short_url_name(self) -> pulumi.Input[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "short_url_name")

    @short_url_name.setter
    def short_url_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "short_url_name", value)

    @property
    @pulumi.getter(name="sourceUrl")
    def source_url(self) -> pulumi.Input[str]:
        """
        The original link address.
        """
        return pulumi.get(self, "source_url")

    @source_url.setter
    def source_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_url", value)


@pulumi.input_type
class _ShortUrlState:
    def __init__(__self__, *,
                 effective_days: Optional[pulumi.Input[int]] = None,
                 short_url_name: Optional[pulumi.Input[str]] = None,
                 source_url: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ShortUrl resources.
        :param pulumi.Input[int] effective_days: Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        :param pulumi.Input[str] short_url_name: The name of the resource.
        :param pulumi.Input[str] source_url: The original link address.
        :param pulumi.Input[str] status: Short chain status.
        """
        if effective_days is not None:
            pulumi.set(__self__, "effective_days", effective_days)
        if short_url_name is not None:
            pulumi.set(__self__, "short_url_name", short_url_name)
        if source_url is not None:
            pulumi.set(__self__, "source_url", source_url)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="effectiveDays")
    def effective_days(self) -> Optional[pulumi.Input[int]]:
        """
        Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        """
        return pulumi.get(self, "effective_days")

    @effective_days.setter
    def effective_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "effective_days", value)

    @property
    @pulumi.getter(name="shortUrlName")
    def short_url_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "short_url_name")

    @short_url_name.setter
    def short_url_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "short_url_name", value)

    @property
    @pulumi.getter(name="sourceUrl")
    def source_url(self) -> Optional[pulumi.Input[str]]:
        """
        The original link address.
        """
        return pulumi.get(self, "source_url")

    @source_url.setter
    def source_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_url", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Short chain status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ShortUrl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 effective_days: Optional[pulumi.Input[int]] = None,
                 short_url_name: Optional[pulumi.Input[str]] = None,
                 source_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a SMS Short Url resource.

        For information about SMS Short Url and how to use it, see [What is Short Url](https://next.api.alibabacloud.com/api/Dysmsapi/2017-05-25/AddShortUrl).

        > **NOTE:** Available in v1.178.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.sms.ShortUrl("example",
            effective_days=30,
            short_url_name="example_value",
            source_url="example_value")
        ```

        ## Import

        SMS Short Url can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:sms/shortUrl:ShortUrl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] effective_days: Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        :param pulumi.Input[str] short_url_name: The name of the resource.
        :param pulumi.Input[str] source_url: The original link address.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ShortUrlArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SMS Short Url resource.

        For information about SMS Short Url and how to use it, see [What is Short Url](https://next.api.alibabacloud.com/api/Dysmsapi/2017-05-25/AddShortUrl).

        > **NOTE:** Available in v1.178.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.sms.ShortUrl("example",
            effective_days=30,
            short_url_name="example_value",
            source_url="example_value")
        ```

        ## Import

        SMS Short Url can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:sms/shortUrl:ShortUrl example <id>
        ```

        :param str resource_name: The name of the resource.
        :param ShortUrlArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ShortUrlArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 effective_days: Optional[pulumi.Input[int]] = None,
                 short_url_name: Optional[pulumi.Input[str]] = None,
                 source_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ShortUrlArgs.__new__(ShortUrlArgs)

            if effective_days is None and not opts.urn:
                raise TypeError("Missing required property 'effective_days'")
            __props__.__dict__["effective_days"] = effective_days
            if short_url_name is None and not opts.urn:
                raise TypeError("Missing required property 'short_url_name'")
            __props__.__dict__["short_url_name"] = short_url_name
            if source_url is None and not opts.urn:
                raise TypeError("Missing required property 'source_url'")
            __props__.__dict__["source_url"] = source_url
            __props__.__dict__["status"] = None
        super(ShortUrl, __self__).__init__(
            'alicloud:sms/shortUrl:ShortUrl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            effective_days: Optional[pulumi.Input[int]] = None,
            short_url_name: Optional[pulumi.Input[str]] = None,
            source_url: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ShortUrl':
        """
        Get an existing ShortUrl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] effective_days: Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        :param pulumi.Input[str] short_url_name: The name of the resource.
        :param pulumi.Input[str] source_url: The original link address.
        :param pulumi.Input[str] status: Short chain status.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ShortUrlState.__new__(_ShortUrlState)

        __props__.__dict__["effective_days"] = effective_days
        __props__.__dict__["short_url_name"] = short_url_name
        __props__.__dict__["source_url"] = source_url
        __props__.__dict__["status"] = status
        return ShortUrl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="effectiveDays")
    def effective_days(self) -> pulumi.Output[int]:
        """
        Short chain service use validity period. Valid values: `30`, `60`, `90`. The unit is days, and the maximum validity period is 90 days.
        """
        return pulumi.get(self, "effective_days")

    @property
    @pulumi.getter(name="shortUrlName")
    def short_url_name(self) -> pulumi.Output[str]:
        """
        The name of the resource.
        """
        return pulumi.get(self, "short_url_name")

    @property
    @pulumi.getter(name="sourceUrl")
    def source_url(self) -> pulumi.Output[str]:
        """
        The original link address.
        """
        return pulumi.get(self, "source_url")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Short chain status.
        """
        return pulumi.get(self, "status")

