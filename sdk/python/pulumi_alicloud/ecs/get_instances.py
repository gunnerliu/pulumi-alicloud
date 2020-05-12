# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetInstancesResult:
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, availability_zone=None, id=None, ids=None, image_id=None, instances=None, name_regex=None, names=None, output_file=None, ram_role_name=None, resource_group_id=None, status=None, tags=None, vpc_id=None, vswitch_id=None):
        if availability_zone and not isinstance(availability_zone, str):
            raise TypeError("Expected argument 'availability_zone' to be a str")
        __self__.availability_zone = availability_zone
        """
        Availability zone the instance belongs to.
        """
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        The provider-assigned unique ID for this managed resource.
        """
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        __self__.ids = ids
        """
        A list of ECS instance IDs.
        """
        if image_id and not isinstance(image_id, str):
            raise TypeError("Expected argument 'image_id' to be a str")
        __self__.image_id = image_id
        """
        Image ID the instance is using.
        """
        if instances and not isinstance(instances, list):
            raise TypeError("Expected argument 'instances' to be a list")
        __self__.instances = instances
        """
        A list of instances. Each element contains the following attributes:
        """
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        __self__.name_regex = name_regex
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        __self__.names = names
        """
        A list of instances names. 
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if ram_role_name and not isinstance(ram_role_name, str):
            raise TypeError("Expected argument 'ram_role_name' to be a str")
        __self__.ram_role_name = ram_role_name
        """
        The Ram role name.
        """
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        __self__.resource_group_id = resource_group_id
        """
        The Id of resource group.
        """
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        __self__.status = status
        """
        Instance current status.
        """
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        __self__.tags = tags
        """
        A map of tags assigned to the ECS instance.
        """
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        __self__.vpc_id = vpc_id
        """
        ID of the VPC the instance belongs to.
        """
        if vswitch_id and not isinstance(vswitch_id, str):
            raise TypeError("Expected argument 'vswitch_id' to be a str")
        __self__.vswitch_id = vswitch_id
        """
        ID of the VSwitch the instance belongs to.
        """
class AwaitableGetInstancesResult(GetInstancesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstancesResult(
            availability_zone=self.availability_zone,
            id=self.id,
            ids=self.ids,
            image_id=self.image_id,
            instances=self.instances,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            ram_role_name=self.ram_role_name,
            resource_group_id=self.resource_group_id,
            status=self.status,
            tags=self.tags,
            vpc_id=self.vpc_id,
            vswitch_id=self.vswitch_id)

def get_instances(availability_zone=None,ids=None,image_id=None,name_regex=None,output_file=None,ram_role_name=None,resource_group_id=None,status=None,tags=None,vpc_id=None,vswitch_id=None,opts=None):
    """
    The Instances data source list ECS instance resources according to their ID, name regex, image id, status and other fields.

    ## Example Usage



    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    instances_ds = alicloud.ecs.get_instances(name_regex="web_server",
        status="Running")
    pulumi.export("firstInstanceId", instances_ds.instances[0]["id"])
    pulumi.export("instanceIds", instances_ds.ids)
    ```



    :param str availability_zone: Availability zone where instances are located.
    :param list ids: A list of ECS instance IDs.
    :param str image_id: The image ID of some ECS instance used.
    :param str name_regex: A regex string to filter results by instance name.
    :param str ram_role_name: The RAM role name which the instance attaches.
    :param str resource_group_id: The Id of resource group which the instance belongs.
    :param str status: Instance status. Valid values: "Creating", "Starting", "Running", "Stopping" and "Stopped". If undefined, all statuses are considered.
    :param dict tags: A map of tags assigned to the ECS instances. It must be in the format:
           ```
           data "ecs.getInstances" "taggedInstances" {
           tags = {
           tagKey1 = "tagValue1",
           tagKey2 = "tagValue2"
           }
           }
           ```
    :param str vpc_id: ID of the VPC linked to the instances.
    :param str vswitch_id: ID of the VSwitch linked to the instances.
    """
    __args__ = dict()


    __args__['availabilityZone'] = availability_zone
    __args__['ids'] = ids
    __args__['imageId'] = image_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['ramRoleName'] = ram_role_name
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['vpcId'] = vpc_id
    __args__['vswitchId'] = vswitch_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getInstances:getInstances', __args__, opts=opts).value

    return AwaitableGetInstancesResult(
        availability_zone=__ret__.get('availabilityZone'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        image_id=__ret__.get('imageId'),
        instances=__ret__.get('instances'),
        name_regex=__ret__.get('nameRegex'),
        names=__ret__.get('names'),
        output_file=__ret__.get('outputFile'),
        ram_role_name=__ret__.get('ramRoleName'),
        resource_group_id=__ret__.get('resourceGroupId'),
        status=__ret__.get('status'),
        tags=__ret__.get('tags'),
        vpc_id=__ret__.get('vpcId'),
        vswitch_id=__ret__.get('vswitchId'))
