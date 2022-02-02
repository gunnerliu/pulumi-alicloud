// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides a list of Route Entries owned by an Alibaba Cloud account.
//
// > **NOTE:** Available in 1.37.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/ecs"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "VSwitch"
// 		defaultZones, err := alicloud.GetZones(ctx, &GetZonesArgs{
// 			AvailableResourceCreation: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := defaultZones.Zones[0].Id
// 		opt2 := 1
// 		opt3 := 2
// 		defaultInstanceTypes, err := ecs.GetInstanceTypes(ctx, &ecs.GetInstanceTypesArgs{
// 			AvailabilityZone: &opt1,
// 			CpuCoreCount:     &opt2,
// 			MemorySize:       &opt3,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt4 := true
// 		opt5 := "^ubuntu_18.*64"
// 		opt6 := "system"
// 		defaultImages, err := ecs.GetImages(ctx, &ecs.GetImagesArgs{
// 			MostRecent: &opt4,
// 			NameRegex:  &opt5,
// 			Owners:     &opt6,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		cfg := config.New(ctx, "")
// 		name := "tf-testAccRouteEntryConfig"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		fooNetwork, err := vpc.NewNetwork(ctx, "fooNetwork", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("10.1.0.0/21"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooSwitch, err := vpc.NewSwitch(ctx, "fooSwitch", &vpc.SwitchArgs{
// 			AvailabilityZone: pulumi.String(defaultZones.Zones[0].Id),
// 			CidrBlock:        pulumi.String("10.1.1.0/24"),
// 			VpcId:            fooNetwork.ID(),
// 			VswitchName:      pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		tfTestFoo, err := ecs.NewSecurityGroup(ctx, "tfTestFoo", &ecs.SecurityGroupArgs{
// 			Description: pulumi.String("foo"),
// 			VpcId:       fooNetwork.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooInstance, err := ecs.NewInstance(ctx, "fooInstance", &ecs.InstanceArgs{
// 			AllocatePublicIp:        pulumi.Bool(true),
// 			ImageId:                 pulumi.String(defaultImages.Images[0].Id),
// 			InstanceChargeType:      pulumi.String("PostPaid"),
// 			InstanceName:            pulumi.String(name),
// 			InstanceType:            pulumi.String(defaultInstanceTypes.InstanceTypes[0].Id),
// 			InternetChargeType:      pulumi.String("PayByTraffic"),
// 			InternetMaxBandwidthOut: pulumi.Int(5),
// 			SecurityGroups: pulumi.StringArray{
// 				tfTestFoo.ID(),
// 			},
// 			SystemDiskCategory: pulumi.String("cloud_efficiency"),
// 			VswitchId:          fooSwitch.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		fooRouteEntry, err := vpc.NewRouteEntry(ctx, "fooRouteEntry", &vpc.RouteEntryArgs{
// 			DestinationCidrblock: pulumi.String("172.11.1.1/32"),
// 			NexthopId:            fooInstance.ID(),
// 			NexthopType:          pulumi.String("Instance"),
// 			RouteTableId:         fooNetwork.RouteTableId,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ecs.NewSecurityGroupRule(ctx, "ingress", &ecs.SecurityGroupRuleArgs{
// 			CidrIp:          pulumi.String("0.0.0.0/0"),
// 			IpProtocol:      pulumi.String("tcp"),
// 			NicType:         pulumi.String("intranet"),
// 			Policy:          pulumi.String("accept"),
// 			PortRange:       pulumi.String("22/22"),
// 			Priority:        pulumi.Int(1),
// 			SecurityGroupId: tfTestFoo.ID(),
// 			Type:            pulumi.String("ingress"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_ = vpc.GetRouteEntriesOutput(ctx, vpc.GetRouteEntriesOutputArgs{
// 			RouteTableId: fooRouteEntry.RouteTableId,
// 		}, nil)
// 		return nil
// 	})
// }
// ```
func GetRouteEntries(ctx *pulumi.Context, args *GetRouteEntriesArgs, opts ...pulumi.InvokeOption) (*GetRouteEntriesResult, error) {
	var rv GetRouteEntriesResult
	err := ctx.Invoke("alicloud:vpc/getRouteEntries:getRouteEntries", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRouteEntries.
type GetRouteEntriesArgs struct {
	// The destination CIDR block of the route entry.
	CidrBlock *string `pulumi:"cidrBlock"`
	// The instance ID of the next hop.
	InstanceId *string `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId string `pulumi:"routeTableId"`
	// The type of the route entry.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getRouteEntries.
type GetRouteEntriesResult struct {
	// The destination CIDR block of the route entry.
	CidrBlock *string `pulumi:"cidrBlock"`
	// A list of Route Entries. Each element contains the following attributes:
	Entries []GetRouteEntriesEntry `pulumi:"entries"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The instance ID of the next hop.
	InstanceId *string `pulumi:"instanceId"`
	OutputFile *string `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId string `pulumi:"routeTableId"`
	// The type of the route entry.
	Type *string `pulumi:"type"`
}

func GetRouteEntriesOutput(ctx *pulumi.Context, args GetRouteEntriesOutputArgs, opts ...pulumi.InvokeOption) GetRouteEntriesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetRouteEntriesResult, error) {
			args := v.(GetRouteEntriesArgs)
			r, err := GetRouteEntries(ctx, &args, opts...)
			return *r, err
		}).(GetRouteEntriesResultOutput)
}

// A collection of arguments for invoking getRouteEntries.
type GetRouteEntriesOutputArgs struct {
	// The destination CIDR block of the route entry.
	CidrBlock pulumi.StringPtrInput `pulumi:"cidrBlock"`
	// The instance ID of the next hop.
	InstanceId pulumi.StringPtrInput `pulumi:"instanceId"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The ID of the router table to which the route entry belongs.
	RouteTableId pulumi.StringInput `pulumi:"routeTableId"`
	// The type of the route entry.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetRouteEntriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteEntriesArgs)(nil)).Elem()
}

// A collection of values returned by getRouteEntries.
type GetRouteEntriesResultOutput struct{ *pulumi.OutputState }

func (GetRouteEntriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRouteEntriesResult)(nil)).Elem()
}

func (o GetRouteEntriesResultOutput) ToGetRouteEntriesResultOutput() GetRouteEntriesResultOutput {
	return o
}

func (o GetRouteEntriesResultOutput) ToGetRouteEntriesResultOutputWithContext(ctx context.Context) GetRouteEntriesResultOutput {
	return o
}

// The destination CIDR block of the route entry.
func (o GetRouteEntriesResultOutput) CidrBlock() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.CidrBlock }).(pulumi.StringPtrOutput)
}

// A list of Route Entries. Each element contains the following attributes:
func (o GetRouteEntriesResultOutput) Entries() GetRouteEntriesEntryArrayOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) []GetRouteEntriesEntry { return v.Entries }).(GetRouteEntriesEntryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetRouteEntriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The instance ID of the next hop.
func (o GetRouteEntriesResultOutput) InstanceId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.InstanceId }).(pulumi.StringPtrOutput)
}

func (o GetRouteEntriesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// The ID of the router table to which the route entry belongs.
func (o GetRouteEntriesResultOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) string { return v.RouteTableId }).(pulumi.StringOutput)
}

// The type of the route entry.
func (o GetRouteEntriesResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetRouteEntriesResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRouteEntriesResultOutput{})
}
