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
    'GetInstancesInstanceResult',
]

@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 connection_string: str,
                 create_time: int,
                 description: str,
                 id: str,
                 network_type: str,
                 port: str,
                 status: str,
                 type: str,
                 version: int,
                 zone_id: str):
        """
        :param str connection_string: (Available in 1.196.0+) The connection string of the DRDS instance.
        :param int create_time: Creation time of the instance.
        :param str description: The DRDS instance description.
        :param str id: The ID of the DRDS instance.
        :param str network_type: `Classic` for public classic network or `VPC` for private network.
        :param str port: (Available in 1.196.0+) The connection port of the DRDS instance.
        :param str status: Status of the instance.
        :param str type: The DRDS Instance type.
        :param int version: The DRDS Instance version.
        :param str zone_id: Zone ID the instance belongs to.
        """
        GetInstancesInstanceResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            connection_string=connection_string,
            create_time=create_time,
            description=description,
            id=id,
            network_type=network_type,
            port=port,
            status=status,
            type=type,
            version=version,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             connection_string: str,
             create_time: int,
             description: str,
             id: str,
             network_type: str,
             port: str,
             status: str,
             type: str,
             version: int,
             zone_id: str,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("connection_string", connection_string)
        _setter("create_time", create_time)
        _setter("description", description)
        _setter("id", id)
        _setter("network_type", network_type)
        _setter("port", port)
        _setter("status", status)
        _setter("type", type)
        _setter("version", version)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> str:
        """
        (Available in 1.196.0+) The connection string of the DRDS instance.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> int:
        """
        Creation time of the instance.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The DRDS instance description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the DRDS instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> str:
        """
        `Classic` for public classic network or `VPC` for private network.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter
    def port(self) -> str:
        """
        (Available in 1.196.0+) The connection port of the DRDS instance.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Status of the instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The DRDS Instance type.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def version(self) -> int:
        """
        The DRDS Instance version.
        """
        return pulumi.get(self, "version")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        Zone ID the instance belongs to.
        """
        return pulumi.get(self, "zone_id")


