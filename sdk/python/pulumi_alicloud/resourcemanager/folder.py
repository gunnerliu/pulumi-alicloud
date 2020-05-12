# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Folder(pulumi.CustomResource):
    folder_name: pulumi.Output[str]
    """
    The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
    """
    parent_folder_id: pulumi.Output[str]
    """
    The ID of the parent folder. If not set, the system default value will be used.
    """
    def __init__(__self__, resource_name, opts=None, folder_name=None, parent_folder_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a Resource Manager Folder resource. A folder is an organizational unit in a resource directory. You can use folders to build an organizational structure for resources.
        For information about Resource Manager Foler and how to use it, see [What is Resource Manager Folder](https://www.alibabacloud.com/help/en/doc-detail/111221.htm).

        > **NOTE:** Available in v1.82.0+.

        > **NOTE:** A maximum of five levels of folders can be created under the root folder.

        ## Example Usage



        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.resourcemanager.Folder("example", folder_name="test")
        ```


        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] folder_name: The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] parent_folder_id: The ID of the parent folder. If not set, the system default value will be used.
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

            if folder_name is None:
                raise TypeError("Missing required property 'folder_name'")
            __props__['folder_name'] = folder_name
            __props__['parent_folder_id'] = parent_folder_id
        super(Folder, __self__).__init__(
            'alicloud:resourcemanager/folder:Folder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, folder_name=None, parent_folder_id=None):
        """
        Get an existing Folder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] folder_name: The name of the folder. The name must be 1 to 24 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).
        :param pulumi.Input[str] parent_folder_id: The ID of the parent folder. If not set, the system default value will be used.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["folder_name"] = folder_name
        __props__["parent_folder_id"] = parent_folder_id
        return Folder(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

