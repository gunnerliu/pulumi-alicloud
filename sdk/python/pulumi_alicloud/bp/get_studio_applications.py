# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetStudioApplicationsResult',
    'AwaitableGetStudioApplicationsResult',
    'get_studio_applications',
    'get_studio_applications_output',
]

@pulumi.output_type
class GetStudioApplicationsResult:
    """
    A collection of values returned by getStudioApplications.
    """
    def __init__(__self__, applications=None, id=None, ids=None, keyword=None, max_results=None, name_regex=None, names=None, order_type=None, output_file=None, resource_group_id=None, status=None):
        if applications and not isinstance(applications, list):
            raise TypeError("Expected argument 'applications' to be a list")
        pulumi.set(__self__, "applications", applications)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if max_results and not isinstance(max_results, int):
            raise TypeError("Expected argument 'max_results' to be a int")
        pulumi.set(__self__, "max_results", max_results)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if order_type and not isinstance(order_type, int):
            raise TypeError("Expected argument 'order_type' to be a int")
        pulumi.set(__self__, "order_type", order_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def applications(self) -> Sequence['outputs.GetStudioApplicationsApplicationResult']:
        """
        A list of Cloud Architect Design Tools (BPStudio) Applications. Each element contains the following attributes:
        """
        return pulumi.get(self, "applications")

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
    @pulumi.getter
    def keyword(self) -> Optional[str]:
        return pulumi.get(self, "keyword")

    @property
    @pulumi.getter(name="maxResults")
    def max_results(self) -> Optional[int]:
        return pulumi.get(self, "max_results")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Application names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="orderType")
    def order_type(self) -> Optional[int]:
        return pulumi.get(self, "order_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the Application.
        """
        return pulumi.get(self, "status")


class AwaitableGetStudioApplicationsResult(GetStudioApplicationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStudioApplicationsResult(
            applications=self.applications,
            id=self.id,
            ids=self.ids,
            keyword=self.keyword,
            max_results=self.max_results,
            name_regex=self.name_regex,
            names=self.names,
            order_type=self.order_type,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            status=self.status)


def get_studio_applications(ids: Optional[Sequence[str]] = None,
                            keyword: Optional[str] = None,
                            max_results: Optional[int] = None,
                            name_regex: Optional[str] = None,
                            order_type: Optional[int] = None,
                            output_file: Optional[str] = None,
                            resource_group_id: Optional[str] = None,
                            status: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStudioApplicationsResult:
    """
    This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.192.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bp.get_studio_applications(ids=["example_id"])
    pulumi.export("bpStudioApplicationId1", ids.applications[0].id)
    name_regex = alicloud.bp.get_studio_applications(name_regex="^my-Application")
    pulumi.export("bpStudioApplicationId2", name_regex.applications[0].id)
    ```


    :param Sequence[str] ids: A list of Application IDs.
    :param str keyword: The keyword of the Application.
    :param str name_regex: A regex string to filter results by Application name.
    :param int order_type: The order type of the Application. Valid values:
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the Application. Valid values: `success`, `release`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['maxResults'] = max_results
    __args__['nameRegex'] = name_regex
    __args__['orderType'] = order_type
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:bp/getStudioApplications:getStudioApplications', __args__, opts=opts, typ=GetStudioApplicationsResult).value

    return AwaitableGetStudioApplicationsResult(
        applications=pulumi.get(__ret__, 'applications'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        keyword=pulumi.get(__ret__, 'keyword'),
        max_results=pulumi.get(__ret__, 'max_results'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        order_type=pulumi.get(__ret__, 'order_type'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_studio_applications)
def get_studio_applications_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                   keyword: Optional[pulumi.Input[Optional[str]]] = None,
                                   max_results: Optional[pulumi.Input[Optional[int]]] = None,
                                   name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                   order_type: Optional[pulumi.Input[Optional[int]]] = None,
                                   output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                   resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                   status: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStudioApplicationsResult]:
    """
    This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.192.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bp.get_studio_applications(ids=["example_id"])
    pulumi.export("bpStudioApplicationId1", ids.applications[0].id)
    name_regex = alicloud.bp.get_studio_applications(name_regex="^my-Application")
    pulumi.export("bpStudioApplicationId2", name_regex.applications[0].id)
    ```


    :param Sequence[str] ids: A list of Application IDs.
    :param str keyword: The keyword of the Application.
    :param str name_regex: A regex string to filter results by Application name.
    :param int order_type: The order type of the Application. Valid values:
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param str status: The status of the Application. Valid values: `success`, `release`.
    """
    ...
