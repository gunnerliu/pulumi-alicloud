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
    'GetHostEcsLevelInfosResult',
    'AwaitableGetHostEcsLevelInfosResult',
    'get_host_ecs_level_infos',
    'get_host_ecs_level_infos_output',
]

@pulumi.output_type
class GetHostEcsLevelInfosResult:
    """
    A collection of values returned by getHostEcsLevelInfos.
    """
    def __init__(__self__, db_type=None, id=None, image_category=None, infos=None, output_file=None, storage_type=None, zone_id=None):
        if db_type and not isinstance(db_type, str):
            raise TypeError("Expected argument 'db_type' to be a str")
        pulumi.set(__self__, "db_type", db_type)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if image_category and not isinstance(image_category, str):
            raise TypeError("Expected argument 'image_category' to be a str")
        pulumi.set(__self__, "image_category", image_category)
        if infos and not isinstance(infos, list):
            raise TypeError("Expected argument 'infos' to be a list")
        pulumi.set(__self__, "infos", infos)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        pulumi.set(__self__, "storage_type", storage_type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="dbType")
    def db_type(self) -> str:
        return pulumi.get(self, "db_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="imageCategory")
    def image_category(self) -> Optional[str]:
        return pulumi.get(self, "image_category")

    @property
    @pulumi.getter
    def infos(self) -> Sequence['outputs.GetHostEcsLevelInfosInfoResult']:
        return pulumi.get(self, "infos")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        return pulumi.get(self, "storage_type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        return pulumi.get(self, "zone_id")


class AwaitableGetHostEcsLevelInfosResult(GetHostEcsLevelInfosResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHostEcsLevelInfosResult(
            db_type=self.db_type,
            id=self.id,
            image_category=self.image_category,
            infos=self.infos,
            output_file=self.output_file,
            storage_type=self.storage_type,
            zone_id=self.zone_id)


def get_host_ecs_level_infos(db_type: Optional[str] = None,
                             image_category: Optional[str] = None,
                             output_file: Optional[str] = None,
                             storage_type: Optional[str] = None,
                             zone_id: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHostEcsLevelInfosResult:
    """
    This data source provides the Cddc Host Ecs Level Infos of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.


    :param str db_type: The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
    :param str image_category: Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
    :param str storage_type: The storage type of the host ecs level info. Valid values: `local_ssd`, `cloud_essd`, `cloud_essd2`, `cloud_essd3`. 
           * `local_ssd`: specifies that the host uses local SSDs.
           * `cloud_essd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
           * `cloud_essd2`: specifies that the host uses ESSDs of PL2.
           * `cloud_essd3`: specifies that the host uses ESSDs of PL3.
    :param str zone_id: The ID of the zone in the region.
    """
    __args__ = dict()
    __args__['dbType'] = db_type
    __args__['imageCategory'] = image_category
    __args__['outputFile'] = output_file
    __args__['storageType'] = storage_type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cddc/getHostEcsLevelInfos:getHostEcsLevelInfos', __args__, opts=opts, typ=GetHostEcsLevelInfosResult).value

    return AwaitableGetHostEcsLevelInfosResult(
        db_type=__ret__.db_type,
        id=__ret__.id,
        image_category=__ret__.image_category,
        infos=__ret__.infos,
        output_file=__ret__.output_file,
        storage_type=__ret__.storage_type,
        zone_id=__ret__.zone_id)


@_utilities.lift_output_func(get_host_ecs_level_infos)
def get_host_ecs_level_infos_output(db_type: Optional[pulumi.Input[str]] = None,
                                    image_category: Optional[pulumi.Input[Optional[str]]] = None,
                                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                    storage_type: Optional[pulumi.Input[str]] = None,
                                    zone_id: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHostEcsLevelInfosResult]:
    """
    This data source provides the Cddc Host Ecs Level Infos of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.


    :param str db_type: The database engine of the host. Valid values: `mysql`, `mssql`, `pgsql`, `redis`.
    :param str image_category: Host image. Valid values: `WindowsWithMssqlEntAlwaysonLicense`, `WindowsWithMssqlStdLicense`, `WindowsWithMssqlEntLicense`, `WindowsWithMssqlWebLicense`, `AliLinux`.
    :param str storage_type: The storage type of the host ecs level info. Valid values: `local_ssd`, `cloud_essd`, `cloud_essd2`, `cloud_essd3`. 
           * `local_ssd`: specifies that the host uses local SSDs.
           * `cloud_essd`: specifies that the host uses enhanced SSDs (ESSDs) of performance level (PL) 1.
           * `cloud_essd2`: specifies that the host uses ESSDs of PL2.
           * `cloud_essd3`: specifies that the host uses ESSDs of PL3.
    :param str zone_id: The ID of the zone in the region.
    """
    ...
