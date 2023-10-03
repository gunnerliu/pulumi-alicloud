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
    'GetFilesetsResult',
    'AwaitableGetFilesetsResult',
    'get_filesets',
    'get_filesets_output',
]

@pulumi.output_type
class GetFilesetsResult:
    """
    A collection of values returned by getFilesets.
    """
    def __init__(__self__, file_system_id=None, filesets=None, id=None, ids=None, output_file=None, status=None):
        if file_system_id and not isinstance(file_system_id, str):
            raise TypeError("Expected argument 'file_system_id' to be a str")
        pulumi.set(__self__, "file_system_id", file_system_id)
        if filesets and not isinstance(filesets, list):
            raise TypeError("Expected argument 'filesets' to be a list")
        pulumi.set(__self__, "filesets", filesets)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter
    def filesets(self) -> Sequence['outputs.GetFilesetsFilesetResult']:
        return pulumi.get(self, "filesets")

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
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetFilesetsResult(GetFilesetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFilesetsResult(
            file_system_id=self.file_system_id,
            filesets=self.filesets,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            status=self.status)


def get_filesets(file_system_id: Optional[str] = None,
                 ids: Optional[Sequence[str]] = None,
                 output_file: Optional[str] = None,
                 status: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFilesetsResult:
    """
    This data source provides the Nas Filesets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.153.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.nas.get_filesets(file_system_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("nasFilesetId1", ids.filesets[0].id)
    ```


    :param str file_system_id: The ID of the file system.
    :param Sequence[str] ids: A list of Fileset IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the fileset.
    """
    __args__ = dict()
    __args__['fileSystemId'] = file_system_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:nas/getFilesets:getFilesets', __args__, opts=opts, typ=GetFilesetsResult).value

    return AwaitableGetFilesetsResult(
        file_system_id=pulumi.get(__ret__, 'file_system_id'),
        filesets=pulumi.get(__ret__, 'filesets'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_filesets)
def get_filesets_output(file_system_id: Optional[pulumi.Input[str]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                        status: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFilesetsResult]:
    """
    This data source provides the Nas Filesets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.153.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.nas.get_filesets(file_system_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("nasFilesetId1", ids.filesets[0].id)
    ```


    :param str file_system_id: The ID of the file system.
    :param Sequence[str] ids: A list of Fileset IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the fileset.
    """
    ...
