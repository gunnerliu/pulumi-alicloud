// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a VPC Nat Ip Cidr resource.
//
// For information about VPC Nat Ip Cidr and how to use it, see [What is Nat Ip Cidr](https://www.alibabacloud.com/help/doc-detail/281972.htm).
//
// > **NOTE:** Available in v1.136.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("example_value"),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "exampleSwitch", &vpc.SwitchArgs{
//				VpcId:       pulumi.Any(alicloud_vpc.Default.Id),
//				CidrBlock:   pulumi.String("172.16.0.0/21"),
//				ZoneId:      *pulumi.String(exampleZones.Zones[0].Id),
//				VswitchName: pulumi.Any(_var.Name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleNatGateway, err := vpc.NewNatGateway(ctx, "exampleNatGateway", &vpc.NatGatewayArgs{
//				VpcId:              pulumi.Any(alicloud_vpc.Default.Id),
//				InternetChargeType: pulumi.String("PayByLcu"),
//				NatGatewayName:     pulumi.String("example_value"),
//				Description:        pulumi.String("example_value"),
//				NatType:            pulumi.String("Enhanced"),
//				VswitchId:          exampleSwitch.ID(),
//				NetworkType:        pulumi.String("intranet"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewNatIpCidr(ctx, "exampleNatIpCidr", &vpc.NatIpCidrArgs{
//				NatGatewayId:  exampleNatGateway.ID(),
//				NatIpCidrName: pulumi.String("example_value"),
//				NatIpCidr:     pulumi.String("example_value"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// VPC Nat Ip Cidr can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/natIpCidr:NatIpCidr example <nat_gateway_id>:<nat_ip_cidr>
//
// ```
type NatIpCidr struct {
	pulumi.CustomResourceState

	// Specifies whether to precheck this request only. Valid values: `true` and `false`.
	DryRun pulumi.BoolOutput `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
	NatGatewayId pulumi.StringOutput `pulumi:"natGatewayId"`
	// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
	NatIpCidr pulumi.StringPtrOutput `pulumi:"natIpCidr"`
	// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrDescription pulumi.StringPtrOutput `pulumi:"natIpCidrDescription"`
	// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrName pulumi.StringPtrOutput `pulumi:"natIpCidrName"`
	// The status of the CIDR block of the NAT gateway. Valid values: `Available`.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewNatIpCidr registers a new resource with the given unique name, arguments, and options.
func NewNatIpCidr(ctx *pulumi.Context,
	name string, args *NatIpCidrArgs, opts ...pulumi.ResourceOption) (*NatIpCidr, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NatGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'NatGatewayId'")
	}
	var resource NatIpCidr
	err := ctx.RegisterResource("alicloud:vpc/natIpCidr:NatIpCidr", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNatIpCidr gets an existing NatIpCidr resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNatIpCidr(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NatIpCidrState, opts ...pulumi.ResourceOption) (*NatIpCidr, error) {
	var resource NatIpCidr
	err := ctx.ReadResource("alicloud:vpc/natIpCidr:NatIpCidr", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NatIpCidr resources.
type natIpCidrState struct {
	// Specifies whether to precheck this request only. Valid values: `true` and `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
	NatGatewayId *string `pulumi:"natGatewayId"`
	// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
	NatIpCidr *string `pulumi:"natIpCidr"`
	// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrDescription *string `pulumi:"natIpCidrDescription"`
	// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrName *string `pulumi:"natIpCidrName"`
	// The status of the CIDR block of the NAT gateway. Valid values: `Available`.
	Status *string `pulumi:"status"`
}

type NatIpCidrState struct {
	// Specifies whether to precheck this request only. Valid values: `true` and `false`.
	DryRun pulumi.BoolPtrInput
	// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
	NatGatewayId pulumi.StringPtrInput
	// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
	NatIpCidr pulumi.StringPtrInput
	// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrDescription pulumi.StringPtrInput
	// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrName pulumi.StringPtrInput
	// The status of the CIDR block of the NAT gateway. Valid values: `Available`.
	Status pulumi.StringPtrInput
}

func (NatIpCidrState) ElementType() reflect.Type {
	return reflect.TypeOf((*natIpCidrState)(nil)).Elem()
}

type natIpCidrArgs struct {
	// Specifies whether to precheck this request only. Valid values: `true` and `false`.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
	NatGatewayId string `pulumi:"natGatewayId"`
	// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
	NatIpCidr *string `pulumi:"natIpCidr"`
	// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrDescription *string `pulumi:"natIpCidrDescription"`
	// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrName *string `pulumi:"natIpCidrName"`
}

// The set of arguments for constructing a NatIpCidr resource.
type NatIpCidrArgs struct {
	// Specifies whether to precheck this request only. Valid values: `true` and `false`.
	DryRun pulumi.BoolPtrInput
	// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
	NatGatewayId pulumi.StringInput
	// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
	NatIpCidr pulumi.StringPtrInput
	// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrDescription pulumi.StringPtrInput
	// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
	NatIpCidrName pulumi.StringPtrInput
}

func (NatIpCidrArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*natIpCidrArgs)(nil)).Elem()
}

type NatIpCidrInput interface {
	pulumi.Input

	ToNatIpCidrOutput() NatIpCidrOutput
	ToNatIpCidrOutputWithContext(ctx context.Context) NatIpCidrOutput
}

func (*NatIpCidr) ElementType() reflect.Type {
	return reflect.TypeOf((**NatIpCidr)(nil)).Elem()
}

func (i *NatIpCidr) ToNatIpCidrOutput() NatIpCidrOutput {
	return i.ToNatIpCidrOutputWithContext(context.Background())
}

func (i *NatIpCidr) ToNatIpCidrOutputWithContext(ctx context.Context) NatIpCidrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpCidrOutput)
}

// NatIpCidrArrayInput is an input type that accepts NatIpCidrArray and NatIpCidrArrayOutput values.
// You can construct a concrete instance of `NatIpCidrArrayInput` via:
//
//	NatIpCidrArray{ NatIpCidrArgs{...} }
type NatIpCidrArrayInput interface {
	pulumi.Input

	ToNatIpCidrArrayOutput() NatIpCidrArrayOutput
	ToNatIpCidrArrayOutputWithContext(context.Context) NatIpCidrArrayOutput
}

type NatIpCidrArray []NatIpCidrInput

func (NatIpCidrArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatIpCidr)(nil)).Elem()
}

func (i NatIpCidrArray) ToNatIpCidrArrayOutput() NatIpCidrArrayOutput {
	return i.ToNatIpCidrArrayOutputWithContext(context.Background())
}

func (i NatIpCidrArray) ToNatIpCidrArrayOutputWithContext(ctx context.Context) NatIpCidrArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpCidrArrayOutput)
}

// NatIpCidrMapInput is an input type that accepts NatIpCidrMap and NatIpCidrMapOutput values.
// You can construct a concrete instance of `NatIpCidrMapInput` via:
//
//	NatIpCidrMap{ "key": NatIpCidrArgs{...} }
type NatIpCidrMapInput interface {
	pulumi.Input

	ToNatIpCidrMapOutput() NatIpCidrMapOutput
	ToNatIpCidrMapOutputWithContext(context.Context) NatIpCidrMapOutput
}

type NatIpCidrMap map[string]NatIpCidrInput

func (NatIpCidrMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatIpCidr)(nil)).Elem()
}

func (i NatIpCidrMap) ToNatIpCidrMapOutput() NatIpCidrMapOutput {
	return i.ToNatIpCidrMapOutputWithContext(context.Background())
}

func (i NatIpCidrMap) ToNatIpCidrMapOutputWithContext(ctx context.Context) NatIpCidrMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NatIpCidrMapOutput)
}

type NatIpCidrOutput struct{ *pulumi.OutputState }

func (NatIpCidrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NatIpCidr)(nil)).Elem()
}

func (o NatIpCidrOutput) ToNatIpCidrOutput() NatIpCidrOutput {
	return o
}

func (o NatIpCidrOutput) ToNatIpCidrOutputWithContext(ctx context.Context) NatIpCidrOutput {
	return o
}

// Specifies whether to precheck this request only. Valid values: `true` and `false`.
func (o NatIpCidrOutput) DryRun() pulumi.BoolOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.BoolOutput { return v.DryRun }).(pulumi.BoolOutput)
}

// The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
func (o NatIpCidrOutput) NatGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.StringOutput { return v.NatGatewayId }).(pulumi.StringOutput)
}

// The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
func (o NatIpCidrOutput) NatIpCidr() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.StringPtrOutput { return v.NatIpCidr }).(pulumi.StringPtrOutput)
}

// The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
func (o NatIpCidrOutput) NatIpCidrDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.StringPtrOutput { return v.NatIpCidrDescription }).(pulumi.StringPtrOutput)
}

// The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
func (o NatIpCidrOutput) NatIpCidrName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.StringPtrOutput { return v.NatIpCidrName }).(pulumi.StringPtrOutput)
}

// The status of the CIDR block of the NAT gateway. Valid values: `Available`.
func (o NatIpCidrOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *NatIpCidr) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type NatIpCidrArrayOutput struct{ *pulumi.OutputState }

func (NatIpCidrArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NatIpCidr)(nil)).Elem()
}

func (o NatIpCidrArrayOutput) ToNatIpCidrArrayOutput() NatIpCidrArrayOutput {
	return o
}

func (o NatIpCidrArrayOutput) ToNatIpCidrArrayOutputWithContext(ctx context.Context) NatIpCidrArrayOutput {
	return o
}

func (o NatIpCidrArrayOutput) Index(i pulumi.IntInput) NatIpCidrOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NatIpCidr {
		return vs[0].([]*NatIpCidr)[vs[1].(int)]
	}).(NatIpCidrOutput)
}

type NatIpCidrMapOutput struct{ *pulumi.OutputState }

func (NatIpCidrMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NatIpCidr)(nil)).Elem()
}

func (o NatIpCidrMapOutput) ToNatIpCidrMapOutput() NatIpCidrMapOutput {
	return o
}

func (o NatIpCidrMapOutput) ToNatIpCidrMapOutputWithContext(ctx context.Context) NatIpCidrMapOutput {
	return o
}

func (o NatIpCidrMapOutput) MapIndex(k pulumi.StringInput) NatIpCidrOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NatIpCidr {
		return vs[0].(map[string]*NatIpCidr)[vs[1].(string)]
	}).(NatIpCidrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpCidrInput)(nil)).Elem(), &NatIpCidr{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpCidrArrayInput)(nil)).Elem(), NatIpCidrArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NatIpCidrMapInput)(nil)).Elem(), NatIpCidrMap{})
	pulumi.RegisterOutputType(NatIpCidrOutput{})
	pulumi.RegisterOutputType(NatIpCidrArrayOutput{})
	pulumi.RegisterOutputType(NatIpCidrMapOutput{})
}
