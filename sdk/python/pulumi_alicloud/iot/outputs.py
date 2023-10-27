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
    'GetDeviceGroupsGroupResult',
]

@pulumi.output_type
class GetDeviceGroupsGroupResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 device_active: str,
                 device_count: str,
                 device_online: str,
                 error_message: str,
                 group_desc: str,
                 group_id: str,
                 group_name: str,
                 id: str,
                 success: bool):
        """
        :param str create_time: The Group CreateTime.
        :param str device_active: The Group Number of activated devices.
        :param str device_count: The Group Total number of devices.
        :param str device_online: The Group Number of online devices.
        :param str error_message: The Error_Message of the device group.
        :param str group_desc: The GroupDesc of the device group.
        :param str group_id: The GroupId of the device group.
        :param str group_name: The GroupName of the device group.
        :param str id: The ID of the device group.
        :param bool success: Whether the call is successful.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "device_active", device_active)
        pulumi.set(__self__, "device_count", device_count)
        pulumi.set(__self__, "device_online", device_online)
        pulumi.set(__self__, "error_message", error_message)
        pulumi.set(__self__, "group_desc", group_desc)
        pulumi.set(__self__, "group_id", group_id)
        pulumi.set(__self__, "group_name", group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "success", success)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The Group CreateTime.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="deviceActive")
    def device_active(self) -> str:
        """
        The Group Number of activated devices.
        """
        return pulumi.get(self, "device_active")

    @property
    @pulumi.getter(name="deviceCount")
    def device_count(self) -> str:
        """
        The Group Total number of devices.
        """
        return pulumi.get(self, "device_count")

    @property
    @pulumi.getter(name="deviceOnline")
    def device_online(self) -> str:
        """
        The Group Number of online devices.
        """
        return pulumi.get(self, "device_online")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        The Error_Message of the device group.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="groupDesc")
    def group_desc(self) -> str:
        """
        The GroupDesc of the device group.
        """
        return pulumi.get(self, "group_desc")

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> str:
        """
        The GroupId of the device group.
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="groupName")
    def group_name(self) -> str:
        """
        The GroupName of the device group.
        """
        return pulumi.get(self, "group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the device group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def success(self) -> bool:
        """
        Whether the call is successful.
        """
        return pulumi.get(self, "success")


