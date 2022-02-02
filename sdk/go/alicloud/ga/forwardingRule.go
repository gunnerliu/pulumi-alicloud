// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ga

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Global Accelerator (GA) Forwarding Rule resource.
//
// For information about Global Accelerator (GA) Forwarding Rule and how to use it, see [What is Forwarding Rule](https://www.alibabacloud.com/help/zh/doc-detail/205815.htm).
//
// > **NOTE:** Available in v1.120.0+.
//
// ## Import
//
// Ga Forwarding Rule can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ga/forwardingRule:ForwardingRule example <id>
// ```
type ForwardingRule struct {
	pulumi.CustomResourceState

	// The ID of the Global Accelerator instance.
	AcceleratorId pulumi.StringOutput `pulumi:"acceleratorId"`
	// Forwarding Policy ID.
	ForwardingRuleId pulumi.StringOutput `pulumi:"forwardingRuleId"`
	// Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
	ForwardingRuleName pulumi.StringPtrOutput `pulumi:"forwardingRuleName"`
	// Forwarding Policy Status.
	ForwardingRuleStatus pulumi.StringOutput `pulumi:"forwardingRuleStatus"`
	// The ID of the listener.
	ListenerId pulumi.StringOutput `pulumi:"listenerId"`
	// Forwarding policy priority.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// Forward action.
	RuleActions ForwardingRuleRuleActionArrayOutput `pulumi:"ruleActions"`
	// Forwarding condition list.
	RuleConditions ForwardingRuleRuleConditionArrayOutput `pulumi:"ruleConditions"`
}

// NewForwardingRule registers a new resource with the given unique name, arguments, and options.
func NewForwardingRule(ctx *pulumi.Context,
	name string, args *ForwardingRuleArgs, opts ...pulumi.ResourceOption) (*ForwardingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AcceleratorId == nil {
		return nil, errors.New("invalid value for required argument 'AcceleratorId'")
	}
	if args.ListenerId == nil {
		return nil, errors.New("invalid value for required argument 'ListenerId'")
	}
	if args.RuleActions == nil {
		return nil, errors.New("invalid value for required argument 'RuleActions'")
	}
	if args.RuleConditions == nil {
		return nil, errors.New("invalid value for required argument 'RuleConditions'")
	}
	var resource ForwardingRule
	err := ctx.RegisterResource("alicloud:ga/forwardingRule:ForwardingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetForwardingRule gets an existing ForwardingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetForwardingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ForwardingRuleState, opts ...pulumi.ResourceOption) (*ForwardingRule, error) {
	var resource ForwardingRule
	err := ctx.ReadResource("alicloud:ga/forwardingRule:ForwardingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ForwardingRule resources.
type forwardingRuleState struct {
	// The ID of the Global Accelerator instance.
	AcceleratorId *string `pulumi:"acceleratorId"`
	// Forwarding Policy ID.
	ForwardingRuleId *string `pulumi:"forwardingRuleId"`
	// Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
	ForwardingRuleName *string `pulumi:"forwardingRuleName"`
	// Forwarding Policy Status.
	ForwardingRuleStatus *string `pulumi:"forwardingRuleStatus"`
	// The ID of the listener.
	ListenerId *string `pulumi:"listenerId"`
	// Forwarding policy priority.
	Priority *int `pulumi:"priority"`
	// Forward action.
	RuleActions []ForwardingRuleRuleAction `pulumi:"ruleActions"`
	// Forwarding condition list.
	RuleConditions []ForwardingRuleRuleCondition `pulumi:"ruleConditions"`
}

type ForwardingRuleState struct {
	// The ID of the Global Accelerator instance.
	AcceleratorId pulumi.StringPtrInput
	// Forwarding Policy ID.
	ForwardingRuleId pulumi.StringPtrInput
	// Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
	ForwardingRuleName pulumi.StringPtrInput
	// Forwarding Policy Status.
	ForwardingRuleStatus pulumi.StringPtrInput
	// The ID of the listener.
	ListenerId pulumi.StringPtrInput
	// Forwarding policy priority.
	Priority pulumi.IntPtrInput
	// Forward action.
	RuleActions ForwardingRuleRuleActionArrayInput
	// Forwarding condition list.
	RuleConditions ForwardingRuleRuleConditionArrayInput
}

func (ForwardingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*forwardingRuleState)(nil)).Elem()
}

type forwardingRuleArgs struct {
	// The ID of the Global Accelerator instance.
	AcceleratorId string `pulumi:"acceleratorId"`
	// Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
	ForwardingRuleName *string `pulumi:"forwardingRuleName"`
	// The ID of the listener.
	ListenerId string `pulumi:"listenerId"`
	// Forwarding policy priority.
	Priority *int `pulumi:"priority"`
	// Forward action.
	RuleActions []ForwardingRuleRuleAction `pulumi:"ruleActions"`
	// Forwarding condition list.
	RuleConditions []ForwardingRuleRuleCondition `pulumi:"ruleConditions"`
}

// The set of arguments for constructing a ForwardingRule resource.
type ForwardingRuleArgs struct {
	// The ID of the Global Accelerator instance.
	AcceleratorId pulumi.StringInput
	// Forwarding policy name. The length of the name is 2-128 English or Chinese characters. It must start with uppercase and lowercase letters or Chinese characters. It can contain numbers, half width period (.), underscores (_) And dash (-).
	ForwardingRuleName pulumi.StringPtrInput
	// The ID of the listener.
	ListenerId pulumi.StringInput
	// Forwarding policy priority.
	Priority pulumi.IntPtrInput
	// Forward action.
	RuleActions ForwardingRuleRuleActionArrayInput
	// Forwarding condition list.
	RuleConditions ForwardingRuleRuleConditionArrayInput
}

func (ForwardingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*forwardingRuleArgs)(nil)).Elem()
}

type ForwardingRuleInput interface {
	pulumi.Input

	ToForwardingRuleOutput() ForwardingRuleOutput
	ToForwardingRuleOutputWithContext(ctx context.Context) ForwardingRuleOutput
}

func (*ForwardingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ForwardingRule)(nil)).Elem()
}

func (i *ForwardingRule) ToForwardingRuleOutput() ForwardingRuleOutput {
	return i.ToForwardingRuleOutputWithContext(context.Background())
}

func (i *ForwardingRule) ToForwardingRuleOutputWithContext(ctx context.Context) ForwardingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardingRuleOutput)
}

// ForwardingRuleArrayInput is an input type that accepts ForwardingRuleArray and ForwardingRuleArrayOutput values.
// You can construct a concrete instance of `ForwardingRuleArrayInput` via:
//
//          ForwardingRuleArray{ ForwardingRuleArgs{...} }
type ForwardingRuleArrayInput interface {
	pulumi.Input

	ToForwardingRuleArrayOutput() ForwardingRuleArrayOutput
	ToForwardingRuleArrayOutputWithContext(context.Context) ForwardingRuleArrayOutput
}

type ForwardingRuleArray []ForwardingRuleInput

func (ForwardingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ForwardingRule)(nil)).Elem()
}

func (i ForwardingRuleArray) ToForwardingRuleArrayOutput() ForwardingRuleArrayOutput {
	return i.ToForwardingRuleArrayOutputWithContext(context.Background())
}

func (i ForwardingRuleArray) ToForwardingRuleArrayOutputWithContext(ctx context.Context) ForwardingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardingRuleArrayOutput)
}

// ForwardingRuleMapInput is an input type that accepts ForwardingRuleMap and ForwardingRuleMapOutput values.
// You can construct a concrete instance of `ForwardingRuleMapInput` via:
//
//          ForwardingRuleMap{ "key": ForwardingRuleArgs{...} }
type ForwardingRuleMapInput interface {
	pulumi.Input

	ToForwardingRuleMapOutput() ForwardingRuleMapOutput
	ToForwardingRuleMapOutputWithContext(context.Context) ForwardingRuleMapOutput
}

type ForwardingRuleMap map[string]ForwardingRuleInput

func (ForwardingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ForwardingRule)(nil)).Elem()
}

func (i ForwardingRuleMap) ToForwardingRuleMapOutput() ForwardingRuleMapOutput {
	return i.ToForwardingRuleMapOutputWithContext(context.Background())
}

func (i ForwardingRuleMap) ToForwardingRuleMapOutputWithContext(ctx context.Context) ForwardingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ForwardingRuleMapOutput)
}

type ForwardingRuleOutput struct{ *pulumi.OutputState }

func (ForwardingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ForwardingRule)(nil)).Elem()
}

func (o ForwardingRuleOutput) ToForwardingRuleOutput() ForwardingRuleOutput {
	return o
}

func (o ForwardingRuleOutput) ToForwardingRuleOutputWithContext(ctx context.Context) ForwardingRuleOutput {
	return o
}

type ForwardingRuleArrayOutput struct{ *pulumi.OutputState }

func (ForwardingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ForwardingRule)(nil)).Elem()
}

func (o ForwardingRuleArrayOutput) ToForwardingRuleArrayOutput() ForwardingRuleArrayOutput {
	return o
}

func (o ForwardingRuleArrayOutput) ToForwardingRuleArrayOutputWithContext(ctx context.Context) ForwardingRuleArrayOutput {
	return o
}

func (o ForwardingRuleArrayOutput) Index(i pulumi.IntInput) ForwardingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ForwardingRule {
		return vs[0].([]*ForwardingRule)[vs[1].(int)]
	}).(ForwardingRuleOutput)
}

type ForwardingRuleMapOutput struct{ *pulumi.OutputState }

func (ForwardingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ForwardingRule)(nil)).Elem()
}

func (o ForwardingRuleMapOutput) ToForwardingRuleMapOutput() ForwardingRuleMapOutput {
	return o
}

func (o ForwardingRuleMapOutput) ToForwardingRuleMapOutputWithContext(ctx context.Context) ForwardingRuleMapOutput {
	return o
}

func (o ForwardingRuleMapOutput) MapIndex(k pulumi.StringInput) ForwardingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ForwardingRule {
		return vs[0].(map[string]*ForwardingRule)[vs[1].(string)]
	}).(ForwardingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardingRuleInput)(nil)).Elem(), &ForwardingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardingRuleArrayInput)(nil)).Elem(), ForwardingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ForwardingRuleMapInput)(nil)).Elem(), ForwardingRuleMap{})
	pulumi.RegisterOutputType(ForwardingRuleOutput{})
	pulumi.RegisterOutputType(ForwardingRuleArrayOutput{})
	pulumi.RegisterOutputType(ForwardingRuleMapOutput{})
}
