// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package sddp

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Data Security Center Rule resource.
//
// For information about Data Security Center Rule and how to use it, see [What is Rule](https://help.aliyun.com/product/88674.html).
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
// 		_, err := sddp.NewRule(ctx, "default", &sddp.RuleArgs{
// 			Category:    pulumi.Int(0),
// 			Content:     pulumi.String("content"),
// 			ProductCode: pulumi.String("ODPS"),
// 			RiskLevelId: pulumi.String("4"),
// 			RuleName:    pulumi.String("rule_name"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Data Security Center Rule can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:sddp/rule:Rule example <id>
// ```
type Rule struct {
	pulumi.CustomResourceState

	// Sensitive Data Identification Rules for the Type of. Valid values:
	// * `0`: Keyword.
	// * `2`: Regular expression.
	Category pulumi.IntOutput `pulumi:"category"`
	// Sensitive Data Identification Rules the Content.
	Content pulumi.StringOutput `pulumi:"content"`
	// The Content Classification.
	ContentCategory pulumi.StringOutput `pulumi:"contentCategory"`
	// Sensitive Data Identification Rules of Type. Valid values:
	// * `0`: the Built-in.
	// * `1`: The User-Defined.
	CustomType pulumi.IntOutput `pulumi:"customType"`
	// Sensitive Data Identification a Description of the Rule Information.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Request and Receive the Language of the Message Type. Valid values:
	// * `zh`: Chinese.
	// * `en`: English.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
	ProductCode pulumi.StringPtrOutput `pulumi:"productCode"`
	// Product ID. Valid values:
	// * `1`:MaxCompute
	// * `2`:OSS
	// * `5`:RDS.
	ProductId pulumi.StringPtrOutput `pulumi:"productId"`
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:
	// * `2`:S1, Weak Risk Level.
	// * `3`:S2, Medium Risk Level.
	// * `4`:S3 High Risk Level.
	// * `5`:S4, the Highest Risk Level.
	RiskLevelId pulumi.StringPtrOutput `pulumi:"riskLevelId"`
	// Sensitive Data Identification Name of the Rule.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// Rule Type.
	RuleType pulumi.IntPtrOutput `pulumi:"ruleType"`
	// Triggered the Alarm Conditions.
	StatExpress pulumi.StringPtrOutput `pulumi:"statExpress"`
	// Sensitive Data Identification Rules Detection State of.
	Status pulumi.IntOutput `pulumi:"status"`
	// The Target of rule.
	Target pulumi.StringPtrOutput `pulumi:"target"`
	// The Level of Risk. Valid values:
	// * `1`: Weak warn Level.
	// * `2`: Medium Risk Level.
	// * `3`: High Risk Level.
	WarnLevel pulumi.IntPtrOutput `pulumi:"warnLevel"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Category == nil {
		return nil, errors.New("invalid value for required argument 'Category'")
	}
	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	var resource Rule
	err := ctx.RegisterResource("alicloud:sddp/rule:Rule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRule gets an existing Rule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleState, opts ...pulumi.ResourceOption) (*Rule, error) {
	var resource Rule
	err := ctx.ReadResource("alicloud:sddp/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// Sensitive Data Identification Rules for the Type of. Valid values:
	// * `0`: Keyword.
	// * `2`: Regular expression.
	Category *int `pulumi:"category"`
	// Sensitive Data Identification Rules the Content.
	Content *string `pulumi:"content"`
	// The Content Classification.
	ContentCategory *string `pulumi:"contentCategory"`
	// Sensitive Data Identification Rules of Type. Valid values:
	// * `0`: the Built-in.
	// * `1`: The User-Defined.
	CustomType *int `pulumi:"customType"`
	// Sensitive Data Identification a Description of the Rule Information.
	Description *string `pulumi:"description"`
	// The Request and Receive the Language of the Message Type. Valid values:
	// * `zh`: Chinese.
	// * `en`: English.
	Lang *string `pulumi:"lang"`
	// Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
	ProductCode *string `pulumi:"productCode"`
	// Product ID. Valid values:
	// * `1`:MaxCompute
	// * `2`:OSS
	// * `5`:RDS.
	ProductId *string `pulumi:"productId"`
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:
	// * `2`:S1, Weak Risk Level.
	// * `3`:S2, Medium Risk Level.
	// * `4`:S3 High Risk Level.
	// * `5`:S4, the Highest Risk Level.
	RiskLevelId *string `pulumi:"riskLevelId"`
	// Sensitive Data Identification Name of the Rule.
	RuleName *string `pulumi:"ruleName"`
	// Rule Type.
	RuleType *int `pulumi:"ruleType"`
	// Triggered the Alarm Conditions.
	StatExpress *string `pulumi:"statExpress"`
	// Sensitive Data Identification Rules Detection State of.
	Status *int `pulumi:"status"`
	// The Target of rule.
	Target *string `pulumi:"target"`
	// The Level of Risk. Valid values:
	// * `1`: Weak warn Level.
	// * `2`: Medium Risk Level.
	// * `3`: High Risk Level.
	WarnLevel *int `pulumi:"warnLevel"`
}

type RuleState struct {
	// Sensitive Data Identification Rules for the Type of. Valid values:
	// * `0`: Keyword.
	// * `2`: Regular expression.
	Category pulumi.IntPtrInput
	// Sensitive Data Identification Rules the Content.
	Content pulumi.StringPtrInput
	// The Content Classification.
	ContentCategory pulumi.StringPtrInput
	// Sensitive Data Identification Rules of Type. Valid values:
	// * `0`: the Built-in.
	// * `1`: The User-Defined.
	CustomType pulumi.IntPtrInput
	// Sensitive Data Identification a Description of the Rule Information.
	Description pulumi.StringPtrInput
	// The Request and Receive the Language of the Message Type. Valid values:
	// * `zh`: Chinese.
	// * `en`: English.
	Lang pulumi.StringPtrInput
	// Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
	ProductCode pulumi.StringPtrInput
	// Product ID. Valid values:
	// * `1`:MaxCompute
	// * `2`:OSS
	// * `5`:RDS.
	ProductId pulumi.StringPtrInput
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:
	// * `2`:S1, Weak Risk Level.
	// * `3`:S2, Medium Risk Level.
	// * `4`:S3 High Risk Level.
	// * `5`:S4, the Highest Risk Level.
	RiskLevelId pulumi.StringPtrInput
	// Sensitive Data Identification Name of the Rule.
	RuleName pulumi.StringPtrInput
	// Rule Type.
	RuleType pulumi.IntPtrInput
	// Triggered the Alarm Conditions.
	StatExpress pulumi.StringPtrInput
	// Sensitive Data Identification Rules Detection State of.
	Status pulumi.IntPtrInput
	// The Target of rule.
	Target pulumi.StringPtrInput
	// The Level of Risk. Valid values:
	// * `1`: Weak warn Level.
	// * `2`: Medium Risk Level.
	// * `3`: High Risk Level.
	WarnLevel pulumi.IntPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// Sensitive Data Identification Rules for the Type of. Valid values:
	// * `0`: Keyword.
	// * `2`: Regular expression.
	Category int `pulumi:"category"`
	// Sensitive Data Identification Rules the Content.
	Content string `pulumi:"content"`
	// The Content Classification.
	ContentCategory *string `pulumi:"contentCategory"`
	// Sensitive Data Identification Rules of Type. Valid values:
	// * `0`: the Built-in.
	// * `1`: The User-Defined.
	CustomType *int `pulumi:"customType"`
	// Sensitive Data Identification a Description of the Rule Information.
	Description *string `pulumi:"description"`
	// The Request and Receive the Language of the Message Type. Valid values:
	// * `zh`: Chinese.
	// * `en`: English.
	Lang *string `pulumi:"lang"`
	// Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
	ProductCode *string `pulumi:"productCode"`
	// Product ID. Valid values:
	// * `1`:MaxCompute
	// * `2`:OSS
	// * `5`:RDS.
	ProductId *string `pulumi:"productId"`
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:
	// * `2`:S1, Weak Risk Level.
	// * `3`:S2, Medium Risk Level.
	// * `4`:S3 High Risk Level.
	// * `5`:S4, the Highest Risk Level.
	RiskLevelId *string `pulumi:"riskLevelId"`
	// Sensitive Data Identification Name of the Rule.
	RuleName string `pulumi:"ruleName"`
	// Rule Type.
	RuleType *int `pulumi:"ruleType"`
	// Triggered the Alarm Conditions.
	StatExpress *string `pulumi:"statExpress"`
	// Sensitive Data Identification Rules Detection State of.
	Status *int `pulumi:"status"`
	// The Target of rule.
	Target *string `pulumi:"target"`
	// The Level of Risk. Valid values:
	// * `1`: Weak warn Level.
	// * `2`: Medium Risk Level.
	// * `3`: High Risk Level.
	WarnLevel *int `pulumi:"warnLevel"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// Sensitive Data Identification Rules for the Type of. Valid values:
	// * `0`: Keyword.
	// * `2`: Regular expression.
	Category pulumi.IntInput
	// Sensitive Data Identification Rules the Content.
	Content pulumi.StringInput
	// The Content Classification.
	ContentCategory pulumi.StringPtrInput
	// Sensitive Data Identification Rules of Type. Valid values:
	// * `0`: the Built-in.
	// * `1`: The User-Defined.
	CustomType pulumi.IntPtrInput
	// Sensitive Data Identification a Description of the Rule Information.
	Description pulumi.StringPtrInput
	// The Request and Receive the Language of the Message Type. Valid values:
	// * `zh`: Chinese.
	// * `en`: English.
	Lang pulumi.StringPtrInput
	// Product Code. Valid values: `OSS`,`RDS`,`ODPS`(MaxCompute).
	ProductCode pulumi.StringPtrInput
	// Product ID. Valid values:
	// * `1`:MaxCompute
	// * `2`:OSS
	// * `5`:RDS.
	ProductId pulumi.StringPtrInput
	// Sensitive Data Identification Rules of Risk Level ID. Valid values:
	// * `2`:S1, Weak Risk Level.
	// * `3`:S2, Medium Risk Level.
	// * `4`:S3 High Risk Level.
	// * `5`:S4, the Highest Risk Level.
	RiskLevelId pulumi.StringPtrInput
	// Sensitive Data Identification Name of the Rule.
	RuleName pulumi.StringInput
	// Rule Type.
	RuleType pulumi.IntPtrInput
	// Triggered the Alarm Conditions.
	StatExpress pulumi.StringPtrInput
	// Sensitive Data Identification Rules Detection State of.
	Status pulumi.IntPtrInput
	// The Target of rule.
	Target pulumi.StringPtrInput
	// The Level of Risk. Valid values:
	// * `1`: Weak warn Level.
	// * `2`: Medium Risk Level.
	// * `3`: High Risk Level.
	WarnLevel pulumi.IntPtrInput
}

func (RuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleArgs)(nil)).Elem()
}

type RuleInput interface {
	pulumi.Input

	ToRuleOutput() RuleOutput
	ToRuleOutputWithContext(ctx context.Context) RuleOutput
}

func (*Rule) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (i *Rule) ToRuleOutput() RuleOutput {
	return i.ToRuleOutputWithContext(context.Background())
}

func (i *Rule) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleOutput)
}

// RuleArrayInput is an input type that accepts RuleArray and RuleArrayOutput values.
// You can construct a concrete instance of `RuleArrayInput` via:
//
//          RuleArray{ RuleArgs{...} }
type RuleArrayInput interface {
	pulumi.Input

	ToRuleArrayOutput() RuleArrayOutput
	ToRuleArrayOutputWithContext(context.Context) RuleArrayOutput
}

type RuleArray []RuleInput

func (RuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (i RuleArray) ToRuleArrayOutput() RuleArrayOutput {
	return i.ToRuleArrayOutputWithContext(context.Background())
}

func (i RuleArray) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleArrayOutput)
}

// RuleMapInput is an input type that accepts RuleMap and RuleMapOutput values.
// You can construct a concrete instance of `RuleMapInput` via:
//
//          RuleMap{ "key": RuleArgs{...} }
type RuleMapInput interface {
	pulumi.Input

	ToRuleMapOutput() RuleMapOutput
	ToRuleMapOutputWithContext(context.Context) RuleMapOutput
}

type RuleMap map[string]RuleInput

func (RuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (i RuleMap) ToRuleMapOutput() RuleMapOutput {
	return i.ToRuleMapOutputWithContext(context.Background())
}

func (i RuleMap) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleMapOutput)
}

type RuleOutput struct{ *pulumi.OutputState }

func (RuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (o RuleOutput) ToRuleOutput() RuleOutput {
	return o
}

func (o RuleOutput) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return o
}

type RuleArrayOutput struct{ *pulumi.OutputState }

func (RuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (o RuleArrayOutput) ToRuleArrayOutput() RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) Index(i pulumi.IntInput) RuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].([]*Rule)[vs[1].(int)]
	}).(RuleOutput)
}

type RuleMapOutput struct{ *pulumi.OutputState }

func (RuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (o RuleMapOutput) ToRuleMapOutput() RuleMapOutput {
	return o
}

func (o RuleMapOutput) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return o
}

func (o RuleMapOutput) MapIndex(k pulumi.StringInput) RuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].(map[string]*Rule)[vs[1].(string)]
	}).(RuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleArrayInput)(nil)).Elem(), RuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleMapInput)(nil)).Elem(), RuleMap{})
	pulumi.RegisterOutputType(RuleOutput{})
	pulumi.RegisterOutputType(RuleArrayOutput{})
	pulumi.RegisterOutputType(RuleMapOutput{})
}
