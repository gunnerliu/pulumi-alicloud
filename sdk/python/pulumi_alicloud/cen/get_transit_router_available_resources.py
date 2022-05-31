# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetTransitRouterAvailableResourcesResult',
    'AwaitableGetTransitRouterAvailableResourcesResult',
    'get_transit_router_available_resources',
    'get_transit_router_available_resources_output',
]

@pulumi.output_type
class GetTransitRouterAvailableResourcesResult:
    """
    A collection of values returned by getTransitRouterAvailableResources.
    """
    def __init__(__self__, id=None, output_file=None, resources=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resources and not isinstance(resources, list):
            raise TypeError("Expected argument 'resources' to be a list")
        pulumi.set(__self__, "resources", resources)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def resources(self) -> Sequence['outputs.GetTransitRouterAvailableResourcesResourceResult']:
        return pulumi.get(self, "resources")


class AwaitableGetTransitRouterAvailableResourcesResult(GetTransitRouterAvailableResourcesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTransitRouterAvailableResourcesResult(
            id=self.id,
            output_file=self.output_file,
            resources=self.resources)


def get_transit_router_available_resources(output_file: Optional[str] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTransitRouterAvailableResourcesResult:
    """
    This data source provides the Cen Transit Router Available Resources of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.163.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_available_resources()
    pulumi.export("masterId", data["alicloud_cen_transit_router_available_resources"]["default"]["resources"][0]["master_zones"])
    pulumi.export("slaveId", data["alicloud_cen_transit_router_available_resources"]["default"]["resources"][0]["slave_zones"])
    ```
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getTransitRouterAvailableResources:getTransitRouterAvailableResources', __args__, opts=opts, typ=GetTransitRouterAvailableResourcesResult).value

    return AwaitableGetTransitRouterAvailableResourcesResult(
        id=__ret__.id,
        output_file=__ret__.output_file,
        resources=__ret__.resources)


@_utilities.lift_output_func(get_transit_router_available_resources)
def get_transit_router_available_resources_output(output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTransitRouterAvailableResourcesResult]:
    """
    This data source provides the Cen Transit Router Available Resources of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.163.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.cen.get_transit_router_available_resources()
    pulumi.export("masterId", data["alicloud_cen_transit_router_available_resources"]["default"]["resources"][0]["master_zones"])
    pulumi.export("slaveId", data["alicloud_cen_transit_router_available_resources"]["default"]["resources"][0]["slave_zones"])
    ```
    """
    ...
