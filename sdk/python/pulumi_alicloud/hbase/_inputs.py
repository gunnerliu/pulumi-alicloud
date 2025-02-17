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
    'InstanceSlbConnAddrArgs',
    'InstanceUiProxyConnAddrArgs',
    'InstanceZkConnAddrArgs',
]

@pulumi.input_type
class InstanceSlbConnAddrArgs:
    def __init__(__self__, *,
                 conn_addr: Optional[pulumi.Input[str]] = None,
                 conn_addr_port: Optional[pulumi.Input[str]] = None,
                 net_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] conn_addr: The Phoenix address.
        :param pulumi.Input[str] conn_addr_port: The number of the port over which Phoenix connects to the instance.
        :param pulumi.Input[str] net_type: The type of the network. Valid values:
        """
        if conn_addr is not None:
            pulumi.set(__self__, "conn_addr", conn_addr)
        if conn_addr_port is not None:
            pulumi.set(__self__, "conn_addr_port", conn_addr_port)
        if net_type is not None:
            pulumi.set(__self__, "net_type", net_type)

    @property
    @pulumi.getter(name="connAddr")
    def conn_addr(self) -> Optional[pulumi.Input[str]]:
        """
        The Phoenix address.
        """
        return pulumi.get(self, "conn_addr")

    @conn_addr.setter
    def conn_addr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr", value)

    @property
    @pulumi.getter(name="connAddrPort")
    def conn_addr_port(self) -> Optional[pulumi.Input[str]]:
        """
        The number of the port over which Phoenix connects to the instance.
        """
        return pulumi.get(self, "conn_addr_port")

    @conn_addr_port.setter
    def conn_addr_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr_port", value)

    @property
    @pulumi.getter(name="netType")
    def net_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the network. Valid values:
        """
        return pulumi.get(self, "net_type")

    @net_type.setter
    def net_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "net_type", value)


@pulumi.input_type
class InstanceUiProxyConnAddrArgs:
    def __init__(__self__, *,
                 conn_addr: Optional[pulumi.Input[str]] = None,
                 conn_addr_port: Optional[pulumi.Input[str]] = None,
                 net_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] conn_addr: The Phoenix address.
        :param pulumi.Input[str] conn_addr_port: The number of the port over which Phoenix connects to the instance.
        :param pulumi.Input[str] net_type: The type of the network. Valid values:
        """
        if conn_addr is not None:
            pulumi.set(__self__, "conn_addr", conn_addr)
        if conn_addr_port is not None:
            pulumi.set(__self__, "conn_addr_port", conn_addr_port)
        if net_type is not None:
            pulumi.set(__self__, "net_type", net_type)

    @property
    @pulumi.getter(name="connAddr")
    def conn_addr(self) -> Optional[pulumi.Input[str]]:
        """
        The Phoenix address.
        """
        return pulumi.get(self, "conn_addr")

    @conn_addr.setter
    def conn_addr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr", value)

    @property
    @pulumi.getter(name="connAddrPort")
    def conn_addr_port(self) -> Optional[pulumi.Input[str]]:
        """
        The number of the port over which Phoenix connects to the instance.
        """
        return pulumi.get(self, "conn_addr_port")

    @conn_addr_port.setter
    def conn_addr_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr_port", value)

    @property
    @pulumi.getter(name="netType")
    def net_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the network. Valid values:
        """
        return pulumi.get(self, "net_type")

    @net_type.setter
    def net_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "net_type", value)


@pulumi.input_type
class InstanceZkConnAddrArgs:
    def __init__(__self__, *,
                 conn_addr: Optional[pulumi.Input[str]] = None,
                 conn_addr_port: Optional[pulumi.Input[str]] = None,
                 net_type: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] conn_addr: The Phoenix address.
        :param pulumi.Input[str] conn_addr_port: The number of the port over which Phoenix connects to the instance.
        :param pulumi.Input[str] net_type: The type of the network. Valid values:
        """
        if conn_addr is not None:
            pulumi.set(__self__, "conn_addr", conn_addr)
        if conn_addr_port is not None:
            pulumi.set(__self__, "conn_addr_port", conn_addr_port)
        if net_type is not None:
            pulumi.set(__self__, "net_type", net_type)

    @property
    @pulumi.getter(name="connAddr")
    def conn_addr(self) -> Optional[pulumi.Input[str]]:
        """
        The Phoenix address.
        """
        return pulumi.get(self, "conn_addr")

    @conn_addr.setter
    def conn_addr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr", value)

    @property
    @pulumi.getter(name="connAddrPort")
    def conn_addr_port(self) -> Optional[pulumi.Input[str]]:
        """
        The number of the port over which Phoenix connects to the instance.
        """
        return pulumi.get(self, "conn_addr_port")

    @conn_addr_port.setter
    def conn_addr_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "conn_addr_port", value)

    @property
    @pulumi.getter(name="netType")
    def net_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the network. Valid values:
        """
        return pulumi.get(self, "net_type")

    @net_type.setter
    def net_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "net_type", value)


