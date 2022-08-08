# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AccountPrivilegeArgs', 'AccountPrivilege']

@pulumi.input_type
class AccountPrivilegeArgs:
    def __init__(__self__, *,
                 account_name: pulumi.Input[str],
                 db_cluster_id: pulumi.Input[str],
                 db_names: pulumi.Input[Sequence[pulumi.Input[str]]],
                 account_privilege: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountPrivilege resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[str] db_cluster_id: The Id of cluster in which account belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        :param pulumi.Input[str] account_privilege: The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        """
        pulumi.set(__self__, "account_name", account_name)
        pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        pulumi.set(__self__, "db_names", db_names)
        if account_privilege is not None:
            pulumi.set(__self__, "account_privilege", account_privilege)

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
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Input[str]:
        """
        The Id of cluster in which account belongs.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_cluster_id", value)

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
    @pulumi.getter(name="accountPrivilege")
    def account_privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        """
        return pulumi.get(self, "account_privilege")

    @account_privilege.setter
    def account_privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_privilege", value)


@pulumi.input_type
class _AccountPrivilegeState:
    def __init__(__self__, *,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_privilege: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AccountPrivilege resources.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[str] account_privilege: The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        :param pulumi.Input[str] db_cluster_id: The Id of cluster in which account belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        """
        if account_name is not None:
            pulumi.set(__self__, "account_name", account_name)
        if account_privilege is not None:
            pulumi.set(__self__, "account_privilege", account_privilege)
        if db_cluster_id is not None:
            pulumi.set(__self__, "db_cluster_id", db_cluster_id)
        if db_names is not None:
            pulumi.set(__self__, "db_names", db_names)

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
    @pulumi.getter(name="accountPrivilege")
    def account_privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        """
        return pulumi.get(self, "account_privilege")

    @account_privilege.setter
    def account_privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_privilege", value)

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of cluster in which account belongs.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_cluster_id", value)

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


class AccountPrivilege(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_privilege: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a PolarDB account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account.

        > **NOTE:** Available in v1.67.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        creation = config.get("creation")
        if creation is None:
            creation = "PolarDB"
        name = config.get("name")
        if name is None:
            name = "dbaccountprivilegebasic"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id)
        cluster = alicloud.polardb.Cluster("cluster",
            db_type="MySQL",
            db_version="8.0",
            pay_type="PostPaid",
            db_node_class="polar.mysql.x4.large",
            vswitch_id=default_switch.id,
            description=name)
        db = alicloud.polardb.Database("db",
            db_cluster_id=cluster.id,
            db_name="tftestdatabase")
        account = alicloud.polardb.Account("account",
            db_cluster_id=cluster.id,
            account_name="tftestnormal",
            account_password="Test12345",
            account_description=name)
        privilege = alicloud.polardb.AccountPrivilege("privilege",
            db_cluster_id=cluster.id,
            account_name=account.account_name,
            account_privilege="ReadOnly",
            db_names=[db.db_name])
        ```

        ## Import

        PolarDB account privilege can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:polardb/accountPrivilege:AccountPrivilege example "pc-12345:tf_account:ReadOnly"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[str] account_privilege: The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        :param pulumi.Input[str] db_cluster_id: The Id of cluster in which account belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountPrivilegeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a PolarDB account privilege resource and used to grant several database some access privilege. A database can be granted by multiple account.

        > **NOTE:** Available in v1.67.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        creation = config.get("creation")
        if creation is None:
            creation = "PolarDB"
        name = config.get("name")
        if name is None:
            name = "dbaccountprivilegebasic"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id)
        cluster = alicloud.polardb.Cluster("cluster",
            db_type="MySQL",
            db_version="8.0",
            pay_type="PostPaid",
            db_node_class="polar.mysql.x4.large",
            vswitch_id=default_switch.id,
            description=name)
        db = alicloud.polardb.Database("db",
            db_cluster_id=cluster.id,
            db_name="tftestdatabase")
        account = alicloud.polardb.Account("account",
            db_cluster_id=cluster.id,
            account_name="tftestnormal",
            account_password="Test12345",
            account_description=name)
        privilege = alicloud.polardb.AccountPrivilege("privilege",
            db_cluster_id=cluster.id,
            account_name=account.account_name,
            account_privilege="ReadOnly",
            db_names=[db.db_name])
        ```

        ## Import

        PolarDB account privilege can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:polardb/accountPrivilege:AccountPrivilege example "pc-12345:tf_account:ReadOnly"
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
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_name: Optional[pulumi.Input[str]] = None,
                 account_privilege: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
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
            __props__.__dict__["account_privilege"] = account_privilege
            if db_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_cluster_id'")
            __props__.__dict__["db_cluster_id"] = db_cluster_id
            if db_names is None and not opts.urn:
                raise TypeError("Missing required property 'db_names'")
            __props__.__dict__["db_names"] = db_names
        super(AccountPrivilege, __self__).__init__(
            'alicloud:polardb/accountPrivilege:AccountPrivilege',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_name: Optional[pulumi.Input[str]] = None,
            account_privilege: Optional[pulumi.Input[str]] = None,
            db_cluster_id: Optional[pulumi.Input[str]] = None,
            db_names: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'AccountPrivilege':
        """
        Get an existing AccountPrivilege resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_name: A specified account name.
        :param pulumi.Input[str] account_privilege: The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        :param pulumi.Input[str] db_cluster_id: The Id of cluster in which account belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] db_names: List of specified database name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountPrivilegeState.__new__(_AccountPrivilegeState)

        __props__.__dict__["account_name"] = account_name
        __props__.__dict__["account_privilege"] = account_privilege
        __props__.__dict__["db_cluster_id"] = db_cluster_id
        __props__.__dict__["db_names"] = db_names
        return AccountPrivilege(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> pulumi.Output[str]:
        """
        A specified account name.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="accountPrivilege")
    def account_privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege of one account access database. Valid values: ["ReadOnly", "ReadWrite"], ["DMLOnly", "DDLOnly"] added since version v1.101.0. Default to "ReadOnly".
        """
        return pulumi.get(self, "account_privilege")

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Output[str]:
        """
        The Id of cluster in which account belongs.
        """
        return pulumi.get(self, "db_cluster_id")

    @property
    @pulumi.getter(name="dbNames")
    def db_names(self) -> pulumi.Output[Sequence[str]]:
        """
        List of specified database name.
        """
        return pulumi.get(self, "db_names")

