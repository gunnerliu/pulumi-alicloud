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
    'GetDBClustersResult',
    'AwaitableGetDBClustersResult',
    'get_db_clusters',
    'get_db_clusters_output',
]

@pulumi.output_type
class GetDBClustersResult:
    """
    A collection of values returned by getDBClusters.
    """
    def __init__(__self__, clusters=None, description=None, description_regex=None, descriptions=None, enable_details=None, id=None, ids=None, output_file=None, page_number=None, page_size=None, resource_group_id=None, status=None, tags=None, total_count=None):
        if clusters and not isinstance(clusters, list):
            raise TypeError("Expected argument 'clusters' to be a list")
        pulumi.set(__self__, "clusters", clusters)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if description_regex and not isinstance(description_regex, str):
            raise TypeError("Expected argument 'description_regex' to be a str")
        pulumi.set(__self__, "description_regex", description_regex)
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if total_count and not isinstance(total_count, int):
            raise TypeError("Expected argument 'total_count' to be a int")
        pulumi.set(__self__, "total_count", total_count)

    @property
    @pulumi.getter
    def clusters(self) -> Sequence['outputs.GetDBClustersClusterResult']:
        """
        A list of Adb Db Clusters. Each element contains the following attributes:
        """
        return pulumi.get(self, "clusters")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of DBCluster.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="descriptionRegex")
    def description_regex(self) -> Optional[str]:
        return pulumi.get(self, "description_regex")

    @property
    @pulumi.getter
    def descriptions(self) -> Sequence[str]:
        """
        A list of DBCluster descriptions.
        """
        return pulumi.get(self, "descriptions")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        """
        The tags of the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="totalCount")
    def total_count(self) -> int:
        return pulumi.get(self, "total_count")


class AwaitableGetDBClustersResult(GetDBClustersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDBClustersResult(
            clusters=self.clusters,
            description=self.description,
            description_regex=self.description_regex,
            descriptions=self.descriptions,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            resource_group_id=self.resource_group_id,
            status=self.status,
            tags=self.tags,
            total_count=self.total_count)


def get_db_clusters(description: Optional[str] = None,
                    description_regex: Optional[str] = None,
                    enable_details: Optional[bool] = None,
                    ids: Optional[Sequence[str]] = None,
                    output_file: Optional[str] = None,
                    page_number: Optional[int] = None,
                    page_size: Optional[int] = None,
                    resource_group_id: Optional[str] = None,
                    status: Optional[str] = None,
                    tags: Optional[Mapping[str, Any]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDBClustersResult:
    """
    This data source provides the Adb DBClusters of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.121.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.adb.get_db_clusters(description_regex="example")
    pulumi.export("firstAdbDbClusterId", example.clusters[0].id)
    ```


    :param str description: The description of DBCluster.
    :param str description_regex: A regex string to filter results by DBCluster description.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of DBCluster IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the resource.
    :param Mapping[str, Any] tags: A map of tags assigned to the cluster.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['descriptionRegex'] = description_regex
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:adb/getDBClusters:getDBClusters', __args__, opts=opts, typ=GetDBClustersResult).value

    return AwaitableGetDBClustersResult(
        clusters=pulumi.get(__ret__, 'clusters'),
        description=pulumi.get(__ret__, 'description'),
        description_regex=pulumi.get(__ret__, 'description_regex'),
        descriptions=pulumi.get(__ret__, 'descriptions'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        status=pulumi.get(__ret__, 'status'),
        tags=pulumi.get(__ret__, 'tags'),
        total_count=pulumi.get(__ret__, 'total_count'))


@_utilities.lift_output_func(get_db_clusters)
def get_db_clusters_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                           description_regex: Optional[pulumi.Input[Optional[str]]] = None,
                           enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                           ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           page_number: Optional[pulumi.Input[Optional[int]]] = None,
                           page_size: Optional[pulumi.Input[Optional[int]]] = None,
                           resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                           status: Optional[pulumi.Input[Optional[str]]] = None,
                           tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDBClustersResult]:
    """
    This data source provides the Adb DBClusters of the current Alibaba Cloud user.

    > **NOTE:** Available since v1.121.0.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.adb.get_db_clusters(description_regex="example")
    pulumi.export("firstAdbDbClusterId", example.clusters[0].id)
    ```


    :param str description: The description of DBCluster.
    :param str description_regex: A regex string to filter results by DBCluster description.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of DBCluster IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the resource.
    :param Mapping[str, Any] tags: A map of tags assigned to the cluster.
    """
    ...
