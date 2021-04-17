# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
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
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
        :param pulumi.Input[str] config: The config of Function Compute trigger.It is valid when `type` is not "mns_topic".See [Configure triggers and events](https://www.alibabacloud.com/help/doc-detail/70140.htm) for more details.
        :param pulumi.Input[str] config_mns: The config of Function Compute trigger when the type is "mns_topic".It is conflict with `config`.
        :param pulumi.Input[str] name: The Function Compute trigger name. It is the only in one service and is conflict with "name_prefix".
        :param pulumi.Input[str] name_prefix: Setting a prefix to get a only trigger name. It is conflict with "name".
        :param pulumi.Input[str] role: RAM role arn attached to the Function Compute trigger. Role used by the event source to call the function. The value format is "acs:ram::$account-id:role/$role-name". See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        :param pulumi.Input[str] source_arn: Event source resource address. See [Create a trigger](https://www.alibabacloud.com/help/doc-detail/53102.htm) for more details.
        """
        pulumi.set(__self__, "function", function)
        pulumi.set(__self__, "service", service)
        pulumi.set(__self__, "type", type)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if config_mns is not None:
            pulumi.set(__self__, "config_mns", config_mns)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if source_arn is not None:
            pulumi.set(__self__, "source_arn", source_arn)

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
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
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
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if config_mns is not None:
            pulumi.set(__self__, "config_mns", config_mns)
        if function is not None:
            pulumi.set(__self__, "function", function)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if service is not None:
            pulumi.set(__self__, "service", service)
        if source_arn is not None:
            pulumi.set(__self__, "source_arn", source_arn)
        if trigger_id is not None:
            pulumi.set(__self__, "trigger_id", trigger_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

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
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
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
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
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
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TriggerArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
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
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
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
        :param pulumi.Input[str] type: The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
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
        The Type of the trigger. Valid values: ["oss", "log", "timer", "http", "mns_topic", "cdn_events"].
        """
        return pulumi.get(self, "type")

