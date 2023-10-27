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
    'GetBgpGroupsResult',
    'AwaitableGetBgpGroupsResult',
    'get_bgp_groups',
    'get_bgp_groups_output',
]

@pulumi.output_type
class GetBgpGroupsResult:
    """
    A collection of values returned by getBgpGroups.
    """
    def __init__(__self__, groups=None, id=None, ids=None, name_regex=None, names=None, output_file=None, router_id=None, status=None):
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
        if router_id and not isinstance(router_id, str):
            raise TypeError("Expected argument 'router_id' to be a str")
        pulumi.set(__self__, "router_id", router_id)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetBgpGroupsGroupResult']:
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
    @pulumi.getter(name="routerId")
    def router_id(self) -> Optional[str]:
        return pulumi.get(self, "router_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetBgpGroupsResult(GetBgpGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBgpGroupsResult(
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            router_id=self.router_id,
            status=self.status)


def get_bgp_groups(ids: Optional[Sequence[str]] = None,
                   name_regex: Optional[str] = None,
                   output_file: Optional[str] = None,
                   router_id: Optional[str] = None,
                   status: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBgpGroupsResult:
    """
    This data source provides the Vpc Bgp Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.152.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_bgp_groups(ids=["example_value"])
    pulumi.export("vpcBgpGroupId1", ids.groups[0].id)
    name_regex = alicloud.vpc.get_bgp_groups(name_regex="^my-BgpGroup")
    pulumi.export("vpcBgpGroupId2", name_regex.groups[0].id)
    ```


    :param Sequence[str] ids: A list of Bgp Group IDs.
    :param str name_regex: A regex string to filter results by Bgp Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str router_id: The ID of the VBR.
    :param str status: The status of the resource.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['routerId'] = router_id
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getBgpGroups:getBgpGroups', __args__, opts=opts, typ=GetBgpGroupsResult).value

    return AwaitableGetBgpGroupsResult(
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        router_id=pulumi.get(__ret__, 'router_id'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_bgp_groups)
def get_bgp_groups_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                          router_id: Optional[pulumi.Input[Optional[str]]] = None,
                          status: Optional[pulumi.Input[Optional[str]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBgpGroupsResult]:
    """
    This data source provides the Vpc Bgp Groups of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.152.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_bgp_groups(ids=["example_value"])
    pulumi.export("vpcBgpGroupId1", ids.groups[0].id)
    name_regex = alicloud.vpc.get_bgp_groups(name_regex="^my-BgpGroup")
    pulumi.export("vpcBgpGroupId2", name_regex.groups[0].id)
    ```


    :param Sequence[str] ids: A list of Bgp Group IDs.
    :param str name_regex: A regex string to filter results by Bgp Group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str router_id: The ID of the VBR.
    :param str status: The status of the resource.
    """
    ...
