# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities

class Project(pulumi.CustomResource):
    """
    The project is the basic unit of resource management in Datahub Service and is used to isolate and control resources. It contains a set of Topics. You can manage the datahub sources of an application by using projects. [Refer to details](https://help.aliyun.com/document_detail/47440.html).
    """
    def __init__(__self__, __name__, __opts__=None, comment=None, name=None):
        """Create a Project resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, basestring):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if comment and not isinstance(comment, basestring):
            raise TypeError('Expected property comment to be a basestring')
        __self__.comment = comment
        """
        Comment of the datahub project. It cannot be longer than 255 characters.
        """
        __props__['comment'] = comment

        if name and not isinstance(name, basestring):
            raise TypeError('Expected property name to be a basestring')
        __self__.name = name
        """
        The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and '_' are allowed. It is case-insensitive.
        """
        __props__['name'] = name

        __self__.create_time = pulumi.runtime.UNKNOWN
        """
        Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
        """
        __self__.last_modify_time = pulumi.runtime.UNKNOWN
        """
        Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
        """

        super(Project, __self__).__init__(
            'alicloud:datahub/project:Project',
            __name__,
            __props__,
            __opts__)

    def set_outputs(self, outs):
        if 'comment' in outs:
            self.comment = outs['comment']
        if 'createTime' in outs:
            self.create_time = outs['createTime']
        if 'lastModifyTime' in outs:
            self.last_modify_time = outs['lastModifyTime']
        if 'name' in outs:
            self.name = outs['name']