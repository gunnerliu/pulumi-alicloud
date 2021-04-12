# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['ControlPolicyAttachment']


class ControlPolicyAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 target_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Resource Manager Control Policy Attachment resource.

        For information about Resource Manager Control Policy Attachment and how to use it, see [What is Control Policy Attachment](https://help.aliyun.com/document_detail/208330.html).

        > **NOTE:** Available in v1.120.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Enable the control policy
        example_resource_directory = alicloud.resourcemanager.ResourceDirectory("exampleResourceDirectory", status="Enabled")
        example_control_policy = alicloud.resourcemanager.ControlPolicy("exampleControlPolicy",
            control_policy_name="tf-testAccName",
            description="tf-testAccRDControlPolicy",
            effect_scope="RAM",
            policy_document=\"\"\"  {
            "Version": "1",
            "Statement": [
              {
                "Effect": "Deny",
                "Action": [
                  "ram:UpdateRole",
                  "ram:DeleteRole",
                  "ram:AttachPolicyToRole",
                  "ram:DetachPolicyFromRole"
                ],
                "Resource": "acs:ram:*:*:role/ResourceDirectoryAccountAccessRole"
              }
            ]
          }
        \"\"\")
        example_folder = alicloud.resourcemanager.Folder("exampleFolder", folder_name="tf-testAccName")
        example_control_policy_attachment = alicloud.resourcemanager.ControlPolicyAttachment("exampleControlPolicyAttachment",
            policy_id=example_control_policy.id,
            target_id=example_folder.id,
            opts=pulumi.ResourceOptions(depends_on=[example_resource_directory]))
        ```

        ## Import

        Resource Manager Control Policy Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment example <policy_id>:<target_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_id: The ID of control policy.
        :param pulumi.Input[str] target_id: The ID of target.
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

            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__['policy_id'] = policy_id
            if target_id is None and not opts.urn:
                raise TypeError("Missing required property 'target_id'")
            __props__['target_id'] = target_id
        super(ControlPolicyAttachment, __self__).__init__(
            'alicloud:resourcemanager/controlPolicyAttachment:ControlPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_id: Optional[pulumi.Input[str]] = None,
            target_id: Optional[pulumi.Input[str]] = None) -> 'ControlPolicyAttachment':
        """
        Get an existing ControlPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_id: The ID of control policy.
        :param pulumi.Input[str] target_id: The ID of target.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["policy_id"] = policy_id
        __props__["target_id"] = target_id
        return ControlPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The ID of control policy.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="targetId")
    def target_id(self) -> pulumi.Output[str]:
        """
        The ID of target.
        """
        return pulumi.get(self, "target_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

