# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['HAVipArgs', 'HAVip']

@pulumi.input_type
class HAVipArgs:
    def __init__(__self__, *,
                 vswitch_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 ha_vip_name: Optional[pulumi.Input[str]] = None,
                 havip_name: Optional[pulumi.Input[str]] = None,
                 ip_address: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, Any]]] = None):
        """
        The set of arguments for constructing a HAVip resource.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] ha_vip_name: The name of the HAVIP.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the HAVIP belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: The list of tags.
        """
        HAVipArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            vswitch_id=vswitch_id,
            description=description,
            ha_vip_name=ha_vip_name,
            havip_name=havip_name,
            ip_address=ip_address,
            resource_group_id=resource_group_id,
            tags=tags,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             vswitch_id: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             ha_vip_name: Optional[pulumi.Input[str]] = None,
             havip_name: Optional[pulumi.Input[str]] = None,
             ip_address: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             tags: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']
        if vswitch_id is None:
            raise TypeError("Missing 'vswitch_id' argument")
        if ha_vip_name is None and 'haVipName' in kwargs:
            ha_vip_name = kwargs['haVipName']
        if havip_name is None and 'havipName' in kwargs:
            havip_name = kwargs['havipName']
        if ip_address is None and 'ipAddress' in kwargs:
            ip_address = kwargs['ipAddress']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']

        _setter("vswitch_id", vswitch_id)
        if description is not None:
            _setter("description", description)
        if ha_vip_name is not None:
            _setter("ha_vip_name", ha_vip_name)
        if havip_name is not None:
            warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")
        if havip_name is not None:
            _setter("havip_name", havip_name)
        if ip_address is not None:
            _setter("ip_address", ip_address)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if tags is not None:
            _setter("tags", tags)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The vswitch_id of the HaVip, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the HaVip instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HAVIP.
        """
        return pulumi.get(self, "ha_vip_name")

    @ha_vip_name.setter
    def ha_vip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_name", value)

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HaVip instance.
        """
        warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")

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
        The ID of the resource group to which the HAVIP belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _HAVipState:
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
        Input properties used for looking up and filtering HAVip resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_eip_addresses: The elastic IP address (EIP) associated with the HAVIP.
        :param pulumi.Input[str] associated_instance_type: The type of the instance with which the HAVIP is associated. Valid values:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_instances: The ID of the instance with which the HAVIP is associated.
        :param pulumi.Input[str] create_time: The time when the HAVIP was created.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] ha_vip_id: The ID of the HAVIP.
        :param pulumi.Input[str] ha_vip_name: The name of the HAVIP.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] master_instance_id: The ID of the active instance that is associated with the HAVIP.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the HAVIP belongs.
        :param pulumi.Input[str] status: (Available in v1.120.0+) The status of the HaVip instance.
        :param pulumi.Input[Mapping[str, Any]] tags: The list of tags.
        :param pulumi.Input[str] vpc_id: The ID of the VPC to which the HAVIP belongs.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        """
        _HAVipState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            associated_eip_addresses=associated_eip_addresses,
            associated_instance_type=associated_instance_type,
            associated_instances=associated_instances,
            create_time=create_time,
            description=description,
            ha_vip_id=ha_vip_id,
            ha_vip_name=ha_vip_name,
            havip_name=havip_name,
            ip_address=ip_address,
            master_instance_id=master_instance_id,
            resource_group_id=resource_group_id,
            status=status,
            tags=tags,
            vpc_id=vpc_id,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
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
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if associated_eip_addresses is None and 'associatedEipAddresses' in kwargs:
            associated_eip_addresses = kwargs['associatedEipAddresses']
        if associated_instance_type is None and 'associatedInstanceType' in kwargs:
            associated_instance_type = kwargs['associatedInstanceType']
        if associated_instances is None and 'associatedInstances' in kwargs:
            associated_instances = kwargs['associatedInstances']
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if ha_vip_id is None and 'haVipId' in kwargs:
            ha_vip_id = kwargs['haVipId']
        if ha_vip_name is None and 'haVipName' in kwargs:
            ha_vip_name = kwargs['haVipName']
        if havip_name is None and 'havipName' in kwargs:
            havip_name = kwargs['havipName']
        if ip_address is None and 'ipAddress' in kwargs:
            ip_address = kwargs['ipAddress']
        if master_instance_id is None and 'masterInstanceId' in kwargs:
            master_instance_id = kwargs['masterInstanceId']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        if associated_eip_addresses is not None:
            _setter("associated_eip_addresses", associated_eip_addresses)
        if associated_instance_type is not None:
            _setter("associated_instance_type", associated_instance_type)
        if associated_instances is not None:
            _setter("associated_instances", associated_instances)
        if create_time is not None:
            _setter("create_time", create_time)
        if description is not None:
            _setter("description", description)
        if ha_vip_id is not None:
            _setter("ha_vip_id", ha_vip_id)
        if ha_vip_name is not None:
            _setter("ha_vip_name", ha_vip_name)
        if havip_name is not None:
            warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
            pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")
        if havip_name is not None:
            _setter("havip_name", havip_name)
        if ip_address is not None:
            _setter("ip_address", ip_address)
        if master_instance_id is not None:
            _setter("master_instance_id", master_instance_id)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if status is not None:
            _setter("status", status)
        if tags is not None:
            _setter("tags", tags)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="associatedEipAddresses")
    def associated_eip_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The elastic IP address (EIP) associated with the HAVIP.
        """
        return pulumi.get(self, "associated_eip_addresses")

    @associated_eip_addresses.setter
    def associated_eip_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_eip_addresses", value)

    @property
    @pulumi.getter(name="associatedInstanceType")
    def associated_instance_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the instance with which the HAVIP is associated. Valid values:
        """
        return pulumi.get(self, "associated_instance_type")

    @associated_instance_type.setter
    def associated_instance_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "associated_instance_type", value)

    @property
    @pulumi.getter(name="associatedInstances")
    def associated_instances(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The ID of the instance with which the HAVIP is associated.
        """
        return pulumi.get(self, "associated_instances")

    @associated_instances.setter
    def associated_instances(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_instances", value)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The time when the HAVIP was created.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the HaVip instance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="haVipId")
    def ha_vip_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the HAVIP.
        """
        return pulumi.get(self, "ha_vip_id")

    @ha_vip_id.setter
    def ha_vip_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_id", value)

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HAVIP.
        """
        return pulumi.get(self, "ha_vip_name")

    @ha_vip_name.setter
    def ha_vip_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ha_vip_name", value)

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the HaVip instance.
        """
        warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")

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
        The ID of the active instance that is associated with the HAVIP.
        """
        return pulumi.get(self, "master_instance_id")

    @master_instance_id.setter
    def master_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "master_instance_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the resource group to which the HAVIP belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        (Available in v1.120.0+) The status of the HaVip instance.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the VPC to which the HAVIP belongs.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The vswitch_id of the HaVip, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class HAVip(pulumi.CustomResource):
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
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example_network.id,
            zone_id=default.zones[0].id)
        example_ha_vip = alicloud.vpc.HAVip("exampleHAVip",
            vswitch_id=example_switch.id,
            description=name)
        ```

        ## Import

        The havip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] ha_vip_name: The name of the HAVIP.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the HAVIP belongs.
        :param pulumi.Input[Mapping[str, Any]] tags: The list of tags.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HAVipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("exampleNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=example_network.id,
            zone_id=default.zones[0].id)
        example_ha_vip = alicloud.vpc.HAVip("exampleHAVip",
            vswitch_id=example_switch.id,
            description=name)
        ```

        ## Import

        The havip can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param HAVipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HAVipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            HAVipArgs._configure(_setter, **kwargs)
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
            __props__ = HAVipArgs.__new__(HAVipArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["ha_vip_name"] = ha_vip_name
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
        super(HAVip, __self__).__init__(
            'alicloud:vpc/hAVip:HAVip',
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
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'HAVip':
        """
        Get an existing HAVip resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_eip_addresses: The elastic IP address (EIP) associated with the HAVIP.
        :param pulumi.Input[str] associated_instance_type: The type of the instance with which the HAVIP is associated. Valid values:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_instances: The ID of the instance with which the HAVIP is associated.
        :param pulumi.Input[str] create_time: The time when the HAVIP was created.
        :param pulumi.Input[str] description: The description of the HaVip instance.
        :param pulumi.Input[str] ha_vip_id: The ID of the HAVIP.
        :param pulumi.Input[str] ha_vip_name: The name of the HAVIP.
        :param pulumi.Input[str] havip_name: The name of the HaVip instance.
        :param pulumi.Input[str] ip_address: The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        :param pulumi.Input[str] master_instance_id: The ID of the active instance that is associated with the HAVIP.
        :param pulumi.Input[str] resource_group_id: The ID of the resource group to which the HAVIP belongs.
        :param pulumi.Input[str] status: (Available in v1.120.0+) The status of the HaVip instance.
        :param pulumi.Input[Mapping[str, Any]] tags: The list of tags.
        :param pulumi.Input[str] vpc_id: The ID of the VPC to which the HAVIP belongs.
        :param pulumi.Input[str] vswitch_id: The vswitch_id of the HaVip, the field can't be changed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HAVipState.__new__(_HAVipState)

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
        return HAVip(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="associatedEipAddresses")
    def associated_eip_addresses(self) -> pulumi.Output[Sequence[str]]:
        """
        The elastic IP address (EIP) associated with the HAVIP.
        """
        return pulumi.get(self, "associated_eip_addresses")

    @property
    @pulumi.getter(name="associatedInstanceType")
    def associated_instance_type(self) -> pulumi.Output[str]:
        """
        The type of the instance with which the HAVIP is associated. Valid values:
        """
        return pulumi.get(self, "associated_instance_type")

    @property
    @pulumi.getter(name="associatedInstances")
    def associated_instances(self) -> pulumi.Output[Sequence[str]]:
        """
        The ID of the instance with which the HAVIP is associated.
        """
        return pulumi.get(self, "associated_instances")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The time when the HAVIP was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the HaVip instance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="haVipId")
    def ha_vip_id(self) -> pulumi.Output[str]:
        """
        The ID of the HAVIP.
        """
        return pulumi.get(self, "ha_vip_id")

    @property
    @pulumi.getter(name="haVipName")
    def ha_vip_name(self) -> pulumi.Output[str]:
        """
        The name of the HAVIP.
        """
        return pulumi.get(self, "ha_vip_name")

    @property
    @pulumi.getter(name="havipName")
    def havip_name(self) -> pulumi.Output[str]:
        """
        The name of the HaVip instance.
        """
        warnings.warn("""Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""", DeprecationWarning)
        pulumi.log.warn("""havip_name is deprecated: Field 'havip_name' has been deprecated from provider version 1.205.0. New field 'ha_vip_name' instead.""")

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
        The ID of the active instance that is associated with the HAVIP.
        """
        return pulumi.get(self, "master_instance_id")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The ID of the resource group to which the HAVIP belongs.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        (Available in v1.120.0+) The status of the HaVip instance.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The list of tags.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of the VPC to which the HAVIP belongs.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The vswitch_id of the HaVip, the field can't be changed.
        """
        return pulumi.get(self, "vswitch_id")

