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
    'AppTemplateConfigListArgs',
]

@pulumi.input_type
class AppTemplateConfigListArgs:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] key: Configuration item key. Valid values: ["config.appCallbackAuthKey","config.appCallbackUrl","config.callbackClass.live","config.callbackClass.user","config.livePullDomain","config.livePushDomain","config.multipleClientsLogin","config.regionId","config.streamChangeCallbackUrl"].
        :param pulumi.Input[str] value: Configuration item content.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration item key. Valid values: ["config.appCallbackAuthKey","config.appCallbackUrl","config.callbackClass.live","config.callbackClass.user","config.livePullDomain","config.livePushDomain","config.multipleClientsLogin","config.regionId","config.streamChangeCallbackUrl"].
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration item content.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


