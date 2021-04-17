# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetCustomerGatewaysResult',
    'AwaitableGetCustomerGatewaysResult',
    'get_customer_gateways',
]

@pulumi.output_type
class GetCustomerGatewaysResult:
    """
    A collection of values returned by getCustomerGateways.
    """
    def __init__(__self__, gateways=None, id=None, ids=None, name_regex=None, names=None, output_file=None):
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

    @property
    @pulumi.getter
    def gateways(self) -> Sequence['outputs.GetCustomerGatewaysGatewayResult']:
        """
        A list of VPN customer gateways. Each element contains the following attributes:
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


class AwaitableGetCustomerGatewaysResult(GetCustomerGatewaysResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomerGatewaysResult(
            gateways=self.gateways,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file)


def get_customer_gateways(ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomerGatewaysResult:
    """
    The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    foo = alicloud.vpn.get_customer_gateways(ids=[
            "fake-id1",
            "fake-id2",
        ],
        name_regex="testAcc*",
        output_file="/tmp/cgws")
    ```


    :param Sequence[str] ids: ID of the VPN customer gateways.
    :param str name_regex: A regex string of VPN customer gateways name.
    :param str output_file: Save the result to the file.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:vpn/getCustomerGateways:getCustomerGateways', __args__, opts=opts, typ=GetCustomerGatewaysResult).value

    return AwaitableGetCustomerGatewaysResult(
        gateways=__ret__.gateways,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file)
