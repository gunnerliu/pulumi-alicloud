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
    'GetInstanceEnginesResult',
    'AwaitableGetInstanceEnginesResult',
    'get_instance_engines',
    'get_instance_engines_output',
]

@pulumi.output_type
class GetInstanceEnginesResult:
    """
    A collection of values returned by getInstanceEngines.
    """
    def __init__(__self__, category=None, db_instance_storage_type=None, engine=None, engine_version=None, id=None, ids=None, instance_charge_type=None, instance_engines=None, multi_zone=None, output_file=None, zone_id=None):
        if category and not isinstance(category, str):
            raise TypeError("Expected argument 'category' to be a str")
        pulumi.set(__self__, "category", category)
        if db_instance_storage_type and not isinstance(db_instance_storage_type, str):
            raise TypeError("Expected argument 'db_instance_storage_type' to be a str")
        pulumi.set(__self__, "db_instance_storage_type", db_instance_storage_type)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        pulumi.set(__self__, "engine_version", engine_version)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if instance_engines and not isinstance(instance_engines, list):
            raise TypeError("Expected argument 'instance_engines' to be a list")
        pulumi.set(__self__, "instance_engines", instance_engines)
        if multi_zone and not isinstance(multi_zone, bool):
            raise TypeError("Expected argument 'multi_zone' to be a bool")
        pulumi.set(__self__, "multi_zone", multi_zone)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def category(self) -> Optional[str]:
        """
        DB Instance category.
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="dbInstanceStorageType")
    def db_instance_storage_type(self) -> Optional[str]:
        return pulumi.get(self, "db_instance_storage_type")

    @property
    @pulumi.getter
    def engine(self) -> Optional[str]:
        """
        Database type.
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineVersion")
    def engine_version(self) -> Optional[str]:
        """
        DB Instance version.
        """
        return pulumi.get(self, "engine_version")

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
        A list of engines.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[str]:
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="instanceEngines")
    def instance_engines(self) -> Sequence['outputs.GetInstanceEnginesInstanceEngineResult']:
        """
        A list of Rds available resource. Each element contains the following attributes:
        """
        return pulumi.get(self, "instance_engines")

    @property
    @pulumi.getter(name="multiZone")
    def multi_zone(self) -> Optional[bool]:
        return pulumi.get(self, "multi_zone")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetInstanceEnginesResult(GetInstanceEnginesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceEnginesResult(
            category=self.category,
            db_instance_storage_type=self.db_instance_storage_type,
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            ids=self.ids,
            instance_charge_type=self.instance_charge_type,
            instance_engines=self.instance_engines,
            multi_zone=self.multi_zone,
            output_file=self.output_file,
            zone_id=self.zone_id)


def get_instance_engines(category: Optional[str] = None,
                         db_instance_storage_type: Optional[str] = None,
                         engine: Optional[str] = None,
                         engine_version: Optional[str] = None,
                         instance_charge_type: Optional[str] = None,
                         multi_zone: Optional[bool] = None,
                         output_file: Optional[str] = None,
                         zone_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceEnginesResult:
    """
    This data source provides the RDS instance engines resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.46.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources = alicloud.rds.get_instance_engines(engine="MySQL",
        engine_version="5.6",
        instance_charge_type="PostPaid",
        output_file="./engines.txt")
    pulumi.export("firstDbCategory", resources.instance_engines[0].category)
    ```


    :param str category: DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
    :param str db_instance_storage_type: The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
    :param str engine: Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
    :param str engine_version: Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
    :param bool multi_zone: Whether to show multi available zone. Default false to not show multi availability zone.
    :param str output_file: File name where to save data source results (after running `pulumi up`).
    :param str zone_id: The Zone to launch the DB instance.
    """
    __args__ = dict()
    __args__['category'] = category
    __args__['dbInstanceStorageType'] = db_instance_storage_type
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['multiZone'] = multi_zone
    __args__['outputFile'] = output_file
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rds/getInstanceEngines:getInstanceEngines', __args__, opts=opts, typ=GetInstanceEnginesResult).value

    return AwaitableGetInstanceEnginesResult(
        category=pulumi.get(__ret__, 'category'),
        db_instance_storage_type=pulumi.get(__ret__, 'db_instance_storage_type'),
        engine=pulumi.get(__ret__, 'engine'),
        engine_version=pulumi.get(__ret__, 'engine_version'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_charge_type=pulumi.get(__ret__, 'instance_charge_type'),
        instance_engines=pulumi.get(__ret__, 'instance_engines'),
        multi_zone=pulumi.get(__ret__, 'multi_zone'),
        output_file=pulumi.get(__ret__, 'output_file'),
        zone_id=pulumi.get(__ret__, 'zone_id'))


@_utilities.lift_output_func(get_instance_engines)
def get_instance_engines_output(category: Optional[pulumi.Input[Optional[str]]] = None,
                                db_instance_storage_type: Optional[pulumi.Input[Optional[str]]] = None,
                                engine: Optional[pulumi.Input[Optional[str]]] = None,
                                engine_version: Optional[pulumi.Input[Optional[str]]] = None,
                                instance_charge_type: Optional[pulumi.Input[Optional[str]]] = None,
                                multi_zone: Optional[pulumi.Input[Optional[bool]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceEnginesResult]:
    """
    This data source provides the RDS instance engines resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.46.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources = alicloud.rds.get_instance_engines(engine="MySQL",
        engine_version="5.6",
        instance_charge_type="PostPaid",
        output_file="./engines.txt")
    pulumi.export("firstDbCategory", resources.instance_engines[0].category)
    ```


    :param str category: DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
    :param str db_instance_storage_type: The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
    :param str engine: Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
    :param str engine_version: Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
    :param bool multi_zone: Whether to show multi available zone. Default false to not show multi availability zone.
    :param str output_file: File name where to save data source results (after running `pulumi up`).
    :param str zone_id: The Zone to launch the DB instance.
    """
    ...
