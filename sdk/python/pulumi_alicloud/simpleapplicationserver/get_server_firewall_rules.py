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
    'GetServerFirewallRulesResult',
    'AwaitableGetServerFirewallRulesResult',
    'get_server_firewall_rules',
    'get_server_firewall_rules_output',
]

@pulumi.output_type
class GetServerFirewallRulesResult:
    """
    A collection of values returned by getServerFirewallRules.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, output_file=None, rules=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def rules(self) -> Sequence['outputs.GetServerFirewallRulesRuleResult']:
        return pulumi.get(self, "rules")


class AwaitableGetServerFirewallRulesResult(GetServerFirewallRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServerFirewallRulesResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            output_file=self.output_file,
            rules=self.rules)


def get_server_firewall_rules(ids: Optional[Sequence[str]] = None,
                              instance_id: Optional[str] = None,
                              output_file: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServerFirewallRulesResult:
    """
    This data source provides the Simple Application Server Firewall Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.


    :param Sequence[str] ids: A list of Firewall Rule IDs.
    :param str instance_id: Alibaba Cloud simple application server instance ID.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:simpleapplicationserver/getServerFirewallRules:getServerFirewallRules', __args__, opts=opts, typ=GetServerFirewallRulesResult).value

    return AwaitableGetServerFirewallRulesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        rules=pulumi.get(__ret__, 'rules'))


@_utilities.lift_output_func(get_server_firewall_rules)
def get_server_firewall_rules_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                     instance_id: Optional[pulumi.Input[str]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServerFirewallRulesResult]:
    """
    This data source provides the Simple Application Server Firewall Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.


    :param Sequence[str] ids: A list of Firewall Rule IDs.
    :param str instance_id: Alibaba Cloud simple application server instance ID.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
