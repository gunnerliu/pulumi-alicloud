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
    'InstanceAdAuthServer',
    'InstanceLdapAuthServer',
    'GetHostAccountsAccountResult',
    'GetHostGroupsGroupResult',
    'GetHostShareKeysKeyResult',
    'GetHostsHostResult',
    'GetHostsHostProtocolResult',
    'GetInstancesInstanceResult',
    'GetUserGroupsGroupResult',
    'GetUsersUserResult',
]

@pulumi.output_type
class InstanceAdAuthServer(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "baseDn":
            suggest = "base_dn"
        elif key == "isSsl":
            suggest = "is_ssl"
        elif key == "emailMapping":
            suggest = "email_mapping"
        elif key == "mobileMapping":
            suggest = "mobile_mapping"
        elif key == "nameMapping":
            suggest = "name_mapping"
        elif key == "standbyServer":
            suggest = "standby_server"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceAdAuthServer. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceAdAuthServer.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceAdAuthServer.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 account: str,
                 base_dn: str,
                 domain: str,
                 is_ssl: bool,
                 password: str,
                 port: int,
                 server: str,
                 email_mapping: Optional[str] = None,
                 filter: Optional[str] = None,
                 mobile_mapping: Optional[str] = None,
                 name_mapping: Optional[str] = None,
                 standby_server: Optional[str] = None):
        """
        :param str account: The username of the account that is used for the AD server.
        :param str base_dn: The Base distinguished name (DN).
        :param str domain: The domain on the AD server.
        :param bool is_ssl: Specifies whether to support SSL.
        :param str password: The password of the account that is used for the AD server.
        :param int port: The port that is used to access the AD server.
        :param str server: The address of the AD server.
        :param str email_mapping: The field that is used to indicate the email address of a user on the AD server.
        :param str filter: The condition that is used to filter users.
        :param str mobile_mapping: The field that is used to indicate the mobile phone number of a user on the AD server.
        :param str name_mapping: The field that is used to indicate the name of a user on the AD server.
        :param str standby_server: The address of the secondary AD server.
        """
        pulumi.set(__self__, "account", account)
        pulumi.set(__self__, "base_dn", base_dn)
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "is_ssl", is_ssl)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server", server)
        if email_mapping is not None:
            pulumi.set(__self__, "email_mapping", email_mapping)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if mobile_mapping is not None:
            pulumi.set(__self__, "mobile_mapping", mobile_mapping)
        if name_mapping is not None:
            pulumi.set(__self__, "name_mapping", name_mapping)
        if standby_server is not None:
            pulumi.set(__self__, "standby_server", standby_server)

    @property
    @pulumi.getter
    def account(self) -> str:
        """
        The username of the account that is used for the AD server.
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter(name="baseDn")
    def base_dn(self) -> str:
        """
        The Base distinguished name (DN).
        """
        return pulumi.get(self, "base_dn")

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        The domain on the AD server.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="isSsl")
    def is_ssl(self) -> bool:
        """
        Specifies whether to support SSL.
        """
        return pulumi.get(self, "is_ssl")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        The password of the account that is used for the AD server.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port that is used to access the AD server.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def server(self) -> str:
        """
        The address of the AD server.
        """
        return pulumi.get(self, "server")

    @property
    @pulumi.getter(name="emailMapping")
    def email_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the email address of a user on the AD server.
        """
        return pulumi.get(self, "email_mapping")

    @property
    @pulumi.getter
    def filter(self) -> Optional[str]:
        """
        The condition that is used to filter users.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter(name="mobileMapping")
    def mobile_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the mobile phone number of a user on the AD server.
        """
        return pulumi.get(self, "mobile_mapping")

    @property
    @pulumi.getter(name="nameMapping")
    def name_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the name of a user on the AD server.
        """
        return pulumi.get(self, "name_mapping")

    @property
    @pulumi.getter(name="standbyServer")
    def standby_server(self) -> Optional[str]:
        """
        The address of the secondary AD server.
        """
        return pulumi.get(self, "standby_server")


@pulumi.output_type
class InstanceLdapAuthServer(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "baseDn":
            suggest = "base_dn"
        elif key == "emailMapping":
            suggest = "email_mapping"
        elif key == "isSsl":
            suggest = "is_ssl"
        elif key == "loginNameMapping":
            suggest = "login_name_mapping"
        elif key == "mobileMapping":
            suggest = "mobile_mapping"
        elif key == "nameMapping":
            suggest = "name_mapping"
        elif key == "standbyServer":
            suggest = "standby_server"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceLdapAuthServer. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceLdapAuthServer.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceLdapAuthServer.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 account: str,
                 base_dn: str,
                 password: str,
                 port: int,
                 server: str,
                 email_mapping: Optional[str] = None,
                 filter: Optional[str] = None,
                 is_ssl: Optional[bool] = None,
                 login_name_mapping: Optional[str] = None,
                 mobile_mapping: Optional[str] = None,
                 name_mapping: Optional[str] = None,
                 standby_server: Optional[str] = None):
        """
        :param str account: The username of the account that is used for the LDAP server.
        :param str base_dn: The Base distinguished name (DN).
        :param str password: The password of the account that is used for the LDAP server.
        :param int port: The port that is used to access the LDAP server.
        :param str server: The address of the LDAP server.
        :param str email_mapping: The field that is used to indicate the email address of a user on the LDAP server.
        :param str filter: The condition that is used to filter users.
        :param bool is_ssl: Specifies whether to support SSL.
        :param str login_name_mapping: The field that is used to indicate the logon name of a user on the LDAP server.
        :param str mobile_mapping: The field that is used to indicate the mobile phone number of a user on the LDAP server.
        :param str name_mapping: The field that is used to indicate the name of a user on the LDAP server.
        :param str standby_server: The address of the secondary LDAP server.
        """
        pulumi.set(__self__, "account", account)
        pulumi.set(__self__, "base_dn", base_dn)
        pulumi.set(__self__, "password", password)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "server", server)
        if email_mapping is not None:
            pulumi.set(__self__, "email_mapping", email_mapping)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if is_ssl is not None:
            pulumi.set(__self__, "is_ssl", is_ssl)
        if login_name_mapping is not None:
            pulumi.set(__self__, "login_name_mapping", login_name_mapping)
        if mobile_mapping is not None:
            pulumi.set(__self__, "mobile_mapping", mobile_mapping)
        if name_mapping is not None:
            pulumi.set(__self__, "name_mapping", name_mapping)
        if standby_server is not None:
            pulumi.set(__self__, "standby_server", standby_server)

    @property
    @pulumi.getter
    def account(self) -> str:
        """
        The username of the account that is used for the LDAP server.
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter(name="baseDn")
    def base_dn(self) -> str:
        """
        The Base distinguished name (DN).
        """
        return pulumi.get(self, "base_dn")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        The password of the account that is used for the LDAP server.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        The port that is used to access the LDAP server.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def server(self) -> str:
        """
        The address of the LDAP server.
        """
        return pulumi.get(self, "server")

    @property
    @pulumi.getter(name="emailMapping")
    def email_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the email address of a user on the LDAP server.
        """
        return pulumi.get(self, "email_mapping")

    @property
    @pulumi.getter
    def filter(self) -> Optional[str]:
        """
        The condition that is used to filter users.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter(name="isSsl")
    def is_ssl(self) -> Optional[bool]:
        """
        Specifies whether to support SSL.
        """
        return pulumi.get(self, "is_ssl")

    @property
    @pulumi.getter(name="loginNameMapping")
    def login_name_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the logon name of a user on the LDAP server.
        """
        return pulumi.get(self, "login_name_mapping")

    @property
    @pulumi.getter(name="mobileMapping")
    def mobile_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the mobile phone number of a user on the LDAP server.
        """
        return pulumi.get(self, "mobile_mapping")

    @property
    @pulumi.getter(name="nameMapping")
    def name_mapping(self) -> Optional[str]:
        """
        The field that is used to indicate the name of a user on the LDAP server.
        """
        return pulumi.get(self, "name_mapping")

    @property
    @pulumi.getter(name="standbyServer")
    def standby_server(self) -> Optional[str]:
        """
        The address of the secondary LDAP server.
        """
        return pulumi.get(self, "standby_server")


@pulumi.output_type
class GetHostAccountsAccountResult(dict):
    def __init__(__self__, *,
                 has_password: bool,
                 host_account_id: str,
                 host_account_name: str,
                 host_id: str,
                 id: str,
                 instance_id: str,
                 private_key_fingerprint: str,
                 protocol_name: str):
        """
        :param bool has_password: Whether to set a new password.
        :param str host_account_id: Hosting account ID.
        :param str host_account_name: Specify the new hosting account's name, support the longest 128 characters.
        :param str host_id: Specifies the database where you want to create your hosting account's host ID.
        :param str id: The ID of the Host Account.
        :param str instance_id: Specifies the database where you want to create your hosting account's host bastion host ID of.
        :param str private_key_fingerprint: The situation where the private keys of the fingerprint information.
        :param str protocol_name: Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
        """
        pulumi.set(__self__, "has_password", has_password)
        pulumi.set(__self__, "host_account_id", host_account_id)
        pulumi.set(__self__, "host_account_name", host_account_name)
        pulumi.set(__self__, "host_id", host_id)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "private_key_fingerprint", private_key_fingerprint)
        pulumi.set(__self__, "protocol_name", protocol_name)

    @property
    @pulumi.getter(name="hasPassword")
    def has_password(self) -> bool:
        """
        Whether to set a new password.
        """
        return pulumi.get(self, "has_password")

    @property
    @pulumi.getter(name="hostAccountId")
    def host_account_id(self) -> str:
        """
        Hosting account ID.
        """
        return pulumi.get(self, "host_account_id")

    @property
    @pulumi.getter(name="hostAccountName")
    def host_account_name(self) -> str:
        """
        Specify the new hosting account's name, support the longest 128 characters.
        """
        return pulumi.get(self, "host_account_name")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        """
        Specifies the database where you want to create your hosting account's host ID.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Host Account.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Specifies the database where you want to create your hosting account's host bastion host ID of.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="privateKeyFingerprint")
    def private_key_fingerprint(self) -> str:
        """
        The situation where the private keys of the fingerprint information.
        """
        return pulumi.get(self, "private_key_fingerprint")

    @property
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> str:
        """
        Specify the new hosting account of the agreement name. Valid values: USING SSH and RDP.
        """
        return pulumi.get(self, "protocol_name")


@pulumi.output_type
class GetHostGroupsGroupResult(dict):
    def __init__(__self__, *,
                 comment: str,
                 host_group_id: str,
                 host_group_name: str,
                 id: str,
                 instance_id: str):
        """
        :param str comment: Specify the New Host Group of Notes, Supports up to 500 Characters.
        :param str host_group_id: Host Group ID.
        :param str host_group_name: Specify the New Host Group Name, Supports up to 128 Characters.
        :param str id: The ID of the Host Group.
        :param str instance_id: Specify the New Host Group Where the Bastion Host ID of.
        """
        pulumi.set(__self__, "comment", comment)
        pulumi.set(__self__, "host_group_id", host_group_id)
        pulumi.set(__self__, "host_group_name", host_group_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Specify the New Host Group of Notes, Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="hostGroupId")
    def host_group_id(self) -> str:
        """
        Host Group ID.
        """
        return pulumi.get(self, "host_group_id")

    @property
    @pulumi.getter(name="hostGroupName")
    def host_group_name(self) -> str:
        """
        Specify the New Host Group Name, Supports up to 128 Characters.
        """
        return pulumi.get(self, "host_group_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Host Group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Specify the New Host Group Where the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")


@pulumi.output_type
class GetHostShareKeysKeyResult(dict):
    def __init__(__self__, *,
                 host_share_key_id: str,
                 host_share_key_name: str,
                 id: str,
                 instance_id: str,
                 private_key_finger_print: str):
        """
        :param str host_share_key_id: The first ID of the resource.
        :param str host_share_key_name: The name of the host shared key.
        :param str id: The ID of the Host Share Key.
        :param str instance_id: The ID of the Bastion instance.
        :param str private_key_finger_print: The fingerprint of the private key.
        """
        pulumi.set(__self__, "host_share_key_id", host_share_key_id)
        pulumi.set(__self__, "host_share_key_name", host_share_key_name)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "private_key_finger_print", private_key_finger_print)

    @property
    @pulumi.getter(name="hostShareKeyId")
    def host_share_key_id(self) -> str:
        """
        The first ID of the resource.
        """
        return pulumi.get(self, "host_share_key_id")

    @property
    @pulumi.getter(name="hostShareKeyName")
    def host_share_key_name(self) -> str:
        """
        The name of the host shared key.
        """
        return pulumi.get(self, "host_share_key_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Host Share Key.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The ID of the Bastion instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="privateKeyFingerPrint")
    def private_key_finger_print(self) -> str:
        """
        The fingerprint of the private key.
        """
        return pulumi.get(self, "private_key_finger_print")


@pulumi.output_type
class GetHostsHostResult(dict):
    def __init__(__self__, *,
                 active_address_type: str,
                 comment: str,
                 host_id: str,
                 host_name: str,
                 host_private_address: str,
                 host_public_address: str,
                 id: str,
                 instance_id: str,
                 os_type: str,
                 protocols: Sequence['outputs.GetHostsHostProtocolResult'],
                 source: str,
                 source_instance_id: str):
        """
        :param str active_address_type: Specify the new create a host of address types. Valid values: Public: the IP address of a Public network Private: Private network address.
        :param str comment: Specify a host of notes, supports up to 500 characters.
        :param str host_id: The host ID.
        :param str host_name: Specify the new create a host name of the supports up to 128 characters.
        :param str host_private_address: Specify the new create a host of the private network address, it is possible to use the domain name or IP ADDRESS.
        :param str host_public_address: Specify the new create a host of the IP address of a public network, it is possible to use the domain name or IP ADDRESS.
        :param str id: The ID of the Host.
        :param str instance_id: Specify the new create a host where the Bastion host ID of.
        :param str os_type: Specify the new create the host's operating system. Valid values: Linux Windows.
        :param Sequence['GetHostsHostProtocolArgs'] protocols: The host of the protocol information.
        :param str source: Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
        :param str source_instance_id: Specify the newly created ECS instance ID or dedicated cluster host ID.
        """
        pulumi.set(__self__, "active_address_type", active_address_type)
        pulumi.set(__self__, "comment", comment)
        pulumi.set(__self__, "host_id", host_id)
        pulumi.set(__self__, "host_name", host_name)
        pulumi.set(__self__, "host_private_address", host_private_address)
        pulumi.set(__self__, "host_public_address", host_public_address)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "os_type", os_type)
        pulumi.set(__self__, "protocols", protocols)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "source_instance_id", source_instance_id)

    @property
    @pulumi.getter(name="activeAddressType")
    def active_address_type(self) -> str:
        """
        Specify the new create a host of address types. Valid values: Public: the IP address of a Public network Private: Private network address.
        """
        return pulumi.get(self, "active_address_type")

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Specify a host of notes, supports up to 500 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="hostId")
    def host_id(self) -> str:
        """
        The host ID.
        """
        return pulumi.get(self, "host_id")

    @property
    @pulumi.getter(name="hostName")
    def host_name(self) -> str:
        """
        Specify the new create a host name of the supports up to 128 characters.
        """
        return pulumi.get(self, "host_name")

    @property
    @pulumi.getter(name="hostPrivateAddress")
    def host_private_address(self) -> str:
        """
        Specify the new create a host of the private network address, it is possible to use the domain name or IP ADDRESS.
        """
        return pulumi.get(self, "host_private_address")

    @property
    @pulumi.getter(name="hostPublicAddress")
    def host_public_address(self) -> str:
        """
        Specify the new create a host of the IP address of a public network, it is possible to use the domain name or IP ADDRESS.
        """
        return pulumi.get(self, "host_public_address")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the Host.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Specify the new create a host where the Bastion host ID of.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="osType")
    def os_type(self) -> str:
        """
        Specify the new create the host's operating system. Valid values: Linux Windows.
        """
        return pulumi.get(self, "os_type")

    @property
    @pulumi.getter
    def protocols(self) -> Sequence['outputs.GetHostsHostProtocolResult']:
        """
        The host of the protocol information.
        """
        return pulumi.get(self, "protocols")

    @property
    @pulumi.getter
    def source(self) -> str:
        """
        Specify the new create a host of source. Valid values: Local: localhost Ecs:ECS instance Rds:RDS exclusive cluster host.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="sourceInstanceId")
    def source_instance_id(self) -> str:
        """
        Specify the newly created ECS instance ID or dedicated cluster host ID.
        """
        return pulumi.get(self, "source_instance_id")


@pulumi.output_type
class GetHostsHostProtocolResult(dict):
    def __init__(__self__, *,
                 host_finger_print: str,
                 port: int,
                 protocol_name: str):
        """
        :param str host_finger_print: Host fingerprint information, it is possible to uniquely identify a host.
        :param int port: Host the service port of the RDS.
        :param str protocol_name: The host uses the protocol name.
        """
        pulumi.set(__self__, "host_finger_print", host_finger_print)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "protocol_name", protocol_name)

    @property
    @pulumi.getter(name="hostFingerPrint")
    def host_finger_print(self) -> str:
        """
        Host fingerprint information, it is possible to uniquely identify a host.
        """
        return pulumi.get(self, "host_finger_print")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        Host the service port of the RDS.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="protocolName")
    def protocol_name(self) -> str:
        """
        The host uses the protocol name.
        """
        return pulumi.get(self, "protocol_name")


@pulumi.output_type
class GetInstancesInstanceResult(dict):
    def __init__(__self__, *,
                 description: str,
                 id: str,
                 instance_status: str,
                 license_code: str,
                 private_domain: str,
                 public_domain: str,
                 public_network_access: bool,
                 security_group_ids: Sequence[str],
                 user_vswitch_id: str,
                 tags: Optional[Mapping[str, Any]] = None):
        """
        :param str description: The instance's remark.
        :param str id: The instance's id.
        :param str instance_status: The instance's status.
        :param str private_domain: The instance's private domain name.
        :param str public_domain: The instance's public domain name.
        :param bool public_network_access: The instance's public network access configuration.
        :param Sequence[str] security_group_ids: The instance's security group configuration.
        :param str user_vswitch_id: The instance's vSwitch ID.
        :param Mapping[str, Any] tags: A map of tags assigned to the bastionhost instance. It must be in the format:
               ```python
               import pulumi
               import pulumi_alicloud as alicloud
               
               instance = alicloud.bastionhost.get_instances(tags={
                   "tagKey1": "tagValue1",
               })
               ```
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_status", instance_status)
        pulumi.set(__self__, "license_code", license_code)
        pulumi.set(__self__, "private_domain", private_domain)
        pulumi.set(__self__, "public_domain", public_domain)
        pulumi.set(__self__, "public_network_access", public_network_access)
        pulumi.set(__self__, "security_group_ids", security_group_ids)
        pulumi.set(__self__, "user_vswitch_id", user_vswitch_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The instance's remark.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The instance's id.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceStatus")
    def instance_status(self) -> str:
        """
        The instance's status.
        """
        return pulumi.get(self, "instance_status")

    @property
    @pulumi.getter(name="licenseCode")
    def license_code(self) -> str:
        return pulumi.get(self, "license_code")

    @property
    @pulumi.getter(name="privateDomain")
    def private_domain(self) -> str:
        """
        The instance's private domain name.
        """
        return pulumi.get(self, "private_domain")

    @property
    @pulumi.getter(name="publicDomain")
    def public_domain(self) -> str:
        """
        The instance's public domain name.
        """
        return pulumi.get(self, "public_domain")

    @property
    @pulumi.getter(name="publicNetworkAccess")
    def public_network_access(self) -> bool:
        """
        The instance's public network access configuration.
        """
        return pulumi.get(self, "public_network_access")

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Sequence[str]:
        """
        The instance's security group configuration.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="userVswitchId")
    def user_vswitch_id(self) -> str:
        """
        The instance's vSwitch ID.
        """
        return pulumi.get(self, "user_vswitch_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, Any]]:
        """
        A map of tags assigned to the bastionhost instance. It must be in the format:
        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        instance = alicloud.bastionhost.get_instances(tags={
            "tagKey1": "tagValue1",
        })
        ```
        """
        return pulumi.get(self, "tags")


@pulumi.output_type
class GetUserGroupsGroupResult(dict):
    def __init__(__self__, *,
                 comment: str,
                 id: str,
                 instance_id: str,
                 user_group_id: str,
                 user_group_name: str):
        """
        :param str comment: Specify the New Group of Remark Information. Supports up to 500 Characters.
        :param str id: The ID of the User Group.
        :param str instance_id: Specify the New Group of the Bastion Host of Instance Id.
        :param str user_group_id: The User Group ID.
        :param str user_group_name: Specify the New Group Name. Supports up to 128 Characters.
        """
        pulumi.set(__self__, "comment", comment)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "user_group_id", user_group_id)
        pulumi.set(__self__, "user_group_name", user_group_name)

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Specify the New Group of Remark Information. Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the User Group.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        Specify the New Group of the Bastion Host of Instance Id.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="userGroupId")
    def user_group_id(self) -> str:
        """
        The User Group ID.
        """
        return pulumi.get(self, "user_group_id")

    @property
    @pulumi.getter(name="userGroupName")
    def user_group_name(self) -> str:
        """
        Specify the New Group Name. Supports up to 128 Characters.
        """
        return pulumi.get(self, "user_group_name")


@pulumi.output_type
class GetUsersUserResult(dict):
    def __init__(__self__, *,
                 comment: str,
                 display_name: str,
                 email: str,
                 id: str,
                 instance_id: str,
                 mobile: str,
                 mobile_country_code: str,
                 source: str,
                 source_user_id: str,
                 status: str,
                 user_id: str,
                 user_name: str):
        """
        :param str comment: Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        :param str display_name: Specify the New Created the User's Display Name. Supports up to 128 Characters.
        :param str email: Specify the New User's Mailbox.
        :param str id: The ID of the User.
        :param str instance_id: You Want to Query the User the Bastion Host ID of.
        :param str mobile: Specify the New of the User That Created a Different Mobile Phone Number from Your.
        :param str mobile_country_code: Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
        :param str source: Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
        :param str source_user_id: Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        :param str status: The status of the resource.
        :param str user_id: The User ID.
        :param str user_name: Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        pulumi.set(__self__, "comment", comment)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "mobile", mobile)
        pulumi.set(__self__, "mobile_country_code", mobile_country_code)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "source_user_id", source_user_id)
        pulumi.set(__self__, "status", status)
        pulumi.set(__self__, "user_id", user_id)
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        Specify the New Created the User's Display Name. Supports up to 128 Characters.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        Specify the New User's Mailbox.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the User.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        You Want to Query the User the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def mobile(self) -> str:
        """
        Specify the New of the User That Created a Different Mobile Phone Number from Your.
        """
        return pulumi.get(self, "mobile")

    @property
    @pulumi.getter(name="mobileCountryCode")
    def mobile_country_code(self) -> str:
        """
        Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN Value: CN: Mainland China (+86) HK: hong Kong, China (+852) Mo: Macau, China (+853) TW: Taiwan, China (+886) ru: Russian (+7) SG: Singapore (+65) My: malaysia (+60) ID: Indonesia (+62) De: Germany (+49) AU: Australia (+61) US: United States (+1) AE: dubai (+971) JP: Japan (+81) Introducing the Long-Range GB: United Kingdom (+44) in: India (+91) KR: South Korea (+82) Ph: philippines (+63) Ch: Switzerland (+41) Se: Sweden (+46).
        """
        return pulumi.get(self, "mobile_country_code")

    @property
    @pulumi.getter
    def source(self) -> str:
        """
        Specify the New of the User That Created the Source. Valid Values: Local: Local User RAM: Ram User.
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> str:
        """
        Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        """
        return pulumi.get(self, "source_user_id")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        The User ID.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> str:
        """
        Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        return pulumi.get(self, "user_name")


