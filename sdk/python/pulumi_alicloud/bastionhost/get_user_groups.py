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
    'GetUserGroupsResult',
    'AwaitableGetUserGroupsResult',
    'get_user_groups',
    'get_user_groups_output',
]

@pulumi.output_type
class GetUserGroupsResult:
    """
    A collection of values returned by getUserGroups.
    """
    def __init__(__self__, groups=None, id=None, ids=None, instance_id=None, name_regex=None, names=None, output_file=None, user_group_name=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
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
        if user_group_name and not isinstance(user_group_name, str):
            raise TypeError("Expected argument 'user_group_name' to be a str")
        pulumi.set(__self__, "user_group_name", user_group_name)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetUserGroupsGroupResult']:
        return pulumi.get(self, "groups")

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
    @pulumi.getter(name="userGroupName")
    def user_group_name(self) -> Optional[str]:
        return pulumi.get(self, "user_group_name")


class AwaitableGetUserGroupsResult(GetUserGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserGroupsResult(
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            user_group_name=self.user_group_name)


def get_user_groups(ids: Optional[Sequence[str]] = None,
                    instance_id: Optional[str] = None,
                    name_regex: Optional[str] = None,
                    output_file: Optional[str] = None,
                    user_group_name: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserGroupsResult:
    """
    This data source provides the Bastionhost User Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_user_groups(instance_id="bastionhost-cn-xxxx",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostUserGroupId1", ids.groups[0].id)
    name_regex = alicloud.bastionhost.get_user_groups(instance_id="bastionhost-cn-xxxx",
        name_regex="^my-UserGroup")
    pulumi.export("bastionhostUserGroupId2", name_regex.groups[0].id)
    ```


    :param Sequence[str] ids: A list of User Group self IDs.
    :param str instance_id: Specify the New Group of the Bastion Host of Instance Id.
    :param str name_regex: A regex string to filter results by User Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str user_group_name: Specify the New Group Name. Supports up to 128 Characters.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['userGroupName'] = user_group_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:bastionhost/getUserGroups:getUserGroups', __args__, opts=opts, typ=GetUserGroupsResult).value

    return AwaitableGetUserGroupsResult(
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        user_group_name=pulumi.get(__ret__, 'user_group_name'))


@_utilities.lift_output_func(get_user_groups)
def get_user_groups_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                           instance_id: Optional[pulumi.Input[str]] = None,
                           name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                           output_file: Optional[pulumi.Input[Optional[str]]] = None,
                           user_group_name: Optional[pulumi.Input[Optional[str]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserGroupsResult]:
    """
    This data source provides the Bastionhost User Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.132.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.bastionhost.get_user_groups(instance_id="bastionhost-cn-xxxx",
        ids=[
            "1",
            "2",
        ])
    pulumi.export("bastionhostUserGroupId1", ids.groups[0].id)
    name_regex = alicloud.bastionhost.get_user_groups(instance_id="bastionhost-cn-xxxx",
        name_regex="^my-UserGroup")
    pulumi.export("bastionhostUserGroupId2", name_regex.groups[0].id)
    ```


    :param Sequence[str] ids: A list of User Group self IDs.
    :param str instance_id: Specify the New Group of the Bastion Host of Instance Id.
    :param str name_regex: A regex string to filter results by User Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str user_group_name: Specify the New Group Name. Supports up to 128 Characters.
    """
    ...
