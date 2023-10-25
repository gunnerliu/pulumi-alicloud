# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TriggerArgs', 'Trigger']

@pulumi.input_type
class TriggerArgs:
    def __init__(__self__, *,
                 function: pulumi.Input[str],
                 service: pulumi.Input[str],
                 type: pulumi.Input[str],
                 config: Optional[pulumi.Input[str]] = None,
                 config_mns: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Trigger resource.
        :param pulumi.Input[str] function: The Function Compute function name.
        :param pulumi.Input[str] service: The Function Compute service name.
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].
               
               > **NOTE:** Config does not support modification when type is mns_topic.
               > **NOTE:** type = cdn_events, available in 1.47.0+.
               > **NOTE:** type = eventbridge, available in 1.173.0+.
        :param pulumi.Input[str] config: The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        :param pulumi.Input[str] config_mns: The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        :param pulumi.Input[str] name: The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        :param pulumi.Input[str] name_prefix: Setting a prefix to get a only trigger name. It is conflict with "name".
        :param pulumi.Input[str] role: RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] source_arn: Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        TriggerArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            function=function,
            service=service,
            type=type,
            config=config,
            config_mns=config_mns,
            name=name,
            name_prefix=name_prefix,
            role=role,
            source_arn=source_arn,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             function: Optional[pulumi.Input[str]] = None,
             service: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             config: Optional[pulumi.Input[str]] = None,
             config_mns: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             name_prefix: Optional[pulumi.Input[str]] = None,
             role: Optional[pulumi.Input[str]] = None,
             source_arn: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if function is None:
            raise TypeError("Missing 'function' argument")
        if service is None:
            raise TypeError("Missing 'service' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if config_mns is None and 'configMns' in kwargs:
            config_mns = kwargs['configMns']
        if name_prefix is None and 'namePrefix' in kwargs:
            name_prefix = kwargs['namePrefix']
        if source_arn is None and 'sourceArn' in kwargs:
            source_arn = kwargs['sourceArn']

        _setter("function", function)
        _setter("service", service)
        _setter("type", type)
        if config is not None:
            _setter("config", config)
        if config_mns is not None:
            _setter("config_mns", config_mns)
        if name is not None:
            _setter("name", name)
        if name_prefix is not None:
            _setter("name_prefix", name_prefix)
        if role is not None:
            _setter("role", role)
        if source_arn is not None:
            _setter("source_arn", source_arn)

    @property
    @pulumi.getter
    def function(self) -> pulumi.Input[str]:
        """
        The Function Compute function name.
        """
        return pulumi.get(self, "function")

    @function.setter
    def function(self, value: pulumi.Input[str]):
        pulumi.set(self, "function", value)

    @property
    @pulumi.getter
    def service(self) -> pulumi.Input[str]:
        """
        The Function Compute service name.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: pulumi.Input[str]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].

        > **NOTE:** Config does not support modification when type is mns_topic.
        > **NOTE:** type = cdn_events, available in 1.47.0+.
        > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="configMns")
    def config_mns(self) -> Optional[pulumi.Input[str]]:
        """
        The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        """
        return pulumi.get(self, "config_mns")

    @config_mns.setter
    def config_mns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_mns", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Setting a prefix to get a only trigger name. It is conflict with "name".
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "source_arn")

    @source_arn.setter
    def source_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_arn", value)


@pulumi.input_type
class _TriggerState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[str]] = None,
                 config_mns: Optional[pulumi.Input[str]] = None,
                 function: Optional[pulumi.Input[str]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 trigger_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Trigger resources.
        :param pulumi.Input[str] config: The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        :param pulumi.Input[str] config_mns: The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        :param pulumi.Input[str] function: The Function Compute function name.
        :param pulumi.Input[str] last_modified: The date this resource was last modified.
        :param pulumi.Input[str] name: The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        :param pulumi.Input[str] name_prefix: Setting a prefix to get a only trigger name. It is conflict with "name".
        :param pulumi.Input[str] role: RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] service: The Function Compute service name.
        :param pulumi.Input[str] source_arn: Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] trigger_id: The Function Compute trigger ID.
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].
               
               > **NOTE:** Config does not support modification when type is mns_topic.
               > **NOTE:** type = cdn_events, available in 1.47.0+.
               > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        _TriggerState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            config=config,
            config_mns=config_mns,
            function=function,
            last_modified=last_modified,
            name=name,
            name_prefix=name_prefix,
            role=role,
            service=service,
            source_arn=source_arn,
            trigger_id=trigger_id,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             config: Optional[pulumi.Input[str]] = None,
             config_mns: Optional[pulumi.Input[str]] = None,
             function: Optional[pulumi.Input[str]] = None,
             last_modified: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             name_prefix: Optional[pulumi.Input[str]] = None,
             role: Optional[pulumi.Input[str]] = None,
             service: Optional[pulumi.Input[str]] = None,
             source_arn: Optional[pulumi.Input[str]] = None,
             trigger_id: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if config_mns is None and 'configMns' in kwargs:
            config_mns = kwargs['configMns']
        if last_modified is None and 'lastModified' in kwargs:
            last_modified = kwargs['lastModified']
        if name_prefix is None and 'namePrefix' in kwargs:
            name_prefix = kwargs['namePrefix']
        if source_arn is None and 'sourceArn' in kwargs:
            source_arn = kwargs['sourceArn']
        if trigger_id is None and 'triggerId' in kwargs:
            trigger_id = kwargs['triggerId']

        if config is not None:
            _setter("config", config)
        if config_mns is not None:
            _setter("config_mns", config_mns)
        if function is not None:
            _setter("function", function)
        if last_modified is not None:
            _setter("last_modified", last_modified)
        if name is not None:
            _setter("name", name)
        if name_prefix is not None:
            _setter("name_prefix", name_prefix)
        if role is not None:
            _setter("role", role)
        if service is not None:
            _setter("service", service)
        if source_arn is not None:
            _setter("source_arn", source_arn)
        if trigger_id is not None:
            _setter("trigger_id", trigger_id)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[str]]:
        """
        The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter(name="configMns")
    def config_mns(self) -> Optional[pulumi.Input[str]]:
        """
        The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        """
        return pulumi.get(self, "config_mns")

    @config_mns.setter
    def config_mns(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "config_mns", value)

    @property
    @pulumi.getter
    def function(self) -> Optional[pulumi.Input[str]]:
        """
        The Function Compute function name.
        """
        return pulumi.get(self, "function")

    @function.setter
    def function(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function", value)

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> Optional[pulumi.Input[str]]:
        """
        The date this resource was last modified.
        """
        return pulumi.get(self, "last_modified")

    @last_modified.setter
    def last_modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Setting a prefix to get a only trigger name. It is conflict with "name".
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter
    def service(self) -> Optional[pulumi.Input[str]]:
        """
        The Function Compute service name.
        """
        return pulumi.get(self, "service")

    @service.setter
    def service(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service", value)

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "source_arn")

    @source_arn.setter
    def source_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_arn", value)

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Function Compute trigger ID.
        """
        return pulumi.get(self, "trigger_id")

    @trigger_id.setter
    def trigger_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trigger_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].

        > **NOTE:** Config does not support modification when type is mns_topic.
        > **NOTE:** type = cdn_events, available in 1.47.0+.
        > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Trigger(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 config_mns: Optional[pulumi.Input[str]] = None,
                 function: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Alicloud Function Compute Trigger resource. Based on trigger, execute your code in response to events in Alibaba Cloud.
         For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/en/fc/developer-reference/api-fc-open-2021-04-06-createtrigger).

        > **NOTE:** The resource requires a provider field 'account_id'. See account_id.

        > **NOTE:** Available since v1.93.0.

        ## Module Support

        You can use to the existing fc module
        to create several triggers quickly.

        ## Import

        Function Compute trigger can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fc/trigger:Trigger foo my-fc-service:hello-world:hello-trigger
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        :param pulumi.Input[str] config_mns: The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        :param pulumi.Input[str] function: The Function Compute function name.
        :param pulumi.Input[str] name: The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        :param pulumi.Input[str] name_prefix: Setting a prefix to get a only trigger name. It is conflict with "name".
        :param pulumi.Input[str] role: RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] service: The Function Compute service name.
        :param pulumi.Input[str] source_arn: Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].
               
               > **NOTE:** Config does not support modification when type is mns_topic.
               > **NOTE:** type = cdn_events, available in 1.47.0+.
               > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TriggerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Alicloud Function Compute Trigger resource. Based on trigger, execute your code in response to events in Alibaba Cloud.
         For information about Service and how to use it, see [What is Function Compute](https://www.alibabacloud.com/help/en/fc/developer-reference/api-fc-open-2021-04-06-createtrigger).

        > **NOTE:** The resource requires a provider field 'account_id'. See account_id.

        > **NOTE:** Available since v1.93.0.

        ## Module Support

        You can use to the existing fc module
        to create several triggers quickly.

        ## Import

        Function Compute trigger can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:fc/trigger:Trigger foo my-fc-service:hello-world:hello-trigger
        ```

        :param str resource_name: The name of the resource.
        :param TriggerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TriggerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TriggerArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[str]] = None,
                 config_mns: Optional[pulumi.Input[str]] = None,
                 function: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 service: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TriggerArgs.__new__(TriggerArgs)

            __props__.__dict__["config"] = config
            __props__.__dict__["config_mns"] = config_mns
            if function is None and not opts.urn:
                raise TypeError("Missing required property 'function'")
            __props__.__dict__["function"] = function
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["role"] = role
            if service is None and not opts.urn:
                raise TypeError("Missing required property 'service'")
            __props__.__dict__["service"] = service
            __props__.__dict__["source_arn"] = source_arn
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["trigger_id"] = None
        super(Trigger, __self__).__init__(
            'alicloud:fc/trigger:Trigger',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[str]] = None,
            config_mns: Optional[pulumi.Input[str]] = None,
            function: Optional[pulumi.Input[str]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None,
            service: Optional[pulumi.Input[str]] = None,
            source_arn: Optional[pulumi.Input[str]] = None,
            trigger_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'Trigger':
        """
        Get an existing Trigger resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] config: The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        :param pulumi.Input[str] config_mns: The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        :param pulumi.Input[str] function: The Function Compute function name.
        :param pulumi.Input[str] last_modified: The date this resource was last modified.
        :param pulumi.Input[str] name: The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        :param pulumi.Input[str] name_prefix: Setting a prefix to get a only trigger name. It is conflict with "name".
        :param pulumi.Input[str] role: RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] service: The Function Compute service name.
        :param pulumi.Input[str] source_arn: Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] trigger_id: The Function Compute trigger ID.
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].
               
               > **NOTE:** Config does not support modification when type is mns_topic.
               > **NOTE:** type = cdn_events, available in 1.47.0+.
               > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TriggerState.__new__(_TriggerState)

        __props__.__dict__["config"] = config
        __props__.__dict__["config_mns"] = config_mns
        __props__.__dict__["function"] = function
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["role"] = role
        __props__.__dict__["service"] = service
        __props__.__dict__["source_arn"] = source_arn
        __props__.__dict__["trigger_id"] = trigger_id
        __props__.__dict__["type"] = type
        return Trigger(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Optional[str]]:
        """
        The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="configMns")
    def config_mns(self) -> pulumi.Output[Optional[str]]:
        """
        The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        """
        return pulumi.get(self, "config_mns")

    @property
    @pulumi.getter
    def function(self) -> pulumi.Output[str]:
        """
        The Function Compute function name.
        """
        return pulumi.get(self, "function")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> pulumi.Output[str]:
        """
        The date this resource was last modified.
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[Optional[str]]:
        """
        Setting a prefix to get a only trigger name. It is conflict with "name".
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[Optional[str]]:
        """
        RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter
    def service(self) -> pulumi.Output[str]:
        """
        The Function Compute service name.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> pulumi.Output[Optional[str]]:
        """
        Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        return pulumi.get(self, "source_arn")

    @property
    @pulumi.getter(name="triggerId")
    def trigger_id(self) -> pulumi.Output[str]:
        """
        The Function Compute trigger ID.
        """
        return pulumi.get(self, "trigger_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events", "eventbridge"].

        > **NOTE:** Config does not support modification when type is mns_topic.
        > **NOTE:** type = cdn_events, available in 1.47.0+.
        > **NOTE:** type = eventbridge, available in 1.173.0+.
        """
        return pulumi.get(self, "type")

