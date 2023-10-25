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
    'OtsBackupPlanOtsDetailArgs',
    'OtsBackupPlanRuleArgs',
    'RestoreJobOtsDetailArgs',
    'ServerBackupPlanDetailArgs',
    'GetBackupJobsFilterArgs',
    'GetServerBackupPlansFilterArgs',
]

@pulumi.input_type
class OtsBackupPlanOtsDetailArgs:
    def __init__(__self__, *,
                 table_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] table_names: The names of the destination tables in the Tablestore instance. **Note:** Required while source_type equals `OTS_TABLE`.
        """
        OtsBackupPlanOtsDetailArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            table_names=table_names,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             table_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if table_names is None and 'tableNames' in kwargs:
            table_names = kwargs['tableNames']

        if table_names is not None:
            _setter("table_names", table_names)

    @property
    @pulumi.getter(name="tableNames")
    def table_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The names of the destination tables in the Tablestore instance. **Note:** Required while source_type equals `OTS_TABLE`.
        """
        return pulumi.get(self, "table_names")

    @table_names.setter
    def table_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "table_names", value)


@pulumi.input_type
class OtsBackupPlanRuleArgs:
    def __init__(__self__, *,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 retention: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] backup_type: Backup type. Valid values: `COMPLETE`.
        :param pulumi.Input[bool] disabled: Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
        :param pulumi.Input[str] retention: Backup retention days, the minimum is 1.
        :param pulumi.Input[str] rule_name: The name of the backup rule.**Note:** Required while source_type equals `OTS_TABLE`. `rule_name` should be unique for the specific user.
        :param pulumi.Input[str] schedule: Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        """
        OtsBackupPlanRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            backup_type=backup_type,
            disabled=disabled,
            retention=retention,
            rule_name=rule_name,
            schedule=schedule,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             backup_type: Optional[pulumi.Input[str]] = None,
             disabled: Optional[pulumi.Input[bool]] = None,
             retention: Optional[pulumi.Input[str]] = None,
             rule_name: Optional[pulumi.Input[str]] = None,
             schedule: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if backup_type is None and 'backupType' in kwargs:
            backup_type = kwargs['backupType']
        if rule_name is None and 'ruleName' in kwargs:
            rule_name = kwargs['ruleName']

        if backup_type is not None:
            _setter("backup_type", backup_type)
        if disabled is not None:
            _setter("disabled", disabled)
        if retention is not None:
            _setter("retention", retention)
        if rule_name is not None:
            _setter("rule_name", rule_name)
        if schedule is not None:
            _setter("schedule", schedule)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        Backup type. Valid values: `COMPLETE`.
        """
        return pulumi.get(self, "backup_type")

    @backup_type.setter
    def backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_type", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[str]]:
        """
        Backup retention days, the minimum is 1.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "retention", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the backup rule.**Note:** Required while source_type equals `OTS_TABLE`. `rule_name` should be unique for the specific user.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)


@pulumi.input_type
class RestoreJobOtsDetailArgs:
    def __init__(__self__, *,
                 overwrite_existing: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[bool] overwrite_existing: Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
        """
        RestoreJobOtsDetailArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            overwrite_existing=overwrite_existing,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             overwrite_existing: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if overwrite_existing is None and 'overwriteExisting' in kwargs:
            overwrite_existing = kwargs['overwriteExisting']

        if overwrite_existing is not None:
            _setter("overwrite_existing", overwrite_existing)

    @property
    @pulumi.getter(name="overwriteExisting")
    def overwrite_existing(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "overwrite_existing")

    @overwrite_existing.setter
    def overwrite_existing(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "overwrite_existing", value)


@pulumi.input_type
class ServerBackupPlanDetailArgs:
    def __init__(__self__, *,
                 app_consistent: pulumi.Input[bool],
                 snapshot_group: pulumi.Input[bool],
                 destination_region_id: Optional[pulumi.Input[str]] = None,
                 destination_retention: Optional[pulumi.Input[int]] = None,
                 disk_id_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 do_copy: Optional[pulumi.Input[bool]] = None,
                 enable_fs_freeze: Optional[pulumi.Input[bool]] = None,
                 post_script_path: Optional[pulumi.Input[str]] = None,
                 pre_script_path: Optional[pulumi.Input[str]] = None,
                 timeout_in_seconds: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[bool] app_consistent: Whether to turn on application consistency. The application consistency snapshot backs up memory data and ongoing database transactions at the time of snapshot creation to ensure the consistency of application system data and database transactions. By applying consistent snapshots, there is no data damage or loss, so as to avoid log rollback during database startup and ensure that the application is in a consistent startup state. Valid values: `true`, `false`.
        :param pulumi.Input[bool] snapshot_group: Whether to turn on file system consistency. If SnapshotGroup is true, when AppConsistent is true but the relevant conditions are not met or AppConsistent is false, the resulting snapshot will be a file system consistency snapshot. The file system consistency ensures that the file system memory and disk information are synchronized at the time of snapshot creation, and the file system write operation is frozen to make the file system in a consistent state. The file system consistency snapshot can prevent the operating system from performing disk inspection and repair operations such as CHKDSK or fsck after restart. Valid values: `true`, `false`.
        :param pulumi.Input[str] destination_region_id: Only vaild when DoCopy is true. The destination region ID when replicating to another region. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        :param pulumi.Input[int] destination_retention: Only vaild when DoCopy is true. The retention days of the destination backup. When not specified, the destination backup will be saved permanently. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] disk_id_lists: The list of cloud disks to be backed up in the ECS instance. When not specified, a snapshot is executed for all the disks on the ECS instance.
        :param pulumi.Input[bool] do_copy: Whether replicate to another region. Valid values: `true`, `false`.
        :param pulumi.Input[bool] enable_fs_freeze: Only the Linux system is valid. Whether to use the Linux FsFreeze mechanism to ensure that the file system is read-only consistent before creating a storage snapshot. The default is True. Valid values: `true`, `false`.
        :param pulumi.Input[str] post_script_path: Only vaild for the linux system when AppConsistent is true. The application thaw script path (e.g. /tmp/postscript.sh). The postscript.sh script must meet the following conditions: in terms of permissions, only the root user as the owner has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
        :param pulumi.Input[str] pre_script_path: Only vaild for the linux system when AppConsistent is true. Apply the freeze script path (e.g. /tmp/prescript.sh). prescript.sh scripts must meet the following conditions: in terms of permissions, only root, as the owner, has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
        :param pulumi.Input[int] timeout_in_seconds: Only the Linux system is valid, and the IO freeze timeout period. The default is 30 seconds.
        """
        ServerBackupPlanDetailArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            app_consistent=app_consistent,
            snapshot_group=snapshot_group,
            destination_region_id=destination_region_id,
            destination_retention=destination_retention,
            disk_id_lists=disk_id_lists,
            do_copy=do_copy,
            enable_fs_freeze=enable_fs_freeze,
            post_script_path=post_script_path,
            pre_script_path=pre_script_path,
            timeout_in_seconds=timeout_in_seconds,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             app_consistent: Optional[pulumi.Input[bool]] = None,
             snapshot_group: Optional[pulumi.Input[bool]] = None,
             destination_region_id: Optional[pulumi.Input[str]] = None,
             destination_retention: Optional[pulumi.Input[int]] = None,
             disk_id_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             do_copy: Optional[pulumi.Input[bool]] = None,
             enable_fs_freeze: Optional[pulumi.Input[bool]] = None,
             post_script_path: Optional[pulumi.Input[str]] = None,
             pre_script_path: Optional[pulumi.Input[str]] = None,
             timeout_in_seconds: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if app_consistent is None and 'appConsistent' in kwargs:
            app_consistent = kwargs['appConsistent']
        if app_consistent is None:
            raise TypeError("Missing 'app_consistent' argument")
        if snapshot_group is None and 'snapshotGroup' in kwargs:
            snapshot_group = kwargs['snapshotGroup']
        if snapshot_group is None:
            raise TypeError("Missing 'snapshot_group' argument")
        if destination_region_id is None and 'destinationRegionId' in kwargs:
            destination_region_id = kwargs['destinationRegionId']
        if destination_retention is None and 'destinationRetention' in kwargs:
            destination_retention = kwargs['destinationRetention']
        if disk_id_lists is None and 'diskIdLists' in kwargs:
            disk_id_lists = kwargs['diskIdLists']
        if do_copy is None and 'doCopy' in kwargs:
            do_copy = kwargs['doCopy']
        if enable_fs_freeze is None and 'enableFsFreeze' in kwargs:
            enable_fs_freeze = kwargs['enableFsFreeze']
        if post_script_path is None and 'postScriptPath' in kwargs:
            post_script_path = kwargs['postScriptPath']
        if pre_script_path is None and 'preScriptPath' in kwargs:
            pre_script_path = kwargs['preScriptPath']
        if timeout_in_seconds is None and 'timeoutInSeconds' in kwargs:
            timeout_in_seconds = kwargs['timeoutInSeconds']

        _setter("app_consistent", app_consistent)
        _setter("snapshot_group", snapshot_group)
        if destination_region_id is not None:
            _setter("destination_region_id", destination_region_id)
        if destination_retention is not None:
            _setter("destination_retention", destination_retention)
        if disk_id_lists is not None:
            _setter("disk_id_lists", disk_id_lists)
        if do_copy is not None:
            _setter("do_copy", do_copy)
        if enable_fs_freeze is not None:
            _setter("enable_fs_freeze", enable_fs_freeze)
        if post_script_path is not None:
            _setter("post_script_path", post_script_path)
        if pre_script_path is not None:
            _setter("pre_script_path", pre_script_path)
        if timeout_in_seconds is not None:
            _setter("timeout_in_seconds", timeout_in_seconds)

    @property
    @pulumi.getter(name="appConsistent")
    def app_consistent(self) -> pulumi.Input[bool]:
        """
        Whether to turn on application consistency. The application consistency snapshot backs up memory data and ongoing database transactions at the time of snapshot creation to ensure the consistency of application system data and database transactions. By applying consistent snapshots, there is no data damage or loss, so as to avoid log rollback during database startup and ensure that the application is in a consistent startup state. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "app_consistent")

    @app_consistent.setter
    def app_consistent(self, value: pulumi.Input[bool]):
        pulumi.set(self, "app_consistent", value)

    @property
    @pulumi.getter(name="snapshotGroup")
    def snapshot_group(self) -> pulumi.Input[bool]:
        """
        Whether to turn on file system consistency. If SnapshotGroup is true, when AppConsistent is true but the relevant conditions are not met or AppConsistent is false, the resulting snapshot will be a file system consistency snapshot. The file system consistency ensures that the file system memory and disk information are synchronized at the time of snapshot creation, and the file system write operation is frozen to make the file system in a consistent state. The file system consistency snapshot can prevent the operating system from performing disk inspection and repair operations such as CHKDSK or fsck after restart. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "snapshot_group")

    @snapshot_group.setter
    def snapshot_group(self, value: pulumi.Input[bool]):
        pulumi.set(self, "snapshot_group", value)

    @property
    @pulumi.getter(name="destinationRegionId")
    def destination_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        Only vaild when DoCopy is true. The destination region ID when replicating to another region. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        """
        return pulumi.get(self, "destination_region_id")

    @destination_region_id.setter
    def destination_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_region_id", value)

    @property
    @pulumi.getter(name="destinationRetention")
    def destination_retention(self) -> Optional[pulumi.Input[int]]:
        """
        Only vaild when DoCopy is true. The retention days of the destination backup. When not specified, the destination backup will be saved permanently. **Note:** Once you set a value of this property, you cannot set it to an empty string anymore.
        """
        return pulumi.get(self, "destination_retention")

    @destination_retention.setter
    def destination_retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "destination_retention", value)

    @property
    @pulumi.getter(name="diskIdLists")
    def disk_id_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of cloud disks to be backed up in the ECS instance. When not specified, a snapshot is executed for all the disks on the ECS instance.
        """
        return pulumi.get(self, "disk_id_lists")

    @disk_id_lists.setter
    def disk_id_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "disk_id_lists", value)

    @property
    @pulumi.getter(name="doCopy")
    def do_copy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether replicate to another region. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "do_copy")

    @do_copy.setter
    def do_copy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "do_copy", value)

    @property
    @pulumi.getter(name="enableFsFreeze")
    def enable_fs_freeze(self) -> Optional[pulumi.Input[bool]]:
        """
        Only the Linux system is valid. Whether to use the Linux FsFreeze mechanism to ensure that the file system is read-only consistent before creating a storage snapshot. The default is True. Valid values: `true`, `false`.
        """
        return pulumi.get(self, "enable_fs_freeze")

    @enable_fs_freeze.setter
    def enable_fs_freeze(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_fs_freeze", value)

    @property
    @pulumi.getter(name="postScriptPath")
    def post_script_path(self) -> Optional[pulumi.Input[str]]:
        """
        Only vaild for the linux system when AppConsistent is true. The application thaw script path (e.g. /tmp/postscript.sh). The postscript.sh script must meet the following conditions: in terms of permissions, only the root user as the owner has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
        """
        return pulumi.get(self, "post_script_path")

    @post_script_path.setter
    def post_script_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "post_script_path", value)

    @property
    @pulumi.getter(name="preScriptPath")
    def pre_script_path(self) -> Optional[pulumi.Input[str]]:
        """
        Only vaild for the linux system when AppConsistent is true. Apply the freeze script path (e.g. /tmp/prescript.sh). prescript.sh scripts must meet the following conditions: in terms of permissions, only root, as the owner, has read, write, and execute permissions, that is, 700 permissions. In terms of content, the script content needs to be customized according to the application itself. This indicates that this parameter must be set when creating an application consistency snapshot for a Linux instance. If the script is set incorrectly (for example, permissions, save path, or file name are set incorrectly), the resulting snapshot is a file system consistency snapshot.
        """
        return pulumi.get(self, "pre_script_path")

    @pre_script_path.setter
    def pre_script_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pre_script_path", value)

    @property
    @pulumi.getter(name="timeoutInSeconds")
    def timeout_in_seconds(self) -> Optional[pulumi.Input[int]]:
        """
        Only the Linux system is valid, and the IO freeze timeout period. The default is 30 seconds.
        """
        return pulumi.get(self, "timeout_in_seconds")

    @timeout_in_seconds.setter
    def timeout_in_seconds(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timeout_in_seconds", value)


@pulumi.input_type
class GetBackupJobsFilterArgs:
    def __init__(__self__, *,
                 key: Optional[str] = None,
                 operator: Optional[str] = None,
                 values: Optional[Sequence[str]] = None):
        """
        :param str key: The key of the field to filter. Valid values: `PlanId`, `VaultId`, `InstanceId`, `Bucket`, `FileSystemId`, `CompleteTime`.
        :param str operator: The operator of the field to filter. Valid values: `EQUAL`, `NOT_EQUAL`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`, `IN`.
        :param Sequence[str] values: Set of values that are accepted for the given field.
               
               > **NOTE:** Numeric types such as `CompleteTime` do not support `IN` operations for the time being.
        """
        GetBackupJobsFilterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            operator=operator,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             operator: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if key is not None:
            _setter("key", key)
        if operator is not None:
            _setter("operator", operator)
        if values is not None:
            _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> Optional[str]:
        """
        The key of the field to filter. Valid values: `PlanId`, `VaultId`, `InstanceId`, `Bucket`, `FileSystemId`, `CompleteTime`.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def operator(self) -> Optional[str]:
        """
        The operator of the field to filter. Valid values: `EQUAL`, `NOT_EQUAL`, `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`, `LESS_THAN_OR_EQUAL`, `BETWEEN`, `IN`.
        """
        return pulumi.get(self, "operator")

    @operator.setter
    def operator(self, value: Optional[str]):
        pulumi.set(self, "operator", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[str]]:
        """
        Set of values that are accepted for the given field.

        > **NOTE:** Numeric types such as `CompleteTime` do not support `IN` operations for the time being.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "values", value)


@pulumi.input_type
class GetServerBackupPlansFilterArgs:
    def __init__(__self__, *,
                 key: Optional[str] = None,
                 values: Optional[Sequence[str]] = None):
        """
        :param str key: The key of the field to filter. Valid values: `planId`, `instanceId`, `planName`.
        :param Sequence[str] values: Set of values that are accepted for the given field.
        """
        GetServerBackupPlansFilterArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            values=values,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[str] = None,
             values: Optional[Sequence[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):

        if key is not None:
            _setter("key", key)
        if values is not None:
            _setter("values", values)

    @property
    @pulumi.getter
    def key(self) -> Optional[str]:
        """
        The key of the field to filter. Valid values: `planId`, `instanceId`, `planName`.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def values(self) -> Optional[Sequence[str]]:
        """
        Set of values that are accepted for the given field.
        """
        return pulumi.get(self, "values")

    @values.setter
    def values(self, value: Optional[Sequence[str]]):
        pulumi.set(self, "values", value)


