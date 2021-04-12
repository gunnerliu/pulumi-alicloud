# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = [
    'GetAccountAliasesResult',
    'AwaitableGetAccountAliasesResult',
    'get_account_aliases',
]

@pulumi.output_type
class GetAccountAliasesResult:
    """
    A collection of values returned by getAccountAliases.
    """
    def __init__(__self__, account_alias=None, id=None, output_file=None):
        if account_alias and not isinstance(account_alias, str):
            raise TypeError("Expected argument 'account_alias' to be a str")
        pulumi.set(__self__, "account_alias", account_alias)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter(name="accountAlias")
    def account_alias(self) -> str:
        """
        Alias of the account.
        """
        return pulumi.get(self, "account_alias")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetAccountAliasesResult(GetAccountAliasesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountAliasesResult(
            account_alias=self.account_alias,
            id=self.id,
            output_file=self.output_file)


def get_account_aliases(output_file: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountAliasesResult:
    """
    This data source provides an alias for the Alibaba Cloud account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    alias_ds = alicloud.ram.get_account_aliases(output_file="alias.txt")
    pulumi.export("accountAlias", alias_ds.account_alias)
    ```
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:ram/getAccountAliases:getAccountAliases', __args__, opts=opts, typ=GetAccountAliasesResult).value

    return AwaitableGetAccountAliasesResult(
        account_alias=__ret__.account_alias,
        id=__ret__.id,
        output_file=__ret__.output_file)
