# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetIndustrialPidProjectsResult',
    'AwaitableGetIndustrialPidProjectsResult',
    'get_industrial_pid_projects',
    'get_industrial_pid_projects_output',
]

@pulumi.output_type
class GetIndustrialPidProjectsResult:
    """
    A collection of values returned by getIndustrialPidProjects.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, pid_organization_id=None, pid_project_name=None, projects=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if pid_organization_id and not isinstance(pid_organization_id, str):
            raise TypeError("Expected argument 'pid_organization_id' to be a str")
        pulumi.set(__self__, "pid_organization_id", pid_organization_id)
        if pid_project_name and not isinstance(pid_project_name, str):
            raise TypeError("Expected argument 'pid_project_name' to be a str")
        pulumi.set(__self__, "pid_project_name", pid_project_name)
        if projects and not isinstance(projects, list):
            raise TypeError("Expected argument 'projects' to be a list")
        pulumi.set(__self__, "projects", projects)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="pidOrganizationId")
    def pid_organization_id(self) -> Optional[str]:
        return pulumi.get(self, "pid_organization_id")

    @property
    @pulumi.getter(name="pidProjectName")
    def pid_project_name(self) -> Optional[str]:
        return pulumi.get(self, "pid_project_name")

    @property
    @pulumi.getter
    def projects(self) -> Sequence['outputs.GetIndustrialPidProjectsProjectResult']:
        return pulumi.get(self, "projects")


class AwaitableGetIndustrialPidProjectsResult(GetIndustrialPidProjectsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIndustrialPidProjectsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            pid_organization_id=self.pid_organization_id,
            pid_project_name=self.pid_project_name,
            projects=self.projects)


def get_industrial_pid_projects(ids: Optional[Sequence[str]] = None,
                                name_regex: Optional[str] = None,
                                output_file: Optional[str] = None,
                                pid_organization_id: Optional[str] = None,
                                pid_project_name: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIndustrialPidProjectsResult:
    """
    This data source provides the Brain Industrial Pid Projects of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.


    :param Sequence[str] ids: A list of Pid Project IDs.
    :param str name_regex: A regex string to filter results by Pid Project name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str pid_organization_id: The ID of Pid Organization.
    :param str pid_project_name: The name of Pid Project.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pidOrganizationId'] = pid_organization_id
    __args__['pidProjectName'] = pid_project_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:brain/getIndustrialPidProjects:getIndustrialPidProjects', __args__, opts=opts, typ=GetIndustrialPidProjectsResult).value

    return AwaitableGetIndustrialPidProjectsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        pid_organization_id=pulumi.get(__ret__, 'pid_organization_id'),
        pid_project_name=pulumi.get(__ret__, 'pid_project_name'),
        projects=pulumi.get(__ret__, 'projects'))


@_utilities.lift_output_func(get_industrial_pid_projects)
def get_industrial_pid_projects_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                       name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                       pid_organization_id: Optional[pulumi.Input[Optional[str]]] = None,
                                       pid_project_name: Optional[pulumi.Input[Optional[str]]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIndustrialPidProjectsResult]:
    """
    This data source provides the Brain Industrial Pid Projects of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.


    :param Sequence[str] ids: A list of Pid Project IDs.
    :param str name_regex: A regex string to filter results by Pid Project name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str pid_organization_id: The ID of Pid Organization.
    :param str pid_project_name: The name of Pid Project.
    """
    ...
