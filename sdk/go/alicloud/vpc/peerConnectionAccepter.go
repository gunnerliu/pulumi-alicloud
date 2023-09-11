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

// Provides a Vpc Peer Connection Accepter resource.
//
// For information about Vpc Peer Connection Accepter and how to use it, see [What is Peer Connection Accepter](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/AcceptVpcPeerConnection).
//
// > **NOTE:** Available since v1.196.0.
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
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			acceptingRegion := "cn-beijing"
//			if param := cfg.Get("acceptingRegion"); param != "" {
//				acceptingRegion = param
//			}
//			acceptingAccountAccessKey := "access_key"
//			if param := cfg.Get("acceptingAccountAccessKey"); param != "" {
//				acceptingAccountAccessKey = param
//			}
//			acceptingAccountSecretKey := "secret_key"
//			if param := cfg.Get("acceptingAccountSecretKey"); param != "" {
//				acceptingAccountSecretKey = param
//			}
//			_, err := alicloud.NewProvider(ctx, "local", &alicloud.ProviderArgs{
//				Region: pulumi.String("cn-hangzhou"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = alicloud.NewProvider(ctx, "accepting", &alicloud.ProviderArgs{
//				Region:    pulumi.String(acceptingRegion),
//				AccessKey: pulumi.String(acceptingAccountAccessKey),
//				SecretKey: pulumi.String(acceptingAccountSecretKey),
//			})
//			if err != nil {
//				return err
//			}
//			localNetwork, err := vpc.NewNetwork(ctx, "localNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			}, pulumi.Provider(alicloud.Local))
//			if err != nil {
//				return err
//			}
//			acceptingNetwork, err := vpc.NewNetwork(ctx, "acceptingNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			}, pulumi.Provider(alicloud.Accepting))
//			if err != nil {
//				return err
//			}
//			acceptingAccount, err := alicloud.GetAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultPeerConnection, err := vpc.NewPeerConnection(ctx, "defaultPeerConnection", &vpc.PeerConnectionArgs{
//				PeerConnectionName: pulumi.String(name),
//				VpcId:              localNetwork.ID(),
//				AcceptingAliUid:    *pulumi.String(acceptingAccount.Id),
//				AcceptingRegionId:  pulumi.String(acceptingRegion),
//				AcceptingVpcId:     acceptingNetwork.ID(),
//				Description:        pulumi.String(name),
//			}, pulumi.Provider(alicloud.Local))
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewPeerConnectionAccepter(ctx, "defaultPeerConnectionAccepter", &vpc.PeerConnectionAccepterArgs{
//				InstanceId: defaultPeerConnection.ID(),
//			}, pulumi.Provider(alicloud.Accepting))
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
// Vpc Peer Connection Accepter can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter example <id>
//
// ```
type PeerConnectionAccepter struct {
	pulumi.CustomResourceState

	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingOwnerUid pulumi.IntOutput `pulumi:"acceptingOwnerUid"`
	// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId pulumi.StringOutput `pulumi:"acceptingRegionId"`
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId pulumi.StringOutput `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth pulumi.IntOutput `pulumi:"bandwidth"`
	// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description pulumi.StringOutput `pulumi:"description"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The ID of the instance of the created VPC peer connection.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The name of the resource
	PeerConnectionAccepterName pulumi.StringOutput `pulumi:"peerConnectionAccepterName"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewPeerConnectionAccepter registers a new resource with the given unique name, arguments, and options.
func NewPeerConnectionAccepter(ctx *pulumi.Context,
	name string, args *PeerConnectionAccepterArgs, opts ...pulumi.ResourceOption) (*PeerConnectionAccepter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PeerConnectionAccepter
	err := ctx.RegisterResource("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPeerConnectionAccepter gets an existing PeerConnectionAccepter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPeerConnectionAccepter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PeerConnectionAccepterState, opts ...pulumi.ResourceOption) (*PeerConnectionAccepter, error) {
	var resource PeerConnectionAccepter
	err := ctx.ReadResource("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PeerConnectionAccepter resources.
type peerConnectionAccepterState struct {
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingOwnerUid *int `pulumi:"acceptingOwnerUid"`
	// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId *string `pulumi:"acceptingRegionId"`
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId *string `pulumi:"acceptingVpcId"`
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth *int `pulumi:"bandwidth"`
	// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description *string `pulumi:"description"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the instance of the created VPC peer connection.
	InstanceId *string `pulumi:"instanceId"`
	// The name of the resource
	PeerConnectionAccepterName *string `pulumi:"peerConnectionAccepterName"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId *string `pulumi:"vpcId"`
}

type PeerConnectionAccepterState struct {
	// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
	AcceptingOwnerUid pulumi.IntPtrInput
	// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
	AcceptingRegionId pulumi.StringPtrInput
	// The VPC ID of the receiving end of the VPC peer connection.
	AcceptingVpcId pulumi.StringPtrInput
	// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
	Bandwidth pulumi.IntPtrInput
	// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
	Description pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the instance of the created VPC peer connection.
	InstanceId pulumi.StringPtrInput
	// The name of the resource
	PeerConnectionAccepterName pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// You must create a VPC ID on the initiator of a VPC peer connection.
	VpcId pulumi.StringPtrInput
}

func (PeerConnectionAccepterState) ElementType() reflect.Type {
	return reflect.TypeOf((*peerConnectionAccepterState)(nil)).Elem()
}

type peerConnectionAccepterArgs struct {
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The ID of the instance of the created VPC peer connection.
	InstanceId string `pulumi:"instanceId"`
}

// The set of arguments for constructing a PeerConnectionAccepter resource.
type PeerConnectionAccepterArgs struct {
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The ID of the instance of the created VPC peer connection.
	InstanceId pulumi.StringInput
}

func (PeerConnectionAccepterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*peerConnectionAccepterArgs)(nil)).Elem()
}

type PeerConnectionAccepterInput interface {
	pulumi.Input

	ToPeerConnectionAccepterOutput() PeerConnectionAccepterOutput
	ToPeerConnectionAccepterOutputWithContext(ctx context.Context) PeerConnectionAccepterOutput
}

func (*PeerConnectionAccepter) ElementType() reflect.Type {
	return reflect.TypeOf((**PeerConnectionAccepter)(nil)).Elem()
}

func (i *PeerConnectionAccepter) ToPeerConnectionAccepterOutput() PeerConnectionAccepterOutput {
	return i.ToPeerConnectionAccepterOutputWithContext(context.Background())
}

func (i *PeerConnectionAccepter) ToPeerConnectionAccepterOutputWithContext(ctx context.Context) PeerConnectionAccepterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionAccepterOutput)
}

func (i *PeerConnectionAccepter) ToOutput(ctx context.Context) pulumix.Output[*PeerConnectionAccepter] {
	return pulumix.Output[*PeerConnectionAccepter]{
		OutputState: i.ToPeerConnectionAccepterOutputWithContext(ctx).OutputState,
	}
}

// PeerConnectionAccepterArrayInput is an input type that accepts PeerConnectionAccepterArray and PeerConnectionAccepterArrayOutput values.
// You can construct a concrete instance of `PeerConnectionAccepterArrayInput` via:
//
//	PeerConnectionAccepterArray{ PeerConnectionAccepterArgs{...} }
type PeerConnectionAccepterArrayInput interface {
	pulumi.Input

	ToPeerConnectionAccepterArrayOutput() PeerConnectionAccepterArrayOutput
	ToPeerConnectionAccepterArrayOutputWithContext(context.Context) PeerConnectionAccepterArrayOutput
}

type PeerConnectionAccepterArray []PeerConnectionAccepterInput

func (PeerConnectionAccepterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeerConnectionAccepter)(nil)).Elem()
}

func (i PeerConnectionAccepterArray) ToPeerConnectionAccepterArrayOutput() PeerConnectionAccepterArrayOutput {
	return i.ToPeerConnectionAccepterArrayOutputWithContext(context.Background())
}

func (i PeerConnectionAccepterArray) ToPeerConnectionAccepterArrayOutputWithContext(ctx context.Context) PeerConnectionAccepterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionAccepterArrayOutput)
}

func (i PeerConnectionAccepterArray) ToOutput(ctx context.Context) pulumix.Output[[]*PeerConnectionAccepter] {
	return pulumix.Output[[]*PeerConnectionAccepter]{
		OutputState: i.ToPeerConnectionAccepterArrayOutputWithContext(ctx).OutputState,
	}
}

// PeerConnectionAccepterMapInput is an input type that accepts PeerConnectionAccepterMap and PeerConnectionAccepterMapOutput values.
// You can construct a concrete instance of `PeerConnectionAccepterMapInput` via:
//
//	PeerConnectionAccepterMap{ "key": PeerConnectionAccepterArgs{...} }
type PeerConnectionAccepterMapInput interface {
	pulumi.Input

	ToPeerConnectionAccepterMapOutput() PeerConnectionAccepterMapOutput
	ToPeerConnectionAccepterMapOutputWithContext(context.Context) PeerConnectionAccepterMapOutput
}

type PeerConnectionAccepterMap map[string]PeerConnectionAccepterInput

func (PeerConnectionAccepterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeerConnectionAccepter)(nil)).Elem()
}

func (i PeerConnectionAccepterMap) ToPeerConnectionAccepterMapOutput() PeerConnectionAccepterMapOutput {
	return i.ToPeerConnectionAccepterMapOutputWithContext(context.Background())
}

func (i PeerConnectionAccepterMap) ToPeerConnectionAccepterMapOutputWithContext(ctx context.Context) PeerConnectionAccepterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PeerConnectionAccepterMapOutput)
}

func (i PeerConnectionAccepterMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*PeerConnectionAccepter] {
	return pulumix.Output[map[string]*PeerConnectionAccepter]{
		OutputState: i.ToPeerConnectionAccepterMapOutputWithContext(ctx).OutputState,
	}
}

type PeerConnectionAccepterOutput struct{ *pulumi.OutputState }

func (PeerConnectionAccepterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PeerConnectionAccepter)(nil)).Elem()
}

func (o PeerConnectionAccepterOutput) ToPeerConnectionAccepterOutput() PeerConnectionAccepterOutput {
	return o
}

func (o PeerConnectionAccepterOutput) ToPeerConnectionAccepterOutputWithContext(ctx context.Context) PeerConnectionAccepterOutput {
	return o
}

func (o PeerConnectionAccepterOutput) ToOutput(ctx context.Context) pulumix.Output[*PeerConnectionAccepter] {
	return pulumix.Output[*PeerConnectionAccepter]{
		OutputState: o.OutputState,
	}
}

// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.> If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
func (o PeerConnectionAccepterOutput) AcceptingOwnerUid() pulumi.IntOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.IntOutput { return v.AcceptingOwnerUid }).(pulumi.IntOutput)
}

// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
func (o PeerConnectionAccepterOutput) AcceptingRegionId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.AcceptingRegionId }).(pulumi.StringOutput)
}

// The VPC ID of the receiving end of the VPC peer connection.
func (o PeerConnectionAccepterOutput) AcceptingVpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.AcceptingVpcId }).(pulumi.StringOutput)
}

// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
func (o PeerConnectionAccepterOutput) Bandwidth() pulumi.IntOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.IntOutput { return v.Bandwidth }).(pulumi.IntOutput)
}

// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
func (o PeerConnectionAccepterOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The dry run.
func (o PeerConnectionAccepterOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The ID of the instance of the created VPC peer connection.
func (o PeerConnectionAccepterOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The name of the resource
func (o PeerConnectionAccepterOutput) PeerConnectionAccepterName() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.PeerConnectionAccepterName }).(pulumi.StringOutput)
}

// The status of the resource
func (o PeerConnectionAccepterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// You must create a VPC ID on the initiator of a VPC peer connection.
func (o PeerConnectionAccepterOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *PeerConnectionAccepter) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type PeerConnectionAccepterArrayOutput struct{ *pulumi.OutputState }

func (PeerConnectionAccepterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PeerConnectionAccepter)(nil)).Elem()
}

func (o PeerConnectionAccepterArrayOutput) ToPeerConnectionAccepterArrayOutput() PeerConnectionAccepterArrayOutput {
	return o
}

func (o PeerConnectionAccepterArrayOutput) ToPeerConnectionAccepterArrayOutputWithContext(ctx context.Context) PeerConnectionAccepterArrayOutput {
	return o
}

func (o PeerConnectionAccepterArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*PeerConnectionAccepter] {
	return pulumix.Output[[]*PeerConnectionAccepter]{
		OutputState: o.OutputState,
	}
}

func (o PeerConnectionAccepterArrayOutput) Index(i pulumi.IntInput) PeerConnectionAccepterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PeerConnectionAccepter {
		return vs[0].([]*PeerConnectionAccepter)[vs[1].(int)]
	}).(PeerConnectionAccepterOutput)
}

type PeerConnectionAccepterMapOutput struct{ *pulumi.OutputState }

func (PeerConnectionAccepterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PeerConnectionAccepter)(nil)).Elem()
}

func (o PeerConnectionAccepterMapOutput) ToPeerConnectionAccepterMapOutput() PeerConnectionAccepterMapOutput {
	return o
}

func (o PeerConnectionAccepterMapOutput) ToPeerConnectionAccepterMapOutputWithContext(ctx context.Context) PeerConnectionAccepterMapOutput {
	return o
}

func (o PeerConnectionAccepterMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*PeerConnectionAccepter] {
	return pulumix.Output[map[string]*PeerConnectionAccepter]{
		OutputState: o.OutputState,
	}
}

func (o PeerConnectionAccepterMapOutput) MapIndex(k pulumi.StringInput) PeerConnectionAccepterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PeerConnectionAccepter {
		return vs[0].(map[string]*PeerConnectionAccepter)[vs[1].(string)]
	}).(PeerConnectionAccepterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionAccepterInput)(nil)).Elem(), &PeerConnectionAccepter{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionAccepterArrayInput)(nil)).Elem(), PeerConnectionAccepterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PeerConnectionAccepterMapInput)(nil)).Elem(), PeerConnectionAccepterMap{})
	pulumi.RegisterOutputType(PeerConnectionAccepterOutput{})
	pulumi.RegisterOutputType(PeerConnectionAccepterArrayOutput{})
	pulumi.RegisterOutputType(PeerConnectionAccepterMapOutput{})
}
