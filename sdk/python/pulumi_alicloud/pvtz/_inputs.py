# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = [
    'ZoneAttachmentVpcArgs',
]

@pulumi.input_type
class ZoneAttachmentVpcArgs:
    def __init__(__self__, *,
                 vpc_id: pulumi.Input[str],
                 region_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] vpc_id: The Id of the vpc.
        :param pulumi.Input[str] region_id: The region of the vpc. If not set, the current region will instead of.
        """
        pulumi.set(__self__, "vpc_id", vpc_id)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The Id of the vpc.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The region of the vpc. If not set, the current region will instead of.
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_id", value)


