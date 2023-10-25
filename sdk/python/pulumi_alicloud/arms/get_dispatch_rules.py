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
    'GetDispatchRulesResult',
    'AwaitableGetDispatchRulesResult',
    'get_dispatch_rules',
    'get_dispatch_rules_output',
]

@pulumi.output_type
class GetDispatchRulesResult:
    """
    A collection of values returned by getDispatchRules.
    """
    def __init__(__self__, dispatch_rule_name=None, enable_details=None, id=None, ids=None, name_regex=None, names=None, output_file=None, rules=None):
        if dispatch_rule_name and not isinstance(dispatch_rule_name, str):
            raise TypeError("Expected argument 'dispatch_rule_name' to be a str")
        pulumi.set(__self__, "dispatch_rule_name", dispatch_rule_name)
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
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter(name="dispatchRuleName")
    def dispatch_rule_name(self) -> Optional[str]:
        return pulumi.get(self, "dispatch_rule_name")

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
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetDispatchRulesRuleResult']:
        return pulumi.get(self, "rules")


class AwaitableGetDispatchRulesResult(GetDispatchRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDispatchRulesResult(
            dispatch_rule_name=self.dispatch_rule_name,
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            rules=self.rules)


def get_dispatch_rules(dispatch_rule_name: Optional[str] = None,
                       enable_details: Optional[bool] = None,
                       ids: Optional[Sequence[str]] = None,
                       name_regex: Optional[str] = None,
                       output_file: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDispatchRulesResult:
    """
    This data source provides the Arms Dispatch Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.


    :param str dispatch_rule_name: The name of the dispatch rule.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of dispatch rule id.
    :param str name_regex: A regex string to filter results by Dispatch Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['dispatchRuleName'] = dispatch_rule_name
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:arms/getDispatchRules:getDispatchRules', __args__, opts=opts, typ=GetDispatchRulesResult).value

    return AwaitableGetDispatchRulesResult(
        dispatch_rule_name=pulumi.get(__ret__, 'dispatch_rule_name'),
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        rules=pulumi.get(__ret__, 'rules'))


@_utilities.lift_output_func(get_dispatch_rules)
def get_dispatch_rules_output(dispatch_rule_name: Optional[pulumi.Input[Optional[str]]] = None,
                              enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                              ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                              name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                              output_file: Optional[pulumi.Input[Optional[str]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDispatchRulesResult]:
    """
    This data source provides the Arms Dispatch Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.


    :param str dispatch_rule_name: The name of the dispatch rule.
    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of dispatch rule id.
    :param str name_regex: A regex string to filter results by Dispatch Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
