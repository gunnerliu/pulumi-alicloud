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
    'GetClustersResult',
    'AwaitableGetClustersResult',
    'get_clusters',
    'get_clusters_output',
]

@pulumi.output_type
class GetClustersResult:
    """
    A collection of values returned by getClusters.
    """
    def __init__(__self__, cluster_name=None, cluster_states=None, cluster_types=None, clusters=None, id=None, ids=None, max_results=None, name_regex=None, names=None, next_token=None, output_file=None, payment_types=None, resource_group_id=None, tags=None, total_count=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if cluster_states and not isinstance(cluster_states, list):
            raise TypeError("Expected argument 'cluster_states' to be a list")
        pulumi.set(__self__, "cluster_states", cluster_states)
        if cluster_types and not isinstance(cluster_types, list):
            raise TypeError("Expected argument 'cluster_types' to be a list")
        pulumi.set(__self__, "cluster_types", cluster_types)
        if clusters and not isinstance(clusters, list):
            raise TypeError("Expected argument 'clusters' to be a list")
        pulumi.set(__self__, "clusters", clusters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if max_results and not isinstance(max_results, int):
            raise TypeError("Expected argument 'max_results' to be a int")
        pulumi.set(__self__, "max_results", max_results)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if next_token and not isinstance(next_token, str):
            raise TypeError("Expected argument 'next_token' to be a str")
        pulumi.set(__self__, "next_token", next_token)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if payment_types and not isinstance(payment_types, list):
            raise TypeError("Expected argument 'payment_types' to be a list")
        pulumi.set(__self__, "payment_types", payment_types)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[str]:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="clusterStates")
    def cluster_states(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "cluster_states")

    @property
    @pulumi.getter(name="clusterTypes")
    def cluster_types(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "cluster_types")

    @property
    @pulumi.getter
    def clusters(self) -> Sequence['outputs.GetClustersClusterResult']:
        return pulumi.get(self, "clusters")

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
    @pulumi.getter(name="maxResults")
    def max_results(self) -> Optional[int]:
        return pulumi.get(self, "max_results")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="nextToken")
    def next_token(self) -> Optional[str]:
        return pulumi.get(self, "next_token")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="paymentTypes")
    def payment_types(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "payment_types")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        return pulumi.get(self, "total_count")


class AwaitableGetClustersResult(GetClustersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClustersResult(
            cluster_name=self.cluster_name,
            cluster_states=self.cluster_states,
            cluster_types=self.cluster_types,
            clusters=self.clusters,
            id=self.id,
            ids=self.ids,
            max_results=self.max_results,
            name_regex=self.name_regex,
            names=self.names,
            next_token=self.next_token,
            output_file=self.output_file,
            payment_types=self.payment_types,
            resource_group_id=self.resource_group_id,
            tags=self.tags,
            total_count=self.total_count)


def get_clusters(cluster_name: Optional[str] = None,
                 cluster_states: Optional[Sequence[str]] = None,
                 cluster_types: Optional[Sequence[str]] = None,
                 ids: Optional[Sequence[str]] = None,
                 max_results: Optional[int] = None,
                 name_regex: Optional[str] = None,
                 next_token: Optional[str] = None,
                 output_file: Optional[str] = None,
                 payment_types: Optional[Sequence[str]] = None,
                 resource_group_id: Optional[str] = None,
                 tags: Optional[Mapping[str, Any]] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClustersResult:
    """
    This data source provides the Emr Clusters of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.199.0+.


    :param str cluster_name: The name of the emr cluster.
    :param Sequence[str] cluster_states: The cluster states.
    :param Sequence[str] cluster_types: The cluster types.
    :param Sequence[str] ids: A list of Cluster IDS.
    :param int max_results: The max results is used to list clusters for next page.
    :param str name_regex: A regex string to filter results by Cluster name.
    :param str next_token: The next token is used to list clusters for next page.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Sequence[str] payment_types: The cluster payment types.
    :param str resource_group_id: The resource group id of the resource.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['clusterStates'] = cluster_states
    __args__['clusterTypes'] = cluster_types
    __args__['ids'] = ids
    __args__['maxResults'] = max_results
    __args__['nameRegex'] = name_regex
    __args__['nextToken'] = next_token
    __args__['outputFile'] = output_file
    __args__['paymentTypes'] = payment_types
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:emrv2/getClusters:getClusters', __args__, opts=opts, typ=GetClustersResult).value

    return AwaitableGetClustersResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        cluster_states=pulumi.get(__ret__, 'cluster_states'),
        cluster_types=pulumi.get(__ret__, 'cluster_types'),
        clusters=pulumi.get(__ret__, 'clusters'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        max_results=pulumi.get(__ret__, 'max_results'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        next_token=pulumi.get(__ret__, 'next_token'),
        output_file=pulumi.get(__ret__, 'output_file'),
        payment_types=pulumi.get(__ret__, 'payment_types'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        tags=pulumi.get(__ret__, 'tags'),
        total_count=pulumi.get(__ret__, 'total_count'))


@_utilities.lift_output_func(get_clusters)
def get_clusters_output(cluster_name: Optional[pulumi.Input[Optional[str]]] = None,
                        cluster_states: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        cluster_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        max_results: Optional[pulumi.Input[Optional[int]]] = None,
                        name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                        next_token: Optional[pulumi.Input[Optional[str]]] = None,
                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                        payment_types: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                        tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClustersResult]:
    """
    This data source provides the Emr Clusters of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.199.0+.


    :param str cluster_name: The name of the emr cluster.
    :param Sequence[str] cluster_states: The cluster states.
    :param Sequence[str] cluster_types: The cluster types.
    :param Sequence[str] ids: A list of Cluster IDS.
    :param int max_results: The max results is used to list clusters for next page.
    :param str name_regex: A regex string to filter results by Cluster name.
    :param str next_token: The next token is used to list clusters for next page.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param Sequence[str] payment_types: The cluster payment types.
    :param str resource_group_id: The resource group id of the resource.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    ...
