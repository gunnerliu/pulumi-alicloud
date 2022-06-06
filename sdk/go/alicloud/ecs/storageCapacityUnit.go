// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Storage Capacity Unit resource.
//
// For information about ECS Storage Capacity Unit and how to use it, see [What is Storage Capacity Unit](https://www.alibabacloud.com/help/en/doc-detail/161157.html).
//
// > **NOTE:** Available in v1.155.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ecs.NewStorageCapacityUnit(ctx, "default", &ecs.StorageCapacityUnitArgs{
// 			Capacity:                pulumi.Int(20),
// 			Description:             pulumi.String("tftestdescription"),
// 			StorageCapacityUnitName: pulumi.String("tftestname"),
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
// ECS Storage Capacity Unit can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/storageCapacityUnit:StorageCapacityUnit example <id>
// ```
type StorageCapacityUnit struct {
	pulumi.CustomResourceState

	// The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
	Capacity pulumi.IntOutput `pulumi:"capacity"`
	// The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The validity period of the Storage Capacity Unit. Default value: `1`.
	// * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
	// * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
	Period pulumi.IntOutput `pulumi:"period"`
	// The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
	PeriodUnit pulumi.StringOutput `pulumi:"periodUnit"`
	// The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
	StartTime pulumi.StringOutput `pulumi:"startTime"`
	// The status of Storage Capacity Unit.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the Storage Capacity Unit.
	StorageCapacityUnitName pulumi.StringOutput `pulumi:"storageCapacityUnitName"`
}

// NewStorageCapacityUnit registers a new resource with the given unique name, arguments, and options.
func NewStorageCapacityUnit(ctx *pulumi.Context,
	name string, args *StorageCapacityUnitArgs, opts ...pulumi.ResourceOption) (*StorageCapacityUnit, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Capacity == nil {
		return nil, errors.New("invalid value for required argument 'Capacity'")
	}
	var resource StorageCapacityUnit
	err := ctx.RegisterResource("alicloud:ecs/storageCapacityUnit:StorageCapacityUnit", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageCapacityUnit gets an existing StorageCapacityUnit resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageCapacityUnit(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageCapacityUnitState, opts ...pulumi.ResourceOption) (*StorageCapacityUnit, error) {
	var resource StorageCapacityUnit
	err := ctx.ReadResource("alicloud:ecs/storageCapacityUnit:StorageCapacityUnit", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageCapacityUnit resources.
type storageCapacityUnitState struct {
	// The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
	Capacity *int `pulumi:"capacity"`
	// The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The validity period of the Storage Capacity Unit. Default value: `1`.
	// * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
	// * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
	Period *int `pulumi:"period"`
	// The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
	StartTime *string `pulumi:"startTime"`
	// The status of Storage Capacity Unit.
	Status *string `pulumi:"status"`
	// The name of the Storage Capacity Unit.
	StorageCapacityUnitName *string `pulumi:"storageCapacityUnitName"`
}

type StorageCapacityUnitState struct {
	// The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
	Capacity pulumi.IntPtrInput
	// The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The validity period of the Storage Capacity Unit. Default value: `1`.
	// * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
	// * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
	Period pulumi.IntPtrInput
	// The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
	PeriodUnit pulumi.StringPtrInput
	// The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
	StartTime pulumi.StringPtrInput
	// The status of Storage Capacity Unit.
	Status pulumi.StringPtrInput
	// The name of the Storage Capacity Unit.
	StorageCapacityUnitName pulumi.StringPtrInput
}

func (StorageCapacityUnitState) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCapacityUnitState)(nil)).Elem()
}

type storageCapacityUnitArgs struct {
	// The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
	Capacity int `pulumi:"capacity"`
	// The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The validity period of the Storage Capacity Unit. Default value: `1`.
	// * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
	// * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
	Period *int `pulumi:"period"`
	// The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
	PeriodUnit *string `pulumi:"periodUnit"`
	// The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
	StartTime *string `pulumi:"startTime"`
	// The name of the Storage Capacity Unit.
	StorageCapacityUnitName *string `pulumi:"storageCapacityUnitName"`
}

// The set of arguments for constructing a StorageCapacityUnit resource.
type StorageCapacityUnitArgs struct {
	// The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
	Capacity pulumi.IntInput
	// The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The validity period of the Storage Capacity Unit. Default value: `1`.
	// * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
	// * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
	Period pulumi.IntPtrInput
	// The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
	PeriodUnit pulumi.StringPtrInput
	// The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
	StartTime pulumi.StringPtrInput
	// The name of the Storage Capacity Unit.
	StorageCapacityUnitName pulumi.StringPtrInput
}

func (StorageCapacityUnitArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCapacityUnitArgs)(nil)).Elem()
}

type StorageCapacityUnitInput interface {
	pulumi.Input

	ToStorageCapacityUnitOutput() StorageCapacityUnitOutput
	ToStorageCapacityUnitOutputWithContext(ctx context.Context) StorageCapacityUnitOutput
}

func (*StorageCapacityUnit) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCapacityUnit)(nil)).Elem()
}

func (i *StorageCapacityUnit) ToStorageCapacityUnitOutput() StorageCapacityUnitOutput {
	return i.ToStorageCapacityUnitOutputWithContext(context.Background())
}

func (i *StorageCapacityUnit) ToStorageCapacityUnitOutputWithContext(ctx context.Context) StorageCapacityUnitOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCapacityUnitOutput)
}

// StorageCapacityUnitArrayInput is an input type that accepts StorageCapacityUnitArray and StorageCapacityUnitArrayOutput values.
// You can construct a concrete instance of `StorageCapacityUnitArrayInput` via:
//
//          StorageCapacityUnitArray{ StorageCapacityUnitArgs{...} }
type StorageCapacityUnitArrayInput interface {
	pulumi.Input

	ToStorageCapacityUnitArrayOutput() StorageCapacityUnitArrayOutput
	ToStorageCapacityUnitArrayOutputWithContext(context.Context) StorageCapacityUnitArrayOutput
}

type StorageCapacityUnitArray []StorageCapacityUnitInput

func (StorageCapacityUnitArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCapacityUnit)(nil)).Elem()
}

func (i StorageCapacityUnitArray) ToStorageCapacityUnitArrayOutput() StorageCapacityUnitArrayOutput {
	return i.ToStorageCapacityUnitArrayOutputWithContext(context.Background())
}

func (i StorageCapacityUnitArray) ToStorageCapacityUnitArrayOutputWithContext(ctx context.Context) StorageCapacityUnitArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCapacityUnitArrayOutput)
}

// StorageCapacityUnitMapInput is an input type that accepts StorageCapacityUnitMap and StorageCapacityUnitMapOutput values.
// You can construct a concrete instance of `StorageCapacityUnitMapInput` via:
//
//          StorageCapacityUnitMap{ "key": StorageCapacityUnitArgs{...} }
type StorageCapacityUnitMapInput interface {
	pulumi.Input

	ToStorageCapacityUnitMapOutput() StorageCapacityUnitMapOutput
	ToStorageCapacityUnitMapOutputWithContext(context.Context) StorageCapacityUnitMapOutput
}

type StorageCapacityUnitMap map[string]StorageCapacityUnitInput

func (StorageCapacityUnitMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCapacityUnit)(nil)).Elem()
}

func (i StorageCapacityUnitMap) ToStorageCapacityUnitMapOutput() StorageCapacityUnitMapOutput {
	return i.ToStorageCapacityUnitMapOutputWithContext(context.Background())
}

func (i StorageCapacityUnitMap) ToStorageCapacityUnitMapOutputWithContext(ctx context.Context) StorageCapacityUnitMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCapacityUnitMapOutput)
}

type StorageCapacityUnitOutput struct{ *pulumi.OutputState }

func (StorageCapacityUnitOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCapacityUnit)(nil)).Elem()
}

func (o StorageCapacityUnitOutput) ToStorageCapacityUnitOutput() StorageCapacityUnitOutput {
	return o
}

func (o StorageCapacityUnitOutput) ToStorageCapacityUnitOutputWithContext(ctx context.Context) StorageCapacityUnitOutput {
	return o
}

type StorageCapacityUnitArrayOutput struct{ *pulumi.OutputState }

func (StorageCapacityUnitArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCapacityUnit)(nil)).Elem()
}

func (o StorageCapacityUnitArrayOutput) ToStorageCapacityUnitArrayOutput() StorageCapacityUnitArrayOutput {
	return o
}

func (o StorageCapacityUnitArrayOutput) ToStorageCapacityUnitArrayOutputWithContext(ctx context.Context) StorageCapacityUnitArrayOutput {
	return o
}

func (o StorageCapacityUnitArrayOutput) Index(i pulumi.IntInput) StorageCapacityUnitOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageCapacityUnit {
		return vs[0].([]*StorageCapacityUnit)[vs[1].(int)]
	}).(StorageCapacityUnitOutput)
}

type StorageCapacityUnitMapOutput struct{ *pulumi.OutputState }

func (StorageCapacityUnitMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCapacityUnit)(nil)).Elem()
}

func (o StorageCapacityUnitMapOutput) ToStorageCapacityUnitMapOutput() StorageCapacityUnitMapOutput {
	return o
}

func (o StorageCapacityUnitMapOutput) ToStorageCapacityUnitMapOutputWithContext(ctx context.Context) StorageCapacityUnitMapOutput {
	return o
}

func (o StorageCapacityUnitMapOutput) MapIndex(k pulumi.StringInput) StorageCapacityUnitOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageCapacityUnit {
		return vs[0].(map[string]*StorageCapacityUnit)[vs[1].(string)]
	}).(StorageCapacityUnitOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCapacityUnitInput)(nil)).Elem(), &StorageCapacityUnit{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCapacityUnitArrayInput)(nil)).Elem(), StorageCapacityUnitArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCapacityUnitMapInput)(nil)).Elem(), StorageCapacityUnitMap{})
	pulumi.RegisterOutputType(StorageCapacityUnitOutput{})
	pulumi.RegisterOutputType(StorageCapacityUnitArrayOutput{})
	pulumi.RegisterOutputType(StorageCapacityUnitMapOutput{})
}