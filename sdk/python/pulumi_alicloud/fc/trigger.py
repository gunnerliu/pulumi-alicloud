# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Trigger']


class Trigger(pulumi.CustomResource):
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
        Create a Trigger resource with the given unique name, props, and options.
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
            __props__ = dict()

            __props__['config'] = config
            __props__['config_mns'] = config_mns
            if function is None:
                raise TypeError("Missing required property 'function'")
            __props__['function'] = function
            __props__['name'] = name
            __props__['name_prefix'] = name_prefix
            __props__['role'] = role
            if service is None:
                raise TypeError("Missing required property 'service'")
            __props__['service'] = service
            __props__['source_arn'] = source_arn
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['last_modified'] = None
            __props__['trigger_id'] = None
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

        __props__ = dict()

        __props__["config"] = config
        __props__["config_mns"] = config_mns
        __props__["function"] = function
        __props__["last_modified"] = last_modified
        __props__["name"] = name
        __props__["name_prefix"] = name_prefix
        __props__["role"] = role
        __props__["service"] = service
        __props__["source_arn"] = source_arn
        __props__["trigger_id"] = trigger_id
        __props__["type"] = type
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

