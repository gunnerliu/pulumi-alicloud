# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['ReadWriteSplittingConnection']


class ReadWriteSplittingConnection(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 distribution_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 max_delay_time: Optional[pulumi.Input[float]] = None,
                 port: Optional[pulumi.Input[float]] = None,
                 weight: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an RDS read write splitting connection resource to allocate an Intranet connection string for RDS instance.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        creation = config.get("creation")
        if creation is None:
            creation = "Rds"
        name = config.get("name")
        if name is None:
            name = "dbInstancevpc"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vpc_id=default_network.id)
        default_instance = alicloud.rds.Instance("defaultInstance",
            engine="MySQL",
            engine_version="5.6",
            instance_charge_type="Postpaid",
            instance_name=name,
            instance_storage=20,
            instance_type="rds.mysql.t1.small",
            security_ips=[
                "10.168.1.12",
                "100.69.7.112",
            ],
            vswitch_id=default_switch.id)
        default_read_only_instance = alicloud.rds.ReadOnlyInstance("defaultReadOnlyInstance",
            engine_version=default_instance.engine_version,
            instance_name=f"{name}ro",
            instance_storage=30,
            instance_type=default_instance.instance_type,
            master_db_instance_id=default_instance.id,
            vswitch_id=default_switch.id,
            zone_id=default_instance.zone_id)
        default_read_write_splitting_connection = alicloud.rds.ReadWriteSplittingConnection("defaultReadWriteSplittingConnection",
            connection_prefix="t-con-123",
            distribution_type="Standard",
            instance_id=default_instance.id,
            opts=ResourceOptions(depends_on=["alicloud_db_readonly_instance.default"]))
        ```

        > **NOTE:** Resource `rds.ReadWriteSplittingConnection` should be created after `rds.ReadOnlyInstance`, so the `depends_on` statement is necessary.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
        :param pulumi.Input[str] distribution_type: Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[float] max_delay_time: Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
        :param pulumi.Input[float] port: Intranet connection port. Valid value: [3001-3999]. Default to 3306.
        :param pulumi.Input[Mapping[str, Any]] weight: Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distribution_type is set to Custom.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['connection_prefix'] = connection_prefix
            if distribution_type is None:
                raise TypeError("Missing required property 'distribution_type'")
            __props__['distribution_type'] = distribution_type
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            __props__['max_delay_time'] = max_delay_time
            __props__['port'] = port
            __props__['weight'] = weight
            __props__['connection_string'] = None
        super(ReadWriteSplittingConnection, __self__).__init__(
            'alicloud:rds/readWriteSplittingConnection:ReadWriteSplittingConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            connection_prefix: Optional[pulumi.Input[str]] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            distribution_type: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            max_delay_time: Optional[pulumi.Input[float]] = None,
            port: Optional[pulumi.Input[float]] = None,
            weight: Optional[pulumi.Input[Mapping[str, Any]]] = None) -> 'ReadWriteSplittingConnection':
        """
        Get an existing ReadWriteSplittingConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
        :param pulumi.Input[str] connection_string: Connection instance string.
        :param pulumi.Input[str] distribution_type: Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[float] max_delay_time: Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
        :param pulumi.Input[float] port: Intranet connection port. Valid value: [3001-3999]. Default to 3306.
        :param pulumi.Input[Mapping[str, Any]] weight: Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distribution_type is set to Custom.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["connection_prefix"] = connection_prefix
        __props__["connection_string"] = connection_string
        __props__["distribution_type"] = distribution_type
        __props__["instance_id"] = instance_id
        __props__["max_delay_time"] = max_delay_time
        __props__["port"] = port
        __props__["weight"] = weight
        return ReadWriteSplittingConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionPrefix")
    def connection_prefix(self) -> Optional[str]:
        """
        Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'rw'.
        """
        return pulumi.get(self, "connection_prefix")

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> str:
        """
        Connection instance string.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="distributionType")
    def distribution_type(self) -> str:
        """
        Read weight distribution mode. Values are as follows: `Standard` indicates automatic weight distribution based on types, `Custom` indicates custom weight distribution.
        """
        return pulumi.get(self, "distribution_type")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> str:
        """
        The Id of instance that can run database.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="maxDelayTime")
    def max_delay_time(self) -> float:
        """
        Delay threshold, in seconds. The value range is 0 to 7200. Default to 30. Read requests are not routed to the read-only instances with a delay greater than the threshold.
        """
        return pulumi.get(self, "max_delay_time")

    @property
    @pulumi.getter
    def port(self) -> float:
        """
        Intranet connection port. Valid value: [3001-3999]. Default to 3306.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def weight(self) -> Optional[Mapping[str, Any]]:
        """
        Read weight distribution. Read weights increase at a step of 100 up to 10,000. Enter weights in the following format: {"Instanceid":"Weight","Instanceid":"Weight"}. This parameter must be set when distribution_type is set to Custom.
        """
        return pulumi.get(self, "weight")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

