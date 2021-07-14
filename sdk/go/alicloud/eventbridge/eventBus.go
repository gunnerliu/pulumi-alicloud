// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type EventBus struct {
	pulumi.CustomResourceState

	Description  pulumi.StringPtrOutput `pulumi:"description"`
	EventBusName pulumi.StringOutput    `pulumi:"eventBusName"`
}

// NewEventBus registers a new resource with the given unique name, arguments, and options.
func NewEventBus(ctx *pulumi.Context,
	name string, args *EventBusArgs, opts ...pulumi.ResourceOption) (*EventBus, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventBusName == nil {
		return nil, errors.New("invalid value for required argument 'EventBusName'")
	}
	var resource EventBus
	err := ctx.RegisterResource("alicloud:eventbridge/eventBus:EventBus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEventBus gets an existing EventBus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEventBus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EventBusState, opts ...pulumi.ResourceOption) (*EventBus, error) {
	var resource EventBus
	err := ctx.ReadResource("alicloud:eventbridge/eventBus:EventBus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EventBus resources.
type eventBusState struct {
	Description  *string `pulumi:"description"`
	EventBusName *string `pulumi:"eventBusName"`
}

type EventBusState struct {
	Description  pulumi.StringPtrInput
	EventBusName pulumi.StringPtrInput
}

func (EventBusState) ElementType() reflect.Type {
	return reflect.TypeOf((*eventBusState)(nil)).Elem()
}

type eventBusArgs struct {
	Description  *string `pulumi:"description"`
	EventBusName string  `pulumi:"eventBusName"`
}

// The set of arguments for constructing a EventBus resource.
type EventBusArgs struct {
	Description  pulumi.StringPtrInput
	EventBusName pulumi.StringInput
}

func (EventBusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eventBusArgs)(nil)).Elem()
}

type EventBusInput interface {
	pulumi.Input

	ToEventBusOutput() EventBusOutput
	ToEventBusOutputWithContext(ctx context.Context) EventBusOutput
}

func (*EventBus) ElementType() reflect.Type {
	return reflect.TypeOf((*EventBus)(nil))
}

func (i *EventBus) ToEventBusOutput() EventBusOutput {
	return i.ToEventBusOutputWithContext(context.Background())
}

func (i *EventBus) ToEventBusOutputWithContext(ctx context.Context) EventBusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusOutput)
}

func (i *EventBus) ToEventBusPtrOutput() EventBusPtrOutput {
	return i.ToEventBusPtrOutputWithContext(context.Background())
}

func (i *EventBus) ToEventBusPtrOutputWithContext(ctx context.Context) EventBusPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusPtrOutput)
}

type EventBusPtrInput interface {
	pulumi.Input

	ToEventBusPtrOutput() EventBusPtrOutput
	ToEventBusPtrOutputWithContext(ctx context.Context) EventBusPtrOutput
}

type eventBusPtrType EventBusArgs

func (*eventBusPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**EventBus)(nil))
}

func (i *eventBusPtrType) ToEventBusPtrOutput() EventBusPtrOutput {
	return i.ToEventBusPtrOutputWithContext(context.Background())
}

func (i *eventBusPtrType) ToEventBusPtrOutputWithContext(ctx context.Context) EventBusPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusPtrOutput)
}

// EventBusArrayInput is an input type that accepts EventBusArray and EventBusArrayOutput values.
// You can construct a concrete instance of `EventBusArrayInput` via:
//
//          EventBusArray{ EventBusArgs{...} }
type EventBusArrayInput interface {
	pulumi.Input

	ToEventBusArrayOutput() EventBusArrayOutput
	ToEventBusArrayOutputWithContext(context.Context) EventBusArrayOutput
}

type EventBusArray []EventBusInput

func (EventBusArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*EventBus)(nil))
}

func (i EventBusArray) ToEventBusArrayOutput() EventBusArrayOutput {
	return i.ToEventBusArrayOutputWithContext(context.Background())
}

func (i EventBusArray) ToEventBusArrayOutputWithContext(ctx context.Context) EventBusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusArrayOutput)
}

// EventBusMapInput is an input type that accepts EventBusMap and EventBusMapOutput values.
// You can construct a concrete instance of `EventBusMapInput` via:
//
//          EventBusMap{ "key": EventBusArgs{...} }
type EventBusMapInput interface {
	pulumi.Input

	ToEventBusMapOutput() EventBusMapOutput
	ToEventBusMapOutputWithContext(context.Context) EventBusMapOutput
}

type EventBusMap map[string]EventBusInput

func (EventBusMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*EventBus)(nil))
}

func (i EventBusMap) ToEventBusMapOutput() EventBusMapOutput {
	return i.ToEventBusMapOutputWithContext(context.Background())
}

func (i EventBusMap) ToEventBusMapOutputWithContext(ctx context.Context) EventBusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EventBusMapOutput)
}

type EventBusOutput struct {
	*pulumi.OutputState
}

func (EventBusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EventBus)(nil))
}

func (o EventBusOutput) ToEventBusOutput() EventBusOutput {
	return o
}

func (o EventBusOutput) ToEventBusOutputWithContext(ctx context.Context) EventBusOutput {
	return o
}

func (o EventBusOutput) ToEventBusPtrOutput() EventBusPtrOutput {
	return o.ToEventBusPtrOutputWithContext(context.Background())
}

func (o EventBusOutput) ToEventBusPtrOutputWithContext(ctx context.Context) EventBusPtrOutput {
	return o.ApplyT(func(v EventBus) *EventBus {
		return &v
	}).(EventBusPtrOutput)
}

type EventBusPtrOutput struct {
	*pulumi.OutputState
}

func (EventBusPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EventBus)(nil))
}

func (o EventBusPtrOutput) ToEventBusPtrOutput() EventBusPtrOutput {
	return o
}

func (o EventBusPtrOutput) ToEventBusPtrOutputWithContext(ctx context.Context) EventBusPtrOutput {
	return o
}

type EventBusArrayOutput struct{ *pulumi.OutputState }

func (EventBusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]EventBus)(nil))
}

func (o EventBusArrayOutput) ToEventBusArrayOutput() EventBusArrayOutput {
	return o
}

func (o EventBusArrayOutput) ToEventBusArrayOutputWithContext(ctx context.Context) EventBusArrayOutput {
	return o
}

func (o EventBusArrayOutput) Index(i pulumi.IntInput) EventBusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) EventBus {
		return vs[0].([]EventBus)[vs[1].(int)]
	}).(EventBusOutput)
}

type EventBusMapOutput struct{ *pulumi.OutputState }

func (EventBusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]EventBus)(nil))
}

func (o EventBusMapOutput) ToEventBusMapOutput() EventBusMapOutput {
	return o
}

func (o EventBusMapOutput) ToEventBusMapOutputWithContext(ctx context.Context) EventBusMapOutput {
	return o
}

func (o EventBusMapOutput) MapIndex(k pulumi.StringInput) EventBusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) EventBus {
		return vs[0].(map[string]EventBus)[vs[1].(string)]
	}).(EventBusOutput)
}

func init() {
	pulumi.RegisterOutputType(EventBusOutput{})
	pulumi.RegisterOutputType(EventBusPtrOutput{})
	pulumi.RegisterOutputType(EventBusArrayOutput{})
	pulumi.RegisterOutputType(EventBusMapOutput{})
}
