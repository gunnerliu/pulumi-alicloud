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
    'DomainResourceProxyType',
    'SchedulerRuleRule',
    'GetDdosBgpInstancesInstanceResult',
    'GetDdosCooDomainResourcesResourceResult',
    'GetDdosCooDomainResourcesResourceProxyTypeResult',
    'GetDdosCooInstancesInstanceResult',
    'GetDdosCooPortsPortResult',
]

@pulumi.output_type
class DomainResourceProxyType(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "proxyPorts":
            suggest = "proxy_ports"
        elif key == "proxyType":
            suggest = "proxy_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainResourceProxyType. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainResourceProxyType.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainResourceProxyType.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 proxy_ports: Optional[Sequence[int]] = None,
                 proxy_type: Optional[str] = None):
        """
        :param Sequence[int] proxy_ports: the port number. This field is required and must be an integer.
        :param str proxy_type: the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
        """
        if proxy_ports is not None:
            pulumi.set(__self__, "proxy_ports", proxy_ports)
        if proxy_type is not None:
            pulumi.set(__self__, "proxy_type", proxy_type)

    @property
    @pulumi.getter(name="proxyPorts")
    def proxy_ports(self) -> Optional[Sequence[int]]:
        """
        the port number. This field is required and must be an integer.
        """
        return pulumi.get(self, "proxy_ports")

    @property
    @pulumi.getter(name="proxyType")
    def proxy_type(self) -> Optional[str]:
        """
        the protocol type. This field is required and must be a string. Valid values: `http`, `https`, `websocket`, and `websockets`.
        """
        return pulumi.get(self, "proxy_type")


@pulumi.output_type
class SchedulerRuleRule(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "regionId":
            suggest = "region_id"
        elif key == "valueType":
            suggest = "value_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in SchedulerRuleRule. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        SchedulerRuleRule.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        SchedulerRuleRule.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 priority: Optional[int] = None,
                 region_id: Optional[str] = None,
                 status: Optional[int] = None,
                 type: Optional[str] = None,
                 value: Optional[str] = None,
                 value_type: Optional[int] = None):
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if region_id is not None:
            pulumi.set(__self__, "region_id", region_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if value is not None:
            pulumi.set(__self__, "value", value)
        if value_type is not None:
            pulumi.set(__self__, "value_type", value_type)

    @property
    @pulumi.getter
    def priority(self) -> Optional[int]:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> Optional[str]:
        return pulumi.get(self, "region_id")

    @property
    @pulumi.getter
    def status(self) -> Optional[int]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> Optional[str]:
        return pulumi.get(self, "value")

    @property
    @pulumi.getter(name="valueType")
    def value_type(self) -> Optional[int]:
        return pulumi.get(self, "value_type")


@pulumi.output_type
class GetDdosBgpInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 bandwidth: int,
                 base_bandwidth: int,
                 id: str,
                 ip_count: int,
                 ip_type: str,
                 name: str,
                 region: str,
                 type: str):
        """
        :param int bandwidth: The instance's elastic defend bandwidth.
        :param int base_bandwidth: The instance's base defend bandwidth.
        :param str id: The instance's id.
        :param int ip_count: The instance's count of ip config.
        :param str ip_type: The instance's IP version.
        :param str name: The instance's remark.
        :param str region: A region of instance.
        :param str type: The instance's type.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        pulumi.set(__self__, "base_bandwidth", base_bandwidth)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "ip_count", ip_count)
        pulumi.set(__self__, "ip_type", ip_type)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def bandwidth(self) -> int:
        """
        The instance's elastic defend bandwidth.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="baseBandwidth")
    def base_bandwidth(self) -> int:
        """
        The instance's base defend bandwidth.
        """
        return pulumi.get(self, "base_bandwidth")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The instance's id.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipCount")
    def ip_count(self) -> int:
        """
        The instance's count of ip config.
        """
        return pulumi.get(self, "ip_count")

    @property
    @pulumi.getter(name="ipType")
    def ip_type(self) -> str:
        """
        The instance's IP version.
        """
        return pulumi.get(self, "ip_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The instance's remark.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        A region of instance.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The instance's type.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class GetDdosCooDomainResourcesResourceResult(dict):
    def __init__(__self__, *,
                 black_lists: Sequence[str],
                 cc_enabled: bool,
                 cc_rule_enabled: bool,
                 cc_template: str,
                 cert_name: str,
                 domain: str,
                 http2_enable: bool,
                 https_ext: str,
                 id: str,
                 instance_ids: Sequence[str],
                 policy_mode: str,
                 proxy_enabled: bool,
                 proxy_types: Sequence['outputs.GetDdosCooDomainResourcesResourceProxyTypeResult'],
                 real_servers: Sequence[str],
                 rs_type: int,
                 ssl_ciphers: str,
                 ssl_protocols: str,
                 white_lists: Sequence[str]):
        """
        :param Sequence[str] black_lists: The IP addresses in the blacklist for the domain name.
        :param bool cc_enabled: Whether frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
        :param bool cc_rule_enabled: Whether custom frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
        :param str cc_template: The mode of the Frequency Control policy.
        :param str cert_name: The name of the certificate.
        :param str domain: The domain name of the website that you want to add to the instance.
        :param bool http2_enable: Whether Http2.0 is enabled.
        :param str https_ext: The advanced HTTPS settings.
        :param str id: The ID of the Domain Resource.
        :param Sequence[str] instance_ids: A list ID of instance that you want to associate.
        :param str policy_mode: The type of backload algorithm.
        :param bool proxy_enabled: Whether the website service forwarding rules have been turned on.
        :param Sequence['GetDdosCooDomainResourcesResourceProxyTypeArgs'] proxy_types: Protocol type and port number information.
        :param Sequence[str] real_servers: Server address information of the source station.
        :param int rs_type: Server address type.
        :param str ssl_ciphers: The type of the cipher suite.
        :param str ssl_protocols: The version of the TLS protocol.
        :param Sequence[str] white_lists: The IP addresses in the whitelist for the domain name.
        """
        pulumi.set(__self__, "black_lists", black_lists)
        pulumi.set(__self__, "cc_enabled", cc_enabled)
        pulumi.set(__self__, "cc_rule_enabled", cc_rule_enabled)
        pulumi.set(__self__, "cc_template", cc_template)
        pulumi.set(__self__, "cert_name", cert_name)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "http2_enable", http2_enable)
        pulumi.set(__self__, "https_ext", https_ext)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_ids", instance_ids)
        pulumi.set(__self__, "policy_mode", policy_mode)
        pulumi.set(__self__, "proxy_enabled", proxy_enabled)
        pulumi.set(__self__, "proxy_types", proxy_types)
        pulumi.set(__self__, "real_servers", real_servers)
        pulumi.set(__self__, "rs_type", rs_type)
        pulumi.set(__self__, "ssl_ciphers", ssl_ciphers)
        pulumi.set(__self__, "ssl_protocols", ssl_protocols)
        pulumi.set(__self__, "white_lists", white_lists)

    @property
    @pulumi.getter(name="blackLists")
    def black_lists(self) -> Sequence[str]:
        """
        The IP addresses in the blacklist for the domain name.
        """
        return pulumi.get(self, "black_lists")

    @property
    @pulumi.getter(name="ccEnabled")
    def cc_enabled(self) -> bool:
        """
        Whether frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
        """
        return pulumi.get(self, "cc_enabled")

    @property
    @pulumi.getter(name="ccRuleEnabled")
    def cc_rule_enabled(self) -> bool:
        """
        Whether custom frequency control guard (CC guard) is enabled. Values: `True`: Opened, `False`: Not enabled.
        """
        return pulumi.get(self, "cc_rule_enabled")

    @property
    @pulumi.getter(name="ccTemplate")
    def cc_template(self) -> str:
        """
        The mode of the Frequency Control policy.
        """
        return pulumi.get(self, "cc_template")

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> str:
        """
        The name of the certificate.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        The domain name of the website that you want to add to the instance.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="http2Enable")
    def http2_enable(self) -> bool:
        """
        Whether Http2.0 is enabled.
        """
        return pulumi.get(self, "http2_enable")

    @property
    @pulumi.getter(name="httpsExt")
    def https_ext(self) -> str:
        """
        The advanced HTTPS settings.
        """
        return pulumi.get(self, "https_ext")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Domain Resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Sequence[str]:
        """
        A list ID of instance that you want to associate.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="policyMode")
    def policy_mode(self) -> str:
        """
        The type of backload algorithm.
        """
        return pulumi.get(self, "policy_mode")

    @property
    @pulumi.getter(name="proxyEnabled")
    def proxy_enabled(self) -> bool:
        """
        Whether the website service forwarding rules have been turned on.
        """
        return pulumi.get(self, "proxy_enabled")

    @property
    @pulumi.getter(name="proxyTypes")
    def proxy_types(self) -> Sequence['outputs.GetDdosCooDomainResourcesResourceProxyTypeResult']:
        """
        Protocol type and port number information.
        """
        return pulumi.get(self, "proxy_types")

    @property
    @pulumi.getter(name="realServers")
    def real_servers(self) -> Sequence[str]:
        """
        Server address information of the source station.
        """
        return pulumi.get(self, "real_servers")

    @property
    @pulumi.getter(name="rsType")
    def rs_type(self) -> int:
        """
        Server address type.
        """
        return pulumi.get(self, "rs_type")

    @property
    @pulumi.getter(name="sslCiphers")
    def ssl_ciphers(self) -> str:
        """
        The type of the cipher suite.
        """
        return pulumi.get(self, "ssl_ciphers")

    @property
    @pulumi.getter(name="sslProtocols")
    def ssl_protocols(self) -> str:
        """
        The version of the TLS protocol.
        """
        return pulumi.get(self, "ssl_protocols")

    @property
    @pulumi.getter(name="whiteLists")
    def white_lists(self) -> Sequence[str]:
        """
        The IP addresses in the whitelist for the domain name.
        """
        return pulumi.get(self, "white_lists")


@pulumi.output_type
class GetDdosCooDomainResourcesResourceProxyTypeResult(dict):
    def __init__(__self__, *,
                 proxy_ports: Sequence[int],
                 proxy_type: str):
        """
        :param Sequence[int] proxy_ports: The forwarding port.
        :param str proxy_type: Protocol type.
        """
        pulumi.set(__self__, "proxy_ports", proxy_ports)
        pulumi.set(__self__, "proxy_type", proxy_type)

    @property
    @pulumi.getter(name="proxyPorts")
    def proxy_ports(self) -> Sequence[int]:
        """
        The forwarding port.
        """
        return pulumi.get(self, "proxy_ports")

    @property
    @pulumi.getter(name="proxyType")
    def proxy_type(self) -> str:
        """
        Protocol type.
        """
        return pulumi.get(self, "proxy_type")


@pulumi.output_type
class GetDdosCooInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 bandwidth: int,
                 base_bandwidth: int,
                 create_time: int,
                 debt_status: int,
                 domain_count: int,
                 edition: int,
                 enabled: int,
                 expire_time: int,
                 id: str,
                 ip_mode: str,
                 ip_version: str,
                 name: str,
                 port_count: int,
                 remark: str,
                 service_bandwidth: int,
                 status: int):
        """
        :param int bandwidth: The instance's elastic defend bandwidth.
        :param int base_bandwidth: The instance's base defend bandwidth.
        :param int create_time: The creation time of the instance.
        :param int debt_status: The debt status of the instance.
        :param int domain_count: The instance's count of domain retransmission config.
        :param int edition: The edition of the instance. The Valid Values : `0`, `1`, `2`, `9`.
        :param int enabled: The enabled of the instance. The Valid Values : `0`, `1`.
        :param int expire_time: The expiry time of the instance.
        :param str id: The instance's id.
        :param str ip_mode: The ip mode of the instance. The Valid Values : `fnat`, `v6tov4`.
        :param str ip_version: The ip version of the instance. The Valid Values : `Ipv4`, `Ipv6`.
        :param str name: The instance's remark.
        :param int port_count: The instance's count of port retransmission config.
        :param str remark: The remark of the instance.
        :param int service_bandwidth: The instance's business bandwidth.
        :param int status: The status of the instance. The Valid Values : `1`, `2`.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        pulumi.set(__self__, "base_bandwidth", base_bandwidth)
        pulumi.set(__self__, "create_time", create_time)
        pulumi.set(__self__, "debt_status", debt_status)
        pulumi.set(__self__, "domain_count", domain_count)
        pulumi.set(__self__, "edition", edition)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "expire_time", expire_time)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "ip_mode", ip_mode)
        pulumi.set(__self__, "ip_version", ip_version)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "port_count", port_count)
        pulumi.set(__self__, "remark", remark)
        pulumi.set(__self__, "service_bandwidth", service_bandwidth)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def bandwidth(self) -> int:
        """
        The instance's elastic defend bandwidth.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="baseBandwidth")
    def base_bandwidth(self) -> int:
        """
        The instance's base defend bandwidth.
        """
        return pulumi.get(self, "base_bandwidth")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> int:
        """
        The creation time of the instance.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="debtStatus")
    def debt_status(self) -> int:
        """
        The debt status of the instance.
        """
        return pulumi.get(self, "debt_status")

    @property
    @pulumi.getter(name="domainCount")
    def domain_count(self) -> int:
        """
        The instance's count of domain retransmission config.
        """
        return pulumi.get(self, "domain_count")

    @property
    @pulumi.getter
    def edition(self) -> int:
        """
        The edition of the instance. The Valid Values : `0`, `1`, `2`, `9`.
        """
        return pulumi.get(self, "edition")

    @property
    @pulumi.getter
    def enabled(self) -> int:
        """
        The enabled of the instance. The Valid Values : `0`, `1`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="expireTime")
    def expire_time(self) -> int:
        """
        The expiry time of the instance.
        """
        return pulumi.get(self, "expire_time")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The instance's id.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipMode")
    def ip_mode(self) -> str:
        """
        The ip mode of the instance. The Valid Values : `fnat`, `v6tov4`.
        """
        return pulumi.get(self, "ip_mode")

    @property
    @pulumi.getter(name="ipVersion")
    def ip_version(self) -> str:
        """
        The ip version of the instance. The Valid Values : `Ipv4`, `Ipv6`.
        """
        return pulumi.get(self, "ip_version")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The instance's remark.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="portCount")
    def port_count(self) -> int:
        """
        The instance's count of port retransmission config.
        """
        return pulumi.get(self, "port_count")

    @property
    @pulumi.getter
    def remark(self) -> str:
        """
        The remark of the instance.
        """
        return pulumi.get(self, "remark")

    @property
    @pulumi.getter(name="serviceBandwidth")
    def service_bandwidth(self) -> int:
        """
        The instance's business bandwidth.
        """
        return pulumi.get(self, "service_bandwidth")

    @property
    @pulumi.getter
    def status(self) -> int:
        """
        The status of the instance. The Valid Values : `1`, `2`.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDdosCooPortsPortResult(dict):
    def __init__(__self__, *,
                 backend_port: str,
                 frontend_port: str,
                 frontend_protocol: str,
                 id: str,
                 instance_id: str,
                 real_servers: Sequence[str]):
        """
        :param str backend_port: The source station port.
        :param str frontend_port: The forwarding port.
        :param str frontend_protocol: The forwarding protocol.
        :param str id: The ID of the Port.
        :param str instance_id: The Ddoscoo instance ID.
        :param Sequence[str] real_servers: List of source IP addresses.
        """
        pulumi.set(__self__, "backend_port", backend_port)
        pulumi.set(__self__, "frontend_port", frontend_port)
        pulumi.set(__self__, "frontend_protocol", frontend_protocol)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "real_servers", real_servers)

    @property
    @pulumi.getter(name="backendPort")
    def backend_port(self) -> str:
        """
        The source station port.
        """
        return pulumi.get(self, "backend_port")

    @property
    @pulumi.getter(name="frontendPort")
    def frontend_port(self) -> str:
        """
        The forwarding port.
        """
        return pulumi.get(self, "frontend_port")

    @property
    @pulumi.getter(name="frontendProtocol")
    def frontend_protocol(self) -> str:
        """
        The forwarding protocol.
        """
        return pulumi.get(self, "frontend_protocol")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Port.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The Ddoscoo instance ID.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="realServers")
    def real_servers(self) -> Sequence[str]:
        """
        List of source IP addresses.
        """
        return pulumi.get(self, "real_servers")


