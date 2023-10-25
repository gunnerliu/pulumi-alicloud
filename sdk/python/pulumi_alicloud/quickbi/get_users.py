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
    'GetUsersResult',
    'AwaitableGetUsersResult',
    'get_users',
    'get_users_output',
]

@pulumi.output_type
class GetUsersResult:
    """
    A collection of values returned by getUsers.
    """
    def __init__(__self__, enable_details=None, id=None, ids=None, keyword=None, output_file=None, users=None):
        if enable_details and not isinstance(enable_details, bool):
            raise TypeError("Expected argument 'enable_details' to be a bool")
        pulumi.set(__self__, "enable_details", enable_details)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="enableDetails")
    def enable_details(self) -> Optional[bool]:
        return pulumi.get(self, "enable_details")

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
    @pulumi.getter
    def keyword(self) -> Optional[str]:
        return pulumi.get(self, "keyword")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetUsersUserResult']:
        return pulumi.get(self, "users")


class AwaitableGetUsersResult(GetUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUsersResult(
            enable_details=self.enable_details,
            id=self.id,
            ids=self.ids,
            keyword=self.keyword,
            output_file=self.output_file,
            users=self.users)


def get_users(enable_details: Optional[bool] = None,
              ids: Optional[Sequence[str]] = None,
              keyword: Optional[str] = None,
              output_file: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUsersResult:
    """
    This data source provides the Quick BI Users of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of User IDs.
    :param str keyword: The keywords of the nicknames or usernames of the members of the organization.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['enableDetails'] = enable_details
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:quickbi/getUsers:getUsers', __args__, opts=opts, typ=GetUsersResult).value

    return AwaitableGetUsersResult(
        enable_details=pulumi.get(__ret__, 'enable_details'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        keyword=pulumi.get(__ret__, 'keyword'),
        output_file=pulumi.get(__ret__, 'output_file'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_users)
def get_users_output(enable_details: Optional[pulumi.Input[Optional[bool]]] = None,
                     ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                     keyword: Optional[pulumi.Input[Optional[str]]] = None,
                     output_file: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUsersResult]:
    """
    This data source provides the Quick BI Users of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.


    :param bool enable_details: Default to `false`. Set it to `true` can output more details about resource attributes.
    :param Sequence[str] ids: A list of User IDs.
    :param str keyword: The keywords of the nicknames or usernames of the members of the organization.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
