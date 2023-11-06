# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AccountPrivilegeArgs', 'AccountPrivilege']

@pulumi.input_type
class AccountPrivilegeArgs:
    def __init__(__self__, *,
                 account_name: pulumi.Input[str],
                 db_names: pulumi.Input[Sequence[pulumi.Input[str]]],
                 instance_id: pulumi.Input[str],
                 privilege: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountPrivilege resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        :param pulumi.Input[str] instance_id: The Id of instance in which account belongs.
        :param pulumi.Input[str] privilege: The privilege of one account access database. Valid values: 
               - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
               - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
               - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
               Default to "ReadOnly".
        """
        AccountPrivilegeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_name=account_name,
            db_names=db_names,
            instance_id=instance_id,
            privilege=privilege,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_name: Optional[pulumi.Input[str]] = None,
             db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_name is None and 'accountName' in kwargs:
            account_name = kwargs['accountName']
        if account_name is None:
            raise TypeError("Missing 'account_name' argument")
        if db_names is None and 'dbNames' in kwargs:
            db_names = kwargs['dbNames']
        if db_names is None:
            raise TypeError("Missing 'db_names' argument")
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']
        if instance_id is None:
            raise TypeError("Missing 'instance_id' argument")

        _setter("account_name", account_name)
        _setter("db_names", db_names)
        _setter("instance_id", instance_id)
        if privilege is not None:
            _setter("privilege", privilege)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Input[str]:
        """
        A specified account name.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter(name="dbNames")
    def db_names(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of specified database name.
        """
        return pulumi.get(self, "db_names")

    @db_names.setter
    def db_names(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "db_names", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The Id of instance in which account belongs.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege of one account access database. Valid values: 
        - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        Default to "ReadOnly".
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)


@pulumi.input_type
class _AccountPrivilegeState:
    def __init__(__self__, *,
                 account_name: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccountPrivilege resources.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        :param pulumi.Input[str] instance_id: The Id of instance in which account belongs.
        :param pulumi.Input[str] privilege: The privilege of one account access database. Valid values: 
               - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
               - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
               - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
               Default to "ReadOnly".
        """
        _AccountPrivilegeState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            account_name=account_name,
            db_names=db_names,
            instance_id=instance_id,
            privilege=privilege,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             account_name: Optional[pulumi.Input[str]] = None,
             db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if account_name is None and 'accountName' in kwargs:
            account_name = kwargs['accountName']
        if db_names is None and 'dbNames' in kwargs:
            db_names = kwargs['dbNames']
        if instance_id is None and 'instanceId' in kwargs:
            instance_id = kwargs['instanceId']

        if account_name is not None:
            _setter("account_name", account_name)
        if db_names is not None:
            _setter("db_names", db_names)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if privilege is not None:
            _setter("privilege", privilege)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> Optional[pulumi.Input[str]]:
        """
        A specified account name.
        """
        return pulumi.get(self, "account_name")

    @account_name.setter
    def account_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_name", value)

    @property
    @pulumi.getter(name="dbNames")
    def db_names(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of specified database name.
        """
        return pulumi.get(self, "db_names")

    @db_names.setter
    def db_names(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "db_names", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of instance in which account belongs.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege of one account access database. Valid values: 
        - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        Default to "ReadOnly".
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)


class AccountPrivilege(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).

        > **NOTE:** At present, a database can only have one database owner.

        > **NOTE:** Available since v1.5.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="5.6")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        instance = alicloud.rds.Instance("instance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.s1.small",
            instance_storage=10,
            vswitch_id=default_switch.id,
            instance_name=name)
        db = []
        for range in [{"value": i} for i in range(0, 2)]:
            db.append(alicloud.rds.Database(f"db-{range['value']}",
                instance_id=instance.id,
                description="from terraform"))
        account = alicloud.rds.Account("account",
            db_instance_id=instance.id,
            account_name="tfexample",
            account_password="Example12345",
            account_description="from terraform")
        privilege = alicloud.rds.AccountPrivilege("privilege",
            instance_id=instance.id,
            account_name=account.name,
            privilege="ReadOnly",
            db_names=[__item.name for __item in db])
        ```

        ## Import

        RDS account privilege can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example "rm-12345:tf_account:ReadOnly"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        :param pulumi.Input[str] instance_id: The Id of instance in which account belongs.
        :param pulumi.Input[str] privilege: The privilege of one account access database. Valid values: 
               - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
               - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
               - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
               Default to "ReadOnly".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountPrivilegeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an RDS account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account, see [What is DB Account Privilege](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-grantaccountprivilege).

        > **NOTE:** At present, a database can only have one database owner.

        > **NOTE:** Available since v1.5.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="5.6")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        instance = alicloud.rds.Instance("instance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.s1.small",
            instance_storage=10,
            vswitch_id=default_switch.id,
            instance_name=name)
        db = []
        for range in [{"value": i} for i in range(0, 2)]:
            db.append(alicloud.rds.Database(f"db-{range['value']}",
                instance_id=instance.id,
                description="from terraform"))
        account = alicloud.rds.Account("account",
            db_instance_id=instance.id,
            account_name="tfexample",
            account_password="Example12345",
            account_description="from terraform")
        privilege = alicloud.rds.AccountPrivilege("privilege",
            instance_id=instance.id,
            account_name=account.name,
            privilege="ReadOnly",
            db_names=[__item.name for __item in db])
        ```

        ## Import

        RDS account privilege can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/accountPrivilege:AccountPrivilege example "rm-12345:tf_account:ReadOnly"
        ```

        :param str resource_name: The name of the resource.
        :param AccountPrivilegeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountPrivilegeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AccountPrivilegeArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountPrivilegeArgs.__new__(AccountPrivilegeArgs)

            if account_name is None and not opts.urn:
                raise TypeError("Missing required property 'account_name'")
            __props__.__dict__["account_name"] = account_name
            if db_names is None and not opts.urn:
                raise TypeError("Missing required property 'db_names'")
            __props__.__dict__["db_names"] = db_names
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["privilege"] = privilege
        super(AccountPrivilege, __self__).__init__(
            'alicloud:rds/accountPrivilege:AccountPrivilege',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_name: Optional[pulumi.Input[str]] = None,
            db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            privilege: Optional[pulumi.Input[str]] = None) -> 'AccountPrivilege':
        """
        Get an existing AccountPrivilege resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        :param pulumi.Input[str] instance_id: The Id of instance in which account belongs.
        :param pulumi.Input[str] privilege: The privilege of one account access database. Valid values: 
               - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
               - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
               - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
               - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
               Default to "ReadOnly".
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountPrivilegeState.__new__(_AccountPrivilegeState)

        __props__.__dict__["account_name"] = account_name
        __props__.__dict__["db_names"] = db_names
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["privilege"] = privilege
        return AccountPrivilege(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Output[str]:
        """
        A specified account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="dbNames")
    def db_names(self) -> pulumi.Output[Sequence[str]]:
        """
        List of specified database name.
        """
        return pulumi.get(self, "db_names")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The Id of instance in which account belongs.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege of one account access database. Valid values: 
        - ReadOnly: This value is only for MySQL, MariaDB and SQL Server
        - ReadWrite: This value is only for MySQL, MariaDB and SQL Server
        - DDLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DMLOnly: (Available in 1.64.0+) This value is only for MySQL and MariaDB
        - DBOwner: (Available in 1.64.0+) This value is only for SQL Server and PostgreSQL.
        Default to "ReadOnly".
        """
        return pulumi.get(self, "privilege")

