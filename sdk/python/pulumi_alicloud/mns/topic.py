# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TopicArgs', 'Topic']

@pulumi.input_type
class TopicArgs:
    def __init__(__self__, *,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 maximum_message_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Topic resource.
        :param pulumi.Input[bool] logging_enabled: Is logging enabled? true or false. Default value to false.
        :param pulumi.Input[int] maximum_message_size: This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        :param pulumi.Input[str] name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        if logging_enabled is not None:
            pulumi.set(__self__, "logging_enabled", logging_enabled)
        if maximum_message_size is not None:
            pulumi.set(__self__, "maximum_message_size", maximum_message_size)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Is logging enabled? true or false. Default value to false.
        """
        return pulumi.get(self, "logging_enabled")

    @logging_enabled.setter
    def logging_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logging_enabled", value)

    @property
    @pulumi.getter(name="maximumMessageSize")
    def maximum_message_size(self) -> Optional[pulumi.Input[int]]:
        """
        This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        """
        return pulumi.get(self, "maximum_message_size")

    @maximum_message_size.setter
    def maximum_message_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_message_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TopicState:
    def __init__(__self__, *,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 maximum_message_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Topic resources.
        :param pulumi.Input[bool] logging_enabled: Is logging enabled? true or false. Default value to false.
        :param pulumi.Input[int] maximum_message_size: This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        :param pulumi.Input[str] name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        if logging_enabled is not None:
            pulumi.set(__self__, "logging_enabled", logging_enabled)
        if maximum_message_size is not None:
            pulumi.set(__self__, "maximum_message_size", maximum_message_size)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Is logging enabled? true or false. Default value to false.
        """
        return pulumi.get(self, "logging_enabled")

    @logging_enabled.setter
    def logging_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "logging_enabled", value)

    @property
    @pulumi.getter(name="maximumMessageSize")
    def maximum_message_size(self) -> Optional[pulumi.Input[int]]:
        """
        This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        """
        return pulumi.get(self, "maximum_message_size")

    @maximum_message_size.setter
    def maximum_message_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "maximum_message_size", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Topic(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 maximum_message_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        MNS Topic can be imported using the id or name, e.g.

        ```sh
         $ pulumi import alicloud:mns/topic:Topic topic topicName
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] logging_enabled: Is logging enabled? true or false. Default value to false.
        :param pulumi.Input[int] maximum_message_size: This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        :param pulumi.Input[str] name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TopicArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        MNS Topic can be imported using the id or name, e.g.

        ```sh
         $ pulumi import alicloud:mns/topic:Topic topic topicName
        ```

        :param str resource_name: The name of the resource.
        :param TopicArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TopicArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 logging_enabled: Optional[pulumi.Input[bool]] = None,
                 maximum_message_size: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
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
            __props__ = TopicArgs.__new__(TopicArgs)

            __props__.__dict__["logging_enabled"] = logging_enabled
            __props__.__dict__["maximum_message_size"] = maximum_message_size
            __props__.__dict__["name"] = name
        super(Topic, __self__).__init__(
            'alicloud:mns/topic:Topic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            logging_enabled: Optional[pulumi.Input[bool]] = None,
            maximum_message_size: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Topic':
        """
        Get an existing Topic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] logging_enabled: Is logging enabled? true or false. Default value to false.
        :param pulumi.Input[int] maximum_message_size: This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        :param pulumi.Input[str] name: Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TopicState.__new__(_TopicState)

        __props__.__dict__["logging_enabled"] = logging_enabled
        __props__.__dict__["maximum_message_size"] = maximum_message_size
        __props__.__dict__["name"] = name
        return Topic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="loggingEnabled")
    def logging_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Is logging enabled? true or false. Default value to false.
        """
        return pulumi.get(self, "logging_enabled")

    @property
    @pulumi.getter(name="maximumMessageSize")
    def maximum_message_size(self) -> pulumi.Output[Optional[int]]:
        """
        This indicates the maximum length, in bytes, of any message body sent to the topic. Valid value range: 1024-65536, i.e., 1K to 64K. Default value to 65536.
        """
        return pulumi.get(self, "maximum_message_size")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Two topics on a single account in the same region cannot have the same name. A topic name must start with an English letter or a digit, and can contain English letters, digits, and hyphens, with the length not exceeding 256 characters.
        """
        return pulumi.get(self, "name")

