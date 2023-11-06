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
                 directory_id: pulumi.Input[str],
                 user_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] user_name: The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        :param pulumi.Input[str] description: The description of user. The description can be up to `1024` characters long.
        :param pulumi.Input[str] display_name: The display name of user. The display name can be up to `256` characters long.
        :param pulumi.Input[str] email: The User's Contact Email Address. The email can be up to `128` characters long.
        :param pulumi.Input[str] first_name: The first name of user. The first_name can be up to `64` characters long.
        :param pulumi.Input[str] last_name: The last name of user. The last_name can be up to `64` characters long.
        :param pulumi.Input[str] status: The status of user. Valid values: `Disabled`, `Enabled`.
        """
        UserArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            directory_id=directory_id,
            user_name=user_name,
            description=description,
            display_name=display_name,
            email=email,
            first_name=first_name,
            last_name=last_name,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             directory_id: Optional[pulumi.Input[str]] = None,
             user_name: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             email: Optional[pulumi.Input[str]] = None,
             first_name: Optional[pulumi.Input[str]] = None,
             last_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if directory_id is None and 'directoryId' in kwargs:
            directory_id = kwargs['directoryId']
        if directory_id is None:
            raise TypeError("Missing 'directory_id' argument")
        if user_name is None and 'userName' in kwargs:
            user_name = kwargs['userName']
        if user_name is None:
            raise TypeError("Missing 'user_name' argument")
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if first_name is None and 'firstName' in kwargs:
            first_name = kwargs['firstName']
        if last_name is None and 'lastName' in kwargs:
            last_name = kwargs['lastName']

        _setter("directory_id", directory_id)
        _setter("user_name", user_name)
        if description is not None:
            _setter("description", description)
        if display_name is not None:
            _setter("display_name", display_name)
        if email is not None:
            _setter("email", email)
        if first_name is not None:
            _setter("first_name", first_name)
        if last_name is not None:
            _setter("last_name", last_name)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Input[str]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of user. The description can be up to `1024` characters long.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of user. The display name can be up to `256` characters long.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The User's Contact Email Address. The email can be up to `128` characters long.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[pulumi.Input[str]]:
        """
        The first name of user. The first_name can be up to `64` characters long.
        """
        return pulumi.get(self, "first_name")

    @first_name.setter
    def first_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "first_name", value)

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[pulumi.Input[str]]:
        """
        The last name of user. The last_name can be up to `64` characters long.
        """
        return pulumi.get(self, "last_name")

    @last_name.setter
    def last_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of user. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] description: The description of user. The description can be up to `1024` characters long.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] display_name: The display name of user. The display name can be up to `256` characters long.
        :param pulumi.Input[str] email: The User's Contact Email Address. The email can be up to `128` characters long.
        :param pulumi.Input[str] first_name: The first name of user. The first_name can be up to `64` characters long.
        :param pulumi.Input[str] last_name: The last name of user. The last_name can be up to `64` characters long.
        :param pulumi.Input[str] status: The status of user. Valid values: `Disabled`, `Enabled`.
        :param pulumi.Input[str] user_id: The User ID of the group.
        :param pulumi.Input[str] user_name: The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        """
        _UserState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            directory_id=directory_id,
            display_name=display_name,
            email=email,
            first_name=first_name,
            last_name=last_name,
            status=status,
            user_id=user_id,
            user_name=user_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             directory_id: Optional[pulumi.Input[str]] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             email: Optional[pulumi.Input[str]] = None,
             first_name: Optional[pulumi.Input[str]] = None,
             last_name: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             user_id: Optional[pulumi.Input[str]] = None,
             user_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if directory_id is None and 'directoryId' in kwargs:
            directory_id = kwargs['directoryId']
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if first_name is None and 'firstName' in kwargs:
            first_name = kwargs['firstName']
        if last_name is None and 'lastName' in kwargs:
            last_name = kwargs['lastName']
        if user_id is None and 'userId' in kwargs:
            user_id = kwargs['userId']
        if user_name is None and 'userName' in kwargs:
            user_name = kwargs['userName']

        if description is not None:
            _setter("description", description)
        if directory_id is not None:
            _setter("directory_id", directory_id)
        if display_name is not None:
            _setter("display_name", display_name)
        if email is not None:
            _setter("email", email)
        if first_name is not None:
            _setter("first_name", first_name)
        if last_name is not None:
            _setter("last_name", last_name)
        if status is not None:
            _setter("status", status)
        if user_id is not None:
            _setter("user_id", user_id)
        if user_name is not None:
            _setter("user_name", user_name)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of user. The description can be up to `1024` characters long.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of user. The display name can be up to `256` characters long.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def email(self) -> Optional[pulumi.Input[str]]:
        """
        The User's Contact Email Address. The email can be up to `128` characters long.
        """
        return pulumi.get(self, "email")

    @email.setter
    def email(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email", value)

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[pulumi.Input[str]]:
        """
        The first name of user. The first_name can be up to `64` characters long.
        """
        return pulumi.get(self, "first_name")

    @first_name.setter
    def first_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "first_name", value)

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[pulumi.Input[str]]:
        """
        The last name of user. The last_name can be up to `64` characters long.
        """
        return pulumi.get(self, "last_name")

    @last_name.setter
    def last_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of user. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        The User ID of the group.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
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
                 description: Optional[pulumi.Input[str]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloud SSO User resource.

        For information about Cloud SSO User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createuser).

        > **NOTE:** Available since v1.140.0.

        > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

        ## Import

        Cloud SSO User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudsso/user:User example <directory_id>:<user_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of user. The description can be up to `1024` characters long.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] display_name: The display name of user. The display name can be up to `256` characters long.
        :param pulumi.Input[str] email: The User's Contact Email Address. The email can be up to `128` characters long.
        :param pulumi.Input[str] first_name: The first name of user. The first_name can be up to `64` characters long.
        :param pulumi.Input[str] last_name: The last name of user. The last_name can be up to `64` characters long.
        :param pulumi.Input[str] status: The status of user. Valid values: `Disabled`, `Enabled`.
        :param pulumi.Input[str] user_name: The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloud SSO User resource.

        For information about Cloud SSO User and how to use it, see [What is User](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createuser).

        > **NOTE:** Available since v1.140.0.

        > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region

        ## Import

        Cloud SSO User can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cloudsso/user:User example <directory_id>:<user_id>
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
                 description: Optional[pulumi.Input[str]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 email: Optional[pulumi.Input[str]] = None,
                 first_name: Optional[pulumi.Input[str]] = None,
                 last_name: Optional[pulumi.Input[str]] = None,
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

            __props__.__dict__["description"] = description
            if directory_id is None and not opts.urn:
                raise TypeError("Missing required property 'directory_id'")
            __props__.__dict__["directory_id"] = directory_id
            __props__.__dict__["display_name"] = display_name
            __props__.__dict__["email"] = email
            __props__.__dict__["first_name"] = first_name
            __props__.__dict__["last_name"] = last_name
            __props__.__dict__["status"] = status
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
            __props__.__dict__["user_id"] = None
        super(User, __self__).__init__(
            'alicloud:cloudsso/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            directory_id: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            email: Optional[pulumi.Input[str]] = None,
            first_name: Optional[pulumi.Input[str]] = None,
            last_name: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of user. The description can be up to `1024` characters long.
        :param pulumi.Input[str] directory_id: The ID of the Directory.
        :param pulumi.Input[str] display_name: The display name of user. The display name can be up to `256` characters long.
        :param pulumi.Input[str] email: The User's Contact Email Address. The email can be up to `128` characters long.
        :param pulumi.Input[str] first_name: The first name of user. The first_name can be up to `64` characters long.
        :param pulumi.Input[str] last_name: The last name of user. The last_name can be up to `64` characters long.
        :param pulumi.Input[str] status: The status of user. Valid values: `Disabled`, `Enabled`.
        :param pulumi.Input[str] user_id: The User ID of the group.
        :param pulumi.Input[str] user_name: The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["description"] = description
        __props__.__dict__["directory_id"] = directory_id
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["email"] = email
        __props__.__dict__["first_name"] = first_name
        __props__.__dict__["last_name"] = last_name
        __props__.__dict__["status"] = status
        __props__.__dict__["user_id"] = user_id
        __props__.__dict__["user_name"] = user_name
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of user. The description can be up to `1024` characters long.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Output[str]:
        """
        The ID of the Directory.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        The display name of user. The display name can be up to `256` characters long.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def email(self) -> pulumi.Output[Optional[str]]:
        """
        The User's Contact Email Address. The email can be up to `128` characters long.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> pulumi.Output[Optional[str]]:
        """
        The first name of user. The first_name can be up to `64` characters long.
        """
        return pulumi.get(self, "first_name")

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> pulumi.Output[Optional[str]]:
        """
        The last name of user. The last_name can be up to `64` characters long.
        """
        return pulumi.get(self, "last_name")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of user. Valid values: `Disabled`, `Enabled`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[str]:
        """
        The User ID of the group.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        The name of user. The name must be `1` to `64` characters in length and can contain letters, digits, at signs (@), periods (.), underscores (_), and hyphens (-).
        """
        return pulumi.get(self, "user_name")

