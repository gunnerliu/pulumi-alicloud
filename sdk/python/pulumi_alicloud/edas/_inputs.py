# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'K8sSlbAttachmentSlbConfigArgs',
    'K8sSlbAttachmentSlbConfigPortMappingArgs',
    'K8sSlbAttachmentSlbConfigPortMappingServicePortArgs',
]

@pulumi.input_type
class K8sSlbAttachmentSlbConfigArgs:
    def __init__(__self__, *,
                 port_mappings: pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingArgs']]],
                 scheduler: pulumi.Input[str],
                 type: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 slb_id: Optional[pulumi.Input[str]] = None,
                 specification: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingArgs']]] port_mappings: The port configuration for SLB instance, which is supported for multiple configurations. See `port_mappings` below.
        :param pulumi.Input[str] scheduler: The scheduler policy of SLB configuration, values can be 'rr'(round-robin) or 'wrr'(weighted round-robin).
        :param pulumi.Input[str] type: The type of SLB instance, values can be 'internet' or 'intranet'.
        :param pulumi.Input[str] name: The name of this SLB configuration, empty for auto-generated by EDAS server.
        :param pulumi.Input[str] slb_id: The ID of your SLB instance, if value is empty which means EDAS will purchase an SLB instance with 'specification' field.
        :param pulumi.Input[str] specification: The instance specification of SLB, values can be found [here](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2#t4182.html), empty for 'slb.s1.small'.
        """
        K8sSlbAttachmentSlbConfigArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            port_mappings=port_mappings,
            scheduler=scheduler,
            type=type,
            name=name,
            slb_id=slb_id,
            specification=specification,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             port_mappings: Optional[pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingArgs']]]] = None,
             scheduler: Optional[pulumi.Input[str]] = None,
             type: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             slb_id: Optional[pulumi.Input[str]] = None,
             specification: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if port_mappings is None and 'portMappings' in kwargs:
            port_mappings = kwargs['portMappings']
        if port_mappings is None:
            raise TypeError("Missing 'port_mappings' argument")
        if scheduler is None:
            raise TypeError("Missing 'scheduler' argument")
        if type is None:
            raise TypeError("Missing 'type' argument")
        if slb_id is None and 'slbId' in kwargs:
            slb_id = kwargs['slbId']

        _setter("port_mappings", port_mappings)
        _setter("scheduler", scheduler)
        _setter("type", type)
        if name is not None:
            _setter("name", name)
        if slb_id is not None:
            _setter("slb_id", slb_id)
        if specification is not None:
            _setter("specification", specification)

    @property
    @pulumi.getter(name="portMappings")
    def port_mappings(self) -> pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingArgs']]]:
        """
        The port configuration for SLB instance, which is supported for multiple configurations. See `port_mappings` below.
        """
        return pulumi.get(self, "port_mappings")

    @port_mappings.setter
    def port_mappings(self, value: pulumi.Input[Sequence[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingArgs']]]):
        pulumi.set(self, "port_mappings", value)

    @property
    @pulumi.getter
    def scheduler(self) -> pulumi.Input[str]:
        """
        The scheduler policy of SLB configuration, values can be 'rr'(round-robin) or 'wrr'(weighted round-robin).
        """
        return pulumi.get(self, "scheduler")

    @scheduler.setter
    def scheduler(self, value: pulumi.Input[str]):
        pulumi.set(self, "scheduler", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of SLB instance, values can be 'internet' or 'intranet'.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of this SLB configuration, empty for auto-generated by EDAS server.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of your SLB instance, if value is empty which means EDAS will purchase an SLB instance with 'specification' field.
        """
        return pulumi.get(self, "slb_id")

    @slb_id.setter
    def slb_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slb_id", value)

    @property
    @pulumi.getter
    def specification(self) -> Optional[pulumi.Input[str]]:
        """
        The instance specification of SLB, values can be found [here](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2#t4182.html), empty for 'slb.s1.small'.
        """
        return pulumi.get(self, "specification")

    @specification.setter
    def specification(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "specification", value)


@pulumi.input_type
class K8sSlbAttachmentSlbConfigPortMappingArgs:
    def __init__(__self__, *,
                 loadbalancer_protocol: pulumi.Input[str],
                 service_port: pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingServicePortArgs'],
                 cert_id: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] loadbalancer_protocol: The protocol of SLB instance configuration, values can be 'TCP', 'HTTP' or 'HTTPS'.
        :param pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingServicePortArgs'] service_port: The backend k8s service configuration for SLB instance, which is supported for multiple configurations. See `service_port` below.
        :param pulumi.Input[str] cert_id: The ID of your tls certification, this is used for 'HTTPS' protocol only.
        """
        K8sSlbAttachmentSlbConfigPortMappingArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            loadbalancer_protocol=loadbalancer_protocol,
            service_port=service_port,
            cert_id=cert_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             loadbalancer_protocol: Optional[pulumi.Input[str]] = None,
             service_port: Optional[pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingServicePortArgs']] = None,
             cert_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if loadbalancer_protocol is None and 'loadbalancerProtocol' in kwargs:
            loadbalancer_protocol = kwargs['loadbalancerProtocol']
        if loadbalancer_protocol is None:
            raise TypeError("Missing 'loadbalancer_protocol' argument")
        if service_port is None and 'servicePort' in kwargs:
            service_port = kwargs['servicePort']
        if service_port is None:
            raise TypeError("Missing 'service_port' argument")
        if cert_id is None and 'certId' in kwargs:
            cert_id = kwargs['certId']

        _setter("loadbalancer_protocol", loadbalancer_protocol)
        _setter("service_port", service_port)
        if cert_id is not None:
            _setter("cert_id", cert_id)

    @property
    @pulumi.getter(name="loadbalancerProtocol")
    def loadbalancer_protocol(self) -> pulumi.Input[str]:
        """
        The protocol of SLB instance configuration, values can be 'TCP', 'HTTP' or 'HTTPS'.
        """
        return pulumi.get(self, "loadbalancer_protocol")

    @loadbalancer_protocol.setter
    def loadbalancer_protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "loadbalancer_protocol", value)

    @property
    @pulumi.getter(name="servicePort")
    def service_port(self) -> pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingServicePortArgs']:
        """
        The backend k8s service configuration for SLB instance, which is supported for multiple configurations. See `service_port` below.
        """
        return pulumi.get(self, "service_port")

    @service_port.setter
    def service_port(self, value: pulumi.Input['K8sSlbAttachmentSlbConfigPortMappingServicePortArgs']):
        pulumi.set(self, "service_port", value)

    @property
    @pulumi.getter(name="certId")
    def cert_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of your tls certification, this is used for 'HTTPS' protocol only.
        """
        return pulumi.get(self, "cert_id")

    @cert_id.setter
    def cert_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cert_id", value)


@pulumi.input_type
class K8sSlbAttachmentSlbConfigPortMappingServicePortArgs:
    def __init__(__self__, *,
                 port: pulumi.Input[int],
                 protocol: pulumi.Input[str],
                 target_port: pulumi.Input[int]):
        """
        :param pulumi.Input[int] port: The port of k8s service, values should be within range [1, 65535].
        :param pulumi.Input[str] protocol: The protocol of k8s service, values can be 'TCP' or 'UDP'.
        :param pulumi.Input[int] target_port: The port of k8s pod, values should be within range [1, 65535].
        """
        K8sSlbAttachmentSlbConfigPortMappingServicePortArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            port=port,
            protocol=protocol,
            target_port=target_port,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             port: Optional[pulumi.Input[int]] = None,
             protocol: Optional[pulumi.Input[str]] = None,
             target_port: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if port is None:
            raise TypeError("Missing 'port' argument")
        if protocol is None:
            raise TypeError("Missing 'protocol' argument")
        if target_port is None and 'targetPort' in kwargs:
            target_port = kwargs['targetPort']
        if target_port is None:
            raise TypeError("Missing 'target_port' argument")

        _setter("port", port)
        _setter("protocol", protocol)
        _setter("target_port", target_port)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[int]:
        """
        The port of k8s service, values should be within range [1, 65535].
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Input[str]:
        """
        The protocol of k8s service, values can be 'TCP' or 'UDP'.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: pulumi.Input[str]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="targetPort")
    def target_port(self) -> pulumi.Input[int]:
        """
        The port of k8s pod, values should be within range [1, 65535].
        """
        return pulumi.get(self, "target_port")

    @target_port.setter
    def target_port(self, value: pulumi.Input[int]):
        pulumi.set(self, "target_port", value)


