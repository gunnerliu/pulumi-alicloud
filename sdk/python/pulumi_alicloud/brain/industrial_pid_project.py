# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['IndustrialPidProjectArgs', 'IndustrialPidProject']

@pulumi.input_type
class IndustrialPidProjectArgs:
    def __init__(__self__, *,
                 pid_organization_id: pulumi.Input[str],
                 pid_project_name: pulumi.Input[str],
                 pid_project_desc: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IndustrialPidProject resource.
        :param pulumi.Input[str] pid_organization_id: The ID of Pid Organization.
        :param pulumi.Input[str] pid_project_name: The name of Pid Project.
        :param pulumi.Input[str] pid_project_desc: The description of Pid Project.
        """
        pulumi.set(__self__, "pid_organization_id", pid_organization_id)
        pulumi.set(__self__, "pid_project_name", pid_project_name)
        if pid_project_desc is not None:
            pulumi.set(__self__, "pid_project_desc", pid_project_desc)

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> pulumi.Input[str]:
        """
        The ID of Pid Organization.
        """
        return pulumi.get(self, "pid_organization_id")

    @pid_organization_id.setter
    def pid_organization_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_organization_id", value)

    @property
    @pulumi.getter(name="pidProjectName")
    def pid_project_name(self) -> pulumi.Input[str]:
        """
        The name of Pid Project.
        """
        return pulumi.get(self, "pid_project_name")

    @pid_project_name.setter
    def pid_project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "pid_project_name", value)

    @property
    @pulumi.getter(name="pidProjectDesc")
    def pid_project_desc(self) -> Optional[pulumi.Input[str]]:
        """
        The description of Pid Project.
        """
        return pulumi.get(self, "pid_project_desc")

    @pid_project_desc.setter
    def pid_project_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_project_desc", value)


@pulumi.input_type
class _IndustrialPidProjectState:
    def __init__(__self__, *,
                 pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_project_desc: Optional[pulumi.Input[str]] = None,
                 pid_project_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IndustrialPidProject resources.
        :param pulumi.Input[str] pid_organization_id: The ID of Pid Organization.
        :param pulumi.Input[str] pid_project_desc: The description of Pid Project.
        :param pulumi.Input[str] pid_project_name: The name of Pid Project.
        """
        if pid_organization_id is not None:
            pulumi.set(__self__, "pid_organization_id", pid_organization_id)
        if pid_project_desc is not None:
            pulumi.set(__self__, "pid_project_desc", pid_project_desc)
        if pid_project_name is not None:
            pulumi.set(__self__, "pid_project_name", pid_project_name)

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of Pid Organization.
        """
        return pulumi.get(self, "pid_organization_id")

    @pid_organization_id.setter
    def pid_organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_organization_id", value)

    @property
    @pulumi.getter(name="pidProjectDesc")
    def pid_project_desc(self) -> Optional[pulumi.Input[str]]:
        """
        The description of Pid Project.
        """
        return pulumi.get(self, "pid_project_desc")

    @pid_project_desc.setter
    def pid_project_desc(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_project_desc", value)

    @property
    @pulumi.getter(name="pidProjectName")
    def pid_project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of Pid Project.
        """
        return pulumi.get(self, "pid_project_name")

    @pid_project_name.setter
    def pid_project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pid_project_name", value)


class IndustrialPidProject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_project_desc: Optional[pulumi.Input[str]] = None,
                 pid_project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Brain Industrial Pid Project resource.

        > **NOTE:** Available in v1.113.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.brain.IndustrialPidProject("example",
            pid_organization_id="3e74e684-cbb5-xxxx",
            pid_project_name="tf-testAcc")
        ```

        ## Import

        Brain Industrial Pid Project can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:brain/industrialPidProject:IndustrialPidProject example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pid_organization_id: The ID of Pid Organization.
        :param pulumi.Input[str] pid_project_desc: The description of Pid Project.
        :param pulumi.Input[str] pid_project_name: The name of Pid Project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IndustrialPidProjectArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Brain Industrial Pid Project resource.

        > **NOTE:** Available in v1.113.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.brain.IndustrialPidProject("example",
            pid_organization_id="3e74e684-cbb5-xxxx",
            pid_project_name="tf-testAcc")
        ```

        ## Import

        Brain Industrial Pid Project can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:brain/industrialPidProject:IndustrialPidProject example <id>
        ```

        :param str resource_name: The name of the resource.
        :param IndustrialPidProjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IndustrialPidProjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pid_organization_id: Optional[pulumi.Input[str]] = None,
                 pid_project_desc: Optional[pulumi.Input[str]] = None,
                 pid_project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IndustrialPidProjectArgs.__new__(IndustrialPidProjectArgs)

            if pid_organization_id is None and not opts.urn:
                raise TypeError("Missing required property 'pid_organization_id'")
            __props__.__dict__["pid_organization_id"] = pid_organization_id
            __props__.__dict__["pid_project_desc"] = pid_project_desc
            if pid_project_name is None and not opts.urn:
                raise TypeError("Missing required property 'pid_project_name'")
            __props__.__dict__["pid_project_name"] = pid_project_name
        super(IndustrialPidProject, __self__).__init__(
            'alicloud:brain/industrialPidProject:IndustrialPidProject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            pid_organization_id: Optional[pulumi.Input[str]] = None,
            pid_project_desc: Optional[pulumi.Input[str]] = None,
            pid_project_name: Optional[pulumi.Input[str]] = None) -> 'IndustrialPidProject':
        """
        Get an existing IndustrialPidProject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pid_organization_id: The ID of Pid Organization.
        :param pulumi.Input[str] pid_project_desc: The description of Pid Project.
        :param pulumi.Input[str] pid_project_name: The name of Pid Project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IndustrialPidProjectState.__new__(_IndustrialPidProjectState)

        __props__.__dict__["pid_organization_id"] = pid_organization_id
        __props__.__dict__["pid_project_desc"] = pid_project_desc
        __props__.__dict__["pid_project_name"] = pid_project_name
        return IndustrialPidProject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> pulumi.Output[str]:
        """
        The ID of Pid Organization.
        """
        return pulumi.get(self, "pid_organization_id")

    @property
    @pulumi.getter(name="pidProjectDesc")
    def pid_project_desc(self) -> pulumi.Output[Optional[str]]:
        """
        The description of Pid Project.
        """
        return pulumi.get(self, "pid_project_desc")

    @property
    @pulumi.getter(name="pidProjectName")
    def pid_project_name(self) -> pulumi.Output[str]:
        """
        The name of Pid Project.
        """
        return pulumi.get(self, "pid_project_name")

