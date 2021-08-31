# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OssBackupPlanArgs', 'OssBackupPlan']

@pulumi.input_type
class OssBackupPlanArgs:
    def __init__(__self__, *,
                 oss_backup_plan_name: pulumi.Input[str],
                 retention: pulumi.Input[str],
                 schedule: pulumi.Input[str],
                 backup_type: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OssBackupPlan resource.
        :param pulumi.Input[str] oss_backup_plan_name: The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        :param pulumi.Input[str] retention: Backup Retention Period, the Minimum Value of 1.
        :param pulumi.Input[str] schedule: Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        :param pulumi.Input[str] backup_type: Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        :param pulumi.Input[str] bucket: The OSS Bucket Name.
        :param pulumi.Input[bool] disabled: Whether to Disable the Backup Task. Valid Values: true, false.
        :param pulumi.Input[str] vault_id: Vault ID.
        """
        pulumi.set(__self__, "oss_backup_plan_name", oss_backup_plan_name)
        pulumi.set(__self__, "retention", retention)
        pulumi.set(__self__, "schedule", schedule)
        if backup_type is not None:
            pulumi.set(__self__, "backup_type", backup_type)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if vault_id is not None:
            pulumi.set(__self__, "vault_id", vault_id)

    @property
    @pulumi.getter(name="ossBackupPlanName")
    def oss_backup_plan_name(self) -> pulumi.Input[str]:
        """
        The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        """
        return pulumi.get(self, "oss_backup_plan_name")

    @oss_backup_plan_name.setter
    def oss_backup_plan_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "oss_backup_plan_name", value)

    @property
    @pulumi.getter
    def retention(self) -> pulumi.Input[str]:
        """
        Backup Retention Period, the Minimum Value of 1.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: pulumi.Input[str]):
        pulumi.set(self, "retention", value)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input[str]:
        """
        Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        """
        return pulumi.get(self, "backup_type")

    @backup_type.setter
    def backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_type", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The OSS Bucket Name.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to Disable the Backup Task. Valid Values: true, false.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[pulumi.Input[str]]:
        """
        Vault ID.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_id", value)


@pulumi.input_type
class _OssBackupPlanState:
    def __init__(__self__, *,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 oss_backup_plan_name: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OssBackupPlan resources.
        :param pulumi.Input[str] backup_type: Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        :param pulumi.Input[str] bucket: The OSS Bucket Name.
        :param pulumi.Input[bool] disabled: Whether to Disable the Backup Task. Valid Values: true, false.
        :param pulumi.Input[str] oss_backup_plan_name: The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        :param pulumi.Input[str] retention: Backup Retention Period, the Minimum Value of 1.
        :param pulumi.Input[str] schedule: Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        :param pulumi.Input[str] vault_id: Vault ID.
        """
        if backup_type is not None:
            pulumi.set(__self__, "backup_type", backup_type)
        if bucket is not None:
            pulumi.set(__self__, "bucket", bucket)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if oss_backup_plan_name is not None:
            pulumi.set(__self__, "oss_backup_plan_name", oss_backup_plan_name)
        if prefix is not None:
            pulumi.set(__self__, "prefix", prefix)
        if retention is not None:
            pulumi.set(__self__, "retention", retention)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if vault_id is not None:
            pulumi.set(__self__, "vault_id", vault_id)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> Optional[pulumi.Input[str]]:
        """
        Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        """
        return pulumi.get(self, "backup_type")

    @backup_type.setter
    def backup_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_type", value)

    @property
    @pulumi.getter
    def bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The OSS Bucket Name.
        """
        return pulumi.get(self, "bucket")

    @bucket.setter
    def bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to Disable the Backup Task. Valid Values: true, false.
        """
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter(name="ossBackupPlanName")
    def oss_backup_plan_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        """
        return pulumi.get(self, "oss_backup_plan_name")

    @oss_backup_plan_name.setter
    def oss_backup_plan_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_backup_plan_name", value)

    @property
    @pulumi.getter
    def prefix(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "prefix")

    @prefix.setter
    def prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "prefix", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[str]]:
        """
        Backup Retention Period, the Minimum Value of 1.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "retention", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> Optional[pulumi.Input[str]]:
        """
        Vault ID.
        """
        return pulumi.get(self, "vault_id")

    @vault_id.setter
    def vault_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vault_id", value)


class OssBackupPlan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 oss_backup_plan_name: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a HBR Oss Backup Plan resource.

        For information about HBR Oss Backup Plan and how to use it, see [What is Oss Backup Plan](https://www.alibabacloud.com/product/hybrid-backup-recovery).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "%s"
        default_vault = alicloud.hbr.Vault("defaultVault", vault_name=name)
        default_buckets = alicloud.oss.get_buckets(name_regex="bosh-cf-blobstore-hz")
        example = alicloud.hbr.OssBackupPlan("example",
            oss_backup_plan_name=name,
            vault_id=default_vault.id,
            bucket=alicloud_oss_bucket["default"]["bucket"],
            prefix="/home",
            retention="1",
            schedule="I|1602673264|PT2H",
            backup_type="COMPLETE")
        ```

        ## Import

        HBR Oss Backup Plan can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:hbr/ossBackupPlan:OssBackupPlan example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backup_type: Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        :param pulumi.Input[str] bucket: The OSS Bucket Name.
        :param pulumi.Input[bool] disabled: Whether to Disable the Backup Task. Valid Values: true, false.
        :param pulumi.Input[str] oss_backup_plan_name: The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        :param pulumi.Input[str] retention: Backup Retention Period, the Minimum Value of 1.
        :param pulumi.Input[str] schedule: Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        :param pulumi.Input[str] vault_id: Vault ID.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OssBackupPlanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a HBR Oss Backup Plan resource.

        For information about HBR Oss Backup Plan and how to use it, see [What is Oss Backup Plan](https://www.alibabacloud.com/product/hybrid-backup-recovery).

        > **NOTE:** Available in v1.131.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "%s"
        default_vault = alicloud.hbr.Vault("defaultVault", vault_name=name)
        default_buckets = alicloud.oss.get_buckets(name_regex="bosh-cf-blobstore-hz")
        example = alicloud.hbr.OssBackupPlan("example",
            oss_backup_plan_name=name,
            vault_id=default_vault.id,
            bucket=alicloud_oss_bucket["default"]["bucket"],
            prefix="/home",
            retention="1",
            schedule="I|1602673264|PT2H",
            backup_type="COMPLETE")
        ```

        ## Import

        HBR Oss Backup Plan can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:hbr/ossBackupPlan:OssBackupPlan example <id>
        ```

        :param str resource_name: The name of the resource.
        :param OssBackupPlanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OssBackupPlanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_type: Optional[pulumi.Input[str]] = None,
                 bucket: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 oss_backup_plan_name: Optional[pulumi.Input[str]] = None,
                 prefix: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 vault_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OssBackupPlanArgs.__new__(OssBackupPlanArgs)

            __props__.__dict__["backup_type"] = backup_type
            __props__.__dict__["bucket"] = bucket
            __props__.__dict__["disabled"] = disabled
            if oss_backup_plan_name is None and not opts.urn:
                raise TypeError("Missing required property 'oss_backup_plan_name'")
            __props__.__dict__["oss_backup_plan_name"] = oss_backup_plan_name
            __props__.__dict__["prefix"] = prefix
            if retention is None and not opts.urn:
                raise TypeError("Missing required property 'retention'")
            __props__.__dict__["retention"] = retention
            if schedule is None and not opts.urn:
                raise TypeError("Missing required property 'schedule'")
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["vault_id"] = vault_id
        super(OssBackupPlan, __self__).__init__(
            'alicloud:hbr/ossBackupPlan:OssBackupPlan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_type: Optional[pulumi.Input[str]] = None,
            bucket: Optional[pulumi.Input[str]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            oss_backup_plan_name: Optional[pulumi.Input[str]] = None,
            prefix: Optional[pulumi.Input[str]] = None,
            retention: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            vault_id: Optional[pulumi.Input[str]] = None) -> 'OssBackupPlan':
        """
        Get an existing OssBackupPlan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] backup_type: Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        :param pulumi.Input[str] bucket: The OSS Bucket Name.
        :param pulumi.Input[bool] disabled: Whether to Disable the Backup Task. Valid Values: true, false.
        :param pulumi.Input[str] oss_backup_plan_name: The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        :param pulumi.Input[str] retention: Backup Retention Period, the Minimum Value of 1.
        :param pulumi.Input[str] schedule: Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        :param pulumi.Input[str] vault_id: Vault ID.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OssBackupPlanState.__new__(_OssBackupPlanState)

        __props__.__dict__["backup_type"] = backup_type
        __props__.__dict__["bucket"] = bucket
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["oss_backup_plan_name"] = oss_backup_plan_name
        __props__.__dict__["prefix"] = prefix
        __props__.__dict__["retention"] = retention
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["vault_id"] = vault_id
        return OssBackupPlan(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupType")
    def backup_type(self) -> pulumi.Output[str]:
        """
        Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        """
        return pulumi.get(self, "backup_type")

    @property
    @pulumi.getter
    def bucket(self) -> pulumi.Output[Optional[str]]:
        """
        The OSS Bucket Name.
        """
        return pulumi.get(self, "bucket")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[bool]:
        """
        Whether to Disable the Backup Task. Valid Values: true, false.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter(name="ossBackupPlanName")
    def oss_backup_plan_name(self) -> pulumi.Output[str]:
        """
        The Configuration Page of a Backup Plan Name. 1-64 Characters, requiring a Single Warehouse under Each of the Data Source Type Drop-down List of the Configuration Page of a Backup Plan Name Is Unique.
        """
        return pulumi.get(self, "oss_backup_plan_name")

    @property
    @pulumi.getter
    def prefix(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "prefix")

    @property
    @pulumi.getter
    def retention(self) -> pulumi.Output[str]:
        """
        Backup Retention Period, the Minimum Value of 1.
        """
        return pulumi.get(self, "retention")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[str]:
        """
        Backup strategy. Optional format: I|{startTime}|{interval} * startTime Backup start time, UNIX time, in seconds. * interval ISO8601 time interval. E.g: ** PT1H, one hour apart. ** P1D, one day apart. It means to execute a backup task every {interval} starting from {startTime}. The backup task for the elapsed time will not be compensated. If the last backup task is not completed, the next backup task will not be triggered.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter(name="vaultId")
    def vault_id(self) -> pulumi.Output[Optional[str]]:
        """
        Vault ID.
        """
        return pulumi.get(self, "vault_id")

