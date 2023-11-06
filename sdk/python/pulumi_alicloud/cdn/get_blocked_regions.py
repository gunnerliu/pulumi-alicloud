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
    'GetBlockedRegionsResult',
    'AwaitableGetBlockedRegionsResult',
    'get_blocked_regions',
    'get_blocked_regions_output',
]

@pulumi.output_type
class GetBlockedRegionsResult:
    """
    A collection of values returned by getBlockedRegions.
    """
    def __init__(__self__, id=None, language=None, regions=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if language and not isinstance(language, str):
            raise TypeError("Expected argument 'language' to be a str")
        pulumi.set(__self__, "language", language)
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
    def language(self) -> str:
        return pulumi.get(self, "language")

    @property
    @pulumi.getter
    def regions(self) -> Sequence['outputs.GetBlockedRegionsRegionResult']:
        return pulumi.get(self, "regions")


class AwaitableGetBlockedRegionsResult(GetBlockedRegionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBlockedRegionsResult(
            id=self.id,
            language=self.language,
            regions=self.regions)


def get_blocked_regions(language: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBlockedRegionsResult:
    """
    This data source provides the Cdn blocked regions.

    > **NOTE:** Available in v1.173.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cdn.get_blocked_regions(language="zh")
    ```


    :param str language: The language. Valid values: `zh`, `en`, `jp`.
    """
    __args__ = dict()
    __args__['language'] = language
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cdn/getBlockedRegions:getBlockedRegions', __args__, opts=opts, typ=GetBlockedRegionsResult).value

    return AwaitableGetBlockedRegionsResult(
        id=pulumi.get(__ret__, 'id'),
        language=pulumi.get(__ret__, 'language'),
        regions=pulumi.get(__ret__, 'regions'))


@_utilities.lift_output_func(get_blocked_regions)
def get_blocked_regions_output(language: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBlockedRegionsResult]:
    """
    This data source provides the Cdn blocked regions.

    > **NOTE:** Available in v1.173.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cdn.get_blocked_regions(language="zh")
    ```


    :param str language: The language. Valid values: `zh`, `en`, `jp`.
    """
    ...
