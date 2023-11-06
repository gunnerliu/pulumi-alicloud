# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RdsInstanceCrossBackupPolicyArgs', 'RdsInstanceCrossBackupPolicy']

@pulumi.input_type
class RdsInstanceCrossBackupPolicyArgs:
    def __init__(__self__, *,
                 cross_backup_region: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 log_backup_enabled: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a RdsInstanceCrossBackupPolicy resource.
        :param pulumi.Input[str] cross_backup_region: The ID of the destination region where the cross-region backup files of the instance are stored.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] log_backup_enabled: The status of the cross-region log backup feature on the instance. Valid values:
               - Enable: Enables the feature.
               - Disabled: Disables the feature.
        :param pulumi.Input[int] retention: The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        RdsInstanceCrossBackupPolicyArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cross_backup_region=cross_backup_region,
            instance_id=instance_id,
            log_backup_enabled=log_backup_enabled,
            retention=retention,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cross_backup_region: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             log_backup_enabled: Optional[pulumi.Input[str]] = None,
             retention: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cross_backup_region is None and 'crossBackupRegion' in kwargs:
            cross_backup_region = kwargs['crossBackupRegion']
        if cross_backup_region is None:
            raise TypeError("Missing 'cross_backup_region' argument")
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")
        if log_backup_enabled is None and 'logBackupEnabled' in kwargs:
            log_backup_enabled = kwargs['logBackupEnabled']

        _setter("cross_backup_region", cross_backup_region)
        _setter("instance_id", instance_id)
        if log_backup_enabled is not None:
            _setter("log_backup_enabled", log_backup_enabled)
        if retention is not None:
            _setter("retention", retention)

    @property
    @pulumi.getter(name="crossBackupRegion")
    def cross_backup_region(self) -> pulumi.Input[str]:
        """
        The ID of the destination region where the cross-region backup files of the instance are stored.
        """
        return pulumi.get(self, "cross_backup_region")

    @cross_backup_region.setter
    def cross_backup_region(self, value: pulumi.Input[str]):
        pulumi.set(self, "cross_backup_region", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="logBackupEnabled")
    def log_backup_enabled(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the cross-region log backup feature on the instance. Valid values:
        - Enable: Enables the feature.
        - Disabled: Disables the feature.
        """
        return pulumi.get(self, "log_backup_enabled")

    @log_backup_enabled.setter
    def log_backup_enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_backup_enabled", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention", value)


@pulumi.input_type
class _RdsInstanceCrossBackupPolicyState:
    def __init__(__self__, *,
                 backup_enabled: Optional[pulumi.Input[str]] = None,
                 backup_enabled_time: Optional[pulumi.Input[str]] = None,
                 cross_backup_region: Optional[pulumi.Input[str]] = None,
                 cross_backup_type: Optional[pulumi.Input[str]] = None,
                 db_instance_status: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 lock_mode: Optional[pulumi.Input[str]] = None,
                 log_backup_enabled: Optional[pulumi.Input[str]] = None,
                 log_backup_enabled_time: Optional[pulumi.Input[str]] = None,
                 retent_type: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering RdsInstanceCrossBackupPolicy resources.
        :param pulumi.Input[str] backup_enabled: The status of the overall cross-region backup switch on the instance. Valid values:
               - Disabled
               - Enable
        :param pulumi.Input[str] backup_enabled_time: The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param pulumi.Input[str] cross_backup_region: The ID of the destination region where the cross-region backup files of the instance are stored.
        :param pulumi.Input[str] cross_backup_type: The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
        :param pulumi.Input[str] db_instance_status: The state of the instance. For more information, see Instance status.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lock_mode: The lock status of the instance. Valid values:
               - Unlock: The instance is not locked.
               - ManualLock: The instance is manually locked.
               - LockByExpiration: The instance is locked upon expiration.
               - LockByRestoration: The instance is automatically locked before a rollback.
               - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
        :param pulumi.Input[str] log_backup_enabled: The status of the cross-region log backup feature on the instance. Valid values:
               - Enable: Enables the feature.
               - Disabled: Disables the feature.
        :param pulumi.Input[str] log_backup_enabled_time: The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param pulumi.Input[str] retent_type: The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
        :param pulumi.Input[int] retention: The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        _RdsInstanceCrossBackupPolicyState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            backup_enabled=backup_enabled,
            backup_enabled_time=backup_enabled_time,
            cross_backup_region=cross_backup_region,
            cross_backup_type=cross_backup_type,
            db_instance_status=db_instance_status,
            instance_id=instance_id,
            lock_mode=lock_mode,
            log_backup_enabled=log_backup_enabled,
            log_backup_enabled_time=log_backup_enabled_time,
            retent_type=retent_type,
            retention=retention,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             backup_enabled: Optional[pulumi.Input[str]] = None,
             backup_enabled_time: Optional[pulumi.Input[str]] = None,
             cross_backup_region: Optional[pulumi.Input[str]] = None,
             cross_backup_type: Optional[pulumi.Input[str]] = None,
             db_instance_status: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             lock_mode: Optional[pulumi.Input[str]] = None,
             log_backup_enabled: Optional[pulumi.Input[str]] = None,
             log_backup_enabled_time: Optional[pulumi.Input[str]] = None,
             retent_type: Optional[pulumi.Input[str]] = None,
             retention: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if backup_enabled is None and 'backupEnabled' in kwargs:
            backup_enabled = kwargs['backupEnabled']
        if backup_enabled_time is None and 'backupEnabledTime' in kwargs:
            backup_enabled_time = kwargs['backupEnabledTime']
        if cross_backup_region is None and 'crossBackupRegion' in kwargs:
            cross_backup_region = kwargs['crossBackupRegion']
        if cross_backup_type is None and 'crossBackupType' in kwargs:
            cross_backup_type = kwargs['crossBackupType']
        if db_instance_status is None and 'dbInstanceStatus' in kwargs:
            db_instance_status = kwargs['dbInstanceStatus']
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if lock_mode is None and 'lockMode' in kwargs:
            lock_mode = kwargs['lockMode']
        if log_backup_enabled is None and 'logBackupEnabled' in kwargs:
            log_backup_enabled = kwargs['logBackupEnabled']
        if log_backup_enabled_time is None and 'logBackupEnabledTime' in kwargs:
            log_backup_enabled_time = kwargs['logBackupEnabledTime']
        if retent_type is None and 'retentType' in kwargs:
            retent_type = kwargs['retentType']

        if backup_enabled is not None:
            _setter("backup_enabled", backup_enabled)
        if backup_enabled_time is not None:
            _setter("backup_enabled_time", backup_enabled_time)
        if cross_backup_region is not None:
            _setter("cross_backup_region", cross_backup_region)
        if cross_backup_type is not None:
            _setter("cross_backup_type", cross_backup_type)
        if db_instance_status is not None:
            _setter("db_instance_status", db_instance_status)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if lock_mode is not None:
            _setter("lock_mode", lock_mode)
        if log_backup_enabled is not None:
            _setter("log_backup_enabled", log_backup_enabled)
        if log_backup_enabled_time is not None:
            _setter("log_backup_enabled_time", log_backup_enabled_time)
        if retent_type is not None:
            _setter("retent_type", retent_type)
        if retention is not None:
            _setter("retention", retention)

    @property
    @pulumi.getter(name="backupEnabled")
    def backup_enabled(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the overall cross-region backup switch on the instance. Valid values:
        - Disabled
        - Enable
        """
        return pulumi.get(self, "backup_enabled")

    @backup_enabled.setter
    def backup_enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_enabled", value)

    @property
    @pulumi.getter(name="backupEnabledTime")
    def backup_enabled_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "backup_enabled_time")

    @backup_enabled_time.setter
    def backup_enabled_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_enabled_time", value)

    @property
    @pulumi.getter(name="crossBackupRegion")
    def cross_backup_region(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the destination region where the cross-region backup files of the instance are stored.
        """
        return pulumi.get(self, "cross_backup_region")

    @cross_backup_region.setter
    def cross_backup_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cross_backup_region", value)

    @property
    @pulumi.getter(name="crossBackupType")
    def cross_backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
        """
        return pulumi.get(self, "cross_backup_type")

    @cross_backup_type.setter
    def cross_backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cross_backup_type", value)

    @property
    @pulumi.getter(name="dbInstanceStatus")
    def db_instance_status(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the instance. For more information, see Instance status.
        """
        return pulumi.get(self, "db_instance_status")

    @db_instance_status.setter
    def db_instance_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_instance_status", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="lockMode")
    def lock_mode(self) -> Optional[pulumi.Input[str]]:
        """
        The lock status of the instance. Valid values:
        - Unlock: The instance is not locked.
        - ManualLock: The instance is manually locked.
        - LockByExpiration: The instance is locked upon expiration.
        - LockByRestoration: The instance is automatically locked before a rollback.
        - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
        """
        return pulumi.get(self, "lock_mode")

    @lock_mode.setter
    def lock_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lock_mode", value)

    @property
    @pulumi.getter(name="logBackupEnabled")
    def log_backup_enabled(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the cross-region log backup feature on the instance. Valid values:
        - Enable: Enables the feature.
        - Disabled: Disables the feature.
        """
        return pulumi.get(self, "log_backup_enabled")

    @log_backup_enabled.setter
    def log_backup_enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_backup_enabled", value)

    @property
    @pulumi.getter(name="logBackupEnabledTime")
    def log_backup_enabled_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "log_backup_enabled_time")

    @log_backup_enabled_time.setter
    def log_backup_enabled_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "log_backup_enabled_time", value)

    @property
    @pulumi.getter(name="retentType")
    def retent_type(self) -> Optional[pulumi.Input[str]]:
        """
        The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
        """
        return pulumi.get(self, "retent_type")

    @retent_type.setter
    def retent_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "retent_type", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[int]]:
        """
        The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention", value)


class RdsInstanceCrossBackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cross_backup_region: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 log_backup_enabled: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides an RDS instance emote disaster recovery strategy policy resource and used to configure instance emote disaster recovery strategy policy.

        For information about RDS cross region backup settings and how to use them, see [What is cross region backup](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/modify-cross-region-backup-settings).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            db_instance_storage_type="local_ssd",
            category="HighAvailability")
        default_instance_classes = alicloud.rds.get_instance_classes(zone_id=default_zones.ids[0],
            engine="MySQL",
            engine_version="8.0",
            db_instance_storage_type="local_ssd",
            category="HighAvailability")
        regions = alicloud.rds.get_cross_regions()
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.ids[0],
            vswitch_name=name)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="8.0",
            instance_type=default_instance_classes.instance_classes[0].instance_class,
            instance_storage=default_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            category="HighAvailability",
            instance_name=name,
            vswitch_id=default_switch.id,
            db_instance_storage_type="local_ssd")
        default_rds_instance_cross_backup_policy = alicloud.rds.RdsInstanceCrossBackupPolicy("defaultRdsInstanceCrossBackupPolicy",
            instance_id=default_instance.id,
            cross_backup_region=regions.ids[0])
        ```

        ## Import

        RDS remote disaster recovery policies can be imported using id or instance id, e.g.

        ```sh
         $ pulumi import alicloud:rds/rdsInstanceCrossBackupPolicy:RdsInstanceCrossBackupPolicy example "rm-12345678"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cross_backup_region: The ID of the destination region where the cross-region backup files of the instance are stored.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] log_backup_enabled: The status of the cross-region log backup feature on the instance. Valid values:
               - Enable: Enables the feature.
               - Disabled: Disables the feature.
        :param pulumi.Input[int] retention: The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RdsInstanceCrossBackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an RDS instance emote disaster recovery strategy policy resource and used to configure instance emote disaster recovery strategy policy.

        For information about RDS cross region backup settings and how to use them, see [What is cross region backup](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/modify-cross-region-backup-settings).

        > **NOTE:** Available since v1.195.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            db_instance_storage_type="local_ssd",
            category="HighAvailability")
        default_instance_classes = alicloud.rds.get_instance_classes(zone_id=default_zones.ids[0],
            engine="MySQL",
            engine_version="8.0",
            db_instance_storage_type="local_ssd",
            category="HighAvailability")
        regions = alicloud.rds.get_cross_regions()
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.ids[0],
            vswitch_name=name)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="8.0",
            instance_type=default_instance_classes.instance_classes[0].instance_class,
            instance_storage=default_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            category="HighAvailability",
            instance_name=name,
            vswitch_id=default_switch.id,
            db_instance_storage_type="local_ssd")
        default_rds_instance_cross_backup_policy = alicloud.rds.RdsInstanceCrossBackupPolicy("defaultRdsInstanceCrossBackupPolicy",
            instance_id=default_instance.id,
            cross_backup_region=regions.ids[0])
        ```

        ## Import

        RDS remote disaster recovery policies can be imported using id or instance id, e.g.

        ```sh
         $ pulumi import alicloud:rds/rdsInstanceCrossBackupPolicy:RdsInstanceCrossBackupPolicy example "rm-12345678"
        ```

        :param str resource_name: The name of the resource.
        :param RdsInstanceCrossBackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RdsInstanceCrossBackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RdsInstanceCrossBackupPolicyArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cross_backup_region: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 log_backup_enabled: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RdsInstanceCrossBackupPolicyArgs.__new__(RdsInstanceCrossBackupPolicyArgs)

            if cross_backup_region is None and not opts.urn:
                raise TypeError("Missing required property 'cross_backup_region'")
            __props__.__dict__["cross_backup_region"] = cross_backup_region
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["log_backup_enabled"] = log_backup_enabled
            __props__.__dict__["retention"] = retention
            __props__.__dict__["backup_enabled"] = None
            __props__.__dict__["backup_enabled_time"] = None
            __props__.__dict__["cross_backup_type"] = None
            __props__.__dict__["db_instance_status"] = None
            __props__.__dict__["lock_mode"] = None
            __props__.__dict__["log_backup_enabled_time"] = None
            __props__.__dict__["retent_type"] = None
        super(RdsInstanceCrossBackupPolicy, __self__).__init__(
            'alicloud:rds/rdsInstanceCrossBackupPolicy:RdsInstanceCrossBackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_enabled: Optional[pulumi.Input[str]] = None,
            backup_enabled_time: Optional[pulumi.Input[str]] = None,
            cross_backup_region: Optional[pulumi.Input[str]] = None,
            cross_backup_type: Optional[pulumi.Input[str]] = None,
            db_instance_status: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            lock_mode: Optional[pulumi.Input[str]] = None,
            log_backup_enabled: Optional[pulumi.Input[str]] = None,
            log_backup_enabled_time: Optional[pulumi.Input[str]] = None,
            retent_type: Optional[pulumi.Input[str]] = None,
            retention: Optional[pulumi.Input[int]] = None) -> 'RdsInstanceCrossBackupPolicy':
        """
        Get an existing RdsInstanceCrossBackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backup_enabled: The status of the overall cross-region backup switch on the instance. Valid values:
               - Disabled
               - Enable
        :param pulumi.Input[str] backup_enabled_time: The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param pulumi.Input[str] cross_backup_region: The ID of the destination region where the cross-region backup files of the instance are stored.
        :param pulumi.Input[str] cross_backup_type: The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
        :param pulumi.Input[str] db_instance_status: The state of the instance. For more information, see Instance status.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] lock_mode: The lock status of the instance. Valid values:
               - Unlock: The instance is not locked.
               - ManualLock: The instance is manually locked.
               - LockByExpiration: The instance is locked upon expiration.
               - LockByRestoration: The instance is automatically locked before a rollback.
               - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
        :param pulumi.Input[str] log_backup_enabled: The status of the cross-region log backup feature on the instance. Valid values:
               - Enable: Enables the feature.
               - Disabled: Disables the feature.
        :param pulumi.Input[str] log_backup_enabled_time: The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        :param pulumi.Input[str] retent_type: The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
        :param pulumi.Input[int] retention: The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RdsInstanceCrossBackupPolicyState.__new__(_RdsInstanceCrossBackupPolicyState)

        __props__.__dict__["backup_enabled"] = backup_enabled
        __props__.__dict__["backup_enabled_time"] = backup_enabled_time
        __props__.__dict__["cross_backup_region"] = cross_backup_region
        __props__.__dict__["cross_backup_type"] = cross_backup_type
        __props__.__dict__["db_instance_status"] = db_instance_status
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["lock_mode"] = lock_mode
        __props__.__dict__["log_backup_enabled"] = log_backup_enabled
        __props__.__dict__["log_backup_enabled_time"] = log_backup_enabled_time
        __props__.__dict__["retent_type"] = retent_type
        __props__.__dict__["retention"] = retention
        return RdsInstanceCrossBackupPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupEnabled")
    def backup_enabled(self) -> pulumi.Output[str]:
        """
        The status of the overall cross-region backup switch on the instance. Valid values:
        - Disabled
        - Enable
        """
        return pulumi.get(self, "backup_enabled")

    @property
    @pulumi.getter(name="backupEnabledTime")
    def backup_enabled_time(self) -> pulumi.Output[str]:
        """
        The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "backup_enabled_time")

    @property
    @pulumi.getter(name="crossBackupRegion")
    def cross_backup_region(self) -> pulumi.Output[str]:
        """
        The ID of the destination region where the cross-region backup files of the instance are stored.
        """
        return pulumi.get(self, "cross_backup_region")

    @property
    @pulumi.getter(name="crossBackupType")
    def cross_backup_type(self) -> pulumi.Output[str]:
        """
        The policy that is used to save cross-region backups of the instance. Default value: 1. The default value 1 indicates that all cross-region backups are saved.
        """
        return pulumi.get(self, "cross_backup_type")

    @property
    @pulumi.getter(name="dbInstanceStatus")
    def db_instance_status(self) -> pulumi.Output[str]:
        """
        The state of the instance. For more information, see Instance status.
        """
        return pulumi.get(self, "db_instance_status")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="lockMode")
    def lock_mode(self) -> pulumi.Output[str]:
        """
        The lock status of the instance. Valid values:
        - Unlock: The instance is not locked.
        - ManualLock: The instance is manually locked.
        - LockByExpiration: The instance is locked upon expiration.
        - LockByRestoration: The instance is automatically locked before a rollback.
        - LockByDiskQuota: The instance is automatically locked because its storage space is exhausted. In this situation, the instance is inaccessible.
        """
        return pulumi.get(self, "lock_mode")

    @property
    @pulumi.getter(name="logBackupEnabled")
    def log_backup_enabled(self) -> pulumi.Output[str]:
        """
        The status of the cross-region log backup feature on the instance. Valid values:
        - Enable: Enables the feature.
        - Disabled: Disables the feature.
        """
        return pulumi.get(self, "log_backup_enabled")

    @property
    @pulumi.getter(name="logBackupEnabledTime")
    def log_backup_enabled_time(self) -> pulumi.Output[str]:
        """
        The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        """
        return pulumi.get(self, "log_backup_enabled_time")

    @property
    @pulumi.getter(name="retentType")
    def retent_type(self) -> pulumi.Output[str]:
        """
        The policy that is used to retain cross-region backups of the instance. Default value: 1. The default value 1 indicate that cross-region backups are retained based on the specified retention period.
        """
        return pulumi.get(self, "retent_type")

    @property
    @pulumi.getter
    def retention(self) -> pulumi.Output[int]:
        """
        The number of days for which the cross-region backup files of the instance are retained. Valid values: 7 to 1825. Default value: 7.
        """
        return pulumi.get(self, "retention")

