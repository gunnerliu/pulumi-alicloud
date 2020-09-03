# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['TrailDeprecated']

warnings.warn("Resource renamed to `Trail`", DeprecationWarning)


class TrailDeprecated(pulumi.CustomResource):
    warnings.warn("Resource renamed to `Trail`", DeprecationWarning)

    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 event_rw: Optional[pulumi.Input[str]] = None,
                 is_organization_trail: Optional[pulumi.Input[bool]] = None,
                 mns_topic_arn: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oss_bucket_name: Optional[pulumi.Input[str]] = None,
                 oss_key_prefix: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 sls_project_arn: Optional[pulumi.Input[str]] = None,
                 sls_write_role_arn: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 trail_name: Optional[pulumi.Input[str]] = None,
                 trail_region: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a TrailDeprecated resource with the given unique name, props, and options.
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
        pulumi.log.warn("TrailDeprecated is deprecated: Resource renamed to `Trail`")
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
            __props__['is_organization_trail'] = is_organization_trail
            __props__['mns_topic_arn'] = mns_topic_arn
            if name is not None:
                warnings.warn("Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.", DeprecationWarning)
                pulumi.log.warn("name is deprecated: Field 'name' has been deprecated from version 1.95.0. Use 'trail_name' instead.")
            __props__['name'] = name
            __props__['oss_bucket_name'] = oss_bucket_name
            __props__['oss_key_prefix'] = oss_key_prefix
            __props__['role_name'] = role_name
            __props__['sls_project_arn'] = sls_project_arn
            __props__['sls_write_role_arn'] = sls_write_role_arn
            __props__['status'] = status
            __props__['trail_name'] = trail_name
            __props__['trail_region'] = trail_region
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
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["event_rw"] = event_rw
        __props__["is_organization_trail"] = is_organization_trail
        __props__["mns_topic_arn"] = mns_topic_arn
        __props__["name"] = name
        __props__["oss_bucket_name"] = oss_bucket_name
        __props__["oss_key_prefix"] = oss_key_prefix
        __props__["role_name"] = role_name
        __props__["sls_project_arn"] = sls_project_arn
        __props__["sls_write_role_arn"] = sls_write_role_arn
        __props__["status"] = status
        __props__["trail_name"] = trail_name
        __props__["trail_region"] = trail_region
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
        return pulumi.get(self, "mns_topic_arn")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the trail to be created, which must be unique for an account.
        """
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
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The RAM role in ActionTrail permitted by the user.
        """
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
    def sls_write_role_arn(self) -> pulumi.Output[Optional[str]]:
        """
        The unique ARN of the Log Service role.
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
    def trail_region(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "trail_region")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

