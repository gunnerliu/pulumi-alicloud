# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RoleAttachmentArgs', 'RoleAttachment']

@pulumi.input_type
class RoleAttachmentArgs:
    def __init__(__self__, *,
                 instance_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 role_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a RoleAttachment resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] role_name: The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        RoleAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_ids=instance_ids,
            role_name=role_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             role_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if instance_ids is None and 'instanceIds' in kwargs:
            instance_ids = kwargs['instanceIds']
        if instance_ids is None:
            raise TypeError("Missing 'instance_ids' argument")
        if role_name is None and 'roleName' in kwargs:
            role_name = kwargs['roleName']
        if role_name is None:
            raise TypeError("Missing 'role_name' argument")

        _setter("instance_ids", instance_ids)
        _setter("role_name", role_name)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[str]:
        """
        The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_name", value)


@pulumi.input_type
class _RoleAttachmentState:
    def __init__(__self__, *,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RoleAttachment resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] role_name: The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        _RoleAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_ids=instance_ids,
            role_name=role_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             role_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if instance_ids is None and 'instanceIds' in kwargs:
            instance_ids = kwargs['instanceIds']
        if role_name is None and 'roleName' in kwargs:
            role_name = kwargs['roleName']

        if instance_ids is not None:
            _setter("instance_ids", instance_ids)
        if role_name is not None:
            _setter("role_name", role_name)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)


class RoleAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RAM role attachment resource to bind role for several ECS instances.

        > **NOTE:** Available since v1.0.0+.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] role_name: The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RAM role attachment resource to bind role for several ECS instances.

        > **NOTE:** Available since v1.0.0+.

        :param str resource_name: The name of the resource.
        :param RoleAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RoleAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleAttachmentArgs.__new__(RoleAttachmentArgs)

            if instance_ids is None and not opts.urn:
                raise TypeError("Missing required property 'instance_ids'")
            __props__.__dict__["instance_ids"] = instance_ids
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
        super(RoleAttachment, __self__).__init__(
            'alicloud:ram/roleAttachment:RoleAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            role_name: Optional[pulumi.Input[str]] = None) -> 'RoleAttachment':
        """
        Get an existing RoleAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] role_name: The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleAttachmentState.__new__(_RoleAttachmentState)

        __props__.__dict__["instance_ids"] = instance_ids
        __props__.__dict__["role_name"] = role_name
        return RoleAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "role_name")

