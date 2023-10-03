# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AttachmentArgs', 'Attachment']

@pulumi.input_type
class AttachmentArgs:
    def __init__(__self__, *,
                 instance_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
                 scaling_group_id: pulumi.Input[str],
                 force: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Attachment resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group of a scaling configuration.
        :param pulumi.Input[bool] force: Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
               
               > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
               
               > **NOTE:** Restrictions on attaching ECS instances:
               
               - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
               - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
               - The attached ECS instances must in the running state.
               - The attached ECS instances has not been attached to other scaling groups.
               - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        """
        AttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_ids=instance_ids,
            scaling_group_id=scaling_group_id,
            force=force,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_ids: pulumi.Input[Sequence[pulumi.Input[str]]],
             scaling_group_id: pulumi.Input[str],
             force: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("instance_ids", instance_ids)
        _setter("scaling_group_id", scaling_group_id)
        if force is not None:
            _setter("force", force)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Input[str]:
        """
        ID of the scaling group of a scaling configuration.
        """
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "scaling_group_id", value)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.

        > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.

        > **NOTE:** Restrictions on attaching ECS instances:

        - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
        - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
        - The attached ECS instances must in the running state.
        - The attached ECS instances has not been attached to other scaling groups.
        - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)


@pulumi.input_type
class _AttachmentState:
    def __init__(__self__, *,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Attachment resources.
        :param pulumi.Input[bool] force: Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
               
               > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
               
               > **NOTE:** Restrictions on attaching ECS instances:
               
               - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
               - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
               - The attached ECS instances must in the running state.
               - The attached ECS instances has not been attached to other scaling groups.
               - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group of a scaling configuration.
        """
        _AttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            force=force,
            instance_ids=instance_ids,
            scaling_group_id=scaling_group_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             force: Optional[pulumi.Input[bool]] = None,
             instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             scaling_group_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if force is not None:
            _setter("force", force)
        if instance_ids is not None:
            _setter("instance_ids", instance_ids)
        if scaling_group_id is not None:
            _setter("scaling_group_id", scaling_group_id)

    @property
    @pulumi.getter
    def force(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.

        > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.

        > **NOTE:** Restrictions on attaching ECS instances:

        - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
        - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
        - The attached ECS instances must in the running state.
        - The attached ECS instances has not been attached to other scaling groups.
        - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        """
        return pulumi.get(self, "force")

    @force.setter
    def force(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force", value)

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        """
        return pulumi.get(self, "instance_ids")

    @instance_ids.setter
    def instance_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "instance_ids", value)

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the scaling group of a scaling configuration.
        """
        return pulumi.get(self, "scaling_group_id")

    @scaling_group_id.setter
    def scaling_group_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scaling_group_id", value)


class Attachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Attaches several ECS instances to a specified scaling group or remove them from it.

        > **NOTE:** ECS instances can be attached or remove only when the scaling group is active, and it has no scaling activity in progress.

        > **NOTE:** There are two types ECS instances in a scaling group: "AutoCreated" and "Attached". The total number of them can not larger than the scaling group "MaxSize".

        > **NOTE:** Available since v1.6.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
            cpu_core_count=2,
            memory_size=4)
        default_images = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
            most_recent=True,
            owners="system")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_security_group_rule = alicloud.ecs.SecurityGroupRule("defaultSecurityGroupRule",
            type="ingress",
            ip_protocol="tcp",
            nic_type="intranet",
            policy="accept",
            port_range="22/22",
            priority=1,
            security_group_id=default_security_group.id,
            cidr_ip="172.16.0.0/24")
        default_scaling_group = alicloud.ess.ScalingGroup("defaultScalingGroup",
            min_size=0,
            max_size=2,
            scaling_group_name=name,
            removal_policies=[
                "OldestInstance",
                "NewestInstance",
            ],
            vswitch_ids=[default_switch.id])
        default_scaling_configuration = alicloud.ess.ScalingConfiguration("defaultScalingConfiguration",
            scaling_group_id=default_scaling_group.id,
            image_id=default_images.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            security_group_id=default_security_group.id,
            force_delete=True,
            active=True,
            enable=True)
        default_instance = []
        for range in [{"value": i} for i in range(0, 2)]:
            default_instance.append(alicloud.ecs.Instance(f"defaultInstance-{range['value']}",
                image_id=default_images.images[0].id,
                instance_type=default_instance_types.instance_types[0].id,
                security_groups=[default_security_group.id],
                internet_charge_type="PayByTraffic",
                internet_max_bandwidth_out=10,
                instance_charge_type="PostPaid",
                system_disk_category="cloud_efficiency",
                vswitch_id=default_switch.id,
                instance_name=name))
        default_attachment = alicloud.ess.Attachment("defaultAttachment",
            scaling_group_id=default_scaling_group.id,
            instance_ids=[
                default_instance[0].id,
                default_instance[1].id,
            ],
            force=True)
        ```

        ## Import

        ESS attachment can be imported using the id or scaling group id, e.g.

        ```sh
         $ pulumi import alicloud:ess/attachment:Attachment example asg-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
               
               > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
               
               > **NOTE:** Restrictions on attaching ECS instances:
               
               - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
               - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
               - The attached ECS instances must in the running state.
               - The attached ECS instances has not been attached to other scaling groups.
               - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group of a scaling configuration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Attaches several ECS instances to a specified scaling group or remove them from it.

        > **NOTE:** ECS instances can be attached or remove only when the scaling group is active, and it has no scaling activity in progress.

        > **NOTE:** There are two types ECS instances in a scaling group: "AutoCreated" and "Attached". The total number of them can not larger than the scaling group "MaxSize".

        > **NOTE:** Available since v1.6.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "terraform-example"
        default_zones = alicloud.get_zones(available_disk_category="cloud_efficiency",
            available_resource_creation="VSwitch")
        default_instance_types = alicloud.ecs.get_instance_types(availability_zone=default_zones.zones[0].id,
            cpu_core_count=2,
            memory_size=4)
        default_images = alicloud.ecs.get_images(name_regex="^ubuntu_18.*64",
            most_recent=True,
            owners="system")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="172.16.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vpc_id=default_network.id,
            cidr_block="172.16.0.0/24",
            zone_id=default_zones.zones[0].id,
            vswitch_name=name)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_security_group_rule = alicloud.ecs.SecurityGroupRule("defaultSecurityGroupRule",
            type="ingress",
            ip_protocol="tcp",
            nic_type="intranet",
            policy="accept",
            port_range="22/22",
            priority=1,
            security_group_id=default_security_group.id,
            cidr_ip="172.16.0.0/24")
        default_scaling_group = alicloud.ess.ScalingGroup("defaultScalingGroup",
            min_size=0,
            max_size=2,
            scaling_group_name=name,
            removal_policies=[
                "OldestInstance",
                "NewestInstance",
            ],
            vswitch_ids=[default_switch.id])
        default_scaling_configuration = alicloud.ess.ScalingConfiguration("defaultScalingConfiguration",
            scaling_group_id=default_scaling_group.id,
            image_id=default_images.images[0].id,
            instance_type=default_instance_types.instance_types[0].id,
            security_group_id=default_security_group.id,
            force_delete=True,
            active=True,
            enable=True)
        default_instance = []
        for range in [{"value": i} for i in range(0, 2)]:
            default_instance.append(alicloud.ecs.Instance(f"defaultInstance-{range['value']}",
                image_id=default_images.images[0].id,
                instance_type=default_instance_types.instance_types[0].id,
                security_groups=[default_security_group.id],
                internet_charge_type="PayByTraffic",
                internet_max_bandwidth_out=10,
                instance_charge_type="PostPaid",
                system_disk_category="cloud_efficiency",
                vswitch_id=default_switch.id,
                instance_name=name))
        default_attachment = alicloud.ess.Attachment("defaultAttachment",
            scaling_group_id=default_scaling_group.id,
            instance_ids=[
                default_instance[0].id,
                default_instance[1].id,
            ],
            force=True)
        ```

        ## Import

        ESS attachment can be imported using the id or scaling group id, e.g.

        ```sh
         $ pulumi import alicloud:ess/attachment:Attachment example asg-abc123456
        ```

        :param str resource_name: The name of the resource.
        :param AttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            AttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 scaling_group_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AttachmentArgs.__new__(AttachmentArgs)

            __props__.__dict__["force"] = force
            if instance_ids is None and not opts.urn:
                raise TypeError("Missing required property 'instance_ids'")
            __props__.__dict__["instance_ids"] = instance_ids
            if scaling_group_id is None and not opts.urn:
                raise TypeError("Missing required property 'scaling_group_id'")
            __props__.__dict__["scaling_group_id"] = scaling_group_id
        super(Attachment, __self__).__init__(
            'alicloud:ess/attachment:Attachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            force: Optional[pulumi.Input[bool]] = None,
            instance_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            scaling_group_id: Optional[pulumi.Input[str]] = None) -> 'Attachment':
        """
        Get an existing Attachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.
               
               > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.
               
               > **NOTE:** Restrictions on attaching ECS instances:
               
               - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
               - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
               - The attached ECS instances must in the running state.
               - The attached ECS instances has not been attached to other scaling groups.
               - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] instance_ids: ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        :param pulumi.Input[str] scaling_group_id: ID of the scaling group of a scaling configuration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AttachmentState.__new__(_AttachmentState)

        __props__.__dict__["force"] = force
        __props__.__dict__["instance_ids"] = instance_ids
        __props__.__dict__["scaling_group_id"] = scaling_group_id
        return Attachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def force(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to remove forcibly "AutoCreated" ECS instances in order to release scaling group capacity "MaxSize" for attaching ECS instances. Default to false.

        > **NOTE:** "AutoCreated" ECS instance will be deleted after it is removed from scaling group, but "Attached" will be not.

        > **NOTE:** Restrictions on attaching ECS instances:

        - The attached ECS instances and the scaling group must have the same region and network type(`Classic` or `VPC`).
        - The attached ECS instances and the instance with active scaling configurations must have the same instance type.
        - The attached ECS instances must in the running state.
        - The attached ECS instances has not been attached to other scaling groups.
        - The attached ECS instances supports Subscription and Pay-As-You-Go payment methods.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> pulumi.Output[Sequence[str]]:
        """
        ID of the ECS instance to be attached to the scaling group. You can input up to 20 IDs.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="scalingGroupId")
    def scaling_group_id(self) -> pulumi.Output[str]:
        """
        ID of the scaling group of a scaling configuration.
        """
        return pulumi.get(self, "scaling_group_id")

