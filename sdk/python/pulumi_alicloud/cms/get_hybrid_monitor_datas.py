# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetHybridMonitorDatasResult',
    'AwaitableGetHybridMonitorDatasResult',
    'get_hybrid_monitor_datas',
    'get_hybrid_monitor_datas_output',
]

@pulumi.output_type
class GetHybridMonitorDatasResult:
    """
    A collection of values returned by getHybridMonitorDatas.
    """
    def __init__(__self__, datas=None, end=None, id=None, namespace=None, output_file=None, period=None, prom_sql=None, start=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if end and not isinstance(end, str):
            raise TypeError("Expected argument 'end' to be a str")
        pulumi.set(__self__, "end", end)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if namespace and not isinstance(namespace, str):
            raise TypeError("Expected argument 'namespace' to be a str")
        pulumi.set(__self__, "namespace", namespace)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if period and not isinstance(period, str):
            raise TypeError("Expected argument 'period' to be a str")
        pulumi.set(__self__, "period", period)
        if prom_sql and not isinstance(prom_sql, str):
            raise TypeError("Expected argument 'prom_sql' to be a str")
        pulumi.set(__self__, "prom_sql", prom_sql)
        if start and not isinstance(start, str):
            raise TypeError("Expected argument 'start' to be a str")
        pulumi.set(__self__, "start", start)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetHybridMonitorDatasDataResult']:
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def end(self) -> str:
        return pulumi.get(self, "end")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def namespace(self) -> str:
        return pulumi.get(self, "namespace")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def period(self) -> Optional[str]:
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="promSql")
    def prom_sql(self) -> str:
        return pulumi.get(self, "prom_sql")

    @property
    @pulumi.getter
    def start(self) -> str:
        return pulumi.get(self, "start")


class AwaitableGetHybridMonitorDatasResult(GetHybridMonitorDatasResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHybridMonitorDatasResult(
            datas=self.datas,
            end=self.end,
            id=self.id,
            namespace=self.namespace,
            output_file=self.output_file,
            period=self.period,
            prom_sql=self.prom_sql,
            start=self.start)


def get_hybrid_monitor_datas(end: Optional[str] = None,
                             namespace: Optional[str] = None,
                             output_file: Optional[str] = None,
                             period: Optional[str] = None,
                             prom_sql: Optional[str] = None,
                             start: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHybridMonitorDatasResult:
    """
    This data source provides the Cms Hybrid Monitor Datas of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.177.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cms.get_hybrid_monitor_datas(namespace="example_value",
        prom_sql="AliyunEcs_cpu_total",
        start="1657505665",
        end="1657520065")
    pulumi.export("cmsMetricRuleTemplateId1", default.datas[0])
    ```


    :param str end: The timestamp that specifies the end of the time range to query.
    :param str namespace: The name of the namespace.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str period: The interval at which monitoring data is collected. Unit: seconds.
    :param str prom_sql: The name of the metric. Note PromQL statements are supported.
    :param str start: The timestamp that specifies the beginning of the time range to query.
    """
    __args__ = dict()
    __args__['end'] = end
    __args__['namespace'] = namespace
    __args__['outputFile'] = output_file
    __args__['period'] = period
    __args__['promSql'] = prom_sql
    __args__['start'] = start
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cms/getHybridMonitorDatas:getHybridMonitorDatas', __args__, opts=opts, typ=GetHybridMonitorDatasResult).value

    return AwaitableGetHybridMonitorDatasResult(
        datas=pulumi.get(__ret__, 'datas'),
        end=pulumi.get(__ret__, 'end'),
        id=pulumi.get(__ret__, 'id'),
        namespace=pulumi.get(__ret__, 'namespace'),
        output_file=pulumi.get(__ret__, 'output_file'),
        period=pulumi.get(__ret__, 'period'),
        prom_sql=pulumi.get(__ret__, 'prom_sql'),
        start=pulumi.get(__ret__, 'start'))


@_utilities.lift_output_func(get_hybrid_monitor_datas)
def get_hybrid_monitor_datas_output(end: Optional[pulumi.Input[str]] = None,
                                    namespace: Optional[pulumi.Input[str]] = None,
                                    output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                    period: Optional[pulumi.Input[Optional[str]]] = None,
                                    prom_sql: Optional[pulumi.Input[str]] = None,
                                    start: Optional[pulumi.Input[str]] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHybridMonitorDatasResult]:
    """
    This data source provides the Cms Hybrid Monitor Datas of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.177.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.cms.get_hybrid_monitor_datas(namespace="example_value",
        prom_sql="AliyunEcs_cpu_total",
        start="1657505665",
        end="1657520065")
    pulumi.export("cmsMetricRuleTemplateId1", default.datas[0])
    ```


    :param str end: The timestamp that specifies the end of the time range to query.
    :param str namespace: The name of the namespace.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str period: The interval at which monitoring data is collected. Unit: seconds.
    :param str prom_sql: The name of the metric. Note PromQL statements are supported.
    :param str start: The timestamp that specifies the beginning of the time range to query.
    """
    ...
