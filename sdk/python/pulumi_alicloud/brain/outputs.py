# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = [
    'GetIndustrialPidLoopsLoopResult',
    'GetIndustrialPidOrganizationsOrganizationResult',
    'GetIndustrialPidProjectsProjectResult',
]

@pulumi.output_type
class GetIndustrialPidLoopsLoopResult(dict):
    def __init__(__self__, *,
                 id: str,
                 pid_loop_configuration: str,
                 pid_loop_dcs_type: str,
                 pid_loop_desc: str,
                 pid_loop_id: str,
                 pid_loop_is_crucial: bool,
                 pid_loop_name: str,
                 pid_loop_type: str,
                 pid_project_id: str,
                 status: str):
        """
        :param str id: The ID of the Pid Loop.
        :param str pid_loop_dcs_type: The dcs type of Pid Loop.
        :param str pid_loop_id: The ID of the Pid Loop.
        :param bool pid_loop_is_crucial: Whether is crucial Pid Loop.
        :param str pid_loop_name: The name of Pid Loop.
        :param str pid_loop_type: The type of Pid Loop.
        :param str pid_project_id: The pid project id.
        :param str status: The status of Pid Loop.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "pid_loop_configuration", pid_loop_configuration)
        pulumi.set(__self__, "pid_loop_dcs_type", pid_loop_dcs_type)
        pulumi.set(__self__, "pid_loop_desc", pid_loop_desc)
        pulumi.set(__self__, "pid_loop_id", pid_loop_id)
        pulumi.set(__self__, "pid_loop_is_crucial", pid_loop_is_crucial)
        pulumi.set(__self__, "pid_loop_name", pid_loop_name)
        pulumi.set(__self__, "pid_loop_type", pid_loop_type)
        pulumi.set(__self__, "pid_project_id", pid_project_id)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Pid Loop.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="pidLoopConfiguration")
    def pid_loop_configuration(self) -> str:
        return pulumi.get(self, "pid_loop_configuration")

    @property
    @pulumi.getter(name="pidLoopDcsType")
    def pid_loop_dcs_type(self) -> str:
        """
        The dcs type of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_dcs_type")

    @property
    @pulumi.getter(name="pidLoopDesc")
    def pid_loop_desc(self) -> str:
        return pulumi.get(self, "pid_loop_desc")

    @property
    @pulumi.getter(name="pidLoopId")
    def pid_loop_id(self) -> str:
        """
        The ID of the Pid Loop.
        """
        return pulumi.get(self, "pid_loop_id")

    @property
    @pulumi.getter(name="pidLoopIsCrucial")
    def pid_loop_is_crucial(self) -> bool:
        """
        Whether is crucial Pid Loop.
        """
        return pulumi.get(self, "pid_loop_is_crucial")

    @property
    @pulumi.getter(name="pidLoopName")
    def pid_loop_name(self) -> str:
        """
        The name of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_name")

    @property
    @pulumi.getter(name="pidLoopType")
    def pid_loop_type(self) -> str:
        """
        The type of Pid Loop.
        """
        return pulumi.get(self, "pid_loop_type")

    @property
    @pulumi.getter(name="pidProjectId")
    def pid_project_id(self) -> str:
        """
        The pid project id.
        """
        return pulumi.get(self, "pid_project_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of Pid Loop.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetIndustrialPidOrganizationsOrganizationResult(dict):
    def __init__(__self__, *,
                 id: str,
                 parent_pid_organization_id: str,
                 pid_organization_id: str,
                 pid_organization_level: int,
                 pid_organization_name: str):
        """
        :param str id: The ID of the Pid Organization.
        :param str parent_pid_organization_id: The parent organization id.
        :param str pid_organization_id: The organization id.
        :param int pid_organization_level: The organization level.
        :param str pid_organization_name: The organization name.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "parent_pid_organization_id", parent_pid_organization_id)
        pulumi.set(__self__, "pid_organization_id", pid_organization_id)
        pulumi.set(__self__, "pid_organization_level", pid_organization_level)
        pulumi.set(__self__, "pid_organization_name", pid_organization_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Pid Organization.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="parentPidOrganizationId")
    def parent_pid_organization_id(self) -> str:
        """
        The parent organization id.
        """
        return pulumi.get(self, "parent_pid_organization_id")

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> str:
        """
        The organization id.
        """
        return pulumi.get(self, "pid_organization_id")

    @property
    @pulumi.getter(name="pidOrganizationLevel")
    def pid_organization_level(self) -> int:
        """
        The organization level.
        """
        return pulumi.get(self, "pid_organization_level")

    @property
    @pulumi.getter(name="pidOrganizationName")
    def pid_organization_name(self) -> str:
        """
        The organization name.
        """
        return pulumi.get(self, "pid_organization_name")


@pulumi.output_type
class GetIndustrialPidProjectsProjectResult(dict):
    def __init__(__self__, *,
                 id: str,
                 pid_organization_id: str,
                 pid_project_desc: str,
                 pid_project_id: str,
                 pid_project_name: str):
        """
        :param str id: The ID of the Pid Project.
        :param str pid_organization_id: The ID of Pid Organization.
        :param str pid_project_desc: The description of Pid Project.
        :param str pid_project_id: The ID of Pid Project.
        :param str pid_project_name: The name of Pid Project.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "pid_organization_id", pid_organization_id)
        pulumi.set(__self__, "pid_project_desc", pid_project_desc)
        pulumi.set(__self__, "pid_project_id", pid_project_id)
        pulumi.set(__self__, "pid_project_name", pid_project_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Pid Project.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> str:
        """
        The ID of Pid Organization.
        """
        return pulumi.get(self, "pid_organization_id")

    @property
    @pulumi.getter(name="pidProjectDesc")
    def pid_project_desc(self) -> str:
        """
        The description of Pid Project.
        """
        return pulumi.get(self, "pid_project_desc")

    @property
    @pulumi.getter(name="pidProjectId")
    def pid_project_id(self) -> str:
        """
        The ID of Pid Project.
        """
        return pulumi.get(self, "pid_project_id")

    @property
    @pulumi.getter(name="pidProjectName")
    def pid_project_name(self) -> str:
        """
        The name of Pid Project.
        """
        return pulumi.get(self, "pid_project_name")


