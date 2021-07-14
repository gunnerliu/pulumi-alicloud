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
    'AlertNotificationList',
    'AlertQueryList',
    'EtlEtlSink',
    'OssShipperParquetConfig',
    'StoreEncryptConf',
    'StoreEncryptConfUserCmkInfo',
    'StoreIndexFieldSearch',
    'StoreIndexFieldSearchJsonKey',
    'StoreIndexFullText',
    'StoreShard',
    'GetProjectsProjectResult',
    'GetStoresStoreResult',
]

@pulumi.output_type
class AlertNotificationList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "emailLists":
            suggest = "email_lists"
        elif key == "mobileLists":
            suggest = "mobile_lists"
        elif key == "serviceUri":
            suggest = "service_uri"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AlertNotificationList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AlertNotificationList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AlertNotificationList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 content: str,
                 type: str,
                 email_lists: Optional[Sequence[str]] = None,
                 mobile_lists: Optional[Sequence[str]] = None,
                 service_uri: Optional[str] = None):
        """
        :param str content: Notice content of alarm.
        :param str type: Notification type. support Email, SMS, DingTalk, MessageCenter.
        :param Sequence[str] email_lists: Email address list.
        :param Sequence[str] mobile_lists: SMS sending mobile number.
        :param str service_uri: Request address.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "type", type)
        if email_lists is not None:
            pulumi.set(__self__, "email_lists", email_lists)
        if mobile_lists is not None:
            pulumi.set(__self__, "mobile_lists", mobile_lists)
        if service_uri is not None:
            pulumi.set(__self__, "service_uri", service_uri)

    @property
    @pulumi.getter
    def content(self) -> str:
        """
        Notice content of alarm.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Notification type. support Email, SMS, DingTalk, MessageCenter.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="emailLists")
    def email_lists(self) -> Optional[Sequence[str]]:
        """
        Email address list.
        """
        return pulumi.get(self, "email_lists")

    @property
    @pulumi.getter(name="mobileLists")
    def mobile_lists(self) -> Optional[Sequence[str]]:
        """
        SMS sending mobile number.
        """
        return pulumi.get(self, "mobile_lists")

    @property
    @pulumi.getter(name="serviceUri")
    def service_uri(self) -> Optional[str]:
        """
        Request address.
        """
        return pulumi.get(self, "service_uri")


@pulumi.output_type
class AlertQueryList(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "chartTitle":
            suggest = "chart_title"
        elif key == "timeSpanType":
            suggest = "time_span_type"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in AlertQueryList. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        AlertQueryList.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        AlertQueryList.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 chart_title: str,
                 end: str,
                 logstore: str,
                 query: str,
                 start: str,
                 time_span_type: Optional[str] = None):
        """
        :param str chart_title: chart title
        :param str end: end time. example: 20s.
        :param str logstore: Query logstore
        :param str query: query corresponding to chart. example: * AND aliyun.
        :param str start: begin time. example: -60s.
        :param str time_span_type: default Custom. No need to configure this parameter.
        """
        pulumi.set(__self__, "chart_title", chart_title)
        pulumi.set(__self__, "end", end)
        pulumi.set(__self__, "logstore", logstore)
        pulumi.set(__self__, "query", query)
        pulumi.set(__self__, "start", start)
        if time_span_type is not None:
            pulumi.set(__self__, "time_span_type", time_span_type)

    @property
    @pulumi.getter(name="chartTitle")
    def chart_title(self) -> str:
        """
        chart title
        """
        return pulumi.get(self, "chart_title")

    @property
    @pulumi.getter
    def end(self) -> str:
        """
        end time. example: 20s.
        """
        return pulumi.get(self, "end")

    @property
    @pulumi.getter
    def logstore(self) -> str:
        """
        Query logstore
        """
        return pulumi.get(self, "logstore")

    @property
    @pulumi.getter
    def query(self) -> str:
        """
        query corresponding to chart. example: * AND aliyun.
        """
        return pulumi.get(self, "query")

    @property
    @pulumi.getter
    def start(self) -> str:
        """
        begin time. example: -60s.
        """
        return pulumi.get(self, "start")

    @property
    @pulumi.getter(name="timeSpanType")
    def time_span_type(self) -> Optional[str]:
        """
        default Custom. No need to configure this parameter.
        """
        return pulumi.get(self, "time_span_type")


@pulumi.output_type
class EtlEtlSink(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "accessKeyId":
            suggest = "access_key_id"
        elif key == "accessKeySecret":
            suggest = "access_key_secret"
        elif key == "kmsEncryptedAccessKeyId":
            suggest = "kms_encrypted_access_key_id"
        elif key == "kmsEncryptedAccessKeySecret":
            suggest = "kms_encrypted_access_key_secret"
        elif key == "roleArn":
            suggest = "role_arn"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in EtlEtlSink. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        EtlEtlSink.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        EtlEtlSink.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 endpoint: str,
                 logstore: str,
                 name: str,
                 project: str,
                 access_key_id: Optional[str] = None,
                 access_key_secret: Optional[str] = None,
                 kms_encrypted_access_key_id: Optional[str] = None,
                 kms_encrypted_access_key_secret: Optional[str] = None,
                 role_arn: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str endpoint: Delivery target logstore region.
        :param str logstore: Delivery target logstore.
        :param str name: Delivery target name.
        :param str project: The project where the target logstore is delivered.
        :param str access_key_id: Delivery target logstore access key id.
        :param str access_key_secret: Delivery target logstore access key secret.
        :param str kms_encrypted_access_key_id: An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
        :param str kms_encrypted_access_key_secret: An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
        :param str role_arn: Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
        :param str type: ETL sinks type, the default value is AliyunLOG.
        """
        pulumi.set(__self__, "endpoint", endpoint)
        pulumi.set(__self__, "logstore", logstore)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "project", project)
        if access_key_id is not None:
            pulumi.set(__self__, "access_key_id", access_key_id)
        if access_key_secret is not None:
            pulumi.set(__self__, "access_key_secret", access_key_secret)
        if kms_encrypted_access_key_id is not None:
            pulumi.set(__self__, "kms_encrypted_access_key_id", kms_encrypted_access_key_id)
        if kms_encrypted_access_key_secret is not None:
            pulumi.set(__self__, "kms_encrypted_access_key_secret", kms_encrypted_access_key_secret)
        if role_arn is not None:
            pulumi.set(__self__, "role_arn", role_arn)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def endpoint(self) -> str:
        """
        Delivery target logstore region.
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter
    def logstore(self) -> str:
        """
        Delivery target logstore.
        """
        return pulumi.get(self, "logstore")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Delivery target name.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def project(self) -> str:
        """
        The project where the target logstore is delivered.
        """
        return pulumi.get(self, "project")

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[str]:
        """
        Delivery target logstore access key id.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="accessKeySecret")
    def access_key_secret(self) -> Optional[str]:
        """
        Delivery target logstore access key secret.
        """
        return pulumi.get(self, "access_key_secret")

    @property
    @pulumi.getter(name="kmsEncryptedAccessKeyId")
    def kms_encrypted_access_key_id(self) -> Optional[str]:
        """
        An KMS encrypts access key id used to a log etl job. If the `access_key_id` is filled in, this field will be ignored.
        """
        return pulumi.get(self, "kms_encrypted_access_key_id")

    @property
    @pulumi.getter(name="kmsEncryptedAccessKeySecret")
    def kms_encrypted_access_key_secret(self) -> Optional[str]:
        """
        An KMS encrypts access key secret used to a log etl job. If the `access_key_secret` is filled in, this field will be ignored.
        """
        return pulumi.get(self, "kms_encrypted_access_key_secret")

    @property
    @pulumi.getter(name="roleArn")
    def role_arn(self) -> Optional[str]:
        """
        Sts role info under delivery target logstore. `role_arn` and `(access_key_id, access_key_secret)` fill in at most one. If you do not fill in both, then you must fill in `(kms_encrypted_access_key_id, kms_encrypted_access_key_secret, kms_encryption_access_key_id_context, kms_encryption_access_key_secret_context)` to use KMS to get the key pair.
        """
        return pulumi.get(self, "role_arn")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        ETL sinks type, the default value is AliyunLOG.
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class OssShipperParquetConfig(dict):
    def __init__(__self__, *,
                 name: str,
                 type: str):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")


@pulumi.output_type
class StoreEncryptConf(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "encryptType":
            suggest = "encrypt_type"
        elif key == "userCmkInfo":
            suggest = "user_cmk_info"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreEncryptConf. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreEncryptConf.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreEncryptConf.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enable: Optional[bool] = None,
                 encrypt_type: Optional[str] = None,
                 user_cmk_info: Optional['outputs.StoreEncryptConfUserCmkInfo'] = None):
        """
        :param bool enable: enable encryption. Default `false`
        :param str encrypt_type: Supported encryption type, only supports `default(AES)`,` m4`
        :param 'StoreEncryptConfUserCmkInfoArgs' user_cmk_info: User bring your own key (BYOK) encryption.[Refer to details](https://www.alibabacloud.com/help/zh/doc-detail/187853.htm?spm=a2c63.p38356.b99.673.cafa2b38qBskFV)
        """
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if encrypt_type is not None:
            pulumi.set(__self__, "encrypt_type", encrypt_type)
        if user_cmk_info is not None:
            pulumi.set(__self__, "user_cmk_info", user_cmk_info)

    @property
    @pulumi.getter
    def enable(self) -> Optional[bool]:
        """
        enable encryption. Default `false`
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter(name="encryptType")
    def encrypt_type(self) -> Optional[str]:
        """
        Supported encryption type, only supports `default(AES)`,` m4`
        """
        return pulumi.get(self, "encrypt_type")

    @property
    @pulumi.getter(name="userCmkInfo")
    def user_cmk_info(self) -> Optional['outputs.StoreEncryptConfUserCmkInfo']:
        """
        User bring your own key (BYOK) encryption.[Refer to details](https://www.alibabacloud.com/help/zh/doc-detail/187853.htm?spm=a2c63.p38356.b99.673.cafa2b38qBskFV)
        """
        return pulumi.get(self, "user_cmk_info")


@pulumi.output_type
class StoreEncryptConfUserCmkInfo(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "cmkKeyId":
            suggest = "cmk_key_id"
        elif key == "regionId":
            suggest = "region_id"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreEncryptConfUserCmkInfo. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreEncryptConfUserCmkInfo.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreEncryptConfUserCmkInfo.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 arn: str,
                 cmk_key_id: str,
                 region_id: str):
        """
        :param str arn: role arn
        :param str cmk_key_id: User master key id
        :param str region_id: Region id where the  user master key id is located
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "cmk_key_id", cmk_key_id)
        pulumi.set(__self__, "region_id", region_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        role arn
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="cmkKeyId")
    def cmk_key_id(self) -> str:
        """
        User master key id
        """
        return pulumi.get(self, "cmk_key_id")

    @property
    @pulumi.getter(name="regionId")
    def region_id(self) -> str:
        """
        Region id where the  user master key id is located
        """
        return pulumi.get(self, "region_id")


@pulumi.output_type
class StoreIndexFieldSearch(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "caseSensitive":
            suggest = "case_sensitive"
        elif key == "enableAnalytics":
            suggest = "enable_analytics"
        elif key == "includeChinese":
            suggest = "include_chinese"
        elif key == "jsonKeys":
            suggest = "json_keys"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreIndexFieldSearch. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreIndexFieldSearch.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreIndexFieldSearch.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 alias: Optional[str] = None,
                 case_sensitive: Optional[bool] = None,
                 enable_analytics: Optional[bool] = None,
                 include_chinese: Optional[bool] = None,
                 json_keys: Optional[Sequence['outputs.StoreIndexFieldSearchJsonKey']] = None,
                 token: Optional[str] = None,
                 type: Optional[str] = None):
        """
        :param str name: When using the json_keys field, this field is required.
        :param str alias: The alias of one field.
        :param bool case_sensitive: Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
        :param bool enable_analytics: Whether to enable field analytics. Default to true.
        :param bool include_chinese: Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
        :param Sequence['StoreIndexFieldSearchJsonKeyArgs'] json_keys: Use nested index when type is json
        :param str token: The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
        :param str type: The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
        """
        pulumi.set(__self__, "name", name)
        if alias is not None:
            pulumi.set(__self__, "alias", alias)
        if case_sensitive is not None:
            pulumi.set(__self__, "case_sensitive", case_sensitive)
        if enable_analytics is not None:
            pulumi.set(__self__, "enable_analytics", enable_analytics)
        if include_chinese is not None:
            pulumi.set(__self__, "include_chinese", include_chinese)
        if json_keys is not None:
            pulumi.set(__self__, "json_keys", json_keys)
        if token is not None:
            pulumi.set(__self__, "token", token)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        When using the json_keys field, this field is required.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def alias(self) -> Optional[str]:
        """
        The alias of one field.
        """
        return pulumi.get(self, "alias")

    @property
    @pulumi.getter(name="caseSensitive")
    def case_sensitive(self) -> Optional[bool]:
        """
        Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "case_sensitive")

    @property
    @pulumi.getter(name="enableAnalytics")
    def enable_analytics(self) -> Optional[bool]:
        """
        Whether to enable field analytics. Default to true.
        """
        return pulumi.get(self, "enable_analytics")

    @property
    @pulumi.getter(name="includeChinese")
    def include_chinese(self) -> Optional[bool]:
        """
        Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "include_chinese")

    @property
    @pulumi.getter(name="jsonKeys")
    def json_keys(self) -> Optional[Sequence['outputs.StoreIndexFieldSearchJsonKey']]:
        """
        Use nested index when type is json
        """
        return pulumi.get(self, "json_keys")

    @property
    @pulumi.getter
    def token(self) -> Optional[str]:
        """
        The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "token")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class StoreIndexFieldSearchJsonKey(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "docValue":
            suggest = "doc_value"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreIndexFieldSearchJsonKey. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreIndexFieldSearchJsonKey.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreIndexFieldSearchJsonKey.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 alias: Optional[str] = None,
                 doc_value: Optional[bool] = None,
                 type: Optional[str] = None):
        """
        :param str name: When using the json_keys field, this field is required.
        :param str alias: The alias of one field.
        :param bool doc_value: Whether to enable statistics. default to true.
        :param str type: The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
        """
        pulumi.set(__self__, "name", name)
        if alias is not None:
            pulumi.set(__self__, "alias", alias)
        if doc_value is not None:
            pulumi.set(__self__, "doc_value", doc_value)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        When using the json_keys field, this field is required.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def alias(self) -> Optional[str]:
        """
        The alias of one field.
        """
        return pulumi.get(self, "alias")

    @property
    @pulumi.getter(name="docValue")
    def doc_value(self) -> Optional[bool]:
        """
        Whether to enable statistics. default to true.
        """
        return pulumi.get(self, "doc_value")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        """
        The type of one field. Valid values: ["long", "text", "double"]. Default to "long"
        """
        return pulumi.get(self, "type")


@pulumi.output_type
class StoreIndexFullText(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "caseSensitive":
            suggest = "case_sensitive"
        elif key == "includeChinese":
            suggest = "include_chinese"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreIndexFullText. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreIndexFullText.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreIndexFullText.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 case_sensitive: Optional[bool] = None,
                 include_chinese: Optional[bool] = None,
                 token: Optional[str] = None):
        """
        :param bool case_sensitive: Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
        :param bool include_chinese: Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
        :param str token: The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
        """
        if case_sensitive is not None:
            pulumi.set(__self__, "case_sensitive", case_sensitive)
        if include_chinese is not None:
            pulumi.set(__self__, "include_chinese", include_chinese)
        if token is not None:
            pulumi.set(__self__, "token", token)

    @property
    @pulumi.getter(name="caseSensitive")
    def case_sensitive(self) -> Optional[bool]:
        """
        Whether the case sensitive for the field. Default to false. It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "case_sensitive")

    @property
    @pulumi.getter(name="includeChinese")
    def include_chinese(self) -> Optional[bool]:
        """
        Whether includes the chinese for the field. Default to false. It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "include_chinese")

    @property
    @pulumi.getter
    def token(self) -> Optional[str]:
        """
        The string of several split words, like "\r", "#". It is valid when "type" is "text" or "json".
        """
        return pulumi.get(self, "token")


@pulumi.output_type
class StoreShard(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "beginKey":
            suggest = "begin_key"
        elif key == "endKey":
            suggest = "end_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in StoreShard. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        StoreShard.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        StoreShard.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 begin_key: Optional[str] = None,
                 end_key: Optional[str] = None,
                 id: Optional[int] = None,
                 status: Optional[str] = None):
        """
        :param int id: The ID of the log project. It formats of `<project>:<name>`.
        """
        if begin_key is not None:
            pulumi.set(__self__, "begin_key", begin_key)
        if end_key is not None:
            pulumi.set(__self__, "end_key", end_key)
        if id is not None:
            pulumi.set(__self__, "id", id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="beginKey")
    def begin_key(self) -> Optional[str]:
        return pulumi.get(self, "begin_key")

    @property
    @pulumi.getter(name="endKey")
    def end_key(self) -> Optional[str]:
        return pulumi.get(self, "end_key")

    @property
    @pulumi.getter
    def id(self) -> Optional[int]:
        """
        The ID of the log project. It formats of `<project>:<name>`.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def status(self) -> Optional[str]:
        return pulumi.get(self, "status")


@pulumi.output_type
class GetProjectsProjectResult(dict):
    def __init__(__self__, *,
                 description: str,
                 id: str,
                 last_modify_time: str,
                 owner: str,
                 project_name: str,
                 region: str,
                 status: str):
        """
        :param str description: The description of the project.
        :param str id: The ID of the project.
        :param str last_modify_time: The last modify time of project.
        :param str owner: The owner of project.
        :param str project_name: The name of the project.
        :param str region: The region of project.
        :param str status: The status of project.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "last_modify_time", last_modify_time)
        pulumi.set(__self__, "owner", owner)
        pulumi.set(__self__, "project_name", project_name)
        pulumi.set(__self__, "region", region)
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the project.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the project.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModifyTime")
    def last_modify_time(self) -> str:
        """
        The last modify time of project.
        """
        return pulumi.get(self, "last_modify_time")

    @property
    @pulumi.getter
    def owner(self) -> str:
        """
        The owner of project.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> str:
        """
        The name of the project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The region of project.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of project.
        """
        return pulumi.get(self, "status")


@pulumi.output_type
class GetStoresStoreResult(dict):
    def __init__(__self__, *,
                 id: str,
                 store_name: str):
        """
        :param str id: The ID of the store.
        :param str store_name: The name of the store.
        """
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "store_name", store_name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the store.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="storeName")
    def store_name(self) -> str:
        """
        The name of the store.
        """
        return pulumi.get(self, "store_name")


