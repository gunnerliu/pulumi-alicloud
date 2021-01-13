# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = [
    'EndpointGroupEndpointConfigurationArgs',
    'EndpointGroupPortOverridesArgs',
    'ListenerCertificateArgs',
    'ListenerPortRangeArgs',
]

@pulumi.input_type
class EndpointGroupEndpointConfigurationArgs:
    def __init__(__self__, *,
                 endpoint: pulumi.Input[str],
                 type: pulumi.Input[str],
                 weight: pulumi.Input[int],
                 enable_clientip_preservation: Optional[pulumi.Input[bool]] = None,
                 probe_port: Optional[pulumi.Input[int]] = None,
                 probe_protocol: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] endpoint: The IP address or domain name of Endpoint N in the endpoint group.
        :param pulumi.Input[str] type: The type of Endpoint N in the endpoint group. Valid values: `Domain`: a custom domain name, `Ip`: a custom IP address, `PublicIp`: an Alibaba Cloud public IP address, `ECS`: an Alibaba Cloud Elastic Compute Service (ECS) instance, `SLB`: an Alibaba Cloud Server Load Balancer (SLB) instance.
        :param pulumi.Input[int] weight: The weight of Endpoint N in the endpoint group.
        :param pulumi.Input[bool] enable_clientip_preservation: Indicates whether client IP addresses are reserved. Valid values: `true`: Client IP addresses are reserved, `false`: Client IP addresses are not reserved. Default value is `false`.
        :param pulumi.Input[int] probe_port: Probe Port.
        :param pulumi.Input[str] probe_protocol: Probe Protocol.
        """
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "weight", weight)
        if enable_clientip_preservation is not None:
            pulumi.set(__self__, "enable_clientip_preservation", enable_clientip_preservation)
        if probe_port is not None:
            pulumi.set(__self__, "probe_port", probe_port)
        if probe_protocol is not None:
            pulumi.set(__self__, "probe_protocol", probe_protocol)

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Input[str]:
        """
        The IP address or domain name of Endpoint N in the endpoint group.
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of Endpoint N in the endpoint group. Valid values: `Domain`: a custom domain name, `Ip`: a custom IP address, `PublicIp`: an Alibaba Cloud public IP address, `ECS`: an Alibaba Cloud Elastic Compute Service (ECS) instance, `SLB`: an Alibaba Cloud Server Load Balancer (SLB) instance.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def weight(self) -> pulumi.Input[int]:
        """
        The weight of Endpoint N in the endpoint group.
        """
        return pulumi.get(self, "weight")

    @weight.setter
    def weight(self, value: pulumi.Input[int]):
        pulumi.set(self, "weight", value)

    @property
    @pulumi.getter(name="enableClientipPreservation")
    def enable_clientip_preservation(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether client IP addresses are reserved. Valid values: `true`: Client IP addresses are reserved, `false`: Client IP addresses are not reserved. Default value is `false`.
        """
        return pulumi.get(self, "enable_clientip_preservation")

    @enable_clientip_preservation.setter
    def enable_clientip_preservation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_clientip_preservation", value)

    @property
    @pulumi.getter(name="probePort")
    def probe_port(self) -> Optional[pulumi.Input[int]]:
        """
        Probe Port.
        """
        return pulumi.get(self, "probe_port")

    @probe_port.setter
    def probe_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "probe_port", value)

    @property
    @pulumi.getter(name="probeProtocol")
    def probe_protocol(self) -> Optional[pulumi.Input[str]]:
        """
        Probe Protocol.
        """
        return pulumi.get(self, "probe_protocol")

    @probe_protocol.setter
    def probe_protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "probe_protocol", value)


@pulumi.input_type
class EndpointGroupPortOverridesArgs:
    def __init__(__self__, *,
                 endpoint_port: Optional[pulumi.Input[int]] = None,
                 listener_port: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] endpoint_port: Forwarding port.
        :param pulumi.Input[int] listener_port: Listener port.
        """
        if endpoint_port is not None:
            pulumi.set(__self__, "endpoint_port", endpoint_port)
        if listener_port is not None:
            pulumi.set(__self__, "listener_port", listener_port)

    @property
    @pulumi.getter(name="endpointPort")
    def endpoint_port(self) -> Optional[pulumi.Input[int]]:
        """
        Forwarding port.
        """
        return pulumi.get(self, "endpoint_port")

    @endpoint_port.setter
    def endpoint_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "endpoint_port", value)

    @property
    @pulumi.getter(name="listenerPort")
    def listener_port(self) -> Optional[pulumi.Input[int]]:
        """
        Listener port.
        """
        return pulumi.get(self, "listener_port")

    @listener_port.setter
    def listener_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "listener_port", value)


@pulumi.input_type
class ListenerCertificateArgs:
    def __init__(__self__, *,
                 id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] id: The id of the certificate.
        """
        if id is not None:
            pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def id(self) -> Optional[pulumi.Input[str]]:
        """
        The id of the certificate.
        """
        return pulumi.get(self, "id")

    @id.setter
    def id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "id", value)


@pulumi.input_type
class ListenerPortRangeArgs:
    def __init__(__self__, *,
                 from_port: pulumi.Input[int],
                 to_port: pulumi.Input[int]):
        """
        :param pulumi.Input[int] from_port: The initial listening port used to receive requests and forward them to terminal nodes.
        :param pulumi.Input[int] to_port: The end listening port used to receive requests and forward them to terminal nodes.
        """
        pulumi.set(__self__, "from_port", from_port)
        pulumi.set(__self__, "to_port", to_port)

    @property
    @pulumi.getter(name="fromPort")
    def from_port(self) -> pulumi.Input[int]:
        """
        The initial listening port used to receive requests and forward them to terminal nodes.
        """
        return pulumi.get(self, "from_port")

    @from_port.setter
    def from_port(self, value: pulumi.Input[int]):
        pulumi.set(self, "from_port", value)

    @property
    @pulumi.getter(name="toPort")
    def to_port(self) -> pulumi.Input[int]:
        """
        The end listening port used to receive requests and forward them to terminal nodes.
        """
        return pulumi.get(self, "to_port")

    @to_port.setter
    def to_port(self, value: pulumi.Input[int]):
        pulumi.set(self, "to_port", value)

