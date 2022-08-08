# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 source: pulumi.Input[str],
                 user_name: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 mobile_country_code: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] instance_id: You Want to Query the User the Bastion Host ID of.
        :param pulumi.Input[str] source: Specify the New of the User That Created the Source. Valid Values: 
               * Local: Local User
               * RAM: Ram User
        :param pulumi.Input[str] user_name: Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        :param pulumi.Input[str] comment: Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        :param pulumi.Input[str] display_name: Specify the New Created the User's Display Name. Supports up to 128 Characters.
        :param pulumi.Input[str] email: Specify the New User's Mailbox.
        :param pulumi.Input[str] mobile: Specify the New of the User That Created a Different Mobile Phone Number from Your.
        :param pulumi.Input[str] mobile_country_code: Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
               * CN: Mainland China (+86)
               * HK: hong Kong, China (+852)
               * MO: Macau, China (+853)
               * TW: Taiwan, China (+886)
               * RU: Russian (+7)
               * SG: Singapore (+65)
               * MY: malaysia (+60)
               * ID: Indonesia (+62)
               * DE: Germany (+49)
               * AU: Australia (+61)
               * US: United States (+1)
               * AE: dubai (+971)
               * JP: Japan (+81) Introducing the Long-Range
               * GB: United Kingdom (+44)
               * IN: India (+91)
               * KR: South Korea (+82)
               * PH: philippines (+63)
               * CH: Switzerland (+41)
               * SE: Sweden (+46)
        :param pulumi.Input[str] password: Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        :param pulumi.Input[str] source_user_id: Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Frozen`, `Normal`.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "source", source)
        pulumi.set(__self__, "user_name", user_name)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if mobile is not None:
            pulumi.set(__self__, "mobile", mobile)
        if mobile_country_code is not None:
            pulumi.set(__self__, "mobile_country_code", mobile_country_code)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if source_user_id is not None:
            pulumi.set(__self__, "source_user_id", source_user_id)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        You Want to Query the User the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def source(self) -> pulumi.Input[str]:
        """
        Specify the New of the User That Created the Source. Valid Values: 
        * Local: Local User
        * RAM: Ram User
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: pulumi.Input[str]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Created the User's Display Name. Supports up to 128 Characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New User's Mailbox.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter
    def mobile(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New of the User That Created a Different Mobile Phone Number from Your.
        """
        return pulumi.get(self, "mobile")

    @mobile.setter
    def mobile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile", value)

    @property
    @pulumi.getter(name="mobileCountryCode")
    def mobile_country_code(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
        * CN: Mainland China (+86)
        * HK: hong Kong, China (+852)
        * MO: Macau, China (+853)
        * TW: Taiwan, China (+886)
        * RU: Russian (+7)
        * SG: Singapore (+65)
        * MY: malaysia (+60)
        * ID: Indonesia (+62)
        * DE: Germany (+49)
        * AU: Australia (+61)
        * US: United States (+1)
        * AE: dubai (+971)
        * JP: Japan (+81) Introducing the Long-Range
        * GB: United Kingdom (+44)
        * IN: India (+91)
        * KR: South Korea (+82)
        * PH: philippines (+63)
        * CH: Switzerland (+41)
        * SE: Sweden (+46)
        """
        return pulumi.get(self, "mobile_country_code")

    @mobile_country_code.setter
    def mobile_country_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile_country_code", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        """
        return pulumi.get(self, "source_user_id")

    @source_user_id.setter
    def source_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_user_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `Frozen`, `Normal`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 mobile_country_code: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] comment: Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        :param pulumi.Input[str] display_name: Specify the New Created the User's Display Name. Supports up to 128 Characters.
        :param pulumi.Input[str] email: Specify the New User's Mailbox.
        :param pulumi.Input[str] instance_id: You Want to Query the User the Bastion Host ID of.
        :param pulumi.Input[str] mobile: Specify the New of the User That Created a Different Mobile Phone Number from Your.
        :param pulumi.Input[str] mobile_country_code: Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
               * CN: Mainland China (+86)
               * HK: hong Kong, China (+852)
               * MO: Macau, China (+853)
               * TW: Taiwan, China (+886)
               * RU: Russian (+7)
               * SG: Singapore (+65)
               * MY: malaysia (+60)
               * ID: Indonesia (+62)
               * DE: Germany (+49)
               * AU: Australia (+61)
               * US: United States (+1)
               * AE: dubai (+971)
               * JP: Japan (+81) Introducing the Long-Range
               * GB: United Kingdom (+44)
               * IN: India (+91)
               * KR: South Korea (+82)
               * PH: philippines (+63)
               * CH: Switzerland (+41)
               * SE: Sweden (+46)
        :param pulumi.Input[str] password: Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        :param pulumi.Input[str] source: Specify the New of the User That Created the Source. Valid Values: 
               * Local: Local User
               * RAM: Ram User
        :param pulumi.Input[str] source_user_id: Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Frozen`, `Normal`.
        :param pulumi.Input[str] user_id: The User ID.
        :param pulumi.Input[str] user_name: Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if mobile is not None:
            pulumi.set(__self__, "mobile", mobile)
        if mobile_country_code is not None:
            pulumi.set(__self__, "mobile_country_code", mobile_country_code)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if source_user_id is not None:
            pulumi.set(__self__, "source_user_id", source_user_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Created the User's Display Name. Supports up to 128 Characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New User's Mailbox.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        You Want to Query the User the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def mobile(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New of the User That Created a Different Mobile Phone Number from Your.
        """
        return pulumi.get(self, "mobile")

    @mobile.setter
    def mobile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile", value)

    @property
    @pulumi.getter(name="mobileCountryCode")
    def mobile_country_code(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
        * CN: Mainland China (+86)
        * HK: hong Kong, China (+852)
        * MO: Macau, China (+853)
        * TW: Taiwan, China (+886)
        * RU: Russian (+7)
        * SG: Singapore (+65)
        * MY: malaysia (+60)
        * ID: Indonesia (+62)
        * DE: Germany (+49)
        * AU: Australia (+61)
        * US: United States (+1)
        * AE: dubai (+971)
        * JP: Japan (+81) Introducing the Long-Range
        * GB: United Kingdom (+44)
        * IN: India (+91)
        * KR: South Korea (+82)
        * PH: philippines (+63)
        * CH: Switzerland (+41)
        * SE: Sweden (+46)
        """
        return pulumi.get(self, "mobile_country_code")

    @mobile_country_code.setter
    def mobile_country_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mobile_country_code", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New of the User That Created the Source. Valid Values: 
        * Local: Local User
        * RAM: Ram User
        """
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        """
        return pulumi.get(self, "source_user_id")

    @source_user_id.setter
    def source_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_user_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `Frozen`, `Normal`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The User ID.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 mobile_country_code: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Bastion Host User resource.

        For information about Bastion Host User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/204503.htm).

        > **NOTE:** Available in v1.133.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        local = alicloud.bastionhost.User("local",
            instance_id="example_value",
            mobile="13312345678",
            mobile_country_code="CN",
            password="YourPassword-123",
            source="Local",
            user_name="my-local-user")
        ram = alicloud.bastionhost.User("ram",
            instance_id="example_value",
            mobile="13312345678",
            mobile_country_code="CN",
            password="YourPassword-123",
            source="Ram",
            source_user_id="1234567890",
            user_name="my-ram-user")
        ```

        ## Import

        Bastion Host User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/user:User example <instance_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        :param pulumi.Input[str] display_name: Specify the New Created the User's Display Name. Supports up to 128 Characters.
        :param pulumi.Input[str] email: Specify the New User's Mailbox.
        :param pulumi.Input[str] instance_id: You Want to Query the User the Bastion Host ID of.
        :param pulumi.Input[str] mobile: Specify the New of the User That Created a Different Mobile Phone Number from Your.
        :param pulumi.Input[str] mobile_country_code: Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
               * CN: Mainland China (+86)
               * HK: hong Kong, China (+852)
               * MO: Macau, China (+853)
               * TW: Taiwan, China (+886)
               * RU: Russian (+7)
               * SG: Singapore (+65)
               * MY: malaysia (+60)
               * ID: Indonesia (+62)
               * DE: Germany (+49)
               * AU: Australia (+61)
               * US: United States (+1)
               * AE: dubai (+971)
               * JP: Japan (+81) Introducing the Long-Range
               * GB: United Kingdom (+44)
               * IN: India (+91)
               * KR: South Korea (+82)
               * PH: philippines (+63)
               * CH: Switzerland (+41)
               * SE: Sweden (+46)
        :param pulumi.Input[str] password: Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        :param pulumi.Input[str] source: Specify the New of the User That Created the Source. Valid Values: 
               * Local: Local User
               * RAM: Ram User
        :param pulumi.Input[str] source_user_id: Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Frozen`, `Normal`.
        :param pulumi.Input[str] user_name: Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Bastion Host User resource.

        For information about Bastion Host User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/204503.htm).

        > **NOTE:** Available in v1.133.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        local = alicloud.bastionhost.User("local",
            instance_id="example_value",
            mobile="13312345678",
            mobile_country_code="CN",
            password="YourPassword-123",
            source="Local",
            user_name="my-local-user")
        ram = alicloud.bastionhost.User("ram",
            instance_id="example_value",
            mobile="13312345678",
            mobile_country_code="CN",
            password="YourPassword-123",
            source="Ram",
            source_user_id="1234567890",
            user_name="my-ram-user")
        ```

        ## Import

        Bastion Host User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:bastionhost/user:User example <instance_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 mobile: Optional[pulumi.Input[str]] = None,
                 mobile_country_code: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 source_user_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["email"] = email
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["mobile"] = mobile
            __props__.__dict__["mobile_country_code"] = mobile_country_code
            __props__.__dict__["password"] = password
            if source is None and not opts.urn:
                raise TypeError("Missing required property 'source'")
            __props__.__dict__["source"] = source
            __props__.__dict__["source_user_id"] = source_user_id
            __props__.__dict__["status"] = status
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
            __props__.__dict__["user_id"] = None
        super(User, __self__).__init__(
            'alicloud:bastionhost/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            mobile: Optional[pulumi.Input[str]] = None,
            mobile_country_code: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            source: Optional[pulumi.Input[str]] = None,
            source_user_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        :param pulumi.Input[str] display_name: Specify the New Created the User's Display Name. Supports up to 128 Characters.
        :param pulumi.Input[str] email: Specify the New User's Mailbox.
        :param pulumi.Input[str] instance_id: You Want to Query the User the Bastion Host ID of.
        :param pulumi.Input[str] mobile: Specify the New of the User That Created a Different Mobile Phone Number from Your.
        :param pulumi.Input[str] mobile_country_code: Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
               * CN: Mainland China (+86)
               * HK: hong Kong, China (+852)
               * MO: Macau, China (+853)
               * TW: Taiwan, China (+886)
               * RU: Russian (+7)
               * SG: Singapore (+65)
               * MY: malaysia (+60)
               * ID: Indonesia (+62)
               * DE: Germany (+49)
               * AU: Australia (+61)
               * US: United States (+1)
               * AE: dubai (+971)
               * JP: Japan (+81) Introducing the Long-Range
               * GB: United Kingdom (+44)
               * IN: India (+91)
               * KR: South Korea (+82)
               * PH: philippines (+63)
               * CH: Switzerland (+41)
               * SE: Sweden (+46)
        :param pulumi.Input[str] password: Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        :param pulumi.Input[str] source: Specify the New of the User That Created the Source. Valid Values: 
               * Local: Local User
               * RAM: Ram User
        :param pulumi.Input[str] source_user_id: Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Frozen`, `Normal`.
        :param pulumi.Input[str] user_id: The User ID.
        :param pulumi.Input[str] user_name: Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["email"] = email
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["mobile"] = mobile
        __props__.__dict__["mobile_country_code"] = mobile_country_code
        __props__.__dict__["password"] = password
        __props__.__dict__["source"] = source
        __props__.__dict__["source_user_id"] = source_user_id
        __props__.__dict__["status"] = status
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["user_name"] = user_name
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        Specify the New Created the User's Display Name. Supports up to 128 Characters.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the New User's Mailbox.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        You Want to Query the User the Bastion Host ID of.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def mobile(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the New of the User That Created a Different Mobile Phone Number from Your.
        """
        return pulumi.get(self, "mobile")

    @property
    @pulumi.getter(name="mobileCountryCode")
    def mobile_country_code(self) -> pulumi.Output[str]:
        """
        Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
        * CN: Mainland China (+86)
        * HK: hong Kong, China (+852)
        * MO: Macau, China (+853)
        * TW: Taiwan, China (+886)
        * RU: Russian (+7)
        * SG: Singapore (+65)
        * MY: malaysia (+60)
        * ID: Indonesia (+62)
        * DE: Germany (+49)
        * AU: Australia (+61)
        * US: United States (+1)
        * AE: dubai (+971)
        * JP: Japan (+81) Introducing the Long-Range
        * GB: United Kingdom (+44)
        * IN: India (+91)
        * KR: South Korea (+82)
        * PH: philippines (+63)
        * CH: Switzerland (+41)
        * SE: Sweden (+46)
        """
        return pulumi.get(self, "mobile_country_code")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[str]:
        """
        Specify the New of the User That Created the Source. Valid Values: 
        * Local: Local User
        * RAM: Ram User
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter(name="sourceUserId")
    def source_user_id(self) -> pulumi.Output[Optional[str]]:
        """
        Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
        """
        return pulumi.get(self, "source_user_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource. Valid values: `Frozen`, `Normal`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The User ID.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
        """
        return pulumi.get(self, "user_name")

