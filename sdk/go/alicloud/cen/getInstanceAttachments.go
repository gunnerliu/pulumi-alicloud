// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides Cen Instance Attachments of the current Alibaba Cloud User.
//
// > **NOTE:** Available in v1.97.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cen.GetInstanceAttachments(ctx, &cen.GetInstanceAttachmentsArgs{
//				InstanceId: "cen-o40h17ll9w********",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("theFirstAttachmentedInstanceId", example.Attachments[0].ChildInstanceId)
//			return nil
//		})
//	}
//
// ```
func GetInstanceAttachments(ctx *pulumi.Context, args *GetInstanceAttachmentsArgs, opts ...pulumi.InvokeOption) (*GetInstanceAttachmentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceAttachmentsResult
	err := ctx.Invoke("alicloud:cen/getInstanceAttachments:getInstanceAttachments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceAttachments.
type GetInstanceAttachmentsArgs struct {
	// The region to which the network to be queried belongs.
	ChildInstanceRegionId *string `pulumi:"childInstanceRegionId"`
	// The type of the associated network. Valid values: `VPC`, `VBR` and `CCN`.
	ChildInstanceType *string `pulumi:"childInstanceType"`
	// The ID of the CEN instance.
	InstanceId string `pulumi:"instanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the Cen Child Instance Attachment. Valid value: `Attaching`, `Attached` and `Aetaching`.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getInstanceAttachments.
type GetInstanceAttachmentsResult struct {
	// A list of CEN Instance Attachments. Each element contains the following attributes:
	Attachments []GetInstanceAttachmentsAttachment `pulumi:"attachments"`
	// The ID of the region to which the network belongs.
	ChildInstanceRegionId *string `pulumi:"childInstanceRegionId"`
	// The type of the associated network.
	ChildInstanceType *string `pulumi:"childInstanceType"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of CEN Instance Attachment IDs.
	Ids []string `pulumi:"ids"`
	// The ID of the CEN instance.
	InstanceId string  `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// The status of the network.
	Status *string `pulumi:"status"`
}

func GetInstanceAttachmentsOutput(ctx *pulumi.Context, args GetInstanceAttachmentsOutputArgs, opts ...pulumi.InvokeOption) GetInstanceAttachmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceAttachmentsResult, error) {
			args := v.(GetInstanceAttachmentsArgs)
			r, err := GetInstanceAttachments(ctx, &args, opts...)
			var s GetInstanceAttachmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceAttachmentsResultOutput)
}

// A collection of arguments for invoking getInstanceAttachments.
type GetInstanceAttachmentsOutputArgs struct {
	// The region to which the network to be queried belongs.
	ChildInstanceRegionId pulumi.StringPtrInput `pulumi:"childInstanceRegionId"`
	// The type of the associated network. Valid values: `VPC`, `VBR` and `CCN`.
	ChildInstanceType pulumi.StringPtrInput `pulumi:"childInstanceType"`
	// The ID of the CEN instance.
	InstanceId pulumi.StringInput `pulumi:"instanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the Cen Child Instance Attachment. Valid value: `Attaching`, `Attached` and `Aetaching`.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetInstanceAttachmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceAttachmentsArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceAttachments.
type GetInstanceAttachmentsResultOutput struct{ *pulumi.OutputState }

func (GetInstanceAttachmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceAttachmentsResult)(nil)).Elem()
}

func (o GetInstanceAttachmentsResultOutput) ToGetInstanceAttachmentsResultOutput() GetInstanceAttachmentsResultOutput {
	return o
}

func (o GetInstanceAttachmentsResultOutput) ToGetInstanceAttachmentsResultOutputWithContext(ctx context.Context) GetInstanceAttachmentsResultOutput {
	return o
}

// A list of CEN Instance Attachments. Each element contains the following attributes:
func (o GetInstanceAttachmentsResultOutput) Attachments() GetInstanceAttachmentsAttachmentArrayOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) []GetInstanceAttachmentsAttachment { return v.Attachments }).(GetInstanceAttachmentsAttachmentArrayOutput)
}

// The ID of the region to which the network belongs.
func (o GetInstanceAttachmentsResultOutput) ChildInstanceRegionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) *string { return v.ChildInstanceRegionId }).(pulumi.StringPtrOutput)
}

// The type of the associated network.
func (o GetInstanceAttachmentsResultOutput) ChildInstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) *string { return v.ChildInstanceType }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstanceAttachmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of CEN Instance Attachment IDs.
func (o GetInstanceAttachmentsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// The ID of the CEN instance.
func (o GetInstanceAttachmentsResultOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) string { return v.InstanceId }).(pulumi.StringOutput)
}

func (o GetInstanceAttachmentsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the network.
func (o GetInstanceAttachmentsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceAttachmentsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceAttachmentsResultOutput{})
}
