// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
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
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultNetworkAcl, err := vpc.NewNetworkAcl(ctx, "defaultNetworkAcl", &vpc.NetworkAclArgs{
// 			VpcId: defaultNetwork.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
// 			VpcId:            defaultNetwork.ID(),
// 			CidrBlock:        pulumi.String("172.16.0.0/21"),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
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

func init() {
	pulumi.RegisterOutputType(NetworkAclAttachmentOutput{})
}
