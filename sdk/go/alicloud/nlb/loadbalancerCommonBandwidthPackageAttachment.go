// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nlb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a NLB Loadbalancer Common Bandwidth Package Attachment resource. Bandwidth Package Operation.
//
// For information about NLB Loadbalancer Common Bandwidth Package Attachment and how to use it, see [What is Loadbalancer Common Bandwidth Package Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/nlb-instances-change).
//
// > **NOTE:** Available since v1.209.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nlb"
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
//			name := "tf-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultZones, err := nlb.GetZones(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//			})
//			if err != nil {
//				return err
//			}
//			default1, err := vpc.NewSwitch(ctx, "default1", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("10.4.1.0/24"),
//				VpcId:       defaultNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[1].Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ecs.NewSecurityGroup(ctx, "defaultSecurityGroup", &ecs.SecurityGroupArgs{
//				VpcId: defaultNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			defaultLoadBalancer, err := nlb.NewLoadBalancer(ctx, "defaultLoadBalancer", &nlb.LoadBalancerArgs{
//				LoadBalancerName: pulumi.String(name),
//				ResourceGroupId:  *pulumi.String(defaultResourceGroups.Ids[0]),
//				LoadBalancerType: pulumi.String("Network"),
//				AddressType:      pulumi.String("Internet"),
//				AddressIpVersion: pulumi.String("Ipv4"),
//				VpcId:            defaultNetwork.ID(),
//				Tags: pulumi.Map{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("example"),
//				},
//				ZoneMappings: nlb.LoadBalancerZoneMappingArray{
//					&nlb.LoadBalancerZoneMappingArgs{
//						VswitchId: defaultSwitch.ID(),
//						ZoneId:    *pulumi.String(defaultZones.Zones[0].Id),
//					},
//					&nlb.LoadBalancerZoneMappingArgs{
//						VswitchId: default1.ID(),
//						ZoneId:    *pulumi.String(defaultZones.Zones[1].Id),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			defaultCommonBandwithPackage, err := vpc.NewCommonBandwithPackage(ctx, "defaultCommonBandwithPackage", &vpc.CommonBandwithPackageArgs{
//				Bandwidth:            pulumi.String("2"),
//				InternetChargeType:   pulumi.String("PayByBandwidth"),
//				BandwidthPackageName: pulumi.String(name),
//				Description:          pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nlb.NewLoadbalancerCommonBandwidthPackageAttachment(ctx, "defaultLoadbalancerCommonBandwidthPackageAttachment", &nlb.LoadbalancerCommonBandwidthPackageAttachmentArgs{
//				BandwidthPackageId: defaultCommonBandwithPackage.ID(),
//				LoadBalancerId:     defaultLoadBalancer.ID(),
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
// NLB Loadbalancer Common Bandwidth Package Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment example <load_balancer_id>:<bandwidth_package_id>
//
// ```
type LoadbalancerCommonBandwidthPackageAttachment struct {
	pulumi.CustomResourceState

	// The ID of the bound shared bandwidth package.
	BandwidthPackageId pulumi.StringOutput `pulumi:"bandwidthPackageId"`
	// The ID of the network-based server load balancer instance.
	LoadBalancerId pulumi.StringOutput `pulumi:"loadBalancerId"`
	// Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewLoadbalancerCommonBandwidthPackageAttachment registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancerCommonBandwidthPackageAttachment(ctx *pulumi.Context,
	name string, args *LoadbalancerCommonBandwidthPackageAttachmentArgs, opts ...pulumi.ResourceOption) (*LoadbalancerCommonBandwidthPackageAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BandwidthPackageId == nil {
		return nil, errors.New("invalid value for required argument 'BandwidthPackageId'")
	}
	if args.LoadBalancerId == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadbalancerCommonBandwidthPackageAttachment
	err := ctx.RegisterResource("alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancerCommonBandwidthPackageAttachment gets an existing LoadbalancerCommonBandwidthPackageAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancerCommonBandwidthPackageAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerCommonBandwidthPackageAttachmentState, opts ...pulumi.ResourceOption) (*LoadbalancerCommonBandwidthPackageAttachment, error) {
	var resource LoadbalancerCommonBandwidthPackageAttachment
	err := ctx.ReadResource("alicloud:nlb/loadbalancerCommonBandwidthPackageAttachment:LoadbalancerCommonBandwidthPackageAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadbalancerCommonBandwidthPackageAttachment resources.
type loadbalancerCommonBandwidthPackageAttachmentState struct {
	// The ID of the bound shared bandwidth package.
	BandwidthPackageId *string `pulumi:"bandwidthPackageId"`
	// The ID of the network-based server load balancer instance.
	LoadBalancerId *string `pulumi:"loadBalancerId"`
	// Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
	Status *string `pulumi:"status"`
}

type LoadbalancerCommonBandwidthPackageAttachmentState struct {
	// The ID of the bound shared bandwidth package.
	BandwidthPackageId pulumi.StringPtrInput
	// The ID of the network-based server load balancer instance.
	LoadBalancerId pulumi.StringPtrInput
	// Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
	Status pulumi.StringPtrInput
}

func (LoadbalancerCommonBandwidthPackageAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCommonBandwidthPackageAttachmentState)(nil)).Elem()
}

type loadbalancerCommonBandwidthPackageAttachmentArgs struct {
	// The ID of the bound shared bandwidth package.
	BandwidthPackageId string `pulumi:"bandwidthPackageId"`
	// The ID of the network-based server load balancer instance.
	LoadBalancerId string `pulumi:"loadBalancerId"`
}

// The set of arguments for constructing a LoadbalancerCommonBandwidthPackageAttachment resource.
type LoadbalancerCommonBandwidthPackageAttachmentArgs struct {
	// The ID of the bound shared bandwidth package.
	BandwidthPackageId pulumi.StringInput
	// The ID of the network-based server load balancer instance.
	LoadBalancerId pulumi.StringInput
}

func (LoadbalancerCommonBandwidthPackageAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCommonBandwidthPackageAttachmentArgs)(nil)).Elem()
}

type LoadbalancerCommonBandwidthPackageAttachmentInput interface {
	pulumi.Input

	ToLoadbalancerCommonBandwidthPackageAttachmentOutput() LoadbalancerCommonBandwidthPackageAttachmentOutput
	ToLoadbalancerCommonBandwidthPackageAttachmentOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentOutput
}

func (*LoadbalancerCommonBandwidthPackageAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (i *LoadbalancerCommonBandwidthPackageAttachment) ToLoadbalancerCommonBandwidthPackageAttachmentOutput() LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return i.ToLoadbalancerCommonBandwidthPackageAttachmentOutputWithContext(context.Background())
}

func (i *LoadbalancerCommonBandwidthPackageAttachment) ToLoadbalancerCommonBandwidthPackageAttachmentOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCommonBandwidthPackageAttachmentOutput)
}

// LoadbalancerCommonBandwidthPackageAttachmentArrayInput is an input type that accepts LoadbalancerCommonBandwidthPackageAttachmentArray and LoadbalancerCommonBandwidthPackageAttachmentArrayOutput values.
// You can construct a concrete instance of `LoadbalancerCommonBandwidthPackageAttachmentArrayInput` via:
//
//	LoadbalancerCommonBandwidthPackageAttachmentArray{ LoadbalancerCommonBandwidthPackageAttachmentArgs{...} }
type LoadbalancerCommonBandwidthPackageAttachmentArrayInput interface {
	pulumi.Input

	ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutput() LoadbalancerCommonBandwidthPackageAttachmentArrayOutput
	ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutputWithContext(context.Context) LoadbalancerCommonBandwidthPackageAttachmentArrayOutput
}

type LoadbalancerCommonBandwidthPackageAttachmentArray []LoadbalancerCommonBandwidthPackageAttachmentInput

func (LoadbalancerCommonBandwidthPackageAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (i LoadbalancerCommonBandwidthPackageAttachmentArray) ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutput() LoadbalancerCommonBandwidthPackageAttachmentArrayOutput {
	return i.ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutputWithContext(context.Background())
}

func (i LoadbalancerCommonBandwidthPackageAttachmentArray) ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCommonBandwidthPackageAttachmentArrayOutput)
}

// LoadbalancerCommonBandwidthPackageAttachmentMapInput is an input type that accepts LoadbalancerCommonBandwidthPackageAttachmentMap and LoadbalancerCommonBandwidthPackageAttachmentMapOutput values.
// You can construct a concrete instance of `LoadbalancerCommonBandwidthPackageAttachmentMapInput` via:
//
//	LoadbalancerCommonBandwidthPackageAttachmentMap{ "key": LoadbalancerCommonBandwidthPackageAttachmentArgs{...} }
type LoadbalancerCommonBandwidthPackageAttachmentMapInput interface {
	pulumi.Input

	ToLoadbalancerCommonBandwidthPackageAttachmentMapOutput() LoadbalancerCommonBandwidthPackageAttachmentMapOutput
	ToLoadbalancerCommonBandwidthPackageAttachmentMapOutputWithContext(context.Context) LoadbalancerCommonBandwidthPackageAttachmentMapOutput
}

type LoadbalancerCommonBandwidthPackageAttachmentMap map[string]LoadbalancerCommonBandwidthPackageAttachmentInput

func (LoadbalancerCommonBandwidthPackageAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (i LoadbalancerCommonBandwidthPackageAttachmentMap) ToLoadbalancerCommonBandwidthPackageAttachmentMapOutput() LoadbalancerCommonBandwidthPackageAttachmentMapOutput {
	return i.ToLoadbalancerCommonBandwidthPackageAttachmentMapOutputWithContext(context.Background())
}

func (i LoadbalancerCommonBandwidthPackageAttachmentMap) ToLoadbalancerCommonBandwidthPackageAttachmentMapOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCommonBandwidthPackageAttachmentMapOutput)
}

type LoadbalancerCommonBandwidthPackageAttachmentOutput struct{ *pulumi.OutputState }

func (LoadbalancerCommonBandwidthPackageAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (o LoadbalancerCommonBandwidthPackageAttachmentOutput) ToLoadbalancerCommonBandwidthPackageAttachmentOutput() LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return o
}

func (o LoadbalancerCommonBandwidthPackageAttachmentOutput) ToLoadbalancerCommonBandwidthPackageAttachmentOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return o
}

// The ID of the bound shared bandwidth package.
func (o LoadbalancerCommonBandwidthPackageAttachmentOutput) BandwidthPackageId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCommonBandwidthPackageAttachment) pulumi.StringOutput { return v.BandwidthPackageId }).(pulumi.StringOutput)
}

// The ID of the network-based server load balancer instance.
func (o LoadbalancerCommonBandwidthPackageAttachmentOutput) LoadBalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCommonBandwidthPackageAttachment) pulumi.StringOutput { return v.LoadBalancerId }).(pulumi.StringOutput)
}

// Network-based load balancing instance status. Value:, indicating that the instance listener will no longer forward traffic.
func (o LoadbalancerCommonBandwidthPackageAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCommonBandwidthPackageAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type LoadbalancerCommonBandwidthPackageAttachmentArrayOutput struct{ *pulumi.OutputState }

func (LoadbalancerCommonBandwidthPackageAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (o LoadbalancerCommonBandwidthPackageAttachmentArrayOutput) ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutput() LoadbalancerCommonBandwidthPackageAttachmentArrayOutput {
	return o
}

func (o LoadbalancerCommonBandwidthPackageAttachmentArrayOutput) ToLoadbalancerCommonBandwidthPackageAttachmentArrayOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentArrayOutput {
	return o
}

func (o LoadbalancerCommonBandwidthPackageAttachmentArrayOutput) Index(i pulumi.IntInput) LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadbalancerCommonBandwidthPackageAttachment {
		return vs[0].([]*LoadbalancerCommonBandwidthPackageAttachment)[vs[1].(int)]
	}).(LoadbalancerCommonBandwidthPackageAttachmentOutput)
}

type LoadbalancerCommonBandwidthPackageAttachmentMapOutput struct{ *pulumi.OutputState }

func (LoadbalancerCommonBandwidthPackageAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerCommonBandwidthPackageAttachment)(nil)).Elem()
}

func (o LoadbalancerCommonBandwidthPackageAttachmentMapOutput) ToLoadbalancerCommonBandwidthPackageAttachmentMapOutput() LoadbalancerCommonBandwidthPackageAttachmentMapOutput {
	return o
}

func (o LoadbalancerCommonBandwidthPackageAttachmentMapOutput) ToLoadbalancerCommonBandwidthPackageAttachmentMapOutputWithContext(ctx context.Context) LoadbalancerCommonBandwidthPackageAttachmentMapOutput {
	return o
}

func (o LoadbalancerCommonBandwidthPackageAttachmentMapOutput) MapIndex(k pulumi.StringInput) LoadbalancerCommonBandwidthPackageAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadbalancerCommonBandwidthPackageAttachment {
		return vs[0].(map[string]*LoadbalancerCommonBandwidthPackageAttachment)[vs[1].(string)]
	}).(LoadbalancerCommonBandwidthPackageAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCommonBandwidthPackageAttachmentInput)(nil)).Elem(), &LoadbalancerCommonBandwidthPackageAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCommonBandwidthPackageAttachmentArrayInput)(nil)).Elem(), LoadbalancerCommonBandwidthPackageAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCommonBandwidthPackageAttachmentMapInput)(nil)).Elem(), LoadbalancerCommonBandwidthPackageAttachmentMap{})
	pulumi.RegisterOutputType(LoadbalancerCommonBandwidthPackageAttachmentOutput{})
	pulumi.RegisterOutputType(LoadbalancerCommonBandwidthPackageAttachmentArrayOutput{})
	pulumi.RegisterOutputType(LoadbalancerCommonBandwidthPackageAttachmentMapOutput{})
}
