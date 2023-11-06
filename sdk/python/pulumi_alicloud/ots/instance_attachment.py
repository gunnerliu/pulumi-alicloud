# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceAttachmentArgs', 'InstanceAttachment']

@pulumi.input_type
class InstanceAttachmentArgs:
    def __init__(__self__, *,
                 instance_name: pulumi.Input[str],
                 vpc_name: pulumi.Input[str],
                 vswitch_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a InstanceAttachment resource.
        :param pulumi.Input[str] instance_name: The name of the OTS instance.
        :param pulumi.Input[str] vpc_name: The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        :param pulumi.Input[str] vswitch_id: The ID of attaching VSwitch to instance.
        """
        InstanceAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_name=instance_name,
            vpc_name=vpc_name,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_name: Optional[pulumi.Input[str]] = None,
             vpc_name: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if instance_name is None and 'instanceName' in kwargs:
            instance_name = kwargs['instanceName']
        if instance_name is None:
            raise TypeError("Missing 'instance_name' argument")
        if vpc_name is None and 'vpcName' in kwargs:
            vpc_name = kwargs['vpcName']
        if vpc_name is None:
            raise TypeError("Missing 'vpc_name' argument")
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']
        if vswitch_id is None:
            raise TypeError("Missing 'vswitch_id' argument")

        _setter("instance_name", instance_name)
        _setter("vpc_name", vpc_name)
        _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Input[str]:
        """
        The name of the OTS instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="vpcName")
    def vpc_name(self) -> pulumi.Input[str]:
        """
        The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        """
        return pulumi.get(self, "vpc_name")

    @vpc_name.setter
    def vpc_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "vpc_name", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Input[str]:
        """
        The ID of attaching VSwitch to instance.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "vswitch_id", value)


@pulumi.input_type
class _InstanceAttachmentState:
    def __init__(__self__, *,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 vpc_name: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceAttachment resources.
        :param pulumi.Input[str] instance_name: The name of the OTS instance.
        :param pulumi.Input[str] vpc_id: The ID of attaching VPC to instance.
        :param pulumi.Input[str] vpc_name: The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        :param pulumi.Input[str] vswitch_id: The ID of attaching VSwitch to instance.
        """
        _InstanceAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            instance_name=instance_name,
            vpc_id=vpc_id,
            vpc_name=vpc_name,
            vswitch_id=vswitch_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             instance_name: Optional[pulumi.Input[str]] = None,
             vpc_id: Optional[pulumi.Input[str]] = None,
             vpc_name: Optional[pulumi.Input[str]] = None,
             vswitch_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if instance_name is None and 'instanceName' in kwargs:
            instance_name = kwargs['instanceName']
        if vpc_id is None and 'vpcId' in kwargs:
            vpc_id = kwargs['vpcId']
        if vpc_name is None and 'vpcName' in kwargs:
            vpc_name = kwargs['vpcName']
        if vswitch_id is None and 'vswitchId' in kwargs:
            vswitch_id = kwargs['vswitchId']

        if instance_name is not None:
            _setter("instance_name", instance_name)
        if vpc_id is not None:
            _setter("vpc_id", vpc_id)
        if vpc_name is not None:
            _setter("vpc_name", vpc_name)
        if vswitch_id is not None:
            _setter("vswitch_id", vswitch_id)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the OTS instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of attaching VPC to instance.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter(name="vpcName")
    def vpc_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        """
        return pulumi.get(self, "vpc_name")

    @vpc_name.setter
    def vpc_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_name", value)

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of attaching VSwitch to instance.
        """
        return pulumi.get(self, "vswitch_id")

    @vswitch_id.setter
    def vswitch_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vswitch_id", value)


class InstanceAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 vpc_name: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        This resource will help you to bind a VPC to an OTS instance.

        > **NOTE:** Available since v1.10.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_instance = alicloud.ots.Instance("defaultInstance",
            description=name,
            accessed_by="Vpc",
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_instance_attachment = alicloud.ots.InstanceAttachment("defaultInstanceAttachment",
            instance_name=default_instance.name,
            vpc_name="examplename",
            vswitch_id=default_switch.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The name of the OTS instance.
        :param pulumi.Input[str] vpc_name: The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        :param pulumi.Input[str] vswitch_id: The ID of attaching VSwitch to instance.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource will help you to bind a VPC to an OTS instance.

        > **NOTE:** Available since v1.10.0.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf-example"
        default_instance = alicloud.ots.Instance("defaultInstance",
            description=name,
            accessed_by="Vpc",
            tags={
                "Created": "TF",
                "For": "example",
            })
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_instance_attachment = alicloud.ots.InstanceAttachment("defaultInstanceAttachment",
            instance_name=default_instance.name,
            vpc_name="examplename",
            vswitch_id=default_switch.id)
        ```

        :param str resource_name: The name of the resource.
        :param InstanceAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 vpc_name: Optional[pulumi.Input[str]] = None,
                 vswitch_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceAttachmentArgs.__new__(InstanceAttachmentArgs)

            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            if vpc_name is None and not opts.urn:
                raise TypeError("Missing required property 'vpc_name'")
            __props__.__dict__["vpc_name"] = vpc_name
            if vswitch_id is None and not opts.urn:
                raise TypeError("Missing required property 'vswitch_id'")
            __props__.__dict__["vswitch_id"] = vswitch_id
            __props__.__dict__["vpc_id"] = None
        super(InstanceAttachment, __self__).__init__(
            'alicloud:ots/instanceAttachment:InstanceAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            vpc_name: Optional[pulumi.Input[str]] = None,
            vswitch_id: Optional[pulumi.Input[str]] = None) -> 'InstanceAttachment':
        """
        Get an existing InstanceAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_name: The name of the OTS instance.
        :param pulumi.Input[str] vpc_id: The ID of attaching VPC to instance.
        :param pulumi.Input[str] vpc_name: The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        :param pulumi.Input[str] vswitch_id: The ID of attaching VSwitch to instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceAttachmentState.__new__(_InstanceAttachmentState)

        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["vpc_name"] = vpc_name
        __props__.__dict__["vswitch_id"] = vswitch_id
        return InstanceAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        The name of the OTS instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The ID of attaching VPC to instance.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter(name="vpcName")
    def vpc_name(self) -> pulumi.Output[str]:
        """
        The name of attaching VPC to instance. It can only contain letters and numbers, must start with a letter, and is limited to 3-16 characters in length.
        """
        return pulumi.get(self, "vpc_name")

    @property
    @pulumi.getter(name="vswitchId")
    def vswitch_id(self) -> pulumi.Output[str]:
        """
        The ID of attaching VSwitch to instance.
        """
        return pulumi.get(self, "vswitch_id")

