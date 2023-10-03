# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetGlobalEventsStorageRegionResult',
    'AwaitableGetGlobalEventsStorageRegionResult',
    'get_global_events_storage_region',
    'get_global_events_storage_region_output',
]

@pulumi.output_type
class GetGlobalEventsStorageRegionResult:
    """
    A collection of values returned by getGlobalEventsStorageRegion.
    """
    def __init__(__self__, id=None, storage_region=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if storage_region and not isinstance(storage_region, str):
            raise TypeError("Expected argument 'storage_region' to be a str")
        pulumi.set(__self__, "storage_region", storage_region)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="storageRegion")
    def storage_region(self) -> str:
        return pulumi.get(self, "storage_region")


class AwaitableGetGlobalEventsStorageRegionResult(GetGlobalEventsStorageRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalEventsStorageRegionResult(
            id=self.id,
            storage_region=self.storage_region)


def get_global_events_storage_region(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalEventsStorageRegionResult:
    """
    This data source provides the Actiontrail Global Events Storage Region of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.201.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.actiontrail.get_global_events_storage_region()
    pulumi.export("alicloudActiontrailGlobalEventsStorageRegion1", default.storage_region)
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:actiontrail/getGlobalEventsStorageRegion:getGlobalEventsStorageRegion', __args__, opts=opts, typ=GetGlobalEventsStorageRegionResult).value

    return AwaitableGetGlobalEventsStorageRegionResult(
        id=pulumi.get(__ret__, 'id'),
        storage_region=pulumi.get(__ret__, 'storage_region'))


@_utilities.lift_output_func(get_global_events_storage_region)
def get_global_events_storage_region_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalEventsStorageRegionResult]:
    """
    This data source provides the Actiontrail Global Events Storage Region of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.201.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.actiontrail.get_global_events_storage_region()
    pulumi.export("alicloudActiontrailGlobalEventsStorageRegion1", default.storage_region)
    ```
    """
    ...
