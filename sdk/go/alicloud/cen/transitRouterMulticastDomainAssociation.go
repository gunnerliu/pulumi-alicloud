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

// Provides a Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association resource.
//
// For information about Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association and how to use it, see [What is Transit Router Multicast Domain Association](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-associatetransitroutermulticastdomain).
//
// > **NOTE:** Available since v1.195.0.
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
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "tf_example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			_default, err := cen.GetTransitRouterAvailableResources(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			zone := _default.Resources[0].MasterZones[1]
//			exampleNetwork, err := vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSwitch, err := vpc.NewSwitch(ctx, "exampleSwitch", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("192.168.1.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      *pulumi.String(zone),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := cen.NewInstance(ctx, "exampleInstance", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouter, err := cen.NewTransitRouter(ctx, "exampleTransitRouter", &cen.TransitRouterArgs{
//				TransitRouterName: pulumi.String(name),
//				CenId:             exampleInstance.ID(),
//				SupportMulticast:  pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouterMulticastDomain, err := cen.NewTransitRouterMulticastDomain(ctx, "exampleTransitRouterMulticastDomain", &cen.TransitRouterMulticastDomainArgs{
//				TransitRouterId:                  exampleTransitRouter.TransitRouterId,
//				TransitRouterMulticastDomainName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouterVpcAttachment, err := cen.NewTransitRouterVpcAttachment(ctx, "exampleTransitRouterVpcAttachment", &cen.TransitRouterVpcAttachmentArgs{
//				CenId:           exampleTransitRouter.CenId,
//				TransitRouterId: exampleTransitRouterMulticastDomain.TransitRouterId,
//				VpcId:           exampleNetwork.ID(),
//				ZoneMappings: cen.TransitRouterVpcAttachmentZoneMappingArray{
//					&cen.TransitRouterVpcAttachmentZoneMappingArgs{
//						ZoneId:    *pulumi.String(zone),
//						VswitchId: exampleSwitch.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewTransitRouterMulticastDomainAssociation(ctx, "exampleTransitRouterMulticastDomainAssociation", &cen.TransitRouterMulticastDomainAssociationArgs{
//				TransitRouterMulticastDomainId: exampleTransitRouterMulticastDomain.ID(),
//				TransitRouterAttachmentId:      exampleTransitRouterVpcAttachment.TransitRouterAttachmentId,
//				VswitchId:                      exampleSwitch.ID(),
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
// Cloud Enterprise Network (CEN) Transit Router Multicast Domain Association can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation example <transit_router_multicast_domain_id>:<transit_router_attachment_id>:<vswitch_id>
//
// ```
type TransitRouterMulticastDomainAssociation struct {
	pulumi.CustomResourceState

	// The status of the Transit Router Multicast Domain Association.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the VPC connection.
	TransitRouterAttachmentId pulumi.StringOutput `pulumi:"transitRouterAttachmentId"`
	// The ID of the multicast domain.
	TransitRouterMulticastDomainId pulumi.StringOutput `pulumi:"transitRouterMulticastDomainId"`
	// The ID of the vSwitch.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewTransitRouterMulticastDomainAssociation registers a new resource with the given unique name, arguments, and options.
func NewTransitRouterMulticastDomainAssociation(ctx *pulumi.Context,
	name string, args *TransitRouterMulticastDomainAssociationArgs, opts ...pulumi.ResourceOption) (*TransitRouterMulticastDomainAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TransitRouterAttachmentId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterAttachmentId'")
	}
	if args.TransitRouterMulticastDomainId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterMulticastDomainId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitRouterMulticastDomainAssociation
	err := ctx.RegisterResource("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitRouterMulticastDomainAssociation gets an existing TransitRouterMulticastDomainAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitRouterMulticastDomainAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitRouterMulticastDomainAssociationState, opts ...pulumi.ResourceOption) (*TransitRouterMulticastDomainAssociation, error) {
	var resource TransitRouterMulticastDomainAssociation
	err := ctx.ReadResource("alicloud:cen/transitRouterMulticastDomainAssociation:TransitRouterMulticastDomainAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitRouterMulticastDomainAssociation resources.
type transitRouterMulticastDomainAssociationState struct {
	// The status of the Transit Router Multicast Domain Association.
	Status *string `pulumi:"status"`
	// The ID of the VPC connection.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The ID of the multicast domain.
	TransitRouterMulticastDomainId *string `pulumi:"transitRouterMulticastDomainId"`
	// The ID of the vSwitch.
	VswitchId *string `pulumi:"vswitchId"`
}

type TransitRouterMulticastDomainAssociationState struct {
	// The status of the Transit Router Multicast Domain Association.
	Status pulumi.StringPtrInput
	// The ID of the VPC connection.
	TransitRouterAttachmentId pulumi.StringPtrInput
	// The ID of the multicast domain.
	TransitRouterMulticastDomainId pulumi.StringPtrInput
	// The ID of the vSwitch.
	VswitchId pulumi.StringPtrInput
}

func (TransitRouterMulticastDomainAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterMulticastDomainAssociationState)(nil)).Elem()
}

type transitRouterMulticastDomainAssociationArgs struct {
	// The ID of the VPC connection.
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
	// The ID of the multicast domain.
	TransitRouterMulticastDomainId string `pulumi:"transitRouterMulticastDomainId"`
	// The ID of the vSwitch.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a TransitRouterMulticastDomainAssociation resource.
type TransitRouterMulticastDomainAssociationArgs struct {
	// The ID of the VPC connection.
	TransitRouterAttachmentId pulumi.StringInput
	// The ID of the multicast domain.
	TransitRouterMulticastDomainId pulumi.StringInput
	// The ID of the vSwitch.
	VswitchId pulumi.StringInput
}

func (TransitRouterMulticastDomainAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterMulticastDomainAssociationArgs)(nil)).Elem()
}

type TransitRouterMulticastDomainAssociationInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainAssociationOutput() TransitRouterMulticastDomainAssociationOutput
	ToTransitRouterMulticastDomainAssociationOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationOutput
}

func (*TransitRouterMulticastDomainAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (i *TransitRouterMulticastDomainAssociation) ToTransitRouterMulticastDomainAssociationOutput() TransitRouterMulticastDomainAssociationOutput {
	return i.ToTransitRouterMulticastDomainAssociationOutputWithContext(context.Background())
}

func (i *TransitRouterMulticastDomainAssociation) ToTransitRouterMulticastDomainAssociationOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainAssociationOutput)
}

func (i *TransitRouterMulticastDomainAssociation) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[*TransitRouterMulticastDomainAssociation]{
		OutputState: i.ToTransitRouterMulticastDomainAssociationOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterMulticastDomainAssociationArrayInput is an input type that accepts TransitRouterMulticastDomainAssociationArray and TransitRouterMulticastDomainAssociationArrayOutput values.
// You can construct a concrete instance of `TransitRouterMulticastDomainAssociationArrayInput` via:
//
//	TransitRouterMulticastDomainAssociationArray{ TransitRouterMulticastDomainAssociationArgs{...} }
type TransitRouterMulticastDomainAssociationArrayInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainAssociationArrayOutput() TransitRouterMulticastDomainAssociationArrayOutput
	ToTransitRouterMulticastDomainAssociationArrayOutputWithContext(context.Context) TransitRouterMulticastDomainAssociationArrayOutput
}

type TransitRouterMulticastDomainAssociationArray []TransitRouterMulticastDomainAssociationInput

func (TransitRouterMulticastDomainAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (i TransitRouterMulticastDomainAssociationArray) ToTransitRouterMulticastDomainAssociationArrayOutput() TransitRouterMulticastDomainAssociationArrayOutput {
	return i.ToTransitRouterMulticastDomainAssociationArrayOutputWithContext(context.Background())
}

func (i TransitRouterMulticastDomainAssociationArray) ToTransitRouterMulticastDomainAssociationArrayOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainAssociationArrayOutput)
}

func (i TransitRouterMulticastDomainAssociationArray) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[[]*TransitRouterMulticastDomainAssociation]{
		OutputState: i.ToTransitRouterMulticastDomainAssociationArrayOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterMulticastDomainAssociationMapInput is an input type that accepts TransitRouterMulticastDomainAssociationMap and TransitRouterMulticastDomainAssociationMapOutput values.
// You can construct a concrete instance of `TransitRouterMulticastDomainAssociationMapInput` via:
//
//	TransitRouterMulticastDomainAssociationMap{ "key": TransitRouterMulticastDomainAssociationArgs{...} }
type TransitRouterMulticastDomainAssociationMapInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainAssociationMapOutput() TransitRouterMulticastDomainAssociationMapOutput
	ToTransitRouterMulticastDomainAssociationMapOutputWithContext(context.Context) TransitRouterMulticastDomainAssociationMapOutput
}

type TransitRouterMulticastDomainAssociationMap map[string]TransitRouterMulticastDomainAssociationInput

func (TransitRouterMulticastDomainAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (i TransitRouterMulticastDomainAssociationMap) ToTransitRouterMulticastDomainAssociationMapOutput() TransitRouterMulticastDomainAssociationMapOutput {
	return i.ToTransitRouterMulticastDomainAssociationMapOutputWithContext(context.Background())
}

func (i TransitRouterMulticastDomainAssociationMap) ToTransitRouterMulticastDomainAssociationMapOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainAssociationMapOutput)
}

func (i TransitRouterMulticastDomainAssociationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[map[string]*TransitRouterMulticastDomainAssociation]{
		OutputState: i.ToTransitRouterMulticastDomainAssociationMapOutputWithContext(ctx).OutputState,
	}
}

type TransitRouterMulticastDomainAssociationOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (o TransitRouterMulticastDomainAssociationOutput) ToTransitRouterMulticastDomainAssociationOutput() TransitRouterMulticastDomainAssociationOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationOutput) ToTransitRouterMulticastDomainAssociationOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationOutput) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[*TransitRouterMulticastDomainAssociation]{
		OutputState: o.OutputState,
	}
}

// The status of the Transit Router Multicast Domain Association.
func (o TransitRouterMulticastDomainAssociationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainAssociation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the VPC connection.
func (o TransitRouterMulticastDomainAssociationOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainAssociation) pulumi.StringOutput {
		return v.TransitRouterAttachmentId
	}).(pulumi.StringOutput)
}

// The ID of the multicast domain.
func (o TransitRouterMulticastDomainAssociationOutput) TransitRouterMulticastDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainAssociation) pulumi.StringOutput {
		return v.TransitRouterMulticastDomainId
	}).(pulumi.StringOutput)
}

// The ID of the vSwitch.
func (o TransitRouterMulticastDomainAssociationOutput) VswitchId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainAssociation) pulumi.StringOutput { return v.VswitchId }).(pulumi.StringOutput)
}

type TransitRouterMulticastDomainAssociationArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (o TransitRouterMulticastDomainAssociationArrayOutput) ToTransitRouterMulticastDomainAssociationArrayOutput() TransitRouterMulticastDomainAssociationArrayOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationArrayOutput) ToTransitRouterMulticastDomainAssociationArrayOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationArrayOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[[]*TransitRouterMulticastDomainAssociation]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterMulticastDomainAssociationArrayOutput) Index(i pulumi.IntInput) TransitRouterMulticastDomainAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitRouterMulticastDomainAssociation {
		return vs[0].([]*TransitRouterMulticastDomainAssociation)[vs[1].(int)]
	}).(TransitRouterMulticastDomainAssociationOutput)
}

type TransitRouterMulticastDomainAssociationMapOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterMulticastDomainAssociation)(nil)).Elem()
}

func (o TransitRouterMulticastDomainAssociationMapOutput) ToTransitRouterMulticastDomainAssociationMapOutput() TransitRouterMulticastDomainAssociationMapOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationMapOutput) ToTransitRouterMulticastDomainAssociationMapOutputWithContext(ctx context.Context) TransitRouterMulticastDomainAssociationMapOutput {
	return o
}

func (o TransitRouterMulticastDomainAssociationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterMulticastDomainAssociation] {
	return pulumix.Output[map[string]*TransitRouterMulticastDomainAssociation]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterMulticastDomainAssociationMapOutput) MapIndex(k pulumi.StringInput) TransitRouterMulticastDomainAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitRouterMulticastDomainAssociation {
		return vs[0].(map[string]*TransitRouterMulticastDomainAssociation)[vs[1].(string)]
	}).(TransitRouterMulticastDomainAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainAssociationInput)(nil)).Elem(), &TransitRouterMulticastDomainAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainAssociationArrayInput)(nil)).Elem(), TransitRouterMulticastDomainAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainAssociationMapInput)(nil)).Elem(), TransitRouterMulticastDomainAssociationMap{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainAssociationOutput{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainAssociationArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainAssociationMapOutput{})
}
