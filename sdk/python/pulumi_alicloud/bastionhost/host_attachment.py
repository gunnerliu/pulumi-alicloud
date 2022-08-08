# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HostAttachmentArgs', 'HostAttachment']

@pulumi.input_type
class HostAttachmentArgs:
    def __init__(__self__, *,
                 host_group_id: pulumi.Input[str],
                 host_id: pulumi.Input[str],
                 instance_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a HostAttachment resource.
        :param pulumi.Input[str] host_group_id: Specifies the added to the host group ID.
        :param pulumi.Input[str] host_id: Specified to be part of a host group of host ID.
        :param pulumi.Input[str] instance_id: The bastion host instance id.
        """
        pulumi.set(__self__, "host_group_id", host_group_id)
        pulumi.set(__self__, "host_id", host_id)
        pulumi.set(__self__, "instance_id", instance_id)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> pulumi.Input[str]:
        """
        Specifies the added to the host group ID.
        """
        return pulumi.get(self, "host_group_id")

    @host_group_id.setter
    def host_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_group_id", value)

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> pulumi.Input[str]:
        """
        Specified to be part of a host group of host ID.
        """
        return pulumi.get(self, "host_id")

    @host_id.setter
    def host_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "host_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The bastion host instance id.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)


@pulumi.input_type
class _HostAttachmentState:
    def __init__(__self__, *,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HostAttachment resources.
        :param pulumi.Input[str] host_group_id: Specifies the added to the host group ID.
        :param pulumi.Input[str] host_id: Specified to be part of a host group of host ID.
        :param pulumi.Input[str] instance_id: The bastion host instance id.
        """
        if host_group_id is not None:
            pulumi.set(__self__, "host_group_id", host_group_id)
        if host_id is not None:
            pulumi.set(__self__, "host_id", host_id)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the added to the host group ID.
        """
        return pulumi.get(self, "host_group_id")

    @host_group_id.setter
    def host_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_group_id", value)

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specified to be part of a host group of host ID.
        """
        return pulumi.get(self, "host_id")

    @host_id.setter
    def host_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "host_id", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The bastion host instance id.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)


class HostAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Bastion Host Host Attachment resource to add host into one host group.

        > **NOTE:** Available in v1.135.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.bastionhost.HostAttachment("example",
            host_group_id="6",
            host_id="15",
            instance_id="bastionhost-cn-tl32bh0no30")
        ```

        ## Import

        Bastion Host Host Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostAttachment:HostAttachment example <instance_id>:<host_group_id>:<host_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_group_id: Specifies the added to the host group ID.
        :param pulumi.Input[str] host_id: Specified to be part of a host group of host ID.
        :param pulumi.Input[str] instance_id: The bastion host instance id.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HostAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Bastion Host Host Attachment resource to add host into one host group.

        > **NOTE:** Available in v1.135.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.bastionhost.HostAttachment("example",
            host_group_id="6",
            host_id="15",
            instance_id="bastionhost-cn-tl32bh0no30")
        ```

        ## Import

        Bastion Host Host Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/hostAttachment:HostAttachment example <instance_id>:<host_group_id>:<host_id>
        ```

        :param str resource_name: The name of the resource.
        :param HostAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HostAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 host_group_id: Optional[pulumi.Input[str]] = None,
                 host_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HostAttachmentArgs.__new__(HostAttachmentArgs)

            if host_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'host_group_id'")
            __props__.__dict__["host_group_id"] = host_group_id
            if host_id is None and not opts.urn:
                raise TypeError("Missing required property 'host_id'")
            __props__.__dict__["host_id"] = host_id
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
        super(HostAttachment, __self__).__init__(
            'alicloud:bastionhost/hostAttachment:HostAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            host_group_id: Optional[pulumi.Input[str]] = None,
            host_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None) -> 'HostAttachment':
        """
        Get an existing HostAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] host_group_id: Specifies the added to the host group ID.
        :param pulumi.Input[str] host_id: Specified to be part of a host group of host ID.
        :param pulumi.Input[str] instance_id: The bastion host instance id.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HostAttachmentState.__new__(_HostAttachmentState)

        __props__.__dict__["host_group_id"] = host_group_id
        __props__.__dict__["host_id"] = host_id
        __props__.__dict__["instance_id"] = instance_id
        return HostAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> pulumi.Output[str]:
        """
        Specifies the added to the host group ID.
        """
        return pulumi.get(self, "host_group_id")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> pulumi.Output[str]:
        """
        Specified to be part of a host group of host ID.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The bastion host instance id.
        """
        return pulumi.get(self, "instance_id")

