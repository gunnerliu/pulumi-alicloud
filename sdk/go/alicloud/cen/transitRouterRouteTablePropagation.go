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

// Provides a CEN transit router route table propagation resource.[What is Cen Transit Router Route Table Propagation](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-doc-cbn-2017-09-12-api-doc-enabletransitrouterroutetablepropagation)
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
//			masterZone := _default.Resources[0].MasterZones[0]
//			slaveZone := _default.Resources[0].SlaveZones[1]
//			exampleNetwork, err := vpc.NewNetwork(ctx, "exampleNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleMaster, err := vpc.NewSwitch(ctx, "exampleMaster", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("192.168.1.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      *pulumi.String(masterZone),
//			})
//			if err != nil {
//				return err
//			}
//			exampleSlave, err := vpc.NewSwitch(ctx, "exampleSlave", &vpc.SwitchArgs{
//				VswitchName: pulumi.String(name),
//				CidrBlock:   pulumi.String("192.168.2.0/24"),
//				VpcId:       exampleNetwork.ID(),
//				ZoneId:      *pulumi.String(slaveZone),
//			})
//			if err != nil {
//				return err
//			}
//			exampleInstance, err := cen.NewInstance(ctx, "exampleInstance", &cen.InstanceArgs{
//				CenInstanceName: pulumi.String(name),
//				ProtectionLevel: pulumi.String("REDUCED"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouter, err := cen.NewTransitRouter(ctx, "exampleTransitRouter", &cen.TransitRouterArgs{
//				TransitRouterName: pulumi.String(name),
//				CenId:             exampleInstance.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouterVpcAttachment, err := cen.NewTransitRouterVpcAttachment(ctx, "exampleTransitRouterVpcAttachment", &cen.TransitRouterVpcAttachmentArgs{
//				CenId:           exampleInstance.ID(),
//				TransitRouterId: exampleTransitRouter.TransitRouterId,
//				VpcId:           exampleNetwork.ID(),
//				ZoneMappings: cen.TransitRouterVpcAttachmentZoneMappingArray{
//					&cen.TransitRouterVpcAttachmentZoneMappingArgs{
//						ZoneId:    *pulumi.String(masterZone),
//						VswitchId: exampleMaster.ID(),
//					},
//					&cen.TransitRouterVpcAttachmentZoneMappingArgs{
//						ZoneId:    *pulumi.String(slaveZone),
//						VswitchId: exampleSlave.ID(),
//					},
//				},
//				TransitRouterAttachmentName:        pulumi.String(name),
//				TransitRouterAttachmentDescription: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTransitRouterRouteTable, err := cen.NewTransitRouterRouteTable(ctx, "exampleTransitRouterRouteTable", &cen.TransitRouterRouteTableArgs{
//				TransitRouterId: exampleTransitRouter.TransitRouterId,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cen.NewTransitRouterRouteTablePropagation(ctx, "exampleTransitRouterRouteTablePropagation", &cen.TransitRouterRouteTablePropagationArgs{
//				TransitRouterRouteTableId: exampleTransitRouterRouteTable.TransitRouterRouteTableId,
//				TransitRouterAttachmentId: exampleTransitRouterVpcAttachment.TransitRouterAttachmentId,
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
// CEN transit router route table propagation can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation default tr-********:tr-attach-********
//
// ```
type TransitRouterRouteTablePropagation struct {
	pulumi.CustomResourceState

	// The dry run.
	//
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// The associating status of the network.
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID the transit router attachment.
	TransitRouterAttachmentId pulumi.StringOutput `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router route table.
	TransitRouterRouteTableId pulumi.StringOutput `pulumi:"transitRouterRouteTableId"`
}

// NewTransitRouterRouteTablePropagation registers a new resource with the given unique name, arguments, and options.
func NewTransitRouterRouteTablePropagation(ctx *pulumi.Context,
	name string, args *TransitRouterRouteTablePropagationArgs, opts ...pulumi.ResourceOption) (*TransitRouterRouteTablePropagation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.TransitRouterAttachmentId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterAttachmentId'")
	}
	if args.TransitRouterRouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterRouteTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitRouterRouteTablePropagation
	err := ctx.RegisterResource("alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitRouterRouteTablePropagation gets an existing TransitRouterRouteTablePropagation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitRouterRouteTablePropagation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitRouterRouteTablePropagationState, opts ...pulumi.ResourceOption) (*TransitRouterRouteTablePropagation, error) {
	var resource TransitRouterRouteTablePropagation
	err := ctx.ReadResource("alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitRouterRouteTablePropagation resources.
type transitRouterRouteTablePropagationState struct {
	// The dry run.
	//
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	DryRun *bool `pulumi:"dryRun"`
	// The associating status of the network.
	Status *string `pulumi:"status"`
	// The ID the transit router attachment.
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router route table.
	TransitRouterRouteTableId *string `pulumi:"transitRouterRouteTableId"`
}

type TransitRouterRouteTablePropagationState struct {
	// The dry run.
	//
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	DryRun pulumi.BoolPtrInput
	// The associating status of the network.
	Status pulumi.StringPtrInput
	// The ID the transit router attachment.
	TransitRouterAttachmentId pulumi.StringPtrInput
	// The ID of the transit router route table.
	TransitRouterRouteTableId pulumi.StringPtrInput
}

func (TransitRouterRouteTablePropagationState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterRouteTablePropagationState)(nil)).Elem()
}

type transitRouterRouteTablePropagationArgs struct {
	// The dry run.
	//
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	DryRun *bool `pulumi:"dryRun"`
	// The ID the transit router attachment.
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router route table.
	TransitRouterRouteTableId string `pulumi:"transitRouterRouteTableId"`
}

// The set of arguments for constructing a TransitRouterRouteTablePropagation resource.
type TransitRouterRouteTablePropagationArgs struct {
	// The dry run.
	//
	// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
	DryRun pulumi.BoolPtrInput
	// The ID the transit router attachment.
	TransitRouterAttachmentId pulumi.StringInput
	// The ID of the transit router route table.
	TransitRouterRouteTableId pulumi.StringInput
}

func (TransitRouterRouteTablePropagationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterRouteTablePropagationArgs)(nil)).Elem()
}

type TransitRouterRouteTablePropagationInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationOutput() TransitRouterRouteTablePropagationOutput
	ToTransitRouterRouteTablePropagationOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationOutput
}

func (*TransitRouterRouteTablePropagation) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationOutput() TransitRouterRouteTablePropagationOutput {
	return i.ToTransitRouterRouteTablePropagationOutputWithContext(context.Background())
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationOutput)
}

func (i *TransitRouterRouteTablePropagation) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterRouteTablePropagation] {
	return pulumix.Output[*TransitRouterRouteTablePropagation]{
		OutputState: i.ToTransitRouterRouteTablePropagationOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterRouteTablePropagationArrayInput is an input type that accepts TransitRouterRouteTablePropagationArray and TransitRouterRouteTablePropagationArrayOutput values.
// You can construct a concrete instance of `TransitRouterRouteTablePropagationArrayInput` via:
//
//	TransitRouterRouteTablePropagationArray{ TransitRouterRouteTablePropagationArgs{...} }
type TransitRouterRouteTablePropagationArrayInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput
	ToTransitRouterRouteTablePropagationArrayOutputWithContext(context.Context) TransitRouterRouteTablePropagationArrayOutput
}

type TransitRouterRouteTablePropagationArray []TransitRouterRouteTablePropagationInput

func (TransitRouterRouteTablePropagationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (i TransitRouterRouteTablePropagationArray) ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput {
	return i.ToTransitRouterRouteTablePropagationArrayOutputWithContext(context.Background())
}

func (i TransitRouterRouteTablePropagationArray) ToTransitRouterRouteTablePropagationArrayOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationArrayOutput)
}

func (i TransitRouterRouteTablePropagationArray) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterRouteTablePropagation] {
	return pulumix.Output[[]*TransitRouterRouteTablePropagation]{
		OutputState: i.ToTransitRouterRouteTablePropagationArrayOutputWithContext(ctx).OutputState,
	}
}

// TransitRouterRouteTablePropagationMapInput is an input type that accepts TransitRouterRouteTablePropagationMap and TransitRouterRouteTablePropagationMapOutput values.
// You can construct a concrete instance of `TransitRouterRouteTablePropagationMapInput` via:
//
//	TransitRouterRouteTablePropagationMap{ "key": TransitRouterRouteTablePropagationArgs{...} }
type TransitRouterRouteTablePropagationMapInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput
	ToTransitRouterRouteTablePropagationMapOutputWithContext(context.Context) TransitRouterRouteTablePropagationMapOutput
}

type TransitRouterRouteTablePropagationMap map[string]TransitRouterRouteTablePropagationInput

func (TransitRouterRouteTablePropagationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (i TransitRouterRouteTablePropagationMap) ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput {
	return i.ToTransitRouterRouteTablePropagationMapOutputWithContext(context.Background())
}

func (i TransitRouterRouteTablePropagationMap) ToTransitRouterRouteTablePropagationMapOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationMapOutput)
}

func (i TransitRouterRouteTablePropagationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterRouteTablePropagation] {
	return pulumix.Output[map[string]*TransitRouterRouteTablePropagation]{
		OutputState: i.ToTransitRouterRouteTablePropagationMapOutputWithContext(ctx).OutputState,
	}
}

type TransitRouterRouteTablePropagationOutput struct{ *pulumi.OutputState }

func (TransitRouterRouteTablePropagationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationOutput() TransitRouterRouteTablePropagationOutput {
	return o
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationOutput {
	return o
}

func (o TransitRouterRouteTablePropagationOutput) ToOutput(ctx context.Context) pulumix.Output[*TransitRouterRouteTablePropagation] {
	return pulumix.Output[*TransitRouterRouteTablePropagation]{
		OutputState: o.OutputState,
	}
}

// The dry run.
//
// > **NOTE:** The Zone of CEN has MasterZone and SlaveZone, first zoneId of zoneMapping need be MasterZone. We have a API to describeZones[API](https://help.aliyun.com/document_detail/261356.html)
func (o TransitRouterRouteTablePropagationOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TransitRouterRouteTablePropagation) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// The associating status of the network.
func (o TransitRouterRouteTablePropagationOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterRouteTablePropagation) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID the transit router attachment.
func (o TransitRouterRouteTablePropagationOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterRouteTablePropagation) pulumi.StringOutput { return v.TransitRouterAttachmentId }).(pulumi.StringOutput)
}

// The ID of the transit router route table.
func (o TransitRouterRouteTablePropagationOutput) TransitRouterRouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterRouteTablePropagation) pulumi.StringOutput { return v.TransitRouterRouteTableId }).(pulumi.StringOutput)
}

type TransitRouterRouteTablePropagationArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterRouteTablePropagationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (o TransitRouterRouteTablePropagationArrayOutput) ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput {
	return o
}

func (o TransitRouterRouteTablePropagationArrayOutput) ToTransitRouterRouteTablePropagationArrayOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationArrayOutput {
	return o
}

func (o TransitRouterRouteTablePropagationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*TransitRouterRouteTablePropagation] {
	return pulumix.Output[[]*TransitRouterRouteTablePropagation]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterRouteTablePropagationArrayOutput) Index(i pulumi.IntInput) TransitRouterRouteTablePropagationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitRouterRouteTablePropagation {
		return vs[0].([]*TransitRouterRouteTablePropagation)[vs[1].(int)]
	}).(TransitRouterRouteTablePropagationOutput)
}

type TransitRouterRouteTablePropagationMapOutput struct{ *pulumi.OutputState }

func (TransitRouterRouteTablePropagationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterRouteTablePropagation)(nil)).Elem()
}

func (o TransitRouterRouteTablePropagationMapOutput) ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput {
	return o
}

func (o TransitRouterRouteTablePropagationMapOutput) ToTransitRouterRouteTablePropagationMapOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationMapOutput {
	return o
}

func (o TransitRouterRouteTablePropagationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*TransitRouterRouteTablePropagation] {
	return pulumix.Output[map[string]*TransitRouterRouteTablePropagation]{
		OutputState: o.OutputState,
	}
}

func (o TransitRouterRouteTablePropagationMapOutput) MapIndex(k pulumi.StringInput) TransitRouterRouteTablePropagationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitRouterRouteTablePropagation {
		return vs[0].(map[string]*TransitRouterRouteTablePropagation)[vs[1].(string)]
	}).(TransitRouterRouteTablePropagationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterRouteTablePropagationInput)(nil)).Elem(), &TransitRouterRouteTablePropagation{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterRouteTablePropagationArrayInput)(nil)).Elem(), TransitRouterRouteTablePropagationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterRouteTablePropagationMapInput)(nil)).Elem(), TransitRouterRouteTablePropagationMap{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationOutput{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationMapOutput{})
}
