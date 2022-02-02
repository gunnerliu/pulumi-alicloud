// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Event Bridge Event Source resource.
//
// For information about Event Bridge Event Source and how to use it, see [What is Event Source](https://www.alibabacloud.com/help/doc-detail/188425.htm).
//
// > **NOTE:** Available in v1.130.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/eventbridge"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := eventbridge.NewEventSource(ctx, "example", &eventbridge.EventSourceArgs{
// 			Description:     pulumi.String("tf-test"),
// 			EventBusName:    pulumi.String("bus_name"),
// 			EventSourceName: pulumi.String("tftest"),
// 			ExternalSourceConfig: pulumi.AnyMap{
// 				"QueueName": pulumi.Any("mns_queuqe_name"),
// 			},
// 			ExternalSourceType:   pulumi.String("MNS"),
// 			LinkedExternalSource: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Event Bridge Event Source can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:eventbridge/eventSource:EventSource example <event_source_name>
// ```
type EventSource struct {
	pulumi.CustomResourceState

	// The detail describe of event source.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of event bus.
	EventBusName pulumi.StringOutput `pulumi:"eventBusName"`
	// The code name of event source.
	EventSourceName pulumi.StringOutput `pulumi:"eventSourceName"`
	// The config of external source.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `VirtualHostName` - The virtual host name of RabbitMQ.
	// `QueueName` - The queue name of RabbitMQ.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `Topic` - The topic of RabbitMQ.
	// `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
	// `GroupID` - The group ID of consumer.
	// When `externalSourceType` is `MNS`, The following attributes are supported:
	// `QueueName` - The queue name of MNS.
	ExternalSourceConfig pulumi.MapOutput `pulumi:"externalSourceConfig"`
	// The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linkedExternalSource` is `true`, This field is valid.
	ExternalSourceType pulumi.StringPtrOutput `pulumi:"externalSourceType"`
	// Whether to connect to an external data source. Default value: `false`
	LinkedExternalSource pulumi.BoolOutput `pulumi:"linkedExternalSource"`
}

// NewEventSource registers a new resource with the given unique name, arguments, and options.
func NewEventSource(ctx *pulumi.Context,
	name string, args *EventSourceArgs, opts ...pulumi.ResourceOption) (*EventSource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventBusName == nil {
		return nil, errors.New("invalid value for required argument 'EventBusName'")
	}
	if args.EventSourceName == nil {
		return nil, errors.New("invalid value for required argument 'EventSourceName'")
	}
	var resource EventSource
	err := ctx.RegisterResource("alicloud:eventbridge/eventSource:EventSource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventSource gets an existing EventSource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventSource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventSourceState, opts ...pulumi.ResourceOption) (*EventSource, error) {
	var resource EventSource
	err := ctx.ReadResource("alicloud:eventbridge/eventSource:EventSource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventSource resources.
type eventSourceState struct {
	// The detail describe of event source.
	Description *string `pulumi:"description"`
	// The name of event bus.
	EventBusName *string `pulumi:"eventBusName"`
	// The code name of event source.
	EventSourceName *string `pulumi:"eventSourceName"`
	// The config of external source.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `VirtualHostName` - The virtual host name of RabbitMQ.
	// `QueueName` - The queue name of RabbitMQ.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `Topic` - The topic of RabbitMQ.
	// `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
	// `GroupID` - The group ID of consumer.
	// When `externalSourceType` is `MNS`, The following attributes are supported:
	// `QueueName` - The queue name of MNS.
	ExternalSourceConfig map[string]interface{} `pulumi:"externalSourceConfig"`
	// The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linkedExternalSource` is `true`, This field is valid.
	ExternalSourceType *string `pulumi:"externalSourceType"`
	// Whether to connect to an external data source. Default value: `false`
	LinkedExternalSource *bool `pulumi:"linkedExternalSource"`
}

type EventSourceState struct {
	// The detail describe of event source.
	Description pulumi.StringPtrInput
	// The name of event bus.
	EventBusName pulumi.StringPtrInput
	// The code name of event source.
	EventSourceName pulumi.StringPtrInput
	// The config of external source.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `VirtualHostName` - The virtual host name of RabbitMQ.
	// `QueueName` - The queue name of RabbitMQ.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `Topic` - The topic of RabbitMQ.
	// `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
	// `GroupID` - The group ID of consumer.
	// When `externalSourceType` is `MNS`, The following attributes are supported:
	// `QueueName` - The queue name of MNS.
	ExternalSourceConfig pulumi.MapInput
	// The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linkedExternalSource` is `true`, This field is valid.
	ExternalSourceType pulumi.StringPtrInput
	// Whether to connect to an external data source. Default value: `false`
	LinkedExternalSource pulumi.BoolPtrInput
}

func (EventSourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventSourceState)(nil)).Elem()
}

type eventSourceArgs struct {
	// The detail describe of event source.
	Description *string `pulumi:"description"`
	// The name of event bus.
	EventBusName string `pulumi:"eventBusName"`
	// The code name of event source.
	EventSourceName string `pulumi:"eventSourceName"`
	// The config of external source.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `VirtualHostName` - The virtual host name of RabbitMQ.
	// `QueueName` - The queue name of RabbitMQ.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `Topic` - The topic of RabbitMQ.
	// `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
	// `GroupID` - The group ID of consumer.
	// When `externalSourceType` is `MNS`, The following attributes are supported:
	// `QueueName` - The queue name of MNS.
	ExternalSourceConfig map[string]interface{} `pulumi:"externalSourceConfig"`
	// The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linkedExternalSource` is `true`, This field is valid.
	ExternalSourceType *string `pulumi:"externalSourceType"`
	// Whether to connect to an external data source. Default value: `false`
	LinkedExternalSource *bool `pulumi:"linkedExternalSource"`
}

// The set of arguments for constructing a EventSource resource.
type EventSourceArgs struct {
	// The detail describe of event source.
	Description pulumi.StringPtrInput
	// The name of event bus.
	EventBusName pulumi.StringInput
	// The code name of event source.
	EventSourceName pulumi.StringInput
	// The config of external source.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `VirtualHostName` - The virtual host name of RabbitMQ.
	// `QueueName` - The queue name of RabbitMQ.
	// When `externalSourceType` is `RabbitMQ`, The following attributes are supported:
	// `RegionId` - The region ID of RabbitMQ.
	// `InstanceId` - The instance ID of RabbitMQ.
	// `Topic` - The topic of RabbitMQ.
	// `Offset` -  The offset of RabbitMQ, valid values: `CONSUME_FROM_FIRST_OFFSET`, `CONSUME_FROM_LAST_OFFSET` and `CONSUME_FROM_TIMESTAMP`.
	// `GroupID` - The group ID of consumer.
	// When `externalSourceType` is `MNS`, The following attributes are supported:
	// `QueueName` - The queue name of MNS.
	ExternalSourceConfig pulumi.MapInput
	// The type of external data source. Valid value : `RabbitMQ`, `RocketMQ` and `MNS`. **NOTE:** Only When `linkedExternalSource` is `true`, This field is valid.
	ExternalSourceType pulumi.StringPtrInput
	// Whether to connect to an external data source. Default value: `false`
	LinkedExternalSource pulumi.BoolPtrInput
}

func (EventSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventSourceArgs)(nil)).Elem()
}

type EventSourceInput interface {
	pulumi.Input

	ToEventSourceOutput() EventSourceOutput
	ToEventSourceOutputWithContext(ctx context.Context) EventSourceOutput
}

func (*EventSource) ElementType() reflect.Type {
	return reflect.TypeOf((**EventSource)(nil)).Elem()
}

func (i *EventSource) ToEventSourceOutput() EventSourceOutput {
	return i.ToEventSourceOutputWithContext(context.Background())
}

func (i *EventSource) ToEventSourceOutputWithContext(ctx context.Context) EventSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSourceOutput)
}

// EventSourceArrayInput is an input type that accepts EventSourceArray and EventSourceArrayOutput values.
// You can construct a concrete instance of `EventSourceArrayInput` via:
//
//          EventSourceArray{ EventSourceArgs{...} }
type EventSourceArrayInput interface {
	pulumi.Input

	ToEventSourceArrayOutput() EventSourceArrayOutput
	ToEventSourceArrayOutputWithContext(context.Context) EventSourceArrayOutput
}

type EventSourceArray []EventSourceInput

func (EventSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventSource)(nil)).Elem()
}

func (i EventSourceArray) ToEventSourceArrayOutput() EventSourceArrayOutput {
	return i.ToEventSourceArrayOutputWithContext(context.Background())
}

func (i EventSourceArray) ToEventSourceArrayOutputWithContext(ctx context.Context) EventSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSourceArrayOutput)
}

// EventSourceMapInput is an input type that accepts EventSourceMap and EventSourceMapOutput values.
// You can construct a concrete instance of `EventSourceMapInput` via:
//
//          EventSourceMap{ "key": EventSourceArgs{...} }
type EventSourceMapInput interface {
	pulumi.Input

	ToEventSourceMapOutput() EventSourceMapOutput
	ToEventSourceMapOutputWithContext(context.Context) EventSourceMapOutput
}

type EventSourceMap map[string]EventSourceInput

func (EventSourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventSource)(nil)).Elem()
}

func (i EventSourceMap) ToEventSourceMapOutput() EventSourceMapOutput {
	return i.ToEventSourceMapOutputWithContext(context.Background())
}

func (i EventSourceMap) ToEventSourceMapOutputWithContext(ctx context.Context) EventSourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventSourceMapOutput)
}

type EventSourceOutput struct{ *pulumi.OutputState }

func (EventSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventSource)(nil)).Elem()
}

func (o EventSourceOutput) ToEventSourceOutput() EventSourceOutput {
	return o
}

func (o EventSourceOutput) ToEventSourceOutputWithContext(ctx context.Context) EventSourceOutput {
	return o
}

type EventSourceArrayOutput struct{ *pulumi.OutputState }

func (EventSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EventSource)(nil)).Elem()
}

func (o EventSourceArrayOutput) ToEventSourceArrayOutput() EventSourceArrayOutput {
	return o
}

func (o EventSourceArrayOutput) ToEventSourceArrayOutputWithContext(ctx context.Context) EventSourceArrayOutput {
	return o
}

func (o EventSourceArrayOutput) Index(i pulumi.IntInput) EventSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EventSource {
		return vs[0].([]*EventSource)[vs[1].(int)]
	}).(EventSourceOutput)
}

type EventSourceMapOutput struct{ *pulumi.OutputState }

func (EventSourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EventSource)(nil)).Elem()
}

func (o EventSourceMapOutput) ToEventSourceMapOutput() EventSourceMapOutput {
	return o
}

func (o EventSourceMapOutput) ToEventSourceMapOutputWithContext(ctx context.Context) EventSourceMapOutput {
	return o
}

func (o EventSourceMapOutput) MapIndex(k pulumi.StringInput) EventSourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EventSource {
		return vs[0].(map[string]*EventSource)[vs[1].(string)]
	}).(EventSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EventSourceInput)(nil)).Elem(), &EventSource{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventSourceArrayInput)(nil)).Elem(), EventSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EventSourceMapInput)(nil)).Elem(), EventSourceMap{})
	pulumi.RegisterOutputType(EventSourceOutput{})
	pulumi.RegisterOutputType(EventSourceArrayOutput{})
	pulumi.RegisterOutputType(EventSourceMapOutput{})
}
