# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetGatewaysResult',
    'AwaitableGetGatewaysResult',
    'get_gateways',
]

@pulumi.output_type
class GetGatewaysResult:
    """
    A collection of values returned by getGateways.
    """
    def __init__(__self__, business_status=None, gateways=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None, vpc_id=None):
        if business_status and not isinstance(business_status, str):
            raise TypeError("Expected argument 'business_status' to be a str")
        pulumi.set(__self__, "business_status", business_status)
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
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
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="businessStatus")
    def business_status(self) -> Optional[str]:
        """
        The business status of the VPN gateway.
        """
        return pulumi.get(self, "business_status")

    @property
    @pulumi.getter
    def gateways(self) -> List['outputs.GetGatewaysGatewayResult']:
        """
        A list of VPN gateways. Each element contains the following attributes:
        """
        return pulumi.get(self, "gateways")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def ids(self) -> List[str]:
        """
        IDs of the VPN.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> List[str]:
        """
        names of the VPN.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        """
        The status of the VPN
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[str]:
        """
        ID of the VPC that the VPN belongs.
        """
        return pulumi.get(self, "vpc_id")


class AwaitableGetGatewaysResult(GetGatewaysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGatewaysResult(
            business_status=self.business_status,
            gateways=self.gateways,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            vpc_id=self.vpc_id)


def get_gateways(business_status: Optional[str] = None,
                 ids: Optional[List[str]] = None,
                 name_regex: Optional[str] = None,
                 output_file: Optional[str] = None,
                 status: Optional[str] = None,
                 vpc_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewaysResult:
    """
    The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    vpn_gateways = alicloud.vpn.get_gateways(business_status="Normal",
        ids=[
            "fake-vpn-id1",
            "fake-vpn-id2",
        ],
        name_regex="testAcc*",
        output_file="/tmp/vpns",
        status="active",
        vpc_id="fake-vpc-id")
    ```


    :param str business_status: Limit search to specific business status - valid value is "Normal", "FinancialLocked".
    :param List[str] ids: IDs of the VPN.
    :param str name_regex: A regex string of VPN name.
    :param str output_file: Save the result to the file.
    :param str status: Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
    :param str vpc_id: Use the VPC ID as the search key.
    """
    __args__ = dict()
    __args__['businessStatus'] = business_status
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['vpcId'] = vpc_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:vpn/getGateways:getGateways', __args__, opts=opts, typ=GetGatewaysResult).value

    return AwaitableGetGatewaysResult(
        business_status=__ret__.business_status,
        gateways=__ret__.gateways,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        status=__ret__.status,
        vpc_id=__ret__.vpc_id)
