# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities, _tables

__all__ = ['ClusterArgs', 'Cluster']

@pulumi.input_type
class ClusterArgs:
    def __init__(__self__, *,
                 db_cluster_category: pulumi.Input[str],
                 db_node_class: pulumi.Input[str],
                 db_node_count: pulumi.Input[int],
                 db_node_storage: pulumi.Input[int],
                 vswitch_id: pulumi.Input[str],
                 auto_renew_period: Optional[pulumi.Input[int]] = None,
                 db_cluster_version: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 maintain_time: Optional[pulumi.Input[str]] = None,
                 pay_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 security_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Cluster resource.
        :param pulumi.Input[str] db_cluster_category: Cluster category. Value options: `Basic`, `Cluster`.
        :param pulumi.Input[str] db_node_class: The db_node_class of cluster node.
        :param pulumi.Input[int] db_node_count: The db_node_count of cluster node.
        :param pulumi.Input[int] db_node_storage: The db_node_storage of cluster node.
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC.
        :param pulumi.Input[int] auto_renew_period: Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        :param pulumi.Input[str] db_cluster_version: Cluster version. Value options: `3.0`, Default to `3.0`.
        :param pulumi.Input[str] description: The description of cluster.
        :param pulumi.Input[str] maintain_time: Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        :param pulumi.Input[str] pay_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`. Currently, the resource can not supports change pay type.
        :param pulumi.Input[int] period: The duration that you will buy DB cluster (in month). It is valid when pay_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[str] renewal_status: Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_ips: List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
               - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB cluster.
        """
        pulumi.set(__self__, "db_cluster_category", db_cluster_category)
        pulumi.set(__self__, "db_node_class", db_node_class)
        pulumi.set(__self__, "db_node_count", db_node_count)
        pulumi.set(__self__, "db_node_storage", db_node_storage)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        if auto_renew_period is not None:
            pulumi.set(__self__, "auto_renew_period", auto_renew_period)
        if db_cluster_version is not None:
            pulumi.set(__self__, "db_cluster_version", db_cluster_version)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if maintain_time is not None:
            pulumi.set(__self__, "maintain_time", maintain_time)
        if pay_type is not None:
            pulumi.set(__self__, "pay_type", pay_type)
        if period is not None:
            pulumi.set(__self__, "period", period)
        if renewal_status is not None:
            pulumi.set(__self__, "renewal_status", renewal_status)
        if security_ips is not None:
            pulumi.set(__self__, "security_ips", security_ips)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="dbClusterCategory")
    def db_cluster_category(self) -> pulumi.Input[str]:
        """
        Cluster category. Value options: `Basic`, `Cluster`.
        """
        return pulumi.get(self, "db_cluster_category")

    @db_cluster_category.setter
    def db_cluster_category(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_cluster_category", value)

    @property
    @pulumi.getter(name="dbNodeClass")
    def db_node_class(self) -> pulumi.Input[str]:
        """
        The db_node_class of cluster node.
        """
        return pulumi.get(self, "db_node_class")

    @db_node_class.setter
    def db_node_class(self, value: pulumi.Input[str]):
        pulumi.set(self, "db_node_class", value)

    @property
    @pulumi.getter(name="dbNodeCount")
    def db_node_count(self) -> pulumi.Input[int]:
        """
        The db_node_count of cluster node.
        """
        return pulumi.get(self, "db_node_count")

    @db_node_count.setter
    def db_node_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "db_node_count", value)

    @property
    @pulumi.getter(name="dbNodeStorage")
    def db_node_storage(self) -> pulumi.Input[int]:
        """
        The db_node_storage of cluster node.
        """
        return pulumi.get(self, "db_node_storage")

    @db_node_storage.setter
    def db_node_storage(self, value: pulumi.Input[int]):
        pulumi.set(self, "db_node_storage", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The virtual switch ID to launch DB instances in one VPC.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="autoRenewPeriod")
    def auto_renew_period(self) -> Optional[pulumi.Input[int]]:
        """
        Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        """
        return pulumi.get(self, "auto_renew_period")

    @auto_renew_period.setter
    def auto_renew_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "auto_renew_period", value)

    @property
    @pulumi.getter(name="dbClusterVersion")
    def db_cluster_version(self) -> Optional[pulumi.Input[str]]:
        """
        Cluster version. Value options: `3.0`, Default to `3.0`.
        """
        return pulumi.get(self, "db_cluster_version")

    @db_cluster_version.setter
    def db_cluster_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "db_cluster_version", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of cluster.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="maintainTime")
    def maintain_time(self) -> Optional[pulumi.Input[str]]:
        """
        Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        """
        return pulumi.get(self, "maintain_time")

    @maintain_time.setter
    def maintain_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "maintain_time", value)

    @property
    @pulumi.getter(name="payType")
    def pay_type(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`. Currently, the resource can not supports change pay type.
        """
        return pulumi.get(self, "pay_type")

    @pay_type.setter
    def pay_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pay_type", value)

    @property
    @pulumi.getter
    def period(self) -> Optional[pulumi.Input[int]]:
        """
        The duration that you will buy DB cluster (in month). It is valid when pay_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        """
        return pulumi.get(self, "period")

    @period.setter
    def period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "period", value)

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> Optional[pulumi.Input[str]]:
        """
        Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        """
        return pulumi.get(self, "renewal_status")

    @renewal_status.setter
    def renewal_status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "renewal_status", value)

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        """
        return pulumi.get(self, "security_ips")

    @security_ips.setter
    def security_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_ips", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Zone to launch the DB cluster.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class Cluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew_period: Optional[pulumi.Input[int]] = None,
                 db_cluster_category: Optional[pulumi.Input[str]] = None,
                 db_cluster_version: Optional[pulumi.Input[str]] = None,
                 db_node_class: Optional[pulumi.Input[str]] = None,
                 db_node_count: Optional[pulumi.Input[int]] = None,
                 db_node_storage: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 maintain_time: Optional[pulumi.Input[str]] = None,
                 pay_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 security_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a ADB cluster resource. A ADB cluster is an isolated database
        environment in the cloud. A ADB cluster can contain multiple user-created
        databases.

        > **NOTE:** Available in v1.71.0+.

        ## Example Usage
        ### Create a ADB MySQL cluster

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "adbClusterconfig"
        creation = config.get("creation")
        if creation is None:
            creation = "ADB"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            availability_zone=default_zones.zones[0].id,
            vswitch_name=name)
        default_cluster = alicloud.adb.Cluster("defaultCluster",
            db_cluster_version="3.0",
            db_cluster_category="Cluster",
            db_node_class="C8",
            db_node_count=2,
            db_node_storage=200,
            pay_type="PostPaid",
            description=name,
            vswitch_id=default_switch.id)
        ```

        ## Import

        ADB cluster can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:adb/cluster:Cluster example am-abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] auto_renew_period: Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        :param pulumi.Input[str] db_cluster_category: Cluster category. Value options: `Basic`, `Cluster`.
        :param pulumi.Input[str] db_cluster_version: Cluster version. Value options: `3.0`, Default to `3.0`.
        :param pulumi.Input[str] db_node_class: The db_node_class of cluster node.
        :param pulumi.Input[int] db_node_count: The db_node_count of cluster node.
        :param pulumi.Input[int] db_node_storage: The db_node_storage of cluster node.
        :param pulumi.Input[str] description: The description of cluster.
        :param pulumi.Input[str] maintain_time: Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        :param pulumi.Input[str] pay_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`. Currently, the resource can not supports change pay type.
        :param pulumi.Input[int] period: The duration that you will buy DB cluster (in month). It is valid when pay_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[str] renewal_status: Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_ips: List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
               - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a ADB cluster resource. A ADB cluster is an isolated database
        environment in the cloud. A ADB cluster can contain multiple user-created
        databases.

        > **NOTE:** Available in v1.71.0+.

        ## Example Usage
        ### Create a ADB MySQL cluster

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "adbClusterconfig"
        creation = config.get("creation")
        if creation is None:
            creation = "ADB"
        default_zones = alicloud.get_zones(available_resource_creation=creation)
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            availability_zone=default_zones.zones[0].id,
            vswitch_name=name)
        default_cluster = alicloud.adb.Cluster("defaultCluster",
            db_cluster_version="3.0",
            db_cluster_category="Cluster",
            db_node_class="C8",
            db_node_count=2,
            db_node_storage=200,
            pay_type="PostPaid",
            description=name,
            vswitch_id=default_switch.id)
        ```

        ## Import

        ADB cluster can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:adb/cluster:Cluster example am-abc12345678
        ```

        :param str resource_name: The name of the resource.
        :param ClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_renew_period: Optional[pulumi.Input[int]] = None,
                 db_cluster_category: Optional[pulumi.Input[str]] = None,
                 db_cluster_version: Optional[pulumi.Input[str]] = None,
                 db_node_class: Optional[pulumi.Input[str]] = None,
                 db_node_count: Optional[pulumi.Input[int]] = None,
                 db_node_storage: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 maintain_time: Optional[pulumi.Input[str]] = None,
                 pay_type: Optional[pulumi.Input[str]] = None,
                 period: Optional[pulumi.Input[int]] = None,
                 renewal_status: Optional[pulumi.Input[str]] = None,
                 security_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

            __props__['auto_renew_period'] = auto_renew_period
            if db_cluster_category is None and not opts.urn:
                raise TypeError("Missing required property 'db_cluster_category'")
            __props__['db_cluster_category'] = db_cluster_category
            __props__['db_cluster_version'] = db_cluster_version
            if db_node_class is None and not opts.urn:
                raise TypeError("Missing required property 'db_node_class'")
            __props__['db_node_class'] = db_node_class
            if db_node_count is None and not opts.urn:
                raise TypeError("Missing required property 'db_node_count'")
            __props__['db_node_count'] = db_node_count
            if db_node_storage is None and not opts.urn:
                raise TypeError("Missing required property 'db_node_storage'")
            __props__['db_node_storage'] = db_node_storage
            __props__['description'] = description
            __props__['maintain_time'] = maintain_time
            __props__['pay_type'] = pay_type
            __props__['period'] = period
            __props__['renewal_status'] = renewal_status
            __props__['security_ips'] = security_ips
            __props__['tags'] = tags
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__['vswitch_id'] = vswitch_id
            __props__['zone_id'] = zone_id
            __props__['connection_string'] = None
        super(Cluster, __self__).__init__(
            'alicloud:adb/cluster:Cluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_renew_period: Optional[pulumi.Input[int]] = None,
            connection_string: Optional[pulumi.Input[str]] = None,
            db_cluster_category: Optional[pulumi.Input[str]] = None,
            db_cluster_version: Optional[pulumi.Input[str]] = None,
            db_node_class: Optional[pulumi.Input[str]] = None,
            db_node_count: Optional[pulumi.Input[int]] = None,
            db_node_storage: Optional[pulumi.Input[int]] = None,
            description: Optional[pulumi.Input[str]] = None,
            maintain_time: Optional[pulumi.Input[str]] = None,
            pay_type: Optional[pulumi.Input[str]] = None,
            period: Optional[pulumi.Input[int]] = None,
            renewal_status: Optional[pulumi.Input[str]] = None,
            security_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Cluster':
        """
        Get an existing Cluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] auto_renew_period: Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        :param pulumi.Input[str] connection_string: (Available in 1.93.0+) The connection string of the ADB cluster.
        :param pulumi.Input[str] db_cluster_category: Cluster category. Value options: `Basic`, `Cluster`.
        :param pulumi.Input[str] db_cluster_version: Cluster version. Value options: `3.0`, Default to `3.0`.
        :param pulumi.Input[str] db_node_class: The db_node_class of cluster node.
        :param pulumi.Input[int] db_node_count: The db_node_count of cluster node.
        :param pulumi.Input[int] db_node_storage: The db_node_storage of cluster node.
        :param pulumi.Input[str] description: The description of cluster.
        :param pulumi.Input[str] maintain_time: Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        :param pulumi.Input[str] pay_type: Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`. Currently, the resource can not supports change pay type.
        :param pulumi.Input[int] period: The duration that you will buy DB cluster (in month). It is valid when pay_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        :param pulumi.Input[str] renewal_status: Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_ips: List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
               - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
               - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        :param pulumi.Input[str] vswitch_id: The virtual switch ID to launch DB instances in one VPC.
        :param pulumi.Input[str] zone_id: The Zone to launch the DB cluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["auto_renew_period"] = auto_renew_period
        __props__["connection_string"] = connection_string
        __props__["db_cluster_category"] = db_cluster_category
        __props__["db_cluster_version"] = db_cluster_version
        __props__["db_node_class"] = db_node_class
        __props__["db_node_count"] = db_node_count
        __props__["db_node_storage"] = db_node_storage
        __props__["description"] = description
        __props__["maintain_time"] = maintain_time
        __props__["pay_type"] = pay_type
        __props__["period"] = period
        __props__["renewal_status"] = renewal_status
        __props__["security_ips"] = security_ips
        __props__["tags"] = tags
        __props__["vswitch_id"] = vswitch_id
        __props__["zone_id"] = zone_id
        return Cluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoRenewPeriod")
    def auto_renew_period(self) -> pulumi.Output[Optional[int]]:
        """
        Auto-renewal period of an cluster, in the unit of the month. It is valid when pay_type is `PrePaid`. Valid value:1, 2, 3, 6, 12, 24, 36, Default to 1.
        """
        return pulumi.get(self, "auto_renew_period")

    @property
    @pulumi.getter(name="connectionString")
    def connection_string(self) -> pulumi.Output[str]:
        """
        (Available in 1.93.0+) The connection string of the ADB cluster.
        """
        return pulumi.get(self, "connection_string")

    @property
    @pulumi.getter(name="dbClusterCategory")
    def db_cluster_category(self) -> pulumi.Output[str]:
        """
        Cluster category. Value options: `Basic`, `Cluster`.
        """
        return pulumi.get(self, "db_cluster_category")

    @property
    @pulumi.getter(name="dbClusterVersion")
    def db_cluster_version(self) -> pulumi.Output[Optional[str]]:
        """
        Cluster version. Value options: `3.0`, Default to `3.0`.
        """
        return pulumi.get(self, "db_cluster_version")

    @property
    @pulumi.getter(name="dbNodeClass")
    def db_node_class(self) -> pulumi.Output[str]:
        """
        The db_node_class of cluster node.
        """
        return pulumi.get(self, "db_node_class")

    @property
    @pulumi.getter(name="dbNodeCount")
    def db_node_count(self) -> pulumi.Output[int]:
        """
        The db_node_count of cluster node.
        """
        return pulumi.get(self, "db_node_count")

    @property
    @pulumi.getter(name="dbNodeStorage")
    def db_node_storage(self) -> pulumi.Output[int]:
        """
        The db_node_storage of cluster node.
        """
        return pulumi.get(self, "db_node_storage")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of cluster.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="maintainTime")
    def maintain_time(self) -> pulumi.Output[str]:
        """
        Maintainable time period format of the instance: HH:MMZ-HH:MMZ (UTC time)
        """
        return pulumi.get(self, "maintain_time")

    @property
    @pulumi.getter(name="payType")
    def pay_type(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `PrePaid`, `PostPaid`, Default to `PostPaid`. Currently, the resource can not supports change pay type.
        """
        return pulumi.get(self, "pay_type")

    @property
    @pulumi.getter
    def period(self) -> pulumi.Output[Optional[int]]:
        """
        The duration that you will buy DB cluster (in month). It is valid when pay_type is `PrePaid`. Valid values: [1~9], 12, 24, 36. Default to 1.
        """
        return pulumi.get(self, "period")

    @property
    @pulumi.getter(name="renewalStatus")
    def renewal_status(self) -> pulumi.Output[Optional[str]]:
        """
        Valid values are `AutoRenewal`, `Normal`, `NotRenewal`, Default to `NotRenewal`.
        """
        return pulumi.get(self, "renewal_status")

    @property
    @pulumi.getter(name="securityIps")
    def security_ips(self) -> pulumi.Output[Sequence[str]]:
        """
        List of IP addresses allowed to access all databases of an cluster. The list contains up to 1,000 IP addresses, separated by commas. Supported formats include 0.0.0.0/0, 10.23.12.24 (IP), and 10.23.12.24/24 (Classless Inter-Domain Routing (CIDR) mode. /24 represents the length of the prefix in an IP address. The range of the prefix length is [1,32]).
        """
        return pulumi.get(self, "security_ips")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The virtual switch ID to launch DB instances in one VPC.
        """
        return pulumi.get(self, "vswitch_id")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The Zone to launch the DB cluster.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

