# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['PolicyAttachment']


class PolicyAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_name: Optional[pulumi.Input[str]] = None,
                 policy_type: Optional[pulumi.Input[str]] = None,
                 principal_name: Optional[pulumi.Input[str]] = None,
                 principal_type: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Resource Manager Policy Attachment resource to attaches a policy to an object. After you attach a policy to an object, the object has the operation permissions on the current resource group or the resources under the current account.
        For information about Resource Manager Policy Attachment and how to use it, see [How to authorize and manage resource groups](https://www.alibabacloud.com/help/en/doc-detail/94490.htm).

        > **NOTE:** Available in v1.93.0+.

        ## Import

        Resource Manager Policy Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:resourcemanager/policyAttachment:PolicyAttachment example tf-testaccrdpolicy:Custom:tf-testaccrdpolicy@11827252********.onaliyun.com:IMSUser:rg******
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_name: The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
        :param pulumi.Input[str] policy_type: - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
        :param pulumi.Input[str] principal_name: The name of the object to which you want to attach the policy.
        :param pulumi.Input[str] principal_type: The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if policy_name is None:
                raise TypeError("Missing required property 'policy_name'")
            __props__['policy_name'] = policy_name
            if policy_type is None:
                raise TypeError("Missing required property 'policy_type'")
            __props__['policy_type'] = policy_type
            if principal_name is None:
                raise TypeError("Missing required property 'principal_name'")
            __props__['principal_name'] = principal_name
            if principal_type is None:
                raise TypeError("Missing required property 'principal_type'")
            __props__['principal_type'] = principal_type
            if resource_group_id is None:
                raise TypeError("Missing required property 'resource_group_id'")
            __props__['resource_group_id'] = resource_group_id
        super(PolicyAttachment, __self__).__init__(
            'alicloud:resourcemanager/policyAttachment:PolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_name: Optional[pulumi.Input[str]] = None,
            policy_type: Optional[pulumi.Input[str]] = None,
            principal_name: Optional[pulumi.Input[str]] = None,
            principal_type: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None) -> 'PolicyAttachment':
        """
        Get an existing PolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_name: The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
        :param pulumi.Input[str] policy_type: - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
        :param pulumi.Input[str] principal_name: The name of the object to which you want to attach the policy.
        :param pulumi.Input[str] principal_type: The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["policy_name"] = policy_name
        __props__["policy_type"] = policy_type
        __props__["principal_name"] = principal_name
        __props__["principal_type"] = principal_type
        __props__["resource_group_id"] = resource_group_id
        return PolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> pulumi.Output[str]:
        """
        The name of the policy. name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
        """
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> pulumi.Output[str]:
        """
        - (Required, ForceNew) The type of the policy. Valid values: `Custom`, `System`.
        """
        return pulumi.get(self, "policy_type")

    @property
    @pulumi.getter(name="principalName")
    def principal_name(self) -> pulumi.Output[str]:
        """
        The name of the object to which you want to attach the policy.
        """
        return pulumi.get(self, "principal_name")

    @property
    @pulumi.getter(name="principalType")
    def principal_type(self) -> pulumi.Output[str]:
        """
        The type of the object to which you want to attach the policy. Valid values: `IMSUser`: RAM user, `IMSGroup`: RAM user group, `ServiceRole`: RAM role.
        """
        return pulumi.get(self, "principal_type")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.
        """
        return pulumi.get(self, "resource_group_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

