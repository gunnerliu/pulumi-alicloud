# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetServiceSubscriptionsResult',
    'AwaitableGetServiceSubscriptionsResult',
    'get_service_subscriptions',
    'get_service_subscriptions_output',
]

@pulumi.output_type
class GetServiceSubscriptionsResult:
    """
    A collection of values returned by getServiceSubscriptions.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None, subscription_name=None, subscriptions=None, topic_name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if subscription_name and not isinstance(subscription_name, str):
            raise TypeError("Expected argument 'subscription_name' to be a str")
        pulumi.set(__self__, "subscription_name", subscription_name)
        if subscriptions and not isinstance(subscriptions, list):
            raise TypeError("Expected argument 'subscriptions' to be a list")
        pulumi.set(__self__, "subscriptions", subscriptions)
        if topic_name and not isinstance(topic_name, str):
            raise TypeError("Expected argument 'topic_name' to be a str")
        pulumi.set(__self__, "topic_name", topic_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Subscription names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")

    @property
    @pulumi.getter(name="subscriptionName")
    def subscription_name(self) -> Optional[str]:
        """
        The name of the subscription.
        """
        return pulumi.get(self, "subscription_name")

    @property
    @pulumi.getter
    def subscriptions(self) -> Sequence['outputs.GetServiceSubscriptionsSubscriptionResult']:
        """
        A list of Subscriptions. Each element contains the following attributes:
        """
        return pulumi.get(self, "subscriptions")

    @property
    @pulumi.getter(name="topicName")
    def topic_name(self) -> str:
        """
        The name of the topic.
        """
        return pulumi.get(self, "topic_name")


class AwaitableGetServiceSubscriptionsResult(GetServiceSubscriptionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceSubscriptionsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            subscription_name=self.subscription_name,
            subscriptions=self.subscriptions,
            topic_name=self.topic_name)


def get_service_subscriptions(ids: Optional[Sequence[str]] = None,
                              name_regex: Optional[str] = None,
                              output_file: Optional[str] = None,
                              page_number: Optional[int] = None,
                              page_size: Optional[int] = None,
                              subscription_name: Optional[str] = None,
                              topic_name: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceSubscriptionsResult:
    """
    This data source provides the Message Notification Service Subscriptions of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.188.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.message.get_service_subscriptions(ids=["example_id"],
        topic_name="tf-example")
    pulumi.export("subscriptionId1", ids.subscriptions[0].id)
    name = alicloud.message.get_service_subscriptions(topic_name="tf-example")
    pulumi.export("subscriptionId2", name.subscriptions[0].id)
    ```


    :param Sequence[str] ids: A list of Subscription IDs.
    :param str name_regex: A regex string to filter results by Subscription name.
    :param str subscription_name: The name of the subscription.
    :param str topic_name: The name of the topic.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['subscriptionName'] = subscription_name
    __args__['topicName'] = topic_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:message/getServiceSubscriptions:getServiceSubscriptions', __args__, opts=opts, typ=GetServiceSubscriptionsResult).value

    return AwaitableGetServiceSubscriptionsResult(
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size,
        subscription_name=__ret__.subscription_name,
        subscriptions=__ret__.subscriptions,
        topic_name=__ret__.topic_name)


@_utilities.lift_output_func(get_service_subscriptions)
def get_service_subscriptions_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                     page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                     subscription_name: Optional[pulumi.Input[Optional[str]]] = None,
                                     topic_name: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceSubscriptionsResult]:
    """
    This data source provides the Message Notification Service Subscriptions of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.188.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.message.get_service_subscriptions(ids=["example_id"],
        topic_name="tf-example")
    pulumi.export("subscriptionId1", ids.subscriptions[0].id)
    name = alicloud.message.get_service_subscriptions(topic_name="tf-example")
    pulumi.export("subscriptionId2", name.subscriptions[0].id)
    ```


    :param Sequence[str] ids: A list of Subscription IDs.
    :param str name_regex: A regex string to filter results by Subscription name.
    :param str subscription_name: The name of the subscription.
    :param str topic_name: The name of the topic.
    """
    ...