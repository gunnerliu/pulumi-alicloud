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
    'DomainListenArgs',
    'DomainRedirectArgs',
    'DomainRedirectRequestHeaderArgs',
]

@pulumi.input_type
class DomainListenArgs:
    def __init__(__self__, *,
                 cert_id: Optional[pulumi.Input[str]] = None,
                 cipher_suite: Optional[pulumi.Input[int]] = None,
                 custom_ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 enable_tlsv3: Optional[pulumi.Input[bool]] = None,
                 exclusive_ip: Optional[pulumi.Input[bool]] = None,
                 focus_https: Optional[pulumi.Input[bool]] = None,
                 http2_enabled: Optional[pulumi.Input[bool]] = None,
                 http_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 https_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
                 ipv6_enabled: Optional[pulumi.Input[bool]] = None,
                 protection_resource: Optional[pulumi.Input[str]] = None,
                 tls_version: Optional[pulumi.Input[str]] = None,
                 xff_header_mode: Optional[pulumi.Input[int]] = None,
                 xff_headers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] cert_id: The ID of the certificate to be added. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol).
        :param pulumi.Input[int] cipher_suite: The type of encryption suite to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
               - **1**: indicates that all encryption suites are added.
               - **2**: indicates that a strong encryption package is added. You can select this value only if the value of **tls_version** is `tlsv1.2`.
               - **99**: indicates that a custom encryption suite is added.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_ciphers: The specific custom encryption suite to add.
        :param pulumi.Input[bool] enable_tlsv3: Whether TSL1.3 version is supported. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
               - **true**: indicates that TSL1.3 is supported.
               - **false**: indicates that TSL1.3 is not supported.
        :param pulumi.Input[bool] exclusive_ip: Whether to enable exclusive IP address. This parameter is used only when the value of **ipv6_enabled** is **false** (indicating that IPv6 is not enabled) and the value of **protection_resource** is **share** (indicating that a shared cluster is used). Value:
               - **true**: indicates that the exclusive IP address is enabled.
               - **false** (default): indicates that exclusive IP address is not enabled.
        :param pulumi.Input[bool] focus_https: Whether to enable the forced jump of HTTPS. This parameter is used only when the value of `https_ports` is not empty (indicating that the domain name uses HTTPS protocol) and the value of httports is empty (indicating that the domain name does not use HTTP protocol). Value:
               - **true**: indicates that HTTPS forced redirection is enabled.
               - **false**: indicates that HTTPS forced redirection is not enabled.
        :param pulumi.Input[bool] http2_enabled: Whether to turn on http2. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
               - **true:** indicates that HTTP2 is enabled.
               - **false** (default): indicates that HTTP2 is not enabled.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] http_ports: The listening port of the HTTP protocol.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] https_ports: The listening port of the HTTPS protocol.
        :param pulumi.Input[bool] ipv6_enabled: Whether IPv6 is turned on. Value:
               - **true**: indicates that IPv6 is enabled.
               - **false** (default): indicates that IPv6 is not enabled.
        :param pulumi.Input[str] protection_resource: The type of protection resource to use. Value:
               - **share** (default): indicates that a shared cluster is used.
               - **gslb**: indicates that the shared cluster intelligent load balancing is used.
        :param pulumi.Input[str] tls_version: The version of TLS to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value: **tlsv1**, **tlsv1.1**, **tlsv1.2**.
        :param pulumi.Input[int] xff_header_mode: WAF obtains the real IP address of the client. Value:
               - **0** (default): indicates that the client has not forwarded the traffic to WAF through other layer -7 agents.
               - **1**: indicates that the first value of the X-Forwarded-For(XFF) field in the WAF read request header is used as the client IP address.
               - **2**: indicates that the custom field value set by you in the WAF read request header is used as the client IP address.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] xff_headers: Set the list of custom fields used to obtain the client IP address.
        """
        DomainListenArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cert_id=cert_id,
            cipher_suite=cipher_suite,
            custom_ciphers=custom_ciphers,
            enable_tlsv3=enable_tlsv3,
            exclusive_ip=exclusive_ip,
            focus_https=focus_https,
            http2_enabled=http2_enabled,
            http_ports=http_ports,
            https_ports=https_ports,
            ipv6_enabled=ipv6_enabled,
            protection_resource=protection_resource,
            tls_version=tls_version,
            xff_header_mode=xff_header_mode,
            xff_headers=xff_headers,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cert_id: Optional[pulumi.Input[str]] = None,
             cipher_suite: Optional[pulumi.Input[int]] = None,
             custom_ciphers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             enable_tlsv3: Optional[pulumi.Input[bool]] = None,
             exclusive_ip: Optional[pulumi.Input[bool]] = None,
             focus_https: Optional[pulumi.Input[bool]] = None,
             http2_enabled: Optional[pulumi.Input[bool]] = None,
             http_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
             https_ports: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]] = None,
             ipv6_enabled: Optional[pulumi.Input[bool]] = None,
             protection_resource: Optional[pulumi.Input[str]] = None,
             tls_version: Optional[pulumi.Input[str]] = None,
             xff_header_mode: Optional[pulumi.Input[int]] = None,
             xff_headers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cert_id is None and 'certId' in kwargs:
            cert_id = kwargs['certId']
        if cipher_suite is None and 'cipherSuite' in kwargs:
            cipher_suite = kwargs['cipherSuite']
        if custom_ciphers is None and 'customCiphers' in kwargs:
            custom_ciphers = kwargs['customCiphers']
        if enable_tlsv3 is None and 'enableTlsv3' in kwargs:
            enable_tlsv3 = kwargs['enableTlsv3']
        if exclusive_ip is None and 'exclusiveIp' in kwargs:
            exclusive_ip = kwargs['exclusiveIp']
        if focus_https is None and 'focusHttps' in kwargs:
            focus_https = kwargs['focusHttps']
        if http2_enabled is None and 'http2Enabled' in kwargs:
            http2_enabled = kwargs['http2Enabled']
        if http_ports is None and 'httpPorts' in kwargs:
            http_ports = kwargs['httpPorts']
        if https_ports is None and 'httpsPorts' in kwargs:
            https_ports = kwargs['httpsPorts']
        if ipv6_enabled is None and 'ipv6Enabled' in kwargs:
            ipv6_enabled = kwargs['ipv6Enabled']
        if protection_resource is None and 'protectionResource' in kwargs:
            protection_resource = kwargs['protectionResource']
        if tls_version is None and 'tlsVersion' in kwargs:
            tls_version = kwargs['tlsVersion']
        if xff_header_mode is None and 'xffHeaderMode' in kwargs:
            xff_header_mode = kwargs['xffHeaderMode']
        if xff_headers is None and 'xffHeaders' in kwargs:
            xff_headers = kwargs['xffHeaders']

        if cert_id is not None:
            _setter("cert_id", cert_id)
        if cipher_suite is not None:
            _setter("cipher_suite", cipher_suite)
        if custom_ciphers is not None:
            _setter("custom_ciphers", custom_ciphers)
        if enable_tlsv3 is not None:
            _setter("enable_tlsv3", enable_tlsv3)
        if exclusive_ip is not None:
            _setter("exclusive_ip", exclusive_ip)
        if focus_https is not None:
            _setter("focus_https", focus_https)
        if http2_enabled is not None:
            _setter("http2_enabled", http2_enabled)
        if http_ports is not None:
            _setter("http_ports", http_ports)
        if https_ports is not None:
            _setter("https_ports", https_ports)
        if ipv6_enabled is not None:
            _setter("ipv6_enabled", ipv6_enabled)
        if protection_resource is not None:
            _setter("protection_resource", protection_resource)
        if tls_version is not None:
            _setter("tls_version", tls_version)
        if xff_header_mode is not None:
            _setter("xff_header_mode", xff_header_mode)
        if xff_headers is not None:
            _setter("xff_headers", xff_headers)

    @property
    @pulumi.getter(name="certId")
    def cert_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the certificate to be added. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol).
        """
        return pulumi.get(self, "cert_id")

    @cert_id.setter
    def cert_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cert_id", value)

    @property
    @pulumi.getter(name="cipherSuite")
    def cipher_suite(self) -> Optional[pulumi.Input[int]]:
        """
        The type of encryption suite to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
        - **1**: indicates that all encryption suites are added.
        - **2**: indicates that a strong encryption package is added. You can select this value only if the value of **tls_version** is `tlsv1.2`.
        - **99**: indicates that a custom encryption suite is added.
        """
        return pulumi.get(self, "cipher_suite")

    @cipher_suite.setter
    def cipher_suite(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cipher_suite", value)

    @property
    @pulumi.getter(name="customCiphers")
    def custom_ciphers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The specific custom encryption suite to add.
        """
        return pulumi.get(self, "custom_ciphers")

    @custom_ciphers.setter
    def custom_ciphers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_ciphers", value)

    @property
    @pulumi.getter(name="enableTlsv3")
    def enable_tlsv3(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether TSL1.3 version is supported. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
        - **true**: indicates that TSL1.3 is supported.
        - **false**: indicates that TSL1.3 is not supported.
        """
        return pulumi.get(self, "enable_tlsv3")

    @enable_tlsv3.setter
    def enable_tlsv3(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_tlsv3", value)

    @property
    @pulumi.getter(name="exclusiveIp")
    def exclusive_ip(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable exclusive IP address. This parameter is used only when the value of **ipv6_enabled** is **false** (indicating that IPv6 is not enabled) and the value of **protection_resource** is **share** (indicating that a shared cluster is used). Value:
        - **true**: indicates that the exclusive IP address is enabled.
        - **false** (default): indicates that exclusive IP address is not enabled.
        """
        return pulumi.get(self, "exclusive_ip")

    @exclusive_ip.setter
    def exclusive_ip(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "exclusive_ip", value)

    @property
    @pulumi.getter(name="focusHttps")
    def focus_https(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable the forced jump of HTTPS. This parameter is used only when the value of `https_ports` is not empty (indicating that the domain name uses HTTPS protocol) and the value of httports is empty (indicating that the domain name does not use HTTP protocol). Value:
        - **true**: indicates that HTTPS forced redirection is enabled.
        - **false**: indicates that HTTPS forced redirection is not enabled.
        """
        return pulumi.get(self, "focus_https")

    @focus_https.setter
    def focus_https(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "focus_https", value)

    @property
    @pulumi.getter(name="http2Enabled")
    def http2_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to turn on http2. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
        - **true:** indicates that HTTP2 is enabled.
        - **false** (default): indicates that HTTP2 is not enabled.
        """
        return pulumi.get(self, "http2_enabled")

    @http2_enabled.setter
    def http2_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "http2_enabled", value)

    @property
    @pulumi.getter(name="httpPorts")
    def http_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        The listening port of the HTTP protocol.
        """
        return pulumi.get(self, "http_ports")

    @http_ports.setter
    def http_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "http_ports", value)

    @property
    @pulumi.getter(name="httpsPorts")
    def https_ports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]:
        """
        The listening port of the HTTPS protocol.
        """
        return pulumi.get(self, "https_ports")

    @https_ports.setter
    def https_ports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[int]]]]):
        pulumi.set(self, "https_ports", value)

    @property
    @pulumi.getter(name="ipv6Enabled")
    def ipv6_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether IPv6 is turned on. Value:
        - **true**: indicates that IPv6 is enabled.
        - **false** (default): indicates that IPv6 is not enabled.
        """
        return pulumi.get(self, "ipv6_enabled")

    @ipv6_enabled.setter
    def ipv6_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ipv6_enabled", value)

    @property
    @pulumi.getter(name="protectionResource")
    def protection_resource(self) -> Optional[pulumi.Input[str]]:
        """
        The type of protection resource to use. Value:
        - **share** (default): indicates that a shared cluster is used.
        - **gslb**: indicates that the shared cluster intelligent load balancing is used.
        """
        return pulumi.get(self, "protection_resource")

    @protection_resource.setter
    def protection_resource(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protection_resource", value)

    @property
    @pulumi.getter(name="tlsVersion")
    def tls_version(self) -> Optional[pulumi.Input[str]]:
        """
        The version of TLS to add. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value: **tlsv1**, **tlsv1.1**, **tlsv1.2**.
        """
        return pulumi.get(self, "tls_version")

    @tls_version.setter
    def tls_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls_version", value)

    @property
    @pulumi.getter(name="xffHeaderMode")
    def xff_header_mode(self) -> Optional[pulumi.Input[int]]:
        """
        WAF obtains the real IP address of the client. Value:
        - **0** (default): indicates that the client has not forwarded the traffic to WAF through other layer -7 agents.
        - **1**: indicates that the first value of the X-Forwarded-For(XFF) field in the WAF read request header is used as the client IP address.
        - **2**: indicates that the custom field value set by you in the WAF read request header is used as the client IP address.
        """
        return pulumi.get(self, "xff_header_mode")

    @xff_header_mode.setter
    def xff_header_mode(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "xff_header_mode", value)

    @property
    @pulumi.getter(name="xffHeaders")
    def xff_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set the list of custom fields used to obtain the client IP address.
        """
        return pulumi.get(self, "xff_headers")

    @xff_headers.setter
    def xff_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "xff_headers", value)


@pulumi.input_type
class DomainRedirectArgs:
    def __init__(__self__, *,
                 loadbalance: pulumi.Input[str],
                 backends: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 connect_timeout: Optional[pulumi.Input[int]] = None,
                 focus_http_backend: Optional[pulumi.Input[bool]] = None,
                 keepalive: Optional[pulumi.Input[bool]] = None,
                 keepalive_requests: Optional[pulumi.Input[int]] = None,
                 keepalive_timeout: Optional[pulumi.Input[int]] = None,
                 read_timeout: Optional[pulumi.Input[int]] = None,
                 request_headers: Optional[pulumi.Input[Sequence[pulumi.Input['DomainRedirectRequestHeaderArgs']]]] = None,
                 retry: Optional[pulumi.Input[bool]] = None,
                 sni_enabled: Optional[pulumi.Input[bool]] = None,
                 sni_host: Optional[pulumi.Input[str]] = None,
                 write_timeout: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] loadbalance: The load balancing algorithm used when returning to the source. Value:
               - **iphash**: indicates the IPHash algorithm.
               - **roundRobin**: indicates the polling algorithm.
               - **leastTime**: indicates the Least Time algorithm.
               - This value can be selected only if the value of **protection_resource** is **gslb** (indicating that the protected resource type uses shared cluster intelligent load balancing).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] backends: The IP address of the origin server corresponding to the domain name or the back-to-origin domain name of the server.
        :param pulumi.Input[int] connect_timeout: Connection timeout. Unit: seconds, value range: 5~120.
        :param pulumi.Input[bool] focus_http_backend: Whether to enable forced HTTP back-to-origin. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
               - **true**: indicates that forced HTTP back-to-origin is enabled.
               - **false**: indicates that forced HTTP back-to-origin is not enabled.
        :param pulumi.Input[bool] keepalive: Open long connection, default true.
        :param pulumi.Input[int] keepalive_requests: Number of long connections,  default: `60`. range :60-1000.
        :param pulumi.Input[int] keepalive_timeout: Long connection over time, default: `15`. Range: 1-60.
        :param pulumi.Input[int] read_timeout: Read timeout duration. **Unit**: seconds, **Value range**: 5~1800.
        :param pulumi.Input[Sequence[pulumi.Input['DomainRedirectRequestHeaderArgs']]] request_headers: The traffic tag field and value of the domain name which used to mark the traffic processed by WAF. 
               It formats as `[{" k ":"_key_"," v ":"_value_"}]`. Where the `k` represents the specified custom request header field,
               and the `v` represents the value set for this field. By specifying the custom request header field and the corresponding value,
               when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value
               to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the
               custom header field already exists in the request, the system will overwrite the value of the custom field in the
               request with the set traffic tag value. See `request_headers` below.
        :param pulumi.Input[bool] retry: Back to Source Retry. default: true, retry 3 times by default.
        :param pulumi.Input[bool] sni_enabled: Whether to enable back-to-source SNI. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
               - **true**: indicates that the back-to-source SNI is enabled.
               - **false** (default) indicates that the back-to-source SNI is not enabled.
        :param pulumi.Input[str] sni_host: Sets the value of the custom SNI extension field. If this parameter is not set, the value of the **Host** field in the request header is used as the value of the SNI extension field by default.In general, you do not need to customize SNI unless your business has special configuration requirements. You want WAF to use SNI that is inconsistent with the actual request Host in the back-to-origin request (that is, the custom SNI set here).> This parameter is required only when **sni_enalbed** is set to **true** (indicating that back-to-source SNI is enabled).
        :param pulumi.Input[int] write_timeout: Write timeout duration> **Unit**: seconds, **Value range**: 5~1800.
        """
        DomainRedirectArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            loadbalance=loadbalance,
            backends=backends,
            connect_timeout=connect_timeout,
            focus_http_backend=focus_http_backend,
            keepalive=keepalive,
            keepalive_requests=keepalive_requests,
            keepalive_timeout=keepalive_timeout,
            read_timeout=read_timeout,
            request_headers=request_headers,
            retry=retry,
            sni_enabled=sni_enabled,
            sni_host=sni_host,
            write_timeout=write_timeout,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             loadbalance: Optional[pulumi.Input[str]] = None,
             backends: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             connect_timeout: Optional[pulumi.Input[int]] = None,
             focus_http_backend: Optional[pulumi.Input[bool]] = None,
             keepalive: Optional[pulumi.Input[bool]] = None,
             keepalive_requests: Optional[pulumi.Input[int]] = None,
             keepalive_timeout: Optional[pulumi.Input[int]] = None,
             read_timeout: Optional[pulumi.Input[int]] = None,
             request_headers: Optional[pulumi.Input[Sequence[pulumi.Input['DomainRedirectRequestHeaderArgs']]]] = None,
             retry: Optional[pulumi.Input[bool]] = None,
             sni_enabled: Optional[pulumi.Input[bool]] = None,
             sni_host: Optional[pulumi.Input[str]] = None,
             write_timeout: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if loadbalance is None:
            raise TypeError("Missing 'loadbalance' argument")
        if connect_timeout is None and 'connectTimeout' in kwargs:
            connect_timeout = kwargs['connectTimeout']
        if focus_http_backend is None and 'focusHttpBackend' in kwargs:
            focus_http_backend = kwargs['focusHttpBackend']
        if keepalive_requests is None and 'keepaliveRequests' in kwargs:
            keepalive_requests = kwargs['keepaliveRequests']
        if keepalive_timeout is None and 'keepaliveTimeout' in kwargs:
            keepalive_timeout = kwargs['keepaliveTimeout']
        if read_timeout is None and 'readTimeout' in kwargs:
            read_timeout = kwargs['readTimeout']
        if request_headers is None and 'requestHeaders' in kwargs:
            request_headers = kwargs['requestHeaders']
        if sni_enabled is None and 'sniEnabled' in kwargs:
            sni_enabled = kwargs['sniEnabled']
        if sni_host is None and 'sniHost' in kwargs:
            sni_host = kwargs['sniHost']
        if write_timeout is None and 'writeTimeout' in kwargs:
            write_timeout = kwargs['writeTimeout']

        _setter("loadbalance", loadbalance)
        if backends is not None:
            _setter("backends", backends)
        if connect_timeout is not None:
            _setter("connect_timeout", connect_timeout)
        if focus_http_backend is not None:
            _setter("focus_http_backend", focus_http_backend)
        if keepalive is not None:
            _setter("keepalive", keepalive)
        if keepalive_requests is not None:
            _setter("keepalive_requests", keepalive_requests)
        if keepalive_timeout is not None:
            _setter("keepalive_timeout", keepalive_timeout)
        if read_timeout is not None:
            _setter("read_timeout", read_timeout)
        if request_headers is not None:
            _setter("request_headers", request_headers)
        if retry is not None:
            _setter("retry", retry)
        if sni_enabled is not None:
            _setter("sni_enabled", sni_enabled)
        if sni_host is not None:
            _setter("sni_host", sni_host)
        if write_timeout is not None:
            _setter("write_timeout", write_timeout)

    @property
    @pulumi.getter
    def loadbalance(self) -> pulumi.Input[str]:
        """
        The load balancing algorithm used when returning to the source. Value:
        - **iphash**: indicates the IPHash algorithm.
        - **roundRobin**: indicates the polling algorithm.
        - **leastTime**: indicates the Least Time algorithm.
        - This value can be selected only if the value of **protection_resource** is **gslb** (indicating that the protected resource type uses shared cluster intelligent load balancing).
        """
        return pulumi.get(self, "loadbalance")

    @loadbalance.setter
    def loadbalance(self, value: pulumi.Input[str]):
        pulumi.set(self, "loadbalance", value)

    @property
    @pulumi.getter
    def backends(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The IP address of the origin server corresponding to the domain name or the back-to-origin domain name of the server.
        """
        return pulumi.get(self, "backends")

    @backends.setter
    def backends(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "backends", value)

    @property
    @pulumi.getter(name="connectTimeout")
    def connect_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Connection timeout. Unit: seconds, value range: 5~120.
        """
        return pulumi.get(self, "connect_timeout")

    @connect_timeout.setter
    def connect_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "connect_timeout", value)

    @property
    @pulumi.getter(name="focusHttpBackend")
    def focus_http_backend(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable forced HTTP back-to-origin. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
        - **true**: indicates that forced HTTP back-to-origin is enabled.
        - **false**: indicates that forced HTTP back-to-origin is not enabled.
        """
        return pulumi.get(self, "focus_http_backend")

    @focus_http_backend.setter
    def focus_http_backend(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "focus_http_backend", value)

    @property
    @pulumi.getter
    def keepalive(self) -> Optional[pulumi.Input[bool]]:
        """
        Open long connection, default true.
        """
        return pulumi.get(self, "keepalive")

    @keepalive.setter
    def keepalive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "keepalive", value)

    @property
    @pulumi.getter(name="keepaliveRequests")
    def keepalive_requests(self) -> Optional[pulumi.Input[int]]:
        """
        Number of long connections,  default: `60`. range :60-1000.
        """
        return pulumi.get(self, "keepalive_requests")

    @keepalive_requests.setter
    def keepalive_requests(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "keepalive_requests", value)

    @property
    @pulumi.getter(name="keepaliveTimeout")
    def keepalive_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Long connection over time, default: `15`. Range: 1-60.
        """
        return pulumi.get(self, "keepalive_timeout")

    @keepalive_timeout.setter
    def keepalive_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "keepalive_timeout", value)

    @property
    @pulumi.getter(name="readTimeout")
    def read_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Read timeout duration. **Unit**: seconds, **Value range**: 5~1800.
        """
        return pulumi.get(self, "read_timeout")

    @read_timeout.setter
    def read_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "read_timeout", value)

    @property
    @pulumi.getter(name="requestHeaders")
    def request_headers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DomainRedirectRequestHeaderArgs']]]]:
        """
        The traffic tag field and value of the domain name which used to mark the traffic processed by WAF. 
        It formats as `[{" k ":"_key_"," v ":"_value_"}]`. Where the `k` represents the specified custom request header field,
        and the `v` represents the value set for this field. By specifying the custom request header field and the corresponding value,
        when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value
        to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the
        custom header field already exists in the request, the system will overwrite the value of the custom field in the
        request with the set traffic tag value. See `request_headers` below.
        """
        return pulumi.get(self, "request_headers")

    @request_headers.setter
    def request_headers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DomainRedirectRequestHeaderArgs']]]]):
        pulumi.set(self, "request_headers", value)

    @property
    @pulumi.getter
    def retry(self) -> Optional[pulumi.Input[bool]]:
        """
        Back to Source Retry. default: true, retry 3 times by default.
        """
        return pulumi.get(self, "retry")

    @retry.setter
    def retry(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "retry", value)

    @property
    @pulumi.getter(name="sniEnabled")
    def sni_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to enable back-to-source SNI. This parameter is used only if the value of **https_ports** is not empty (indicating that the domain name uses the HTTPS protocol). Value:
        - **true**: indicates that the back-to-source SNI is enabled.
        - **false** (default) indicates that the back-to-source SNI is not enabled.
        """
        return pulumi.get(self, "sni_enabled")

    @sni_enabled.setter
    def sni_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "sni_enabled", value)

    @property
    @pulumi.getter(name="sniHost")
    def sni_host(self) -> Optional[pulumi.Input[str]]:
        """
        Sets the value of the custom SNI extension field. If this parameter is not set, the value of the **Host** field in the request header is used as the value of the SNI extension field by default.In general, you do not need to customize SNI unless your business has special configuration requirements. You want WAF to use SNI that is inconsistent with the actual request Host in the back-to-origin request (that is, the custom SNI set here).> This parameter is required only when **sni_enalbed** is set to **true** (indicating that back-to-source SNI is enabled).
        """
        return pulumi.get(self, "sni_host")

    @sni_host.setter
    def sni_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sni_host", value)

    @property
    @pulumi.getter(name="writeTimeout")
    def write_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        Write timeout duration> **Unit**: seconds, **Value range**: 5~1800.
        """
        return pulumi.get(self, "write_timeout")

    @write_timeout.setter
    def write_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "write_timeout", value)


@pulumi.input_type
class DomainRedirectRequestHeaderArgs:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[str]] = None,
                 value: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] key: The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{" k ":"_key_"," v ":"_value_"}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
        :param pulumi.Input[str] value: The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{" k ":"_key_"," v ":"_value_"}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
        """
        DomainRedirectRequestHeaderArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            key=key,
            value=value,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             key: Optional[pulumi.Input[str]] = None,
             value: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if key is not None:
            _setter("key", key)
        if value is not None:
            _setter("value", value)

    @property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[str]]:
        """
        The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{" k ":"_key_"," v ":"_value_"}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[str]]:
        """
        The traffic tag field and value of the domain name, which is used to mark the traffic processed by WAF. the format of this parameter value is **[{" k ":"_key_"," v ":"_value_"}]**. where_key_represents the specified custom request header field, and_value_represents the value set for this field.By specifying the custom request header field and the corresponding value, when the access traffic of the domain name passes through WAF, WAF automatically adds the specified custom field value to the request header as the traffic mark, which is convenient for backend service statistics.Explain that if the custom header field already exists in the request, the system will overwrite the value of the custom field in the request with the set traffic tag value.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value", value)


