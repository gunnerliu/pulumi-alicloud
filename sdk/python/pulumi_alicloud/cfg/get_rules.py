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

__all__ = [
    'GetRulesResult',
    'AwaitableGetRulesResult',
    'get_rules',
    'get_rules_output',
]

@pulumi.output_type
class GetRulesResult:
    """
    A collection of values returned by getRules.
    """
    def __init__(__self__, config_rule_state=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, risk_level=None, rule_name=None, rules=None, status=None):
        if config_rule_state and not isinstance(config_rule_state, str):
            raise TypeError("Expected argument 'config_rule_state' to be a str")
        pulumi.set(__self__, "config_rule_state", config_rule_state)
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if risk_level and not isinstance(risk_level, int):
            raise TypeError("Expected argument 'risk_level' to be a int")
        pulumi.set(__self__, "risk_level", risk_level)
        if rule_name and not isinstance(rule_name, str):
            raise TypeError("Expected argument 'rule_name' to be a str")
        pulumi.set(__self__, "rule_name", rule_name)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="configRuleState")
    def config_rule_state(self) -> Optional[str]:
        """
        The state of the Config Rule.
        """
        warnings.warn("""Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead.""", DeprecationWarning)
        pulumi.log.warn("""config_rule_state is deprecated: Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead.""")

        return pulumi.get(self, "config_rule_state")

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> Sequence[str]:
        """
        A list of Config Rule IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Config Rule names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="riskLevel")
    def risk_level(self) -> Optional[int]:
        """
        The risk level of the Config Rule.
        """
        return pulumi.get(self, "risk_level")

    @property
    @pulumi.getter(name="ruleName")
    def rule_name(self) -> Optional[str]:
        """
        The name of the Config Rule.
        """
        return pulumi.get(self, "rule_name")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRulesRuleResult']:
        """
        A list of Config Rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        (Available in 1.124.1+) The status of config rule.
        """
        return pulumi.get(self, "status")


class AwaitableGetRulesResult(GetRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRulesResult(
            config_rule_state=self.config_rule_state,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            risk_level=self.risk_level,
            rule_name=self.rule_name,
            rules=self.rules,
            status=self.status)


def get_rules(config_rule_state: Optional[str] = None,
              enable_details: Optional[bool] = None,
              ids: Optional[Sequence[str]] = None,
              name_regex: Optional[str] = None,
              output_file: Optional[str] = None,
              risk_level: Optional[int] = None,
              rule_name: Optional[str] = None,
              status: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesResult:
    """
    This data source provides the Config Rules of the current Alibaba Cloud user.

    > **NOTE:**  Available in 1.99.0+.

    > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_rules(ids=["cr-ed4bad756057********"],
        name_regex="tftest")
    pulumi.export("firstConfigRuleId", example.rules[0].id)
    ```


    :param str config_rule_state: Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Config Rule IDs.
    :param str name_regex: A regex string to filter results by rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int risk_level: The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
    :param str rule_name: The name of config rule.
    :param str status: The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
    """
    __args__ = dict()
    __args__['configRuleState'] = config_rule_state
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['riskLevel'] = risk_level
    __args__['ruleName'] = rule_name
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cfg/getRules:getRules', __args__, opts=opts, typ=GetRulesResult).value

    return AwaitableGetRulesResult(
        config_rule_state=pulumi.get(__ret__, 'config_rule_state'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        risk_level=pulumi.get(__ret__, 'risk_level'),
        rule_name=pulumi.get(__ret__, 'rule_name'),
        rules=pulumi.get(__ret__, 'rules'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_rules)
def get_rules_output(config_rule_state: Optional[pulumi.Input[Optional[str]]] = None,
                     enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                     name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                     risk_level: Optional[pulumi.Input[Optional[int]]] = None,
                     rule_name: Optional[pulumi.Input[Optional[str]]] = None,
                     status: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRulesResult]:
    """
    This data source provides the Config Rules of the current Alibaba Cloud user.

    > **NOTE:**  Available in 1.99.0+.

    > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_rules(ids=["cr-ed4bad756057********"],
        name_regex="tftest")
    pulumi.export("firstConfigRuleId", example.rules[0].id)
    ```


    :param str config_rule_state: Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Config Rule IDs.
    :param str name_regex: A regex string to filter results by rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int risk_level: The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
    :param str rule_name: The name of config rule.
    :param str status: The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
    """
    ...
