# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Cluster']


class Cluster(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cidr_block: Optional[pulumi.Input[str]] = None,
                 disk_category: Optional[pulumi.Input[str]] = None,
                 disk_size: Optional[pulumi.Input[int]] = None,
                 image_id: Optional[pulumi.Input[str]] = None,
                 instance_type: Optional[pulumi.Input[str]] = None,
                 is_outdated: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 need_slb: Optional[pulumi.Input[bool]] = None,
                 node_number: Optional[pulumi.Input[int]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 release_eip: Optional[pulumi.Input[bool]] = None,
                 size: Optional[pulumi.Input[int]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Create a Cluster resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
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

            if cidr_block is None:
                raise TypeError("Missing required property 'cidr_block'")
            __props__['cidr_block'] = cidr_block
            __props__['disk_category'] = disk_category
            __props__['disk_size'] = disk_size
            __props__['image_id'] = image_id
            if instance_type is None:
                raise TypeError("Missing required property 'instance_type'")
            __props__['instance_type'] = instance_type
            __props__['is_outdated'] = is_outdated
            __props__['name'] = name
            __props__['name_prefix'] = name_prefix
            __props__['need_slb'] = need_slb
            __props__['node_number'] = node_number
            if password is None:
                raise TypeError("Missing required property 'password'")
            __props__['password'] = password
            __props__['release_eip'] = release_eip
            if size is not None:
                warnings.warn("""Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.""", DeprecationWarning)
                pulumi.log.warn("size is deprecated: Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it.")
            __props__['size'] = size
            if vswitch_id is None:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['agent_version'] = None
            __props__['nodes'] = None
            __props__['security_group_id'] = None
            __props__['slb_id'] = None
            __props__['vpc_id'] = None
        super(Cluster, __self__).__init__(
            'alicloud:cs/cluster:Cluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            agent_version: Optional[pulumi.Input[str]] = None,
            cidr_block: Optional[pulumi.Input[str]] = None,
            disk_category: Optional[pulumi.Input[str]] = None,
            disk_size: Optional[pulumi.Input[int]] = None,
            image_id: Optional[pulumi.Input[str]] = None,
            instance_type: Optional[pulumi.Input[str]] = None,
            is_outdated: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            need_slb: Optional[pulumi.Input[bool]] = None,
            node_number: Optional[pulumi.Input[int]] = None,
            nodes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterNodeArgs']]]]] = None,
            password: Optional[pulumi.Input[str]] = None,
            release_eip: Optional[pulumi.Input[bool]] = None,
            security_group_id: Optional[pulumi.Input[str]] = None,
            size: Optional[pulumi.Input[int]] = None,
            slb_id: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'Cluster':
        """
        Get an existing Cluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["agent_version"] = agent_version
        __props__["cidr_block"] = cidr_block
        __props__["disk_category"] = disk_category
        __props__["disk_size"] = disk_size
        __props__["image_id"] = image_id
        __props__["instance_type"] = instance_type
        __props__["is_outdated"] = is_outdated
        __props__["name"] = name
        __props__["name_prefix"] = name_prefix
        __props__["need_slb"] = need_slb
        __props__["node_number"] = node_number
        __props__["nodes"] = nodes
        __props__["password"] = password
        __props__["release_eip"] = release_eip
        __props__["security_group_id"] = security_group_id
        __props__["size"] = size
        __props__["slb_id"] = slb_id
        __props__["vpc_id"] = vpc_id
        __props__["vswitch_id"] = vswitch_id
        return Cluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="agentVersion")
    def agent_version(self) -> pulumi.Output[str]:
        return pulumi.get(self, "agent_version")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter(name="diskCategory")
    def disk_category(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "disk_category")

    @property
    @pulumi.getter(name="diskSize")
    def disk_size(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "disk_size")

    @property
    @pulumi.getter(name="imageId")
    def image_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "image_id")

    @property
    @pulumi.getter(name="instanceType")
    def instance_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "instance_type")

    @property
    @pulumi.getter(name="isOutdated")
    def is_outdated(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "is_outdated")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="needSlb")
    def need_slb(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "need_slb")

    @property
    @pulumi.getter(name="nodeNumber")
    def node_number(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "node_number")

    @property
    @pulumi.getter
    def nodes(self) -> pulumi.Output[Sequence['outputs.ClusterNode']]:
        return pulumi.get(self, "nodes")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="releaseEip")
    def release_eip(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "release_eip")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter
    def size(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "size")

    @property
    @pulumi.getter(name="slbId")
    def slb_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slb_id")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

