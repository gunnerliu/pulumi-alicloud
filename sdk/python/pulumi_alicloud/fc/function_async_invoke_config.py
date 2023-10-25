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

__all__ = ['FunctionAsyncInvokeConfigArgs', 'FunctionAsyncInvokeConfig']

@pulumi.input_type
class FunctionAsyncInvokeConfigArgs:
    def __init__(__self__, *,
                 function_name: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 destination_config: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 stateful_invocation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a FunctionAsyncInvokeConfig resource.
        :param pulumi.Input[str] function_name: Name of the Function Compute Function.
        :param pulumi.Input[str] service_name: Name of the Function Compute Function, omitting any version or alias qualifier.
        :param pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs'] destination_config: Configuration block with destination configuration. See `destination_config` below.
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        :param pulumi.Input[str] qualifier: Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        :param pulumi.Input[bool] stateful_invocation: Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        FunctionAsyncInvokeConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            function_name=function_name,
            service_name=service_name,
            destination_config=destination_config,
            maximum_event_age_in_seconds=maximum_event_age_in_seconds,
            maximum_retry_attempts=maximum_retry_attempts,
            qualifier=qualifier,
            stateful_invocation=stateful_invocation,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             function_name: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             destination_config: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']] = None,
             maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
             maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
             qualifier: Optional[pulumi.Input[str]] = None,
             stateful_invocation: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if function_name is None and 'functionName' in kwargs:
            function_name = kwargs['functionName']
        if function_name is None:
            raise TypeError("Missing 'function_name' argument")
        if service_name is None and 'serviceName' in kwargs:
            service_name = kwargs['serviceName']
        if service_name is None:
            raise TypeError("Missing 'service_name' argument")
        if destination_config is None and 'destinationConfig' in kwargs:
            destination_config = kwargs['destinationConfig']
        if maximum_event_age_in_seconds is None and 'maximumEventAgeInSeconds' in kwargs:
            maximum_event_age_in_seconds = kwargs['maximumEventAgeInSeconds']
        if maximum_retry_attempts is None and 'maximumRetryAttempts' in kwargs:
            maximum_retry_attempts = kwargs['maximumRetryAttempts']
        if stateful_invocation is None and 'statefulInvocation' in kwargs:
            stateful_invocation = kwargs['statefulInvocation']

        _setter("function_name", function_name)
        _setter("service_name", service_name)
        if destination_config is not None:
            _setter("destination_config", destination_config)
        if maximum_event_age_in_seconds is not None:
            _setter("maximum_event_age_in_seconds", maximum_event_age_in_seconds)
        if maximum_retry_attempts is not None:
            _setter("maximum_retry_attempts", maximum_retry_attempts)
        if qualifier is not None:
            _setter("qualifier", qualifier)
        if stateful_invocation is not None:
            _setter("stateful_invocation", stateful_invocation)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Input[str]:
        """
        Name of the Function Compute Function.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        Name of the Function Compute Function, omitting any version or alias qualifier.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']]:
        """
        Configuration block with destination configuration. See `destination_config` below.
        """
        return pulumi.get(self, "destination_config")

    @destination_config.setter
    def destination_config(self, value: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']]):
        pulumi.set(self, "destination_config", value)

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @maximum_event_age_in_seconds.setter
    def maximum_event_age_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_event_age_in_seconds", value)

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @maximum_retry_attempts.setter
    def maximum_retry_attempts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_retry_attempts", value)

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualifier", value)

    @property
    @pulumi.getter(name="statefulInvocation")
    def stateful_invocation(self) -> Optional[pulumi.Input[bool]]:
        """
        Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        return pulumi.get(self, "stateful_invocation")

    @stateful_invocation.setter
    def stateful_invocation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "stateful_invocation", value)


@pulumi.input_type
class _FunctionAsyncInvokeConfigState:
    def __init__(__self__, *,
                 created_time: Optional[pulumi.Input[str]] = None,
                 destination_config: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 last_modified_time: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 stateful_invocation: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering FunctionAsyncInvokeConfig resources.
        :param pulumi.Input[str] created_time: The date this resource was created.
        :param pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs'] destination_config: Configuration block with destination configuration. See `destination_config` below.
        :param pulumi.Input[str] function_name: Name of the Function Compute Function.
        :param pulumi.Input[str] last_modified_time: The date this resource was last modified.
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        :param pulumi.Input[str] qualifier: Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        :param pulumi.Input[str] service_name: Name of the Function Compute Function, omitting any version or alias qualifier.
        :param pulumi.Input[bool] stateful_invocation: Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        _FunctionAsyncInvokeConfigState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            created_time=created_time,
            destination_config=destination_config,
            function_name=function_name,
            last_modified_time=last_modified_time,
            maximum_event_age_in_seconds=maximum_event_age_in_seconds,
            maximum_retry_attempts=maximum_retry_attempts,
            qualifier=qualifier,
            service_name=service_name,
            stateful_invocation=stateful_invocation,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             created_time: Optional[pulumi.Input[str]] = None,
             destination_config: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']] = None,
             function_name: Optional[pulumi.Input[str]] = None,
             last_modified_time: Optional[pulumi.Input[str]] = None,
             maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
             maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
             qualifier: Optional[pulumi.Input[str]] = None,
             service_name: Optional[pulumi.Input[str]] = None,
             stateful_invocation: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if created_time is None and 'createdTime' in kwargs:
            created_time = kwargs['createdTime']
        if destination_config is None and 'destinationConfig' in kwargs:
            destination_config = kwargs['destinationConfig']
        if function_name is None and 'functionName' in kwargs:
            function_name = kwargs['functionName']
        if last_modified_time is None and 'lastModifiedTime' in kwargs:
            last_modified_time = kwargs['lastModifiedTime']
        if maximum_event_age_in_seconds is None and 'maximumEventAgeInSeconds' in kwargs:
            maximum_event_age_in_seconds = kwargs['maximumEventAgeInSeconds']
        if maximum_retry_attempts is None and 'maximumRetryAttempts' in kwargs:
            maximum_retry_attempts = kwargs['maximumRetryAttempts']
        if service_name is None and 'serviceName' in kwargs:
            service_name = kwargs['serviceName']
        if stateful_invocation is None and 'statefulInvocation' in kwargs:
            stateful_invocation = kwargs['statefulInvocation']

        if created_time is not None:
            _setter("created_time", created_time)
        if destination_config is not None:
            _setter("destination_config", destination_config)
        if function_name is not None:
            _setter("function_name", function_name)
        if last_modified_time is not None:
            _setter("last_modified_time", last_modified_time)
        if maximum_event_age_in_seconds is not None:
            _setter("maximum_event_age_in_seconds", maximum_event_age_in_seconds)
        if maximum_retry_attempts is not None:
            _setter("maximum_retry_attempts", maximum_retry_attempts)
        if qualifier is not None:
            _setter("qualifier", qualifier)
        if service_name is not None:
            _setter("service_name", service_name)
        if stateful_invocation is not None:
            _setter("stateful_invocation", stateful_invocation)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        The date this resource was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']]:
        """
        Configuration block with destination configuration. See `destination_config` below.
        """
        return pulumi.get(self, "destination_config")

    @destination_config.setter
    def destination_config(self, value: Optional[pulumi.Input['FunctionAsyncInvokeConfigDestinationConfigArgs']]):
        pulumi.set(self, "destination_config", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Function Compute Function.
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> Optional[pulumi.Input[str]]:
        """
        The date this resource was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @last_modified_time.setter
    def last_modified_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified_time", value)

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @maximum_event_age_in_seconds.setter
    def maximum_event_age_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_event_age_in_seconds", value)

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> Optional[pulumi.Input[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @maximum_retry_attempts.setter
    def maximum_retry_attempts(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_retry_attempts", value)

    @property
    @pulumi.getter
    def qualifier(self) -> Optional[pulumi.Input[str]]:
        """
        Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        """
        return pulumi.get(self, "qualifier")

    @qualifier.setter
    def qualifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualifier", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Function Compute Function, omitting any version or alias qualifier.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter(name="statefulInvocation")
    def stateful_invocation(self) -> Optional[pulumi.Input[bool]]:
        """
        Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        return pulumi.get(self, "stateful_invocation")

    @stateful_invocation.setter
    def stateful_invocation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "stateful_invocation", value)


class FunctionAsyncInvokeConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionAsyncInvokeConfigDestinationConfigArgs']]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 stateful_invocation: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Manages an asynchronous invocation configuration for a FC Function or Alias.\\
         For the detailed information, please refer to the [developer guide](https://www.alibabacloud.com/help/en/fc/developer-reference/api-fc-open-2021-04-06-putfunctionasyncinvokeconfig).

        > **NOTE:** Available since v1.100.0.

        ## Example Usage

        ## Import

        Function Compute Function Async Invoke Configs can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig example my_function
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['FunctionAsyncInvokeConfigDestinationConfigArgs']] destination_config: Configuration block with destination configuration. See `destination_config` below.
        :param pulumi.Input[str] function_name: Name of the Function Compute Function.
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        :param pulumi.Input[str] qualifier: Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        :param pulumi.Input[str] service_name: Name of the Function Compute Function, omitting any version or alias qualifier.
        :param pulumi.Input[bool] stateful_invocation: Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionAsyncInvokeConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an asynchronous invocation configuration for a FC Function or Alias.\\
         For the detailed information, please refer to the [developer guide](https://www.alibabacloud.com/help/en/fc/developer-reference/api-fc-open-2021-04-06-putfunctionasyncinvokeconfig).

        > **NOTE:** Available since v1.100.0.

        ## Example Usage

        ## Import

        Function Compute Function Async Invoke Configs can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig example my_function
        ```

        :param str resource_name: The name of the resource.
        :param FunctionAsyncInvokeConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionAsyncInvokeConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            FunctionAsyncInvokeConfigArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionAsyncInvokeConfigDestinationConfigArgs']]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
                 maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
                 qualifier: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 stateful_invocation: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionAsyncInvokeConfigArgs.__new__(FunctionAsyncInvokeConfigArgs)

            destination_config = _utilities.configure(destination_config, FunctionAsyncInvokeConfigDestinationConfigArgs, True)
            __props__.__dict__["destination_config"] = destination_config
            if function_name is None and not opts.urn:
                raise TypeError("Missing required property 'function_name'")
            __props__.__dict__["function_name"] = function_name
            __props__.__dict__["maximum_event_age_in_seconds"] = maximum_event_age_in_seconds
            __props__.__dict__["maximum_retry_attempts"] = maximum_retry_attempts
            __props__.__dict__["qualifier"] = qualifier
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            __props__.__dict__["stateful_invocation"] = stateful_invocation
            __props__.__dict__["created_time"] = None
            __props__.__dict__["last_modified_time"] = None
        super(FunctionAsyncInvokeConfig, __self__).__init__(
            'alicloud:fc/functionAsyncInvokeConfig:FunctionAsyncInvokeConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            destination_config: Optional[pulumi.Input[pulumi.InputType['FunctionAsyncInvokeConfigDestinationConfigArgs']]] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            last_modified_time: Optional[pulumi.Input[str]] = None,
            maximum_event_age_in_seconds: Optional[pulumi.Input[int]] = None,
            maximum_retry_attempts: Optional[pulumi.Input[int]] = None,
            qualifier: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            stateful_invocation: Optional[pulumi.Input[bool]] = None) -> 'FunctionAsyncInvokeConfig':
        """
        Get an existing FunctionAsyncInvokeConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_time: The date this resource was created.
        :param pulumi.Input[pulumi.InputType['FunctionAsyncInvokeConfigDestinationConfigArgs']] destination_config: Configuration block with destination configuration. See `destination_config` below.
        :param pulumi.Input[str] function_name: Name of the Function Compute Function.
        :param pulumi.Input[str] last_modified_time: The date this resource was last modified.
        :param pulumi.Input[int] maximum_event_age_in_seconds: Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        :param pulumi.Input[int] maximum_retry_attempts: Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        :param pulumi.Input[str] qualifier: Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        :param pulumi.Input[str] service_name: Name of the Function Compute Function, omitting any version or alias qualifier.
        :param pulumi.Input[bool] stateful_invocation: Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionAsyncInvokeConfigState.__new__(_FunctionAsyncInvokeConfigState)

        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["destination_config"] = destination_config
        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["last_modified_time"] = last_modified_time
        __props__.__dict__["maximum_event_age_in_seconds"] = maximum_event_age_in_seconds
        __props__.__dict__["maximum_retry_attempts"] = maximum_retry_attempts
        __props__.__dict__["qualifier"] = qualifier
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["stateful_invocation"] = stateful_invocation
        return FunctionAsyncInvokeConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        The date this resource was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter(name="destinationConfig")
    def destination_config(self) -> pulumi.Output[Optional['outputs.FunctionAsyncInvokeConfigDestinationConfig']]:
        """
        Configuration block with destination configuration. See `destination_config` below.
        """
        return pulumi.get(self, "destination_config")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[str]:
        """
        Name of the Function Compute Function.
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> pulumi.Output[str]:
        """
        The date this resource was last modified.
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter(name="maximumEventAgeInSeconds")
    def maximum_event_age_in_seconds(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum age of a request that Function Compute sends to a function for processing in seconds. Valid values between 1 and 2592000 (between 60 and 21600 before v1.167.0).
        """
        return pulumi.get(self, "maximum_event_age_in_seconds")

    @property
    @pulumi.getter(name="maximumRetryAttempts")
    def maximum_retry_attempts(self) -> pulumi.Output[Optional[int]]:
        """
        Maximum number of times to retry when the function returns an error. Valid values between 0 and 8 (between 0 and 2 before v1.167.0). Defaults to 2.
        """
        return pulumi.get(self, "maximum_retry_attempts")

    @property
    @pulumi.getter
    def qualifier(self) -> pulumi.Output[Optional[str]]:
        """
        Function Compute Function published version, `LATEST`, or Function Compute Alias name. The default value is `LATEST`.
        """
        return pulumi.get(self, "qualifier")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        Name of the Function Compute Function, omitting any version or alias qualifier.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter(name="statefulInvocation")
    def stateful_invocation(self) -> pulumi.Output[Optional[bool]]:
        """
        Function Compute async job configuration(also known as Task Mode). valid values true or false, default `false`
        """
        return pulumi.get(self, "stateful_invocation")

