// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Hbr OssBackupPlans of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.131.0+.
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
//			ids, err := hbr.GetOssBackupPlans(ctx, &hbr.GetOssBackupPlansArgs{
//				NameRegex: pulumi.StringRef("^my-OssBackupPlan"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("hbrOssBackupPlanId", ids.Plans[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetOssBackupPlans(ctx *pulumi.Context, args *GetOssBackupPlansArgs, opts ...pulumi.InvokeOption) (*GetOssBackupPlansResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetOssBackupPlansResult
	err := ctx.Invoke("alicloud:hbr/getOssBackupPlans:getOssBackupPlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOssBackupPlans.
type GetOssBackupPlansArgs struct {
	// The name of OSS bucket.
	Bucket *string `pulumi:"bucket"`
	// A list of OssBackupPlan IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by OssBackupPlan name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of backup vault.
	VaultId *string `pulumi:"vaultId"`
}

// A collection of values returned by getOssBackupPlans.
type GetOssBackupPlansResult struct {
	Bucket *string `pulumi:"bucket"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Ids        []string                `pulumi:"ids"`
	NameRegex  *string                 `pulumi:"nameRegex"`
	Names      []string                `pulumi:"names"`
	OutputFile *string                 `pulumi:"outputFile"`
	Plans      []GetOssBackupPlansPlan `pulumi:"plans"`
	VaultId    *string                 `pulumi:"vaultId"`
}

func GetOssBackupPlansOutput(ctx *pulumi.Context, args GetOssBackupPlansOutputArgs, opts ...pulumi.InvokeOption) GetOssBackupPlansResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOssBackupPlansResult, error) {
			args := v.(GetOssBackupPlansArgs)
			r, err := GetOssBackupPlans(ctx, &args, opts...)
			var s GetOssBackupPlansResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOssBackupPlansResultOutput)
}

// A collection of arguments for invoking getOssBackupPlans.
type GetOssBackupPlansOutputArgs struct {
	// The name of OSS bucket.
	Bucket pulumi.StringPtrInput `pulumi:"bucket"`
	// A list of OssBackupPlan IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by OssBackupPlan name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of backup vault.
	VaultId pulumi.StringPtrInput `pulumi:"vaultId"`
}

func (GetOssBackupPlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOssBackupPlansArgs)(nil)).Elem()
}

// A collection of values returned by getOssBackupPlans.
type GetOssBackupPlansResultOutput struct{ *pulumi.OutputState }

func (GetOssBackupPlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOssBackupPlansResult)(nil)).Elem()
}

func (o GetOssBackupPlansResultOutput) ToGetOssBackupPlansResultOutput() GetOssBackupPlansResultOutput {
	return o
}

func (o GetOssBackupPlansResultOutput) ToGetOssBackupPlansResultOutputWithContext(ctx context.Context) GetOssBackupPlansResultOutput {
	return o
}

func (o GetOssBackupPlansResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetOssBackupPlansResult] {
	return pulumix.Output[GetOssBackupPlansResult]{
		OutputState: o.OutputState,
	}
}

func (o GetOssBackupPlansResultOutput) Bucket() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) *string { return v.Bucket }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOssBackupPlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOssBackupPlansResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetOssBackupPlansResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetOssBackupPlansResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetOssBackupPlansResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetOssBackupPlansResultOutput) Plans() GetOssBackupPlansPlanArrayOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) []GetOssBackupPlansPlan { return v.Plans }).(GetOssBackupPlansPlanArrayOutput)
}

func (o GetOssBackupPlansResultOutput) VaultId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOssBackupPlansResult) *string { return v.VaultId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOssBackupPlansResultOutput{})
}
