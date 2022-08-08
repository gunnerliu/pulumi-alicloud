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
    'GetGatewayBlockVolumesResult',
    'AwaitableGetGatewayBlockVolumesResult',
    'get_gateway_block_volumes',
    'get_gateway_block_volumes_output',
]

@pulumi.output_type
class GetGatewayBlockVolumesResult:
    """
    A collection of values returned by getGatewayBlockVolumes.
    """
    def __init__(__self__, gateway_id=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, volumes=None):
        if gateway_id and not isinstance(gateway_id, str):
            raise TypeError("Expected argument 'gateway_id' to be a str")
        pulumi.set(__self__, "gateway_id", gateway_id)
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
        if status and not isinstance(status, int):
            raise TypeError("Expected argument 'status' to be a int")
        pulumi.set(__self__, "status", status)
        if volumes and not isinstance(volumes, list):
            raise TypeError("Expected argument 'volumes' to be a list")
        pulumi.set(__self__, "volumes", volumes)

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> str:
        return pulumi.get(self, "gateway_id")

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
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[int]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def volumes(self) -> Sequence['outputs.GetGatewayBlockVolumesVolumeResult']:
        return pulumi.get(self, "volumes")


class AwaitableGetGatewayBlockVolumesResult(GetGatewayBlockVolumesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewayBlockVolumesResult(
            gateway_id=self.gateway_id,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            volumes=self.volumes)


def get_gateway_block_volumes(gateway_id: Optional[str] = None,
                              ids: Optional[Sequence[str]] = None,
                              name_regex: Optional[str] = None,
                              output_file: Optional[str] = None,
                              status: Optional[int] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewayBlockVolumesResult:
    """
    This data source provides the Cloud Storage Gateway Gateway Block Volumes of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.144.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cloudstoragegateway.get_gateway_block_volumes(gateway_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cloudStorageGatewayGatewayBlockVolumeId1", ids.volumes[0].id)
    name_regex = alicloud.cloudstoragegateway.get_gateway_block_volumes(gateway_id="example_value",
        name_regex="^my-GatewayBlockVolume")
    pulumi.export("cloudStorageGatewayGatewayBlockVolumeId2", name_regex.volumes[0].id)
    ```


    :param str gateway_id: The Gateway ID.
    :param Sequence[str] ids: A list of Gateway Block Volume IDs.
    :param str name_regex: A regex string to filter results by Gateway Block Volume name.
    :param int status: The status of volume.
    """
    __args__ = dict()
    __args__['gatewayId'] = gateway_id
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cloudstoragegateway/getGatewayBlockVolumes:getGatewayBlockVolumes', __args__, opts=opts, typ=GetGatewayBlockVolumesResult).value

    return AwaitableGetGatewayBlockVolumesResult(
        gateway_id=__ret__.gateway_id,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        status=__ret__.status,
        volumes=__ret__.volumes)


@_utilities.lift_output_func(get_gateway_block_volumes)
def get_gateway_block_volumes_output(gateway_id: Optional[pulumi.Input[str]] = None,
                                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     status: Optional[pulumi.Input[Optional[int]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGatewayBlockVolumesResult]:
    """
    This data source provides the Cloud Storage Gateway Gateway Block Volumes of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.144.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cloudstoragegateway.get_gateway_block_volumes(gateway_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("cloudStorageGatewayGatewayBlockVolumeId1", ids.volumes[0].id)
    name_regex = alicloud.cloudstoragegateway.get_gateway_block_volumes(gateway_id="example_value",
        name_regex="^my-GatewayBlockVolume")
    pulumi.export("cloudStorageGatewayGatewayBlockVolumeId2", name_regex.volumes[0].id)
    ```


    :param str gateway_id: The Gateway ID.
    :param Sequence[str] ids: A list of Gateway Block Volume IDs.
    :param str name_regex: A regex string to filter results by Gateway Block Volume name.
    :param int status: The status of volume.
    """
    ...
