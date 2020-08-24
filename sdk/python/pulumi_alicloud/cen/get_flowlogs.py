# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetFlowlogsResult',
    'AwaitableGetFlowlogsResult',
    'get_flowlogs',
]

@pulumi.output_type
class GetFlowlogsResult:
    """
    A collection of values returned by getFlowlogs.
    """
    def __init__(__self__, cen_id=None, description=None, flowlogs=None, id=None, ids=None, log_store_name=None, name_regex=None, names=None, output_file=None, project_name=None, status=None):
        if cen_id and not isinstance(cen_id, str):
            raise TypeError("Expected argument 'cen_id' to be a str")
        pulumi.set(__self__, "cen_id", cen_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if flowlogs and not isinstance(flowlogs, list):
            raise TypeError("Expected argument 'flowlogs' to be a list")
        pulumi.set(__self__, "flowlogs", flowlogs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if log_store_name and not isinstance(log_store_name, str):
            raise TypeError("Expected argument 'log_store_name' to be a str")
        pulumi.set(__self__, "log_store_name", log_store_name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if project_name and not isinstance(project_name, str):
            raise TypeError("Expected argument 'project_name' to be a str")
        pulumi.set(__self__, "project_name", project_name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="cenId")
    def cen_id(self) -> Optional[str]:
        """
        The ID of the CEN Instance.
        """
        return pulumi.get(self, "cen_id")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        The description of flowlog.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def flowlogs(self) -> List['outputs.GetFlowlogsFlowlogResult']:
        return pulumi.get(self, "flowlogs")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> List[str]:
        """
        A list of CEN flow log IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="logStoreName")
    def log_store_name(self) -> Optional[str]:
        """
        The name of the log store which is in the  `project_name` SLS project.
        """
        return pulumi.get(self, "log_store_name")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> List[str]:
        """
        A list of CEN flow log names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[str]:
        """
        The name of the SLS project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of flowlog.
        """
        return pulumi.get(self, "status")


class AwaitableGetFlowlogsResult(GetFlowlogsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlowlogsResult(
            cen_id=self.cen_id,
            description=self.description,
            flowlogs=self.flowlogs,
            id=self.id,
            ids=self.ids,
            log_store_name=self.log_store_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            project_name=self.project_name,
            status=self.status)


def get_flowlogs(cen_id: Optional[str] = None,
                 description: Optional[str] = None,
                 ids: Optional[List[str]] = None,
                 log_store_name: Optional[str] = None,
                 name_regex: Optional[str] = None,
                 output_file: Optional[str] = None,
                 project_name: Optional[str] = None,
                 status: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlowlogsResult:
    """
    This data source provides CEN flow logs available to the user.

    > **NOTE:** Available in 1.78.0+

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cen.get_flowlogs(ids=["flowlog-tig1xxxxx"],
        name_regex="^foo")
    pulumi.export("firstCenFlowlogId", data["alicloud_cen_instances"]["default"]["flowlogs"][0]["id"])
    ```


    :param str cen_id: The ID of the CEN Instance.
    :param str description: The description of flowlog.
    :param List[str] ids: A list of CEN flow log IDs.
    :param str log_store_name: The name of the log store which is in the  `project_name` SLS project.
    :param str name_regex: A regex string to filter CEN flow logs by name.
    :param str project_name: The name of the SLS project.
    :param str status: The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
    """
    __args__ = dict()
    __args__['cenId'] = cen_id
    __args__['description'] = description
    __args__['ids'] = ids
    __args__['logStoreName'] = log_store_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['projectName'] = project_name
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getFlowlogs:getFlowlogs', __args__, opts=opts, typ=GetFlowlogsResult).value

    return AwaitableGetFlowlogsResult(
        cen_id=__ret__.cen_id,
        description=__ret__.description,
        flowlogs=__ret__.flowlogs,
        id=__ret__.id,
        ids=__ret__.ids,
        log_store_name=__ret__.log_store_name,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        project_name=__ret__.project_name,
        status=__ret__.status)
