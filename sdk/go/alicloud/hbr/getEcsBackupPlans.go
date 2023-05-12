// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package hbr

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Hbr EcsBackupPlans of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.132.0+.
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
//			ids, err := hbr.GetEcsBackupPlans(ctx, &hbr.GetEcsBackupPlansArgs{
//				NameRegex: pulumi.StringRef("plan-name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("hbrEcsBackupPlanId", ids.Plans[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetEcsBackupPlans(ctx *pulumi.Context, args *GetEcsBackupPlansArgs, opts ...pulumi.InvokeOption) (*GetEcsBackupPlansResult, error) {
	var rv GetEcsBackupPlansResult
	err := ctx.Invoke("alicloud:hbr/getEcsBackupPlans:getEcsBackupPlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEcsBackupPlans.
type GetEcsBackupPlansArgs struct {
	// A list of EcsBackupPlan IDs.
	Ids []string `pulumi:"ids"`
	// The ID of ECS instance.
	InstanceId *string `pulumi:"instanceId"`
	// A regex string to filter results by EcsBackupPlan name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of Backup vault.
	VaultId *string `pulumi:"vaultId"`
}

// A collection of values returned by getEcsBackupPlans.
type GetEcsBackupPlansResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string                  `pulumi:"id"`
	Ids        []string                `pulumi:"ids"`
	InstanceId *string                 `pulumi:"instanceId"`
	NameRegex  *string                 `pulumi:"nameRegex"`
	Names      []string                `pulumi:"names"`
	OutputFile *string                 `pulumi:"outputFile"`
	Plans      []GetEcsBackupPlansPlan `pulumi:"plans"`
	VaultId    *string                 `pulumi:"vaultId"`
}

func GetEcsBackupPlansOutput(ctx *pulumi.Context, args GetEcsBackupPlansOutputArgs, opts ...pulumi.InvokeOption) GetEcsBackupPlansResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEcsBackupPlansResult, error) {
			args := v.(GetEcsBackupPlansArgs)
			r, err := GetEcsBackupPlans(ctx, &args, opts...)
			var s GetEcsBackupPlansResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEcsBackupPlansResultOutput)
}

// A collection of arguments for invoking getEcsBackupPlans.
type GetEcsBackupPlansOutputArgs struct {
	// A list of EcsBackupPlan IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The ID of ECS instance.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	// A regex string to filter results by EcsBackupPlan name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of Backup vault.
	VaultId pulumi.StringPtrInput `pulumi:"vaultId"`
}

func (GetEcsBackupPlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEcsBackupPlansArgs)(nil)).Elem()
}

// A collection of values returned by getEcsBackupPlans.
type GetEcsBackupPlansResultOutput struct{ *pulumi.OutputState }

func (GetEcsBackupPlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEcsBackupPlansResult)(nil)).Elem()
}

func (o GetEcsBackupPlansResultOutput) ToGetEcsBackupPlansResultOutput() GetEcsBackupPlansResultOutput {
	return o
}

func (o GetEcsBackupPlansResultOutput) ToGetEcsBackupPlansResultOutputWithContext(ctx context.Context) GetEcsBackupPlansResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetEcsBackupPlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEcsBackupPlansResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEcsBackupPlansResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetEcsBackupPlansResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEcsBackupPlansResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEcsBackupPlansResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEcsBackupPlansResultOutput) Plans() GetEcsBackupPlansPlanArrayOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) []GetEcsBackupPlansPlan { return v.Plans }).(GetEcsBackupPlansPlanArrayOutput)
}

func (o GetEcsBackupPlansResultOutput) VaultId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEcsBackupPlansResult) *string { return v.VaultId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEcsBackupPlansResultOutput{})
}
