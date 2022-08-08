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
    'DomainSourceArgs',
]

@pulumi.input_type
class DomainSourceArgs:
    def __init__(__self__, *,
                 source_content: pulumi.Input[str],
                 source_port: pulumi.Input[str],
                 source_type: pulumi.Input[str],
                 source_priority: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] source_content: The address of the origin server. You can specify an IP address or a domain name.
        :param pulumi.Input[str] source_port: The port number. You can specify port 443 or 80. **Default value: 80**. If you specify port 443, Alibaba Cloud CDN communicates with the origin server over HTTPS. You can also customize a port.
        :param pulumi.Input[str] source_type: The type of the origin server. Valid values:
        :param pulumi.Input[str] source_priority: The priority of the origin server if multiple origin servers are specified. Valid values: `20` and `30`. **Default value: 20**. A value of 20 indicates that the origin server is the primary origin server. A value of 30 indicates that the origin server is a secondary origin server.
        """
        pulumi.set(__self__, "source_content", source_content)
        pulumi.set(__self__, "source_port", source_port)
        pulumi.set(__self__, "source_type", source_type)
        if source_priority is not None:
            pulumi.set(__self__, "source_priority", source_priority)

    @property
    @pulumi.getter(name="sourceContent")
    def source_content(self) -> pulumi.Input[str]:
        """
        The address of the origin server. You can specify an IP address or a domain name.
        """
        return pulumi.get(self, "source_content")

    @source_content.setter
    def source_content(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_content", value)

    @property
    @pulumi.getter(name="sourcePort")
    def source_port(self) -> pulumi.Input[str]:
        """
        The port number. You can specify port 443 or 80. **Default value: 80**. If you specify port 443, Alibaba Cloud CDN communicates with the origin server over HTTPS. You can also customize a port.
        """
        return pulumi.get(self, "source_port")

    @source_port.setter
    def source_port(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_port", value)

    @property
    @pulumi.getter(name="sourceType")
    def source_type(self) -> pulumi.Input[str]:
        """
        The type of the origin server. Valid values:
        """
        return pulumi.get(self, "source_type")

    @source_type.setter
    def source_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_type", value)

    @property
    @pulumi.getter(name="sourcePriority")
    def source_priority(self) -> Optional[pulumi.Input[str]]:
        """
        The priority of the origin server if multiple origin servers are specified. Valid values: `20` and `30`. **Default value: 20**. A value of 20 indicates that the origin server is the primary origin server. A value of 30 indicates that the origin server is a secondary origin server.
        """
        return pulumi.get(self, "source_priority")

    @source_priority.setter
    def source_priority(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_priority", value)


