# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 email: pulumi.Input[str],
                 end_user_id: pulumi.Input[str],
                 password: Optional[pulumi.Input[str]] = None,
                 phone: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] email: The email of the user email.
        :param pulumi.Input[str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[str] password: The password of the user password.
        :param pulumi.Input[str] phone: The phone of the mobile phone number.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        UserArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            email=email,
            end_user_id=end_user_id,
            password=password,
            phone=phone,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             email: Optional[pulumi.Input[str]] = None,
             end_user_id: Optional[pulumi.Input[str]] = None,
             password: Optional[pulumi.Input[str]] = None,
             phone: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if email is None:
            raise TypeError("Missing 'email' argument")
        if end_user_id is None and 'endUserId' in kwargs:
            end_user_id = kwargs['endUserId']
        if end_user_id is None:
            raise TypeError("Missing 'end_user_id' argument")

        _setter("email", email)
        _setter("end_user_id", end_user_id)
        if password is not None:
            _setter("password", password)
        if phone is not None:
            _setter("phone", phone)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Input[str]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: pulumi.Input[str]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> pulumi.Input[str]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @end_user_id.setter
    def end_user_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "end_user_id", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input[str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "phone", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 email: Optional[pulumi.Input[str]] = None,
                 end_user_id: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 phone: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] email: The email of the user email.
        :param pulumi.Input[str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[str] password: The password of the user password.
        :param pulumi.Input[str] phone: The phone of the mobile phone number.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        _UserState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            email=email,
            end_user_id=end_user_id,
            password=password,
            phone=phone,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             email: Optional[pulumi.Input[str]] = None,
             end_user_id: Optional[pulumi.Input[str]] = None,
             password: Optional[pulumi.Input[str]] = None,
             phone: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if end_user_id is None and 'endUserId' in kwargs:
            end_user_id = kwargs['endUserId']

        if email is not None:
            _setter("email", email)
        if end_user_id is not None:
            _setter("end_user_id", end_user_id)
        if password is not None:
            _setter("password", password)
        if phone is not None:
            _setter("phone", phone)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @end_user_id.setter
    def end_user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_user_id", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def phone(self) -> Optional[pulumi.Input[str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @phone.setter
    def phone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "phone", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 end_user_id: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 phone: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Elastic Desktop Service (ECD) User resource.

        For information about Elastic Desktop Service (ECD) User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-eds-user-2021-03-08-createusers-desktop).

        > **NOTE:** Available since v1.142.0.

        ## Import

        ECD User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/user:User example <end_user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: The email of the user email.
        :param pulumi.Input[str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[str] password: The password of the user password.
        :param pulumi.Input[str] phone: The phone of the mobile phone number.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Elastic Desktop Service (ECD) User resource.

        For information about Elastic Desktop Service (ECD) User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/wuying-workspace/developer-reference/api-eds-user-2021-03-08-createusers-desktop).

        > **NOTE:** Available since v1.142.0.

        ## Import

        ECD User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eds/user:User example <end_user_id>
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
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 end_user_id: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 phone: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            if email is None and not opts.urn:
                raise TypeError("Missing required property 'email'")
            __props__.__dict__["email"] = email
            if end_user_id is None and not opts.urn:
                raise TypeError("Missing required property 'end_user_id'")
            __props__.__dict__["end_user_id"] = end_user_id
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            __props__.__dict__["phone"] = phone
            __props__.__dict__["status"] = status
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(User, __self__).__init__(
            'alicloud:eds/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email: Optional[pulumi.Input[str]] = None,
            end_user_id: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            phone: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email: The email of the user email.
        :param pulumi.Input[str] end_user_id: The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        :param pulumi.Input[str] password: The password of the user password.
        :param pulumi.Input[str] phone: The phone of the mobile phone number.
        :param pulumi.Input[str] status: The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["email"] = email
        __props__.__dict__["end_user_id"] = end_user_id
        __props__.__dict__["password"] = password
        __props__.__dict__["phone"] = phone
        __props__.__dict__["status"] = status
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[str]:
        """
        The email of the user email.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="endUserId")
    def end_user_id(self) -> pulumi.Output[str]:
        """
        The Username. The custom setting is composed of lowercase letters, numbers and underscores, and the length is 3~24 characters.
        """
        return pulumi.get(self, "end_user_id")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[Optional[str]]:
        """
        The password of the user password.
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def phone(self) -> pulumi.Output[Optional[str]]:
        """
        The phone of the mobile phone number.
        """
        return pulumi.get(self, "phone")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource. Valid values: `Unlocked`, `Locked`.
        """
        return pulumi.get(self, "status")

