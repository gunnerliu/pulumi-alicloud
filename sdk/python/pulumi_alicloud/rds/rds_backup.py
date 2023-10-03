# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RdsBackupArgs', 'RdsBackup']

@pulumi.input_type
class RdsBackupArgs:
    def __init__(__self__, *,
                 db_instance_id: pulumi.Input[str],
                 backup_method: Optional[pulumi.Input[str]] = None,
                 backup_strategy: Optional[pulumi.Input[str]] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 remove_from_state: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a RdsBackup resource.
        :param pulumi.Input[str] db_instance_id: The db instance id.
        :param pulumi.Input[str] backup_method: The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        :param pulumi.Input[str] backup_strategy: The policy that you want to use for the backup task. Valid values:
               * **db**: specifies to perform a database-level backup.
               * **instance**: specifies to perform an instance-level backup.
        :param pulumi.Input[str] backup_type: The method that you want to use for the backup task. Default value: `Auto`. Valid values:
               * **Auto**: specifies to automatically perform a full or incremental backup.
               * **FullBackup**: specifies to perform a full backup.
        :param pulumi.Input[str] db_name: The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        :param pulumi.Input[bool] remove_from_state: Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        """
        RdsBackupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            db_instance_id=db_instance_id,
            backup_method=backup_method,
            backup_strategy=backup_strategy,
            backup_type=backup_type,
            db_name=db_name,
            remove_from_state=remove_from_state,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             db_instance_id: pulumi.Input[str],
             backup_method: Optional[pulumi.Input[str]] = None,
             backup_strategy: Optional[pulumi.Input[str]] = None,
             backup_type: Optional[pulumi.Input[str]] = None,
             db_name: Optional[pulumi.Input[str]] = None,
             remove_from_state: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("db_instance_id", db_instance_id)
        if backup_method is not None:
            _setter("backup_method", backup_method)
        if backup_strategy is not None:
            _setter("backup_strategy", backup_strategy)
        if backup_type is not None:
            _setter("backup_type", backup_type)
        if db_name is not None:
            _setter("db_name", db_name)
        if remove_from_state is not None:
            _setter("remove_from_state", remove_from_state)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[str]:
        """
        The db instance id.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="backupMethod")
    def backup_method(self) -> Optional[pulumi.Input[str]]:
        """
        The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        """
        return pulumi.get(self, "backup_method")

    @backup_method.setter
    def backup_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_method", value)

    @property
    @pulumi.getter(name="backupStrategy")
    def backup_strategy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy that you want to use for the backup task. Valid values:
        * **db**: specifies to perform a database-level backup.
        * **instance**: specifies to perform an instance-level backup.
        """
        return pulumi.get(self, "backup_strategy")

    @backup_strategy.setter
    def backup_strategy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_strategy", value)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        * **Auto**: specifies to automatically perform a full or incremental backup.
        * **FullBackup**: specifies to perform a full backup.
        """
        return pulumi.get(self, "backup_type")

    @backup_type.setter
    def backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_type", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> Optional[pulumi.Input[str]]:
        """
        The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_name", value)

    @property
    @pulumi.getter(name="removeFromState")
    def remove_from_state(self) -> Optional[pulumi.Input[bool]]:
        """
        Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "remove_from_state")

    @remove_from_state.setter
    def remove_from_state(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "remove_from_state", value)


@pulumi.input_type
class _RdsBackupState:
    def __init__(__self__, *,
                 backup_id: Optional[pulumi.Input[str]] = None,
                 backup_method: Optional[pulumi.Input[str]] = None,
                 backup_strategy: Optional[pulumi.Input[str]] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 remove_from_state: Optional[pulumi.Input[bool]] = None,
                 store_status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RdsBackup resources.
        :param pulumi.Input[str] backup_id: The backup id.
        :param pulumi.Input[str] backup_method: The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        :param pulumi.Input[str] backup_strategy: The policy that you want to use for the backup task. Valid values:
               * **db**: specifies to perform a database-level backup.
               * **instance**: specifies to perform an instance-level backup.
        :param pulumi.Input[str] backup_type: The method that you want to use for the backup task. Default value: `Auto`. Valid values:
               * **Auto**: specifies to automatically perform a full or incremental backup.
               * **FullBackup**: specifies to perform a full backup.
        :param pulumi.Input[str] db_instance_id: The db instance id.
        :param pulumi.Input[str] db_name: The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        :param pulumi.Input[bool] remove_from_state: Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        :param pulumi.Input[str] store_status: Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        """
        _RdsBackupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            backup_id=backup_id,
            backup_method=backup_method,
            backup_strategy=backup_strategy,
            backup_type=backup_type,
            db_instance_id=db_instance_id,
            db_name=db_name,
            remove_from_state=remove_from_state,
            store_status=store_status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             backup_id: Optional[pulumi.Input[str]] = None,
             backup_method: Optional[pulumi.Input[str]] = None,
             backup_strategy: Optional[pulumi.Input[str]] = None,
             backup_type: Optional[pulumi.Input[str]] = None,
             db_instance_id: Optional[pulumi.Input[str]] = None,
             db_name: Optional[pulumi.Input[str]] = None,
             remove_from_state: Optional[pulumi.Input[bool]] = None,
             store_status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if backup_id is not None:
            _setter("backup_id", backup_id)
        if backup_method is not None:
            _setter("backup_method", backup_method)
        if backup_strategy is not None:
            _setter("backup_strategy", backup_strategy)
        if backup_type is not None:
            _setter("backup_type", backup_type)
        if db_instance_id is not None:
            _setter("db_instance_id", db_instance_id)
        if db_name is not None:
            _setter("db_name", db_name)
        if remove_from_state is not None:
            _setter("remove_from_state", remove_from_state)
        if store_status is not None:
            _setter("store_status", store_status)

    @property
    @pulumi.getter(name="backupId")
    def backup_id(self) -> Optional[pulumi.Input[str]]:
        """
        The backup id.
        """
        return pulumi.get(self, "backup_id")

    @backup_id.setter
    def backup_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_id", value)

    @property
    @pulumi.getter(name="backupMethod")
    def backup_method(self) -> Optional[pulumi.Input[str]]:
        """
        The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        """
        return pulumi.get(self, "backup_method")

    @backup_method.setter
    def backup_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_method", value)

    @property
    @pulumi.getter(name="backupStrategy")
    def backup_strategy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy that you want to use for the backup task. Valid values:
        * **db**: specifies to perform a database-level backup.
        * **instance**: specifies to perform an instance-level backup.
        """
        return pulumi.get(self, "backup_strategy")

    @backup_strategy.setter
    def backup_strategy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_strategy", value)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        * **Auto**: specifies to automatically perform a full or incremental backup.
        * **FullBackup**: specifies to perform a full backup.
        """
        return pulumi.get(self, "backup_type")

    @backup_type.setter
    def backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_type", value)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The db instance id.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> Optional[pulumi.Input[str]]:
        """
        The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_name", value)

    @property
    @pulumi.getter(name="removeFromState")
    def remove_from_state(self) -> Optional[pulumi.Input[bool]]:
        """
        Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "remove_from_state")

    @remove_from_state.setter
    def remove_from_state(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "remove_from_state", value)

    @property
    @pulumi.getter(name="storeStatus")
    def store_status(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        """
        return pulumi.get(self, "store_status")

    @store_status.setter
    def store_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "store_status", value)


class RdsBackup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_method: Optional[pulumi.Input[str]] = None,
                 backup_strategy: Optional[pulumi.Input[str]] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 remove_from_state: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a RDS Backup resource.

        For information about RDS Backup and how to use it, see [What is Backup](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createbackup).

        > **NOTE:** Available since v1.149.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.rds.Instance("exampleInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.t1.small",
            instance_storage=30,
            instance_charge_type="Postpaid",
            db_instance_storage_type="local_ssd")
        example_rds_backup = alicloud.rds.RdsBackup("exampleRdsBackup", db_instance_id=example_instance.id)
        ```

        ## Import

        RDS Backup can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/rdsBackup:RdsBackup example <db_instance_id>:<backup_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backup_method: The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        :param pulumi.Input[str] backup_strategy: The policy that you want to use for the backup task. Valid values:
               * **db**: specifies to perform a database-level backup.
               * **instance**: specifies to perform an instance-level backup.
        :param pulumi.Input[str] backup_type: The method that you want to use for the backup task. Default value: `Auto`. Valid values:
               * **Auto**: specifies to automatically perform a full or incremental backup.
               * **FullBackup**: specifies to perform a full backup.
        :param pulumi.Input[str] db_instance_id: The db instance id.
        :param pulumi.Input[str] db_name: The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        :param pulumi.Input[bool] remove_from_state: Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RdsBackupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RDS Backup resource.

        For information about RDS Backup and how to use it, see [What is Backup](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createbackup).

        > **NOTE:** Available since v1.149.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example_instance = alicloud.rds.Instance("exampleInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.t1.small",
            instance_storage=30,
            instance_charge_type="Postpaid",
            db_instance_storage_type="local_ssd")
        example_rds_backup = alicloud.rds.RdsBackup("exampleRdsBackup", db_instance_id=example_instance.id)
        ```

        ## Import

        RDS Backup can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/rdsBackup:RdsBackup example <db_instance_id>:<backup_id>
        ```

        :param str resource_name: The name of the resource.
        :param RdsBackupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RdsBackupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RdsBackupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_method: Optional[pulumi.Input[str]] = None,
                 backup_strategy: Optional[pulumi.Input[str]] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 remove_from_state: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RdsBackupArgs.__new__(RdsBackupArgs)

            __props__.__dict__["backup_method"] = backup_method
            __props__.__dict__["backup_strategy"] = backup_strategy
            __props__.__dict__["backup_type"] = backup_type
            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            __props__.__dict__["db_name"] = db_name
            __props__.__dict__["remove_from_state"] = remove_from_state
            __props__.__dict__["backup_id"] = None
            __props__.__dict__["store_status"] = None
        super(RdsBackup, __self__).__init__(
            'alicloud:rds/rdsBackup:RdsBackup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_id: Optional[pulumi.Input[str]] = None,
            backup_method: Optional[pulumi.Input[str]] = None,
            backup_strategy: Optional[pulumi.Input[str]] = None,
            backup_type: Optional[pulumi.Input[str]] = None,
            db_instance_id: Optional[pulumi.Input[str]] = None,
            db_name: Optional[pulumi.Input[str]] = None,
            remove_from_state: Optional[pulumi.Input[bool]] = None,
            store_status: Optional[pulumi.Input[str]] = None) -> 'RdsBackup':
        """
        Get an existing RdsBackup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backup_id: The backup id.
        :param pulumi.Input[str] backup_method: The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        :param pulumi.Input[str] backup_strategy: The policy that you want to use for the backup task. Valid values:
               * **db**: specifies to perform a database-level backup.
               * **instance**: specifies to perform an instance-level backup.
        :param pulumi.Input[str] backup_type: The method that you want to use for the backup task. Default value: `Auto`. Valid values:
               * **Auto**: specifies to automatically perform a full or incremental backup.
               * **FullBackup**: specifies to perform a full backup.
        :param pulumi.Input[str] db_instance_id: The db instance id.
        :param pulumi.Input[str] db_name: The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        :param pulumi.Input[bool] remove_from_state: Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        :param pulumi.Input[str] store_status: Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RdsBackupState.__new__(_RdsBackupState)

        __props__.__dict__["backup_id"] = backup_id
        __props__.__dict__["backup_method"] = backup_method
        __props__.__dict__["backup_strategy"] = backup_strategy
        __props__.__dict__["backup_type"] = backup_type
        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["db_name"] = db_name
        __props__.__dict__["remove_from_state"] = remove_from_state
        __props__.__dict__["store_status"] = store_status
        return RdsBackup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupId")
    def backup_id(self) -> pulumi.Output[str]:
        """
        The backup id.
        """
        return pulumi.get(self, "backup_id")

    @property
    @pulumi.getter(name="backupMethod")
    def backup_method(self) -> pulumi.Output[str]:
        """
        The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        """
        return pulumi.get(self, "backup_method")

    @property
    @pulumi.getter(name="backupStrategy")
    def backup_strategy(self) -> pulumi.Output[Optional[str]]:
        """
        The policy that you want to use for the backup task. Valid values:
        * **db**: specifies to perform a database-level backup.
        * **instance**: specifies to perform an instance-level backup.
        """
        return pulumi.get(self, "backup_strategy")

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> pulumi.Output[str]:
        """
        The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        * **Auto**: specifies to automatically perform a full or incremental backup.
        * **FullBackup**: specifies to perform a full backup.
        """
        return pulumi.get(self, "backup_type")

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[str]:
        """
        The db instance id.
        """
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> pulumi.Output[Optional[str]]:
        """
        The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        """
        return pulumi.get(self, "db_name")

    @property
    @pulumi.getter(name="removeFromState")
    def remove_from_state(self) -> pulumi.Output[Optional[bool]]:
        """
        Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "remove_from_state")

    @property
    @pulumi.getter(name="storeStatus")
    def store_status(self) -> pulumi.Output[str]:
        """
        Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        """
        return pulumi.get(self, "store_status")

