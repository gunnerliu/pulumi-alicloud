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
    'CustomPropertyPropertyValueArgs',
    'EcdPolicyGroupAuthorizeAccessPolicyRuleArgs',
    'EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs',
]

@pulumi.input_type
class CustomPropertyPropertyValueArgs:
    def __init__(__self__, *,
                 property_value: Optional[pulumi.Input[str]] = None,
                 property_value_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] property_value: The value of an attribute.
        :param pulumi.Input[str] property_value_id: The value of an attribute id.
        """
        CustomPropertyPropertyValueArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            property_value=property_value,
            property_value_id=property_value_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             property_value: Optional[pulumi.Input[str]] = None,
             property_value_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if property_value is None and 'propertyValue' in kwargs:
            property_value = kwargs['propertyValue']
        if property_value_id is None and 'propertyValueId' in kwargs:
            property_value_id = kwargs['propertyValueId']

        if property_value is not None:
            _setter("property_value", property_value)
        if property_value_id is not None:
            _setter("property_value_id", property_value_id)

    @property
    @pulumi.getter(name="propertyValue")
    def property_value(self) -> Optional[pulumi.Input[str]]:
        """
        The value of an attribute.
        """
        return pulumi.get(self, "property_value")

    @property_value.setter
    def property_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "property_value", value)

    @property
    @pulumi.getter(name="propertyValueId")
    def property_value_id(self) -> Optional[pulumi.Input[str]]:
        """
        The value of an attribute id.
        """
        return pulumi.get(self, "property_value_id")

    @property_value_id.setter
    def property_value_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "property_value_id", value)


@pulumi.input_type
class EcdPolicyGroupAuthorizeAccessPolicyRuleArgs:
    def __init__(__self__, *,
                 cidr_ip: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] cidr_ip: The cidrip of authorize access rule.
        :param pulumi.Input[str] description: The description of authorize access rule.
        """
        EcdPolicyGroupAuthorizeAccessPolicyRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr_ip=cidr_ip,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr_ip: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cidr_ip is None and 'cidrIp' in kwargs:
            cidr_ip = kwargs['cidrIp']

        if cidr_ip is not None:
            _setter("cidr_ip", cidr_ip)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="cidrIp")
    def cidr_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The cidrip of authorize access rule.
        """
        return pulumi.get(self, "cidr_ip")

    @cidr_ip.setter
    def cidr_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_ip", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of authorize access rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs:
    def __init__(__self__, *,
                 cidr_ip: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ip_protocol: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 port_range: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] cidr_ip: The cidrip of security rules.
        :param pulumi.Input[str] description: The description of security rules.
        :param pulumi.Input[str] ip_protocol: The ip protocol of security rules.
        :param pulumi.Input[str] policy: The policy of security rules.
        :param pulumi.Input[str] port_range: The port range of security rules.
        :param pulumi.Input[str] priority: The priority of security rules.
        :param pulumi.Input[str] type: The type of security rules.
        """
        EcdPolicyGroupAuthorizeSecurityPolicyRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cidr_ip=cidr_ip,
            description=description,
            ip_protocol=ip_protocol,
            policy=policy,
            port_range=port_range,
            priority=priority,
            type=type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cidr_ip: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             ip_protocol: Optional[pulumi.Input[str]] = None,
             policy: Optional[pulumi.Input[str]] = None,
             port_range: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cidr_ip is None and 'cidrIp' in kwargs:
            cidr_ip = kwargs['cidrIp']
        if ip_protocol is None and 'ipProtocol' in kwargs:
            ip_protocol = kwargs['ipProtocol']
        if port_range is None and 'portRange' in kwargs:
            port_range = kwargs['portRange']

        if cidr_ip is not None:
            _setter("cidr_ip", cidr_ip)
        if description is not None:
            _setter("description", description)
        if ip_protocol is not None:
            _setter("ip_protocol", ip_protocol)
        if policy is not None:
            _setter("policy", policy)
        if port_range is not None:
            _setter("port_range", port_range)
        if priority is not None:
            _setter("priority", priority)
        if type is not None:
            _setter("type", type)

    @property
    @pulumi.getter(name="cidrIp")
    def cidr_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The cidrip of security rules.
        """
        return pulumi.get(self, "cidr_ip")

    @cidr_ip.setter
    def cidr_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cidr_ip", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of security rules.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The ip protocol of security rules.
        """
        return pulumi.get(self, "ip_protocol")

    @ip_protocol.setter
    def ip_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_protocol", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy of security rules.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="portRange")
    def port_range(self) -> Optional[pulumi.Input[str]]:
        """
        The port range of security rules.
        """
        return pulumi.get(self, "port_range")

    @port_range.setter
    def port_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port_range", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[str]]:
        """
        The priority of security rules.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of security rules.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


