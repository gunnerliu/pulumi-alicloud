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
    'GetChartRepositoriesResult',
    'AwaitableGetChartRepositoriesResult',
    'get_chart_repositories',
    'get_chart_repositories_output',
]

@pulumi.output_type
class GetChartRepositoriesResult:
    """
    A collection of values returned by getChartRepositories.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, repositories=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if repositories and not isinstance(repositories, list):
            raise TypeError("Expected argument 'repositories' to be a list")
        pulumi.set(__self__, "repositories", repositories)

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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

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
    @pulumi.getter
    def repositories(self) -> Sequence['outputs.GetChartRepositoriesRepositoryResult']:
        return pulumi.get(self, "repositories")


class AwaitableGetChartRepositoriesResult(GetChartRepositoriesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetChartRepositoriesResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            repositories=self.repositories)


def get_chart_repositories(ids: Optional[Sequence[str]] = None,
                           instance_id: Optional[str] = None,
                           name_regex: Optional[str] = None,
                           output_file: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetChartRepositoriesResult:
    """
    This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.149.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cr.get_chart_repositories(instance_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("crChartRepositoryId1", data["alicloud_cr_chart_repositories"]["default"]["ids"])
    ```


    :param Sequence[str] ids: A list of matched Container Registry Enterprise Edition repositories.
    :param str instance_id: The ID of the Container Registry instance.
    :param str name_regex: A regex string to filter results by repository name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cr/getChartRepositories:getChartRepositories', __args__, opts=opts, typ=GetChartRepositoriesResult).value

    return AwaitableGetChartRepositoriesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        repositories=pulumi.get(__ret__, 'repositories'))


@_utilities.lift_output_func(get_chart_repositories)
def get_chart_repositories_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  instance_id: Optional[pulumi.Input[str]] = None,
                                  name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetChartRepositoriesResult]:
    """
    This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.149.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cr.get_chart_repositories(instance_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("crChartRepositoryId1", data["alicloud_cr_chart_repositories"]["default"]["ids"])
    ```


    :param Sequence[str] ids: A list of matched Container Registry Enterprise Edition repositories.
    :param str instance_id: The ID of the Container Registry instance.
    :param str name_regex: A regex string to filter results by repository name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
