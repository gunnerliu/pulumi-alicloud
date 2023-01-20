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
    'GetDBClusterLakeVersionsResult',
    'AwaitableGetDBClusterLakeVersionsResult',
    'get_db_cluster_lake_versions',
    'get_db_cluster_lake_versions_output',
]

@pulumi.output_type
class GetDBClusterLakeVersionsResult:
    """
    A collection of values returned by getDBClusterLakeVersions.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, output_file=None, page_number=None, page_size=None, resource_group_id=None, status=None, versions=None):
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
        if versions and not isinstance(versions, list):
            raise TypeError("Expected argument 'versions' to be a list")
        pulumi.set(__self__, "versions", versions)

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
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def versions(self) -> Sequence['outputs.GetDBClusterLakeVersionsVersionResult']:
        return pulumi.get(self, "versions")


class AwaitableGetDBClusterLakeVersionsResult(GetDBClusterLakeVersionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDBClusterLakeVersionsResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            resource_group_id=self.resource_group_id,
            status=self.status,
            versions=self.versions)


def get_db_cluster_lake_versions(enable_details: Optional[bool] = None,
                                 ids: Optional[Sequence[str]] = None,
                                 output_file: Optional[str] = None,
                                 page_number: Optional[int] = None,
                                 page_size: Optional[int] = None,
                                 resource_group_id: Optional[str] = None,
                                 status: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDBClusterLakeVersionsResult:
    """
    This data source provides the Adb DBCluster Lake Versions of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.190.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.adb.get_db_cluster_lake_versions(ids=["example_id"])
    pulumi.export("adbDbClusterLakeVersionId1", ids.versions[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of DBCluster IDs.
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the resource.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:adb/getDBClusterLakeVersions:getDBClusterLakeVersions', __args__, opts=opts, typ=GetDBClusterLakeVersionsResult).value

    return AwaitableGetDBClusterLakeVersionsResult(
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        page_number=__ret__.page_number,
        page_size=__ret__.page_size,
        resource_group_id=__ret__.resource_group_id,
        status=__ret__.status,
        versions=__ret__.versions)


@_utilities.lift_output_func(get_db_cluster_lake_versions)
def get_db_cluster_lake_versions_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                                        ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                        page_number: Optional[pulumi.Input[Optional[int]]] = None,
                                        page_size: Optional[pulumi.Input[Optional[int]]] = None,
                                        resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        status: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDBClusterLakeVersionsResult]:
    """
    This data source provides the Adb DBCluster Lake Versions of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.190.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.adb.get_db_cluster_lake_versions(ids=["example_id"])
    pulumi.export("adbDbClusterLakeVersionId1", ids.versions[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of DBCluster IDs.
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the resource.
    """
    ...
