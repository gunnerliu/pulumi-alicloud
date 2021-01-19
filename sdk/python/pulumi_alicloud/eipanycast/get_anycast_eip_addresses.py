# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'GetAnycastEipAddressesResult',
    'AwaitableGetAnycastEipAddressesResult',
    'get_anycast_eip_addresses',
]

@pulumi.output_type
class GetAnycastEipAddressesResult:
    """
    A collection of values returned by getAnycastEipAddresses.
    """
    def __init__(__self__, addresses=None, anycast_eip_address_name=None, bind_instance_ids=None, business_status=None, id=None, ids=None, internet_charge_type=None, ip_address=None, name_regex=None, names=None, output_file=None, payment_type=None, service_location=None, status=None):
        if addresses and not isinstance(addresses, list):
            raise TypeError("Expected argument 'addresses' to be a list")
        pulumi.set(__self__, "addresses", addresses)
        if anycast_eip_address_name and not isinstance(anycast_eip_address_name, str):
            raise TypeError("Expected argument 'anycast_eip_address_name' to be a str")
        pulumi.set(__self__, "anycast_eip_address_name", anycast_eip_address_name)
        if bind_instance_ids and not isinstance(bind_instance_ids, list):
            raise TypeError("Expected argument 'bind_instance_ids' to be a list")
        pulumi.set(__self__, "bind_instance_ids", bind_instance_ids)
        if business_status and not isinstance(business_status, str):
            raise TypeError("Expected argument 'business_status' to be a str")
        pulumi.set(__self__, "business_status", business_status)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ids and not isinstance(ids, list):
            raise TypeError("Expected argument 'ids' to be a list")
        pulumi.set(__self__, "ids", ids)
        if internet_charge_type and not isinstance(internet_charge_type, str):
            raise TypeError("Expected argument 'internet_charge_type' to be a str")
        pulumi.set(__self__, "internet_charge_type", internet_charge_type)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if name_regex and not isinstance(name_regex, str):
            raise TypeError("Expected argument 'name_regex' to be a str")
        pulumi.set(__self__, "name_regex", name_regex)
        if names and not isinstance(names, list):
            raise TypeError("Expected argument 'names' to be a list")
        pulumi.set(__self__, "names", names)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if payment_type and not isinstance(payment_type, str):
            raise TypeError("Expected argument 'payment_type' to be a str")
        pulumi.set(__self__, "payment_type", payment_type)
        if service_location and not isinstance(service_location, str):
            raise TypeError("Expected argument 'service_location' to be a str")
        pulumi.set(__self__, "service_location", service_location)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def addresses(self) -> Sequence['outputs.GetAnycastEipAddressesAddressResult']:
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="anycastEipAddressName")
    def anycast_eip_address_name(self) -> Optional[str]:
        return pulumi.get(self, "anycast_eip_address_name")

    @property
    @pulumi.getter(name="bindInstanceIds")
    def bind_instance_ids(self) -> Optional[Sequence[str]]:
        return pulumi.get(self, "bind_instance_ids")

    @property
    @pulumi.getter(name="businessStatus")
    def business_status(self) -> Optional[str]:
        return pulumi.get(self, "business_status")

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
    @pulumi.getter(name="internetChargeType")
    def internet_charge_type(self) -> Optional[str]:
        return pulumi.get(self, "internet_charge_type")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[str]:
        return pulumi.get(self, "ip_address")

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
    @pulumi.getter(name="paymentType")
    def payment_type(self) -> Optional[str]:
        return pulumi.get(self, "payment_type")

    @property
    @pulumi.getter(name="serviceLocation")
    def service_location(self) -> Optional[str]:
        return pulumi.get(self, "service_location")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


class AwaitableGetAnycastEipAddressesResult(GetAnycastEipAddressesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAnycastEipAddressesResult(
            addresses=self.addresses,
            anycast_eip_address_name=self.anycast_eip_address_name,
            bind_instance_ids=self.bind_instance_ids,
            business_status=self.business_status,
            id=self.id,
            ids=self.ids,
            internet_charge_type=self.internet_charge_type,
            ip_address=self.ip_address,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            payment_type=self.payment_type,
            service_location=self.service_location,
            status=self.status)


def get_anycast_eip_addresses(anycast_eip_address_name: Optional[str] = None,
                              bind_instance_ids: Optional[Sequence[str]] = None,
                              business_status: Optional[str] = None,
                              ids: Optional[Sequence[str]] = None,
                              internet_charge_type: Optional[str] = None,
                              ip_address: Optional[str] = None,
                              name_regex: Optional[str] = None,
                              output_file: Optional[str] = None,
                              payment_type: Optional[str] = None,
                              service_location: Optional[str] = None,
                              status: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAnycastEipAddressesResult:
    """
    This data source provides the Eipanycast Anycast Eip Addresses of the current Alibaba Cloud user.

    > **NOTE:** Available in v1.113.0+.

    ## Example Usage

    Basic Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.eipanycast.get_anycast_eip_addresses(ids=["example_value"],
        name_regex="the_resource_name")
    pulumi.export("firstEipanycastAnycastEipAddressId", example.addresses[0].id)
    ```


    :param str anycast_eip_address_name: Anycast EIP instance name.
    :param Sequence[str] bind_instance_ids: The bind instance ids.
    :param str business_status: The business status of the Anycast EIP instance. -`Normal`: Normal state. -`FinancialLocked`: The status of arrears locked.
    :param Sequence[str] ids: A list of Anycast Eip Address IDs.
    :param str internet_charge_type: The billing method of Anycast EIP instance. `PayByBandwidth`: refers to the method of billing based on traffic.
    :param str ip_address: Anycast EIP instance IP address.
    :param str name_regex: A regex string to filter results by Anycast Eip Address name.
    :param str payment_type: The payment model of Anycast EIP instance. "PostPaid": Refers to the post-paid mode.
    :param str service_location: Anycast EIP instance access area. "international": Refers to areas outside of Mainland China.
    :param str status: IP status。- `Associating`, `Unassociating`, `Allocated`, `Associated`, `Modifying`, `Releasing`, `Released`.
    """
    __args__ = dict()
    __args__['anycastEipAddressName'] = anycast_eip_address_name
    __args__['bindInstanceIds'] = bind_instance_ids
    __args__['businessStatus'] = business_status
    __args__['ids'] = ids
    __args__['internetChargeType'] = internet_charge_type
    __args__['ipAddress'] = ip_address
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['paymentType'] = payment_type
    __args__['serviceLocation'] = service_location
    __args__['status'] = status
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:eipanycast/getAnycastEipAddresses:getAnycastEipAddresses', __args__, opts=opts, typ=GetAnycastEipAddressesResult).value

    return AwaitableGetAnycastEipAddressesResult(
        addresses=__ret__.addresses,
        anycast_eip_address_name=__ret__.anycast_eip_address_name,
        bind_instance_ids=__ret__.bind_instance_ids,
        business_status=__ret__.business_status,
        id=__ret__.id,
        ids=__ret__.ids,
        internet_charge_type=__ret__.internet_charge_type,
        ip_address=__ret__.ip_address,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        payment_type=__ret__.payment_type,
        service_location=__ret__.service_location,
        status=__ret__.status)
