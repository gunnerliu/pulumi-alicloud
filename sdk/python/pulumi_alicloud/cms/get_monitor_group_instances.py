# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetMonitorGroupInstancesResult',
    'AwaitableGetMonitorGroupInstancesResult',
    'get_monitor_group_instances',
]

@pulumi.output_type
class GetMonitorGroupInstancesResult:
    """
    A collection of values returned by getMonitorGroupInstances.
    """
    def __init__(__self__, id=None, ids=None, instances=None, keyword=None, output_file=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, str):
            raise TypeError("Expected argument 'ids' to be a str")
        pulumi.set(__self__, "ids", ids)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> str:
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def instances(self) -> Sequence['outputs.GetMonitorGroupInstancesInstanceResult']:
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter
    def keyword(self) -> Optional[str]:
        return pulumi.get(self, "keyword")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetMonitorGroupInstancesResult(GetMonitorGroupInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMonitorGroupInstancesResult(
            id=self.id,
            ids=self.ids,
            instances=self.instances,
            keyword=self.keyword,
            output_file=self.output_file)


def get_monitor_group_instances(ids: Optional[str] = None,
                                keyword: Optional[str] = None,
                                output_file: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMonitorGroupInstancesResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cms/getMonitorGroupInstances:getMonitorGroupInstances', __args__, opts=opts, typ=GetMonitorGroupInstancesResult).value

    return AwaitableGetMonitorGroupInstancesResult(
        id=__ret__.id,
        ids=__ret__.ids,
        instances=__ret__.instances,
        keyword=__ret__.keyword,
        output_file=__ret__.output_file)
