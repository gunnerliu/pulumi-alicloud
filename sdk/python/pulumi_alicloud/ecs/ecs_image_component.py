# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EcsImageComponentArgs', 'EcsImageComponent']

@pulumi.input_type
class EcsImageComponentArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 component_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 image_component_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 system_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a EcsImageComponent resource.
        :param pulumi.Input[str] content: The content of the image component. The content can consist of up to 127 commands.
        :param pulumi.Input[str] component_type: The type of the image component. Only image building components are supported. Valid values: `Build`.
        :param pulumi.Input[str] description: The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] image_component_name: The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which to assign the image component.
        :param pulumi.Input[str] system_type: The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        EcsImageComponentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            content=content,
            component_type=component_type,
            description=description,
            image_component_name=image_component_name,
            resource_group_id=resource_group_id,
            system_type=system_type,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             content: Optional[pulumi.Input[str]] = None,
             component_type: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             image_component_name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             system_type: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if content is None:
            raise TypeError("Missing 'content' argument")
        if component_type is None and 'componentType' in kwargs:
            component_type = kwargs['componentType']
        if image_component_name is None and 'imageComponentName' in kwargs:
            image_component_name = kwargs['imageComponentName']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if system_type is None and 'systemType' in kwargs:
            system_type = kwargs['systemType']

        _setter("content", content)
        if component_type is not None:
            _setter("component_type", component_type)
        if description is not None:
            _setter("description", description)
        if image_component_name is not None:
            _setter("image_component_name", image_component_name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if system_type is not None:
            _setter("system_type", system_type)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The content of the image component. The content can consist of up to 127 commands.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="componentType")
    def component_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the image component. Only image building components are supported. Valid values: `Build`.
        """
        return pulumi.get(self, "component_type")

    @component_type.setter
    def component_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "component_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="imageComponentName")
    def image_component_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        """
        return pulumi.get(self, "image_component_name")

    @image_component_name.setter
    def image_component_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_component_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which to assign the image component.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="systemType")
    def system_type(self) -> Optional[pulumi.Input[str]]:
        """
        The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        """
        return pulumi.get(self, "system_type")

    @system_type.setter
    def system_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "system_type", value)

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
class _EcsImageComponentState:
    def __init__(__self__, *,
                 component_type: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 image_component_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 system_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        Input properties used for looking up and filtering EcsImageComponent resources.
        :param pulumi.Input[str] component_type: The type of the image component. Only image building components are supported. Valid values: `Build`.
        :param pulumi.Input[str] content: The content of the image component. The content can consist of up to 127 commands.
        :param pulumi.Input[str] description: The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] image_component_name: The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which to assign the image component.
        :param pulumi.Input[str] system_type: The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        _EcsImageComponentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            component_type=component_type,
            content=content,
            description=description,
            image_component_name=image_component_name,
            resource_group_id=resource_group_id,
            system_type=system_type,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             component_type: Optional[pulumi.Input[str]] = None,
             content: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             image_component_name: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             system_type: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if component_type is None and 'componentType' in kwargs:
            component_type = kwargs['componentType']
        if image_component_name is None and 'imageComponentName' in kwargs:
            image_component_name = kwargs['imageComponentName']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if system_type is None and 'systemType' in kwargs:
            system_type = kwargs['systemType']

        if component_type is not None:
            _setter("component_type", component_type)
        if content is not None:
            _setter("content", content)
        if description is not None:
            _setter("description", description)
        if image_component_name is not None:
            _setter("image_component_name", image_component_name)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if system_type is not None:
            _setter("system_type", system_type)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="componentType")
    def component_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the image component. Only image building components are supported. Valid values: `Build`.
        """
        return pulumi.get(self, "component_type")

    @component_type.setter
    def component_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "component_type", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The content of the image component. The content can consist of up to 127 commands.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="imageComponentName")
    def image_component_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        """
        return pulumi.get(self, "image_component_name")

    @image_component_name.setter
    def image_component_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "image_component_name", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which to assign the image component.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="systemType")
    def system_type(self) -> Optional[pulumi.Input[str]]:
        """
        The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        """
        return pulumi.get(self, "system_type")

    @system_type.setter
    def system_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "system_type", value)

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


class EcsImageComponent(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 component_type: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 image_component_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 system_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        """
        Provides a ECS Image Component resource.

        For information about ECS Image Component and how to use it, see [What is Image Component](https://www.alibabacloud.com/help/en/doc-detail/200424.htm).

        > **NOTE:** Available in v1.159.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.resourcemanager.get_resource_groups(name_regex="default")
        example = alicloud.ecs.EcsImageComponent("example",
            component_type="Build",
            content="RUN yum update -y",
            description="example_value",
            image_component_name="example_value",
            resource_group_id=default.groups[0].id,
            system_type="Linux",
            tags={
                "Created": "TF",
            })
        ```

        ## Import

        ECS Image Component can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/ecsImageComponent:EcsImageComponent example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] component_type: The type of the image component. Only image building components are supported. Valid values: `Build`.
        :param pulumi.Input[str] content: The content of the image component. The content can consist of up to 127 commands.
        :param pulumi.Input[str] description: The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] image_component_name: The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which to assign the image component.
        :param pulumi.Input[str] system_type: The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EcsImageComponentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ECS Image Component resource.

        For information about ECS Image Component and how to use it, see [What is Image Component](https://www.alibabacloud.com/help/en/doc-detail/200424.htm).

        > **NOTE:** Available in v1.159.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.resourcemanager.get_resource_groups(name_regex="default")
        example = alicloud.ecs.EcsImageComponent("example",
            component_type="Build",
            content="RUN yum update -y",
            description="example_value",
            image_component_name="example_value",
            resource_group_id=default.groups[0].id,
            system_type="Linux",
            tags={
                "Created": "TF",
            })
        ```

        ## Import

        ECS Image Component can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:ecs/ecsImageComponent:EcsImageComponent example <id>
        ```

        :param str resource_name: The name of the resource.
        :param EcsImageComponentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EcsImageComponentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EcsImageComponentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 component_type: Optional[pulumi.Input[str]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 image_component_name: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 system_type: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EcsImageComponentArgs.__new__(EcsImageComponentArgs)

            __props__.__dict__["component_type"] = component_type
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["description"] = description
            __props__.__dict__["image_component_name"] = image_component_name
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["system_type"] = system_type
            __props__.__dict__["tags"] = tags
        super(EcsImageComponent, __self__).__init__(
            'alicloud:ecs/ecsImageComponent:EcsImageComponent',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            component_type: Optional[pulumi.Input[str]] = None,
            content: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            image_component_name: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            system_type: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'EcsImageComponent':
        """
        Get an existing EcsImageComponent resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] component_type: The type of the image component. Only image building components are supported. Valid values: `Build`.
        :param pulumi.Input[str] content: The content of the image component. The content can consist of up to 127 commands.
        :param pulumi.Input[str] description: The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        :param pulumi.Input[str] image_component_name: The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which to assign the image component.
        :param pulumi.Input[str] system_type: The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EcsImageComponentState.__new__(_EcsImageComponentState)

        __props__.__dict__["component_type"] = component_type
        __props__.__dict__["content"] = content
        __props__.__dict__["description"] = description
        __props__.__dict__["image_component_name"] = image_component_name
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["system_type"] = system_type
        __props__.__dict__["tags"] = tags
        return EcsImageComponent(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="componentType")
    def component_type(self) -> pulumi.Output[str]:
        """
        The type of the image component. Only image building components are supported. Valid values: `Build`.
        """
        return pulumi.get(self, "component_type")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The content of the image component. The content can consist of up to 127 commands.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the image component. The description must be `2` to `256` characters in length and cannot start with `http://` or `https://`.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="imageComponentName")
    def image_component_name(self) -> pulumi.Output[str]:
        """
        The name of the image component. The name must be `2` to `128` characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
        """
        return pulumi.get(self, "image_component_name")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the resource group to which to assign the image component.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="systemType")
    def system_type(self) -> pulumi.Output[str]:
        """
        The operating system type supported by the image component. Only Linux is supported. Valid values: `Linux`.
        """
        return pulumi.get(self, "system_type")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

