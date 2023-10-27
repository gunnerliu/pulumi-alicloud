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
    'InstanceEcsList',
    'GetAutoSnapShotPoliciesAutoSnapShotPolicyResult',
    'GetInstancesInstanceResult',
    'GetInstancesInstanceEcsListResult',
    'GetSnapshotsSnapshotResult',
]

@pulumi.output_type
class InstanceEcsList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "ecsId":
            suggest = "ecs_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceEcsList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceEcsList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceEcsList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 ecs_id: Optional[str] = None):
        """
        :param str ecs_id: The ID of the ECS instance.
        """
        if ecs_id is not None:
            pulumi.set(__self__, "ecs_id", ecs_id)

    @property
    @pulumi.getter(name="ecsId")
    def ecs_id(self) -> Optional[str]:
        """
        The ID of the ECS instance.
        """
        return pulumi.get(self, "ecs_id")


@pulumi.output_type
class GetAutoSnapShotPoliciesAutoSnapShotPolicyResult(dict):
    def __init__(__self__, *,
                 applied_dbfs_number: int,
                 create_time: str,
                 id: str,
                 last_modified: str,
                 policy_id: str,
                 policy_name: str,
                 repeat_weekdays: Sequence[str],
                 retention_days: int,
                 status: str,
                 status_detail: str,
                 time_points: Sequence[str]):
        """
        :param int applied_dbfs_number: The number of database file systems set by the automatic snapshot policy.
        :param str create_time: The creation time of the resource
        :param str id: The ID of the policy.
        :param str last_modified: Last modification time of automatic snapshot policy
        :param str policy_id: Automatic snapshot policy ID
        :param str policy_name: Automatic snapshot policy name
        :param Sequence[str] repeat_weekdays: A collection of automatic snapshots performed on several days of the week.
        :param int retention_days: Automatic snapshot retention days
        :param str status: Automatic snapshot policy status
        :param str status_detail: Automatic snapshot policy status details
        :param Sequence[str] time_points: The set of times at which the snapshot is taken on the day the automatic snapshot is executed.
        """
        pulumi.set(__self__, "applied_dbfs_number", applied_dbfs_number)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_modified", last_modified)
        pulumi.set(__self__, "policy_id", policy_id)
        pulumi.set(__self__, "policy_name", policy_name)
        pulumi.set(__self__, "repeat_weekdays", repeat_weekdays)
        pulumi.set(__self__, "retention_days", retention_days)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "status_detail", status_detail)
        pulumi.set(__self__, "time_points", time_points)

    @property
    @pulumi.getter(name="appliedDbfsNumber")
    def applied_dbfs_number(self) -> int:
        """
        The number of database file systems set by the automatic snapshot policy.
        """
        return pulumi.get(self, "applied_dbfs_number")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the resource
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the policy.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> str:
        """
        Last modification time of automatic snapshot policy
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> str:
        """
        Automatic snapshot policy ID
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> str:
        """
        Automatic snapshot policy name
        """
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter(name="repeatWeekdays")
    def repeat_weekdays(self) -> Sequence[str]:
        """
        A collection of automatic snapshots performed on several days of the week.
        """
        return pulumi.get(self, "repeat_weekdays")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> int:
        """
        Automatic snapshot retention days
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Automatic snapshot policy status
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="statusDetail")
    def status_detail(self) -> str:
        """
        Automatic snapshot policy status details
        """
        return pulumi.get(self, "status_detail")

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> Sequence[str]:
        """
        The set of times at which the snapshot is taken on the day the automatic snapshot is executed.
        """
        return pulumi.get(self, "time_points")


@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 attach_node_number: int,
                 category: str,
                 create_time: str,
                 dbfs_cluster_id: str,
                 ecs_lists: Sequence['outputs.GetInstancesInstanceEcsListResult'],
                 enable_raid: bool,
                 encryption: bool,
                 id: str,
                 instance_id: str,
                 instance_name: str,
                 kms_key_id: str,
                 payment_type: str,
                 performance_level: str,
                 raid_stripe_unit_number: str,
                 size: int,
                 status: str,
                 zone_id: str):
        """
        :param int attach_node_number: the number of nodes of the Database file system.
        :param str category: The type of the Database file system. Valid values: `standard`.
        :param str create_time: The create time of the Database file system.
        :param str dbfs_cluster_id: The cluster ID of the Database file system.
        :param Sequence['GetInstancesInstanceEcsListArgs'] ecs_lists: The collection of ECS instances mounted to the Database file system.
        :param bool enable_raid: Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        :param bool encryption: Whether to encrypt the Database file system. Valid values: `true` and `false`.
        :param str id: The ID of the Instance.
        :param str instance_id: The ID of the Database File System
        :param str instance_name: The name of the Database file system.
        :param str kms_key_id: The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        :param str payment_type: Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
        :param str performance_level: The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        :param str raid_stripe_unit_number: The number of strip . When `enable_raid` parameter is set to `true` will transfer. This parameter is valid When `enable_raid` parameter is set to `true`.
        :param int size: The size Of the Database file system. Unit: GiB.
        :param str status: The status of the Database file system.
        :param str zone_id: The Zone ID of the Database file system.
        """
        pulumi.set(__self__, "attach_node_number", attach_node_number)
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "dbfs_cluster_id", dbfs_cluster_id)
        pulumi.set(__self__, "ecs_lists", ecs_lists)
        pulumi.set(__self__, "enable_raid", enable_raid)
        pulumi.set(__self__, "encryption", encryption)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "kms_key_id", kms_key_id)
        pulumi.set(__self__, "payment_type", payment_type)
        pulumi.set(__self__, "performance_level", performance_level)
        pulumi.set(__self__, "raid_stripe_unit_number", raid_stripe_unit_number)
        pulumi.set(__self__, "size", size)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="attachNodeNumber")
    def attach_node_number(self) -> int:
        """
        the number of nodes of the Database file system.
        """
        return pulumi.get(self, "attach_node_number")

    @property
    @pulumi.getter
    def category(self) -> str:
        """
        The type of the Database file system. Valid values: `standard`.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The create time of the Database file system.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dbfsClusterId")
    def dbfs_cluster_id(self) -> str:
        """
        The cluster ID of the Database file system.
        """
        return pulumi.get(self, "dbfs_cluster_id")

    @property
    @pulumi.getter(name="ecsLists")
    def ecs_lists(self) -> Sequence['outputs.GetInstancesInstanceEcsListResult']:
        """
        The collection of ECS instances mounted to the Database file system.
        """
        return pulumi.get(self, "ecs_lists")

    @property
    @pulumi.getter(name="enableRaid")
    def enable_raid(self) -> bool:
        """
        Whether to create the Database file system in RAID way. Valid values : `true` anf `false`.
        """
        return pulumi.get(self, "enable_raid")

    @property
    @pulumi.getter
    def encryption(self) -> bool:
        """
        Whether to encrypt the Database file system. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "encryption")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Instance.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of the Database File System
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> str:
        """
        The name of the Database file system.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> str:
        """
        The KMS key ID of the Database file system used. This parameter is valid When `encryption` parameter is set to `true`.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> str:
        """
        Thr payment type of the Database file system. Valid value: `PayAsYouGo`.
        """
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="performanceLevel")
    def performance_level(self) -> str:
        """
        The performance level of the Database file system. Valid values: `PL0`, `PL1`, `PL2`, `PL3`.
        """
        return pulumi.get(self, "performance_level")

    @property
    @pulumi.getter(name="raidStripeUnitNumber")
    def raid_stripe_unit_number(self) -> str:
        """
        The number of strip . When `enable_raid` parameter is set to `true` will transfer. This parameter is valid When `enable_raid` parameter is set to `true`.
        """
        return pulumi.get(self, "raid_stripe_unit_number")

    @property
    @pulumi.getter
    def size(self) -> int:
        """
        The size Of the Database file system. Unit: GiB.
        """
        return pulumi.get(self, "size")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Database file system.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The Zone ID of the Database file system.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetInstancesInstanceEcsListResult(dict):
    def __init__(__self__, *,
                 ecs_id: str):
        """
        :param str ecs_id: The ID of the ECS instance.
        """
        pulumi.set(__self__, "ecs_id", ecs_id)

    @property
    @pulumi.getter(name="ecsId")
    def ecs_id(self) -> str:
        """
        The ID of the ECS instance.
        """
        return pulumi.get(self, "ecs_id")


@pulumi.output_type
class GetSnapshotsSnapshotResult(dict):
    def __init__(__self__, *,
                 category: str,
                 create_time: str,
                 description: str,
                 id: str,
                 instance_id: str,
                 last_modified_time: str,
                 progress: str,
                 remain_time: int,
                 retention_days: int,
                 snapshot_id: str,
                 snapshot_name: str,
                 snapshot_type: str,
                 source_fs_size: int,
                 status: str):
        """
        :param str category: The type of the Snapshot.
        :param str create_time: The creation time of the snapshot.
        :param str description: The description of the snapshot.
        :param str id: The ID of the Snapshot.
        :param str instance_id: The ID of the database file system.
        :param str last_modified_time: The last modification time of the snapshot.
        :param str progress: The progress of the snapshot.
        :param int remain_time: The remaining completion time of the snapshot being created, in seconds.
        :param int retention_days: The retention days of the snapshot.
        :param str snapshot_id: The ID of the snapshot.
        :param str snapshot_name: The name of the snapshot.
        :param str snapshot_type: The creation of the snapshot.
        :param int source_fs_size: Source database file system capacity.
        :param str status: The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
        """
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "last_modified_time", last_modified_time)
        pulumi.set(__self__, "progress", progress)
        pulumi.set(__self__, "remain_time", remain_time)
        pulumi.set(__self__, "retention_days", retention_days)
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        pulumi.set(__self__, "snapshot_name", snapshot_name)
        pulumi.set(__self__, "snapshot_type", snapshot_type)
        pulumi.set(__self__, "source_fs_size", source_fs_size)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def category(self) -> str:
        """
        The type of the Snapshot.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the snapshot.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the snapshot.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Snapshot.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of the database file system.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="lastModifiedTime")
    def last_modified_time(self) -> str:
        """
        The last modification time of the snapshot.
        """
        return pulumi.get(self, "last_modified_time")

    @property
    @pulumi.getter
    def progress(self) -> str:
        """
        The progress of the snapshot.
        """
        return pulumi.get(self, "progress")

    @property
    @pulumi.getter(name="remainTime")
    def remain_time(self) -> int:
        """
        The remaining completion time of the snapshot being created, in seconds.
        """
        return pulumi.get(self, "remain_time")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> int:
        """
        The retention days of the snapshot.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        """
        The ID of the snapshot.
        """
        return pulumi.get(self, "snapshot_id")

    @property
    @pulumi.getter(name="snapshotName")
    def snapshot_name(self) -> str:
        """
        The name of the snapshot.
        """
        return pulumi.get(self, "snapshot_name")

    @property
    @pulumi.getter(name="snapshotType")
    def snapshot_type(self) -> str:
        """
        The creation of the snapshot.
        """
        return pulumi.get(self, "snapshot_type")

    @property
    @pulumi.getter(name="sourceFsSize")
    def source_fs_size(self) -> int:
        """
        Source database file system capacity.
        """
        return pulumi.get(self, "source_fs_size")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the snapshot. Possible values: `progressing`, `accomplished`, `failed`.
        """
        return pulumi.get(self, "status")


