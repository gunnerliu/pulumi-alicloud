# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
    'get_service_output',
]

@pulumi.output_type
class GetServiceResult:
    """
    A collection of values returned by getService.
    """
    def __init__(__self__, enable=None, id=None, status=None):
        if enable and not isinstance(enable, str):
            raise TypeError("Expected argument 'enable' to be a str")
        pulumi.set(__self__, "enable", enable)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def enable(self) -> Optional[str]:
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The current service enable status.
        """
        return pulumi.get(self, "status")


class AwaitableGetServiceResult(GetServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceResult(
            enable=self.enable,
            id=self.id,
            status=self.status)


def get_service(enable: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    Using this data source can open Privatelink service automatically. If the service has been opened, it will return opened.

    For information about Privatelink and how to use it, see [What is Privatelink](https://www.alibabacloud.com/help/en/product/120462.htm).

    > **NOTE:** Available in v1.113.0+


    :param str enable: Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
           
           > **NOTE:** Setting `enable = "On"` to open the Privatelink service that means you have read and agreed the [Privatelink Terms of Service](https://help.aliyun.com/document_detail/197619.html). The service can not closed once it is opened.
    """
    __args__ = dict()
    __args__['enable'] = enable
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:privatelink/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        enable=pulumi.get(__ret__, 'enable'),
        id=pulumi.get(__ret__, 'id'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_service)
def get_service_output(enable: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceResult]:
    """
    Using this data source can open Privatelink service automatically. If the service has been opened, it will return opened.

    For information about Privatelink and how to use it, see [What is Privatelink](https://www.alibabacloud.com/help/en/product/120462.htm).

    > **NOTE:** Available in v1.113.0+


    :param str enable: Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
           
           > **NOTE:** Setting `enable = "On"` to open the Privatelink service that means you have read and agreed the [Privatelink Terms of Service](https://help.aliyun.com/document_detail/197619.html). The service can not closed once it is opened.
    """
    ...
