# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'DedicatedPropreHostEcsClassListArgs',
]

@pulumi.input_type
class DedicatedPropreHostEcsClassListArgs:
    def __init__(__self__, *,
                 instance_type: pulumi.Input[str],
                 sys_disk_capacity: pulumi.Input[int],
                 sys_disk_type: pulumi.Input[str],
                 data_disk_performance_level: Optional[pulumi.Input[str]] = None,
                 disk_capacity: Optional[pulumi.Input[int]] = None,
                 disk_count: Optional[pulumi.Input[int]] = None,
                 disk_type: Optional[pulumi.Input[str]] = None,
                 system_disk_performance_level: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] instance_type: ECS specifications.
        :param pulumi.Input[int] sys_disk_capacity: System disk capacity.
        :param pulumi.Input[str] sys_disk_type: System disk type, value:
               - **cloud_essd**: the ESSD cloud disk.
               - **cloud_ssd**: SSD cloud disk.
               - **cloud_efficiency**: The ultra cloud disk.
               - **cloud_auto**: ESSD AutoPL cloud disk.
        :param pulumi.Input[str] data_disk_performance_level: Data disk PL level.
        :param pulumi.Input[int] disk_capacity: The capacity of the data disk.
        :param pulumi.Input[int] disk_count: Number of mounted data disks.
        :param pulumi.Input[str] disk_type: Data disk type, value range:
               - **cloud_essd**: the ESSD cloud disk.
               - **cloud_ssd**: SSD cloud disk.
               - **cloud_efficiency**: The ultra cloud disk.
               - **cloud_auto**: ESSD AutoPL cloud disk.
        :param pulumi.Input[str] system_disk_performance_level: System disk PL level.
        """
        pulumi.set(__self__, "instance_type", instance_type)
        pulumi.set(__self__, "sys_disk_capacity", sys_disk_capacity)
        pulumi.set(__self__, "sys_disk_type", sys_disk_type)
        if data_disk_performance_level is not None:
            pulumi.set(__self__, "data_disk_performance_level", data_disk_performance_level)
        if disk_capacity is not None:
            pulumi.set(__self__, "disk_capacity", disk_capacity)
        if disk_count is not None:
            pulumi.set(__self__, "disk_count", disk_count)
        if disk_type is not None:
            pulumi.set(__self__, "disk_type", disk_type)
        if system_disk_performance_level is not None:
            pulumi.set(__self__, "system_disk_performance_level", system_disk_performance_level)

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Input[str]:
        """
        ECS specifications.
        """
        return pulumi.get(self, "instance_type")

    @instance_type.setter
    def instance_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_type", value)

    @property
    @pulumi.getter(name="sysDiskCapacity")
    def sys_disk_capacity(self) -> pulumi.Input[int]:
        """
        System disk capacity.
        """
        return pulumi.get(self, "sys_disk_capacity")

    @sys_disk_capacity.setter
    def sys_disk_capacity(self, value: pulumi.Input[int]):
        pulumi.set(self, "sys_disk_capacity", value)

    @property
    @pulumi.getter(name="sysDiskType")
    def sys_disk_type(self) -> pulumi.Input[str]:
        """
        System disk type, value:
        - **cloud_essd**: the ESSD cloud disk.
        - **cloud_ssd**: SSD cloud disk.
        - **cloud_efficiency**: The ultra cloud disk.
        - **cloud_auto**: ESSD AutoPL cloud disk.
        """
        return pulumi.get(self, "sys_disk_type")

    @sys_disk_type.setter
    def sys_disk_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "sys_disk_type", value)

    @property
    @pulumi.getter(name="dataDiskPerformanceLevel")
    def data_disk_performance_level(self) -> Optional[pulumi.Input[str]]:
        """
        Data disk PL level.
        """
        return pulumi.get(self, "data_disk_performance_level")

    @data_disk_performance_level.setter
    def data_disk_performance_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_disk_performance_level", value)

    @property
    @pulumi.getter(name="diskCapacity")
    def disk_capacity(self) -> Optional[pulumi.Input[int]]:
        """
        The capacity of the data disk.
        """
        return pulumi.get(self, "disk_capacity")

    @disk_capacity.setter
    def disk_capacity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "disk_capacity", value)

    @property
    @pulumi.getter(name="diskCount")
    def disk_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of mounted data disks.
        """
        return pulumi.get(self, "disk_count")

    @disk_count.setter
    def disk_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "disk_count", value)

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> Optional[pulumi.Input[str]]:
        """
        Data disk type, value range:
        - **cloud_essd**: the ESSD cloud disk.
        - **cloud_ssd**: SSD cloud disk.
        - **cloud_efficiency**: The ultra cloud disk.
        - **cloud_auto**: ESSD AutoPL cloud disk.
        """
        return pulumi.get(self, "disk_type")

    @disk_type.setter
    def disk_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "disk_type", value)

    @property
    @pulumi.getter(name="systemDiskPerformanceLevel")
    def system_disk_performance_level(self) -> Optional[pulumi.Input[str]]:
        """
        System disk PL level.
        """
        return pulumi.get(self, "system_disk_performance_level")

    @system_disk_performance_level.setter
    def system_disk_performance_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "system_disk_performance_level", value)


