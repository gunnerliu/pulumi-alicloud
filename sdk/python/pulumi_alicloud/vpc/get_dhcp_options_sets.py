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
    'GetDhcpOptionsSetsResult',
    'AwaitableGetDhcpOptionsSetsResult',
    'get_dhcp_options_sets',
    'get_dhcp_options_sets_output',
]

@pulumi.output_type
class GetDhcpOptionsSetsResult:
    """
    A collection of values returned by getDhcpOptionsSets.
    """
    def __init__(__self__, dhcp_options_set_name=None, domain_name=None, id=None, ids=None, name_regex=None, names=None, output_file=None, sets=None, status=None):
        if dhcp_options_set_name and not isinstance(dhcp_options_set_name, str):
            raise TypeError("Expected argument 'dhcp_options_set_name' to be a str")
        pulumi.set(__self__, "dhcp_options_set_name", dhcp_options_set_name)
        if domain_name and not isinstance(domain_name, str):
            raise TypeError("Expected argument 'domain_name' to be a str")
        pulumi.set(__self__, "domain_name", domain_name)
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
        if sets and not isinstance(sets, list):
            raise TypeError("Expected argument 'sets' to be a list")
        pulumi.set(__self__, "sets", sets)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="dhcpOptionsSetName")
    def dhcp_options_set_name(self) -> Optional[str]:
        return pulumi.get(self, "dhcp_options_set_name")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> Optional[str]:
        return pulumi.get(self, "domain_name")

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
    @pulumi.getter
    def sets(self) -> Sequence['outputs.GetDhcpOptionsSetsSetResult']:
        return pulumi.get(self, "sets")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetDhcpOptionsSetsResult(GetDhcpOptionsSetsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDhcpOptionsSetsResult(
            dhcp_options_set_name=self.dhcp_options_set_name,
            domain_name=self.domain_name,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            sets=self.sets,
            status=self.status)


def get_dhcp_options_sets(dhcp_options_set_name: Optional[str] = None,
                          domain_name: Optional[str] = None,
                          ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          status: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDhcpOptionsSetsResult:
    """
    This data source provides the Vpc Dhcp Options Sets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.134.0+.


    :param str dhcp_options_set_name: The root domain, for example, example.com. After a DHCP options set is associated with a
           Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the
           ECS instances in the VPC network.
    :param str domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual
           Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS
           instances in the VPC network.
    :param Sequence[str] ids: A list of Dhcp Options Set IDs.
    :param str name_regex: A regex string to filter results by Dhcp Options Set name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
    """
    __args__ = dict()
    __args__['dhcpOptionsSetName'] = dhcp_options_set_name
    __args__['domainName'] = domain_name
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getDhcpOptionsSets:getDhcpOptionsSets', __args__, opts=opts, typ=GetDhcpOptionsSetsResult).value

    return AwaitableGetDhcpOptionsSetsResult(
        dhcp_options_set_name=pulumi.get(__ret__, 'dhcp_options_set_name'),
        domain_name=pulumi.get(__ret__, 'domain_name'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        sets=pulumi.get(__ret__, 'sets'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_dhcp_options_sets)
def get_dhcp_options_sets_output(dhcp_options_set_name: Optional[pulumi.Input[Optional[str]]] = None,
                                 domain_name: Optional[pulumi.Input[Optional[str]]] = None,
                                 ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 status: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDhcpOptionsSetsResult]:
    """
    This data source provides the Vpc Dhcp Options Sets of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.134.0+.


    :param str dhcp_options_set_name: The root domain, for example, example.com. After a DHCP options set is associated with a
           Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the
           ECS instances in the VPC network.
    :param str domain_name: The root domain, for example, example.com. After a DHCP options set is associated with a Virtual
           Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS
           instances in the VPC network.
    :param Sequence[str] ids: A list of Dhcp Options Set IDs.
    :param str name_regex: A regex string to filter results by Dhcp Options Set name.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
    """
    ...
