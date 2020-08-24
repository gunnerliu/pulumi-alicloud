# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Trail']


class Trail(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a new resource to manage [Action Trail](https://www.alibabacloud.com/help/doc-detail/28804.htm).

        > **NOTE:** Available in 1.35.0+

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a new action trail.
        foo = alicloud.actiontrail.Trail("foo",
            event_rw="Write-test",
            oss_bucket_name=alicloud_oss_bucket["bucket"]["id"],
            oss_key_prefix="at-product-account-audit-B",
            role_name=alicloud_ram_role_policy_attachment["attach"]["role_name"])
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

            __props__['event_rw'] = event_rw
            __props__['name'] = name
            if oss_bucket_name is None:
                raise TypeError("Missing required property 'oss_bucket_name'")
            __props__['oss_bucket_name'] = oss_bucket_name
            __props__['oss_key_prefix'] = oss_key_prefix
            if role_name is None:
                raise TypeError("Missing required property 'role_name'")
            __props__['role_name'] = role_name
            __props__['sls_project_arn'] = sls_project_arn
            __props__['sls_write_role_arn'] = sls_write_role_arn
        super(Trail, __self__).__init__(
            'alicloud:actiontrail/trail:Trail',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            event_rw: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oss_bucket_name: Optional[pulumi.Input[str]] = None,
            oss_key_prefix: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            sls_project_arn: Optional[pulumi.Input[str]] = None,
            sls_write_role_arn: Optional[pulumi.Input[str]] = None) -> 'Trail':
        """
        Get an existing Trail resource's state with the given name, id, and optional extra
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
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["event_rw"] = event_rw
        __props__["name"] = name
        __props__["oss_bucket_name"] = oss_bucket_name
        __props__["oss_key_prefix"] = oss_key_prefix
        __props__["role_name"] = role_name
        __props__["sls_project_arn"] = sls_project_arn
        __props__["sls_write_role_arn"] = sls_write_role_arn
        return Trail(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="eventRw")
    def event_rw(self) -> Optional[str]:
        """
        Indicates whether the event is a read or a write event. Valid values: Read, Write, and All. Default value: Write.
        """
        return pulumi.get(self, "event_rw")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the trail to be created, which must be unique for an account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ossBucketName")
    def oss_bucket_name(self) -> str:
        """
        The OSS bucket to which the trail delivers logs. Ensure that this is an existing OSS bucket.
        """
        return pulumi.get(self, "oss_bucket_name")

    @property
    @pulumi.getter(name="ossKeyPrefix")
    def oss_key_prefix(self) -> Optional[str]:
        """
        The prefix of the specified OSS bucket name. This parameter can be left empty.
        """
        return pulumi.get(self, "oss_key_prefix")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        """
        The RAM role in ActionTrail permitted by the user.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="slsProjectArn")
    def sls_project_arn(self) -> Optional[str]:
        """
        The unique ARN of the Log Service project.
        """
        return pulumi.get(self, "sls_project_arn")

    @property
    @pulumi.getter(name="slsWriteRoleArn")
    def sls_write_role_arn(self) -> Optional[str]:
        """
        The unique ARN of the Log Service role.
        """
        return pulumi.get(self, "sls_write_role_arn")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

