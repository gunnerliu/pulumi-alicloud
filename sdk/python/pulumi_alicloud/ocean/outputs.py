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
    'GetBaseInstancesInstanceResult',
]

@pulumi.output_type
class GetBaseInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 commodity_code: str,
                 cpu: int,
                 create_time: str,
                 disk_size: str,
                 id: str,
                 instance_class: str,
                 instance_id: str,
                 instance_name: str,
                 node_num: str,
                 payment_type: str,
                 resource_group_id: str,
                 series: str,
                 status: str,
                 zones: Sequence[str]):
        """
        :param str commodity_code: The product code of the OceanBase cluster.
        :param int cpu: The number of CPU cores of the cluster.
        :param str create_time: The creation time of the resource.
        :param str disk_size: The size of the storage space, in GB.
        :param str id: The ID of the Instance.
        :param str instance_class: Cluster specification information.
        :param str instance_id: OceanBase cluster ID.
        :param str instance_name: OceanBase cluster name.
        :param str node_num: The number of nodes in the cluster.
        :param str payment_type: The payment method of the instance.
        :param str resource_group_id: The ID of the enterprise resource group to which the instance resides.
        :param str series: Series of OceanBase clusters.
        :param str status: The status of the resource.
        :param Sequence[str] zones: Information about the zone where the cluster is deployed.
        """
        GetBaseInstancesInstanceResult._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            commodity_code=commodity_code,
            cpu=cpu,
            create_time=create_time,
            disk_size=disk_size,
            id=id,
            instance_class=instance_class,
            instance_id=instance_id,
            instance_name=instance_name,
            node_num=node_num,
            payment_type=payment_type,
            resource_group_id=resource_group_id,
            series=series,
            status=status,
            zones=zones,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             commodity_code: Optional[str] = None,
             cpu: Optional[int] = None,
             create_time: Optional[str] = None,
             disk_size: Optional[str] = None,
             id: Optional[str] = None,
             instance_class: Optional[str] = None,
             instance_id: Optional[str] = None,
             instance_name: Optional[str] = None,
             node_num: Optional[str] = None,
             payment_type: Optional[str] = None,
             resource_group_id: Optional[str] = None,
             series: Optional[str] = None,
             status: Optional[str] = None,
             zones: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if commodity_code is None and 'commodityCode' in kwargs:
            commodity_code = kwargs['commodityCode']
        if commodity_code is None:
            raise TypeError("Missing 'commodity_code' argument")
        if cpu is None:
            raise TypeError("Missing 'cpu' argument")
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if create_time is None:
            raise TypeError("Missing 'create_time' argument")
        if disk_size is None and 'diskSize' in kwargs:
            disk_size = kwargs['diskSize']
        if disk_size is None:
            raise TypeError("Missing 'disk_size' argument")
        if id is None:
            raise TypeError("Missing 'id' argument")
        if instance_class is None and 'instanceClass' in kwargs:
            instance_class = kwargs['instanceClass']
        if instance_class is None:
            raise TypeError("Missing 'instance_class' argument")
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")
        if instance_name is None and 'instanceName' in kwargs:
            instance_name = kwargs['instanceName']
        if instance_name is None:
            raise TypeError("Missing 'instance_name' argument")
        if node_num is None and 'nodeNum' in kwargs:
            node_num = kwargs['nodeNum']
        if node_num is None:
            raise TypeError("Missing 'node_num' argument")
        if payment_type is None and 'paymentType' in kwargs:
            payment_type = kwargs['paymentType']
        if payment_type is None:
            raise TypeError("Missing 'payment_type' argument")
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if resource_group_id is None:
            raise TypeError("Missing 'resource_group_id' argument")
        if series is None:
            raise TypeError("Missing 'series' argument")
        if status is None:
            raise TypeError("Missing 'status' argument")
        if zones is None:
            raise TypeError("Missing 'zones' argument")

        _setter("commodity_code", commodity_code)
        _setter("cpu", cpu)
        _setter("create_time", create_time)
        _setter("disk_size", disk_size)
        _setter("id", id)
        _setter("instance_class", instance_class)
        _setter("instance_id", instance_id)
        _setter("instance_name", instance_name)
        _setter("node_num", node_num)
        _setter("payment_type", payment_type)
        _setter("resource_group_id", resource_group_id)
        _setter("series", series)
        _setter("status", status)
        _setter("zones", zones)

    @property
    @pulumi.getter(name="commodityCode")
    def commodity_code(self) -> str:
        """
        The product code of the OceanBase cluster.
        """
        return pulumi.get(self, "commodity_code")

    @property
    @pulumi.getter
    def cpu(self) -> int:
        """
        The number of CPU cores of the cluster.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="diskSize")
    def disk_size(self) -> str:
        """
        The size of the storage space, in GB.
        """
        return pulumi.get(self, "disk_size")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceClass")
    def instance_class(self) -> str:
        """
        Cluster specification information.
        """
        return pulumi.get(self, "instance_class")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        OceanBase cluster ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        OceanBase cluster name.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="nodeNum")
    def node_num(self) -> str:
        """
        The number of nodes in the cluster.
        """
        return pulumi.get(self, "node_num")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        """
        The payment method of the instance.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The ID of the enterprise resource group to which the instance resides.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def series(self) -> str:
        """
        Series of OceanBase clusters.
        """
        return pulumi.get(self, "series")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def zones(self) -> Sequence[str]:
        """
        Information about the zone where the cluster is deployed.
        """
        return pulumi.get(self, "zones")


