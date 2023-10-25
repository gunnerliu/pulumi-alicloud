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
    'GetStateConfigurationsResult',
    'AwaitableGetStateConfigurationsResult',
    'get_state_configurations',
    'get_state_configurations_output',
]

@pulumi.output_type
class GetStateConfigurationsResult:
    """
    A collection of values returned by getStateConfigurations.
    """
    def __init__(__self__, configurations=None, id=None, ids=None, output_file=None, resource_group_id=None, tags=None):
        if configurations and not isinstance(configurations, list):
            raise TypeError("Expected argument 'configurations' to be a list")
        pulumi.set(__self__, "configurations", configurations)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def configurations(self) -> Sequence['outputs.GetStateConfigurationsConfigurationResult']:
        return pulumi.get(self, "configurations")

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
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[str]:
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        return pulumi.get(self, "tags")


class AwaitableGetStateConfigurationsResult(GetStateConfigurationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStateConfigurationsResult(
            configurations=self.configurations,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            tags=self.tags)


def get_state_configurations(ids: Optional[Sequence[str]] = None,
                             output_file: Optional[str] = None,
                             resource_group_id: Optional[str] = None,
                             tags: Optional[Mapping[str, Any]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStateConfigurationsResult:
    """
    This data source provides the Oos State Configurations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.


    :param Sequence[str] ids: A list of State Configuration IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param Mapping[str, Any] tags: The tag of the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:oos/getStateConfigurations:getStateConfigurations', __args__, opts=opts, typ=GetStateConfigurationsResult).value

    return AwaitableGetStateConfigurationsResult(
        configurations=pulumi.get(__ret__, 'configurations'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resource_group_id=pulumi.get(__ret__, 'resource_group_id'),
        tags=pulumi.get(__ret__, 'tags'))


@_utilities.lift_output_func(get_state_configurations)
def get_state_configurations_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                    resource_group_id: Optional[pulumi.Input[Optional[str]]] = None,
                                    tags: Optional[pulumi.Input[Optional[Mapping[str, Any]]]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStateConfigurationsResult]:
    """
    This data source provides the Oos State Configurations of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.147.0+.


    :param Sequence[str] ids: A list of State Configuration IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_group_id: The ID of the resource group.
    :param Mapping[str, Any] tags: The tag of the resource.
    """
    ...
