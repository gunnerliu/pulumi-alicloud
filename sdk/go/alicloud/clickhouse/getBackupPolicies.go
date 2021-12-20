// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package clickhouse

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Click House Backup Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.147.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/clickhouse"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := clickhouse.GetBackupPolicies(ctx, &clickhouse.GetBackupPoliciesArgs{
// 			DbClusterId: "example_value",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("clickHouseBackupPolicyId1", example.Policies[0].Id)
// 		return nil
// 	})
// }
// ```
func GetBackupPolicies(ctx *pulumi.Context, args *GetBackupPoliciesArgs, opts ...pulumi.InvokeOption) (*GetBackupPoliciesResult, error) {
	var rv GetBackupPoliciesResult
	err := ctx.Invoke("alicloud:clickhouse/getBackupPolicies:getBackupPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBackupPolicies.
type GetBackupPoliciesArgs struct {
	// The db cluster id.
	DbClusterId string  `pulumi:"dbClusterId"`
	OutputFile  *string `pulumi:"outputFile"`
}

// A collection of values returned by getBackupPolicies.
type GetBackupPoliciesResult struct {
	DbClusterId string `pulumi:"dbClusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	OutputFile *string                   `pulumi:"outputFile"`
	Policies   []GetBackupPoliciesPolicy `pulumi:"policies"`
}

func GetBackupPoliciesOutput(ctx *pulumi.Context, args GetBackupPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetBackupPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBackupPoliciesResult, error) {
			args := v.(GetBackupPoliciesArgs)
			r, err := GetBackupPolicies(ctx, &args, opts...)
			return *r, err
		}).(GetBackupPoliciesResultOutput)
}

// A collection of arguments for invoking getBackupPolicies.
type GetBackupPoliciesOutputArgs struct {
	// The db cluster id.
	DbClusterId pulumi.StringInput    `pulumi:"dbClusterId"`
	OutputFile  pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetBackupPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getBackupPolicies.
type GetBackupPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetBackupPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBackupPoliciesResult)(nil)).Elem()
}

func (o GetBackupPoliciesResultOutput) ToGetBackupPoliciesResultOutput() GetBackupPoliciesResultOutput {
	return o
}

func (o GetBackupPoliciesResultOutput) ToGetBackupPoliciesResultOutputWithContext(ctx context.Context) GetBackupPoliciesResultOutput {
	return o
}

func (o GetBackupPoliciesResultOutput) DbClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPoliciesResult) string { return v.DbClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetBackupPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBackupPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetBackupPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBackupPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetBackupPoliciesResultOutput) Policies() GetBackupPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetBackupPoliciesResult) []GetBackupPoliciesPolicy { return v.Policies }).(GetBackupPoliciesPolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBackupPoliciesResultOutput{})
}
