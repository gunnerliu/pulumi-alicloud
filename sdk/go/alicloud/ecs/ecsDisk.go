// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Disk resource.
//
// For information about ECS Disk and how to use it, see [What is Disk](https://www.alibabacloud.com/help/en/doc-detail/25513.htm).
//
// > **NOTE:** Available in v1.122.0+.
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
//			_, err := ecs.NewEcsDisk(ctx, "example", &ecs.EcsDiskArgs{
//				Category:    pulumi.String("cloud_efficiency"),
//				Description: pulumi.String("Hello ecs disk."),
//				DiskName:    pulumi.String("tf-test"),
//				Encrypted:   pulumi.Bool(true),
//				KmsKeyId:    pulumi.String("2a6767f0-a16c-4679-a60f-13bf*****"),
//				Size:        pulumi.Int(30),
//				Tags: pulumi.AnyMap{
//					"Name": pulumi.Any("TerraformTest"),
//				},
//				ZoneId: pulumi.String("cn-beijing-b"),
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
// ECS Disk can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/ecsDisk:EcsDisk example d-abcd12345
//
// ```
type EcsDisk struct {
	pulumi.CustomResourceState

	AdvancedFeatures pulumi.StringPtrOutput `pulumi:"advancedFeatures"`
	// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
	Category                       pulumi.StringPtrOutput `pulumi:"category"`
	DedicatedBlockStorageClusterId pulumi.StringPtrOutput `pulumi:"dedicatedBlockStorageClusterId"`
	// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
	DeleteAutoSnapshot pulumi.BoolPtrOutput `pulumi:"deleteAutoSnapshot"`
	// Indicates whether the disk is released together with the instance. Default value: `false`.
	DeleteWithInstance pulumi.BoolOutput `pulumi:"deleteWithInstance"`
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
	DiskName pulumi.StringOutput `pulumi:"diskName"`
	// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Indicates whether to enable creating snapshot automatically.
	EnableAutoSnapshot pulumi.BoolOutput      `pulumi:"enableAutoSnapshot"`
	EncryptAlgorithm   pulumi.StringPtrOutput `pulumi:"encryptAlgorithm"`
	// If true, the disk will be encrypted, conflict with `snapshotId`.
	Encrypted pulumi.BoolPtrOutput `pulumi:"encrypted"`
	// The ID of the instance to which the created subscription disk is automatically attached.
	// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
	// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
	PerformanceLevel pulumi.StringOutput `pulumi:"performanceLevel"`
	// The Id of resource group which the disk belongs.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
	Size pulumi.IntOutput `pulumi:"size"`
	// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
	SnapshotId pulumi.StringPtrOutput `pulumi:"snapshotId"`
	// The disk status.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the storage set.
	StorageSetId pulumi.StringPtrOutput `pulumi:"storageSetId"`
	// The number of partitions in the storage set.
	StorageSetPartitionNumber pulumi.IntPtrOutput `pulumi:"storageSetPartitionNumber"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewEcsDisk registers a new resource with the given unique name, arguments, and options.
func NewEcsDisk(ctx *pulumi.Context,
	name string, args *EcsDiskArgs, opts ...pulumi.ResourceOption) (*EcsDisk, error) {
	if args == nil {
		args = &EcsDiskArgs{}
	}

	var resource EcsDisk
	err := ctx.RegisterResource("alicloud:ecs/ecsDisk:EcsDisk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsDisk gets an existing EcsDisk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsDiskState, opts ...pulumi.ResourceOption) (*EcsDisk, error) {
	var resource EcsDisk
	err := ctx.ReadResource("alicloud:ecs/ecsDisk:EcsDisk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsDisk resources.
type ecsDiskState struct {
	AdvancedFeatures *string `pulumi:"advancedFeatures"`
	// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
	Category                       *string `pulumi:"category"`
	DedicatedBlockStorageClusterId *string `pulumi:"dedicatedBlockStorageClusterId"`
	// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
	DeleteAutoSnapshot *bool `pulumi:"deleteAutoSnapshot"`
	// Indicates whether the disk is released together with the instance. Default value: `false`.
	DeleteWithInstance *bool `pulumi:"deleteWithInstance"`
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description *string `pulumi:"description"`
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
	DiskName *string `pulumi:"diskName"`
	// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Indicates whether to enable creating snapshot automatically.
	EnableAutoSnapshot *bool   `pulumi:"enableAutoSnapshot"`
	EncryptAlgorithm   *string `pulumi:"encryptAlgorithm"`
	// If true, the disk will be encrypted, conflict with `snapshotId`.
	Encrypted *bool `pulumi:"encrypted"`
	// The ID of the instance to which the created subscription disk is automatically attached.
	// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
	// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	InstanceId *string `pulumi:"instanceId"`
	// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
	Name *string `pulumi:"name"`
	// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
	PaymentType *string `pulumi:"paymentType"`
	// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// The Id of resource group which the disk belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
	Size *int `pulumi:"size"`
	// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
	SnapshotId *string `pulumi:"snapshotId"`
	// The disk status.
	Status *string `pulumi:"status"`
	// The ID of the storage set.
	StorageSetId *string `pulumi:"storageSetId"`
	// The number of partitions in the storage set.
	StorageSetPartitionNumber *int `pulumi:"storageSetPartitionNumber"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
	Type *string `pulumi:"type"`
	// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	ZoneId *string `pulumi:"zoneId"`
}

type EcsDiskState struct {
	AdvancedFeatures pulumi.StringPtrInput
	// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone pulumi.StringPtrInput
	// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
	Category                       pulumi.StringPtrInput
	DedicatedBlockStorageClusterId pulumi.StringPtrInput
	// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// Indicates whether the disk is released together with the instance. Default value: `false`.
	DeleteWithInstance pulumi.BoolPtrInput
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrInput
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
	DiskName pulumi.StringPtrInput
	// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
	DryRun pulumi.BoolPtrInput
	// Indicates whether to enable creating snapshot automatically.
	EnableAutoSnapshot pulumi.BoolPtrInput
	EncryptAlgorithm   pulumi.StringPtrInput
	// If true, the disk will be encrypted, conflict with `snapshotId`.
	Encrypted pulumi.BoolPtrInput
	// The ID of the instance to which the created subscription disk is automatically attached.
	// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
	// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	InstanceId pulumi.StringPtrInput
	// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
	KmsKeyId pulumi.StringPtrInput
	// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
	Name pulumi.StringPtrInput
	// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
	PaymentType pulumi.StringPtrInput
	// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
	PerformanceLevel pulumi.StringPtrInput
	// The Id of resource group which the disk belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
	Size pulumi.IntPtrInput
	// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
	SnapshotId pulumi.StringPtrInput
	// The disk status.
	Status pulumi.StringPtrInput
	// The ID of the storage set.
	StorageSetId pulumi.StringPtrInput
	// The number of partitions in the storage set.
	StorageSetPartitionNumber pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
	Type pulumi.StringPtrInput
	// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	ZoneId pulumi.StringPtrInput
}

func (EcsDiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsDiskState)(nil)).Elem()
}

type ecsDiskArgs struct {
	AdvancedFeatures *string `pulumi:"advancedFeatures"`
	// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
	Category                       *string `pulumi:"category"`
	DedicatedBlockStorageClusterId *string `pulumi:"dedicatedBlockStorageClusterId"`
	// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
	DeleteAutoSnapshot *bool `pulumi:"deleteAutoSnapshot"`
	// Indicates whether the disk is released together with the instance. Default value: `false`.
	DeleteWithInstance *bool `pulumi:"deleteWithInstance"`
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description *string `pulumi:"description"`
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
	DiskName *string `pulumi:"diskName"`
	// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
	DryRun *bool `pulumi:"dryRun"`
	// Indicates whether to enable creating snapshot automatically.
	EnableAutoSnapshot *bool   `pulumi:"enableAutoSnapshot"`
	EncryptAlgorithm   *string `pulumi:"encryptAlgorithm"`
	// If true, the disk will be encrypted, conflict with `snapshotId`.
	Encrypted *bool `pulumi:"encrypted"`
	// The ID of the instance to which the created subscription disk is automatically attached.
	// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
	// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	InstanceId *string `pulumi:"instanceId"`
	// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
	Name *string `pulumi:"name"`
	// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
	PaymentType *string `pulumi:"paymentType"`
	// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
	PerformanceLevel *string `pulumi:"performanceLevel"`
	// The Id of resource group which the disk belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
	Size *int `pulumi:"size"`
	// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
	SnapshotId *string `pulumi:"snapshotId"`
	// The ID of the storage set.
	StorageSetId *string `pulumi:"storageSetId"`
	// The number of partitions in the storage set.
	StorageSetPartitionNumber *int `pulumi:"storageSetPartitionNumber"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
	Type *string `pulumi:"type"`
	// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a EcsDisk resource.
type EcsDiskArgs struct {
	AdvancedFeatures pulumi.StringPtrInput
	// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone pulumi.StringPtrInput
	// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
	Category                       pulumi.StringPtrInput
	DedicatedBlockStorageClusterId pulumi.StringPtrInput
	// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
	DeleteAutoSnapshot pulumi.BoolPtrInput
	// Indicates whether the disk is released together with the instance. Default value: `false`.
	DeleteWithInstance pulumi.BoolPtrInput
	// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrInput
	// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
	DiskName pulumi.StringPtrInput
	// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
	DryRun pulumi.BoolPtrInput
	// Indicates whether to enable creating snapshot automatically.
	EnableAutoSnapshot pulumi.BoolPtrInput
	EncryptAlgorithm   pulumi.StringPtrInput
	// If true, the disk will be encrypted, conflict with `snapshotId`.
	Encrypted pulumi.BoolPtrInput
	// The ID of the instance to which the created subscription disk is automatically attached.
	// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
	// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	InstanceId pulumi.StringPtrInput
	// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
	KmsKeyId pulumi.StringPtrInput
	// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
	Name pulumi.StringPtrInput
	// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
	PaymentType pulumi.StringPtrInput
	// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
	PerformanceLevel pulumi.StringPtrInput
	// The Id of resource group which the disk belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
	Size pulumi.IntPtrInput
	// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
	SnapshotId pulumi.StringPtrInput
	// The ID of the storage set.
	StorageSetId pulumi.StringPtrInput
	// The number of partitions in the storage set.
	StorageSetPartitionNumber pulumi.IntPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
	Type pulumi.StringPtrInput
	// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
	ZoneId pulumi.StringPtrInput
}

func (EcsDiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsDiskArgs)(nil)).Elem()
}

type EcsDiskInput interface {
	pulumi.Input

	ToEcsDiskOutput() EcsDiskOutput
	ToEcsDiskOutputWithContext(ctx context.Context) EcsDiskOutput
}

func (*EcsDisk) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsDisk)(nil)).Elem()
}

func (i *EcsDisk) ToEcsDiskOutput() EcsDiskOutput {
	return i.ToEcsDiskOutputWithContext(context.Background())
}

func (i *EcsDisk) ToEcsDiskOutputWithContext(ctx context.Context) EcsDiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDiskOutput)
}

// EcsDiskArrayInput is an input type that accepts EcsDiskArray and EcsDiskArrayOutput values.
// You can construct a concrete instance of `EcsDiskArrayInput` via:
//
//	EcsDiskArray{ EcsDiskArgs{...} }
type EcsDiskArrayInput interface {
	pulumi.Input

	ToEcsDiskArrayOutput() EcsDiskArrayOutput
	ToEcsDiskArrayOutputWithContext(context.Context) EcsDiskArrayOutput
}

type EcsDiskArray []EcsDiskInput

func (EcsDiskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsDisk)(nil)).Elem()
}

func (i EcsDiskArray) ToEcsDiskArrayOutput() EcsDiskArrayOutput {
	return i.ToEcsDiskArrayOutputWithContext(context.Background())
}

func (i EcsDiskArray) ToEcsDiskArrayOutputWithContext(ctx context.Context) EcsDiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDiskArrayOutput)
}

// EcsDiskMapInput is an input type that accepts EcsDiskMap and EcsDiskMapOutput values.
// You can construct a concrete instance of `EcsDiskMapInput` via:
//
//	EcsDiskMap{ "key": EcsDiskArgs{...} }
type EcsDiskMapInput interface {
	pulumi.Input

	ToEcsDiskMapOutput() EcsDiskMapOutput
	ToEcsDiskMapOutputWithContext(context.Context) EcsDiskMapOutput
}

type EcsDiskMap map[string]EcsDiskInput

func (EcsDiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsDisk)(nil)).Elem()
}

func (i EcsDiskMap) ToEcsDiskMapOutput() EcsDiskMapOutput {
	return i.ToEcsDiskMapOutputWithContext(context.Background())
}

func (i EcsDiskMap) ToEcsDiskMapOutputWithContext(ctx context.Context) EcsDiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDiskMapOutput)
}

type EcsDiskOutput struct{ *pulumi.OutputState }

func (EcsDiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsDisk)(nil)).Elem()
}

func (o EcsDiskOutput) ToEcsDiskOutput() EcsDiskOutput {
	return o
}

func (o EcsDiskOutput) ToEcsDiskOutputWithContext(ctx context.Context) EcsDiskOutput {
	return o
}

func (o EcsDiskOutput) AdvancedFeatures() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.AdvancedFeatures }).(pulumi.StringPtrOutput)
}

// Field `availabilityZone` has been deprecated from provider version 1.122.0. New field `zoneId` instead.
//
// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
func (o EcsDiskOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// Category of the disk. Valid values are `cloud`, `cloudEfficiency`, `cloudSsd`, `cloudEssd`, `cloudAuto`. Default is `cloudEfficiency`.
func (o EcsDiskOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.Category }).(pulumi.StringPtrOutput)
}

func (o EcsDiskOutput) DedicatedBlockStorageClusterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.DedicatedBlockStorageClusterId }).(pulumi.StringPtrOutput)
}

// Indicates whether the automatic snapshot is deleted when the disk is released. Default value: `false`.
func (o EcsDiskOutput) DeleteAutoSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.BoolPtrOutput { return v.DeleteAutoSnapshot }).(pulumi.BoolPtrOutput)
}

// Indicates whether the disk is released together with the instance. Default value: `false`.
func (o EcsDiskOutput) DeleteWithInstance() pulumi.BoolOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.BoolOutput { return v.DeleteWithInstance }).(pulumi.BoolOutput)
}

// Description of the disk. This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
func (o EcsDiskOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the ECS disk. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with `http://` or `https://`. Default value is `null`.
func (o EcsDiskOutput) DiskName() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.DiskName }).(pulumi.StringOutput)
}

// Specifies whether to check the validity of the request without actually making the request.request Default value: false. Valid values:
func (o EcsDiskOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Indicates whether to enable creating snapshot automatically.
func (o EcsDiskOutput) EnableAutoSnapshot() pulumi.BoolOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.BoolOutput { return v.EnableAutoSnapshot }).(pulumi.BoolOutput)
}

func (o EcsDiskOutput) EncryptAlgorithm() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.EncryptAlgorithm }).(pulumi.StringPtrOutput)
}

// If true, the disk will be encrypted, conflict with `snapshotId`.
func (o EcsDiskOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// The ID of the instance to which the created subscription disk is automatically attached.
// * After you specify the instance ID, the specified `resourceGroupId`, `tags`, and `kmsKeyId` parameters are ignored.
// * One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
func (o EcsDiskOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The ID of the KMS key corresponding to the data disk, The specified parameter `Encrypted` must be `true` when KmsKeyId is not empty.
func (o EcsDiskOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// Field `name` has been deprecated from provider version 1.122.0. New field `diskName` instead.
//
// Deprecated: Field 'name' has been deprecated from provider version 1.122.0. New field 'disk_name' instead.
func (o EcsDiskOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Payment method for disk. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`. If you want to change the disk payment type, the `instanceId` is required.
func (o EcsDiskOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// Specifies the performance level of an ESSD when you create the ESSD. Valid values:
func (o EcsDiskOutput) PerformanceLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.PerformanceLevel }).(pulumi.StringOutput)
}

// The Id of resource group which the disk belongs.
func (o EcsDiskOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The size of the disk in GiBs. When resize the disk, the new size must be greater than the former value, or you would get an error `InvalidDiskSize.TooSmall`.
func (o EcsDiskOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// A snapshot to base the disk off of. If the disk size required by snapshot is greater than `size`, the `size` will be ignored, conflict with `encrypted`.
func (o EcsDiskOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// The disk status.
func (o EcsDiskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the storage set.
func (o EcsDiskOutput) StorageSetId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.StorageSetId }).(pulumi.StringPtrOutput)
}

// The number of partitions in the storage set.
func (o EcsDiskOutput) StorageSetPartitionNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.IntPtrOutput { return v.StorageSetPartitionNumber }).(pulumi.IntPtrOutput)
}

// A mapping of tags to assign to the resource.
func (o EcsDiskOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The type to expand cloud disks. Valid Values: `online`, `offline`. Default to `offline`.
func (o EcsDiskOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

// ID of the free zone to which the disk belongs. One of the `zoneId` and `instanceId` must be set but can not be set at the same time.
func (o EcsDiskOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsDisk) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type EcsDiskArrayOutput struct{ *pulumi.OutputState }

func (EcsDiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsDisk)(nil)).Elem()
}

func (o EcsDiskArrayOutput) ToEcsDiskArrayOutput() EcsDiskArrayOutput {
	return o
}

func (o EcsDiskArrayOutput) ToEcsDiskArrayOutputWithContext(ctx context.Context) EcsDiskArrayOutput {
	return o
}

func (o EcsDiskArrayOutput) Index(i pulumi.IntInput) EcsDiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsDisk {
		return vs[0].([]*EcsDisk)[vs[1].(int)]
	}).(EcsDiskOutput)
}

type EcsDiskMapOutput struct{ *pulumi.OutputState }

func (EcsDiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsDisk)(nil)).Elem()
}

func (o EcsDiskMapOutput) ToEcsDiskMapOutput() EcsDiskMapOutput {
	return o
}

func (o EcsDiskMapOutput) ToEcsDiskMapOutputWithContext(ctx context.Context) EcsDiskMapOutput {
	return o
}

func (o EcsDiskMapOutput) MapIndex(k pulumi.StringInput) EcsDiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsDisk {
		return vs[0].(map[string]*EcsDisk)[vs[1].(string)]
	}).(EcsDiskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDiskInput)(nil)).Elem(), &EcsDisk{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDiskArrayInput)(nil)).Elem(), EcsDiskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDiskMapInput)(nil)).Elem(), EcsDiskMap{})
	pulumi.RegisterOutputType(EcsDiskOutput{})
	pulumi.RegisterOutputType(EcsDiskArrayOutput{})
	pulumi.RegisterOutputType(EcsDiskMapOutput{})
}
