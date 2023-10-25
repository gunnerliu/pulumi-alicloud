# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MetaTagArgs', 'MetaTag']

@pulumi.input_type
class MetaTagArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 values: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        The set of arguments for constructing a MetaTag resource.
        :param pulumi.Input[str] key: The key of the tag meta tag. key must be 1 to 128 characters in length.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: The values of the tag meta tag.
        """
        MetaTagArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[pulumi.Input[str]] = None,
             values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if key is None:
            raise TypeError("Missing 'key' argument")
        if values is None:
            raise TypeError("Missing 'values' argument")

        _setter("key", key)
        _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        The key of the tag meta tag. key must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The values of the tag meta tag.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class _MetaTagState:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering MetaTag resources.
        :param pulumi.Input[str] key: The key of the tag meta tag. key must be 1 to 128 characters in length.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: The values of the tag meta tag.
        """
        _MetaTagState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[pulumi.Input[str]] = None,
             values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if key is not None:
            _setter("key", key)
        if values is not None:
            _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The key of the tag meta tag. key must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The values of the tag meta tag.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "values", value)


class MetaTag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Tag Meta Tag resource.

        For information about Tag Meta Tag and how to use it,
        see [What is Meta Tag](https://www.alibabacloud.com/help/en/resource-management/latest/createtags).

        > **NOTE:** Available since v1.209.0.

        > **NOTE:** Meta Tag Only Support `cn-hangzhou` Region

        ## Import

        Tag Meta Tag can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:tag/metaTag:MetaTag example <regionId>:<key>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The key of the tag meta tag. key must be 1 to 128 characters in length.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: The values of the tag meta tag.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MetaTagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Tag Meta Tag resource.

        For information about Tag Meta Tag and how to use it,
        see [What is Meta Tag](https://www.alibabacloud.com/help/en/resource-management/latest/createtags).

        > **NOTE:** Available since v1.209.0.

        > **NOTE:** Meta Tag Only Support `cn-hangzhou` Region

        ## Import

        Tag Meta Tag can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:tag/metaTag:MetaTag example <regionId>:<key>
        ```

        :param str resource_name: The name of the resource.
        :param MetaTagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MetaTagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            MetaTagArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[str]] = None,
                 values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MetaTagArgs.__new__(MetaTagArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            if values is None and not opts.urn:
                raise TypeError("Missing required property 'values'")
            __props__.__dict__["values"] = values
        super(MetaTag, __self__).__init__(
            'alicloud:tag/metaTag:MetaTag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[str]] = None,
            values: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'MetaTag':
        """
        Get an existing MetaTag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key: The key of the tag meta tag. key must be 1 to 128 characters in length.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] values: The values of the tag meta tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MetaTagState.__new__(_MetaTagState)

        __props__.__dict__["key"] = key
        __props__.__dict__["values"] = values
        return MetaTag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Output[str]:
        """
        The key of the tag meta tag. key must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def values(self) -> pulumi.Output[Sequence[str]]:
        """
        The values of the tag meta tag.
        """
        return pulumi.get(self, "values")

