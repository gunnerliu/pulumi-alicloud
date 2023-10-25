// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ddos

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a DdosCoo Scheduler Rule resource. For information about DdosCoo Scheduler Rule and how to use it, see[What is DdosCoo Scheduler Rule](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-createschedulerrule).
//
// > **NOTE:** Available since v1.86.0.
//
// ## Import
//
// DdosCoo Scheduler Rule can be imported using the id or the rule name, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ddos/schedulerRule:SchedulerRule example fbb20dc77e8fc******
//
// ```
type SchedulerRule struct {
	pulumi.CustomResourceState

	// The cname is the traffic scheduler corresponding to rules.
	Cname pulumi.StringOutput `pulumi:"cname"`
	// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
	Param pulumi.StringPtrOutput `pulumi:"param"`
	// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
	ResourceGroupId pulumi.StringPtrOutput `pulumi:"resourceGroupId"`
	// The name of the rule.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The rule type. Valid values:
	// `2`: tiered protection.
	// `3`: globalization acceleration.
	// `6`: Cloud product interaction.
	RuleType pulumi.IntOutput `pulumi:"ruleType"`
	// The information about the scheduling rules. See `rules` below.
	Rules SchedulerRuleRuleArrayOutput `pulumi:"rules"`
}

// NewSchedulerRule registers a new resource with the given unique name, arguments, and options.
func NewSchedulerRule(ctx *pulumi.Context,
	name string, args *SchedulerRuleArgs, opts ...pulumi.ResourceOption) (*SchedulerRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	if args.RuleType == nil {
		return nil, errors.New("invalid value for required argument 'RuleType'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SchedulerRule
	err := ctx.RegisterResource("alicloud:ddos/schedulerRule:SchedulerRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchedulerRule gets an existing SchedulerRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchedulerRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchedulerRuleState, opts ...pulumi.ResourceOption) (*SchedulerRule, error) {
	var resource SchedulerRule
	err := ctx.ReadResource("alicloud:ddos/schedulerRule:SchedulerRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchedulerRule resources.
type schedulerRuleState struct {
	// The cname is the traffic scheduler corresponding to rules.
	Cname *string `pulumi:"cname"`
	// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
	Param *string `pulumi:"param"`
	// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the rule.
	RuleName *string `pulumi:"ruleName"`
	// The rule type. Valid values:
	// `2`: tiered protection.
	// `3`: globalization acceleration.
	// `6`: Cloud product interaction.
	RuleType *int `pulumi:"ruleType"`
	// The information about the scheduling rules. See `rules` below.
	Rules []SchedulerRuleRule `pulumi:"rules"`
}

type SchedulerRuleState struct {
	// The cname is the traffic scheduler corresponding to rules.
	Cname pulumi.StringPtrInput
	// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
	Param pulumi.StringPtrInput
	// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the rule.
	RuleName pulumi.StringPtrInput
	// The rule type. Valid values:
	// `2`: tiered protection.
	// `3`: globalization acceleration.
	// `6`: Cloud product interaction.
	RuleType pulumi.IntPtrInput
	// The information about the scheduling rules. See `rules` below.
	Rules SchedulerRuleRuleArrayInput
}

func (SchedulerRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*schedulerRuleState)(nil)).Elem()
}

type schedulerRuleArgs struct {
	// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
	Param *string `pulumi:"param"`
	// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The name of the rule.
	RuleName string `pulumi:"ruleName"`
	// The rule type. Valid values:
	// `2`: tiered protection.
	// `3`: globalization acceleration.
	// `6`: Cloud product interaction.
	RuleType int `pulumi:"ruleType"`
	// The information about the scheduling rules. See `rules` below.
	Rules []SchedulerRuleRule `pulumi:"rules"`
}

// The set of arguments for constructing a SchedulerRule resource.
type SchedulerRuleArgs struct {
	// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
	Param pulumi.StringPtrInput
	// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
	ResourceGroupId pulumi.StringPtrInput
	// The name of the rule.
	RuleName pulumi.StringInput
	// The rule type. Valid values:
	// `2`: tiered protection.
	// `3`: globalization acceleration.
	// `6`: Cloud product interaction.
	RuleType pulumi.IntInput
	// The information about the scheduling rules. See `rules` below.
	Rules SchedulerRuleRuleArrayInput
}

func (SchedulerRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schedulerRuleArgs)(nil)).Elem()
}

type SchedulerRuleInput interface {
	pulumi.Input

	ToSchedulerRuleOutput() SchedulerRuleOutput
	ToSchedulerRuleOutputWithContext(ctx context.Context) SchedulerRuleOutput
}

func (*SchedulerRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SchedulerRule)(nil)).Elem()
}

func (i *SchedulerRule) ToSchedulerRuleOutput() SchedulerRuleOutput {
	return i.ToSchedulerRuleOutputWithContext(context.Background())
}

func (i *SchedulerRule) ToSchedulerRuleOutputWithContext(ctx context.Context) SchedulerRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerRuleOutput)
}

func (i *SchedulerRule) ToOutput(ctx context.Context) pulumix.Output[*SchedulerRule] {
	return pulumix.Output[*SchedulerRule]{
		OutputState: i.ToSchedulerRuleOutputWithContext(ctx).OutputState,
	}
}

// SchedulerRuleArrayInput is an input type that accepts SchedulerRuleArray and SchedulerRuleArrayOutput values.
// You can construct a concrete instance of `SchedulerRuleArrayInput` via:
//
//	SchedulerRuleArray{ SchedulerRuleArgs{...} }
type SchedulerRuleArrayInput interface {
	pulumi.Input

	ToSchedulerRuleArrayOutput() SchedulerRuleArrayOutput
	ToSchedulerRuleArrayOutputWithContext(context.Context) SchedulerRuleArrayOutput
}

type SchedulerRuleArray []SchedulerRuleInput

func (SchedulerRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchedulerRule)(nil)).Elem()
}

func (i SchedulerRuleArray) ToSchedulerRuleArrayOutput() SchedulerRuleArrayOutput {
	return i.ToSchedulerRuleArrayOutputWithContext(context.Background())
}

func (i SchedulerRuleArray) ToSchedulerRuleArrayOutputWithContext(ctx context.Context) SchedulerRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerRuleArrayOutput)
}

func (i SchedulerRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*SchedulerRule] {
	return pulumix.Output[[]*SchedulerRule]{
		OutputState: i.ToSchedulerRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// SchedulerRuleMapInput is an input type that accepts SchedulerRuleMap and SchedulerRuleMapOutput values.
// You can construct a concrete instance of `SchedulerRuleMapInput` via:
//
//	SchedulerRuleMap{ "key": SchedulerRuleArgs{...} }
type SchedulerRuleMapInput interface {
	pulumi.Input

	ToSchedulerRuleMapOutput() SchedulerRuleMapOutput
	ToSchedulerRuleMapOutputWithContext(context.Context) SchedulerRuleMapOutput
}

type SchedulerRuleMap map[string]SchedulerRuleInput

func (SchedulerRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchedulerRule)(nil)).Elem()
}

func (i SchedulerRuleMap) ToSchedulerRuleMapOutput() SchedulerRuleMapOutput {
	return i.ToSchedulerRuleMapOutputWithContext(context.Background())
}

func (i SchedulerRuleMap) ToSchedulerRuleMapOutputWithContext(ctx context.Context) SchedulerRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchedulerRuleMapOutput)
}

func (i SchedulerRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SchedulerRule] {
	return pulumix.Output[map[string]*SchedulerRule]{
		OutputState: i.ToSchedulerRuleMapOutputWithContext(ctx).OutputState,
	}
}

type SchedulerRuleOutput struct{ *pulumi.OutputState }

func (SchedulerRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchedulerRule)(nil)).Elem()
}

func (o SchedulerRuleOutput) ToSchedulerRuleOutput() SchedulerRuleOutput {
	return o
}

func (o SchedulerRuleOutput) ToSchedulerRuleOutputWithContext(ctx context.Context) SchedulerRuleOutput {
	return o
}

func (o SchedulerRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*SchedulerRule] {
	return pulumix.Output[*SchedulerRule]{
		OutputState: o.OutputState,
	}
}

// The cname is the traffic scheduler corresponding to rules.
func (o SchedulerRuleOutput) Cname() pulumi.StringOutput {
	return o.ApplyT(func(v *SchedulerRule) pulumi.StringOutput { return v.Cname }).(pulumi.StringOutput)
}

// The scheduling rule for the Global Accelerator instance that interacts with Anti-DDoS Pro or Anti-DDoS Premium.
func (o SchedulerRuleOutput) Param() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchedulerRule) pulumi.StringPtrOutput { return v.Param }).(pulumi.StringPtrOutput)
}

// The ID of the resource group to which the anti-DDoS pro instance belongs in resource management. By default, no value is specified, indicating that the domains in the default resource group are listed.
func (o SchedulerRuleOutput) ResourceGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchedulerRule) pulumi.StringPtrOutput { return v.ResourceGroupId }).(pulumi.StringPtrOutput)
}

// The name of the rule.
func (o SchedulerRuleOutput) RuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *SchedulerRule) pulumi.StringOutput { return v.RuleName }).(pulumi.StringOutput)
}

// The rule type. Valid values:
// `2`: tiered protection.
// `3`: globalization acceleration.
// `6`: Cloud product interaction.
func (o SchedulerRuleOutput) RuleType() pulumi.IntOutput {
	return o.ApplyT(func(v *SchedulerRule) pulumi.IntOutput { return v.RuleType }).(pulumi.IntOutput)
}

// The information about the scheduling rules. See `rules` below.
func (o SchedulerRuleOutput) Rules() SchedulerRuleRuleArrayOutput {
	return o.ApplyT(func(v *SchedulerRule) SchedulerRuleRuleArrayOutput { return v.Rules }).(SchedulerRuleRuleArrayOutput)
}

type SchedulerRuleArrayOutput struct{ *pulumi.OutputState }

func (SchedulerRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchedulerRule)(nil)).Elem()
}

func (o SchedulerRuleArrayOutput) ToSchedulerRuleArrayOutput() SchedulerRuleArrayOutput {
	return o
}

func (o SchedulerRuleArrayOutput) ToSchedulerRuleArrayOutputWithContext(ctx context.Context) SchedulerRuleArrayOutput {
	return o
}

func (o SchedulerRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SchedulerRule] {
	return pulumix.Output[[]*SchedulerRule]{
		OutputState: o.OutputState,
	}
}

func (o SchedulerRuleArrayOutput) Index(i pulumi.IntInput) SchedulerRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchedulerRule {
		return vs[0].([]*SchedulerRule)[vs[1].(int)]
	}).(SchedulerRuleOutput)
}

type SchedulerRuleMapOutput struct{ *pulumi.OutputState }

func (SchedulerRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchedulerRule)(nil)).Elem()
}

func (o SchedulerRuleMapOutput) ToSchedulerRuleMapOutput() SchedulerRuleMapOutput {
	return o
}

func (o SchedulerRuleMapOutput) ToSchedulerRuleMapOutputWithContext(ctx context.Context) SchedulerRuleMapOutput {
	return o
}

func (o SchedulerRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SchedulerRule] {
	return pulumix.Output[map[string]*SchedulerRule]{
		OutputState: o.OutputState,
	}
}

func (o SchedulerRuleMapOutput) MapIndex(k pulumi.StringInput) SchedulerRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchedulerRule {
		return vs[0].(map[string]*SchedulerRule)[vs[1].(string)]
	}).(SchedulerRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerRuleInput)(nil)).Elem(), &SchedulerRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerRuleArrayInput)(nil)).Elem(), SchedulerRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchedulerRuleMapInput)(nil)).Elem(), SchedulerRuleMap{})
	pulumi.RegisterOutputType(SchedulerRuleOutput{})
	pulumi.RegisterOutputType(SchedulerRuleArrayOutput{})
	pulumi.RegisterOutputType(SchedulerRuleMapOutput{})
}
