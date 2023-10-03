# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['SchedulerRuleArgs', 'SchedulerRule']

@pulumi.input_type
class SchedulerRuleArgs:
    def __init__(__self__, *,
                 rule_name: pulumi.Input[str],
                 rule_type: pulumi.Input[int],
                 rules: pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]],
                 param: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SchedulerRule resource.
        :param pulumi.Input[str] rule_name: The name of the rule.
        :param pulumi.Input[int] rule_type: The rule type. Valid values:
               `2`: tiered protection.
               `3`: globalization acceleration.
               `6`: Cloud product interaction.
        :param pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]] rules: The information about the scheduling rules. See `rules` below.
        :param pulumi.Input[str] param: The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        """
        SchedulerRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            rule_name=rule_name,
            rule_type=rule_type,
            rules=rules,
            param=param,
            resource_group_id=resource_group_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             rule_name: pulumi.Input[str],
             rule_type: pulumi.Input[int],
             rules: pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]],
             param: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("rule_name", rule_name)
        _setter("rule_type", rule_type)
        _setter("rules", rules)
        if param is not None:
            _setter("param", param)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Input[str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> pulumi.Input[int]:
        """
        The rule type. Valid values:
        `2`: tiered protection.
        `3`: globalization acceleration.
        `6`: Cloud product interaction.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: pulumi.Input[int]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]:
        """
        The information about the scheduling rules. See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def param(self) -> Optional[pulumi.Input[str]]:
        """
        The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        """
        return pulumi.get(self, "param")

    @param.setter
    def param(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "param", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)


@pulumi.input_type
class _SchedulerRuleState:
    def __init__(__self__, *,
                 cname: Optional[pulumi.Input[str]] = None,
                 param: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]] = None):
        """
        Input properties used for looking up and filtering SchedulerRule resources.
        :param pulumi.Input[str] cname: The cname is the traffic scheduler corresponding to rules.
        :param pulumi.Input[str] param: The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        :param pulumi.Input[str] rule_name: The name of the rule.
        :param pulumi.Input[int] rule_type: The rule type. Valid values:
               `2`: tiered protection.
               `3`: globalization acceleration.
               `6`: Cloud product interaction.
        :param pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]] rules: The information about the scheduling rules. See `rules` below.
        """
        _SchedulerRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cname=cname,
            param=param,
            resource_group_id=resource_group_id,
            rule_name=rule_name,
            rule_type=rule_type,
            rules=rules,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cname: Optional[pulumi.Input[str]] = None,
             param: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             rule_name: Optional[pulumi.Input[str]] = None,
             rule_type: Optional[pulumi.Input[int]] = None,
             rules: Optional[pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if cname is not None:
            _setter("cname", cname)
        if param is not None:
            _setter("param", param)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if rule_name is not None:
            _setter("rule_name", rule_name)
        if rule_type is not None:
            _setter("rule_type", rule_type)
        if rules is not None:
            _setter("rules", rules)

    @property
    @pulumi.getter
    def cname(self) -> Optional[pulumi.Input[str]]:
        """
        The cname is the traffic scheduler corresponding to rules.
        """
        return pulumi.get(self, "cname")

    @cname.setter
    def cname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cname", value)

    @property
    @pulumi.getter
    def param(self) -> Optional[pulumi.Input[str]]:
        """
        The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        """
        return pulumi.get(self, "param")

    @param.setter
    def param(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "param", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "rule_name")

    @rule_name.setter
    def rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_name", value)

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> Optional[pulumi.Input[int]]:
        """
        The rule type. Valid values:
        `2`: tiered protection.
        `3`: globalization acceleration.
        `6`: Cloud product interaction.
        """
        return pulumi.get(self, "rule_type")

    @rule_type.setter
    def rule_type(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "rule_type", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]]:
        """
        The information about the scheduling rules. See `rules` below.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SchedulerRuleRuleArgs']]]]):
        pulumi.set(self, "rules", value)


class SchedulerRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 param: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SchedulerRuleRuleArgs']]]]] = None,
                 __props__=None):
        """
        Provides a DdosCoo Scheduler Rule resource. For information about DdosCoo Scheduler Rule and how to use it, see[What is DdosCoo Scheduler Rule](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-createschedulerrule).

        > **NOTE:** Available since v1.86.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example = alicloud.ddos.SchedulerRule("example",
            rule_name=name,
            rule_type=3,
            rules=[
                alicloud.ddos.SchedulerRuleRuleArgs(
                    priority=100,
                    region_id="cn-hangzhou",
                    type="A",
                    value="127.0.0.1",
                    value_type=3,
                ),
                alicloud.ddos.SchedulerRuleRuleArgs(
                    priority=50,
                    region_id="cn-hangzhou",
                    type="A",
                    value="127.0.0.0",
                    value_type=1,
                ),
            ])
        ```

        ## Import

        DdosCoo Scheduler Rule can be imported using the id or the rule name, e.g.

        ```sh
         $ pulumi import alicloud:ddos/schedulerRule:SchedulerRule example fbb20dc77e8fc******
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] param: The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        :param pulumi.Input[str] rule_name: The name of the rule.
        :param pulumi.Input[int] rule_type: The rule type. Valid values:
               `2`: tiered protection.
               `3`: globalization acceleration.
               `6`: Cloud product interaction.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SchedulerRuleRuleArgs']]]] rules: The information about the scheduling rules. See `rules` below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SchedulerRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DdosCoo Scheduler Rule resource. For information about DdosCoo Scheduler Rule and how to use it, see[What is DdosCoo Scheduler Rule](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-createschedulerrule).

        > **NOTE:** Available since v1.86.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        example = alicloud.ddos.SchedulerRule("example",
            rule_name=name,
            rule_type=3,
            rules=[
                alicloud.ddos.SchedulerRuleRuleArgs(
                    priority=100,
                    region_id="cn-hangzhou",
                    type="A",
                    value="127.0.0.1",
                    value_type=3,
                ),
                alicloud.ddos.SchedulerRuleRuleArgs(
                    priority=50,
                    region_id="cn-hangzhou",
                    type="A",
                    value="127.0.0.0",
                    value_type=1,
                ),
            ])
        ```

        ## Import

        DdosCoo Scheduler Rule can be imported using the id or the rule name, e.g.

        ```sh
         $ pulumi import alicloud:ddos/schedulerRule:SchedulerRule example fbb20dc77e8fc******
        ```

        :param str resource_name: The name of the resource.
        :param SchedulerRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SchedulerRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            SchedulerRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 param: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 rule_name: Optional[pulumi.Input[str]] = None,
                 rule_type: Optional[pulumi.Input[int]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SchedulerRuleRuleArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SchedulerRuleArgs.__new__(SchedulerRuleArgs)

            __props__.__dict__["param"] = param
            __props__.__dict__["resource_group_id"] = resource_group_id
            if rule_name is None and not opts.urn:
                raise TypeError("Missing required property 'rule_name'")
            __props__.__dict__["rule_name"] = rule_name
            if rule_type is None and not opts.urn:
                raise TypeError("Missing required property 'rule_type'")
            __props__.__dict__["rule_type"] = rule_type
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
            __props__.__dict__["cname"] = None
        super(SchedulerRule, __self__).__init__(
            'alicloud:ddos/schedulerRule:SchedulerRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cname: Optional[pulumi.Input[str]] = None,
            param: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            rule_name: Optional[pulumi.Input[str]] = None,
            rule_type: Optional[pulumi.Input[int]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SchedulerRuleRuleArgs']]]]] = None) -> 'SchedulerRule':
        """
        Get an existing SchedulerRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cname: The cname is the traffic scheduler corresponding to rules.
        :param pulumi.Input[str] param: The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        :param pulumi.Input[str] rule_name: The name of the rule.
        :param pulumi.Input[int] rule_type: The rule type. Valid values:
               `2`: tiered protection.
               `3`: globalization acceleration.
               `6`: Cloud product interaction.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['SchedulerRuleRuleArgs']]]] rules: The information about the scheduling rules. See `rules` below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SchedulerRuleState.__new__(_SchedulerRuleState)

        __props__.__dict__["cname"] = cname
        __props__.__dict__["param"] = param
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["rule_name"] = rule_name
        __props__.__dict__["rule_type"] = rule_type
        __props__.__dict__["rules"] = rules
        return SchedulerRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def cname(self) -> pulumi.Output[str]:
        """
        The cname is the traffic scheduler corresponding to rules.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def param(self) -> pulumi.Output[Optional[str]]:
        """
        The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
        """
        return pulumi.get(self, "param")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> pulumi.Output[str]:
        """
        The name of the rule.
        """
        return pulumi.get(self, "rule_name")

    @property
    @pulumi.getter(name="ruleType")
    def rule_type(self) -> pulumi.Output[int]:
        """
        The rule type. Valid values:
        `2`: tiered protection.
        `3`: globalization acceleration.
        `6`: Cloud product interaction.
        """
        return pulumi.get(self, "rule_type")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.SchedulerRuleRule']]:
        """
        The information about the scheduling rules. See `rules` below.
        """
        return pulumi.get(self, "rules")

