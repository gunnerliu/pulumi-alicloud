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
    'GetCrossRegionsResult',
    'AwaitableGetCrossRegionsResult',
    'get_cross_regions',
    'get_cross_regions_output',
]

@pulumi.output_type
class GetCrossRegionsResult:
    """
    A collection of values returned by getCrossRegions.
    """
    def __init__(__self__, id=None, ids=None, output_file=None, regions=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if regions and not isinstance(regions, list):
            raise TypeError("Expected argument 'regions' to be a list")
        pulumi.set(__self__, "regions", regions)

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
        """
        A list of region IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def regions(self) -> Sequence['outputs.GetCrossRegionsRegionResult']:
        """
        The list of destination regions that support cross-region backup. Each element contains the following attributes:
        """
        return pulumi.get(self, "regions")


class AwaitableGetCrossRegionsResult(GetCrossRegionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCrossRegionsResult(
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            regions=self.regions)


def get_cross_regions(output_file: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCrossRegionsResult:
    """
    This data source provides an available area for remote disaster recovery for RDS.

    > **NOTE:** Available in v1.193.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    cross_regions = alicloud.rds.get_cross_regions()
    pulumi.export("firstRdsCrossRegions", data["alicloud_rds_cross_regions"]["regions"]["ids"])
    ```
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rds/getCrossRegions:getCrossRegions', __args__, opts=opts, typ=GetCrossRegionsResult).value

    return AwaitableGetCrossRegionsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        output_file=pulumi.get(__ret__, 'output_file'),
        regions=pulumi.get(__ret__, 'regions'))


@_utilities.lift_output_func(get_cross_regions)
def get_cross_regions_output(output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCrossRegionsResult]:
    """
    This data source provides an available area for remote disaster recovery for RDS.

    > **NOTE:** Available in v1.193.0+.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    cross_regions = alicloud.rds.get_cross_regions()
    pulumi.export("firstRdsCrossRegions", data["alicloud_rds_cross_regions"]["regions"]["ids"])
    ```
    """
    ...
