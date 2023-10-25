# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AliasArgs', 'Alias']

@pulumi.input_type
class AliasArgs:
    def __init__(__self__, *,
                 account_alias: pulumi.Input[str]):
        """
        The set of arguments for constructing a Alias resource.
        """
        AliasArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_alias=account_alias,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_alias: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_alias is None and 'accountAlias' in kwargs:
            account_alias = kwargs['accountAlias']
        if account_alias is None:
            raise TypeError("Missing 'account_alias' argument")

        _setter("account_alias", account_alias)

    @property
    @pulumi.getter(name="accountAlias")
    def account_alias(self) -> pulumi.Input[str]:
        return pulumi.get(self, "account_alias")

    @account_alias.setter
    def account_alias(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_alias", value)


@pulumi.input_type
class _AliasState:
    def __init__(__self__, *,
                 account_alias: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Alias resources.
        """
        _AliasState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_alias=account_alias,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_alias: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_alias is None and 'accountAlias' in kwargs:
            account_alias = kwargs['accountAlias']

        if account_alias is not None:
            _setter("account_alias", account_alias)

    @property
    @pulumi.getter(name="accountAlias")
    def account_alias(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_alias")

    @account_alias.setter
    def account_alias(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_alias", value)


class Alias(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_alias: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a Alias resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AliasArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a Alias resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AliasArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AliasArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AliasArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_alias: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AliasArgs.__new__(AliasArgs)

            if account_alias is None and not opts.urn:
                raise TypeError("Missing required property 'account_alias'")
            __props__.__dict__["account_alias"] = account_alias
        super(Alias, __self__).__init__(
            'alicloud:ram/alias:Alias',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_alias: Optional[pulumi.Input[str]] = None) -> 'Alias':
        """
        Get an existing Alias resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AliasState.__new__(_AliasState)

        __props__.__dict__["account_alias"] = account_alias
        return Alias(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountAlias")
    def account_alias(self) -> pulumi.Output[str]:
        return pulumi.get(self, "account_alias")

