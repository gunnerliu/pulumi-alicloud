# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['Cluster']


class Cluster(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl_entry_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 cluster_alias_name: Optional[pulumi.Input[str]] = None,
                 cluster_specification: Optional[pulumi.Input[str]] = None,
                 cluster_type: Optional[pulumi.Input[str]] = None,
                 cluster_version: Optional[pulumi.Input[str]] = None,
                 disk_type: Optional[pulumi.Input[str]] = None,
                 instance_count: Optional[pulumi.Input[int]] = None,
                 net_type: Optional[pulumi.Input[str]] = None,
                 private_slb_specification: Optional[pulumi.Input[str]] = None,
                 pub_network_flow: Optional[pulumi.Input[str]] = None,
                 pub_slb_specification: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a MSE Cluster resource. It is a one-stop microservice platform for the industry's mainstream open source microservice frameworks Spring Cloud and Dubbo, providing governance center, managed registry and managed configuration center.

        > **NOTE:** Available in 1.94.0+.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.mse.Cluster("example",
            acl_entry_lists=["127.0.0.1/32"],
            cluster_alias_name="tf-testAccMseCluster",
            cluster_specification="MSE_SC_1_2_200_c",
            cluster_type="Eureka",
            cluster_version="EUREKA_1_9_3",
            instance_count=1,
            net_type="privatenet",
            pub_network_flow="1",
            vswitch_id="vsw-123456")
        ```

        ## Import

        MSE Cluster can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:mse/cluster:Cluster example mse-cn-0d9xxxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] acl_entry_lists: The whitelist.
        :param pulumi.Input[str] cluster_alias_name: The alias of MSE Cluster.
        :param pulumi.Input[str] cluster_specification: The engine specification of MSE Cluster. Valid values: `MSE_SC_1_2_200_c`, `MSE_SC_2`, `MSE_SC_4_8_200_c_4_200_c`, `MSE_SC_8_16_200_c`.
        :param pulumi.Input[str] cluster_type: The type of MSE Cluster.
        :param pulumi.Input[str] cluster_version: The version of MSE Cluster.
        :param pulumi.Input[str] disk_type: The type of Disk.
        :param pulumi.Input[int] instance_count: The count of instance.
        :param pulumi.Input[str] net_type: The type of network. Range limit: 1~5.
        :param pulumi.Input[str] private_slb_specification: The specification of private network SLB.
        :param pulumi.Input[str] pub_network_flow: The public network bandwidth. `0` means no access to the public network.
        :param pulumi.Input[str] pub_slb_specification: The specification of public network SLB.
        :param pulumi.Input[str] vswitch_id: The id of VSwitch.
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

            __props__['acl_entry_lists'] = acl_entry_lists
            __props__['cluster_alias_name'] = cluster_alias_name
            if cluster_specification is None:
                raise TypeError("Missing required property 'cluster_specification'")
            __props__['cluster_specification'] = cluster_specification
            if cluster_type is None:
                raise TypeError("Missing required property 'cluster_type'")
            __props__['cluster_type'] = cluster_type
            if cluster_version is None:
                raise TypeError("Missing required property 'cluster_version'")
            __props__['cluster_version'] = cluster_version
            __props__['disk_type'] = disk_type
            if instance_count is None:
                raise TypeError("Missing required property 'instance_count'")
            __props__['instance_count'] = instance_count
            if net_type is None:
                raise TypeError("Missing required property 'net_type'")
            __props__['net_type'] = net_type
            __props__['private_slb_specification'] = private_slb_specification
            __props__['pub_network_flow'] = pub_network_flow
            __props__['pub_slb_specification'] = pub_slb_specification
            __props__['vswitch_id'] = vswitch_id
            __props__['status'] = None
        super(Cluster, __self__).__init__(
            'alicloud:mse/cluster:Cluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl_entry_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            cluster_alias_name: Optional[pulumi.Input[str]] = None,
            cluster_specification: Optional[pulumi.Input[str]] = None,
            cluster_type: Optional[pulumi.Input[str]] = None,
            cluster_version: Optional[pulumi.Input[str]] = None,
            disk_type: Optional[pulumi.Input[str]] = None,
            instance_count: Optional[pulumi.Input[int]] = None,
            net_type: Optional[pulumi.Input[str]] = None,
            private_slb_specification: Optional[pulumi.Input[str]] = None,
            pub_network_flow: Optional[pulumi.Input[str]] = None,
            pub_slb_specification: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'Cluster':
        """
        Get an existing Cluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] acl_entry_lists: The whitelist.
        :param pulumi.Input[str] cluster_alias_name: The alias of MSE Cluster.
        :param pulumi.Input[str] cluster_specification: The engine specification of MSE Cluster. Valid values: `MSE_SC_1_2_200_c`, `MSE_SC_2`, `MSE_SC_4_8_200_c_4_200_c`, `MSE_SC_8_16_200_c`.
        :param pulumi.Input[str] cluster_type: The type of MSE Cluster.
        :param pulumi.Input[str] cluster_version: The version of MSE Cluster.
        :param pulumi.Input[str] disk_type: The type of Disk.
        :param pulumi.Input[int] instance_count: The count of instance.
        :param pulumi.Input[str] net_type: The type of network. Range limit: 1~5.
        :param pulumi.Input[str] private_slb_specification: The specification of private network SLB.
        :param pulumi.Input[str] pub_network_flow: The public network bandwidth. `0` means no access to the public network.
        :param pulumi.Input[str] pub_slb_specification: The specification of public network SLB.
        :param pulumi.Input[str] status: The status of MSE Cluster.
        :param pulumi.Input[str] vswitch_id: The id of VSwitch.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["acl_entry_lists"] = acl_entry_lists
        __props__["cluster_alias_name"] = cluster_alias_name
        __props__["cluster_specification"] = cluster_specification
        __props__["cluster_type"] = cluster_type
        __props__["cluster_version"] = cluster_version
        __props__["disk_type"] = disk_type
        __props__["instance_count"] = instance_count
        __props__["net_type"] = net_type
        __props__["private_slb_specification"] = private_slb_specification
        __props__["pub_network_flow"] = pub_network_flow
        __props__["pub_slb_specification"] = pub_slb_specification
        __props__["status"] = status
        __props__["vswitch_id"] = vswitch_id
        return Cluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="aclEntryLists")
    def acl_entry_lists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The whitelist.
        """
        return pulumi.get(self, "acl_entry_lists")

    @property
    @pulumi.getter(name="clusterAliasName")
    def cluster_alias_name(self) -> pulumi.Output[Optional[str]]:
        """
        The alias of MSE Cluster.
        """
        return pulumi.get(self, "cluster_alias_name")

    @property
    @pulumi.getter(name="clusterSpecification")
    def cluster_specification(self) -> pulumi.Output[str]:
        """
        The engine specification of MSE Cluster. Valid values: `MSE_SC_1_2_200_c`, `MSE_SC_2`, `MSE_SC_4_8_200_c_4_200_c`, `MSE_SC_8_16_200_c`.
        """
        return pulumi.get(self, "cluster_specification")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> pulumi.Output[str]:
        """
        The type of MSE Cluster.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter(name="clusterVersion")
    def cluster_version(self) -> pulumi.Output[str]:
        """
        The version of MSE Cluster.
        """
        return pulumi.get(self, "cluster_version")

    @property
    @pulumi.getter(name="diskType")
    def disk_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of Disk.
        """
        return pulumi.get(self, "disk_type")

    @property
    @pulumi.getter(name="instanceCount")
    def instance_count(self) -> pulumi.Output[int]:
        """
        The count of instance.
        """
        return pulumi.get(self, "instance_count")

    @property
    @pulumi.getter(name="netType")
    def net_type(self) -> pulumi.Output[str]:
        """
        The type of network. Range limit: 1~5.
        """
        return pulumi.get(self, "net_type")

    @property
    @pulumi.getter(name="privateSlbSpecification")
    def private_slb_specification(self) -> pulumi.Output[Optional[str]]:
        """
        The specification of private network SLB.
        """
        return pulumi.get(self, "private_slb_specification")

    @property
    @pulumi.getter(name="pubNetworkFlow")
    def pub_network_flow(self) -> pulumi.Output[Optional[str]]:
        """
        The public network bandwidth. `0` means no access to the public network.
        """
        return pulumi.get(self, "pub_network_flow")

    @property
    @pulumi.getter(name="pubSlbSpecification")
    def pub_slb_specification(self) -> pulumi.Output[Optional[str]]:
        """
        The specification of public network SLB.
        """
        return pulumi.get(self, "pub_slb_specification")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of MSE Cluster.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[Optional[str]]:
        """
        The id of VSwitch.
        """
        return pulumi.get(self, "vswitch_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

