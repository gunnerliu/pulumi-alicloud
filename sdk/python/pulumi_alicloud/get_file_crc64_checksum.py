# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables

__all__ = [
    'GetFileCrc64ChecksumResult',
    'AwaitableGetFileCrc64ChecksumResult',
    'get_file_crc64_checksum',
]

@pulumi.output_type
class GetFileCrc64ChecksumResult:
    """
    A collection of values returned by getFileCrc64Checksum.
    """
    def __init__(__self__, checksum=None, filename=None, id=None, output_file=None):
        if checksum and not isinstance(checksum, str):
            raise TypeError("Expected argument 'checksum' to be a str")
        pulumi.set(__self__, "checksum", checksum)
        if filename and not isinstance(filename, str):
            raise TypeError("Expected argument 'filename' to be a str")
        pulumi.set(__self__, "filename", filename)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def checksum(self) -> str:
        """
        the file checksum of crc64.
        """
        return pulumi.get(self, "checksum")

    @property
    @pulumi.getter
    def filename(self) -> str:
        return pulumi.get(self, "filename")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetFileCrc64ChecksumResult(GetFileCrc64ChecksumResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFileCrc64ChecksumResult(
            checksum=self.checksum,
            filename=self.filename,
            id=self.id,
            output_file=self.output_file)


def get_file_crc64_checksum(filename: Optional[str] = None,
                            output_file: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFileCrc64ChecksumResult:
    """
    This data source compute file crc64 checksum.

    > **NOTE:** Available in 1.59.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.get_file_crc64_checksum(filename="exampleFileName")
    pulumi.export("fileCrc64Checksum", data["alicloud_file_crc64_checksum"]["defualt"]["checksum"])
    ```


    :param str filename: The name of the file to be computed crc64 checksum.
    """
    __args__ = dict()
    __args__['filename'] = filename
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:index/getFileCrc64Checksum:getFileCrc64Checksum', __args__, opts=opts, typ=GetFileCrc64ChecksumResult).value

    return AwaitableGetFileCrc64ChecksumResult(
        checksum=__ret__.checksum,
        filename=__ret__.filename,
        id=__ret__.id,
        output_file=__ret__.output_file)
