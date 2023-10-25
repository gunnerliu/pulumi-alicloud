# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetGatewaysGatewayResult',
    'GetGatewaysGatewayGatewayInstanceResult',
]

@pulumi.output_type
class GetGatewaysGatewayResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 gateway_desc: str,
                 gateway_instances: Sequence['outputs.GetGatewaysGatewayGatewayInstanceResult'],
                 gateway_name: str,
                 hosts: str,
                 id: str,
                 modified_time: str,
                 parent_id: str,
                 status: str,
                 user_id: str):
        """
        :param str create_time: The creation time of Gateway.
        :param str gateway_desc: The description of Gateway.
        :param str gateway_name: The name of the Gateway.
        :param str hosts: A host of information.
        :param str id: The ID of Gateway.
        :param str modified_time: The Modify time of Gateway.
        :param str parent_id: The parent node Id of Gateway.
        :param str status: The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
        :param str user_id: The user's id.
        """
        GetGatewaysGatewayResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            create_time=create_time,
            gateway_desc=gateway_desc,
            gateway_instances=gateway_instances,
            gateway_name=gateway_name,
            hosts=hosts,
            id=id,
            modified_time=modified_time,
            parent_id=parent_id,
            status=status,
            user_id=user_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             create_time: Optional[str] = None,
             gateway_desc: Optional[str] = None,
             gateway_instances: Optional[Sequence['outputs.GetGatewaysGatewayGatewayInstanceResult']] = None,
             gateway_name: Optional[str] = None,
             hosts: Optional[str] = None,
             id: Optional[str] = None,
             modified_time: Optional[str] = None,
             parent_id: Optional[str] = None,
             status: Optional[str] = None,
             user_id: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if gateway_desc is None and 'gatewayDesc' in kwargs:
            gateway_desc = kwargs['gatewayDesc']
        if gateway_desc is None:
            raise TypeError("Missing 'gateway_desc' argument")
        if gateway_instances is None and 'gatewayInstances' in kwargs:
            gateway_instances = kwargs['gatewayInstances']
        if gateway_instances is None:
            raise TypeError("Missing 'gateway_instances' argument")
        if gateway_name is None and 'gatewayName' in kwargs:
            gateway_name = kwargs['gatewayName']
        if gateway_name is None:
            raise TypeError("Missing 'gateway_name' argument")
        if hosts is None:
            raise TypeError("Missing 'hosts' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if modified_time is None and 'modifiedTime' in kwargs:
            modified_time = kwargs['modifiedTime']
        if modified_time is None:
            raise TypeError("Missing 'modified_time' argument")
        if parent_id is None and 'parentId' in kwargs:
            parent_id = kwargs['parentId']
        if parent_id is None:
            raise TypeError("Missing 'parent_id' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']
        if user_id is None:
            raise TypeError("Missing 'user_id' argument")

        _setter("create_time", create_time)
        _setter("gateway_desc", gateway_desc)
        _setter("gateway_instances", gateway_instances)
        _setter("gateway_name", gateway_name)
        _setter("hosts", hosts)
        _setter("id", id)
        _setter("modified_time", modified_time)
        _setter("parent_id", parent_id)
        _setter("status", status)
        _setter("user_id", user_id)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of Gateway.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="gatewayDesc")
    def gateway_desc(self) -> str:
        """
        The description of Gateway.
        """
        return pulumi.get(self, "gateway_desc")

    @property
    @pulumi.getter(name="gatewayInstances")
    def gateway_instances(self) -> Sequence['outputs.GetGatewaysGatewayGatewayInstanceResult']:
        return pulumi.get(self, "gateway_instances")

    @property
    @pulumi.getter(name="gatewayName")
    def gateway_name(self) -> str:
        """
        The name of the Gateway.
        """
        return pulumi.get(self, "gateway_name")

    @property
    @pulumi.getter
    def hosts(self) -> str:
        """
        A host of information.
        """
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of Gateway.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="modifiedTime")
    def modified_time(self) -> str:
        """
        The Modify time of Gateway.
        """
        return pulumi.get(self, "modified_time")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> str:
        """
        The parent node Id of Gateway.
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        The user's id.
        """
        return pulumi.get(self, "user_id")


@pulumi.output_type
class GetGatewaysGatewayGatewayInstanceResult(dict):
    def __init__(__self__, *,
                 connect_endpoint_type: str,
                 current_daemon_version: str,
                 current_version: str,
                 end_point: str,
                 gateway_instance_id: str,
                 gateway_instance_status: str,
                 last_update_time: str,
                 local_ip: str,
                 message: str,
                 output_ip: str):
        """
        :param str connect_endpoint_type: The connection type of Gateway instance.
        :param str current_daemon_version: The process of version number of Gateway instance.
        :param str current_version: The version of Gateway instance.
        :param str end_point: The endpoint address of Gateway instance.
        :param str gateway_instance_id: The id of Gateway instance.
        :param str gateway_instance_status: The status of Gateway instance. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
        :param str last_update_time: The last Updated time stamp of Gateway instance.
        :param str local_ip: The Local IP ADDRESS of Gateway instance.
        :param str message: The prompt information of Gateway instance.
        :param str output_ip: The host of Gateway instance.
        """
        GetGatewaysGatewayGatewayInstanceResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            connect_endpoint_type=connect_endpoint_type,
            current_daemon_version=current_daemon_version,
            current_version=current_version,
            end_point=end_point,
            gateway_instance_id=gateway_instance_id,
            gateway_instance_status=gateway_instance_status,
            last_update_time=last_update_time,
            local_ip=local_ip,
            message=message,
            output_ip=output_ip,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             connect_endpoint_type: Optional[str] = None,
             current_daemon_version: Optional[str] = None,
             current_version: Optional[str] = None,
             end_point: Optional[str] = None,
             gateway_instance_id: Optional[str] = None,
             gateway_instance_status: Optional[str] = None,
             last_update_time: Optional[str] = None,
             local_ip: Optional[str] = None,
             message: Optional[str] = None,
             output_ip: Optional[str] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if connect_endpoint_type is None and 'connectEndpointType' in kwargs:
            connect_endpoint_type = kwargs['connectEndpointType']
        if connect_endpoint_type is None:
            raise TypeError("Missing 'connect_endpoint_type' argument")
        if current_daemon_version is None and 'currentDaemonVersion' in kwargs:
            current_daemon_version = kwargs['currentDaemonVersion']
        if current_daemon_version is None:
            raise TypeError("Missing 'current_daemon_version' argument")
        if current_version is None and 'currentVersion' in kwargs:
            current_version = kwargs['currentVersion']
        if current_version is None:
            raise TypeError("Missing 'current_version' argument")
        if end_point is None and 'endPoint' in kwargs:
            end_point = kwargs['endPoint']
        if end_point is None:
            raise TypeError("Missing 'end_point' argument")
        if gateway_instance_id is None and 'gatewayInstanceId' in kwargs:
            gateway_instance_id = kwargs['gatewayInstanceId']
        if gateway_instance_id is None:
            raise TypeError("Missing 'gateway_instance_id' argument")
        if gateway_instance_status is None and 'gatewayInstanceStatus' in kwargs:
            gateway_instance_status = kwargs['gatewayInstanceStatus']
        if gateway_instance_status is None:
            raise TypeError("Missing 'gateway_instance_status' argument")
        if last_update_time is None and 'lastUpdateTime' in kwargs:
            last_update_time = kwargs['lastUpdateTime']
        if last_update_time is None:
            raise TypeError("Missing 'last_update_time' argument")
        if local_ip is None and 'localIp' in kwargs:
            local_ip = kwargs['localIp']
        if local_ip is None:
            raise TypeError("Missing 'local_ip' argument")
        if message is None:
            raise TypeError("Missing 'message' argument")
        if output_ip is None and 'outputIp' in kwargs:
            output_ip = kwargs['outputIp']
        if output_ip is None:
            raise TypeError("Missing 'output_ip' argument")

        _setter("connect_endpoint_type", connect_endpoint_type)
        _setter("current_daemon_version", current_daemon_version)
        _setter("current_version", current_version)
        _setter("end_point", end_point)
        _setter("gateway_instance_id", gateway_instance_id)
        _setter("gateway_instance_status", gateway_instance_status)
        _setter("last_update_time", last_update_time)
        _setter("local_ip", local_ip)
        _setter("message", message)
        _setter("output_ip", output_ip)

    @property
    @pulumi.getter(name="connectEndpointType")
    def connect_endpoint_type(self) -> str:
        """
        The connection type of Gateway instance.
        """
        return pulumi.get(self, "connect_endpoint_type")

    @property
    @pulumi.getter(name="currentDaemonVersion")
    def current_daemon_version(self) -> str:
        """
        The process of version number of Gateway instance.
        """
        return pulumi.get(self, "current_daemon_version")

    @property
    @pulumi.getter(name="currentVersion")
    def current_version(self) -> str:
        """
        The version of Gateway instance.
        """
        return pulumi.get(self, "current_version")

    @property
    @pulumi.getter(name="endPoint")
    def end_point(self) -> str:
        """
        The endpoint address of Gateway instance.
        """
        return pulumi.get(self, "end_point")

    @property
    @pulumi.getter(name="gatewayInstanceId")
    def gateway_instance_id(self) -> str:
        """
        The id of Gateway instance.
        """
        return pulumi.get(self, "gateway_instance_id")

    @property
    @pulumi.getter(name="gatewayInstanceStatus")
    def gateway_instance_status(self) -> str:
        """
        The status of Gateway instance. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
        """
        return pulumi.get(self, "gateway_instance_status")

    @property
    @pulumi.getter(name="lastUpdateTime")
    def last_update_time(self) -> str:
        """
        The last Updated time stamp of Gateway instance.
        """
        return pulumi.get(self, "last_update_time")

    @property
    @pulumi.getter(name="localIp")
    def local_ip(self) -> str:
        """
        The Local IP ADDRESS of Gateway instance.
        """
        return pulumi.get(self, "local_ip")

    @property
    @pulumi.getter
    def message(self) -> str:
        """
        The prompt information of Gateway instance.
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter(name="outputIp")
    def output_ip(self) -> str:
        """
        The host of Gateway instance.
        """
        return pulumi.get(self, "output_ip")


