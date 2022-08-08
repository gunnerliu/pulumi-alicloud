# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IndustrialPidOrganizationArgs', 'IndustrialPidOrganization']

@pulumi.input_type
class IndustrialPidOrganizationArgs:
    def __init__(__self__, *,
                 pid_organization_name: pulumi.Input[str],
                 parent_pid_organization_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IndustrialPidOrganization resource.
        :param pulumi.Input[str] pid_organization_name: The name of pid organization.
        :param pulumi.Input[str] parent_pid_organization_id: The ID of parent pid organization.
        """
        pulumi.set(__self__, "pid_organization_name", pid_organization_name)
        if parent_pid_organization_id is not None:
            pulumi.set(__self__, "parent_pid_organization_id", parent_pid_organization_id)

    @property
    @pulumi.getter(name="pidOrganizationName")
    def pid_organization_name(self) -> pulumi.Input[str]:
        """
        The name of pid organization.
        """
        return pulumi.get(self, "pid_organization_name")

    @pid_organization_name.setter
    def pid_organization_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_organization_name", value)

    @property
    @pulumi.getter(name="parentPidOrganizationId")
    def parent_pid_organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of parent pid organization.
        """
        return pulumi.get(self, "parent_pid_organization_id")

    @parent_pid_organization_id.setter
    def parent_pid_organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_pid_organization_id", value)


@pulumi.input_type
class _IndustrialPidOrganizationState:
    def __init__(__self__, *,
                 parent_pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_organization_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IndustrialPidOrganization resources.
        :param pulumi.Input[str] parent_pid_organization_id: The ID of parent pid organization.
        :param pulumi.Input[str] pid_organization_name: The name of pid organization.
        """
        if parent_pid_organization_id is not None:
            pulumi.set(__self__, "parent_pid_organization_id", parent_pid_organization_id)
        if pid_organization_name is not None:
            pulumi.set(__self__, "pid_organization_name", pid_organization_name)

    @property
    @pulumi.getter(name="parentPidOrganizationId")
    def parent_pid_organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of parent pid organization.
        """
        return pulumi.get(self, "parent_pid_organization_id")

    @parent_pid_organization_id.setter
    def parent_pid_organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_pid_organization_id", value)

    @property
    @pulumi.getter(name="pidOrganizationName")
    def pid_organization_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of pid organization.
        """
        return pulumi.get(self, "pid_organization_name")

    @pid_organization_name.setter
    def pid_organization_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_organization_name", value)


class IndustrialPidOrganization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parent_pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_organization_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Brain Industrial Pid Organization resource.

        > **NOTE:** Available in v1.113.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.brain.IndustrialPidOrganization("example", pid_organization_name="tf-testAcc")
        ```

        ## Import

        Brain Industrial Pid Organization can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:brain/industrialPidOrganization:IndustrialPidOrganization example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] parent_pid_organization_id: The ID of parent pid organization.
        :param pulumi.Input[str] pid_organization_name: The name of pid organization.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IndustrialPidOrganizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Brain Industrial Pid Organization resource.

        > **NOTE:** Available in v1.113.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.brain.IndustrialPidOrganization("example", pid_organization_name="tf-testAcc")
        ```

        ## Import

        Brain Industrial Pid Organization can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:brain/industrialPidOrganization:IndustrialPidOrganization example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IndustrialPidOrganizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IndustrialPidOrganizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 parent_pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_organization_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IndustrialPidOrganizationArgs.__new__(IndustrialPidOrganizationArgs)

            __props__.__dict__["parent_pid_organization_id"] = parent_pid_organization_id
            if pid_organization_name is None and not opts.urn:
                raise TypeError("Missing required property 'pid_organization_name'")
            __props__.__dict__["pid_organization_name"] = pid_organization_name
        super(IndustrialPidOrganization, __self__).__init__(
            'alicloud:brain/industrialPidOrganization:IndustrialPidOrganization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            parent_pid_organization_id: Optional[pulumi.Input[str]] = None,
            pid_organization_name: Optional[pulumi.Input[str]] = None) -> 'IndustrialPidOrganization':
        """
        Get an existing IndustrialPidOrganization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] parent_pid_organization_id: The ID of parent pid organization.
        :param pulumi.Input[str] pid_organization_name: The name of pid organization.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IndustrialPidOrganizationState.__new__(_IndustrialPidOrganizationState)

        __props__.__dict__["parent_pid_organization_id"] = parent_pid_organization_id
        __props__.__dict__["pid_organization_name"] = pid_organization_name
        return IndustrialPidOrganization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="parentPidOrganizationId")
    def parent_pid_organization_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of parent pid organization.
        """
        return pulumi.get(self, "parent_pid_organization_id")

    @property
    @pulumi.getter(name="pidOrganizationName")
    def pid_organization_name(self) -> pulumi.Output[str]:
        """
        The name of pid organization.
        """
        return pulumi.get(self, "pid_organization_name")

