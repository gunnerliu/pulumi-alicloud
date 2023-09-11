// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Network Attached Storage (NAS) Snapshot resource.
//
// For information about Network Attached Storage (NAS) Snapshot and how to use it, see [What is Snapshot](https://www.alibabacloud.com/help/en/doc-detail/126549.html).
//
// > **NOTE:** Available in v1.152.0+.
//
// > **NOTE:** Only Extreme NAS file systems support the snapshot feature.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "testacc"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultZones, err := nas.GetZones(ctx, &nas.GetZonesArgs{
//				FileSystemType: pulumi.StringRef("extreme"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultFileSystem, err := nas.NewFileSystem(ctx, "defaultFileSystem", &nas.FileSystemArgs{
//				FileSystemType: pulumi.String("extreme"),
//				ProtocolType:   pulumi.String("NFS"),
//				ZoneId:         *pulumi.String(defaultZones.Zones[0].ZoneId),
//				StorageType:    pulumi.String("standard"),
//				Description:    pulumi.String(name),
//				Capacity:       pulumi.Int(100),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nas.NewSnapshot(ctx, "defaultSnapshot", &nas.SnapshotArgs{
//				FileSystemId:  defaultFileSystem.ID(),
//				Description:   pulumi.String(name),
//				RetentionDays: pulumi.Int(20),
//				SnapshotName:  pulumi.String(name),
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
// Network Attached Storage (NAS) Snapshot can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:nas/snapshot:Snapshot example <id>
//
// ```
type Snapshot struct {
	pulumi.CustomResourceState

	// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the file system.
	FileSystemId pulumi.StringOutput `pulumi:"fileSystemId"`
	// The retention period of the snapshot. Unit: days. Valid values:
	// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
	RetentionDays pulumi.IntPtrOutput `pulumi:"retentionDays"`
	// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
	SnapshotName pulumi.StringPtrOutput `pulumi:"snapshotName"`
	// The status of the snapshot.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewSnapshot registers a new resource with the given unique name, arguments, and options.
func NewSnapshot(ctx *pulumi.Context,
	name string, args *SnapshotArgs, opts ...pulumi.ResourceOption) (*Snapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FileSystemId == nil {
		return nil, errors.New("invalid value for required argument 'FileSystemId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Snapshot
	err := ctx.RegisterResource("alicloud:nas/snapshot:Snapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSnapshot gets an existing Snapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SnapshotState, opts ...pulumi.ResourceOption) (*Snapshot, error) {
	var resource Snapshot
	err := ctx.ReadResource("alicloud:nas/snapshot:Snapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Snapshot resources.
type snapshotState struct {
	// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
	Description *string `pulumi:"description"`
	// The ID of the file system.
	FileSystemId *string `pulumi:"fileSystemId"`
	// The retention period of the snapshot. Unit: days. Valid values:
	// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
	RetentionDays *int `pulumi:"retentionDays"`
	// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
	SnapshotName *string `pulumi:"snapshotName"`
	// The status of the snapshot.
	Status *string `pulumi:"status"`
}

type SnapshotState struct {
	// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
	Description pulumi.StringPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringPtrInput
	// The retention period of the snapshot. Unit: days. Valid values:
	// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
	RetentionDays pulumi.IntPtrInput
	// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
	SnapshotName pulumi.StringPtrInput
	// The status of the snapshot.
	Status pulumi.StringPtrInput
}

func (SnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotState)(nil)).Elem()
}

type snapshotArgs struct {
	// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
	Description *string `pulumi:"description"`
	// The ID of the file system.
	FileSystemId string `pulumi:"fileSystemId"`
	// The retention period of the snapshot. Unit: days. Valid values:
	// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
	RetentionDays *int `pulumi:"retentionDays"`
	// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
	SnapshotName *string `pulumi:"snapshotName"`
}

// The set of arguments for constructing a Snapshot resource.
type SnapshotArgs struct {
	// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
	Description pulumi.StringPtrInput
	// The ID of the file system.
	FileSystemId pulumi.StringInput
	// The retention period of the snapshot. Unit: days. Valid values:
	// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
	RetentionDays pulumi.IntPtrInput
	// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
	SnapshotName pulumi.StringPtrInput
}

func (SnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*snapshotArgs)(nil)).Elem()
}

type SnapshotInput interface {
	pulumi.Input

	ToSnapshotOutput() SnapshotOutput
	ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput
}

func (*Snapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**Snapshot)(nil)).Elem()
}

func (i *Snapshot) ToSnapshotOutput() SnapshotOutput {
	return i.ToSnapshotOutputWithContext(context.Background())
}

func (i *Snapshot) ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotOutput)
}

func (i *Snapshot) ToOutput(ctx context.Context) pulumix.Output[*Snapshot] {
	return pulumix.Output[*Snapshot]{
		OutputState: i.ToSnapshotOutputWithContext(ctx).OutputState,
	}
}

// SnapshotArrayInput is an input type that accepts SnapshotArray and SnapshotArrayOutput values.
// You can construct a concrete instance of `SnapshotArrayInput` via:
//
//	SnapshotArray{ SnapshotArgs{...} }
type SnapshotArrayInput interface {
	pulumi.Input

	ToSnapshotArrayOutput() SnapshotArrayOutput
	ToSnapshotArrayOutputWithContext(context.Context) SnapshotArrayOutput
}

type SnapshotArray []SnapshotInput

func (SnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Snapshot)(nil)).Elem()
}

func (i SnapshotArray) ToSnapshotArrayOutput() SnapshotArrayOutput {
	return i.ToSnapshotArrayOutputWithContext(context.Background())
}

func (i SnapshotArray) ToSnapshotArrayOutputWithContext(ctx context.Context) SnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotArrayOutput)
}

func (i SnapshotArray) ToOutput(ctx context.Context) pulumix.Output[[]*Snapshot] {
	return pulumix.Output[[]*Snapshot]{
		OutputState: i.ToSnapshotArrayOutputWithContext(ctx).OutputState,
	}
}

// SnapshotMapInput is an input type that accepts SnapshotMap and SnapshotMapOutput values.
// You can construct a concrete instance of `SnapshotMapInput` via:
//
//	SnapshotMap{ "key": SnapshotArgs{...} }
type SnapshotMapInput interface {
	pulumi.Input

	ToSnapshotMapOutput() SnapshotMapOutput
	ToSnapshotMapOutputWithContext(context.Context) SnapshotMapOutput
}

type SnapshotMap map[string]SnapshotInput

func (SnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Snapshot)(nil)).Elem()
}

func (i SnapshotMap) ToSnapshotMapOutput() SnapshotMapOutput {
	return i.ToSnapshotMapOutputWithContext(context.Background())
}

func (i SnapshotMap) ToSnapshotMapOutputWithContext(ctx context.Context) SnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SnapshotMapOutput)
}

func (i SnapshotMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Snapshot] {
	return pulumix.Output[map[string]*Snapshot]{
		OutputState: i.ToSnapshotMapOutputWithContext(ctx).OutputState,
	}
}

type SnapshotOutput struct{ *pulumi.OutputState }

func (SnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Snapshot)(nil)).Elem()
}

func (o SnapshotOutput) ToSnapshotOutput() SnapshotOutput {
	return o
}

func (o SnapshotOutput) ToSnapshotOutputWithContext(ctx context.Context) SnapshotOutput {
	return o
}

func (o SnapshotOutput) ToOutput(ctx context.Context) pulumix.Output[*Snapshot] {
	return pulumix.Output[*Snapshot]{
		OutputState: o.OutputState,
	}
}

// The description of the snapshot. It must be `2` to `256` characters in length and cannot start with `https://` or `https://`.
func (o SnapshotOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the file system.
func (o SnapshotOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.FileSystemId }).(pulumi.StringOutput)
}

// The retention period of the snapshot. Unit: days. Valid values:
// * `-1`: The default value. Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.
func (o SnapshotOutput) RetentionDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.IntPtrOutput { return v.RetentionDays }).(pulumi.IntPtrOutput)
}

// SnapshotName. It must be `2` to `128` characters in length and must start with a letter, but cannot start with `https://` or `https://`.
func (o SnapshotOutput) SnapshotName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringPtrOutput { return v.SnapshotName }).(pulumi.StringPtrOutput)
}

// The status of the snapshot.
func (o SnapshotOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Snapshot) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type SnapshotArrayOutput struct{ *pulumi.OutputState }

func (SnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Snapshot)(nil)).Elem()
}

func (o SnapshotArrayOutput) ToSnapshotArrayOutput() SnapshotArrayOutput {
	return o
}

func (o SnapshotArrayOutput) ToSnapshotArrayOutputWithContext(ctx context.Context) SnapshotArrayOutput {
	return o
}

func (o SnapshotArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Snapshot] {
	return pulumix.Output[[]*Snapshot]{
		OutputState: o.OutputState,
	}
}

func (o SnapshotArrayOutput) Index(i pulumi.IntInput) SnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Snapshot {
		return vs[0].([]*Snapshot)[vs[1].(int)]
	}).(SnapshotOutput)
}

type SnapshotMapOutput struct{ *pulumi.OutputState }

func (SnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Snapshot)(nil)).Elem()
}

func (o SnapshotMapOutput) ToSnapshotMapOutput() SnapshotMapOutput {
	return o
}

func (o SnapshotMapOutput) ToSnapshotMapOutputWithContext(ctx context.Context) SnapshotMapOutput {
	return o
}

func (o SnapshotMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Snapshot] {
	return pulumix.Output[map[string]*Snapshot]{
		OutputState: o.OutputState,
	}
}

func (o SnapshotMapOutput) MapIndex(k pulumi.StringInput) SnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Snapshot {
		return vs[0].(map[string]*Snapshot)[vs[1].(string)]
	}).(SnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotInput)(nil)).Elem(), &Snapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotArrayInput)(nil)).Elem(), SnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SnapshotMapInput)(nil)).Elem(), SnapshotMap{})
	pulumi.RegisterOutputType(SnapshotOutput{})
	pulumi.RegisterOutputType(SnapshotArrayOutput{})
	pulumi.RegisterOutputType(SnapshotMapOutput{})
}
