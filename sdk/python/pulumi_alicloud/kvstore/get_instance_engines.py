# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetInstanceEnginesResult:
    """
    A collection of values returned by getInstanceEngines.
    """
    def __init__(__self__, engine=None, engine_version=None, instance_charge_type=None, instance_engines=None, output_file=None, zone_id=None, id=None):
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        __self__.engine = engine
        """
        Database type.
        """
        if engine_version and not isinstance(engine_version, str):
            raise TypeError("Expected argument 'engine_version' to be a str")
        __self__.engine_version = engine_version
        """
        KVStore Instance version.
        """
        if instance_charge_type and not isinstance(instance_charge_type, str):
            raise TypeError("Expected argument 'instance_charge_type' to be a str")
        __self__.instance_charge_type = instance_charge_type
        if instance_engines and not isinstance(instance_engines, list):
            raise TypeError("Expected argument 'instance_engines' to be a list")
        __self__.instance_engines = instance_engines
        """
        A list of KVStore available instance engines. Each element contains the following attributes:
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        __self__.zone_id = zone_id
        """
        The Zone to launch the KVStore instance.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetInstanceEnginesResult(GetInstanceEnginesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceEnginesResult(
            engine=self.engine,
            engine_version=self.engine_version,
            instance_charge_type=self.instance_charge_type,
            instance_engines=self.instance_engines,
            output_file=self.output_file,
            zone_id=self.zone_id,
            id=self.id)

def get_instance_engines(engine=None,engine_version=None,instance_charge_type=None,output_file=None,zone_id=None,opts=None):
    """
    This data source provides the KVStore instance engines resource available info of Alibaba Cloud.
    
    > **NOTE:** Available in v1.51.0+
    
    :param str engine: Database type. Options are `Redis`, `Memcache`. If no value is specified, all types are returned.
    :param str engine_version: Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
    :param str instance_charge_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
    :param str zone_id: The Zone to launch the KVStore instance.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/kvstore_instance_engines.html.markdown.
    """
    __args__ = dict()

    __args__['engine'] = engine
    __args__['engineVersion'] = engine_version
    __args__['instanceChargeType'] = instance_charge_type
    __args__['outputFile'] = output_file
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:kvstore/getInstanceEngines:getInstanceEngines', __args__, opts=opts).value

    return AwaitableGetInstanceEnginesResult(
        engine=__ret__.get('engine'),
        engine_version=__ret__.get('engineVersion'),
        instance_charge_type=__ret__.get('instanceChargeType'),
        instance_engines=__ret__.get('instanceEngines'),
        output_file=__ret__.get('outputFile'),
        zone_id=__ret__.get('zoneId'),
        id=__ret__.get('id'))