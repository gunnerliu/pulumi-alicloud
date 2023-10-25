# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HostGroupArgs', 'HostGroup']

@pulumi.input_type
class HostGroupArgs:
    def __init__(__self__, *,
                 host_group_name: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HostGroup resource.
        :param pulumi.Input[str] host_group_name: Specify the New Host Group Name, Supports up to 128 Characters.
        :param pulumi.Input[str] instance_id: Specify the New Host Group Where the Bastion Host ID of.
        :param pulumi.Input[str] comment: Specify the New Host Group of Notes, Supports up to 500 Characters.
        """
        HostGroupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            host_group_name=host_group_name,
            instance_id=instance_id,
            comment=comment,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             host_group_name: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             comment: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if host_group_name is None and 'hostGroupName' in kwargs:
            host_group_name = kwargs['hostGroupName']
        if host_group_name is None:
            raise TypeError("Missing 'host_group_name' argument")
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")

        _setter("host_group_name", host_group_name)
        _setter("instance_id", instance_id)
        if comment is not None:
            _setter("comment", comment)

    @property
    @pulumi.getter(name="hostGroupName")
    def host_group_name(self) -> pulumi.Input[str]:
        """
        Specify the New Host Group Name, Supports up to 128 Characters.
        """
        return pulumi.get(self, "host_group_name")

    @host_group_name.setter
    def host_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_group_name", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Specify the New Host Group Where the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Host Group of Notes, Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)


@pulumi.input_type
class _HostGroupState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 host_group_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostGroup resources.
        :param pulumi.Input[str] comment: Specify the New Host Group of Notes, Supports up to 500 Characters.
        :param pulumi.Input[str] host_group_id: Host Group ID.
        :param pulumi.Input[str] host_group_name: Specify the New Host Group Name, Supports up to 128 Characters.
        :param pulumi.Input[str] instance_id: Specify the New Host Group Where the Bastion Host ID of.
        """
        _HostGroupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            comment=comment,
            host_group_id=host_group_id,
            host_group_name=host_group_name,
            instance_id=instance_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             comment: Optional[pulumi.Input[str]] = None,
             host_group_id: Optional[pulumi.Input[str]] = None,
             host_group_name: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if host_group_id is None and 'hostGroupId' in kwargs:
            host_group_id = kwargs['hostGroupId']
        if host_group_name is None and 'hostGroupName' in kwargs:
            host_group_name = kwargs['hostGroupName']
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']

        if comment is not None:
            _setter("comment", comment)
        if host_group_id is not None:
            _setter("host_group_id", host_group_id)
        if host_group_name is not None:
            _setter("host_group_name", host_group_name)
        if instance_id is not None:
            _setter("instance_id", instance_id)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Host Group of Notes, Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Host Group ID.
        """
        return pulumi.get(self, "host_group_id")

    @host_group_id.setter
    def host_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_group_id", value)

    @property
    @pulumi.getter(name="hostGroupName")
    def host_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Host Group Name, Supports up to 128 Characters.
        """
        return pulumi.get(self, "host_group_name")

    @host_group_name.setter
    def host_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_group_name", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Host Group Where the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)


class HostGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 host_group_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Bastion Host Host Group resource.

        For information about Bastion Host Host Group and how to use it, see [What is Host Group](https://www.alibabacloud.com/help/en/doc-detail/204307.htm).

        > **NOTE:** Available since v1.134.0.

        ## Import

        Bastion Host Host Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostGroup:HostGroup example <instance_id>:<host_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specify the New Host Group of Notes, Supports up to 500 Characters.
        :param pulumi.Input[str] host_group_name: Specify the New Host Group Name, Supports up to 128 Characters.
        :param pulumi.Input[str] instance_id: Specify the New Host Group Where the Bastion Host ID of.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Bastion Host Host Group resource.

        For information about Bastion Host Host Group and how to use it, see [What is Host Group](https://www.alibabacloud.com/help/en/doc-detail/204307.htm).

        > **NOTE:** Available since v1.134.0.

        ## Import

        Bastion Host Host Group can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostGroup:HostGroup example <instance_id>:<host_group_id>
        ```

        :param str resource_name: The name of the resource.
        :param HostGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HostGroupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 host_group_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostGroupArgs.__new__(HostGroupArgs)

            __props__.__dict__["comment"] = comment
            if host_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'host_group_name'")
            __props__.__dict__["host_group_name"] = host_group_name
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["host_group_id"] = None
        super(HostGroup, __self__).__init__(
            'alicloud:bastionhost/hostGroup:HostGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            host_group_id: Optional[pulumi.Input[str]] = None,
            host_group_name: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None) -> 'HostGroup':
        """
        Get an existing HostGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specify the New Host Group of Notes, Supports up to 500 Characters.
        :param pulumi.Input[str] host_group_id: Host Group ID.
        :param pulumi.Input[str] host_group_name: Specify the New Host Group Name, Supports up to 128 Characters.
        :param pulumi.Input[str] instance_id: Specify the New Host Group Where the Bastion Host ID of.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostGroupState.__new__(_HostGroupState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["host_group_id"] = host_group_id
        __props__.__dict__["host_group_name"] = host_group_name
        __props__.__dict__["instance_id"] = instance_id
        return HostGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the New Host Group of Notes, Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> pulumi.Output[str]:
        """
        Host Group ID.
        """
        return pulumi.get(self, "host_group_id")

    @property
    @pulumi.getter(name="hostGroupName")
    def host_group_name(self) -> pulumi.Output[str]:
        """
        Specify the New Host Group Name, Supports up to 128 Characters.
        """
        return pulumi.get(self, "host_group_name")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Specify the New Host Group Where the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

