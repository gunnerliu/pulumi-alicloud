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
    'GetGatewaysResult',
    'AwaitableGetGatewaysResult',
    'get_gateways',
    'get_gateways_output',
]

@pulumi.output_type
class GetGatewaysResult:
    """
    A collection of values returned by getGateways.
    """
    def __init__(__self__, business_status=None, enable_ipsec=None, gateways=None, id=None, ids=None, include_reservation_data=None, name_regex=None, names=None, output_file=None, status=None, vpc_id=None):
        if business_status and not isinstance(business_status, str):
            raise TypeError("Expected argument 'business_status' to be a str")
        pulumi.set(__self__, "business_status", business_status)
        if enable_ipsec and not isinstance(enable_ipsec, bool):
            raise TypeError("Expected argument 'enable_ipsec' to be a bool")
        pulumi.set(__self__, "enable_ipsec", enable_ipsec)
        if gateways and not isinstance(gateways, list):
            raise TypeError("Expected argument 'gateways' to be a list")
        pulumi.set(__self__, "gateways", gateways)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if include_reservation_data and not isinstance(include_reservation_data, bool):
            raise TypeError("Expected argument 'include_reservation_data' to be a bool")
        pulumi.set(__self__, "include_reservation_data", include_reservation_data)
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
    @pulumi.getter(name="enableIpsec")
    def enable_ipsec(self) -> Optional[bool]:
        """
        Whether the ipsec function is enabled.
        """
        warnings.warn("""Field 'enable_ipsec' has been deprecated from provider version 1.193.0 and it will be removed in the future version.""", DeprecationWarning)
        pulumi.log.warn("""enable_ipsec is deprecated: Field 'enable_ipsec' has been deprecated from provider version 1.193.0 and it will be removed in the future version.""")

        return pulumi.get(self, "enable_ipsec")

    @property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetGatewaysGatewayResult']:
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
    def ids(self) -> Sequence[str]:
        """
        IDs of the VPN.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="includeReservationData")
    def include_reservation_data(self) -> Optional[bool]:
        return pulumi.get(self, "include_reservation_data")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
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
            enable_ipsec=self.enable_ipsec,
            gateways=self.gateways,
            id=self.id,
            ids=self.ids,
            include_reservation_data=self.include_reservation_data,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status,
            vpc_id=self.vpc_id)


def get_gateways(business_status: Optional[str] = None,
                 enable_ipsec: Optional[bool] = None,
                 ids: Optional[Sequence[str]] = None,
                 include_reservation_data: Optional[bool] = None,
                 name_regex: Optional[str] = None,
                 output_file: Optional[str] = None,
                 status: Optional[str] = None,
                 vpc_id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGatewaysResult:
    """
    The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.

    > **NOTE:** Available since v1.18.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
    default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
    default_switches = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
        zone_id=default_zones.zones[0].id)
    default_gateway = alicloud.vpn.Gateway("defaultGateway",
        vpc_id=default_networks.ids[0],
        bandwidth=10,
        enable_ssl=True,
        enable_ipsec=True,
        instance_charge_type="PrePaid",
        description=name,
        vswitch_id=default_switches.ids[0],
        network_type="public")
    vpn_gateways = default_gateway.id.apply(lambda id: alicloud.vpn.get_gateways_output(vpc_id=default_networks.ids[0],
        ids=[id],
        status="Active",
        business_status="Normal",
        name_regex="tf-example",
        include_reservation_data=True,
        output_file="/tmp/vpns"))
    ```


    :param str business_status: Limit search to specific business status - valid value is "Normal", "FinancialLocked".
    :param bool enable_ipsec: Indicates whether the IPsec-VPN feature is enabled.
    :param Sequence[str] ids: IDs of the VPN.
    :param bool include_reservation_data: Include ineffective ordering data.
    :param str name_regex: A regex string of VPN name.
    :param str output_file: Save the result to the file.
    :param str status: Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
    :param str vpc_id: Use the VPC ID as the search key.
    """
    __args__ = dict()
    __args__['businessStatus'] = business_status
    __args__['enableIpsec'] = enable_ipsec
    __args__['ids'] = ids
    __args__['includeReservationData'] = include_reservation_data
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    __args__['vpcId'] = vpc_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:vpn/getGateways:getGateways', __args__, opts=opts, typ=GetGatewaysResult).value

    return AwaitableGetGatewaysResult(
        business_status=pulumi.get(__ret__, 'business_status'),
        enable_ipsec=pulumi.get(__ret__, 'enable_ipsec'),
        gateways=pulumi.get(__ret__, 'gateways'),
        id=pulumi.get(__ret__, 'id'),
        ids=pulumi.get(__ret__, 'ids'),
        include_reservation_data=pulumi.get(__ret__, 'include_reservation_data'),
        name_regex=pulumi.get(__ret__, 'name_regex'),
        names=pulumi.get(__ret__, 'names'),
        output_file=pulumi.get(__ret__, 'output_file'),
        status=pulumi.get(__ret__, 'status'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_gateways)
def get_gateways_output(business_status: Optional[pulumi.Input[Optional[str]]] = None,
                        enable_ipsec: Optional[pulumi.Input[Optional[bool]]] = None,
                        ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                        include_reservation_data: Optional[pulumi.Input[Optional[bool]]] = None,
                        name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                        output_file: Optional[pulumi.Input[Optional[str]]] = None,
                        status: Optional[pulumi.Input[Optional[str]]] = None,
                        vpc_id: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGatewaysResult]:
    """
    The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.

    > **NOTE:** Available since v1.18.0.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    config = pulumi.Config()
    name = config.get("name")
    if name is None:
        name = "tf-example"
    default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
    default_networks = alicloud.vpc.get_networks(name_regex="^default-NODELETING$")
    default_switches = alicloud.vpc.get_switches(vpc_id=default_networks.ids[0],
        zone_id=default_zones.zones[0].id)
    default_gateway = alicloud.vpn.Gateway("defaultGateway",
        vpc_id=default_networks.ids[0],
        bandwidth=10,
        enable_ssl=True,
        enable_ipsec=True,
        instance_charge_type="PrePaid",
        description=name,
        vswitch_id=default_switches.ids[0],
        network_type="public")
    vpn_gateways = default_gateway.id.apply(lambda id: alicloud.vpn.get_gateways_output(vpc_id=default_networks.ids[0],
        ids=[id],
        status="Active",
        business_status="Normal",
        name_regex="tf-example",
        include_reservation_data=True,
        output_file="/tmp/vpns"))
    ```


    :param str business_status: Limit search to specific business status - valid value is "Normal", "FinancialLocked".
    :param bool enable_ipsec: Indicates whether the IPsec-VPN feature is enabled.
    :param Sequence[str] ids: IDs of the VPN.
    :param bool include_reservation_data: Include ineffective ordering data.
    :param str name_regex: A regex string of VPN name.
    :param str output_file: Save the result to the file.
    :param str status: Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
    :param str vpc_id: Use the VPC ID as the search key.
    """
    ...
