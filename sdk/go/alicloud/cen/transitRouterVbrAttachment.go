// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CEN transit router VBR attachment resource that associate the VBR with the CEN instance.[What is Cen Transit Router VBR Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createtransitroutervbrattachment)
//
// > **NOTE:** Available since v1.126.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cen"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/expressconnect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultInstance, err := cen.NewInstance(ctx, "defaultInstance", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String(name),
//				ProtectionLevel: pulumi.String("REDUCED"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultTransitRouter, err := cen.NewTransitRouter(ctx, "defaultTransitRouter", &cen.TransitRouterArgs{
//				CenId: defaultInstance.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			nameRegex, err := expressconnect.GetPhysicalConnections(ctx, &expressconnect.GetPhysicalConnectionsArgs{
//				NameRegex: pulumi.StringRef("^preserved-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultVirtualBorderRouter, err := expressconnect.NewVirtualBorderRouter(ctx, "defaultVirtualBorderRouter", &expressconnect.VirtualBorderRouterArgs{
//				LocalGatewayIp:          pulumi.String("10.0.0.1"),
//				PeerGatewayIp:           pulumi.String("10.0.0.2"),
//				PeeringSubnetMask:       pulumi.String("255.255.255.252"),
//				PhysicalConnectionId:    *pulumi.String(nameRegex.Connections[0].Id),
//				VirtualBorderRouterName: pulumi.String(name),
//				VlanId:                  pulumi.Int(2420),
//				MinRxInterval:           pulumi.Int(1000),
//				MinTxInterval:           pulumi.Int(1000),
//				DetectMultiplier:        pulumi.Int(10),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewTransitRouterVbrAttachment(ctx, "defaultTransitRouterVbrAttachment", &cen.TransitRouterVbrAttachmentArgs{
//				TransitRouterId:                    defaultTransitRouter.TransitRouterId,
//				TransitRouterAttachmentName:        pulumi.String("example"),
//				TransitRouterAttachmentDescription: pulumi.String("example"),
//				VbrId:                              defaultVirtualBorderRouter.ID(),
//				CenId:                              defaultInstance.ID(),
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
// CEN transit router VBR attachment can be imported using the id, e.g.
//
// ```sh
// $ pulumi import alicloud:cen/transitRouterVbrAttachment:TransitRouterVbrAttachment example tr-********:tr-attach-********
// ```
type TransitRouterVbrAttachment struct {
	pulumi.CustomResourceState

	// Auto publish route enabled.Default value is `false`.
	AutoPublishRouteEnabled pulumi.BoolOutput `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The dry run.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
	//
	// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
	ResourceType pulumi.StringPtrOutput `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`.
	RouteTableAssociationEnabled pulumi.BoolPtrOutput `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`.
	RouteTablePropagationEnabled pulumi.BoolPtrOutput `pulumi:"routeTablePropagationEnabled"`
	// The associating status of the network.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrOutput `pulumi:"transitRouterAttachmentDescription"`
	// The id of the transit router vbr attachment.
	TransitRouterAttachmentId pulumi.StringOutput `pulumi:"transitRouterAttachmentId"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrOutput `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrOutput `pulumi:"transitRouterId"`
	// The ID of the VBR.
	VbrId pulumi.StringOutput `pulumi:"vbrId"`
	// The owner id of the transit router vbr attachment.
	VbrOwnerId pulumi.StringOutput `pulumi:"vbrOwnerId"`
}

// NewTransitRouterVbrAttachment registers a new resource with the given unique name, arguments, and options.
func NewTransitRouterVbrAttachment(ctx *pulumi.Context,
	name string, args *TransitRouterVbrAttachmentArgs, opts ...pulumi.ResourceOption) (*TransitRouterVbrAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.VbrId == nil {
		return nil, errors.New("invalid value for required argument 'VbrId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitRouterVbrAttachment
	err := ctx.RegisterResource("alicloud:cen/transitRouterVbrAttachment:TransitRouterVbrAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitRouterVbrAttachment gets an existing TransitRouterVbrAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitRouterVbrAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitRouterVbrAttachmentState, opts ...pulumi.ResourceOption) (*TransitRouterVbrAttachment, error) {
	var resource TransitRouterVbrAttachment
	err := ctx.ReadResource("alicloud:cen/transitRouterVbrAttachment:TransitRouterVbrAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitRouterVbrAttachment resources.
type transitRouterVbrAttachmentState struct {
	// Auto publish route enabled.Default value is `false`.
	AutoPublishRouteEnabled *bool `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId *string `pulumi:"cenId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
	//
	// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
	ResourceType *string `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`.
	RouteTableAssociationEnabled *bool `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`.
	RouteTablePropagationEnabled *bool `pulumi:"routeTablePropagationEnabled"`
	// The associating status of the network.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription *string `pulumi:"transitRouterAttachmentDescription"`
	// The id of the transit router vbr attachment.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName *string `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId *string `pulumi:"transitRouterId"`
	// The ID of the VBR.
	VbrId *string `pulumi:"vbrId"`
	// The owner id of the transit router vbr attachment.
	VbrOwnerId *string `pulumi:"vbrOwnerId"`
}

type TransitRouterVbrAttachmentState struct {
	// Auto publish route enabled.Default value is `false`.
	AutoPublishRouteEnabled pulumi.BoolPtrInput
	// The ID of the CEN.
	CenId pulumi.StringPtrInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
	//
	// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
	ResourceType pulumi.StringPtrInput
	// Whether to enabled route table association. The system default value is `true`.
	RouteTableAssociationEnabled pulumi.BoolPtrInput
	// Whether to enabled route table propagation. The system default value is `true`.
	RouteTablePropagationEnabled pulumi.BoolPtrInput
	// The associating status of the network.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrInput
	// The id of the transit router vbr attachment.
	TransitRouterAttachmentId pulumi.StringPtrInput
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrInput
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrInput
	// The ID of the VBR.
	VbrId pulumi.StringPtrInput
	// The owner id of the transit router vbr attachment.
	VbrOwnerId pulumi.StringPtrInput
}

func (TransitRouterVbrAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterVbrAttachmentState)(nil)).Elem()
}

type transitRouterVbrAttachmentArgs struct {
	// Auto publish route enabled.Default value is `false`.
	AutoPublishRouteEnabled *bool `pulumi:"autoPublishRouteEnabled"`
	// The ID of the CEN.
	CenId string `pulumi:"cenId"`
	// The dry run.
	DryRun *bool `pulumi:"dryRun"`
	// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
	//
	// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
	ResourceType *string `pulumi:"resourceType"`
	// Whether to enabled route table association. The system default value is `true`.
	RouteTableAssociationEnabled *bool `pulumi:"routeTableAssociationEnabled"`
	// Whether to enabled route table propagation. The system default value is `true`.
	RouteTablePropagationEnabled *bool `pulumi:"routeTablePropagationEnabled"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription *string `pulumi:"transitRouterAttachmentDescription"`
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName *string `pulumi:"transitRouterAttachmentName"`
	// The ID of the transit router.
	TransitRouterId *string `pulumi:"transitRouterId"`
	// The ID of the VBR.
	VbrId string `pulumi:"vbrId"`
	// The owner id of the transit router vbr attachment.
	VbrOwnerId *string `pulumi:"vbrOwnerId"`
}

// The set of arguments for constructing a TransitRouterVbrAttachment resource.
type TransitRouterVbrAttachmentArgs struct {
	// Auto publish route enabled.Default value is `false`.
	AutoPublishRouteEnabled pulumi.BoolPtrInput
	// The ID of the CEN.
	CenId pulumi.StringInput
	// The dry run.
	DryRun pulumi.BoolPtrInput
	// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
	//
	// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
	ResourceType pulumi.StringPtrInput
	// Whether to enabled route table association. The system default value is `true`.
	RouteTableAssociationEnabled pulumi.BoolPtrInput
	// Whether to enabled route table propagation. The system default value is `true`.
	RouteTablePropagationEnabled pulumi.BoolPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The description of the transit router vbr attachment.
	TransitRouterAttachmentDescription pulumi.StringPtrInput
	// The name of the transit router vbr attachment.
	TransitRouterAttachmentName pulumi.StringPtrInput
	// The ID of the transit router.
	TransitRouterId pulumi.StringPtrInput
	// The ID of the VBR.
	VbrId pulumi.StringInput
	// The owner id of the transit router vbr attachment.
	VbrOwnerId pulumi.StringPtrInput
}

func (TransitRouterVbrAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterVbrAttachmentArgs)(nil)).Elem()
}

type TransitRouterVbrAttachmentInput interface {
	pulumi.Input

	ToTransitRouterVbrAttachmentOutput() TransitRouterVbrAttachmentOutput
	ToTransitRouterVbrAttachmentOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentOutput
}

func (*TransitRouterVbrAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterVbrAttachment)(nil)).Elem()
}

func (i *TransitRouterVbrAttachment) ToTransitRouterVbrAttachmentOutput() TransitRouterVbrAttachmentOutput {
	return i.ToTransitRouterVbrAttachmentOutputWithContext(context.Background())
}

func (i *TransitRouterVbrAttachment) ToTransitRouterVbrAttachmentOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVbrAttachmentOutput)
}

// TransitRouterVbrAttachmentArrayInput is an input type that accepts TransitRouterVbrAttachmentArray and TransitRouterVbrAttachmentArrayOutput values.
// You can construct a concrete instance of `TransitRouterVbrAttachmentArrayInput` via:
//
//	TransitRouterVbrAttachmentArray{ TransitRouterVbrAttachmentArgs{...} }
type TransitRouterVbrAttachmentArrayInput interface {
	pulumi.Input

	ToTransitRouterVbrAttachmentArrayOutput() TransitRouterVbrAttachmentArrayOutput
	ToTransitRouterVbrAttachmentArrayOutputWithContext(context.Context) TransitRouterVbrAttachmentArrayOutput
}

type TransitRouterVbrAttachmentArray []TransitRouterVbrAttachmentInput

func (TransitRouterVbrAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterVbrAttachment)(nil)).Elem()
}

func (i TransitRouterVbrAttachmentArray) ToTransitRouterVbrAttachmentArrayOutput() TransitRouterVbrAttachmentArrayOutput {
	return i.ToTransitRouterVbrAttachmentArrayOutputWithContext(context.Background())
}

func (i TransitRouterVbrAttachmentArray) ToTransitRouterVbrAttachmentArrayOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVbrAttachmentArrayOutput)
}

// TransitRouterVbrAttachmentMapInput is an input type that accepts TransitRouterVbrAttachmentMap and TransitRouterVbrAttachmentMapOutput values.
// You can construct a concrete instance of `TransitRouterVbrAttachmentMapInput` via:
//
//	TransitRouterVbrAttachmentMap{ "key": TransitRouterVbrAttachmentArgs{...} }
type TransitRouterVbrAttachmentMapInput interface {
	pulumi.Input

	ToTransitRouterVbrAttachmentMapOutput() TransitRouterVbrAttachmentMapOutput
	ToTransitRouterVbrAttachmentMapOutputWithContext(context.Context) TransitRouterVbrAttachmentMapOutput
}

type TransitRouterVbrAttachmentMap map[string]TransitRouterVbrAttachmentInput

func (TransitRouterVbrAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterVbrAttachment)(nil)).Elem()
}

func (i TransitRouterVbrAttachmentMap) ToTransitRouterVbrAttachmentMapOutput() TransitRouterVbrAttachmentMapOutput {
	return i.ToTransitRouterVbrAttachmentMapOutputWithContext(context.Background())
}

func (i TransitRouterVbrAttachmentMap) ToTransitRouterVbrAttachmentMapOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterVbrAttachmentMapOutput)
}

type TransitRouterVbrAttachmentOutput struct{ *pulumi.OutputState }

func (TransitRouterVbrAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterVbrAttachment)(nil)).Elem()
}

func (o TransitRouterVbrAttachmentOutput) ToTransitRouterVbrAttachmentOutput() TransitRouterVbrAttachmentOutput {
	return o
}

func (o TransitRouterVbrAttachmentOutput) ToTransitRouterVbrAttachmentOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentOutput {
	return o
}

// Auto publish route enabled.Default value is `false`.
func (o TransitRouterVbrAttachmentOutput) AutoPublishRouteEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.BoolOutput { return v.AutoPublishRouteEnabled }).(pulumi.BoolOutput)
}

// The ID of the CEN.
func (o TransitRouterVbrAttachmentOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The dry run.
func (o TransitRouterVbrAttachmentOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The resource type of the transit router vbr attachment.  Valid values: `VPC`, `CCN`, `VBR`, `TR`.
//
// ->**NOTE:** Ensure that the vbr is not used in Express Connect.
func (o TransitRouterVbrAttachmentOutput) ResourceType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringPtrOutput { return v.ResourceType }).(pulumi.StringPtrOutput)
}

// Whether to enabled route table association. The system default value is `true`.
func (o TransitRouterVbrAttachmentOutput) RouteTableAssociationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.BoolPtrOutput { return v.RouteTableAssociationEnabled }).(pulumi.BoolPtrOutput)
}

// Whether to enabled route table propagation. The system default value is `true`.
func (o TransitRouterVbrAttachmentOutput) RouteTablePropagationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.BoolPtrOutput { return v.RouteTablePropagationEnabled }).(pulumi.BoolPtrOutput)
}

// The associating status of the network.
func (o TransitRouterVbrAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the resource.
func (o TransitRouterVbrAttachmentOutput) Tags() pulumi.MapOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.MapOutput { return v.Tags }).(pulumi.MapOutput)
}

// The description of the transit router vbr attachment.
func (o TransitRouterVbrAttachmentOutput) TransitRouterAttachmentDescription() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringPtrOutput {
		return v.TransitRouterAttachmentDescription
	}).(pulumi.StringPtrOutput)
}

// The id of the transit router vbr attachment.
func (o TransitRouterVbrAttachmentOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringOutput { return v.TransitRouterAttachmentId }).(pulumi.StringOutput)
}

// The name of the transit router vbr attachment.
func (o TransitRouterVbrAttachmentOutput) TransitRouterAttachmentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringPtrOutput { return v.TransitRouterAttachmentName }).(pulumi.StringPtrOutput)
}

// The ID of the transit router.
func (o TransitRouterVbrAttachmentOutput) TransitRouterId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringPtrOutput { return v.TransitRouterId }).(pulumi.StringPtrOutput)
}

// The ID of the VBR.
func (o TransitRouterVbrAttachmentOutput) VbrId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringOutput { return v.VbrId }).(pulumi.StringOutput)
}

// The owner id of the transit router vbr attachment.
func (o TransitRouterVbrAttachmentOutput) VbrOwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterVbrAttachment) pulumi.StringOutput { return v.VbrOwnerId }).(pulumi.StringOutput)
}

type TransitRouterVbrAttachmentArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterVbrAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterVbrAttachment)(nil)).Elem()
}

func (o TransitRouterVbrAttachmentArrayOutput) ToTransitRouterVbrAttachmentArrayOutput() TransitRouterVbrAttachmentArrayOutput {
	return o
}

func (o TransitRouterVbrAttachmentArrayOutput) ToTransitRouterVbrAttachmentArrayOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentArrayOutput {
	return o
}

func (o TransitRouterVbrAttachmentArrayOutput) Index(i pulumi.IntInput) TransitRouterVbrAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitRouterVbrAttachment {
		return vs[0].([]*TransitRouterVbrAttachment)[vs[1].(int)]
	}).(TransitRouterVbrAttachmentOutput)
}

type TransitRouterVbrAttachmentMapOutput struct{ *pulumi.OutputState }

func (TransitRouterVbrAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterVbrAttachment)(nil)).Elem()
}

func (o TransitRouterVbrAttachmentMapOutput) ToTransitRouterVbrAttachmentMapOutput() TransitRouterVbrAttachmentMapOutput {
	return o
}

func (o TransitRouterVbrAttachmentMapOutput) ToTransitRouterVbrAttachmentMapOutputWithContext(ctx context.Context) TransitRouterVbrAttachmentMapOutput {
	return o
}

func (o TransitRouterVbrAttachmentMapOutput) MapIndex(k pulumi.StringInput) TransitRouterVbrAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitRouterVbrAttachment {
		return vs[0].(map[string]*TransitRouterVbrAttachment)[vs[1].(string)]
	}).(TransitRouterVbrAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVbrAttachmentInput)(nil)).Elem(), &TransitRouterVbrAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVbrAttachmentArrayInput)(nil)).Elem(), TransitRouterVbrAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterVbrAttachmentMapInput)(nil)).Elem(), TransitRouterVbrAttachmentMap{})
	pulumi.RegisterOutputType(TransitRouterVbrAttachmentOutput{})
	pulumi.RegisterOutputType(TransitRouterVbrAttachmentArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterVbrAttachmentMapOutput{})
}
