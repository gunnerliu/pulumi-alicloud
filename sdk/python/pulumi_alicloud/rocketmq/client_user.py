# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ClientUserArgs', 'ClientUser']

@pulumi.input_type
class ClientUserArgs:
    def __init__(__self__, *,
                 bandwidth: pulumi.Input[int],
                 sag_id: pulumi.Input[str],
                 user_mail: pulumi.Input[str],
                 client_ip: Optional[pulumi.Input[str]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClientUser resource.
        :param pulumi.Input[int] bandwidth: The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance created for the SAG APP.
        :param pulumi.Input[str] user_mail: The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        :param pulumi.Input[str] client_ip: The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        :param pulumi.Input[str] password: The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        :param pulumi.Input[str] user_name: The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        pulumi.set(__self__, "bandwidth", bandwidth)
        pulumi.set(__self__, "sag_id", sag_id)
        pulumi.set(__self__, "user_mail", user_mail)
        if client_ip is not None:
            pulumi.set(__self__, "client_ip", client_ip)
        if kms_encrypted_password is not None:
            pulumi.set(__self__, "kms_encrypted_password", kms_encrypted_password)
        if kms_encryption_context is not None:
            pulumi.set(__self__, "kms_encryption_context", kms_encryption_context)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Input[int]:
        """
        The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: pulumi.Input[int]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> pulumi.Input[str]:
        """
        The ID of the SAG instance created for the SAG APP.
        """
        return pulumi.get(self, "sag_id")

    @sag_id.setter
    def sag_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "sag_id", value)

    @property
    @pulumi.getter(name="userMail")
    def user_mail(self) -> pulumi.Input[str]:
        """
        The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        """
        return pulumi.get(self, "user_mail")

    @user_mail.setter
    def user_mail(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_mail", value)

    @property
    @pulumi.getter(name="clientIp")
    def client_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        """
        return pulumi.get(self, "client_ip")

    @client_ip.setter
    def client_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_ip", value)

    @property
    @pulumi.getter(name="kmsEncryptedPassword")
    def kms_encrypted_password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "kms_encrypted_password")

    @kms_encrypted_password.setter
    def kms_encrypted_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_encrypted_password", value)

    @property
    @pulumi.getter(name="kmsEncryptionContext")
    def kms_encryption_context(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "kms_encryption_context")

    @kms_encryption_context.setter
    def kms_encryption_context(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "kms_encryption_context", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


@pulumi.input_type
class _ClientUserState:
    def __init__(__self__, *,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 client_ip: Optional[pulumi.Input[str]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 user_mail: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClientUser resources.
        :param pulumi.Input[int] bandwidth: The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        :param pulumi.Input[str] client_ip: The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        :param pulumi.Input[str] password: The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance created for the SAG APP.
        :param pulumi.Input[str] user_mail: The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        :param pulumi.Input[str] user_name: The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        if bandwidth is not None:
            pulumi.set(__self__, "bandwidth", bandwidth)
        if client_ip is not None:
            pulumi.set(__self__, "client_ip", client_ip)
        if kms_encrypted_password is not None:
            pulumi.set(__self__, "kms_encrypted_password", kms_encrypted_password)
        if kms_encryption_context is not None:
            pulumi.set(__self__, "kms_encryption_context", kms_encryption_context)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if sag_id is not None:
            pulumi.set(__self__, "sag_id", sag_id)
        if user_mail is not None:
            pulumi.set(__self__, "user_mail", user_mail)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def bandwidth(self) -> Optional[pulumi.Input[int]]:
        """
        The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        """
        return pulumi.get(self, "bandwidth")

    @bandwidth.setter
    def bandwidth(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "bandwidth", value)

    @property
    @pulumi.getter(name="clientIp")
    def client_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        """
        return pulumi.get(self, "client_ip")

    @client_ip.setter
    def client_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_ip", value)

    @property
    @pulumi.getter(name="kmsEncryptedPassword")
    def kms_encrypted_password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "kms_encrypted_password")

    @kms_encrypted_password.setter
    def kms_encrypted_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_encrypted_password", value)

    @property
    @pulumi.getter(name="kmsEncryptionContext")
    def kms_encryption_context(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        return pulumi.get(self, "kms_encryption_context")

    @kms_encryption_context.setter
    def kms_encryption_context(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "kms_encryption_context", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the SAG instance created for the SAG APP.
        """
        return pulumi.get(self, "sag_id")

    @sag_id.setter
    def sag_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sag_id", value)

    @property
    @pulumi.getter(name="userMail")
    def user_mail(self) -> Optional[pulumi.Input[str]]:
        """
        The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        """
        return pulumi.get(self, "user_mail")

    @user_mail.setter
    def user_mail(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_mail", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class ClientUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 client_ip: Optional[pulumi.Input[str]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 user_mail: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Sag ClientUser resource. This topic describes how to manage accounts as an administrator. After you configure the network, you can create multiple accounts and distribute them to end users so that clients can access Alibaba Cloud.

        For information about Sag ClientUser and how to use it, see [What is Sag ClientUser](https://www.alibabacloud.com/help/doc-detail/108326.htm).

        > **NOTE:** Available in 1.65.0+

        > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.rocketmq.ClientUser("default",
            bandwidth=20,
            client_ip="192.1.10.0",
            password="xxxxxxx",
            sag_id="sag-xxxxx",
            user_mail="tftest-xxxxx@test.com",
            user_name="th-username-xxxxx")
        ```

        ## Import

        The Sag ClientUser can be imported using the name, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/clientUser:ClientUser example sag-abc123456:tf-username-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        :param pulumi.Input[str] client_ip: The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        :param pulumi.Input[str] password: The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance created for the SAG APP.
        :param pulumi.Input[str] user_mail: The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        :param pulumi.Input[str] user_name: The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClientUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Sag ClientUser resource. This topic describes how to manage accounts as an administrator. After you configure the network, you can create multiple accounts and distribute them to end users so that clients can access Alibaba Cloud.

        For information about Sag ClientUser and how to use it, see [What is Sag ClientUser](https://www.alibabacloud.com/help/doc-detail/108326.htm).

        > **NOTE:** Available in 1.65.0+

        > **NOTE:** Only the following regions support. [`cn-shanghai`, `cn-shanghai-finance-1`, `cn-hongkong`, `ap-southeast-1`, `ap-southeast-2`, `ap-southeast-3`, `ap-southeast-5`, `ap-northeast-1`, `eu-central-1`]

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.rocketmq.ClientUser("default",
            bandwidth=20,
            client_ip="192.1.10.0",
            password="xxxxxxx",
            sag_id="sag-xxxxx",
            user_mail="tftest-xxxxx@test.com",
            user_name="th-username-xxxxx")
        ```

        ## Import

        The Sag ClientUser can be imported using the name, e.g.

        ```sh
         $ pulumi import alicloud:rocketmq/clientUser:ClientUser example sag-abc123456:tf-username-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param ClientUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClientUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bandwidth: Optional[pulumi.Input[int]] = None,
                 client_ip: Optional[pulumi.Input[str]] = None,
                 kms_encrypted_password: Optional[pulumi.Input[str]] = None,
                 kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 sag_id: Optional[pulumi.Input[str]] = None,
                 user_mail: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClientUserArgs.__new__(ClientUserArgs)

            if bandwidth is None and not opts.urn:
                raise TypeError("Missing required property 'bandwidth'")
            __props__.__dict__["bandwidth"] = bandwidth
            __props__.__dict__["client_ip"] = client_ip
            __props__.__dict__["kms_encrypted_password"] = kms_encrypted_password
            __props__.__dict__["kms_encryption_context"] = kms_encryption_context
            __props__.__dict__["password"] = password
            if sag_id is None and not opts.urn:
                raise TypeError("Missing required property 'sag_id'")
            __props__.__dict__["sag_id"] = sag_id
            if user_mail is None and not opts.urn:
                raise TypeError("Missing required property 'user_mail'")
            __props__.__dict__["user_mail"] = user_mail
            __props__.__dict__["user_name"] = user_name
        super(ClientUser, __self__).__init__(
            'alicloud:rocketmq/clientUser:ClientUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bandwidth: Optional[pulumi.Input[int]] = None,
            client_ip: Optional[pulumi.Input[str]] = None,
            kms_encrypted_password: Optional[pulumi.Input[str]] = None,
            kms_encryption_context: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            password: Optional[pulumi.Input[str]] = None,
            sag_id: Optional[pulumi.Input[str]] = None,
            user_mail: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'ClientUser':
        """
        Get an existing ClientUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] bandwidth: The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        :param pulumi.Input[str] client_ip: The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        :param pulumi.Input[str] password: The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        :param pulumi.Input[str] sag_id: The ID of the SAG instance created for the SAG APP.
        :param pulumi.Input[str] user_mail: The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        :param pulumi.Input[str] user_name: The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClientUserState.__new__(_ClientUserState)

        __props__.__dict__["bandwidth"] = bandwidth
        __props__.__dict__["client_ip"] = client_ip
        __props__.__dict__["kms_encrypted_password"] = kms_encrypted_password
        __props__.__dict__["kms_encryption_context"] = kms_encryption_context
        __props__.__dict__["password"] = password
        __props__.__dict__["sag_id"] = sag_id
        __props__.__dict__["user_mail"] = user_mail
        __props__.__dict__["user_name"] = user_name
        return ClientUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def bandwidth(self) -> pulumi.Output[int]:
        """
        The SAG APP bandwidth that the user can use. Unit: Kbit/s. Maximum value: 2000 Kbit/s.
        """
        return pulumi.get(self, "bandwidth")

    @property
    @pulumi.getter(name="clientIp")
    def client_ip(self) -> pulumi.Output[Optional[str]]:
        """
        The IP address of the SAG APP. If you specify this parameter, the current account always uses the specified IP address.Note The IP address must be in the private CIDR block of the SAG client.If you do not specify this parameter, the system automatically allocates an IP address from the private CIDR block of the SAG client. In this case, each re-connection uses a different IP address.
        """
        return pulumi.get(self, "client_ip")

    @property
    @pulumi.getter(name="kmsEncryptedPassword")
    def kms_encrypted_password(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "kms_encrypted_password")

    @property
    @pulumi.getter(name="kmsEncryptionContext")
    def kms_encryption_context(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        return pulumi.get(self, "kms_encryption_context")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        The password used to log on to the SAG APP.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="sagId")
    def sag_id(self) -> pulumi.Output[str]:
        """
        The ID of the SAG instance created for the SAG APP.
        """
        return pulumi.get(self, "sag_id")

    @property
    @pulumi.getter(name="userMail")
    def user_mail(self) -> pulumi.Output[str]:
        """
        The email address of the user. The administrator uses this address to send the account information for logging on to the APP to the user.
        """
        return pulumi.get(self, "user_mail")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        The user name. User names in the same SAG APP must be unique.Both the user name and the password must be specified. If you specify the user name, the password must be specified, too.
        """
        return pulumi.get(self, "user_name")

