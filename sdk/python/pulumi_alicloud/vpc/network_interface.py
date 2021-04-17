# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NetworkInterfaceArgs', 'NetworkInterface']

@pulumi.input_type
class NetworkInterfaceArgs:
    def __init__(__self__, *,
                 security_groups: pulumi.Input[Sequence[pulumi.Input[str]]],
                 vswitch_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 private_ips_count: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a NetworkInterface resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of security group ids to associate with.
        :param pulumi.Input[str] vswitch_id: The VSwitch to create the ENI in.
        :param pulumi.Input[str] description: Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] name: Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] private_ip: The primary private IP of the ENI.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_ips: List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[int] private_ips_count: Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the network interface belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        """
        pulumi.set(__self__, "security_groups", security_groups)
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_ip is not None:
            pulumi.set(__self__, "private_ip", private_ip)
        if private_ips is not None:
            pulumi.set(__self__, "private_ips", private_ips)
        if private_ips_count is not None:
            pulumi.set(__self__, "private_ips_count", private_ips_count)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of security group ids to associate with.
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The VSwitch to create the ENI in.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The primary private IP of the ENI.
        """
        return pulumi.get(self, "private_ip")

    @private_ip.setter
    def private_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ip", value)

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips")

    @private_ips.setter
    def private_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "private_ips", value)

    @property
    @pulumi.getter(name="privateIpsCount")
    def private_ips_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips_count")

    @private_ips_count.setter
    def private_ips_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "private_ips_count", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the network interface belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _NetworkInterfaceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 mac: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 private_ips_count: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NetworkInterface resources.
        :param pulumi.Input[str] description: Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] mac: (Available in 1.54.0+) The MAC address of an ENI.
        :param pulumi.Input[str] name: Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] private_ip: The primary private IP of the ENI.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_ips: List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[int] private_ips_count: Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the network interface belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of security group ids to associate with.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: The VSwitch to create the ENI in.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if mac is not None:
            pulumi.set(__self__, "mac", mac)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if private_ip is not None:
            pulumi.set(__self__, "private_ip", private_ip)
        if private_ips is not None:
            pulumi.set(__self__, "private_ips", private_ips)
        if private_ips_count is not None:
            pulumi.set(__self__, "private_ips_count", private_ips_count)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if security_groups is not None:
            pulumi.set(__self__, "security_groups", security_groups)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def mac(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in 1.54.0+) The MAC address of an ENI.
        """
        return pulumi.get(self, "mac")

    @mac.setter
    def mac(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The primary private IP of the ENI.
        """
        return pulumi.get(self, "private_ip")

    @private_ip.setter
    def private_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_ip", value)

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips")

    @private_ips.setter
    def private_ips(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "private_ips", value)

    @property
    @pulumi.getter(name="privateIpsCount")
    def private_ips_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips_count")

    @private_ips_count.setter
    def private_ips_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "private_ips_count", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of resource group which the network interface belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of security group ids to associate with.
        """
        return pulumi.get(self, "security_groups")

    @security_groups.setter
    def security_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "security_groups", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VSwitch to create the ENI in.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class NetworkInterface(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 private_ips_count: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides an ECS Elastic Network Interface resource.

        For information about Elastic Network Interface and how to use it, see [Elastic Network Interface](https://www.alibabacloud.com/help/doc-detail/58496.html).

        > **NOTE** Only one of private_ips or private_ips_count can be specified when assign private IPs.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "networkInterfaceName"
        vpc = alicloud.vpc.Network("vpc",
            vpc_name=name,
            cidr_block="192.168.0.0/24")
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        vswitch = alicloud.vpc.Switch("vswitch",
            cidr_block="192.168.0.0/24",
            availability_zone=default_zones.zones[0].id,
            vpc_id=vpc.id)
        group = alicloud.ecs.SecurityGroup("group", vpc_id=vpc.id)
        default_network_interface = alicloud.vpc.NetworkInterface("defaultNetworkInterface",
            vswitch_id=vswitch.id,
            security_groups=[group.id],
            private_ip="192.168.0.2",
            private_ips_count=3)
        ```

        ## Import

        ENI can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/networkInterface:NetworkInterface eni eni-abc1234567890000
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] name: Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] private_ip: The primary private IP of the ENI.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_ips: List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[int] private_ips_count: Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the network interface belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of security group ids to associate with.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: The VSwitch to create the ENI in.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkInterfaceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an ECS Elastic Network Interface resource.

        For information about Elastic Network Interface and how to use it, see [Elastic Network Interface](https://www.alibabacloud.com/help/doc-detail/58496.html).

        > **NOTE** Only one of private_ips or private_ips_count can be specified when assign private IPs.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "networkInterfaceName"
        vpc = alicloud.vpc.Network("vpc",
            vpc_name=name,
            cidr_block="192.168.0.0/24")
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        vswitch = alicloud.vpc.Switch("vswitch",
            cidr_block="192.168.0.0/24",
            availability_zone=default_zones.zones[0].id,
            vpc_id=vpc.id)
        group = alicloud.ecs.SecurityGroup("group", vpc_id=vpc.id)
        default_network_interface = alicloud.vpc.NetworkInterface("defaultNetworkInterface",
            vswitch_id=vswitch.id,
            security_groups=[group.id],
            private_ip="192.168.0.2",
            private_ips_count=3)
        ```

        ## Import

        ENI can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/networkInterface:NetworkInterface eni eni-abc1234567890000
        ```

        :param str resource_name: The name of the resource.
        :param NetworkInterfaceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkInterfaceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 private_ip: Optional[pulumi.Input[str]] = None,
                 private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 private_ips_count: Optional[pulumi.Input[int]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = NetworkInterfaceArgs.__new__(NetworkInterfaceArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            __props__.__dict__["private_ip"] = private_ip
            __props__.__dict__["private_ips"] = private_ips
            __props__.__dict__["private_ips_count"] = private_ips_count
            __props__.__dict__["resource_group_id"] = resource_group_id
            if security_groups is None and not opts.urn:
                raise TypeError("Missing required property 'security_groups'")
            __props__.__dict__["security_groups"] = security_groups
            __props__.__dict__["tags"] = tags
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["mac"] = None
        super(NetworkInterface, __self__).__init__(
            'alicloud:vpc/networkInterface:NetworkInterface',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            mac: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_ip: Optional[pulumi.Input[str]] = None,
            private_ips: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            private_ips_count: Optional[pulumi.Input[int]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            security_groups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'NetworkInterface':
        """
        Get an existing NetworkInterface resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] mac: (Available in 1.54.0+) The MAC address of an ENI.
        :param pulumi.Input[str] name: Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        :param pulumi.Input[str] private_ip: The primary private IP of the ENI.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] private_ips: List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[int] private_ips_count: Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        :param pulumi.Input[str] resource_group_id: The Id of resource group which the network interface belongs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] security_groups: A list of security group ids to associate with.
        :param pulumi.Input[Mapping[str, Any]] tags: A mapping of tags to assign to the resource.
        :param pulumi.Input[str] vswitch_id: The VSwitch to create the ENI in.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkInterfaceState.__new__(_NetworkInterfaceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["mac"] = mac
        __props__.__dict__["name"] = name
        __props__.__dict__["private_ip"] = private_ip
        __props__.__dict__["private_ips"] = private_ips
        __props__.__dict__["private_ips_count"] = private_ips_count
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["security_groups"] = security_groups
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vswitch_id"] = vswitch_id
        return NetworkInterface(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the ENI. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def mac(self) -> pulumi.Output[str]:
        """
        (Available in 1.54.0+) The MAC address of an ENI.
        """
        return pulumi.get(self, "mac")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the ENI. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-", ".", "_", and must not begin or end with a hyphen, and must not begin with http:// or https://. Default value is null.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> pulumi.Output[str]:
        """
        The primary private IP of the ENI.
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="privateIps")
    def private_ips(self) -> pulumi.Output[Sequence[str]]:
        """
        List of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips")

    @property
    @pulumi.getter(name="privateIpsCount")
    def private_ips_count(self) -> pulumi.Output[int]:
        """
        Number of secondary private IPs to assign to the ENI. Don't use both private_ips and private_ips_count in the same ENI resource block.
        """
        return pulumi.get(self, "private_ips_count")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[Optional[str]]:
        """
        The Id of resource group which the network interface belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="securityGroups")
    def security_groups(self) -> pulumi.Output[Sequence[str]]:
        """
        A list of security group ids to associate with.
        """
        return pulumi.get(self, "security_groups")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        A mapping of tags to assign to the resource.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The VSwitch to create the ENI in.
        """
        return pulumi.get(self, "vswitch_id")

