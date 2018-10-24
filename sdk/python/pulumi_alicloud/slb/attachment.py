# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Attachment(pulumi.CustomResource):
    """
    Add a group of backend servers (ECS instance) to the Server Load Balancer or remove them from it.
    """
    def __init__(__self__, __name__, __opts__=None, backend_servers=None, instance_ids=None, instances=None, load_balancer_id=None, slb_id=None, weight=None):
        """Create a Attachment resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if backend_servers and not isinstance(backend_servers, basestring):
            raise TypeError('Expected property backend_servers to be a basestring')
        __self__.backend_servers = backend_servers
        """
        The backend servers of the load balancer.
        """
        __props__['backendServers'] = backend_servers

        if not instance_ids:
            raise TypeError('Missing required property instance_ids')
        elif not isinstance(instance_ids, list):
            raise TypeError('Expected property instance_ids to be a list')
        __self__.instance_ids = instance_ids
        """
        A list of instance ids to added backend server in the SLB.
        """
        __props__['instanceIds'] = instance_ids

        if instances and not isinstance(instances, list):
            raise TypeError('Expected property instances to be a list')
        __self__.instances = instances
        """
        It has been deprecated from provider version 1.6.0. New field 'instance_ids' replaces it.
        """
        __props__['instances'] = instances

        if not load_balancer_id:
            raise TypeError('Missing required property load_balancer_id')
        elif not isinstance(load_balancer_id, basestring):
            raise TypeError('Expected property load_balancer_id to be a basestring')
        __self__.load_balancer_id = load_balancer_id
        """
        ID of the load balancer.
        """
        __props__['loadBalancerId'] = load_balancer_id

        if slb_id and not isinstance(slb_id, basestring):
            raise TypeError('Expected property slb_id to be a basestring')
        __self__.slb_id = slb_id
        """
        It has been deprecated from provider version 1.6.0. New field 'load_balancer_id' replaces it.
        """
        __props__['slbId'] = slb_id

        if weight and not isinstance(weight, int):
            raise TypeError('Expected property weight to be a int')
        __self__.weight = weight
        """
        Weight of the instances. Valid value range: [0-100]. Default to 100.
        """
        __props__['weight'] = weight

        super(Attachment, __self__).__init__(
            'alicloud:slb/attachment:Attachment',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'backendServers' in outs:
            self.backend_servers = outs['backendServers']
        if 'instanceIds' in outs:
            self.instance_ids = outs['instanceIds']
        if 'instances' in outs:
            self.instances = outs['instances']
        if 'loadBalancerId' in outs:
            self.load_balancer_id = outs['loadBalancerId']
        if 'slbId' in outs:
            self.slb_id = outs['slbId']
        if 'weight' in outs:
            self.weight = outs['weight']