# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetAlarmsResult',
    'AwaitableGetAlarmsResult',
    'get_alarms',
]

@pulumi.output_type
class GetAlarmsResult:
    """
    A collection of values returned by getAlarms.
    """
    def __init__(__self__, alarms=None, id=None, ids=None, metric_type=None, name_regex=None, names=None, output_file=None, scaling_group_id=None):
        if alarms and not isinstance(alarms, list):
            raise TypeError("Expected argument 'alarms' to be a list")
        pulumi.set(__self__, "alarms", alarms)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if metric_type and not isinstance(metric_type, str):
            raise TypeError("Expected argument 'metric_type' to be a str")
        pulumi.set(__self__, "metric_type", metric_type)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if scaling_group_id and not isinstance(scaling_group_id, str):
            raise TypeError("Expected argument 'scaling_group_id' to be a str")
        pulumi.set(__self__, "scaling_group_id", scaling_group_id)

    @property
    @pulumi.getter
    def alarms(self) -> Sequence['outputs.GetAlarmsAlarmResult']:
        """
        A list of alarms. Each element contains the following attributes:
        """
        return pulumi.get(self, "alarms")

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
        A list of alarm ids.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="metricType")
    def metric_type(self) -> Optional[str]:
        """
        The type for the alarm's associated metric.
        """
        return pulumi.get(self, "metric_type")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of alarm names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[str]:
        """
        The scaling group associated with this alarm.
        """
        return pulumi.get(self, "scaling_group_id")


class AwaitableGetAlarmsResult(GetAlarmsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAlarmsResult(
            alarms=self.alarms,
            id=self.id,
            ids=self.ids,
            metric_type=self.metric_type,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            scaling_group_id=self.scaling_group_id)


def get_alarms(ids: Optional[Sequence[str]] = None,
               metric_type: Optional[str] = None,
               name_regex: Optional[str] = None,
               output_file: Optional[str] = None,
               scaling_group_id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAlarmsResult:
    """
    This data source provides available alarm resources.

    > **NOTE** Available in 1.72.0+


    :param Sequence[str] ids: A list of alarm IDs.
    :param str metric_type: The type for the alarm's associated metric. Supported value: system, custom. "system" means the metric data is collected by Aliyun Cloud Monitor Service(CMS), "custom" means the metric data is upload to CMS by users. Defaults to system.
    :param str name_regex: A regex string to filter resulting alarms by name.
    :param str scaling_group_id: Scaling group id the alarms belong to.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['metricType'] = metric_type
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['scalingGroupId'] = scaling_group_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ess/getAlarms:getAlarms', __args__, opts=opts, typ=GetAlarmsResult).value

    return AwaitableGetAlarmsResult(
        alarms=__ret__.alarms,
        id=__ret__.id,
        ids=__ret__.ids,
        metric_type=__ret__.metric_type,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        scaling_group_id=__ret__.scaling_group_id)
