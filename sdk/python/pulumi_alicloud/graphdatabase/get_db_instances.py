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
    'GetDbInstancesResult',
    'AwaitableGetDbInstancesResult',
    'get_db_instances',
    'get_db_instances_output',
]

@pulumi.output_type
class GetDbInstancesResult:
    """
    A collection of values returned by getDbInstances.
    """
    def __init__(__self__, db_instance_description=None, enable_details=None, id=None, ids=None, instances=None, output_file=None, status=None):
        if db_instance_description and not isinstance(db_instance_description, str):
            raise TypeError("Expected argument 'db_instance_description' to be a str")
        pulumi.set(__self__, "db_instance_description", db_instance_description)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        pulumi.set(__self__, "instances", instances)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="dbInstanceDescription")
    def db_instance_description(self) -> Optional[str]:
        return pulumi.get(self, "db_instance_description")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
    def instances(self) -> Sequence['outputs.GetDbInstancesInstanceResult']:
        return pulumi.get(self, "instances")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetDbInstancesResult(GetDbInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDbInstancesResult(
            db_instance_description=self.db_instance_description,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            instances=self.instances,
            output_file=self.output_file,
            status=self.status)


def get_db_instances(db_instance_description: Optional[str] = None,
                     enable_details: Optional[bool] = None,
                     ids: Optional[Sequence[str]] = None,
                     output_file: Optional[str] = None,
                     status: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDbInstancesResult:
    """
    This data source provides the Graph Database Db Instances of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.graphdatabase.get_db_instances(ids=["example_id"])
    pulumi.export("graphDatabaseDbInstanceId1", ids.instances[0].id)
    status = alicloud.graphdatabase.get_db_instances(ids=["example_id"],
        status="Running")
    pulumi.export("graphDatabaseDbInstanceId2", status.instances[0].id)
    description = alicloud.graphdatabase.get_db_instances(ids=["example_id"],
        db_instance_description="example_value")
    pulumi.export("graphDatabaseDbInstanceId3", description.instances[0].id)
    ```


    :param str db_instance_description: According to the practical example or notes.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Db Instance IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
    """
    __args__ = dict()
    __args__['dbInstanceDescription'] = db_instance_description
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:graphdatabase/getDbInstances:getDbInstances', __args__, opts=opts, typ=GetDbInstancesResult).value

    return AwaitableGetDbInstancesResult(
        db_instance_description=pulumi.get(__ret__, 'db_instance_description'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instances=pulumi.get(__ret__, 'instances'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_db_instances)
def get_db_instances_output(db_instance_description: Optional[pulumi.Input[Optional[str]]] = None,
                            enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                            ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            status: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDbInstancesResult]:
    """
    This data source provides the Graph Database Db Instances of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.graphdatabase.get_db_instances(ids=["example_id"])
    pulumi.export("graphDatabaseDbInstanceId1", ids.instances[0].id)
    status = alicloud.graphdatabase.get_db_instances(ids=["example_id"],
        status="Running")
    pulumi.export("graphDatabaseDbInstanceId2", status.instances[0].id)
    description = alicloud.graphdatabase.get_db_instances(ids=["example_id"],
        db_instance_description="example_value")
    pulumi.export("graphDatabaseDbInstanceId3", description.instances[0].id)
    ```


    :param str db_instance_description: According to the practical example or notes.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Db Instance IDs.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
    """
    ...
