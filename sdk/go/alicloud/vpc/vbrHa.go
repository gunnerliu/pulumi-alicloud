// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a VPC Vbr Ha resource.
//
// For information about VPC Vbr Ha and how to use it, see [What is Vbr Ha](https://www.alibabacloud.com/help/doc-detail/212629.html).
//
// > **NOTE:** Available in v1.151.0+.
//
// ## Import
//
// VPC Vbr Ha can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:vpc/vbrHa:VbrHa example <id>
// ```
type VbrHa struct {
	pulumi.CustomResourceState

	// The description of the VBR switching group. It must be `2` to `256` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The ID of the other VBR in the VBR failover group.
	PeerVbrId pulumi.StringOutput `pulumi:"peerVbrId"`
	// The state of the VBR failover group.
	Status pulumi.StringOutput `pulumi:"status"`
	// The name of the VBR failover group.
	VbrHaName pulumi.StringPtrOutput `pulumi:"vbrHaName"`
	// The ID of the VBR instance.
	VbrId pulumi.StringOutput `pulumi:"vbrId"`
}

// NewVbrHa registers a new resource with the given unique name, arguments, and options.
func NewVbrHa(ctx *pulumi.Context,
	name string, args *VbrHaArgs, opts ...pulumi.ResourceOption) (*VbrHa, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PeerVbrId == nil {
		return nil, errors.New("invalid value for required argument 'PeerVbrId'")
	}
	if args.VbrId == nil {
		return nil, errors.New("invalid value for required argument 'VbrId'")
	}
	var resource VbrHa
	err := ctx.RegisterResource("alicloud:vpc/vbrHa:VbrHa", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVbrHa gets an existing VbrHa resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVbrHa(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VbrHaState, opts ...pulumi.ResourceOption) (*VbrHa, error) {
	var resource VbrHa
	err := ctx.ReadResource("alicloud:vpc/vbrHa:VbrHa", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VbrHa resources.
type vbrHaState struct {
	// The description of the VBR switching group. It must be `2` to `256` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
	Description *string `pulumi:"description"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the other VBR in the VBR failover group.
	PeerVbrId *string `pulumi:"peerVbrId"`
	// The state of the VBR failover group.
	Status *string `pulumi:"status"`
	// The name of the VBR failover group.
	VbrHaName *string `pulumi:"vbrHaName"`
	// The ID of the VBR instance.
	VbrId *string `pulumi:"vbrId"`
}

type VbrHaState struct {
	// The description of the VBR switching group. It must be `2` to `256` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
	Description pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the other VBR in the VBR failover group.
	PeerVbrId pulumi.StringPtrInput
	// The state of the VBR failover group.
	Status pulumi.StringPtrInput
	// The name of the VBR failover group.
	VbrHaName pulumi.StringPtrInput
	// The ID of the VBR instance.
	VbrId pulumi.StringPtrInput
}

func (VbrHaState) ElementType() reflect.Type {
	return reflect.TypeOf((*vbrHaState)(nil)).Elem()
}

type vbrHaArgs struct {
	// The description of the VBR switching group. It must be `2` to `256` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
	Description *string `pulumi:"description"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the other VBR in the VBR failover group.
	PeerVbrId string `pulumi:"peerVbrId"`
	// The name of the VBR failover group.
	VbrHaName *string `pulumi:"vbrHaName"`
	// The ID of the VBR instance.
	VbrId string `pulumi:"vbrId"`
}

// The set of arguments for constructing a VbrHa resource.
type VbrHaArgs struct {
	// The description of the VBR switching group. It must be `2` to `256` characters in length and must start with a letter or Chinese, but cannot start with `https://` or `https://`.
	Description pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the other VBR in the VBR failover group.
	PeerVbrId pulumi.StringInput
	// The name of the VBR failover group.
	VbrHaName pulumi.StringPtrInput
	// The ID of the VBR instance.
	VbrId pulumi.StringInput
}

func (VbrHaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vbrHaArgs)(nil)).Elem()
}

type VbrHaInput interface {
	pulumi.Input

	ToVbrHaOutput() VbrHaOutput
	ToVbrHaOutputWithContext(ctx context.Context) VbrHaOutput
}

func (*VbrHa) ElementType() reflect.Type {
	return reflect.TypeOf((*VbrHa)(nil))
}

func (i *VbrHa) ToVbrHaOutput() VbrHaOutput {
	return i.ToVbrHaOutputWithContext(context.Background())
}

func (i *VbrHa) ToVbrHaOutputWithContext(ctx context.Context) VbrHaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VbrHaOutput)
}

func (i *VbrHa) ToVbrHaPtrOutput() VbrHaPtrOutput {
	return i.ToVbrHaPtrOutputWithContext(context.Background())
}

func (i *VbrHa) ToVbrHaPtrOutputWithContext(ctx context.Context) VbrHaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VbrHaPtrOutput)
}

type VbrHaPtrInput interface {
	pulumi.Input

	ToVbrHaPtrOutput() VbrHaPtrOutput
	ToVbrHaPtrOutputWithContext(ctx context.Context) VbrHaPtrOutput
}

type vbrHaPtrType VbrHaArgs

func (*vbrHaPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**VbrHa)(nil))
}

func (i *vbrHaPtrType) ToVbrHaPtrOutput() VbrHaPtrOutput {
	return i.ToVbrHaPtrOutputWithContext(context.Background())
}

func (i *vbrHaPtrType) ToVbrHaPtrOutputWithContext(ctx context.Context) VbrHaPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VbrHaPtrOutput)
}

// VbrHaArrayInput is an input type that accepts VbrHaArray and VbrHaArrayOutput values.
// You can construct a concrete instance of `VbrHaArrayInput` via:
//
//          VbrHaArray{ VbrHaArgs{...} }
type VbrHaArrayInput interface {
	pulumi.Input

	ToVbrHaArrayOutput() VbrHaArrayOutput
	ToVbrHaArrayOutputWithContext(context.Context) VbrHaArrayOutput
}

type VbrHaArray []VbrHaInput

func (VbrHaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VbrHa)(nil)).Elem()
}

func (i VbrHaArray) ToVbrHaArrayOutput() VbrHaArrayOutput {
	return i.ToVbrHaArrayOutputWithContext(context.Background())
}

func (i VbrHaArray) ToVbrHaArrayOutputWithContext(ctx context.Context) VbrHaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VbrHaArrayOutput)
}

// VbrHaMapInput is an input type that accepts VbrHaMap and VbrHaMapOutput values.
// You can construct a concrete instance of `VbrHaMapInput` via:
//
//          VbrHaMap{ "key": VbrHaArgs{...} }
type VbrHaMapInput interface {
	pulumi.Input

	ToVbrHaMapOutput() VbrHaMapOutput
	ToVbrHaMapOutputWithContext(context.Context) VbrHaMapOutput
}

type VbrHaMap map[string]VbrHaInput

func (VbrHaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VbrHa)(nil)).Elem()
}

func (i VbrHaMap) ToVbrHaMapOutput() VbrHaMapOutput {
	return i.ToVbrHaMapOutputWithContext(context.Background())
}

func (i VbrHaMap) ToVbrHaMapOutputWithContext(ctx context.Context) VbrHaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VbrHaMapOutput)
}

type VbrHaOutput struct{ *pulumi.OutputState }

func (VbrHaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VbrHa)(nil))
}

func (o VbrHaOutput) ToVbrHaOutput() VbrHaOutput {
	return o
}

func (o VbrHaOutput) ToVbrHaOutputWithContext(ctx context.Context) VbrHaOutput {
	return o
}

func (o VbrHaOutput) ToVbrHaPtrOutput() VbrHaPtrOutput {
	return o.ToVbrHaPtrOutputWithContext(context.Background())
}

func (o VbrHaOutput) ToVbrHaPtrOutputWithContext(ctx context.Context) VbrHaPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v VbrHa) *VbrHa {
		return &v
	}).(VbrHaPtrOutput)
}

type VbrHaPtrOutput struct{ *pulumi.OutputState }

func (VbrHaPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VbrHa)(nil))
}

func (o VbrHaPtrOutput) ToVbrHaPtrOutput() VbrHaPtrOutput {
	return o
}

func (o VbrHaPtrOutput) ToVbrHaPtrOutputWithContext(ctx context.Context) VbrHaPtrOutput {
	return o
}

func (o VbrHaPtrOutput) Elem() VbrHaOutput {
	return o.ApplyT(func(v *VbrHa) VbrHa {
		if v != nil {
			return *v
		}
		var ret VbrHa
		return ret
	}).(VbrHaOutput)
}

type VbrHaArrayOutput struct{ *pulumi.OutputState }

func (VbrHaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VbrHa)(nil))
}

func (o VbrHaArrayOutput) ToVbrHaArrayOutput() VbrHaArrayOutput {
	return o
}

func (o VbrHaArrayOutput) ToVbrHaArrayOutputWithContext(ctx context.Context) VbrHaArrayOutput {
	return o
}

func (o VbrHaArrayOutput) Index(i pulumi.IntInput) VbrHaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VbrHa {
		return vs[0].([]VbrHa)[vs[1].(int)]
	}).(VbrHaOutput)
}

type VbrHaMapOutput struct{ *pulumi.OutputState }

func (VbrHaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]VbrHa)(nil))
}

func (o VbrHaMapOutput) ToVbrHaMapOutput() VbrHaMapOutput {
	return o
}

func (o VbrHaMapOutput) ToVbrHaMapOutputWithContext(ctx context.Context) VbrHaMapOutput {
	return o
}

func (o VbrHaMapOutput) MapIndex(k pulumi.StringInput) VbrHaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) VbrHa {
		return vs[0].(map[string]VbrHa)[vs[1].(string)]
	}).(VbrHaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VbrHaInput)(nil)).Elem(), &VbrHa{})
	pulumi.RegisterInputType(reflect.TypeOf((*VbrHaPtrInput)(nil)).Elem(), &VbrHa{})
	pulumi.RegisterInputType(reflect.TypeOf((*VbrHaArrayInput)(nil)).Elem(), VbrHaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VbrHaMapInput)(nil)).Elem(), VbrHaMap{})
	pulumi.RegisterOutputType(VbrHaOutput{})
	pulumi.RegisterOutputType(VbrHaPtrOutput{})
	pulumi.RegisterOutputType(VbrHaArrayOutput{})
	pulumi.RegisterOutputType(VbrHaMapOutput{})
}
