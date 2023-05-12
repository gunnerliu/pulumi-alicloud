// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sddp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Sddp Data Limits of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.159.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sddp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := sddp.GetDataLimits(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("sddpDataLimitId1", ids.Limits[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetDataLimits(ctx *pulumi.Context, args *GetDataLimitsArgs, opts ...pulumi.InvokeOption) (*GetDataLimitsResult, error) {
	var rv GetDataLimitsResult
	err := ctx.Invoke("alicloud:sddp/getDataLimits:getDataLimits", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDataLimits.
type GetDataLimitsArgs struct {
	// A list of Data Limit IDs.
	Ids []string `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the data asset.
	ParentId *string `pulumi:"parentId"`
	// The type of the service to which the data asset belongs.
	ResourceType *string `pulumi:"resourceType"`
}

// A collection of values returned by getDataLimits.
type GetDataLimitsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id           string               `pulumi:"id"`
	Ids          []string             `pulumi:"ids"`
	Limits       []GetDataLimitsLimit `pulumi:"limits"`
	OutputFile   *string              `pulumi:"outputFile"`
	ParentId     *string              `pulumi:"parentId"`
	ResourceType *string              `pulumi:"resourceType"`
}

func GetDataLimitsOutput(ctx *pulumi.Context, args GetDataLimitsOutputArgs, opts ...pulumi.InvokeOption) GetDataLimitsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDataLimitsResult, error) {
			args := v.(GetDataLimitsArgs)
			r, err := GetDataLimits(ctx, &args, opts...)
			var s GetDataLimitsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDataLimitsResultOutput)
}

// A collection of arguments for invoking getDataLimits.
type GetDataLimitsOutputArgs struct {
	// A list of Data Limit IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the data asset.
	ParentId pulumi.StringPtrInput `pulumi:"parentId"`
	// The type of the service to which the data asset belongs.
	ResourceType pulumi.StringPtrInput `pulumi:"resourceType"`
}

func (GetDataLimitsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataLimitsArgs)(nil)).Elem()
}

// A collection of values returned by getDataLimits.
type GetDataLimitsResultOutput struct{ *pulumi.OutputState }

func (GetDataLimitsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDataLimitsResult)(nil)).Elem()
}

func (o GetDataLimitsResultOutput) ToGetDataLimitsResultOutput() GetDataLimitsResultOutput {
	return o
}

func (o GetDataLimitsResultOutput) ToGetDataLimitsResultOutputWithContext(ctx context.Context) GetDataLimitsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetDataLimitsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDataLimitsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDataLimitsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDataLimitsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetDataLimitsResultOutput) Limits() GetDataLimitsLimitArrayOutput {
	return o.ApplyT(func(v GetDataLimitsResult) []GetDataLimitsLimit { return v.Limits }).(GetDataLimitsLimitArrayOutput)
}

func (o GetDataLimitsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDataLimitsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetDataLimitsResultOutput) ParentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDataLimitsResult) *string { return v.ParentId }).(pulumi.StringPtrOutput)
}

func (o GetDataLimitsResultOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDataLimitsResult) *string { return v.ResourceType }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDataLimitsResultOutput{})
}
