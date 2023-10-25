# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DomainGroupArgs', 'DomainGroup']

@pulumi.input_type
class DomainGroupArgs:
    def __init__(__self__, *,
                 domain_group_name: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DomainGroup resource.
        :param pulumi.Input[str] domain_group_name: The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        :param pulumi.Input[str] group_name: The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        :param pulumi.Input[str] lang: User language.
        """
        DomainGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_group_name=domain_group_name,
            group_name=group_name,
            lang=lang,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_group_name: Optional[pulumi.Input[str]] = None,
             group_name: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if domain_group_name is None and 'domainGroupName' in kwargs:
            domain_group_name = kwargs['domainGroupName']
        if group_name is None and 'groupName' in kwargs:
            group_name = kwargs['groupName']

        if domain_group_name is not None:
            _setter("domain_group_name", domain_group_name)
        if group_name is not None:
            warnings.warn("""Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""group_name is deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""")
        if group_name is not None:
            _setter("group_name", group_name)
        if lang is not None:
            _setter("lang", lang)

    @property
    @pulumi.getter(name="domainGroupName")
    def domain_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        """
        return pulumi.get(self, "domain_group_name")

    @domain_group_name.setter
    def domain_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_group_name", value)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        """
        warnings.warn("""Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""group_name is deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""")

        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)


@pulumi.input_type
class _DomainGroupState:
    def __init__(__self__, *,
                 domain_group_name: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainGroup resources.
        :param pulumi.Input[str] domain_group_name: The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        :param pulumi.Input[str] group_name: The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        :param pulumi.Input[str] lang: User language.
        """
        _DomainGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_group_name=domain_group_name,
            group_name=group_name,
            lang=lang,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_group_name: Optional[pulumi.Input[str]] = None,
             group_name: Optional[pulumi.Input[str]] = None,
             lang: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if domain_group_name is None and 'domainGroupName' in kwargs:
            domain_group_name = kwargs['domainGroupName']
        if group_name is None and 'groupName' in kwargs:
            group_name = kwargs['groupName']

        if domain_group_name is not None:
            _setter("domain_group_name", domain_group_name)
        if group_name is not None:
            warnings.warn("""Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""group_name is deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""")
        if group_name is not None:
            _setter("group_name", group_name)
        if lang is not None:
            _setter("lang", lang)

    @property
    @pulumi.getter(name="domainGroupName")
    def domain_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        """
        return pulumi.get(self, "domain_group_name")

    @domain_group_name.setter
    def domain_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_group_name", value)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        """
        warnings.warn("""Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""group_name is deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""")

        return pulumi.get(self, "group_name")

    @group_name.setter
    def group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "group_name", value)

    @property
    @pulumi.getter
    def lang(self) -> Optional[pulumi.Input[str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

    @lang.setter
    def lang(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lang", value)


class DomainGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_group_name: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Alidns Domain Group resource. For information about Alidns Domain Group and how to use it, see [What is Resource Alidns Domain Group](https://www.alibabacloud.com/help/en/doc-detail/29762.htm).

        > **NOTE:** Available since v1.84.0.

        ## Import

        Alidns domain group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/domainGroup:DomainGroup example 0932eb3ddee7499085c4d13d45*****
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_group_name: The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        :param pulumi.Input[str] group_name: The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        :param pulumi.Input[str] lang: User language.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DomainGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Alidns Domain Group resource. For information about Alidns Domain Group and how to use it, see [What is Resource Alidns Domain Group](https://www.alibabacloud.com/help/en/doc-detail/29762.htm).

        > **NOTE:** Available since v1.84.0.

        ## Import

        Alidns domain group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dns/domainGroup:DomainGroup example 0932eb3ddee7499085c4d13d45*****
        ```

        :param str resource_name: The name of the resource.
        :param DomainGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DomainGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_group_name: Optional[pulumi.Input[str]] = None,
                 group_name: Optional[pulumi.Input[str]] = None,
                 lang: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainGroupArgs.__new__(DomainGroupArgs)

            __props__.__dict__["domain_group_name"] = domain_group_name
            __props__.__dict__["group_name"] = group_name
            __props__.__dict__["lang"] = lang
        super(DomainGroup, __self__).__init__(
            'alicloud:dns/domainGroup:DomainGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_group_name: Optional[pulumi.Input[str]] = None,
            group_name: Optional[pulumi.Input[str]] = None,
            lang: Optional[pulumi.Input[str]] = None) -> 'DomainGroup':
        """
        Get an existing DomainGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_group_name: The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        :param pulumi.Input[str] group_name: The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        :param pulumi.Input[str] lang: User language.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainGroupState.__new__(_DomainGroupState)

        __props__.__dict__["domain_group_name"] = domain_group_name
        __props__.__dict__["group_name"] = group_name
        __props__.__dict__["lang"] = lang
        return DomainGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainGroupName")
    def domain_group_name(self) -> pulumi.Output[str]:
        """
        The Name of the domain group. The `domain_group_name` is required when the value of the `group_name`  is Empty.
        """
        return pulumi.get(self, "domain_group_name")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> pulumi.Output[str]:
        """
        The Name of the domain group. The `group_name` has been deprecated from provider version 1.97.0. Please use `domain_group_name` instead.
        """
        warnings.warn("""Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""group_name is deprecated: Field 'group_name' has been deprecated from version 1.97.0. Use 'domain_group_name' instead.""")

        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def lang(self) -> pulumi.Output[Optional[str]]:
        """
        User language.
        """
        return pulumi.get(self, "lang")

