# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class GetRecordsResult(object):
    """
    A collection of values returned by getRecords.
    """
    def __init__(__self__, records=None, id=None):
        if records and not isinstance(records, list):
            raise TypeError('Expected argument records to be a list')
        __self__.records = records
        """
        A list of records. Each element contains the following attributes:
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_records(domain_name=None, host_record_regex=None, is_locked=None, line=None, output_file=None, status=None, type=None, value_regex=None):
    """
    This data source provides a list of DNS Domain Records in an Alibaba Cloud account according to the specified filters.
    """
    __args__ = dict()

    __args__['domainName'] = domain_name
    __args__['hostRecordRegex'] = host_record_regex
    __args__['isLocked'] = is_locked
    __args__['line'] = line
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['type'] = type
    __args__['valueRegex'] = value_regex
    __ret__ = pulumi.runtime.invoke('alicloud:dns/getRecords:getRecords', __args__)

    return GetRecordsResult(
        records=__ret__.get('records'),
        id=__ret__.get('id'))