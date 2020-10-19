# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetRulesResult',
    'AwaitableGetRulesResult',
    'get_rules',
]

@pulumi.output_type
class GetRulesResult:
    """
    A collection of values returned by getRules.
    """
    def __init__(__self__, config_rule_state=None, enable_details=None, id=None, ids=None, member_id=None, multi_account=None, name_regex=None, names=None, output_file=None, risk_level=None, rules=None):
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
        if member_id and not isinstance(member_id, int):
            raise TypeError("Expected argument 'member_id' to be a int")
        pulumi.set(__self__, "member_id", member_id)
        if multi_account and not isinstance(multi_account, bool):
            raise TypeError("Expected argument 'multi_account' to be a bool")
        pulumi.set(__self__, "multi_account", multi_account)
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
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter(name="configRuleState")
    def config_rule_state(self) -> Optional[str]:
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
    @pulumi.getter(name="memberId")
    def member_id(self) -> Optional[int]:
        return pulumi.get(self, "member_id")

    @property
    @pulumi.getter(name="multiAccount")
    def multi_account(self) -> Optional[bool]:
        return pulumi.get(self, "multi_account")

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
        return pulumi.get(self, "risk_level")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetRulesRuleResult']:
        """
        A list of Config Rules. Each element contains the following attributes:
        """
        return pulumi.get(self, "rules")


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
            member_id=self.member_id,
            multi_account=self.multi_account,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            risk_level=self.risk_level,
            rules=self.rules)


def get_rules(config_rule_state: Optional[str] = None,
              enable_details: Optional[bool] = None,
              ids: Optional[Sequence[str]] = None,
              member_id: Optional[int] = None,
              multi_account: Optional[bool] = None,
              name_regex: Optional[str] = None,
              output_file: Optional[str] = None,
              risk_level: Optional[int] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRulesResult:
    """
    This data source provides the Config Rules of the current Alibaba Cloud user.

    > **NOTE:**  Available in 1.99.0+.

    > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-northeast-1`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_rules(ids=["cr-ed4bad756057********"],
        name_regex="tftest")
    pulumi.export("firstConfigRuleId", example.rules[0].id)
    ```


    :param str config_rule_state: The state of the config rule, valid values: `ACTIVE`, `DELETING`, `DELETING_RESULTS`, `EVALUATING` and `INACTIVE`.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of Config Rule IDs.
    :param int member_id: The ID of the member account to which the rule to be queried belongs. The default is empty. When `multi_account` is set to true, this parameter is valid.
    :param bool multi_account: Whether the enterprise management account queries the rule details of member accounts.
    :param str name_regex: A regex string to filter results by rule name.
    :param int risk_level: The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
    """
    __args__ = dict()
    __args__['configRuleState'] = config_rule_state
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['memberId'] = member_id
    __args__['multiAccount'] = multi_account
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['riskLevel'] = risk_level
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:cfg/getRules:getRules', __args__, opts=opts, typ=GetRulesResult).value

    return AwaitableGetRulesResult(
        config_rule_state=__ret__.config_rule_state,
        enable_details=__ret__.enable_details,
        id=__ret__.id,
        ids=__ret__.ids,
        member_id=__ret__.member_id,
        multi_account=__ret__.multi_account,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        risk_level=__ret__.risk_level,
        rules=__ret__.rules)
