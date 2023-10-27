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
    'GetEnterpriseUsersResult',
    'AwaitableGetEnterpriseUsersResult',
    'get_enterprise_users',
    'get_enterprise_users_output',
]

@pulumi.output_type
class GetEnterpriseUsersResult:
    """
    A collection of values returned by getEnterpriseUsers.
    """
    def __init__(__self__, id=None, ids=None, name_regex=None, names=None, output_file=None, role=None, search_key=None, status=None, tid=None, users=None):
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
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if search_key and not isinstance(search_key, str):
            raise TypeError("Expected argument 'search_key' to be a str")
        pulumi.set(__self__, "search_key", search_key)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if tid and not isinstance(tid, int):
            raise TypeError("Expected argument 'tid' to be a int")
        pulumi.set(__self__, "tid", tid)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)

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
        A list of DMS Enterprise User IDs (UID).
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of DMS Enterprise User names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def role(self) -> Optional[str]:
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="searchKey")
    def search_key(self) -> Optional[str]:
        return pulumi.get(self, "search_key")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the user.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tid(self) -> Optional[int]:
        return pulumi.get(self, "tid")

    @property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetEnterpriseUsersUserResult']:
        """
        A list of DMS Enterprise Users. Each element contains the following attributes:
        """
        return pulumi.get(self, "users")


class AwaitableGetEnterpriseUsersResult(GetEnterpriseUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEnterpriseUsersResult(
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            role=self.role,
            search_key=self.search_key,
            status=self.status,
            tid=self.tid,
            users=self.users)


def get_enterprise_users(ids: Optional[Sequence[str]] = None,
                         name_regex: Optional[str] = None,
                         output_file: Optional[str] = None,
                         role: Optional[str] = None,
                         search_key: Optional[str] = None,
                         status: Optional[str] = None,
                         tid: Optional[int] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEnterpriseUsersResult:
    """
    This data source provides a list of DMS Enterprise Users in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.90.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    dms_enterprise_users_ds = alicloud.dms.get_enterprise_users(ids=["uid"],
        role="USER",
        status="NORMAL")
    pulumi.export("firstUserId", dms_enterprise_users_ds.users[0].id)
    ```


    :param Sequence[str] ids: A list of DMS Enterprise User IDs (UID).
    :param str name_regex: A regex string to filter the results by the DMS Enterprise User nick_name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: The role of the user to query.
    :param str search_key: The keyword used to query users.
    :param str status: The status of the user.
    :param int tid: The ID of the tenant in DMS Enterprise.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['role'] = role
    __args__['searchKey'] = search_key
    __args__['status'] = status
    __args__['tid'] = tid
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:dms/getEnterpriseUsers:getEnterpriseUsers', __args__, opts=opts, typ=GetEnterpriseUsersResult).value

    return AwaitableGetEnterpriseUsersResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        role=pulumi.get(__ret__, 'role'),
        search_key=pulumi.get(__ret__, 'search_key'),
        status=pulumi.get(__ret__, 'status'),
        tid=pulumi.get(__ret__, 'tid'),
        users=pulumi.get(__ret__, 'users'))


@_utilities.lift_output_func(get_enterprise_users)
def get_enterprise_users_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                role: Optional[pulumi.Input[Optional[str]]] = None,
                                search_key: Optional[pulumi.Input[Optional[str]]] = None,
                                status: Optional[pulumi.Input[Optional[str]]] = None,
                                tid: Optional[pulumi.Input[Optional[int]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEnterpriseUsersResult]:
    """
    This data source provides a list of DMS Enterprise Users in an Alibaba Cloud account according to the specified filters.

    > **NOTE:** Available in 1.90.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    dms_enterprise_users_ds = alicloud.dms.get_enterprise_users(ids=["uid"],
        role="USER",
        status="NORMAL")
    pulumi.export("firstUserId", dms_enterprise_users_ds.users[0].id)
    ```


    :param Sequence[str] ids: A list of DMS Enterprise User IDs (UID).
    :param str name_regex: A regex string to filter the results by the DMS Enterprise User nick_name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str role: The role of the user to query.
    :param str search_key: The keyword used to query users.
    :param str status: The status of the user.
    :param int tid: The ID of the tenant in DMS Enterprise.
    """
    ...
