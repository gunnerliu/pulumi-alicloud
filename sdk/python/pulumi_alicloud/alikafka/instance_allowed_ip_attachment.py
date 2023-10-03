# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceAllowedIpAttachmentArgs', 'InstanceAllowedIpAttachment']

@pulumi.input_type
class InstanceAllowedIpAttachmentArgs:
    def __init__(__self__, *,
                 allowed_ip: pulumi.Input[str],
                 allowed_type: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 port_range: pulumi.Input[str]):
        """
        The set of arguments for constructing a InstanceAllowedIpAttachment resource.
        :param pulumi.Input[str] allowed_ip: The allowed ip. It can be a CIDR block.
        :param pulumi.Input[str] allowed_type: The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port_range: The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
               - `9092/9092`: port range for a VPC whitelist.
               - `9093/9093`: port range for an Internet whitelist.
        """
        InstanceAllowedIpAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            allowed_ip=allowed_ip,
            allowed_type=allowed_type,
            instance_id=instance_id,
            port_range=port_range,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             allowed_ip: pulumi.Input[str],
             allowed_type: pulumi.Input[str],
             instance_id: pulumi.Input[str],
             port_range: pulumi.Input[str],
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("allowed_ip", allowed_ip)
        _setter("allowed_type", allowed_type)
        _setter("instance_id", instance_id)
        _setter("port_range", port_range)

    @property
    @pulumi.getter(name="allowedIp")
    def allowed_ip(self) -> pulumi.Input[str]:
        """
        The allowed ip. It can be a CIDR block.
        """
        return pulumi.get(self, "allowed_ip")

    @allowed_ip.setter
    def allowed_ip(self, value: pulumi.Input[str]):
        pulumi.set(self, "allowed_ip", value)

    @property
    @pulumi.getter(name="allowedType")
    def allowed_type(self) -> pulumi.Input[str]:
        """
        The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        """
        return pulumi.get(self, "allowed_type")

    @allowed_type.setter
    def allowed_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "allowed_type", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="portRange")
    def port_range(self) -> pulumi.Input[str]:
        """
        The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
        - `9092/9092`: port range for a VPC whitelist.
        - `9093/9093`: port range for an Internet whitelist.
        """
        return pulumi.get(self, "port_range")

    @port_range.setter
    def port_range(self, value: pulumi.Input[str]):
        pulumi.set(self, "port_range", value)


@pulumi.input_type
class _InstanceAllowedIpAttachmentState:
    def __init__(__self__, *,
                 allowed_ip: Optional[pulumi.Input[str]] = None,
                 allowed_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port_range: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering InstanceAllowedIpAttachment resources.
        :param pulumi.Input[str] allowed_ip: The allowed ip. It can be a CIDR block.
        :param pulumi.Input[str] allowed_type: The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port_range: The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
               - `9092/9092`: port range for a VPC whitelist.
               - `9093/9093`: port range for an Internet whitelist.
        """
        _InstanceAllowedIpAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            allowed_ip=allowed_ip,
            allowed_type=allowed_type,
            instance_id=instance_id,
            port_range=port_range,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             allowed_ip: Optional[pulumi.Input[str]] = None,
             allowed_type: Optional[pulumi.Input[str]] = None,
             instance_id: Optional[pulumi.Input[str]] = None,
             port_range: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if allowed_ip is not None:
            _setter("allowed_ip", allowed_ip)
        if allowed_type is not None:
            _setter("allowed_type", allowed_type)
        if instance_id is not None:
            _setter("instance_id", instance_id)
        if port_range is not None:
            _setter("port_range", port_range)

    @property
    @pulumi.getter(name="allowedIp")
    def allowed_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The allowed ip. It can be a CIDR block.
        """
        return pulumi.get(self, "allowed_ip")

    @allowed_ip.setter
    def allowed_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allowed_ip", value)

    @property
    @pulumi.getter(name="allowedType")
    def allowed_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        """
        return pulumi.get(self, "allowed_type")

    @allowed_type.setter
    def allowed_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "allowed_type", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="portRange")
    def port_range(self) -> Optional[pulumi.Input[str]]:
        """
        The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
        - `9092/9092`: port range for a VPC whitelist.
        - `9093/9093`: port range for an Internet whitelist.
        """
        return pulumi.get(self, "port_range")

    @port_range.setter
    def port_range(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "port_range", value)


class InstanceAllowedIpAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_ip: Optional[pulumi.Input[str]] = None,
                 allowed_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a AliKafka Instance Allowed Ip Attachment resource.

        For information about Ali Kafka Instance Allowed Ip Attachment and how to use it, see [What is Instance Allowed Ip Attachment](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-doc-alikafka-2019-09-16-api-doc-updateallowedip).

        > **NOTE:** Available since v1.163.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("defaultInstance",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_instance_allowed_ip_attachment = alicloud.alikafka.InstanceAllowedIpAttachment("defaultInstanceAllowedIpAttachment",
            allowed_ip="114.237.9.78/32",
            allowed_type="vpc",
            instance_id=default_instance.id,
            port_range="9092/9092")
        ```

        ## Import

        AliKafka Instance Allowed Ip Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment example <instance_id>:<allowed_type>:<port_range>:<allowed_ip>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] allowed_ip: The allowed ip. It can be a CIDR block.
        :param pulumi.Input[str] allowed_type: The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port_range: The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
               - `9092/9092`: port range for a VPC whitelist.
               - `9093/9093`: port range for an Internet whitelist.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceAllowedIpAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a AliKafka Instance Allowed Ip Attachment resource.

        For information about Ali Kafka Instance Allowed Ip Attachment and how to use it, see [What is Instance Allowed Ip Attachment](https://www.alibabacloud.com/help/en/message-queue-for-apache-kafka/latest/api-doc-alikafka-2019-09-16-api-doc-updateallowedip).

        > **NOTE:** Available since v1.163.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default_zones = alicloud.get_zones(available_resource_creation="VSwitch")
        default_network = alicloud.vpc.Network("defaultNetwork",
            vpc_name=name,
            cidr_block="10.4.0.0/16")
        default_switch = alicloud.vpc.Switch("defaultSwitch",
            vswitch_name=name,
            cidr_block="10.4.0.0/24",
            vpc_id=default_network.id,
            zone_id=default_zones.zones[0].id)
        default_security_group = alicloud.ecs.SecurityGroup("defaultSecurityGroup", vpc_id=default_network.id)
        default_instance = alicloud.alikafka.Instance("defaultInstance",
            partition_num=50,
            disk_type=1,
            disk_size=500,
            deploy_type=5,
            io_max=20,
            vswitch_id=default_switch.id,
            security_group=default_security_group.id)
        default_instance_allowed_ip_attachment = alicloud.alikafka.InstanceAllowedIpAttachment("defaultInstanceAllowedIpAttachment",
            allowed_ip="114.237.9.78/32",
            allowed_type="vpc",
            instance_id=default_instance.id,
            port_range="9092/9092")
        ```

        ## Import

        AliKafka Instance Allowed Ip Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment example <instance_id>:<allowed_type>:<port_range>:<allowed_ip>
        ```

        :param str resource_name: The name of the resource.
        :param InstanceAllowedIpAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceAllowedIpAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            InstanceAllowedIpAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_ip: Optional[pulumi.Input[str]] = None,
                 allowed_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 port_range: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceAllowedIpAttachmentArgs.__new__(InstanceAllowedIpAttachmentArgs)

            if allowed_ip is None and not opts.urn:
                raise TypeError("Missing required property 'allowed_ip'")
            __props__.__dict__["allowed_ip"] = allowed_ip
            if allowed_type is None and not opts.urn:
                raise TypeError("Missing required property 'allowed_type'")
            __props__.__dict__["allowed_type"] = allowed_type
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if port_range is None and not opts.urn:
                raise TypeError("Missing required property 'port_range'")
            __props__.__dict__["port_range"] = port_range
        super(InstanceAllowedIpAttachment, __self__).__init__(
            'alicloud:alikafka/instanceAllowedIpAttachment:InstanceAllowedIpAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_ip: Optional[pulumi.Input[str]] = None,
            allowed_type: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            port_range: Optional[pulumi.Input[str]] = None) -> 'InstanceAllowedIpAttachment':
        """
        Get an existing InstanceAllowedIpAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] allowed_ip: The allowed ip. It can be a CIDR block.
        :param pulumi.Input[str] allowed_type: The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[str] port_range: The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
               - `9092/9092`: port range for a VPC whitelist.
               - `9093/9093`: port range for an Internet whitelist.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceAllowedIpAttachmentState.__new__(_InstanceAllowedIpAttachmentState)

        __props__.__dict__["allowed_ip"] = allowed_ip
        __props__.__dict__["allowed_type"] = allowed_type
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["port_range"] = port_range
        return InstanceAllowedIpAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedIp")
    def allowed_ip(self) -> pulumi.Output[str]:
        """
        The allowed ip. It can be a CIDR block.
        """
        return pulumi.get(self, "allowed_ip")

    @property
    @pulumi.getter(name="allowedType")
    def allowed_type(self) -> pulumi.Output[str]:
        """
        The type of whitelist. Valid Value: `vpc`, `internet`. **NOTE:** From version 1.179.0, `allowed_type` can be set to `internet`.
        """
        return pulumi.get(self, "allowed_type")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="portRange")
    def port_range(self) -> pulumi.Output[str]:
        """
        The Port range.  Valid Value: `9092/9092`, `9093/9093`. **NOTE:** From version 1.179.0, `port_range` can be set to `9093/9093`.
        - `9092/9092`: port range for a VPC whitelist.
        - `9093/9093`: port range for an Internet whitelist.
        """
        return pulumi.get(self, "port_range")

