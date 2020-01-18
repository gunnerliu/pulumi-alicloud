# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class SecurityGroup(pulumi.CustomResource):
    description: pulumi.Output[str]
    """
    The security group description. Defaults to null.
    """
    inner_access: pulumi.Output[bool]
    """
    Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
    """
    inner_access_policy: pulumi.Output[str]
    """
    Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
    """
    name: pulumi.Output[str]
    """
    The name of the security group. Defaults to null.
    """
    resource_group_id: pulumi.Output[str]
    """
    The Id of resource group which the security_group belongs.
    """
    security_group_type: pulumi.Output[str]
    """
    The type of the security group. Valid values:
    `normal`: basic security group.
    `enterprise`: advanced security group For more information.
    """
    tags: pulumi.Output[dict]
    """
    A mapping of tags to assign to the resource.
    """
    vpc_id: pulumi.Output[str]
    """
    The VPC ID.	
    """
    def __init__(__self__, resource_name, opts=None, description=None, inner_access=None, inner_access_policy=None, name=None, resource_group_id=None, security_group_type=None, tags=None, vpc_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Create a SecurityGroup resource with the given unique name, props, and options.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.	

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/security_group.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['description'] = description
            __props__['inner_access'] = inner_access
            __props__['inner_access_policy'] = inner_access_policy
            __props__['name'] = name
            __props__['resource_group_id'] = resource_group_id
            __props__['security_group_type'] = security_group_type
            __props__['tags'] = tags
            __props__['vpc_id'] = vpc_id
        super(SecurityGroup, __self__).__init__(
            'alicloud:ecs/securityGroup:SecurityGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, description=None, inner_access=None, inner_access_policy=None, name=None, resource_group_id=None, security_group_type=None, tags=None, vpc_id=None):
        """
        Get an existing SecurityGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The security group description. Defaults to null.
        :param pulumi.Input[bool] inner_access: Field 'inner_access' has been deprecated from provider version 1.55.3. Use 'inner_access_policy' replaces it.
        :param pulumi.Input[str] inner_access_policy: Whether to allow both machines to access each other on all ports in the same security group. Valid values: ["Accept", "Drop"]
        :param pulumi.Input[str] name: The name of the security group. Defaults to null.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the security_group belongs.
        :param pulumi.Input[str] security_group_type: The type of the security group. Valid values:
               `normal`: basic security group.
               `enterprise`: advanced security group For more information.
        :param pulumi.Input[dict] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vpc_id: The VPC ID.	

        > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/security_group.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["description"] = description
        __props__["inner_access"] = inner_access
        __props__["inner_access_policy"] = inner_access_policy
        __props__["name"] = name
        __props__["resource_group_id"] = resource_group_id
        __props__["security_group_type"] = security_group_type
        __props__["tags"] = tags
        __props__["vpc_id"] = vpc_id
        return SecurityGroup(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

