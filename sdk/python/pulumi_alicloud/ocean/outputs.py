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
        pulumi.set(__self__, "commodity_code", commodity_code)
        pulumi.set(__self__, "cpu", cpu)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "disk_size", disk_size)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_class", instance_class)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "node_num", node_num)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "series", series)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "zones", zones)

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


