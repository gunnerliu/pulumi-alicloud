# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'DomainAuthConfig',
    'DomainCacheConfig',
    'DomainCertificateConfig',
    'DomainConfigFunctionArg',
    'DomainHttpHeaderConfig',
    'DomainNewCertificateConfig',
    'DomainNewSource',
    'DomainPage404Config',
    'DomainParameterFilterConfig',
    'DomainReferConfig',
    'GetRealTimeLogDeliveriesDeliveryResult',
]

@pulumi.output_type
class DomainAuthConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "authType":
            suggest = "auth_type"
        elif key == "masterKey":
            suggest = "master_key"
        elif key == "slaveKey":
            suggest = "slave_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainAuthConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainAuthConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainAuthConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 auth_type: Optional[str] = None,
                 master_key: Optional[str] = None,
                 slave_key: Optional[str] = None,
                 timeout: Optional[int] = None):
        """
        :param str auth_type: Auth type of the auth config. Valid values are  `no_auth`, `type_a`, `type_b` and `type_c`. Default value is `no_auth`.
        :param str master_key: Master authentication key of the auth config. This parameter can have a string of 6 to 32 characters and must contain only alphanumeric characters.
        :param str slave_key: Slave authentication key of the auth config. This parameter can have a string of 6 to 32 characters and must contain only alphanumeric characters.
        :param int timeout: Authentication cache time of the auth config. Default value is `1800`. It's value is valid only when the `auth_type` is `type_b` or `type_c`.
        """
        if auth_type is not None:
            pulumi.set(__self__, "auth_type", auth_type)
        if master_key is not None:
            pulumi.set(__self__, "master_key", master_key)
        if slave_key is not None:
            pulumi.set(__self__, "slave_key", slave_key)
        if timeout is not None:
            pulumi.set(__self__, "timeout", timeout)

    @property
    @pulumi.getter(name="authType")
    def auth_type(self) -> Optional[str]:
        """
        Auth type of the auth config. Valid values are  `no_auth`, `type_a`, `type_b` and `type_c`. Default value is `no_auth`.
        """
        return pulumi.get(self, "auth_type")

    @property
    @pulumi.getter(name="masterKey")
    def master_key(self) -> Optional[str]:
        """
        Master authentication key of the auth config. This parameter can have a string of 6 to 32 characters and must contain only alphanumeric characters.
        """
        return pulumi.get(self, "master_key")

    @property
    @pulumi.getter(name="slaveKey")
    def slave_key(self) -> Optional[str]:
        """
        Slave authentication key of the auth config. This parameter can have a string of 6 to 32 characters and must contain only alphanumeric characters.
        """
        return pulumi.get(self, "slave_key")

    @property
    @pulumi.getter
    def timeout(self) -> Optional[int]:
        """
        Authentication cache time of the auth config. Default value is `1800`. It's value is valid only when the `auth_type` is `type_b` or `type_c`.
        """
        return pulumi.get(self, "timeout")


@pulumi.output_type
class DomainCacheConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "cacheContent":
            suggest = "cache_content"
        elif key == "cacheType":
            suggest = "cache_type"
        elif key == "cacheId":
            suggest = "cache_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainCacheConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainCacheConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainCacheConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cache_content: str,
                 cache_type: str,
                 ttl: int,
                 cache_id: Optional[str] = None,
                 weight: Optional[int] = None):
        """
        :param str cache_content: Cache content of the cache config. It's value is a path string when the `cache_type` is `path`. When the `cache_type` is `suffix`, it's value is a string which contains multiple file suffixes separated by commas.
        :param str cache_type: Cache type of the cache config. Valid values are `suffix` and `path`.
        :param int ttl: Cache time of the cache config.
        :param int weight: Weight of the cache config. This parameter's value is between 1 and 99. Default value is `1`. The higher the value, the higher the priority.
        """
        pulumi.set(__self__, "cache_content", cache_content)
        pulumi.set(__self__, "cache_type", cache_type)
        pulumi.set(__self__, "ttl", ttl)
        if cache_id is not None:
            pulumi.set(__self__, "cache_id", cache_id)
        if weight is not None:
            pulumi.set(__self__, "weight", weight)

    @property
    @pulumi.getter(name="cacheContent")
    def cache_content(self) -> str:
        """
        Cache content of the cache config. It's value is a path string when the `cache_type` is `path`. When the `cache_type` is `suffix`, it's value is a string which contains multiple file suffixes separated by commas.
        """
        return pulumi.get(self, "cache_content")

    @property
    @pulumi.getter(name="cacheType")
    def cache_type(self) -> str:
        """
        Cache type of the cache config. Valid values are `suffix` and `path`.
        """
        return pulumi.get(self, "cache_type")

    @property
    @pulumi.getter
    def ttl(self) -> int:
        """
        Cache time of the cache config.
        """
        return pulumi.get(self, "ttl")

    @property
    @pulumi.getter(name="cacheId")
    def cache_id(self) -> Optional[str]:
        return pulumi.get(self, "cache_id")

    @property
    @pulumi.getter
    def weight(self) -> Optional[int]:
        """
        Weight of the cache config. This parameter's value is between 1 and 99. Default value is `1`. The higher the value, the higher the priority.
        """
        return pulumi.get(self, "weight")


@pulumi.output_type
class DomainCertificateConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "privateKey":
            suggest = "private_key"
        elif key == "serverCertificate":
            suggest = "server_certificate"
        elif key == "serverCertificateStatus":
            suggest = "server_certificate_status"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainCertificateConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainCertificateConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainCertificateConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 private_key: Optional[str] = None,
                 server_certificate: Optional[str] = None,
                 server_certificate_status: Optional[str] = None):
        """
        :param str private_key: The SSL private key. This is required if `server_certificate_status` is `on`
        :param str server_certificate: The SSL server certificate string. This is required if `server_certificate_status` is `on`
        :param str server_certificate_status: This parameter indicates whether or not enable https. Valid values are `on` and `off`. Default value is `on`.
        """
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if server_certificate is not None:
            pulumi.set(__self__, "server_certificate", server_certificate)
        if server_certificate_status is not None:
            pulumi.set(__self__, "server_certificate_status", server_certificate_status)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[str]:
        """
        The SSL private key. This is required if `server_certificate_status` is `on`
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="serverCertificate")
    def server_certificate(self) -> Optional[str]:
        """
        The SSL server certificate string. This is required if `server_certificate_status` is `on`
        """
        return pulumi.get(self, "server_certificate")

    @property
    @pulumi.getter(name="serverCertificateStatus")
    def server_certificate_status(self) -> Optional[str]:
        """
        This parameter indicates whether or not enable https. Valid values are `on` and `off`. Default value is `on`.
        """
        return pulumi.get(self, "server_certificate_status")


@pulumi.output_type
class DomainConfigFunctionArg(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "argName":
            suggest = "arg_name"
        elif key == "argValue":
            suggest = "arg_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainConfigFunctionArg. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainConfigFunctionArg.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainConfigFunctionArg.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 arg_name: str,
                 arg_value: str):
        """
        :param str arg_name: The name of arg.
        :param str arg_value: The value of arg.
        """
        pulumi.set(__self__, "arg_name", arg_name)
        pulumi.set(__self__, "arg_value", arg_value)

    @property
    @pulumi.getter(name="argName")
    def arg_name(self) -> str:
        """
        The name of arg.
        """
        return pulumi.get(self, "arg_name")

    @property
    @pulumi.getter(name="argValue")
    def arg_value(self) -> str:
        """
        The value of arg.
        """
        return pulumi.get(self, "arg_value")


@pulumi.output_type
class DomainHttpHeaderConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "headerKey":
            suggest = "header_key"
        elif key == "headerValue":
            suggest = "header_value"
        elif key == "headerId":
            suggest = "header_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainHttpHeaderConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainHttpHeaderConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainHttpHeaderConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 header_key: str,
                 header_value: str,
                 header_id: Optional[str] = None):
        """
        :param str header_key: Header key of the http header. Valid values are `Content-Type`, `Cache-Control`, `Content-Disposition`, `Content-Language`，`Expires`, `Access-Control-Allow-Origin`, `Access-Control-Allow-Methods` and `Access-Control-Max-Age`.
        :param str header_value: Header value of the http header.
        """
        pulumi.set(__self__, "header_key", header_key)
        pulumi.set(__self__, "header_value", header_value)
        if header_id is not None:
            pulumi.set(__self__, "header_id", header_id)

    @property
    @pulumi.getter(name="headerKey")
    def header_key(self) -> str:
        """
        Header key of the http header. Valid values are `Content-Type`, `Cache-Control`, `Content-Disposition`, `Content-Language`，`Expires`, `Access-Control-Allow-Origin`, `Access-Control-Allow-Methods` and `Access-Control-Max-Age`.
        """
        return pulumi.get(self, "header_key")

    @property
    @pulumi.getter(name="headerValue")
    def header_value(self) -> str:
        """
        Header value of the http header.
        """
        return pulumi.get(self, "header_value")

    @property
    @pulumi.getter(name="headerId")
    def header_id(self) -> Optional[str]:
        return pulumi.get(self, "header_id")


@pulumi.output_type
class DomainNewCertificateConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "certName":
            suggest = "cert_name"
        elif key == "certType":
            suggest = "cert_type"
        elif key == "forceSet":
            suggest = "force_set"
        elif key == "privateKey":
            suggest = "private_key"
        elif key == "serverCertificate":
            suggest = "server_certificate"
        elif key == "serverCertificateStatus":
            suggest = "server_certificate_status"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainNewCertificateConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainNewCertificateConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainNewCertificateConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 cert_name: Optional[str] = None,
                 cert_type: Optional[str] = None,
                 force_set: Optional[str] = None,
                 private_key: Optional[str] = None,
                 server_certificate: Optional[str] = None,
                 server_certificate_status: Optional[str] = None):
        """
        :param str cert_name: The SSL certificate name.
        :param str cert_type: The SSL certificate type, can be "upload", "cas" and "free".
        :param str force_set: Set `1` to ignore the repeated verification for certificate name, and cover the information of the origin certificate (with the same name). Set `0` to work the verification.
        :param str private_key: The SSL private key. This is required if `server_certificate_status` is `on`
        :param str server_certificate: The SSL server certificate string. This is required if `server_certificate_status` is `on`
        :param str server_certificate_status: This parameter indicates whether or not enable https. Valid values are `on` and `off`. Default value is `on`.
        """
        if cert_name is not None:
            pulumi.set(__self__, "cert_name", cert_name)
        if cert_type is not None:
            pulumi.set(__self__, "cert_type", cert_type)
        if force_set is not None:
            pulumi.set(__self__, "force_set", force_set)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if server_certificate is not None:
            pulumi.set(__self__, "server_certificate", server_certificate)
        if server_certificate_status is not None:
            pulumi.set(__self__, "server_certificate_status", server_certificate_status)

    @property
    @pulumi.getter(name="certName")
    def cert_name(self) -> Optional[str]:
        """
        The SSL certificate name.
        """
        return pulumi.get(self, "cert_name")

    @property
    @pulumi.getter(name="certType")
    def cert_type(self) -> Optional[str]:
        """
        The SSL certificate type, can be "upload", "cas" and "free".
        """
        return pulumi.get(self, "cert_type")

    @property
    @pulumi.getter(name="forceSet")
    def force_set(self) -> Optional[str]:
        """
        Set `1` to ignore the repeated verification for certificate name, and cover the information of the origin certificate (with the same name). Set `0` to work the verification.
        """
        return pulumi.get(self, "force_set")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[str]:
        """
        The SSL private key. This is required if `server_certificate_status` is `on`
        """
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="serverCertificate")
    def server_certificate(self) -> Optional[str]:
        """
        The SSL server certificate string. This is required if `server_certificate_status` is `on`
        """
        return pulumi.get(self, "server_certificate")

    @property
    @pulumi.getter(name="serverCertificateStatus")
    def server_certificate_status(self) -> Optional[str]:
        """
        This parameter indicates whether or not enable https. Valid values are `on` and `off`. Default value is `on`.
        """
        return pulumi.get(self, "server_certificate_status")


@pulumi.output_type
class DomainNewSource(dict):
    def __init__(__self__, *,
                 content: str,
                 type: str,
                 port: Optional[int] = None,
                 priority: Optional[int] = None,
                 weight: Optional[int] = None):
        """
        :param str content: The address of source. Valid values can be ip or doaminName. Each item's `content` can not be repeated.
        :param str type: The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
        :param int port: The port of source. Valid values are `443` and `80`. Default value is `80`.
        :param int priority: Priority of the source. Valid values are `0` and `100`. Default value is `20`.
        :param int weight: Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`.
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
        The address of source. Valid values can be ip or doaminName. Each item's `content` can not be repeated.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the source. Valid values are `ipaddr`, `domain` and `oss`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def port(self) -> Optional[int]:
        """
        The port of source. Valid values are `443` and `80`. Default value is `80`.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def priority(self) -> Optional[int]:
        """
        Priority of the source. Valid values are `0` and `100`. Default value is `20`.
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def weight(self) -> Optional[int]:
        """
        Weight of the source. Valid values are from `0` to `100`. Default value is `10`, but if type is `ipaddr`, the value can only be `10`.
        """
        return pulumi.get(self, "weight")


@pulumi.output_type
class DomainPage404Config(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "customPageUrl":
            suggest = "custom_page_url"
        elif key == "errorCode":
            suggest = "error_code"
        elif key == "pageType":
            suggest = "page_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainPage404Config. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainPage404Config.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainPage404Config.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 custom_page_url: Optional[str] = None,
                 error_code: Optional[str] = None,
                 page_type: Optional[str] = None):
        """
        :param str custom_page_url: Custom page url of the error page. It must be the full path under the accelerated domain name. It's value must be `http://promotion.alicdn.com/help/oss/error.html` when `page_type` value is `charity` and It can not be set when `page_type` value is `default`.
        :param str page_type: Page type of the error page. Valid values are `default`, `charity`, `other`. Default value is `default`.
        """
        if custom_page_url is not None:
            pulumi.set(__self__, "custom_page_url", custom_page_url)
        if error_code is not None:
            pulumi.set(__self__, "error_code", error_code)
        if page_type is not None:
            pulumi.set(__self__, "page_type", page_type)

    @property
    @pulumi.getter(name="customPageUrl")
    def custom_page_url(self) -> Optional[str]:
        """
        Custom page url of the error page. It must be the full path under the accelerated domain name. It's value must be `http://promotion.alicdn.com/help/oss/error.html` when `page_type` value is `charity` and It can not be set when `page_type` value is `default`.
        """
        return pulumi.get(self, "custom_page_url")

    @property
    @pulumi.getter(name="errorCode")
    def error_code(self) -> Optional[str]:
        return pulumi.get(self, "error_code")

    @property
    @pulumi.getter(name="pageType")
    def page_type(self) -> Optional[str]:
        """
        Page type of the error page. Valid values are `default`, `charity`, `other`. Default value is `default`.
        """
        return pulumi.get(self, "page_type")


@pulumi.output_type
class DomainParameterFilterConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "hashKeyArgs":
            suggest = "hash_key_args"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainParameterFilterConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainParameterFilterConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainParameterFilterConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enable: Optional[str] = None,
                 hash_key_args: Optional[Sequence[str]] = None):
        """
        :param str enable: This parameter indicates whether or not the `parameter_filter_config` is enable. Valid values are `on` and `off`. Default value is `off`.
        :param Sequence[str] hash_key_args: Reserved parameters of `parameter_filter_config`. It's a list of string and consists of at most 10 items.
        """
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if hash_key_args is not None:
            pulumi.set(__self__, "hash_key_args", hash_key_args)

    @property
    @pulumi.getter
    def enable(self) -> Optional[str]:
        """
        This parameter indicates whether or not the `parameter_filter_config` is enable. Valid values are `on` and `off`. Default value is `off`.
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter(name="hashKeyArgs")
    def hash_key_args(self) -> Optional[Sequence[str]]:
        """
        Reserved parameters of `parameter_filter_config`. It's a list of string and consists of at most 10 items.
        """
        return pulumi.get(self, "hash_key_args")


@pulumi.output_type
class DomainReferConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "referLists":
            suggest = "refer_lists"
        elif key == "allowEmpty":
            suggest = "allow_empty"
        elif key == "referType":
            suggest = "refer_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DomainReferConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DomainReferConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DomainReferConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 refer_lists: Sequence[str],
                 allow_empty: Optional[str] = None,
                 refer_type: Optional[str] = None):
        """
        :param Sequence[str] refer_lists: A list of domain names of the refer config.
        :param str allow_empty: This parameter indicates whether or not to allow empty refer access. Valid values are `on` and `off`. Default value is `on`.
        :param str refer_type: Refer type of the refer config. Valid values are `block` and `allow`. Default value is `block`.
        """
        pulumi.set(__self__, "refer_lists", refer_lists)
        if allow_empty is not None:
            pulumi.set(__self__, "allow_empty", allow_empty)
        if refer_type is not None:
            pulumi.set(__self__, "refer_type", refer_type)

    @property
    @pulumi.getter(name="referLists")
    def refer_lists(self) -> Sequence[str]:
        """
        A list of domain names of the refer config.
        """
        return pulumi.get(self, "refer_lists")

    @property
    @pulumi.getter(name="allowEmpty")
    def allow_empty(self) -> Optional[str]:
        """
        This parameter indicates whether or not to allow empty refer access. Valid values are `on` and `off`. Default value is `on`.
        """
        return pulumi.get(self, "allow_empty")

    @property
    @pulumi.getter(name="referType")
    def refer_type(self) -> Optional[str]:
        """
        Refer type of the refer config. Valid values are `block` and `allow`. Default value is `block`.
        """
        return pulumi.get(self, "refer_type")


@pulumi.output_type
class GetRealTimeLogDeliveriesDeliveryResult(dict):
    def __init__(__self__, *,
                 domain: str,
                 id: str,
                 logstore: str,
                 project: str,
                 sls_region: str,
                 status: str):
        """
        :param str domain: Real-Time Log Service Domain.
        :param str id: The ID of the Real Time Log Delivery.
        :param str logstore: The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        :param str project: The name of the Log Service project that is used for real-time log delivery.
        :param str sls_region: The region where the Log Service project is deployed.
        :param str status: -The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "logstore", logstore)
        pulumi.set(__self__, "project", project)
        pulumi.set(__self__, "sls_region", sls_region)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        Real-Time Log Service Domain.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Real Time Log Delivery.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def logstore(self) -> str:
        """
        The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        """
        return pulumi.get(self, "logstore")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The name of the Log Service project that is used for real-time log delivery.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="slsRegion")
    def sls_region(self) -> str:
        """
        The region where the Log Service project is deployed.
        """
        return pulumi.get(self, "sls_region")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        -The status of the real-time log delivery feature. Valid Values: `online` and `offline`.
        """
        return pulumi.get(self, "status")


