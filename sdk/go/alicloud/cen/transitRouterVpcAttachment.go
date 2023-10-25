// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a CEN transit router VPC attachment resource that associate the VPC with the CEN instance. [What is Cen Transit Router VPC Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitroutervpcattachment)
//
// > **NOTE:** Available since v1.126.0.
//
// ## Import
//
// CEN instance can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment example tr-********:tr-attach-********
//
// ```
type TransitRouterVpcAttachment struct {
	pulumi.CustomResourceState

	// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
	AutoPublishRouteEnabled pulumi.BoolOutput `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringOutput `pulumi:"paymentType"`
	// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
	ResourceType pulumi.StringPtrOutput `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
	//
	// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
	RouteTableAssociationEnabled pulumi.BoolPtrOutput `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
	//
	// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
	RouteTablePropagationEnabled pulumi.BoolPtrOutput `pulumi:"routeTablePropagationEnabled"`
	// The associating status of the network.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrOutput `pulumi:"transitRouterAttachmentDescription"`
	// The ID of transit router attachment.
	TransitRouterAttachmentId pulumi.StringOutput `pulumi:"transitRouterAttachmentId"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrOutput `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrOutput `pulumi:"transitRouterId"`
	// The ID of the VPC.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
	// The owner id of vpc.
	VpcOwnerId pulumi.StringOutput `pulumi:"vpcOwnerId"`
	// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	ZoneMappings TransitRouterVpcAttachmentZoneMappingArrayOutput `pulumi:"zoneMappings"`
}

// NewTransitRouterVpcAttachment registers a new resource with the given unique name, arguments, and options.
func NewTransitRouterVpcAttachment(ctx *pulumi.Context,
	name string, args *TransitRouterVpcAttachmentArgs, opts ...pulumi.ResourceOption) (*TransitRouterVpcAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	if args.ZoneMappings == nil {
		return nil, errors.New("invalid value for required argument 'ZoneMappings'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitRouterVpcAttachment
	err := ctx.RegisterResource("alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitRouterVpcAttachment gets an existing TransitRouterVpcAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitRouterVpcAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitRouterVpcAttachmentState, opts ...pulumi.ResourceOption) (*TransitRouterVpcAttachment, error) {
	var resource TransitRouterVpcAttachment
	err := ctx.ReadResource("alicloud:cen/transitRouterVpcAttachment:TransitRouterVpcAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitRouterVpcAttachment resources.
type transitRouterVpcAttachmentState struct {
	// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
	AutoPublishRouteEnabled *bool `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId *string `pulumi:"cenId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
	ResourceType *string `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
	//
	// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
	RouteTableAssociationEnabled *bool `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
	//
	// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
	RouteTablePropagationEnabled *bool `pulumi:"routeTablePropagationEnabled"`
	// The associating status of the network.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription *string `pulumi:"transitRouterAttachmentDescription"`
	// The ID of transit router attachment.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName *string `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId *string `pulumi:"transitRouterId"`
	// The ID of the VPC.
	VpcId *string `pulumi:"vpcId"`
	// The owner id of vpc.
	VpcOwnerId *string `pulumi:"vpcOwnerId"`
	// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	ZoneMappings []TransitRouterVpcAttachmentZoneMapping `pulumi:"zoneMappings"`
}

type TransitRouterVpcAttachmentState struct {
	// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
	AutoPublishRouteEnabled pulumi.BoolPtrInput
	// The ID of the CEN.
	CenId pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
	ResourceType pulumi.StringPtrInput
	// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
	//
	// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
	RouteTableAssociationEnabled pulumi.BoolPtrInput
	// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
	//
	// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
	RouteTablePropagationEnabled pulumi.BoolPtrInput
	// The associating status of the network.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrInput
	// The ID of transit router attachment.
	TransitRouterAttachmentId pulumi.StringPtrInput
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrInput
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrInput
	// The ID of the VPC.
	VpcId pulumi.StringPtrInput
	// The owner id of vpc.
	VpcOwnerId pulumi.StringPtrInput
	// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	ZoneMappings TransitRouterVpcAttachmentZoneMappingArrayInput
}

func (TransitRouterVpcAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterVpcAttachmentState)(nil)).Elem()
}

type transitRouterVpcAttachmentArgs struct {
	// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
	AutoPublishRouteEnabled *bool `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId string `pulumi:"cenId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType *string `pulumi:"paymentType"`
	// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
	ResourceType *string `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
	//
	// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
	RouteTableAssociationEnabled *bool `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
	//
	// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
	RouteTablePropagationEnabled *bool `pulumi:"routeTablePropagationEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription *string `pulumi:"transitRouterAttachmentDescription"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName *string `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId *string `pulumi:"transitRouterId"`
	// The ID of the VPC.
	VpcId string `pulumi:"vpcId"`
	// The owner id of vpc.
	VpcOwnerId *string `pulumi:"vpcOwnerId"`
	// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	ZoneMappings []TransitRouterVpcAttachmentZoneMapping `pulumi:"zoneMappings"`
}

// The set of arguments for constructing a TransitRouterVpcAttachment resource.
type TransitRouterVpcAttachmentArgs struct {
	// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
	AutoPublishRouteEnabled pulumi.BoolPtrInput
	// The ID of the CEN.
	CenId pulumi.StringInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The payment type of the resource. Valid values: `PayAsYouGo`.
	PaymentType pulumi.StringPtrInput
	// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
	ResourceType pulumi.StringPtrInput
	// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
	//
	// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
	RouteTableAssociationEnabled pulumi.BoolPtrInput
	// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
	//
	// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
	RouteTablePropagationEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrInput
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrInput
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrInput
	// The ID of the VPC.
	VpcId pulumi.StringInput
	// The owner id of vpc.
	VpcOwnerId pulumi.StringPtrInput
	// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	ZoneMappings TransitRouterVpcAttachmentZoneMappingArrayInput
}

func (TransitRouterVpcAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterVpcAttachmentArgs)(nil)).Elem()
}

type TransitRouterVpcAttachmentInput interface {
	pulumi.Input

	ToTransitRouterVpcAttachmentOutput() TransitRouterVpcAttachmentOutput
	ToTransitRouterVpcAttachmentOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentOutput
}

func (*TransitRouterVpcAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterVpcAttachment)(nil)).Elem()
}

func (i *TransitRouterVpcAttachment) ToTransitRouterVpcAttachmentOutput() TransitRouterVpcAttachmentOutput {
	return i.ToTransitRouterVpcAttachmentOutputWithContext(context.Background())
}

func (i *TransitRouterVpcAttachment) ToTransitRouterVpcAttachmentOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVpcAttachmentOutput)
}

func (i *TransitRouterVpcAttachment) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterVpcAttachment] {
	return pulumix.Output[*TransitRouterVpcAttachment]{
		OutputState: i.ToTransitRouterVpcAttachmentOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterVpcAttachmentArrayInput is an input type that accepts TransitRouterVpcAttachmentArray and TransitRouterVpcAttachmentArrayOutput values.
// You can construct a concrete instance of `TransitRouterVpcAttachmentArrayInput` via:
//
//	TransitRouterVpcAttachmentArray{ TransitRouterVpcAttachmentArgs{...} }
type TransitRouterVpcAttachmentArrayInput interface {
	pulumi.Input

	ToTransitRouterVpcAttachmentArrayOutput() TransitRouterVpcAttachmentArrayOutput
	ToTransitRouterVpcAttachmentArrayOutputWithContext(context.Context) TransitRouterVpcAttachmentArrayOutput
}

type TransitRouterVpcAttachmentArray []TransitRouterVpcAttachmentInput

func (TransitRouterVpcAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterVpcAttachment)(nil)).Elem()
}

func (i TransitRouterVpcAttachmentArray) ToTransitRouterVpcAttachmentArrayOutput() TransitRouterVpcAttachmentArrayOutput {
	return i.ToTransitRouterVpcAttachmentArrayOutputWithContext(context.Background())
}

func (i TransitRouterVpcAttachmentArray) ToTransitRouterVpcAttachmentArrayOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVpcAttachmentArrayOutput)
}

func (i TransitRouterVpcAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterVpcAttachment] {
	return pulumix.Output[[]*TransitRouterVpcAttachment]{
		OutputState: i.ToTransitRouterVpcAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterVpcAttachmentMapInput is an input type that accepts TransitRouterVpcAttachmentMap and TransitRouterVpcAttachmentMapOutput values.
// You can construct a concrete instance of `TransitRouterVpcAttachmentMapInput` via:
//
//	TransitRouterVpcAttachmentMap{ "key": TransitRouterVpcAttachmentArgs{...} }
type TransitRouterVpcAttachmentMapInput interface {
	pulumi.Input

	ToTransitRouterVpcAttachmentMapOutput() TransitRouterVpcAttachmentMapOutput
	ToTransitRouterVpcAttachmentMapOutputWithContext(context.Context) TransitRouterVpcAttachmentMapOutput
}

type TransitRouterVpcAttachmentMap map[string]TransitRouterVpcAttachmentInput

func (TransitRouterVpcAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterVpcAttachment)(nil)).Elem()
}

func (i TransitRouterVpcAttachmentMap) ToTransitRouterVpcAttachmentMapOutput() TransitRouterVpcAttachmentMapOutput {
	return i.ToTransitRouterVpcAttachmentMapOutputWithContext(context.Background())
}

func (i TransitRouterVpcAttachmentMap) ToTransitRouterVpcAttachmentMapOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVpcAttachmentMapOutput)
}

func (i TransitRouterVpcAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterVpcAttachment] {
	return pulumix.Output[map[string]*TransitRouterVpcAttachment]{
		OutputState: i.ToTransitRouterVpcAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type TransitRouterVpcAttachmentOutput struct{ *pulumi.OutputState }

func (TransitRouterVpcAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterVpcAttachment)(nil)).Elem()
}

func (o TransitRouterVpcAttachmentOutput) ToTransitRouterVpcAttachmentOutput() TransitRouterVpcAttachmentOutput {
	return o
}

func (o TransitRouterVpcAttachmentOutput) ToTransitRouterVpcAttachmentOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentOutput {
	return o
}

func (o TransitRouterVpcAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterVpcAttachment] {
	return pulumix.Output[*TransitRouterVpcAttachment]{
		OutputState: o.OutputState,
	}
}

// Whether the transit router is automatically published to the VPC instance. Default value: `false`. Valid values:
func (o TransitRouterVpcAttachmentOutput) AutoPublishRouteEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.BoolOutput { return v.AutoPublishRouteEnabled }).(pulumi.BoolOutput)
}

// The ID of the CEN.
func (o TransitRouterVpcAttachmentOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The dry run.
func (o TransitRouterVpcAttachmentOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The payment type of the resource. Valid values: `PayAsYouGo`.
func (o TransitRouterVpcAttachmentOutput) PaymentType() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.PaymentType }).(pulumi.StringOutput)
}

// The resource type of transit router vpc attachment. Valid value `VPC`. Default value is `VPC`.
func (o TransitRouterVpcAttachmentOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringPtrOutput { return v.ResourceType }).(pulumi.StringPtrOutput)
}

// Whether to enabled route table association. The system default value is `true`. **NOTE:** "Field `routeTableAssociationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTableAssociation` instead, how to use alicloud_cen_transit_router_route_table_association."
//
// Deprecated: Field 'route_table_association_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_association' instead.
func (o TransitRouterVpcAttachmentOutput) RouteTableAssociationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.BoolPtrOutput { return v.RouteTableAssociationEnabled }).(pulumi.BoolPtrOutput)
}

// Whether to enabled route table propagation. The system default value is `true`. **NOTE:** "Field `routeTablePropagationEnabled` has been deprecated from provider version 1.192.0. Please use the resource `cen.TransitRouterRouteTablePropagation` instead, how to use alicloud_cen_transit_router_route_table_propagation."
//
// Deprecated: Field 'route_table_propagation_enabled' has been deprecated from provider version 1.192.0. Please use the resource 'alicloud_cen_transit_router_route_table_propagation' instead.
func (o TransitRouterVpcAttachmentOutput) RouteTablePropagationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.BoolPtrOutput { return v.RouteTablePropagationEnabled }).(pulumi.BoolPtrOutput)
}

// The associating status of the network.
func (o TransitRouterVpcAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o TransitRouterVpcAttachmentOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The description of the transit router vbr attachment.
func (o TransitRouterVpcAttachmentOutput) TransitRouterAttachmentDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringPtrOutput {
		return v.TransitRouterAttachmentDescription
	}).(pulumi.StringPtrOutput)
}

// The ID of transit router attachment.
func (o TransitRouterVpcAttachmentOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.TransitRouterAttachmentId }).(pulumi.StringOutput)
}

// The name of the transit router vbr attachment.
func (o TransitRouterVpcAttachmentOutput) TransitRouterAttachmentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringPtrOutput { return v.TransitRouterAttachmentName }).(pulumi.StringPtrOutput)
}

// The ID of the transit router.
func (o TransitRouterVpcAttachmentOutput) TransitRouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringPtrOutput { return v.TransitRouterId }).(pulumi.StringPtrOutput)
}

// The ID of the VPC.
func (o TransitRouterVpcAttachmentOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

// The owner id of vpc.
func (o TransitRouterVpcAttachmentOutput) VpcOwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) pulumi.StringOutput { return v.VpcOwnerId }).(pulumi.StringOutput)
}

// The list of zone mapping of the VPC. **NOTE:** From version 1.184.0, `zoneMappings` can be modified. See `zoneMappings` below.
// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
func (o TransitRouterVpcAttachmentOutput) ZoneMappings() TransitRouterVpcAttachmentZoneMappingArrayOutput {
	return o.ApplyT(func(v *TransitRouterVpcAttachment) TransitRouterVpcAttachmentZoneMappingArrayOutput {
		return v.ZoneMappings
	}).(TransitRouterVpcAttachmentZoneMappingArrayOutput)
}

type TransitRouterVpcAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterVpcAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterVpcAttachment)(nil)).Elem()
}

func (o TransitRouterVpcAttachmentArrayOutput) ToTransitRouterVpcAttachmentArrayOutput() TransitRouterVpcAttachmentArrayOutput {
	return o
}

func (o TransitRouterVpcAttachmentArrayOutput) ToTransitRouterVpcAttachmentArrayOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentArrayOutput {
	return o
}

func (o TransitRouterVpcAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterVpcAttachment] {
	return pulumix.Output[[]*TransitRouterVpcAttachment]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterVpcAttachmentArrayOutput) Index(i pulumi.IntInput) TransitRouterVpcAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitRouterVpcAttachment {
		return vs[0].([]*TransitRouterVpcAttachment)[vs[1].(int)]
	}).(TransitRouterVpcAttachmentOutput)
}

type TransitRouterVpcAttachmentMapOutput struct{ *pulumi.OutputState }

func (TransitRouterVpcAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterVpcAttachment)(nil)).Elem()
}

func (o TransitRouterVpcAttachmentMapOutput) ToTransitRouterVpcAttachmentMapOutput() TransitRouterVpcAttachmentMapOutput {
	return o
}

func (o TransitRouterVpcAttachmentMapOutput) ToTransitRouterVpcAttachmentMapOutputWithContext(ctx context.Context) TransitRouterVpcAttachmentMapOutput {
	return o
}

func (o TransitRouterVpcAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterVpcAttachment] {
	return pulumix.Output[map[string]*TransitRouterVpcAttachment]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterVpcAttachmentMapOutput) MapIndex(k pulumi.StringInput) TransitRouterVpcAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitRouterVpcAttachment {
		return vs[0].(map[string]*TransitRouterVpcAttachment)[vs[1].(string)]
	}).(TransitRouterVpcAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVpcAttachmentInput)(nil)).Elem(), &TransitRouterVpcAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVpcAttachmentArrayInput)(nil)).Elem(), TransitRouterVpcAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVpcAttachmentMapInput)(nil)).Elem(), TransitRouterVpcAttachmentMap{})
	pulumi.RegisterOutputType(TransitRouterVpcAttachmentOutput{})
	pulumi.RegisterOutputType(TransitRouterVpcAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterVpcAttachmentMapOutput{})
}
