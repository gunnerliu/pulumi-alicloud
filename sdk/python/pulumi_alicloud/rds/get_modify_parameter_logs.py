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
    'GetModifyParameterLogsResult',
    'AwaitableGetModifyParameterLogsResult',
    'get_modify_parameter_logs',
    'get_modify_parameter_logs_output',
]

@pulumi.output_type
class GetModifyParameterLogsResult:
    """
    A collection of values returned by getModifyParameterLogs.
    """
    def __init__(__self__, db_instance_id=None, end_time=None, id=None, logs=None, output_file=None, start_time=None):
        if db_instance_id and not isinstance(db_instance_id, str):
            raise TypeError("Expected argument 'db_instance_id' to be a str")
        pulumi.set(__self__, "db_instance_id", db_instance_id)
        if end_time and not isinstance(end_time, str):
            raise TypeError("Expected argument 'end_time' to be a str")
        pulumi.set(__self__, "end_time", end_time)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logs and not isinstance(logs, list):
            raise TypeError("Expected argument 'logs' to be a list")
        pulumi.set(__self__, "logs", logs)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if start_time and not isinstance(start_time, str):
            raise TypeError("Expected argument 'start_time' to be a str")
        pulumi.set(__self__, "start_time", start_time)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> str:
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="endTime")
    def end_time(self) -> str:
        return pulumi.get(self, "end_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def logs(self) -> Sequence['outputs.GetModifyParameterLogsLogResult']:
        return pulumi.get(self, "logs")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter(name="startTime")
    def start_time(self) -> str:
        return pulumi.get(self, "start_time")


class AwaitableGetModifyParameterLogsResult(GetModifyParameterLogsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetModifyParameterLogsResult(
            db_instance_id=self.db_instance_id,
            end_time=self.end_time,
            id=self.id,
            logs=self.logs,
            output_file=self.output_file,
            start_time=self.start_time)


def get_modify_parameter_logs(db_instance_id: Optional[str] = None,
                              end_time: Optional[str] = None,
                              output_file: Optional[str] = None,
                              start_time: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetModifyParameterLogsResult:
    """
    This data source provides the Rds Modify Parameter Logs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.174.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.rds.get_modify_parameter_logs(db_instance_id="example_value",
        end_time="2022-06-08T13:56Z",
        start_time="2022-06-04T13:56Z")
    ```


    :param str db_instance_id: The db instance id.
    :param str end_time: The end time.
    :param str start_time: The start time.
    """
    __args__ = dict()
    __args__['dbInstanceId'] = db_instance_id
    __args__['endTime'] = end_time
    __args__['outputFile'] = output_file
    __args__['startTime'] = start_time
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:rds/getModifyParameterLogs:getModifyParameterLogs', __args__, opts=opts, typ=GetModifyParameterLogsResult).value

    return AwaitableGetModifyParameterLogsResult(
        db_instance_id=__ret__.db_instance_id,
        end_time=__ret__.end_time,
        id=__ret__.id,
        logs=__ret__.logs,
        output_file=__ret__.output_file,
        start_time=__ret__.start_time)


@_utilities.lift_output_func(get_modify_parameter_logs)
def get_modify_parameter_logs_output(db_instance_id: Optional[pulumi.Input[str]] = None,
                                     end_time: Optional[pulumi.Input[str]] = None,
                                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                     start_time: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetModifyParameterLogsResult]:
    """
    This data source provides the Rds Modify Parameter Logs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.174.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.rds.get_modify_parameter_logs(db_instance_id="example_value",
        end_time="2022-06-08T13:56Z",
        start_time="2022-06-04T13:56Z")
    ```


    :param str db_instance_id: The db instance id.
    :param str end_time: The end time.
    :param str start_time: The start time.
    """
    ...
