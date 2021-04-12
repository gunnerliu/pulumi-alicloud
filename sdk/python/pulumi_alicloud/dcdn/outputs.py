# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'DomainSource',
    'GetDomainsDomainResult',
    'GetDomainsDomainSourceResult',
]

@pulumi.output_type
class DomainSource(dict):
    def __init__(__self__, *,
                 content: str,
                 type: str,
                 port: Optional[int] = None,
                 priority: Optional[str] = None,
                 weight: Optional[str] = None):
        """
        :param str content: The origin address.
        :param str type: The type of the origin. Valid values:
               `ipaddr`: The origin is configured using an IP address.
               `domain`: The origin is configured using a domain name.
               `oss`: The origin is configured using the Internet domain name of an Alibaba Cloud Object Storage Service (OSS) bucket.
        :param int port: The port number. Valid values: `443` and `80`. Default to `80`.
        :param str priority: The priority of the origin if multiple origins are specified. Default to `20`.
        :param str weight: The weight of the origin if multiple origins are specified. Default to `10`.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "type", type)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The origin address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the origin. Valid values:
        `ipaddr`: The origin is configured using an IP address.
        `domain`: The origin is configured using a domain name.
        `oss`: The origin is configured using the Internet domain name of an Alibaba Cloud Object Storage Service (OSS) bucket.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The port number. Valid values: `443` and `80`. Default to `80`.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> Optional[str]:
        """
        The priority of the origin if multiple origins are specified. Default to `20`.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def weight(self) -> Optional[str]:
        """
        The weight of the origin if multiple origins are specified. Default to `10`.
        """
        return pulumi.get(self, "weight")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class GetDomainsDomainResult(dict):
    def __init__(__self__, *,
                 cert_name: str,
                 cname: str,
                 description: str,
                 domain_name: str,
                 gmt_modified: str,
                 id: str,
                 resource_group_id: str,
                 scope: str,
                 sources: Sequence['outputs.GetDomainsDomainSourceResult'],
                 ssl_protocol: str,
                 ssl_pub: str,
                 status: str):
        """
        :param str cert_name: Indicates the name of the certificate.
        :param str cname: The canonical name (CNAME) of the accelerated domain.
        :param str description: The reason that causes the review failure.
        :param str domain_name: The name of the DCDN Domain.
        :param str gmt_modified: The time when the accelerated domain was last modified.
        :param str id: The ID of the DCDN Domain.
        :param str resource_group_id: The ID of the resource group.
        :param str scope: The acceleration region.
        :param Sequence['GetDomainsDomainSourceArgs'] sources: The origin information.
        :param str ssl_protocol: Indicates whether the SSL certificate is enabled.
        :param str ssl_pub: Indicates the public key of the certificate.
        :param str status: The status of DCDN Domain.
        """
        pulumi.set(__self__, "cert_name", cert_name)
        pulumi.set(__self__, "cname", cname)
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "domain_name", domain_name)
        pulumi.set(__self__, "gmt_modified", gmt_modified)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "resource_group_id", resource_group_id)
        pulumi.set(__self__, "scope", scope)
        pulumi.set(__self__, "sources", sources)
        pulumi.set(__self__, "ssl_protocol", ssl_protocol)
        pulumi.set(__self__, "ssl_pub", ssl_pub)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> str:
        """
        Indicates the name of the certificate.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter
    def cname(self) -> str:
        """
        The canonical name (CNAME) of the accelerated domain.
        """
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The reason that causes the review failure.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="domainName")
    def domain_name(self) -> str:
        """
        The name of the DCDN Domain.
        """
        return pulumi.get(self, "domain_name")

    @property
    @pulumi.getter(name="gmtModified")
    def gmt_modified(self) -> str:
        """
        The time when the accelerated domain was last modified.
        """
        return pulumi.get(self, "gmt_modified")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the DCDN Domain.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> str:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def scope(self) -> str:
        """
        The acceleration region.
        """
        return pulumi.get(self, "scope")

    @property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetDomainsDomainSourceResult']:
        """
        The origin information.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter(name="sslProtocol")
    def ssl_protocol(self) -> str:
        """
        Indicates whether the SSL certificate is enabled.
        """
        return pulumi.get(self, "ssl_protocol")

    @property
    @pulumi.getter(name="sslPub")
    def ssl_pub(self) -> str:
        """
        Indicates the public key of the certificate.
        """
        return pulumi.get(self, "ssl_pub")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of DCDN Domain.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetDomainsDomainSourceResult(dict):
    def __init__(__self__, *,
                 content: str,
                 enabled: str,
                 port: int,
                 priority: str,
                 type: str,
                 weight: str):
        """
        :param str content: The origin address.
        :param str enabled: The status of the origin.
        :param int port: The port number.
        :param str priority: The priority of the origin if multiple origins are specified.
        :param str type: The type of the origin. Valid values:
        :param str weight: The weight of the origin if multiple origins are specified.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "type", type)
        pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        The origin address.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def enabled(self) -> str:
        """
        The status of the origin.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port number.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> str:
        """
        The priority of the origin if multiple origins are specified.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the origin. Valid values:
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def weight(self) -> str:
        """
        The weight of the origin if multiple origins are specified.
        """
        return pulumi.get(self, "weight")


