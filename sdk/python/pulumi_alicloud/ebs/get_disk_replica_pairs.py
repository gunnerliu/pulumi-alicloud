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
    'GetDiskReplicaPairsResult',
    'AwaitableGetDiskReplicaPairsResult',
    'get_disk_replica_pairs',
    'get_disk_replica_pairs_output',
]

@pulumi.output_type
class GetDiskReplicaPairsResult:
    """
    A collection of values returned by getDiskReplicaPairs.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, pairs=None, replica_group_id=None, site=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if pairs and not isinstance(pairs, list):
            raise TypeError("Expected argument 'pairs' to be a list")
        pulumi.set(__self__, "pairs", pairs)
        if replica_group_id and not isinstance(replica_group_id, str):
            raise TypeError("Expected argument 'replica_group_id' to be a str")
        pulumi.set(__self__, "replica_group_id", replica_group_id)
        if site and not isinstance(site, str):
            raise TypeError("Expected argument 'site' to be a str")
        pulumi.set(__self__, "site", site)

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
        """
        A list of Disk Replica Pair IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def pairs(self) -> Sequence['outputs.GetDiskReplicaPairsPairResult']:
        """
        A list of Disk Replica Pair Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "pairs")

    @property
    @pulumi.getter(name="replicaGroupId")
    def replica_group_id(self) -> Optional[str]:
        return pulumi.get(self, "replica_group_id")

    @property
    @pulumi.getter
    def site(self) -> Optional[str]:
        return pulumi.get(self, "site")


class AwaitableGetDiskReplicaPairsResult(GetDiskReplicaPairsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDiskReplicaPairsResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            pairs=self.pairs,
            replica_group_id=self.replica_group_id,
            site=self.site)


def get_disk_replica_pairs(ids: Optional[Sequence[str]] = None,
                           output_file: Optional[str] = None,
                           replica_group_id: Optional[str] = None,
                           site: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDiskReplicaPairsResult:
    """
    This data source provides Ebs Disk Replica Pair available to the user.

    > **NOTE:** Available in 1.196.0+


    :param Sequence[str] ids: A list of Disk Replica Pair IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str replica_group_id: Consistent Replication Group ID, you can specify a consistent replication group ID to query the replication pairs within the group.
    :param str site: Get data for replication pairs where this Region is the production site or the disaster recovery site.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['replicaGroupId'] = replica_group_id
    __args__['site'] = site
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ebs/getDiskReplicaPairs:getDiskReplicaPairs', __args__, opts=opts, typ=GetDiskReplicaPairsResult).value

    return AwaitableGetDiskReplicaPairsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        pairs=pulumi.get(__ret__, 'pairs'),
        replica_group_id=pulumi.get(__ret__, 'replica_group_id'),
        site=pulumi.get(__ret__, 'site'))


@_utilities.lift_output_func(get_disk_replica_pairs)
def get_disk_replica_pairs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                  replica_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                  site: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDiskReplicaPairsResult]:
    """
    This data source provides Ebs Disk Replica Pair available to the user.

    > **NOTE:** Available in 1.196.0+


    :param Sequence[str] ids: A list of Disk Replica Pair IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str replica_group_id: Consistent Replication Group ID, you can specify a consistent replication group ID to query the replication pairs within the group.
    :param str site: Get data for replication pairs where this Region is the production site or the disaster recovery site.
    """
    ...
