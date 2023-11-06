# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetZonesResult',
    'AwaitableGetZonesResult',
    'get_zones',
    'get_zones_output',
]

@pulumi.output_type
class GetZonesResult:
    """
    A collection of values returned by getZones.
    """
    def __init__(__self__, available_disk_category=None, available_instance_type=None, available_resource_creation=None, available_slb_address_ip_version=None, available_slb_address_type=None, enable_details=None, id=None, ids=None, instance_charge_type=None, multi=None, network_type=None, output_file=None, spot_strategy=None, zones=None):
        if available_disk_category and not isinstance(available_disk_category, str):
            raise TypeError("Expected argument 'available_disk_category' to be a str")
        pulumi.set(__self__, "available_disk_category", available_disk_category)
        if available_instance_type and not isinstance(available_instance_type, str):
            raise TypeError("Expected argument 'available_instance_type' to be a str")
        pulumi.set(__self__, "available_instance_type", available_instance_type)
        if available_resource_creation and not isinstance(available_resource_creation, str):
            raise TypeError("Expected argument 'available_resource_creation' to be a str")
        pulumi.set(__self__, "available_resource_creation", available_resource_creation)
        if available_slb_address_ip_version and not isinstance(available_slb_address_ip_version, str):
            raise TypeError("Expected argument 'available_slb_address_ip_version' to be a str")
        pulumi.set(__self__, "available_slb_address_ip_version", available_slb_address_ip_version)
        if available_slb_address_type and not isinstance(available_slb_address_type, str):
            raise TypeError("Expected argument 'available_slb_address_type' to be a str")
        pulumi.set(__self__, "available_slb_address_type", available_slb_address_type)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if multi and not isinstance(multi, bool):
            raise TypeError("Expected argument 'multi' to be a bool")
        pulumi.set(__self__, "multi", multi)
        if network_type and not isinstance(network_type, str):
            raise TypeError("Expected argument 'network_type' to be a str")
        pulumi.set(__self__, "network_type", network_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if spot_strategy and not isinstance(spot_strategy, str):
            raise TypeError("Expected argument 'spot_strategy' to be a str")
        pulumi.set(__self__, "spot_strategy", spot_strategy)
        if zones and not isinstance(zones, list):
            raise TypeError("Expected argument 'zones' to be a list")
        pulumi.set(__self__, "zones", zones)

    @property
    @pulumi.getter(name="availableDiskCategory")
    def available_disk_category(self) -> Optional[str]:
        return pulumi.get(self, "available_disk_category")

    @property
    @pulumi.getter(name="availableInstanceType")
    def available_instance_type(self) -> Optional[str]:
        return pulumi.get(self, "available_instance_type")

    @property
    @pulumi.getter(name="availableResourceCreation")
    def available_resource_creation(self) -> Optional[str]:
        """
        Type of resources that can be created.
        """
        return pulumi.get(self, "available_resource_creation")

    @property
    @pulumi.getter(name="availableSlbAddressIpVersion")
    def available_slb_address_ip_version(self) -> Optional[str]:
        return pulumi.get(self, "available_slb_address_ip_version")

    @property
    @pulumi.getter(name="availableSlbAddressType")
    def available_slb_address_type(self) -> Optional[str]:
        return pulumi.get(self, "available_slb_address_type")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of zone IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[str]:
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter
    def multi(self) -> Optional[bool]:
        return pulumi.get(self, "multi")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> Optional[str]:
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="spotStrategy")
    def spot_strategy(self) -> Optional[str]:
        return pulumi.get(self, "spot_strategy")

    @property
    @pulumi.getter
    def zones(self) -> Sequence['outputs.GetZonesZoneResult']:
        """
        A list of availability zones. Each element contains the following attributes:
        """
        return pulumi.get(self, "zones")


class AwaitableGetZonesResult(GetZonesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetZonesResult(
            available_disk_category=self.available_disk_category,
            available_instance_type=self.available_instance_type,
            available_resource_creation=self.available_resource_creation,
            available_slb_address_ip_version=self.available_slb_address_ip_version,
            available_slb_address_type=self.available_slb_address_type,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            instance_charge_type=self.instance_charge_type,
            multi=self.multi,
            network_type=self.network_type,
            output_file=self.output_file,
            spot_strategy=self.spot_strategy,
            zones=self.zones)


def get_zones(available_disk_category: Optional[str] = None,
              available_instance_type: Optional[str] = None,
              available_resource_creation: Optional[str] = None,
              available_slb_address_ip_version: Optional[str] = None,
              available_slb_address_type: Optional[str] = None,
              enable_details: Optional[bool] = None,
              instance_charge_type: Optional[str] = None,
              multi: Optional[bool] = None,
              network_type: Optional[str] = None,
              output_file: Optional[str] = None,
              spot_strategy: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetZonesResult:
    """
    This data source provides availability zones that can be accessed by an Alibaba Cloud account within the region configured in the provider.

    > **NOTE:** If one zone is sold out, it will not be exported.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    zones_ds = alicloud.get_zones(available_disk_category="cloud_ssd",
        available_instance_type="ecs.n4.large")
    ```


    :param str available_disk_category: Filter the results by a specific disk category. Can be either `cloud`, `cloud_efficiency`, `cloud_ssd`, `ephemeral_ssd`.
    :param str available_instance_type: Filter the results by a specific instance type.
    :param str available_resource_creation: Filter the results by a specific resource type.
           Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
           
           > **NOTE:** From version 1.134.0, the `available_resource_creation` value "Rds" has been deprecated.
           If you want to fetch the available zones for RDS instance, you can use datasource alicloud_db_zones
    :param str available_slb_address_ip_version: Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
           
           > **NOTE:** The disk category `cloud` has been outdated and can only be used by non-I/O Optimized ECS instances. Many availability zones don't support it. It is recommended to use `cloud_efficiency` or `cloud_ssd`.
    :param str available_slb_address_type: Filter the results by a slb instance address type. Can be either `Vpc`, `classic_internet` or `classic_intranet`
    :param bool enable_details: Default to false and only output `id` in the `zones` block. Set it to true can output more details.
    :param str instance_charge_type: Filter the results by a specific ECS instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
    :param bool multi: Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
    :param str network_type: Filter the results by a specific network type. Valid values: `Classic` and `Vpc`.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str spot_strategy: - (Optional) Filter the results by a specific ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
    """
    __args__ = dict()
    __args__['availableDiskCategory'] = available_disk_category
    __args__['availableInstanceType'] = available_instance_type
    __args__['availableResourceCreation'] = available_resource_creation
    __args__['availableSlbAddressIpVersion'] = available_slb_address_ip_version
    __args__['availableSlbAddressType'] = available_slb_address_type
    __args__['enableDetails'] = enable_details
    __args__['instanceChargeType'] = instance_charge_type
    __args__['multi'] = multi
    __args__['networkType'] = network_type
    __args__['outputFile'] = output_file
    __args__['spotStrategy'] = spot_strategy
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:index/getZones:getZones', __args__, opts=opts, typ=GetZonesResult).value

    return AwaitableGetZonesResult(
        available_disk_category=pulumi.get(__ret__, 'available_disk_category'),
        available_instance_type=pulumi.get(__ret__, 'available_instance_type'),
        available_resource_creation=pulumi.get(__ret__, 'available_resource_creation'),
        available_slb_address_ip_version=pulumi.get(__ret__, 'available_slb_address_ip_version'),
        available_slb_address_type=pulumi.get(__ret__, 'available_slb_address_type'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_charge_type=pulumi.get(__ret__, 'instance_charge_type'),
        multi=pulumi.get(__ret__, 'multi'),
        network_type=pulumi.get(__ret__, 'network_type'),
        output_file=pulumi.get(__ret__, 'output_file'),
        spot_strategy=pulumi.get(__ret__, 'spot_strategy'),
        zones=pulumi.get(__ret__, 'zones'))


@_utilities.lift_output_func(get_zones)
def get_zones_output(available_disk_category: Optional[pulumi.Input[Optional[str]]] = None,
                     available_instance_type: Optional[pulumi.Input[Optional[str]]] = None,
                     available_resource_creation: Optional[pulumi.Input[Optional[str]]] = None,
                     available_slb_address_ip_version: Optional[pulumi.Input[Optional[str]]] = None,
                     available_slb_address_type: Optional[pulumi.Input[Optional[str]]] = None,
                     enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                     instance_charge_type: Optional[pulumi.Input[Optional[str]]] = None,
                     multi: Optional[pulumi.Input[Optional[bool]]] = None,
                     network_type: Optional[pulumi.Input[Optional[str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                     spot_strategy: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetZonesResult]:
    """
    This data source provides availability zones that can be accessed by an Alibaba Cloud account within the region configured in the provider.

    > **NOTE:** If one zone is sold out, it will not be exported.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    zones_ds = alicloud.get_zones(available_disk_category="cloud_ssd",
        available_instance_type="ecs.n4.large")
    ```


    :param str available_disk_category: Filter the results by a specific disk category. Can be either `cloud`, `cloud_efficiency`, `cloud_ssd`, `ephemeral_ssd`.
    :param str available_instance_type: Filter the results by a specific instance type.
    :param str available_resource_creation: Filter the results by a specific resource type.
           Valid values: `Instance`, `Disk`, `VSwitch`, `Rds`, `KVStore`, `FunctionCompute`, `Elasticsearch`, `Slb`.
           
           > **NOTE:** From version 1.134.0, the `available_resource_creation` value "Rds" has been deprecated.
           If you want to fetch the available zones for RDS instance, you can use datasource alicloud_db_zones
    :param str available_slb_address_ip_version: Filter the results by a slb instance address version. Can be either `ipv4`, or `ipv6`.
           
           > **NOTE:** The disk category `cloud` has been outdated and can only be used by non-I/O Optimized ECS instances. Many availability zones don't support it. It is recommended to use `cloud_efficiency` or `cloud_ssd`.
    :param str available_slb_address_type: Filter the results by a slb instance address type. Can be either `Vpc`, `classic_internet` or `classic_intranet`
    :param bool enable_details: Default to false and only output `id` in the `zones` block. Set it to true can output more details.
    :param str instance_charge_type: Filter the results by a specific ECS instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
    :param bool multi: Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
    :param str network_type: Filter the results by a specific network type. Valid values: `Classic` and `Vpc`.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str spot_strategy: - (Optional) Filter the results by a specific ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
    """
    ...
