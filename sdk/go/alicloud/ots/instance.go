// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ots

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This resource will help you to manager a [Table Store](https://www.alibabacloud.com/help/doc-detail/27280.htm) Instance.
// It is foundation of creating data table.
//
// > **NOTE:** Available since v1.10.0.
//
// ## Import
//
// OTS instance can be imported using instance id or name, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ots/instance:Instance foo "my-ots-instance"
//
// ```
type Instance struct {
	pulumi.CustomResourceState

	// The network limitation of accessing instance. Valid values:
	AccessedBy pulumi.StringPtrOutput `pulumi:"accessedBy"`
	// The description of the instance. Currently, it does not support modifying.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType pulumi.StringPtrOutput `pulumi:"instanceType"`
	// The name of the instance.
	Name pulumi.StringOutput `pulumi:"name"`
	// A mapping of tags to assign to the instance.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewInstance registers a new resource with the given unique name, arguments, and options.
func NewInstance(ctx *pulumi.Context,
	name string, args *InstanceArgs, opts ...pulumi.ResourceOption) (*Instance, error) {
	if args == nil {
		args = &InstanceArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Instance
	err := ctx.RegisterResource("alicloud:ots/instance:Instance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstance gets an existing Instance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceState, opts ...pulumi.ResourceOption) (*Instance, error) {
	var resource Instance
	err := ctx.ReadResource("alicloud:ots/instance:Instance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Instance resources.
type instanceState struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy *string `pulumi:"accessedBy"`
	// The description of the instance. Currently, it does not support modifying.
	Description *string `pulumi:"description"`
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType *string `pulumi:"instanceType"`
	// The name of the instance.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the instance.
	Tags map[string]interface{} `pulumi:"tags"`
}

type InstanceState struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy pulumi.StringPtrInput
	// The description of the instance. Currently, it does not support modifying.
	Description pulumi.StringPtrInput
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType pulumi.StringPtrInput
	// The name of the instance.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the instance.
	Tags pulumi.MapInput
}

func (InstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceState)(nil)).Elem()
}

type instanceArgs struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy *string `pulumi:"accessedBy"`
	// The description of the instance. Currently, it does not support modifying.
	Description *string `pulumi:"description"`
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType *string `pulumi:"instanceType"`
	// The name of the instance.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the instance.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a Instance resource.
type InstanceArgs struct {
	// The network limitation of accessing instance. Valid values:
	AccessedBy pulumi.StringPtrInput
	// The description of the instance. Currently, it does not support modifying.
	Description pulumi.StringPtrInput
	// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
	InstanceType pulumi.StringPtrInput
	// The name of the instance.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the instance.
	Tags pulumi.MapInput
}

func (InstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceArgs)(nil)).Elem()
}

type InstanceInput interface {
	pulumi.Input

	ToInstanceOutput() InstanceOutput
	ToInstanceOutputWithContext(ctx context.Context) InstanceOutput
}

func (*Instance) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (i *Instance) ToInstanceOutput() InstanceOutput {
	return i.ToInstanceOutputWithContext(context.Background())
}

func (i *Instance) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceOutput)
}

func (i *Instance) ToOutput(ctx context.Context) pulumix.Output[*Instance] {
	return pulumix.Output[*Instance]{
		OutputState: i.ToInstanceOutputWithContext(ctx).OutputState,
	}
}

// InstanceArrayInput is an input type that accepts InstanceArray and InstanceArrayOutput values.
// You can construct a concrete instance of `InstanceArrayInput` via:
//
//	InstanceArray{ InstanceArgs{...} }
type InstanceArrayInput interface {
	pulumi.Input

	ToInstanceArrayOutput() InstanceArrayOutput
	ToInstanceArrayOutputWithContext(context.Context) InstanceArrayOutput
}

type InstanceArray []InstanceInput

func (InstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (i InstanceArray) ToInstanceArrayOutput() InstanceArrayOutput {
	return i.ToInstanceArrayOutputWithContext(context.Background())
}

func (i InstanceArray) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceArrayOutput)
}

func (i InstanceArray) ToOutput(ctx context.Context) pulumix.Output[[]*Instance] {
	return pulumix.Output[[]*Instance]{
		OutputState: i.ToInstanceArrayOutputWithContext(ctx).OutputState,
	}
}

// InstanceMapInput is an input type that accepts InstanceMap and InstanceMapOutput values.
// You can construct a concrete instance of `InstanceMapInput` via:
//
//	InstanceMap{ "key": InstanceArgs{...} }
type InstanceMapInput interface {
	pulumi.Input

	ToInstanceMapOutput() InstanceMapOutput
	ToInstanceMapOutputWithContext(context.Context) InstanceMapOutput
}

type InstanceMap map[string]InstanceInput

func (InstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (i InstanceMap) ToInstanceMapOutput() InstanceMapOutput {
	return i.ToInstanceMapOutputWithContext(context.Background())
}

func (i InstanceMap) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceMapOutput)
}

func (i InstanceMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Instance] {
	return pulumix.Output[map[string]*Instance]{
		OutputState: i.ToInstanceMapOutputWithContext(ctx).OutputState,
	}
}

type InstanceOutput struct{ *pulumi.OutputState }

func (InstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Instance)(nil)).Elem()
}

func (o InstanceOutput) ToInstanceOutput() InstanceOutput {
	return o
}

func (o InstanceOutput) ToInstanceOutputWithContext(ctx context.Context) InstanceOutput {
	return o
}

func (o InstanceOutput) ToOutput(ctx context.Context) pulumix.Output[*Instance] {
	return pulumix.Output[*Instance]{
		OutputState: o.OutputState,
	}
}

// The network limitation of accessing instance. Valid values:
func (o InstanceOutput) AccessedBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.AccessedBy }).(pulumi.StringPtrOutput)
}

// The description of the instance. Currently, it does not support modifying.
func (o InstanceOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The type of instance. Valid values are "Capacity" and "HighPerformance". Default to "HighPerformance".
func (o InstanceOutput) InstanceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringPtrOutput { return v.InstanceType }).(pulumi.StringPtrOutput)
}

// The name of the instance.
func (o InstanceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Instance) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the instance.
func (o InstanceOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *Instance) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

type InstanceArrayOutput struct{ *pulumi.OutputState }

func (InstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Instance)(nil)).Elem()
}

func (o InstanceArrayOutput) ToInstanceArrayOutput() InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToInstanceArrayOutputWithContext(ctx context.Context) InstanceArrayOutput {
	return o
}

func (o InstanceArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Instance] {
	return pulumix.Output[[]*Instance]{
		OutputState: o.OutputState,
	}
}

func (o InstanceArrayOutput) Index(i pulumi.IntInput) InstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].([]*Instance)[vs[1].(int)]
	}).(InstanceOutput)
}

type InstanceMapOutput struct{ *pulumi.OutputState }

func (InstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Instance)(nil)).Elem()
}

func (o InstanceMapOutput) ToInstanceMapOutput() InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToInstanceMapOutputWithContext(ctx context.Context) InstanceMapOutput {
	return o
}

func (o InstanceMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Instance] {
	return pulumix.Output[map[string]*Instance]{
		OutputState: o.OutputState,
	}
}

func (o InstanceMapOutput) MapIndex(k pulumi.StringInput) InstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Instance {
		return vs[0].(map[string]*Instance)[vs[1].(string)]
	}).(InstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceInput)(nil)).Elem(), &Instance{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceArrayInput)(nil)).Elem(), InstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceMapInput)(nil)).Elem(), InstanceMap{})
	pulumi.RegisterOutputType(InstanceOutput{})
	pulumi.RegisterOutputType(InstanceArrayOutput{})
	pulumi.RegisterOutputType(InstanceMapOutput{})
}
