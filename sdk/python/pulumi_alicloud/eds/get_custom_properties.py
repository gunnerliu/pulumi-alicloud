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
    'GetCustomPropertiesResult',
    'AwaitableGetCustomPropertiesResult',
    'get_custom_properties',
    'get_custom_properties_output',
]

@pulumi.output_type
class GetCustomPropertiesResult:
    """
    A collection of values returned by getCustomProperties.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, properties=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if properties and not isinstance(properties, list):
            raise TypeError("Expected argument 'properties' to be a list")
        pulumi.set(__self__, "properties", properties)

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
    @pulumi.getter
    def properties(self) -> Sequence['outputs.GetCustomPropertiesPropertyResult']:
        return pulumi.get(self, "properties")


class AwaitableGetCustomPropertiesResult(GetCustomPropertiesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomPropertiesResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            properties=self.properties)


def get_custom_properties(ids: Optional[Sequence[str]] = None,
                          output_file: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomPropertiesResult:
    """
    This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.176.0+.


    :param Sequence[str] ids: A list of Custom Property IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:eds/getCustomProperties:getCustomProperties', __args__, opts=opts, typ=GetCustomPropertiesResult).value

    return AwaitableGetCustomPropertiesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        properties=pulumi.get(__ret__, 'properties'))


@_utilities.lift_output_func(get_custom_properties)
def get_custom_properties_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomPropertiesResult]:
    """
    This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.176.0+.


    :param Sequence[str] ids: A list of Custom Property IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
