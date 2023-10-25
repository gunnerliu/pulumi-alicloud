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
    'GetDdosBgpIpsResult',
    'AwaitableGetDdosBgpIpsResult',
    'get_ddos_bgp_ips',
    'get_ddos_bgp_ips_output',
]

@pulumi.output_type
class GetDdosBgpIpsResult:
    """
    A collection of values returned by getDdosBgpIps.
    """
    def __init__(__self__, id=None, ids=None, instance_id=None, ips=None, output_file=None, page_number=None, page_size=None, product_name=None, status=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if instance_id and not isinstance(instance_id, str):
            raise TypeError("Expected argument 'instance_id' to be a str")
        pulumi.set(__self__, "instance_id", instance_id)
        if ips and not isinstance(ips, list):
            raise TypeError("Expected argument 'ips' to be a list")
        pulumi.set(__self__, "ips", ips)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if page_number and not isinstance(page_number, int):
            raise TypeError("Expected argument 'page_number' to be a int")
        pulumi.set(__self__, "page_number", page_number)
        if page_size and not isinstance(page_size, int):
            raise TypeError("Expected argument 'page_size' to be a int")
        pulumi.set(__self__, "page_size", page_size)
        if product_name and not isinstance(product_name, str):
            raise TypeError("Expected argument 'product_name' to be a str")
        pulumi.set(__self__, "product_name", product_name)
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
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def ips(self) -> Sequence['outputs.GetDdosBgpIpsIpResult']:
        return pulumi.get(self, "ips")

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

    @property
    @pulumi.getter(name="productName")
    def product_name(self) -> Optional[str]:
        return pulumi.get(self, "product_name")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetDdosBgpIpsResult(GetDdosBgpIpsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDdosBgpIpsResult(
            id=self.id,
            ids=self.ids,
            instance_id=self.instance_id,
            ips=self.ips,
            output_file=self.output_file,
            page_number=self.page_number,
            page_size=self.page_size,
            product_name=self.product_name,
            status=self.status)


def get_ddos_bgp_ips(ids: Optional[Sequence[str]] = None,
                     instance_id: Optional[str] = None,
                     output_file: Optional[str] = None,
                     page_number: Optional[int] = None,
                     page_size: Optional[int] = None,
                     product_name: Optional[str] = None,
                     status: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDdosBgpIpsResult:
    """
    This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.180.0+.


    :param Sequence[str] ids: A list of Ip IDs.
    :param str instance_id: The ID of the native protection enterprise instance to be operated.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_name: The product name. Valid Value:`ECS`, `SLB`, `EIP`, `WAF`.
    :param str status: The current state of the IP address.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['instanceId'] = instance_id
    __args__['outputFile'] = output_file
    __args__['pageNumber'] = page_number
    __args__['pageSize'] = page_size
    __args__['productName'] = product_name
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:ddos/getDdosBgpIps:getDdosBgpIps', __args__, opts=opts, typ=GetDdosBgpIpsResult).value

    return AwaitableGetDdosBgpIpsResult(
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        instance_id=pulumi.get(__ret__, 'instance_id'),
        ips=pulumi.get(__ret__, 'ips'),
        output_file=pulumi.get(__ret__, 'output_file'),
        page_number=pulumi.get(__ret__, 'page_number'),
        page_size=pulumi.get(__ret__, 'page_size'),
        product_name=pulumi.get(__ret__, 'product_name'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_ddos_bgp_ips)
def get_ddos_bgp_ips_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                            instance_id: Optional[pulumi.Input[str]] = None,
                            output_file: Optional[pulumi.Input[Optional[str]]] = None,
                            page_number: Optional[pulumi.Input[Optional[int]]] = None,
                            page_size: Optional[pulumi.Input[Optional[int]]] = None,
                            product_name: Optional[pulumi.Input[Optional[str]]] = None,
                            status: Optional[pulumi.Input[Optional[str]]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDdosBgpIpsResult]:
    """
    This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.180.0+.


    :param Sequence[str] ids: A list of Ip IDs.
    :param str instance_id: The ID of the native protection enterprise instance to be operated.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str product_name: The product name. Valid Value:`ECS`, `SLB`, `EIP`, `WAF`.
    :param str status: The current state of the IP address.
    """
    ...
