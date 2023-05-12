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
    'GetIpv6InternetBandwidthsResult',
    'AwaitableGetIpv6InternetBandwidthsResult',
    'get_ipv6_internet_bandwidths',
    'get_ipv6_internet_bandwidths_output',
]

@pulumi.output_type
class GetIpv6InternetBandwidthsResult:
    """
    A collection of values returned by getIpv6InternetBandwidths.
    """
    def __init__(__self__, bandwidths=None, id=None, ids=None, ipv6_address_id=None, ipv6_internet_bandwidth_id=None, output_file=None, status=None):
        if bandwidths and not isinstance(bandwidths, list):
            raise TypeError("Expected argument 'bandwidths' to be a list")
        pulumi.set(__self__, "bandwidths", bandwidths)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if ipv6_address_id and not isinstance(ipv6_address_id, str):
            raise TypeError("Expected argument 'ipv6_address_id' to be a str")
        pulumi.set(__self__, "ipv6_address_id", ipv6_address_id)
        if ipv6_internet_bandwidth_id and not isinstance(ipv6_internet_bandwidth_id, str):
            raise TypeError("Expected argument 'ipv6_internet_bandwidth_id' to be a str")
        pulumi.set(__self__, "ipv6_internet_bandwidth_id", ipv6_internet_bandwidth_id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def bandwidths(self) -> Sequence['outputs.GetIpv6InternetBandwidthsBandwidthResult']:
        return pulumi.get(self, "bandwidths")

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
    @pulumi.getter(name="ipv6AddressId")
    def ipv6_address_id(self) -> Optional[str]:
        return pulumi.get(self, "ipv6_address_id")

    @property
    @pulumi.getter(name="ipv6InternetBandwidthId")
    def ipv6_internet_bandwidth_id(self) -> Optional[str]:
        return pulumi.get(self, "ipv6_internet_bandwidth_id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetIpv6InternetBandwidthsResult(GetIpv6InternetBandwidthsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpv6InternetBandwidthsResult(
            bandwidths=self.bandwidths,
            id=self.id,
            ids=self.ids,
            ipv6_address_id=self.ipv6_address_id,
            ipv6_internet_bandwidth_id=self.ipv6_internet_bandwidth_id,
            output_file=self.output_file,
            status=self.status)


def get_ipv6_internet_bandwidths(ids: Optional[Sequence[str]] = None,
                                 ipv6_address_id: Optional[str] = None,
                                 ipv6_internet_bandwidth_id: Optional[str] = None,
                                 output_file: Optional[str] = None,
                                 status: Optional[str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpv6InternetBandwidthsResult:
    """
    This data source provides the Vpc Ipv6 Internet Bandwidths of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipv6_internet_bandwidths(ids=["example_id"])
    pulumi.export("vpcIpv6InternetBandwidthId1", ids.bandwidths[0].id)
    ipv6_internet_bandwidth_id = alicloud.vpc.get_ipv6_internet_bandwidths(ipv6_internet_bandwidth_id="example_value")
    pulumi.export("vpcIpv6InternetBandwidthId2", ipv6_internet_bandwidth_id.bandwidths[0].id)
    ipv6_address_id = alicloud.vpc.get_ipv6_internet_bandwidths(ipv6_address_id="example_value")
    pulumi.export("vpcIpv6InternetBandwidthId3", ipv6_address_id.bandwidths[0].id)
    status = alicloud.vpc.get_ipv6_internet_bandwidths(status="Normal")
    pulumi.export("vpcIpv6InternetBandwidthId4", status.bandwidths[0].id)
    ```


    :param Sequence[str] ids: A list of Ipv6 Internet Bandwidth IDs.
    :param str ipv6_address_id: The ID of the IPv6 address.
    :param str ipv6_internet_bandwidth_id: The ID of the Ipv6 Internet Bandwidth.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['ipv6AddressId'] = ipv6_address_id
    __args__['ipv6InternetBandwidthId'] = ipv6_internet_bandwidth_id
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpc/getIpv6InternetBandwidths:getIpv6InternetBandwidths', __args__, opts=opts, typ=GetIpv6InternetBandwidthsResult).value

    return AwaitableGetIpv6InternetBandwidthsResult(
        bandwidths=__ret__.bandwidths,
        id=__ret__.id,
        ids=__ret__.ids,
        ipv6_address_id=__ret__.ipv6_address_id,
        ipv6_internet_bandwidth_id=__ret__.ipv6_internet_bandwidth_id,
        output_file=__ret__.output_file,
        status=__ret__.status)


@_utilities.lift_output_func(get_ipv6_internet_bandwidths)
def get_ipv6_internet_bandwidths_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                        ipv6_address_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        ipv6_internet_bandwidth_id: Optional[pulumi.Input[Optional[str]]] = None,
                                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                        status: Optional[pulumi.Input[Optional[str]]] = None,
                                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpv6InternetBandwidthsResult]:
    """
    This data source provides the Vpc Ipv6 Internet Bandwidths of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.143.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    ids = alicloud.vpc.get_ipv6_internet_bandwidths(ids=["example_id"])
    pulumi.export("vpcIpv6InternetBandwidthId1", ids.bandwidths[0].id)
    ipv6_internet_bandwidth_id = alicloud.vpc.get_ipv6_internet_bandwidths(ipv6_internet_bandwidth_id="example_value")
    pulumi.export("vpcIpv6InternetBandwidthId2", ipv6_internet_bandwidth_id.bandwidths[0].id)
    ipv6_address_id = alicloud.vpc.get_ipv6_internet_bandwidths(ipv6_address_id="example_value")
    pulumi.export("vpcIpv6InternetBandwidthId3", ipv6_address_id.bandwidths[0].id)
    status = alicloud.vpc.get_ipv6_internet_bandwidths(status="Normal")
    pulumi.export("vpcIpv6InternetBandwidthId4", status.bandwidths[0].id)
    ```


    :param Sequence[str] ids: A list of Ipv6 Internet Bandwidth IDs.
    :param str ipv6_address_id: The ID of the IPv6 address.
    :param str ipv6_internet_bandwidth_id: The ID of the Ipv6 Internet Bandwidth.
    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str status: The status of the resource. Valid values: `Normal`, `FinancialLocked` and `SecurityLocked`.
    """
    ...
