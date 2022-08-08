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
    'GetAccessGroupsGroupResult',
    'GetAccessRulesRuleResult',
    'GetAutoSnapshotPoliciesPolicyResult',
    'GetDataFlowsFlowResult',
    'GetFileSystemsSystemResult',
    'GetFilesetsFilesetResult',
    'GetLifecyclePoliciesPolicyResult',
    'GetMountTargetsTargetResult',
    'GetSnapshotsSnapshotResult',
    'GetZonesZoneResult',
    'GetZonesZoneInstanceTypeResult',
]

@pulumi.output_type
class GetAccessGroupsGroupResult(dict):
    def __init__(__self__, *,
                 access_group_name: str,
                 access_group_type: str,
                 description: str,
                 id: str,
                 mount_target_count: int,
                 rule_count: int,
                 type: str):
        """
        :param str access_group_name: The name of access group.
        :param str access_group_type: Filter results by a specific AccessGroupType.
        :param str description: Filter results by a specific Description.
        :param str id: This ID of this AccessGroup. It is formatted to ``<access_group_id>:<file_system_type>``. Before version 1.95.0, the value is `access_group_name`.
        :param int mount_target_count: MountTargetCount block of the AccessGroup
        :param int rule_count: RuleCount of the AccessGroup.
        :param str type: Field `type` has been deprecated from version 1.95.0. Use `access_group_type` instead.
        """
        pulumi.set(__self__, "access_group_name", access_group_name)
        pulumi.set(__self__, "access_group_type", access_group_type)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_target_count", mount_target_count)
        pulumi.set(__self__, "rule_count", rule_count)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> str:
        """
        The name of access group.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="accessGroupType")
    def access_group_type(self) -> str:
        """
        Filter results by a specific AccessGroupType.
        """
        return pulumi.get(self, "access_group_type")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Filter results by a specific Description.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        This ID of this AccessGroup. It is formatted to ``<access_group_id>:<file_system_type>``. Before version 1.95.0, the value is `access_group_name`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountTargetCount")
    def mount_target_count(self) -> int:
        """
        MountTargetCount block of the AccessGroup
        """
        return pulumi.get(self, "mount_target_count")

    @property
    @pulumi.getter(name="ruleCount")
    def rule_count(self) -> int:
        """
        RuleCount of the AccessGroup.
        """
        return pulumi.get(self, "rule_count")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Field `type` has been deprecated from version 1.95.0. Use `access_group_type` instead.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetAccessRulesRuleResult(dict):
    def __init__(__self__, *,
                 access_rule_id: str,
                 priority: int,
                 rw_access: str,
                 source_cidr_ip: str,
                 user_access: str):
        """
        :param str access_rule_id: AccessRuleId of the AccessRule.
        :param int priority: Priority of the AccessRule.
        :param str rw_access: Filter results by a specific RWAccess.
        :param str source_cidr_ip: Filter results by a specific SourceCidrIp.
        :param str user_access: Filter results by a specific UserAccess.
        """
        pulumi.set(__self__, "access_rule_id", access_rule_id)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "rw_access", rw_access)
        pulumi.set(__self__, "source_cidr_ip", source_cidr_ip)
        pulumi.set(__self__, "user_access", user_access)

    @property
    @pulumi.getter(name="accessRuleId")
    def access_rule_id(self) -> str:
        """
        AccessRuleId of the AccessRule.
        """
        return pulumi.get(self, "access_rule_id")

    @property
    @pulumi.getter
    def priority(self) -> int:
        """
        Priority of the AccessRule.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="rwAccess")
    def rw_access(self) -> str:
        """
        Filter results by a specific RWAccess.
        """
        return pulumi.get(self, "rw_access")

    @property
    @pulumi.getter(name="sourceCidrIp")
    def source_cidr_ip(self) -> str:
        """
        Filter results by a specific SourceCidrIp.
        """
        return pulumi.get(self, "source_cidr_ip")

    @property
    @pulumi.getter(name="userAccess")
    def user_access(self) -> str:
        """
        Filter results by a specific UserAccess.
        """
        return pulumi.get(self, "user_access")


@pulumi.output_type
class GetAutoSnapshotPoliciesPolicyResult(dict):
    def __init__(__self__, *,
                 auto_snapshot_policy_id: str,
                 auto_snapshot_policy_name: str,
                 create_time: str,
                 file_system_nums: int,
                 id: str,
                 repeat_weekdays: Sequence[str],
                 retention_days: int,
                 status: str,
                 time_points: Sequence[str]):
        """
        :param str auto_snapshot_policy_id: The ID of the automatic snapshot policy.
        :param str auto_snapshot_policy_name: The name of the automatic snapshot policy.
        :param str create_time: The time when the automatic snapshot policy was created.
        :param int file_system_nums: The number of file systems to which the automatic snapshot policy applies.
        :param str id: ID of the Auto Snapshot Policy.
        :param Sequence[str] repeat_weekdays: The day on which an auto snapshot was created.
        :param int retention_days: The number of days for which you want to retain auto snapshots.
        :param str status: The status of the automatic snapshot policy. Valid values: `Creating`, `Available`.
        :param Sequence[str] time_points: The point in time at which an auto snapshot was created. Unit: hours.
        """
        pulumi.set(__self__, "auto_snapshot_policy_id", auto_snapshot_policy_id)
        pulumi.set(__self__, "auto_snapshot_policy_name", auto_snapshot_policy_name)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "file_system_nums", file_system_nums)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "repeat_weekdays", repeat_weekdays)
        pulumi.set(__self__, "retention_days", retention_days)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "time_points", time_points)

    @property
    @pulumi.getter(name="autoSnapshotPolicyId")
    def auto_snapshot_policy_id(self) -> str:
        """
        The ID of the automatic snapshot policy.
        """
        return pulumi.get(self, "auto_snapshot_policy_id")

    @property
    @pulumi.getter(name="autoSnapshotPolicyName")
    def auto_snapshot_policy_name(self) -> str:
        """
        The name of the automatic snapshot policy.
        """
        return pulumi.get(self, "auto_snapshot_policy_name")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The time when the automatic snapshot policy was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="fileSystemNums")
    def file_system_nums(self) -> int:
        """
        The number of file systems to which the automatic snapshot policy applies.
        """
        return pulumi.get(self, "file_system_nums")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the Auto Snapshot Policy.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="repeatWeekdays")
    def repeat_weekdays(self) -> Sequence[str]:
        """
        The day on which an auto snapshot was created.
        """
        return pulumi.get(self, "repeat_weekdays")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> int:
        """
        The number of days for which you want to retain auto snapshots.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the automatic snapshot policy. Valid values: `Creating`, `Available`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="timePoints")
    def time_points(self) -> Sequence[str]:
        """
        The point in time at which an auto snapshot was created. Unit: hours.
        """
        return pulumi.get(self, "time_points")


@pulumi.output_type
class GetDataFlowsFlowResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 data_flow_id: str,
                 description: str,
                 error_message: str,
                 file_system_id: str,
                 file_system_path: str,
                 fset_description: str,
                 fset_id: str,
                 id: str,
                 source_security_type: str,
                 source_storage: str,
                 status: str,
                 throughput: int):
        """
        :param str create_time: The time when Fileset was created. Executing the ISO8601 standard means that the return format is: 'yyyy-MM-ddTHH:mm:ssZ'.
        :param str data_flow_id: The ID of the Data Flow.
        :param str description: The Description of data flow.
        :param str error_message: Error message.
        :param str file_system_id: The ID of the file system.
        :param str file_system_path: The path of Fileset in the CPFS file system.
        :param str fset_description: Description of automatic update.
        :param str fset_id: The ID of the Fileset.
        :param str id: The resource ID of the data flow. The value formats as `<file_system_id>:<data_flow_id>`.
        :param str source_security_type: The security protection type of the source storage.
        :param str source_storage: The access path of the source store. Format: `<storage type>://<path>`.
        :param str status: The status of the Data flow.
        :param int throughput: The maximum transmission bandwidth of data flow, unit: `MB/s`.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "data_flow_id", data_flow_id)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "error_message", error_message)
        pulumi.set(__self__, "file_system_id", file_system_id)
        pulumi.set(__self__, "file_system_path", file_system_path)
        pulumi.set(__self__, "fset_description", fset_description)
        pulumi.set(__self__, "fset_id", fset_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "source_security_type", source_security_type)
        pulumi.set(__self__, "source_storage", source_storage)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "throughput", throughput)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The time when Fileset was created. Executing the ISO8601 standard means that the return format is: 'yyyy-MM-ddTHH:mm:ssZ'.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dataFlowId")
    def data_flow_id(self) -> str:
        """
        The ID of the Data Flow.
        """
        return pulumi.get(self, "data_flow_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description of data flow.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        Error message.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter(name="fileSystemPath")
    def file_system_path(self) -> str:
        """
        The path of Fileset in the CPFS file system.
        """
        return pulumi.get(self, "file_system_path")

    @property
    @pulumi.getter(name="fsetDescription")
    def fset_description(self) -> str:
        """
        Description of automatic update.
        """
        return pulumi.get(self, "fset_description")

    @property
    @pulumi.getter(name="fsetId")
    def fset_id(self) -> str:
        """
        The ID of the Fileset.
        """
        return pulumi.get(self, "fset_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The resource ID of the data flow. The value formats as `<file_system_id>:<data_flow_id>`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="sourceSecurityType")
    def source_security_type(self) -> str:
        """
        The security protection type of the source storage.
        """
        return pulumi.get(self, "source_security_type")

    @property
    @pulumi.getter(name="sourceStorage")
    def source_storage(self) -> str:
        """
        The access path of the source store. Format: `<storage type>://<path>`.
        """
        return pulumi.get(self, "source_storage")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the Data flow.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def throughput(self) -> int:
        """
        The maximum transmission bandwidth of data flow, unit: `MB/s`.
        """
        return pulumi.get(self, "throughput")


@pulumi.output_type
class GetFileSystemsSystemResult(dict):
    def __init__(__self__, *,
                 capacity: int,
                 create_time: str,
                 description: str,
                 encrypt_type: int,
                 file_system_type: str,
                 id: str,
                 kms_key_id: str,
                 metered_size: int,
                 protocol_type: str,
                 region_id: str,
                 storage_type: str,
                 zone_id: str):
        """
        :param int capacity: (Optional, Available in v1.140.0+) The capacity of the file system.
        :param str create_time: Time of creation.
        :param str description: Description of the FileSystem.
        :param int encrypt_type: (Optional, Available in v1.121.2+) Whether the file system is encrypted. 
               * Valid values:
               * `0`: The file system is not encrypted.
               * `1`: The file system is encrypted with a managed secret key.
               * `2`: User management key.
        :param str file_system_type: The type of the file system.
               Valid values:
               `standard` (Default),
               `extreme`.
        :param str id: ID of the FileSystem.
        :param str kms_key_id: (Optional, Available in v1.140.0+) The id of the KMS key.
        :param int metered_size: MeteredSize of the FileSystem.
        :param str protocol_type: The protocol type of the file system.
               Valid values:
               `NFS`,
               `SMB` (Available when the `file_system_type` is `standard`).
        :param str region_id: ID of the region where the FileSystem is located.
        :param str storage_type: The storage type of the file system.
               * Valid values:
        :param str zone_id: (Optional, Available in v1.140.0+) The id of the zone. Each region consists of multiple isolated locations known as zones. Each zone has an independent power supply and network.
        """
        pulumi.set(__self__, "capacity", capacity)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "encrypt_type", encrypt_type)
        pulumi.set(__self__, "file_system_type", file_system_type)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "kms_key_id", kms_key_id)
        pulumi.set(__self__, "metered_size", metered_size)
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "region_id", region_id)
        pulumi.set(__self__, "storage_type", storage_type)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def capacity(self) -> int:
        """
        (Optional, Available in v1.140.0+) The capacity of the file system.
        """
        return pulumi.get(self, "capacity")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        Time of creation.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the FileSystem.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> int:
        """
        (Optional, Available in v1.121.2+) Whether the file system is encrypted. 
        * Valid values:
        * `0`: The file system is not encrypted.
        * `1`: The file system is encrypted with a managed secret key.
        * `2`: User management key.
        """
        return pulumi.get(self, "encrypt_type")

    @property
    @pulumi.getter(name="fileSystemType")
    def file_system_type(self) -> str:
        """
        The type of the file system.
        Valid values:
        `standard` (Default),
        `extreme`.
        """
        return pulumi.get(self, "file_system_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the FileSystem.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> str:
        """
        (Optional, Available in v1.140.0+) The id of the KMS key.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="meteredSize")
    def metered_size(self) -> int:
        """
        MeteredSize of the FileSystem.
        """
        return pulumi.get(self, "metered_size")

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> str:
        """
        The protocol type of the file system.
        Valid values:
        `NFS`,
        `SMB` (Available when the `file_system_type` is `standard`).
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        ID of the region where the FileSystem is located.
        """
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        """
        The storage type of the file system.
        * Valid values:
        """
        return pulumi.get(self, "storage_type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        (Optional, Available in v1.140.0+) The id of the zone. Each region consists of multiple isolated locations known as zones. Each zone has an independent power supply and network.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetFilesetsFilesetResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 description: str,
                 file_system_id: str,
                 file_system_path: str,
                 fileset_id: str,
                 id: str,
                 status: str,
                 update_time: str):
        """
        :param str create_time: The time when Fileset was created.
        :param str description: Description of Fileset.
        :param str file_system_id: The ID of the file system.
        :param str file_system_path: The path of Fileset.
        :param str fileset_id: The first ID of the resource.
        :param str id: The ID of the Fileset.
        :param str status: The status of the fileset.
        :param str update_time: The latest update time of Fileset.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "file_system_id", file_system_id)
        pulumi.set(__self__, "file_system_path", file_system_path)
        pulumi.set(__self__, "fileset_id", fileset_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "update_time", update_time)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The time when Fileset was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of Fileset.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter(name="fileSystemPath")
    def file_system_path(self) -> str:
        """
        The path of Fileset.
        """
        return pulumi.get(self, "file_system_path")

    @property
    @pulumi.getter(name="filesetId")
    def fileset_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "fileset_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Fileset.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the fileset.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> str:
        """
        The latest update time of Fileset.
        """
        return pulumi.get(self, "update_time")


@pulumi.output_type
class GetLifecyclePoliciesPolicyResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 file_system_id: str,
                 id: str,
                 lifecycle_policy_name: str,
                 lifecycle_rule_name: str,
                 paths: Sequence[str],
                 storage_type: str):
        """
        :param str create_time: The time when the lifecycle management policy was created.
        :param str file_system_id: The ID of the file system.
        :param str id: The ID of the Lifecycle Policy. Its value is same as Queue Name.
        :param str lifecycle_policy_name: The name of the lifecycle management policy.
        :param str lifecycle_rule_name: The rules in the lifecycle management policy.
        :param Sequence[str] paths: The list of absolute paths for multiple directories. In this case, you can associate a lifecycle management policy with each directory.
        :param str storage_type: The storage type of the data that is dumped to the IA storage medium.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "file_system_id", file_system_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "lifecycle_policy_name", lifecycle_policy_name)
        pulumi.set(__self__, "lifecycle_rule_name", lifecycle_rule_name)
        pulumi.set(__self__, "paths", paths)
        pulumi.set(__self__, "storage_type", storage_type)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The time when the lifecycle management policy was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="fileSystemId")
    def file_system_id(self) -> str:
        """
        The ID of the file system.
        """
        return pulumi.get(self, "file_system_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Lifecycle Policy. Its value is same as Queue Name.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lifecyclePolicyName")
    def lifecycle_policy_name(self) -> str:
        """
        The name of the lifecycle management policy.
        """
        return pulumi.get(self, "lifecycle_policy_name")

    @property
    @pulumi.getter(name="lifecycleRuleName")
    def lifecycle_rule_name(self) -> str:
        """
        The rules in the lifecycle management policy.
        """
        return pulumi.get(self, "lifecycle_rule_name")

    @property
    @pulumi.getter
    def paths(self) -> Sequence[str]:
        """
        The list of absolute paths for multiple directories. In this case, you can associate a lifecycle management policy with each directory.
        """
        return pulumi.get(self, "paths")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        """
        The storage type of the data that is dumped to the IA storage medium.
        """
        return pulumi.get(self, "storage_type")


@pulumi.output_type
class GetMountTargetsTargetResult(dict):
    def __init__(__self__, *,
                 access_group_name: str,
                 id: str,
                 mount_target_domain: str,
                 network_type: str,
                 status: str,
                 type: str,
                 vpc_id: str,
                 vswitch_id: str):
        """
        :param str access_group_name: Filter results by a specific AccessGroupName.
        :param str id: ID of the MountTargetDomain.
        :param str mount_target_domain: Field `mount_target_domain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
        :param str network_type: Filter results by a specific NetworkType.
        :param str status: Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
        :param str type: Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        :param str vpc_id: Filter results by a specific VpcId.
        :param str vswitch_id: Filter results by a specific VSwitchId.
        """
        pulumi.set(__self__, "access_group_name", access_group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "mount_target_domain", mount_target_domain)
        pulumi.set(__self__, "network_type", network_type)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "vpc_id", vpc_id)
        pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> str:
        """
        Filter results by a specific AccessGroupName.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        ID of the MountTargetDomain.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="mountTargetDomain")
    def mount_target_domain(self) -> str:
        """
        Field `mount_target_domain` has been deprecated from provider version 1.53.0. New field `ids` replaces it.
        """
        return pulumi.get(self, "mount_target_domain")

    @property
    @pulumi.getter(name="networkType")
    def network_type(self) -> str:
        """
        Filter results by a specific NetworkType.
        """
        return pulumi.get(self, "network_type")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Filter results by the status of mount target. Valid values: `Active`, `Inactive` and `Pending`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Field `type` has been deprecated from provider version 1.95.0. New field `network_type` replaces it.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        Filter results by a specific VpcId.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> str:
        """
        Filter results by a specific VSwitchId.
        """
        return pulumi.get(self, "vswitch_id")


@pulumi.output_type
class GetSnapshotsSnapshotResult(dict):
    def __init__(__self__, *,
                 create_time: str,
                 description: str,
                 encrypt_type: int,
                 id: str,
                 progress: str,
                 remain_time: int,
                 retention_days: int,
                 snapshot_id: str,
                 snapshot_name: str,
                 source_file_system_id: str,
                 source_file_system_size: str,
                 source_file_system_version: str,
                 status: str):
        """
        :param str create_time: The creation time of the resource.
        :param str description: The description of the snapshot.
        :param int encrypt_type: The type of the encryption.
        :param str id: The ID of the Snapshot.
        :param str progress: The progress of the snapshot creation. The value of this parameter is expressed as a percentage.
        :param int remain_time: The remaining time that is required to create the snapshot. Unit: seconds.
        :param int retention_days: The retention period of the automatic snapshot. Unit: days.
        :param str snapshot_id: The ID of the resource.
        :param str snapshot_name: The name of the snapshot.
        :param str source_file_system_id: The ID of the source file system.
        :param str source_file_system_size: The capacity of the source file system. Unit: GiB.
        :param str source_file_system_version: The version of the source file system.
        :param str status: The status of the snapshot.
        """
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "encrypt_type", encrypt_type)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "progress", progress)
        pulumi.set(__self__, "remain_time", remain_time)
        pulumi.set(__self__, "retention_days", retention_days)
        pulumi.set(__self__, "snapshot_id", snapshot_id)
        pulumi.set(__self__, "snapshot_name", snapshot_name)
        pulumi.set(__self__, "source_file_system_id", source_file_system_id)
        pulumi.set(__self__, "source_file_system_size", source_file_system_size)
        pulumi.set(__self__, "source_file_system_version", source_file_system_version)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> str:
        """
        The creation time of the resource.
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
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> int:
        """
        The type of the encryption.
        """
        return pulumi.get(self, "encrypt_type")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Snapshot.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def progress(self) -> str:
        """
        The progress of the snapshot creation. The value of this parameter is expressed as a percentage.
        """
        return pulumi.get(self, "progress")

    @property
    @pulumi.getter(name="remainTime")
    def remain_time(self) -> int:
        """
        The remaining time that is required to create the snapshot. Unit: seconds.
        """
        return pulumi.get(self, "remain_time")

    @property
    @pulumi.getter(name="retentionDays")
    def retention_days(self) -> int:
        """
        The retention period of the automatic snapshot. Unit: days.
        """
        return pulumi.get(self, "retention_days")

    @property
    @pulumi.getter(name="snapshotId")
    def snapshot_id(self) -> str:
        """
        The ID of the resource.
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
    @pulumi.getter(name="sourceFileSystemId")
    def source_file_system_id(self) -> str:
        """
        The ID of the source file system.
        """
        return pulumi.get(self, "source_file_system_id")

    @property
    @pulumi.getter(name="sourceFileSystemSize")
    def source_file_system_size(self) -> str:
        """
        The capacity of the source file system. Unit: GiB.
        """
        return pulumi.get(self, "source_file_system_size")

    @property
    @pulumi.getter(name="sourceFileSystemVersion")
    def source_file_system_version(self) -> str:
        """
        The version of the source file system.
        """
        return pulumi.get(self, "source_file_system_version")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the snapshot.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetZonesZoneResult(dict):
    def __init__(__self__, *,
                 instance_types: Sequence['outputs.GetZonesZoneInstanceTypeResult'],
                 zone_id: str):
        """
        :param Sequence['GetZonesZoneInstanceTypeArgs'] instance_types: A list of instance type information collection
        :param str zone_id: String to filter results by zone id.
        """
        pulumi.set(__self__, "instance_types", instance_types)
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> Sequence['outputs.GetZonesZoneInstanceTypeResult']:
        """
        A list of instance type information collection
        """
        return pulumi.get(self, "instance_types")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        String to filter results by zone id.
        """
        return pulumi.get(self, "zone_id")


@pulumi.output_type
class GetZonesZoneInstanceTypeResult(dict):
    def __init__(__self__, *,
                 protocol_type: str,
                 storage_type: str):
        """
        :param str protocol_type: File transfer protocol type. Valid values:
        :param str storage_type: The storage type of the nas zones. Valid values:
        """
        pulumi.set(__self__, "protocol_type", protocol_type)
        pulumi.set(__self__, "storage_type", storage_type)

    @property
    @pulumi.getter(name="protocolType")
    def protocol_type(self) -> str:
        """
        File transfer protocol type. Valid values:
        """
        return pulumi.get(self, "protocol_type")

    @property
    @pulumi.getter(name="storageType")
    def storage_type(self) -> str:
        """
        The storage type of the nas zones. Valid values:
        """
        return pulumi.get(self, "storage_type")


