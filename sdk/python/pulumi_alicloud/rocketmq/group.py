# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Group']


class Group(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 group_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 read_enable: Optional[pulumi.Input[bool]] = None,
                 remark: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an ONS group resource.

        For more information about how to use it, see [RocketMQ Group Management API](https://www.alibabacloud.com/help/doc-detail/29616.html).

        > **NOTE:** Available in 1.53.0+

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "onsInstanceName"
        group_id = config.get("groupId")
        if group_id is None:
            group_id = "GID-onsGroupDatasourceName"
        default_instance = alicloud.rocketmq.Instance("defaultInstance", remark="default_ons_instance_remark")
        default_group = alicloud.rocketmq.Group("defaultGroup",
            group_id=group_id,
            instance_id=default_instance.id,
            remark="dafault_ons_group_remark")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: Name of the group. Two groups on a single instance cannot have the same name. A `group_id` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
        :param pulumi.Input[str] instance_id: ID of the ONS Instance that owns the groups.
        :param pulumi.Input[bool] read_enable: This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
        :param pulumi.Input[str] remark: This attribute is a concise description of group. The length cannot exceed 256.
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

            if group_id is None:
                raise TypeError("Missing required property 'group_id'")
            __props__['group_id'] = group_id
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            __props__['read_enable'] = read_enable
            __props__['remark'] = remark
        super(Group, __self__).__init__(
            'alicloud:rocketmq/group:Group',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            group_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            read_enable: Optional[pulumi.Input[bool]] = None,
            remark: Optional[pulumi.Input[str]] = None) -> 'Group':
        """
        Get an existing Group resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] group_id: Name of the group. Two groups on a single instance cannot have the same name. A `group_id` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
        :param pulumi.Input[str] instance_id: ID of the ONS Instance that owns the groups.
        :param pulumi.Input[bool] read_enable: This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
        :param pulumi.Input[str] remark: This attribute is a concise description of group. The length cannot exceed 256.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["group_id"] = group_id
        __props__["instance_id"] = instance_id
        __props__["read_enable"] = read_enable
        __props__["remark"] = remark
        return Group(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="groupId")
    def group_id(self) -> pulumi.Output[str]:
        """
        Name of the group. Two groups on a single instance cannot have the same name. A `group_id` starts with "GID_" or "GID-", and contains letters, numbers, hyphens (-), and underscores (_).
        """
        return pulumi.get(self, "group_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        ID of the ONS Instance that owns the groups.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="readEnable")
    def read_enable(self) -> pulumi.Output[Optional[bool]]:
        """
        This attribute is used to set the message reading enabled or disabled. It can only be set after the group is used by the client.
        """
        return pulumi.get(self, "read_enable")

    @property
    @pulumi.getter
    def remark(self) -> pulumi.Output[Optional[str]]:
        """
        This attribute is a concise description of group. The length cannot exceed 256.
        """
        return pulumi.get(self, "remark")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

