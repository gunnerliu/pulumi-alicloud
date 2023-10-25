// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sae

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Serverless App Engine (SAE) Application Scaling Rule resource.
//
// For information about Serverless App Engine (SAE) Application Scaling Rule and how to use it, see [What is Application Scaling Rule](https://www.alibabacloud.com/help/en/sae/latest/create-application-scaling-rule).
//
// > **NOTE:** Available since v1.159.0.
//
// ## Import
//
// Serverless App Engine (SAE) Application Scaling Rule can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:sae/applicationScalingRule:ApplicationScalingRule example <app_id>:<scaling_rule_name>
//
// ```
type ApplicationScalingRule struct {
	pulumi.CustomResourceState

	// Application ID.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// The min ready instance ratio.
	MinReadyInstanceRatio pulumi.IntPtrOutput `pulumi:"minReadyInstanceRatio"`
	// The min ready instances.
	MinReadyInstances pulumi.IntPtrOutput `pulumi:"minReadyInstances"`
	// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
	ScalingRuleEnable pulumi.BoolOutput `pulumi:"scalingRuleEnable"`
	// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
	ScalingRuleMetric ApplicationScalingRuleScalingRuleMetricPtrOutput `pulumi:"scalingRuleMetric"`
	// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
	ScalingRuleName pulumi.StringOutput `pulumi:"scalingRuleName"`
	// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
	ScalingRuleTimer ApplicationScalingRuleScalingRuleTimerPtrOutput `pulumi:"scalingRuleTimer"`
	// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
	ScalingRuleType pulumi.StringOutput `pulumi:"scalingRuleType"`
}

// NewApplicationScalingRule registers a new resource with the given unique name, arguments, and options.
func NewApplicationScalingRule(ctx *pulumi.Context,
	name string, args *ApplicationScalingRuleArgs, opts ...pulumi.ResourceOption) (*ApplicationScalingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.ScalingRuleName == nil {
		return nil, errors.New("invalid value for required argument 'ScalingRuleName'")
	}
	if args.ScalingRuleType == nil {
		return nil, errors.New("invalid value for required argument 'ScalingRuleType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationScalingRule
	err := ctx.RegisterResource("alicloud:sae/applicationScalingRule:ApplicationScalingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationScalingRule gets an existing ApplicationScalingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationScalingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationScalingRuleState, opts ...pulumi.ResourceOption) (*ApplicationScalingRule, error) {
	var resource ApplicationScalingRule
	err := ctx.ReadResource("alicloud:sae/applicationScalingRule:ApplicationScalingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationScalingRule resources.
type applicationScalingRuleState struct {
	// Application ID.
	AppId *string `pulumi:"appId"`
	// The min ready instance ratio.
	MinReadyInstanceRatio *int `pulumi:"minReadyInstanceRatio"`
	// The min ready instances.
	MinReadyInstances *int `pulumi:"minReadyInstances"`
	// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
	ScalingRuleEnable *bool `pulumi:"scalingRuleEnable"`
	// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
	ScalingRuleMetric *ApplicationScalingRuleScalingRuleMetric `pulumi:"scalingRuleMetric"`
	// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
	ScalingRuleName *string `pulumi:"scalingRuleName"`
	// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
	ScalingRuleTimer *ApplicationScalingRuleScalingRuleTimer `pulumi:"scalingRuleTimer"`
	// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
	ScalingRuleType *string `pulumi:"scalingRuleType"`
}

type ApplicationScalingRuleState struct {
	// Application ID.
	AppId pulumi.StringPtrInput
	// The min ready instance ratio.
	MinReadyInstanceRatio pulumi.IntPtrInput
	// The min ready instances.
	MinReadyInstances pulumi.IntPtrInput
	// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
	ScalingRuleEnable pulumi.BoolPtrInput
	// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
	ScalingRuleMetric ApplicationScalingRuleScalingRuleMetricPtrInput
	// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
	ScalingRuleName pulumi.StringPtrInput
	// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
	ScalingRuleTimer ApplicationScalingRuleScalingRuleTimerPtrInput
	// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
	ScalingRuleType pulumi.StringPtrInput
}

func (ApplicationScalingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationScalingRuleState)(nil)).Elem()
}

type applicationScalingRuleArgs struct {
	// Application ID.
	AppId string `pulumi:"appId"`
	// The min ready instance ratio.
	MinReadyInstanceRatio *int `pulumi:"minReadyInstanceRatio"`
	// The min ready instances.
	MinReadyInstances *int `pulumi:"minReadyInstances"`
	// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
	ScalingRuleEnable *bool `pulumi:"scalingRuleEnable"`
	// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
	ScalingRuleMetric *ApplicationScalingRuleScalingRuleMetric `pulumi:"scalingRuleMetric"`
	// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
	ScalingRuleName string `pulumi:"scalingRuleName"`
	// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
	ScalingRuleTimer *ApplicationScalingRuleScalingRuleTimer `pulumi:"scalingRuleTimer"`
	// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
	ScalingRuleType string `pulumi:"scalingRuleType"`
}

// The set of arguments for constructing a ApplicationScalingRule resource.
type ApplicationScalingRuleArgs struct {
	// Application ID.
	AppId pulumi.StringInput
	// The min ready instance ratio.
	MinReadyInstanceRatio pulumi.IntPtrInput
	// The min ready instances.
	MinReadyInstances pulumi.IntPtrInput
	// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
	ScalingRuleEnable pulumi.BoolPtrInput
	// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
	ScalingRuleMetric ApplicationScalingRuleScalingRuleMetricPtrInput
	// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
	ScalingRuleName pulumi.StringInput
	// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
	ScalingRuleTimer ApplicationScalingRuleScalingRuleTimerPtrInput
	// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
	ScalingRuleType pulumi.StringInput
}

func (ApplicationScalingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationScalingRuleArgs)(nil)).Elem()
}

type ApplicationScalingRuleInput interface {
	pulumi.Input

	ToApplicationScalingRuleOutput() ApplicationScalingRuleOutput
	ToApplicationScalingRuleOutputWithContext(ctx context.Context) ApplicationScalingRuleOutput
}

func (*ApplicationScalingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationScalingRule)(nil)).Elem()
}

func (i *ApplicationScalingRule) ToApplicationScalingRuleOutput() ApplicationScalingRuleOutput {
	return i.ToApplicationScalingRuleOutputWithContext(context.Background())
}

func (i *ApplicationScalingRule) ToApplicationScalingRuleOutputWithContext(ctx context.Context) ApplicationScalingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationScalingRuleOutput)
}

func (i *ApplicationScalingRule) ToOutput(ctx context.Context) pulumix.Output[*ApplicationScalingRule] {
	return pulumix.Output[*ApplicationScalingRule]{
		OutputState: i.ToApplicationScalingRuleOutputWithContext(ctx).OutputState,
	}
}

// ApplicationScalingRuleArrayInput is an input type that accepts ApplicationScalingRuleArray and ApplicationScalingRuleArrayOutput values.
// You can construct a concrete instance of `ApplicationScalingRuleArrayInput` via:
//
//	ApplicationScalingRuleArray{ ApplicationScalingRuleArgs{...} }
type ApplicationScalingRuleArrayInput interface {
	pulumi.Input

	ToApplicationScalingRuleArrayOutput() ApplicationScalingRuleArrayOutput
	ToApplicationScalingRuleArrayOutputWithContext(context.Context) ApplicationScalingRuleArrayOutput
}

type ApplicationScalingRuleArray []ApplicationScalingRuleInput

func (ApplicationScalingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationScalingRule)(nil)).Elem()
}

func (i ApplicationScalingRuleArray) ToApplicationScalingRuleArrayOutput() ApplicationScalingRuleArrayOutput {
	return i.ToApplicationScalingRuleArrayOutputWithContext(context.Background())
}

func (i ApplicationScalingRuleArray) ToApplicationScalingRuleArrayOutputWithContext(ctx context.Context) ApplicationScalingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationScalingRuleArrayOutput)
}

func (i ApplicationScalingRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*ApplicationScalingRule] {
	return pulumix.Output[[]*ApplicationScalingRule]{
		OutputState: i.ToApplicationScalingRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// ApplicationScalingRuleMapInput is an input type that accepts ApplicationScalingRuleMap and ApplicationScalingRuleMapOutput values.
// You can construct a concrete instance of `ApplicationScalingRuleMapInput` via:
//
//	ApplicationScalingRuleMap{ "key": ApplicationScalingRuleArgs{...} }
type ApplicationScalingRuleMapInput interface {
	pulumi.Input

	ToApplicationScalingRuleMapOutput() ApplicationScalingRuleMapOutput
	ToApplicationScalingRuleMapOutputWithContext(context.Context) ApplicationScalingRuleMapOutput
}

type ApplicationScalingRuleMap map[string]ApplicationScalingRuleInput

func (ApplicationScalingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationScalingRule)(nil)).Elem()
}

func (i ApplicationScalingRuleMap) ToApplicationScalingRuleMapOutput() ApplicationScalingRuleMapOutput {
	return i.ToApplicationScalingRuleMapOutputWithContext(context.Background())
}

func (i ApplicationScalingRuleMap) ToApplicationScalingRuleMapOutputWithContext(ctx context.Context) ApplicationScalingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationScalingRuleMapOutput)
}

func (i ApplicationScalingRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ApplicationScalingRule] {
	return pulumix.Output[map[string]*ApplicationScalingRule]{
		OutputState: i.ToApplicationScalingRuleMapOutputWithContext(ctx).OutputState,
	}
}

type ApplicationScalingRuleOutput struct{ *pulumi.OutputState }

func (ApplicationScalingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationScalingRule)(nil)).Elem()
}

func (o ApplicationScalingRuleOutput) ToApplicationScalingRuleOutput() ApplicationScalingRuleOutput {
	return o
}

func (o ApplicationScalingRuleOutput) ToApplicationScalingRuleOutputWithContext(ctx context.Context) ApplicationScalingRuleOutput {
	return o
}

func (o ApplicationScalingRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*ApplicationScalingRule] {
	return pulumix.Output[*ApplicationScalingRule]{
		OutputState: o.OutputState,
	}
}

// Application ID.
func (o ApplicationScalingRuleOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// The min ready instance ratio.
func (o ApplicationScalingRuleOutput) MinReadyInstanceRatio() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.IntPtrOutput { return v.MinReadyInstanceRatio }).(pulumi.IntPtrOutput)
}

// The min ready instances.
func (o ApplicationScalingRuleOutput) MinReadyInstances() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.IntPtrOutput { return v.MinReadyInstances }).(pulumi.IntPtrOutput)
}

// True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
func (o ApplicationScalingRuleOutput) ScalingRuleEnable() pulumi.BoolOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.BoolOutput { return v.ScalingRuleEnable }).(pulumi.BoolOutput)
}

// Monitor the configuration of the indicator elasticity strategy. See `scalingRuleMetric` below.
func (o ApplicationScalingRuleOutput) ScalingRuleMetric() ApplicationScalingRuleScalingRuleMetricPtrOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) ApplicationScalingRuleScalingRuleMetricPtrOutput {
		return v.ScalingRuleMetric
	}).(ApplicationScalingRuleScalingRuleMetricPtrOutput)
}

// The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
func (o ApplicationScalingRuleOutput) ScalingRuleName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.StringOutput { return v.ScalingRuleName }).(pulumi.StringOutput)
}

// Configuration of Timing Resilient Policies. See `scalingRuleTimer` below.
func (o ApplicationScalingRuleOutput) ScalingRuleTimer() ApplicationScalingRuleScalingRuleTimerPtrOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) ApplicationScalingRuleScalingRuleTimerPtrOutput {
		return v.ScalingRuleTimer
	}).(ApplicationScalingRuleScalingRuleTimerPtrOutput)
}

// Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
func (o ApplicationScalingRuleOutput) ScalingRuleType() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationScalingRule) pulumi.StringOutput { return v.ScalingRuleType }).(pulumi.StringOutput)
}

type ApplicationScalingRuleArrayOutput struct{ *pulumi.OutputState }

func (ApplicationScalingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationScalingRule)(nil)).Elem()
}

func (o ApplicationScalingRuleArrayOutput) ToApplicationScalingRuleArrayOutput() ApplicationScalingRuleArrayOutput {
	return o
}

func (o ApplicationScalingRuleArrayOutput) ToApplicationScalingRuleArrayOutputWithContext(ctx context.Context) ApplicationScalingRuleArrayOutput {
	return o
}

func (o ApplicationScalingRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ApplicationScalingRule] {
	return pulumix.Output[[]*ApplicationScalingRule]{
		OutputState: o.OutputState,
	}
}

func (o ApplicationScalingRuleArrayOutput) Index(i pulumi.IntInput) ApplicationScalingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationScalingRule {
		return vs[0].([]*ApplicationScalingRule)[vs[1].(int)]
	}).(ApplicationScalingRuleOutput)
}

type ApplicationScalingRuleMapOutput struct{ *pulumi.OutputState }

func (ApplicationScalingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationScalingRule)(nil)).Elem()
}

func (o ApplicationScalingRuleMapOutput) ToApplicationScalingRuleMapOutput() ApplicationScalingRuleMapOutput {
	return o
}

func (o ApplicationScalingRuleMapOutput) ToApplicationScalingRuleMapOutputWithContext(ctx context.Context) ApplicationScalingRuleMapOutput {
	return o
}

func (o ApplicationScalingRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ApplicationScalingRule] {
	return pulumix.Output[map[string]*ApplicationScalingRule]{
		OutputState: o.OutputState,
	}
}

func (o ApplicationScalingRuleMapOutput) MapIndex(k pulumi.StringInput) ApplicationScalingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationScalingRule {
		return vs[0].(map[string]*ApplicationScalingRule)[vs[1].(string)]
	}).(ApplicationScalingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationScalingRuleInput)(nil)).Elem(), &ApplicationScalingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationScalingRuleArrayInput)(nil)).Elem(), ApplicationScalingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationScalingRuleMapInput)(nil)).Elem(), ApplicationScalingRuleMap{})
	pulumi.RegisterOutputType(ApplicationScalingRuleOutput{})
	pulumi.RegisterOutputType(ApplicationScalingRuleArrayOutput{})
	pulumi.RegisterOutputType(ApplicationScalingRuleMapOutput{})
}
