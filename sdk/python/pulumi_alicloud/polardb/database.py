# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DatabaseArgs', 'Database']

@pulumi.input_type
class DatabaseArgs:
    def __init__(__self__, *,
                 db_cluster_id: pulumi.Input[str],
                 db_name: pulumi.Input[str],
                 character_set_name: Optional[pulumi.Input[str]] = None,
                 db_description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Database resource.
        :param pulumi.Input[str] db_cluster_id: The Id of cluster that can run database.
        :param pulumi.Input[str] db_name: Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        :param pulumi.Input[str] character_set_name: Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        :param pulumi.Input[str] db_description: Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        """
        DatabaseArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            db_cluster_id=db_cluster_id,
            db_name=db_name,
            character_set_name=character_set_name,
            db_description=db_description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             db_cluster_id: Optional[pulumi.Input[str]] = None,
             db_name: Optional[pulumi.Input[str]] = None,
             character_set_name: Optional[pulumi.Input[str]] = None,
             db_description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if db_cluster_id is None and 'dbClusterId' in kwargs:
            db_cluster_id = kwargs['dbClusterId']
        if db_cluster_id is None:
            raise TypeError("Missing 'db_cluster_id' argument")
        if db_name is None and 'dbName' in kwargs:
            db_name = kwargs['dbName']
        if db_name is None:
            raise TypeError("Missing 'db_name' argument")
        if character_set_name is None and 'characterSetName' in kwargs:
            character_set_name = kwargs['characterSetName']
        if db_description is None and 'dbDescription' in kwargs:
            db_description = kwargs['dbDescription']

        _setter("db_cluster_id", db_cluster_id)
        _setter("db_name", db_name)
        if character_set_name is not None:
            _setter("character_set_name", character_set_name)
        if db_description is not None:
            _setter("db_description", db_description)

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Input[str]:
        """
        The Id of cluster that can run database.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_cluster_id", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> pulumi.Input[str]:
        """
        Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_name", value)

    @property
    @pulumi.getter(name="characterSetName")
    def character_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        """
        return pulumi.get(self, "character_set_name")

    @character_set_name.setter
    def character_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "character_set_name", value)

    @property
    @pulumi.getter(name="dbDescription")
    def db_description(self) -> Optional[pulumi.Input[str]]:
        """
        Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        """
        return pulumi.get(self, "db_description")

    @db_description.setter
    def db_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_description", value)


@pulumi.input_type
class _DatabaseState:
    def __init__(__self__, *,
                 character_set_name: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_description: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Database resources.
        :param pulumi.Input[str] character_set_name: Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        :param pulumi.Input[str] db_cluster_id: The Id of cluster that can run database.
        :param pulumi.Input[str] db_description: Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        :param pulumi.Input[str] db_name: Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        _DatabaseState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            character_set_name=character_set_name,
            db_cluster_id=db_cluster_id,
            db_description=db_description,
            db_name=db_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             character_set_name: Optional[pulumi.Input[str]] = None,
             db_cluster_id: Optional[pulumi.Input[str]] = None,
             db_description: Optional[pulumi.Input[str]] = None,
             db_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if character_set_name is None and 'characterSetName' in kwargs:
            character_set_name = kwargs['characterSetName']
        if db_cluster_id is None and 'dbClusterId' in kwargs:
            db_cluster_id = kwargs['dbClusterId']
        if db_description is None and 'dbDescription' in kwargs:
            db_description = kwargs['dbDescription']
        if db_name is None and 'dbName' in kwargs:
            db_name = kwargs['dbName']

        if character_set_name is not None:
            _setter("character_set_name", character_set_name)
        if db_cluster_id is not None:
            _setter("db_cluster_id", db_cluster_id)
        if db_description is not None:
            _setter("db_description", db_description)
        if db_name is not None:
            _setter("db_name", db_name)

    @property
    @pulumi.getter(name="characterSetName")
    def character_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        """
        return pulumi.get(self, "character_set_name")

    @character_set_name.setter
    def character_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "character_set_name", value)

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of cluster that can run database.
        """
        return pulumi.get(self, "db_cluster_id")

    @db_cluster_id.setter
    def db_cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_cluster_id", value)

    @property
    @pulumi.getter(name="dbDescription")
    def db_description(self) -> Optional[pulumi.Input[str]]:
        """
        Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        """
        return pulumi.get(self, "db_description")

    @db_description.setter
    def db_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_description", value)

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        return pulumi.get(self, "db_name")

    @db_name.setter
    def db_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_name", value)


class Database(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 character_set_name: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_description: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a PolarDB database resource. A database deployed in a PolarDB cluster. A PolarDB cluster can own multiple databases.

        > **NOTE:** Available in v1.66.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_node_classes = alicloud.polardb.get_node_classes(db_type="MySQL",
            db_version="8.0",
            pay_type="PostPaid")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name="terraform-example",
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_node_classes.classes[0].zone_id,
            vswitch_name="terraform-example")
        default_cluster = alicloud.polardb.Cluster("defaultCluster",
            db_type="MySQL",
            db_version="8.0",
            db_node_class=default_node_classes.classes[0].supported_engines[0].available_resources[0].db_node_class,
            pay_type="PostPaid",
            vswitch_id=default_switch.id,
            description="terraform-example")
        default_database = alicloud.polardb.Database("defaultDatabase",
            db_cluster_id=default_cluster.id,
            db_name="terraform-example")
        ```

        ## Import

        PolarDB database can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:polardb/database:Database example "pc-12345:tf_database"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] character_set_name: Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        :param pulumi.Input[str] db_cluster_id: The Id of cluster that can run database.
        :param pulumi.Input[str] db_description: Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        :param pulumi.Input[str] db_name: Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a PolarDB database resource. A database deployed in a PolarDB cluster. A PolarDB cluster can own multiple databases.

        > **NOTE:** Available in v1.66.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_node_classes = alicloud.polardb.get_node_classes(db_type="MySQL",
            db_version="8.0",
            pay_type="PostPaid")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name="terraform-example",
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_node_classes.classes[0].zone_id,
            vswitch_name="terraform-example")
        default_cluster = alicloud.polardb.Cluster("defaultCluster",
            db_type="MySQL",
            db_version="8.0",
            db_node_class=default_node_classes.classes[0].supported_engines[0].available_resources[0].db_node_class,
            pay_type="PostPaid",
            vswitch_id=default_switch.id,
            description="terraform-example")
        default_database = alicloud.polardb.Database("defaultDatabase",
            db_cluster_id=default_cluster.id,
            db_name="terraform-example")
        ```

        ## Import

        PolarDB database can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:polardb/database:Database example "pc-12345:tf_database"
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DatabaseArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 character_set_name: Optional[pulumi.Input[str]] = None,
                 db_cluster_id: Optional[pulumi.Input[str]] = None,
                 db_description: Optional[pulumi.Input[str]] = None,
                 db_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseArgs.__new__(DatabaseArgs)

            __props__.__dict__["character_set_name"] = character_set_name
            if db_cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_cluster_id'")
            __props__.__dict__["db_cluster_id"] = db_cluster_id
            __props__.__dict__["db_description"] = db_description
            if db_name is None and not opts.urn:
                raise TypeError("Missing required property 'db_name'")
            __props__.__dict__["db_name"] = db_name
        super(Database, __self__).__init__(
            'alicloud:polardb/database:Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            character_set_name: Optional[pulumi.Input[str]] = None,
            db_cluster_id: Optional[pulumi.Input[str]] = None,
            db_description: Optional[pulumi.Input[str]] = None,
            db_name: Optional[pulumi.Input[str]] = None) -> 'Database':
        """
        Get an existing Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] character_set_name: Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        :param pulumi.Input[str] db_cluster_id: The Id of cluster that can run database.
        :param pulumi.Input[str] db_description: Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        :param pulumi.Input[str] db_name: Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseState.__new__(_DatabaseState)

        __props__.__dict__["character_set_name"] = character_set_name
        __props__.__dict__["db_cluster_id"] = db_cluster_id
        __props__.__dict__["db_description"] = db_description
        __props__.__dict__["db_name"] = db_name
        return Database(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="characterSetName")
    def character_set_name(self) -> pulumi.Output[Optional[str]]:
        """
        Character set. The value range is limited to the following: [ utf8, gbk, latin1, utf8mb4, Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ], default is "utf8" \\(`utf8mb4` only supports versions 5.5 and 5.6\\).
        """
        return pulumi.get(self, "character_set_name")

    @property
    @pulumi.getter(name="dbClusterId")
    def db_cluster_id(self) -> pulumi.Output[str]:
        """
        The Id of cluster that can run database.
        """
        return pulumi.get(self, "db_cluster_id")

    @property
    @pulumi.getter(name="dbDescription")
    def db_description(self) -> pulumi.Output[Optional[str]]:
        """
        Database description. It must start with a Chinese character or English letter, cannot start with "http://" or "https://". It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length must be 2-256 characters.
        """
        return pulumi.get(self, "db_description")

    @property
    @pulumi.getter(name="dbName")
    def db_name(self) -> pulumi.Output[str]:
        """
        Name of the database requiring a uniqueness check. It may consist of lower case letters, numbers, and underlines, and must start with a letterand have no more than 64 characters.
        """
        return pulumi.get(self, "db_name")

