// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Alb Security Policies of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.130.0+.
func GetSecurityPolicies(ctx *pulumi.Context, args *GetSecurityPoliciesArgs, opts ...pulumi.InvokeOption) (*GetSecurityPoliciesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSecurityPoliciesResult
	err := ctx.Invoke("alicloud:alb/getSecurityPolicies:getSecurityPolicies", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecurityPolicies.
type GetSecurityPoliciesArgs struct {
	// A list of Security Policy IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Security Policy name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the resource group.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The security policy ids.
	SecurityPolicyIds []string `pulumi:"securityPolicyIds"`
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName *string `pulumi:"securityPolicyName"`
	// The status of the resource.
	Status *string                `pulumi:"status"`
	Tags   map[string]interface{} `pulumi:"tags"`
}

// A collection of values returned by getSecurityPolicies.
type GetSecurityPoliciesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id                 string                      `pulumi:"id"`
	Ids                []string                    `pulumi:"ids"`
	NameRegex          *string                     `pulumi:"nameRegex"`
	Names              []string                    `pulumi:"names"`
	OutputFile         *string                     `pulumi:"outputFile"`
	Policies           []GetSecurityPoliciesPolicy `pulumi:"policies"`
	ResourceGroupId    *string                     `pulumi:"resourceGroupId"`
	SecurityPolicyIds  []string                    `pulumi:"securityPolicyIds"`
	SecurityPolicyName *string                     `pulumi:"securityPolicyName"`
	Status             *string                     `pulumi:"status"`
	Tags               map[string]interface{}      `pulumi:"tags"`
}

func GetSecurityPoliciesOutput(ctx *pulumi.Context, args GetSecurityPoliciesOutputArgs, opts ...pulumi.InvokeOption) GetSecurityPoliciesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSecurityPoliciesResult, error) {
			args := v.(GetSecurityPoliciesArgs)
			r, err := GetSecurityPolicies(ctx, &args, opts...)
			var s GetSecurityPoliciesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSecurityPoliciesResultOutput)
}

// A collection of arguments for invoking getSecurityPolicies.
type GetSecurityPoliciesOutputArgs struct {
	// A list of Security Policy IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Security Policy name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the resource group.
	ResourceGroupId pulumi.StringPtrInput `pulumi:"resourceGroupId"`
	// The security policy ids.
	SecurityPolicyIds pulumi.StringArrayInput `pulumi:"securityPolicyIds"`
	// The name of the resource. The name must be 2 to 128 characters in length and must start with a letter. It can contain digits, periods (.), underscores (_), and hyphens (-).
	SecurityPolicyName pulumi.StringPtrInput `pulumi:"securityPolicyName"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
	Tags   pulumi.MapInput       `pulumi:"tags"`
}

func (GetSecurityPoliciesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityPoliciesArgs)(nil)).Elem()
}

// A collection of values returned by getSecurityPolicies.
type GetSecurityPoliciesResultOutput struct{ *pulumi.OutputState }

func (GetSecurityPoliciesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSecurityPoliciesResult)(nil)).Elem()
}

func (o GetSecurityPoliciesResultOutput) ToGetSecurityPoliciesResultOutput() GetSecurityPoliciesResultOutput {
	return o
}

func (o GetSecurityPoliciesResultOutput) ToGetSecurityPoliciesResultOutputWithContext(ctx context.Context) GetSecurityPoliciesResultOutput {
	return o
}

func (o GetSecurityPoliciesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetSecurityPoliciesResult] {
	return pulumix.Output[GetSecurityPoliciesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetSecurityPoliciesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetSecurityPoliciesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSecurityPoliciesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetSecurityPoliciesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetSecurityPoliciesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetSecurityPoliciesResultOutput) Policies() GetSecurityPoliciesPolicyArrayOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) []GetSecurityPoliciesPolicy { return v.Policies }).(GetSecurityPoliciesPolicyArrayOutput)
}

func (o GetSecurityPoliciesResultOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) *string { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

func (o GetSecurityPoliciesResultOutput) SecurityPolicyIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) []string { return v.SecurityPolicyIds }).(pulumi.StringArrayOutput)
}

func (o GetSecurityPoliciesResultOutput) SecurityPolicyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) *string { return v.SecurityPolicyName }).(pulumi.StringPtrOutput)
}

func (o GetSecurityPoliciesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetSecurityPoliciesResultOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v GetSecurityPoliciesResult) map[string]interface{} { return v.Tags }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSecurityPoliciesResultOutput{})
}
