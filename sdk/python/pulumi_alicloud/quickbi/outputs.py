# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetUsersUserResult',
]

@pulumi.output_type
class GetUsersUserResult(dict):
    def __init__(__self__, *,
                 account_id: str,
                 account_name: str,
                 admin_user: bool,
                 auth_admin_user: bool,
                 email: str,
                 id: str,
                 nick_name: str,
                 phone: str,
                 user_id: str,
                 user_type: str):
        """
        :param str account_id: Alibaba Cloud account ID.
        :param str account_name: An Alibaba Cloud account, Alibaba Cloud name.
        :param bool admin_user: Whether it is the administrator. Valid values: `true` and `false`.
        :param bool auth_admin_user: Whether this is a permissions administrator. Valid values: `true` and `false`.
        :param str email: The email of the user.
        :param str id: The ID of the User.
        :param str nick_name: The nickname of the user.
        :param str phone: The phone number of the user.
        :param str user_id: The ID of the User.
        :param str user_type: The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "admin_user", admin_user)
        pulumi.set(__self__, "auth_admin_user", auth_admin_user)
        pulumi.set(__self__, "email", email)
        pulumi.set(__self__, "id", id)
        pulumi.set(__self__, "nick_name", nick_name)
        pulumi.set(__self__, "phone", phone)
        pulumi.set(__self__, "user_id", user_id)
        pulumi.set(__self__, "user_type", user_type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Alibaba Cloud account ID.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        An Alibaba Cloud account, Alibaba Cloud name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="adminUser")
    def admin_user(self) -> bool:
        """
        Whether it is the administrator. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "admin_user")

    @property
    @pulumi.getter(name="authAdminUser")
    def auth_admin_user(self) -> bool:
        """
        Whether this is a permissions administrator. Valid values: `true` and `false`.
        """
        return pulumi.get(self, "auth_admin_user")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        The email of the user.
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
    @pulumi.getter(name="nickName")
    def nick_name(self) -> str:
        """
        The nickname of the user.
        """
        return pulumi.get(self, "nick_name")

    @property
    @pulumi.getter
    def phone(self) -> str:
        """
        The phone number of the user.
        """
        return pulumi.get(self, "phone")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        The ID of the User.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userType")
    def user_type(self) -> str:
        """
        The members of the organization of the type of role separately. Valid values: `Analyst`, `Developer` and `Visitor`.
        """
        return pulumi.get(self, "user_type")


