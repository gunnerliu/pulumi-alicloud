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
    'GetStaticAccountsResult',
    'AwaitableGetStaticAccountsResult',
    'get_static_accounts',
    'get_static_accounts_output',
]

@pulumi.output_type
class GetStaticAccountsResult:
    """
    A collection of values returned by getStaticAccounts.
    """
    def __init__(__self__, accounts=None, id=None, ids=None, instance_id=None, output_file=None):
        if accounts and not isinstance(accounts, list):
            raise TypeError("Expected argument 'accounts' to be a list")
        pulumi.set(__self__, "accounts", accounts)
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

    @property
    @pulumi.getter
    def accounts(self) -> Sequence['outputs.GetStaticAccountsAccountResult']:
        """
        A list of Static Account Entries. Each element contains the following attributes:
        """
        return pulumi.get(self, "accounts")

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
    def instance_id(self) -> Optional[str]:
        """
        Amqp instance ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetStaticAccountsResult(GetStaticAccountsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStaticAccountsResult(
            accounts=self.accounts,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            output_file=self.output_file)


def get_static_accounts(ids: Optional[Sequence[str]] = None,
                        instance_id: Optional[str] = None,
                        output_file: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStaticAccountsResult:
    """
    This data source provides Amqp Static Account available to the user.[What is Static Account](https://help.aliyun.com/document_detail/184399.html)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.amqp.get_static_accounts(instance_id="amqp-cn-0ju2y01zs001")
    pulumi.export("alicloudAmqpStaticAccountExampleId", default.accounts[0].id)
    ```


    :param Sequence[str] ids: The `key` of the resource supplied above.The value is formulated as `<instance_id>:<access_key>`.
    :param str instance_id: InstanceId
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:amqp/getStaticAccounts:getStaticAccounts', __args__, opts=opts, typ=GetStaticAccountsResult).value

    return AwaitableGetStaticAccountsResult(
        accounts=pulumi.get(__ret__, 'accounts'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_static_accounts)
def get_static_accounts_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               instance_id: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStaticAccountsResult]:
    """
    This data source provides Amqp Static Account available to the user.[What is Static Account](https://help.aliyun.com/document_detail/184399.html)

    > **NOTE:** Available in 1.195.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.amqp.get_static_accounts(instance_id="amqp-cn-0ju2y01zs001")
    pulumi.export("alicloudAmqpStaticAccountExampleId", default.accounts[0].id)
    ```


    :param Sequence[str] ids: The `key` of the resource supplied above.The value is formulated as `<instance_id>:<access_key>`.
    :param str instance_id: InstanceId
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
