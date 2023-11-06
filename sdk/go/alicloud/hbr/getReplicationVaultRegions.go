// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the HBR Replication Vault Regions of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.152.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/hbr"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := hbr.GetReplicationVaultRegions(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("hbrReplicationVaultRegionRegionId1", _default.Regions[0].ReplicationRegionId)
//			return nil
//		})
//	}
//
// ```
func GetReplicationVaultRegions(ctx *pulumi.Context, args *GetReplicationVaultRegionsArgs, opts ...pulumi.InvokeOption) (*GetReplicationVaultRegionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetReplicationVaultRegionsResult
	err := ctx.Invoke("alicloud:hbr/getReplicationVaultRegions:getReplicationVaultRegions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getReplicationVaultRegions.
type GetReplicationVaultRegionsArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getReplicationVaultRegions.
type GetReplicationVaultRegionsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                             `pulumi:"id"`
	OutputFile *string                            `pulumi:"outputFile"`
	Regions    []GetReplicationVaultRegionsRegion `pulumi:"regions"`
}

func GetReplicationVaultRegionsOutput(ctx *pulumi.Context, args GetReplicationVaultRegionsOutputArgs, opts ...pulumi.InvokeOption) GetReplicationVaultRegionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetReplicationVaultRegionsResult, error) {
			args := v.(GetReplicationVaultRegionsArgs)
			r, err := GetReplicationVaultRegions(ctx, &args, opts...)
			var s GetReplicationVaultRegionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetReplicationVaultRegionsResultOutput)
}

// A collection of arguments for invoking getReplicationVaultRegions.
type GetReplicationVaultRegionsOutputArgs struct {
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetReplicationVaultRegionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetReplicationVaultRegionsArgs)(nil)).Elem()
}

// A collection of values returned by getReplicationVaultRegions.
type GetReplicationVaultRegionsResultOutput struct{ *pulumi.OutputState }

func (GetReplicationVaultRegionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetReplicationVaultRegionsResult)(nil)).Elem()
}

func (o GetReplicationVaultRegionsResultOutput) ToGetReplicationVaultRegionsResultOutput() GetReplicationVaultRegionsResultOutput {
	return o
}

func (o GetReplicationVaultRegionsResultOutput) ToGetReplicationVaultRegionsResultOutputWithContext(ctx context.Context) GetReplicationVaultRegionsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetReplicationVaultRegionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetReplicationVaultRegionsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetReplicationVaultRegionsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetReplicationVaultRegionsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetReplicationVaultRegionsResultOutput) Regions() GetReplicationVaultRegionsRegionArrayOutput {
	return o.ApplyT(func(v GetReplicationVaultRegionsResult) []GetReplicationVaultRegionsRegion { return v.Regions }).(GetReplicationVaultRegionsRegionArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetReplicationVaultRegionsResultOutput{})
}
