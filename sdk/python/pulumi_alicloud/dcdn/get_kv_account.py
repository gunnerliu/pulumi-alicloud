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
    'GetKvAccountResult',
    'AwaitableGetKvAccountResult',
    'get_kv_account',
    'get_kv_account_output',
]

@pulumi.output_type
class GetKvAccountResult:
    """
    A collection of values returned by getKvAccount.
    """
    def __init__(__self__, id=None, status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

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
        The current kv account enable status.
        """
        return pulumi.get(self, "status")


class AwaitableGetKvAccountResult(GetKvAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKvAccountResult(
            id=self.id,
            status=self.status)


def get_kv_account(status: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKvAccountResult:
    """
    This data source provides DCDN kv account available to the user.[What is DCDN Kv Account](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-describedcdnkvaccount)

    > **NOTE:** Available since v1.198.0.


    :param str status: The status of the KV feature for your account. Valid values: `online`, `offline`.
    """
    __args__ = dict()
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:dcdn/getKvAccount:getKvAccount', __args__, opts=opts, typ=GetKvAccountResult).value

    return AwaitableGetKvAccountResult(
        id=pulumi.get(__ret__, 'id'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_kv_account)
def get_kv_account_output(status: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKvAccountResult]:
    """
    This data source provides DCDN kv account available to the user.[What is DCDN Kv Account](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-describedcdnkvaccount)

    > **NOTE:** Available since v1.198.0.


    :param str status: The status of the KV feature for your account. Valid values: `online`, `offline`.
    """
    ...
