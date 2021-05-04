// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a network acl attachment resource to associate network acls to vswitches.
//
// > **NOTE:** Available in 1.44.0+. Currently, the resource are only available in Hongkong(cn-hongkong), India(ap-south-1), and Indonesia(ap-southeast-1) regions.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "NatGatewayConfigSpec"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		opt0 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
// 			VpcName:   pulumi.String(name),
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetworkAcl, err := vpc.NewNetworkAcl(ctx, "defaultNetworkAcl", &vpc.NetworkAclArgs{
// 			VpcId:          defaultNetwork.ID(),
// 			NetworkAclName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:       defaultNetwork.ID(),
// 			CidrBlock:   pulumi.String("172.16.0.0/21"),
// 			ZoneId:      pulumi.String(defaultZones.Zones[0].Id),
// 			VswitchName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = vpc.NewNetworkAclAttachment(ctx, "defaultNetworkAclAttachment", &vpc.NetworkAclAttachmentArgs{
// 			NetworkAclId: defaultNetworkAcl.ID(),
// 			Resources: vpc.NetworkAclAttachmentResourceArray{
// 				&vpc.NetworkAclAttachmentResourceArgs{
// 					ResourceId:   defaultSwitch.ID(),
// 					ResourceType: pulumi.String("VSwitch"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type NetworkAclAttachment struct {
	pulumi.CustomResourceState

	// The id of the network acl, the field can't be changed.
	NetworkAclId pulumi.StringOutput `pulumi:"networkAclId"`
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources NetworkAclAttachmentResourceArrayOutput `pulumi:"resources"`
}

// NewNetworkAclAttachment registers a new resource with the given unique name, arguments, and options.
func NewNetworkAclAttachment(ctx *pulumi.Context,
	name string, args *NetworkAclAttachmentArgs, opts ...pulumi.ResourceOption) (*NetworkAclAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NetworkAclId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkAclId'")
	}
	if args.Resources == nil {
		return nil, errors.New("invalid value for required argument 'Resources'")
	}
	var resource NetworkAclAttachment
	err := ctx.RegisterResource("alicloud:vpc/networkAclAttachment:NetworkAclAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNetworkAclAttachment gets an existing NetworkAclAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNetworkAclAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NetworkAclAttachmentState, opts ...pulumi.ResourceOption) (*NetworkAclAttachment, error) {
	var resource NetworkAclAttachment
	err := ctx.ReadResource("alicloud:vpc/networkAclAttachment:NetworkAclAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NetworkAclAttachment resources.
type networkAclAttachmentState struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId *string `pulumi:"networkAclId"`
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources []NetworkAclAttachmentResource `pulumi:"resources"`
}

type NetworkAclAttachmentState struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId pulumi.StringPtrInput
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources NetworkAclAttachmentResourceArrayInput
}

func (NetworkAclAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*networkAclAttachmentState)(nil)).Elem()
}

type networkAclAttachmentArgs struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId string `pulumi:"networkAclId"`
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources []NetworkAclAttachmentResource `pulumi:"resources"`
}

// The set of arguments for constructing a NetworkAclAttachment resource.
type NetworkAclAttachmentArgs struct {
	// The id of the network acl, the field can't be changed.
	NetworkAclId pulumi.StringInput
	// List of the resources associated with the network acl. The details see Block Resources.
	Resources NetworkAclAttachmentResourceArrayInput
}

func (NetworkAclAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*networkAclAttachmentArgs)(nil)).Elem()
}

type NetworkAclAttachmentInput interface {
	pulumi.Input

	ToNetworkAclAttachmentOutput() NetworkAclAttachmentOutput
	ToNetworkAclAttachmentOutputWithContext(ctx context.Context) NetworkAclAttachmentOutput
}

func (*NetworkAclAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkAclAttachment)(nil))
}

func (i *NetworkAclAttachment) ToNetworkAclAttachmentOutput() NetworkAclAttachmentOutput {
	return i.ToNetworkAclAttachmentOutputWithContext(context.Background())
}

func (i *NetworkAclAttachment) ToNetworkAclAttachmentOutputWithContext(ctx context.Context) NetworkAclAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAclAttachmentOutput)
}

func (i *NetworkAclAttachment) ToNetworkAclAttachmentPtrOutput() NetworkAclAttachmentPtrOutput {
	return i.ToNetworkAclAttachmentPtrOutputWithContext(context.Background())
}

func (i *NetworkAclAttachment) ToNetworkAclAttachmentPtrOutputWithContext(ctx context.Context) NetworkAclAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAclAttachmentPtrOutput)
}

type NetworkAclAttachmentPtrInput interface {
	pulumi.Input

	ToNetworkAclAttachmentPtrOutput() NetworkAclAttachmentPtrOutput
	ToNetworkAclAttachmentPtrOutputWithContext(ctx context.Context) NetworkAclAttachmentPtrOutput
}

type networkAclAttachmentPtrType NetworkAclAttachmentArgs

func (*networkAclAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkAclAttachment)(nil))
}

func (i *networkAclAttachmentPtrType) ToNetworkAclAttachmentPtrOutput() NetworkAclAttachmentPtrOutput {
	return i.ToNetworkAclAttachmentPtrOutputWithContext(context.Background())
}

func (i *networkAclAttachmentPtrType) ToNetworkAclAttachmentPtrOutputWithContext(ctx context.Context) NetworkAclAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAclAttachmentPtrOutput)
}

// NetworkAclAttachmentArrayInput is an input type that accepts NetworkAclAttachmentArray and NetworkAclAttachmentArrayOutput values.
// You can construct a concrete instance of `NetworkAclAttachmentArrayInput` via:
//
//          NetworkAclAttachmentArray{ NetworkAclAttachmentArgs{...} }
type NetworkAclAttachmentArrayInput interface {
	pulumi.Input

	ToNetworkAclAttachmentArrayOutput() NetworkAclAttachmentArrayOutput
	ToNetworkAclAttachmentArrayOutputWithContext(context.Context) NetworkAclAttachmentArrayOutput
}

type NetworkAclAttachmentArray []NetworkAclAttachmentInput

func (NetworkAclAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NetworkAclAttachment)(nil))
}

func (i NetworkAclAttachmentArray) ToNetworkAclAttachmentArrayOutput() NetworkAclAttachmentArrayOutput {
	return i.ToNetworkAclAttachmentArrayOutputWithContext(context.Background())
}

func (i NetworkAclAttachmentArray) ToNetworkAclAttachmentArrayOutputWithContext(ctx context.Context) NetworkAclAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAclAttachmentArrayOutput)
}

// NetworkAclAttachmentMapInput is an input type that accepts NetworkAclAttachmentMap and NetworkAclAttachmentMapOutput values.
// You can construct a concrete instance of `NetworkAclAttachmentMapInput` via:
//
//          NetworkAclAttachmentMap{ "key": NetworkAclAttachmentArgs{...} }
type NetworkAclAttachmentMapInput interface {
	pulumi.Input

	ToNetworkAclAttachmentMapOutput() NetworkAclAttachmentMapOutput
	ToNetworkAclAttachmentMapOutputWithContext(context.Context) NetworkAclAttachmentMapOutput
}

type NetworkAclAttachmentMap map[string]NetworkAclAttachmentInput

func (NetworkAclAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NetworkAclAttachment)(nil))
}

func (i NetworkAclAttachmentMap) ToNetworkAclAttachmentMapOutput() NetworkAclAttachmentMapOutput {
	return i.ToNetworkAclAttachmentMapOutputWithContext(context.Background())
}

func (i NetworkAclAttachmentMap) ToNetworkAclAttachmentMapOutputWithContext(ctx context.Context) NetworkAclAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NetworkAclAttachmentMapOutput)
}

type NetworkAclAttachmentOutput struct {
	*pulumi.OutputState
}

func (NetworkAclAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NetworkAclAttachment)(nil))
}

func (o NetworkAclAttachmentOutput) ToNetworkAclAttachmentOutput() NetworkAclAttachmentOutput {
	return o
}

func (o NetworkAclAttachmentOutput) ToNetworkAclAttachmentOutputWithContext(ctx context.Context) NetworkAclAttachmentOutput {
	return o
}

func (o NetworkAclAttachmentOutput) ToNetworkAclAttachmentPtrOutput() NetworkAclAttachmentPtrOutput {
	return o.ToNetworkAclAttachmentPtrOutputWithContext(context.Background())
}

func (o NetworkAclAttachmentOutput) ToNetworkAclAttachmentPtrOutputWithContext(ctx context.Context) NetworkAclAttachmentPtrOutput {
	return o.ApplyT(func(v NetworkAclAttachment) *NetworkAclAttachment {
		return &v
	}).(NetworkAclAttachmentPtrOutput)
}

type NetworkAclAttachmentPtrOutput struct {
	*pulumi.OutputState
}

func (NetworkAclAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NetworkAclAttachment)(nil))
}

func (o NetworkAclAttachmentPtrOutput) ToNetworkAclAttachmentPtrOutput() NetworkAclAttachmentPtrOutput {
	return o
}

func (o NetworkAclAttachmentPtrOutput) ToNetworkAclAttachmentPtrOutputWithContext(ctx context.Context) NetworkAclAttachmentPtrOutput {
	return o
}

type NetworkAclAttachmentArrayOutput struct{ *pulumi.OutputState }

func (NetworkAclAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NetworkAclAttachment)(nil))
}

func (o NetworkAclAttachmentArrayOutput) ToNetworkAclAttachmentArrayOutput() NetworkAclAttachmentArrayOutput {
	return o
}

func (o NetworkAclAttachmentArrayOutput) ToNetworkAclAttachmentArrayOutputWithContext(ctx context.Context) NetworkAclAttachmentArrayOutput {
	return o
}

func (o NetworkAclAttachmentArrayOutput) Index(i pulumi.IntInput) NetworkAclAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NetworkAclAttachment {
		return vs[0].([]NetworkAclAttachment)[vs[1].(int)]
	}).(NetworkAclAttachmentOutput)
}

type NetworkAclAttachmentMapOutput struct{ *pulumi.OutputState }

func (NetworkAclAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NetworkAclAttachment)(nil))
}

func (o NetworkAclAttachmentMapOutput) ToNetworkAclAttachmentMapOutput() NetworkAclAttachmentMapOutput {
	return o
}

func (o NetworkAclAttachmentMapOutput) ToNetworkAclAttachmentMapOutputWithContext(ctx context.Context) NetworkAclAttachmentMapOutput {
	return o
}

func (o NetworkAclAttachmentMapOutput) MapIndex(k pulumi.StringInput) NetworkAclAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NetworkAclAttachment {
		return vs[0].(map[string]NetworkAclAttachment)[vs[1].(string)]
	}).(NetworkAclAttachmentOutput)
}

func init() {
	pulumi.RegisterOutputType(NetworkAclAttachmentOutput{})
	pulumi.RegisterOutputType(NetworkAclAttachmentPtrOutput{})
	pulumi.RegisterOutputType(NetworkAclAttachmentArrayOutput{})
	pulumi.RegisterOutputType(NetworkAclAttachmentMapOutput{})
}
