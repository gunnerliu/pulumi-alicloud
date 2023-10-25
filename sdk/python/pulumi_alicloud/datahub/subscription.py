# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SubscriptionArgs', 'Subscription']

@pulumi.input_type
class SubscriptionArgs:
    def __init__(__self__, *,
                 project_name: pulumi.Input[str],
                 topic_name: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Subscription resource.
        :param pulumi.Input[str] project_name: The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] topic_name: The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] comment: Comment of the datahub subscription. It cannot be longer than 255 characters.
        """
        SubscriptionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            project_name=project_name,
            topic_name=topic_name,
            comment=comment,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             project_name: Optional[pulumi.Input[str]] = None,
             topic_name: Optional[pulumi.Input[str]] = None,
             comment: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if project_name is None and 'projectName' in kwargs:
            project_name = kwargs['projectName']
        if project_name is None:
            raise TypeError("Missing 'project_name' argument")
        if topic_name is None and 'topicName' in kwargs:
            topic_name = kwargs['topicName']
        if topic_name is None:
            raise TypeError("Missing 'topic_name' argument")

        _setter("project_name", project_name)
        _setter("topic_name", topic_name)
        if comment is not None:
            _setter("comment", comment)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[str]:
        """
        The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Input[str]:
        """
        The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "topic_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment of the datahub subscription. It cannot be longer than 255 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)


@pulumi.input_type
class _SubscriptionState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 last_modify_time: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 sub_id: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Subscription resources.
        :param pulumi.Input[str] comment: Comment of the datahub subscription. It cannot be longer than 255 characters.
        :param pulumi.Input[str] create_time: Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[str] last_modify_time: Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[str] project_name: The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] sub_id: The identidy of the subscription, generate from server side.
        :param pulumi.Input[str] topic_name: The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        _SubscriptionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            comment=comment,
            create_time=create_time,
            last_modify_time=last_modify_time,
            project_name=project_name,
            sub_id=sub_id,
            topic_name=topic_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             comment: Optional[pulumi.Input[str]] = None,
             create_time: Optional[pulumi.Input[str]] = None,
             last_modify_time: Optional[pulumi.Input[str]] = None,
             project_name: Optional[pulumi.Input[str]] = None,
             sub_id: Optional[pulumi.Input[str]] = None,
             topic_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if last_modify_time is None and 'lastModifyTime' in kwargs:
            last_modify_time = kwargs['lastModifyTime']
        if project_name is None and 'projectName' in kwargs:
            project_name = kwargs['projectName']
        if sub_id is None and 'subId' in kwargs:
            sub_id = kwargs['subId']
        if topic_name is None and 'topicName' in kwargs:
            topic_name = kwargs['topicName']

        if comment is not None:
            _setter("comment", comment)
        if create_time is not None:
            _setter("create_time", create_time)
        if last_modify_time is not None:
            _setter("last_modify_time", last_modify_time)
        if project_name is not None:
            _setter("project_name", project_name)
        if sub_id is not None:
            _setter("sub_id", sub_id)
        if topic_name is not None:
            _setter("topic_name", topic_name)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment of the datahub subscription. It cannot be longer than 255 characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="lastModifyTime")
    def last_modify_time(self) -> Optional[pulumi.Input[str]]:
        """
        Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "last_modify_time")

    @last_modify_time.setter
    def last_modify_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modify_time", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter(name="subId")
    def sub_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identidy of the subscription, generate from server side.
        """
        return pulumi.get(self, "sub_id")

    @sub_id.setter
    def sub_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sub_id", value)

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "topic_name")

    @topic_name.setter
    def topic_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "topic_name", value)


class Subscription(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        The subscription is the basic unit of resource usage in Datahub Service under Publish/Subscribe model. You can manage the relationships between user and topics by using subscriptions. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).

        > **NOTE:** Available since v1.19.0.

        ## Import

        Datahub subscription can be imported using the ID, e.g.

        ```sh
         $ pulumi import alicloud:datahub/subscription:Subscription example tf_datahub_project:tf_datahub_topic:1539073399567UgCzY
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment of the datahub subscription. It cannot be longer than 255 characters.
        :param pulumi.Input[str] project_name: The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] topic_name: The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubscriptionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The subscription is the basic unit of resource usage in Datahub Service under Publish/Subscribe model. You can manage the relationships between user and topics by using subscriptions. [Refer to details](https://www.alibabacloud.com/help/en/datahub/latest/nerbcz).

        > **NOTE:** Available since v1.19.0.

        ## Import

        Datahub subscription can be imported using the ID, e.g.

        ```sh
         $ pulumi import alicloud:datahub/subscription:Subscription example tf_datahub_project:tf_datahub_topic:1539073399567UgCzY
        ```

        :param str resource_name: The name of the resource.
        :param SubscriptionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubscriptionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SubscriptionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 topic_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubscriptionArgs.__new__(SubscriptionArgs)

            __props__.__dict__["comment"] = comment
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            if topic_name is None and not opts.urn:
                raise TypeError("Missing required property 'topic_name'")
            __props__.__dict__["topic_name"] = topic_name
            __props__.__dict__["create_time"] = None
            __props__.__dict__["last_modify_time"] = None
            __props__.__dict__["sub_id"] = None
        super(Subscription, __self__).__init__(
            'alicloud:datahub/subscription:Subscription',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            last_modify_time: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            sub_id: Optional[pulumi.Input[str]] = None,
            topic_name: Optional[pulumi.Input[str]] = None) -> 'Subscription':
        """
        Get an existing Subscription resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment of the datahub subscription. It cannot be longer than 255 characters.
        :param pulumi.Input[str] create_time: Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[str] last_modify_time: Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[str] project_name: The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] sub_id: The identidy of the subscription, generate from server side.
        :param pulumi.Input[str] topic_name: The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubscriptionState.__new__(_SubscriptionState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["last_modify_time"] = last_modify_time
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["sub_id"] = sub_id
        __props__.__dict__["topic_name"] = topic_name
        return Subscription(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment of the datahub subscription. It cannot be longer than 255 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Create time of the datahub subscription. It is a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="lastModifyTime")
    def last_modify_time(self) -> pulumi.Output[str]:
        """
        Last modify time of the datahub subscription. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "last_modify_time")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        The name of the datahub project that the subscription belongs to. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="subId")
    def sub_id(self) -> pulumi.Output[str]:
        """
        The identidy of the subscription, generate from server side.
        """
        return pulumi.get(self, "sub_id")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> pulumi.Output[str]:
        """
        The name of the datahub topic that the subscription belongs to. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "topic_name")

