# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class RoleAttachment(pulumi.CustomResource):
    """
    Provides a RAM role attachment resource to bind role for several ECS instances.
    """
    def __init__(__self__, __name__, __opts__=None, instance_ids=None, role_name=None):
        """Create a RoleAttachment resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if not instance_ids:
            raise TypeError('Missing required property instance_ids')
        elif not isinstance(instance_ids, list):
            raise TypeError('Expected property instance_ids to be a list')
        __self__.instance_ids = instance_ids
        """
        The list of ECS instance's IDs.
        """
        __props__['instanceIds'] = instance_ids

        if not role_name:
            raise TypeError('Missing required property role_name')
        elif not isinstance(role_name, basestring):
            raise TypeError('Expected property role_name to be a basestring')
        __self__.role_name = role_name
        """
        The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        __props__['roleName'] = role_name

        super(RoleAttachment, __self__).__init__(
            'alicloud:ram/roleAttachment:RoleAttachment',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'instanceIds' in outs:
            self.instance_ids = outs['instanceIds']
        if 'roleName' in outs:
            self.role_name = outs['roleName']