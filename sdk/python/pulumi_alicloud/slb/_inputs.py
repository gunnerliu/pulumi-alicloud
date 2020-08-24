# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = [
    'AclEntryListArgs',
    'BackendServerBackendServerArgs',
    'ListenerXForwardedForArgs',
    'MasterSlaveServerGroupServerArgs',
    'ServerGroupServerArgs',
]

@pulumi.input_type
class AclEntryListArgs:
    def __init__(__self__, *,
                 entry: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "entry", entry)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)

    @property
    @pulumi.getter
    def entry(self) -> pulumi.Input[str]:
        return pulumi.get(self, "entry")

    @entry.setter
    def entry(self, value: pulumi.Input[str]):
        pulumi.set(self, "entry", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)


@pulumi.input_type
class BackendServerBackendServerArgs:
    def __init__(__self__, *,
                 server_id: pulumi.Input[str],
                 weight: pulumi.Input[float],
                 server_ip: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "server_id", server_id)
        pulumi.set(__self__, "weight", weight)
        if server_ip is not None:
            pulumi.set(__self__, "server_ip", server_ip)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[float]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[float]):
        pulumi.set(self, "weight", value)

    @property
    @pulumi.getter(name="serverIp")
    def server_ip(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "server_ip")

    @server_ip.setter
    def server_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_ip", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ListenerXForwardedForArgs:
    def __init__(__self__, *,
                 retrive_client_ip: Optional[pulumi.Input[bool]] = None,
                 retrive_slb_id: Optional[pulumi.Input[bool]] = None,
                 retrive_slb_ip: Optional[pulumi.Input[bool]] = None,
                 retrive_slb_proto: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] retrive_slb_id: Whether to use the XForwardedFor header to obtain the ID of the SLB instance. Default to false.
        :param pulumi.Input[bool] retrive_slb_ip: Whether to use the XForwardedFor_SLBIP header to obtain the public IP address of the SLB instance. Default to false.
        :param pulumi.Input[bool] retrive_slb_proto: Whether to use the XForwardedFor_proto header to obtain the protocol used by the listener. Default to false.
        """
        if retrive_client_ip is not None:
            pulumi.set(__self__, "retrive_client_ip", retrive_client_ip)
        if retrive_slb_id is not None:
            pulumi.set(__self__, "retrive_slb_id", retrive_slb_id)
        if retrive_slb_ip is not None:
            pulumi.set(__self__, "retrive_slb_ip", retrive_slb_ip)
        if retrive_slb_proto is not None:
            pulumi.set(__self__, "retrive_slb_proto", retrive_slb_proto)

    @property
    @pulumi.getter(name="retriveClientIp")
    def retrive_client_ip(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "retrive_client_ip")

    @retrive_client_ip.setter
    def retrive_client_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "retrive_client_ip", value)

    @property
    @pulumi.getter(name="retriveSlbId")
    def retrive_slb_id(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to use the XForwardedFor header to obtain the ID of the SLB instance. Default to false.
        """
        return pulumi.get(self, "retrive_slb_id")

    @retrive_slb_id.setter
    def retrive_slb_id(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "retrive_slb_id", value)

    @property
    @pulumi.getter(name="retriveSlbIp")
    def retrive_slb_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to use the XForwardedFor_SLBIP header to obtain the public IP address of the SLB instance. Default to false.
        """
        return pulumi.get(self, "retrive_slb_ip")

    @retrive_slb_ip.setter
    def retrive_slb_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "retrive_slb_ip", value)

    @property
    @pulumi.getter(name="retriveSlbProto")
    def retrive_slb_proto(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to use the XForwardedFor_proto header to obtain the protocol used by the listener. Default to false.
        """
        return pulumi.get(self, "retrive_slb_proto")

    @retrive_slb_proto.setter
    def retrive_slb_proto(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "retrive_slb_proto", value)


@pulumi.input_type
class MasterSlaveServerGroupServerArgs:
    def __init__(__self__, *,
                 port: pulumi.Input[float],
                 server_id: pulumi.Input[str],
                 server_type: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[float]] = None):
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server_id", server_id)
        if server_type is not None:
            pulumi.set(__self__, "server_type", server_type)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[float]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[float]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="serverId")
    def server_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "server_id")

    @server_id.setter
    def server_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "server_id", value)

    @property
    @pulumi.getter(name="serverType")
    def server_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "server_type")

    @server_type.setter
    def server_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "server_type", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[float]]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "weight", value)


@pulumi.input_type
class ServerGroupServerArgs:
    def __init__(__self__, *,
                 port: pulumi.Input[float],
                 server_ids: pulumi.Input[List[pulumi.Input[str]]],
                 type: Optional[pulumi.Input[str]] = None,
                 weight: Optional[pulumi.Input[float]] = None):
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server_ids", server_ids)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[float]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[float]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="serverIds")
    def server_ids(self) -> pulumi.Input[List[pulumi.Input[str]]]:
        return pulumi.get(self, "server_ids")

    @server_ids.setter
    def server_ids(self, value: pulumi.Input[List[pulumi.Input[str]]]):
        pulumi.set(self, "server_ids", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def weight(self) -> Optional[pulumi.Input[float]]:
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "weight", value)


