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
    'GetDeliveryChannelsResult',
    'AwaitableGetDeliveryChannelsResult',
    'get_delivery_channels',
    'get_delivery_channels_output',
]

@pulumi.output_type
class GetDeliveryChannelsResult:
    """
    A collection of values returned by getDeliveryChannels.
    """
    def __init__(__self__, channels=None, id=None, ids=None, name_regex=None, names=None, output_file=None, status=None):
        if channels and not isinstance(channels, list):
            raise TypeError("Expected argument 'channels' to be a list")
        pulumi.set(__self__, "channels", channels)
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
        if status and not isinstance(status, int):
            raise TypeError("Expected argument 'status' to be a int")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def channels(self) -> Sequence['outputs.GetDeliveryChannelsChannelResult']:
        """
        A list of Config Delivery Channels. Each element contains the following attributes:
        """
        return pulumi.get(self, "channels")

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
        A list of Config Delivery Channel IDs.
        """
        return pulumi.get(self, "ids")

    @property
    @pulumi.getter(name="nameRegex")
    def name_regex(self) -> Optional[str]:
        return pulumi.get(self, "name_regex")

    @property
    @pulumi.getter
    def names(self) -> Sequence[str]:
        """
        A list of Config Delivery Channel names.
        """
        return pulumi.get(self, "names")

    @property
    @pulumi.getter(name="outputFile")
    def output_file(self) -> Optional[str]:
        return pulumi.get(self, "output_file")

    @property
    @pulumi.getter
    def status(self) -> Optional[int]:
        """
        The status of the delivery channel.
        """
        return pulumi.get(self, "status")


class AwaitableGetDeliveryChannelsResult(GetDeliveryChannelsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeliveryChannelsResult(
            channels=self.channels,
            id=self.id,
            ids=self.ids,
            name_regex=self.name_regex,
            names=self.names,
            output_file=self.output_file,
            status=self.status)


def get_delivery_channels(ids: Optional[Sequence[str]] = None,
                          name_regex: Optional[str] = None,
                          output_file: Optional[str] = None,
                          status: Optional[int] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeliveryChannelsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_delivery_channels(ids=["cdc-49a2ad756057********"],
        name_regex="tftest")
    pulumi.export("firstConfigDeliveryChannelId", example.channels[0].id)
    ```


    :param Sequence[str] ids: A list of Config Delivery Channel IDs.
    :param str name_regex: A regex string to filter results by delivery channel name.
    :param int status: The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
    """
    __args__ = dict()
    __args__['ids'] = ids
    __args__['nameRegex'] = name_regex
    __args__['outputFile'] = output_file
    __args__['status'] = status
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('alicloud:cfg/getDeliveryChannels:getDeliveryChannels', __args__, opts=opts, typ=GetDeliveryChannelsResult).value

    return AwaitableGetDeliveryChannelsResult(
        channels=__ret__.channels,
        id=__ret__.id,
        ids=__ret__.ids,
        name_regex=__ret__.name_regex,
        names=__ret__.names,
        output_file=__ret__.output_file,
        status=__ret__.status)


@_utilities.lift_output_func(get_delivery_channels)
def get_delivery_channels_output(ids: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 name_regex: Optional[pulumi.Input[Optional[str]]] = None,
                                 output_file: Optional[pulumi.Input[Optional[str]]] = None,
                                 status: Optional[pulumi.Input[Optional[int]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeliveryChannelsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_alicloud as alicloud

    example = alicloud.cfg.get_delivery_channels(ids=["cdc-49a2ad756057********"],
        name_regex="tftest")
    pulumi.export("firstConfigDeliveryChannelId", example.channels[0].id)
    ```


    :param Sequence[str] ids: A list of Config Delivery Channel IDs.
    :param str name_regex: A regex string to filter results by delivery channel name.
    :param int status: The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
    """
    ...
