# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AclRuleArgs', 'AclRule']

@pulumi.input_type
class AclRuleArgs:
    def __init__(__self__, *,
                 acl_id: pulumi.Input[str],
                 dest_cidr: pulumi.Input[str],
                 dest_port_range: pulumi.Input[str],
                 direction: pulumi.Input[str],
                 ip_protocol: pulumi.Input[str],
                 policy: pulumi.Input[str],
                 source_cidr: pulumi.Input[str],
                 source_port_range: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a AclRule resource.
        :param pulumi.Input[str] acl_id: The ID of the ACL.
        :param pulumi.Input[str] dest_cidr: The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] dest_port_range: The range of the destination port. Valid value: 80/80.
        :param pulumi.Input[str] direction: The direction of the ACL rule. Valid values: in|out.
        :param pulumi.Input[str] ip_protocol: The protocol used by the ACL rule. The value is not case sensitive.
        :param pulumi.Input[str] policy: The policy used by the ACL rule. Valid values: accept|drop.
        :param pulumi.Input[str] source_cidr: The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] source_port_range: The range of the source port. Valid value: 80/80.
        :param pulumi.Input[str] description: The description of the ACL rule. It must be 1 to 512 characters in length.
        :param pulumi.Input[int] priority: The priority of the ACL rule. Value range: 1 to 100.
        """
        AclRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            acl_id=acl_id,
            dest_cidr=dest_cidr,
            dest_port_range=dest_port_range,
            direction=direction,
            ip_protocol=ip_protocol,
            policy=policy,
            source_cidr=source_cidr,
            source_port_range=source_port_range,
            description=description,
            priority=priority,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             acl_id: pulumi.Input[str],
             dest_cidr: pulumi.Input[str],
             dest_port_range: pulumi.Input[str],
             direction: pulumi.Input[str],
             ip_protocol: pulumi.Input[str],
             policy: pulumi.Input[str],
             source_cidr: pulumi.Input[str],
             source_port_range: pulumi.Input[str],
             description: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("acl_id", acl_id)
        _setter("dest_cidr", dest_cidr)
        _setter("dest_port_range", dest_port_range)
        _setter("direction", direction)
        _setter("ip_protocol", ip_protocol)
        _setter("policy", policy)
        _setter("source_cidr", source_cidr)
        _setter("source_port_range", source_port_range)
        if description is not None:
            _setter("description", description)
        if priority is not None:
            _setter("priority", priority)

    @property
    @pulumi.getter(name="aclId")
    def acl_id(self) -> pulumi.Input[str]:
        """
        The ID of the ACL.
        """
        return pulumi.get(self, "acl_id")

    @acl_id.setter
    def acl_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "acl_id", value)

    @property
    @pulumi.getter(name="destCidr")
    def dest_cidr(self) -> pulumi.Input[str]:
        """
        The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "dest_cidr")

    @dest_cidr.setter
    def dest_cidr(self, value: pulumi.Input[str]):
        pulumi.set(self, "dest_cidr", value)

    @property
    @pulumi.getter(name="destPortRange")
    def dest_port_range(self) -> pulumi.Input[str]:
        """
        The range of the destination port. Valid value: 80/80.
        """
        return pulumi.get(self, "dest_port_range")

    @dest_port_range.setter
    def dest_port_range(self, value: pulumi.Input[str]):
        pulumi.set(self, "dest_port_range", value)

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Input[str]:
        """
        The direction of the ACL rule. Valid values: in|out.
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: pulumi.Input[str]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> pulumi.Input[str]:
        """
        The protocol used by the ACL rule. The value is not case sensitive.
        """
        return pulumi.get(self, "ip_protocol")

    @ip_protocol.setter
    def ip_protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "ip_protocol", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The policy used by the ACL rule. Valid values: accept|drop.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="sourceCidr")
    def source_cidr(self) -> pulumi.Input[str]:
        """
        The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "source_cidr")

    @source_cidr.setter
    def source_cidr(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_cidr", value)

    @property
    @pulumi.getter(name="sourcePortRange")
    def source_port_range(self) -> pulumi.Input[str]:
        """
        The range of the source port. Valid value: 80/80.
        """
        return pulumi.get(self, "source_port_range")

    @source_port_range.setter
    def source_port_range(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_port_range", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the ACL rule. It must be 1 to 512 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the ACL rule. Value range: 1 to 100.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)


@pulumi.input_type
class _AclRuleState:
    def __init__(__self__, *,
                 acl_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dest_cidr: Optional[pulumi.Input[str]] = None,
                 dest_port_range: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 ip_protocol: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 source_cidr: Optional[pulumi.Input[str]] = None,
                 source_port_range: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AclRule resources.
        :param pulumi.Input[str] acl_id: The ID of the ACL.
        :param pulumi.Input[str] description: The description of the ACL rule. It must be 1 to 512 characters in length.
        :param pulumi.Input[str] dest_cidr: The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] dest_port_range: The range of the destination port. Valid value: 80/80.
        :param pulumi.Input[str] direction: The direction of the ACL rule. Valid values: in|out.
        :param pulumi.Input[str] ip_protocol: The protocol used by the ACL rule. The value is not case sensitive.
        :param pulumi.Input[str] policy: The policy used by the ACL rule. Valid values: accept|drop.
        :param pulumi.Input[int] priority: The priority of the ACL rule. Value range: 1 to 100.
        :param pulumi.Input[str] source_cidr: The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] source_port_range: The range of the source port. Valid value: 80/80.
        """
        _AclRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            acl_id=acl_id,
            description=description,
            dest_cidr=dest_cidr,
            dest_port_range=dest_port_range,
            direction=direction,
            ip_protocol=ip_protocol,
            policy=policy,
            priority=priority,
            source_cidr=source_cidr,
            source_port_range=source_port_range,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             acl_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             dest_cidr: Optional[pulumi.Input[str]] = None,
             dest_port_range: Optional[pulumi.Input[str]] = None,
             direction: Optional[pulumi.Input[str]] = None,
             ip_protocol: Optional[pulumi.Input[str]] = None,
             policy: Optional[pulumi.Input[str]] = None,
             priority: Optional[pulumi.Input[int]] = None,
             source_cidr: Optional[pulumi.Input[str]] = None,
             source_port_range: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if acl_id is not None:
            _setter("acl_id", acl_id)
        if description is not None:
            _setter("description", description)
        if dest_cidr is not None:
            _setter("dest_cidr", dest_cidr)
        if dest_port_range is not None:
            _setter("dest_port_range", dest_port_range)
        if direction is not None:
            _setter("direction", direction)
        if ip_protocol is not None:
            _setter("ip_protocol", ip_protocol)
        if policy is not None:
            _setter("policy", policy)
        if priority is not None:
            _setter("priority", priority)
        if source_cidr is not None:
            _setter("source_cidr", source_cidr)
        if source_port_range is not None:
            _setter("source_port_range", source_port_range)

    @property
    @pulumi.getter(name="aclId")
    def acl_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ACL.
        """
        return pulumi.get(self, "acl_id")

    @acl_id.setter
    def acl_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the ACL rule. It must be 1 to 512 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="destCidr")
    def dest_cidr(self) -> Optional[pulumi.Input[str]]:
        """
        The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "dest_cidr")

    @dest_cidr.setter
    def dest_cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dest_cidr", value)

    @property
    @pulumi.getter(name="destPortRange")
    def dest_port_range(self) -> Optional[pulumi.Input[str]]:
        """
        The range of the destination port. Valid value: 80/80.
        """
        return pulumi.get(self, "dest_port_range")

    @dest_port_range.setter
    def dest_port_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dest_port_range", value)

    @property
    @pulumi.getter
    def direction(self) -> Optional[pulumi.Input[str]]:
        """
        The direction of the ACL rule. Valid values: in|out.
        """
        return pulumi.get(self, "direction")

    @direction.setter
    def direction(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "direction", value)

    @property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol used by the ACL rule. The value is not case sensitive.
        """
        return pulumi.get(self, "ip_protocol")

    @ip_protocol.setter
    def ip_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_protocol", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy used by the ACL rule. Valid values: accept|drop.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority of the ACL rule. Value range: 1 to 100.
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="sourceCidr")
    def source_cidr(self) -> Optional[pulumi.Input[str]]:
        """
        The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "source_cidr")

    @source_cidr.setter
    def source_cidr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_cidr", value)

    @property
    @pulumi.getter(name="sourcePortRange")
    def source_port_range(self) -> Optional[pulumi.Input[str]]:
        """
        The range of the source port. Valid value: 80/80.
        """
        return pulumi.get(self, "source_port_range")

    @source_port_range.setter
    def source_port_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_port_range", value)


class AclRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dest_cidr: Optional[pulumi.Input[str]] = None,
                 dest_port_range: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 ip_protocol: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 source_cidr: Optional[pulumi.Input[str]] = None,
                 source_port_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Sag Acl Rule resource. This topic describes how to configure an access control list (ACL) rule for a target Smart Access Gateway instance to permit or deny access to or from specified IP addresses in the ACL rule.

        For information about Sag Acl Rule and how to use it, see [What is access control list (ACL) rule](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/addaclrule).

        > **NOTE:** Available since v1.60.0.

        > **NOTE:** Only the following regions support create Cloud Connect Network. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_acl = alicloud.rocketmq.Acl("defaultAcl")
        default_acl_rule = alicloud.rocketmq.AclRule("defaultAclRule",
            acl_id=default_acl.id,
            description=name,
            policy="accept",
            ip_protocol="ALL",
            direction="in",
            source_cidr="10.10.1.0/24",
            source_port_range="-1/-1",
            dest_cidr="192.168.1.0/24",
            dest_port_range="-1/-1",
            priority=1)
        ```

        ## Import

        The Sag Acl Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/aclRule:AclRule example acr-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl_id: The ID of the ACL.
        :param pulumi.Input[str] description: The description of the ACL rule. It must be 1 to 512 characters in length.
        :param pulumi.Input[str] dest_cidr: The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] dest_port_range: The range of the destination port. Valid value: 80/80.
        :param pulumi.Input[str] direction: The direction of the ACL rule. Valid values: in|out.
        :param pulumi.Input[str] ip_protocol: The protocol used by the ACL rule. The value is not case sensitive.
        :param pulumi.Input[str] policy: The policy used by the ACL rule. Valid values: accept|drop.
        :param pulumi.Input[int] priority: The priority of the ACL rule. Value range: 1 to 100.
        :param pulumi.Input[str] source_cidr: The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] source_port_range: The range of the source port. Valid value: 80/80.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AclRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Sag Acl Rule resource. This topic describes how to configure an access control list (ACL) rule for a target Smart Access Gateway instance to permit or deny access to or from specified IP addresses in the ACL rule.

        For information about Sag Acl Rule and how to use it, see [What is access control list (ACL) rule](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/addaclrule).

        > **NOTE:** Available since v1.60.0.

        > **NOTE:** Only the following regions support create Cloud Connect Network. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_acl = alicloud.rocketmq.Acl("defaultAcl")
        default_acl_rule = alicloud.rocketmq.AclRule("defaultAclRule",
            acl_id=default_acl.id,
            description=name,
            policy="accept",
            ip_protocol="ALL",
            direction="in",
            source_cidr="10.10.1.0/24",
            source_port_range="-1/-1",
            dest_cidr="192.168.1.0/24",
            dest_port_range="-1/-1",
            priority=1)
        ```

        ## Import

        The Sag Acl Rule can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/aclRule:AclRule example acr-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param AclRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AclRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AclRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 dest_cidr: Optional[pulumi.Input[str]] = None,
                 dest_port_range: Optional[pulumi.Input[str]] = None,
                 direction: Optional[pulumi.Input[str]] = None,
                 ip_protocol: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 source_cidr: Optional[pulumi.Input[str]] = None,
                 source_port_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AclRuleArgs.__new__(AclRuleArgs)

            if acl_id is None and not opts.urn:
                raise TypeError("Missing required property 'acl_id'")
            __props__.__dict__["acl_id"] = acl_id
            __props__.__dict__["description"] = description
            if dest_cidr is None and not opts.urn:
                raise TypeError("Missing required property 'dest_cidr'")
            __props__.__dict__["dest_cidr"] = dest_cidr
            if dest_port_range is None and not opts.urn:
                raise TypeError("Missing required property 'dest_port_range'")
            __props__.__dict__["dest_port_range"] = dest_port_range
            if direction is None and not opts.urn:
                raise TypeError("Missing required property 'direction'")
            __props__.__dict__["direction"] = direction
            if ip_protocol is None and not opts.urn:
                raise TypeError("Missing required property 'ip_protocol'")
            __props__.__dict__["ip_protocol"] = ip_protocol
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            __props__.__dict__["priority"] = priority
            if source_cidr is None and not opts.urn:
                raise TypeError("Missing required property 'source_cidr'")
            __props__.__dict__["source_cidr"] = source_cidr
            if source_port_range is None and not opts.urn:
                raise TypeError("Missing required property 'source_port_range'")
            __props__.__dict__["source_port_range"] = source_port_range
        super(AclRule, __self__).__init__(
            'alicloud:rocketmq/aclRule:AclRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            dest_cidr: Optional[pulumi.Input[str]] = None,
            dest_port_range: Optional[pulumi.Input[str]] = None,
            direction: Optional[pulumi.Input[str]] = None,
            ip_protocol: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            source_cidr: Optional[pulumi.Input[str]] = None,
            source_port_range: Optional[pulumi.Input[str]] = None) -> 'AclRule':
        """
        Get an existing AclRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl_id: The ID of the ACL.
        :param pulumi.Input[str] description: The description of the ACL rule. It must be 1 to 512 characters in length.
        :param pulumi.Input[str] dest_cidr: The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] dest_port_range: The range of the destination port. Valid value: 80/80.
        :param pulumi.Input[str] direction: The direction of the ACL rule. Valid values: in|out.
        :param pulumi.Input[str] ip_protocol: The protocol used by the ACL rule. The value is not case sensitive.
        :param pulumi.Input[str] policy: The policy used by the ACL rule. Valid values: accept|drop.
        :param pulumi.Input[int] priority: The priority of the ACL rule. Value range: 1 to 100.
        :param pulumi.Input[str] source_cidr: The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        :param pulumi.Input[str] source_port_range: The range of the source port. Valid value: 80/80.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AclRuleState.__new__(_AclRuleState)

        __props__.__dict__["acl_id"] = acl_id
        __props__.__dict__["description"] = description
        __props__.__dict__["dest_cidr"] = dest_cidr
        __props__.__dict__["dest_port_range"] = dest_port_range
        __props__.__dict__["direction"] = direction
        __props__.__dict__["ip_protocol"] = ip_protocol
        __props__.__dict__["policy"] = policy
        __props__.__dict__["priority"] = priority
        __props__.__dict__["source_cidr"] = source_cidr
        __props__.__dict__["source_port_range"] = source_port_range
        return AclRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aclId")
    def acl_id(self) -> pulumi.Output[str]:
        """
        The ID of the ACL.
        """
        return pulumi.get(self, "acl_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the ACL rule. It must be 1 to 512 characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="destCidr")
    def dest_cidr(self) -> pulumi.Output[str]:
        """
        The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "dest_cidr")

    @property
    @pulumi.getter(name="destPortRange")
    def dest_port_range(self) -> pulumi.Output[str]:
        """
        The range of the destination port. Valid value: 80/80.
        """
        return pulumi.get(self, "dest_port_range")

    @property
    @pulumi.getter
    def direction(self) -> pulumi.Output[str]:
        """
        The direction of the ACL rule. Valid values: in|out.
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> pulumi.Output[str]:
        """
        The protocol used by the ACL rule. The value is not case sensitive.
        """
        return pulumi.get(self, "ip_protocol")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The policy used by the ACL rule. Valid values: accept|drop.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[int]]:
        """
        The priority of the ACL rule. Value range: 1 to 100.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="sourceCidr")
    def source_cidr(self) -> pulumi.Output[str]:
        """
        The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
        """
        return pulumi.get(self, "source_cidr")

    @property
    @pulumi.getter(name="sourcePortRange")
    def source_port_range(self) -> pulumi.Output[str]:
        """
        The range of the source port. Valid value: 80/80.
        """
        return pulumi.get(self, "source_port_range")

