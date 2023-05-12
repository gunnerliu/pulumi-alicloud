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
    def __init__(__self__, engine=None, engine_version=None, id=None, instance_charge_type=None, instance_engines=None, output_file=None, zone_id=None):
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        pulumi.set(__self__, "engine_version", engine_version)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        pulumi.set(__self__, "instance_charge_type", instance_charge_type)
        if instance_engines and not isinstance(instance_engines, list):
            raise TypeError("Expected argument 'instance_engines' to be a list")
        pulumi.set(__self__, "instance_engines", instance_engines)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

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
        KVStore Instance version.
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
    @pulumi.getter(name="instanceChargeType")
    def instance_charge_type(self) -> Optional[str]:
        return pulumi.get(self, "instance_charge_type")

    @property
    @pulumi.getter(name="instanceEngines")
    def instance_engines(self) -> Sequence['outputs.GetInstanceEnginesInstanceEngineResult']:
        """
        A list of KVStore available instance engines. Each element contains the following attributes:
        """
        return pulumi.get(self, "instance_engines")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> str:
        """
        The Zone to launch the KVStore instance.
        """
        return pulumi.get(self, "zone_id")


class AwaitableGetInstanceEnginesResult(GetInstanceEnginesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceEnginesResult(
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            instance_charge_type=self.instance_charge_type,
            instance_engines=self.instance_engines,
            output_file=self.output_file,
            zone_id=self.zone_id)


def get_instance_engines(engine: Optional[str] = None,
                         engine_version: Optional[str] = None,
                         instance_charge_type: Optional[str] = None,
                         output_file: Optional[str] = None,
                         zone_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceEnginesResult:
    """
    This data source provides the KVStore instance engines resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.51.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources_zones = alicloud.get_zones(available_resource_creation="KVStore")
    resources_instance_engines = alicloud.kvstore.get_instance_engines(engine="Redis",
        engine_version="5.0",
        instance_charge_type="PrePaid",
        output_file="./engines.txt",
        zone_id=resources_zones.zones[0].id)
    pulumi.export("firstKvstoreInstanceClass", resources_instance_engines.instance_engines[0].engine)
    ```


    :param str engine: Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
    :param str engine_version: Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
    :param str output_file: File name where to save data source results (after running `pulumi up`).
    :param str zone_id: The Zone to launch the KVStore instance.
    """
    __args__ = dict()
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['outputFile'] = output_file
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:kvstore/getInstanceEngines:getInstanceEngines', __args__, opts=opts, typ=GetInstanceEnginesResult).value

    return AwaitableGetInstanceEnginesResult(
        engine=__ret__.engine,
        engine_version=__ret__.engine_version,
        id=__ret__.id,
        instance_charge_type=__ret__.instance_charge_type,
        instance_engines=__ret__.instance_engines,
        output_file=__ret__.output_file,
        zone_id=__ret__.zone_id)


@_utilities.lift_output_func(get_instance_engines)
def get_instance_engines_output(engine: Optional[pulumi.Input[Optional[str]]] = None,
                                engine_version: Optional[pulumi.Input[Optional[str]]] = None,
                                instance_charge_type: Optional[pulumi.Input[Optional[str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                zone_id: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceEnginesResult]:
    """
    This data source provides the KVStore instance engines resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.51.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources_zones = alicloud.get_zones(available_resource_creation="KVStore")
    resources_instance_engines = alicloud.kvstore.get_instance_engines(engine="Redis",
        engine_version="5.0",
        instance_charge_type="PrePaid",
        output_file="./engines.txt",
        zone_id=resources_zones.zones[0].id)
    pulumi.export("firstKvstoreInstanceClass", resources_instance_engines.instance_engines[0].engine)
    ```


    :param str engine: Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
    :param str engine_version: Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
    :param str output_file: File name where to save data source results (after running `pulumi up`).
    :param str zone_id: The Zone to launch the KVStore instance.
    """
    ...
