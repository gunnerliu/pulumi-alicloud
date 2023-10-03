# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['TrailDeprecatedArgs', 'TrailDeprecated']

@pulumi.input_type
class TrailDeprecatedArgs:
    def __init__(__self__, *,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 is_organization_trail: Optional[pulumi.Input[bool]] = None,
                 mns_topic_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 oss_write_role_arn: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 trail_name: Optional[pulumi.Input[str]] = None,
                 trail_region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TrailDeprecated resource.
        :param pulumi.Input[str] event_rw: Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        :param pulumi.Input[str] name: The name of the trail to be created, which must be unique for an account.
        :param pulumi.Input[str] oss_bucket_name: The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        :param pulumi.Input[str] oss_key_prefix: The prefix of the specified OSS bucket name. This parameter can be left empty.
        :param pulumi.Input[str] role_name: The RAM role in ActionTrail permitted by the user.
        :param pulumi.Input[str] sls_project_arn: The unique ARN of the Log Service project.
        :param pulumi.Input[str] sls_write_role_arn: The unique ARN of the Log Service role.
               
               > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        TrailDeprecatedArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            event_rw=event_rw,
            is_organization_trail=is_organization_trail,
            mns_topic_arn=mns_topic_arn,
            name=name,
            oss_bucket_name=oss_bucket_name,
            oss_key_prefix=oss_key_prefix,
            oss_write_role_arn=oss_write_role_arn,
            role_name=role_name,
            sls_project_arn=sls_project_arn,
            sls_write_role_arn=sls_write_role_arn,
            status=status,
            trail_name=trail_name,
            trail_region=trail_region,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             event_rw: Optional[pulumi.Input[str]] = None,
             is_organization_trail: Optional[pulumi.Input[bool]] = None,
             mns_topic_arn: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             oss_bucket_name: Optional[pulumi.Input[str]] = None,
             oss_key_prefix: Optional[pulumi.Input[str]] = None,
             oss_write_role_arn: Optional[pulumi.Input[str]] = None,
             role_name: Optional[pulumi.Input[str]] = None,
             sls_project_arn: Optional[pulumi.Input[str]] = None,
             sls_write_role_arn: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             trail_name: Optional[pulumi.Input[str]] = None,
             trail_region: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if event_rw is not None:
            _setter("event_rw", event_rw)
        if is_organization_trail is not None:
            _setter("is_organization_trail", is_organization_trail)
        if mns_topic_arn is not None:
            warnings.warn("""Field 'mns_topic_arn' has been deprecated from version 1.118.0""", DeprecationWarning)
            pulumi.log.warn("""mns_topic_arn is deprecated: Field 'mns_topic_arn' has been deprecated from version 1.118.0""")
        if mns_topic_arn is not None:
            _setter("mns_topic_arn", mns_topic_arn)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""")
        if name is not None:
            _setter("name", name)
        if oss_bucket_name is not None:
            _setter("oss_bucket_name", oss_bucket_name)
        if oss_key_prefix is not None:
            _setter("oss_key_prefix", oss_key_prefix)
        if oss_write_role_arn is not None:
            _setter("oss_write_role_arn", oss_write_role_arn)
        if role_name is not None:
            warnings.warn("""Field 'role_name' has been deprecated from version 1.118.0""", DeprecationWarning)
            pulumi.log.warn("""role_name is deprecated: Field 'role_name' has been deprecated from version 1.118.0""")
        if role_name is not None:
            _setter("role_name", role_name)
        if sls_project_arn is not None:
            _setter("sls_project_arn", sls_project_arn)
        if sls_write_role_arn is not None:
            _setter("sls_write_role_arn", sls_write_role_arn)
        if status is not None:
            _setter("status", status)
        if trail_name is not None:
            _setter("trail_name", trail_name)
        if trail_region is not None:
            _setter("trail_region", trail_region)

    @property
    @pulumi.getter(name="eventRw")
    def event_rw(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        """
        return pulumi.get(self, "event_rw")

    @event_rw.setter
    def event_rw(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_rw", value)

    @property
    @pulumi.getter(name="isOrganizationTrail")
    def is_organization_trail(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_organization_trail")

    @is_organization_trail.setter
    def is_organization_trail(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_organization_trail", value)

    @property
    @pulumi.getter(name="mnsTopicArn")
    def mns_topic_arn(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""Field 'mns_topic_arn' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""mns_topic_arn is deprecated: Field 'mns_topic_arn' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "mns_topic_arn")

    @mns_topic_arn.setter
    def mns_topic_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mns_topic_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the trail to be created, which must be unique for an account.
        """
        warnings.warn("""Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""")

        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ossBucketName")
    def oss_bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        """
        return pulumi.get(self, "oss_bucket_name")

    @oss_bucket_name.setter
    def oss_bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_bucket_name", value)

    @property
    @pulumi.getter(name="ossKeyPrefix")
    def oss_key_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The prefix of the specified OSS bucket name. This parameter can be left empty.
        """
        return pulumi.get(self, "oss_key_prefix")

    @oss_key_prefix.setter
    def oss_key_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_key_prefix", value)

    @property
    @pulumi.getter(name="ossWriteRoleArn")
    def oss_write_role_arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oss_write_role_arn")

    @oss_write_role_arn.setter
    def oss_write_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_write_role_arn", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The RAM role in ActionTrail permitted by the user.
        """
        warnings.warn("""Field 'role_name' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""role_name is deprecated: Field 'role_name' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="slsProjectArn")
    def sls_project_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ARN of the Log Service project.
        """
        return pulumi.get(self, "sls_project_arn")

    @sls_project_arn.setter
    def sls_project_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sls_project_arn", value)

    @property
    @pulumi.getter(name="slsWriteRoleArn")
    def sls_write_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ARN of the Log Service role.

        > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        return pulumi.get(self, "sls_write_role_arn")

    @sls_write_role_arn.setter
    def sls_write_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sls_write_role_arn", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="trailName")
    def trail_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "trail_name")

    @trail_name.setter
    def trail_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trail_name", value)

    @property
    @pulumi.getter(name="trailRegion")
    def trail_region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "trail_region")

    @trail_region.setter
    def trail_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trail_region", value)


@pulumi.input_type
class _TrailDeprecatedState:
    def __init__(__self__, *,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 is_organization_trail: Optional[pulumi.Input[bool]] = None,
                 mns_topic_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 oss_write_role_arn: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 trail_name: Optional[pulumi.Input[str]] = None,
                 trail_region: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TrailDeprecated resources.
        :param pulumi.Input[str] event_rw: Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        :param pulumi.Input[str] name: The name of the trail to be created, which must be unique for an account.
        :param pulumi.Input[str] oss_bucket_name: The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        :param pulumi.Input[str] oss_key_prefix: The prefix of the specified OSS bucket name. This parameter can be left empty.
        :param pulumi.Input[str] role_name: The RAM role in ActionTrail permitted by the user.
        :param pulumi.Input[str] sls_project_arn: The unique ARN of the Log Service project.
        :param pulumi.Input[str] sls_write_role_arn: The unique ARN of the Log Service role.
               
               > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        _TrailDeprecatedState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            event_rw=event_rw,
            is_organization_trail=is_organization_trail,
            mns_topic_arn=mns_topic_arn,
            name=name,
            oss_bucket_name=oss_bucket_name,
            oss_key_prefix=oss_key_prefix,
            oss_write_role_arn=oss_write_role_arn,
            role_name=role_name,
            sls_project_arn=sls_project_arn,
            sls_write_role_arn=sls_write_role_arn,
            status=status,
            trail_name=trail_name,
            trail_region=trail_region,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             event_rw: Optional[pulumi.Input[str]] = None,
             is_organization_trail: Optional[pulumi.Input[bool]] = None,
             mns_topic_arn: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             oss_bucket_name: Optional[pulumi.Input[str]] = None,
             oss_key_prefix: Optional[pulumi.Input[str]] = None,
             oss_write_role_arn: Optional[pulumi.Input[str]] = None,
             role_name: Optional[pulumi.Input[str]] = None,
             sls_project_arn: Optional[pulumi.Input[str]] = None,
             sls_write_role_arn: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             trail_name: Optional[pulumi.Input[str]] = None,
             trail_region: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if event_rw is not None:
            _setter("event_rw", event_rw)
        if is_organization_trail is not None:
            _setter("is_organization_trail", is_organization_trail)
        if mns_topic_arn is not None:
            warnings.warn("""Field 'mns_topic_arn' has been deprecated from version 1.118.0""", DeprecationWarning)
            pulumi.log.warn("""mns_topic_arn is deprecated: Field 'mns_topic_arn' has been deprecated from version 1.118.0""")
        if mns_topic_arn is not None:
            _setter("mns_topic_arn", mns_topic_arn)
        if name is not None:
            warnings.warn("""Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""")
        if name is not None:
            _setter("name", name)
        if oss_bucket_name is not None:
            _setter("oss_bucket_name", oss_bucket_name)
        if oss_key_prefix is not None:
            _setter("oss_key_prefix", oss_key_prefix)
        if oss_write_role_arn is not None:
            _setter("oss_write_role_arn", oss_write_role_arn)
        if role_name is not None:
            warnings.warn("""Field 'role_name' has been deprecated from version 1.118.0""", DeprecationWarning)
            pulumi.log.warn("""role_name is deprecated: Field 'role_name' has been deprecated from version 1.118.0""")
        if role_name is not None:
            _setter("role_name", role_name)
        if sls_project_arn is not None:
            _setter("sls_project_arn", sls_project_arn)
        if sls_write_role_arn is not None:
            _setter("sls_write_role_arn", sls_write_role_arn)
        if status is not None:
            _setter("status", status)
        if trail_name is not None:
            _setter("trail_name", trail_name)
        if trail_region is not None:
            _setter("trail_region", trail_region)

    @property
    @pulumi.getter(name="eventRw")
    def event_rw(self) -> Optional[pulumi.Input[str]]:
        """
        Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        """
        return pulumi.get(self, "event_rw")

    @event_rw.setter
    def event_rw(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_rw", value)

    @property
    @pulumi.getter(name="isOrganizationTrail")
    def is_organization_trail(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_organization_trail")

    @is_organization_trail.setter
    def is_organization_trail(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_organization_trail", value)

    @property
    @pulumi.getter(name="mnsTopicArn")
    def mns_topic_arn(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""Field 'mns_topic_arn' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""mns_topic_arn is deprecated: Field 'mns_topic_arn' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "mns_topic_arn")

    @mns_topic_arn.setter
    def mns_topic_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mns_topic_arn", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the trail to be created, which must be unique for an account.
        """
        warnings.warn("""Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""")

        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ossBucketName")
    def oss_bucket_name(self) -> Optional[pulumi.Input[str]]:
        """
        The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        """
        return pulumi.get(self, "oss_bucket_name")

    @oss_bucket_name.setter
    def oss_bucket_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_bucket_name", value)

    @property
    @pulumi.getter(name="ossKeyPrefix")
    def oss_key_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The prefix of the specified OSS bucket name. This parameter can be left empty.
        """
        return pulumi.get(self, "oss_key_prefix")

    @oss_key_prefix.setter
    def oss_key_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_key_prefix", value)

    @property
    @pulumi.getter(name="ossWriteRoleArn")
    def oss_write_role_arn(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oss_write_role_arn")

    @oss_write_role_arn.setter
    def oss_write_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oss_write_role_arn", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The RAM role in ActionTrail permitted by the user.
        """
        warnings.warn("""Field 'role_name' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""role_name is deprecated: Field 'role_name' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="slsProjectArn")
    def sls_project_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ARN of the Log Service project.
        """
        return pulumi.get(self, "sls_project_arn")

    @sls_project_arn.setter
    def sls_project_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sls_project_arn", value)

    @property
    @pulumi.getter(name="slsWriteRoleArn")
    def sls_write_role_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ARN of the Log Service role.

        > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        return pulumi.get(self, "sls_write_role_arn")

    @sls_write_role_arn.setter
    def sls_write_role_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sls_write_role_arn", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="trailName")
    def trail_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "trail_name")

    @trail_name.setter
    def trail_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trail_name", value)

    @property
    @pulumi.getter(name="trailRegion")
    def trail_region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "trail_region")

    @trail_region.setter
    def trail_region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "trail_region", value)


warnings.warn("""Resource renamed to `Trail`""", DeprecationWarning)


class TrailDeprecated(pulumi.CustomResource):
    warnings.warn("""Resource renamed to `Trail`""", DeprecationWarning)

    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 is_organization_trail: Optional[pulumi.Input[bool]] = None,
                 mns_topic_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 oss_write_role_arn: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 trail_name: Optional[pulumi.Input[str]] = None,
                 trail_region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **DEPRECATED:**  This resource has been renamed to actiontrail.Trail from version 1.95.0.

        Provides a new resource to manage [Action Trail](https://www.alibabacloud.com/help/doc-detail/28804.htm).

        > **NOTE:** Available in 1.35.0+

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new action trail.
        foo = alicloud.actiontrail.TrailDeprecated("foo",
            event_rw="Write-test",
            oss_bucket_name=alicloud_oss_bucket["bucket"]["id"],
            role_name=alicloud_ram_role_policy_attachment["attach"]["role_name"],
            oss_key_prefix="at-product-account-audit-B")
        ```

        ## Import

        Action trail can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:actiontrail/trailDeprecated:TrailDeprecated foo abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_rw: Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        :param pulumi.Input[str] name: The name of the trail to be created, which must be unique for an account.
        :param pulumi.Input[str] oss_bucket_name: The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        :param pulumi.Input[str] oss_key_prefix: The prefix of the specified OSS bucket name. This parameter can be left empty.
        :param pulumi.Input[str] role_name: The RAM role in ActionTrail permitted by the user.
        :param pulumi.Input[str] sls_project_arn: The unique ARN of the Log Service project.
        :param pulumi.Input[str] sls_write_role_arn: The unique ARN of the Log Service role.
               
               > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TrailDeprecatedArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **DEPRECATED:**  This resource has been renamed to actiontrail.Trail from version 1.95.0.

        Provides a new resource to manage [Action Trail](https://www.alibabacloud.com/help/doc-detail/28804.htm).

        > **NOTE:** Available in 1.35.0+

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new action trail.
        foo = alicloud.actiontrail.TrailDeprecated("foo",
            event_rw="Write-test",
            oss_bucket_name=alicloud_oss_bucket["bucket"]["id"],
            role_name=alicloud_ram_role_policy_attachment["attach"]["role_name"],
            oss_key_prefix="at-product-account-audit-B")
        ```

        ## Import

        Action trail can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:actiontrail/trailDeprecated:TrailDeprecated foo abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param TrailDeprecatedArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TrailDeprecatedArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TrailDeprecatedArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 is_organization_trail: Optional[pulumi.Input[bool]] = None,
                 mns_topic_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 oss_write_role_arn: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 trail_name: Optional[pulumi.Input[str]] = None,
                 trail_region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        pulumi.log.warn("""TrailDeprecated is deprecated: Resource renamed to `Trail`""")
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TrailDeprecatedArgs.__new__(TrailDeprecatedArgs)

            __props__.__dict__["event_rw"] = event_rw
            __props__.__dict__["is_organization_trail"] = is_organization_trail
            __props__.__dict__["mns_topic_arn"] = mns_topic_arn
            __props__.__dict__["name"] = name
            __props__.__dict__["oss_bucket_name"] = oss_bucket_name
            __props__.__dict__["oss_key_prefix"] = oss_key_prefix
            __props__.__dict__["oss_write_role_arn"] = oss_write_role_arn
            __props__.__dict__["role_name"] = role_name
            __props__.__dict__["sls_project_arn"] = sls_project_arn
            __props__.__dict__["sls_write_role_arn"] = sls_write_role_arn
            __props__.__dict__["status"] = status
            __props__.__dict__["trail_name"] = trail_name
            __props__.__dict__["trail_region"] = trail_region
        super(TrailDeprecated, __self__).__init__(
            'alicloud:actiontrail/trailDeprecated:TrailDeprecated',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            event_rw: Optional[pulumi.Input[str]] = None,
            is_organization_trail: Optional[pulumi.Input[bool]] = None,
            mns_topic_arn: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oss_bucket_name: Optional[pulumi.Input[str]] = None,
            oss_key_prefix: Optional[pulumi.Input[str]] = None,
            oss_write_role_arn: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            sls_project_arn: Optional[pulumi.Input[str]] = None,
            sls_write_role_arn: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            trail_name: Optional[pulumi.Input[str]] = None,
            trail_region: Optional[pulumi.Input[str]] = None) -> 'TrailDeprecated':
        """
        Get an existing TrailDeprecated resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] event_rw: Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        :param pulumi.Input[str] name: The name of the trail to be created, which must be unique for an account.
        :param pulumi.Input[str] oss_bucket_name: The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        :param pulumi.Input[str] oss_key_prefix: The prefix of the specified OSS bucket name. This parameter can be left empty.
        :param pulumi.Input[str] role_name: The RAM role in ActionTrail permitted by the user.
        :param pulumi.Input[str] sls_project_arn: The unique ARN of the Log Service project.
        :param pulumi.Input[str] sls_write_role_arn: The unique ARN of the Log Service role.
               
               > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TrailDeprecatedState.__new__(_TrailDeprecatedState)

        __props__.__dict__["event_rw"] = event_rw
        __props__.__dict__["is_organization_trail"] = is_organization_trail
        __props__.__dict__["mns_topic_arn"] = mns_topic_arn
        __props__.__dict__["name"] = name
        __props__.__dict__["oss_bucket_name"] = oss_bucket_name
        __props__.__dict__["oss_key_prefix"] = oss_key_prefix
        __props__.__dict__["oss_write_role_arn"] = oss_write_role_arn
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["sls_project_arn"] = sls_project_arn
        __props__.__dict__["sls_write_role_arn"] = sls_write_role_arn
        __props__.__dict__["status"] = status
        __props__.__dict__["trail_name"] = trail_name
        __props__.__dict__["trail_region"] = trail_region
        return TrailDeprecated(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="eventRw")
    def event_rw(self) -> pulumi.Output[Optional[str]]:
        """
        Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        """
        return pulumi.get(self, "event_rw")

    @property
    @pulumi.getter(name="isOrganizationTrail")
    def is_organization_trail(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "is_organization_trail")

    @property
    @pulumi.getter(name="mnsTopicArn")
    def mns_topic_arn(self) -> pulumi.Output[Optional[str]]:
        warnings.warn("""Field 'mns_topic_arn' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""mns_topic_arn is deprecated: Field 'mns_topic_arn' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "mns_topic_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the trail to be created, which must be unique for an account.
        """
        warnings.warn("""Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.""")

        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ossBucketName")
    def oss_bucket_name(self) -> pulumi.Output[Optional[str]]:
        """
        The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        """
        return pulumi.get(self, "oss_bucket_name")

    @property
    @pulumi.getter(name="ossKeyPrefix")
    def oss_key_prefix(self) -> pulumi.Output[Optional[str]]:
        """
        The prefix of the specified OSS bucket name. This parameter can be left empty.
        """
        return pulumi.get(self, "oss_key_prefix")

    @property
    @pulumi.getter(name="ossWriteRoleArn")
    def oss_write_role_arn(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "oss_write_role_arn")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The RAM role in ActionTrail permitted by the user.
        """
        warnings.warn("""Field 'role_name' has been deprecated from version 1.118.0""", DeprecationWarning)
        pulumi.log.warn("""role_name is deprecated: Field 'role_name' has been deprecated from version 1.118.0""")

        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="slsProjectArn")
    def sls_project_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The unique ARN of the Log Service project.
        """
        return pulumi.get(self, "sls_project_arn")

    @property
    @pulumi.getter(name="slsWriteRoleArn")
    def sls_write_role_arn(self) -> pulumi.Output[str]:
        """
        The unique ARN of the Log Service role.

        > **NOTE:** `sls_project_arn` and `sls_write_role_arn` should be set or not set at the same time when actiontrail delivers logs.
        """
        return pulumi.get(self, "sls_write_role_arn")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="trailName")
    def trail_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "trail_name")

    @property
    @pulumi.getter(name="trailRegion")
    def trail_region(self) -> pulumi.Output[str]:
        return pulumi.get(self, "trail_region")

