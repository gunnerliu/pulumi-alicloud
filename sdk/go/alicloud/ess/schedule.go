// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Schedule struct {
	pulumi.CustomResourceState

	Description          pulumi.StringOutput    `pulumi:"description"`
	DesiredCapacity      pulumi.IntPtrOutput    `pulumi:"desiredCapacity"`
	LaunchExpirationTime pulumi.IntPtrOutput    `pulumi:"launchExpirationTime"`
	LaunchTime           pulumi.StringPtrOutput `pulumi:"launchTime"`
	MaxValue             pulumi.IntPtrOutput    `pulumi:"maxValue"`
	MinValue             pulumi.IntPtrOutput    `pulumi:"minValue"`
	RecurrenceEndTime    pulumi.StringOutput    `pulumi:"recurrenceEndTime"`
	RecurrenceType       pulumi.StringOutput    `pulumi:"recurrenceType"`
	RecurrenceValue      pulumi.StringOutput    `pulumi:"recurrenceValue"`
	ScalingGroupId       pulumi.StringOutput    `pulumi:"scalingGroupId"`
	ScheduledAction      pulumi.StringPtrOutput `pulumi:"scheduledAction"`
	ScheduledTaskName    pulumi.StringPtrOutput `pulumi:"scheduledTaskName"`
	TaskEnabled          pulumi.BoolPtrOutput   `pulumi:"taskEnabled"`
}

// NewSchedule registers a new resource with the given unique name, arguments, and options.
func NewSchedule(ctx *pulumi.Context,
	name string, args *ScheduleArgs, opts ...pulumi.ResourceOption) (*Schedule, error) {
	if args == nil {
		args = &ScheduleArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Schedule
	err := ctx.RegisterResource("alicloud:ess/schedule:Schedule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchedule gets an existing Schedule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchedule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduleState, opts ...pulumi.ResourceOption) (*Schedule, error) {
	var resource Schedule
	err := ctx.ReadResource("alicloud:ess/schedule:Schedule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schedule resources.
type scheduleState struct {
	Description          *string `pulumi:"description"`
	DesiredCapacity      *int    `pulumi:"desiredCapacity"`
	LaunchExpirationTime *int    `pulumi:"launchExpirationTime"`
	LaunchTime           *string `pulumi:"launchTime"`
	MaxValue             *int    `pulumi:"maxValue"`
	MinValue             *int    `pulumi:"minValue"`
	RecurrenceEndTime    *string `pulumi:"recurrenceEndTime"`
	RecurrenceType       *string `pulumi:"recurrenceType"`
	RecurrenceValue      *string `pulumi:"recurrenceValue"`
	ScalingGroupId       *string `pulumi:"scalingGroupId"`
	ScheduledAction      *string `pulumi:"scheduledAction"`
	ScheduledTaskName    *string `pulumi:"scheduledTaskName"`
	TaskEnabled          *bool   `pulumi:"taskEnabled"`
}

type ScheduleState struct {
	Description          pulumi.StringPtrInput
	DesiredCapacity      pulumi.IntPtrInput
	LaunchExpirationTime pulumi.IntPtrInput
	LaunchTime           pulumi.StringPtrInput
	MaxValue             pulumi.IntPtrInput
	MinValue             pulumi.IntPtrInput
	RecurrenceEndTime    pulumi.StringPtrInput
	RecurrenceType       pulumi.StringPtrInput
	RecurrenceValue      pulumi.StringPtrInput
	ScalingGroupId       pulumi.StringPtrInput
	ScheduledAction      pulumi.StringPtrInput
	ScheduledTaskName    pulumi.StringPtrInput
	TaskEnabled          pulumi.BoolPtrInput
}

func (ScheduleState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleState)(nil)).Elem()
}

type scheduleArgs struct {
	Description          *string `pulumi:"description"`
	DesiredCapacity      *int    `pulumi:"desiredCapacity"`
	LaunchExpirationTime *int    `pulumi:"launchExpirationTime"`
	LaunchTime           *string `pulumi:"launchTime"`
	MaxValue             *int    `pulumi:"maxValue"`
	MinValue             *int    `pulumi:"minValue"`
	RecurrenceEndTime    *string `pulumi:"recurrenceEndTime"`
	RecurrenceType       *string `pulumi:"recurrenceType"`
	RecurrenceValue      *string `pulumi:"recurrenceValue"`
	ScalingGroupId       *string `pulumi:"scalingGroupId"`
	ScheduledAction      *string `pulumi:"scheduledAction"`
	ScheduledTaskName    *string `pulumi:"scheduledTaskName"`
	TaskEnabled          *bool   `pulumi:"taskEnabled"`
}

// The set of arguments for constructing a Schedule resource.
type ScheduleArgs struct {
	Description          pulumi.StringPtrInput
	DesiredCapacity      pulumi.IntPtrInput
	LaunchExpirationTime pulumi.IntPtrInput
	LaunchTime           pulumi.StringPtrInput
	MaxValue             pulumi.IntPtrInput
	MinValue             pulumi.IntPtrInput
	RecurrenceEndTime    pulumi.StringPtrInput
	RecurrenceType       pulumi.StringPtrInput
	RecurrenceValue      pulumi.StringPtrInput
	ScalingGroupId       pulumi.StringPtrInput
	ScheduledAction      pulumi.StringPtrInput
	ScheduledTaskName    pulumi.StringPtrInput
	TaskEnabled          pulumi.BoolPtrInput
}

func (ScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleArgs)(nil)).Elem()
}

type ScheduleInput interface {
	pulumi.Input

	ToScheduleOutput() ScheduleOutput
	ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput
}

func (*Schedule) ElementType() reflect.Type {
	return reflect.TypeOf((**Schedule)(nil)).Elem()
}

func (i *Schedule) ToScheduleOutput() ScheduleOutput {
	return i.ToScheduleOutputWithContext(context.Background())
}

func (i *Schedule) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleOutput)
}

// ScheduleArrayInput is an input type that accepts ScheduleArray and ScheduleArrayOutput values.
// You can construct a concrete instance of `ScheduleArrayInput` via:
//
//	ScheduleArray{ ScheduleArgs{...} }
type ScheduleArrayInput interface {
	pulumi.Input

	ToScheduleArrayOutput() ScheduleArrayOutput
	ToScheduleArrayOutputWithContext(context.Context) ScheduleArrayOutput
}

type ScheduleArray []ScheduleInput

func (ScheduleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schedule)(nil)).Elem()
}

func (i ScheduleArray) ToScheduleArrayOutput() ScheduleArrayOutput {
	return i.ToScheduleArrayOutputWithContext(context.Background())
}

func (i ScheduleArray) ToScheduleArrayOutputWithContext(ctx context.Context) ScheduleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleArrayOutput)
}

// ScheduleMapInput is an input type that accepts ScheduleMap and ScheduleMapOutput values.
// You can construct a concrete instance of `ScheduleMapInput` via:
//
//	ScheduleMap{ "key": ScheduleArgs{...} }
type ScheduleMapInput interface {
	pulumi.Input

	ToScheduleMapOutput() ScheduleMapOutput
	ToScheduleMapOutputWithContext(context.Context) ScheduleMapOutput
}

type ScheduleMap map[string]ScheduleInput

func (ScheduleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schedule)(nil)).Elem()
}

func (i ScheduleMap) ToScheduleMapOutput() ScheduleMapOutput {
	return i.ToScheduleMapOutputWithContext(context.Background())
}

func (i ScheduleMap) ToScheduleMapOutputWithContext(ctx context.Context) ScheduleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleMapOutput)
}

type ScheduleOutput struct{ *pulumi.OutputState }

func (ScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schedule)(nil)).Elem()
}

func (o ScheduleOutput) ToScheduleOutput() ScheduleOutput {
	return o
}

func (o ScheduleOutput) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return o
}

func (o ScheduleOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

func (o ScheduleOutput) DesiredCapacity() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.IntPtrOutput { return v.DesiredCapacity }).(pulumi.IntPtrOutput)
}

func (o ScheduleOutput) LaunchExpirationTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.IntPtrOutput { return v.LaunchExpirationTime }).(pulumi.IntPtrOutput)
}

func (o ScheduleOutput) LaunchTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringPtrOutput { return v.LaunchTime }).(pulumi.StringPtrOutput)
}

func (o ScheduleOutput) MaxValue() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.IntPtrOutput { return v.MaxValue }).(pulumi.IntPtrOutput)
}

func (o ScheduleOutput) MinValue() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.IntPtrOutput { return v.MinValue }).(pulumi.IntPtrOutput)
}

func (o ScheduleOutput) RecurrenceEndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringOutput { return v.RecurrenceEndTime }).(pulumi.StringOutput)
}

func (o ScheduleOutput) RecurrenceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringOutput { return v.RecurrenceType }).(pulumi.StringOutput)
}

func (o ScheduleOutput) RecurrenceValue() pulumi.StringOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringOutput { return v.RecurrenceValue }).(pulumi.StringOutput)
}

func (o ScheduleOutput) ScalingGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringOutput { return v.ScalingGroupId }).(pulumi.StringOutput)
}

func (o ScheduleOutput) ScheduledAction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringPtrOutput { return v.ScheduledAction }).(pulumi.StringPtrOutput)
}

func (o ScheduleOutput) ScheduledTaskName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.StringPtrOutput { return v.ScheduledTaskName }).(pulumi.StringPtrOutput)
}

func (o ScheduleOutput) TaskEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schedule) pulumi.BoolPtrOutput { return v.TaskEnabled }).(pulumi.BoolPtrOutput)
}

type ScheduleArrayOutput struct{ *pulumi.OutputState }

func (ScheduleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schedule)(nil)).Elem()
}

func (o ScheduleArrayOutput) ToScheduleArrayOutput() ScheduleArrayOutput {
	return o
}

func (o ScheduleArrayOutput) ToScheduleArrayOutputWithContext(ctx context.Context) ScheduleArrayOutput {
	return o
}

func (o ScheduleArrayOutput) Index(i pulumi.IntInput) ScheduleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Schedule {
		return vs[0].([]*Schedule)[vs[1].(int)]
	}).(ScheduleOutput)
}

type ScheduleMapOutput struct{ *pulumi.OutputState }

func (ScheduleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schedule)(nil)).Elem()
}

func (o ScheduleMapOutput) ToScheduleMapOutput() ScheduleMapOutput {
	return o
}

func (o ScheduleMapOutput) ToScheduleMapOutputWithContext(ctx context.Context) ScheduleMapOutput {
	return o
}

func (o ScheduleMapOutput) MapIndex(k pulumi.StringInput) ScheduleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Schedule {
		return vs[0].(map[string]*Schedule)[vs[1].(string)]
	}).(ScheduleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleInput)(nil)).Elem(), &Schedule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleArrayInput)(nil)).Elem(), ScheduleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleMapInput)(nil)).Elem(), ScheduleMap{})
	pulumi.RegisterOutputType(ScheduleOutput{})
	pulumi.RegisterOutputType(ScheduleArrayOutput{})
	pulumi.RegisterOutputType(ScheduleMapOutput{})
}
