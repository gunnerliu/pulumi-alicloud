# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['BindingArgs', 'Binding']

@pulumi.input_type
class BindingArgs:
    def __init__(__self__, *,
                 binding_key: pulumi.Input[str],
                 binding_type: pulumi.Input[str],
                 destination_name: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 source_exchange: pulumi.Input[str],
                 virtual_host_name: pulumi.Input[str],
                 argument: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Binding resource.
        :param pulumi.Input[str] binding_key: The Binding Key.
               * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               The binding key must be 1 to 255 characters in length.
               * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
               The binding key must be 1 to 255 characters in length.
        :param pulumi.Input[str] binding_type: The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        :param pulumi.Input[str] destination_name: The Target Queue Or Exchange of the Name.
        :param pulumi.Input[str] instance_id: Instance Id.
        :param pulumi.Input[str] source_exchange: The Source Exchange Name.
        :param pulumi.Input[str] virtual_host_name: Virtualhost Name.
        :param pulumi.Input[str] argument: X-match Attributes. Valid Values: 
               * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
               * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
               
               **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        """
        pulumi.set(__self__, "binding_key", binding_key)
        pulumi.set(__self__, "binding_type", binding_type)
        pulumi.set(__self__, "destination_name", destination_name)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "source_exchange", source_exchange)
        pulumi.set(__self__, "virtual_host_name", virtual_host_name)
        if argument is not None:
            pulumi.set(__self__, "argument", argument)

    @property
    @pulumi.getter(name="bindingKey")
    def binding_key(self) -> pulumi.Input[str]:
        """
        The Binding Key.
        * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        The binding key must be 1 to 255 characters in length.
        * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
        The binding key must be 1 to 255 characters in length.
        """
        return pulumi.get(self, "binding_key")

    @binding_key.setter
    def binding_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "binding_key", value)

    @property
    @pulumi.getter(name="bindingType")
    def binding_type(self) -> pulumi.Input[str]:
        """
        The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        """
        return pulumi.get(self, "binding_type")

    @binding_type.setter
    def binding_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "binding_type", value)

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Input[str]:
        """
        The Target Queue Or Exchange of the Name.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "destination_name", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Input[str]:
        """
        Instance Id.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="sourceExchange")
    def source_exchange(self) -> pulumi.Input[str]:
        """
        The Source Exchange Name.
        """
        return pulumi.get(self, "source_exchange")

    @source_exchange.setter
    def source_exchange(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_exchange", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Input[str]:
        """
        Virtualhost Name.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "virtual_host_name", value)

    @property
    @pulumi.getter
    def argument(self) -> Optional[pulumi.Input[str]]:
        """
        X-match Attributes. Valid Values: 
        * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
        * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.

        **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        """
        return pulumi.get(self, "argument")

    @argument.setter
    def argument(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "argument", value)


@pulumi.input_type
class _BindingState:
    def __init__(__self__, *,
                 argument: Optional[pulumi.Input[str]] = None,
                 binding_key: Optional[pulumi.Input[str]] = None,
                 binding_type: Optional[pulumi.Input[str]] = None,
                 destination_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 source_exchange: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Binding resources.
        :param pulumi.Input[str] argument: X-match Attributes. Valid Values: 
               * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
               * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
               
               **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        :param pulumi.Input[str] binding_key: The Binding Key.
               * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               The binding key must be 1 to 255 characters in length.
               * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
               The binding key must be 1 to 255 characters in length.
        :param pulumi.Input[str] binding_type: The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        :param pulumi.Input[str] destination_name: The Target Queue Or Exchange of the Name.
        :param pulumi.Input[str] instance_id: Instance Id.
        :param pulumi.Input[str] source_exchange: The Source Exchange Name.
        :param pulumi.Input[str] virtual_host_name: Virtualhost Name.
        """
        if argument is not None:
            pulumi.set(__self__, "argument", argument)
        if binding_key is not None:
            pulumi.set(__self__, "binding_key", binding_key)
        if binding_type is not None:
            pulumi.set(__self__, "binding_type", binding_type)
        if destination_name is not None:
            pulumi.set(__self__, "destination_name", destination_name)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if source_exchange is not None:
            pulumi.set(__self__, "source_exchange", source_exchange)
        if virtual_host_name is not None:
            pulumi.set(__self__, "virtual_host_name", virtual_host_name)

    @property
    @pulumi.getter
    def argument(self) -> Optional[pulumi.Input[str]]:
        """
        X-match Attributes. Valid Values: 
        * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
        * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.

        **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        """
        return pulumi.get(self, "argument")

    @argument.setter
    def argument(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "argument", value)

    @property
    @pulumi.getter(name="bindingKey")
    def binding_key(self) -> Optional[pulumi.Input[str]]:
        """
        The Binding Key.
        * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        The binding key must be 1 to 255 characters in length.
        * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
        The binding key must be 1 to 255 characters in length.
        """
        return pulumi.get(self, "binding_key")

    @binding_key.setter
    def binding_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "binding_key", value)

    @property
    @pulumi.getter(name="bindingType")
    def binding_type(self) -> Optional[pulumi.Input[str]]:
        """
        The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        """
        return pulumi.get(self, "binding_type")

    @binding_type.setter
    def binding_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "binding_type", value)

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Target Queue Or Exchange of the Name.
        """
        return pulumi.get(self, "destination_name")

    @destination_name.setter
    def destination_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "destination_name", value)

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        Instance Id.
        """
        return pulumi.get(self, "instance_id")

    @instance_id.setter
    def instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_id", value)

    @property
    @pulumi.getter(name="sourceExchange")
    def source_exchange(self) -> Optional[pulumi.Input[str]]:
        """
        The Source Exchange Name.
        """
        return pulumi.get(self, "source_exchange")

    @source_exchange.setter
    def source_exchange(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_exchange", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> Optional[pulumi.Input[str]]:
        """
        Virtualhost Name.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_host_name", value)


class Binding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argument: Optional[pulumi.Input[str]] = None,
                 binding_key: Optional[pulumi.Input[str]] = None,
                 binding_type: Optional[pulumi.Input[str]] = None,
                 destination_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 source_exchange: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RabbitMQ (AMQP) Binding resource to bind tha exchange with another exchange or queue.

        For information about RabbitMQ (AMQP) Binding and how to use it, see [What is Binding](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createbinding).

        > **NOTE:** Available since v1.135.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_instance = alicloud.amqp.Instance("defaultInstance",
            instance_type="enterprise",
            max_tps="3000",
            queue_capacity="200",
            storage_size="700",
            support_eip=False,
            max_eip_tps="128",
            payment_type="Subscription",
            period=1)
        default_virtual_host = alicloud.amqp.VirtualHost("defaultVirtualHost",
            instance_id=default_instance.id,
            virtual_host_name="tf-example")
        default_exchange = alicloud.amqp.Exchange("defaultExchange",
            auto_delete_state=False,
            exchange_name="tf-example",
            exchange_type="HEADERS",
            instance_id=default_instance.id,
            internal=False,
            virtual_host_name=default_virtual_host.virtual_host_name)
        default_queue = alicloud.amqp.Queue("defaultQueue",
            instance_id=default_instance.id,
            queue_name="tf-example",
            virtual_host_name=default_virtual_host.virtual_host_name)
        default_binding = alicloud.amqp.Binding("defaultBinding",
            argument="x-match:all",
            binding_key=default_queue.queue_name,
            binding_type="QUEUE",
            destination_name="tf-example",
            instance_id=default_instance.id,
            source_exchange=default_exchange.exchange_name,
            virtual_host_name=default_virtual_host.virtual_host_name)
        ```

        ## Import

        RabbitMQ (AMQP) Binding can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/binding:Binding example <instance_id>:<virtual_host_name>:<source_exchange>:<destination_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] argument: X-match Attributes. Valid Values: 
               * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
               * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
               
               **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        :param pulumi.Input[str] binding_key: The Binding Key.
               * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               The binding key must be 1 to 255 characters in length.
               * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
               The binding key must be 1 to 255 characters in length.
        :param pulumi.Input[str] binding_type: The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        :param pulumi.Input[str] destination_name: The Target Queue Or Exchange of the Name.
        :param pulumi.Input[str] instance_id: Instance Id.
        :param pulumi.Input[str] source_exchange: The Source Exchange Name.
        :param pulumi.Input[str] virtual_host_name: Virtualhost Name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RabbitMQ (AMQP) Binding resource to bind tha exchange with another exchange or queue.

        For information about RabbitMQ (AMQP) Binding and how to use it, see [What is Binding](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createbinding).

        > **NOTE:** Available since v1.135.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_instance = alicloud.amqp.Instance("defaultInstance",
            instance_type="enterprise",
            max_tps="3000",
            queue_capacity="200",
            storage_size="700",
            support_eip=False,
            max_eip_tps="128",
            payment_type="Subscription",
            period=1)
        default_virtual_host = alicloud.amqp.VirtualHost("defaultVirtualHost",
            instance_id=default_instance.id,
            virtual_host_name="tf-example")
        default_exchange = alicloud.amqp.Exchange("defaultExchange",
            auto_delete_state=False,
            exchange_name="tf-example",
            exchange_type="HEADERS",
            instance_id=default_instance.id,
            internal=False,
            virtual_host_name=default_virtual_host.virtual_host_name)
        default_queue = alicloud.amqp.Queue("defaultQueue",
            instance_id=default_instance.id,
            queue_name="tf-example",
            virtual_host_name=default_virtual_host.virtual_host_name)
        default_binding = alicloud.amqp.Binding("defaultBinding",
            argument="x-match:all",
            binding_key=default_queue.queue_name,
            binding_type="QUEUE",
            destination_name="tf-example",
            instance_id=default_instance.id,
            source_exchange=default_exchange.exchange_name,
            virtual_host_name=default_virtual_host.virtual_host_name)
        ```

        ## Import

        RabbitMQ (AMQP) Binding can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:amqp/binding:Binding example <instance_id>:<virtual_host_name>:<source_exchange>:<destination_name>
        ```

        :param str resource_name: The name of the resource.
        :param BindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argument: Optional[pulumi.Input[str]] = None,
                 binding_key: Optional[pulumi.Input[str]] = None,
                 binding_type: Optional[pulumi.Input[str]] = None,
                 destination_name: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 source_exchange: Optional[pulumi.Input[str]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BindingArgs.__new__(BindingArgs)

            __props__.__dict__["argument"] = argument
            if binding_key is None and not opts.urn:
                raise TypeError("Missing required property 'binding_key'")
            __props__.__dict__["binding_key"] = binding_key
            if binding_type is None and not opts.urn:
                raise TypeError("Missing required property 'binding_type'")
            __props__.__dict__["binding_type"] = binding_type
            if destination_name is None and not opts.urn:
                raise TypeError("Missing required property 'destination_name'")
            __props__.__dict__["destination_name"] = destination_name
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if source_exchange is None and not opts.urn:
                raise TypeError("Missing required property 'source_exchange'")
            __props__.__dict__["source_exchange"] = source_exchange
            if virtual_host_name is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_host_name'")
            __props__.__dict__["virtual_host_name"] = virtual_host_name
        super(Binding, __self__).__init__(
            'alicloud:amqp/binding:Binding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            argument: Optional[pulumi.Input[str]] = None,
            binding_key: Optional[pulumi.Input[str]] = None,
            binding_type: Optional[pulumi.Input[str]] = None,
            destination_name: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            source_exchange: Optional[pulumi.Input[str]] = None,
            virtual_host_name: Optional[pulumi.Input[str]] = None) -> 'Binding':
        """
        Get an existing Binding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] argument: X-match Attributes. Valid Values: 
               * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
               * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.
               
               **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        :param pulumi.Input[str] binding_key: The Binding Key.
               * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               The binding key must be 1 to 255 characters in length.
               * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
               If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
               The binding key must be 1 to 255 characters in length.
        :param pulumi.Input[str] binding_type: The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        :param pulumi.Input[str] destination_name: The Target Queue Or Exchange of the Name.
        :param pulumi.Input[str] instance_id: Instance Id.
        :param pulumi.Input[str] source_exchange: The Source Exchange Name.
        :param pulumi.Input[str] virtual_host_name: Virtualhost Name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BindingState.__new__(_BindingState)

        __props__.__dict__["argument"] = argument
        __props__.__dict__["binding_key"] = binding_key
        __props__.__dict__["binding_type"] = binding_type
        __props__.__dict__["destination_name"] = destination_name
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["source_exchange"] = source_exchange
        __props__.__dict__["virtual_host_name"] = virtual_host_name
        return Binding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def argument(self) -> pulumi.Output[str]:
        """
        X-match Attributes. Valid Values: 
        * "x-match:all": Default Value, All the Message Header of Key-Value Pairs Stored in the Must Match.
        * "x-match:any": at Least One Pair of the Message Header of Key-Value Pairs Stored in the Must Match.

        **NOTE:** This Parameter Applies Only to Headers Exchange Other Types of Exchange Is Invalid. Other Types of Exchange Here Can Either Be an Arbitrary Value.
        """
        return pulumi.get(self, "argument")

    @property
    @pulumi.getter(name="bindingKey")
    def binding_key(self) -> pulumi.Output[str]:
        """
        The Binding Key.
        * For a non-topic source exchange: The binding key can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        The binding key must be 1 to 255 characters in length.
        * For a topic source exchange: The binding key can contain letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        If the binding key contains a number sign (#), the binding key must start with a number sign (#) followed by a period (.) or end with a number sign (#) that follows a period (.).
        The binding key must be 1 to 255 characters in length.
        """
        return pulumi.get(self, "binding_key")

    @property
    @pulumi.getter(name="bindingType")
    def binding_type(self) -> pulumi.Output[str]:
        """
        The Target Binding Types. Valid values: `EXCHANGE`, `QUEUE`.
        """
        return pulumi.get(self, "binding_type")

    @property
    @pulumi.getter(name="destinationName")
    def destination_name(self) -> pulumi.Output[str]:
        """
        The Target Queue Or Exchange of the Name.
        """
        return pulumi.get(self, "destination_name")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        Instance Id.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter(name="sourceExchange")
    def source_exchange(self) -> pulumi.Output[str]:
        """
        The Source Exchange Name.
        """
        return pulumi.get(self, "source_exchange")

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Output[str]:
        """
        Virtualhost Name.
        """
        return pulumi.get(self, "virtual_host_name")

