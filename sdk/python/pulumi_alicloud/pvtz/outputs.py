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
    'ZoneAttachmentVpc',
    'GetZoneRecordsRecordResult',
    'GetZonesZoneResult',
    'GetZonesZoneBindVpcResult',
]

@pulumi.output_type
class ZoneAttachmentVpc(dict):
    def __init__(__self__, *,
                 vpc_id: str,
                 region_id: Optional[str] = None):
        """
        :param str vpc_id: The Id of the vpc.
        :param str region_id: The region of the vpc. If not set, the current region will instead of.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The Id of the vpc.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[str]:
        """
        The region of the vpc. If not set, the current region will instead of.
        """
        return pulumi.get(self, "region_id")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetZoneRecordsRecordResult(dict):
    def __init__(__self__, *,
                 id: float,
                 priority: float,
                 resource_record: str,
                 status: str,
                 ttl: float,
                 type: str,
                 value: str):
        """
        :param float id: ID of the Private Zone Record.
        :param float priority: Priority of the Private Zone Record.
        :param str resource_record: Resource record of the Private Zone Record.
        :param float ttl: Ttl of the Private Zone Record.
        :param str type: Type of the Private Zone Record.
        :param str value: Value of the Private Zone Record.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "resource_record", resource_record)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "ttl", ttl)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def id(self) -> float:
        """
        ID of the Private Zone Record.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def priority(self) -> float:
        """
        Priority of the Private Zone Record.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="resourceRecord")
    def resource_record(self) -> str:
        """
        Resource record of the Private Zone Record.
        """
        return pulumi.get(self, "resource_record")

    @property
    @pulumi.getter
    def status(self) -> str:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def ttl(self) -> float:
        """
        Ttl of the Private Zone Record.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Type of the Private Zone Record.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        Value of the Private Zone Record.
        """
        return pulumi.get(self, "value")


@pulumi.output_type
class GetZonesZoneResult(dict):
    def __init__(__self__, *,
                 bind_vpcs: List['outputs.GetZonesZoneBindVpcResult'],
                 creation_time: str,
                 id: str,
                 is_ptr: bool,
                 name: str,
                 record_count: float,
                 remark: str,
                 update_time: str):
        """
        :param List['GetZonesZoneBindVpcArgs'] bind_vpcs: List of the VPCs is bound to the Private Zone.
        :param str creation_time: Time of creation of the Private Zone.
        :param str id: ID of the Private Zone.
        :param bool is_ptr: Whether the Private Zone is ptr
        :param str name: Name of the Private Zone.
        :param float record_count: Count of the Private Zone Record.
        :param str remark: Remark of the Private Zone.
        :param str update_time: Time of update of the Private Zone.
        """
        pulumi.set(__self__, "bind_vpcs", bind_vpcs)
        pulumi.set(__self__, "creation_time", creation_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "is_ptr", is_ptr)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "record_count", record_count)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="bindVpcs")
    def bind_vpcs(self) -> List['outputs.GetZonesZoneBindVpcResult']:
        """
        List of the VPCs is bound to the Private Zone.
        """
        return pulumi.get(self, "bind_vpcs")

    @property
    @pulumi.getter(name="creationTime")
    def creation_time(self) -> str:
        """
        Time of creation of the Private Zone.
        """
        return pulumi.get(self, "creation_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the Private Zone.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isPtr")
    def is_ptr(self) -> bool:
        """
        Whether the Private Zone is ptr
        """
        return pulumi.get(self, "is_ptr")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the Private Zone.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="recordCount")
    def record_count(self) -> float:
        """
        Count of the Private Zone Record.
        """
        return pulumi.get(self, "record_count")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        Remark of the Private Zone.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> str:
        """
        Time of update of the Private Zone.
        """
        return pulumi.get(self, "update_time")


@pulumi.output_type
class GetZonesZoneBindVpcResult(dict):
    def __init__(__self__, *,
                 region_id: str,
                 vpc_id: str,
                 vpc_name: str):
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vpc_name", vpc_name)

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vpcName")
    def vpc_name(self) -> str:
        return pulumi.get(self, "vpc_name")


