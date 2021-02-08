# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetInstanceTypesResult',
    'AwaitableGetInstanceTypesResult',
    'get_instance_types',
]

@pulumi.output_type
class GetInstanceTypesResult:
    """
    A collection of values returned by getInstanceTypes.
    """
    def __init__(__self__, charge_type=None, core_instance_types=None, disk_type=None, engine=None, id=None, ids=None, instance_type=None, master_instance_types=None, output_file=None, region_id=None, types=None, version=None, zone_id=None):
        if charge_type and not isinstance(charge_type, str):
            raise TypeError("Expected argument 'charge_type' to be a str")
        pulumi.set(__self__, "charge_type", charge_type)
        if core_instance_types and not isinstance(core_instance_types, list):
            raise TypeError("Expected argument 'core_instance_types' to be a list")
        pulumi.set(__self__, "core_instance_types", core_instance_types)
        if disk_type and not isinstance(disk_type, str):
            raise TypeError("Expected argument 'disk_type' to be a str")
        pulumi.set(__self__, "disk_type", disk_type)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_type and not isinstance(instance_type, str):
            raise TypeError("Expected argument 'instance_type' to be a str")
        pulumi.set(__self__, "instance_type", instance_type)
        if master_instance_types and not isinstance(master_instance_types, list):
            raise TypeError("Expected argument 'master_instance_types' to be a list")
        pulumi.set(__self__, "master_instance_types", master_instance_types)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if region_id and not isinstance(region_id, str):
            raise TypeError("Expected argument 'region_id' to be a str")
        pulumi.set(__self__, "region_id", region_id)
        if types and not isinstance(types, list):
            raise TypeError("Expected argument 'types' to be a list")
        pulumi.set(__self__, "types", types)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="chargeType")
    def charge_type(self) -> Optional[str]:
        return pulumi.get(self, "charge_type")

    @property
    @pulumi.getter(name="coreInstanceTypes")
    def core_instance_types(self) -> Sequence['outputs.GetInstanceTypesCoreInstanceTypeResult']:
        """
        (Available in 1.115.0+) A list of core instance types. Each element contains the following attributes:
        """
        return pulumi.get(self, "core_instance_types")

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> Optional[str]:
        return pulumi.get(self, "disk_type")

    @property
    @pulumi.getter
    def engine(self) -> Optional[str]:
        """
        Name of the engine.
        """
        return pulumi.get(self, "engine")

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
        A list of instance types type IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[str]:
        """
        Name of the instance type.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="masterInstanceTypes")
    def master_instance_types(self) -> Sequence['outputs.GetInstanceTypesMasterInstanceTypeResult']:
        """
        (Available in 1.115.0+) A list of master instance types. Each element contains the following attributes:
        """
        return pulumi.get(self, "master_instance_types")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[str]:
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def types(self) -> Sequence['outputs.GetInstanceTypesTypeResult']:
        """
        (Deprecated) A list of instance types. Each element contains the following attributes:
        """
        return pulumi.get(self, "types")

    @property
    @pulumi.getter
    def version(self) -> Optional[str]:
        """
        The version of the engine.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetInstanceTypesResult(GetInstanceTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceTypesResult(
            charge_type=self.charge_type,
            core_instance_types=self.core_instance_types,
            disk_type=self.disk_type,
            engine=self.engine,
            id=self.id,
            ids=self.ids,
            instance_type=self.instance_type,
            master_instance_types=self.master_instance_types,
            output_file=self.output_file,
            region_id=self.region_id,
            types=self.types,
            version=self.version,
            zone_id=self.zone_id)


def get_instance_types(charge_type: Optional[str] = None,
                       disk_type: Optional[str] = None,
                       engine: Optional[str] = None,
                       instance_type: Optional[str] = None,
                       output_file: Optional[str] = None,
                       region_id: Optional[str] = None,
                       version: Optional[str] = None,
                       zone_id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceTypesResult:
    """
    This data source provides availability instance_types for HBase that can be accessed by an Alibaba Cloud account within the region configured in the provider.

    > **NOTE:** Available in v1.106.0+.


    :param str charge_type: The charge type of create hbase cluster instance, `PrePaid` or `PostPaid`.
    :param str disk_type: The disk type, `cloud_ssd`, `cloud_essd_pl1`, `cloud_efficiency`, `local_hdd_pro`, `local_ssd_pro`.
    :param str engine: The engine name, `singlehbase`, `hbase`, `hbaseue`, `bds`.
    :param str instance_type: The hbase instance type of create hbase cluster instance.
    :param str region_id: The dest region id, default client region.
    :param str version: The engine version, singlehbase/hbase=1.1/2.0, bds=1.0.
    :param str zone_id: The zone id, belong to regionId.
    """
    __args__ = dict()
    __args__['chargeType'] = charge_type
    __args__['diskType'] = disk_type
    __args__['engine'] = engine
    __args__['instanceType'] = instance_type
    __args__['outputFile'] = output_file
    __args__['regionId'] = region_id
    __args__['version'] = version
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:hbase/getInstanceTypes:getInstanceTypes', __args__, opts=opts, typ=GetInstanceTypesResult).value

    return AwaitableGetInstanceTypesResult(
        charge_type=__ret__.charge_type,
        core_instance_types=__ret__.core_instance_types,
        disk_type=__ret__.disk_type,
        engine=__ret__.engine,
        id=__ret__.id,
        ids=__ret__.ids,
        instance_type=__ret__.instance_type,
        master_instance_types=__ret__.master_instance_types,
        output_file=__ret__.output_file,
        region_id=__ret__.region_id,
        types=__ret__.types,
        version=__ret__.version,
        zone_id=__ret__.zone_id)
