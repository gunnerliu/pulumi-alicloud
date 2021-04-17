# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ClusterBootstrapAction',
    'ClusterHostGroup',
    'GetDiskTypesTypeResult',
    'GetInstanceTypesTypeResult',
    'GetMainVersionsMainVersionResult',
]

@pulumi.output_type
class ClusterBootstrapAction(dict):
    def __init__(__self__, *,
                 arg: Optional[str] = None,
                 name: Optional[str] = None,
                 path: Optional[str] = None):
        """
        :param str arg: bootstrap action args, e.g. "--a=b".
        :param str name: bootstrap action name.
        :param str path: bootstrap action path, e.g. "oss://bucket/path".
        """
        if arg is not None:
            pulumi.set(__self__, "arg", arg)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if path is not None:
            pulumi.set(__self__, "path", path)

    @property
    @pulumi.getter
    def arg(self) -> Optional[str]:
        """
        bootstrap action args, e.g. "--a=b".
        """
        return pulumi.get(self, "arg")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        bootstrap action name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def path(self) -> Optional[str]:
        """
        bootstrap action path, e.g. "oss://bucket/path".
        """
        return pulumi.get(self, "path")


@pulumi.output_type
class ClusterHostGroup(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "autoRenew":
            suggest = "auto_renew"
        elif key == "chargeType":
            suggest = "charge_type"
        elif key == "diskCapacity":
            suggest = "disk_capacity"
        elif key == "diskCount":
            suggest = "disk_count"
        elif key == "diskType":
            suggest = "disk_type"
        elif key == "gpuDriver":
            suggest = "gpu_driver"
        elif key == "hostGroupName":
            suggest = "host_group_name"
        elif key == "hostGroupType":
            suggest = "host_group_type"
        elif key == "instanceList":
            suggest = "instance_list"
        elif key == "instanceType":
            suggest = "instance_type"
        elif key == "nodeCount":
            suggest = "node_count"
        elif key == "sysDiskCapacity":
            suggest = "sys_disk_capacity"
        elif key == "sysDiskType":
            suggest = "sys_disk_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ClusterHostGroup. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ClusterHostGroup.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ClusterHostGroup.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 auto_renew: Optional[bool] = None,
                 charge_type: Optional[str] = None,
                 disk_capacity: Optional[str] = None,
                 disk_count: Optional[str] = None,
                 disk_type: Optional[str] = None,
                 gpu_driver: Optional[str] = None,
                 host_group_name: Optional[str] = None,
                 host_group_type: Optional[str] = None,
                 instance_list: Optional[str] = None,
                 instance_type: Optional[str] = None,
                 node_count: Optional[str] = None,
                 period: Optional[int] = None,
                 sys_disk_capacity: Optional[str] = None,
                 sys_disk_type: Optional[str] = None):
        """
        :param bool auto_renew: Auto renew for prepaid, true of false. Default is false.
        :param str charge_type: Charge Type for this group of hosts: PostPaid or PrePaid. If this is not specified, charge type will follow global charge_type value.
        :param str disk_capacity: Data disk capacity.
        :param str disk_count: Data disk count.
        :param str disk_type: Data disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,local_disk,cloud_essd.
        :param str host_group_name: host group name.
        :param str host_group_type: host group type, supported value: MASTER, CORE or TASK, supported 'GATEWAY' available in 1.61.0+.
        :param str instance_list: Instance list for cluster scale down. This value follows the json format, e.g. ["instance_id1","instance_id2"]. escape character for " is \".
        :param str instance_type: Host Ecs instance type.
        :param str node_count: Host number in this group.
        :param int period: If charge type is PrePaid, this should be specified, unit is month. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36.
        :param str sys_disk_capacity: System disk capacity.
        :param str sys_disk_type: System disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,cloud_essd.
        """
        if auto_renew is not None:
            pulumi.set(__self__, "auto_renew", auto_renew)
        if charge_type is not None:
            pulumi.set(__self__, "charge_type", charge_type)
        if disk_capacity is not None:
            pulumi.set(__self__, "disk_capacity", disk_capacity)
        if disk_count is not None:
            pulumi.set(__self__, "disk_count", disk_count)
        if disk_type is not None:
            pulumi.set(__self__, "disk_type", disk_type)
        if gpu_driver is not None:
            pulumi.set(__self__, "gpu_driver", gpu_driver)
        if host_group_name is not None:
            pulumi.set(__self__, "host_group_name", host_group_name)
        if host_group_type is not None:
            pulumi.set(__self__, "host_group_type", host_group_type)
        if instance_list is not None:
            pulumi.set(__self__, "instance_list", instance_list)
        if instance_type is not None:
            pulumi.set(__self__, "instance_type", instance_type)
        if node_count is not None:
            pulumi.set(__self__, "node_count", node_count)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if sys_disk_capacity is not None:
            pulumi.set(__self__, "sys_disk_capacity", sys_disk_capacity)
        if sys_disk_type is not None:
            pulumi.set(__self__, "sys_disk_type", sys_disk_type)

    @property
    @pulumi.getter(name="autoRenew")
    def auto_renew(self) -> Optional[bool]:
        """
        Auto renew for prepaid, true of false. Default is false.
        """
        return pulumi.get(self, "auto_renew")

    @property
    @pulumi.getter(name="chargeType")
    def charge_type(self) -> Optional[str]:
        """
        Charge Type for this group of hosts: PostPaid or PrePaid. If this is not specified, charge type will follow global charge_type value.
        """
        return pulumi.get(self, "charge_type")

    @property
    @pulumi.getter(name="diskCapacity")
    def disk_capacity(self) -> Optional[str]:
        """
        Data disk capacity.
        """
        return pulumi.get(self, "disk_capacity")

    @property
    @pulumi.getter(name="diskCount")
    def disk_count(self) -> Optional[str]:
        """
        Data disk count.
        """
        return pulumi.get(self, "disk_count")

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> Optional[str]:
        """
        Data disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,local_disk,cloud_essd.
        """
        return pulumi.get(self, "disk_type")

    @property
    @pulumi.getter(name="gpuDriver")
    def gpu_driver(self) -> Optional[str]:
        return pulumi.get(self, "gpu_driver")

    @property
    @pulumi.getter(name="hostGroupName")
    def host_group_name(self) -> Optional[str]:
        """
        host group name.
        """
        return pulumi.get(self, "host_group_name")

    @property
    @pulumi.getter(name="hostGroupType")
    def host_group_type(self) -> Optional[str]:
        """
        host group type, supported value: MASTER, CORE or TASK, supported 'GATEWAY' available in 1.61.0+.
        """
        return pulumi.get(self, "host_group_type")

    @property
    @pulumi.getter(name="instanceList")
    def instance_list(self) -> Optional[str]:
        """
        Instance list for cluster scale down. This value follows the json format, e.g. ["instance_id1","instance_id2"]. escape character for " is \".
        """
        return pulumi.get(self, "instance_list")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> Optional[str]:
        """
        Host Ecs instance type.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="nodeCount")
    def node_count(self) -> Optional[str]:
        """
        Host number in this group.
        """
        return pulumi.get(self, "node_count")

    @property
    @pulumi.getter
    def period(self) -> Optional[int]:
        """
        If charge type is PrePaid, this should be specified, unit is month. Supported value: 1、2、3、4、5、6、7、8、9、12、24、36.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="sysDiskCapacity")
    def sys_disk_capacity(self) -> Optional[str]:
        """
        System disk capacity.
        """
        return pulumi.get(self, "sys_disk_capacity")

    @property
    @pulumi.getter(name="sysDiskType")
    def sys_disk_type(self) -> Optional[str]:
        """
        System disk type. Supported value: cloud,cloud_efficiency,cloud_ssd,cloud_essd.
        """
        return pulumi.get(self, "sys_disk_type")


@pulumi.output_type
class GetDiskTypesTypeResult(dict):
    def __init__(__self__, *,
                 max: int,
                 min: int,
                 value: str):
        """
        :param int max: The maximum value of the data disk to supported the specific instance type
        :param int min: The mininum value of the data disk to supported the specific instance type
        :param str value: The value of the data disk or system disk
        """
        pulumi.set(__self__, "max", max)
        pulumi.set(__self__, "min", min)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def max(self) -> int:
        """
        The maximum value of the data disk to supported the specific instance type
        """
        return pulumi.get(self, "max")

    @property
    @pulumi.getter
    def min(self) -> int:
        """
        The mininum value of the data disk to supported the specific instance type
        """
        return pulumi.get(self, "min")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        The value of the data disk or system disk
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetInstanceTypesTypeResult(dict):
    def __init__(__self__, *,
                 id: str,
                 local_storage_capacity: int,
                 zone_id: str):
        """
        :param str id: The ID of the instance type.
        :param int local_storage_capacity: Local capacity of the applied ecs instance for emr cluster. Unit: GB.
        :param str zone_id: The supported resources of specific zoneId.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "local_storage_capacity", local_storage_capacity)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the instance type.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="localStorageCapacity")
    def local_storage_capacity(self) -> int:
        """
        Local capacity of the applied ecs instance for emr cluster. Unit: GB.
        """
        return pulumi.get(self, "local_storage_capacity")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The supported resources of specific zoneId.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetMainVersionsMainVersionResult(dict):
    def __init__(__self__, *,
                 cluster_types: Sequence[str],
                 emr_version: str,
                 image_id: str):
        """
        :param Sequence[str] cluster_types: A list of cluster types the emr cluster supported. Possible values: `HADOOP`, `ZOOKEEPER`, `KAFKA`, `DRUID`.
        :param str emr_version: The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
        :param str image_id: The image id of the emr cluster instance.
        """
        pulumi.set(__self__, "cluster_types", cluster_types)
        pulumi.set(__self__, "emr_version", emr_version)
        pulumi.set(__self__, "image_id", image_id)

    @property
    @pulumi.getter(name="clusterTypes")
    def cluster_types(self) -> Sequence[str]:
        """
        A list of cluster types the emr cluster supported. Possible values: `HADOOP`, `ZOOKEEPER`, `KAFKA`, `DRUID`.
        """
        return pulumi.get(self, "cluster_types")

    @property
    @pulumi.getter(name="emrVersion")
    def emr_version(self) -> str:
        """
        The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
        """
        return pulumi.get(self, "emr_version")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> str:
        """
        The image id of the emr cluster instance.
        """
        return pulumi.get(self, "image_id")


