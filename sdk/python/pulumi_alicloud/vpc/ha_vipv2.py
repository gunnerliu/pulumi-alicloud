# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HaVipv2Args', 'HaVipv2']

@pulumi.input_type
class HaVipv2Args:
    def __init__(__self__, *,
                 vswitch_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 ha_vip_name: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a HaVipv2 resource.
        :param pulumi.Input[str] vswitch_id: The switch ID to which the HaVip instance belongs.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        :param pulumi.Input[str] description: The description of the HaVip instance. The length is 2 to 256 characters.
        :param pulumi.Input[str] ha_vip_name: The name of the HaVip instance.
        :param pulumi.Input[str] havip_name: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of HaVip.
        """
        pulumi.set(__self__, "vswitch_id", vswitch_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ha_vip_name is not None:
            pulumi.set(__self__, "ha_vip_name", ha_vip_name)
        if havip_name is not None:
            warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")
        if havip_name is not None:
            pulumi.set(__self__, "havip_name", havip_name)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The switch ID to which the HaVip instance belongs.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the HaVip instance. The length is 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HaVip instance.
        """
        return pulumi.get(self, "ha_vip_name")

    @ha_vip_name.setter
    def ha_vip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_name", value)

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> Optional[pulumi.Input[str]]:
        """
        Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        """
        return pulumi.get(self, "havip_name")

    @havip_name.setter
    def havip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "havip_name", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tags of HaVip.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _HaVipv2State:
    def __init__(__self__, *,
                 associated_eip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 associated_instance_type: Optional[pulumi.Input[str]] = None,
                 associated_instances: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ha_vip_id: Optional[pulumi.Input[str]] = None,
                 ha_vip_name: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 master_instance_id: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HaVipv2 resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_eip_addresses: EIP bound to HaVip.
        :param pulumi.Input[str] associated_instance_type: The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_instances: An ECS instance that is bound to HaVip.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance. The length is 2 to 256 characters.
        :param pulumi.Input[str] ha_vip_id: The ID of the resource.
        :param pulumi.Input[str] ha_vip_name: The name of the HaVip instance.
        :param pulumi.Input[str] havip_name: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] master_instance_id: The primary instance ID bound to HaVip.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of this resource instance.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of HaVip.
        :param pulumi.Input[str] vpc_id: The VPC ID to which the HaVip instance belongs.
        :param pulumi.Input[str] vswitch_id: The switch ID to which the HaVip instance belongs.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        if associated_eip_addresses is not None:
            pulumi.set(__self__, "associated_eip_addresses", associated_eip_addresses)
        if associated_instance_type is not None:
            pulumi.set(__self__, "associated_instance_type", associated_instance_type)
        if associated_instances is not None:
            pulumi.set(__self__, "associated_instances", associated_instances)
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ha_vip_id is not None:
            pulumi.set(__self__, "ha_vip_id", ha_vip_id)
        if ha_vip_name is not None:
            pulumi.set(__self__, "ha_vip_name", ha_vip_name)
        if havip_name is not None:
            warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")
        if havip_name is not None:
            pulumi.set(__self__, "havip_name", havip_name)
        if ip_address is not None:
            pulumi.set(__self__, "ip_address", ip_address)
        if master_instance_id is not None:
            pulumi.set(__self__, "master_instance_id", master_instance_id)
        if resource_group_id is not None:
            pulumi.set(__self__, "resource_group_id", resource_group_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if vswitch_id is not None:
            pulumi.set(__self__, "vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="associatedEipAddresses")
    def associated_eip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        EIP bound to HaVip.
        """
        return pulumi.get(self, "associated_eip_addresses")

    @associated_eip_addresses.setter
    def associated_eip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_eip_addresses", value)

    @property
    @pulumi.getter(name="associatedInstanceType")
    def associated_instance_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
        """
        return pulumi.get(self, "associated_instance_type")

    @associated_instance_type.setter
    def associated_instance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_instance_type", value)

    @property
    @pulumi.getter(name="associatedInstances")
    def associated_instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An ECS instance that is bound to HaVip.
        """
        return pulumi.get(self, "associated_instances")

    @associated_instances.setter
    def associated_instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_instances", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the HaVip instance. The length is 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="haVipId")
    def ha_vip_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource.
        """
        return pulumi.get(self, "ha_vip_id")

    @ha_vip_id.setter
    def ha_vip_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_id", value)

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HaVip instance.
        """
        return pulumi.get(self, "ha_vip_name")

    @ha_vip_name.setter
    def ha_vip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_name", value)

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> Optional[pulumi.Input[str]]:
        """
        Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        """
        return pulumi.get(self, "havip_name")

    @havip_name.setter
    def havip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "havip_name", value)

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> Optional[pulumi.Input[str]]:
        """
        The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        return pulumi.get(self, "ip_address")

    @ip_address.setter
    def ip_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ip_address", value)

    @property
    @pulumi.getter(name="masterInstanceId")
    def master_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The primary instance ID bound to HaVip.
        """
        return pulumi.get(self, "master_instance_id")

    @master_instance_id.setter
    def master_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master_instance_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of this resource instance.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The tags of HaVip.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC ID to which the HaVip instance belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The switch ID to which the HaVip instance belongs.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class HaVipv2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ha_vip_name: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Vpc Ha Vip resource. Highly available virtual IP

        For information about Vpc Ha Vip and how to use it, see [What is Ha Vip](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createhavip).

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-testacc-example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_vpc = alicloud.vpc.Network("defaultVpc",
            description="tf-test-acc-vpc",
            vpc_name=name,
            cidr_block="192.168.0.0/16")
        default_vswitch = alicloud.vpc.Switch("defaultVswitch",
            vpc_id=default_vpc.id,
            cidr_block="192.168.0.0/21",
            vswitch_name=f"{name}1",
            zone_id=default_zones.zones[0].id,
            description="tf-testacc-vswitch")
        default_rg = alicloud.resourcemanager.ResourceGroup("defaultRg",
            display_name="tf-testacc-rg819",
            resource_group_name=f"{name}2")
        change_rg = alicloud.resourcemanager.ResourceGroup("changeRg",
            display_name="tf-testacc-changerg670",
            resource_group_name=f"{name}3")
        default_ha_vipv2 = alicloud.vpc.HaVipv2("defaultHaVipv2",
            description="test",
            vswitch_id=default_vswitch.id,
            ha_vip_name=name,
            ip_address="192.168.1.101",
            resource_group_id=default_rg.id)
        ```

        ## Import

        Vpc Ha Vip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/haVipv2:HaVipv2 example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance. The length is 2 to 256 characters.
        :param pulumi.Input[str] ha_vip_name: The name of the HaVip instance.
        :param pulumi.Input[str] havip_name: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of HaVip.
        :param pulumi.Input[str] vswitch_id: The switch ID to which the HaVip instance belongs.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HaVipv2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Vpc Ha Vip resource. Highly available virtual IP

        For information about Vpc Ha Vip and how to use it, see [What is Ha Vip](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/createhavip).

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-testacc-example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_vpc = alicloud.vpc.Network("defaultVpc",
            description="tf-test-acc-vpc",
            vpc_name=name,
            cidr_block="192.168.0.0/16")
        default_vswitch = alicloud.vpc.Switch("defaultVswitch",
            vpc_id=default_vpc.id,
            cidr_block="192.168.0.0/21",
            vswitch_name=f"{name}1",
            zone_id=default_zones.zones[0].id,
            description="tf-testacc-vswitch")
        default_rg = alicloud.resourcemanager.ResourceGroup("defaultRg",
            display_name="tf-testacc-rg819",
            resource_group_name=f"{name}2")
        change_rg = alicloud.resourcemanager.ResourceGroup("changeRg",
            display_name="tf-testacc-changerg670",
            resource_group_name=f"{name}3")
        default_ha_vipv2 = alicloud.vpc.HaVipv2("defaultHaVipv2",
            description="test",
            vswitch_id=default_vswitch.id,
            ha_vip_name=name,
            ip_address="192.168.1.101",
            resource_group_id=default_rg.id)
        ```

        ## Import

        Vpc Ha Vip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/haVipv2:HaVipv2 example <id>
        ```

        :param str resource_name: The name of the resource.
        :param HaVipv2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HaVipv2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ha_vip_name: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HaVipv2Args.__new__(HaVipv2Args)

            __props__.__dict__["description"] = description
            __props__.__dict__["ha_vip_name"] = ha_vip_name
            if havip_name is not None and not opts.urn:
                warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
                pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")
            __props__.__dict__["havip_name"] = havip_name
            __props__.__dict__["ip_address"] = ip_address
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["tags"] = tags
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["associated_eip_addresses"] = None
            __props__.__dict__["associated_instance_type"] = None
            __props__.__dict__["associated_instances"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["ha_vip_id"] = None
            __props__.__dict__["master_instance_id"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["vpc_id"] = None
        super(HaVipv2, __self__).__init__(
            'alicloud:vpc/haVipv2:HaVipv2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            associated_eip_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            associated_instance_type: Optional[pulumi.Input[str]] = None,
            associated_instances: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            ha_vip_id: Optional[pulumi.Input[str]] = None,
            ha_vip_name: Optional[pulumi.Input[str]] = None,
            havip_name: Optional[pulumi.Input[str]] = None,
            ip_address: Optional[pulumi.Input[str]] = None,
            master_instance_id: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'HaVipv2':
        """
        Get an existing HaVipv2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_eip_addresses: EIP bound to HaVip.
        :param pulumi.Input[str] associated_instance_type: The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_instances: An ECS instance that is bound to HaVip.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance. The length is 2 to 256 characters.
        :param pulumi.Input[str] ha_vip_id: The ID of the resource.
        :param pulumi.Input[str] ha_vip_name: The name of the HaVip instance.
        :param pulumi.Input[str] havip_name: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] master_instance_id: The primary instance ID bound to HaVip.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group.
        :param pulumi.Input[str] status: The status of this resource instance.
        :param pulumi.Input[Mapping[str, Any]] tags: The tags of HaVip.
        :param pulumi.Input[str] vpc_id: The VPC ID to which the HaVip instance belongs.
        :param pulumi.Input[str] vswitch_id: The switch ID to which the HaVip instance belongs.
               
               The following arguments will be discarded. Please use new fields as soon as possible:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HaVipv2State.__new__(_HaVipv2State)

        __props__.__dict__["associated_eip_addresses"] = associated_eip_addresses
        __props__.__dict__["associated_instance_type"] = associated_instance_type
        __props__.__dict__["associated_instances"] = associated_instances
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["ha_vip_id"] = ha_vip_id
        __props__.__dict__["ha_vip_name"] = ha_vip_name
        __props__.__dict__["havip_name"] = havip_name
        __props__.__dict__["ip_address"] = ip_address
        __props__.__dict__["master_instance_id"] = master_instance_id
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vswitch_id"] = vswitch_id
        return HaVipv2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associatedEipAddresses")
    def associated_eip_addresses(self) -> pulumi.Output[Sequence[str]]:
        """
        EIP bound to HaVip.
        """
        return pulumi.get(self, "associated_eip_addresses")

    @property
    @pulumi.getter(name="associatedInstanceType")
    def associated_instance_type(self) -> pulumi.Output[str]:
        """
        The type of the instance that is bound to the HaVip. Value:-**EcsInstance**: ECS instance.-**NetworkInterface**: ENI instance.
        """
        return pulumi.get(self, "associated_instance_type")

    @property
    @pulumi.getter(name="associatedInstances")
    def associated_instances(self) -> pulumi.Output[Sequence[str]]:
        """
        An ECS instance that is bound to HaVip.
        """
        return pulumi.get(self, "associated_instances")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the HaVip instance. The length is 2 to 256 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="haVipId")
    def ha_vip_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource.
        """
        return pulumi.get(self, "ha_vip_id")

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> pulumi.Output[str]:
        """
        The name of the HaVip instance.
        """
        return pulumi.get(self, "ha_vip_name")

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> pulumi.Output[str]:
        """
        Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.
        """
        return pulumi.get(self, "havip_name")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> pulumi.Output[str]:
        """
        The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        """
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="masterInstanceId")
    def master_instance_id(self) -> pulumi.Output[str]:
        """
        The primary instance ID bound to HaVip.
        """
        return pulumi.get(self, "master_instance_id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of this resource instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The tags of HaVip.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC ID to which the HaVip instance belongs.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The switch ID to which the HaVip instance belongs.

        The following arguments will be discarded. Please use new fields as soon as possible:
        """
        return pulumi.get(self, "vswitch_id")
