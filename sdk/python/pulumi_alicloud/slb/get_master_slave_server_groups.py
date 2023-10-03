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
    'GetMasterSlaveServerGroupsResult',
    'AwaitableGetMasterSlaveServerGroupsResult',
    'get_master_slave_server_groups',
    'get_master_slave_server_groups_output',
]

@pulumi.output_type
class GetMasterSlaveServerGroupsResult:
    """
    A collection of values returned by getMasterSlaveServerGroups.
    """
    def __init__(__self__, groups=None, id=None, ids=None, load_balancer_id=None, name_regex=None, names=None, output_file=None):
        if groups and not isinstance(groups, list):
            raise TypeError("Expected argument 'groups' to be a list")
        pulumi.set(__self__, "groups", groups)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if load_balancer_id and not isinstance(load_balancer_id, str):
            raise TypeError("Expected argument 'load_balancer_id' to be a str")
        pulumi.set(__self__, "load_balancer_id", load_balancer_id)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)

    @property
    @pulumi.getter
    def groups(self) -> Sequence['outputs.GetMasterSlaveServerGroupsGroupResult']:
        """
        A list of SLB master slave server groups. Each element contains the following attributes:
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
        A list of SLB master slave server groups IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="loadBalancerId")
    def load_balancer_id(self) -> str:
        return pulumi.get(self, "load_balancer_id")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of SLB master slave server groups names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")


class AwaitableGetMasterSlaveServerGroupsResult(GetMasterSlaveServerGroupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMasterSlaveServerGroupsResult(
            groups=self.groups,
            id=self.id,
            ids=self.ids,
            load_balancer_id=self.load_balancer_id,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_master_slave_server_groups(ids: Optional[Sequence[str]] = None,
                                   load_balancer_id: Optional[str] = None,
                                   name_regex: Optional[str] = None,
                                   output_file: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMasterSlaveServerGroupsResult:
    """
    This data source provides the master slave server groups related to a server load balancer.

    > **NOTE:** Available in 1.54.0+


    :param Sequence[str] ids: A list of master slave server group IDs to filter results.
    :param str load_balancer_id: ID of the SLB.
    :param str name_regex: A regex string to filter results by master slave server group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['loadBalancerId'] = load_balancer_id
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups', __args__, opts=opts, typ=GetMasterSlaveServerGroupsResult).value

    return AwaitableGetMasterSlaveServerGroupsResult(
        groups=pulumi.get(__ret__, 'groups'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        load_balancer_id=pulumi.get(__ret__, 'load_balancer_id'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'))


@_utilities.lift_output_func(get_master_slave_server_groups)
def get_master_slave_server_groups_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                          load_balancer_id: Optional[pulumi.Input[str]] = None,
                                          name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                          output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMasterSlaveServerGroupsResult]:
    """
    This data source provides the master slave server groups related to a server load balancer.

    > **NOTE:** Available in 1.54.0+


    :param Sequence[str] ids: A list of master slave server group IDs to filter results.
    :param str load_balancer_id: ID of the SLB.
    :param str name_regex: A regex string to filter results by master slave server group name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    """
    ...
