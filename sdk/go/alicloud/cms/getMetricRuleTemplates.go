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

// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.134.0+.
func GetMetricRuleTemplates(ctx *pulumi.Context, args *GetMetricRuleTemplatesArgs, opts ...pulumi.InvokeOption) (*GetMetricRuleTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetMetricRuleTemplatesResult
	err := ctx.Invoke("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMetricRuleTemplates.
type GetMetricRuleTemplatesArgs struct {
	// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Metric Rule Template IDs.
	Ids []string `pulumi:"ids"`
	// The name of the alert template. You can perform fuzzy search based on the template name.
	Keyword *string `pulumi:"keyword"`
	// The name of the alert template.
	MetricRuleTemplateName *string `pulumi:"metricRuleTemplateName"`
	// A regex string to filter results by Metric Rule Template name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the alert template.
	TemplateId *string `pulumi:"templateId"`
}

// A collection of values returned by getMetricRuleTemplates.
type GetMetricRuleTemplatesResult struct {
	EnableDetails *bool `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id                     string                           `pulumi:"id"`
	Ids                    []string                         `pulumi:"ids"`
	Keyword                *string                          `pulumi:"keyword"`
	MetricRuleTemplateName *string                          `pulumi:"metricRuleTemplateName"`
	NameRegex              *string                          `pulumi:"nameRegex"`
	Names                  []string                         `pulumi:"names"`
	OutputFile             *string                          `pulumi:"outputFile"`
	TemplateId             *string                          `pulumi:"templateId"`
	Templates              []GetMetricRuleTemplatesTemplate `pulumi:"templates"`
}

func GetMetricRuleTemplatesOutput(ctx *pulumi.Context, args GetMetricRuleTemplatesOutputArgs, opts ...pulumi.InvokeOption) GetMetricRuleTemplatesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMetricRuleTemplatesResult, error) {
			args := v.(GetMetricRuleTemplatesArgs)
			r, err := GetMetricRuleTemplates(ctx, &args, opts...)
			var s GetMetricRuleTemplatesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetMetricRuleTemplatesResultOutput)
}

// A collection of arguments for invoking getMetricRuleTemplates.
type GetMetricRuleTemplatesOutputArgs struct {
	// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Metric Rule Template IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of the alert template. You can perform fuzzy search based on the template name.
	Keyword pulumi.StringPtrInput `pulumi:"keyword"`
	// The name of the alert template.
	MetricRuleTemplateName pulumi.StringPtrInput `pulumi:"metricRuleTemplateName"`
	// A regex string to filter results by Metric Rule Template name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the alert template.
	TemplateId pulumi.StringPtrInput `pulumi:"templateId"`
}

func (GetMetricRuleTemplatesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetricRuleTemplatesArgs)(nil)).Elem()
}

// A collection of values returned by getMetricRuleTemplates.
type GetMetricRuleTemplatesResultOutput struct{ *pulumi.OutputState }

func (GetMetricRuleTemplatesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMetricRuleTemplatesResult)(nil)).Elem()
}

func (o GetMetricRuleTemplatesResultOutput) ToGetMetricRuleTemplatesResultOutput() GetMetricRuleTemplatesResultOutput {
	return o
}

func (o GetMetricRuleTemplatesResultOutput) ToGetMetricRuleTemplatesResultOutputWithContext(ctx context.Context) GetMetricRuleTemplatesResultOutput {
	return o
}

func (o GetMetricRuleTemplatesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetMetricRuleTemplatesResult] {
	return pulumix.Output[GetMetricRuleTemplatesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetMetricRuleTemplatesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMetricRuleTemplatesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetMetricRuleTemplatesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetMetricRuleTemplatesResultOutput) Keyword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *string { return v.Keyword }).(pulumi.StringPtrOutput)
}

func (o GetMetricRuleTemplatesResultOutput) MetricRuleTemplateName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *string { return v.MetricRuleTemplateName }).(pulumi.StringPtrOutput)
}

func (o GetMetricRuleTemplatesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetMetricRuleTemplatesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetMetricRuleTemplatesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetMetricRuleTemplatesResultOutput) TemplateId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) *string { return v.TemplateId }).(pulumi.StringPtrOutput)
}

func (o GetMetricRuleTemplatesResultOutput) Templates() GetMetricRuleTemplatesTemplateArrayOutput {
	return o.ApplyT(func(v GetMetricRuleTemplatesResult) []GetMetricRuleTemplatesTemplate { return v.Templates }).(GetMetricRuleTemplatesTemplateArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMetricRuleTemplatesResultOutput{})
}
