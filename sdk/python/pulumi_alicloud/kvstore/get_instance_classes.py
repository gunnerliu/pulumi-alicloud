# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetInstanceClassesResult:
    """
    A collection of values returned by getInstanceClasses.
    """
    def __init__(__self__, architecture=None, classes=None, edition_type=None, engine=None, engine_version=None, id=None, instance_charge_type=None, instance_classes=None, node_type=None, output_file=None, package_type=None, performance_type=None, series_type=None, shard_number=None, sorted_by=None, storage_type=None, zone_id=None):
        if architecture and not isinstance(architecture, str):
            raise TypeError("Expected argument 'architecture' to be a str")
        __self__.architecture = architecture
        if classes and not isinstance(classes, list):
            raise TypeError("Expected argument 'classes' to be a list")
        __self__.classes = classes
        """
        A list of KVStore available instance classes when the `sorted_by` is "Price". include:
        """
        if edition_type and not isinstance(edition_type, str):
            raise TypeError("Expected argument 'edition_type' to be a str")
        __self__.edition_type = edition_type
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        __self__.engine = engine
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        __self__.engine_version = engine_version
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        __self__.instance_charge_type = instance_charge_type
        if instance_classes and not isinstance(instance_classes, list):
            raise TypeError("Expected argument 'instance_classes' to be a list")
        __self__.instance_classes = instance_classes
        """
        A list of KVStore available instance classes.
        """
        if node_type and not isinstance(node_type, str):
            raise TypeError("Expected argument 'node_type' to be a str")
        __self__.node_type = node_type
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if package_type and not isinstance(package_type, str):
            raise TypeError("Expected argument 'package_type' to be a str")
        if package_type is not None:
            warnings.warn("The parameter 'package_type' has been deprecated from 1.68.0.", DeprecationWarning)
            pulumi.log.warn("package_type is deprecated: The parameter 'package_type' has been deprecated from 1.68.0.")
        __self__.package_type = package_type
        if performance_type and not isinstance(performance_type, str):
            raise TypeError("Expected argument 'performance_type' to be a str")
        if performance_type is not None:
            warnings.warn("The parameter 'performance_type' has been deprecated from 1.68.0.", DeprecationWarning)
            pulumi.log.warn("performance_type is deprecated: The parameter 'performance_type' has been deprecated from 1.68.0.")
        __self__.performance_type = performance_type
        if series_type and not isinstance(series_type, str):
            raise TypeError("Expected argument 'series_type' to be a str")
        __self__.series_type = series_type
        if shard_number and not isinstance(shard_number, float):
            raise TypeError("Expected argument 'shard_number' to be a float")
        __self__.shard_number = shard_number
        if sorted_by and not isinstance(sorted_by, str):
            raise TypeError("Expected argument 'sorted_by' to be a str")
        __self__.sorted_by = sorted_by
        if storage_type and not isinstance(storage_type, str):
            raise TypeError("Expected argument 'storage_type' to be a str")
        if storage_type is not None:
            warnings.warn("The parameter 'storage_type' has been deprecated from 1.68.0.", DeprecationWarning)
            pulumi.log.warn("storage_type is deprecated: The parameter 'storage_type' has been deprecated from 1.68.0.")
        __self__.storage_type = storage_type
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        __self__.zone_id = zone_id
class AwaitableGetInstanceClassesResult(GetInstanceClassesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceClassesResult(
            architecture=self.architecture,
            classes=self.classes,
            edition_type=self.edition_type,
            engine=self.engine,
            engine_version=self.engine_version,
            id=self.id,
            instance_charge_type=self.instance_charge_type,
            instance_classes=self.instance_classes,
            node_type=self.node_type,
            output_file=self.output_file,
            package_type=self.package_type,
            performance_type=self.performance_type,
            series_type=self.series_type,
            shard_number=self.shard_number,
            sorted_by=self.sorted_by,
            storage_type=self.storage_type,
            zone_id=self.zone_id)

def get_instance_classes(architecture=None,edition_type=None,engine=None,engine_version=None,instance_charge_type=None,node_type=None,output_file=None,package_type=None,performance_type=None,series_type=None,shard_number=None,sorted_by=None,storage_type=None,zone_id=None,opts=None):
    """
    This data source provides the KVStore instance classes resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.49.0+

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources_zones = alicloud.get_zones(available_resource_creation="KVStore")
    resources_instance_classes = alicloud.kvstore.get_instance_classes(engine="Redis",
        engine_version="5.0",
        instance_charge_type="PrePaid",
        output_file="./classes.txt",
        zone_id=resources_zones.zones[0]["id"])
    pulumi.export("firstKvstoreInstanceClass", resources_instance_classes.instance_classes)
    ```



    :param str architecture: The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
    :param str edition_type: The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
    :param str engine: Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
    :param str engine_version: Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
    :param str node_type: The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
    :param str package_type: It has been deprecated from 1.68.0.
    :param str performance_type: It has been deprecated from 1.68.0. 
    :param str series_type: The KVStore instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
    :param float shard_number: The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
    :param str storage_type: It has been deprecated from 1.68.0. 
    :param str zone_id: The Zone to launch the KVStore instance.
    """
    __args__ = dict()


    __args__['architecture'] = architecture
    __args__['editionType'] = edition_type
    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['nodeType'] = node_type
    __args__['outputFile'] = output_file
    __args__['packageType'] = package_type
    __args__['performanceType'] = performance_type
    __args__['seriesType'] = series_type
    __args__['shardNumber'] = shard_number
    __args__['sortedBy'] = sorted_by
    __args__['storageType'] = storage_type
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:kvstore/getInstanceClasses:getInstanceClasses', __args__, opts=opts).value

    return AwaitableGetInstanceClassesResult(
        architecture=__ret__.get('architecture'),
        classes=__ret__.get('classes'),
        edition_type=__ret__.get('editionType'),
        engine=__ret__.get('engine'),
        engine_version=__ret__.get('engineVersion'),
        id=__ret__.get('id'),
        instance_charge_type=__ret__.get('instanceChargeType'),
        instance_classes=__ret__.get('instanceClasses'),
        node_type=__ret__.get('nodeType'),
        output_file=__ret__.get('outputFile'),
        package_type=__ret__.get('packageType'),
        performance_type=__ret__.get('performanceType'),
        series_type=__ret__.get('seriesType'),
        shard_number=__ret__.get('shardNumber'),
        sorted_by=__ret__.get('sortedBy'),
        storage_type=__ret__.get('storageType'),
        zone_id=__ret__.get('zoneId'))
