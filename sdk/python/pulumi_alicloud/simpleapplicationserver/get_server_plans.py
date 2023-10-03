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
    'GetServerPlansResult',
    'AwaitableGetServerPlansResult',
    'get_server_plans',
    'get_server_plans_output',
]

@pulumi.output_type
class GetServerPlansResult:
    """
    A collection of values returned by getServerPlans.
    """
    def __init__(__self__, bandwidth=None, core=None, disk_size=None, flow=None, id=None, ids=None, memory=None, output_file=None, plans=None, platform=None):
        if bandwidth and not isinstance(bandwidth, int):
            raise TypeError("Expected argument 'bandwidth' to be a int")
        pulumi.set(__self__, "bandwidth", bandwidth)
        if core and not isinstance(core, int):
            raise TypeError("Expected argument 'core' to be a int")
        pulumi.set(__self__, "core", core)
        if disk_size and not isinstance(disk_size, int):
            raise TypeError("Expected argument 'disk_size' to be a int")
        pulumi.set(__self__, "disk_size", disk_size)
        if flow and not isinstance(flow, int):
            raise TypeError("Expected argument 'flow' to be a int")
        pulumi.set(__self__, "flow", flow)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if memory and not isinstance(memory, int):
            raise TypeError("Expected argument 'memory' to be a int")
        pulumi.set(__self__, "memory", memory)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if plans and not isinstance(plans, list):
            raise TypeError("Expected argument 'plans' to be a list")
        pulumi.set(__self__, "plans", plans)
        if platform and not isinstance(platform, str):
            raise TypeError("Expected argument 'platform' to be a str")
        pulumi.set(__self__, "platform", platform)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[int]:
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter
    def core(self) -> Optional[int]:
        return pulumi.get(self, "core")

    @property
    @pulumi.getter(name="diskSize")
    def disk_size(self) -> Optional[int]:
        return pulumi.get(self, "disk_size")

    @property
    @pulumi.getter
    def flow(self) -> Optional[int]:
        return pulumi.get(self, "flow")

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
    def memory(self) -> Optional[int]:
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def plans(self) -> Sequence['outputs.GetServerPlansPlanResult']:
        return pulumi.get(self, "plans")

    @property
    @pulumi.getter
    def platform(self) -> Optional[str]:
        return pulumi.get(self, "platform")


class AwaitableGetServerPlansResult(GetServerPlansResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerPlansResult(
            bandwidth=self.bandwidth,
            core=self.core,
            disk_size=self.disk_size,
            flow=self.flow,
            id=self.id,
            ids=self.ids,
            memory=self.memory,
            output_file=self.output_file,
            plans=self.plans,
            platform=self.platform)


def get_server_plans(bandwidth: Optional[int] = None,
                     core: Optional[int] = None,
                     disk_size: Optional[int] = None,
                     flow: Optional[int] = None,
                     ids: Optional[Sequence[str]] = None,
                     memory: Optional[int] = None,
                     output_file: Optional[str] = None,
                     platform: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerPlansResult:
    """
    This data source provides the Simple Application Server Plans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.simpleapplicationserver.get_server_plans(memory=1,
        bandwidth=3,
        disk_size=40,
        flow=6,
        core=2)
    pulumi.export("simpleApplicationServerPlanId1", data["alicloud_simple_application_server_plans"]["ids"]["plans"][0]["id"])
    ```


    :param int bandwidth: The peak bandwidth. Unit: Mbit/s.
    :param int core: The number of CPU cores.
    :param int disk_size: The size of the enhanced SSD (ESSD). Unit: GB.
    :param int flow: The monthly data transfer quota. Unit: GB.
    :param Sequence[str] ids: A list of Instance Plan IDs.
    :param int memory: The memory size. Unit: GB.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str platform: The platform of Plan supported. Valid values: ["Linux", "Windows"].
    """
    __args__ = dict()
    __args__['bandwidth'] = bandwidth
    __args__['core'] = core
    __args__['diskSize'] = disk_size
    __args__['flow'] = flow
    __args__['ids'] = ids
    __args__['memory'] = memory
    __args__['outputFile'] = output_file
    __args__['platform'] = platform
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:simpleapplicationserver/getServerPlans:getServerPlans', __args__, opts=opts, typ=GetServerPlansResult).value

    return AwaitableGetServerPlansResult(
        bandwidth=pulumi.get(__ret__, 'bandwidth'),
        core=pulumi.get(__ret__, 'core'),
        disk_size=pulumi.get(__ret__, 'disk_size'),
        flow=pulumi.get(__ret__, 'flow'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        memory=pulumi.get(__ret__, 'memory'),
        output_file=pulumi.get(__ret__, 'output_file'),
        plans=pulumi.get(__ret__, 'plans'),
        platform=pulumi.get(__ret__, 'platform'))


@_utilities.lift_output_func(get_server_plans)
def get_server_plans_output(bandwidth: Optional[pulumi.Input[Optional[int]]] = None,
                            core: Optional[pulumi.Input[Optional[int]]] = None,
                            disk_size: Optional[pulumi.Input[Optional[int]]] = None,
                            flow: Optional[pulumi.Input[Optional[int]]] = None,
                            ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            memory: Optional[pulumi.Input[Optional[int]]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            platform: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServerPlansResult]:
    """
    This data source provides the Simple Application Server Plans of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.simpleapplicationserver.get_server_plans(memory=1,
        bandwidth=3,
        disk_size=40,
        flow=6,
        core=2)
    pulumi.export("simpleApplicationServerPlanId1", data["alicloud_simple_application_server_plans"]["ids"]["plans"][0]["id"])
    ```


    :param int bandwidth: The peak bandwidth. Unit: Mbit/s.
    :param int core: The number of CPU cores.
    :param int disk_size: The size of the enhanced SSD (ESSD). Unit: GB.
    :param int flow: The monthly data transfer quota. Unit: GB.
    :param Sequence[str] ids: A list of Instance Plan IDs.
    :param int memory: The memory size. Unit: GB.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str platform: The platform of Plan supported. Valid values: ["Linux", "Windows"].
    """
    ...
