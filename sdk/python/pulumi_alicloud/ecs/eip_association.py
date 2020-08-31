# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['EipAssociation']


class EipAssociation(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allocation_id: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 private_ip_address: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a EipAssociation resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] allocation_id: The allocation EIP ID.
        :param pulumi.Input[str] instance_id: The ID of the ECS or SLB instance or Nat Gateway.
        :param pulumi.Input[str] instance_type: The type of cloud product that the eip instance to bind.
        :param pulumi.Input[str] private_ip_address: The private IP address in the network segment of the vswitch which has been assigned.
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

            if allocation_id is None:
                raise TypeError("Missing required property 'allocation_id'")
            __props__['allocation_id'] = allocation_id
            if instance_id is None:
                raise TypeError("Missing required property 'instance_id'")
            __props__['instance_id'] = instance_id
            __props__['instance_type'] = instance_type
            __props__['private_ip_address'] = private_ip_address
        super(EipAssociation, __self__).__init__(
            'alicloud:ecs/eipAssociation:EipAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allocation_id: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            private_ip_address: Optional[pulumi.Input[str]] = None) -> 'EipAssociation':
        """
        Get an existing EipAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] allocation_id: The allocation EIP ID.
        :param pulumi.Input[str] instance_id: The ID of the ECS or SLB instance or Nat Gateway.
        :param pulumi.Input[str] instance_type: The type of cloud product that the eip instance to bind.
        :param pulumi.Input[str] private_ip_address: The private IP address in the network segment of the vswitch which has been assigned.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allocation_id"] = allocation_id
        __props__["instance_id"] = instance_id
        __props__["instance_type"] = instance_type
        __props__["private_ip_address"] = private_ip_address
        return EipAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allocationId")
    def allocation_id(self) -> pulumi.Output[str]:
        """
        The allocation EIP ID.
        """
        return pulumi.get(self, "allocation_id")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the ECS or SLB instance or Nat Gateway.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        """
        The type of cloud product that the eip instance to bind.
        """
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="privateIpAddress")
    def private_ip_address(self) -> pulumi.Output[str]:
        """
        The private IP address in the network segment of the vswitch which has been assigned.
        """
        return pulumi.get(self, "private_ip_address")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

