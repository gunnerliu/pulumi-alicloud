# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WafPolicyDomainAttachmentArgs', 'WafPolicyDomainAttachment']

@pulumi.input_type
class WafPolicyDomainAttachmentArgs:
    def __init__(__self__, *,
                 domain_name: pulumi.Input[str],
                 policy_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a WafPolicyDomainAttachment resource.
        :param pulumi.Input[str] domain_name: Access the accelerated domain name of the specified protection policy.
        :param pulumi.Input[str] policy_id: The protection policy ID. Only one input is supported.
        """
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Input[str]:
        """
        Access the accelerated domain name of the specified protection policy.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[str]:
        """
        The protection policy ID. Only one input is supported.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy_id", value)


@pulumi.input_type
class _WafPolicyDomainAttachmentState:
    def __init__(__self__, *,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WafPolicyDomainAttachment resources.
        :param pulumi.Input[str] domain_name: Access the accelerated domain name of the specified protection policy.
        :param pulumi.Input[str] policy_id: The protection policy ID. Only one input is supported.
        """
        if domain_name is not None:
            pulumi.set(__self__, "domain_name", domain_name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[pulumi.Input[str]]:
        """
        Access the accelerated domain name of the specified protection policy.
        """
        return pulumi.get(self, "domain_name")

    @domain_name.setter
    def domain_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        The protection policy ID. Only one input is supported.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_id", value)


class WafPolicyDomainAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DCDN Waf Policy Domain Attachment resource.

        For information about DCDN Waf Policy Domain Attachment and how to use it, see [What is Waf Policy Domain Attachment](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/modify-the-domain-name-bound-to-a-protection-policies).

        > **NOTE:** Available in v1.186.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_domain = alicloud.dcdn.Domain("defaultDomain",
            domain_name="example_domain_name",
            sources=[alicloud.dcdn.DomainSourceArgs(
                content="1.1.1.1",
                port=80,
                priority="20",
                type="ipaddr",
            )])
        default_waf_domain = alicloud.dcdn.WafDomain("defaultWafDomain",
            domain_name=default_domain.domain_name,
            client_ip_tag="X-Forwarded-For")
        default_waf_policy = alicloud.dcdn.WafPolicy("defaultWafPolicy",
            policy_type="custom",
            policy_name="example_value",
            defense_scene="waf_group",
            status="on")
        example = alicloud.dcdn.WafPolicyDomainAttachment("example",
            domain_name=default_waf_domain.domain_name,
            policy_id=default_waf_policy.id)
        ```

        ## Import

        DCDN Waf Policy Domain Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dcdn/wafPolicyDomainAttachment:WafPolicyDomainAttachment example policy_id:domain_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Access the accelerated domain name of the specified protection policy.
        :param pulumi.Input[str] policy_id: The protection policy ID. Only one input is supported.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WafPolicyDomainAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DCDN Waf Policy Domain Attachment resource.

        For information about DCDN Waf Policy Domain Attachment and how to use it, see [What is Waf Policy Domain Attachment](https://www.alibabacloud.com/help/en/dynamic-route-for-cdn/latest/modify-the-domain-name-bound-to-a-protection-policies).

        > **NOTE:** Available in v1.186.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_domain = alicloud.dcdn.Domain("defaultDomain",
            domain_name="example_domain_name",
            sources=[alicloud.dcdn.DomainSourceArgs(
                content="1.1.1.1",
                port=80,
                priority="20",
                type="ipaddr",
            )])
        default_waf_domain = alicloud.dcdn.WafDomain("defaultWafDomain",
            domain_name=default_domain.domain_name,
            client_ip_tag="X-Forwarded-For")
        default_waf_policy = alicloud.dcdn.WafPolicy("defaultWafPolicy",
            policy_type="custom",
            policy_name="example_value",
            defense_scene="waf_group",
            status="on")
        example = alicloud.dcdn.WafPolicyDomainAttachment("example",
            domain_name=default_waf_domain.domain_name,
            policy_id=default_waf_policy.id)
        ```

        ## Import

        DCDN Waf Policy Domain Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:dcdn/wafPolicyDomainAttachment:WafPolicyDomainAttachment example policy_id:domain_name
        ```

        :param str resource_name: The name of the resource.
        :param WafPolicyDomainAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WafPolicyDomainAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain_name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WafPolicyDomainAttachmentArgs.__new__(WafPolicyDomainAttachmentArgs)

            if domain_name is None and not opts.urn:
                raise TypeError("Missing required property 'domain_name'")
            __props__.__dict__["domain_name"] = domain_name
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
        super(WafPolicyDomainAttachment, __self__).__init__(
            'alicloud:dcdn/wafPolicyDomainAttachment:WafPolicyDomainAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain_name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[str]] = None) -> 'WafPolicyDomainAttachment':
        """
        Get an existing WafPolicyDomainAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain_name: Access the accelerated domain name of the specified protection policy.
        :param pulumi.Input[str] policy_id: The protection policy ID. Only one input is supported.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WafPolicyDomainAttachmentState.__new__(_WafPolicyDomainAttachmentState)

        __props__.__dict__["domain_name"] = domain_name
        __props__.__dict__["policy_id"] = policy_id
        return WafPolicyDomainAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> pulumi.Output[str]:
        """
        Access the accelerated domain name of the specified protection policy.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[str]:
        """
        The protection policy ID. Only one input is supported.
        """
        return pulumi.get(self, "policy_id")
