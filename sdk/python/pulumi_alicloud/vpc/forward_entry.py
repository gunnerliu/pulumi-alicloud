# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['ForwardEntry']


class ForwardEntry(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 external_ip: Optional[pulumi.Input[str]] = None,
                 external_port: Optional[pulumi.Input[str]] = None,
                 forward_table_id: Optional[pulumi.Input[str]] = None,
                 internal_ip: Optional[pulumi.Input[str]] = None,
                 internal_port: Optional[pulumi.Input[str]] = None,
                 ip_protocol: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a forward resource.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "forward-entry-example-name"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/12")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/21",
            vpc_id=default_network.id)
        default_nat_gateway = alicloud.vpc.NatGateway("defaultNatGateway",
            specification="Small",
            vpc_id=default_network.id)
        default_eip = alicloud.ecs.Eip("defaultEip")
        default_eip_association = alicloud.ecs.EipAssociation("defaultEipAssociation",
            allocation_id=default_eip.id,
            instance_id=default_nat_gateway.id)
        default_forward_entry = alicloud.vpc.ForwardEntry("defaultForwardEntry",
            external_ip=default_eip.ip_address,
            external_port="80",
            forward_table_id=default_nat_gateway.forward_table_ids,
            internal_ip="172.16.0.3",
            internal_port="8080",
            ip_protocol="tcp")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] external_ip: The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidth_packages`.
        :param pulumi.Input[str] external_port: The external port, valid value is 1~65535|any.
        :param pulumi.Input[str] forward_table_id: The value can get from `vpc.NatGateway` Attributes "forward_table_ids".
        :param pulumi.Input[str] internal_ip: The internal ip, must a private ip.
        :param pulumi.Input[str] internal_port: The internal port, valid value is 1~65535|any.
        :param pulumi.Input[str] ip_protocol: The ip protocal, valid value is tcp|udp|any.
        :param pulumi.Input[str] name: The name of forward entry.
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

            if external_ip is None:
                raise TypeError("Missing required property 'external_ip'")
            __props__['external_ip'] = external_ip
            if external_port is None:
                raise TypeError("Missing required property 'external_port'")
            __props__['external_port'] = external_port
            if forward_table_id is None:
                raise TypeError("Missing required property 'forward_table_id'")
            __props__['forward_table_id'] = forward_table_id
            if internal_ip is None:
                raise TypeError("Missing required property 'internal_ip'")
            __props__['internal_ip'] = internal_ip
            if internal_port is None:
                raise TypeError("Missing required property 'internal_port'")
            __props__['internal_port'] = internal_port
            if ip_protocol is None:
                raise TypeError("Missing required property 'ip_protocol'")
            __props__['ip_protocol'] = ip_protocol
            __props__['name'] = name
            __props__['forward_entry_id'] = None
        super(ForwardEntry, __self__).__init__(
            'alicloud:vpc/forwardEntry:ForwardEntry',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            external_ip: Optional[pulumi.Input[str]] = None,
            external_port: Optional[pulumi.Input[str]] = None,
            forward_entry_id: Optional[pulumi.Input[str]] = None,
            forward_table_id: Optional[pulumi.Input[str]] = None,
            internal_ip: Optional[pulumi.Input[str]] = None,
            internal_port: Optional[pulumi.Input[str]] = None,
            ip_protocol: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'ForwardEntry':
        """
        Get an existing ForwardEntry resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] external_ip: The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidth_packages`.
        :param pulumi.Input[str] external_port: The external port, valid value is 1~65535|any.
        :param pulumi.Input[str] forward_entry_id: The id of the forward entry on the server.
        :param pulumi.Input[str] forward_table_id: The value can get from `vpc.NatGateway` Attributes "forward_table_ids".
        :param pulumi.Input[str] internal_ip: The internal ip, must a private ip.
        :param pulumi.Input[str] internal_port: The internal port, valid value is 1~65535|any.
        :param pulumi.Input[str] ip_protocol: The ip protocal, valid value is tcp|udp|any.
        :param pulumi.Input[str] name: The name of forward entry.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["external_ip"] = external_ip
        __props__["external_port"] = external_port
        __props__["forward_entry_id"] = forward_entry_id
        __props__["forward_table_id"] = forward_table_id
        __props__["internal_ip"] = internal_ip
        __props__["internal_port"] = internal_port
        __props__["ip_protocol"] = ip_protocol
        __props__["name"] = name
        return ForwardEntry(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="externalIp")
    def external_ip(self) -> str:
        """
        The external ip address, the ip must along bandwidth package public ip which `vpc.NatGateway` argument `bandwidth_packages`.
        """
        return pulumi.get(self, "external_ip")

    @property
    @pulumi.getter(name="externalPort")
    def external_port(self) -> str:
        """
        The external port, valid value is 1~65535|any.
        """
        return pulumi.get(self, "external_port")

    @property
    @pulumi.getter(name="forwardEntryId")
    def forward_entry_id(self) -> str:
        """
        The id of the forward entry on the server.
        """
        return pulumi.get(self, "forward_entry_id")

    @property
    @pulumi.getter(name="forwardTableId")
    def forward_table_id(self) -> str:
        """
        The value can get from `vpc.NatGateway` Attributes "forward_table_ids".
        """
        return pulumi.get(self, "forward_table_id")

    @property
    @pulumi.getter(name="internalIp")
    def internal_ip(self) -> str:
        """
        The internal ip, must a private ip.
        """
        return pulumi.get(self, "internal_ip")

    @property
    @pulumi.getter(name="internalPort")
    def internal_port(self) -> str:
        """
        The internal port, valid value is 1~65535|any.
        """
        return pulumi.get(self, "internal_port")

    @property
    @pulumi.getter(name="ipProtocol")
    def ip_protocol(self) -> str:
        """
        The ip protocal, valid value is tcp|udp|any.
        """
        return pulumi.get(self, "ip_protocol")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of forward entry.
        """
        return pulumi.get(self, "name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

