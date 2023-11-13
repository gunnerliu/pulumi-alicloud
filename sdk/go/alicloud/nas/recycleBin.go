// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Network Attached Storage (NAS) Recycle Bin resource.
//
// For information about Network Attached Storage (NAS) Recycle Bin and how to use it, see [What is Recycle Bin](https://www.alibabacloud.com/help/en/doc-detail/264185.html).
//
// > **NOTE:** Available in v1.155.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleZones, err := nas.GetZones(ctx, &nas.GetZonesArgs{
//				FileSystemType: pulumi.StringRef("standard"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleFileSystem, err := nas.NewFileSystem(ctx, "exampleFileSystem", &nas.FileSystemArgs{
//				ProtocolType: pulumi.String("NFS"),
//				StorageType:  pulumi.String("Performance"),
//				Description:  pulumi.String("terraform-example"),
//				EncryptType:  pulumi.Int(1),
//				ZoneId:       *pulumi.String(exampleZones.Zones[0].ZoneId),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nas.NewRecycleBin(ctx, "exampleRecycleBin", &nas.RecycleBinArgs{
//				FileSystemId: exampleFileSystem.ID(),
//				ReservedDays: pulumi.Int(3),
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
// Network Attached Storage (NAS) Recycle Bin can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:nas/recycleBin:RecycleBin example <file_system_id>
//
// ```
type RecycleBin struct {
	pulumi.CustomResourceState

	// The ID of the file system for which you want to enable the recycle bin feature.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
	ReservedDays pulumi.IntOutput `pulumi:"reservedDays"`
	// The status of the recycle bin.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewRecycleBin registers a new resource with the given unique name, arguments, and options.
func NewRecycleBin(ctx *pulumi.Context,
	name string, args *RecycleBinArgs, opts ...pulumi.ResourceOption) (*RecycleBin, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RecycleBin
	err := ctx.RegisterResource("alicloud:nas/recycleBin:RecycleBin", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRecycleBin gets an existing RecycleBin resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRecycleBin(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RecycleBinState, opts ...pulumi.ResourceOption) (*RecycleBin, error) {
	var resource RecycleBin
	err := ctx.ReadResource("alicloud:nas/recycleBin:RecycleBin", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RecycleBin resources.
type recycleBinState struct {
	// The ID of the file system for which you want to enable the recycle bin feature.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
	ReservedDays *int `pulumi:"reservedDays"`
	// The status of the recycle bin.
	Status *string `pulumi:"status"`
}

type RecycleBinState struct {
	// The ID of the file system for which you want to enable the recycle bin feature.
	FileSystemId pulumi.StringPtrInput
	// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
	ReservedDays pulumi.IntPtrInput
	// The status of the recycle bin.
	Status pulumi.StringPtrInput
}

func (RecycleBinState) ElementType() reflect.Type {
	return reflect.TypeOf((*recycleBinState)(nil)).Elem()
}

type recycleBinArgs struct {
	// The ID of the file system for which you want to enable the recycle bin feature.
	FileSystemId string `pulumi:"fileSystemId"`
	// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
	ReservedDays *int `pulumi:"reservedDays"`
}

// The set of arguments for constructing a RecycleBin resource.
type RecycleBinArgs struct {
	// The ID of the file system for which you want to enable the recycle bin feature.
	FileSystemId pulumi.StringInput
	// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
	ReservedDays pulumi.IntPtrInput
}

func (RecycleBinArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*recycleBinArgs)(nil)).Elem()
}

type RecycleBinInput interface {
	pulumi.Input

	ToRecycleBinOutput() RecycleBinOutput
	ToRecycleBinOutputWithContext(ctx context.Context) RecycleBinOutput
}

func (*RecycleBin) ElementType() reflect.Type {
	return reflect.TypeOf((**RecycleBin)(nil)).Elem()
}

func (i *RecycleBin) ToRecycleBinOutput() RecycleBinOutput {
	return i.ToRecycleBinOutputWithContext(context.Background())
}

func (i *RecycleBin) ToRecycleBinOutputWithContext(ctx context.Context) RecycleBinOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecycleBinOutput)
}

// RecycleBinArrayInput is an input type that accepts RecycleBinArray and RecycleBinArrayOutput values.
// You can construct a concrete instance of `RecycleBinArrayInput` via:
//
//	RecycleBinArray{ RecycleBinArgs{...} }
type RecycleBinArrayInput interface {
	pulumi.Input

	ToRecycleBinArrayOutput() RecycleBinArrayOutput
	ToRecycleBinArrayOutputWithContext(context.Context) RecycleBinArrayOutput
}

type RecycleBinArray []RecycleBinInput

func (RecycleBinArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RecycleBin)(nil)).Elem()
}

func (i RecycleBinArray) ToRecycleBinArrayOutput() RecycleBinArrayOutput {
	return i.ToRecycleBinArrayOutputWithContext(context.Background())
}

func (i RecycleBinArray) ToRecycleBinArrayOutputWithContext(ctx context.Context) RecycleBinArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecycleBinArrayOutput)
}

// RecycleBinMapInput is an input type that accepts RecycleBinMap and RecycleBinMapOutput values.
// You can construct a concrete instance of `RecycleBinMapInput` via:
//
//	RecycleBinMap{ "key": RecycleBinArgs{...} }
type RecycleBinMapInput interface {
	pulumi.Input

	ToRecycleBinMapOutput() RecycleBinMapOutput
	ToRecycleBinMapOutputWithContext(context.Context) RecycleBinMapOutput
}

type RecycleBinMap map[string]RecycleBinInput

func (RecycleBinMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RecycleBin)(nil)).Elem()
}

func (i RecycleBinMap) ToRecycleBinMapOutput() RecycleBinMapOutput {
	return i.ToRecycleBinMapOutputWithContext(context.Background())
}

func (i RecycleBinMap) ToRecycleBinMapOutputWithContext(ctx context.Context) RecycleBinMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecycleBinMapOutput)
}

type RecycleBinOutput struct{ *pulumi.OutputState }

func (RecycleBinOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RecycleBin)(nil)).Elem()
}

func (o RecycleBinOutput) ToRecycleBinOutput() RecycleBinOutput {
	return o
}

func (o RecycleBinOutput) ToRecycleBinOutputWithContext(ctx context.Context) RecycleBinOutput {
	return o
}

// The ID of the file system for which you want to enable the recycle bin feature.
func (o RecycleBinOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *RecycleBin) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The period for which the files in the recycle bin are retained. Unit: days. Valid values: `1` to `180`.
func (o RecycleBinOutput) ReservedDays() pulumi.IntOutput {
	return o.ApplyT(func(v *RecycleBin) pulumi.IntOutput { return v.ReservedDays }).(pulumi.IntOutput)
}

// The status of the recycle bin.
func (o RecycleBinOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *RecycleBin) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type RecycleBinArrayOutput struct{ *pulumi.OutputState }

func (RecycleBinArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RecycleBin)(nil)).Elem()
}

func (o RecycleBinArrayOutput) ToRecycleBinArrayOutput() RecycleBinArrayOutput {
	return o
}

func (o RecycleBinArrayOutput) ToRecycleBinArrayOutputWithContext(ctx context.Context) RecycleBinArrayOutput {
	return o
}

func (o RecycleBinArrayOutput) Index(i pulumi.IntInput) RecycleBinOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RecycleBin {
		return vs[0].([]*RecycleBin)[vs[1].(int)]
	}).(RecycleBinOutput)
}

type RecycleBinMapOutput struct{ *pulumi.OutputState }

func (RecycleBinMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RecycleBin)(nil)).Elem()
}

func (o RecycleBinMapOutput) ToRecycleBinMapOutput() RecycleBinMapOutput {
	return o
}

func (o RecycleBinMapOutput) ToRecycleBinMapOutputWithContext(ctx context.Context) RecycleBinMapOutput {
	return o
}

func (o RecycleBinMapOutput) MapIndex(k pulumi.StringInput) RecycleBinOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RecycleBin {
		return vs[0].(map[string]*RecycleBin)[vs[1].(string)]
	}).(RecycleBinOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RecycleBinInput)(nil)).Elem(), &RecycleBin{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecycleBinArrayInput)(nil)).Elem(), RecycleBinArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecycleBinMapInput)(nil)).Elem(), RecycleBinMap{})
	pulumi.RegisterOutputType(RecycleBinOutput{})
	pulumi.RegisterOutputType(RecycleBinArrayOutput{})
	pulumi.RegisterOutputType(RecycleBinMapOutput{})
}
