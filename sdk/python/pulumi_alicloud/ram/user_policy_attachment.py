# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['UserPolicyAttachment']


class UserPolicyAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy_name: Optional[pulumi.Input[str]] = None,
                 policy_type: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a RAM User Policy attachment resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        # Create a RAM User Policy attachment.
        user = alicloud.ram.User("user",
            comments="yoyoyo",
            display_name="user_display_name",
            email="hello.uuu@aaa.com",
            force=True,
            mobile="86-18688888888")
        policy = alicloud.ram.Policy("policy",
            description="this is a policy test",
            document=\"\"\"  {
            "Statement": [
              {
                "Action": [
                  "oss:ListObjects",
                  "oss:GetObject"
                ],
                "Effect": "Allow",
                "Resource": [
                  "acs:oss:*:*:mybucket",
                  "acs:oss:*:*:mybucket/*"
                ]
              }
            ],
              "Version": "1"
          }
          
        \"\"\",
            force=True)
        attach = alicloud.ram.UserPolicyAttachment("attach",
            policy_name=policy.name,
            policy_type=policy.type,
            user_name=user.name)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_name: Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        :param pulumi.Input[str] policy_type: Type of the RAM policy. It must be `Custom` or `System`.
        :param pulumi.Input[str] user_name: Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
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
            if user_name is None:
                raise TypeError("Missing required property 'user_name'")
            __props__['user_name'] = user_name
        super(UserPolicyAttachment, __self__).__init__(
            'alicloud:ram/userPolicyAttachment:UserPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy_name: Optional[pulumi.Input[str]] = None,
            policy_type: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'UserPolicyAttachment':
        """
        Get an existing UserPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy_name: Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        :param pulumi.Input[str] policy_type: Type of the RAM policy. It must be `Custom` or `System`.
        :param pulumi.Input[str] user_name: Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["policy_name"] = policy_name
        __props__["policy_type"] = policy_type
        __props__["user_name"] = user_name
        return UserPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="policyName")
    def policy_name(self) -> str:
        """
        Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
        """
        return pulumi.get(self, "policy_name")

    @property
    @pulumi.getter(name="policyType")
    def policy_type(self) -> str:
        """
        Type of the RAM policy. It must be `Custom` or `System`.
        """
        return pulumi.get(self, "policy_type")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
        """
        return pulumi.get(self, "user_name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

