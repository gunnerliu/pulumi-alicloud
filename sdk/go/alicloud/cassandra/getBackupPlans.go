// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cassandra

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Cassandra Backup Plans of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.128.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cassandra"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cassandra.GetBackupPlans(ctx, &cassandra.GetBackupPlansArgs{
//				ClusterId: "example_value",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstCassandraBackupPlanId", example.Plans[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetBackupPlans(ctx *pulumi.Context, args *GetBackupPlansArgs, opts ...pulumi.InvokeOption) (*GetBackupPlansResult, error) {
	var rv GetBackupPlansResult
	err := ctx.Invoke("alicloud:cassandra/getBackupPlans:getBackupPlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBackupPlans.
type GetBackupPlansArgs struct {
	// The ID of the cluster for the backup.
	ClusterId string `pulumi:"clusterId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getBackupPlans.
type GetBackupPlansResult struct {
	ClusterId string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string               `pulumi:"id"`
	Ids        []string             `pulumi:"ids"`
	OutputFile *string              `pulumi:"outputFile"`
	Plans      []GetBackupPlansPlan `pulumi:"plans"`
}

func GetBackupPlansOutput(ctx *pulumi.Context, args GetBackupPlansOutputArgs, opts ...pulumi.InvokeOption) GetBackupPlansResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBackupPlansResult, error) {
			args := v.(GetBackupPlansArgs)
			r, err := GetBackupPlans(ctx, &args, opts...)
			var s GetBackupPlansResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBackupPlansResultOutput)
}

// A collection of arguments for invoking getBackupPlans.
type GetBackupPlansOutputArgs struct {
	// The ID of the cluster for the backup.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetBackupPlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPlansArgs)(nil)).Elem()
}

// A collection of values returned by getBackupPlans.
type GetBackupPlansResultOutput struct{ *pulumi.OutputState }

func (GetBackupPlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPlansResult)(nil)).Elem()
}

func (o GetBackupPlansResultOutput) ToGetBackupPlansResultOutput() GetBackupPlansResultOutput {
	return o
}

func (o GetBackupPlansResultOutput) ToGetBackupPlansResultOutputWithContext(ctx context.Context) GetBackupPlansResultOutput {
	return o
}

func (o GetBackupPlansResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBackupPlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBackupPlansResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetBackupPlansResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetBackupPlansResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBackupPlansResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBackupPlansResultOutput) Plans() GetBackupPlansPlanArrayOutput {
	return o.ApplyT(func(v GetBackupPlansResult) []GetBackupPlansPlan { return v.Plans }).(GetBackupPlansPlanArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBackupPlansResultOutput{})
}
