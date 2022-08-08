# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'DbInstanceDbInstanceIpArray',
    'GetDbInstancesInstanceResult',
    'GetDbInstancesInstanceDbInstanceIpArrayResult',
]

@pulumi.output_type
class DbInstanceDbInstanceIpArray(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "dbInstanceIpArrayAttribute":
            suggest = "db_instance_ip_array_attribute"
        elif key == "dbInstanceIpArrayName":
            suggest = "db_instance_ip_array_name"
        elif key == "securityIps":
            suggest = "security_ips"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DbInstanceDbInstanceIpArray. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DbInstanceDbInstanceIpArray.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DbInstanceDbInstanceIpArray.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 db_instance_ip_array_attribute: Optional[str] = None,
                 db_instance_ip_array_name: Optional[str] = None,
                 security_ips: Optional[str] = None):
        """
        :param str db_instance_ip_array_attribute: The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        :param str db_instance_ip_array_name: IP ADDRESS whitelist group name.
        :param str security_ips: IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        if db_instance_ip_array_attribute is not None:
            pulumi.set(__self__, "db_instance_ip_array_attribute", db_instance_ip_array_attribute)
        if db_instance_ip_array_name is not None:
            pulumi.set(__self__, "db_instance_ip_array_name", db_instance_ip_array_name)
        if security_ips is not None:
            pulumi.set(__self__, "security_ips", security_ips)

    @property
    @pulumi.getter(name="dbInstanceIpArrayAttribute")
    def db_instance_ip_array_attribute(self) -> Optional[str]:
        """
        The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        """
        return pulumi.get(self, "db_instance_ip_array_attribute")

    @property
    @pulumi.getter(name="dbInstanceIpArrayName")
    def db_instance_ip_array_name(self) -> Optional[str]:
        """
        IP ADDRESS whitelist group name.
        """
        return pulumi.get(self, "db_instance_ip_array_name")

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> Optional[str]:
        """
        IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        return pulumi.get(self, "security_ips")


@pulumi.output_type
class GetDbInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 connection_string: str,
                 create_time: str,
                 current_minor_version: str,
                 db_instance_category: str,
                 db_instance_cpu: str,
                 db_instance_description: str,
                 db_instance_id: str,
                 db_instance_ip_arrays: Sequence['outputs.GetDbInstancesInstanceDbInstanceIpArrayResult'],
                 db_instance_memory: str,
                 db_instance_network_type: str,
                 db_instance_storage_type: str,
                 db_instance_type: str,
                 db_node_class: str,
                 db_node_count: str,
                 db_node_storage: str,
                 db_version: str,
                 expire_time: str,
                 expired: str,
                 id: str,
                 latest_minor_version: str,
                 lock_mode: str,
                 lock_reason: str,
                 maintain_time: str,
                 master_db_instance_id: str,
                 payment_type: str,
                 port: int,
                 public_connection_string: str,
                 public_port: int,
                 read_only_db_instance_ids: Sequence[str],
                 status: str,
                 vpc_id: str,
                 vswitch_id: str,
                 zone_id: str):
        """
        :param str connection_string: Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
        :param str create_time: Creation time, which follows the format of `YYYY-MM-DD 'T'hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
        :param str current_minor_version: The current kernel image version.
        :param str db_instance_category: The category of the db instance.
        :param str db_instance_cpu: For example, instances can be grouped according to Cpu core count.
        :param str db_instance_description: According to the practical example or notes.
        :param str db_instance_id: The ID of the instance.
        :param Sequence['GetDbInstancesInstanceDbInstanceIpArrayArgs'] db_instance_ip_arrays: IP ADDRESS whitelist for the instance group list.
        :param str db_instance_memory: Instance memory, which is measured in MB.
        :param str db_instance_network_type: The network type of the db instance.
        :param str db_instance_storage_type: Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`.
        :param str db_instance_type: The type of the db instance.
        :param str db_node_class: The class of the db node.
        :param str db_node_count: The count of the db node.
        :param str db_node_storage: Instance storage space, which is measured in GB.
        :param str db_version: Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
        :param str expire_time: The instance after it expires time for subscription instance.
        :param str expired: The expire status of the db instance.
        :param str id: The ID of the Db Instance.
        :param str latest_minor_version: The latest kernel image version.
        :param str lock_mode: Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
        :param str lock_reason: An instance is locked the reason.
        :param str maintain_time: Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
        :param str master_db_instance_id: The master instance ID of the db instance.
        :param str payment_type: The paymen type of the resource.
        :param int port: Application Port.
        :param str public_connection_string: The public connection string ID of the resource.
        :param int public_port: The public port ID of the resource.
        :param Sequence[str] read_only_db_instance_ids: The array of the readonly db instances.
        :param str status: Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
        :param str vpc_id: The vpc id of the db instance.
        :param str vswitch_id: The vswitch id.
        :param str zone_id: The zone ID of the resource.
        """
        pulumi.set(__self__, "connection_string", connection_string)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "current_minor_version", current_minor_version)
        pulumi.set(__self__, "db_instance_category", db_instance_category)
        pulumi.set(__self__, "db_instance_cpu", db_instance_cpu)
        pulumi.set(__self__, "db_instance_description", db_instance_description)
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        pulumi.set(__self__, "db_instance_ip_arrays", db_instance_ip_arrays)
        pulumi.set(__self__, "db_instance_memory", db_instance_memory)
        pulumi.set(__self__, "db_instance_network_type", db_instance_network_type)
        pulumi.set(__self__, "db_instance_storage_type", db_instance_storage_type)
        pulumi.set(__self__, "db_instance_type", db_instance_type)
        pulumi.set(__self__, "db_node_class", db_node_class)
        pulumi.set(__self__, "db_node_count", db_node_count)
        pulumi.set(__self__, "db_node_storage", db_node_storage)
        pulumi.set(__self__, "db_version", db_version)
        pulumi.set(__self__, "expire_time", expire_time)
        pulumi.set(__self__, "expired", expired)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "latest_minor_version", latest_minor_version)
        pulumi.set(__self__, "lock_mode", lock_mode)
        pulumi.set(__self__, "lock_reason", lock_reason)
        pulumi.set(__self__, "maintain_time", maintain_time)
        pulumi.set(__self__, "master_db_instance_id", master_db_instance_id)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "public_connection_string", public_connection_string)
        pulumi.set(__self__, "public_port", public_port)
        pulumi.set(__self__, "read_only_db_instance_ids", read_only_db_instance_ids)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> str:
        """
        Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Creation time, which follows the format of `YYYY-MM-DD 'T'hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="currentMinorVersion")
    def current_minor_version(self) -> str:
        """
        The current kernel image version.
        """
        return pulumi.get(self, "current_minor_version")

    @property
    @pulumi.getter(name="dbInstanceCategory")
    def db_instance_category(self) -> str:
        """
        The category of the db instance.
        """
        return pulumi.get(self, "db_instance_category")

    @property
    @pulumi.getter(name="dbInstanceCpu")
    def db_instance_cpu(self) -> str:
        """
        For example, instances can be grouped according to Cpu core count.
        """
        return pulumi.get(self, "db_instance_cpu")

    @property
    @pulumi.getter(name="dbInstanceDescription")
    def db_instance_description(self) -> str:
        """
        According to the practical example or notes.
        """
        return pulumi.get(self, "db_instance_description")

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> str:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="dbInstanceIpArrays")
    def db_instance_ip_arrays(self) -> Sequence['outputs.GetDbInstancesInstanceDbInstanceIpArrayResult']:
        """
        IP ADDRESS whitelist for the instance group list.
        """
        return pulumi.get(self, "db_instance_ip_arrays")

    @property
    @pulumi.getter(name="dbInstanceMemory")
    def db_instance_memory(self) -> str:
        """
        Instance memory, which is measured in MB.
        """
        return pulumi.get(self, "db_instance_memory")

    @property
    @pulumi.getter(name="dbInstanceNetworkType")
    def db_instance_network_type(self) -> str:
        """
        The network type of the db instance.
        """
        return pulumi.get(self, "db_instance_network_type")

    @property
    @pulumi.getter(name="dbInstanceStorageType")
    def db_instance_storage_type(self) -> str:
        """
        Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`.
        """
        return pulumi.get(self, "db_instance_storage_type")

    @property
    @pulumi.getter(name="dbInstanceType")
    def db_instance_type(self) -> str:
        """
        The type of the db instance.
        """
        return pulumi.get(self, "db_instance_type")

    @property
    @pulumi.getter(name="dbNodeClass")
    def db_node_class(self) -> str:
        """
        The class of the db node.
        """
        return pulumi.get(self, "db_node_class")

    @property
    @pulumi.getter(name="dbNodeCount")
    def db_node_count(self) -> str:
        """
        The count of the db node.
        """
        return pulumi.get(self, "db_node_count")

    @property
    @pulumi.getter(name="dbNodeStorage")
    def db_node_storage(self) -> str:
        """
        Instance storage space, which is measured in GB.
        """
        return pulumi.get(self, "db_node_storage")

    @property
    @pulumi.getter(name="dbVersion")
    def db_version(self) -> str:
        """
        Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
        """
        return pulumi.get(self, "db_version")

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> str:
        """
        The instance after it expires time for subscription instance.
        """
        return pulumi.get(self, "expire_time")

    @property
    @pulumi.getter
    def expired(self) -> str:
        """
        The expire status of the db instance.
        """
        return pulumi.get(self, "expired")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Db Instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="latestMinorVersion")
    def latest_minor_version(self) -> str:
        """
        The latest kernel image version.
        """
        return pulumi.get(self, "latest_minor_version")

    @property
    @pulumi.getter(name="lockMode")
    def lock_mode(self) -> str:
        """
        Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
        """
        return pulumi.get(self, "lock_mode")

    @property
    @pulumi.getter(name="lockReason")
    def lock_reason(self) -> str:
        """
        An instance is locked the reason.
        """
        return pulumi.get(self, "lock_reason")

    @property
    @pulumi.getter(name="maintainTime")
    def maintain_time(self) -> str:
        """
        Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
        """
        return pulumi.get(self, "maintain_time")

    @property
    @pulumi.getter(name="masterDbInstanceId")
    def master_db_instance_id(self) -> str:
        """
        The master instance ID of the db instance.
        """
        return pulumi.get(self, "master_db_instance_id")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        """
        The paymen type of the resource.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Application Port.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="publicConnectionString")
    def public_connection_string(self) -> str:
        """
        The public connection string ID of the resource.
        """
        return pulumi.get(self, "public_connection_string")

    @property
    @pulumi.getter(name="publicPort")
    def public_port(self) -> int:
        """
        The public port ID of the resource.
        """
        return pulumi.get(self, "public_port")

    @property
    @pulumi.getter(name="readOnlyDbInstanceIds")
    def read_only_db_instance_ids(self) -> Sequence[str]:
        """
        The array of the readonly db instances.
        """
        return pulumi.get(self, "read_only_db_instance_ids")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        The vpc id of the db instance.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        The vswitch id.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The zone ID of the resource.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetDbInstancesInstanceDbInstanceIpArrayResult(dict):
    def __init__(__self__, *,
                 db_instance_ip_array_attribute: Optional[str] = None,
                 db_instance_ip_array_name: Optional[str] = None,
                 security_ips: Optional[str] = None):
        """
        :param str db_instance_ip_array_attribute: The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        :param str db_instance_ip_array_name: IP ADDRESS whitelist group name.
        :param str security_ips: IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        if db_instance_ip_array_attribute is not None:
            pulumi.set(__self__, "db_instance_ip_array_attribute", db_instance_ip_array_attribute)
        if db_instance_ip_array_name is not None:
            pulumi.set(__self__, "db_instance_ip_array_name", db_instance_ip_array_name)
        if security_ips is not None:
            pulumi.set(__self__, "security_ips", security_ips)

    @property
    @pulumi.getter(name="dbInstanceIpArrayAttribute")
    def db_instance_ip_array_attribute(self) -> Optional[str]:
        """
        The default is empty. To distinguish between the different property console does not display a `hidden` label grouping.
        """
        return pulumi.get(self, "db_instance_ip_array_attribute")

    @property
    @pulumi.getter(name="dbInstanceIpArrayName")
    def db_instance_ip_array_name(self) -> Optional[str]:
        """
        IP ADDRESS whitelist group name.
        """
        return pulumi.get(self, "db_instance_ip_array_name")

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> Optional[str]:
        """
        IP ADDRESS whitelist addresses in the IP ADDRESS list, and a maximum of 1000 comma-separated format is as follows: `0.0.0.0/0` and `10.23.12.24`(IP) or `10.23.12.24/24`(CIDR mode, CIDR (Classless Inter-Domain Routing)/24 represents the address prefixes in the length of the range [1,32]).
        """
        return pulumi.get(self, "security_ips")


