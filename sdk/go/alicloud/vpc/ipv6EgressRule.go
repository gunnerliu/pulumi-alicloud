// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a VPC Ipv6 Egress Rule resource. IPv6 address addition only active exit rule.
//
// For information about VPC Ipv6 Egress Rule and how to use it, see [What is Ipv6 Egress Rule](https://www.alibabacloud.com/help/doc-detail/102200.htm).
//
// > **NOTE:** Available since v1.142.0.
//
// ## Import
//
// VPC Ipv6 Egress Rule can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/ipv6EgressRule:Ipv6EgressRule example <ipv6_gateway_id>:<ipv6_egress_rule_id>
//
// ```
type Ipv6EgressRule struct {
	pulumi.CustomResourceState

	// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the IPv6 address to which you want to apply the egress-only rule.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
	Ipv6EgressRuleName pulumi.StringPtrOutput `pulumi:"ipv6EgressRuleName"`
	// The ID of the IPv6 gateway.
	Ipv6GatewayId pulumi.StringOutput `pulumi:"ipv6GatewayId"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewIpv6EgressRule registers a new resource with the given unique name, arguments, and options.
func NewIpv6EgressRule(ctx *pulumi.Context,
	name string, args *Ipv6EgressRuleArgs, opts ...pulumi.ResourceOption) (*Ipv6EgressRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.Ipv6GatewayId == nil {
		return nil, errors.New("invalid value for required argument 'Ipv6GatewayId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Ipv6EgressRule
	err := ctx.RegisterResource("alicloud:vpc/ipv6EgressRule:Ipv6EgressRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpv6EgressRule gets an existing Ipv6EgressRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpv6EgressRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Ipv6EgressRuleState, opts ...pulumi.ResourceOption) (*Ipv6EgressRule, error) {
	var resource Ipv6EgressRule
	err := ctx.ReadResource("alicloud:vpc/ipv6EgressRule:Ipv6EgressRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ipv6EgressRule resources.
type ipv6EgressRuleState struct {
	// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The ID of the IPv6 address to which you want to apply the egress-only rule.
	InstanceId *string `pulumi:"instanceId"`
	// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
	InstanceType *string `pulumi:"instanceType"`
	// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
	Ipv6EgressRuleName *string `pulumi:"ipv6EgressRuleName"`
	// The ID of the IPv6 gateway.
	Ipv6GatewayId *string `pulumi:"ipv6GatewayId"`
	// The status of the resource.
	Status *string `pulumi:"status"`
}

type Ipv6EgressRuleState struct {
	// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The ID of the IPv6 address to which you want to apply the egress-only rule.
	InstanceId pulumi.StringPtrInput
	// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
	InstanceType pulumi.StringPtrInput
	// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
	Ipv6EgressRuleName pulumi.StringPtrInput
	// The ID of the IPv6 gateway.
	Ipv6GatewayId pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
}

func (Ipv6EgressRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6EgressRuleState)(nil)).Elem()
}

type ipv6EgressRuleArgs struct {
	// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The ID of the IPv6 address to which you want to apply the egress-only rule.
	InstanceId string `pulumi:"instanceId"`
	// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
	InstanceType *string `pulumi:"instanceType"`
	// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
	Ipv6EgressRuleName *string `pulumi:"ipv6EgressRuleName"`
	// The ID of the IPv6 gateway.
	Ipv6GatewayId string `pulumi:"ipv6GatewayId"`
}

// The set of arguments for constructing a Ipv6EgressRule resource.
type Ipv6EgressRuleArgs struct {
	// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The ID of the IPv6 address to which you want to apply the egress-only rule.
	InstanceId pulumi.StringInput
	// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
	InstanceType pulumi.StringPtrInput
	// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
	Ipv6EgressRuleName pulumi.StringPtrInput
	// The ID of the IPv6 gateway.
	Ipv6GatewayId pulumi.StringInput
}

func (Ipv6EgressRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6EgressRuleArgs)(nil)).Elem()
}

type Ipv6EgressRuleInput interface {
	pulumi.Input

	ToIpv6EgressRuleOutput() Ipv6EgressRuleOutput
	ToIpv6EgressRuleOutputWithContext(ctx context.Context) Ipv6EgressRuleOutput
}

func (*Ipv6EgressRule) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6EgressRule)(nil)).Elem()
}

func (i *Ipv6EgressRule) ToIpv6EgressRuleOutput() Ipv6EgressRuleOutput {
	return i.ToIpv6EgressRuleOutputWithContext(context.Background())
}

func (i *Ipv6EgressRule) ToIpv6EgressRuleOutputWithContext(ctx context.Context) Ipv6EgressRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6EgressRuleOutput)
}

func (i *Ipv6EgressRule) ToOutput(ctx context.Context) pulumix.Output[*Ipv6EgressRule] {
	return pulumix.Output[*Ipv6EgressRule]{
		OutputState: i.ToIpv6EgressRuleOutputWithContext(ctx).OutputState,
	}
}

// Ipv6EgressRuleArrayInput is an input type that accepts Ipv6EgressRuleArray and Ipv6EgressRuleArrayOutput values.
// You can construct a concrete instance of `Ipv6EgressRuleArrayInput` via:
//
//	Ipv6EgressRuleArray{ Ipv6EgressRuleArgs{...} }
type Ipv6EgressRuleArrayInput interface {
	pulumi.Input

	ToIpv6EgressRuleArrayOutput() Ipv6EgressRuleArrayOutput
	ToIpv6EgressRuleArrayOutputWithContext(context.Context) Ipv6EgressRuleArrayOutput
}

type Ipv6EgressRuleArray []Ipv6EgressRuleInput

func (Ipv6EgressRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6EgressRule)(nil)).Elem()
}

func (i Ipv6EgressRuleArray) ToIpv6EgressRuleArrayOutput() Ipv6EgressRuleArrayOutput {
	return i.ToIpv6EgressRuleArrayOutputWithContext(context.Background())
}

func (i Ipv6EgressRuleArray) ToIpv6EgressRuleArrayOutputWithContext(ctx context.Context) Ipv6EgressRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6EgressRuleArrayOutput)
}

func (i Ipv6EgressRuleArray) ToOutput(ctx context.Context) pulumix.Output[[]*Ipv6EgressRule] {
	return pulumix.Output[[]*Ipv6EgressRule]{
		OutputState: i.ToIpv6EgressRuleArrayOutputWithContext(ctx).OutputState,
	}
}

// Ipv6EgressRuleMapInput is an input type that accepts Ipv6EgressRuleMap and Ipv6EgressRuleMapOutput values.
// You can construct a concrete instance of `Ipv6EgressRuleMapInput` via:
//
//	Ipv6EgressRuleMap{ "key": Ipv6EgressRuleArgs{...} }
type Ipv6EgressRuleMapInput interface {
	pulumi.Input

	ToIpv6EgressRuleMapOutput() Ipv6EgressRuleMapOutput
	ToIpv6EgressRuleMapOutputWithContext(context.Context) Ipv6EgressRuleMapOutput
}

type Ipv6EgressRuleMap map[string]Ipv6EgressRuleInput

func (Ipv6EgressRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6EgressRule)(nil)).Elem()
}

func (i Ipv6EgressRuleMap) ToIpv6EgressRuleMapOutput() Ipv6EgressRuleMapOutput {
	return i.ToIpv6EgressRuleMapOutputWithContext(context.Background())
}

func (i Ipv6EgressRuleMap) ToIpv6EgressRuleMapOutputWithContext(ctx context.Context) Ipv6EgressRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6EgressRuleMapOutput)
}

func (i Ipv6EgressRuleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Ipv6EgressRule] {
	return pulumix.Output[map[string]*Ipv6EgressRule]{
		OutputState: i.ToIpv6EgressRuleMapOutputWithContext(ctx).OutputState,
	}
}

type Ipv6EgressRuleOutput struct{ *pulumi.OutputState }

func (Ipv6EgressRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6EgressRule)(nil)).Elem()
}

func (o Ipv6EgressRuleOutput) ToIpv6EgressRuleOutput() Ipv6EgressRuleOutput {
	return o
}

func (o Ipv6EgressRuleOutput) ToIpv6EgressRuleOutputWithContext(ctx context.Context) Ipv6EgressRuleOutput {
	return o
}

func (o Ipv6EgressRuleOutput) ToOutput(ctx context.Context) pulumix.Output[*Ipv6EgressRule] {
	return pulumix.Output[*Ipv6EgressRule]{
		OutputState: o.OutputState,
	}
}

// The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
func (o Ipv6EgressRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the IPv6 address to which you want to apply the egress-only rule.
func (o Ipv6EgressRuleOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
func (o Ipv6EgressRuleOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
func (o Ipv6EgressRuleOutput) Ipv6EgressRuleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringPtrOutput { return v.Ipv6EgressRuleName }).(pulumi.StringPtrOutput)
}

// The ID of the IPv6 gateway.
func (o Ipv6EgressRuleOutput) Ipv6GatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringOutput { return v.Ipv6GatewayId }).(pulumi.StringOutput)
}

// The status of the resource.
func (o Ipv6EgressRuleOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Ipv6EgressRule) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type Ipv6EgressRuleArrayOutput struct{ *pulumi.OutputState }

func (Ipv6EgressRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6EgressRule)(nil)).Elem()
}

func (o Ipv6EgressRuleArrayOutput) ToIpv6EgressRuleArrayOutput() Ipv6EgressRuleArrayOutput {
	return o
}

func (o Ipv6EgressRuleArrayOutput) ToIpv6EgressRuleArrayOutputWithContext(ctx context.Context) Ipv6EgressRuleArrayOutput {
	return o
}

func (o Ipv6EgressRuleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Ipv6EgressRule] {
	return pulumix.Output[[]*Ipv6EgressRule]{
		OutputState: o.OutputState,
	}
}

func (o Ipv6EgressRuleArrayOutput) Index(i pulumi.IntInput) Ipv6EgressRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ipv6EgressRule {
		return vs[0].([]*Ipv6EgressRule)[vs[1].(int)]
	}).(Ipv6EgressRuleOutput)
}

type Ipv6EgressRuleMapOutput struct{ *pulumi.OutputState }

func (Ipv6EgressRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6EgressRule)(nil)).Elem()
}

func (o Ipv6EgressRuleMapOutput) ToIpv6EgressRuleMapOutput() Ipv6EgressRuleMapOutput {
	return o
}

func (o Ipv6EgressRuleMapOutput) ToIpv6EgressRuleMapOutputWithContext(ctx context.Context) Ipv6EgressRuleMapOutput {
	return o
}

func (o Ipv6EgressRuleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Ipv6EgressRule] {
	return pulumix.Output[map[string]*Ipv6EgressRule]{
		OutputState: o.OutputState,
	}
}

func (o Ipv6EgressRuleMapOutput) MapIndex(k pulumi.StringInput) Ipv6EgressRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ipv6EgressRule {
		return vs[0].(map[string]*Ipv6EgressRule)[vs[1].(string)]
	}).(Ipv6EgressRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6EgressRuleInput)(nil)).Elem(), &Ipv6EgressRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6EgressRuleArrayInput)(nil)).Elem(), Ipv6EgressRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6EgressRuleMapInput)(nil)).Elem(), Ipv6EgressRuleMap{})
	pulumi.RegisterOutputType(Ipv6EgressRuleOutput{})
	pulumi.RegisterOutputType(Ipv6EgressRuleArrayOutput{})
	pulumi.RegisterOutputType(Ipv6EgressRuleMapOutput{})
}
