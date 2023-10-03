# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AccessRuleArgs', 'AccessRule']

@pulumi.input_type
class AccessRuleArgs:
    def __init__(__self__, *,
                 access_group_id: pulumi.Input[str],
                 network_segment: pulumi.Input[str],
                 priority: pulumi.Input[int],
                 rw_access_type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessRule resource.
        :param pulumi.Input[str] access_group_id: The resource ID of Access Group.
        :param pulumi.Input[str] network_segment: The NetworkSegment of the Access Rule.
        :param pulumi.Input[int] priority: The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        :param pulumi.Input[str] rw_access_type: The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        :param pulumi.Input[str] description: The Description of the Access Rule.
        """
        AccessRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_id=access_group_id,
            network_segment=network_segment,
            priority=priority,
            rw_access_type=rw_access_type,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_id: pulumi.Input[str],
             network_segment: pulumi.Input[str],
             priority: pulumi.Input[int],
             rw_access_type: pulumi.Input[str],
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("access_group_id", access_group_id)
        _setter("network_segment", network_segment)
        _setter("priority", priority)
        _setter("rw_access_type", rw_access_type)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> pulumi.Input[str]:
        """
        The resource ID of Access Group.
        """
        return pulumi.get(self, "access_group_id")

    @access_group_id.setter
    def access_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_group_id", value)

    @property
    @pulumi.getter(name="networkSegment")
    def network_segment(self) -> pulumi.Input[str]:
        """
        The NetworkSegment of the Access Rule.
        """
        return pulumi.get(self, "network_segment")

    @network_segment.setter
    def network_segment(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_segment", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="rwAccessType")
    def rw_access_type(self) -> pulumi.Input[str]:
        """
        The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        return pulumi.get(self, "rw_access_type")

    @rw_access_type.setter
    def rw_access_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "rw_access_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description of the Access Rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _AccessRuleState:
    def __init__(__self__, *,
                 access_group_id: Optional[pulumi.Input[str]] = None,
                 access_rule_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_segment: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 rw_access_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessRule resources.
        :param pulumi.Input[str] access_group_id: The resource ID of Access Group.
        :param pulumi.Input[str] access_rule_id: The ID of the Access Rule.
        :param pulumi.Input[str] description: The Description of the Access Rule.
        :param pulumi.Input[str] network_segment: The NetworkSegment of the Access Rule.
        :param pulumi.Input[int] priority: The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        :param pulumi.Input[str] rw_access_type: The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        _AccessRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            access_group_id=access_group_id,
            access_rule_id=access_rule_id,
            description=description,
            network_segment=network_segment,
            priority=priority,
            rw_access_type=rw_access_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             access_group_id: Optional[pulumi.Input[str]] = None,
             access_rule_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             network_segment: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             rw_access_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if access_group_id is not None:
            _setter("access_group_id", access_group_id)
        if access_rule_id is not None:
            _setter("access_rule_id", access_rule_id)
        if description is not None:
            _setter("description", description)
        if network_segment is not None:
            _setter("network_segment", network_segment)
        if priority is not None:
            _setter("priority", priority)
        if rw_access_type is not None:
            _setter("rw_access_type", rw_access_type)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource ID of Access Group.
        """
        return pulumi.get(self, "access_group_id")

    @access_group_id.setter
    def access_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_group_id", value)

    @property
    @pulumi.getter(name="accessRuleId")
    def access_rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Access Rule.
        """
        return pulumi.get(self, "access_rule_id")

    @access_rule_id.setter
    def access_rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_rule_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description of the Access Rule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="networkSegment")
    def network_segment(self) -> Optional[pulumi.Input[str]]:
        """
        The NetworkSegment of the Access Rule.
        """
        return pulumi.get(self, "network_segment")

    @network_segment.setter
    def network_segment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_segment", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="rwAccessType")
    def rw_access_type(self) -> Optional[pulumi.Input[str]]:
        """
        The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        return pulumi.get(self, "rw_access_type")

    @rw_access_type.setter
    def rw_access_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rw_access_type", value)


class AccessRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_segment: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 rw_access_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DFS Access Rule resource.

        For information about DFS Access Rule and how to use it, see [What is Access Rule](https://www.alibabacloud.com/help/doc-detail/207144.htm).

        > **NOTE:** Available since v1.140.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_name"
        default_access_group = alicloud.dfs.AccessGroup("defaultAccessGroup",
            network_type="VPC",
            access_group_name=name,
            description=name)
        default_access_rule = alicloud.dfs.AccessRule("defaultAccessRule",
            network_segment="192.0.2.0/24",
            access_group_id=default_access_group.id,
            description=name,
            rw_access_type="RDWR",
            priority=10)
        ```

        ## Import

        DFS Access Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dfs/accessRule:AccessRule example <access_group_id>:<access_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_id: The resource ID of Access Group.
        :param pulumi.Input[str] description: The Description of the Access Rule.
        :param pulumi.Input[str] network_segment: The NetworkSegment of the Access Rule.
        :param pulumi.Input[int] priority: The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        :param pulumi.Input[str] rw_access_type: The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DFS Access Rule resource.

        For information about DFS Access Rule and how to use it, see [What is Access Rule](https://www.alibabacloud.com/help/doc-detail/207144.htm).

        > **NOTE:** Available since v1.140.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "example_name"
        default_access_group = alicloud.dfs.AccessGroup("defaultAccessGroup",
            network_type="VPC",
            access_group_name=name,
            description=name)
        default_access_rule = alicloud.dfs.AccessRule("defaultAccessRule",
            network_segment="192.0.2.0/24",
            access_group_id=default_access_group.id,
            description=name,
            rw_access_type="RDWR",
            priority=10)
        ```

        ## Import

        DFS Access Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dfs/accessRule:AccessRule example <access_group_id>:<access_rule_id>
        ```

        :param str resource_name: The name of the resource.
        :param AccessRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccessRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_group_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 network_segment: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 rw_access_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessRuleArgs.__new__(AccessRuleArgs)

            if access_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'access_group_id'")
            __props__.__dict__["access_group_id"] = access_group_id
            __props__.__dict__["description"] = description
            if network_segment is None and not opts.urn:
                raise TypeError("Missing required property 'network_segment'")
            __props__.__dict__["network_segment"] = network_segment
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            if rw_access_type is None and not opts.urn:
                raise TypeError("Missing required property 'rw_access_type'")
            __props__.__dict__["rw_access_type"] = rw_access_type
            __props__.__dict__["access_rule_id"] = None
        super(AccessRule, __self__).__init__(
            'alicloud:dfs/accessRule:AccessRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_group_id: Optional[pulumi.Input[str]] = None,
            access_rule_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            network_segment: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            rw_access_type: Optional[pulumi.Input[str]] = None) -> 'AccessRule':
        """
        Get an existing AccessRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_group_id: The resource ID of Access Group.
        :param pulumi.Input[str] access_rule_id: The ID of the Access Rule.
        :param pulumi.Input[str] description: The Description of the Access Rule.
        :param pulumi.Input[str] network_segment: The NetworkSegment of the Access Rule.
        :param pulumi.Input[int] priority: The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        :param pulumi.Input[str] rw_access_type: The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessRuleState.__new__(_AccessRuleState)

        __props__.__dict__["access_group_id"] = access_group_id
        __props__.__dict__["access_rule_id"] = access_rule_id
        __props__.__dict__["description"] = description
        __props__.__dict__["network_segment"] = network_segment
        __props__.__dict__["priority"] = priority
        __props__.__dict__["rw_access_type"] = rw_access_type
        return AccessRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessGroupId")
    def access_group_id(self) -> pulumi.Output[str]:
        """
        The resource ID of Access Group.
        """
        return pulumi.get(self, "access_group_id")

    @property
    @pulumi.getter(name="accessRuleId")
    def access_rule_id(self) -> pulumi.Output[str]:
        """
        The ID of the Access Rule.
        """
        return pulumi.get(self, "access_rule_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The Description of the Access Rule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="networkSegment")
    def network_segment(self) -> pulumi.Output[str]:
        """
        The NetworkSegment of the Access Rule.
        """
        return pulumi.get(self, "network_segment")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The Priority of the Access Rule. Valid values: `1` to `100`. **NOTE:** When multiple rules are matched by the same authorized object, the high-priority rule takes effect. `1` is the highest priority.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="rwAccessType")
    def rw_access_type(self) -> pulumi.Output[str]:
        """
        The RWAccessType of the Access Rule. Valid values: `RDONLY`, `RDWR`.
        """
        return pulumi.get(self, "rw_access_type")

