# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetFileSystemsResult',
    'AwaitableGetFileSystemsResult',
    'get_file_systems',
]

@pulumi.output_type
class GetFileSystemsResult:
    """
    A collection of values returned by getFileSystems.
    """
    def __init__(__self__, description_regex=None, descriptions=None, id=None, ids=None, output_file=None, protocol_type=None, storage_type=None, systems=None):
        if description_regex and not isinstance(description_regex, str):
            raise TypeError("Expected argument 'description_regex' to be a str")
        pulumi.set(__self__, "description_regex", description_regex)
        if descriptions and not isinstance(descriptions, list):
            raise TypeError("Expected argument 'descriptions' to be a list")
        pulumi.set(__self__, "descriptions", descriptions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if protocol_type and not isinstance(protocol_type, str):
            raise TypeError("Expected argument 'protocol_type' to be a str")
        pulumi.set(__self__, "protocol_type", protocol_type)
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        pulumi.set(__self__, "storage_type", storage_type)
        if systems and not isinstance(systems, list):
            raise TypeError("Expected argument 'systems' to be a list")
        pulumi.set(__self__, "systems", systems)

    @property
    @pulumi.getter(name="descriptionRegex")
    def description_regex(self) -> Optional[str]:
        return pulumi.get(self, "description_regex")

    @property
    @pulumi.getter
    def descriptions(self) -> List[str]:
        """
        A list of FileSystem descriptions.
        """
        return pulumi.get(self, "descriptions")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> List[str]:
        """
        A list of FileSystem Id.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> Optional[str]:
        """
        ProtocolType block of the FileSystem
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> Optional[str]:
        """
        StorageType block of the FileSystem.
        """
        return pulumi.get(self, "storage_type")

    @property
    @pulumi.getter
    def systems(self) -> List['outputs.GetFileSystemsSystemResult']:
        """
        A list of VPCs. Each element contains the following attributes:
        """
        return pulumi.get(self, "systems")


class AwaitableGetFileSystemsResult(GetFileSystemsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFileSystemsResult(
            description_regex=self.description_regex,
            descriptions=self.descriptions,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            protocol_type=self.protocol_type,
            storage_type=self.storage_type,
            systems=self.systems)


def get_file_systems(description_regex: Optional[str] = None,
                     ids: Optional[List[str]] = None,
                     output_file: Optional[str] = None,
                     protocol_type: Optional[str] = None,
                     storage_type: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFileSystemsResult:
    """
    This data source provides FileSystems available to the user.

    > NOTE: Available in 1.35.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    fs = alicloud.nas.get_file_systems(description=alicloud_nas_file_system["foo"]["description"],
        protocol_type="NFS")
    pulumi.export("alicloudNasFileSystemsId", fs.systems[0].id)
    ```


    :param str description_regex: A regex string to filter the results by the ：FileSystem description.
    :param List[str] ids: A list of FileSystemId.
    :param str protocol_type: Filter results by a specific ProtocolType.
    :param str storage_type: Filter results by a specific StorageType.
    """
    __args__ = dict()
    __args__['descriptionRegex'] = description_regex
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['protocolType'] = protocol_type
    __args__['storageType'] = storage_type
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:nas/getFileSystems:getFileSystems', __args__, opts=opts, typ=GetFileSystemsResult).value

    return AwaitableGetFileSystemsResult(
        description_regex=__ret__.description_regex,
        descriptions=__ret__.descriptions,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        protocol_type=__ret__.protocol_type,
        storage_type=__ret__.storage_type,
        systems=__ret__.systems)
