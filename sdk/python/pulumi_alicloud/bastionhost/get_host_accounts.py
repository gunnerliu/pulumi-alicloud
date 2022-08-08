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
    'GetHostAccountsResult',
    'AwaitableGetHostAccountsResult',
    'get_host_accounts',
    'get_host_accounts_output',
]

@pulumi.output_type
class GetHostAccountsResult:
    """
    A collection of values returned by getHostAccounts.
    """
    def __init__(__self__, accounts=None, host_account_name=None, host_id=None, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, protocol_name=None):
        if accounts and not isinstance(accounts, list):
            raise TypeError("Expected argument 'accounts' to be a list")
        pulumi.set(__self__, "accounts", accounts)
        if host_account_name and not isinstance(host_account_name, str):
            raise TypeError("Expected argument 'host_account_name' to be a str")
        pulumi.set(__self__, "host_account_name", host_account_name)
        if host_id and not isinstance(host_id, str):
            raise TypeError("Expected argument 'host_id' to be a str")
        pulumi.set(__self__, "host_id", host_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if protocol_name and not isinstance(protocol_name, str):
            raise TypeError("Expected argument 'protocol_name' to be a str")
        pulumi.set(__self__, "protocol_name", protocol_name)

    @property
    @pulumi.getter
    def accounts(self) -> Sequence['outputs.GetHostAccountsAccountResult']:
        return pulumi.get(self, "accounts")

    @property
    @pulumi.getter(name="hostAccountName")
    def host_account_name(self) -> Optional[str]:
        return pulumi.get(self, "host_account_name")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        return pulumi.get(self, "host_id")

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
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> Optional[str]:
        return pulumi.get(self, "protocol_name")


class AwaitableGetHostAccountsResult(GetHostAccountsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHostAccountsResult(
            accounts=self.accounts,
            host_account_name=self.host_account_name,
            host_id=self.host_id,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            protocol_name=self.protocol_name)


def get_host_accounts(host_account_name: Optional[str] = None,
                      host_id: Optional[str] = None,
                      ids: Optional[Sequence[str]] = None,
                      instance_id: Optional[str] = None,
                      name_regex: Optional[str] = None,
                      output_file: Optional[str] = None,
                      protocol_name: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHostAccountsResult:
    """
    This data source provides the Bastionhost Host Accounts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_host_accounts(host_id="15",
        instance_id="example_value",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostHostAccountId1", ids.accounts[0].id)
    name_regex = alicloud.bastionhost.get_host_accounts(host_id="15",
        instance_id="example_value",
        name_regex="^my-HostAccount")
    pulumi.export("bastionhostHostAccountId2", name_regex.accounts[0].id)
    ```


    :param str host_account_name: Specify the new hosting account's name, support the longest 128 characters.
    :param str host_id: Specifies the database where you want to create your hosting account's host ID.
    :param Sequence[str] ids: A list of Host Account IDs.
    :param str instance_id: Specifies the database where you want to create your hosting account's host bastion host ID of.
    :param str name_regex: A regex string to filter results by Host Account name.
    :param str protocol_name: Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
    """
    __args__ = dict()
    __args__['hostAccountName'] = host_account_name
    __args__['hostId'] = host_id
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['protocolName'] = protocol_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:bastionhost/getHostAccounts:getHostAccounts', __args__, opts=opts, typ=GetHostAccountsResult).value

    return AwaitableGetHostAccountsResult(
        accounts=__ret__.accounts,
        host_account_name=__ret__.host_account_name,
        host_id=__ret__.host_id,
        id=__ret__.id,
        ids=__ret__.ids,
        instance_id=__ret__.instance_id,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        protocol_name=__ret__.protocol_name)


@_utilities.lift_output_func(get_host_accounts)
def get_host_accounts_output(host_account_name: Optional[pulumi.Input[Optional[str]]] = None,
                             host_id: Optional[pulumi.Input[str]] = None,
                             ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                             instance_id: Optional[pulumi.Input[str]] = None,
                             name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             protocol_name: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHostAccountsResult]:
    """
    This data source provides the Bastionhost Host Accounts of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.135.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_host_accounts(host_id="15",
        instance_id="example_value",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostHostAccountId1", ids.accounts[0].id)
    name_regex = alicloud.bastionhost.get_host_accounts(host_id="15",
        instance_id="example_value",
        name_regex="^my-HostAccount")
    pulumi.export("bastionhostHostAccountId2", name_regex.accounts[0].id)
    ```


    :param str host_account_name: Specify the new hosting account's name, support the longest 128 characters.
    :param str host_id: Specifies the database where you want to create your hosting account's host ID.
    :param Sequence[str] ids: A list of Host Account IDs.
    :param str instance_id: Specifies the database where you want to create your hosting account's host bastion host ID of.
    :param str name_regex: A regex string to filter results by Host Account name.
    :param str protocol_name: Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
    """
    ...
