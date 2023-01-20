// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the master slave server groups related to a server load balancer.
//
// > **NOTE:** Available in 1.54.0+
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/slb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
//				AvailableDiskCategory:     pulumi.StringRef("cloud_efficiency"),
//				AvailableResourceCreation: pulumi.StringRef("VSwitch"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
//				AvailabilityZone: pulumi.StringRef(defaultZones.Zones[0].Id),
//				EniAmount:        pulumi.IntRef(2),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			image, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
//				NameRegex:  pulumi.StringRef("^ubuntu_18.*64"),
//				MostRecent: pulumi.BoolRef(true),
//				Owners:     pulumi.StringRef("system"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			cfg := config.New(ctx, "")
//			name := "tf-testAccSlbMasterSlaveServerGroupVpc"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			number := "1"
//			if param := cfg.Get("number"); param != "" {
//				number = param
//			}
//			mainNetwork, err := vpc.NewNetwork(ctx, "mainNetwork", &vpc.NetworkArgs{
//				CidrBlock: pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			mainSwitch, err := vpc.NewSwitch(ctx, "mainSwitch", &vpc.SwitchArgs{
//				VpcId:       mainNetwork.ID(),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("172.16.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			groupSecurityGroup, err := ecs.NewSecurityGroup(ctx, "groupSecurityGroup", &ecs.SecurityGroupArgs{
//				VpcId: mainNetwork.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			var instanceInstance []*ecs.Instance
//			for index := 0; index < "2"; index++ {
//				key0 := index
//				_ := index
//				__res, err := ecs.NewInstance(ctx, fmt.Sprintf("instanceInstance-%v", key0), &ecs.InstanceArgs{
//					ImageId:      *pulumi.String(image.Images[0].Id),
//					InstanceType: *pulumi.String(defaultInstanceTypes.InstanceTypes[0].Id),
//					InstanceName: pulumi.String(name),
//					SecurityGroups: pulumi.StringArray{
//						groupSecurityGroup.ID(),
//					},
//					InternetChargeType:      pulumi.String("PayByTraffic"),
//					InternetMaxBandwidthOut: pulumi.Int(10),
//					AvailabilityZone:        *pulumi.String(defaultZones.Zones[0].Id),
//					InstanceChargeType:      pulumi.String("PostPaid"),
//					SystemDiskCategory:      pulumi.String("cloud_efficiency"),
//					VswitchId:               mainSwitch.ID(),
//				})
//				if err != nil {
//					return err
//				}
//				instanceInstance = append(instanceInstance, __res)
//			}
//			instanceApplicationLoadBalancer, err := slb.NewApplicationLoadBalancer(ctx, "instanceApplicationLoadBalancer", &slb.ApplicationLoadBalancerArgs{
//				LoadBalancerName: pulumi.String(name),
//				VswitchId:        mainSwitch.ID(),
//				LoadBalancerSpec: pulumi.String("slb.s2.small"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = slb.NewMasterSlaveServerGroup(ctx, "groupMasterSlaveServerGroup", &slb.MasterSlaveServerGroupArgs{
//				LoadBalancerId: instanceApplicationLoadBalancer.ID(),
//				Servers: slb.MasterSlaveServerGroupServerArray{
//					&slb.MasterSlaveServerGroupServerArgs{
//						ServerId:   instanceInstance[0].ID(),
//						Port:       pulumi.Int(100),
//						Weight:     pulumi.Int(100),
//						ServerType: pulumi.String("Master"),
//					},
//					&slb.MasterSlaveServerGroupServerArgs{
//						ServerId:   instanceInstance[1].ID(),
//						Port:       pulumi.Int(100),
//						Weight:     pulumi.Int(100),
//						ServerType: pulumi.String("Slave"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			sampleDs := slb.GetMasterSlaveServerGroupsOutput(ctx, slb.GetMasterSlaveServerGroupsOutputArgs{
//				LoadBalancerId: instanceApplicationLoadBalancer.ID(),
//			}, nil)
//			ctx.Export("firstSlbServerGroupId", sampleDs.ApplyT(func(sampleDs slb.GetMasterSlaveServerGroupsResult) (*string, error) {
//				return &sampleDs.Groups[0].Id, nil
//			}).(pulumi.StringPtrOutput))
//			return nil
//		})
//	}
//
// ```
func GetMasterSlaveServerGroups(ctx *pulumi.Context, args *GetMasterSlaveServerGroupsArgs, opts ...pulumi.InvokeOption) (*GetMasterSlaveServerGroupsResult, error) {
	var rv GetMasterSlaveServerGroupsResult
	err := ctx.Invoke("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMasterSlaveServerGroups.
type GetMasterSlaveServerGroupsArgs struct {
	// A list of master slave server group IDs to filter results.
	Ids []string `pulumi:"ids"`
	// ID of the SLB.
	LoadBalancerId string `pulumi:"loadBalancerId"`
	// A regex string to filter results by master slave server group name.
	NameRegex  *string `pulumi:"nameRegex"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getMasterSlaveServerGroups.
type GetMasterSlaveServerGroupsResult struct {
	// A list of SLB master slave server groups. Each element contains the following attributes:
	Groups []GetMasterSlaveServerGroupsGroup `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of SLB master slave server groups IDs.
	Ids            []string `pulumi:"ids"`
	LoadBalancerId string   `pulumi:"loadBalancerId"`
	NameRegex      *string  `pulumi:"nameRegex"`
	// A list of SLB master slave server groups names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetMasterSlaveServerGroupsOutput(ctx *pulumi.Context, args GetMasterSlaveServerGroupsOutputArgs, opts ...pulumi.InvokeOption) GetMasterSlaveServerGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMasterSlaveServerGroupsResult, error) {
			args := v.(GetMasterSlaveServerGroupsArgs)
			r, err := GetMasterSlaveServerGroups(ctx, &args, opts...)
			var s GetMasterSlaveServerGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetMasterSlaveServerGroupsResultOutput)
}

// A collection of arguments for invoking getMasterSlaveServerGroups.
type GetMasterSlaveServerGroupsOutputArgs struct {
	// A list of master slave server group IDs to filter results.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// ID of the SLB.
	LoadBalancerId pulumi.StringInput `pulumi:"loadBalancerId"`
	// A regex string to filter results by master slave server group name.
	NameRegex  pulumi.StringPtrInput `pulumi:"nameRegex"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetMasterSlaveServerGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMasterSlaveServerGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getMasterSlaveServerGroups.
type GetMasterSlaveServerGroupsResultOutput struct{ *pulumi.OutputState }

func (GetMasterSlaveServerGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMasterSlaveServerGroupsResult)(nil)).Elem()
}

func (o GetMasterSlaveServerGroupsResultOutput) ToGetMasterSlaveServerGroupsResultOutput() GetMasterSlaveServerGroupsResultOutput {
	return o
}

func (o GetMasterSlaveServerGroupsResultOutput) ToGetMasterSlaveServerGroupsResultOutputWithContext(ctx context.Context) GetMasterSlaveServerGroupsResultOutput {
	return o
}

// A list of SLB master slave server groups. Each element contains the following attributes:
func (o GetMasterSlaveServerGroupsResultOutput) Groups() GetMasterSlaveServerGroupsGroupArrayOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) []GetMasterSlaveServerGroupsGroup { return v.Groups }).(GetMasterSlaveServerGroupsGroupArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMasterSlaveServerGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of SLB master slave server groups IDs.
func (o GetMasterSlaveServerGroupsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetMasterSlaveServerGroupsResultOutput) LoadBalancerId() pulumi.StringOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) string { return v.LoadBalancerId }).(pulumi.StringOutput)
}

func (o GetMasterSlaveServerGroupsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of SLB master slave server groups names.
func (o GetMasterSlaveServerGroupsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetMasterSlaveServerGroupsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetMasterSlaveServerGroupsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMasterSlaveServerGroupsResultOutput{})
}
