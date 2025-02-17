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
    'TransitRouterVpcAttachmentZoneMappingArgs',
    'TransitRouterVpnAttachmentZoneArgs',
]

@pulumi.input_type
class TransitRouterVpcAttachmentZoneMappingArgs:
    def __init__(__self__, *,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] vswitch_id: The VSwitch id of attachment.
        :param pulumi.Input[str] zone_id: The zone Id of VSwitch.
        """
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VSwitch id of attachment.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone Id of VSwitch.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class TransitRouterVpnAttachmentZoneArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str]):
        """
        :param pulumi.Input[str] zone_id: The id of the zone.
        """
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The id of the zone.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


