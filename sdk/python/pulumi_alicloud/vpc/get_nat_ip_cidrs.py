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
    'GetNatIpCidrsResult',
    'AwaitableGetNatIpCidrsResult',
    'get_nat_ip_cidrs',
    'get_nat_ip_cidrs_output',
]

@pulumi.output_type
class GetNatIpCidrsResult:
    """
    A collection of values returned by getNatIpCidrs.
    """
    def __init__(__self__, cidrs=None, id=None, ids=None, name_regex=None, names=None, nat_gateway_id=None, nat_ip_cidr_names=None, nat_ip_cidrs=None, output_file=None, status=None):
        if cidrs and not isinstance(cidrs, list):
            raise TypeError("Expected argument 'cidrs' to be a list")
        pulumi.set(__self__, "cidrs", cidrs)
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
        if nat_gateway_id and not isinstance(nat_gateway_id, str):
            raise TypeError("Expected argument 'nat_gateway_id' to be a str")
        pulumi.set(__self__, "nat_gateway_id", nat_gateway_id)
        if nat_ip_cidr_names and not isinstance(nat_ip_cidr_names, list):
            raise TypeError("Expected argument 'nat_ip_cidr_names' to be a list")
        pulumi.set(__self__, "nat_ip_cidr_names", nat_ip_cidr_names)
        if nat_ip_cidrs and not isinstance(nat_ip_cidrs, list):
            raise TypeError("Expected argument 'nat_ip_cidrs' to be a list")
        pulumi.set(__self__, "nat_ip_cidrs", nat_ip_cidrs)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def cidrs(self) -> Sequence['outputs.GetNatIpCidrsCidrResult']:
        return pulumi.get(self, "cidrs")

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
    @pulumi.getter(name="natGatewayId")
    def nat_gateway_id(self) -> str:
        return pulumi.get(self, "nat_gateway_id")

    @property
    @pulumi.getter(name="natIpCidrNames")
    def nat_ip_cidr_names(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "nat_ip_cidr_names")

    @property
    @pulumi.getter(name="natIpCidrs")
    def nat_ip_cidrs(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "nat_ip_cidrs")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetNatIpCidrsResult(GetNatIpCidrsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNatIpCidrsResult(
            cidrs=self.cidrs,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            nat_gateway_id=self.nat_gateway_id,
            nat_ip_cidr_names=self.nat_ip_cidr_names,
            nat_ip_cidrs=self.nat_ip_cidrs,
            output_file=self.output_file,
            status=self.status)


def get_nat_ip_cidrs(ids: Optional[Sequence[str]] = None,
                     name_regex: Optional[str] = None,
                     nat_gateway_id: Optional[str] = None,
                     nat_ip_cidr_names: Optional[Sequence[str]] = None,
                     nat_ip_cidrs: Optional[Sequence[str]] = None,
                     output_file: Optional[str] = None,
                     status: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNatIpCidrsResult:
    """
    This data source provides the Vpc Nat Ip Cidrs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("vpcNatIpCidrId1", ids.cidrs[0].id)
    name_regex = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        name_regex="^my-NatIpCidr")
    pulumi.export("vpcNatIpCidrId2", name_regex.cidrs[0].id)
    status = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        ids=["example_value-1"],
        status="Available")
    pulumi.export("vpcNatIpCidrId3", status.cidrs[0].id)
    nat_ip_cidr = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        nat_ip_cidrs=["example_value-1"])
    pulumi.export("vpcNatIpCidrId4", nat_ip_cidr.cidrs[0].id)
    at_ip_cidr_name = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        nat_ip_cidr_names=["example_value-1"])
    pulumi.export("vpcNatIpCidrId5", at_ip_cidr_name.cidrs[0].id)
    ```


    :param Sequence[str] ids: A list of Nat Ip Cidr IDs.
    :param str name_regex: A regex string to filter results by Nat Ip Cidr name.
    :param str nat_gateway_id: The ID of the VPC NAT gateway.
    :param Sequence[str] nat_ip_cidr_names: NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
    :param Sequence[str] nat_ip_cidrs: The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['natGatewayId'] = nat_gateway_id
    __args__['natIpCidrNames'] = nat_ip_cidr_names
    __args__['natIpCidrs'] = nat_ip_cidrs
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getNatIpCidrs:getNatIpCidrs', __args__, opts=opts, typ=GetNatIpCidrsResult).value

    return AwaitableGetNatIpCidrsResult(
        cidrs=pulumi.get(__ret__, 'cidrs'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        nat_gateway_id=pulumi.get(__ret__, 'nat_gateway_id'),
        nat_ip_cidr_names=pulumi.get(__ret__, 'nat_ip_cidr_names'),
        nat_ip_cidrs=pulumi.get(__ret__, 'nat_ip_cidrs'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_nat_ip_cidrs)
def get_nat_ip_cidrs_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                            nat_gateway_id: Optional[pulumi.Input[str]] = None,
                            nat_ip_cidr_names: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            nat_ip_cidrs: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            status: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNatIpCidrsResult]:
    """
    This data source provides the Vpc Nat Ip Cidrs of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.136.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        ids=[
            "example_value-1",
            "example_value-2",
        ])
    pulumi.export("vpcNatIpCidrId1", ids.cidrs[0].id)
    name_regex = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        name_regex="^my-NatIpCidr")
    pulumi.export("vpcNatIpCidrId2", name_regex.cidrs[0].id)
    status = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        ids=["example_value-1"],
        status="Available")
    pulumi.export("vpcNatIpCidrId3", status.cidrs[0].id)
    nat_ip_cidr = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        nat_ip_cidrs=["example_value-1"])
    pulumi.export("vpcNatIpCidrId4", nat_ip_cidr.cidrs[0].id)
    at_ip_cidr_name = alicloud.vpc.get_nat_ip_cidrs(nat_gateway_id="example_value",
        nat_ip_cidr_names=["example_value-1"])
    pulumi.export("vpcNatIpCidrId5", at_ip_cidr_name.cidrs[0].id)
    ```


    :param Sequence[str] ids: A list of Nat Ip Cidr IDs.
    :param str name_regex: A regex string to filter results by Nat Ip Cidr name.
    :param str nat_gateway_id: The ID of the VPC NAT gateway.
    :param Sequence[str] nat_ip_cidr_names: NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
    :param Sequence[str] nat_ip_cidrs: The NAT CIDR block to be created. Support up to `20`. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the CIDR block of the NAT gateway. If the value is `Available`, the CIDR block is available.
    """
    ...
