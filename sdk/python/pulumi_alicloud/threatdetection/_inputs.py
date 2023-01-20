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
    'HoneypotPresetMetaArgs',
    'HoneypotProbeHoneypotBindListArgs',
    'HoneypotProbeHoneypotBindListBindPortListArgs',
]

@pulumi.input_type
class HoneypotPresetMetaArgs:
    def __init__(__self__, *,
                 burp: pulumi.Input[str],
                 portrait_option: Optional[pulumi.Input[bool]] = None,
                 trojan_git: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] burp: Burp counter.
        :param pulumi.Input[bool] portrait_option: Social traceability.
        :param pulumi.Input[str] trojan_git: Git countered.
        """
        pulumi.set(__self__, "burp", burp)
        if portrait_option is not None:
            pulumi.set(__self__, "portrait_option", portrait_option)
        if trojan_git is not None:
            pulumi.set(__self__, "trojan_git", trojan_git)

    @property
    @pulumi.getter
    def burp(self) -> pulumi.Input[str]:
        """
        Burp counter.
        """
        return pulumi.get(self, "burp")

    @burp.setter
    def burp(self, value: pulumi.Input[str]):
        pulumi.set(self, "burp", value)

    @property
    @pulumi.getter(name="portraitOption")
    def portrait_option(self) -> Optional[pulumi.Input[bool]]:
        """
        Social traceability.
        """
        return pulumi.get(self, "portrait_option")

    @portrait_option.setter
    def portrait_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "portrait_option", value)

    @property
    @pulumi.getter(name="trojanGit")
    def trojan_git(self) -> Optional[pulumi.Input[str]]:
        """
        Git countered.
        """
        return pulumi.get(self, "trojan_git")

    @trojan_git.setter
    def trojan_git(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trojan_git", value)


@pulumi.input_type
class HoneypotProbeHoneypotBindListArgs:
    def __init__(__self__, *,
                 bind_port_lists: Optional[pulumi.Input[Sequence[pulumi.Input['HoneypotProbeHoneypotBindListBindPortListArgs']]]] = None,
                 honeypot_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['HoneypotProbeHoneypotBindListBindPortListArgs']]] bind_port_lists: List of listening ports.See the following `Block BindPortList`.
        :param pulumi.Input[str] honeypot_id: Honeypot ID.
        """
        if bind_port_lists is not None:
            pulumi.set(__self__, "bind_port_lists", bind_port_lists)
        if honeypot_id is not None:
            pulumi.set(__self__, "honeypot_id", honeypot_id)

    @property
    @pulumi.getter(name="bindPortLists")
    def bind_port_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['HoneypotProbeHoneypotBindListBindPortListArgs']]]]:
        """
        List of listening ports.See the following `Block BindPortList`.
        """
        return pulumi.get(self, "bind_port_lists")

    @bind_port_lists.setter
    def bind_port_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['HoneypotProbeHoneypotBindListBindPortListArgs']]]]):
        pulumi.set(self, "bind_port_lists", value)

    @property
    @pulumi.getter(name="honeypotId")
    def honeypot_id(self) -> Optional[pulumi.Input[str]]:
        """
        Honeypot ID.
        """
        return pulumi.get(self, "honeypot_id")

    @honeypot_id.setter
    def honeypot_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "honeypot_id", value)


@pulumi.input_type
class HoneypotProbeHoneypotBindListBindPortListArgs:
    def __init__(__self__, *,
                 bind_port: Optional[pulumi.Input[bool]] = None,
                 end_port: Optional[pulumi.Input[int]] = None,
                 fixed: Optional[pulumi.Input[bool]] = None,
                 start_port: Optional[pulumi.Input[int]] = None,
                 target_port: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[bool] bind_port: Whether to bind the port.
        :param pulumi.Input[int] end_port: End port.
        :param pulumi.Input[bool] fixed: Whether the port is fixed.
        :param pulumi.Input[int] start_port: Start port.
        :param pulumi.Input[int] target_port: Destination port.
        """
        if bind_port is not None:
            pulumi.set(__self__, "bind_port", bind_port)
        if end_port is not None:
            pulumi.set(__self__, "end_port", end_port)
        if fixed is not None:
            pulumi.set(__self__, "fixed", fixed)
        if start_port is not None:
            pulumi.set(__self__, "start_port", start_port)
        if target_port is not None:
            pulumi.set(__self__, "target_port", target_port)

    @property
    @pulumi.getter(name="bindPort")
    def bind_port(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to bind the port.
        """
        return pulumi.get(self, "bind_port")

    @bind_port.setter
    def bind_port(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "bind_port", value)

    @property
    @pulumi.getter(name="endPort")
    def end_port(self) -> Optional[pulumi.Input[int]]:
        """
        End port.
        """
        return pulumi.get(self, "end_port")

    @end_port.setter
    def end_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "end_port", value)

    @property
    @pulumi.getter
    def fixed(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the port is fixed.
        """
        return pulumi.get(self, "fixed")

    @fixed.setter
    def fixed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "fixed", value)

    @property
    @pulumi.getter(name="startPort")
    def start_port(self) -> Optional[pulumi.Input[int]]:
        """
        Start port.
        """
        return pulumi.get(self, "start_port")

    @start_port.setter
    def start_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "start_port", value)

    @property
    @pulumi.getter(name="targetPort")
    def target_port(self) -> Optional[pulumi.Input[int]]:
        """
        Destination port.
        """
        return pulumi.get(self, "target_port")

    @target_port.setter
    def target_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "target_port", value)


