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

// This data source provides the Cms Group Metric Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.104.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := cms.GetGroupMetricRules(ctx, &cms.GetGroupMetricRulesArgs{
//				Ids: []string{
//					"4a9a8978-a9cc-55ca-aa7c-530ccd91ae57",
//				},
//				NameRegex: pulumi.StringRef("the_resource_name"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstCmsGroupMetricRuleId", example.Rules[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetGroupMetricRules(ctx *pulumi.Context, args *GetGroupMetricRulesArgs, opts ...pulumi.InvokeOption) (*GetGroupMetricRulesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGroupMetricRulesResult
	err := ctx.Invoke("alicloud:cms/getGroupMetricRules:getGroupMetricRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroupMetricRules.
type GetGroupMetricRulesArgs struct {
	// The dimensions that specify the resources to be associated with the alert rule.
	Dimensions *string `pulumi:"dimensions"`
	// Indicates whether the alert rule is enabled.
	EnableState *bool `pulumi:"enableState"`
	// The ID of the application group.
	GroupId *string `pulumi:"groupId"`
	// The name of the alert rule.
	GroupMetricRuleName *string `pulumi:"groupMetricRuleName"`
	// A list of Group Metric Rule IDs.
	Ids []string `pulumi:"ids"`
	// The name of the metric.
	MetricName *string `pulumi:"metricName"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex *string `pulumi:"nameRegex"`
	// The namespace of the service.
	Namespace *string `pulumi:"namespace"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of Group Metric Rule..
	Status *string `pulumi:"status"`
}

// A collection of values returned by getGroupMetricRules.
type GetGroupMetricRulesResult struct {
	Dimensions          *string `pulumi:"dimensions"`
	EnableState         *bool   `pulumi:"enableState"`
	GroupId             *string `pulumi:"groupId"`
	GroupMetricRuleName *string `pulumi:"groupMetricRuleName"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	Ids        []string                  `pulumi:"ids"`
	MetricName *string                   `pulumi:"metricName"`
	NameRegex  *string                   `pulumi:"nameRegex"`
	Names      []string                  `pulumi:"names"`
	Namespace  *string                   `pulumi:"namespace"`
	OutputFile *string                   `pulumi:"outputFile"`
	Rules      []GetGroupMetricRulesRule `pulumi:"rules"`
	Status     *string                   `pulumi:"status"`
}

func GetGroupMetricRulesOutput(ctx *pulumi.Context, args GetGroupMetricRulesOutputArgs, opts ...pulumi.InvokeOption) GetGroupMetricRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGroupMetricRulesResult, error) {
			args := v.(GetGroupMetricRulesArgs)
			r, err := GetGroupMetricRules(ctx, &args, opts...)
			var s GetGroupMetricRulesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGroupMetricRulesResultOutput)
}

// A collection of arguments for invoking getGroupMetricRules.
type GetGroupMetricRulesOutputArgs struct {
	// The dimensions that specify the resources to be associated with the alert rule.
	Dimensions pulumi.StringPtrInput `pulumi:"dimensions"`
	// Indicates whether the alert rule is enabled.
	EnableState pulumi.BoolPtrInput `pulumi:"enableState"`
	// The ID of the application group.
	GroupId pulumi.StringPtrInput `pulumi:"groupId"`
	// The name of the alert rule.
	GroupMetricRuleName pulumi.StringPtrInput `pulumi:"groupMetricRuleName"`
	// A list of Group Metric Rule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of the metric.
	MetricName pulumi.StringPtrInput `pulumi:"metricName"`
	// A regex string to filter results by Group Metric Rule name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// The namespace of the service.
	Namespace pulumi.StringPtrInput `pulumi:"namespace"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of Group Metric Rule..
	Status pulumi.StringPtrInput `pulumi:"status"`
}

func (GetGroupMetricRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupMetricRulesArgs)(nil)).Elem()
}

// A collection of values returned by getGroupMetricRules.
type GetGroupMetricRulesResultOutput struct{ *pulumi.OutputState }

func (GetGroupMetricRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGroupMetricRulesResult)(nil)).Elem()
}

func (o GetGroupMetricRulesResultOutput) ToGetGroupMetricRulesResultOutput() GetGroupMetricRulesResultOutput {
	return o
}

func (o GetGroupMetricRulesResultOutput) ToGetGroupMetricRulesResultOutputWithContext(ctx context.Context) GetGroupMetricRulesResultOutput {
	return o
}

func (o GetGroupMetricRulesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetGroupMetricRulesResult] {
	return pulumix.Output[GetGroupMetricRulesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetGroupMetricRulesResultOutput) Dimensions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.Dimensions }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) EnableState() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *bool { return v.EnableState }).(pulumi.BoolPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) GroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.GroupId }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) GroupMetricRuleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.GroupMetricRuleName }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGroupMetricRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGroupMetricRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetGroupMetricRulesResultOutput) MetricName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.MetricName }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetGroupMetricRulesResultOutput) Namespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.Namespace }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetGroupMetricRulesResultOutput) Rules() GetGroupMetricRulesRuleArrayOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) []GetGroupMetricRulesRule { return v.Rules }).(GetGroupMetricRulesRuleArrayOutput)
}

func (o GetGroupMetricRulesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGroupMetricRulesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGroupMetricRulesResultOutput{})
}
