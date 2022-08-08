// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package resourcemanager

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Resource Manager Shared Target resource.
//
// For information about Resource Manager Shared Target and how to use it, see [What is Shared Target](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).
//
// > **NOTE:** Available in v1.111.0+.
//
// ## Import
//
// Resource Manager Shared Target can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:resourcemanager/sharedTarget:SharedTarget example <resource_share_id>:<target_id>
// ```
type SharedTarget struct {
	pulumi.CustomResourceState

	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringOutput `pulumi:"resourceShareId"`
	// The status of shared target.
	Status pulumi.StringOutput `pulumi:"status"`
	// The member account ID in resource directory.
	TargetId pulumi.StringOutput `pulumi:"targetId"`
}

// NewSharedTarget registers a new resource with the given unique name, arguments, and options.
func NewSharedTarget(ctx *pulumi.Context,
	name string, args *SharedTargetArgs, opts ...pulumi.ResourceOption) (*SharedTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceShareId == nil {
		return nil, errors.New("invalid value for required argument 'ResourceShareId'")
	}
	if args.TargetId == nil {
		return nil, errors.New("invalid value for required argument 'TargetId'")
	}
	var resource SharedTarget
	err := ctx.RegisterResource("alicloud:resourcemanager/sharedTarget:SharedTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSharedTarget gets an existing SharedTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSharedTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SharedTargetState, opts ...pulumi.ResourceOption) (*SharedTarget, error) {
	var resource SharedTarget
	err := ctx.ReadResource("alicloud:resourcemanager/sharedTarget:SharedTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SharedTarget resources.
type sharedTargetState struct {
	// The resource share ID of resource manager.
	ResourceShareId *string `pulumi:"resourceShareId"`
	// The status of shared target.
	Status *string `pulumi:"status"`
	// The member account ID in resource directory.
	TargetId *string `pulumi:"targetId"`
}

type SharedTargetState struct {
	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringPtrInput
	// The status of shared target.
	Status pulumi.StringPtrInput
	// The member account ID in resource directory.
	TargetId pulumi.StringPtrInput
}

func (SharedTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedTargetState)(nil)).Elem()
}

type sharedTargetArgs struct {
	// The resource share ID of resource manager.
	ResourceShareId string `pulumi:"resourceShareId"`
	// The member account ID in resource directory.
	TargetId string `pulumi:"targetId"`
}

// The set of arguments for constructing a SharedTarget resource.
type SharedTargetArgs struct {
	// The resource share ID of resource manager.
	ResourceShareId pulumi.StringInput
	// The member account ID in resource directory.
	TargetId pulumi.StringInput
}

func (SharedTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sharedTargetArgs)(nil)).Elem()
}

type SharedTargetInput interface {
	pulumi.Input

	ToSharedTargetOutput() SharedTargetOutput
	ToSharedTargetOutputWithContext(ctx context.Context) SharedTargetOutput
}

func (*SharedTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**SharedTarget)(nil)).Elem()
}

func (i *SharedTarget) ToSharedTargetOutput() SharedTargetOutput {
	return i.ToSharedTargetOutputWithContext(context.Background())
}

func (i *SharedTarget) ToSharedTargetOutputWithContext(ctx context.Context) SharedTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedTargetOutput)
}

// SharedTargetArrayInput is an input type that accepts SharedTargetArray and SharedTargetArrayOutput values.
// You can construct a concrete instance of `SharedTargetArrayInput` via:
//
//          SharedTargetArray{ SharedTargetArgs{...} }
type SharedTargetArrayInput interface {
	pulumi.Input

	ToSharedTargetArrayOutput() SharedTargetArrayOutput
	ToSharedTargetArrayOutputWithContext(context.Context) SharedTargetArrayOutput
}

type SharedTargetArray []SharedTargetInput

func (SharedTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SharedTarget)(nil)).Elem()
}

func (i SharedTargetArray) ToSharedTargetArrayOutput() SharedTargetArrayOutput {
	return i.ToSharedTargetArrayOutputWithContext(context.Background())
}

func (i SharedTargetArray) ToSharedTargetArrayOutputWithContext(ctx context.Context) SharedTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedTargetArrayOutput)
}

// SharedTargetMapInput is an input type that accepts SharedTargetMap and SharedTargetMapOutput values.
// You can construct a concrete instance of `SharedTargetMapInput` via:
//
//          SharedTargetMap{ "key": SharedTargetArgs{...} }
type SharedTargetMapInput interface {
	pulumi.Input

	ToSharedTargetMapOutput() SharedTargetMapOutput
	ToSharedTargetMapOutputWithContext(context.Context) SharedTargetMapOutput
}

type SharedTargetMap map[string]SharedTargetInput

func (SharedTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SharedTarget)(nil)).Elem()
}

func (i SharedTargetMap) ToSharedTargetMapOutput() SharedTargetMapOutput {
	return i.ToSharedTargetMapOutputWithContext(context.Background())
}

func (i SharedTargetMap) ToSharedTargetMapOutputWithContext(ctx context.Context) SharedTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SharedTargetMapOutput)
}

type SharedTargetOutput struct{ *pulumi.OutputState }

func (SharedTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SharedTarget)(nil)).Elem()
}

func (o SharedTargetOutput) ToSharedTargetOutput() SharedTargetOutput {
	return o
}

func (o SharedTargetOutput) ToSharedTargetOutputWithContext(ctx context.Context) SharedTargetOutput {
	return o
}

// The resource share ID of resource manager.
func (o SharedTargetOutput) ResourceShareId() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedTarget) pulumi.StringOutput { return v.ResourceShareId }).(pulumi.StringOutput)
}

// The status of shared target.
func (o SharedTargetOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedTarget) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The member account ID in resource directory.
func (o SharedTargetOutput) TargetId() pulumi.StringOutput {
	return o.ApplyT(func(v *SharedTarget) pulumi.StringOutput { return v.TargetId }).(pulumi.StringOutput)
}

type SharedTargetArrayOutput struct{ *pulumi.OutputState }

func (SharedTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SharedTarget)(nil)).Elem()
}

func (o SharedTargetArrayOutput) ToSharedTargetArrayOutput() SharedTargetArrayOutput {
	return o
}

func (o SharedTargetArrayOutput) ToSharedTargetArrayOutputWithContext(ctx context.Context) SharedTargetArrayOutput {
	return o
}

func (o SharedTargetArrayOutput) Index(i pulumi.IntInput) SharedTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SharedTarget {
		return vs[0].([]*SharedTarget)[vs[1].(int)]
	}).(SharedTargetOutput)
}

type SharedTargetMapOutput struct{ *pulumi.OutputState }

func (SharedTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SharedTarget)(nil)).Elem()
}

func (o SharedTargetMapOutput) ToSharedTargetMapOutput() SharedTargetMapOutput {
	return o
}

func (o SharedTargetMapOutput) ToSharedTargetMapOutputWithContext(ctx context.Context) SharedTargetMapOutput {
	return o
}

func (o SharedTargetMapOutput) MapIndex(k pulumi.StringInput) SharedTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SharedTarget {
		return vs[0].(map[string]*SharedTarget)[vs[1].(string)]
	}).(SharedTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SharedTargetInput)(nil)).Elem(), &SharedTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedTargetArrayInput)(nil)).Elem(), SharedTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SharedTargetMapInput)(nil)).Elem(), SharedTargetMap{})
	pulumi.RegisterOutputType(SharedTargetOutput{})
	pulumi.RegisterOutputType(SharedTargetArrayOutput{})
	pulumi.RegisterOutputType(SharedTargetMapOutput{})
}
