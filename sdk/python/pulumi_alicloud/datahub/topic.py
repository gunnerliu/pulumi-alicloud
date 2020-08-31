# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Topic']


class Topic(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 life_cycle: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 record_schema: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 record_type: Optional[pulumi.Input[str]] = None,
                 shard_count: Optional[pulumi.Input[float]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        The topic is the basic unit of Datahub data source and is used to define one kind of data or stream. It contains a set of subscriptions. You can manage the datahub source of an application by using topics. [Refer to details](https://help.aliyun.com/document_detail/47440.html).

        ## Example Usage

        Basic Usage

        - BLob Topic
        resource "alicloud_datahub_topic" "example" {
          name         = "tf_datahub_topic"
          project_name = "tf_datahub_project"
          record_type  = "BLOB"
          shard_count  = 3
          life_cycle   = 7
          comment      = "created by terraform"
        }

        resource "alicloud_datahub_topic" "example" {
          name         = "tf_datahub_topic"
          project_name = "tf_datahub_project"
          record_type  = "TUPLE"
          record_schema = {
            bigint_field    = "BIGINT"
            timestamp_field = "TIMESTAMP"
            string_field    = "STRING"
            double_field    = "DOUBLE"
            boolean_field   = "BOOLEAN"
          }
          shard_count = 3
          life_cycle  = 7
          comment     = "created by terraform"
        }

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment of the datahub topic. It cannot be longer than 255 characters.
        :param pulumi.Input[float] life_cycle: How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
        :param pulumi.Input[str] name: The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] project_name: The name of the datahub project that this topic belongs to. It is case-insensitive.
        :param pulumi.Input[Mapping[str, Any]] record_schema: Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
               - BIGINT
               - STRING
               - BOOLEAN
               - DOUBLE
               - TIMESTAMP
        :param pulumi.Input[str] record_type: The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
        :param pulumi.Input[float] shard_count: The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
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

            __props__['comment'] = comment
            __props__['life_cycle'] = life_cycle
            __props__['name'] = name
            if project_name is None:
                raise TypeError("Missing required property 'project_name'")
            __props__['project_name'] = project_name
            __props__['record_schema'] = record_schema
            __props__['record_type'] = record_type
            __props__['shard_count'] = shard_count
            __props__['create_time'] = None
            __props__['last_modify_time'] = None
        super(Topic, __self__).__init__(
            'alicloud:datahub/topic:Topic',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            last_modify_time: Optional[pulumi.Input[str]] = None,
            life_cycle: Optional[pulumi.Input[float]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            record_schema: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            record_type: Optional[pulumi.Input[str]] = None,
            shard_count: Optional[pulumi.Input[float]] = None) -> 'Topic':
        """
        Get an existing Topic resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Comment of the datahub topic. It cannot be longer than 255 characters.
        :param pulumi.Input[str] create_time: Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[str] last_modify_time: Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        :param pulumi.Input[float] life_cycle: How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
        :param pulumi.Input[str] name: The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        :param pulumi.Input[str] project_name: The name of the datahub project that this topic belongs to. It is case-insensitive.
        :param pulumi.Input[Mapping[str, Any]] record_schema: Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
               - BIGINT
               - STRING
               - BOOLEAN
               - DOUBLE
               - TIMESTAMP
        :param pulumi.Input[str] record_type: The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
        :param pulumi.Input[float] shard_count: The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["comment"] = comment
        __props__["create_time"] = create_time
        __props__["last_modify_time"] = last_modify_time
        __props__["life_cycle"] = life_cycle
        __props__["name"] = name
        __props__["project_name"] = project_name
        __props__["record_schema"] = record_schema
        __props__["record_type"] = record_type
        __props__["shard_count"] = shard_count
        return Topic(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment of the datahub topic. It cannot be longer than 255 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Create time of the datahub topic. It is a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="lastModifyTime")
    def last_modify_time(self) -> pulumi.Output[str]:
        """
        Last modify time of the datahub topic. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        """
        return pulumi.get(self, "last_modify_time")

    @property
    @pulumi.getter(name="lifeCycle")
    def life_cycle(self) -> pulumi.Output[Optional[float]]:
        """
        How many days this topic lives. The permitted range of values is [1, 7]. The default value is 3.
        """
        return pulumi.get(self, "life_cycle")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the datahub topic. Its length is limited to 1-128 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        The name of the datahub project that this topic belongs to. It is case-insensitive.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter(name="recordSchema")
    def record_schema(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Schema of this topic, required only for TUPLE topic. Supported data types (case-insensitive) are:
        - BIGINT
        - STRING
        - BOOLEAN
        - DOUBLE
        - TIMESTAMP
        """
        return pulumi.get(self, "record_schema")

    @property
    @pulumi.getter(name="recordType")
    def record_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of this topic. Its value must be one of {BLOB, TUPLE}. For BLOB topic, data will be organized as binary and encoded by BASE64. For TUPLE topic, data has fixed schema. The default value is "TUPLE" with a schema {STRING}.
        """
        return pulumi.get(self, "record_type")

    @property
    @pulumi.getter(name="shardCount")
    def shard_count(self) -> pulumi.Output[Optional[float]]:
        """
        The number of shards this topic contains. The permitted range of values is [1, 10]. The default value is 1.
        """
        return pulumi.get(self, "shard_count")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

