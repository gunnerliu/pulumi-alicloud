// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Mongodb Audit Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.148.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/mongodb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		example, err := mongodb.GetAuditPolicies(ctx, &mongodb.GetAuditPoliciesArgs{
// 			DbInstanceId: "example_value",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("mongodbAuditPolicyId1", example.Policies[0].Id)
// 		return nil
// 	})
// }
// ```
func GetAuditPolicies(ctx *pulumi.Context, args *GetAuditPoliciesArgs, opts ...pulumi.InvokeOption) (*GetAuditPoliciesResult, error) {
	var rv GetAuditPoliciesResult
	err := ctx.Invoke("alicloud:mongodb/getAuditPolicies:getAuditPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuditPolicies.
type GetAuditPoliciesArgs struct {
	// The ID of the instance.
	DbInstanceId string  `pulumi:"dbInstanceId"`
	OutputFile   *string `pulumi:"outputFile"`
}

// A collection of values returned by getAuditPolicies.
type GetAuditPoliciesResult struct {
	DbInstanceId string `pulumi:"dbInstanceId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                   `pulumi:"id"`
	OutputFile *string                  `pulumi:"outputFile"`
	Policies   []GetAuditPoliciesPolicy `pulumi:"policies"`
}

func GetAuditPoliciesOutput(ctx *pulumi.Context, args GetAuditPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetAuditPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAuditPoliciesResult, error) {
			args := v.(GetAuditPoliciesArgs)
			r, err := GetAuditPolicies(ctx, &args, opts...)
			return *r, err
		}).(GetAuditPoliciesResultOutput)
}

// A collection of arguments for invoking getAuditPolicies.
type GetAuditPoliciesOutputArgs struct {
	// The ID of the instance.
	DbInstanceId pulumi.StringInput    `pulumi:"dbInstanceId"`
	OutputFile   pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetAuditPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuditPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getAuditPolicies.
type GetAuditPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetAuditPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuditPoliciesResult)(nil)).Elem()
}

func (o GetAuditPoliciesResultOutput) ToGetAuditPoliciesResultOutput() GetAuditPoliciesResultOutput {
	return o
}

func (o GetAuditPoliciesResultOutput) ToGetAuditPoliciesResultOutputWithContext(ctx context.Context) GetAuditPoliciesResultOutput {
	return o
}

func (o GetAuditPoliciesResultOutput) DbInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuditPoliciesResult) string { return v.DbInstanceId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAuditPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuditPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAuditPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuditPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetAuditPoliciesResultOutput) Policies() GetAuditPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetAuditPoliciesResult) []GetAuditPoliciesPolicy { return v.Policies }).(GetAuditPoliciesPolicyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuditPoliciesResultOutput{})
}
