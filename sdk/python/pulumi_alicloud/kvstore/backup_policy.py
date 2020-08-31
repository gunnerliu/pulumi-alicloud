# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['BackupPolicy']


class BackupPolicy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_periods: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 backup_time: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a backup policy for ApsaraDB Redis / Memcache instance resource.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        creation = config.get("creation")
        if creation is None:
            creation = "KVStore"
        multi_az = config.get("multiAz")
        if multi_az is None:
            multi_az = "false"
        name = config.get("name")
        if name is None:
            name = "kvstorebackuppolicyvpc"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vpc_id=default_network.id)
        default_instance = alicloud.kvstore.Instance("defaultInstance",
            engine_version="2.8",
            instance_class="Memcache",
            instance_name=name,
            instance_type="memcache.master.small.default",
            private_ip="172.16.0.10",
            security_ips=["10.0.0.1"],
            vswitch_id=default_switch.id)
        default_backup_policy = alicloud.kvstore.BackupPolicy("defaultBackupPolicy",
            backup_periods=[
                "Tuesday",
                "Wednesday",
            ],
            backup_time="10:00Z-11:00Z",
            instance_id=default_instance.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        :param pulumi.Input[str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z
        :param pulumi.Input[str] instance_id: The id of ApsaraDB for Redis or Memcache intance.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['backup_periods'] = backup_periods
            __props__['backup_time'] = backup_time
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
        super(BackupPolicy, __self__).__init__(
            'alicloud:kvstore/backupPolicy:BackupPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_periods: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            backup_time: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        :param pulumi.Input[str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z
        :param pulumi.Input[str] instance_id: The id of ApsaraDB for Redis or Memcache intance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["backup_periods"] = backup_periods
        __props__["backup_time"] = backup_time
        __props__["instance_id"] = instance_id
        return BackupPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupPeriods")
    def backup_periods(self) -> pulumi.Output[List[str]]:
        """
        Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        """
        return pulumi.get(self, "backup_periods")

    @property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> pulumi.Output[Optional[str]]:
        """
        Backup time, in the format of HH:mmZ- HH:mm Z
        """
        return pulumi.get(self, "backup_time")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The id of ApsaraDB for Redis or Memcache intance.
        """
        return pulumi.get(self, "instance_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

