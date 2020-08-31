# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['NetworkAclEntries']


class NetworkAclEntries(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 egresses: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesEgressArgs']]]]] = None,
                 ingresses: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesIngressArgs']]]]] = None,
                 network_acl_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a network acl entries resource to create ingress and egress entries.

        > **NOTE:** Available in 1.45.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.

        > **NOTE:** It doesn't support concurrency and the order of the ingress and egress entries determines the priority.

        > **NOTE:** Using this resource need to open a whitelist.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "NetworkAclEntries"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork", cidr_block="172.16.0.0/12")
        default_network_acl = alicloud.vpc.NetworkAcl("defaultNetworkAcl", vpc_id=default_network.id)
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            availability_zone=default_zones.zones[0].id,
            cidr_block="172.16.0.0/21",
            vpc_id=default_network.id)
        default_network_acl_attachment = alicloud.vpc.NetworkAclAttachment("defaultNetworkAclAttachment",
            network_acl_id=default_network_acl.id,
            resources=[alicloud.vpc.NetworkAclAttachmentResourceArgs(
                resource_id=default_switch.id,
                resource_type="VSwitch",
            )])
        default_network_acl_entries = alicloud.vpc.NetworkAclEntries("defaultNetworkAclEntries",
            egresses=[alicloud.vpc.NetworkAclEntriesEgressArgs(
                description=name,
                destination_cidr_ip="0.0.0.0/32",
                entry_type="custom",
                name=name,
                policy="accept",
                port="-1/-1",
                protocol="all",
            )],
            ingresses=[alicloud.vpc.NetworkAclEntriesIngressArgs(
                description=name,
                entry_type="custom",
                name=name,
                policy="accept",
                port="-1/-1",
                protocol="all",
                source_cidr_ip="0.0.0.0/32",
            )],
            network_acl_id=default_network_acl.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesEgressArgs']]]] egresses: List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesIngressArgs']]]] ingresses: List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        :param pulumi.Input[str] network_acl_id: The id of the network acl, the field can't be changed.
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

            __props__['egresses'] = egresses
            __props__['ingresses'] = ingresses
            if network_acl_id is None:
                raise TypeError("Missing required property 'network_acl_id'")
            __props__['network_acl_id'] = network_acl_id
        super(NetworkAclEntries, __self__).__init__(
            'alicloud:vpc/networkAclEntries:NetworkAclEntries',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            egresses: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesEgressArgs']]]]] = None,
            ingresses: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesIngressArgs']]]]] = None,
            network_acl_id: Optional[pulumi.Input[str]] = None) -> 'NetworkAclEntries':
        """
        Get an existing NetworkAclEntries resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesEgressArgs']]]] egresses: List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['NetworkAclEntriesIngressArgs']]]] ingresses: List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        :param pulumi.Input[str] network_acl_id: The id of the network acl, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["egresses"] = egresses
        __props__["ingresses"] = ingresses
        __props__["network_acl_id"] = network_acl_id
        return NetworkAclEntries(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def egresses(self) -> pulumi.Output[Optional[List['outputs.NetworkAclEntriesEgress']]]:
        """
        List of the egress entries of the network acl. The order of the egress entries determines the priority. The details see Block Egress.
        """
        return pulumi.get(self, "egresses")

    @property
    @pulumi.getter
    def ingresses(self) -> pulumi.Output[Optional[List['outputs.NetworkAclEntriesIngress']]]:
        """
        List of the ingress entries of the network acl. The order of the ingress entries determines the priority. The details see Block Ingress.
        """
        return pulumi.get(self, "ingresses")

    @property
    @pulumi.getter(name="networkAclId")
    def network_acl_id(self) -> pulumi.Output[str]:
        """
        The id of the network acl, the field can't be changed.
        """
        return pulumi.get(self, "network_acl_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

