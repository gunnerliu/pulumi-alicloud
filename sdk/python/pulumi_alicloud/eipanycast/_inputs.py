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
    'AnycastEipAddressAttachmentPopLocationArgs',
]

@pulumi.input_type
class AnycastEipAddressAttachmentPopLocationArgs:
    def __init__(__self__, *,
                 pop_location: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] pop_location: The access point information of the associated access area when the cloud resource instance is bound.If you are binding for the first time, this parameter does not need to be configured, and the system automatically associates all access areas.
        """
        AnycastEipAddressAttachmentPopLocationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            pop_location=pop_location,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             pop_location: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if pop_location is not None:
            _setter("pop_location", pop_location)

    @property
    @pulumi.getter(name="popLocation")
    def pop_location(self) -> Optional[pulumi.Input[str]]:
        """
        The access point information of the associated access area when the cloud resource instance is bound.If you are binding for the first time, this parameter does not need to be configured, and the system automatically associates all access areas.
        """
        return pulumi.get(self, "pop_location")

    @pop_location.setter
    def pop_location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pop_location", value)


