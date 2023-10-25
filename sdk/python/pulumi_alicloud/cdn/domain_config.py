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
from ._inputs import *

__all__ = ['DomainConfigArgs', 'DomainConfig']

@pulumi.input_type
class DomainConfigArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 function_args: pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]],
                 function_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a DomainConfig resource.
        :param pulumi.Input[str] domain_name: Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]] function_args: The args of the domain config.
        :param pulumi.Input[str] function_name: The name of the domain config.
        """
        DomainConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            domain_name=domain_name,
            function_args=function_args,
            function_name=function_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             domain_name: Optional[pulumi.Input[str]] = None,
             function_args: Optional[pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]] = None,
             function_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if domain_name is None and 'domainName' in kwargs:
            domain_name = kwargs['domainName']
        if domain_name is None:
            raise TypeError("Missing 'domain_name' argument")
        if function_args is None and 'functionArgs' in kwargs:
            function_args = kwargs['functionArgs']
        if function_args is None:
            raise TypeError("Missing 'function_args' argument")
        if function_name is None and 'functionName' in kwargs:
            function_name = kwargs['functionName']
        if function_name is None:
            raise TypeError("Missing 'function_name' argument")

        _setter("domain_name", domain_name)
        _setter("function_args", function_args)
        _setter("function_name", function_name)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="functionArgs")
    def function_args(self) -> pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]:
        """
        The args of the domain config.
        """
        return pulumi.get(self, "function_args")

    @function_args.setter
    def function_args(self, value: pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]):
        pulumi.set(self, "function_args", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        The name of the domain config.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)


@pulumi.input_type
class _DomainConfigState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[str]] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 function_args: Optional[pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainConfig resources.
        :param pulumi.Input[str] config_id: (Available in 1.132.0+) The ID of the domain config function.
        :param pulumi.Input[str] domain_name: Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]] function_args: The args of the domain config.
        :param pulumi.Input[str] function_name: The name of the domain config.
        :param pulumi.Input[str] status: (Available in 1.132.0+) The Status of the function. Valid values: `success`, `testing`, `failed`, and `configuring`.
        """
        _DomainConfigState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            config_id=config_id,
            domain_name=domain_name,
            function_args=function_args,
            function_name=function_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             config_id: Optional[pulumi.Input[str]] = None,
             domain_name: Optional[pulumi.Input[str]] = None,
             function_args: Optional[pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]] = None,
             function_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if config_id is None and 'configId' in kwargs:
            config_id = kwargs['configId']
        if domain_name is None and 'domainName' in kwargs:
            domain_name = kwargs['domainName']
        if function_args is None and 'functionArgs' in kwargs:
            function_args = kwargs['functionArgs']
        if function_name is None and 'functionName' in kwargs:
            function_name = kwargs['functionName']

        if config_id is not None:
            _setter("config_id", config_id)
        if domain_name is not None:
            _setter("domain_name", domain_name)
        if function_args is not None:
            _setter("function_args", function_args)
        if function_name is not None:
            _setter("function_name", function_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.132.0+) The ID of the domain config function.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="functionArgs")
    def function_args(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]]:
        """
        The args of the domain config.
        """
        return pulumi.get(self, "function_args")

    @function_args.setter
    def function_args(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainConfigFunctionArgArgs']]]]):
        pulumi.set(self, "function_args", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the domain config.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.132.0+) The Status of the function. Valid values: `success`, `testing`, `failed`, and `configuring`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class DomainConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 function_args: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainConfigFunctionArgArgs']]]]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CDN Accelerated Domain resource.

        For information about domain config and how to use it, see [Batch set config](https://www.alibabacloud.com/help/zh/doc-detail/90915.htm)

        > **NOTE:** Available in v1.34.0+.

        ## Import

        CDN domain config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cdn/domainConfig:DomainConfig example <domain_name>:<function_name>:<config_id>
        ```

        ```sh
         $ pulumi import alicloud:cdn/domainConfig:DomainConfig example <domain_name>:<function_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainConfigFunctionArgArgs']]]] function_args: The args of the domain config.
        :param pulumi.Input[str] function_name: The name of the domain config.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CDN Accelerated Domain resource.

        For information about domain config and how to use it, see [Batch set config](https://www.alibabacloud.com/help/zh/doc-detail/90915.htm)

        > **NOTE:** Available in v1.34.0+.

        ## Import

        CDN domain config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cdn/domainConfig:DomainConfig example <domain_name>:<function_name>:<config_id>
        ```

        ```sh
         $ pulumi import alicloud:cdn/domainConfig:DomainConfig example <domain_name>:<function_name>
        ```

        :param str resource_name: The name of the resource.
        :param DomainConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DomainConfigArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 function_args: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainConfigFunctionArgArgs']]]]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainConfigArgs.__new__(DomainConfigArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            if function_args is None and not opts.urn:
                raise TypeError("Missing required property 'function_args'")
            __props__.__dict__["function_args"] = function_args
            if function_name is None and not opts.urn:
                raise TypeError("Missing required property 'function_name'")
            __props__.__dict__["function_name"] = function_name
            __props__.__dict__["config_id"] = None
            __props__.__dict__["status"] = None
        super(DomainConfig, __self__).__init__(
            'alicloud:cdn/domainConfig:DomainConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[str]] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            function_args: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainConfigFunctionArgArgs']]]]] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'DomainConfig':
        """
        Get an existing DomainConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config_id: (Available in 1.132.0+) The ID of the domain config function.
        :param pulumi.Input[str] domain_name: Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DomainConfigFunctionArgArgs']]]] function_args: The args of the domain config.
        :param pulumi.Input[str] function_name: The name of the domain config.
        :param pulumi.Input[str] status: (Available in 1.132.0+) The Status of the function. Valid values: `success`, `testing`, `failed`, and `configuring`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainConfigState.__new__(_DomainConfigState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["function_args"] = function_args
        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["status"] = status
        return DomainConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[str]:
        """
        (Available in 1.132.0+) The ID of the domain config function.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Name of the accelerated domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="functionArgs")
    def function_args(self) -> pulumi.Output[Sequence['outputs.DomainConfigFunctionArg']]:
        """
        The args of the domain config.
        """
        return pulumi.get(self, "function_args")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[str]:
        """
        The name of the domain config.
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in 1.132.0+) The Status of the function. Valid values: `success`, `testing`, `failed`, and `configuring`.
        """
        return pulumi.get(self, "status")

