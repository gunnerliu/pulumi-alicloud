// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Mongodb Audit Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.148.0+.
func GetAuditPolicies(ctx *pulumi.Context, args *GetAuditPoliciesArgs, opts ...pulumi.InvokeOption) (*GetAuditPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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
	DbInstanceId string `pulumi:"dbInstanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
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
			var s GetAuditPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAuditPoliciesResultOutput)
}

// A collection of arguments for invoking getAuditPolicies.
type GetAuditPoliciesOutputArgs struct {
	// The ID of the instance.
	DbInstanceId pulumi.StringInput `pulumi:"dbInstanceId"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
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

func (o GetAuditPoliciesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetAuditPoliciesResult] {
	return pulumix.Output[GetAuditPoliciesResult]{
		OutputState: o.OutputState,
	}
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
