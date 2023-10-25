// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source provides the Cms Event Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.182.0+.
func GetEventRules(ctx *pulumi.Context, args *GetEventRulesArgs, opts ...pulumi.InvokeOption) (*GetEventRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetEventRulesResult
	err := ctx.Invoke("alicloud:cms/getEventRules:getEventRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEventRules.
type GetEventRulesArgs struct {
	// A list of Event Rule IDs. Its element value is same as Event Rule Name.
	Ids []string `pulumi:"ids"`
	// The name prefix.
	NamePrefix *string `pulumi:"namePrefix"`
	// A regex string to filter results by Event Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	PageNumber *int    `pulumi:"pageNumber"`
	PageSize   *int    `pulumi:"pageSize"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

// A collection of values returned by getEventRules.
type GetEventRulesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id         string              `pulumi:"id"`
	Ids        []string            `pulumi:"ids"`
	NamePrefix *string             `pulumi:"namePrefix"`
	NameRegex  *string             `pulumi:"nameRegex"`
	Names      []string            `pulumi:"names"`
	OutputFile *string             `pulumi:"outputFile"`
	PageNumber *int                `pulumi:"pageNumber"`
	PageSize   *int                `pulumi:"pageSize"`
	Rules      []GetEventRulesRule `pulumi:"rules"`
	Status     *string             `pulumi:"status"`
}

func GetEventRulesOutput(ctx *pulumi.Context, args GetEventRulesOutputArgs, opts ...pulumi.InvokeOption) GetEventRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEventRulesResult, error) {
			args := v.(GetEventRulesArgs)
			r, err := GetEventRules(ctx, &args, opts...)
			var s GetEventRulesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetEventRulesResultOutput)
}

// A collection of arguments for invoking getEventRules.
type GetEventRulesOutputArgs struct {
	// A list of Event Rule IDs. Its element value is same as Event Rule Name.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name prefix.
	NamePrefix pulumi.StringPtrInput `pulumi:"namePrefix"`
	// A regex string to filter results by Event Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	PageNumber pulumi.IntPtrInput    `pulumi:"pageNumber"`
	PageSize   pulumi.IntPtrInput    `pulumi:"pageSize"`
	// The status of the resource.
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetEventRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventRulesArgs)(nil)).Elem()
}

// A collection of values returned by getEventRules.
type GetEventRulesResultOutput struct{ *pulumi.OutputState }

func (GetEventRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventRulesResult)(nil)).Elem()
}

func (o GetEventRulesResultOutput) ToGetEventRulesResultOutput() GetEventRulesResultOutput {
	return o
}

func (o GetEventRulesResultOutput) ToGetEventRulesResultOutputWithContext(ctx context.Context) GetEventRulesResultOutput {
	return o
}

func (o GetEventRulesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetEventRulesResult] {
	return pulumix.Output[GetEventRulesResult]{
		OutputState: o.OutputState,
	}
}

// The provider-assigned unique ID for this managed resource.
func (o GetEventRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEventRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetEventRulesResultOutput) NamePrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *string { return v.NamePrefix }).(pulumi.StringPtrOutput)
}

func (o GetEventRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetEventRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetEventRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetEventRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetEventRulesResultOutput) PageNumber() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *int { return v.PageNumber }).(pulumi.IntPtrOutput)
}

func (o GetEventRulesResultOutput) PageSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *int { return v.PageSize }).(pulumi.IntPtrOutput)
}

func (o GetEventRulesResultOutput) Rules() GetEventRulesRuleArrayOutput {
	return o.ApplyT(func(v GetEventRulesResult) []GetEventRulesRule { return v.Rules }).(GetEventRulesRuleArrayOutput)
}

func (o GetEventRulesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetEventRulesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventRulesResultOutput{})
}
