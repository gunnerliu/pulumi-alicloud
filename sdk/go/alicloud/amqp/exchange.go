// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package amqp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a RabbitMQ (AMQP) Exchange resource.
//
// For information about RabbitMQ (AMQP) Exchange and how to use it, see [What is Exchange](https://www.alibabacloud.com/help/en/message-queue-for-rabbitmq/latest/createexchange).
//
// > **NOTE:** Available since v1.128.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/amqp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultInstance, err := amqp.NewInstance(ctx, "defaultInstance", &amqp.InstanceArgs{
//				InstanceType:  pulumi.String("professional"),
//				MaxTps:        pulumi.String("1000"),
//				QueueCapacity: pulumi.String("50"),
//				SupportEip:    pulumi.Bool(true),
//				MaxEipTps:     pulumi.String("128"),
//				PaymentType:   pulumi.String("Subscription"),
//				Period:        pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			defaultVirtualHost, err := amqp.NewVirtualHost(ctx, "defaultVirtualHost", &amqp.VirtualHostArgs{
//				InstanceId:      defaultInstance.ID(),
//				VirtualHostName: pulumi.String("tf-example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = amqp.NewExchange(ctx, "defaultExchange", &amqp.ExchangeArgs{
//				AutoDeleteState: pulumi.Bool(false),
//				ExchangeName:    pulumi.String("tf-example"),
//				ExchangeType:    pulumi.String("DIRECT"),
//				InstanceId:      defaultInstance.ID(),
//				Internal:        pulumi.Bool(false),
//				VirtualHostName: defaultVirtualHost.VirtualHostName,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// RabbitMQ (AMQP) Exchange can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:amqp/exchange:Exchange example <instance_id>:<virtual_host_name>:<exchange_name>
//
// ```
type Exchange struct {
	pulumi.CustomResourceState

	// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
	AlternateExchange pulumi.StringPtrOutput `pulumi:"alternateExchange"`
	// Specifies whether the Auto Delete attribute is configured. Valid values:
	// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
	// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
	AutoDeleteState pulumi.BoolOutput `pulumi:"autoDeleteState"`
	// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
	ExchangeName pulumi.StringOutput `pulumi:"exchangeName"`
	// The type of the exchange. Valid values:
	// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
	// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
	// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
	// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
	//   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
	//   when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
	//   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
	ExchangeType pulumi.StringOutput `pulumi:"exchangeType"`
	// The ID of the instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Specifies whether an exchange is an internal exchange. Valid values:
	// * false: The exchange is not an internal exchange.
	// * true: The exchange is an internal exchange.
	Internal pulumi.BoolOutput `pulumi:"internal"`
	// The name of virtual host where an exchange resides.
	VirtualHostName pulumi.StringOutput `pulumi:"virtualHostName"`
}

// NewExchange registers a new resource with the given unique name, arguments, and options.
func NewExchange(ctx *pulumi.Context,
	name string, args *ExchangeArgs, opts ...pulumi.ResourceOption) (*Exchange, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AutoDeleteState == nil {
		return nil, errors.New("invalid value for required argument 'AutoDeleteState'")
	}
	if args.ExchangeName == nil {
		return nil, errors.New("invalid value for required argument 'ExchangeName'")
	}
	if args.ExchangeType == nil {
		return nil, errors.New("invalid value for required argument 'ExchangeType'")
	}
	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Internal == nil {
		return nil, errors.New("invalid value for required argument 'Internal'")
	}
	if args.VirtualHostName == nil {
		return nil, errors.New("invalid value for required argument 'VirtualHostName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Exchange
	err := ctx.RegisterResource("alicloud:amqp/exchange:Exchange", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExchange gets an existing Exchange resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExchange(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExchangeState, opts ...pulumi.ResourceOption) (*Exchange, error) {
	var resource Exchange
	err := ctx.ReadResource("alicloud:amqp/exchange:Exchange", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Exchange resources.
type exchangeState struct {
	// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
	AlternateExchange *string `pulumi:"alternateExchange"`
	// Specifies whether the Auto Delete attribute is configured. Valid values:
	// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
	// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
	AutoDeleteState *bool `pulumi:"autoDeleteState"`
	// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
	ExchangeName *string `pulumi:"exchangeName"`
	// The type of the exchange. Valid values:
	// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
	// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
	// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
	// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
	//   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
	//   when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
	//   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
	ExchangeType *string `pulumi:"exchangeType"`
	// The ID of the instance.
	InstanceId *string `pulumi:"instanceId"`
	// Specifies whether an exchange is an internal exchange. Valid values:
	// * false: The exchange is not an internal exchange.
	// * true: The exchange is an internal exchange.
	Internal *bool `pulumi:"internal"`
	// The name of virtual host where an exchange resides.
	VirtualHostName *string `pulumi:"virtualHostName"`
}

type ExchangeState struct {
	// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
	AlternateExchange pulumi.StringPtrInput
	// Specifies whether the Auto Delete attribute is configured. Valid values:
	// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
	// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
	AutoDeleteState pulumi.BoolPtrInput
	// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
	ExchangeName pulumi.StringPtrInput
	// The type of the exchange. Valid values:
	// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
	// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
	// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
	// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
	//   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
	//   when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
	//   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
	ExchangeType pulumi.StringPtrInput
	// The ID of the instance.
	InstanceId pulumi.StringPtrInput
	// Specifies whether an exchange is an internal exchange. Valid values:
	// * false: The exchange is not an internal exchange.
	// * true: The exchange is an internal exchange.
	Internal pulumi.BoolPtrInput
	// The name of virtual host where an exchange resides.
	VirtualHostName pulumi.StringPtrInput
}

func (ExchangeState) ElementType() reflect.Type {
	return reflect.TypeOf((*exchangeState)(nil)).Elem()
}

type exchangeArgs struct {
	// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
	AlternateExchange *string `pulumi:"alternateExchange"`
	// Specifies whether the Auto Delete attribute is configured. Valid values:
	// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
	// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
	AutoDeleteState bool `pulumi:"autoDeleteState"`
	// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
	ExchangeName string `pulumi:"exchangeName"`
	// The type of the exchange. Valid values:
	// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
	// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
	// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
	// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
	//   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
	//   when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
	//   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
	ExchangeType string `pulumi:"exchangeType"`
	// The ID of the instance.
	InstanceId string `pulumi:"instanceId"`
	// Specifies whether an exchange is an internal exchange. Valid values:
	// * false: The exchange is not an internal exchange.
	// * true: The exchange is an internal exchange.
	Internal bool `pulumi:"internal"`
	// The name of virtual host where an exchange resides.
	VirtualHostName string `pulumi:"virtualHostName"`
}

// The set of arguments for constructing a Exchange resource.
type ExchangeArgs struct {
	// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
	AlternateExchange pulumi.StringPtrInput
	// Specifies whether the Auto Delete attribute is configured. Valid values:
	// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
	// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
	AutoDeleteState pulumi.BoolInput
	// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
	ExchangeName pulumi.StringInput
	// The type of the exchange. Valid values:
	// * FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
	// * DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
	// * TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
	// * HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
	//   When binding Headers Exchange and Queue, set the key-value pair of the binding property;
	//   when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
	//   The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
	ExchangeType pulumi.StringInput
	// The ID of the instance.
	InstanceId pulumi.StringInput
	// Specifies whether an exchange is an internal exchange. Valid values:
	// * false: The exchange is not an internal exchange.
	// * true: The exchange is an internal exchange.
	Internal pulumi.BoolInput
	// The name of virtual host where an exchange resides.
	VirtualHostName pulumi.StringInput
}

func (ExchangeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*exchangeArgs)(nil)).Elem()
}

type ExchangeInput interface {
	pulumi.Input

	ToExchangeOutput() ExchangeOutput
	ToExchangeOutputWithContext(ctx context.Context) ExchangeOutput
}

func (*Exchange) ElementType() reflect.Type {
	return reflect.TypeOf((**Exchange)(nil)).Elem()
}

func (i *Exchange) ToExchangeOutput() ExchangeOutput {
	return i.ToExchangeOutputWithContext(context.Background())
}

func (i *Exchange) ToExchangeOutputWithContext(ctx context.Context) ExchangeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExchangeOutput)
}

// ExchangeArrayInput is an input type that accepts ExchangeArray and ExchangeArrayOutput values.
// You can construct a concrete instance of `ExchangeArrayInput` via:
//
//	ExchangeArray{ ExchangeArgs{...} }
type ExchangeArrayInput interface {
	pulumi.Input

	ToExchangeArrayOutput() ExchangeArrayOutput
	ToExchangeArrayOutputWithContext(context.Context) ExchangeArrayOutput
}

type ExchangeArray []ExchangeInput

func (ExchangeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Exchange)(nil)).Elem()
}

func (i ExchangeArray) ToExchangeArrayOutput() ExchangeArrayOutput {
	return i.ToExchangeArrayOutputWithContext(context.Background())
}

func (i ExchangeArray) ToExchangeArrayOutputWithContext(ctx context.Context) ExchangeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExchangeArrayOutput)
}

// ExchangeMapInput is an input type that accepts ExchangeMap and ExchangeMapOutput values.
// You can construct a concrete instance of `ExchangeMapInput` via:
//
//	ExchangeMap{ "key": ExchangeArgs{...} }
type ExchangeMapInput interface {
	pulumi.Input

	ToExchangeMapOutput() ExchangeMapOutput
	ToExchangeMapOutputWithContext(context.Context) ExchangeMapOutput
}

type ExchangeMap map[string]ExchangeInput

func (ExchangeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Exchange)(nil)).Elem()
}

func (i ExchangeMap) ToExchangeMapOutput() ExchangeMapOutput {
	return i.ToExchangeMapOutputWithContext(context.Background())
}

func (i ExchangeMap) ToExchangeMapOutputWithContext(ctx context.Context) ExchangeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExchangeMapOutput)
}

type ExchangeOutput struct{ *pulumi.OutputState }

func (ExchangeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Exchange)(nil)).Elem()
}

func (o ExchangeOutput) ToExchangeOutput() ExchangeOutput {
	return o
}

func (o ExchangeOutput) ToExchangeOutputWithContext(ctx context.Context) ExchangeOutput {
	return o
}

// The alternate exchange. An alternate exchange is configured for an existing exchange. It is used to receive messages that fail to be routed to queues from the existing exchange.
func (o ExchangeOutput) AlternateExchange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Exchange) pulumi.StringPtrOutput { return v.AlternateExchange }).(pulumi.StringPtrOutput)
}

// Specifies whether the Auto Delete attribute is configured. Valid values:
// * true: The Auto Delete attribute is configured. If the last queue that is bound to an exchange is unbound, the exchange is automatically deleted.
// * false: The Auto Delete attribute is not configured. If the last queue that is bound to an exchange is unbound, the exchange is not automatically deleted.
func (o ExchangeOutput) AutoDeleteState() pulumi.BoolOutput {
	return o.ApplyT(func(v *Exchange) pulumi.BoolOutput { return v.AutoDeleteState }).(pulumi.BoolOutput)
}

// The name of the exchange. It must be 1 to 255 characters in length, and can contain only letters, digits, hyphens (-), underscores (_), periods (.), and at signs (@).
func (o ExchangeOutput) ExchangeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Exchange) pulumi.StringOutput { return v.ExchangeName }).(pulumi.StringOutput)
}

// The type of the exchange. Valid values:
//   - FANOUT: An exchange of this type routes all the received messages to all the queues bound to this exchange. You can use a fanout exchange to broadcast messages.
//   - DIRECT: An exchange of this type routes a message to the queue whose binding key is exactly the same as the routing key of the message.
//   - TOPIC: This type is similar to the direct exchange type. An exchange of this type routes a message to one or more queues based on the fuzzy match or multi-condition match result between the routing key of the message and the binding keys of the current exchange.
//   - HEADERS: Headers Exchange uses the Headers property instead of Routing Key for routing matching.
//     When binding Headers Exchange and Queue, set the key-value pair of the binding property;
//     when sending a message to the Headers Exchange, set the message's Headers property key-value pair and use the message Headers
//     The message is routed to the bound Queue by comparing the attribute key-value pair and the bound attribute key-value pair.
func (o ExchangeOutput) ExchangeType() pulumi.StringOutput {
	return o.ApplyT(func(v *Exchange) pulumi.StringOutput { return v.ExchangeType }).(pulumi.StringOutput)
}

// The ID of the instance.
func (o ExchangeOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Exchange) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Specifies whether an exchange is an internal exchange. Valid values:
// * false: The exchange is not an internal exchange.
// * true: The exchange is an internal exchange.
func (o ExchangeOutput) Internal() pulumi.BoolOutput {
	return o.ApplyT(func(v *Exchange) pulumi.BoolOutput { return v.Internal }).(pulumi.BoolOutput)
}

// The name of virtual host where an exchange resides.
func (o ExchangeOutput) VirtualHostName() pulumi.StringOutput {
	return o.ApplyT(func(v *Exchange) pulumi.StringOutput { return v.VirtualHostName }).(pulumi.StringOutput)
}

type ExchangeArrayOutput struct{ *pulumi.OutputState }

func (ExchangeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Exchange)(nil)).Elem()
}

func (o ExchangeArrayOutput) ToExchangeArrayOutput() ExchangeArrayOutput {
	return o
}

func (o ExchangeArrayOutput) ToExchangeArrayOutputWithContext(ctx context.Context) ExchangeArrayOutput {
	return o
}

func (o ExchangeArrayOutput) Index(i pulumi.IntInput) ExchangeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Exchange {
		return vs[0].([]*Exchange)[vs[1].(int)]
	}).(ExchangeOutput)
}

type ExchangeMapOutput struct{ *pulumi.OutputState }

func (ExchangeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Exchange)(nil)).Elem()
}

func (o ExchangeMapOutput) ToExchangeMapOutput() ExchangeMapOutput {
	return o
}

func (o ExchangeMapOutput) ToExchangeMapOutputWithContext(ctx context.Context) ExchangeMapOutput {
	return o
}

func (o ExchangeMapOutput) MapIndex(k pulumi.StringInput) ExchangeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Exchange {
		return vs[0].(map[string]*Exchange)[vs[1].(string)]
	}).(ExchangeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExchangeInput)(nil)).Elem(), &Exchange{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExchangeArrayInput)(nil)).Elem(), ExchangeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExchangeMapInput)(nil)).Elem(), ExchangeMap{})
	pulumi.RegisterOutputType(ExchangeOutput{})
	pulumi.RegisterOutputType(ExchangeArrayOutput{})
	pulumi.RegisterOutputType(ExchangeMapOutput{})
}
