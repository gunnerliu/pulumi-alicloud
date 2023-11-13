// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a VPN Ipsec Server resource.
//
// For information about VPN Ipsec Server and how to use it, see [What is Ipsec Server](https://www.alibabacloud.com/help/en/doc-detail/205454.html).
//
// > **NOTE:** Available in v1.161.0+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			fooNetwork, err := vpc.NewNetwork(ctx, "fooNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String("terraform-example"),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			fooSwitch, err := vpc.NewSwitch(ctx, "fooSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String("terraform-example"),
//				CidrBlock:   pulumi.String("172.16.0.0/21"),
//				VpcId:       fooNetwork.ID(),
//				ZoneId:      *pulumi.String(fooZones.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			fooGateway, err := vpn.NewGateway(ctx, "fooGateway", &vpn.GatewayArgs{
//				VpcId:              fooNetwork.ID(),
//				Bandwidth:          pulumi.Int(10),
//				EnableSsl:          pulumi.Bool(true),
//				InstanceChargeType: pulumi.String("PrePaid"),
//				Description:        pulumi.String("terraform-example"),
//				VswitchId:          fooSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpn.NewIpsecServer(ctx, "fooIpsecServer", &vpn.IpsecServerArgs{
//				ClientIpPool:    pulumi.String("10.0.0.0/24"),
//				IpsecServerName: pulumi.String("terraform-example"),
//				LocalSubnet:     pulumi.String("192.168.0.0/24"),
//				VpnGatewayId:    fooGateway.ID(),
//				PskEnabled:      pulumi.Bool(true),
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
// VPN Ipsec Server can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpn/ipsecServer:IpsecServer example <id>
//
// ```
type IpsecServer struct {
	pulumi.CustomResourceState

	// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
	ClientIpPool pulumi.StringOutput `pulumi:"clientIpPool"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// Specifies whether you want the configuration to immediately take effect.
	EffectImmediately pulumi.BoolPtrOutput `pulumi:"effectImmediately"`
	// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
	IkeConfigs IpsecServerIkeConfigArrayOutput `pulumi:"ikeConfigs"`
	// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
	IpsecConfigs IpsecServerIpsecConfigArrayOutput `pulumi:"ipsecConfigs"`
	// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
	IpsecServerName pulumi.StringPtrOutput `pulumi:"ipsecServerName"`
	// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
	LocalSubnet pulumi.StringOutput `pulumi:"localSubnet"`
	// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
	Psk pulumi.StringOutput `pulumi:"psk"`
	// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
	PskEnabled pulumi.BoolPtrOutput `pulumi:"pskEnabled"`
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringOutput `pulumi:"vpnGatewayId"`
}

// NewIpsecServer registers a new resource with the given unique name, arguments, and options.
func NewIpsecServer(ctx *pulumi.Context,
	name string, args *IpsecServerArgs, opts ...pulumi.ResourceOption) (*IpsecServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientIpPool == nil {
		return nil, errors.New("invalid value for required argument 'ClientIpPool'")
	}
	if args.LocalSubnet == nil {
		return nil, errors.New("invalid value for required argument 'LocalSubnet'")
	}
	if args.VpnGatewayId == nil {
		return nil, errors.New("invalid value for required argument 'VpnGatewayId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IpsecServer
	err := ctx.RegisterResource("alicloud:vpn/ipsecServer:IpsecServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpsecServer gets an existing IpsecServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpsecServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IpsecServerState, opts ...pulumi.ResourceOption) (*IpsecServer, error) {
	var resource IpsecServer
	err := ctx.ReadResource("alicloud:vpn/ipsecServer:IpsecServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IpsecServer resources.
type ipsecServerState struct {
	// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
	ClientIpPool *string `pulumi:"clientIpPool"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Specifies whether you want the configuration to immediately take effect.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
	IkeConfigs []IpsecServerIkeConfig `pulumi:"ikeConfigs"`
	// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
	IpsecConfigs []IpsecServerIpsecConfig `pulumi:"ipsecConfigs"`
	// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
	IpsecServerName *string `pulumi:"ipsecServerName"`
	// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
	LocalSubnet *string `pulumi:"localSubnet"`
	// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
	Psk *string `pulumi:"psk"`
	// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
	PskEnabled *bool `pulumi:"pskEnabled"`
	// The ID of the VPN gateway.
	VpnGatewayId *string `pulumi:"vpnGatewayId"`
}

type IpsecServerState struct {
	// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
	ClientIpPool pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Specifies whether you want the configuration to immediately take effect.
	EffectImmediately pulumi.BoolPtrInput
	// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
	IkeConfigs IpsecServerIkeConfigArrayInput
	// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
	IpsecConfigs IpsecServerIpsecConfigArrayInput
	// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
	IpsecServerName pulumi.StringPtrInput
	// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
	LocalSubnet pulumi.StringPtrInput
	// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
	Psk pulumi.StringPtrInput
	// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
	PskEnabled pulumi.BoolPtrInput
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringPtrInput
}

func (IpsecServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipsecServerState)(nil)).Elem()
}

type ipsecServerArgs struct {
	// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
	ClientIpPool string `pulumi:"clientIpPool"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// Specifies whether you want the configuration to immediately take effect.
	EffectImmediately *bool `pulumi:"effectImmediately"`
	// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
	IkeConfigs []IpsecServerIkeConfig `pulumi:"ikeConfigs"`
	// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
	IpsecConfigs []IpsecServerIpsecConfig `pulumi:"ipsecConfigs"`
	// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
	IpsecServerName *string `pulumi:"ipsecServerName"`
	// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
	LocalSubnet string `pulumi:"localSubnet"`
	// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
	Psk *string `pulumi:"psk"`
	// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
	PskEnabled *bool `pulumi:"pskEnabled"`
	// The ID of the VPN gateway.
	VpnGatewayId string `pulumi:"vpnGatewayId"`
}

// The set of arguments for constructing a IpsecServer resource.
type IpsecServerArgs struct {
	// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
	ClientIpPool pulumi.StringInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// Specifies whether you want the configuration to immediately take effect.
	EffectImmediately pulumi.BoolPtrInput
	// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
	IkeConfigs IpsecServerIkeConfigArrayInput
	// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
	IpsecConfigs IpsecServerIpsecConfigArrayInput
	// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
	IpsecServerName pulumi.StringPtrInput
	// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
	LocalSubnet pulumi.StringInput
	// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
	Psk pulumi.StringPtrInput
	// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
	PskEnabled pulumi.BoolPtrInput
	// The ID of the VPN gateway.
	VpnGatewayId pulumi.StringInput
}

func (IpsecServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipsecServerArgs)(nil)).Elem()
}

type IpsecServerInput interface {
	pulumi.Input

	ToIpsecServerOutput() IpsecServerOutput
	ToIpsecServerOutputWithContext(ctx context.Context) IpsecServerOutput
}

func (*IpsecServer) ElementType() reflect.Type {
	return reflect.TypeOf((**IpsecServer)(nil)).Elem()
}

func (i *IpsecServer) ToIpsecServerOutput() IpsecServerOutput {
	return i.ToIpsecServerOutputWithContext(context.Background())
}

func (i *IpsecServer) ToIpsecServerOutputWithContext(ctx context.Context) IpsecServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecServerOutput)
}

// IpsecServerArrayInput is an input type that accepts IpsecServerArray and IpsecServerArrayOutput values.
// You can construct a concrete instance of `IpsecServerArrayInput` via:
//
//	IpsecServerArray{ IpsecServerArgs{...} }
type IpsecServerArrayInput interface {
	pulumi.Input

	ToIpsecServerArrayOutput() IpsecServerArrayOutput
	ToIpsecServerArrayOutputWithContext(context.Context) IpsecServerArrayOutput
}

type IpsecServerArray []IpsecServerInput

func (IpsecServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpsecServer)(nil)).Elem()
}

func (i IpsecServerArray) ToIpsecServerArrayOutput() IpsecServerArrayOutput {
	return i.ToIpsecServerArrayOutputWithContext(context.Background())
}

func (i IpsecServerArray) ToIpsecServerArrayOutputWithContext(ctx context.Context) IpsecServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecServerArrayOutput)
}

// IpsecServerMapInput is an input type that accepts IpsecServerMap and IpsecServerMapOutput values.
// You can construct a concrete instance of `IpsecServerMapInput` via:
//
//	IpsecServerMap{ "key": IpsecServerArgs{...} }
type IpsecServerMapInput interface {
	pulumi.Input

	ToIpsecServerMapOutput() IpsecServerMapOutput
	ToIpsecServerMapOutputWithContext(context.Context) IpsecServerMapOutput
}

type IpsecServerMap map[string]IpsecServerInput

func (IpsecServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpsecServer)(nil)).Elem()
}

func (i IpsecServerMap) ToIpsecServerMapOutput() IpsecServerMapOutput {
	return i.ToIpsecServerMapOutputWithContext(context.Background())
}

func (i IpsecServerMap) ToIpsecServerMapOutputWithContext(ctx context.Context) IpsecServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IpsecServerMapOutput)
}

type IpsecServerOutput struct{ *pulumi.OutputState }

func (IpsecServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IpsecServer)(nil)).Elem()
}

func (o IpsecServerOutput) ToIpsecServerOutput() IpsecServerOutput {
	return o
}

func (o IpsecServerOutput) ToIpsecServerOutputWithContext(ctx context.Context) IpsecServerOutput {
	return o
}

// The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.
func (o IpsecServerOutput) ClientIpPool() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.StringOutput { return v.ClientIpPool }).(pulumi.StringOutput)
}

// The dry run.
func (o IpsecServerOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// Specifies whether you want the configuration to immediately take effect.
func (o IpsecServerOutput) EffectImmediately() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.BoolPtrOutput { return v.EffectImmediately }).(pulumi.BoolPtrOutput)
}

// The configuration of Phase 1 negotiations. See the following `Block ikeConfig`.
func (o IpsecServerOutput) IkeConfigs() IpsecServerIkeConfigArrayOutput {
	return o.ApplyT(func(v *IpsecServer) IpsecServerIkeConfigArrayOutput { return v.IkeConfigs }).(IpsecServerIkeConfigArrayOutput)
}

// The configuration of Phase 2 negotiations. See the following `Block ipsecConfig`.
func (o IpsecServerOutput) IpsecConfigs() IpsecServerIpsecConfigArrayOutput {
	return o.ApplyT(func(v *IpsecServer) IpsecServerIpsecConfigArrayOutput { return v.IpsecConfigs }).(IpsecServerIpsecConfigArrayOutput)
}

// The name of the IPsec server. The name must be `2` to `128` characters in length, and can contain digits, hyphens (-), and underscores (_). It must start with a letter.
func (o IpsecServerOutput) IpsecServerName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.StringPtrOutput { return v.IpsecServerName }).(pulumi.StringPtrOutput)
}

// The local CIDR block. It refers to the CIDR block of the virtual private cloud (VPC) that is used to connect with the client. Separate multiple CIDR blocks with commas (,). Example: `192.168.1.0/24,192.168.2.0/24`.
func (o IpsecServerOutput) LocalSubnet() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.StringOutput { return v.LocalSubnet }).(pulumi.StringOutput)
}

// The pre-shared key. The pre-shared key is used to authenticate the VPN gateway and the client. By default, the system generates a random string that is 16 bits in length. You can also specify the pre-shared key. It can contain at most 100 characters.
func (o IpsecServerOutput) Psk() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.StringOutput { return v.Psk }).(pulumi.StringOutput)
}

// Whether to enable the pre-shared key authentication method. The value is only `true`, which indicates that the pre-shared key authentication method is enabled.
func (o IpsecServerOutput) PskEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.BoolPtrOutput { return v.PskEnabled }).(pulumi.BoolPtrOutput)
}

// The ID of the VPN gateway.
func (o IpsecServerOutput) VpnGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v *IpsecServer) pulumi.StringOutput { return v.VpnGatewayId }).(pulumi.StringOutput)
}

type IpsecServerArrayOutput struct{ *pulumi.OutputState }

func (IpsecServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IpsecServer)(nil)).Elem()
}

func (o IpsecServerArrayOutput) ToIpsecServerArrayOutput() IpsecServerArrayOutput {
	return o
}

func (o IpsecServerArrayOutput) ToIpsecServerArrayOutputWithContext(ctx context.Context) IpsecServerArrayOutput {
	return o
}

func (o IpsecServerArrayOutput) Index(i pulumi.IntInput) IpsecServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IpsecServer {
		return vs[0].([]*IpsecServer)[vs[1].(int)]
	}).(IpsecServerOutput)
}

type IpsecServerMapOutput struct{ *pulumi.OutputState }

func (IpsecServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IpsecServer)(nil)).Elem()
}

func (o IpsecServerMapOutput) ToIpsecServerMapOutput() IpsecServerMapOutput {
	return o
}

func (o IpsecServerMapOutput) ToIpsecServerMapOutputWithContext(ctx context.Context) IpsecServerMapOutput {
	return o
}

func (o IpsecServerMapOutput) MapIndex(k pulumi.StringInput) IpsecServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IpsecServer {
		return vs[0].(map[string]*IpsecServer)[vs[1].(string)]
	}).(IpsecServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecServerInput)(nil)).Elem(), &IpsecServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecServerArrayInput)(nil)).Elem(), IpsecServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IpsecServerMapInput)(nil)).Elem(), IpsecServerMap{})
	pulumi.RegisterOutputType(IpsecServerOutput{})
	pulumi.RegisterOutputType(IpsecServerArrayOutput{})
	pulumi.RegisterOutputType(IpsecServerMapOutput{})
}
