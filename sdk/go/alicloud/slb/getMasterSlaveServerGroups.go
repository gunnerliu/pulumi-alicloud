// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/slb"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v2/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "cloud_efficiency"
// 		opt1 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &alicloud.GetZonesArgs{
// 			AvailableDiskCategory:     &opt0,
// 			AvailableResourceCreation: &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt2 := defaultZones.Zones[0].Id
// 		opt3 := 2
// 		defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
// 			AvailabilityZone: &opt2,
// 			EniAmount:        &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt4 := "^ubuntu_18.*64"
// 		opt5 := true
// 		opt6 := "system"
// 		image, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
// 			NameRegex:  &opt4,
// 			MostRecent: &opt5,
// 			Owners:     &opt6,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		mainNetwork, err := vpc.NewNetwork(ctx, "mainNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		mainSwitch, err := vpc.NewSwitch(ctx, "mainSwitch", &vpc.SwitchArgs{
// 			VpcId:            mainNetwork.ID(),
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 			CidrBlock:        pulumi.String("172.16.0.0/16"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		groupSecurityGroup, err := ecs.NewSecurityGroup(ctx, "groupSecurityGroup", &ecs.SecurityGroupArgs{
// 			VpcId: mainNetwork.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		var instanceInstance []*ecs.Instance
// 		for key0, _ := range "2" {
// 			__res, err := ecs.NewInstance(ctx, fmt.Sprintf("instanceInstance-%v", key0), &ecs.InstanceArgs{
// 				ImageId:      pulumi.String(image.Images[0].Id),
// 				InstanceType: pulumi.String(defaultInstanceTypes.InstanceTypes[0].Id),
// 				InstanceName: pulumi.String(name),
// 				SecurityGroups: pulumi.StringArray{
// 					groupSecurityGroup.ID(),
// 				},
// 				InternetChargeType:      pulumi.String("PayByTraffic"),
// 				InternetMaxBandwidthOut: pulumi.Int(10),
// 				AvailabilityZone:        pulumi.String(defaultZones.Zones[0].Id),
// 				InstanceChargeType:      pulumi.String("PostPaid"),
// 				SystemDiskCategory:      pulumi.String("cloud_efficiency"),
// 				VswitchId:               mainSwitch.ID(),
// 			})
// 			if err != nil {
// 				return err
// 			}
// 			instanceInstance = append(instanceInstance, __res)
// 		}
// 		instanceLoadBalancer, err := slb.NewLoadBalancer(ctx, "instanceLoadBalancer", &slb.LoadBalancerArgs{
// 			VswitchId:     mainSwitch.ID(),
// 			Specification: pulumi.String("slb.s2.small"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = slb.NewMasterSlaveServerGroup(ctx, "groupMasterSlaveServerGroup", &slb.MasterSlaveServerGroupArgs{
// 			LoadBalancerId: instanceLoadBalancer.ID(),
// 			Servers: slb.MasterSlaveServerGroupServerArray{
// 				&slb.MasterSlaveServerGroupServerArgs{
// 					ServerId:   instanceInstance[0].ID(),
// 					Port:       pulumi.Int(100),
// 					Weight:     pulumi.Int(100),
// 					ServerType: pulumi.String("Master"),
// 				},
// 				&slb.MasterSlaveServerGroupServerArgs{
// 					ServerId:   instanceInstance[1].ID(),
// 					Port:       pulumi.Int(100),
// 					Weight:     pulumi.Int(100),
// 					ServerType: pulumi.String("Slave"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("firstSlbServerGroupId", sampleDs.ApplyT(func(sampleDs slb.GetMasterSlaveServerGroupsResult) (string, error) {
// 			return sampleDs.Groups[0].Id, nil
// 		}).(pulumi.StringOutput))
// 		return nil
// 	})
// }
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
