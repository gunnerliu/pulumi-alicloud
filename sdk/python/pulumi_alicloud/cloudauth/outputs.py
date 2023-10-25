# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetFaceConfigsConfigResult',
]

@pulumi.output_type
class GetFaceConfigsConfigResult(dict):
    def __init__(__self__, *,
                 biz_name: str,
                 biz_type: str,
                 gmt_updated: str):
        """
        :param str biz_name: Scene name.
        :param str biz_type: Scene type. **NOTE:** The biz_type cannot exceed 32 characters and can only use English letters, numbers and dashes (-).
        :param str gmt_updated: The Update Time.
        """
        GetFaceConfigsConfigResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            biz_name=biz_name,
            biz_type=biz_type,
            gmt_updated=gmt_updated,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             biz_name: Optional[str] = None,
             biz_type: Optional[str] = None,
             gmt_updated: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if biz_name is None and 'bizName' in kwargs:
            biz_name = kwargs['bizName']
        if biz_name is None:
            raise TypeError("Missing 'biz_name' argument")
        if biz_type is None and 'bizType' in kwargs:
            biz_type = kwargs['bizType']
        if biz_type is None:
            raise TypeError("Missing 'biz_type' argument")
        if gmt_updated is None and 'gmtUpdated' in kwargs:
            gmt_updated = kwargs['gmtUpdated']
        if gmt_updated is None:
            raise TypeError("Missing 'gmt_updated' argument")

        _setter("biz_name", biz_name)
        _setter("biz_type", biz_type)
        _setter("gmt_updated", gmt_updated)

    @property
    @pulumi.getter(name="bizName")
    def biz_name(self) -> str:
        """
        Scene name.
        """
        return pulumi.get(self, "biz_name")

    @property
    @pulumi.getter(name="bizType")
    def biz_type(self) -> str:
        """
        Scene type. **NOTE:** The biz_type cannot exceed 32 characters and can only use English letters, numbers and dashes (-).
        """
        return pulumi.get(self, "biz_type")

    @property
    @pulumi.getter(name="gmtUpdated")
    def gmt_updated(self) -> str:
        """
        The Update Time.
        """
        return pulumi.get(self, "gmt_updated")


