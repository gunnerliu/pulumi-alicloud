# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['VirtualHostArgs', 'VirtualHost']

@pulumi.input_type
class VirtualHostArgs:
    def __init__(__self__, *,
                 instance_id: pulumi.Input[str],
                 virtual_host_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a VirtualHost resource.
        :param pulumi.Input[str] instance_id: InstanceId.
        :param pulumi.Input[str] virtual_host_name: VirtualHostName.
        """
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "virtual_host_name", virtual_host_name)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        InstanceId.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Input[str]:
        """
        VirtualHostName.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "virtual_host_name", value)


@pulumi.input_type
class _VirtualHostState:
    def __init__(__self__, *,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VirtualHost resources.
        :param pulumi.Input[str] instance_id: InstanceId.
        :param pulumi.Input[str] virtual_host_name: VirtualHostName.
        """
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if virtual_host_name is not None:
            pulumi.set(__self__, "virtual_host_name", virtual_host_name)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        InstanceId.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> Optional[pulumi.Input[str]]:
        """
        VirtualHostName.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_host_name", value)


class VirtualHost(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RabbitMQ (AMQP) Virtual Host resource.

        For information about RabbitMQ (AMQP) Virtual Host and how to use it, see [What is Virtual Host](https://help.aliyun.com/).

        > **NOTE:** Available in v1.126.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.amqp.VirtualHost("example",
            instance_id="amqp-abc12345",
            virtual_host_name="my-VirtualHost")
        ```

        ## Import

        RabbitMQ (AMQP) Virtual Host can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/virtualHost:VirtualHost example <instance_id>:<virtual_host_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: InstanceId.
        :param pulumi.Input[str] virtual_host_name: VirtualHostName.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VirtualHostArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RabbitMQ (AMQP) Virtual Host resource.

        For information about RabbitMQ (AMQP) Virtual Host and how to use it, see [What is Virtual Host](https://help.aliyun.com/).

        > **NOTE:** Available in v1.126.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        example = alicloud.amqp.VirtualHost("example",
            instance_id="amqp-abc12345",
            virtual_host_name="my-VirtualHost")
        ```

        ## Import

        RabbitMQ (AMQP) Virtual Host can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/virtualHost:VirtualHost example <instance_id>:<virtual_host_name>
        ```

        :param str resource_name: The name of the resource.
        :param VirtualHostArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VirtualHostArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VirtualHostArgs.__new__(VirtualHostArgs)

            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if virtual_host_name is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_host_name'")
            __props__.__dict__["virtual_host_name"] = virtual_host_name
        super(VirtualHost, __self__).__init__(
            'alicloud:amqp/virtualHost:VirtualHost',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            virtual_host_name: Optional[pulumi.Input[str]] = None) -> 'VirtualHost':
        """
        Get an existing VirtualHost resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] instance_id: InstanceId.
        :param pulumi.Input[str] virtual_host_name: VirtualHostName.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VirtualHostState.__new__(_VirtualHostState)

        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["virtual_host_name"] = virtual_host_name
        return VirtualHost(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        InstanceId.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Output[str]:
        """
        VirtualHostName.
        """
        return pulumi.get(self, "virtual_host_name")

