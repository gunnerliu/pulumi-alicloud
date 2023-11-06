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
    'GetPrometheusAlertRulesResult',
    'AwaitableGetPrometheusAlertRulesResult',
    'get_prometheus_alert_rules',
    'get_prometheus_alert_rules_output',
]

@pulumi.output_type
class GetPrometheusAlertRulesResult:
    """
    A collection of values returned by getPrometheusAlertRules.
    """
    def __init__(__self__, cluster_id=None, id=None, ids=None, match_expressions=None, name_regex=None, names=None, output_file=None, rules=None, status=None, type=None):
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if match_expressions and not isinstance(match_expressions, str):
            raise TypeError("Expected argument 'match_expressions' to be a str")
        pulumi.set(__self__, "match_expressions", match_expressions)
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
        if status and not isinstance(status, int):
            raise TypeError("Expected argument 'status' to be a int")
        pulumi.set(__self__, "status", status)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

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
    @pulumi.getter(name="matchExpressions")
    def match_expressions(self) -> Optional[str]:
        return pulumi.get(self, "match_expressions")

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
    def rules(self) -> Sequence['outputs.GetPrometheusAlertRulesRuleResult']:
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def status(self) -> Optional[int]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")


class AwaitableGetPrometheusAlertRulesResult(GetPrometheusAlertRulesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrometheusAlertRulesResult(
            cluster_id=self.cluster_id,
            id=self.id,
            ids=self.ids,
            match_expressions=self.match_expressions,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            rules=self.rules,
            status=self.status,
            type=self.type)


def get_prometheus_alert_rules(cluster_id: Optional[str] = None,
                               ids: Optional[Sequence[str]] = None,
                               match_expressions: Optional[str] = None,
                               name_regex: Optional[str] = None,
                               output_file: Optional[str] = None,
                               status: Optional[int] = None,
                               type: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrometheusAlertRulesResult:
    """
    This data source provides the Arms Prometheus Alert Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.arms.get_prometheus_alert_rules(cluster_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("armsPrometheusAlertRuleId1", ids.rules[0].id)
    name_regex = alicloud.arms.get_prometheus_alert_rules(cluster_id="example_value",
        name_regex="^my-PrometheusAlertRule")
    pulumi.export("armsPrometheusAlertRuleId2", name_regex.rules[0].id)
    ```


    :param str cluster_id: The ID of the cluster.
    :param Sequence[str] ids: A list of Prometheus Alert Rule IDs.
    :param str name_regex: A regex string to filter results by Prometheus Alert Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int status: The status of the resource. Valid values: `0`, `1`.
    :param str type: The type of the alert rule.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['ids'] = ids
    __args__['matchExpressions'] = match_expressions
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['type'] = type
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:arms/getPrometheusAlertRules:getPrometheusAlertRules', __args__, opts=opts, typ=GetPrometheusAlertRulesResult).value

    return AwaitableGetPrometheusAlertRulesResult(
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        match_expressions=pulumi.get(__ret__, 'match_expressions'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        rules=pulumi.get(__ret__, 'rules'),
        status=pulumi.get(__ret__, 'status'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_prometheus_alert_rules)
def get_prometheus_alert_rules_output(cluster_id: Optional[pulumi.Input[str]] = None,
                                      ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                      match_expressions: Optional[pulumi.Input[Optional[str]]] = None,
                                      name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                      output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                      status: Optional[pulumi.Input[Optional[int]]] = None,
                                      type: Optional[pulumi.Input[Optional[str]]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrometheusAlertRulesResult]:
    """
    This data source provides the Arms Prometheus Alert Rules of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.arms.get_prometheus_alert_rules(cluster_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("armsPrometheusAlertRuleId1", ids.rules[0].id)
    name_regex = alicloud.arms.get_prometheus_alert_rules(cluster_id="example_value",
        name_regex="^my-PrometheusAlertRule")
    pulumi.export("armsPrometheusAlertRuleId2", name_regex.rules[0].id)
    ```


    :param str cluster_id: The ID of the cluster.
    :param Sequence[str] ids: A list of Prometheus Alert Rule IDs.
    :param str name_regex: A regex string to filter results by Prometheus Alert Rule name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param int status: The status of the resource. Valid values: `0`, `1`.
    :param str type: The type of the alert rule.
    """
    ...
