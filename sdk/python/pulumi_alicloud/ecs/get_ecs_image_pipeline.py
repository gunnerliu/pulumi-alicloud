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
    'GetEcsImagePipelineResult',
    'AwaitableGetEcsImagePipelineResult',
    'get_ecs_image_pipeline',
    'get_ecs_image_pipeline_output',
]

@pulumi.output_type
class GetEcsImagePipelineResult:
    """
    A collection of values returned by getEcsImagePipeline.
    """
    def __init__(__self__, id=None, ids=None, name=None, name_regex=None, names=None, output_file=None, pipelines=None, resource_group_id=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if pipelines and not isinstance(pipelines, list):
            raise TypeError("Expected argument 'pipelines' to be a list")
        pulumi.set(__self__, "pipelines", pipelines)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

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
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

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
    def pipelines(self) -> Sequence['outputs.GetEcsImagePipelinePipelineResult']:
        return pulumi.get(self, "pipelines")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")


class AwaitableGetEcsImagePipelineResult(GetEcsImagePipelineResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEcsImagePipelineResult(
            id=self.id,
            ids=self.ids,
            name=self.name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            pipelines=self.pipelines,
            resource_group_id=self.resource_group_id,
            tags=self.tags)


def get_ecs_image_pipeline(ids: Optional[Sequence[str]] = None,
                           name: Optional[str] = None,
                           name_regex: Optional[str] = None,
                           output_file: Optional[str] = None,
                           resource_group_id: Optional[str] = None,
                           tags: Optional[Mapping[str, Any]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEcsImagePipelineResult:
    """
    This data source provides the Ecs Image Pipelines of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.163.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_image_pipeline(ids=["example_value"])
    pulumi.export("ecsImagePipelineId1", ids.pipelines[0].id)
    name_regex = alicloud.ecs.get_ecs_image_pipeline(name_regex="^my-ImagePipeline")
    pulumi.export("ecsImagePipelineId2", name_regex.pipelines[0].id)
    ```


    :param Sequence[str] ids: A list of Image Pipeline ids.
    :param str name: The name of the image template.
    :param str name_regex: A regex string to filter results by Image Pipeline name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group to which the image template belongs.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['name'] = name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getEcsImagePipeline:getEcsImagePipeline', __args__, opts=opts, typ=GetEcsImagePipelineResult).value

    return AwaitableGetEcsImagePipelineResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name=pulumi.get(__ret__, 'name'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        pipelines=pulumi.get(__ret__, 'pipelines'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_ecs_image_pipeline)
def get_ecs_image_pipeline_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                  name: Optional[pulumi.Input[Optional[str]]] = None,
                                  name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                  output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                  resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                  tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEcsImagePipelineResult]:
    """
    This data source provides the Ecs Image Pipelines of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.163.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_image_pipeline(ids=["example_value"])
    pulumi.export("ecsImagePipelineId1", ids.pipelines[0].id)
    name_regex = alicloud.ecs.get_ecs_image_pipeline(name_regex="^my-ImagePipeline")
    pulumi.export("ecsImagePipelineId2", name_regex.pipelines[0].id)
    ```


    :param Sequence[str] ids: A list of Image Pipeline ids.
    :param str name: The name of the image template.
    :param str name_regex: A regex string to filter results by Image Pipeline name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group to which the image template belongs.
    :param Mapping[str, Any] tags: A mapping of tags to assign to the resource.
    """
    ...
