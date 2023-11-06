// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATED:** This datasource has been renamed to ecs.getEcsDisks from version 1.122.0.
//
// This data source provides the disks of the current Alibaba Cloud user.
//
// ## Example Usage
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
//			disksDs, err := ecs.GetDisks(ctx, &ecs.GetDisksArgs{
//				NameRegex: pulumi.StringRef("sample_disk"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstDiskId", disksDs.Disks[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDisks(ctx *pulumi.Context, args *GetDisksArgs, opts ...pulumi.InvokeOption) (*GetDisksResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDisksResult
	err := ctx.Invoke("alicloud:ecs/getDisks:getDisks", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDisks.
type GetDisksArgs struct {
	AdditionalAttributes []string `pulumi:"additionalAttributes"`
	AutoSnapshotPolicyId *string  `pulumi:"autoSnapshotPolicyId"`
	// Availability zone of the disk.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
	Category                      *string `pulumi:"category"`
	DeleteAutoSnapshot            *bool   `pulumi:"deleteAutoSnapshot"`
	DeleteWithInstance            *bool   `pulumi:"deleteWithInstance"`
	DiskName                      *string `pulumi:"diskName"`
	DiskType                      *string `pulumi:"diskType"`
	DryRun                        *bool   `pulumi:"dryRun"`
	EnableAutoSnapshot            *bool   `pulumi:"enableAutoSnapshot"`
	EnableAutomatedSnapshotPolicy *bool   `pulumi:"enableAutomatedSnapshotPolicy"`
	EnableShared                  *bool   `pulumi:"enableShared"`
	// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
	Encrypted *string `pulumi:"encrypted"`
	// A list of disks IDs.
	Ids []string `pulumi:"ids"`
	// Filter the results by the specified ECS instance ID.
	InstanceId *string `pulumi:"instanceId"`
	KmsKeyId   *string `pulumi:"kmsKeyId"`
	// A regex string to filter results by disk name.
	NameRegex      *string                 `pulumi:"nameRegex"`
	OperationLocks []GetDisksOperationLock `pulumi:"operationLocks"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  *string `pulumi:"outputFile"`
	PageNumber  *int    `pulumi:"pageNumber"`
	PageSize    *int    `pulumi:"pageSize"`
	PaymentType *string `pulumi:"paymentType"`
	Portable    *bool   `pulumi:"portable"`
	// The Id of resource group which the disk belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
	SnapshotId *string `pulumi:"snapshotId"`
	// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the disks. It must be in the format:
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
	// 		_, err := ecs.GetDisks(ctx, &ecs.GetDisksArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 				"tagKey2": "tagValue2",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags map[string]interface{} `pulumi:"tags"`
	// Disk type. Possible values: `system` and `data`.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
	Type   *string `pulumi:"type"`
	ZoneId *string `pulumi:"zoneId"`
}

// A collection of values returned by getDisks.
type GetDisksResult struct {
	AdditionalAttributes []string `pulumi:"additionalAttributes"`
	AutoSnapshotPolicyId *string  `pulumi:"autoSnapshotPolicyId"`
	// Availability zone of the disk.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
	Category           *string `pulumi:"category"`
	DeleteAutoSnapshot *bool   `pulumi:"deleteAutoSnapshot"`
	DeleteWithInstance *bool   `pulumi:"deleteWithInstance"`
	DiskName           *string `pulumi:"diskName"`
	DiskType           *string `pulumi:"diskType"`
	// A list of disks. Each element contains the following attributes:
	Disks                         []GetDisksDisk `pulumi:"disks"`
	DryRun                        *bool          `pulumi:"dryRun"`
	EnableAutoSnapshot            *bool          `pulumi:"enableAutoSnapshot"`
	EnableAutomatedSnapshotPolicy *bool          `pulumi:"enableAutomatedSnapshotPolicy"`
	EnableShared                  *bool          `pulumi:"enableShared"`
	// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
	Encrypted *string `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id  string   `pulumi:"id"`
	Ids []string `pulumi:"ids"`
	// ID of the related instance. It is `null` unless the `status` is `In_use`.
	InstanceId     *string                 `pulumi:"instanceId"`
	KmsKeyId       *string                 `pulumi:"kmsKeyId"`
	NameRegex      *string                 `pulumi:"nameRegex"`
	Names          []string                `pulumi:"names"`
	OperationLocks []GetDisksOperationLock `pulumi:"operationLocks"`
	OutputFile     *string                 `pulumi:"outputFile"`
	PageNumber     *int                    `pulumi:"pageNumber"`
	PageSize       *int                    `pulumi:"pageSize"`
	PaymentType    *string                 `pulumi:"paymentType"`
	Portable       *bool                   `pulumi:"portable"`
	// The Id of resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
	SnapshotId *string `pulumi:"snapshotId"`
	// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
	Status *string `pulumi:"status"`
	// A map of tags assigned to the disk.
	Tags       map[string]interface{} `pulumi:"tags"`
	TotalCount int                    `pulumi:"totalCount"`
	// Disk type. Possible values: `system` and `data`.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
	Type   *string `pulumi:"type"`
	ZoneId *string `pulumi:"zoneId"`
}

func GetDisksOutput(ctx *pulumi.Context, args GetDisksOutputArgs, opts ...pulumi.InvokeOption) GetDisksResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDisksResult, error) {
			args := v.(GetDisksArgs)
			r, err := GetDisks(ctx, &args, opts...)
			var s GetDisksResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDisksResultOutput)
}

// A collection of arguments for invoking getDisks.
type GetDisksOutputArgs struct {
	AdditionalAttributes pulumi.StringArrayInput `pulumi:"additionalAttributes"`
	AutoSnapshotPolicyId pulumi.StringPtrInput   `pulumi:"autoSnapshotPolicyId"`
	// Availability zone of the disk.
	//
	// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
	AvailabilityZone pulumi.StringPtrInput `pulumi:"availabilityZone"`
	// Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
	Category                      pulumi.StringPtrInput `pulumi:"category"`
	DeleteAutoSnapshot            pulumi.BoolPtrInput   `pulumi:"deleteAutoSnapshot"`
	DeleteWithInstance            pulumi.BoolPtrInput   `pulumi:"deleteWithInstance"`
	DiskName                      pulumi.StringPtrInput `pulumi:"diskName"`
	DiskType                      pulumi.StringPtrInput `pulumi:"diskType"`
	DryRun                        pulumi.BoolPtrInput   `pulumi:"dryRun"`
	EnableAutoSnapshot            pulumi.BoolPtrInput   `pulumi:"enableAutoSnapshot"`
	EnableAutomatedSnapshotPolicy pulumi.BoolPtrInput   `pulumi:"enableAutomatedSnapshotPolicy"`
	EnableShared                  pulumi.BoolPtrInput   `pulumi:"enableShared"`
	// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
	Encrypted pulumi.StringPtrInput `pulumi:"encrypted"`
	// A list of disks IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Filter the results by the specified ECS instance ID.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	KmsKeyId   pulumi.StringPtrInput `pulumi:"kmsKeyId"`
	// A regex string to filter results by disk name.
	NameRegex      pulumi.StringPtrInput           `pulumi:"nameRegex"`
	OperationLocks GetDisksOperationLockArrayInput `pulumi:"operationLocks"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile  pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber  pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize    pulumi.IntPtrInput    `pulumi:"pageSize"`
	PaymentType pulumi.StringPtrInput `pulumi:"paymentType"`
	Portable    pulumi.BoolPtrInput   `pulumi:"portable"`
	// The Id of resource group which the disk belongs.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
	SnapshotId pulumi.StringPtrInput `pulumi:"snapshotId"`
	// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// A map of tags assigned to the disks. It must be in the format:
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
	// 		_, err := ecs.GetDisks(ctx, &ecs.GetDisksArgs{
	// 			Tags: map[string]interface{}{
	// 				"tagKey1": "tagValue1",
	// 				"tagKey2": "tagValue2",
	// 			},
	// 		}, nil)
	// 		if err != nil {
	// 			return err
	// 		}
	// 		return nil
	// 	})
	// }
	// ```
	Tags pulumi.MapInput `pulumi:"tags"`
	// Disk type. Possible values: `system` and `data`.
	//
	// Deprecated: Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
	Type   pulumi.StringPtrInput `pulumi:"type"`
	ZoneId pulumi.StringPtrInput `pulumi:"zoneId"`
}

func (GetDisksOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDisksArgs)(nil)).Elem()
}

// A collection of values returned by getDisks.
type GetDisksResultOutput struct{ *pulumi.OutputState }

func (GetDisksResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDisksResult)(nil)).Elem()
}

func (o GetDisksResultOutput) ToGetDisksResultOutput() GetDisksResultOutput {
	return o
}

func (o GetDisksResultOutput) ToGetDisksResultOutputWithContext(ctx context.Context) GetDisksResultOutput {
	return o
}

func (o GetDisksResultOutput) AdditionalAttributes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDisksResult) []string { return v.AdditionalAttributes }).(pulumi.StringArrayOutput)
}

func (o GetDisksResultOutput) AutoSnapshotPolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.AutoSnapshotPolicyId }).(pulumi.StringPtrOutput)
}

// Availability zone of the disk.
//
// Deprecated: Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
func (o GetDisksResultOutput) AvailabilityZone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.AvailabilityZone }).(pulumi.StringPtrOutput)
}

// Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
func (o GetDisksResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) DeleteAutoSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.DeleteAutoSnapshot }).(pulumi.BoolPtrOutput)
}

func (o GetDisksResultOutput) DeleteWithInstance() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.DeleteWithInstance }).(pulumi.BoolPtrOutput)
}

func (o GetDisksResultOutput) DiskName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.DiskName }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) DiskType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.DiskType }).(pulumi.StringPtrOutput)
}

// A list of disks. Each element contains the following attributes:
func (o GetDisksResultOutput) Disks() GetDisksDiskArrayOutput {
	return o.ApplyT(func(v GetDisksResult) []GetDisksDisk { return v.Disks }).(GetDisksDiskArrayOutput)
}

func (o GetDisksResultOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.DryRun }).(pulumi.BoolPtrOutput)
}

func (o GetDisksResultOutput) EnableAutoSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.EnableAutoSnapshot }).(pulumi.BoolPtrOutput)
}

func (o GetDisksResultOutput) EnableAutomatedSnapshotPolicy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.EnableAutomatedSnapshotPolicy }).(pulumi.BoolPtrOutput)
}

func (o GetDisksResultOutput) EnableShared() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.EnableShared }).(pulumi.BoolPtrOutput)
}

// Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
func (o GetDisksResultOutput) Encrypted() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.Encrypted }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDisksResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDisksResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDisksResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDisksResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// ID of the related instance. It is `null` unless the `status` is `In_use`.
func (o GetDisksResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDisksResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetDisksResultOutput) OperationLocks() GetDisksOperationLockArrayOutput {
	return o.ApplyT(func(v GetDisksResult) []GetDisksOperationLock { return v.OperationLocks }).(GetDisksOperationLockArrayOutput)
}

func (o GetDisksResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetDisksResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetDisksResultOutput) PaymentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.PaymentType }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) Portable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *bool { return v.Portable }).(pulumi.BoolPtrOutput)
}

// The Id of resource group.
func (o GetDisksResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
func (o GetDisksResultOutput) SnapshotId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.SnapshotId }).(pulumi.StringPtrOutput)
}

// Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
func (o GetDisksResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// A map of tags assigned to the disk.
func (o GetDisksResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetDisksResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func (o GetDisksResultOutput) TotalCount() pulumi.IntOutput {
	return o.ApplyT(func(v GetDisksResult) int { return v.TotalCount }).(pulumi.IntOutput)
}

// Disk type. Possible values: `system` and `data`.
//
// Deprecated: Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
func (o GetDisksResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func (o GetDisksResultOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDisksResult) *string { return v.ZoneId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDisksResultOutput{})
}
