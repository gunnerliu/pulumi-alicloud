# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class GetListenersResult(object):
    """
    A collection of values returned by getListeners.
    """
    def __init__(__self__, slb_listeners=None, id=None):
        if slb_listeners and not isinstance(slb_listeners, list):
            raise TypeError('Expected argument slb_listeners to be a list')
        __self__.slb_listeners = slb_listeners
        """
        A list of SLB listeners. Each element contains the following attributes:
        """
        if id and not isinstance(id, basestring):
            raise TypeError('Expected argument id to be a basestring')
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """

def get_listeners(frontend_port=None, load_balancer_id=None, protocol=None):
    """
    This data source provides the listeners related to a server load balancer of the current Alibaba Cloud user.
    """
    __args__ = dict()

    __args__['frontendPort'] = frontend_port
    __args__['loadBalancerId'] = load_balancer_id
    __args__['protocol'] = protocol
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getListeners:getListeners', __args__)

    return GetListenersResult(
        slb_listeners=__ret__.get('slbListeners'),
        id=__ret__.get('id'))