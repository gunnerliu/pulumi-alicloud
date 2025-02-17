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
    'VvpInstanceResourceSpecArgs',
    'VvpInstanceStorageArgs',
    'VvpInstanceStorageOssArgs',
]

@pulumi.input_type
class VvpInstanceResourceSpecArgs:
    def __init__(__self__, *,
                 cpu: Optional[pulumi.Input[int]] = None,
                 memory_gb: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] cpu: CPU number.
        :param pulumi.Input[int] memory_gb: Memory size.
        """
        if cpu is not None:
            pulumi.set(__self__, "cpu", cpu)
        if memory_gb is not None:
            pulumi.set(__self__, "memory_gb", memory_gb)

    @property
    @pulumi.getter
    def cpu(self) -> Optional[pulumi.Input[int]]:
        """
        CPU number.
        """
        return pulumi.get(self, "cpu")

    @cpu.setter
    def cpu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cpu", value)

    @property
    @pulumi.getter(name="memoryGb")
    def memory_gb(self) -> Optional[pulumi.Input[int]]:
        """
        Memory size.
        """
        return pulumi.get(self, "memory_gb")

    @memory_gb.setter
    def memory_gb(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "memory_gb", value)


@pulumi.input_type
class VvpInstanceStorageArgs:
    def __init__(__self__, *,
                 oss: pulumi.Input['VvpInstanceStorageOssArgs']):
        """
        :param pulumi.Input['VvpInstanceStorageOssArgs'] oss: OSS stores information. See `oss` below.
        """
        pulumi.set(__self__, "oss", oss)

    @property
    @pulumi.getter
    def oss(self) -> pulumi.Input['VvpInstanceStorageOssArgs']:
        """
        OSS stores information. See `oss` below.
        """
        return pulumi.get(self, "oss")

    @oss.setter
    def oss(self, value: pulumi.Input['VvpInstanceStorageOssArgs']):
        pulumi.set(self, "oss", value)


@pulumi.input_type
class VvpInstanceStorageOssArgs:
    def __init__(__self__, *,
                 bucket: pulumi.Input[str]):
        """
        :param pulumi.Input[str] bucket: OSS Bucket name.
        """
        pulumi.set(__self__, "bucket", bucket)

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Input[str]:
        """
        OSS Bucket name.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "bucket", value)


