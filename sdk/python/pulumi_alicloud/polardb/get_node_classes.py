# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetNodeClassesResult:
    """
    A collection of values returned by getNodeClasses.
    """
    def __init__(__self__, classes=None, db_node_class=None, db_type=None, db_version=None, id=None, output_file=None, pay_type=None, region_id=None, zone_id=None):
        if classes and not isinstance(classes, list):
            raise TypeError("Expected argument 'classes' to be a list")
        __self__.classes = classes
        """
        A list of PolarDB node classes. Each element contains the following attributes:
        """
        if db_node_class and not isinstance(db_node_class, str):
            raise TypeError("Expected argument 'db_node_class' to be a str")
        __self__.db_node_class = db_node_class
        """
        PolarDB node available class.
        """
        if db_type and not isinstance(db_type, str):
            raise TypeError("Expected argument 'db_type' to be a str")
        __self__.db_type = db_type
        if db_version and not isinstance(db_version, str):
            raise TypeError("Expected argument 'db_version' to be a str")
        __self__.db_version = db_version
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if pay_type and not isinstance(pay_type, str):
            raise TypeError("Expected argument 'pay_type' to be a str")
        __self__.pay_type = pay_type
        if region_id and not isinstance(region_id, str):
            raise TypeError("Expected argument 'region_id' to be a str")
        __self__.region_id = region_id
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        __self__.zone_id = zone_id
        """
        The Zone to launch the PolarDB cluster.
        """
class AwaitableGetNodeClassesResult(GetNodeClassesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNodeClassesResult(
            classes=self.classes,
            db_node_class=self.db_node_class,
            db_type=self.db_type,
            db_version=self.db_version,
            id=self.id,
            output_file=self.output_file,
            pay_type=self.pay_type,
            region_id=self.region_id,
            zone_id=self.zone_id)

def get_node_classes(db_node_class=None,db_type=None,db_version=None,output_file=None,pay_type=None,region_id=None,zone_id=None,opts=None):
    """
    This data source provides the PolarDB node classes resource available info of Alibaba Cloud.

    > **NOTE:** Available in v1.81.0+

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    resources_zones = alicloud.get_zones(available_resource_creation="PolarDB")
    resources_node_classes = alicloud.polardb.get_node_classes(db_type="MySQL",
        db_version="5.6",
        pay_type="Postpaid",
        zone_id=resources_zones.zones[0]["id"])
    pulumi.export("firstPolardbNodeClass", resources_node_classes.classes)
    ```



    :param str db_node_class: The PolarDB node class type by the user.
    :param str db_type: Database type. Options are `MySQL`, `PostgreSQL`, `Oracle`. If db_type is set, db_version also needs to be set.
    :param str db_version: Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/98169.htm) `DBVersion`. If db_version is set, db_type also needs to be set.
    :param str pay_type: Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`.
    :param str region_id: The Region to launch the PolarDB cluster.
    :param str zone_id: The Zone to launch the PolarDB cluster.
    """
    __args__ = dict()


    __args__['dbNodeClass'] = db_node_class
    __args__['dbType'] = db_type
    __args__['dbVersion'] = db_version
    __args__['outputFile'] = output_file
    __args__['payType'] = pay_type
    __args__['regionId'] = region_id
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:polardb/getNodeClasses:getNodeClasses', __args__, opts=opts).value

    return AwaitableGetNodeClassesResult(
        classes=__ret__.get('classes'),
        db_node_class=__ret__.get('dbNodeClass'),
        db_type=__ret__.get('dbType'),
        db_version=__ret__.get('dbVersion'),
        id=__ret__.get('id'),
        output_file=__ret__.get('outputFile'),
        pay_type=__ret__.get('payType'),
        region_id=__ret__.get('regionId'),
        zone_id=__ret__.get('zoneId'))
