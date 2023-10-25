# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['EventSourceArgs', 'EventSource']

@pulumi.input_type
class EventSourceArgs:
    def __init__(__self__, *,
                 event_bus_name: pulumi.Input[str],
                 event_source_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 external_source_type: Optional[pulumi.Input[str]] = None,
                 linked_external_source: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a EventSource resource.
        :param pulumi.Input[str] event_bus_name: The name of event bus.
        :param pulumi.Input[str] event_source_name: The code name of event source.
        :param pulumi.Input[str] description: The detail describe of event source.
        :param pulumi.Input[Mapping[str, Any]] external_source_config: The config of external source.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `VirtualHostName` - The virtual host name of RabbitMQ.
               `QueueName` - The queue name of RabbitMQ.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `Topic` - The topic of RabbitMQ.
               `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
               `GroupID` - The group ID of consumer.
               When `external_source_type` is `MNS`, The following attributes are supported:
               `QueueName` - The queue name of MNS.
        :param pulumi.Input[str] external_source_type: The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        :param pulumi.Input[bool] linked_external_source: Whether to connect to an external data source. Default value: `false`
        """
        EventSourceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            event_bus_name=event_bus_name,
            event_source_name=event_source_name,
            description=description,
            external_source_config=external_source_config,
            external_source_type=external_source_type,
            linked_external_source=linked_external_source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             event_bus_name: Optional[pulumi.Input[str]] = None,
             event_source_name: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             external_source_type: Optional[pulumi.Input[str]] = None,
             linked_external_source: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if event_bus_name is None and 'eventBusName' in kwargs:
            event_bus_name = kwargs['eventBusName']
        if event_bus_name is None:
            raise TypeError("Missing 'event_bus_name' argument")
        if event_source_name is None and 'eventSourceName' in kwargs:
            event_source_name = kwargs['eventSourceName']
        if event_source_name is None:
            raise TypeError("Missing 'event_source_name' argument")
        if external_source_config is None and 'externalSourceConfig' in kwargs:
            external_source_config = kwargs['externalSourceConfig']
        if external_source_type is None and 'externalSourceType' in kwargs:
            external_source_type = kwargs['externalSourceType']
        if linked_external_source is None and 'linkedExternalSource' in kwargs:
            linked_external_source = kwargs['linkedExternalSource']

        _setter("event_bus_name", event_bus_name)
        _setter("event_source_name", event_source_name)
        if description is not None:
            _setter("description", description)
        if external_source_config is not None:
            _setter("external_source_config", external_source_config)
        if external_source_type is not None:
            _setter("external_source_type", external_source_type)
        if linked_external_source is not None:
            _setter("linked_external_source", linked_external_source)

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> pulumi.Input[str]:
        """
        The name of event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @event_bus_name.setter
    def event_bus_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_bus_name", value)

    @property
    @pulumi.getter(name="eventSourceName")
    def event_source_name(self) -> pulumi.Input[str]:
        """
        The code name of event source.
        """
        return pulumi.get(self, "event_source_name")

    @event_source_name.setter
    def event_source_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_source_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The detail describe of event source.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="externalSourceConfig")
    def external_source_config(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The config of external source.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `VirtualHostName` - The virtual host name of RabbitMQ.
        `QueueName` - The queue name of RabbitMQ.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `Topic` - The topic of RabbitMQ.
        `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
        `GroupID` - The group ID of consumer.
        When `external_source_type` is `MNS`, The following attributes are supported:
        `QueueName` - The queue name of MNS.
        """
        return pulumi.get(self, "external_source_config")

    @external_source_config.setter
    def external_source_config(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "external_source_config", value)

    @property
    @pulumi.getter(name="externalSourceType")
    def external_source_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        """
        return pulumi.get(self, "external_source_type")

    @external_source_type.setter
    def external_source_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_source_type", value)

    @property
    @pulumi.getter(name="linkedExternalSource")
    def linked_external_source(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to connect to an external data source. Default value: `false`
        """
        return pulumi.get(self, "linked_external_source")

    @linked_external_source.setter
    def linked_external_source(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "linked_external_source", value)


@pulumi.input_type
class _EventSourceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 event_source_name: Optional[pulumi.Input[str]] = None,
                 external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 external_source_type: Optional[pulumi.Input[str]] = None,
                 linked_external_source: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering EventSource resources.
        :param pulumi.Input[str] description: The detail describe of event source.
        :param pulumi.Input[str] event_bus_name: The name of event bus.
        :param pulumi.Input[str] event_source_name: The code name of event source.
        :param pulumi.Input[Mapping[str, Any]] external_source_config: The config of external source.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `VirtualHostName` - The virtual host name of RabbitMQ.
               `QueueName` - The queue name of RabbitMQ.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `Topic` - The topic of RabbitMQ.
               `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
               `GroupID` - The group ID of consumer.
               When `external_source_type` is `MNS`, The following attributes are supported:
               `QueueName` - The queue name of MNS.
        :param pulumi.Input[str] external_source_type: The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        :param pulumi.Input[bool] linked_external_source: Whether to connect to an external data source. Default value: `false`
        """
        _EventSourceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            event_bus_name=event_bus_name,
            event_source_name=event_source_name,
            external_source_config=external_source_config,
            external_source_type=external_source_type,
            linked_external_source=linked_external_source,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             event_bus_name: Optional[pulumi.Input[str]] = None,
             event_source_name: Optional[pulumi.Input[str]] = None,
             external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
             external_source_type: Optional[pulumi.Input[str]] = None,
             linked_external_source: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if event_bus_name is None and 'eventBusName' in kwargs:
            event_bus_name = kwargs['eventBusName']
        if event_source_name is None and 'eventSourceName' in kwargs:
            event_source_name = kwargs['eventSourceName']
        if external_source_config is None and 'externalSourceConfig' in kwargs:
            external_source_config = kwargs['externalSourceConfig']
        if external_source_type is None and 'externalSourceType' in kwargs:
            external_source_type = kwargs['externalSourceType']
        if linked_external_source is None and 'linkedExternalSource' in kwargs:
            linked_external_source = kwargs['linkedExternalSource']

        if description is not None:
            _setter("description", description)
        if event_bus_name is not None:
            _setter("event_bus_name", event_bus_name)
        if event_source_name is not None:
            _setter("event_source_name", event_source_name)
        if external_source_config is not None:
            _setter("external_source_config", external_source_config)
        if external_source_type is not None:
            _setter("external_source_type", external_source_type)
        if linked_external_source is not None:
            _setter("linked_external_source", linked_external_source)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The detail describe of event source.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @event_bus_name.setter
    def event_bus_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_bus_name", value)

    @property
    @pulumi.getter(name="eventSourceName")
    def event_source_name(self) -> Optional[pulumi.Input[str]]:
        """
        The code name of event source.
        """
        return pulumi.get(self, "event_source_name")

    @event_source_name.setter
    def event_source_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_source_name", value)

    @property
    @pulumi.getter(name="externalSourceConfig")
    def external_source_config(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        The config of external source.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `VirtualHostName` - The virtual host name of RabbitMQ.
        `QueueName` - The queue name of RabbitMQ.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `Topic` - The topic of RabbitMQ.
        `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
        `GroupID` - The group ID of consumer.
        When `external_source_type` is `MNS`, The following attributes are supported:
        `QueueName` - The queue name of MNS.
        """
        return pulumi.get(self, "external_source_config")

    @external_source_config.setter
    def external_source_config(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "external_source_config", value)

    @property
    @pulumi.getter(name="externalSourceType")
    def external_source_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        """
        return pulumi.get(self, "external_source_type")

    @external_source_type.setter
    def external_source_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_source_type", value)

    @property
    @pulumi.getter(name="linkedExternalSource")
    def linked_external_source(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to connect to an external data source. Default value: `false`
        """
        return pulumi.get(self, "linked_external_source")

    @linked_external_source.setter
    def linked_external_source(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "linked_external_source", value)


class EventSource(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 event_source_name: Optional[pulumi.Input[str]] = None,
                 external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 external_source_type: Optional[pulumi.Input[str]] = None,
                 linked_external_source: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides a Event Bridge Event Source resource.

        For information about Event Bridge Event Source and how to use it, see [What is Event Source](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createeventsource).

        > **NOTE:** Available since v1.130.0.

        ## Import

        Event Bridge Event Source can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eventbridge/eventSource:EventSource example <event_source_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The detail describe of event source.
        :param pulumi.Input[str] event_bus_name: The name of event bus.
        :param pulumi.Input[str] event_source_name: The code name of event source.
        :param pulumi.Input[Mapping[str, Any]] external_source_config: The config of external source.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `VirtualHostName` - The virtual host name of RabbitMQ.
               `QueueName` - The queue name of RabbitMQ.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `Topic` - The topic of RabbitMQ.
               `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
               `GroupID` - The group ID of consumer.
               When `external_source_type` is `MNS`, The following attributes are supported:
               `QueueName` - The queue name of MNS.
        :param pulumi.Input[str] external_source_type: The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        :param pulumi.Input[bool] linked_external_source: Whether to connect to an external data source. Default value: `false`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EventSourceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Event Bridge Event Source resource.

        For information about Event Bridge Event Source and how to use it, see [What is Event Source](https://www.alibabacloud.com/help/en/eventbridge/latest/api-eventbridge-2020-04-01-createeventsource).

        > **NOTE:** Available since v1.130.0.

        ## Import

        Event Bridge Event Source can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:eventbridge/eventSource:EventSource example <event_source_name>
        ```

        :param str resource_name: The name of the resource.
        :param EventSourceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EventSourceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            EventSourceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 event_bus_name: Optional[pulumi.Input[str]] = None,
                 event_source_name: Optional[pulumi.Input[str]] = None,
                 external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 external_source_type: Optional[pulumi.Input[str]] = None,
                 linked_external_source: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EventSourceArgs.__new__(EventSourceArgs)

            __props__.__dict__["description"] = description
            if event_bus_name is None and not opts.urn:
                raise TypeError("Missing required property 'event_bus_name'")
            __props__.__dict__["event_bus_name"] = event_bus_name
            if event_source_name is None and not opts.urn:
                raise TypeError("Missing required property 'event_source_name'")
            __props__.__dict__["event_source_name"] = event_source_name
            __props__.__dict__["external_source_config"] = external_source_config
            __props__.__dict__["external_source_type"] = external_source_type
            __props__.__dict__["linked_external_source"] = linked_external_source
        super(EventSource, __self__).__init__(
            'alicloud:eventbridge/eventSource:EventSource',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            event_bus_name: Optional[pulumi.Input[str]] = None,
            event_source_name: Optional[pulumi.Input[str]] = None,
            external_source_config: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            external_source_type: Optional[pulumi.Input[str]] = None,
            linked_external_source: Optional[pulumi.Input[bool]] = None) -> 'EventSource':
        """
        Get an existing EventSource resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The detail describe of event source.
        :param pulumi.Input[str] event_bus_name: The name of event bus.
        :param pulumi.Input[str] event_source_name: The code name of event source.
        :param pulumi.Input[Mapping[str, Any]] external_source_config: The config of external source.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `VirtualHostName` - The virtual host name of RabbitMQ.
               `QueueName` - The queue name of RabbitMQ.
               When `external_source_type` is `RabbitMQ`, The following attributes are supported:
               `RegionId` - The region ID of RabbitMQ.
               `InstanceId` - The instance ID of RabbitMQ.
               `Topic` - The topic of RabbitMQ.
               `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
               `GroupID` - The group ID of consumer.
               When `external_source_type` is `MNS`, The following attributes are supported:
               `QueueName` - The queue name of MNS.
        :param pulumi.Input[str] external_source_type: The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        :param pulumi.Input[bool] linked_external_source: Whether to connect to an external data source. Default value: `false`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EventSourceState.__new__(_EventSourceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["event_bus_name"] = event_bus_name
        __props__.__dict__["event_source_name"] = event_source_name
        __props__.__dict__["external_source_config"] = external_source_config
        __props__.__dict__["external_source_type"] = external_source_type
        __props__.__dict__["linked_external_source"] = linked_external_source
        return EventSource(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The detail describe of event source.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="eventBusName")
    def event_bus_name(self) -> pulumi.Output[str]:
        """
        The name of event bus.
        """
        return pulumi.get(self, "event_bus_name")

    @property
    @pulumi.getter(name="eventSourceName")
    def event_source_name(self) -> pulumi.Output[str]:
        """
        The code name of event source.
        """
        return pulumi.get(self, "event_source_name")

    @property
    @pulumi.getter(name="externalSourceConfig")
    def external_source_config(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        The config of external source.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `VirtualHostName` - The virtual host name of RabbitMQ.
        `QueueName` - The queue name of RabbitMQ.
        When `external_source_type` is `RabbitMQ`, The following attributes are supported:
        `RegionId` - The region ID of RabbitMQ.
        `InstanceId` - The instance ID of RabbitMQ.
        `Topic` - The topic of RabbitMQ.
        `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
        `GroupID` - The group ID of consumer.
        When `external_source_type` is `MNS`, The following attributes are supported:
        `QueueName` - The queue name of MNS.
        """
        return pulumi.get(self, "external_source_config")

    @property
    @pulumi.getter(name="externalSourceType")
    def external_source_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linked_external_source` is `true`, This field is valid.
        """
        return pulumi.get(self, "external_source_type")

    @property
    @pulumi.getter(name="linkedExternalSource")
    def linked_external_source(self) -> pulumi.Output[bool]:
        """
        Whether to connect to an external data source. Default value: `false`
        """
        return pulumi.get(self, "linked_external_source")

