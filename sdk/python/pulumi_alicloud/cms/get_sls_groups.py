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
    'GetSlsGroupsResult',
    'AwaitableGetSlsGroupsResult',
    'get_sls_groups',
    'get_sls_groups_output',
]

@pulumi.output_type
class GetSlsGroupsResult:
    """
    A collection of values returned by getSlsGroups.
    """
    def __init__(__self__, groups=None, id=None, ids=None, keyword=None, name_regex=None, names=None, output_file=None, page_number=None, page_size=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if keyword and not isinstance(keyword, str):
            raise TypeError("Expected argument 'keyword' to be a str")
        pulumi.set(__self__, "keyword", keyword)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetSlsGroupsGroupResult']:
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
    @pulumi.getter
    def keyword(self) -> Optional[str]:
        return pulumi.get(self, "keyword")

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
    @pulumi.getter(name="pageNumber")
    def page_number(self) -> Optional[int]:
        return pulumi.get(self, "page_number")

    @property
    @pulumi.getter(name="pageSize")
    def page_size(self) -> Optional[int]:
        return pulumi.get(self, "page_size")


class AwaitableGetSlsGroupsResult(GetSlsGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSlsGroupsResult(
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            keyword=self.keyword,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size)


def get_sls_groups(ids: Optional[Sequence[str]] = None,
                   keyword: Optional[str] = None,
                   name_regex: Optional[str] = None,
                   output_file: Optional[str] = None,
                   page_number: Optional[int] = None,
                   page_size: Optional[int] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSlsGroupsResult:
    """
    This data source provides the Cms Sls Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.171.0+.


    :param Sequence[str] ids: A list of Sls Group IDs. Its element value is same as Sls Group Name.
    :param str keyword: The keywords of the `sls_group_name` or `sls_group_description` of the Sls Group.
    :param str name_regex: A regex string to filter results by Sls Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['keyword'] = keyword
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cms/getSlsGroups:getSlsGroups', __args__, opts=opts, typ=GetSlsGroupsResult).value

    return AwaitableGetSlsGroupsResult(
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        keyword=pulumi.get(__ret__, 'keyword'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'))


@_utilities.lift_output_func(get_sls_groups)
def get_sls_groups_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                          keyword: Optional[pulumi.Input[Optional[str]]] = None,
                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                          page_number: Optional[pulumi.Input[Optional[int]]] = None,
                          page_size: Optional[pulumi.Input[Optional[int]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSlsGroupsResult]:
    """
    This data source provides the Cms Sls Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.171.0+.


    :param Sequence[str] ids: A list of Sls Group IDs. Its element value is same as Sls Group Name.
    :param str keyword: The keywords of the `sls_group_name` or `sls_group_description` of the Sls Group.
    :param str name_regex: A regex string to filter results by Sls Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
