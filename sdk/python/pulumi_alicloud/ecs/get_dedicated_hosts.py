# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetDedicatedHostsResult:
    """
    A collection of values returned by getDedicatedHosts.
    """
    def __init__(__self__, dedicated_host_id=None, dedicated_host_name=None, dedicated_host_type=None, hosts=None, id=None, ids=None, name_regex=None, names=None, output_file=None, resource_group_id=None, status=None, tags=None, zone_id=None):
        if dedicated_host_id and not isinstance(dedicated_host_id, str):
            raise TypeError("Expected argument 'dedicated_host_id' to be a str")
        __self__.dedicated_host_id = dedicated_host_id
        """
        ID of the ECS Dedicated Host.
        """
        if dedicated_host_name and not isinstance(dedicated_host_name, str):
            raise TypeError("Expected argument 'dedicated_host_name' to be a str")
        __self__.dedicated_host_name = dedicated_host_name
        """
        The name of the dedicated host.
        """
        if dedicated_host_type and not isinstance(dedicated_host_type, str):
            raise TypeError("Expected argument 'dedicated_host_type' to be a str")
        __self__.dedicated_host_type = dedicated_host_type
        """
        The type of the dedicated host.
        """
        if hosts and not isinstance(hosts, list):
            raise TypeError("Expected argument 'hosts' to be a list")
        __self__.hosts = hosts
        """
        A list of ECS Dedicated Hosts. Each element contains the following attributes:
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
        A list of ECS Dedicated Host ids. 
        """
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        __self__.name_regex = name_regex
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        __self__.names = names
        """
        A list of ECS Dedicated Host names.
        """
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        __self__.output_file = output_file
        if resource_group_id and not isinstance(resource_group_id, str):
            raise TypeError("Expected argument 'resource_group_id' to be a str")
        __self__.resource_group_id = resource_group_id
        """
        The ID of the resource group to which the dedicated host belongs.
        """
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        __self__.status = status
        """
        The service status of the dedicated host.
        """
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        __self__.tags = tags
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        __self__.zone_id = zone_id
class AwaitableGetDedicatedHostsResult(GetDedicatedHostsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDedicatedHostsResult(
            dedicated_host_id=self.dedicated_host_id,
            dedicated_host_name=self.dedicated_host_name,
            dedicated_host_type=self.dedicated_host_type,
            hosts=self.hosts,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            resource_group_id=self.resource_group_id,
            status=self.status,
            tags=self.tags,
            zone_id=self.zone_id)

def get_dedicated_hosts(dedicated_host_id=None,dedicated_host_name=None,dedicated_host_type=None,ids=None,name_regex=None,output_file=None,resource_group_id=None,status=None,tags=None,zone_id=None,opts=None):
    """
    This data source provides a list of ECS Dedicated Hosts in an Alibaba Cloud account according to the specified filters.
     
    > **NOTE:** Available in v1.91.0+.




    :param str dedicated_host_id: The ID of ECS Dedicated Host.
    :param str dedicated_host_name: The name of ECS Dedicated Host.
    :param str dedicated_host_type: The type of the dedicated host.
    :param list ids: A list of ECS Dedicated Host ids.
    :param str name_regex: A regex string to filter results by the ECS Dedicated Host name.
    :param str output_file: Save the result to the file.
    :param str resource_group_id: The ID of the resource group to which the ECS Dedicated Host belongs.
    :param str status: The status of the ECS Dedicated Host. validate value: `Available`, `Creating`, `PermanentFailure`, `Released`, `UnderAssessment`.
    :param dict tags: A mapping of tags to assign to the resource.
    :param str zone_id: The zone ID of the ECS Dedicated Host.
    """
    __args__ = dict()


    __args__['dedicatedHostId'] = dedicated_host_id
    __args__['dedicatedHostName'] = dedicated_host_name
    __args__['dedicatedHostType'] = dedicated_host_type
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceGroupId'] = resource_group_id
    __args__['status'] = status
    __args__['tags'] = tags
    __args__['zoneId'] = zone_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ecs/getDedicatedHosts:getDedicatedHosts', __args__, opts=opts).value

    return AwaitableGetDedicatedHostsResult(
        dedicated_host_id=__ret__.get('dedicatedHostId'),
        dedicated_host_name=__ret__.get('dedicatedHostName'),
        dedicated_host_type=__ret__.get('dedicatedHostType'),
        hosts=__ret__.get('hosts'),
        id=__ret__.get('id'),
        ids=__ret__.get('ids'),
        name_regex=__ret__.get('nameRegex'),
        names=__ret__.get('names'),
        output_file=__ret__.get('outputFile'),
        resource_group_id=__ret__.get('resourceGroupId'),
        status=__ret__.get('status'),
        tags=__ret__.get('tags'),
        zone_id=__ret__.get('zoneId'))
