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
    'GetEcsStorageCapacityUnitsResult',
    'AwaitableGetEcsStorageCapacityUnitsResult',
    'get_ecs_storage_capacity_units',
    'get_ecs_storage_capacity_units_output',
]

@pulumi.output_type
class GetEcsStorageCapacityUnitsResult:
    """
    A collection of values returned by getEcsStorageCapacityUnits.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, units=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if units and not isinstance(units, list):
            raise TypeError("Expected argument 'units' to be a list")
        pulumi.set(__self__, "units", units)

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
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

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
    def units(self) -> Sequence['outputs.GetEcsStorageCapacityUnitsUnitResult']:
        return pulumi.get(self, "units")


class AwaitableGetEcsStorageCapacityUnitsResult(GetEcsStorageCapacityUnitsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEcsStorageCapacityUnitsResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            units=self.units)


def get_ecs_storage_capacity_units(ids: Optional[Sequence[str]] = None,
                                   name_regex: Optional[str] = None,
                                   output_file: Optional[str] = None,
                                   status: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEcsStorageCapacityUnitsResult:
    """
    This data source provides the Ecs Storage Capacity Units of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.155.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_storage_capacity_units()
    pulumi.export("ecsStorageCapacityUnitId1", ids.units[0].id)
    name_regex = alicloud.ecs.get_ecs_storage_capacity_units(name_regex="^my-StorageCapacityUnit")
    pulumi.export("ecsStorageCapacityUnitId2", name_regex.units[0].id)
    ```


    :param Sequence[str] ids: A list of Storage Capacity Unit IDs.
    :param str name_regex: A regex string to filter results by Storage Capacity Unit name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of Storage Capacity Unit.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getEcsStorageCapacityUnits:getEcsStorageCapacityUnits', __args__, opts=opts, typ=GetEcsStorageCapacityUnitsResult).value

    return AwaitableGetEcsStorageCapacityUnitsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        units=pulumi.get(__ret__, 'units'))


@_utilities.lift_output_func(get_ecs_storage_capacity_units)
def get_ecs_storage_capacity_units_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                          status: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEcsStorageCapacityUnitsResult]:
    """
    This data source provides the Ecs Storage Capacity Units of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.155.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.ecs.get_ecs_storage_capacity_units()
    pulumi.export("ecsStorageCapacityUnitId1", ids.units[0].id)
    name_regex = alicloud.ecs.get_ecs_storage_capacity_units(name_regex="^my-StorageCapacityUnit")
    pulumi.export("ecsStorageCapacityUnitId2", name_regex.units[0].id)
    ```


    :param Sequence[str] ids: A list of Storage Capacity Unit IDs.
    :param str name_regex: A regex string to filter results by Storage Capacity Unit name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of Storage Capacity Unit.
    """
    ...
