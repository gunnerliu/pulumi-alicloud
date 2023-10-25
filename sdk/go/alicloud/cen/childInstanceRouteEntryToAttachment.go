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

// Provides a Cen Child Instance Route Entry To Attachment resource.
//
// For information about Cen Child Instance Route Entry To Attachment and how to use it, see [What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcenchildinstancerouteentrytoattachment).
//
// > **NOTE:** Available since v1.195.0.
//
// ## Import
//
// Cen Child Instance Route Entry To Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/childInstanceRouteEntryToAttachment:ChildInstanceRouteEntryToAttachment example <cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>
//
// ```
type ChildInstanceRouteEntryToAttachment struct {
	pulumi.CustomResourceState

	// The ID of the CEN instance.
	CenId pulumi.StringOutput `pulumi:"cenId"`
	// The first ID of the resource
	ChildInstanceRouteTableId pulumi.StringOutput `pulumi:"childInstanceRouteTableId"`
	// DestinationCidrBlock
	DestinationCidrBlock pulumi.StringOutput `pulumi:"destinationCidrBlock"`
	// Whether to perform pre-check on this request, including permission and instance status verification.
	DryRun pulumi.BoolPtrOutput `pulumi:"dryRun"`
	// ServiceType
	ServiceType pulumi.StringOutput `pulumi:"serviceType"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// TransitRouterAttachmentId
	TransitRouterAttachmentId pulumi.StringOutput `pulumi:"transitRouterAttachmentId"`
}

// NewChildInstanceRouteEntryToAttachment registers a new resource with the given unique name, arguments, and options.
func NewChildInstanceRouteEntryToAttachment(ctx *pulumi.Context,
	name string, args *ChildInstanceRouteEntryToAttachmentArgs, opts ...pulumi.ResourceOption) (*ChildInstanceRouteEntryToAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CenId == nil {
		return nil, errors.New("invalid value for required argument 'CenId'")
	}
	if args.ChildInstanceRouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'ChildInstanceRouteTableId'")
	}
	if args.DestinationCidrBlock == nil {
		return nil, errors.New("invalid value for required argument 'DestinationCidrBlock'")
	}
	if args.TransitRouterAttachmentId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterAttachmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ChildInstanceRouteEntryToAttachment
	err := ctx.RegisterResource("alicloud:cen/childInstanceRouteEntryToAttachment:ChildInstanceRouteEntryToAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetChildInstanceRouteEntryToAttachment gets an existing ChildInstanceRouteEntryToAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetChildInstanceRouteEntryToAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ChildInstanceRouteEntryToAttachmentState, opts ...pulumi.ResourceOption) (*ChildInstanceRouteEntryToAttachment, error) {
	var resource ChildInstanceRouteEntryToAttachment
	err := ctx.ReadResource("alicloud:cen/childInstanceRouteEntryToAttachment:ChildInstanceRouteEntryToAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ChildInstanceRouteEntryToAttachment resources.
type childInstanceRouteEntryToAttachmentState struct {
	// The ID of the CEN instance.
	CenId *string `pulumi:"cenId"`
	// The first ID of the resource
	ChildInstanceRouteTableId *string `pulumi:"childInstanceRouteTableId"`
	// DestinationCidrBlock
	DestinationCidrBlock *string `pulumi:"destinationCidrBlock"`
	// Whether to perform pre-check on this request, including permission and instance status verification.
	DryRun *bool `pulumi:"dryRun"`
	// ServiceType
	ServiceType *string `pulumi:"serviceType"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// TransitRouterAttachmentId
	TransitRouterAttachmentId *string `pulumi:"transitRouterAttachmentId"`
}

type ChildInstanceRouteEntryToAttachmentState struct {
	// The ID of the CEN instance.
	CenId pulumi.StringPtrInput
	// The first ID of the resource
	ChildInstanceRouteTableId pulumi.StringPtrInput
	// DestinationCidrBlock
	DestinationCidrBlock pulumi.StringPtrInput
	// Whether to perform pre-check on this request, including permission and instance status verification.
	DryRun pulumi.BoolPtrInput
	// ServiceType
	ServiceType pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// TransitRouterAttachmentId
	TransitRouterAttachmentId pulumi.StringPtrInput
}

func (ChildInstanceRouteEntryToAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*childInstanceRouteEntryToAttachmentState)(nil)).Elem()
}

type childInstanceRouteEntryToAttachmentArgs struct {
	// The ID of the CEN instance.
	CenId string `pulumi:"cenId"`
	// The first ID of the resource
	ChildInstanceRouteTableId string `pulumi:"childInstanceRouteTableId"`
	// DestinationCidrBlock
	DestinationCidrBlock string `pulumi:"destinationCidrBlock"`
	// Whether to perform pre-check on this request, including permission and instance status verification.
	DryRun *bool `pulumi:"dryRun"`
	// TransitRouterAttachmentId
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
}

// The set of arguments for constructing a ChildInstanceRouteEntryToAttachment resource.
type ChildInstanceRouteEntryToAttachmentArgs struct {
	// The ID of the CEN instance.
	CenId pulumi.StringInput
	// The first ID of the resource
	ChildInstanceRouteTableId pulumi.StringInput
	// DestinationCidrBlock
	DestinationCidrBlock pulumi.StringInput
	// Whether to perform pre-check on this request, including permission and instance status verification.
	DryRun pulumi.BoolPtrInput
	// TransitRouterAttachmentId
	TransitRouterAttachmentId pulumi.StringInput
}

func (ChildInstanceRouteEntryToAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*childInstanceRouteEntryToAttachmentArgs)(nil)).Elem()
}

type ChildInstanceRouteEntryToAttachmentInput interface {
	pulumi.Input

	ToChildInstanceRouteEntryToAttachmentOutput() ChildInstanceRouteEntryToAttachmentOutput
	ToChildInstanceRouteEntryToAttachmentOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentOutput
}

func (*ChildInstanceRouteEntryToAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (i *ChildInstanceRouteEntryToAttachment) ToChildInstanceRouteEntryToAttachmentOutput() ChildInstanceRouteEntryToAttachmentOutput {
	return i.ToChildInstanceRouteEntryToAttachmentOutputWithContext(context.Background())
}

func (i *ChildInstanceRouteEntryToAttachment) ToChildInstanceRouteEntryToAttachmentOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChildInstanceRouteEntryToAttachmentOutput)
}

func (i *ChildInstanceRouteEntryToAttachment) ToOutput(ctx context.Context) pulumix.Output[*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[*ChildInstanceRouteEntryToAttachment]{
		OutputState: i.ToChildInstanceRouteEntryToAttachmentOutputWithContext(ctx).OutputState,
	}
}

// ChildInstanceRouteEntryToAttachmentArrayInput is an input type that accepts ChildInstanceRouteEntryToAttachmentArray and ChildInstanceRouteEntryToAttachmentArrayOutput values.
// You can construct a concrete instance of `ChildInstanceRouteEntryToAttachmentArrayInput` via:
//
//	ChildInstanceRouteEntryToAttachmentArray{ ChildInstanceRouteEntryToAttachmentArgs{...} }
type ChildInstanceRouteEntryToAttachmentArrayInput interface {
	pulumi.Input

	ToChildInstanceRouteEntryToAttachmentArrayOutput() ChildInstanceRouteEntryToAttachmentArrayOutput
	ToChildInstanceRouteEntryToAttachmentArrayOutputWithContext(context.Context) ChildInstanceRouteEntryToAttachmentArrayOutput
}

type ChildInstanceRouteEntryToAttachmentArray []ChildInstanceRouteEntryToAttachmentInput

func (ChildInstanceRouteEntryToAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (i ChildInstanceRouteEntryToAttachmentArray) ToChildInstanceRouteEntryToAttachmentArrayOutput() ChildInstanceRouteEntryToAttachmentArrayOutput {
	return i.ToChildInstanceRouteEntryToAttachmentArrayOutputWithContext(context.Background())
}

func (i ChildInstanceRouteEntryToAttachmentArray) ToChildInstanceRouteEntryToAttachmentArrayOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChildInstanceRouteEntryToAttachmentArrayOutput)
}

func (i ChildInstanceRouteEntryToAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[[]*ChildInstanceRouteEntryToAttachment]{
		OutputState: i.ToChildInstanceRouteEntryToAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// ChildInstanceRouteEntryToAttachmentMapInput is an input type that accepts ChildInstanceRouteEntryToAttachmentMap and ChildInstanceRouteEntryToAttachmentMapOutput values.
// You can construct a concrete instance of `ChildInstanceRouteEntryToAttachmentMapInput` via:
//
//	ChildInstanceRouteEntryToAttachmentMap{ "key": ChildInstanceRouteEntryToAttachmentArgs{...} }
type ChildInstanceRouteEntryToAttachmentMapInput interface {
	pulumi.Input

	ToChildInstanceRouteEntryToAttachmentMapOutput() ChildInstanceRouteEntryToAttachmentMapOutput
	ToChildInstanceRouteEntryToAttachmentMapOutputWithContext(context.Context) ChildInstanceRouteEntryToAttachmentMapOutput
}

type ChildInstanceRouteEntryToAttachmentMap map[string]ChildInstanceRouteEntryToAttachmentInput

func (ChildInstanceRouteEntryToAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (i ChildInstanceRouteEntryToAttachmentMap) ToChildInstanceRouteEntryToAttachmentMapOutput() ChildInstanceRouteEntryToAttachmentMapOutput {
	return i.ToChildInstanceRouteEntryToAttachmentMapOutputWithContext(context.Background())
}

func (i ChildInstanceRouteEntryToAttachmentMap) ToChildInstanceRouteEntryToAttachmentMapOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ChildInstanceRouteEntryToAttachmentMapOutput)
}

func (i ChildInstanceRouteEntryToAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[map[string]*ChildInstanceRouteEntryToAttachment]{
		OutputState: i.ToChildInstanceRouteEntryToAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type ChildInstanceRouteEntryToAttachmentOutput struct{ *pulumi.OutputState }

func (ChildInstanceRouteEntryToAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (o ChildInstanceRouteEntryToAttachmentOutput) ToChildInstanceRouteEntryToAttachmentOutput() ChildInstanceRouteEntryToAttachmentOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentOutput) ToChildInstanceRouteEntryToAttachmentOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[*ChildInstanceRouteEntryToAttachment]{
		OutputState: o.OutputState,
	}
}

// The ID of the CEN instance.
func (o ChildInstanceRouteEntryToAttachmentOutput) CenId() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.CenId }).(pulumi.StringOutput)
}

// The first ID of the resource
func (o ChildInstanceRouteEntryToAttachmentOutput) ChildInstanceRouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.ChildInstanceRouteTableId }).(pulumi.StringOutput)
}

// DestinationCidrBlock
func (o ChildInstanceRouteEntryToAttachmentOutput) DestinationCidrBlock() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.DestinationCidrBlock }).(pulumi.StringOutput)
}

// Whether to perform pre-check on this request, including permission and instance status verification.
func (o ChildInstanceRouteEntryToAttachmentOutput) DryRun() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.BoolPtrOutput { return v.DryRun }).(pulumi.BoolPtrOutput)
}

// ServiceType
func (o ChildInstanceRouteEntryToAttachmentOutput) ServiceType() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.ServiceType }).(pulumi.StringOutput)
}

// The status of the resource
func (o ChildInstanceRouteEntryToAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// TransitRouterAttachmentId
func (o ChildInstanceRouteEntryToAttachmentOutput) TransitRouterAttachmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *ChildInstanceRouteEntryToAttachment) pulumi.StringOutput { return v.TransitRouterAttachmentId }).(pulumi.StringOutput)
}

type ChildInstanceRouteEntryToAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ChildInstanceRouteEntryToAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (o ChildInstanceRouteEntryToAttachmentArrayOutput) ToChildInstanceRouteEntryToAttachmentArrayOutput() ChildInstanceRouteEntryToAttachmentArrayOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentArrayOutput) ToChildInstanceRouteEntryToAttachmentArrayOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentArrayOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[[]*ChildInstanceRouteEntryToAttachment]{
		OutputState: o.OutputState,
	}
}

func (o ChildInstanceRouteEntryToAttachmentArrayOutput) Index(i pulumi.IntInput) ChildInstanceRouteEntryToAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ChildInstanceRouteEntryToAttachment {
		return vs[0].([]*ChildInstanceRouteEntryToAttachment)[vs[1].(int)]
	}).(ChildInstanceRouteEntryToAttachmentOutput)
}

type ChildInstanceRouteEntryToAttachmentMapOutput struct{ *pulumi.OutputState }

func (ChildInstanceRouteEntryToAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ChildInstanceRouteEntryToAttachment)(nil)).Elem()
}

func (o ChildInstanceRouteEntryToAttachmentMapOutput) ToChildInstanceRouteEntryToAttachmentMapOutput() ChildInstanceRouteEntryToAttachmentMapOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentMapOutput) ToChildInstanceRouteEntryToAttachmentMapOutputWithContext(ctx context.Context) ChildInstanceRouteEntryToAttachmentMapOutput {
	return o
}

func (o ChildInstanceRouteEntryToAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ChildInstanceRouteEntryToAttachment] {
	return pulumix.Output[map[string]*ChildInstanceRouteEntryToAttachment]{
		OutputState: o.OutputState,
	}
}

func (o ChildInstanceRouteEntryToAttachmentMapOutput) MapIndex(k pulumi.StringInput) ChildInstanceRouteEntryToAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ChildInstanceRouteEntryToAttachment {
		return vs[0].(map[string]*ChildInstanceRouteEntryToAttachment)[vs[1].(string)]
	}).(ChildInstanceRouteEntryToAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ChildInstanceRouteEntryToAttachmentInput)(nil)).Elem(), &ChildInstanceRouteEntryToAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChildInstanceRouteEntryToAttachmentArrayInput)(nil)).Elem(), ChildInstanceRouteEntryToAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ChildInstanceRouteEntryToAttachmentMapInput)(nil)).Elem(), ChildInstanceRouteEntryToAttachmentMap{})
	pulumi.RegisterOutputType(ChildInstanceRouteEntryToAttachmentOutput{})
	pulumi.RegisterOutputType(ChildInstanceRouteEntryToAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ChildInstanceRouteEntryToAttachmentMapOutput{})
}
