// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Auto Snapshot Policy resource.
//
// For information about ECS Auto Snapshot Policy and how to use it, see [What is Auto Snapshot Policy](https://www.alibabacloud.com/help/en/doc-detail/25527.htm).
//
// > **NOTE:** Available in v1.117.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ecs.NewAutoSnapshotPolicy(ctx, "example", &ecs.AutoSnapshotPolicyArgs{
//				RepeatWeekdays: pulumi.StringArray{
//					pulumi.String("1"),
//					pulumi.String("2"),
//					pulumi.String("3"),
//				},
//				RetentionDays: -1,
//				TimePoints: pulumi.StringArray{
//					pulumi.String("1"),
//					pulumi.String("22"),
//					pulumi.String("23"),
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
// ECS Auto Snapshot Policy can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ecs/autoSnapshotPolicy:AutoSnapshotPolicy example <id>
// ```
type AutoSnapshotPolicy struct {
	pulumi.CustomResourceState

	// The retention period of the snapshot copied across regions.
	// - -1: The snapshot is permanently retained.
	// - [1, 65535]: The automatic snapshot is retained for the specified number of days.
	//   Default value: -1.
	CopiedSnapshotsRetentionDays pulumi.IntPtrOutput `pulumi:"copiedSnapshotsRetentionDays"`
	// Specifies whether to enable the system to automatically copy snapshots across regions.
	EnableCrossRegionCopy pulumi.BoolPtrOutput `pulumi:"enableCrossRegionCopy"`
	// The snapshot policy name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
	// - A maximum of seven time points can be selected.
	// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
	RepeatWeekdays pulumi.StringArrayOutput `pulumi:"repeatWeekdays"`
	// The snapshot retention time, and the unit of measurement is day. Optional values:
	// - -1: The automatic snapshots are retained permanently.
	// - [1, 65536]: The number of days retained.
	//   Default value: -1.
	RetentionDays pulumi.IntOutput `pulumi:"retentionDays"`
	// The status of Auto Snapshot Policy.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The destination region to which the snapshot is copied. You can set a destination region.
	TargetCopyRegions pulumi.StringArrayOutput `pulumi:"targetCopyRegions"`
	// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
	// - A maximum of 24 time points can be selected.
	// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
	TimePoints pulumi.StringArrayOutput `pulumi:"timePoints"`
}

// NewAutoSnapshotPolicy registers a new resource with the given unique name, arguments, and options.
func NewAutoSnapshotPolicy(ctx *pulumi.Context,
	name string, args *AutoSnapshotPolicyArgs, opts ...pulumi.ResourceOption) (*AutoSnapshotPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RepeatWeekdays == nil {
		return nil, errors.New("invalid value for required argument 'RepeatWeekdays'")
	}
	if args.RetentionDays == nil {
		return nil, errors.New("invalid value for required argument 'RetentionDays'")
	}
	if args.TimePoints == nil {
		return nil, errors.New("invalid value for required argument 'TimePoints'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AutoSnapshotPolicy
	err := ctx.RegisterResource("alicloud:ecs/autoSnapshotPolicy:AutoSnapshotPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAutoSnapshotPolicy gets an existing AutoSnapshotPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAutoSnapshotPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AutoSnapshotPolicyState, opts ...pulumi.ResourceOption) (*AutoSnapshotPolicy, error) {
	var resource AutoSnapshotPolicy
	err := ctx.ReadResource("alicloud:ecs/autoSnapshotPolicy:AutoSnapshotPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AutoSnapshotPolicy resources.
type autoSnapshotPolicyState struct {
	// The retention period of the snapshot copied across regions.
	// - -1: The snapshot is permanently retained.
	// - [1, 65535]: The automatic snapshot is retained for the specified number of days.
	//   Default value: -1.
	CopiedSnapshotsRetentionDays *int `pulumi:"copiedSnapshotsRetentionDays"`
	// Specifies whether to enable the system to automatically copy snapshots across regions.
	EnableCrossRegionCopy *bool `pulumi:"enableCrossRegionCopy"`
	// The snapshot policy name.
	Name *string `pulumi:"name"`
	// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
	// - A maximum of seven time points can be selected.
	// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
	RepeatWeekdays []string `pulumi:"repeatWeekdays"`
	// The snapshot retention time, and the unit of measurement is day. Optional values:
	// - -1: The automatic snapshots are retained permanently.
	// - [1, 65536]: The number of days retained.
	//   Default value: -1.
	RetentionDays *int `pulumi:"retentionDays"`
	// The status of Auto Snapshot Policy.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The destination region to which the snapshot is copied. You can set a destination region.
	TargetCopyRegions []string `pulumi:"targetCopyRegions"`
	// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
	// - A maximum of 24 time points can be selected.
	// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
	TimePoints []string `pulumi:"timePoints"`
}

type AutoSnapshotPolicyState struct {
	// The retention period of the snapshot copied across regions.
	// - -1: The snapshot is permanently retained.
	// - [1, 65535]: The automatic snapshot is retained for the specified number of days.
	//   Default value: -1.
	CopiedSnapshotsRetentionDays pulumi.IntPtrInput
	// Specifies whether to enable the system to automatically copy snapshots across regions.
	EnableCrossRegionCopy pulumi.BoolPtrInput
	// The snapshot policy name.
	Name pulumi.StringPtrInput
	// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
	// - A maximum of seven time points can be selected.
	// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
	RepeatWeekdays pulumi.StringArrayInput
	// The snapshot retention time, and the unit of measurement is day. Optional values:
	// - -1: The automatic snapshots are retained permanently.
	// - [1, 65536]: The number of days retained.
	//   Default value: -1.
	RetentionDays pulumi.IntPtrInput
	// The status of Auto Snapshot Policy.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The destination region to which the snapshot is copied. You can set a destination region.
	TargetCopyRegions pulumi.StringArrayInput
	// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
	// - A maximum of 24 time points can be selected.
	// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
	TimePoints pulumi.StringArrayInput
}

func (AutoSnapshotPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*autoSnapshotPolicyState)(nil)).Elem()
}

type autoSnapshotPolicyArgs struct {
	// The retention period of the snapshot copied across regions.
	// - -1: The snapshot is permanently retained.
	// - [1, 65535]: The automatic snapshot is retained for the specified number of days.
	//   Default value: -1.
	CopiedSnapshotsRetentionDays *int `pulumi:"copiedSnapshotsRetentionDays"`
	// Specifies whether to enable the system to automatically copy snapshots across regions.
	EnableCrossRegionCopy *bool `pulumi:"enableCrossRegionCopy"`
	// The snapshot policy name.
	Name *string `pulumi:"name"`
	// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
	// - A maximum of seven time points can be selected.
	// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
	RepeatWeekdays []string `pulumi:"repeatWeekdays"`
	// The snapshot retention time, and the unit of measurement is day. Optional values:
	// - -1: The automatic snapshots are retained permanently.
	// - [1, 65536]: The number of days retained.
	//   Default value: -1.
	RetentionDays int `pulumi:"retentionDays"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The destination region to which the snapshot is copied. You can set a destination region.
	TargetCopyRegions []string `pulumi:"targetCopyRegions"`
	// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
	// - A maximum of 24 time points can be selected.
	// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
	TimePoints []string `pulumi:"timePoints"`
}

// The set of arguments for constructing a AutoSnapshotPolicy resource.
type AutoSnapshotPolicyArgs struct {
	// The retention period of the snapshot copied across regions.
	// - -1: The snapshot is permanently retained.
	// - [1, 65535]: The automatic snapshot is retained for the specified number of days.
	//   Default value: -1.
	CopiedSnapshotsRetentionDays pulumi.IntPtrInput
	// Specifies whether to enable the system to automatically copy snapshots across regions.
	EnableCrossRegionCopy pulumi.BoolPtrInput
	// The snapshot policy name.
	Name pulumi.StringPtrInput
	// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
	// - A maximum of seven time points can be selected.
	// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
	RepeatWeekdays pulumi.StringArrayInput
	// The snapshot retention time, and the unit of measurement is day. Optional values:
	// - -1: The automatic snapshots are retained permanently.
	// - [1, 65536]: The number of days retained.
	//   Default value: -1.
	RetentionDays pulumi.IntInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The destination region to which the snapshot is copied. You can set a destination region.
	TargetCopyRegions pulumi.StringArrayInput
	// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
	// - A maximum of 24 time points can be selected.
	// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
	TimePoints pulumi.StringArrayInput
}

func (AutoSnapshotPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*autoSnapshotPolicyArgs)(nil)).Elem()
}

type AutoSnapshotPolicyInput interface {
	pulumi.Input

	ToAutoSnapshotPolicyOutput() AutoSnapshotPolicyOutput
	ToAutoSnapshotPolicyOutputWithContext(ctx context.Context) AutoSnapshotPolicyOutput
}

func (*AutoSnapshotPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoSnapshotPolicy)(nil)).Elem()
}

func (i *AutoSnapshotPolicy) ToAutoSnapshotPolicyOutput() AutoSnapshotPolicyOutput {
	return i.ToAutoSnapshotPolicyOutputWithContext(context.Background())
}

func (i *AutoSnapshotPolicy) ToAutoSnapshotPolicyOutputWithContext(ctx context.Context) AutoSnapshotPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoSnapshotPolicyOutput)
}

// AutoSnapshotPolicyArrayInput is an input type that accepts AutoSnapshotPolicyArray and AutoSnapshotPolicyArrayOutput values.
// You can construct a concrete instance of `AutoSnapshotPolicyArrayInput` via:
//
//	AutoSnapshotPolicyArray{ AutoSnapshotPolicyArgs{...} }
type AutoSnapshotPolicyArrayInput interface {
	pulumi.Input

	ToAutoSnapshotPolicyArrayOutput() AutoSnapshotPolicyArrayOutput
	ToAutoSnapshotPolicyArrayOutputWithContext(context.Context) AutoSnapshotPolicyArrayOutput
}

type AutoSnapshotPolicyArray []AutoSnapshotPolicyInput

func (AutoSnapshotPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoSnapshotPolicy)(nil)).Elem()
}

func (i AutoSnapshotPolicyArray) ToAutoSnapshotPolicyArrayOutput() AutoSnapshotPolicyArrayOutput {
	return i.ToAutoSnapshotPolicyArrayOutputWithContext(context.Background())
}

func (i AutoSnapshotPolicyArray) ToAutoSnapshotPolicyArrayOutputWithContext(ctx context.Context) AutoSnapshotPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoSnapshotPolicyArrayOutput)
}

// AutoSnapshotPolicyMapInput is an input type that accepts AutoSnapshotPolicyMap and AutoSnapshotPolicyMapOutput values.
// You can construct a concrete instance of `AutoSnapshotPolicyMapInput` via:
//
//	AutoSnapshotPolicyMap{ "key": AutoSnapshotPolicyArgs{...} }
type AutoSnapshotPolicyMapInput interface {
	pulumi.Input

	ToAutoSnapshotPolicyMapOutput() AutoSnapshotPolicyMapOutput
	ToAutoSnapshotPolicyMapOutputWithContext(context.Context) AutoSnapshotPolicyMapOutput
}

type AutoSnapshotPolicyMap map[string]AutoSnapshotPolicyInput

func (AutoSnapshotPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoSnapshotPolicy)(nil)).Elem()
}

func (i AutoSnapshotPolicyMap) ToAutoSnapshotPolicyMapOutput() AutoSnapshotPolicyMapOutput {
	return i.ToAutoSnapshotPolicyMapOutputWithContext(context.Background())
}

func (i AutoSnapshotPolicyMap) ToAutoSnapshotPolicyMapOutputWithContext(ctx context.Context) AutoSnapshotPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AutoSnapshotPolicyMapOutput)
}

type AutoSnapshotPolicyOutput struct{ *pulumi.OutputState }

func (AutoSnapshotPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AutoSnapshotPolicy)(nil)).Elem()
}

func (o AutoSnapshotPolicyOutput) ToAutoSnapshotPolicyOutput() AutoSnapshotPolicyOutput {
	return o
}

func (o AutoSnapshotPolicyOutput) ToAutoSnapshotPolicyOutputWithContext(ctx context.Context) AutoSnapshotPolicyOutput {
	return o
}

// The retention period of the snapshot copied across regions.
//   - -1: The snapshot is permanently retained.
//   - [1, 65535]: The automatic snapshot is retained for the specified number of days.
//     Default value: -1.
func (o AutoSnapshotPolicyOutput) CopiedSnapshotsRetentionDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.IntPtrOutput { return v.CopiedSnapshotsRetentionDays }).(pulumi.IntPtrOutput)
}

// Specifies whether to enable the system to automatically copy snapshots across regions.
func (o AutoSnapshotPolicyOutput) EnableCrossRegionCopy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.BoolPtrOutput { return v.EnableCrossRegionCopy }).(pulumi.BoolPtrOutput)
}

// The snapshot policy name.
func (o AutoSnapshotPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The automatic snapshot repetition dates. The unit of measurement is day and the repeating cycle is a week. Value range: [1, 7], which represents days starting from Monday to Sunday, for example 1  indicates Monday. When you want to schedule multiple automatic snapshot tasks for a disk in a week, you can set the RepeatWeekdays to an array.
// - A maximum of seven time points can be selected.
// - The format is  an JSON array of ["1", "2", … "7"]  and the time points are separated by commas (,).
func (o AutoSnapshotPolicyOutput) RepeatWeekdays() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.StringArrayOutput { return v.RepeatWeekdays }).(pulumi.StringArrayOutput)
}

// The snapshot retention time, and the unit of measurement is day. Optional values:
//   - -1: The automatic snapshots are retained permanently.
//   - [1, 65536]: The number of days retained.
//     Default value: -1.
func (o AutoSnapshotPolicyOutput) RetentionDays() pulumi.IntOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.IntOutput { return v.RetentionDays }).(pulumi.IntOutput)
}

// The status of Auto Snapshot Policy.
func (o AutoSnapshotPolicyOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o AutoSnapshotPolicyOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The destination region to which the snapshot is copied. You can set a destination region.
func (o AutoSnapshotPolicyOutput) TargetCopyRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.StringArrayOutput { return v.TargetCopyRegions }).(pulumi.StringArrayOutput)
}

// The automatic snapshot creation schedule, and the unit of measurement is hour. Value range: [0, 23], which represents from 00:00 to 24:00,  for example 1 indicates 01:00. When you want to schedule multiple automatic snapshot tasks for a disk in a day, you can set the TimePoints to an array.
// - A maximum of 24 time points can be selected.
// - The format is  an JSON array of ["0", "1", … "23"] and the time points are separated by commas (,).
func (o AutoSnapshotPolicyOutput) TimePoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AutoSnapshotPolicy) pulumi.StringArrayOutput { return v.TimePoints }).(pulumi.StringArrayOutput)
}

type AutoSnapshotPolicyArrayOutput struct{ *pulumi.OutputState }

func (AutoSnapshotPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AutoSnapshotPolicy)(nil)).Elem()
}

func (o AutoSnapshotPolicyArrayOutput) ToAutoSnapshotPolicyArrayOutput() AutoSnapshotPolicyArrayOutput {
	return o
}

func (o AutoSnapshotPolicyArrayOutput) ToAutoSnapshotPolicyArrayOutputWithContext(ctx context.Context) AutoSnapshotPolicyArrayOutput {
	return o
}

func (o AutoSnapshotPolicyArrayOutput) Index(i pulumi.IntInput) AutoSnapshotPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AutoSnapshotPolicy {
		return vs[0].([]*AutoSnapshotPolicy)[vs[1].(int)]
	}).(AutoSnapshotPolicyOutput)
}

type AutoSnapshotPolicyMapOutput struct{ *pulumi.OutputState }

func (AutoSnapshotPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AutoSnapshotPolicy)(nil)).Elem()
}

func (o AutoSnapshotPolicyMapOutput) ToAutoSnapshotPolicyMapOutput() AutoSnapshotPolicyMapOutput {
	return o
}

func (o AutoSnapshotPolicyMapOutput) ToAutoSnapshotPolicyMapOutputWithContext(ctx context.Context) AutoSnapshotPolicyMapOutput {
	return o
}

func (o AutoSnapshotPolicyMapOutput) MapIndex(k pulumi.StringInput) AutoSnapshotPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AutoSnapshotPolicy {
		return vs[0].(map[string]*AutoSnapshotPolicy)[vs[1].(string)]
	}).(AutoSnapshotPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AutoSnapshotPolicyInput)(nil)).Elem(), &AutoSnapshotPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoSnapshotPolicyArrayInput)(nil)).Elem(), AutoSnapshotPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AutoSnapshotPolicyMapInput)(nil)).Elem(), AutoSnapshotPolicyMap{})
	pulumi.RegisterOutputType(AutoSnapshotPolicyOutput{})
	pulumi.RegisterOutputType(AutoSnapshotPolicyArrayOutput{})
	pulumi.RegisterOutputType(AutoSnapshotPolicyMapOutput{})
}
