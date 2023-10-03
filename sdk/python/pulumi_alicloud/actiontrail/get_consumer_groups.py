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

__all__ = [
    'GetConsumerGroupsResult',
    'AwaitableGetConsumerGroupsResult',
    'get_consumer_groups',
    'get_consumer_groups_output',
]

@pulumi.output_type
class GetConsumerGroupsResult:
    """
    A collection of values returned by getConsumerGroups.
    """
    def __init__(__self__, consumer_id_regex=None, consumer_ids=None, groups=None, id=None, ids=None, instance_id=None, names=None, output_file=None):
        if consumer_id_regex and not isinstance(consumer_id_regex, str):
            raise TypeError("Expected argument 'consumer_id_regex' to be a str")
        pulumi.set(__self__, "consumer_id_regex", consumer_id_regex)
        if consumer_ids and not isinstance(consumer_ids, list):
            raise TypeError("Expected argument 'consumer_ids' to be a list")
        pulumi.set(__self__, "consumer_ids", consumer_ids)
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter(name="consumerIdRegex")
    def consumer_id_regex(self) -> Optional[str]:
        return pulumi.get(self, "consumer_id_regex")

    @property
    @pulumi.getter(name="consumerIds")
    def consumer_ids(self) -> Sequence[str]:
        return pulumi.get(self, "consumer_ids")

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetConsumerGroupsGroupResult']:
        """
        A list of consumer group. Each element contains the following attributes:
        """
        return pulumi.get(self, "groups")

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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The instance_id of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of consumer group names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetConsumerGroupsResult(GetConsumerGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetConsumerGroupsResult(
            consumer_id_regex=self.consumer_id_regex,
            consumer_ids=self.consumer_ids,
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            names=self.names,
            output_file=self.output_file)


def get_consumer_groups(consumer_id_regex: Optional[str] = None,
                        ids: Optional[Sequence[str]] = None,
                        instance_id: Optional[str] = None,
                        output_file: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetConsumerGroupsResult:
    """
    This data source provides a list of ALIKAFKA Consumer Groups in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.56.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    consumer_groups_ds = alicloud.actiontrail.get_consumer_groups(consumer_id_regex="CID-alikafkaGroupDatasourceName",
        instance_id="xxx",
        output_file="consumerGroups.txt")
    pulumi.export("firstGroupName", consumer_groups_ds.consumer_ids[0])
    ```


    :param str consumer_id_regex: A regex string to filter results by the consumer group id.
    :param Sequence[str] ids: A list of ALIKAFKA Consumer Groups IDs, It is formatted to `<instance_id>:<consumer_id>`.
    :param str instance_id: ID of the ALIKAFKA Instance that owns the consumer groups.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['consumerIdRegex'] = consumer_id_regex
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:actiontrail/getConsumerGroups:getConsumerGroups', __args__, opts=opts, typ=GetConsumerGroupsResult).value

    return AwaitableGetConsumerGroupsResult(
        consumer_id_regex=pulumi.get(__ret__, 'consumer_id_regex'),
        consumer_ids=pulumi.get(__ret__, 'consumer_ids'),
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_consumer_groups)
def get_consumer_groups_output(consumer_id_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               instance_id: Optional[pulumi.Input[str]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetConsumerGroupsResult]:
    """
    This data source provides a list of ALIKAFKA Consumer Groups in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.56.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    consumer_groups_ds = alicloud.actiontrail.get_consumer_groups(consumer_id_regex="CID-alikafkaGroupDatasourceName",
        instance_id="xxx",
        output_file="consumerGroups.txt")
    pulumi.export("firstGroupName", consumer_groups_ds.consumer_ids[0])
    ```


    :param str consumer_id_regex: A regex string to filter results by the consumer group id.
    :param Sequence[str] ids: A list of ALIKAFKA Consumer Groups IDs, It is formatted to `<instance_id>:<consumer_id>`.
    :param str instance_id: ID of the ALIKAFKA Instance that owns the consumer groups.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
