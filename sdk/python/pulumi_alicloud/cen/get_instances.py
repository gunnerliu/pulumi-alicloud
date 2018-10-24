# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class GetInstancesResult(object):
    """
    A collection of values returned by getInstances.
    """
    def __init__(__self__, instances=None, id=None):
        if instances and not isinstance(instances, list):
            raise TypeError('Expected argument instances to be a list')
        __self__.instances = instances
        """
        A list of CEN instances. Each element contains the following attributes:
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_instances(ids=None, name_regex=None, output_file=None):
    """
    This data source provides CEN instances available to the user.
    """
    __args__ = dict()

    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __ret__ = pulumi.runtime.invoke('alicloud:cen/getInstances:getInstances', __args__)

    return GetInstancesResult(
        instances=__ret__.get('instances'),
        id=__ret__.get('id'))