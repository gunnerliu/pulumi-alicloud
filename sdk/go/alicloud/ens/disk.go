// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ens

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ENS Disk resource. The disk. When you use it for the first time, please contact the product classmates to add a resource whitelist.
//
// For information about ENS Disk and how to use it, see [What is Disk](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createdisk).
//
// > **NOTE:** Available since v1.213.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ens"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_, err := ens.NewDisk(ctx, "default", &ens.DiskArgs{
//				Category:    pulumi.String("cloud_ssd"),
//				EnsRegionId: pulumi.String("cn-chongqing-11"),
//				PaymentType: pulumi.String("PayAsYouGo"),
//				Size:        pulumi.Int(20),
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
// ENS Disk can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:ens/disk:Disk example <id>
// ```
type Disk struct {
	pulumi.CustomResourceState

	// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
	Category pulumi.StringOutput `pulumi:"category"`
	// Disk instance creation time.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Name of the disk instance.
	DiskName pulumi.StringPtrOutput `pulumi:"diskName"`
	// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
	Encrypted pulumi.BoolPtrOutput `pulumi:"encrypted"`
	// Ens node IDExample value: cn-chengdu-telecom.
	EnsRegionId pulumi.StringOutput `pulumi:"ensRegionId"`
	// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
	KmsKeyId pulumi.StringOutput `pulumi:"kmsKeyId"`
	// Billing type of the disk instanceValue: PayAsYouGo.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The size of the disk instance. Unit: GiB.
	Size pulumi.IntPtrOutput `pulumi:"size"`
	// The ID of the snapshot used to create the cloud disk.
	//
	// The SnapshotId and Size parameters have the following limitations:
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// Status of the disk instance:Value:In-use: In useAvailable: To be mountedAttaching: AttachingDetaching: uninstallingCreating: CreatingReIniting: Resetting.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewDisk registers a new resource with the given unique name, arguments, and options.
func NewDisk(ctx *pulumi.Context,
	name string, args *DiskArgs, opts ...pulumi.ResourceOption) (*Disk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Category == nil {
		return nil, errors.New("invalid value for required argument 'Category'")
	}
	if args.EnsRegionId == nil {
		return nil, errors.New("invalid value for required argument 'EnsRegionId'")
	}
	if args.PaymentType == nil {
		return nil, errors.New("invalid value for required argument 'PaymentType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Disk
	err := ctx.RegisterResource("alicloud:ens/disk:Disk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDisk gets an existing Disk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DiskState, opts ...pulumi.ResourceOption) (*Disk, error) {
	var resource Disk
	err := ctx.ReadResource("alicloud:ens/disk:Disk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Disk resources.
type diskState struct {
	// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
	Category *string `pulumi:"category"`
	// Disk instance creation time.
	CreateTime *string `pulumi:"createTime"`
	// Name of the disk instance.
	DiskName *string `pulumi:"diskName"`
	// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
	Encrypted *bool `pulumi:"encrypted"`
	// Ens node IDExample value: cn-chengdu-telecom.
	EnsRegionId *string `pulumi:"ensRegionId"`
	// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Billing type of the disk instanceValue: PayAsYouGo.
	PaymentType *string `pulumi:"paymentType"`
	// The size of the disk instance. Unit: GiB.
	Size *int `pulumi:"size"`
	// The ID of the snapshot used to create the cloud disk.
	//
	// The SnapshotId and Size parameters have the following limitations:
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
	SnapshotId *string `pulumi:"snapshotId"`
	// Status of the disk instance:Value:In-use: In useAvailable: To be mountedAttaching: AttachingDetaching: uninstallingCreating: CreatingReIniting: Resetting.
	Status *string `pulumi:"status"`
}

type DiskState struct {
	// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
	Category pulumi.StringPtrInput
	// Disk instance creation time.
	CreateTime pulumi.StringPtrInput
	// Name of the disk instance.
	DiskName pulumi.StringPtrInput
	// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
	Encrypted pulumi.BoolPtrInput
	// Ens node IDExample value: cn-chengdu-telecom.
	EnsRegionId pulumi.StringPtrInput
	// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
	KmsKeyId pulumi.StringPtrInput
	// Billing type of the disk instanceValue: PayAsYouGo.
	PaymentType pulumi.StringPtrInput
	// The size of the disk instance. Unit: GiB.
	Size pulumi.IntPtrInput
	// The ID of the snapshot used to create the cloud disk.
	//
	// The SnapshotId and Size parameters have the following limitations:
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
	SnapshotId pulumi.StringPtrInput
	// Status of the disk instance:Value:In-use: In useAvailable: To be mountedAttaching: AttachingDetaching: uninstallingCreating: CreatingReIniting: Resetting.
	Status pulumi.StringPtrInput
}

func (DiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*diskState)(nil)).Elem()
}

type diskArgs struct {
	// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
	Category string `pulumi:"category"`
	// Name of the disk instance.
	DiskName *string `pulumi:"diskName"`
	// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
	Encrypted *bool `pulumi:"encrypted"`
	// Ens node IDExample value: cn-chengdu-telecom.
	EnsRegionId string `pulumi:"ensRegionId"`
	// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Billing type of the disk instanceValue: PayAsYouGo.
	PaymentType string `pulumi:"paymentType"`
	// The size of the disk instance. Unit: GiB.
	Size *int `pulumi:"size"`
	// The ID of the snapshot used to create the cloud disk.
	//
	// The SnapshotId and Size parameters have the following limitations:
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
	SnapshotId *string `pulumi:"snapshotId"`
}

// The set of arguments for constructing a Disk resource.
type DiskArgs struct {
	// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
	Category pulumi.StringInput
	// Name of the disk instance.
	DiskName pulumi.StringPtrInput
	// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
	Encrypted pulumi.BoolPtrInput
	// Ens node IDExample value: cn-chengdu-telecom.
	EnsRegionId pulumi.StringInput
	// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
	KmsKeyId pulumi.StringPtrInput
	// Billing type of the disk instanceValue: PayAsYouGo.
	PaymentType pulumi.StringInput
	// The size of the disk instance. Unit: GiB.
	Size pulumi.IntPtrInput
	// The ID of the snapshot used to create the cloud disk.
	//
	// The SnapshotId and Size parameters have the following limitations:
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
	// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
	SnapshotId pulumi.StringPtrInput
}

func (DiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*diskArgs)(nil)).Elem()
}

type DiskInput interface {
	pulumi.Input

	ToDiskOutput() DiskOutput
	ToDiskOutputWithContext(ctx context.Context) DiskOutput
}

func (*Disk) ElementType() reflect.Type {
	return reflect.TypeOf((**Disk)(nil)).Elem()
}

func (i *Disk) ToDiskOutput() DiskOutput {
	return i.ToDiskOutputWithContext(context.Background())
}

func (i *Disk) ToDiskOutputWithContext(ctx context.Context) DiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskOutput)
}

// DiskArrayInput is an input type that accepts DiskArray and DiskArrayOutput values.
// You can construct a concrete instance of `DiskArrayInput` via:
//
//	DiskArray{ DiskArgs{...} }
type DiskArrayInput interface {
	pulumi.Input

	ToDiskArrayOutput() DiskArrayOutput
	ToDiskArrayOutputWithContext(context.Context) DiskArrayOutput
}

type DiskArray []DiskInput

func (DiskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Disk)(nil)).Elem()
}

func (i DiskArray) ToDiskArrayOutput() DiskArrayOutput {
	return i.ToDiskArrayOutputWithContext(context.Background())
}

func (i DiskArray) ToDiskArrayOutputWithContext(ctx context.Context) DiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskArrayOutput)
}

// DiskMapInput is an input type that accepts DiskMap and DiskMapOutput values.
// You can construct a concrete instance of `DiskMapInput` via:
//
//	DiskMap{ "key": DiskArgs{...} }
type DiskMapInput interface {
	pulumi.Input

	ToDiskMapOutput() DiskMapOutput
	ToDiskMapOutputWithContext(context.Context) DiskMapOutput
}

type DiskMap map[string]DiskInput

func (DiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Disk)(nil)).Elem()
}

func (i DiskMap) ToDiskMapOutput() DiskMapOutput {
	return i.ToDiskMapOutputWithContext(context.Background())
}

func (i DiskMap) ToDiskMapOutputWithContext(ctx context.Context) DiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DiskMapOutput)
}

type DiskOutput struct{ *pulumi.OutputState }

func (DiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Disk)(nil)).Elem()
}

func (o DiskOutput) ToDiskOutput() DiskOutput {
	return o
}

func (o DiskOutput) ToDiskOutputWithContext(ctx context.Context) DiskOutput {
	return o
}

// Types of disk instancesValues: cloudEfficiency (high-efficiency cloud disk),cloud_ssd (full Flash cloud disk),local_hdd (local HDD),local_ssd (local ssd).
func (o DiskOutput) Category() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.Category }).(pulumi.StringOutput)
}

// Disk instance creation time.
func (o DiskOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Name of the disk instance.
func (o DiskOutput) DiskName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringPtrOutput { return v.DiskName }).(pulumi.StringPtrOutput)
}

// Indicates whether the cloud disk is Encrypted. If Encrypted = true, the default service key is used when KMSKeyId is not entered. Value range:`true`, `false`(default).
func (o DiskOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Disk) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// Ens node IDExample value: cn-chengdu-telecom.
func (o DiskOutput) EnsRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.EnsRegionId }).(pulumi.StringOutput)
}

// The ID of the KMS key used by the cloud disk. If Encrypted is set to true, the service default key is used when KMSKeyId is empty.
func (o DiskOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Billing type of the disk instanceValue: PayAsYouGo.
func (o DiskOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The size of the disk instance. Unit: GiB.
func (o DiskOutput) Size() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Disk) pulumi.IntPtrOutput { return v.Size }).(pulumi.IntPtrOutput)
}

// The ID of the snapshot used to create the cloud disk.
//
// The SnapshotId and Size parameters have the following limitations:
// - If the snapshot capacity corresponding to the **SnapshotId** parameter is greater than the specified **Size** parameter, the Size of the cloud disk created is the Size of the specified snapshot.
// - If the snapshot capacity corresponding to the **SnapshotId** parameter is less than the set **Size** parameter value, the Size of the cloud disk created is the specified **Size** parameter value.
func (o DiskOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// Status of the disk instance:Value:In-use: In useAvailable: To be mountedAttaching: AttachingDetaching: uninstallingCreating: CreatingReIniting: Resetting.
func (o DiskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Disk) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type DiskArrayOutput struct{ *pulumi.OutputState }

func (DiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Disk)(nil)).Elem()
}

func (o DiskArrayOutput) ToDiskArrayOutput() DiskArrayOutput {
	return o
}

func (o DiskArrayOutput) ToDiskArrayOutputWithContext(ctx context.Context) DiskArrayOutput {
	return o
}

func (o DiskArrayOutput) Index(i pulumi.IntInput) DiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Disk {
		return vs[0].([]*Disk)[vs[1].(int)]
	}).(DiskOutput)
}

type DiskMapOutput struct{ *pulumi.OutputState }

func (DiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Disk)(nil)).Elem()
}

func (o DiskMapOutput) ToDiskMapOutput() DiskMapOutput {
	return o
}

func (o DiskMapOutput) ToDiskMapOutputWithContext(ctx context.Context) DiskMapOutput {
	return o
}

func (o DiskMapOutput) MapIndex(k pulumi.StringInput) DiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Disk {
		return vs[0].(map[string]*Disk)[vs[1].(string)]
	}).(DiskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DiskInput)(nil)).Elem(), &Disk{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskArrayInput)(nil)).Elem(), DiskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DiskMapInput)(nil)).Elem(), DiskMap{})
	pulumi.RegisterOutputType(DiskOutput{})
	pulumi.RegisterOutputType(DiskArrayOutput{})
	pulumi.RegisterOutputType(DiskMapOutput{})
}
