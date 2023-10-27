# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetProtocolsResult',
    'AwaitableGetProtocolsResult',
    'get_protocols',
    'get_protocols_output',
]

@pulumi.output_type
class GetProtocolsResult:
    """
    A collection of values returned by getProtocols.
    """
    def __init__(__self__, id=None, output_file=None, protocols=None, type=None, zone_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if output_file and not isinstance(output_file, str):
            raise TypeError("Expected argument 'output_file' to be a str")
        pulumi.set(__self__, "output_file", output_file)
        if protocols and not isinstance(protocols, list):
            raise TypeError("Expected argument 'protocols' to be a list")
        pulumi.set(__self__, "protocols", protocols)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if zone_id and not isinstance(zone_id, str):
            raise TypeError("Expected argument 'zone_id' to be a str")
        pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def protocols(self) -> Sequence[str]:
        """
        A list of supported protocol type..
        """
        return pulumi.get(self, "protocols")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[str]:
        return pulumi.get(self, "zone_id")


class AwaitableGetProtocolsResult(GetProtocolsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProtocolsResult(
            id=self.id,
            output_file=self.output_file,
            protocols=self.protocols,
            type=self.type,
            zone_id=self.zone_id)


def get_protocols(output_file: Optional[str] = None,
                  type: Optional[str] = None,
                  zone_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProtocolsResult:
    """
    Provide  a data source to retrieve the type of protocol used to create NAS file system.

    > **NOTE:** Available in 1.42.0

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.nas.get_protocols(output_file="protocols.txt",
        type="Performance",
        zone_id="cn-beijing-e")
    pulumi.export("nasProtocolsProtocol", default.protocols[0])
    ```


    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str type: The file system type. Valid Values: `Performance` and `Capacity`.
    :param str zone_id: String to filter results by zone id.
    """
    __args__ = dict()
    __args__['outputFile'] = output_file
    __args__['type'] = type
    __args__['zoneId'] = zone_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:nas/getProtocols:getProtocols', __args__, opts=opts, typ=GetProtocolsResult).value

    return AwaitableGetProtocolsResult(
        id=pulumi.get(__ret__, 'id'),
        output_file=pulumi.get(__ret__, 'output_file'),
        protocols=pulumi.get(__ret__, 'protocols'),
        type=pulumi.get(__ret__, 'type'),
        zone_id=pulumi.get(__ret__, 'zone_id'))


@_utilities.lift_output_func(get_protocols)
def get_protocols_output(output_file: Optional[pulumi.Input[Optional[str]]] = None,
                         type: Optional[pulumi.Input[str]] = None,
                         zone_id: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProtocolsResult]:
    """
    Provide  a data source to retrieve the type of protocol used to create NAS file system.

    > **NOTE:** Available in 1.42.0

    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    default = alicloud.nas.get_protocols(output_file="protocols.txt",
        type="Performance",
        zone_id="cn-beijing-e")
    pulumi.export("nasProtocolsProtocol", default.protocols[0])
    ```


    :param str output_file: File name where to save data source results (after running `pulumi preview`).
    :param str type: The file system type. Valid Values: `Performance` and `Capacity`.
    :param str zone_id: String to filter results by zone id.
    """
    ...
