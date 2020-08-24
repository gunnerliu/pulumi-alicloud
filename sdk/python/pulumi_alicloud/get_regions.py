# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs

__all__ = [
    'GetRegionsResult',
    'AwaitableGetRegionsResult',
    'get_regions',
]

@pulumi.output_type
class GetRegionsResult:
    """
    A collection of values returned by getRegions.
    """
    def __init__(__self__, current=None, id=None, ids=None, name=None, output_file=None, regions=None):
        if current and not isinstance(current, bool):
            raise TypeError("Expected argument 'current' to be a bool")
        pulumi.set(__self__, "current", current)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)

    @property
    @pulumi.getter
    def current(self) -> bool:
        return pulumi.get(self, "current")

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
        A list of region IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def regions(self) -> List['outputs.GetRegionsRegionResult']:
        """
        A list of regions. Each element contains the following attributes:
        """
        return pulumi.get(self, "regions")


class AwaitableGetRegionsResult(GetRegionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionsResult(
            current=self.current,
            id=self.id,
            ids=self.ids,
            name=self.name,
            output_file=self.output_file,
            regions=self.regions)


def get_regions(current: Optional[bool] = None,
                name: Optional[str] = None,
                output_file: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionsResult:
    """
    This data source provides Alibaba Cloud regions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    current_region_ds = alicloud.get_regions(current=True)
    pulumi.export("currentRegionId", current_region_ds.regions[0].id)
    ```


    :param bool current: Set to true to match only the region configured in the provider.
    :param str name: The name of the region to select, such as `eu-central-1`.
    """
    __args__ = dict()
    __args__['current'] = current
    __args__['name'] = name
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:index/getRegions:getRegions', __args__, opts=opts, typ=GetRegionsResult).value

    return AwaitableGetRegionsResult(
        current=__ret__.current,
        id=__ret__.id,
        ids=__ret__.ids,
        name=__ret__.name,
        output_file=__ret__.output_file,
        regions=__ret__.regions)
