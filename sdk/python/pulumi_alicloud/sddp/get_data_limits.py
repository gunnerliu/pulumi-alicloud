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
    'GetDataLimitsResult',
    'AwaitableGetDataLimitsResult',
    'get_data_limits',
    'get_data_limits_output',
]

@pulumi.output_type
class GetDataLimitsResult:
    """
    A collection of values returned by getDataLimits.
    """
    def __init__(__self__, id=None, ids=None, limits=None, output_file=None, parent_id=None, resource_type=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if limits and not isinstance(limits, list):
            raise TypeError("Expected argument 'limits' to be a list")
        pulumi.set(__self__, "limits", limits)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if parent_id and not isinstance(parent_id, str):
            raise TypeError("Expected argument 'parent_id' to be a str")
        pulumi.set(__self__, "parent_id", parent_id)
        if resource_type and not isinstance(resource_type, str):
            raise TypeError("Expected argument 'resource_type' to be a str")
        pulumi.set(__self__, "resource_type", resource_type)

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
    def limits(self) -> Sequence['outputs.GetDataLimitsLimitResult']:
        return pulumi.get(self, "limits")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[str]:
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter(name="resourceType")
    def resource_type(self) -> Optional[str]:
        return pulumi.get(self, "resource_type")


class AwaitableGetDataLimitsResult(GetDataLimitsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDataLimitsResult(
            id=self.id,
            ids=self.ids,
            limits=self.limits,
            output_file=self.output_file,
            parent_id=self.parent_id,
            resource_type=self.resource_type)


def get_data_limits(ids: Optional[Sequence[str]] = None,
                    output_file: Optional[str] = None,
                    parent_id: Optional[str] = None,
                    resource_type: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDataLimitsResult:
    """
    This data source provides the Sddp Data Limits of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.159.0+.


    :param Sequence[str] ids: A list of Data Limit IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str parent_id: The ID of the data asset.
    :param str resource_type: The type of the service to which the data asset belongs.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['parentId'] = parent_id
    __args__['resourceType'] = resource_type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:sddp/getDataLimits:getDataLimits', __args__, opts=opts, typ=GetDataLimitsResult).value

    return AwaitableGetDataLimitsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        limits=pulumi.get(__ret__, 'limits'),
        output_file=pulumi.get(__ret__, 'output_file'),
        parent_id=pulumi.get(__ret__, 'parent_id'),
        resource_type=pulumi.get(__ret__, 'resource_type'))


@_utilities.lift_output_func(get_data_limits)
def get_data_limits_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           parent_id: Optional[pulumi.Input[Optional[str]]] = None,
                           resource_type: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDataLimitsResult]:
    """
    This data source provides the Sddp Data Limits of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.159.0+.


    :param Sequence[str] ids: A list of Data Limit IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str parent_id: The ID of the data asset.
    :param str resource_type: The type of the service to which the data asset belongs.
    """
    ...
