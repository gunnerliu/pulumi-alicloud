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
    'GetLogConfigsResult',
    'AwaitableGetLogConfigsResult',
    'get_log_configs',
    'get_log_configs_output',
]

@pulumi.output_type
class GetLogConfigsResult:
    """
    A collection of values returned by getLogConfigs.
    """
    def __init__(__self__, configs=None, id=None, ids=None, log_type=None, output_file=None):
        if configs and not isinstance(configs, list):
            raise TypeError("Expected argument 'configs' to be a list")
        pulumi.set(__self__, "configs", configs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if log_type and not isinstance(log_type, str):
            raise TypeError("Expected argument 'log_type' to be a str")
        pulumi.set(__self__, "log_type", log_type)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def configs(self) -> Sequence['outputs.GetLogConfigsConfigResult']:
        return pulumi.get(self, "configs")

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
    @pulumi.getter(name="logType")
    def log_type(self) -> Optional[str]:
        return pulumi.get(self, "log_type")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetLogConfigsResult(GetLogConfigsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLogConfigsResult(
            configs=self.configs,
            id=self.id,
            ids=self.ids,
            log_type=self.log_type,
            output_file=self.output_file)


def get_log_configs(ids: Optional[Sequence[str]] = None,
                    log_type: Optional[str] = None,
                    output_file: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLogConfigsResult:
    """
    This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.185.0+.


    :param Sequence[str] ids: A list of Log Config IDs.
    :param str log_type: The type the of log.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['logType'] = log_type
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:apigateway/getLogConfigs:getLogConfigs', __args__, opts=opts, typ=GetLogConfigsResult).value

    return AwaitableGetLogConfigsResult(
        configs=pulumi.get(__ret__, 'configs'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        log_type=pulumi.get(__ret__, 'log_type'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_log_configs)
def get_log_configs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           log_type: Optional[pulumi.Input[Optional[str]]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLogConfigsResult]:
    """
    This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.185.0+.


    :param Sequence[str] ids: A list of Log Config IDs.
    :param str log_type: The type the of log.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
