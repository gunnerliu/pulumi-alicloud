# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from . import utilities

class GetRegionsResult(object):
    """
    A collection of values returned by getRegions.
    """
    def __init__(__self__, current=None, name=None, regions=None, id=None):
        if current and not isinstance(current, bool):
            raise TypeError('Expected argument current to be a bool')
        __self__.current = current
        if name and not isinstance(name, basestring):
            raise TypeError('Expected argument name to be a basestring')
        __self__.name = name
        if regions and not isinstance(regions, list):
            raise TypeError('Expected argument regions to be a list')
        __self__.regions = regions
        """
        A list of regions. Each element contains the following attributes:
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_regions(current=None, name=None, output_file=None):
    """
    This data source provides Alibaba Cloud regions.
    """
    __args__ = dict()

    __args__['current'] = current
    __args__['name'] = name
    __args__['outputFile'] = output_file
    __ret__ = pulumi.runtime.invoke('alicloud:index/getRegions:getRegions', __args__)

    return GetRegionsResult(
        current=__ret__.get('current'),
        name=__ret__.get('name'),
        regions=__ret__.get('regions'),
        id=__ret__.get('id'))