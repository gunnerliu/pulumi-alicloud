# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetEcsLaunchTemplatesResult',
    'AwaitableGetEcsLaunchTemplatesResult',
    'get_ecs_launch_templates',
]

@pulumi.output_type
class GetEcsLaunchTemplatesResult:
    """
    A collection of values returned by getEcsLaunchTemplates.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, launch_template_name=None, name_regex=None, names=None, output_file=None, template_resource_group_id=None, template_tags=None, templates=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if launch_template_name and not isinstance(launch_template_name, str):
            raise TypeError("Expected argument 'launch_template_name' to be a str")
        pulumi.set(__self__, "launch_template_name", launch_template_name)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if template_resource_group_id and not isinstance(template_resource_group_id, str):
            raise TypeError("Expected argument 'template_resource_group_id' to be a str")
        pulumi.set(__self__, "template_resource_group_id", template_resource_group_id)
        if template_tags and not isinstance(template_tags, dict):
            raise TypeError("Expected argument 'template_tags' to be a dict")
        pulumi.set(__self__, "template_tags", template_tags)
        if templates and not isinstance(templates, list):
            raise TypeError("Expected argument 'templates' to be a list")
        pulumi.set(__self__, "templates", templates)

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
    @pulumi.getter(name="launchTemplateName")
    def launch_template_name(self) -> Optional[str]:
        return pulumi.get(self, "launch_template_name")

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
    @pulumi.getter(name="templateResourceGroupId")
    def template_resource_group_id(self) -> Optional[str]:
        return pulumi.get(self, "template_resource_group_id")

    @property
    @pulumi.getter(name="templateTags")
    def template_tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "template_tags")

    @property
    @pulumi.getter
    def templates(self) -> Sequence['outputs.GetEcsLaunchTemplatesTemplateResult']:
        return pulumi.get(self, "templates")


class AwaitableGetEcsLaunchTemplatesResult(GetEcsLaunchTemplatesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEcsLaunchTemplatesResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            launch_template_name=self.launch_template_name,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            template_resource_group_id=self.template_resource_group_id,
            template_tags=self.template_tags,
            templates=self.templates)


def get_ecs_launch_templates(enable_details: Optional[bool] = None,
                             ids: Optional[Sequence[str]] = None,
                             launch_template_name: Optional[str] = None,
                             name_regex: Optional[str] = None,
                             output_file: Optional[str] = None,
                             template_resource_group_id: Optional[str] = None,
                             template_tags: Optional[Mapping[str, Any]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEcsLaunchTemplatesResult:
    """
    This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.120.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ecs.get_ecs_launch_templates(ids=["lt-bp1a469uxxxxxx"],
        name_regex="your_launch_name")
    pulumi.export("firstEcsLaunchTemplateId", example.templates[0].id)
    ```


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Launch Template IDs.
    :param str launch_template_name: The Launch Template Name.
    :param str name_regex: A regex string to filter results by Launch Template name.
    :param str template_resource_group_id: The template resource group id.
    :param Mapping[str, Any] template_tags: The template tags.
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['launchTemplateName'] = launch_template_name
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['templateResourceGroupId'] = template_resource_group_id
    __args__['templateTags'] = template_tags
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates', __args__, opts=opts, typ=GetEcsLaunchTemplatesResult).value

    return AwaitableGetEcsLaunchTemplatesResult(
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        launch_template_name=__ret__.launch_template_name,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        template_resource_group_id=__ret__.template_resource_group_id,
        template_tags=__ret__.template_tags,
        templates=__ret__.templates)
