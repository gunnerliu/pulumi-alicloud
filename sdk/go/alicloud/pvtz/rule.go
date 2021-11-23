// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package pvtz

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Private Zone Rule resource.
//
// For information about Private Zone Rule and how to use it, see [What is Rule](https://www.alibabacloud.com/help/en/doc-detail/177601.htm).
//
// > **NOTE:** Available in v1.143.0+.
//
// ## Import
//
// Private Zone Rule can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:pvtz/rule:Rule example <id>
// ```
type Rule struct {
	pulumi.CustomResourceState

	// The ID of the Endpoint.
	EndpointId pulumi.StringOutput `pulumi:"endpointId"`
	// Forwarding target. See the following `Block forwardIp`.
	ForwardIps RuleForwardIpArrayOutput `pulumi:"forwardIps"`
	// The name of the resource.
	RuleName pulumi.StringOutput `pulumi:"ruleName"`
	// The type of the rule. Valid values: `OUTBOUND`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
	// The name of the forwarding zone.
	ZoneName pulumi.StringOutput `pulumi:"zoneName"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EndpointId == nil {
		return nil, errors.New("invalid value for required argument 'EndpointId'")
	}
	if args.ForwardIps == nil {
		return nil, errors.New("invalid value for required argument 'ForwardIps'")
	}
	if args.RuleName == nil {
		return nil, errors.New("invalid value for required argument 'RuleName'")
	}
	if args.ZoneName == nil {
		return nil, errors.New("invalid value for required argument 'ZoneName'")
	}
	var resource Rule
	err := ctx.RegisterResource("alicloud:pvtz/rule:Rule", name, args, &resource, opts...)
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
	err := ctx.ReadResource("alicloud:pvtz/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// The ID of the Endpoint.
	EndpointId *string `pulumi:"endpointId"`
	// Forwarding target. See the following `Block forwardIp`.
	ForwardIps []RuleForwardIp `pulumi:"forwardIps"`
	// The name of the resource.
	RuleName *string `pulumi:"ruleName"`
	// The type of the rule. Valid values: `OUTBOUND`.
	Type *string `pulumi:"type"`
	// The name of the forwarding zone.
	ZoneName *string `pulumi:"zoneName"`
}

type RuleState struct {
	// The ID of the Endpoint.
	EndpointId pulumi.StringPtrInput
	// Forwarding target. See the following `Block forwardIp`.
	ForwardIps RuleForwardIpArrayInput
	// The name of the resource.
	RuleName pulumi.StringPtrInput
	// The type of the rule. Valid values: `OUTBOUND`.
	Type pulumi.StringPtrInput
	// The name of the forwarding zone.
	ZoneName pulumi.StringPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// The ID of the Endpoint.
	EndpointId string `pulumi:"endpointId"`
	// Forwarding target. See the following `Block forwardIp`.
	ForwardIps []RuleForwardIp `pulumi:"forwardIps"`
	// The name of the resource.
	RuleName string `pulumi:"ruleName"`
	// The type of the rule. Valid values: `OUTBOUND`.
	Type *string `pulumi:"type"`
	// The name of the forwarding zone.
	ZoneName string `pulumi:"zoneName"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// The ID of the Endpoint.
	EndpointId pulumi.StringInput
	// Forwarding target. See the following `Block forwardIp`.
	ForwardIps RuleForwardIpArrayInput
	// The name of the resource.
	RuleName pulumi.StringInput
	// The type of the rule. Valid values: `OUTBOUND`.
	Type pulumi.StringPtrInput
	// The name of the forwarding zone.
	ZoneName pulumi.StringInput
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
	return reflect.TypeOf((*Rule)(nil))
}

func (i *Rule) ToRuleOutput() RuleOutput {
	return i.ToRuleOutputWithContext(context.Background())
}

func (i *Rule) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleOutput)
}

func (i *Rule) ToRulePtrOutput() RulePtrOutput {
	return i.ToRulePtrOutputWithContext(context.Background())
}

func (i *Rule) ToRulePtrOutputWithContext(ctx context.Context) RulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulePtrOutput)
}

type RulePtrInput interface {
	pulumi.Input

	ToRulePtrOutput() RulePtrOutput
	ToRulePtrOutputWithContext(ctx context.Context) RulePtrOutput
}

type rulePtrType RuleArgs

func (*rulePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil))
}

func (i *rulePtrType) ToRulePtrOutput() RulePtrOutput {
	return i.ToRulePtrOutputWithContext(context.Background())
}

func (i *rulePtrType) ToRulePtrOutputWithContext(ctx context.Context) RulePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulePtrOutput)
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
	return reflect.TypeOf((*Rule)(nil))
}

func (o RuleOutput) ToRuleOutput() RuleOutput {
	return o
}

func (o RuleOutput) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return o
}

func (o RuleOutput) ToRulePtrOutput() RulePtrOutput {
	return o.ToRulePtrOutputWithContext(context.Background())
}

func (o RuleOutput) ToRulePtrOutputWithContext(ctx context.Context) RulePtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Rule) *Rule {
		return &v
	}).(RulePtrOutput)
}

type RulePtrOutput struct{ *pulumi.OutputState }

func (RulePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil))
}

func (o RulePtrOutput) ToRulePtrOutput() RulePtrOutput {
	return o
}

func (o RulePtrOutput) ToRulePtrOutputWithContext(ctx context.Context) RulePtrOutput {
	return o
}

func (o RulePtrOutput) Elem() RuleOutput {
	return o.ApplyT(func(v *Rule) Rule {
		if v != nil {
			return *v
		}
		var ret Rule
		return ret
	}).(RuleOutput)
}

type RuleArrayOutput struct{ *pulumi.OutputState }

func (RuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Rule)(nil))
}

func (o RuleArrayOutput) ToRuleArrayOutput() RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) Index(i pulumi.IntInput) RuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Rule {
		return vs[0].([]Rule)[vs[1].(int)]
	}).(RuleOutput)
}

type RuleMapOutput struct{ *pulumi.OutputState }

func (RuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Rule)(nil))
}

func (o RuleMapOutput) ToRuleMapOutput() RuleMapOutput {
	return o
}

func (o RuleMapOutput) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return o
}

func (o RuleMapOutput) MapIndex(k pulumi.StringInput) RuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Rule {
		return vs[0].(map[string]Rule)[vs[1].(string)]
	}).(RuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulePtrInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleArrayInput)(nil)).Elem(), RuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleMapInput)(nil)).Elem(), RuleMap{})
	pulumi.RegisterOutputType(RuleOutput{})
	pulumi.RegisterOutputType(RulePtrOutput{})
	pulumi.RegisterOutputType(RuleArrayOutput{})
	pulumi.RegisterOutputType(RuleMapOutput{})
}
