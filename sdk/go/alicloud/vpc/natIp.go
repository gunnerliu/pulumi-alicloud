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

// Provides a VPC Nat Ip resource.
//
// For information about VPC Nat Ip and how to use it, see [What is Nat Ip](https://www.alibabacloud.com/help/doc-detail/281976.htm).
//
// > **NOTE:** Available in v1.136.0+.
//
// ## Import
//
// VPC Nat Ip can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/natIp:NatIp example <nat_gateway_id>:<nat_ip_id>
//
// ```
type NatIp struct {
	pulumi.CustomResourceState

	// Specifies whether to check the validity of the request without actually making the request.
	DryRun pulumi.BoolOutput `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
	NatGatewayId pulumi.StringOutput `pulumi:"natGatewayId"`
	// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
	NatIp pulumi.StringOutput `pulumi:"natIp"`
	// NAT IP ADDRESS of the address segment.
	NatIpCidr pulumi.StringPtrOutput `pulumi:"natIpCidr"`
	// The ID of the CIDR block to which the NAT IP address belongs.
	NatIpCidrId pulumi.StringPtrOutput `pulumi:"natIpCidrId"`
	// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
	NatIpDescription pulumi.StringPtrOutput `pulumi:"natIpDescription"`
	// Ihe ID of the Nat Ip.
	NatIpId pulumi.StringOutput `pulumi:"natIpId"`
	// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
	NatIpName pulumi.StringPtrOutput `pulumi:"natIpName"`
	// The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewNatIp registers a new resource with the given unique name, arguments, and options.
func NewNatIp(ctx *pulumi.Context,
	name string, args *NatIpArgs, opts ...pulumi.ResourceOption) (*NatIp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NatGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'NatGatewayId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NatIp
	err := ctx.RegisterResource("alicloud:vpc/natIp:NatIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNatIp gets an existing NatIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNatIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NatIpState, opts ...pulumi.ResourceOption) (*NatIp, error) {
	var resource NatIp
	err := ctx.ReadResource("alicloud:vpc/natIp:NatIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NatIp resources.
type natIpState struct {
	// Specifies whether to check the validity of the request without actually making the request.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
	NatGatewayId *string `pulumi:"natGatewayId"`
	// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
	NatIp *string `pulumi:"natIp"`
	// NAT IP ADDRESS of the address segment.
	NatIpCidr *string `pulumi:"natIpCidr"`
	// The ID of the CIDR block to which the NAT IP address belongs.
	NatIpCidrId *string `pulumi:"natIpCidrId"`
	// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
	NatIpDescription *string `pulumi:"natIpDescription"`
	// Ihe ID of the Nat Ip.
	NatIpId *string `pulumi:"natIpId"`
	// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
	NatIpName *string `pulumi:"natIpName"`
	// The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
	Status *string `pulumi:"status"`
}

type NatIpState struct {
	// Specifies whether to check the validity of the request without actually making the request.
	DryRun pulumi.BoolPtrInput
	// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
	NatGatewayId pulumi.StringPtrInput
	// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
	NatIp pulumi.StringPtrInput
	// NAT IP ADDRESS of the address segment.
	NatIpCidr pulumi.StringPtrInput
	// The ID of the CIDR block to which the NAT IP address belongs.
	NatIpCidrId pulumi.StringPtrInput
	// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
	NatIpDescription pulumi.StringPtrInput
	// Ihe ID of the Nat Ip.
	NatIpId pulumi.StringPtrInput
	// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
	NatIpName pulumi.StringPtrInput
	// The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
	Status pulumi.StringPtrInput
}

func (NatIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*natIpState)(nil)).Elem()
}

type natIpArgs struct {
	// Specifies whether to check the validity of the request without actually making the request.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
	NatGatewayId string `pulumi:"natGatewayId"`
	// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
	NatIp *string `pulumi:"natIp"`
	// NAT IP ADDRESS of the address segment.
	NatIpCidr *string `pulumi:"natIpCidr"`
	// The ID of the CIDR block to which the NAT IP address belongs.
	NatIpCidrId *string `pulumi:"natIpCidrId"`
	// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
	NatIpDescription *string `pulumi:"natIpDescription"`
	// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
	NatIpName *string `pulumi:"natIpName"`
}

// The set of arguments for constructing a NatIp resource.
type NatIpArgs struct {
	// Specifies whether to check the validity of the request without actually making the request.
	DryRun pulumi.BoolPtrInput
	// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
	NatGatewayId pulumi.StringInput
	// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
	NatIp pulumi.StringPtrInput
	// NAT IP ADDRESS of the address segment.
	NatIpCidr pulumi.StringPtrInput
	// The ID of the CIDR block to which the NAT IP address belongs.
	NatIpCidrId pulumi.StringPtrInput
	// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
	NatIpDescription pulumi.StringPtrInput
	// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
	NatIpName pulumi.StringPtrInput
}

func (NatIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*natIpArgs)(nil)).Elem()
}

type NatIpInput interface {
	pulumi.Input

	ToNatIpOutput() NatIpOutput
	ToNatIpOutputWithContext(ctx context.Context) NatIpOutput
}

func (*NatIp) ElementType() reflect.Type {
	return reflect.TypeOf((**NatIp)(nil)).Elem()
}

func (i *NatIp) ToNatIpOutput() NatIpOutput {
	return i.ToNatIpOutputWithContext(context.Background())
}

func (i *NatIp) ToNatIpOutputWithContext(ctx context.Context) NatIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpOutput)
}

func (i *NatIp) ToOutput(ctx context.Context) pulumix.Output[*NatIp] {
	return pulumix.Output[*NatIp]{
		OutputState: i.ToNatIpOutputWithContext(ctx).OutputState,
	}
}

// NatIpArrayInput is an input type that accepts NatIpArray and NatIpArrayOutput values.
// You can construct a concrete instance of `NatIpArrayInput` via:
//
//	NatIpArray{ NatIpArgs{...} }
type NatIpArrayInput interface {
	pulumi.Input

	ToNatIpArrayOutput() NatIpArrayOutput
	ToNatIpArrayOutputWithContext(context.Context) NatIpArrayOutput
}

type NatIpArray []NatIpInput

func (NatIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatIp)(nil)).Elem()
}

func (i NatIpArray) ToNatIpArrayOutput() NatIpArrayOutput {
	return i.ToNatIpArrayOutputWithContext(context.Background())
}

func (i NatIpArray) ToNatIpArrayOutputWithContext(ctx context.Context) NatIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpArrayOutput)
}

func (i NatIpArray) ToOutput(ctx context.Context) pulumix.Output[[]*NatIp] {
	return pulumix.Output[[]*NatIp]{
		OutputState: i.ToNatIpArrayOutputWithContext(ctx).OutputState,
	}
}

// NatIpMapInput is an input type that accepts NatIpMap and NatIpMapOutput values.
// You can construct a concrete instance of `NatIpMapInput` via:
//
//	NatIpMap{ "key": NatIpArgs{...} }
type NatIpMapInput interface {
	pulumi.Input

	ToNatIpMapOutput() NatIpMapOutput
	ToNatIpMapOutputWithContext(context.Context) NatIpMapOutput
}

type NatIpMap map[string]NatIpInput

func (NatIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatIp)(nil)).Elem()
}

func (i NatIpMap) ToNatIpMapOutput() NatIpMapOutput {
	return i.ToNatIpMapOutputWithContext(context.Background())
}

func (i NatIpMap) ToNatIpMapOutputWithContext(ctx context.Context) NatIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpMapOutput)
}

func (i NatIpMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*NatIp] {
	return pulumix.Output[map[string]*NatIp]{
		OutputState: i.ToNatIpMapOutputWithContext(ctx).OutputState,
	}
}

type NatIpOutput struct{ *pulumi.OutputState }

func (NatIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NatIp)(nil)).Elem()
}

func (o NatIpOutput) ToNatIpOutput() NatIpOutput {
	return o
}

func (o NatIpOutput) ToNatIpOutputWithContext(ctx context.Context) NatIpOutput {
	return o
}

func (o NatIpOutput) ToOutput(ctx context.Context) pulumix.Output[*NatIp] {
	return pulumix.Output[*NatIp]{
		OutputState: o.OutputState,
	}
}

// Specifies whether to check the validity of the request without actually making the request.
func (o NatIpOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v *NatIp) pulumi.BoolOutput { return v.DryRun }).(pulumi.BoolOutput)
}

// The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
func (o NatIpOutput) NatGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringOutput { return v.NatGatewayId }).(pulumi.StringOutput)
}

// The NAT IP address that you want to create. If you do not specify an IP address, the system selects a random IP address from the specified CIDR block.
func (o NatIpOutput) NatIp() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringOutput { return v.NatIp }).(pulumi.StringOutput)
}

// NAT IP ADDRESS of the address segment.
func (o NatIpOutput) NatIpCidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringPtrOutput { return v.NatIpCidr }).(pulumi.StringPtrOutput)
}

// The ID of the CIDR block to which the NAT IP address belongs.
func (o NatIpOutput) NatIpCidrId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringPtrOutput { return v.NatIpCidrId }).(pulumi.StringPtrOutput)
}

// NAT IP ADDRESS description of information. Length is from `2` to `256` characters, must start with a letter or the Chinese at the beginning, but not at the`  http:// ` Or `https://` at the beginning.
func (o NatIpOutput) NatIpDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringPtrOutput { return v.NatIpDescription }).(pulumi.StringPtrOutput)
}

// Ihe ID of the Nat Ip.
func (o NatIpOutput) NatIpId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringOutput { return v.NatIpId }).(pulumi.StringOutput)
}

// NAT IP ADDRESS the name of the root directory. Length is from `2` to `128` characters, must start with a letter or the Chinese at the beginning can contain numbers, half a period (.), underscore (_) and dash (-). But do not start with `http://` or `https://` at the beginning.
func (o NatIpOutput) NatIpName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringPtrOutput { return v.NatIpName }).(pulumi.StringPtrOutput)
}

// The status of the NAT IP address. Valid values: `Available`, `Deleting`, `Creating` and `Deleted`.
func (o NatIpOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIp) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type NatIpArrayOutput struct{ *pulumi.OutputState }

func (NatIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatIp)(nil)).Elem()
}

func (o NatIpArrayOutput) ToNatIpArrayOutput() NatIpArrayOutput {
	return o
}

func (o NatIpArrayOutput) ToNatIpArrayOutputWithContext(ctx context.Context) NatIpArrayOutput {
	return o
}

func (o NatIpArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*NatIp] {
	return pulumix.Output[[]*NatIp]{
		OutputState: o.OutputState,
	}
}

func (o NatIpArrayOutput) Index(i pulumi.IntInput) NatIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NatIp {
		return vs[0].([]*NatIp)[vs[1].(int)]
	}).(NatIpOutput)
}

type NatIpMapOutput struct{ *pulumi.OutputState }

func (NatIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatIp)(nil)).Elem()
}

func (o NatIpMapOutput) ToNatIpMapOutput() NatIpMapOutput {
	return o
}

func (o NatIpMapOutput) ToNatIpMapOutputWithContext(ctx context.Context) NatIpMapOutput {
	return o
}

func (o NatIpMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*NatIp] {
	return pulumix.Output[map[string]*NatIp]{
		OutputState: o.OutputState,
	}
}

func (o NatIpMapOutput) MapIndex(k pulumi.StringInput) NatIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NatIp {
		return vs[0].(map[string]*NatIp)[vs[1].(string)]
	}).(NatIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpInput)(nil)).Elem(), &NatIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpArrayInput)(nil)).Elem(), NatIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpMapInput)(nil)).Elem(), NatIpMap{})
	pulumi.RegisterOutputType(NatIpOutput{})
	pulumi.RegisterOutputType(NatIpArrayOutput{})
	pulumi.RegisterOutputType(NatIpMapOutput{})
}
