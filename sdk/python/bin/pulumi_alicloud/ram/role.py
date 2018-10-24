# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Role(pulumi.CustomResource):
    """
    Provides a RAM Role resource.
    
    ~> **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `terraform plan`, then you can delete resource forcefully.
    """
    def __init__(__self__, __name__, __opts__=None, description=None, document=None, force=None, name=None, ram_users=None, services=None, version=None):
        """Create a Role resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if description and not isinstance(description, basestring):
            raise TypeError('Expected property description to be a basestring')
        __self__.description = description
        """
        Description of the RAM role. This name can have a string of 1 to 1024 characters.
        """
        __props__['description'] = description

        if document and not isinstance(document, basestring):
            raise TypeError('Expected property document to be a basestring')
        __self__.document = document
        """
        Authorization strategy of the RAM role. It is required when the `services` and `ram_users` are not specified.
        """
        __props__['document'] = document

        if force and not isinstance(force, bool):
            raise TypeError('Expected property force to be a bool')
        __self__.force = force
        """
        This parameter is used for resource destroy. Default value is `false`.
        """
        __props__['force'] = force

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        Name of the RAM role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-", "_", and must not begin with a hyphen.
        """
        __props__['name'] = name

        if ram_users and not isinstance(ram_users, list):
            raise TypeError('Expected property ram_users to be a list')
        __self__.ram_users = ram_users
        """
        List of ram users who can assume the RAM role. The format of each item in this list is `acs:ram::${account_id}:root` or `acs:ram::${account_id}:user/${user_name}`, such as `acs:ram::1234567890000:root` and `acs:ram::1234567890001:user/Mary`. The `${user_name}` is the name of a RAM user which must exists in the Alicloud account indicated by the `${account_id}`.
        """
        __props__['ramUsers'] = ram_users

        if services and not isinstance(services, list):
            raise TypeError('Expected property services to be a list')
        __self__.services = services
        """
        List of services which can assume the RAM role. The format of each item in this list is `${service}.aliyuncs.com` or `${account_id}@${service}.aliyuncs.com`, such as `ecs.aliyuncs.com` and `1234567890000@ots.aliyuncs.com`. The `${service}` can be `ecs`, `log`, `apigateway` and so on, the `${account_id}` refers to someone's Alicloud account id.
        """
        __props__['services'] = services

        if version and not isinstance(version, basestring):
            raise TypeError('Expected property version to be a basestring')
        __self__.version = version
        """
        Version of the RAM role policy document. Valid value is `1`. Default value is `1`.
        """
        __props__['version'] = version

        __self__.arn = pulumi.runtime.UNKNOWN
        """
        The role arn.
        """

        super(Role, __self__).__init__(
            'alicloud:ram/role:Role',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'arn' in outs:
            self.arn = outs['arn']
        if 'description' in outs:
            self.description = outs['description']
        if 'document' in outs:
            self.document = outs['document']
        if 'force' in outs:
            self.force = outs['force']
        if 'name' in outs:
            self.name = outs['name']
        if 'ramUsers' in outs:
            self.ram_users = outs['ramUsers']
        if 'services' in outs:
            self.services = outs['services']
        if 'version' in outs:
            self.version = outs['version']