// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Ecs Capacity Reservation resource.
//
// For information about Ecs Capacity Reservation and how to use it, see [What is Capacity Reservation](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/createcapacityreservation).
//
// > **NOTE:** Available in v1.195.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				InstanceTypeFamily: pulumi.StringRef("ecs.g5"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Instance"),
//				AvailableInstanceType:     pulumi.StringRef(defaultInstanceTypes.Ids[0]),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				Status: pulumi.StringRef("OK"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewCapacityReservation(ctx, "defaultCapacityReservation", &ecs.CapacityReservationArgs{
//				Description:             pulumi.String("terraform-example"),
//				Platform:                pulumi.String("linux"),
//				CapacityReservationName: pulumi.String("terraform-example"),
//				EndTimeType:             pulumi.String("Unlimited"),
//				ResourceGroupId:         *pulumi.String(defaultResourceGroups.Ids[0]),
//				InstanceAmount:          pulumi.Int(1),
//				InstanceType:            *pulumi.String(defaultInstanceTypes.Ids[0]),
//				MatchCriteria:           pulumi.String("Open"),
//				Tags: pulumi.AnyMap{
//					"Created": pulumi.Any("terraform-example"),
//				},
//				ZoneIds: pulumi.StringArray{
//					*pulumi.String(defaultZones.Zones[0].Id),
//				},
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
// Ecs Capacity Reservation can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/capacityReservation:CapacityReservation example <id>
//
// ```
type CapacityReservation struct {
	pulumi.CustomResourceState

	// Capacity reservation service name.
	CapacityReservationName pulumi.StringOutput `pulumi:"capacityReservationName"`
	// description of the capacity reservation instance.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
	EndTime pulumi.StringOutput `pulumi:"endTime"`
	// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
	EndTimeType pulumi.StringOutput `pulumi:"endTimeType"`
	// The total number of instances that need to be reserved within the capacity reservation.
	InstanceAmount pulumi.IntOutput `pulumi:"instanceAmount"`
	// Instance type. Currently, you can only set the capacity reservation service for one instance type.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
	MatchCriteria pulumi.StringOutput `pulumi:"matchCriteria"`
	// The payment type of the resource
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// platform of the capacity reservation, value range `windows`, `linux`.
	Platform pulumi.StringOutput `pulumi:"platform"`
	// The resource group id.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// time of the capacity reservation which become active.
	StartTime pulumi.StringOutput `pulumi:"startTime"`
	// The capacity is scheduled to take effect. Possible values:-Now: Effective immediately.-Later: the specified time takes effect.
	StartTimeType pulumi.StringOutput `pulumi:"startTimeType"`
	// The status of the capacity reservation.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tag of the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// This parameter is under test and is not yet open for use.
	TimeSlot pulumi.StringOutput `pulumi:"timeSlot"`
	// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
	ZoneIds pulumi.StringArrayOutput `pulumi:"zoneIds"`
}

// NewCapacityReservation registers a new resource with the given unique name, arguments, and options.
func NewCapacityReservation(ctx *pulumi.Context,
	name string, args *CapacityReservationArgs, opts ...pulumi.ResourceOption) (*CapacityReservation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceAmount == nil {
		return nil, errors.New("invalid value for required argument 'InstanceAmount'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	if args.ZoneIds == nil {
		return nil, errors.New("invalid value for required argument 'ZoneIds'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CapacityReservation
	err := ctx.RegisterResource("alicloud:ecs/capacityReservation:CapacityReservation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCapacityReservation gets an existing CapacityReservation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCapacityReservation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CapacityReservationState, opts ...pulumi.ResourceOption) (*CapacityReservation, error) {
	var resource CapacityReservation
	err := ctx.ReadResource("alicloud:ecs/capacityReservation:CapacityReservation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CapacityReservation resources.
type capacityReservationState struct {
	// Capacity reservation service name.
	CapacityReservationName *string `pulumi:"capacityReservationName"`
	// description of the capacity reservation instance.
	Description *string `pulumi:"description"`
	// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
	DryRun *bool `pulumi:"dryRun"`
	// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
	EndTime *string `pulumi:"endTime"`
	// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
	EndTimeType *string `pulumi:"endTimeType"`
	// The total number of instances that need to be reserved within the capacity reservation.
	InstanceAmount *int `pulumi:"instanceAmount"`
	// Instance type. Currently, you can only set the capacity reservation service for one instance type.
	InstanceType *string `pulumi:"instanceType"`
	// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
	MatchCriteria *string `pulumi:"matchCriteria"`
	// The payment type of the resource
	PaymentType *string `pulumi:"paymentType"`
	// platform of the capacity reservation, value range `windows`, `linux`.
	Platform *string `pulumi:"platform"`
	// The resource group id.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// time of the capacity reservation which become active.
	StartTime *string `pulumi:"startTime"`
	// The capacity is scheduled to take effect. Possible values:-Now: Effective immediately.-Later: the specified time takes effect.
	StartTimeType *string `pulumi:"startTimeType"`
	// The status of the capacity reservation.
	Status *string `pulumi:"status"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// This parameter is under test and is not yet open for use.
	TimeSlot *string `pulumi:"timeSlot"`
	// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
	ZoneIds []string `pulumi:"zoneIds"`
}

type CapacityReservationState struct {
	// Capacity reservation service name.
	CapacityReservationName pulumi.StringPtrInput
	// description of the capacity reservation instance.
	Description pulumi.StringPtrInput
	// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
	DryRun pulumi.BoolPtrInput
	// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
	EndTime pulumi.StringPtrInput
	// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
	EndTimeType pulumi.StringPtrInput
	// The total number of instances that need to be reserved within the capacity reservation.
	InstanceAmount pulumi.IntPtrInput
	// Instance type. Currently, you can only set the capacity reservation service for one instance type.
	InstanceType pulumi.StringPtrInput
	// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
	MatchCriteria pulumi.StringPtrInput
	// The payment type of the resource
	PaymentType pulumi.StringPtrInput
	// platform of the capacity reservation, value range `windows`, `linux`.
	Platform pulumi.StringPtrInput
	// The resource group id.
	ResourceGroupId pulumi.StringPtrInput
	// time of the capacity reservation which become active.
	StartTime pulumi.StringPtrInput
	// The capacity is scheduled to take effect. Possible values:-Now: Effective immediately.-Later: the specified time takes effect.
	StartTimeType pulumi.StringPtrInput
	// The status of the capacity reservation.
	Status pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
	// This parameter is under test and is not yet open for use.
	TimeSlot pulumi.StringPtrInput
	// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
	ZoneIds pulumi.StringArrayInput
}

func (CapacityReservationState) ElementType() reflect.Type {
	return reflect.TypeOf((*capacityReservationState)(nil)).Elem()
}

type capacityReservationArgs struct {
	// Capacity reservation service name.
	CapacityReservationName *string `pulumi:"capacityReservationName"`
	// description of the capacity reservation instance.
	Description *string `pulumi:"description"`
	// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
	DryRun *bool `pulumi:"dryRun"`
	// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
	EndTime *string `pulumi:"endTime"`
	// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
	EndTimeType *string `pulumi:"endTimeType"`
	// The total number of instances that need to be reserved within the capacity reservation.
	InstanceAmount int `pulumi:"instanceAmount"`
	// Instance type. Currently, you can only set the capacity reservation service for one instance type.
	InstanceType string `pulumi:"instanceType"`
	// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
	MatchCriteria *string `pulumi:"matchCriteria"`
	// platform of the capacity reservation, value range `windows`, `linux`.
	Platform *string `pulumi:"platform"`
	// The resource group id.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The tag of the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
	ZoneIds []string `pulumi:"zoneIds"`
}

// The set of arguments for constructing a CapacityReservation resource.
type CapacityReservationArgs struct {
	// Capacity reservation service name.
	CapacityReservationName pulumi.StringPtrInput
	// description of the capacity reservation instance.
	Description pulumi.StringPtrInput
	// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
	DryRun pulumi.BoolPtrInput
	// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
	EndTime pulumi.StringPtrInput
	// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
	EndTimeType pulumi.StringPtrInput
	// The total number of instances that need to be reserved within the capacity reservation.
	InstanceAmount pulumi.IntInput
	// Instance type. Currently, you can only set the capacity reservation service for one instance type.
	InstanceType pulumi.StringInput
	// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
	MatchCriteria pulumi.StringPtrInput
	// platform of the capacity reservation, value range `windows`, `linux`.
	Platform pulumi.StringPtrInput
	// The resource group id.
	ResourceGroupId pulumi.StringPtrInput
	// The tag of the resource.
	Tags pulumi.MapInput
	// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
	ZoneIds pulumi.StringArrayInput
}

func (CapacityReservationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*capacityReservationArgs)(nil)).Elem()
}

type CapacityReservationInput interface {
	pulumi.Input

	ToCapacityReservationOutput() CapacityReservationOutput
	ToCapacityReservationOutputWithContext(ctx context.Context) CapacityReservationOutput
}

func (*CapacityReservation) ElementType() reflect.Type {
	return reflect.TypeOf((**CapacityReservation)(nil)).Elem()
}

func (i *CapacityReservation) ToCapacityReservationOutput() CapacityReservationOutput {
	return i.ToCapacityReservationOutputWithContext(context.Background())
}

func (i *CapacityReservation) ToCapacityReservationOutputWithContext(ctx context.Context) CapacityReservationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CapacityReservationOutput)
}

func (i *CapacityReservation) ToOutput(ctx context.Context) pulumix.Output[*CapacityReservation] {
	return pulumix.Output[*CapacityReservation]{
		OutputState: i.ToCapacityReservationOutputWithContext(ctx).OutputState,
	}
}

// CapacityReservationArrayInput is an input type that accepts CapacityReservationArray and CapacityReservationArrayOutput values.
// You can construct a concrete instance of `CapacityReservationArrayInput` via:
//
//	CapacityReservationArray{ CapacityReservationArgs{...} }
type CapacityReservationArrayInput interface {
	pulumi.Input

	ToCapacityReservationArrayOutput() CapacityReservationArrayOutput
	ToCapacityReservationArrayOutputWithContext(context.Context) CapacityReservationArrayOutput
}

type CapacityReservationArray []CapacityReservationInput

func (CapacityReservationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CapacityReservation)(nil)).Elem()
}

func (i CapacityReservationArray) ToCapacityReservationArrayOutput() CapacityReservationArrayOutput {
	return i.ToCapacityReservationArrayOutputWithContext(context.Background())
}

func (i CapacityReservationArray) ToCapacityReservationArrayOutputWithContext(ctx context.Context) CapacityReservationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CapacityReservationArrayOutput)
}

func (i CapacityReservationArray) ToOutput(ctx context.Context) pulumix.Output[[]*CapacityReservation] {
	return pulumix.Output[[]*CapacityReservation]{
		OutputState: i.ToCapacityReservationArrayOutputWithContext(ctx).OutputState,
	}
}

// CapacityReservationMapInput is an input type that accepts CapacityReservationMap and CapacityReservationMapOutput values.
// You can construct a concrete instance of `CapacityReservationMapInput` via:
//
//	CapacityReservationMap{ "key": CapacityReservationArgs{...} }
type CapacityReservationMapInput interface {
	pulumi.Input

	ToCapacityReservationMapOutput() CapacityReservationMapOutput
	ToCapacityReservationMapOutputWithContext(context.Context) CapacityReservationMapOutput
}

type CapacityReservationMap map[string]CapacityReservationInput

func (CapacityReservationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CapacityReservation)(nil)).Elem()
}

func (i CapacityReservationMap) ToCapacityReservationMapOutput() CapacityReservationMapOutput {
	return i.ToCapacityReservationMapOutputWithContext(context.Background())
}

func (i CapacityReservationMap) ToCapacityReservationMapOutputWithContext(ctx context.Context) CapacityReservationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CapacityReservationMapOutput)
}

func (i CapacityReservationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*CapacityReservation] {
	return pulumix.Output[map[string]*CapacityReservation]{
		OutputState: i.ToCapacityReservationMapOutputWithContext(ctx).OutputState,
	}
}

type CapacityReservationOutput struct{ *pulumi.OutputState }

func (CapacityReservationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CapacityReservation)(nil)).Elem()
}

func (o CapacityReservationOutput) ToCapacityReservationOutput() CapacityReservationOutput {
	return o
}

func (o CapacityReservationOutput) ToCapacityReservationOutputWithContext(ctx context.Context) CapacityReservationOutput {
	return o
}

func (o CapacityReservationOutput) ToOutput(ctx context.Context) pulumix.Output[*CapacityReservation] {
	return pulumix.Output[*CapacityReservation]{
		OutputState: o.OutputState,
	}
}

// Capacity reservation service name.
func (o CapacityReservationOutput) CapacityReservationName() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.CapacityReservationName }).(pulumi.StringOutput)
}

// description of the capacity reservation instance.
func (o CapacityReservationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies whether to pre-check the API request. Valid values: `true` and `false`.
func (o CapacityReservationOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// end time of the capacity reservation. the capacity reservation will be  released at the end time automatically if set. otherwise it will last until manually released
func (o CapacityReservationOutput) EndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.EndTime }).(pulumi.StringOutput)
}

// Release mode of capacity reservation service. Value range:Limited: release at specified time. The EndTime parameter must be specified at the same time.Unlimited: manual release. No time limit.
func (o CapacityReservationOutput) EndTimeType() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.EndTimeType }).(pulumi.StringOutput)
}

// The total number of instances that need to be reserved within the capacity reservation.
func (o CapacityReservationOutput) InstanceAmount() pulumi.IntOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.IntOutput { return v.InstanceAmount }).(pulumi.IntOutput)
}

// Instance type. Currently, you can only set the capacity reservation service for one instance type.
func (o CapacityReservationOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The type of private resource pool generated after the capacity reservation service takes effect. Value range:Open: Open mode.Target: dedicated mode.Default value: Open
func (o CapacityReservationOutput) MatchCriteria() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.MatchCriteria }).(pulumi.StringOutput)
}

// The payment type of the resource
func (o CapacityReservationOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// platform of the capacity reservation, value range `windows`, `linux`.
func (o CapacityReservationOutput) Platform() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.Platform }).(pulumi.StringOutput)
}

// The resource group id.
func (o CapacityReservationOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// time of the capacity reservation which become active.
func (o CapacityReservationOutput) StartTime() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.StartTime }).(pulumi.StringOutput)
}

// The capacity is scheduled to take effect. Possible values:-Now: Effective immediately.-Later: the specified time takes effect.
func (o CapacityReservationOutput) StartTimeType() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.StartTimeType }).(pulumi.StringOutput)
}

// The status of the capacity reservation.
func (o CapacityReservationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tag of the resource.
func (o CapacityReservationOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// This parameter is under test and is not yet open for use.
func (o CapacityReservationOutput) TimeSlot() pulumi.StringOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringOutput { return v.TimeSlot }).(pulumi.StringOutput)
}

// The ID of the zone in the region to which the capacity reservation service belongs. Currently, it is only supported to create a capacity reservation service in one zone.
func (o CapacityReservationOutput) ZoneIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CapacityReservation) pulumi.StringArrayOutput { return v.ZoneIds }).(pulumi.StringArrayOutput)
}

type CapacityReservationArrayOutput struct{ *pulumi.OutputState }

func (CapacityReservationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CapacityReservation)(nil)).Elem()
}

func (o CapacityReservationArrayOutput) ToCapacityReservationArrayOutput() CapacityReservationArrayOutput {
	return o
}

func (o CapacityReservationArrayOutput) ToCapacityReservationArrayOutputWithContext(ctx context.Context) CapacityReservationArrayOutput {
	return o
}

func (o CapacityReservationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*CapacityReservation] {
	return pulumix.Output[[]*CapacityReservation]{
		OutputState: o.OutputState,
	}
}

func (o CapacityReservationArrayOutput) Index(i pulumi.IntInput) CapacityReservationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CapacityReservation {
		return vs[0].([]*CapacityReservation)[vs[1].(int)]
	}).(CapacityReservationOutput)
}

type CapacityReservationMapOutput struct{ *pulumi.OutputState }

func (CapacityReservationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CapacityReservation)(nil)).Elem()
}

func (o CapacityReservationMapOutput) ToCapacityReservationMapOutput() CapacityReservationMapOutput {
	return o
}

func (o CapacityReservationMapOutput) ToCapacityReservationMapOutputWithContext(ctx context.Context) CapacityReservationMapOutput {
	return o
}

func (o CapacityReservationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*CapacityReservation] {
	return pulumix.Output[map[string]*CapacityReservation]{
		OutputState: o.OutputState,
	}
}

func (o CapacityReservationMapOutput) MapIndex(k pulumi.StringInput) CapacityReservationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CapacityReservation {
		return vs[0].(map[string]*CapacityReservation)[vs[1].(string)]
	}).(CapacityReservationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CapacityReservationInput)(nil)).Elem(), &CapacityReservation{})
	pulumi.RegisterInputType(reflect.TypeOf((*CapacityReservationArrayInput)(nil)).Elem(), CapacityReservationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CapacityReservationMapInput)(nil)).Elem(), CapacityReservationMap{})
	pulumi.RegisterOutputType(CapacityReservationOutput{})
	pulumi.RegisterOutputType(CapacityReservationArrayOutput{})
	pulumi.RegisterOutputType(CapacityReservationMapOutput{})
}
