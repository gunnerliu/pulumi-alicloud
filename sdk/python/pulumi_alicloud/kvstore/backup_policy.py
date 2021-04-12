# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['BackupPolicyArgs', 'BackupPolicy']

@pulumi.input_type
class BackupPolicyArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backup_time: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BackupPolicy resource.
        :param pulumi.Input[str] instance_id: The id of ApsaraDB for Redis or Memcache intance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        :param pulumi.Input[str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if backup_periods is not None:
            pulumi.set(__self__, "backup_periods", backup_periods)
        if backup_time is not None:
            pulumi.set(__self__, "backup_time", backup_time)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The id of ApsaraDB for Redis or Memcache intance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="backupPeriods")
    def backup_periods(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        """
        return pulumi.get(self, "backup_periods")

    @backup_periods.setter
    def backup_periods(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "backup_periods", value)

    @property
    @pulumi.getter(name="backupTime")
    def backup_time(self) -> Optional[pulumi.Input[str]]:
        """
        Backup time, in the format of HH:mmZ- HH:mm Z
        """
        return pulumi.get(self, "backup_time")

    @backup_time.setter
    def backup_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "backup_time", value)


class BackupPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backup_time: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        KVStore backup policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kvstore/backupPolicy:BackupPolicy example r-abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        :param pulumi.Input[str] backup_time: Backup time, in the format of HH:mmZ- HH:mm Z
        :param pulumi.Input[str] instance_id: The id of ApsaraDB for Redis or Memcache intance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BackupPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        KVStore backup policy can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kvstore/backupPolicy:BackupPolicy example r-abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param BackupPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BackupPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 backup_time: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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
            if instance_id is None and not opts.urn:
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
            backup_periods: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            backup_time: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None) -> 'BackupPolicy':
        """
        Get an existing BackupPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] backup_periods: Backup Cycle. Allowed values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
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
    def backup_periods(self) -> pulumi.Output[Sequence[str]]:
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

