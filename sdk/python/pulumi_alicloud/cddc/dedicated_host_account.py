# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DedicatedHostAccountArgs', 'DedicatedHostAccount']

@pulumi.input_type
class DedicatedHostAccountArgs:
    def __init__(__self__, *,
                 account_name: pulumi.Input[str],
                 account_password: pulumi.Input[str],
                 dedicated_host_id: pulumi.Input[str],
                 account_type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DedicatedHostAccount resource.
        :param pulumi.Input[str] account_name: The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        :param pulumi.Input[str] account_password: The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        :param pulumi.Input[str] dedicated_host_id: The ID of Dedicated the host.
        :param pulumi.Input[str] account_type: The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        """
        DedicatedHostAccountArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_name=account_name,
            account_password=account_password,
            dedicated_host_id=dedicated_host_id,
            account_type=account_type,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_name: Optional[pulumi.Input[str]] = None,
             account_password: Optional[pulumi.Input[str]] = None,
             dedicated_host_id: Optional[pulumi.Input[str]] = None,
             account_type: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_name is None and 'accountName' in kwargs:
            account_name = kwargs['accountName']
        if account_name is None:
            raise TypeError("Missing 'account_name' argument")
        if account_password is None and 'accountPassword' in kwargs:
            account_password = kwargs['accountPassword']
        if account_password is None:
            raise TypeError("Missing 'account_password' argument")
        if dedicated_host_id is None and 'dedicatedHostId' in kwargs:
            dedicated_host_id = kwargs['dedicatedHostId']
        if dedicated_host_id is None:
            raise TypeError("Missing 'dedicated_host_id' argument")
        if account_type is None and 'accountType' in kwargs:
            account_type = kwargs['accountType']

        _setter("account_name", account_name)
        _setter("account_password", account_password)
        _setter("dedicated_host_id", dedicated_host_id)
        if account_type is not None:
            _setter("account_type", account_type)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Input[str]:
        """
        The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter(name="accountPassword")
    def account_password(self) -> pulumi.Input[str]:
        """
        The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        """
        return pulumi.get(self, "account_password")

    @account_password.setter
    def account_password(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_password", value)

    @property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> pulumi.Input[str]:
        """
        The ID of Dedicated the host.
        """
        return pulumi.get(self, "dedicated_host_id")

    @dedicated_host_id.setter
    def dedicated_host_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "dedicated_host_id", value)

    @property
    @pulumi.getter(name="accountType")
    def account_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        """
        return pulumi.get(self, "account_type")

    @account_type.setter
    def account_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_type", value)


@pulumi.input_type
class _DedicatedHostAccountState:
    def __init__(__self__, *,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_password: Optional[pulumi.Input[str]] = None,
                 account_type: Optional[pulumi.Input[str]] = None,
                 dedicated_host_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DedicatedHostAccount resources.
        :param pulumi.Input[str] account_name: The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        :param pulumi.Input[str] account_password: The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        :param pulumi.Input[str] account_type: The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        :param pulumi.Input[str] dedicated_host_id: The ID of Dedicated the host.
        """
        _DedicatedHostAccountState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_name=account_name,
            account_password=account_password,
            account_type=account_type,
            dedicated_host_id=dedicated_host_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_name: Optional[pulumi.Input[str]] = None,
             account_password: Optional[pulumi.Input[str]] = None,
             account_type: Optional[pulumi.Input[str]] = None,
             dedicated_host_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if account_name is None and 'accountName' in kwargs:
            account_name = kwargs['accountName']
        if account_password is None and 'accountPassword' in kwargs:
            account_password = kwargs['accountPassword']
        if account_type is None and 'accountType' in kwargs:
            account_type = kwargs['accountType']
        if dedicated_host_id is None and 'dedicatedHostId' in kwargs:
            dedicated_host_id = kwargs['dedicatedHostId']

        if account_name is not None:
            _setter("account_name", account_name)
        if account_password is not None:
            _setter("account_password", account_password)
        if account_type is not None:
            _setter("account_type", account_type)
        if dedicated_host_id is not None:
            _setter("dedicated_host_id", dedicated_host_id)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter(name="accountPassword")
    def account_password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        """
        return pulumi.get(self, "account_password")

    @account_password.setter
    def account_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_password", value)

    @property
    @pulumi.getter(name="accountType")
    def account_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        """
        return pulumi.get(self, "account_type")

    @account_type.setter
    def account_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_type", value)

    @property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of Dedicated the host.
        """
        return pulumi.get(self, "dedicated_host_id")

    @dedicated_host_id.setter
    def dedicated_host_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dedicated_host_id", value)


class DedicatedHostAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_password: Optional[pulumi.Input[str]] = None,
                 account_type: Optional[pulumi.Input[str]] = None,
                 dedicated_host_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a ApsaraDB for MyBase Dedicated Host Account resource.

        For information about ApsaraDB for MyBase Dedicated Host Account and how to use it, see [What is Dedicated Host Account](https://www.alibabacloud.com/help/en/apsaradb-for-mybase/latest/creatededicatedhostaccount).

        > **NOTE:** Available since v1.148.0.

        > **NOTE:** Each Dedicated host can have only one account. Before you create an account for a host, make sure that the existing account is deleted.

        ## Import

        ApsaraDB for MyBase Dedicated Host Account can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cddc/dedicatedHostAccount:DedicatedHostAccount example <dedicated_host_id>:<account_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        :param pulumi.Input[str] account_password: The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        :param pulumi.Input[str] account_type: The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        :param pulumi.Input[str] dedicated_host_id: The ID of Dedicated the host.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DedicatedHostAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ApsaraDB for MyBase Dedicated Host Account resource.

        For information about ApsaraDB for MyBase Dedicated Host Account and how to use it, see [What is Dedicated Host Account](https://www.alibabacloud.com/help/en/apsaradb-for-mybase/latest/creatededicatedhostaccount).

        > **NOTE:** Available since v1.148.0.

        > **NOTE:** Each Dedicated host can have only one account. Before you create an account for a host, make sure that the existing account is deleted.

        ## Import

        ApsaraDB for MyBase Dedicated Host Account can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:cddc/dedicatedHostAccount:DedicatedHostAccount example <dedicated_host_id>:<account_name>
        ```

        :param str resource_name: The name of the resource.
        :param DedicatedHostAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DedicatedHostAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DedicatedHostAccountArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_password: Optional[pulumi.Input[str]] = None,
                 account_type: Optional[pulumi.Input[str]] = None,
                 dedicated_host_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DedicatedHostAccountArgs.__new__(DedicatedHostAccountArgs)

            if account_name is None and not opts.urn:
                raise TypeError("Missing required property 'account_name'")
            __props__.__dict__["account_name"] = account_name
            if account_password is None and not opts.urn:
                raise TypeError("Missing required property 'account_password'")
            __props__.__dict__["account_password"] = None if account_password is None else pulumi.Output.secret(account_password)
            __props__.__dict__["account_type"] = account_type
            if dedicated_host_id is None and not opts.urn:
                raise TypeError("Missing required property 'dedicated_host_id'")
            __props__.__dict__["dedicated_host_id"] = dedicated_host_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accountPassword"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DedicatedHostAccount, __self__).__init__(
            'alicloud:cddc/dedicatedHostAccount:DedicatedHostAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_name: Optional[pulumi.Input[str]] = None,
            account_password: Optional[pulumi.Input[str]] = None,
            account_type: Optional[pulumi.Input[str]] = None,
            dedicated_host_id: Optional[pulumi.Input[str]] = None) -> 'DedicatedHostAccount':
        """
        Get an existing DedicatedHostAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        :param pulumi.Input[str] account_password: The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        :param pulumi.Input[str] account_type: The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        :param pulumi.Input[str] dedicated_host_id: The ID of Dedicated the host.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DedicatedHostAccountState.__new__(_DedicatedHostAccountState)

        __props__.__dict__["account_name"] = account_name
        __props__.__dict__["account_password"] = account_password
        __props__.__dict__["account_type"] = account_type
        __props__.__dict__["dedicated_host_id"] = dedicated_host_id
        return DedicatedHostAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Output[str]:
        """
        The name of the Dedicated host account. The account name must be 2 to 16 characters in length, contain lower case letters, digits, and underscore(_). At the same time, the name must start with a letter and end with a letter or number.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="accountPassword")
    def account_password(self) -> pulumi.Output[str]:
        """
        The password of the Dedicated host account. The account password must be 6 to 32 characters in length, and can contain letters, digits, and special characters `!@#$%^&*()_+-=`.
        """
        return pulumi.get(self, "account_password")

    @property
    @pulumi.getter(name="accountType")
    def account_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of the Dedicated host account. Valid values: `Admin`, `Normal`.
        """
        return pulumi.get(self, "account_type")

    @property
    @pulumi.getter(name="dedicatedHostId")
    def dedicated_host_id(self) -> pulumi.Output[str]:
        """
        The ID of Dedicated the host.
        """
        return pulumi.get(self, "dedicated_host_id")

