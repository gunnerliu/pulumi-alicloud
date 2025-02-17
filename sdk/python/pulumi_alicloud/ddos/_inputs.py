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
    'DomainResourceProxyTypeArgs',
    'SchedulerRuleRuleArgs',
]

@pulumi.input_type
class DomainResourceProxyTypeArgs:
    def __init__(__self__, *,
                 proxy_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 proxy_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[int]]] proxy_ports: the port number. This field is required and must be an integer. **NOTE:** From version 1.206.0, `proxy_ports` can be modified.
        :param pulumi.Input[str] proxy_type: the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
        """
        if proxy_ports is not None:
            pulumi.set(__self__, "proxy_ports", proxy_ports)
        if proxy_type is not None:
            pulumi.set(__self__, "proxy_type", proxy_type)

    @property
    @pulumi.getter(name="proxyPorts")
    def proxy_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        the port number. This field is required and must be an integer. **NOTE:** From version 1.206.0, `proxy_ports` can be modified.
        """
        return pulumi.get(self, "proxy_ports")

    @proxy_ports.setter
    def proxy_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "proxy_ports", value)

    @property
    @pulumi.getter(name="proxyType")
    def proxy_type(self) -> Optional[pulumi.Input[str]]:
        """
        the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
        """
        return pulumi.get(self, "proxy_type")

    @proxy_type.setter
    def proxy_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_type", value)


@pulumi.input_type
class SchedulerRuleRuleArgs:
    def __init__(__self__, *,
                 priority: Optional[pulumi.Input[int]] = None,
                 region_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[int]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None,
                 value_type: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] priority: The priority of the rule.
        :param pulumi.Input[str] region_id: The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
        :param pulumi.Input[int] status: The status of the scheduling rule.
        :param pulumi.Input[str] type: The address type of the interaction resource. Valid values:
               `A`: IPv4 address.
               `CNAME`: CNAME record.
        :param pulumi.Input[str] value: The address of the interaction resource.
        :param pulumi.Input[int] value_type: Required. The type of the linked resource. It is an Integer. Valid values:
               `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
               `2`: the IP address of the interaction resource (in the tiered protection scenario)
               `3`: the IP address used to accelerate access (in the network acceleration scenario)
               `6` the IP address of the interaction resource (in the cloud service interaction scenario)
        """
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if value_type is not None:
            pulumi.set(__self__, "value_type", value_type)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the rule.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The region where the interaction resource that is used in the scheduling rule is deployed. **NOTE:** This parameter is returned only if the RuleType parameter is set to 2.
        """
        return pulumi.get(self, "region_id")

    @region_id.setter
    def region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[int]]:
        """
        The status of the scheduling rule.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The address type of the interaction resource. Valid values:
        `A`: IPv4 address.
        `CNAME`: CNAME record.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The address of the interaction resource.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> Optional[pulumi.Input[int]]:
        """
        Required. The type of the linked resource. It is an Integer. Valid values:
        `1`: The IP address of Anti-DDoS Pro or Anti-DDoS Premium
        `2`: the IP address of the interaction resource (in the tiered protection scenario)
        `3`: the IP address used to accelerate access (in the network acceleration scenario)
        `6` the IP address of the interaction resource (in the cloud service interaction scenario)
        """
        return pulumi.get(self, "value_type")

    @value_type.setter
    def value_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "value_type", value)


