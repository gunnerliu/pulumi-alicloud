# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PolardbxInstanceArgs', 'PolardbxInstance']

@pulumi.input_type
class PolardbxInstanceArgs:
    def __init__(__self__, *,
                 cn_class: pulumi.Input[str],
                 cn_node_count: pulumi.Input[int],
                 dn_class: pulumi.Input[str],
                 dn_node_count: pulumi.Input[int],
                 primary_zone: pulumi.Input[str],
                 topology_type: pulumi.Input[str],
                 vpc_id: pulumi.Input[str],
                 vswitch_id: pulumi.Input[str],
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secondary_zone: Optional[pulumi.Input[str]] = None,
                 tertiary_zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PolardbxInstance resource.
        :param pulumi.Input[str] cn_class: Compute node specifications.
        :param pulumi.Input[int] cn_node_count: Number of computing nodes.
        :param pulumi.Input[str] dn_class: Storage node specifications.
        :param pulumi.Input[int] dn_node_count: The number of storage nodes.
        :param pulumi.Input[str] primary_zone: Primary Availability Zone.
        :param pulumi.Input[str] topology_type: Topology type:
               - **3azones**: three available areas;
               - **1azone**: Single zone.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        :param pulumi.Input[str] vswitch_id: The ID of the virtual switch.
        :param pulumi.Input[str] resource_group_id: The resource group ID can be empty. This parameter is not supported for the time being.
        :param pulumi.Input[str] secondary_zone: Secondary availability zone.
        :param pulumi.Input[str] tertiary_zone: Third Availability Zone.
        """
        PolardbxInstanceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cn_class=cn_class,
            cn_node_count=cn_node_count,
            dn_class=dn_class,
            dn_node_count=dn_node_count,
            primary_zone=primary_zone,
            topology_type=topology_type,
            vpc_id=vpc_id,
            vswitch_id=vswitch_id,
            resource_group_id=resource_group_id,
            secondary_zone=secondary_zone,
            tertiary_zone=tertiary_zone,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cn_class: Optional[pulumi.Input[str]] = None,
             cn_node_count: Optional[pulumi.Input[int]] = None,
             dn_class: Optional[pulumi.Input[str]] = None,
             dn_node_count: Optional[pulumi.Input[int]] = None,
             primary_zone: Optional[pulumi.Input[str]] = None,
             topology_type: Optional[pulumi.Input[str]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             secondary_zone: Optional[pulumi.Input[str]] = None,
             tertiary_zone: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cn_class is None and 'cnClass' in kwargs:
            cn_class = kwargs['cnClass']
        if cn_class is None:
            raise TypeError("Missing 'cn_class' argument")
        if cn_node_count is None and 'cnNodeCount' in kwargs:
            cn_node_count = kwargs['cnNodeCount']
        if cn_node_count is None:
            raise TypeError("Missing 'cn_node_count' argument")
        if dn_class is None and 'dnClass' in kwargs:
            dn_class = kwargs['dnClass']
        if dn_class is None:
            raise TypeError("Missing 'dn_class' argument")
        if dn_node_count is None and 'dnNodeCount' in kwargs:
            dn_node_count = kwargs['dnNodeCount']
        if dn_node_count is None:
            raise TypeError("Missing 'dn_node_count' argument")
        if primary_zone is None and 'primaryZone' in kwargs:
            primary_zone = kwargs['primaryZone']
        if primary_zone is None:
            raise TypeError("Missing 'primary_zone' argument")
        if topology_type is None and 'topologyType' in kwargs:
            topology_type = kwargs['topologyType']
        if topology_type is None:
            raise TypeError("Missing 'topology_type' argument")
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vpc_id is None:
            raise TypeError("Missing 'vpc_id' argument")
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']
        if vswitch_id is None:
            raise TypeError("Missing 'vswitch_id' argument")
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if secondary_zone is None and 'secondaryZone' in kwargs:
            secondary_zone = kwargs['secondaryZone']
        if tertiary_zone is None and 'tertiaryZone' in kwargs:
            tertiary_zone = kwargs['tertiaryZone']

        _setter("cn_class", cn_class)
        _setter("cn_node_count", cn_node_count)
        _setter("dn_class", dn_class)
        _setter("dn_node_count", dn_node_count)
        _setter("primary_zone", primary_zone)
        _setter("topology_type", topology_type)
        _setter("vpc_id", vpc_id)
        _setter("vswitch_id", vswitch_id)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if secondary_zone is not None:
            _setter("secondary_zone", secondary_zone)
        if tertiary_zone is not None:
            _setter("tertiary_zone", tertiary_zone)

    @property
    @pulumi.getter(name="cnClass")
    def cn_class(self) -> pulumi.Input[str]:
        """
        Compute node specifications.
        """
        return pulumi.get(self, "cn_class")

    @cn_class.setter
    def cn_class(self, value: pulumi.Input[str]):
        pulumi.set(self, "cn_class", value)

    @property
    @pulumi.getter(name="cnNodeCount")
    def cn_node_count(self) -> pulumi.Input[int]:
        """
        Number of computing nodes.
        """
        return pulumi.get(self, "cn_node_count")

    @cn_node_count.setter
    def cn_node_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "cn_node_count", value)

    @property
    @pulumi.getter(name="dnClass")
    def dn_class(self) -> pulumi.Input[str]:
        """
        Storage node specifications.
        """
        return pulumi.get(self, "dn_class")

    @dn_class.setter
    def dn_class(self, value: pulumi.Input[str]):
        pulumi.set(self, "dn_class", value)

    @property
    @pulumi.getter(name="dnNodeCount")
    def dn_node_count(self) -> pulumi.Input[int]:
        """
        The number of storage nodes.
        """
        return pulumi.get(self, "dn_node_count")

    @dn_node_count.setter
    def dn_node_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "dn_node_count", value)

    @property
    @pulumi.getter(name="primaryZone")
    def primary_zone(self) -> pulumi.Input[str]:
        """
        Primary Availability Zone.
        """
        return pulumi.get(self, "primary_zone")

    @primary_zone.setter
    def primary_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "primary_zone", value)

    @property
    @pulumi.getter(name="topologyType")
    def topology_type(self) -> pulumi.Input[str]:
        """
        Topology type:
        - **3azones**: three available areas;
        - **1azone**: Single zone.
        """
        return pulumi.get(self, "topology_type")

    @topology_type.setter
    def topology_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "topology_type", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Input[str]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The ID of the virtual switch.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group ID can be empty. This parameter is not supported for the time being.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="secondaryZone")
    def secondary_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Secondary availability zone.
        """
        return pulumi.get(self, "secondary_zone")

    @secondary_zone.setter
    def secondary_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secondary_zone", value)

    @property
    @pulumi.getter(name="tertiaryZone")
    def tertiary_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Third Availability Zone.
        """
        return pulumi.get(self, "tertiary_zone")

    @tertiary_zone.setter
    def tertiary_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tertiary_zone", value)


@pulumi.input_type
class _PolardbxInstanceState:
    def __init__(__self__, *,
                 cn_class: Optional[pulumi.Input[str]] = None,
                 cn_node_count: Optional[pulumi.Input[int]] = None,
                 create_time: Optional[pulumi.Input[str]] = None,
                 dn_class: Optional[pulumi.Input[str]] = None,
                 dn_node_count: Optional[pulumi.Input[int]] = None,
                 primary_zone: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secondary_zone: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tertiary_zone: Optional[pulumi.Input[str]] = None,
                 topology_type: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PolardbxInstance resources.
        :param pulumi.Input[str] cn_class: Compute node specifications.
        :param pulumi.Input[int] cn_node_count: Number of computing nodes.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] dn_class: Storage node specifications.
        :param pulumi.Input[int] dn_node_count: The number of storage nodes.
        :param pulumi.Input[str] primary_zone: Primary Availability Zone.
        :param pulumi.Input[str] resource_group_id: The resource group ID can be empty. This parameter is not supported for the time being.
        :param pulumi.Input[str] secondary_zone: Secondary availability zone.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] tertiary_zone: Third Availability Zone.
        :param pulumi.Input[str] topology_type: Topology type:
               - **3azones**: three available areas;
               - **1azone**: Single zone.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        :param pulumi.Input[str] vswitch_id: The ID of the virtual switch.
        """
        _PolardbxInstanceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            cn_class=cn_class,
            cn_node_count=cn_node_count,
            create_time=create_time,
            dn_class=dn_class,
            dn_node_count=dn_node_count,
            primary_zone=primary_zone,
            resource_group_id=resource_group_id,
            secondary_zone=secondary_zone,
            status=status,
            tertiary_zone=tertiary_zone,
            topology_type=topology_type,
            vpc_id=vpc_id,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             cn_class: Optional[pulumi.Input[str]] = None,
             cn_node_count: Optional[pulumi.Input[int]] = None,
             create_time: Optional[pulumi.Input[str]] = None,
             dn_class: Optional[pulumi.Input[str]] = None,
             dn_node_count: Optional[pulumi.Input[int]] = None,
             primary_zone: Optional[pulumi.Input[str]] = None,
             resource_group_id: Optional[pulumi.Input[str]] = None,
             secondary_zone: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             tertiary_zone: Optional[pulumi.Input[str]] = None,
             topology_type: Optional[pulumi.Input[str]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if cn_class is None and 'cnClass' in kwargs:
            cn_class = kwargs['cnClass']
        if cn_node_count is None and 'cnNodeCount' in kwargs:
            cn_node_count = kwargs['cnNodeCount']
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if dn_class is None and 'dnClass' in kwargs:
            dn_class = kwargs['dnClass']
        if dn_node_count is None and 'dnNodeCount' in kwargs:
            dn_node_count = kwargs['dnNodeCount']
        if primary_zone is None and 'primaryZone' in kwargs:
            primary_zone = kwargs['primaryZone']
        if resource_group_id is None and 'resourceGroupId' in kwargs:
            resource_group_id = kwargs['resourceGroupId']
        if secondary_zone is None and 'secondaryZone' in kwargs:
            secondary_zone = kwargs['secondaryZone']
        if tertiary_zone is None and 'tertiaryZone' in kwargs:
            tertiary_zone = kwargs['tertiaryZone']
        if topology_type is None and 'topologyType' in kwargs:
            topology_type = kwargs['topologyType']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        if cn_class is not None:
            _setter("cn_class", cn_class)
        if cn_node_count is not None:
            _setter("cn_node_count", cn_node_count)
        if create_time is not None:
            _setter("create_time", create_time)
        if dn_class is not None:
            _setter("dn_class", dn_class)
        if dn_node_count is not None:
            _setter("dn_node_count", dn_node_count)
        if primary_zone is not None:
            _setter("primary_zone", primary_zone)
        if resource_group_id is not None:
            _setter("resource_group_id", resource_group_id)
        if secondary_zone is not None:
            _setter("secondary_zone", secondary_zone)
        if status is not None:
            _setter("status", status)
        if tertiary_zone is not None:
            _setter("tertiary_zone", tertiary_zone)
        if topology_type is not None:
            _setter("topology_type", topology_type)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="cnClass")
    def cn_class(self) -> Optional[pulumi.Input[str]]:
        """
        Compute node specifications.
        """
        return pulumi.get(self, "cn_class")

    @cn_class.setter
    def cn_class(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cn_class", value)

    @property
    @pulumi.getter(name="cnNodeCount")
    def cn_node_count(self) -> Optional[pulumi.Input[int]]:
        """
        Number of computing nodes.
        """
        return pulumi.get(self, "cn_node_count")

    @cn_node_count.setter
    def cn_node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "cn_node_count", value)

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
    @pulumi.getter(name="dnClass")
    def dn_class(self) -> Optional[pulumi.Input[str]]:
        """
        Storage node specifications.
        """
        return pulumi.get(self, "dn_class")

    @dn_class.setter
    def dn_class(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dn_class", value)

    @property
    @pulumi.getter(name="dnNodeCount")
    def dn_node_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of storage nodes.
        """
        return pulumi.get(self, "dn_node_count")

    @dn_node_count.setter
    def dn_node_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "dn_node_count", value)

    @property
    @pulumi.getter(name="primaryZone")
    def primary_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Primary Availability Zone.
        """
        return pulumi.get(self, "primary_zone")

    @primary_zone.setter
    def primary_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "primary_zone", value)

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        The resource group ID can be empty. This parameter is not supported for the time being.
        """
        return pulumi.get(self, "resource_group_id")

    @resource_group_id.setter
    def resource_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_group_id", value)

    @property
    @pulumi.getter(name="secondaryZone")
    def secondary_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Secondary availability zone.
        """
        return pulumi.get(self, "secondary_zone")

    @secondary_zone.setter
    def secondary_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secondary_zone", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="tertiaryZone")
    def tertiary_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Third Availability Zone.
        """
        return pulumi.get(self, "tertiary_zone")

    @tertiary_zone.setter
    def tertiary_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tertiary_zone", value)

    @property
    @pulumi.getter(name="topologyType")
    def topology_type(self) -> Optional[pulumi.Input[str]]:
        """
        Topology type:
        - **3azones**: three available areas;
        - **1azone**: Single zone.
        """
        return pulumi.get(self, "topology_type")

    @topology_type.setter
    def topology_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "topology_type", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the virtual switch.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class PolardbxInstance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cn_class: Optional[pulumi.Input[str]] = None,
                 cn_node_count: Optional[pulumi.Input[int]] = None,
                 dn_class: Optional[pulumi.Input[str]] = None,
                 dn_node_count: Optional[pulumi.Input[int]] = None,
                 primary_zone: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secondary_zone: Optional[pulumi.Input[str]] = None,
                 tertiary_zone: Optional[pulumi.Input[str]] = None,
                 topology_type: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a DRDS Polardb X Instance resource.

        For information about DRDS Polardb X Instance and how to use it, see [What is Polardb X Instance](https://www.alibabacloud.com/help/en/polardb/polardb-for-xscale/api-createdbinstance-1).

        > **NOTE:** Available since v1.211.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("exampleNetwork", vpc_name=name)
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vpc_id=example_network.id,
            zone_id=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vswitch_name=name)
        default_polardbx_instance = alicloud.drds.PolardbxInstance("defaultPolardbxInstance",
            topology_type="3azones",
            vswitch_id=example_switch.id,
            primary_zone="ap-southeast-1a",
            cn_node_count=2,
            dn_class="mysql.n4.medium.25",
            cn_class="polarx.x4.medium.2e",
            dn_node_count=2,
            secondary_zone="ap-southeast-1b",
            tertiary_zone="ap-southeast-1c",
            vpc_id=example_network.id)
        ```

        ## Import

        DRDS Polardb X Instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:drds/polardbxInstance:PolardbxInstance example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cn_class: Compute node specifications.
        :param pulumi.Input[int] cn_node_count: Number of computing nodes.
        :param pulumi.Input[str] dn_class: Storage node specifications.
        :param pulumi.Input[int] dn_node_count: The number of storage nodes.
        :param pulumi.Input[str] primary_zone: Primary Availability Zone.
        :param pulumi.Input[str] resource_group_id: The resource group ID can be empty. This parameter is not supported for the time being.
        :param pulumi.Input[str] secondary_zone: Secondary availability zone.
        :param pulumi.Input[str] tertiary_zone: Third Availability Zone.
        :param pulumi.Input[str] topology_type: Topology type:
               - **3azones**: three available areas;
               - **1azone**: Single zone.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        :param pulumi.Input[str] vswitch_id: The ID of the virtual switch.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PolardbxInstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a DRDS Polardb X Instance resource.

        For information about DRDS Polardb X Instance and how to use it, see [What is Polardb X Instance](https://www.alibabacloud.com/help/en/polardb/polardb-for-xscale/api-createdbinstance-1).

        > **NOTE:** Available since v1.211.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        example_network = alicloud.vpc.Network("exampleNetwork", vpc_name=name)
        example_switch = alicloud.vpc.Switch("exampleSwitch",
            vpc_id=example_network.id,
            zone_id=default_zones.zones[0].id,
            cidr_block="172.16.0.0/24",
            vswitch_name=name)
        default_polardbx_instance = alicloud.drds.PolardbxInstance("defaultPolardbxInstance",
            topology_type="3azones",
            vswitch_id=example_switch.id,
            primary_zone="ap-southeast-1a",
            cn_node_count=2,
            dn_class="mysql.n4.medium.25",
            cn_class="polarx.x4.medium.2e",
            dn_node_count=2,
            secondary_zone="ap-southeast-1b",
            tertiary_zone="ap-southeast-1c",
            vpc_id=example_network.id)
        ```

        ## Import

        DRDS Polardb X Instance can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:drds/polardbxInstance:PolardbxInstance example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PolardbxInstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PolardbxInstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PolardbxInstanceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cn_class: Optional[pulumi.Input[str]] = None,
                 cn_node_count: Optional[pulumi.Input[int]] = None,
                 dn_class: Optional[pulumi.Input[str]] = None,
                 dn_node_count: Optional[pulumi.Input[int]] = None,
                 primary_zone: Optional[pulumi.Input[str]] = None,
                 resource_group_id: Optional[pulumi.Input[str]] = None,
                 secondary_zone: Optional[pulumi.Input[str]] = None,
                 tertiary_zone: Optional[pulumi.Input[str]] = None,
                 topology_type: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PolardbxInstanceArgs.__new__(PolardbxInstanceArgs)

            if cn_class is None and not opts.urn:
                raise TypeError("Missing required property 'cn_class'")
            __props__.__dict__["cn_class"] = cn_class
            if cn_node_count is None and not opts.urn:
                raise TypeError("Missing required property 'cn_node_count'")
            __props__.__dict__["cn_node_count"] = cn_node_count
            if dn_class is None and not opts.urn:
                raise TypeError("Missing required property 'dn_class'")
            __props__.__dict__["dn_class"] = dn_class
            if dn_node_count is None and not opts.urn:
                raise TypeError("Missing required property 'dn_node_count'")
            __props__.__dict__["dn_node_count"] = dn_node_count
            if primary_zone is None and not opts.urn:
                raise TypeError("Missing required property 'primary_zone'")
            __props__.__dict__["primary_zone"] = primary_zone
            __props__.__dict__["resource_group_id"] = resource_group_id
            __props__.__dict__["secondary_zone"] = secondary_zone
            __props__.__dict__["tertiary_zone"] = tertiary_zone
            if topology_type is None and not opts.urn:
                raise TypeError("Missing required property 'topology_type'")
            __props__.__dict__["topology_type"] = topology_type
            if vpc_id is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_id'")
            __props__.__dict__["vpc_id"] = vpc_id
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["create_time"] = None
            __props__.__dict__["status"] = None
        super(PolardbxInstance, __self__).__init__(
            'alicloud:drds/polardbxInstance:PolardbxInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cn_class: Optional[pulumi.Input[str]] = None,
            cn_node_count: Optional[pulumi.Input[int]] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            dn_class: Optional[pulumi.Input[str]] = None,
            dn_node_count: Optional[pulumi.Input[int]] = None,
            primary_zone: Optional[pulumi.Input[str]] = None,
            resource_group_id: Optional[pulumi.Input[str]] = None,
            secondary_zone: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tertiary_zone: Optional[pulumi.Input[str]] = None,
            topology_type: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'PolardbxInstance':
        """
        Get an existing PolardbxInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cn_class: Compute node specifications.
        :param pulumi.Input[int] cn_node_count: Number of computing nodes.
        :param pulumi.Input[str] create_time: The creation time of the resource.
        :param pulumi.Input[str] dn_class: Storage node specifications.
        :param pulumi.Input[int] dn_node_count: The number of storage nodes.
        :param pulumi.Input[str] primary_zone: Primary Availability Zone.
        :param pulumi.Input[str] resource_group_id: The resource group ID can be empty. This parameter is not supported for the time being.
        :param pulumi.Input[str] secondary_zone: Secondary availability zone.
        :param pulumi.Input[str] status: The status of the resource.
        :param pulumi.Input[str] tertiary_zone: Third Availability Zone.
        :param pulumi.Input[str] topology_type: Topology type:
               - **3azones**: three available areas;
               - **1azone**: Single zone.
        :param pulumi.Input[str] vpc_id: The VPC ID.
        :param pulumi.Input[str] vswitch_id: The ID of the virtual switch.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PolardbxInstanceState.__new__(_PolardbxInstanceState)

        __props__.__dict__["cn_class"] = cn_class
        __props__.__dict__["cn_node_count"] = cn_node_count
        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["dn_class"] = dn_class
        __props__.__dict__["dn_node_count"] = dn_node_count
        __props__.__dict__["primary_zone"] = primary_zone
        __props__.__dict__["resource_group_id"] = resource_group_id
        __props__.__dict__["secondary_zone"] = secondary_zone
        __props__.__dict__["status"] = status
        __props__.__dict__["tertiary_zone"] = tertiary_zone
        __props__.__dict__["topology_type"] = topology_type
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vswitch_id"] = vswitch_id
        return PolardbxInstance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cnClass")
    def cn_class(self) -> pulumi.Output[str]:
        """
        Compute node specifications.
        """
        return pulumi.get(self, "cn_class")

    @property
    @pulumi.getter(name="cnNodeCount")
    def cn_node_count(self) -> pulumi.Output[int]:
        """
        Number of computing nodes.
        """
        return pulumi.get(self, "cn_node_count")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the resource.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="dnClass")
    def dn_class(self) -> pulumi.Output[str]:
        """
        Storage node specifications.
        """
        return pulumi.get(self, "dn_class")

    @property
    @pulumi.getter(name="dnNodeCount")
    def dn_node_count(self) -> pulumi.Output[int]:
        """
        The number of storage nodes.
        """
        return pulumi.get(self, "dn_node_count")

    @property
    @pulumi.getter(name="primaryZone")
    def primary_zone(self) -> pulumi.Output[str]:
        """
        Primary Availability Zone.
        """
        return pulumi.get(self, "primary_zone")

    @property
    @pulumi.getter(name="resourceGroupId")
    def resource_group_id(self) -> pulumi.Output[str]:
        """
        The resource group ID can be empty. This parameter is not supported for the time being.
        """
        return pulumi.get(self, "resource_group_id")

    @property
    @pulumi.getter(name="secondaryZone")
    def secondary_zone(self) -> pulumi.Output[Optional[str]]:
        """
        Secondary availability zone.
        """
        return pulumi.get(self, "secondary_zone")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the resource.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="tertiaryZone")
    def tertiary_zone(self) -> pulumi.Output[Optional[str]]:
        """
        Third Availability Zone.
        """
        return pulumi.get(self, "tertiary_zone")

    @property
    @pulumi.getter(name="topologyType")
    def topology_type(self) -> pulumi.Output[str]:
        """
        Topology type:
        - **3azones**: three available areas;
        - **1azone**: Single zone.
        """
        return pulumi.get(self, "topology_type")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC ID.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The ID of the virtual switch.
        """
        return pulumi.get(self, "vswitch_id")

