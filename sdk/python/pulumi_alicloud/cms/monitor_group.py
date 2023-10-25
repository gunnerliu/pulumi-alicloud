# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['MonitorGroupArgs', 'MonitorGroup']

@pulumi.input_type
class MonitorGroupArgs:
    def __init__(__self__, *,
                 contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 monitor_group_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a MonitorGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_groups: The alert group to which alert notifications will be sent.
        :param pulumi.Input[str] monitor_group_name: The name of the application group.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] resource_group_name: The name of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        MonitorGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            contact_groups=contact_groups,
            monitor_group_name=monitor_group_name,
            resource_group_id=resource_group_id,
            resource_group_name=resource_group_name,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             monitor_group_name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             resource_group_name: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if contact_groups is None and 'contactGroups' in kwargs:
            contact_groups = kwargs['contactGroups']
        if monitor_group_name is None and 'monitorGroupName' in kwargs:
            monitor_group_name = kwargs['monitorGroupName']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if resource_group_name is None and 'resourceGroupName' in kwargs:
            resource_group_name = kwargs['resourceGroupName']

        if contact_groups is not None:
            _setter("contact_groups", contact_groups)
        if monitor_group_name is not None:
            _setter("monitor_group_name", monitor_group_name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if resource_group_name is not None:
            _setter("resource_group_name", resource_group_name)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="contactGroups")
    def contact_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The alert group to which alert notifications will be sent.
        """
        return pulumi.get(self, "contact_groups")

    @contact_groups.setter
    def contact_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "contact_groups", value)

    @property
    @pulumi.getter(name="monitorGroupName")
    def monitor_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application group.
        """
        return pulumi.get(self, "monitor_group_name")

    @monitor_group_name.setter
    def monitor_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_group_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource group.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _MonitorGroupState:
    def __init__(__self__, *,
                 contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 monitor_group_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering MonitorGroup resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_groups: The alert group to which alert notifications will be sent.
        :param pulumi.Input[str] monitor_group_name: The name of the application group.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] resource_group_name: The name of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        _MonitorGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            contact_groups=contact_groups,
            monitor_group_name=monitor_group_name,
            resource_group_id=resource_group_id,
            resource_group_name=resource_group_name,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             monitor_group_name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             resource_group_name: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if contact_groups is None and 'contactGroups' in kwargs:
            contact_groups = kwargs['contactGroups']
        if monitor_group_name is None and 'monitorGroupName' in kwargs:
            monitor_group_name = kwargs['monitorGroupName']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if resource_group_name is None and 'resourceGroupName' in kwargs:
            resource_group_name = kwargs['resourceGroupName']

        if contact_groups is not None:
            _setter("contact_groups", contact_groups)
        if monitor_group_name is not None:
            _setter("monitor_group_name", monitor_group_name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if resource_group_name is not None:
            _setter("resource_group_name", resource_group_name)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="contactGroups")
    def contact_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The alert group to which alert notifications will be sent.
        """
        return pulumi.get(self, "contact_groups")

    @contact_groups.setter
    def contact_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "contact_groups", value)

    @property
    @pulumi.getter(name="monitorGroupName")
    def monitor_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the application group.
        """
        return pulumi.get(self, "monitor_group_name")

    @monitor_group_name.setter
    def monitor_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_group_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the resource group.
        """
        return pulumi.get(self, "resource_group_name")

    @resource_group_name.setter
    def resource_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


class MonitorGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 monitor_group_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a Cloud Monitor Service Monitor Group resource.

        For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmonitorgroup).

        > **NOTE:** Available since v1.113.0.

        ## Import

        Cloud Monitor Service Monitor Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/monitorGroup:MonitorGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_groups: The alert group to which alert notifications will be sent.
        :param pulumi.Input[str] monitor_group_name: The name of the application group.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] resource_group_name: The name of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[MonitorGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud Monitor Service Monitor Group resource.

        For information about Cloud Monitor Service Monitor Group and how to use it, see [What is Monitor Group](https://www.alibabacloud.com/help/en/cloudmonitor/latest/createmonitorgroup).

        > **NOTE:** Available since v1.113.0.

        ## Import

        Cloud Monitor Service Monitor Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cms/monitorGroup:MonitorGroup example <id>
        ```

        :param str resource_name: The name of the resource.
        :param MonitorGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MonitorGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            MonitorGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 monitor_group_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 resource_group_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MonitorGroupArgs.__new__(MonitorGroupArgs)

            __props__.__dict__["contact_groups"] = contact_groups
            __props__.__dict__["monitor_group_name"] = monitor_group_name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["resource_group_name"] = resource_group_name
            __props__.__dict__["tags"] = tags
        super(MonitorGroup, __self__).__init__(
            'alicloud:cms/monitorGroup:MonitorGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            contact_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            monitor_group_name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            resource_group_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'MonitorGroup':
        """
        Get an existing MonitorGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] contact_groups: The alert group to which alert notifications will be sent.
        :param pulumi.Input[str] monitor_group_name: The name of the application group.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] resource_group_name: The name of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MonitorGroupState.__new__(_MonitorGroupState)

        __props__.__dict__["contact_groups"] = contact_groups
        __props__.__dict__["monitor_group_name"] = monitor_group_name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["resource_group_name"] = resource_group_name
        __props__.__dict__["tags"] = tags
        return MonitorGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="contactGroups")
    def contact_groups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The alert group to which alert notifications will be sent.
        """
        return pulumi.get(self, "contact_groups")

    @property
    @pulumi.getter(name="monitorGroupName")
    def monitor_group_name(self) -> pulumi.Output[str]:
        """
        The name of the application group.
        """
        return pulumi.get(self, "monitor_group_name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="resourceGroupName")
    def resource_group_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the resource group.
        """
        return pulumi.get(self, "resource_group_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

