// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides CEN Bandwidth Limits available to the user.
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
//			bwl, err := cen.GetBandwidthLimits(ctx, &cen.GetBandwidthLimitsArgs{
//				InstanceIds: []string{
//					"cen-id1",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstCenBandwidthLimitsLocalRegionId", bwl.Limits[0].LocalRegionId)
//			return nil
//		})
//	}
//
// ```
func GetBandwidthLimits(ctx *pulumi.Context, args *GetBandwidthLimitsArgs, opts ...pulumi.InvokeOption) (*GetBandwidthLimitsResult, error) {
	var rv GetBandwidthLimitsResult
	err := ctx.Invoke("alicloud:cen/getBandwidthLimits:getBandwidthLimits", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBandwidthLimits.
type GetBandwidthLimitsArgs struct {
	// A list of CEN instances IDs.
	InstanceIds []string `pulumi:"instanceIds"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getBandwidthLimits.
type GetBandwidthLimitsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string   `pulumi:"id"`
	InstanceIds []string `pulumi:"instanceIds"`
	// A list of CEN Bandwidth Limits. Each element contains the following attributes:
	Limits     []GetBandwidthLimitsLimit `pulumi:"limits"`
	OutputFile *string                   `pulumi:"outputFile"`
}

func GetBandwidthLimitsOutput(ctx *pulumi.Context, args GetBandwidthLimitsOutputArgs, opts ...pulumi.InvokeOption) GetBandwidthLimitsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBandwidthLimitsResult, error) {
			args := v.(GetBandwidthLimitsArgs)
			r, err := GetBandwidthLimits(ctx, &args, opts...)
			var s GetBandwidthLimitsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBandwidthLimitsResultOutput)
}

// A collection of arguments for invoking getBandwidthLimits.
type GetBandwidthLimitsOutputArgs struct {
	// A list of CEN instances IDs.
	InstanceIds pulumi.StringArrayInput `pulumi:"instanceIds"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetBandwidthLimitsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthLimitsArgs)(nil)).Elem()
}

// A collection of values returned by getBandwidthLimits.
type GetBandwidthLimitsResultOutput struct{ *pulumi.OutputState }

func (GetBandwidthLimitsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBandwidthLimitsResult)(nil)).Elem()
}

func (o GetBandwidthLimitsResultOutput) ToGetBandwidthLimitsResultOutput() GetBandwidthLimitsResultOutput {
	return o
}

func (o GetBandwidthLimitsResultOutput) ToGetBandwidthLimitsResultOutputWithContext(ctx context.Context) GetBandwidthLimitsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetBandwidthLimitsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBandwidthLimitsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBandwidthLimitsResultOutput) InstanceIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBandwidthLimitsResult) []string { return v.InstanceIds }).(pulumi.StringArrayOutput)
}

// A list of CEN Bandwidth Limits. Each element contains the following attributes:
func (o GetBandwidthLimitsResultOutput) Limits() GetBandwidthLimitsLimitArrayOutput {
	return o.ApplyT(func(v GetBandwidthLimitsResult) []GetBandwidthLimitsLimit { return v.Limits }).(GetBandwidthLimitsLimitArrayOutput)
}

func (o GetBandwidthLimitsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBandwidthLimitsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBandwidthLimitsResultOutput{})
}
