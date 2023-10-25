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

// Provides a Vpc Vswitch Cidr Reservation resource. The reserved network segment of the vswitch. This resource type can be used only in ap-southeast region.
//
// For information about Vpc Vswitch Cidr Reservation and how to use it, see [What is Vswitch Cidr Reservation](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/610154).
//
// > **NOTE:** Available since v1.205.0.
//
// ## Import
//
// Vpc Vswitch Cidr Reservation can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/vswitchCidrReservation:VswitchCidrReservation example <vswitch_id>:<vswitch_cidr_reservation_id>
//
// ```
type VswitchCidrReservation struct {
	pulumi.CustomResourceState

	// Reserved network segment CIdrBlock.
	CidrReservationCidr pulumi.StringOutput `pulumi:"cidrReservationCidr"`
	// The description of the reserved CIDR block.
	CidrReservationDescription pulumi.StringPtrOutput `pulumi:"cidrReservationDescription"`
	// Reserved segment mask.
	CidrReservationMask pulumi.StringPtrOutput `pulumi:"cidrReservationMask"`
	// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
	CidrReservationType pulumi.StringOutput `pulumi:"cidrReservationType"`
	// The creation time of the resource.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
	IpVersion pulumi.StringOutput `pulumi:"ipVersion"`
	// The status of the resource.
	Status pulumi.StringOutput `pulumi:"status"`
	// The id of the vpc instance to which the reserved CIDR block belongs.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The resource attribute field of the resource ID.
	VswitchCidrReservationId pulumi.StringOutput `pulumi:"vswitchCidrReservationId"`
	// The name of the resource.
	VswitchCidrReservationName pulumi.StringPtrOutput `pulumi:"vswitchCidrReservationName"`
	// The Id of the switch instance.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewVswitchCidrReservation registers a new resource with the given unique name, arguments, and options.
func NewVswitchCidrReservation(ctx *pulumi.Context,
	name string, args *VswitchCidrReservationArgs, opts ...pulumi.ResourceOption) (*VswitchCidrReservation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VswitchCidrReservation
	err := ctx.RegisterResource("alicloud:vpc/vswitchCidrReservation:VswitchCidrReservation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVswitchCidrReservation gets an existing VswitchCidrReservation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVswitchCidrReservation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VswitchCidrReservationState, opts ...pulumi.ResourceOption) (*VswitchCidrReservation, error) {
	var resource VswitchCidrReservation
	err := ctx.ReadResource("alicloud:vpc/vswitchCidrReservation:VswitchCidrReservation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VswitchCidrReservation resources.
type vswitchCidrReservationState struct {
	// Reserved network segment CIdrBlock.
	CidrReservationCidr *string `pulumi:"cidrReservationCidr"`
	// The description of the reserved CIDR block.
	CidrReservationDescription *string `pulumi:"cidrReservationDescription"`
	// Reserved segment mask.
	CidrReservationMask *string `pulumi:"cidrReservationMask"`
	// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
	CidrReservationType *string `pulumi:"cidrReservationType"`
	// The creation time of the resource.
	CreateTime *string `pulumi:"createTime"`
	// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
	IpVersion *string `pulumi:"ipVersion"`
	// The status of the resource.
	Status *string `pulumi:"status"`
	// The id of the vpc instance to which the reserved CIDR block belongs.
	VpcId *string `pulumi:"vpcId"`
	// The resource attribute field of the resource ID.
	VswitchCidrReservationId *string `pulumi:"vswitchCidrReservationId"`
	// The name of the resource.
	VswitchCidrReservationName *string `pulumi:"vswitchCidrReservationName"`
	// The Id of the switch instance.
	VswitchId *string `pulumi:"vswitchId"`
}

type VswitchCidrReservationState struct {
	// Reserved network segment CIdrBlock.
	CidrReservationCidr pulumi.StringPtrInput
	// The description of the reserved CIDR block.
	CidrReservationDescription pulumi.StringPtrInput
	// Reserved segment mask.
	CidrReservationMask pulumi.StringPtrInput
	// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
	CidrReservationType pulumi.StringPtrInput
	// The creation time of the resource.
	CreateTime pulumi.StringPtrInput
	// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
	IpVersion pulumi.StringPtrInput
	// The status of the resource.
	Status pulumi.StringPtrInput
	// The id of the vpc instance to which the reserved CIDR block belongs.
	VpcId pulumi.StringPtrInput
	// The resource attribute field of the resource ID.
	VswitchCidrReservationId pulumi.StringPtrInput
	// The name of the resource.
	VswitchCidrReservationName pulumi.StringPtrInput
	// The Id of the switch instance.
	VswitchId pulumi.StringPtrInput
}

func (VswitchCidrReservationState) ElementType() reflect.Type {
	return reflect.TypeOf((*vswitchCidrReservationState)(nil)).Elem()
}

type vswitchCidrReservationArgs struct {
	// Reserved network segment CIdrBlock.
	CidrReservationCidr *string `pulumi:"cidrReservationCidr"`
	// The description of the reserved CIDR block.
	CidrReservationDescription *string `pulumi:"cidrReservationDescription"`
	// Reserved segment mask.
	CidrReservationMask *string `pulumi:"cidrReservationMask"`
	// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
	CidrReservationType *string `pulumi:"cidrReservationType"`
	// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
	IpVersion *string `pulumi:"ipVersion"`
	// The name of the resource.
	VswitchCidrReservationName *string `pulumi:"vswitchCidrReservationName"`
	// The Id of the switch instance.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a VswitchCidrReservation resource.
type VswitchCidrReservationArgs struct {
	// Reserved network segment CIdrBlock.
	CidrReservationCidr pulumi.StringPtrInput
	// The description of the reserved CIDR block.
	CidrReservationDescription pulumi.StringPtrInput
	// Reserved segment mask.
	CidrReservationMask pulumi.StringPtrInput
	// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
	CidrReservationType pulumi.StringPtrInput
	// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
	IpVersion pulumi.StringPtrInput
	// The name of the resource.
	VswitchCidrReservationName pulumi.StringPtrInput
	// The Id of the switch instance.
	VswitchId pulumi.StringInput
}

func (VswitchCidrReservationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vswitchCidrReservationArgs)(nil)).Elem()
}

type VswitchCidrReservationInput interface {
	pulumi.Input

	ToVswitchCidrReservationOutput() VswitchCidrReservationOutput
	ToVswitchCidrReservationOutputWithContext(ctx context.Context) VswitchCidrReservationOutput
}

func (*VswitchCidrReservation) ElementType() reflect.Type {
	return reflect.TypeOf((**VswitchCidrReservation)(nil)).Elem()
}

func (i *VswitchCidrReservation) ToVswitchCidrReservationOutput() VswitchCidrReservationOutput {
	return i.ToVswitchCidrReservationOutputWithContext(context.Background())
}

func (i *VswitchCidrReservation) ToVswitchCidrReservationOutputWithContext(ctx context.Context) VswitchCidrReservationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VswitchCidrReservationOutput)
}

func (i *VswitchCidrReservation) ToOutput(ctx context.Context) pulumix.Output[*VswitchCidrReservation] {
	return pulumix.Output[*VswitchCidrReservation]{
		OutputState: i.ToVswitchCidrReservationOutputWithContext(ctx).OutputState,
	}
}

// VswitchCidrReservationArrayInput is an input type that accepts VswitchCidrReservationArray and VswitchCidrReservationArrayOutput values.
// You can construct a concrete instance of `VswitchCidrReservationArrayInput` via:
//
//	VswitchCidrReservationArray{ VswitchCidrReservationArgs{...} }
type VswitchCidrReservationArrayInput interface {
	pulumi.Input

	ToVswitchCidrReservationArrayOutput() VswitchCidrReservationArrayOutput
	ToVswitchCidrReservationArrayOutputWithContext(context.Context) VswitchCidrReservationArrayOutput
}

type VswitchCidrReservationArray []VswitchCidrReservationInput

func (VswitchCidrReservationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VswitchCidrReservation)(nil)).Elem()
}

func (i VswitchCidrReservationArray) ToVswitchCidrReservationArrayOutput() VswitchCidrReservationArrayOutput {
	return i.ToVswitchCidrReservationArrayOutputWithContext(context.Background())
}

func (i VswitchCidrReservationArray) ToVswitchCidrReservationArrayOutputWithContext(ctx context.Context) VswitchCidrReservationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VswitchCidrReservationArrayOutput)
}

func (i VswitchCidrReservationArray) ToOutput(ctx context.Context) pulumix.Output[[]*VswitchCidrReservation] {
	return pulumix.Output[[]*VswitchCidrReservation]{
		OutputState: i.ToVswitchCidrReservationArrayOutputWithContext(ctx).OutputState,
	}
}

// VswitchCidrReservationMapInput is an input type that accepts VswitchCidrReservationMap and VswitchCidrReservationMapOutput values.
// You can construct a concrete instance of `VswitchCidrReservationMapInput` via:
//
//	VswitchCidrReservationMap{ "key": VswitchCidrReservationArgs{...} }
type VswitchCidrReservationMapInput interface {
	pulumi.Input

	ToVswitchCidrReservationMapOutput() VswitchCidrReservationMapOutput
	ToVswitchCidrReservationMapOutputWithContext(context.Context) VswitchCidrReservationMapOutput
}

type VswitchCidrReservationMap map[string]VswitchCidrReservationInput

func (VswitchCidrReservationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VswitchCidrReservation)(nil)).Elem()
}

func (i VswitchCidrReservationMap) ToVswitchCidrReservationMapOutput() VswitchCidrReservationMapOutput {
	return i.ToVswitchCidrReservationMapOutputWithContext(context.Background())
}

func (i VswitchCidrReservationMap) ToVswitchCidrReservationMapOutputWithContext(ctx context.Context) VswitchCidrReservationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VswitchCidrReservationMapOutput)
}

func (i VswitchCidrReservationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*VswitchCidrReservation] {
	return pulumix.Output[map[string]*VswitchCidrReservation]{
		OutputState: i.ToVswitchCidrReservationMapOutputWithContext(ctx).OutputState,
	}
}

type VswitchCidrReservationOutput struct{ *pulumi.OutputState }

func (VswitchCidrReservationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VswitchCidrReservation)(nil)).Elem()
}

func (o VswitchCidrReservationOutput) ToVswitchCidrReservationOutput() VswitchCidrReservationOutput {
	return o
}

func (o VswitchCidrReservationOutput) ToVswitchCidrReservationOutputWithContext(ctx context.Context) VswitchCidrReservationOutput {
	return o
}

func (o VswitchCidrReservationOutput) ToOutput(ctx context.Context) pulumix.Output[*VswitchCidrReservation] {
	return pulumix.Output[*VswitchCidrReservation]{
		OutputState: o.OutputState,
	}
}

// Reserved network segment CIdrBlock.
func (o VswitchCidrReservationOutput) CidrReservationCidr() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.CidrReservationCidr }).(pulumi.StringOutput)
}

// The description of the reserved CIDR block.
func (o VswitchCidrReservationOutput) CidrReservationDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringPtrOutput { return v.CidrReservationDescription }).(pulumi.StringPtrOutput)
}

// Reserved segment mask.
func (o VswitchCidrReservationOutput) CidrReservationMask() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringPtrOutput { return v.CidrReservationMask }).(pulumi.StringPtrOutput)
}

// Reserved CIDR Block Type.Valid values: `Prefix`. Default value: Prefix.
func (o VswitchCidrReservationOutput) CidrReservationType() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.CidrReservationType }).(pulumi.StringOutput)
}

// The creation time of the resource.
func (o VswitchCidrReservationOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Reserved ip version of network segment, valid values: `IPv4`, `IPv6`, default IPv4.
func (o VswitchCidrReservationOutput) IpVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.IpVersion }).(pulumi.StringOutput)
}

// The status of the resource.
func (o VswitchCidrReservationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The id of the vpc instance to which the reserved CIDR block belongs.
func (o VswitchCidrReservationOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The resource attribute field of the resource ID.
func (o VswitchCidrReservationOutput) VswitchCidrReservationId() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.VswitchCidrReservationId }).(pulumi.StringOutput)
}

// The name of the resource.
func (o VswitchCidrReservationOutput) VswitchCidrReservationName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringPtrOutput { return v.VswitchCidrReservationName }).(pulumi.StringPtrOutput)
}

// The Id of the switch instance.
func (o VswitchCidrReservationOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *VswitchCidrReservation) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type VswitchCidrReservationArrayOutput struct{ *pulumi.OutputState }

func (VswitchCidrReservationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VswitchCidrReservation)(nil)).Elem()
}

func (o VswitchCidrReservationArrayOutput) ToVswitchCidrReservationArrayOutput() VswitchCidrReservationArrayOutput {
	return o
}

func (o VswitchCidrReservationArrayOutput) ToVswitchCidrReservationArrayOutputWithContext(ctx context.Context) VswitchCidrReservationArrayOutput {
	return o
}

func (o VswitchCidrReservationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*VswitchCidrReservation] {
	return pulumix.Output[[]*VswitchCidrReservation]{
		OutputState: o.OutputState,
	}
}

func (o VswitchCidrReservationArrayOutput) Index(i pulumi.IntInput) VswitchCidrReservationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VswitchCidrReservation {
		return vs[0].([]*VswitchCidrReservation)[vs[1].(int)]
	}).(VswitchCidrReservationOutput)
}

type VswitchCidrReservationMapOutput struct{ *pulumi.OutputState }

func (VswitchCidrReservationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VswitchCidrReservation)(nil)).Elem()
}

func (o VswitchCidrReservationMapOutput) ToVswitchCidrReservationMapOutput() VswitchCidrReservationMapOutput {
	return o
}

func (o VswitchCidrReservationMapOutput) ToVswitchCidrReservationMapOutputWithContext(ctx context.Context) VswitchCidrReservationMapOutput {
	return o
}

func (o VswitchCidrReservationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*VswitchCidrReservation] {
	return pulumix.Output[map[string]*VswitchCidrReservation]{
		OutputState: o.OutputState,
	}
}

func (o VswitchCidrReservationMapOutput) MapIndex(k pulumi.StringInput) VswitchCidrReservationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VswitchCidrReservation {
		return vs[0].(map[string]*VswitchCidrReservation)[vs[1].(string)]
	}).(VswitchCidrReservationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VswitchCidrReservationInput)(nil)).Elem(), &VswitchCidrReservation{})
	pulumi.RegisterInputType(reflect.TypeOf((*VswitchCidrReservationArrayInput)(nil)).Elem(), VswitchCidrReservationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VswitchCidrReservationMapInput)(nil)).Elem(), VswitchCidrReservationMap{})
	pulumi.RegisterOutputType(VswitchCidrReservationOutput{})
	pulumi.RegisterOutputType(VswitchCidrReservationArrayOutput{})
	pulumi.RegisterOutputType(VswitchCidrReservationMapOutput{})
}
