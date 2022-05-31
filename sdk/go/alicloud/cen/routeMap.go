// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This topic provides an overview of the route map function of Cloud Enterprise Networks (CENs).
// You can use the route map function to filter routes and modify route attributes.
// By doing so, you can manage the communication between networks attached to a CEN.
//
// For information about CEN Route Map and how to use it, see [Manage CEN Route Map](https://www.alibabacloud.com/help/doc-detail/124157.htm).
//
// > **NOTE:** Available in 1.82.0+
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/providers"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		defaultInstance, err := cen.NewInstance(ctx, "defaultInstance", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = providers.Newalicloud(ctx, "vpc00Region", &providers.alicloudArgs{
// 			Region: "cn-hangzhou",
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = providers.Newalicloud(ctx, "vpc01Region", &providers.alicloudArgs{
// 			Region: "cn-shanghai",
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		vpc00, err := vpc.NewNetwork(ctx, "vpc00", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		}, pulumi.Provider(alicloud.Vpc00_region))
// 		if err != nil {
// 			return err
// 		}
// 		vpc01, err := vpc.NewNetwork(ctx, "vpc01", &vpc.NetworkArgs{
// 			CidrBlock: pulumi.String("172.16.0.0/12"),
// 		}, pulumi.Provider(alicloud.Vpc01_region))
// 		if err != nil {
// 			return err
// 		}
// 		default00, err := cen.NewInstanceAttachment(ctx, "default00", &cen.InstanceAttachmentArgs{
// 			InstanceId:            defaultInstance.ID(),
// 			ChildInstanceId:       vpc00.ID(),
// 			ChildInstanceType:     pulumi.String("VPC"),
// 			ChildInstanceRegionId: pulumi.String("cn-hangzhou"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		default01, err := cen.NewInstanceAttachment(ctx, "default01", &cen.InstanceAttachmentArgs{
// 			InstanceId:            defaultInstance.ID(),
// 			ChildInstanceId:       vpc01.ID(),
// 			ChildInstanceType:     pulumi.String("VPC"),
// 			ChildInstanceRegionId: pulumi.String("cn-shanghai"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cen.NewRouteMap(ctx, "defaultRouteMap", &cen.RouteMapArgs{
// 			CenRegionId:       pulumi.String("cn-hangzhou"),
// 			CenId:             pulumi.Any(alicloud_cen_instance.Cen.Id),
// 			Description:       pulumi.String("test-desc"),
// 			Priority:          pulumi.Int(1),
// 			TransmitDirection: pulumi.String("RegionIn"),
// 			MapResult:         pulumi.String("Permit"),
// 			NextPriority:      pulumi.Int(1),
// 			SourceRegionIds: pulumi.StringArray{
// 				pulumi.String("cn-hangzhou"),
// 			},
// 			SourceInstanceIds: pulumi.StringArray{
// 				vpc00.ID(),
// 			},
// 			SourceInstanceIdsReverseMatch: pulumi.Bool(false),
// 			DestinationInstanceIds: pulumi.StringArray{
// 				vpc01.ID(),
// 			},
// 			DestinationInstanceIdsReverseMatch: pulumi.Bool(false),
// 			SourceRouteTableIds: pulumi.StringArray{
// 				vpc00.RouteTableId,
// 			},
// 			DestinationRouteTableIds: pulumi.StringArray{
// 				vpc01.RouteTableId,
// 			},
// 			SourceChildInstanceTypes: pulumi.StringArray{
// 				pulumi.String("VPC"),
// 			},
// 			DestinationChildInstanceTypes: pulumi.StringArray{
// 				pulumi.String("VPC"),
// 			},
// 			DestinationCidrBlocks: pulumi.StringArray{
// 				vpc01.CidrBlock,
// 			},
// 			CidrMatchMode: pulumi.String("Include"),
// 			RouteTypes: pulumi.StringArray{
// 				pulumi.String("System"),
// 			},
// 			MatchAsns: pulumi.StringArray{
// 				pulumi.String("65501"),
// 			},
// 			AsPathMatchMode: pulumi.String("Include"),
// 			MatchCommunitySets: pulumi.StringArray{
// 				pulumi.String("65501:1"),
// 			},
// 			CommunityMatchMode:   pulumi.String("Include"),
// 			CommunityOperateMode: pulumi.String("Additive"),
// 			OperateCommunitySets: pulumi.StringArray{
// 				pulumi.String("65501:1"),
// 			},
// 			Preference: pulumi.Int(20),
// 			PrependAsPaths: pulumi.StringArray{
// 				pulumi.String("65501"),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			default00,
// 			default01,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// CEN RouteMap can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cen/routeMap:RouteMap default <cen_id>:<route_map_id>.
// ```
type RouteMap struct {
	pulumi.CustomResourceState

	// A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
	AsPathMatchMode pulumi.StringPtrOutput `pulumi:"asPathMatchMode"`
	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId pulumi.StringOutput `pulumi:"cenRegionId"`
	// A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
	CidrMatchMode pulumi.StringPtrOutput `pulumi:"cidrMatchMode"`
	// A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
	CommunityMatchMode pulumi.StringPtrOutput `pulumi:"communityMatchMode"`
	// An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
	CommunityOperateMode pulumi.StringPtrOutput `pulumi:"communityOperateMode"`
	// The description of the route map.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
	DestinationChildInstanceTypes pulumi.StringArrayOutput `pulumi:"destinationChildInstanceTypes"`
	// A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
	DestinationCidrBlocks pulumi.StringArrayOutput `pulumi:"destinationCidrBlocks"`
	// A match statement that indicates the list of IDs of the destination instances.
	DestinationInstanceIds pulumi.StringArrayOutput `pulumi:"destinationInstanceIds"`
	// Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	DestinationInstanceIdsReverseMatch pulumi.BoolPtrOutput `pulumi:"destinationInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
	DestinationRouteTableIds pulumi.StringArrayOutput `pulumi:"destinationRouteTableIds"`
	// The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
	MapResult pulumi.StringOutput `pulumi:"mapResult"`
	// A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
	MatchAsns pulumi.StringArrayOutput `pulumi:"matchAsns"`
	// A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	MatchCommunitySets pulumi.StringArrayOutput `pulumi:"matchCommunitySets"`
	// The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
	NextPriority pulumi.IntPtrOutput `pulumi:"nextPriority"`
	// An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	OperateCommunitySets pulumi.StringArrayOutput `pulumi:"operateCommunitySets"`
	// An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
	Preference pulumi.IntPtrOutput `pulumi:"preference"`
	// An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
	PrependAsPaths pulumi.StringArrayOutput `pulumi:"prependAsPaths"`
	// The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// ID of the RouteMap. It is available in 1.161.0+.
	RouteMapId pulumi.StringOutput `pulumi:"routeMapId"`
	// A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
	RouteTypes pulumi.StringArrayOutput `pulumi:"routeTypes"`
	// A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
	SourceChildInstanceTypes pulumi.StringArrayOutput `pulumi:"sourceChildInstanceTypes"`
	// A match statement that indicates the list of IDs of the source instances.
	SourceInstanceIds pulumi.StringArrayOutput `pulumi:"sourceInstanceIds"`
	// Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	SourceInstanceIdsReverseMatch pulumi.BoolPtrOutput `pulumi:"sourceInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
	SourceRegionIds pulumi.StringArrayOutput `pulumi:"sourceRegionIds"`
	// A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
	SourceRouteTableIds pulumi.StringArrayOutput `pulumi:"sourceRouteTableIds"`
	// (Computed) The status of route map. Valid values: ["Creating", "Active", "Deleting"].
	Status pulumi.StringOutput `pulumi:"status"`
	// The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
	TransitRouterRouteTableId pulumi.StringOutput `pulumi:"transitRouterRouteTableId"`
	// The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
	TransmitDirection pulumi.StringOutput `pulumi:"transmitDirection"`
}

// NewRouteMap registers a new resource with the given unique name, arguments, and options.
func NewRouteMap(ctx *pulumi.Context,
	name string, args *RouteMapArgs, opts ...pulumi.ResourceOption) (*RouteMap, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.CenRegionId == nil {
		return nil, errors.New("invalid value for required argument 'CenRegionId'")
	}
	if args.MapResult == nil {
		return nil, errors.New("invalid value for required argument 'MapResult'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.TransmitDirection == nil {
		return nil, errors.New("invalid value for required argument 'TransmitDirection'")
	}
	var resource RouteMap
	err := ctx.RegisterResource("alicloud:cen/routeMap:RouteMap", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteMap gets an existing RouteMap resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteMap(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteMapState, opts ...pulumi.ResourceOption) (*RouteMap, error) {
	var resource RouteMap
	err := ctx.ReadResource("alicloud:cen/routeMap:RouteMap", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteMap resources.
type routeMapState struct {
	// A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
	AsPathMatchMode *string `pulumi:"asPathMatchMode"`
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId *string `pulumi:"cenRegionId"`
	// A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
	CidrMatchMode *string `pulumi:"cidrMatchMode"`
	// A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
	CommunityMatchMode *string `pulumi:"communityMatchMode"`
	// An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
	CommunityOperateMode *string `pulumi:"communityOperateMode"`
	// The description of the route map.
	Description *string `pulumi:"description"`
	// A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
	DestinationChildInstanceTypes []string `pulumi:"destinationChildInstanceTypes"`
	// A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
	DestinationCidrBlocks []string `pulumi:"destinationCidrBlocks"`
	// A match statement that indicates the list of IDs of the destination instances.
	DestinationInstanceIds []string `pulumi:"destinationInstanceIds"`
	// Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	DestinationInstanceIdsReverseMatch *bool `pulumi:"destinationInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
	DestinationRouteTableIds []string `pulumi:"destinationRouteTableIds"`
	// The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
	MapResult *string `pulumi:"mapResult"`
	// A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
	MatchAsns []string `pulumi:"matchAsns"`
	// A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	MatchCommunitySets []string `pulumi:"matchCommunitySets"`
	// The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
	NextPriority *int `pulumi:"nextPriority"`
	// An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	OperateCommunitySets []string `pulumi:"operateCommunitySets"`
	// An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
	Preference *int `pulumi:"preference"`
	// An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
	PrependAsPaths []string `pulumi:"prependAsPaths"`
	// The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
	Priority *int `pulumi:"priority"`
	// ID of the RouteMap. It is available in 1.161.0+.
	RouteMapId *string `pulumi:"routeMapId"`
	// A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
	RouteTypes []string `pulumi:"routeTypes"`
	// A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
	SourceChildInstanceTypes []string `pulumi:"sourceChildInstanceTypes"`
	// A match statement that indicates the list of IDs of the source instances.
	SourceInstanceIds []string `pulumi:"sourceInstanceIds"`
	// Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	SourceInstanceIdsReverseMatch *bool `pulumi:"sourceInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
	SourceRegionIds []string `pulumi:"sourceRegionIds"`
	// A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
	SourceRouteTableIds []string `pulumi:"sourceRouteTableIds"`
	// (Computed) The status of route map. Valid values: ["Creating", "Active", "Deleting"].
	Status *string `pulumi:"status"`
	// The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
	TransitRouterRouteTableId *string `pulumi:"transitRouterRouteTableId"`
	// The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
	TransmitDirection *string `pulumi:"transmitDirection"`
}

type RouteMapState struct {
	// A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
	AsPathMatchMode pulumi.StringPtrInput
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// The ID of the region to which the CEN instance belongs.
	CenRegionId pulumi.StringPtrInput
	// A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
	CidrMatchMode pulumi.StringPtrInput
	// A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
	CommunityMatchMode pulumi.StringPtrInput
	// An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
	CommunityOperateMode pulumi.StringPtrInput
	// The description of the route map.
	Description pulumi.StringPtrInput
	// A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
	DestinationChildInstanceTypes pulumi.StringArrayInput
	// A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
	DestinationCidrBlocks pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the destination instances.
	DestinationInstanceIds pulumi.StringArrayInput
	// Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	DestinationInstanceIdsReverseMatch pulumi.BoolPtrInput
	// A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
	DestinationRouteTableIds pulumi.StringArrayInput
	// The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
	MapResult pulumi.StringPtrInput
	// A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
	MatchAsns pulumi.StringArrayInput
	// A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	MatchCommunitySets pulumi.StringArrayInput
	// The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
	NextPriority pulumi.IntPtrInput
	// An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	OperateCommunitySets pulumi.StringArrayInput
	// An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
	Preference pulumi.IntPtrInput
	// An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
	PrependAsPaths pulumi.StringArrayInput
	// The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
	Priority pulumi.IntPtrInput
	// ID of the RouteMap. It is available in 1.161.0+.
	RouteMapId pulumi.StringPtrInput
	// A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
	RouteTypes pulumi.StringArrayInput
	// A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
	SourceChildInstanceTypes pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the source instances.
	SourceInstanceIds pulumi.StringArrayInput
	// Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	SourceInstanceIdsReverseMatch pulumi.BoolPtrInput
	// A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
	SourceRegionIds pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
	SourceRouteTableIds pulumi.StringArrayInput
	// (Computed) The status of route map. Valid values: ["Creating", "Active", "Deleting"].
	Status pulumi.StringPtrInput
	// The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
	TransitRouterRouteTableId pulumi.StringPtrInput
	// The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
	TransmitDirection pulumi.StringPtrInput
}

func (RouteMapState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeMapState)(nil)).Elem()
}

type routeMapArgs struct {
	// A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
	AsPathMatchMode *string `pulumi:"asPathMatchMode"`
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The ID of the region to which the CEN instance belongs.
	CenRegionId string `pulumi:"cenRegionId"`
	// A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
	CidrMatchMode *string `pulumi:"cidrMatchMode"`
	// A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
	CommunityMatchMode *string `pulumi:"communityMatchMode"`
	// An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
	CommunityOperateMode *string `pulumi:"communityOperateMode"`
	// The description of the route map.
	Description *string `pulumi:"description"`
	// A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
	DestinationChildInstanceTypes []string `pulumi:"destinationChildInstanceTypes"`
	// A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
	DestinationCidrBlocks []string `pulumi:"destinationCidrBlocks"`
	// A match statement that indicates the list of IDs of the destination instances.
	DestinationInstanceIds []string `pulumi:"destinationInstanceIds"`
	// Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	DestinationInstanceIdsReverseMatch *bool `pulumi:"destinationInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
	DestinationRouteTableIds []string `pulumi:"destinationRouteTableIds"`
	// The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
	MapResult string `pulumi:"mapResult"`
	// A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
	MatchAsns []string `pulumi:"matchAsns"`
	// A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	MatchCommunitySets []string `pulumi:"matchCommunitySets"`
	// The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
	NextPriority *int `pulumi:"nextPriority"`
	// An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	OperateCommunitySets []string `pulumi:"operateCommunitySets"`
	// An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
	Preference *int `pulumi:"preference"`
	// An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
	PrependAsPaths []string `pulumi:"prependAsPaths"`
	// The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
	Priority int `pulumi:"priority"`
	// A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
	RouteTypes []string `pulumi:"routeTypes"`
	// A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
	SourceChildInstanceTypes []string `pulumi:"sourceChildInstanceTypes"`
	// A match statement that indicates the list of IDs of the source instances.
	SourceInstanceIds []string `pulumi:"sourceInstanceIds"`
	// Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	SourceInstanceIdsReverseMatch *bool `pulumi:"sourceInstanceIdsReverseMatch"`
	// A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
	SourceRegionIds []string `pulumi:"sourceRegionIds"`
	// A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
	SourceRouteTableIds []string `pulumi:"sourceRouteTableIds"`
	// The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
	TransitRouterRouteTableId *string `pulumi:"transitRouterRouteTableId"`
	// The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
	TransmitDirection string `pulumi:"transmitDirection"`
}

// The set of arguments for constructing a RouteMap resource.
type RouteMapArgs struct {
	// A match statement. It indicates the mode in which the AS path attribute is matched. Valid values: ["Include", "Complete"].
	AsPathMatchMode pulumi.StringPtrInput
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// The ID of the region to which the CEN instance belongs.
	CenRegionId pulumi.StringInput
	// A match statement. It indicates the mode in which the prefix attribute is matched. Valid values: ["Include", "Complete"].
	CidrMatchMode pulumi.StringPtrInput
	// A match statement. It indicates the mode in which the community attribute is matched. Valid values: ["Include", "Complete"].
	CommunityMatchMode pulumi.StringPtrInput
	// An action statement. It indicates the mode in which the community attribute is operated. Valid values: ["Additive", "Replace"].
	CommunityOperateMode pulumi.StringPtrInput
	// The description of the route map.
	Description pulumi.StringPtrInput
	// A match statement that indicates the list of destination instance types. Valid values: ["VPC", "VBR", "CCN"].
	DestinationChildInstanceTypes pulumi.StringArrayInput
	// A match statement that indicates the prefix list. The prefix is in the CIDR format. You can enter a maximum of 32 CIDR blocks.
	DestinationCidrBlocks pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the destination instances.
	DestinationInstanceIds pulumi.StringArrayInput
	// Indicates whether to enable the reverse match method for the DestinationInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	DestinationInstanceIdsReverseMatch pulumi.BoolPtrInput
	// A match statement that indicates the list of IDs of the destination route tables. You can enter a maximum of 32 route table IDs.
	DestinationRouteTableIds pulumi.StringArrayInput
	// The action that is performed to a route if the route matches all the match conditions. Valid values: ["Permit", "Deny"].
	MapResult pulumi.StringInput
	// A match statement that indicates the AS path list. The AS path is a well-known mandatory attribute, which describes the numbers of the ASs that a BGP route passes through during transmission.
	MatchAsns pulumi.StringArrayInput
	// A match statement that indicates the community set. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	MatchCommunitySets pulumi.StringArrayInput
	// The priority of the next route map that is associated with the current route map. Value range: 1 to 100.
	NextPriority pulumi.IntPtrInput
	// An action statement that operates the community attribute. The format of each community is nn:nn, which ranges from 1 to 65535. You can enter a maximum of 32 communities. Communities must comply with RFC 1997. Large communities (RFC 8092) are not supported.
	OperateCommunitySets pulumi.StringArrayInput
	// An action statement that modifies the priority of the route. Value range: 1 to 100. The default priority of a route is 50. A lower value indicates a higher preference.
	Preference pulumi.IntPtrInput
	// An action statement that indicates an AS path is prepended when the regional gateway receives or advertises a route.
	PrependAsPaths pulumi.StringArrayInput
	// The priority of the route map. Value range: 1 to 100. A lower value indicates a higher priority.
	Priority pulumi.IntInput
	// A match statement that indicates the list of route types. Valid values: ["System", "Custom", "BGP"].
	RouteTypes pulumi.StringArrayInput
	// A match statement that indicates the list of source instance types. Valid values: ["VPC", "VBR", "CCN"].
	SourceChildInstanceTypes pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the source instances.
	SourceInstanceIds pulumi.StringArrayInput
	// Indicates whether to enable the reverse match method for the SourceInstanceIds match condition. Valid values: ["false", "true"]. Default to "false".
	SourceInstanceIdsReverseMatch pulumi.BoolPtrInput
	// A match statement that indicates the list of IDs of the source regions. You can enter a maximum of 32 region IDs.
	SourceRegionIds pulumi.StringArrayInput
	// A match statement that indicates the list of IDs of the source route tables. You can enter a maximum of 32 route table IDs.
	SourceRouteTableIds pulumi.StringArrayInput
	// The routing table ID of the forwarding router. If you do not enter the routing table ID, the routing policy is automatically associated with the default routing table of the forwarding router.
	TransitRouterRouteTableId pulumi.StringPtrInput
	// The direction in which the route map is applied. Valid values: ["RegionIn", "RegionOut"].
	TransmitDirection pulumi.StringInput
}

func (RouteMapArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeMapArgs)(nil)).Elem()
}

type RouteMapInput interface {
	pulumi.Input

	ToRouteMapOutput() RouteMapOutput
	ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput
}

func (*RouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteMap)(nil)).Elem()
}

func (i *RouteMap) ToRouteMapOutput() RouteMapOutput {
	return i.ToRouteMapOutputWithContext(context.Background())
}

func (i *RouteMap) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteMapOutput)
}

// RouteMapArrayInput is an input type that accepts RouteMapArray and RouteMapArrayOutput values.
// You can construct a concrete instance of `RouteMapArrayInput` via:
//
//          RouteMapArray{ RouteMapArgs{...} }
type RouteMapArrayInput interface {
	pulumi.Input

	ToRouteMapArrayOutput() RouteMapArrayOutput
	ToRouteMapArrayOutputWithContext(context.Context) RouteMapArrayOutput
}

type RouteMapArray []RouteMapInput

func (RouteMapArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteMap)(nil)).Elem()
}

func (i RouteMapArray) ToRouteMapArrayOutput() RouteMapArrayOutput {
	return i.ToRouteMapArrayOutputWithContext(context.Background())
}

func (i RouteMapArray) ToRouteMapArrayOutputWithContext(ctx context.Context) RouteMapArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteMapArrayOutput)
}

// RouteMapMapInput is an input type that accepts RouteMapMap and RouteMapMapOutput values.
// You can construct a concrete instance of `RouteMapMapInput` via:
//
//          RouteMapMap{ "key": RouteMapArgs{...} }
type RouteMapMapInput interface {
	pulumi.Input

	ToRouteMapMapOutput() RouteMapMapOutput
	ToRouteMapMapOutputWithContext(context.Context) RouteMapMapOutput
}

type RouteMapMap map[string]RouteMapInput

func (RouteMapMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteMap)(nil)).Elem()
}

func (i RouteMapMap) ToRouteMapMapOutput() RouteMapMapOutput {
	return i.ToRouteMapMapOutputWithContext(context.Background())
}

func (i RouteMapMap) ToRouteMapMapOutputWithContext(ctx context.Context) RouteMapMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteMapMapOutput)
}

type RouteMapOutput struct{ *pulumi.OutputState }

func (RouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteMap)(nil)).Elem()
}

func (o RouteMapOutput) ToRouteMapOutput() RouteMapOutput {
	return o
}

func (o RouteMapOutput) ToRouteMapOutputWithContext(ctx context.Context) RouteMapOutput {
	return o
}

type RouteMapArrayOutput struct{ *pulumi.OutputState }

func (RouteMapArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteMap)(nil)).Elem()
}

func (o RouteMapArrayOutput) ToRouteMapArrayOutput() RouteMapArrayOutput {
	return o
}

func (o RouteMapArrayOutput) ToRouteMapArrayOutputWithContext(ctx context.Context) RouteMapArrayOutput {
	return o
}

func (o RouteMapArrayOutput) Index(i pulumi.IntInput) RouteMapOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouteMap {
		return vs[0].([]*RouteMap)[vs[1].(int)]
	}).(RouteMapOutput)
}

type RouteMapMapOutput struct{ *pulumi.OutputState }

func (RouteMapMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteMap)(nil)).Elem()
}

func (o RouteMapMapOutput) ToRouteMapMapOutput() RouteMapMapOutput {
	return o
}

func (o RouteMapMapOutput) ToRouteMapMapOutputWithContext(ctx context.Context) RouteMapMapOutput {
	return o
}

func (o RouteMapMapOutput) MapIndex(k pulumi.StringInput) RouteMapOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouteMap {
		return vs[0].(map[string]*RouteMap)[vs[1].(string)]
	}).(RouteMapOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteMapInput)(nil)).Elem(), &RouteMap{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteMapArrayInput)(nil)).Elem(), RouteMapArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteMapMapInput)(nil)).Elem(), RouteMapMap{})
	pulumi.RegisterOutputType(RouteMapOutput{})
	pulumi.RegisterOutputType(RouteMapArrayOutput{})
	pulumi.RegisterOutputType(RouteMapMapOutput{})
}
