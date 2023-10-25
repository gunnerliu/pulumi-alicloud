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

__all__ = ['DispatchRuleArgs', 'DispatchRule']

@pulumi.input_type
class DispatchRuleArgs:
    def __init__(__self__, *,
                 dispatch_rule_name: pulumi.Input[str],
                 group_rules: pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]],
                 label_match_expression_grids: pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]],
                 notify_rules: pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]],
                 dispatch_type: Optional[pulumi.Input[str]] = None,
                 is_recover: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DispatchRule resource.
        :param pulumi.Input[str] dispatch_rule_name: The name of the dispatch policy.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]] group_rules: Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]] label_match_expression_grids: Sets the dispatch rule. See `label_match_expression_grid` below.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]] notify_rules: Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[str] dispatch_type: The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        :param pulumi.Input[bool] is_recover: Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        """
        DispatchRuleArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dispatch_rule_name=dispatch_rule_name,
            group_rules=group_rules,
            label_match_expression_grids=label_match_expression_grids,
            notify_rules=notify_rules,
            dispatch_type=dispatch_type,
            is_recover=is_recover,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dispatch_rule_name: Optional[pulumi.Input[str]] = None,
             group_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]] = None,
             label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]] = None,
             notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]] = None,
             dispatch_type: Optional[pulumi.Input[str]] = None,
             is_recover: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dispatch_rule_name is None and 'dispatchRuleName' in kwargs:
            dispatch_rule_name = kwargs['dispatchRuleName']
        if dispatch_rule_name is None:
            raise TypeError("Missing 'dispatch_rule_name' argument")
        if group_rules is None and 'groupRules' in kwargs:
            group_rules = kwargs['groupRules']
        if group_rules is None:
            raise TypeError("Missing 'group_rules' argument")
        if label_match_expression_grids is None and 'labelMatchExpressionGrids' in kwargs:
            label_match_expression_grids = kwargs['labelMatchExpressionGrids']
        if label_match_expression_grids is None:
            raise TypeError("Missing 'label_match_expression_grids' argument")
        if notify_rules is None and 'notifyRules' in kwargs:
            notify_rules = kwargs['notifyRules']
        if notify_rules is None:
            raise TypeError("Missing 'notify_rules' argument")
        if dispatch_type is None and 'dispatchType' in kwargs:
            dispatch_type = kwargs['dispatchType']
        if is_recover is None and 'isRecover' in kwargs:
            is_recover = kwargs['isRecover']

        _setter("dispatch_rule_name", dispatch_rule_name)
        _setter("group_rules", group_rules)
        _setter("label_match_expression_grids", label_match_expression_grids)
        _setter("notify_rules", notify_rules)
        if dispatch_type is not None:
            _setter("dispatch_type", dispatch_type)
        if is_recover is not None:
            _setter("is_recover", is_recover)

    @property
    @pulumi.getter(name="dispatchRuleName")
    def dispatch_rule_name(self) -> pulumi.Input[str]:
        """
        The name of the dispatch policy.
        """
        return pulumi.get(self, "dispatch_rule_name")

    @dispatch_rule_name.setter
    def dispatch_rule_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "dispatch_rule_name", value)

    @property
    @pulumi.getter(name="groupRules")
    def group_rules(self) -> pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]:
        """
        Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "group_rules")

    @group_rules.setter
    def group_rules(self, value: pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]):
        pulumi.set(self, "group_rules", value)

    @property
    @pulumi.getter(name="labelMatchExpressionGrids")
    def label_match_expression_grids(self) -> pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]:
        """
        Sets the dispatch rule. See `label_match_expression_grid` below.
        """
        return pulumi.get(self, "label_match_expression_grids")

    @label_match_expression_grids.setter
    def label_match_expression_grids(self, value: pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]):
        pulumi.set(self, "label_match_expression_grids", value)

    @property
    @pulumi.getter(name="notifyRules")
    def notify_rules(self) -> pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]:
        """
        Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "notify_rules")

    @notify_rules.setter
    def notify_rules(self, value: pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]):
        pulumi.set(self, "notify_rules", value)

    @property
    @pulumi.getter(name="dispatchType")
    def dispatch_type(self) -> Optional[pulumi.Input[str]]:
        """
        The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        """
        return pulumi.get(self, "dispatch_type")

    @dispatch_type.setter
    def dispatch_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dispatch_type", value)

    @property
    @pulumi.getter(name="isRecover")
    def is_recover(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        """
        return pulumi.get(self, "is_recover")

    @is_recover.setter
    def is_recover(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_recover", value)


@pulumi.input_type
class _DispatchRuleState:
    def __init__(__self__, *,
                 dispatch_rule_name: Optional[pulumi.Input[str]] = None,
                 dispatch_type: Optional[pulumi.Input[str]] = None,
                 group_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]] = None,
                 is_recover: Optional[pulumi.Input[bool]] = None,
                 label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]] = None,
                 notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DispatchRule resources.
        :param pulumi.Input[str] dispatch_rule_name: The name of the dispatch policy.
        :param pulumi.Input[str] dispatch_type: The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]] group_rules: Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[bool] is_recover: Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]] label_match_expression_grids: Sets the dispatch rule. See `label_match_expression_grid` below.
        :param pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]] notify_rules: Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[str] status: The resource status of Alert Dispatch Rule.
        """
        _DispatchRuleState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            dispatch_rule_name=dispatch_rule_name,
            dispatch_type=dispatch_type,
            group_rules=group_rules,
            is_recover=is_recover,
            label_match_expression_grids=label_match_expression_grids,
            notify_rules=notify_rules,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             dispatch_rule_name: Optional[pulumi.Input[str]] = None,
             dispatch_type: Optional[pulumi.Input[str]] = None,
             group_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]] = None,
             is_recover: Optional[pulumi.Input[bool]] = None,
             label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]] = None,
             notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if dispatch_rule_name is None and 'dispatchRuleName' in kwargs:
            dispatch_rule_name = kwargs['dispatchRuleName']
        if dispatch_type is None and 'dispatchType' in kwargs:
            dispatch_type = kwargs['dispatchType']
        if group_rules is None and 'groupRules' in kwargs:
            group_rules = kwargs['groupRules']
        if is_recover is None and 'isRecover' in kwargs:
            is_recover = kwargs['isRecover']
        if label_match_expression_grids is None and 'labelMatchExpressionGrids' in kwargs:
            label_match_expression_grids = kwargs['labelMatchExpressionGrids']
        if notify_rules is None and 'notifyRules' in kwargs:
            notify_rules = kwargs['notifyRules']

        if dispatch_rule_name is not None:
            _setter("dispatch_rule_name", dispatch_rule_name)
        if dispatch_type is not None:
            _setter("dispatch_type", dispatch_type)
        if group_rules is not None:
            _setter("group_rules", group_rules)
        if is_recover is not None:
            _setter("is_recover", is_recover)
        if label_match_expression_grids is not None:
            _setter("label_match_expression_grids", label_match_expression_grids)
        if notify_rules is not None:
            _setter("notify_rules", notify_rules)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="dispatchRuleName")
    def dispatch_rule_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the dispatch policy.
        """
        return pulumi.get(self, "dispatch_rule_name")

    @dispatch_rule_name.setter
    def dispatch_rule_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dispatch_rule_name", value)

    @property
    @pulumi.getter(name="dispatchType")
    def dispatch_type(self) -> Optional[pulumi.Input[str]]:
        """
        The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        """
        return pulumi.get(self, "dispatch_type")

    @dispatch_type.setter
    def dispatch_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dispatch_type", value)

    @property
    @pulumi.getter(name="groupRules")
    def group_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]]:
        """
        Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "group_rules")

    @group_rules.setter
    def group_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleGroupRuleArgs']]]]):
        pulumi.set(self, "group_rules", value)

    @property
    @pulumi.getter(name="isRecover")
    def is_recover(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        """
        return pulumi.get(self, "is_recover")

    @is_recover.setter
    def is_recover(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_recover", value)

    @property
    @pulumi.getter(name="labelMatchExpressionGrids")
    def label_match_expression_grids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]]:
        """
        Sets the dispatch rule. See `label_match_expression_grid` below.
        """
        return pulumi.get(self, "label_match_expression_grids")

    @label_match_expression_grids.setter
    def label_match_expression_grids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleLabelMatchExpressionGridArgs']]]]):
        pulumi.set(self, "label_match_expression_grids", value)

    @property
    @pulumi.getter(name="notifyRules")
    def notify_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]]:
        """
        Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "notify_rules")

    @notify_rules.setter
    def notify_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DispatchRuleNotifyRuleArgs']]]]):
        pulumi.set(self, "notify_rules", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The resource status of Alert Dispatch Rule.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class DispatchRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dispatch_rule_name: Optional[pulumi.Input[str]] = None,
                 dispatch_type: Optional[pulumi.Input[str]] = None,
                 group_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleGroupRuleArgs']]]]] = None,
                 is_recover: Optional[pulumi.Input[bool]] = None,
                 label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleLabelMatchExpressionGridArgs']]]]] = None,
                 notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleNotifyRuleArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule and how to use it, see [What is Alert Dispatch_Rule](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateDispatchRule).

        > **NOTE:** Available since v1.136.0.

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Contact can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/dispatchRule:DispatchRule example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dispatch_rule_name: The name of the dispatch policy.
        :param pulumi.Input[str] dispatch_type: The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleGroupRuleArgs']]]] group_rules: Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[bool] is_recover: Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleLabelMatchExpressionGridArgs']]]] label_match_expression_grids: Sets the dispatch rule. See `label_match_expression_grid` below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleNotifyRuleArgs']]]] notify_rules: Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DispatchRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule resource.

        For information about Application Real-Time Monitoring Service (ARMS) Alert Dispatch Rule and how to use it, see [What is Alert Dispatch_Rule](https://next.api.alibabacloud.com/document/ARMS/2019-08-08/CreateDispatchRule).

        > **NOTE:** Available since v1.136.0.

        ## Import

        Application Real-Time Monitoring Service (ARMS) Alert Contact can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:arms/dispatchRule:DispatchRule example <id>
        ```

        :param str resource_name: The name of the resource.
        :param DispatchRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DispatchRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DispatchRuleArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 dispatch_rule_name: Optional[pulumi.Input[str]] = None,
                 dispatch_type: Optional[pulumi.Input[str]] = None,
                 group_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleGroupRuleArgs']]]]] = None,
                 is_recover: Optional[pulumi.Input[bool]] = None,
                 label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleLabelMatchExpressionGridArgs']]]]] = None,
                 notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleNotifyRuleArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DispatchRuleArgs.__new__(DispatchRuleArgs)

            if dispatch_rule_name is None and not opts.urn:
                raise TypeError("Missing required property 'dispatch_rule_name'")
            __props__.__dict__["dispatch_rule_name"] = dispatch_rule_name
            __props__.__dict__["dispatch_type"] = dispatch_type
            if group_rules is None and not opts.urn:
                raise TypeError("Missing required property 'group_rules'")
            __props__.__dict__["group_rules"] = group_rules
            __props__.__dict__["is_recover"] = is_recover
            if label_match_expression_grids is None and not opts.urn:
                raise TypeError("Missing required property 'label_match_expression_grids'")
            __props__.__dict__["label_match_expression_grids"] = label_match_expression_grids
            if notify_rules is None and not opts.urn:
                raise TypeError("Missing required property 'notify_rules'")
            __props__.__dict__["notify_rules"] = notify_rules
            __props__.__dict__["status"] = None
        super(DispatchRule, __self__).__init__(
            'alicloud:arms/dispatchRule:DispatchRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dispatch_rule_name: Optional[pulumi.Input[str]] = None,
            dispatch_type: Optional[pulumi.Input[str]] = None,
            group_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleGroupRuleArgs']]]]] = None,
            is_recover: Optional[pulumi.Input[bool]] = None,
            label_match_expression_grids: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleLabelMatchExpressionGridArgs']]]]] = None,
            notify_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleNotifyRuleArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'DispatchRule':
        """
        Get an existing DispatchRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dispatch_rule_name: The name of the dispatch policy.
        :param pulumi.Input[str] dispatch_type: The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleGroupRuleArgs']]]] group_rules: Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[bool] is_recover: Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleLabelMatchExpressionGridArgs']]]] label_match_expression_grids: Sets the dispatch rule. See `label_match_expression_grid` below.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DispatchRuleNotifyRuleArgs']]]] notify_rules: Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        :param pulumi.Input[str] status: The resource status of Alert Dispatch Rule.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DispatchRuleState.__new__(_DispatchRuleState)

        __props__.__dict__["dispatch_rule_name"] = dispatch_rule_name
        __props__.__dict__["dispatch_type"] = dispatch_type
        __props__.__dict__["group_rules"] = group_rules
        __props__.__dict__["is_recover"] = is_recover
        __props__.__dict__["label_match_expression_grids"] = label_match_expression_grids
        __props__.__dict__["notify_rules"] = notify_rules
        __props__.__dict__["status"] = status
        return DispatchRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dispatchRuleName")
    def dispatch_rule_name(self) -> pulumi.Output[str]:
        """
        The name of the dispatch policy.
        """
        return pulumi.get(self, "dispatch_rule_name")

    @property
    @pulumi.getter(name="dispatchType")
    def dispatch_type(self) -> pulumi.Output[Optional[str]]:
        """
        The alert handling method. Valid values: CREATE_ALERT: generates an alert. DISCARD_ALERT: discards the alert event and generates no alert.
        """
        return pulumi.get(self, "dispatch_type")

    @property
    @pulumi.getter(name="groupRules")
    def group_rules(self) -> pulumi.Output[Sequence['outputs.DispatchRuleGroupRule']]:
        """
        Sets the event group. See `group_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "group_rules")

    @property
    @pulumi.getter(name="isRecover")
    def is_recover(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to send the restored alert. Valid values: true: sends the alert. false: does not send the alert.
        """
        return pulumi.get(self, "is_recover")

    @property
    @pulumi.getter(name="labelMatchExpressionGrids")
    def label_match_expression_grids(self) -> pulumi.Output[Sequence['outputs.DispatchRuleLabelMatchExpressionGrid']]:
        """
        Sets the dispatch rule. See `label_match_expression_grid` below.
        """
        return pulumi.get(self, "label_match_expression_grids")

    @property
    @pulumi.getter(name="notifyRules")
    def notify_rules(self) -> pulumi.Output[Sequence['outputs.DispatchRuleNotifyRule']]:
        """
        Sets the notification rule. See `notify_rules` below. It will be ignored  when `dispatch_type = "DISCARD_ALERT"`.
        """
        return pulumi.get(self, "notify_rules")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The resource status of Alert Dispatch Rule.
        """
        return pulumi.get(self, "status")

