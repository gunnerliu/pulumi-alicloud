# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class ResourceDirectory(pulumi.CustomResource):
    master_account_id: pulumi.Output[str]
    """
    The ID of the master account.
    """
    master_account_name: pulumi.Output[str]
    """
    The name of the master account.
    """
    root_folder_id: pulumi.Output[str]
    """
    The ID of the root folder.
    """
    def __init__(__self__, resource_name, opts=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Resource Manager Resource Directory resource. Resource Directory enables you to establish an organizational structure for the resources used by applications of your enterprise. You can plan, build, and manage the resources in a centralized manner by using only one resource directory.

        For information about Resource Manager Resource Directory and how to use it, see [What is Resource Manager Resource Directory](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).

        > **NOTE:** Available in v1.84.0+.

        > **NOTE:** An account can only be used to enable a resource directory after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.

        > **NOTE:** Before you destroy the resource, make sure that the following requirements are met:
          - All member accounts must be removed from the resource directory. 
          - All folders except the root folder must be deleted from the resource directory.
          
        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.resourcemanager.ResourceDirectory("example")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
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

            __props__['master_account_id'] = None
            __props__['master_account_name'] = None
            __props__['root_folder_id'] = None
        super(ResourceDirectory, __self__).__init__(
            'alicloud:resourcemanager/resourceDirectory:ResourceDirectory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, master_account_id=None, master_account_name=None, root_folder_id=None):
        """
        Get an existing ResourceDirectory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] master_account_id: The ID of the master account.
        :param pulumi.Input[str] master_account_name: The name of the master account.
        :param pulumi.Input[str] root_folder_id: The ID of the root folder.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["master_account_id"] = master_account_id
        __props__["master_account_name"] = master_account_name
        __props__["root_folder_id"] = root_folder_id
        return ResourceDirectory(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
