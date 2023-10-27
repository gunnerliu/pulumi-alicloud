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
    'GetDesktopTypesResult',
    'AwaitableGetDesktopTypesResult',
    'get_desktop_types',
    'get_desktop_types_output',
]

@pulumi.output_type
class GetDesktopTypesResult:
    """
    A collection of values returned by getDesktopTypes.
    """
    def __init__(__self__, cpu_count=None, gpu_count=None, id=None, ids=None, instance_type_family=None, memory_size=None, output_file=None, status=None, types=None):
        if cpu_count and not isinstance(cpu_count, int):
            raise TypeError("Expected argument 'cpu_count' to be a int")
        pulumi.set(__self__, "cpu_count", cpu_count)
        if gpu_count and not isinstance(gpu_count, float):
            raise TypeError("Expected argument 'gpu_count' to be a float")
        pulumi.set(__self__, "gpu_count", gpu_count)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_type_family and not isinstance(instance_type_family, str):
            raise TypeError("Expected argument 'instance_type_family' to be a str")
        pulumi.set(__self__, "instance_type_family", instance_type_family)
        if memory_size and not isinstance(memory_size, int):
            raise TypeError("Expected argument 'memory_size' to be a int")
        pulumi.set(__self__, "memory_size", memory_size)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if types and not isinstance(types, list):
            raise TypeError("Expected argument 'types' to be a list")
        pulumi.set(__self__, "types", types)

    @property
    @pulumi.getter(name="cpuCount")
    def cpu_count(self) -> Optional[int]:
        return pulumi.get(self, "cpu_count")

    @property
    @pulumi.getter(name="gpuCount")
    def gpu_count(self) -> Optional[float]:
        return pulumi.get(self, "gpu_count")

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
    @pulumi.getter(name="instanceTypeFamily")
    def instance_type_family(self) -> Optional[str]:
        return pulumi.get(self, "instance_type_family")

    @property
    @pulumi.getter(name="memorySize")
    def memory_size(self) -> Optional[int]:
        return pulumi.get(self, "memory_size")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def types(self) -> Sequence['outputs.GetDesktopTypesTypeResult']:
        return pulumi.get(self, "types")


class AwaitableGetDesktopTypesResult(GetDesktopTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDesktopTypesResult(
            cpu_count=self.cpu_count,
            gpu_count=self.gpu_count,
            id=self.id,
            ids=self.ids,
            instance_type_family=self.instance_type_family,
            memory_size=self.memory_size,
            output_file=self.output_file,
            status=self.status,
            types=self.types)


def get_desktop_types(cpu_count: Optional[int] = None,
                      gpu_count: Optional[float] = None,
                      ids: Optional[Sequence[str]] = None,
                      instance_type_family: Optional[str] = None,
                      memory_size: Optional[int] = None,
                      output_file: Optional[str] = None,
                      status: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDesktopTypesResult:
    """
    This data source provides the Ecd Desktop Types of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.170.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.eds.get_desktop_types(instance_type_family="eds.hf")
    pulumi.export("ecdDesktopTypeId1", ids.types[0].id)
    ```


    :param int cpu_count: The CPU cores.
    :param float gpu_count: The GPU cores.
    :param Sequence[str] ids: A list of Desktop Type IDs.
    :param str instance_type_family: The Specification family.
    :param int memory_size: The Memory size. Unit: MiB.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource.
    """
    __args__ = dict()
    __args__['cpuCount'] = cpu_count
    __args__['gpuCount'] = gpu_count
    __args__['ids'] = ids
    __args__['instanceTypeFamily'] = instance_type_family
    __args__['memorySize'] = memory_size
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:eds/getDesktopTypes:getDesktopTypes', __args__, opts=opts, typ=GetDesktopTypesResult).value

    return AwaitableGetDesktopTypesResult(
        cpu_count=pulumi.get(__ret__, 'cpu_count'),
        gpu_count=pulumi.get(__ret__, 'gpu_count'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_type_family=pulumi.get(__ret__, 'instance_type_family'),
        memory_size=pulumi.get(__ret__, 'memory_size'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        types=pulumi.get(__ret__, 'types'))


@_utilities.lift_output_func(get_desktop_types)
def get_desktop_types_output(cpu_count: Optional[pulumi.Input[Optional[int]]] = None,
                             gpu_count: Optional[pulumi.Input[Optional[float]]] = None,
                             ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             instance_type_family: Optional[pulumi.Input[Optional[str]]] = None,
                             memory_size: Optional[pulumi.Input[Optional[int]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             status: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDesktopTypesResult]:
    """
    This data source provides the Ecd Desktop Types of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.170.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.eds.get_desktop_types(instance_type_family="eds.hf")
    pulumi.export("ecdDesktopTypeId1", ids.types[0].id)
    ```


    :param int cpu_count: The CPU cores.
    :param float gpu_count: The GPU cores.
    :param Sequence[str] ids: A list of Desktop Type IDs.
    :param str instance_type_family: The Specification family.
    :param int memory_size: The Memory size. Unit: MiB.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource.
    """
    ...
