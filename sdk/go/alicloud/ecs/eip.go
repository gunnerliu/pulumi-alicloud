// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Elastic IP address can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ecs/eip:Eip example eip-abc12345678
// ```
//
// Deprecated: This resource has been deprecated in favour of the EipAddress resource
type Eip struct {
	pulumi.CustomResourceState

	ActivityId  pulumi.StringPtrOutput `pulumi:"activityId"`
	AddressName pulumi.StringOutput    `pulumi:"addressName"`
	// Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
	Bandwidth pulumi.StringOutput `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. Default value: `false`.
	// - true: Enable deletion protection.
	// - false: Disable deletion protection.
	DeletionProtection pulumi.BoolOutput `pulumi:"deletionProtection"`
	// Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
	//
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'payment_type' instead.
	InstanceChargeType pulumi.StringOutput `pulumi:"instanceChargeType"`
	// Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`. It is only PayByBandwidth when `instanceChargeType` is PrePaid.
	InternetChargeType pulumi.StringOutput `pulumi:"internetChargeType"`
	// The elastic ip address
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
	Isp pulumi.StringOutput `pulumi:"isp"`
	// The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'address_name' instead.
	Name        pulumi.StringOutput    `pulumi:"name"`
	Netmode     pulumi.StringPtrOutput `pulumi:"netmode"`
	PaymentType pulumi.StringOutput    `pulumi:"paymentType"`
	Period      pulumi.IntPtrOutput    `pulumi:"period"`
	// The Id of resource group which the eip belongs.
	ResourceGroupId pulumi.StringOutput `pulumi:"resourceGroupId"`
	// The EIP current status.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
}

// NewEip registers a new resource with the given unique name, arguments, and options.
func NewEip(ctx *pulumi.Context,
	name string, args *EipArgs, opts ...pulumi.ResourceOption) (*Eip, error) {
	if args == nil {
		args = &EipArgs{}
	}

	var resource Eip
	err := ctx.RegisterResource("alicloud:ecs/eip:Eip", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEip gets an existing Eip resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEip(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EipState, opts ...pulumi.ResourceOption) (*Eip, error) {
	var resource Eip
	err := ctx.ReadResource("alicloud:ecs/eip:Eip", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Eip resources.
type eipState struct {
	ActivityId  *string `pulumi:"activityId"`
	AddressName *string `pulumi:"addressName"`
	// Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
	Bandwidth *string `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. Default value: `false`.
	// - true: Enable deletion protection.
	// - false: Disable deletion protection.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description *string `pulumi:"description"`
	// Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
	//
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'payment_type' instead.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`. It is only PayByBandwidth when `instanceChargeType` is PrePaid.
	InternetChargeType *string `pulumi:"internetChargeType"`
	// The elastic ip address
	IpAddress *string `pulumi:"ipAddress"`
	// The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
	Isp *string `pulumi:"isp"`
	// The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'address_name' instead.
	Name        *string `pulumi:"name"`
	Netmode     *string `pulumi:"netmode"`
	PaymentType *string `pulumi:"paymentType"`
	Period      *int    `pulumi:"period"`
	// The Id of resource group which the eip belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// The EIP current status.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

type EipState struct {
	ActivityId  pulumi.StringPtrInput
	AddressName pulumi.StringPtrInput
	// Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
	Bandwidth pulumi.StringPtrInput
	// Whether enable the deletion protection or not. Default value: `false`.
	// - true: Enable deletion protection.
	// - false: Disable deletion protection.
	DeletionProtection pulumi.BoolPtrInput
	// Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrInput
	// Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
	//
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'payment_type' instead.
	InstanceChargeType pulumi.StringPtrInput
	// Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`. It is only PayByBandwidth when `instanceChargeType` is PrePaid.
	InternetChargeType pulumi.StringPtrInput
	// The elastic ip address
	IpAddress pulumi.StringPtrInput
	// The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
	Isp pulumi.StringPtrInput
	// The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'address_name' instead.
	Name        pulumi.StringPtrInput
	Netmode     pulumi.StringPtrInput
	PaymentType pulumi.StringPtrInput
	Period      pulumi.IntPtrInput
	// The Id of resource group which the eip belongs.
	ResourceGroupId pulumi.StringPtrInput
	// The EIP current status.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (EipState) ElementType() reflect.Type {
	return reflect.TypeOf((*eipState)(nil)).Elem()
}

type eipArgs struct {
	ActivityId  *string `pulumi:"activityId"`
	AddressName *string `pulumi:"addressName"`
	// Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
	Bandwidth *string `pulumi:"bandwidth"`
	// Whether enable the deletion protection or not. Default value: `false`.
	// - true: Enable deletion protection.
	// - false: Disable deletion protection.
	DeletionProtection *bool `pulumi:"deletionProtection"`
	// Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description *string `pulumi:"description"`
	// Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
	//
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'payment_type' instead.
	InstanceChargeType *string `pulumi:"instanceChargeType"`
	// Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`. It is only PayByBandwidth when `instanceChargeType` is PrePaid.
	InternetChargeType *string `pulumi:"internetChargeType"`
	// The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
	Isp *string `pulumi:"isp"`
	// The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'address_name' instead.
	Name        *string `pulumi:"name"`
	Netmode     *string `pulumi:"netmode"`
	PaymentType *string `pulumi:"paymentType"`
	Period      *int    `pulumi:"period"`
	// The Id of resource group which the eip belongs.
	ResourceGroupId *string `pulumi:"resourceGroupId"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
}

// The set of arguments for constructing a Eip resource.
type EipArgs struct {
	ActivityId  pulumi.StringPtrInput
	AddressName pulumi.StringPtrInput
	// Maximum bandwidth to the elastic public network, measured in Mbps (Mega bit per second). If this value is not specified, then automatically sets it to 5 Mbps.
	Bandwidth pulumi.StringPtrInput
	// Whether enable the deletion protection or not. Default value: `false`.
	// - true: Enable deletion protection.
	// - false: Disable deletion protection.
	DeletionProtection pulumi.BoolPtrInput
	// Description of the EIP instance, This description can have a string of 2 to 256 characters, It cannot begin with http:// or https://. Default value is null.
	Description pulumi.StringPtrInput
	// Elastic IP instance charge type. Valid values are "PrePaid" and "PostPaid". Default to "PostPaid".
	//
	// Deprecated: Field 'instance_charge_type' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'payment_type' instead.
	InstanceChargeType pulumi.StringPtrInput
	// Internet charge type of the EIP, Valid values are `PayByBandwidth`, `PayByTraffic`. Default to `PayByBandwidth`. From version `1.7.1`, default to `PayByTraffic`. It is only PayByBandwidth when `instanceChargeType` is PrePaid.
	InternetChargeType pulumi.StringPtrInput
	// The line type of the Elastic IP instance. Default to `BGP`. Other type of the isp need to open a whitelist.
	Isp pulumi.StringPtrInput
	// The name of the EIP instance. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.126.0 and it will be remove in the future version. Please use the new attribute 'address_name' instead.
	Name        pulumi.StringPtrInput
	Netmode     pulumi.StringPtrInput
	PaymentType pulumi.StringPtrInput
	Period      pulumi.IntPtrInput
	// The Id of resource group which the eip belongs.
	ResourceGroupId pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
}

func (EipArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*eipArgs)(nil)).Elem()
}

type EipInput interface {
	pulumi.Input

	ToEipOutput() EipOutput
	ToEipOutputWithContext(ctx context.Context) EipOutput
}

func (*Eip) ElementType() reflect.Type {
	return reflect.TypeOf((*Eip)(nil))
}

func (i *Eip) ToEipOutput() EipOutput {
	return i.ToEipOutputWithContext(context.Background())
}

func (i *Eip) ToEipOutputWithContext(ctx context.Context) EipOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipOutput)
}

func (i *Eip) ToEipPtrOutput() EipPtrOutput {
	return i.ToEipPtrOutputWithContext(context.Background())
}

func (i *Eip) ToEipPtrOutputWithContext(ctx context.Context) EipPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipPtrOutput)
}

type EipPtrInput interface {
	pulumi.Input

	ToEipPtrOutput() EipPtrOutput
	ToEipPtrOutputWithContext(ctx context.Context) EipPtrOutput
}

type eipPtrType EipArgs

func (*eipPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Eip)(nil))
}

func (i *eipPtrType) ToEipPtrOutput() EipPtrOutput {
	return i.ToEipPtrOutputWithContext(context.Background())
}

func (i *eipPtrType) ToEipPtrOutputWithContext(ctx context.Context) EipPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipPtrOutput)
}

// EipArrayInput is an input type that accepts EipArray and EipArrayOutput values.
// You can construct a concrete instance of `EipArrayInput` via:
//
//          EipArray{ EipArgs{...} }
type EipArrayInput interface {
	pulumi.Input

	ToEipArrayOutput() EipArrayOutput
	ToEipArrayOutputWithContext(context.Context) EipArrayOutput
}

type EipArray []EipInput

func (EipArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Eip)(nil))
}

func (i EipArray) ToEipArrayOutput() EipArrayOutput {
	return i.ToEipArrayOutputWithContext(context.Background())
}

func (i EipArray) ToEipArrayOutputWithContext(ctx context.Context) EipArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipArrayOutput)
}

// EipMapInput is an input type that accepts EipMap and EipMapOutput values.
// You can construct a concrete instance of `EipMapInput` via:
//
//          EipMap{ "key": EipArgs{...} }
type EipMapInput interface {
	pulumi.Input

	ToEipMapOutput() EipMapOutput
	ToEipMapOutputWithContext(context.Context) EipMapOutput
}

type EipMap map[string]EipInput

func (EipMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Eip)(nil))
}

func (i EipMap) ToEipMapOutput() EipMapOutput {
	return i.ToEipMapOutputWithContext(context.Background())
}

func (i EipMap) ToEipMapOutputWithContext(ctx context.Context) EipMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EipMapOutput)
}

type EipOutput struct {
	*pulumi.OutputState
}

func (EipOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Eip)(nil))
}

func (o EipOutput) ToEipOutput() EipOutput {
	return o
}

func (o EipOutput) ToEipOutputWithContext(ctx context.Context) EipOutput {
	return o
}

func (o EipOutput) ToEipPtrOutput() EipPtrOutput {
	return o.ToEipPtrOutputWithContext(context.Background())
}

func (o EipOutput) ToEipPtrOutputWithContext(ctx context.Context) EipPtrOutput {
	return o.ApplyT(func(v Eip) *Eip {
		return &v
	}).(EipPtrOutput)
}

type EipPtrOutput struct {
	*pulumi.OutputState
}

func (EipPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Eip)(nil))
}

func (o EipPtrOutput) ToEipPtrOutput() EipPtrOutput {
	return o
}

func (o EipPtrOutput) ToEipPtrOutputWithContext(ctx context.Context) EipPtrOutput {
	return o
}

type EipArrayOutput struct{ *pulumi.OutputState }

func (EipArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Eip)(nil))
}

func (o EipArrayOutput) ToEipArrayOutput() EipArrayOutput {
	return o
}

func (o EipArrayOutput) ToEipArrayOutputWithContext(ctx context.Context) EipArrayOutput {
	return o
}

func (o EipArrayOutput) Index(i pulumi.IntInput) EipOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Eip {
		return vs[0].([]Eip)[vs[1].(int)]
	}).(EipOutput)
}

type EipMapOutput struct{ *pulumi.OutputState }

func (EipMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Eip)(nil))
}

func (o EipMapOutput) ToEipMapOutput() EipMapOutput {
	return o
}

func (o EipMapOutput) ToEipMapOutputWithContext(ctx context.Context) EipMapOutput {
	return o
}

func (o EipMapOutput) MapIndex(k pulumi.StringInput) EipOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Eip {
		return vs[0].(map[string]Eip)[vs[1].(string)]
	}).(EipOutput)
}

func init() {
	pulumi.RegisterOutputType(EipOutput{})
	pulumi.RegisterOutputType(EipPtrOutput{})
	pulumi.RegisterOutputType(EipArrayOutput{})
	pulumi.RegisterOutputType(EipMapOutput{})
}
