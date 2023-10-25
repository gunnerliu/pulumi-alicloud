// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package expressconnect

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides Express Connect Vbr Pconn Association available to the user.
//
// > **NOTE:** Available in 1.196.0+
func GetVbrPconnAssociations(ctx *pulumi.Context, args *GetVbrPconnAssociationsArgs, opts ...pulumi.InvokeOption) (*GetVbrPconnAssociationsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVbrPconnAssociationsResult
	err := ctx.Invoke("alicloud:expressconnect/getVbrPconnAssociations:getVbrPconnAssociations", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVbrPconnAssociations.
type GetVbrPconnAssociationsArgs struct {
	// A list of Vbr Pconn Association IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The ID of the VBR instance.
	VbrId *string `pulumi:"vbrId"`
}

// A collection of values returned by getVbrPconnAssociations.
type GetVbrPconnAssociationsResult struct {
	// A list of Vbr Pconn Association Entries. Each element contains the following attributes:
	Associations []GetVbrPconnAssociationsAssociation `pulumi:"associations"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Ids        []string `pulumi:"ids"`
	OutputFile *string  `pulumi:"outputFile"`
	PageNumber *int     `pulumi:"pageNumber"`
	PageSize   *int     `pulumi:"pageSize"`
	// The ID of the VBR instance.
	VbrId *string `pulumi:"vbrId"`
}

func GetVbrPconnAssociationsOutput(ctx *pulumi.Context, args GetVbrPconnAssociationsOutputArgs, opts ...pulumi.InvokeOption) GetVbrPconnAssociationsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVbrPconnAssociationsResult, error) {
			args := v.(GetVbrPconnAssociationsArgs)
			r, err := GetVbrPconnAssociations(ctx, &args, opts...)
			var s GetVbrPconnAssociationsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVbrPconnAssociationsResultOutput)
}

// A collection of arguments for invoking getVbrPconnAssociations.
type GetVbrPconnAssociationsOutputArgs struct {
	// A list of Vbr Pconn Association IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The ID of the VBR instance.
	VbrId pulumi.StringPtrInput `pulumi:"vbrId"`
}

func (GetVbrPconnAssociationsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVbrPconnAssociationsArgs)(nil)).Elem()
}

// A collection of values returned by getVbrPconnAssociations.
type GetVbrPconnAssociationsResultOutput struct{ *pulumi.OutputState }

func (GetVbrPconnAssociationsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVbrPconnAssociationsResult)(nil)).Elem()
}

func (o GetVbrPconnAssociationsResultOutput) ToGetVbrPconnAssociationsResultOutput() GetVbrPconnAssociationsResultOutput {
	return o
}

func (o GetVbrPconnAssociationsResultOutput) ToGetVbrPconnAssociationsResultOutputWithContext(ctx context.Context) GetVbrPconnAssociationsResultOutput {
	return o
}

func (o GetVbrPconnAssociationsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetVbrPconnAssociationsResult] {
	return pulumix.Output[GetVbrPconnAssociationsResult]{
		OutputState: o.OutputState,
	}
}

// A list of Vbr Pconn Association Entries. Each element contains the following attributes:
func (o GetVbrPconnAssociationsResultOutput) Associations() GetVbrPconnAssociationsAssociationArrayOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) []GetVbrPconnAssociationsAssociation { return v.Associations }).(GetVbrPconnAssociationsAssociationArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVbrPconnAssociationsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVbrPconnAssociationsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetVbrPconnAssociationsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetVbrPconnAssociationsResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetVbrPconnAssociationsResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

// The ID of the VBR instance.
func (o GetVbrPconnAssociationsResultOutput) VbrId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVbrPconnAssociationsResult) *string { return v.VbrId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVbrPconnAssociationsResultOutput{})
}
