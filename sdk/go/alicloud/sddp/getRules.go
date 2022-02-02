// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package sddp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Sddp Rules of the current Alibaba Cloud user.
//
// > **NOTE:** Available in v1.132.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/sddp"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultRule, err := sddp.NewRule(ctx, "defaultRule", &sddp.RuleArgs{
// 			Category:    pulumi.Int(0),
// 			Content:     pulumi.String("content"),
// 			RuleName:    pulumi.String("rule_name"),
// 			RiskLevelId: pulumi.String("4"),
// 			ProductCode: pulumi.String("ODPS"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultRules := sddp.GetRulesOutput(ctx, sddp.GetRulesOutputArgs{
// 			Ids: pulumi.StringArray{
// 				defaultRule.ID(),
// 			},
// 		}, nil)
// 		ctx.Export("sddpRuleId", defaultRules.ApplyT(func(defaultRules sddp.GetRulesResult) (string, error) {
// 			return defaultRules.Id, nil
// 		}).(pulumi.StringOutput))
// 		return nil
// 	})
// }
// ```
func GetRules(ctx *pulumi.Context, args *GetRulesArgs, opts ...pulumi.InvokeOption) (*GetRulesResult, error) {
	var rv GetRulesResult
	err := ctx.Invoke("alicloud:sddp/getRules:getRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRules.
type GetRulesArgs struct {
	// Sensitive Data Identification Rules for the Type of.
	Category *int `pulumi:"category"`
	// The Content Classification.
	ContentCategory *string `pulumi:"contentCategory"`
	// Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
	CustomType    *int  `pulumi:"customType"`
	EnableDetails *bool `pulumi:"enableDetails"`
	// A list of Rule IDs.
	Ids []string `pulumi:"ids"`
	// The name of rule.
	Name *string `pulumi:"name"`
	// A regex string to filter results by Rule name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
	// Product ID.
	ProductId *string `pulumi:"productId"`
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
	RiskLevelId *string `pulumi:"riskLevelId"`
	// Rule Type.
	RuleType *int `pulumi:"ruleType"`
	// Sensitive Data Identification Rules Detection State of.
	Status *string `pulumi:"status"`
	// The Level of Risk.
	WarnLevel *int `pulumi:"warnLevel"`
}

// A collection of values returned by getRules.
type GetRulesResult struct {
	Category        *int    `pulumi:"category"`
	ContentCategory *string `pulumi:"contentCategory"`
	CustomType      *int    `pulumi:"customType"`
	EnableDetails   *bool   `pulumi:"enableDetails"`
	// The provider-assigned unique ID for this managed resource.
	Id          string         `pulumi:"id"`
	Ids         []string       `pulumi:"ids"`
	Name        *string        `pulumi:"name"`
	NameRegex   *string        `pulumi:"nameRegex"`
	Names       []string       `pulumi:"names"`
	OutputFile  *string        `pulumi:"outputFile"`
	ProductId   *string        `pulumi:"productId"`
	RiskLevelId *string        `pulumi:"riskLevelId"`
	RuleType    *int           `pulumi:"ruleType"`
	Rules       []GetRulesRule `pulumi:"rules"`
	Status      *string        `pulumi:"status"`
	WarnLevel   *int           `pulumi:"warnLevel"`
}

func GetRulesOutput(ctx *pulumi.Context, args GetRulesOutputArgs, opts ...pulumi.InvokeOption) GetRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRulesResult, error) {
			args := v.(GetRulesArgs)
			r, err := GetRules(ctx, &args, opts...)
			return *r, err
		}).(GetRulesResultOutput)
}

// A collection of arguments for invoking getRules.
type GetRulesOutputArgs struct {
	// Sensitive Data Identification Rules for the Type of.
	Category pulumi.IntPtrInput `pulumi:"category"`
	// The Content Classification.
	ContentCategory pulumi.StringPtrInput `pulumi:"contentCategory"`
	// Sensitive Data Identification Rules of Type. 0: the Built-in 1: The User-Defined.
	CustomType    pulumi.IntPtrInput  `pulumi:"customType"`
	EnableDetails pulumi.BoolPtrInput `pulumi:"enableDetails"`
	// A list of Rule IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// The name of rule.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// A regex string to filter results by Rule name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// Product ID.
	ProductId pulumi.StringPtrInput `pulumi:"productId"`
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:1:S1, Weak Risk Level. 2:S2, Medium Risk Level. 3:S3 High Risk Level. 4:S4, the Highest Risk Level.
	RiskLevelId pulumi.StringPtrInput `pulumi:"riskLevelId"`
	// Rule Type.
	RuleType pulumi.IntPtrInput `pulumi:"ruleType"`
	// Sensitive Data Identification Rules Detection State of.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The Level of Risk.
	WarnLevel pulumi.IntPtrInput `pulumi:"warnLevel"`
}

func (GetRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRulesArgs)(nil)).Elem()
}

// A collection of values returned by getRules.
type GetRulesResultOutput struct{ *pulumi.OutputState }

func (GetRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRulesResult)(nil)).Elem()
}

func (o GetRulesResultOutput) ToGetRulesResultOutput() GetRulesResultOutput {
	return o
}

func (o GetRulesResultOutput) ToGetRulesResultOutputWithContext(ctx context.Context) GetRulesResultOutput {
	return o
}

func (o GetRulesResultOutput) Category() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *int { return v.Category }).(pulumi.IntPtrOutput)
}

func (o GetRulesResultOutput) ContentCategory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.ContentCategory }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) CustomType() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *int { return v.CustomType }).(pulumi.IntPtrOutput)
}

func (o GetRulesResultOutput) EnableDetails() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *bool { return v.EnableDetails }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetRulesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetRulesResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetRulesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) ProductId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.ProductId }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) RiskLevelId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.RiskLevelId }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) RuleType() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *int { return v.RuleType }).(pulumi.IntPtrOutput)
}

func (o GetRulesResultOutput) Rules() GetRulesRuleArrayOutput {
	return o.ApplyT(func(v GetRulesResult) []GetRulesRule { return v.Rules }).(GetRulesRuleArrayOutput)
}

func (o GetRulesResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

func (o GetRulesResultOutput) WarnLevel() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetRulesResult) *int { return v.WarnLevel }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRulesResultOutput{})
}
