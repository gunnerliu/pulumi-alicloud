# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DbNodeArgs', 'DbNode']

@pulumi.input_type
class DbNodeArgs:
    def __init__(__self__, *,
                 class_code: pulumi.Input[str],
                 db_instance_id: pulumi.Input[str],
                 zone_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a DbNode resource.
        :param pulumi.Input[str] class_code: The specification information of the node.
        :param pulumi.Input[str] db_instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] zone_id: The zone ID of the node.
        """
        DbNodeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            class_code=class_code,
            db_instance_id=db_instance_id,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             class_code: Optional[pulumi.Input[str]] = None,
             db_instance_id: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if class_code is None and 'classCode' in kwargs:
            class_code = kwargs['classCode']
        if class_code is None:
            raise TypeError("Missing 'class_code' argument")
        if db_instance_id is None and 'dbInstanceId' in kwargs:
            db_instance_id = kwargs['dbInstanceId']
        if db_instance_id is None:
            raise TypeError("Missing 'db_instance_id' argument")
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']
        if zone_id is None:
            raise TypeError("Missing 'zone_id' argument")

        _setter("class_code", class_code)
        _setter("db_instance_id", db_instance_id)
        _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="classCode")
    def class_code(self) -> pulumi.Input[str]:
        """
        The specification information of the node.
        """
        return pulumi.get(self, "class_code")

    @class_code.setter
    def class_code(self, value: pulumi.Input[str]):
        pulumi.set(self, "class_code", value)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Input[str]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone ID of the node.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)


@pulumi.input_type
class _DbNodeState:
    def __init__(__self__, *,
                 class_code: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 node_id: Optional[pulumi.Input[str]] = None,
                 node_region_id: Optional[pulumi.Input[str]] = None,
                 node_role: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DbNode resources.
        :param pulumi.Input[str] class_code: The specification information of the node.
        :param pulumi.Input[str] db_instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] node_id: The ID of the node.
        :param pulumi.Input[str] node_region_id: The region ID of the node.
        :param pulumi.Input[str] node_role: The role of node.
        :param pulumi.Input[str] zone_id: The zone ID of the node.
        """
        _DbNodeState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            class_code=class_code,
            db_instance_id=db_instance_id,
            node_id=node_id,
            node_region_id=node_region_id,
            node_role=node_role,
            zone_id=zone_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             class_code: Optional[pulumi.Input[str]] = None,
             db_instance_id: Optional[pulumi.Input[str]] = None,
             node_id: Optional[pulumi.Input[str]] = None,
             node_region_id: Optional[pulumi.Input[str]] = None,
             node_role: Optional[pulumi.Input[str]] = None,
             zone_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if class_code is None and 'classCode' in kwargs:
            class_code = kwargs['classCode']
        if db_instance_id is None and 'dbInstanceId' in kwargs:
            db_instance_id = kwargs['dbInstanceId']
        if node_id is None and 'nodeId' in kwargs:
            node_id = kwargs['nodeId']
        if node_region_id is None and 'nodeRegionId' in kwargs:
            node_region_id = kwargs['nodeRegionId']
        if node_role is None and 'nodeRole' in kwargs:
            node_role = kwargs['nodeRole']
        if zone_id is None and 'zoneId' in kwargs:
            zone_id = kwargs['zoneId']

        if class_code is not None:
            _setter("class_code", class_code)
        if db_instance_id is not None:
            _setter("db_instance_id", db_instance_id)
        if node_id is not None:
            _setter("node_id", node_id)
        if node_region_id is not None:
            _setter("node_region_id", node_region_id)
        if node_role is not None:
            _setter("node_role", node_role)
        if zone_id is not None:
            _setter("zone_id", zone_id)

    @property
    @pulumi.getter(name="classCode")
    def class_code(self) -> Optional[pulumi.Input[str]]:
        """
        The specification information of the node.
        """
        return pulumi.get(self, "class_code")

    @class_code.setter
    def class_code(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "class_code", value)

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "db_instance_id")

    @db_instance_id.setter
    def db_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_instance_id", value)

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the node.
        """
        return pulumi.get(self, "node_id")

    @node_id.setter
    def node_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_id", value)

    @property
    @pulumi.getter(name="nodeRegionId")
    def node_region_id(self) -> Optional[pulumi.Input[str]]:
        """
        The region ID of the node.
        """
        return pulumi.get(self, "node_region_id")

    @node_region_id.setter
    def node_region_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_region_id", value)

    @property
    @pulumi.getter(name="nodeRole")
    def node_role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of node.
        """
        return pulumi.get(self, "node_role")

    @node_role.setter
    def node_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_role", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone ID of the node.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class DbNode(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 class_code: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provide RDS cluster instance to increase node resources, see [What is RDS DB Node](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createdbnodes).

        > **NOTE:** Available since v1.202.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="cluster",
            db_instance_storage_type="cloud_essd")
        default_instance_classes = alicloud.rds.get_instance_classes(zone_id=default_zones.ids[0],
            engine="MySQL",
            engine_version="8.0",
            category="cluster",
            db_instance_storage_type="cloud_essd",
            instance_charge_type="PostPaid")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.ids[0],
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="8.0",
            instance_type=default_instance_classes.instance_classes[0].instance_class,
            instance_storage=default_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            instance_name=name,
            vswitch_id=default_switch.id,
            monitoring_period=60,
            db_instance_storage_type="cloud_essd",
            security_group_ids=[default_security_group.id],
            zone_id=default_zones.ids[0],
            zone_id_slave_a=default_zones.ids[0])
        default_db_node = alicloud.rds.DbNode("defaultDbNode",
            db_instance_id=default_instance.id,
            class_code=default_instance.instance_type,
            zone_id=default_switch.zone_id)
        ```

        ## Import

        RDS MySQL database cluster node agent function can be imported using id, e.g.

        ```sh
         $ pulumi import alicloud:rds/dbNode:DbNode example <db_instance_id>:<node_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] class_code: The specification information of the node.
        :param pulumi.Input[str] db_instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] zone_id: The zone ID of the node.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DbNodeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provide RDS cluster instance to increase node resources, see [What is RDS DB Node](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/api-rds-2014-08-15-createdbnodes).

        > **NOTE:** Available since v1.202.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_zones = alicloud.rds.get_zones(engine="MySQL",
            engine_version="8.0",
            instance_charge_type="PostPaid",
            category="cluster",
            db_instance_storage_type="cloud_essd")
        default_instance_classes = alicloud.rds.get_instance_classes(zone_id=default_zones.ids[0],
            engine="MySQL",
            engine_version="8.0",
            category="cluster",
            db_instance_storage_type="cloud_essd",
            instance_charge_type="PostPaid")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.ids[0],
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="8.0",
            instance_type=default_instance_classes.instance_classes[0].instance_class,
            instance_storage=default_instance_classes.instance_classes[0].storage_range.min,
            instance_charge_type="Postpaid",
            instance_name=name,
            vswitch_id=default_switch.id,
            monitoring_period=60,
            db_instance_storage_type="cloud_essd",
            security_group_ids=[default_security_group.id],
            zone_id=default_zones.ids[0],
            zone_id_slave_a=default_zones.ids[0])
        default_db_node = alicloud.rds.DbNode("defaultDbNode",
            db_instance_id=default_instance.id,
            class_code=default_instance.instance_type,
            zone_id=default_switch.zone_id)
        ```

        ## Import

        RDS MySQL database cluster node agent function can be imported using id, e.g.

        ```sh
         $ pulumi import alicloud:rds/dbNode:DbNode example <db_instance_id>:<node_id>
        ```

        :param str resource_name: The name of the resource.
        :param DbNodeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DbNodeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DbNodeArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 class_code: Optional[pulumi.Input[str]] = None,
                 db_instance_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DbNodeArgs.__new__(DbNodeArgs)

            if class_code is None and not opts.urn:
                raise TypeError("Missing required property 'class_code'")
            __props__.__dict__["class_code"] = class_code
            if db_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'db_instance_id'")
            __props__.__dict__["db_instance_id"] = db_instance_id
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["node_id"] = None
            __props__.__dict__["node_region_id"] = None
            __props__.__dict__["node_role"] = None
        super(DbNode, __self__).__init__(
            'alicloud:rds/dbNode:DbNode',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            class_code: Optional[pulumi.Input[str]] = None,
            db_instance_id: Optional[pulumi.Input[str]] = None,
            node_id: Optional[pulumi.Input[str]] = None,
            node_region_id: Optional[pulumi.Input[str]] = None,
            node_role: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'DbNode':
        """
        Get an existing DbNode resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] class_code: The specification information of the node.
        :param pulumi.Input[str] db_instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] node_id: The ID of the node.
        :param pulumi.Input[str] node_region_id: The region ID of the node.
        :param pulumi.Input[str] node_role: The role of node.
        :param pulumi.Input[str] zone_id: The zone ID of the node.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DbNodeState.__new__(_DbNodeState)

        __props__.__dict__["class_code"] = class_code
        __props__.__dict__["db_instance_id"] = db_instance_id
        __props__.__dict__["node_id"] = node_id
        __props__.__dict__["node_region_id"] = node_region_id
        __props__.__dict__["node_role"] = node_role
        __props__.__dict__["zone_id"] = zone_id
        return DbNode(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="classCode")
    def class_code(self) -> pulumi.Output[str]:
        """
        The specification information of the node.
        """
        return pulumi.get(self, "class_code")

    @property
    @pulumi.getter(name="dbInstanceId")
    def db_instance_id(self) -> pulumi.Output[str]:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "db_instance_id")

    @property
    @pulumi.getter(name="nodeId")
    def node_id(self) -> pulumi.Output[str]:
        """
        The ID of the node.
        """
        return pulumi.get(self, "node_id")

    @property
    @pulumi.getter(name="nodeRegionId")
    def node_region_id(self) -> pulumi.Output[str]:
        """
        The region ID of the node.
        """
        return pulumi.get(self, "node_region_id")

    @property
    @pulumi.getter(name="nodeRole")
    def node_role(self) -> pulumi.Output[str]:
        """
        The role of node.
        """
        return pulumi.get(self, "node_role")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone ID of the node.
        """
        return pulumi.get(self, "zone_id")

