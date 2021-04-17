# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetGroupsGroupResult',
    'GetInstancesInstanceResult',
    'GetTopicsTopicResult',
]

@pulumi.output_type
class GetGroupsGroupResult(dict):
    def __init__(__self__, *,
                 group_name: str,
                 group_type: str,
                 id: str,
                 independent_naming: bool,
                 instance_id: str,
                 owner: str,
                 remark: str,
                 tags: Mapping[str, Any]):
        """
        :param str group_name: The name of the group.
        :param str group_type: Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
        :param str id: The name of the group.
        :param bool independent_naming: Indicates whether namespaces are available. Read [Fields in SubscribeInfoDo](https://www.alibabacloud.com/help/doc-detail/29619.html) for further details.
        :param str instance_id: ID of the ONS Instance that owns the groups.
        :param str owner: The ID of the group owner, which is the Alibaba Cloud UID.
        :param str remark: Remark of the group.
        :param Mapping[str, Any] tags: A map of tags assigned to the Ons instance.
        """
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "group_type", group_type)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "independent_naming", independent_naming)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "owner", owner)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The name of the group.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter(name="groupType")
    def group_type(self) -> str:
        """
        Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
        """
        return pulumi.get(self, "group_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The name of the group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="independentNaming")
    def independent_naming(self) -> bool:
        """
        Indicates whether namespaces are available. Read [Fields in SubscribeInfoDo](https://www.alibabacloud.com/help/doc-detail/29619.html) for further details.
        """
        return pulumi.get(self, "independent_naming")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        ID of the ONS Instance that owns the groups.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def owner(self) -> str:
        """
        The ID of the group owner, which is the Alibaba Cloud UID.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        Remark of the group.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A map of tags assigned to the Ons instance.
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 http_internal_endpoint: str,
                 http_internet_endpoint: str,
                 http_internet_secure_endpoint: str,
                 id: str,
                 independent_naming: bool,
                 instance_id: str,
                 instance_name: str,
                 instance_status: int,
                 instance_type: int,
                 release_time: str,
                 remark: str,
                 status: int,
                 tags: Mapping[str, Any],
                 tcp_endpoint: str):
        """
        :param str http_internal_endpoint: The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
        :param str http_internet_endpoint: The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
        :param str http_internet_secure_endpoint: The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
        :param str id: ID of the instance.
        :param bool independent_naming: Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
        :param str instance_id: ID of the instance.
        :param str instance_name: Name of the instance.
        :param int instance_status: The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        :param int instance_type: The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        :param str release_time: The automatic release time of an Enterprise Platinum Edition instance.
        :param str remark: This attribute is a concise description of instance.
        :param int status: The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
        :param Mapping[str, Any] tags: A map of tags assigned to the Ons instance.
        :param str tcp_endpoint: The TCP endpoint for the Message Queue for Apache RocketMQ instance.
        """
        pulumi.set(__self__, "http_internal_endpoint", http_internal_endpoint)
        pulumi.set(__self__, "http_internet_endpoint", http_internet_endpoint)
        pulumi.set(__self__, "http_internet_secure_endpoint", http_internet_secure_endpoint)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "independent_naming", independent_naming)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "instance_status", instance_status)
        pulumi.set(__self__, "instance_type", instance_type)
        pulumi.set(__self__, "release_time", release_time)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "tags", tags)
        pulumi.set(__self__, "tcp_endpoint", tcp_endpoint)

    @property
    @pulumi.getter(name="httpInternalEndpoint")
    def http_internal_endpoint(self) -> str:
        """
        The internal HTTP endpoint for the Message Queue for Apache RocketMQ instance.
        """
        return pulumi.get(self, "http_internal_endpoint")

    @property
    @pulumi.getter(name="httpInternetEndpoint")
    def http_internet_endpoint(self) -> str:
        """
        The public HTTP endpoint for the Message Queue for Apache RocketMQ instance.
        """
        return pulumi.get(self, "http_internet_endpoint")

    @property
    @pulumi.getter(name="httpInternetSecureEndpoint")
    def http_internet_secure_endpoint(self) -> str:
        """
        The public HTTPS endpoint for the Message Queue for Apache RocketMQ instance.
        """
        return pulumi.get(self, "http_internet_secure_endpoint")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="independentNaming")
    def independent_naming(self) -> bool:
        """
        Indicates whether any namespace is configured for the Message Queue for Apache RocketMQ instance.
        """
        return pulumi.get(self, "independent_naming")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        Name of the instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="instanceStatus")
    def instance_status(self) -> int:
        """
        The status of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        """
        return pulumi.get(self, "instance_status")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> int:
        """
        The type of the instance. Read [Fields in InstanceVO](https://www.alibabacloud.com/help/doc-detail/106351.html) for further details.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="releaseTime")
    def release_time(self) -> str:
        """
        The automatic release time of an Enterprise Platinum Edition instance.
        """
        return pulumi.get(self, "release_time")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        This attribute is a concise description of instance.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter
    def status(self) -> int:
        """
        The status of Ons instance. Valid values: `0` deploying, `2` arrears, `5` running, `7` upgrading.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A map of tags assigned to the Ons instance.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tcpEndpoint")
    def tcp_endpoint(self) -> str:
        """
        The TCP endpoint for the Message Queue for Apache RocketMQ instance.
        """
        return pulumi.get(self, "tcp_endpoint")


@pulumi.output_type
class GetTopicsTopicResult(dict):
    def __init__(__self__, *,
                 id: str,
                 independent_naming: bool,
                 instance_id: str,
                 message_type: int,
                 owner: str,
                 perm: int,
                 relation: int,
                 relation_name: str,
                 remark: str,
                 tags: Mapping[str, Any],
                 topic: str,
                 topic_name: str):
        """
        :param str id: The id of the topic.
        :param bool independent_naming: Indicates whether namespaces are available. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        :param str instance_id: ID of the ONS Instance that owns the topics.
        :param int message_type: The type of the message. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        :param str owner: The ID of the topic owner, which is the Alibaba Cloud UID.
        :param int perm: This attribute is used to set the read-write mode for the topic.
        :param int relation: The relation ID. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        :param str relation_name: The name of the relation, for example, owner, publishable, subscribable, and publishable and subscribable.
        :param str remark: Remark of the topic.
        :param Mapping[str, Any] tags: A map of tags assigned to the Ons instance.
        :param str topic: The name of the topic.
        :param str topic_name: The name of the topic.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "independent_naming", independent_naming)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "message_type", message_type)
        pulumi.set(__self__, "owner", owner)
        pulumi.set(__self__, "perm", perm)
        pulumi.set(__self__, "relation", relation)
        pulumi.set(__self__, "relation_name", relation_name)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "tags", tags)
        pulumi.set(__self__, "topic", topic)
        pulumi.set(__self__, "topic_name", topic_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The id of the topic.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="independentNaming")
    def independent_naming(self) -> bool:
        """
        Indicates whether namespaces are available. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        """
        return pulumi.get(self, "independent_naming")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        ID of the ONS Instance that owns the topics.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="messageType")
    def message_type(self) -> int:
        """
        The type of the message. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        """
        return pulumi.get(self, "message_type")

    @property
    @pulumi.getter
    def owner(self) -> str:
        """
        The ID of the topic owner, which is the Alibaba Cloud UID.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def perm(self) -> int:
        """
        This attribute is used to set the read-write mode for the topic.
        """
        return pulumi.get(self, "perm")

    @property
    @pulumi.getter
    def relation(self) -> int:
        """
        The relation ID. Read [Fields in PublishInfoDo](https://www.alibabacloud.com/help/doc-detail/29590.html) for further details.
        """
        return pulumi.get(self, "relation")

    @property
    @pulumi.getter(name="relationName")
    def relation_name(self) -> str:
        """
        The name of the relation, for example, owner, publishable, subscribable, and publishable and subscribable.
        """
        return pulumi.get(self, "relation_name")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        Remark of the topic.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, Any]:
        """
        A map of tags assigned to the Ons instance.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def topic(self) -> str:
        """
        The name of the topic.
        """
        return pulumi.get(self, "topic")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> str:
        """
        The name of the topic.
        """
        return pulumi.get(self, "topic_name")


