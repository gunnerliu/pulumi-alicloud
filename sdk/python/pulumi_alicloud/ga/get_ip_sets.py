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
    'GetIpSetsResult',
    'AwaitableGetIpSetsResult',
    'get_ip_sets',
    'get_ip_sets_output',
]

@pulumi.output_type
class GetIpSetsResult:
    """
    A collection of values returned by getIpSets.
    """
    def __init__(__self__, accelerator_id=None, id=None, ids=None, output_file=None, sets=None, status=None):
        if accelerator_id and not isinstance(accelerator_id, str):
            raise TypeError("Expected argument 'accelerator_id' to be a str")
        pulumi.set(__self__, "accelerator_id", accelerator_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if sets and not isinstance(sets, list):
            raise TypeError("Expected argument 'sets' to be a list")
        pulumi.set(__self__, "sets", sets)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="acceleratorId")
    def accelerator_id(self) -> str:
        return pulumi.get(self, "accelerator_id")

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
    def sets(self) -> Sequence['outputs.GetIpSetsSetResult']:
        return pulumi.get(self, "sets")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetIpSetsResult(GetIpSetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpSetsResult(
            accelerator_id=self.accelerator_id,
            id=self.id,
            ids=self.ids,
            output_file=self.output_file,
            sets=self.sets,
            status=self.status)


def get_ip_sets(accelerator_id: Optional[str] = None,
                ids: Optional[Sequence[str]] = None,
                output_file: Optional[str] = None,
                status: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpSetsResult:
    """
    This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ga.get_ip_sets(accelerator_id="example_value",
        ids=["example_value"])
    pulumi.export("firstGaIpSetId", example.sets[0].id)
    ```


    :param str accelerator_id: The ID of the Global Accelerator (GA) instance.
    :param Sequence[str] ids: A list of Ip Set IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the acceleration region.
    """
    __args__ = dict()
    __args__['acceleratorId'] = accelerator_id
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ga/getIpSets:getIpSets', __args__, opts=opts, typ=GetIpSetsResult).value

    return AwaitableGetIpSetsResult(
        accelerator_id=__ret__.accelerator_id,
        id=__ret__.id,
        ids=__ret__.ids,
        output_file=__ret__.output_file,
        sets=__ret__.sets,
        status=__ret__.status)


@_utilities.lift_output_func(get_ip_sets)
def get_ip_sets_output(accelerator_id: Optional[pulumi.Input[str]] = None,
                       ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                       output_file: Optional[pulumi.Input[Optional[str]]] = None,
                       status: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpSetsResult]:
    """
    This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.ga.get_ip_sets(accelerator_id="example_value",
        ids=["example_value"])
    pulumi.export("firstGaIpSetId", example.sets[0].id)
    ```


    :param str accelerator_id: The ID of the Global Accelerator (GA) instance.
    :param Sequence[str] ids: A list of Ip Set IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the acceleration region.
    """
    ...
