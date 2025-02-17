# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ExchangeArgs', 'Exchange']

@pulumi.input_type
class ExchangeArgs:
    def __init__(__self__, *,
                 auto_delete_state: pulumi.Input[bool],
                 exchange_name: pulumi.Input[str],
                 exchange_type: pulumi.Input[str],
                 instance_id: pulumi.Input[str],
                 internal: pulumi.Input[bool],
                 virtual_host_name: pulumi.Input[str],
                 alternate_exchange: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Exchange resource.
        :param pulumi.Input[bool] auto_delete_state: Specifies whether the Auto Delete attribute is configured. Valid values:
               * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
               * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        :param pulumi.Input[str] exchange_name: The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        :param pulumi.Input[str] exchange_type: The type of the exchange. Valid values:
               * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
               * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
               * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
               * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
               When binding Headers Exchange and Queue, set the key-value pair of the binding property;
               when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
               The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[bool] internal: Specifies whether an exchange is an internal exchange. Valid values:
               * false: The exchange is not an internal exchange.
               * true: The exchange is an internal exchange.
        :param pulumi.Input[str] virtual_host_name: The name of virtual host where an exchange resides.
        :param pulumi.Input[str] alternate_exchange: The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        """
        pulumi.set(__self__, "auto_delete_state", auto_delete_state)
        pulumi.set(__self__, "exchange_name", exchange_name)
        pulumi.set(__self__, "exchange_type", exchange_type)
        pulumi.set(__self__, "instance_id", instance_id)
        pulumi.set(__self__, "internal", internal)
        pulumi.set(__self__, "virtual_host_name", virtual_host_name)
        if alternate_exchange is not None:
            pulumi.set(__self__, "alternate_exchange", alternate_exchange)

    @property
    @pulumi.getter(name="autoDeleteState")
    def auto_delete_state(self) -> pulumi.Input[bool]:
        """
        Specifies whether the Auto Delete attribute is configured. Valid values:
        * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        """
        return pulumi.get(self, "auto_delete_state")

    @auto_delete_state.setter
    def auto_delete_state(self, value: pulumi.Input[bool]):
        pulumi.set(self, "auto_delete_state", value)

    @property
    @pulumi.getter(name="exchangeName")
    def exchange_name(self) -> pulumi.Input[str]:
        """
        The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        """
        return pulumi.get(self, "exchange_name")

    @exchange_name.setter
    def exchange_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "exchange_name", value)

    @property
    @pulumi.getter(name="exchangeType")
    def exchange_type(self) -> pulumi.Input[str]:
        """
        The type of the exchange. Valid values:
        * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        """
        return pulumi.get(self, "exchange_type")

    @exchange_type.setter
    def exchange_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "exchange_type", value)

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
    @pulumi.getter
    def internal(self) -> pulumi.Input[bool]:
        """
        Specifies whether an exchange is an internal exchange. Valid values:
        * false: The exchange is not an internal exchange.
        * true: The exchange is an internal exchange.
        """
        return pulumi.get(self, "internal")

    @internal.setter
    def internal(self, value: pulumi.Input[bool]):
        pulumi.set(self, "internal", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Input[str]:
        """
        The name of virtual host where an exchange resides.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "virtual_host_name", value)

    @property
    @pulumi.getter(name="alternateExchange")
    def alternate_exchange(self) -> Optional[pulumi.Input[str]]:
        """
        The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        """
        return pulumi.get(self, "alternate_exchange")

    @alternate_exchange.setter
    def alternate_exchange(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alternate_exchange", value)


@pulumi.input_type
class _ExchangeState:
    def __init__(__self__, *,
                 alternate_exchange: Optional[pulumi.Input[str]] = None,
                 auto_delete_state: Optional[pulumi.Input[bool]] = None,
                 exchange_name: Optional[pulumi.Input[str]] = None,
                 exchange_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 internal: Optional[pulumi.Input[bool]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Exchange resources.
        :param pulumi.Input[str] alternate_exchange: The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        :param pulumi.Input[bool] auto_delete_state: Specifies whether the Auto Delete attribute is configured. Valid values:
               * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
               * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        :param pulumi.Input[str] exchange_name: The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        :param pulumi.Input[str] exchange_type: The type of the exchange. Valid values:
               * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
               * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
               * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
               * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
               When binding Headers Exchange and Queue, set the key-value pair of the binding property;
               when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
               The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[bool] internal: Specifies whether an exchange is an internal exchange. Valid values:
               * false: The exchange is not an internal exchange.
               * true: The exchange is an internal exchange.
        :param pulumi.Input[str] virtual_host_name: The name of virtual host where an exchange resides.
        """
        if alternate_exchange is not None:
            pulumi.set(__self__, "alternate_exchange", alternate_exchange)
        if auto_delete_state is not None:
            pulumi.set(__self__, "auto_delete_state", auto_delete_state)
        if exchange_name is not None:
            pulumi.set(__self__, "exchange_name", exchange_name)
        if exchange_type is not None:
            pulumi.set(__self__, "exchange_type", exchange_type)
        if instance_id is not None:
            pulumi.set(__self__, "instance_id", instance_id)
        if internal is not None:
            pulumi.set(__self__, "internal", internal)
        if virtual_host_name is not None:
            pulumi.set(__self__, "virtual_host_name", virtual_host_name)

    @property
    @pulumi.getter(name="alternateExchange")
    def alternate_exchange(self) -> Optional[pulumi.Input[str]]:
        """
        The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        """
        return pulumi.get(self, "alternate_exchange")

    @alternate_exchange.setter
    def alternate_exchange(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alternate_exchange", value)

    @property
    @pulumi.getter(name="autoDeleteState")
    def auto_delete_state(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the Auto Delete attribute is configured. Valid values:
        * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        """
        return pulumi.get(self, "auto_delete_state")

    @auto_delete_state.setter
    def auto_delete_state(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_delete_state", value)

    @property
    @pulumi.getter(name="exchangeName")
    def exchange_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        """
        return pulumi.get(self, "exchange_name")

    @exchange_name.setter
    def exchange_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exchange_name", value)

    @property
    @pulumi.getter(name="exchangeType")
    def exchange_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the exchange. Valid values:
        * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        """
        return pulumi.get(self, "exchange_type")

    @exchange_type.setter
    def exchange_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exchange_type", value)

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
    @pulumi.getter
    def internal(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether an exchange is an internal exchange. Valid values:
        * false: The exchange is not an internal exchange.
        * true: The exchange is an internal exchange.
        """
        return pulumi.get(self, "internal")

    @internal.setter
    def internal(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "internal", value)

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of virtual host where an exchange resides.
        """
        return pulumi.get(self, "virtual_host_name")

    @virtual_host_name.setter
    def virtual_host_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "virtual_host_name", value)


class Exchange(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alternate_exchange: Optional[pulumi.Input[str]] = None,
                 auto_delete_state: Optional[pulumi.Input[bool]] = None,
                 exchange_name: Optional[pulumi.Input[str]] = None,
                 exchange_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 internal: Optional[pulumi.Input[bool]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a RabbitMQ (AMQP) Exchange resource.

        For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).

        > **NOTE:** Available since v1.128.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_instance = alicloud.amqp.Instance("defaultInstance",
            instance_type="professional",
            max_tps="1000",
            queue_capacity="50",
            support_eip=True,
            max_eip_tps="128",
            payment_type="Subscription",
            period=1)
        default_virtual_host = alicloud.amqp.VirtualHost("defaultVirtualHost",
            instance_id=default_instance.id,
            virtual_host_name="tf-example")
        default_exchange = alicloud.amqp.Exchange("defaultExchange",
            auto_delete_state=False,
            exchange_name="tf-example",
            exchange_type="DIRECT",
            instance_id=default_instance.id,
            internal=False,
            virtual_host_name=default_virtual_host.virtual_host_name)
        ```

        ## Import

        RabbitMQ (AMQP) Exchange can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:amqp/exchange:Exchange example <instance_id>:<virtual_host_name>:<exchange_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alternate_exchange: The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        :param pulumi.Input[bool] auto_delete_state: Specifies whether the Auto Delete attribute is configured. Valid values:
               * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
               * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        :param pulumi.Input[str] exchange_name: The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        :param pulumi.Input[str] exchange_type: The type of the exchange. Valid values:
               * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
               * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
               * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
               * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
               When binding Headers Exchange and Queue, set the key-value pair of the binding property;
               when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
               The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[bool] internal: Specifies whether an exchange is an internal exchange. Valid values:
               * false: The exchange is not an internal exchange.
               * true: The exchange is an internal exchange.
        :param pulumi.Input[str] virtual_host_name: The name of virtual host where an exchange resides.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExchangeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a RabbitMQ (AMQP) Exchange resource.

        For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).

        > **NOTE:** Available since v1.128.0.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        default_instance = alicloud.amqp.Instance("defaultInstance",
            instance_type="professional",
            max_tps="1000",
            queue_capacity="50",
            support_eip=True,
            max_eip_tps="128",
            payment_type="Subscription",
            period=1)
        default_virtual_host = alicloud.amqp.VirtualHost("defaultVirtualHost",
            instance_id=default_instance.id,
            virtual_host_name="tf-example")
        default_exchange = alicloud.amqp.Exchange("defaultExchange",
            auto_delete_state=False,
            exchange_name="tf-example",
            exchange_type="DIRECT",
            instance_id=default_instance.id,
            internal=False,
            virtual_host_name=default_virtual_host.virtual_host_name)
        ```

        ## Import

        RabbitMQ (AMQP) Exchange can be imported using the id, e.g.

        ```sh
        $ pulumi import alicloud:amqp/exchange:Exchange example <instance_id>:<virtual_host_name>:<exchange_name>
        ```

        :param str resource_name: The name of the resource.
        :param ExchangeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExchangeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alternate_exchange: Optional[pulumi.Input[str]] = None,
                 auto_delete_state: Optional[pulumi.Input[bool]] = None,
                 exchange_name: Optional[pulumi.Input[str]] = None,
                 exchange_type: Optional[pulumi.Input[str]] = None,
                 instance_id: Optional[pulumi.Input[str]] = None,
                 internal: Optional[pulumi.Input[bool]] = None,
                 virtual_host_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExchangeArgs.__new__(ExchangeArgs)

            __props__.__dict__["alternate_exchange"] = alternate_exchange
            if auto_delete_state is None and not opts.urn:
                raise TypeError("Missing required property 'auto_delete_state'")
            __props__.__dict__["auto_delete_state"] = auto_delete_state
            if exchange_name is None and not opts.urn:
                raise TypeError("Missing required property 'exchange_name'")
            __props__.__dict__["exchange_name"] = exchange_name
            if exchange_type is None and not opts.urn:
                raise TypeError("Missing required property 'exchange_type'")
            __props__.__dict__["exchange_type"] = exchange_type
            if instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'instance_id'")
            __props__.__dict__["instance_id"] = instance_id
            if internal is None and not opts.urn:
                raise TypeError("Missing required property 'internal'")
            __props__.__dict__["internal"] = internal
            if virtual_host_name is None and not opts.urn:
                raise TypeError("Missing required property 'virtual_host_name'")
            __props__.__dict__["virtual_host_name"] = virtual_host_name
        super(Exchange, __self__).__init__(
            'alicloud:amqp/exchange:Exchange',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alternate_exchange: Optional[pulumi.Input[str]] = None,
            auto_delete_state: Optional[pulumi.Input[bool]] = None,
            exchange_name: Optional[pulumi.Input[str]] = None,
            exchange_type: Optional[pulumi.Input[str]] = None,
            instance_id: Optional[pulumi.Input[str]] = None,
            internal: Optional[pulumi.Input[bool]] = None,
            virtual_host_name: Optional[pulumi.Input[str]] = None) -> 'Exchange':
        """
        Get an existing Exchange resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alternate_exchange: The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        :param pulumi.Input[bool] auto_delete_state: Specifies whether the Auto Delete attribute is configured. Valid values:
               * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
               * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        :param pulumi.Input[str] exchange_name: The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        :param pulumi.Input[str] exchange_type: The type of the exchange. Valid values:
               * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
               * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
               * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
               * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
               When binding Headers Exchange and Queue, set the key-value pair of the binding property;
               when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
               The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        :param pulumi.Input[str] instance_id: The ID of the instance.
        :param pulumi.Input[bool] internal: Specifies whether an exchange is an internal exchange. Valid values:
               * false: The exchange is not an internal exchange.
               * true: The exchange is an internal exchange.
        :param pulumi.Input[str] virtual_host_name: The name of virtual host where an exchange resides.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExchangeState.__new__(_ExchangeState)

        __props__.__dict__["alternate_exchange"] = alternate_exchange
        __props__.__dict__["auto_delete_state"] = auto_delete_state
        __props__.__dict__["exchange_name"] = exchange_name
        __props__.__dict__["exchange_type"] = exchange_type
        __props__.__dict__["instance_id"] = instance_id
        __props__.__dict__["internal"] = internal
        __props__.__dict__["virtual_host_name"] = virtual_host_name
        return Exchange(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alternateExchange")
    def alternate_exchange(self) -> pulumi.Output[Optional[str]]:
        """
        The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
        """
        return pulumi.get(self, "alternate_exchange")

    @property
    @pulumi.getter(name="autoDeleteState")
    def auto_delete_state(self) -> pulumi.Output[bool]:
        """
        Specifies whether the Auto Delete attribute is configured. Valid values:
        * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
        * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
        """
        return pulumi.get(self, "auto_delete_state")

    @property
    @pulumi.getter(name="exchangeName")
    def exchange_name(self) -> pulumi.Output[str]:
        """
        The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
        """
        return pulumi.get(self, "exchange_name")

    @property
    @pulumi.getter(name="exchangeType")
    def exchange_type(self) -> pulumi.Output[str]:
        """
        The type of the exchange. Valid values:
        * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
        * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
        * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
        * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
        When binding Headers Exchange and Queue, set the key-value pair of the binding property;
        when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
        The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
        """
        return pulumi.get(self, "exchange_type")

    @property
    @pulumi.getter(name="instanceId")
    def instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the instance.
        """
        return pulumi.get(self, "instance_id")

    @property
    @pulumi.getter
    def internal(self) -> pulumi.Output[bool]:
        """
        Specifies whether an exchange is an internal exchange. Valid values:
        * false: The exchange is not an internal exchange.
        * true: The exchange is an internal exchange.
        """
        return pulumi.get(self, "internal")

    @property
    @pulumi.getter(name="virtualHostName")
    def virtual_host_name(self) -> pulumi.Output[str]:
        """
        The name of virtual host where an exchange resides.
        """
        return pulumi.get(self, "virtual_host_name")

