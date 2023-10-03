# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ConnectionArgs', 'Connection']

@pulumi.input_type
class ConnectionArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 babelfish_port: Optional[pulumi.Input[str]] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Connection resource.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] babelfish_port: The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
               
               > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        ConnectionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_id=instance_id,
            babelfish_port=babelfish_port,
            connection_prefix=connection_prefix,
            port=port,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_id: pulumi.Input[str],
             babelfish_port: Optional[pulumi.Input[str]] = None,
             connection_prefix: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("instance_id", instance_id)
        if babelfish_port is not None:
            _setter("babelfish_port", babelfish_port)
        if connection_prefix is not None:
            _setter("connection_prefix", connection_prefix)
        if port is not None:
            _setter("port", port)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="babelfishPort")
    def babelfish_port(self) -> Optional[pulumi.Input[str]]:
        """
        The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.

        > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        """
        return pulumi.get(self, "babelfish_port")

    @babelfish_port.setter
    def babelfish_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "babelfish_port", value)

    @property
    @pulumi.getter(name="connectionPrefix")
    def connection_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        """
        return pulumi.get(self, "connection_prefix")

    @connection_prefix.setter
    def connection_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_prefix", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[str]]:
        """
        Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port", value)


@pulumi.input_type
class _ConnectionState:
    def __init__(__self__, *,
                 babelfish_port: Optional[pulumi.Input[str]] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 connection_string: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Connection resources.
        :param pulumi.Input[str] babelfish_port: The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
               
               > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        :param pulumi.Input[str] connection_string: Connection instance string.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] ip_address: The ip address of connection string.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        _ConnectionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            babelfish_port=babelfish_port,
            connection_prefix=connection_prefix,
            connection_string=connection_string,
            instance_id=instance_id,
            ip_address=ip_address,
            port=port,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             babelfish_port: Optional[pulumi.Input[str]] = None,
             connection_prefix: Optional[pulumi.Input[str]] = None,
             connection_string: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             ip_address: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if babelfish_port is not None:
            _setter("babelfish_port", babelfish_port)
        if connection_prefix is not None:
            _setter("connection_prefix", connection_prefix)
        if connection_string is not None:
            _setter("connection_string", connection_string)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if ip_address is not None:
            _setter("ip_address", ip_address)
        if port is not None:
            _setter("port", port)

    @property
    @pulumi.getter(name="babelfishPort")
    def babelfish_port(self) -> Optional[pulumi.Input[str]]:
        """
        The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.

        > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        """
        return pulumi.get(self, "babelfish_port")

    @babelfish_port.setter
    def babelfish_port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "babelfish_port", value)

    @property
    @pulumi.getter(name="connectionPrefix")
    def connection_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        """
        return pulumi.get(self, "connection_prefix")

    @connection_prefix.setter
    def connection_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_prefix", value)

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> Optional[pulumi.Input[str]]:
        """
        Connection instance string.
        """
        return pulumi.get(self, "connection_string")

    @connection_string.setter
    def connection_string(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "connection_string", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The ip address of connection string.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[str]]:
        """
        Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port", value)


class Connection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 babelfish_port: Optional[pulumi.Input[str]] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an RDS connection resource to allocate an Internet connection string for RDS instance, see [What is DB Connection](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-allocateinstancepublicconnection).

        > **NOTE:** Each RDS instance will allocate a intranet connnection string automatically and its prifix is RDS instance ID.
         To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.

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
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.t1.small",
            instance_storage=10,
            vswitch_id=default_switch.id,
            instance_name=name)
        default_connection = alicloud.rds.Connection("defaultConnection",
            instance_id=default_instance.id,
            connection_prefix="testabc")
        ```

        ## Import

        RDS connection can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/connection:Connection example abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] babelfish_port: The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
               
               > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an RDS connection resource to allocate an Internet connection string for RDS instance, see [What is DB Connection](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-allocateinstancepublicconnection).

        > **NOTE:** Each RDS instance will allocate a intranet connnection string automatically and its prifix is RDS instance ID.
         To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.

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
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_type="rds.mysql.t1.small",
            instance_storage=10,
            vswitch_id=default_switch.id,
            instance_name=name)
        default_connection = alicloud.rds.Connection("defaultConnection",
            instance_id=default_instance.id,
            connection_prefix="testabc")
        ```

        ## Import

        RDS connection can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:rds/connection:Connection example abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param ConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ConnectionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 babelfish_port: Optional[pulumi.Input[str]] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConnectionArgs.__new__(ConnectionArgs)

            __props__.__dict__["babelfish_port"] = babelfish_port
            __props__.__dict__["connection_prefix"] = connection_prefix
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            __props__.__dict__["port"] = port
            __props__.__dict__["connection_string"] = None
            __props__.__dict__["ip_address"] = None
        super(Connection, __self__).__init__(
            'alicloud:rds/connection:Connection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            babelfish_port: Optional[pulumi.Input[str]] = None,
            connection_prefix: Optional[pulumi.Input[str]] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[str]] = None) -> 'Connection':
        """
        Get an existing Connection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] babelfish_port: The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
               
               > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        :param pulumi.Input[str] connection_string: Connection instance string.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] ip_address: The ip address of connection string.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConnectionState.__new__(_ConnectionState)

        __props__.__dict__["babelfish_port"] = babelfish_port
        __props__.__dict__["connection_prefix"] = connection_prefix
        __props__.__dict__["connection_string"] = connection_string
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["port"] = port
        return Connection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="babelfishPort")
    def babelfish_port(self) -> pulumi.Output[str]:
        """
        The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.

        > **NOTE:** This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/babelfish-for-pg).
        """
        return pulumi.get(self, "babelfish_port")

    @property
    @pulumi.getter(name="connectionPrefix")
    def connection_prefix(self) -> pulumi.Output[str]:
        """
        Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 40 characters. Default to <instance_id> + 'tf'.
        """
        return pulumi.get(self, "connection_prefix")

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        Connection instance string.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The ip address of connection string.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[str]]:
        """
        Internet connection port. Valid value: [1000-5999]. Default to 3306.
        """
        return pulumi.get(self, "port")

