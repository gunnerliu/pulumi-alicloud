# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['Connection']


class Connection(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 connection_prefix: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a connection resource to allocate an Internet connection string for instance.

        > **NOTE:**  Available in 1.48.0+

        > **NOTE:** Each instance will allocate a intranet connection string automatically and its prefix is instance ID.
         To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        creation = config.get("creation")
        if creation is None:
            creation = "Gpdb"
        name = config.get("name")
        if name is None:
            name = "gpdbConnectionBasic"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vpc_id=default_network.id)
        default_instance = alicloud.gpdb.Instance("defaultInstance",
            description=name,
            engine="gpdb",
            engine_version="4.3",
            instance_class="gpdb.group.segsdx2",
            instance_group_count="2",
            vswitch_id=default_switch.id)
        default_connection = alicloud.gpdb.Connection("defaultConnection",
            connection_prefix="testAbc",
            instance_id=default_instance.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [3200-3999]. Default to 3306.
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
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            __props__['port'] = port
            __props__['connection_string'] = None
            __props__['ip_address'] = None
        super(Connection, __self__).__init__(
            'alicloud:gpdb/connection:Connection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
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
        :param pulumi.Input[str] connection_prefix: Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
        :param pulumi.Input[str] connection_string: Connection instance string.
        :param pulumi.Input[str] instance_id: The Id of instance that can run database.
        :param pulumi.Input[str] ip_address: The ip address of connection string.
        :param pulumi.Input[str] port: Internet connection port. Valid value: [3200-3999]. Default to 3306.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["connection_prefix"] = connection_prefix
        __props__["connection_string"] = connection_string
        __props__["instance_id"] = instance_id
        __props__["ip_address"] = ip_address
        __props__["port"] = port
        return Connection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="connectionPrefix")
    def connection_prefix(self) -> pulumi.Output[str]:
        """
        Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + '-tf'.
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
        Internet connection port. Valid value: [3200-3999]. Default to 3306.
        """
        return pulumi.get(self, "port")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

