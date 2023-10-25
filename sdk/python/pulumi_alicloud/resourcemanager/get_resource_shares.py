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
    'GetResourceSharesResult',
    'AwaitableGetResourceSharesResult',
    'get_resource_shares',
    'get_resource_shares_output',
]

@pulumi.output_type
class GetResourceSharesResult:
    """
    A collection of values returned by getResourceShares.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, resource_share_name=None, resource_share_owner=None, shares=None, status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if resource_share_name and not isinstance(resource_share_name, str):
            raise TypeError("Expected argument 'resource_share_name' to be a str")
        pulumi.set(__self__, "resource_share_name", resource_share_name)
        if resource_share_owner and not isinstance(resource_share_owner, str):
            raise TypeError("Expected argument 'resource_share_owner' to be a str")
        pulumi.set(__self__, "resource_share_owner", resource_share_owner)
        if shares and not isinstance(shares, list):
            raise TypeError("Expected argument 'shares' to be a list")
        pulumi.set(__self__, "shares", shares)
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
    def ids(self) -> Sequence[str]:
        return pulumi.get(self, "ids")

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
    @pulumi.getter(name="resourceShareName")
    def resource_share_name(self) -> Optional[str]:
        return pulumi.get(self, "resource_share_name")

    @property
    @pulumi.getter(name="resourceShareOwner")
    def resource_share_owner(self) -> str:
        return pulumi.get(self, "resource_share_owner")

    @property
    @pulumi.getter
    def shares(self) -> Sequence['outputs.GetResourceSharesShareResult']:
        return pulumi.get(self, "shares")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetResourceSharesResult(GetResourceSharesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResourceSharesResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            resource_share_name=self.resource_share_name,
            resource_share_owner=self.resource_share_owner,
            shares=self.shares,
            status=self.status)


def get_resource_shares(ids: Optional[Sequence[str]] = None,
                        name_regex: Optional[str] = None,
                        output_file: Optional[str] = None,
                        resource_share_name: Optional[str] = None,
                        resource_share_owner: Optional[str] = None,
                        status: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResourceSharesResult:
    """
    This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.111.0+.


    :param Sequence[str] ids: A list of Resource Share IDs.
    :param str name_regex: A regex string to filter results by Resource Share name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_share_name: The name of resource share.
    :param str resource_share_owner: The owner of resource share.
    :param str status: The status of resource share.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['resourceShareName'] = resource_share_name
    __args__['resourceShareOwner'] = resource_share_owner
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:resourcemanager/getResourceShares:getResourceShares', __args__, opts=opts, typ=GetResourceSharesResult).value

    return AwaitableGetResourceSharesResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        resource_share_name=pulumi.get(__ret__, 'resource_share_name'),
        resource_share_owner=pulumi.get(__ret__, 'resource_share_owner'),
        shares=pulumi.get(__ret__, 'shares'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_resource_shares)
def get_resource_shares_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                               name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                               output_file: Optional[pulumi.Input[Optional[str]]] = None,
                               resource_share_name: Optional[pulumi.Input[Optional[str]]] = None,
                               resource_share_owner: Optional[pulumi.Input[str]] = None,
                               status: Optional[pulumi.Input[Optional[str]]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResourceSharesResult]:
    """
    This data source provides the Resource Manager Resource Shares of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.111.0+.


    :param Sequence[str] ids: A list of Resource Share IDs.
    :param str name_regex: A regex string to filter results by Resource Share name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str resource_share_name: The name of resource share.
    :param str resource_share_owner: The owner of resource share.
    :param str status: The status of resource share.
    """
    ...
