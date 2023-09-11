// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides CEN Transit Router VPC Attachments available to the user.[What is Cen Transit Router VPC Attachments](https://help.aliyun.com/document_detail/261222.html)
//
// > **NOTE:** Available in 1.126.0+
func GetTransitRouterVpcAttachments(ctx *pulumi.Context, args *GetTransitRouterVpcAttachmentsArgs, opts ...pulumi.InvokeOption) (*GetTransitRouterVpcAttachmentsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetTransitRouterVpcAttachmentsResult
	err := ctx.Invoke("alicloud:cen/getTransitRouterVpcAttachments:getTransitRouterVpcAttachments", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitRouterVpcAttachments.
type GetTransitRouterVpcAttachmentsArgs struct {
	// ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// A list of resource id. The element value is same as `transitRouterId`.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
	Status *string `pulumi:"status"`
	// The transit router ID.
	TransitRouterId *string `pulumi:"transitRouterId"`
}

// A collection of values returned by getTransitRouterVpcAttachments.
type GetTransitRouterVpcAttachmentsResult struct {
	// A list of CEN Transit Router VPC Attachments. Each element contains the following attributes:
	Attachments []GetTransitRouterVpcAttachmentsAttachment `pulumi:"attachments"`
	CenId       string                                     `pulumi:"cenId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	// The status of the transit router attachment.
	Status *string `pulumi:"status"`
	// ID of the transit router.
	TransitRouterId *string `pulumi:"transitRouterId"`
}

func GetTransitRouterVpcAttachmentsOutput(ctx *pulumi.Context, args GetTransitRouterVpcAttachmentsOutputArgs, opts ...pulumi.InvokeOption) GetTransitRouterVpcAttachmentsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetTransitRouterVpcAttachmentsResult, error) {
			args := v.(GetTransitRouterVpcAttachmentsArgs)
			r, err := GetTransitRouterVpcAttachments(ctx, &args, opts...)
			var s GetTransitRouterVpcAttachmentsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetTransitRouterVpcAttachmentsResultOutput)
}

// A collection of arguments for invoking getTransitRouterVpcAttachments.
type GetTransitRouterVpcAttachmentsOutputArgs struct {
	// ID of the CEN instance.
	CenId pulumi.StringInput `pulumi:"cenId"`
	// A list of resource id. The element value is same as `transitRouterId`.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The transit router ID.
	TransitRouterId pulumi.StringPtrInput `pulumi:"transitRouterId"`
}

func (GetTransitRouterVpcAttachmentsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterVpcAttachmentsArgs)(nil)).Elem()
}

// A collection of values returned by getTransitRouterVpcAttachments.
type GetTransitRouterVpcAttachmentsResultOutput struct{ *pulumi.OutputState }

func (GetTransitRouterVpcAttachmentsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetTransitRouterVpcAttachmentsResult)(nil)).Elem()
}

func (o GetTransitRouterVpcAttachmentsResultOutput) ToGetTransitRouterVpcAttachmentsResultOutput() GetTransitRouterVpcAttachmentsResultOutput {
	return o
}

func (o GetTransitRouterVpcAttachmentsResultOutput) ToGetTransitRouterVpcAttachmentsResultOutputWithContext(ctx context.Context) GetTransitRouterVpcAttachmentsResultOutput {
	return o
}

func (o GetTransitRouterVpcAttachmentsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetTransitRouterVpcAttachmentsResult] {
	return pulumix.Output[GetTransitRouterVpcAttachmentsResult]{
		OutputState: o.OutputState,
	}
}

// A list of CEN Transit Router VPC Attachments. Each element contains the following attributes:
func (o GetTransitRouterVpcAttachmentsResultOutput) Attachments() GetTransitRouterVpcAttachmentsAttachmentArrayOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) []GetTransitRouterVpcAttachmentsAttachment {
		return v.Attachments
	}).(GetTransitRouterVpcAttachmentsAttachmentArrayOutput)
}

func (o GetTransitRouterVpcAttachmentsResultOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) string { return v.CenId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetTransitRouterVpcAttachmentsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetTransitRouterVpcAttachmentsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetTransitRouterVpcAttachmentsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The status of the transit router attachment.
func (o GetTransitRouterVpcAttachmentsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// ID of the transit router.
func (o GetTransitRouterVpcAttachmentsResultOutput) TransitRouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetTransitRouterVpcAttachmentsResult) *string { return v.TransitRouterId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetTransitRouterVpcAttachmentsResultOutput{})
}
