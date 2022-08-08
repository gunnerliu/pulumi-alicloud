# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AuditLogConfigArgs', 'AuditLogConfig']

@pulumi.input_type
class AuditLogConfigArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 db_audit: Optional[pulumi.Input[bool]] = None,
                 retention: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a AuditLogConfig resource.
        :param pulumi.Input[str] instance_id: Instance ID, Call the Describeinstances Get.
        :param pulumi.Input[bool] db_audit: Indicates Whether to Enable the Audit Log.  Valid value: 
               * true: Default Value, Open.
               * false: Closed.
        :param pulumi.Input[int] retention: Audit Log Retention Period Value: 1~365.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        if db_audit is not None:
            pulumi.set(__self__, "db_audit", db_audit)
        if retention is not None:
            pulumi.set(__self__, "retention", retention)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Instance ID, Call the Describeinstances Get.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="dbAudit")
    def db_audit(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates Whether to Enable the Audit Log.  Valid value: 
        * true: Default Value, Open.
        * false: Closed.
        """
        return pulumi.get(self, "db_audit")

    @db_audit.setter
    def db_audit(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "db_audit", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[int]]:
        """
        Audit Log Retention Period Value: 1~365.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention", value)


@pulumi.input_type
class _AuditLogConfigState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 db_audit: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuditLogConfig resources.
        :param pulumi.Input[str] create_time: Instance Creation Time.
        :param pulumi.Input[bool] db_audit: Indicates Whether to Enable the Audit Log.  Valid value: 
               * true: Default Value, Open.
               * false: Closed.
        :param pulumi.Input[str] instance_id: Instance ID, Call the Describeinstances Get.
        :param pulumi.Input[int] retention: Audit Log Retention Period Value: 1~365.
        :param pulumi.Input[str] status: The status of the resource.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if db_audit is not None:
            pulumi.set(__self__, "db_audit", db_audit)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if retention is not None:
            pulumi.set(__self__, "retention", retention)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Instance Creation Time.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="dbAudit")
    def db_audit(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates Whether to Enable the Audit Log.  Valid value: 
        * true: Default Value, Open.
        * false: Closed.
        """
        return pulumi.get(self, "db_audit")

    @db_audit.setter
    def db_audit(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "db_audit", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Instance ID, Call the Describeinstances Get.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def retention(self) -> Optional[pulumi.Input[int]]:
        """
        Audit Log Retention Period Value: 1~365.
        """
        return pulumi.get(self, "retention")

    @retention.setter
    def retention(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retention", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class AuditLogConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_audit: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Provides a Redis And Memcache (KVStore) Audit Log Config resource.

        > **NOTE:** Available in v1.130.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.kvstore.AuditLogConfig("example",
            db_audit=True,
            instance_id="r-abc123455",
            retention=1)
        ```

        ## Import

        Redis And Memcache (KVStore) Audit Log Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kvstore/auditLogConfig:AuditLogConfig example <instance_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] db_audit: Indicates Whether to Enable the Audit Log.  Valid value: 
               * true: Default Value, Open.
               * false: Closed.
        :param pulumi.Input[str] instance_id: Instance ID, Call the Describeinstances Get.
        :param pulumi.Input[int] retention: Audit Log Retention Period Value: 1~365.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AuditLogConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Redis And Memcache (KVStore) Audit Log Config resource.

        > **NOTE:** Available in v1.130.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.kvstore.AuditLogConfig("example",
            db_audit=True,
            instance_id="r-abc123455",
            retention=1)
        ```

        ## Import

        Redis And Memcache (KVStore) Audit Log Config can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:kvstore/auditLogConfig:AuditLogConfig example <instance_id>
        ```

        :param str resource_name: The name of the resource.
        :param AuditLogConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuditLogConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 db_audit: Optional[pulumi.Input[bool]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 retention: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuditLogConfigArgs.__new__(AuditLogConfigArgs)

            __props__.__dict__["db_audit"] = db_audit
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["retention"] = retention
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(AuditLogConfig, __self__).__init__(
            'alicloud:kvstore/auditLogConfig:AuditLogConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            db_audit: Optional[pulumi.Input[bool]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            retention: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'AuditLogConfig':
        """
        Get an existing AuditLogConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: Instance Creation Time.
        :param pulumi.Input[bool] db_audit: Indicates Whether to Enable the Audit Log.  Valid value: 
               * true: Default Value, Open.
               * false: Closed.
        :param pulumi.Input[str] instance_id: Instance ID, Call the Describeinstances Get.
        :param pulumi.Input[int] retention: Audit Log Retention Period Value: 1~365.
        :param pulumi.Input[str] status: The status of the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuditLogConfigState.__new__(_AuditLogConfigState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["db_audit"] = db_audit
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["retention"] = retention
        __props__.__dict__["status"] = status
        return AuditLogConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Instance Creation Time.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dbAudit")
    def db_audit(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates Whether to Enable the Audit Log.  Valid value: 
        * true: Default Value, Open.
        * false: Closed.
        """
        return pulumi.get(self, "db_audit")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Instance ID, Call the Describeinstances Get.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def retention(self) -> pulumi.Output[Optional[int]]:
        """
        Audit Log Retention Period Value: 1~365.
        """
        return pulumi.get(self, "retention")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

