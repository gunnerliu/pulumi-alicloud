// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a ECS Network Interface Attachment resource.
//
// For information about ECS Network Interface Attachment and how to use it, see [What is Network Interface Attachment](https://www.alibabacloud.com/help/en/doc-detail/58515.htm).
//
// > **NOTE:** Available in v1.123.1+.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf-testAcc"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableResourceCreation: pulumi.StringRef("Instance"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(defaultZones.Zones[0].Id),
//				EniAmount:        pulumi.IntRef(3),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("192.168.0.0/24"),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//				VpcId:       defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSecurityGroup, err := ecs.NewSecurityGroup(ctx, "defaultSecurityGroup", &ecs.SecurityGroupArgs{
//				Description: pulumi.String("New security group"),
//				VpcId:       defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex:  pulumi.StringRef("^ubuntu_[0-9]+_[0-9]+_x64*"),
//				MostRecent: pulumi.BoolRef(true),
//				Owners:     pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstance, err := ecs.NewInstance(ctx, "defaultInstance", &ecs.InstanceArgs{
//				AvailabilityZone: *pulumi.String(defaultZones.Zones[0].Id),
//				InstanceName:     pulumi.String(name),
//				HostName:         pulumi.String("tf-testAcc"),
//				ImageId:          *pulumi.String(defaultImages.Images[0].Id),
//				InstanceType:     *pulumi.String(defaultInstanceTypes.InstanceTypes[0].Id),
//				SecurityGroups: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//				VswitchId: defaultSwitch.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				Status: pulumi.StringRef("OK"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultEcsNetworkInterface, err := ecs.NewEcsNetworkInterface(ctx, "defaultEcsNetworkInterface", &ecs.EcsNetworkInterfaceArgs{
//				NetworkInterfaceName: pulumi.String(name),
//				VswitchId:            defaultSwitch.ID(),
//				SecurityGroupIds: pulumi.StringArray{
//					defaultSecurityGroup.ID(),
//				},
//				Description:      pulumi.String("Basic test"),
//				PrimaryIpAddress: pulumi.String("192.168.0.2"),
//				Tags: pulumi.Map{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("Test"),
//				},
//				ResourceGroupId: *pulumi.String(defaultResourceGroups.Ids[0]),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewEcsNetworkInterfaceAttachment(ctx, "defaultEcsNetworkInterfaceAttachment", &ecs.EcsNetworkInterfaceAttachmentArgs{
//				NetworkInterfaceId: defaultEcsNetworkInterface.ID(),
//				InstanceId:         defaultInstance.ID(),
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
// ECS Network Interface Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/ecsNetworkInterfaceAttachment:EcsNetworkInterfaceAttachment example eni-abcd1234:i-abcd1234
//
// ```
type EcsNetworkInterfaceAttachment struct {
	pulumi.CustomResourceState

	// The instance id.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The network interface id.
	NetworkInterfaceId pulumi.StringOutput `pulumi:"networkInterfaceId"`
	// The trunk network instance id.
	TrunkNetworkInstanceId pulumi.StringPtrOutput `pulumi:"trunkNetworkInstanceId"`
	// The wait for network configuration ready.
	WaitForNetworkConfigurationReady pulumi.BoolPtrOutput `pulumi:"waitForNetworkConfigurationReady"`
}

// NewEcsNetworkInterfaceAttachment registers a new resource with the given unique name, arguments, and options.
func NewEcsNetworkInterfaceAttachment(ctx *pulumi.Context,
	name string, args *EcsNetworkInterfaceAttachmentArgs, opts ...pulumi.ResourceOption) (*EcsNetworkInterfaceAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.NetworkInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkInterfaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EcsNetworkInterfaceAttachment
	err := ctx.RegisterResource("alicloud:ecs/ecsNetworkInterfaceAttachment:EcsNetworkInterfaceAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsNetworkInterfaceAttachment gets an existing EcsNetworkInterfaceAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsNetworkInterfaceAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsNetworkInterfaceAttachmentState, opts ...pulumi.ResourceOption) (*EcsNetworkInterfaceAttachment, error) {
	var resource EcsNetworkInterfaceAttachment
	err := ctx.ReadResource("alicloud:ecs/ecsNetworkInterfaceAttachment:EcsNetworkInterfaceAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsNetworkInterfaceAttachment resources.
type ecsNetworkInterfaceAttachmentState struct {
	// The instance id.
	InstanceId *string `pulumi:"instanceId"`
	// The network interface id.
	NetworkInterfaceId *string `pulumi:"networkInterfaceId"`
	// The trunk network instance id.
	TrunkNetworkInstanceId *string `pulumi:"trunkNetworkInstanceId"`
	// The wait for network configuration ready.
	WaitForNetworkConfigurationReady *bool `pulumi:"waitForNetworkConfigurationReady"`
}

type EcsNetworkInterfaceAttachmentState struct {
	// The instance id.
	InstanceId pulumi.StringPtrInput
	// The network interface id.
	NetworkInterfaceId pulumi.StringPtrInput
	// The trunk network instance id.
	TrunkNetworkInstanceId pulumi.StringPtrInput
	// The wait for network configuration ready.
	WaitForNetworkConfigurationReady pulumi.BoolPtrInput
}

func (EcsNetworkInterfaceAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsNetworkInterfaceAttachmentState)(nil)).Elem()
}

type ecsNetworkInterfaceAttachmentArgs struct {
	// The instance id.
	InstanceId string `pulumi:"instanceId"`
	// The network interface id.
	NetworkInterfaceId string `pulumi:"networkInterfaceId"`
	// The trunk network instance id.
	TrunkNetworkInstanceId *string `pulumi:"trunkNetworkInstanceId"`
	// The wait for network configuration ready.
	WaitForNetworkConfigurationReady *bool `pulumi:"waitForNetworkConfigurationReady"`
}

// The set of arguments for constructing a EcsNetworkInterfaceAttachment resource.
type EcsNetworkInterfaceAttachmentArgs struct {
	// The instance id.
	InstanceId pulumi.StringInput
	// The network interface id.
	NetworkInterfaceId pulumi.StringInput
	// The trunk network instance id.
	TrunkNetworkInstanceId pulumi.StringPtrInput
	// The wait for network configuration ready.
	WaitForNetworkConfigurationReady pulumi.BoolPtrInput
}

func (EcsNetworkInterfaceAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsNetworkInterfaceAttachmentArgs)(nil)).Elem()
}

type EcsNetworkInterfaceAttachmentInput interface {
	pulumi.Input

	ToEcsNetworkInterfaceAttachmentOutput() EcsNetworkInterfaceAttachmentOutput
	ToEcsNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentOutput
}

func (*EcsNetworkInterfaceAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (i *EcsNetworkInterfaceAttachment) ToEcsNetworkInterfaceAttachmentOutput() EcsNetworkInterfaceAttachmentOutput {
	return i.ToEcsNetworkInterfaceAttachmentOutputWithContext(context.Background())
}

func (i *EcsNetworkInterfaceAttachment) ToEcsNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsNetworkInterfaceAttachmentOutput)
}

// EcsNetworkInterfaceAttachmentArrayInput is an input type that accepts EcsNetworkInterfaceAttachmentArray and EcsNetworkInterfaceAttachmentArrayOutput values.
// You can construct a concrete instance of `EcsNetworkInterfaceAttachmentArrayInput` via:
//
//	EcsNetworkInterfaceAttachmentArray{ EcsNetworkInterfaceAttachmentArgs{...} }
type EcsNetworkInterfaceAttachmentArrayInput interface {
	pulumi.Input

	ToEcsNetworkInterfaceAttachmentArrayOutput() EcsNetworkInterfaceAttachmentArrayOutput
	ToEcsNetworkInterfaceAttachmentArrayOutputWithContext(context.Context) EcsNetworkInterfaceAttachmentArrayOutput
}

type EcsNetworkInterfaceAttachmentArray []EcsNetworkInterfaceAttachmentInput

func (EcsNetworkInterfaceAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (i EcsNetworkInterfaceAttachmentArray) ToEcsNetworkInterfaceAttachmentArrayOutput() EcsNetworkInterfaceAttachmentArrayOutput {
	return i.ToEcsNetworkInterfaceAttachmentArrayOutputWithContext(context.Background())
}

func (i EcsNetworkInterfaceAttachmentArray) ToEcsNetworkInterfaceAttachmentArrayOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsNetworkInterfaceAttachmentArrayOutput)
}

// EcsNetworkInterfaceAttachmentMapInput is an input type that accepts EcsNetworkInterfaceAttachmentMap and EcsNetworkInterfaceAttachmentMapOutput values.
// You can construct a concrete instance of `EcsNetworkInterfaceAttachmentMapInput` via:
//
//	EcsNetworkInterfaceAttachmentMap{ "key": EcsNetworkInterfaceAttachmentArgs{...} }
type EcsNetworkInterfaceAttachmentMapInput interface {
	pulumi.Input

	ToEcsNetworkInterfaceAttachmentMapOutput() EcsNetworkInterfaceAttachmentMapOutput
	ToEcsNetworkInterfaceAttachmentMapOutputWithContext(context.Context) EcsNetworkInterfaceAttachmentMapOutput
}

type EcsNetworkInterfaceAttachmentMap map[string]EcsNetworkInterfaceAttachmentInput

func (EcsNetworkInterfaceAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (i EcsNetworkInterfaceAttachmentMap) ToEcsNetworkInterfaceAttachmentMapOutput() EcsNetworkInterfaceAttachmentMapOutput {
	return i.ToEcsNetworkInterfaceAttachmentMapOutputWithContext(context.Background())
}

func (i EcsNetworkInterfaceAttachmentMap) ToEcsNetworkInterfaceAttachmentMapOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsNetworkInterfaceAttachmentMapOutput)
}

type EcsNetworkInterfaceAttachmentOutput struct{ *pulumi.OutputState }

func (EcsNetworkInterfaceAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (o EcsNetworkInterfaceAttachmentOutput) ToEcsNetworkInterfaceAttachmentOutput() EcsNetworkInterfaceAttachmentOutput {
	return o
}

func (o EcsNetworkInterfaceAttachmentOutput) ToEcsNetworkInterfaceAttachmentOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentOutput {
	return o
}

// The instance id.
func (o EcsNetworkInterfaceAttachmentOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsNetworkInterfaceAttachment) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The network interface id.
func (o EcsNetworkInterfaceAttachmentOutput) NetworkInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EcsNetworkInterfaceAttachment) pulumi.StringOutput { return v.NetworkInterfaceId }).(pulumi.StringOutput)
}

// The trunk network instance id.
func (o EcsNetworkInterfaceAttachmentOutput) TrunkNetworkInstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsNetworkInterfaceAttachment) pulumi.StringPtrOutput { return v.TrunkNetworkInstanceId }).(pulumi.StringPtrOutput)
}

// The wait for network configuration ready.
func (o EcsNetworkInterfaceAttachmentOutput) WaitForNetworkConfigurationReady() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EcsNetworkInterfaceAttachment) pulumi.BoolPtrOutput { return v.WaitForNetworkConfigurationReady }).(pulumi.BoolPtrOutput)
}

type EcsNetworkInterfaceAttachmentArrayOutput struct{ *pulumi.OutputState }

func (EcsNetworkInterfaceAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (o EcsNetworkInterfaceAttachmentArrayOutput) ToEcsNetworkInterfaceAttachmentArrayOutput() EcsNetworkInterfaceAttachmentArrayOutput {
	return o
}

func (o EcsNetworkInterfaceAttachmentArrayOutput) ToEcsNetworkInterfaceAttachmentArrayOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentArrayOutput {
	return o
}

func (o EcsNetworkInterfaceAttachmentArrayOutput) Index(i pulumi.IntInput) EcsNetworkInterfaceAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsNetworkInterfaceAttachment {
		return vs[0].([]*EcsNetworkInterfaceAttachment)[vs[1].(int)]
	}).(EcsNetworkInterfaceAttachmentOutput)
}

type EcsNetworkInterfaceAttachmentMapOutput struct{ *pulumi.OutputState }

func (EcsNetworkInterfaceAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsNetworkInterfaceAttachment)(nil)).Elem()
}

func (o EcsNetworkInterfaceAttachmentMapOutput) ToEcsNetworkInterfaceAttachmentMapOutput() EcsNetworkInterfaceAttachmentMapOutput {
	return o
}

func (o EcsNetworkInterfaceAttachmentMapOutput) ToEcsNetworkInterfaceAttachmentMapOutputWithContext(ctx context.Context) EcsNetworkInterfaceAttachmentMapOutput {
	return o
}

func (o EcsNetworkInterfaceAttachmentMapOutput) MapIndex(k pulumi.StringInput) EcsNetworkInterfaceAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsNetworkInterfaceAttachment {
		return vs[0].(map[string]*EcsNetworkInterfaceAttachment)[vs[1].(string)]
	}).(EcsNetworkInterfaceAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsNetworkInterfaceAttachmentInput)(nil)).Elem(), &EcsNetworkInterfaceAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsNetworkInterfaceAttachmentArrayInput)(nil)).Elem(), EcsNetworkInterfaceAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsNetworkInterfaceAttachmentMapInput)(nil)).Elem(), EcsNetworkInterfaceAttachmentMap{})
	pulumi.RegisterOutputType(EcsNetworkInterfaceAttachmentOutput{})
	pulumi.RegisterOutputType(EcsNetworkInterfaceAttachmentArrayOutput{})
	pulumi.RegisterOutputType(EcsNetworkInterfaceAttachmentMapOutput{})
}
