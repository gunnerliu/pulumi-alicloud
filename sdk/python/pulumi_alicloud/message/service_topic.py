# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceTopicArgs', 'ServiceTopic']

@pulumi.input_type
class ServiceTopicArgs:
    def __init__(__self__, *,
                 topic_name: pulumi.Input[str],
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 max_message_size: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a ServiceTopic resource.
        :param pulumi.Input[str] topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        :param pulumi.Input[bool] logging_enabled: Specifies whether to enable the log management feature. Default value: false. Valid values:
        :param pulumi.Input[int] max_message_size: The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        """
        ServiceTopicArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            topic_name=topic_name,
            logging_enabled=logging_enabled,
            max_message_size=max_message_size,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             topic_name: Optional[pulumi.Input[str]] = None,
             logging_enabled: Optional[pulumi.Input[bool]] = None,
             max_message_size: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if topic_name is None and 'topicName' in kwargs:
            topic_name = kwargs['topicName']
        if topic_name is None:
            raise TypeError("Missing 'topic_name' argument")
        if logging_enabled is None and 'loggingEnabled' in kwargs:
            logging_enabled = kwargs['loggingEnabled']
        if max_message_size is None and 'maxMessageSize' in kwargs:
            max_message_size = kwargs['maxMessageSize']

        _setter("topic_name", topic_name)
        if logging_enabled is not None:
            _setter("logging_enabled", logging_enabled)
        if max_message_size is not None:
            _setter("max_message_size", max_message_size)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Input[str]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "topic_name", value)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the log management feature. Default value: false. Valid values:
        """
        return pulumi.get(self, "logging_enabled")

    @logging_enabled.setter
    def logging_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logging_enabled", value)

    @property
    @pulumi.getter(name="maxMessageSize")
    def max_message_size(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        """
        return pulumi.get(self, "max_message_size")

    @max_message_size.setter
    def max_message_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_message_size", value)


@pulumi.input_type
class _ServiceTopicState:
    def __init__(__self__, *,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 max_message_size: Optional[pulumi.Input[int]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceTopic resources.
        :param pulumi.Input[bool] logging_enabled: Specifies whether to enable the log management feature. Default value: false. Valid values:
        :param pulumi.Input[int] max_message_size: The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        :param pulumi.Input[str] topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        _ServiceTopicState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            logging_enabled=logging_enabled,
            max_message_size=max_message_size,
            topic_name=topic_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             logging_enabled: Optional[pulumi.Input[bool]] = None,
             max_message_size: Optional[pulumi.Input[int]] = None,
             topic_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if logging_enabled is None and 'loggingEnabled' in kwargs:
            logging_enabled = kwargs['loggingEnabled']
        if max_message_size is None and 'maxMessageSize' in kwargs:
            max_message_size = kwargs['maxMessageSize']
        if topic_name is None and 'topicName' in kwargs:
            topic_name = kwargs['topicName']

        if logging_enabled is not None:
            _setter("logging_enabled", logging_enabled)
        if max_message_size is not None:
            _setter("max_message_size", max_message_size)
        if topic_name is not None:
            _setter("topic_name", topic_name)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable the log management feature. Default value: false. Valid values:
        """
        return pulumi.get(self, "logging_enabled")

    @logging_enabled.setter
    def logging_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logging_enabled", value)

    @property
    @pulumi.getter(name="maxMessageSize")
    def max_message_size(self) -> Optional[pulumi.Input[int]]:
        """
        The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        """
        return pulumi.get(self, "max_message_size")

    @max_message_size.setter
    def max_message_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_message_size", value)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> Optional[pulumi.Input[str]]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "topic_name", value)


class ServiceTopic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 max_message_size: Optional[pulumi.Input[int]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Message Notification Service Topic resource.

        For information about Message Notification Service Topic and how to use it, see [What is Topic](https://www.alibabacloud.com/help/en/message-service/latest/createtopic).

        > **NOTE:** Available since v1.188.0.

        ## Import

        Message Notification Service Topic can be imported using the id or topic_name, e.g.

        ```sh
         $ pulumi import alicloud:message/serviceTopic:ServiceTopic example <topic_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] logging_enabled: Specifies whether to enable the log management feature. Default value: false. Valid values:
        :param pulumi.Input[int] max_message_size: The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        :param pulumi.Input[str] topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceTopicArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Message Notification Service Topic resource.

        For information about Message Notification Service Topic and how to use it, see [What is Topic](https://www.alibabacloud.com/help/en/message-service/latest/createtopic).

        > **NOTE:** Available since v1.188.0.

        ## Import

        Message Notification Service Topic can be imported using the id or topic_name, e.g.

        ```sh
         $ pulumi import alicloud:message/serviceTopic:ServiceTopic example <topic_name>
        ```

        :param str resource_name: The name of the resource.
        :param ServiceTopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceTopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ServiceTopicArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 max_message_size: Optional[pulumi.Input[int]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceTopicArgs.__new__(ServiceTopicArgs)

            __props__.__dict__["logging_enabled"] = logging_enabled
            __props__.__dict__["max_message_size"] = max_message_size
            if topic_name is None and not opts.urn:
                raise TypeError("Missing required property 'topic_name'")
            __props__.__dict__["topic_name"] = topic_name
        super(ServiceTopic, __self__).__init__(
            'alicloud:message/serviceTopic:ServiceTopic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            logging_enabled: Optional[pulumi.Input[bool]] = None,
            max_message_size: Optional[pulumi.Input[int]] = None,
            topic_name: Optional[pulumi.Input[str]] = None) -> 'ServiceTopic':
        """
        Get an existing ServiceTopic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] logging_enabled: Specifies whether to enable the log management feature. Default value: false. Valid values:
        :param pulumi.Input[int] max_message_size: The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        :param pulumi.Input[str] topic_name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceTopicState.__new__(_ServiceTopicState)

        __props__.__dict__["logging_enabled"] = logging_enabled
        __props__.__dict__["max_message_size"] = max_message_size
        __props__.__dict__["topic_name"] = topic_name
        return ServiceTopic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable the log management feature. Default value: false. Valid values:
        """
        return pulumi.get(self, "logging_enabled")

    @property
    @pulumi.getter(name="maxMessageSize")
    def max_message_size(self) -> pulumi.Output[int]:
        """
        The maximum size of a message body that can be sent to the topic. Unit: bytes. Valid values: 1024-65536. Default value: 65536.
        """
        return pulumi.get(self, "max_message_size")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Output[str]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 255 characters.
        """
        return pulumi.get(self, "topic_name")

