# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from .. import _utilities, _tables

__all__ = ['KeyPairAttachment']


class KeyPairAttachment(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force: Optional[pulumi.Input[bool]] = None,
                 instance_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
                 key_name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a key pair attachment resource to bind key pair for several ECS instances.

        > **NOTE:** After the key pair is attached with sone instances, there instances must be rebooted to make the key pair affect.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default = alicloud.get_zones(available_disk_category="cloud_ssd",
            available_resource_creation="VSwitch")
        type = alicloud.ecs.get_instance_types(availability_zone=default.zones[0].id,
            cpu_core_count=1,
            memory_size=2)
        images = alicloud.ecs.get_images(most_recent=True,
            name_regex="^ubuntu_18.*64",
            owners="system")
        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "keyPairAttachmentName"
        vpc = alicloud.vpc.Network("vpc", cidr_block="10.1.0.0/21")
        vswitch = alicloud.vpc.Switch("vswitch",
            availability_zone=default.zones[0].id,
            cidr_block="10.1.1.0/24",
            vpc_id=vpc.id)
        group = alicloud.ecs.SecurityGroup("group",
            description="New security group",
            vpc_id=vpc.id)
        instance = []
        for range in [{"value": i} for i in range(0, 2)]:
            instance.append(alicloud.ecs.Instance(f"instance-{range['value']}",
                image_id=images.images[0].id,
                instance_charge_type="PostPaid",
                instance_name=f"{name}-{range['value'] + 1}",
                instance_type=type.instance_types[0].id,
                internet_charge_type="PayByTraffic",
                internet_max_bandwidth_out=5,
                password="Test12345",
                security_groups=[group.id],
                system_disk_category="cloud_ssd",
                vswitch_id=vswitch.id))
        pair = alicloud.ecs.KeyPair("pair", key_name=name)
        attachment = alicloud.ecs.KeyPairAttachment("attachment",
            instance_ids=[__item.id for __item in instance],
            key_name=pair.id)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] key_name: The name of key pair used to bind.
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

            __props__['force'] = force
            if instance_ids is None:
                raise TypeError("Missing required property 'instance_ids'")
            __props__['instance_ids'] = instance_ids
            if key_name is None:
                raise TypeError("Missing required property 'key_name'")
            __props__['key_name'] = key_name
        super(KeyPairAttachment, __self__).__init__(
            'alicloud:ecs/keyPairAttachment:KeyPairAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            force: Optional[pulumi.Input[bool]] = None,
            instance_ids: Optional[pulumi.Input[List[pulumi.Input[str]]]] = None,
            key_name: Optional[pulumi.Input[str]] = None) -> 'KeyPairAttachment':
        """
        Get an existing KeyPairAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force: Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        :param pulumi.Input[List[pulumi.Input[str]]] instance_ids: The list of ECS instance's IDs.
        :param pulumi.Input[str] key_name: The name of key pair used to bind.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["force"] = force
        __props__["instance_ids"] = instance_ids
        __props__["key_name"] = key_name
        return KeyPairAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def force(self) -> Optional[bool]:
        """
        Set it to true and it will reboot instances which attached with the key pair to make key pair affect immediately.
        """
        return pulumi.get(self, "force")

    @property
    @pulumi.getter(name="instanceIds")
    def instance_ids(self) -> List[str]:
        """
        The list of ECS instance's IDs.
        """
        return pulumi.get(self, "instance_ids")

    @property
    @pulumi.getter(name="keyName")
    def key_name(self) -> str:
        """
        The name of key pair used to bind.
        """
        return pulumi.get(self, "key_name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

