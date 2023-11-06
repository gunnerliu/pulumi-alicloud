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
    'GetAccessGroupsResult',
    'AwaitableGetAccessGroupsResult',
    'get_access_groups',
    'get_access_groups_output',
]

@pulumi.output_type
class GetAccessGroupsResult:
    """
    A collection of values returned by getAccessGroups.
    """
    def __init__(__self__, access_group_name=None, access_group_type=None, description=None, file_system_type=None, groups=None, id=None, ids=None, name_regex=None, names=None, output_file=None, type=None, useutc_date_time=None):
        if access_group_name and not isinstance(access_group_name, str):
            raise TypeError("Expected argument 'access_group_name' to be a str")
        pulumi.set(__self__, "access_group_name", access_group_name)
        if access_group_type and not isinstance(access_group_type, str):
            raise TypeError("Expected argument 'access_group_type' to be a str")
        pulumi.set(__self__, "access_group_type", access_group_type)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if file_system_type and not isinstance(file_system_type, str):
            raise TypeError("Expected argument 'file_system_type' to be a str")
        pulumi.set(__self__, "file_system_type", file_system_type)
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
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
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if useutc_date_time and not isinstance(useutc_date_time, bool):
            raise TypeError("Expected argument 'useutc_date_time' to be a bool")
        pulumi.set(__self__, "useutc_date_time", useutc_date_time)

    @property
    @pulumi.getter(name="accessGroupName")
    def access_group_name(self) -> Optional[str]:
        """
        (Available in 1.95.0+) The name of the AccessGroup.
        """
        return pulumi.get(self, "access_group_name")

    @property
    @pulumi.getter(name="accessGroupType")
    def access_group_type(self) -> Optional[str]:
        """
        (Available in 1.95.0+) The type of the AccessGroup.
        """
        return pulumi.get(self, "access_group_type")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Description of the AccessGroup.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="fileSystemType")
    def file_system_type(self) -> Optional[str]:
        return pulumi.get(self, "file_system_type")

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetAccessGroupsGroupResult']:
        """
        A list of AccessGroups. Each element contains the following attributes:
        """
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
        """
        A list of AccessGroup IDs, the value is set to `names`. After version 1.95.0 the item value as `<access_group_id>:<file_system_type>`.
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
        A list of AccessGroup names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        (Deprecated in v1.95.0+) AccessGroupType of the AccessGroup. The Field replace by `access_group_type` after version 1.95.0.
        """
        warnings.warn("""Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.""", DeprecationWarning)
        pulumi.log.warn("""type is deprecated: Field 'type' has been deprecated from provider version 1.95.0. New field 'access_group_type' replaces it.""")

        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="useutcDateTime")
    def useutc_date_time(self) -> Optional[bool]:
        return pulumi.get(self, "useutc_date_time")


class AwaitableGetAccessGroupsResult(GetAccessGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccessGroupsResult(
            access_group_name=self.access_group_name,
            access_group_type=self.access_group_type,
            description=self.description,
            file_system_type=self.file_system_type,
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            type=self.type,
            useutc_date_time=self.useutc_date_time)


def get_access_groups(access_group_name: Optional[str] = None,
                      access_group_type: Optional[str] = None,
                      description: Optional[str] = None,
                      file_system_type: Optional[str] = None,
                      name_regex: Optional[str] = None,
                      output_file: Optional[str] = None,
                      type: Optional[str] = None,
                      useutc_date_time: Optional[bool] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccessGroupsResult:
    """
    This data source provides user-available access groups. Use when you can create mount points

    > NOTE: Available in 1.35.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.nas.get_access_groups(name_regex="^foo",
        access_group_type="Classic",
        description="tf-testAccAccessGroupsdatasource")
    pulumi.export("alicloudNasAccessGroupsId", example.groups[0].id)
    ```


    :param str access_group_name: The name of access group.
    :param str access_group_type: Filter results by a specific AccessGroupType.
    :param str description: Filter results by a specific Description.
    :param str file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
    :param str name_regex: A regex string to filter AccessGroups by name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str type: Field `type` has been deprecated from version 1.95.0. Use `access_group_type` instead.
    :param bool useutc_date_time: Specifies whether the time to return is in UTC. Valid values: true and false.
    """
    __args__ = dict()
    __args__['accessGroupName'] = access_group_name
    __args__['accessGroupType'] = access_group_type
    __args__['description'] = description
    __args__['fileSystemType'] = file_system_type
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['type'] = type
    __args__['useutcDateTime'] = useutc_date_time
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:nas/getAccessGroups:getAccessGroups', __args__, opts=opts, typ=GetAccessGroupsResult).value

    return AwaitableGetAccessGroupsResult(
        access_group_name=pulumi.get(__ret__, 'access_group_name'),
        access_group_type=pulumi.get(__ret__, 'access_group_type'),
        description=pulumi.get(__ret__, 'description'),
        file_system_type=pulumi.get(__ret__, 'file_system_type'),
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        type=pulumi.get(__ret__, 'type'),
        useutc_date_time=pulumi.get(__ret__, 'useutc_date_time'))


@_utilities.lift_output_func(get_access_groups)
def get_access_groups_output(access_group_name: Optional[pulumi.Input[Optional[str]]] = None,
                             access_group_type: Optional[pulumi.Input[Optional[str]]] = None,
                             description: Optional[pulumi.Input[Optional[str]]] = None,
                             file_system_type: Optional[pulumi.Input[Optional[str]]] = None,
                             name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                             output_file: Optional[pulumi.Input[Optional[str]]] = None,
                             type: Optional[pulumi.Input[Optional[str]]] = None,
                             useutc_date_time: Optional[pulumi.Input[Optional[bool]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAccessGroupsResult]:
    """
    This data source provides user-available access groups. Use when you can create mount points

    > NOTE: Available in 1.35.0+

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.nas.get_access_groups(name_regex="^foo",
        access_group_type="Classic",
        description="tf-testAccAccessGroupsdatasource")
    pulumi.export("alicloudNasAccessGroupsId", example.groups[0].id)
    ```


    :param str access_group_name: The name of access group.
    :param str access_group_type: Filter results by a specific AccessGroupType.
    :param str description: Filter results by a specific Description.
    :param str file_system_type: The type of file system. Valid values: `standard` and `extreme`. Default to `standard`.
    :param str name_regex: A regex string to filter AccessGroups by name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str type: Field `type` has been deprecated from version 1.95.0. Use `access_group_type` instead.
    :param bool useutc_date_time: Specifies whether the time to return is in UTC. Valid values: true and false.
    """
    ...
