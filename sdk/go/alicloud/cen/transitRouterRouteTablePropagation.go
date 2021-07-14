// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cen

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CEN transit router route table propagation resource.[What is Cen Transit Router Route Table Propagation](https://help.aliyun.com/document_detail/261244.html)
//
// > **NOTE:** Available in 1.126.0+
//
// ## Import
//
// CEN transit router route table propagation can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:cen/transitRouterRouteTablePropagation:TransitRouterRouteTablePropagation default tr-********:tr-attach-********
// ```
type TransitRouterRouteTablePropagation struct {
	pulumi.CustomResourceState

	// The dry run.
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
	DryRun *bool `pulumi:"dryRun"`
	// The ID the transit router attachment.
	TransitRouterAttachmentId string `pulumi:"transitRouterAttachmentId"`
	// The ID of the transit router route table.
	TransitRouterRouteTableId string `pulumi:"transitRouterRouteTableId"`
}

// The set of arguments for constructing a TransitRouterRouteTablePropagation resource.
type TransitRouterRouteTablePropagationArgs struct {
	// The dry run.
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
	return reflect.TypeOf((*TransitRouterRouteTablePropagation)(nil))
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationOutput() TransitRouterRouteTablePropagationOutput {
	return i.ToTransitRouterRouteTablePropagationOutputWithContext(context.Background())
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationOutput)
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationPtrOutput() TransitRouterRouteTablePropagationPtrOutput {
	return i.ToTransitRouterRouteTablePropagationPtrOutputWithContext(context.Background())
}

func (i *TransitRouterRouteTablePropagation) ToTransitRouterRouteTablePropagationPtrOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationPtrOutput)
}

type TransitRouterRouteTablePropagationPtrInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationPtrOutput() TransitRouterRouteTablePropagationPtrOutput
	ToTransitRouterRouteTablePropagationPtrOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationPtrOutput
}

type transitRouterRouteTablePropagationPtrType TransitRouterRouteTablePropagationArgs

func (*transitRouterRouteTablePropagationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterRouteTablePropagation)(nil))
}

func (i *transitRouterRouteTablePropagationPtrType) ToTransitRouterRouteTablePropagationPtrOutput() TransitRouterRouteTablePropagationPtrOutput {
	return i.ToTransitRouterRouteTablePropagationPtrOutputWithContext(context.Background())
}

func (i *transitRouterRouteTablePropagationPtrType) ToTransitRouterRouteTablePropagationPtrOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationPtrOutput)
}

// TransitRouterRouteTablePropagationArrayInput is an input type that accepts TransitRouterRouteTablePropagationArray and TransitRouterRouteTablePropagationArrayOutput values.
// You can construct a concrete instance of `TransitRouterRouteTablePropagationArrayInput` via:
//
//          TransitRouterRouteTablePropagationArray{ TransitRouterRouteTablePropagationArgs{...} }
type TransitRouterRouteTablePropagationArrayInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput
	ToTransitRouterRouteTablePropagationArrayOutputWithContext(context.Context) TransitRouterRouteTablePropagationArrayOutput
}

type TransitRouterRouteTablePropagationArray []TransitRouterRouteTablePropagationInput

func (TransitRouterRouteTablePropagationArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*TransitRouterRouteTablePropagation)(nil))
}

func (i TransitRouterRouteTablePropagationArray) ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput {
	return i.ToTransitRouterRouteTablePropagationArrayOutputWithContext(context.Background())
}

func (i TransitRouterRouteTablePropagationArray) ToTransitRouterRouteTablePropagationArrayOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationArrayOutput)
}

// TransitRouterRouteTablePropagationMapInput is an input type that accepts TransitRouterRouteTablePropagationMap and TransitRouterRouteTablePropagationMapOutput values.
// You can construct a concrete instance of `TransitRouterRouteTablePropagationMapInput` via:
//
//          TransitRouterRouteTablePropagationMap{ "key": TransitRouterRouteTablePropagationArgs{...} }
type TransitRouterRouteTablePropagationMapInput interface {
	pulumi.Input

	ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput
	ToTransitRouterRouteTablePropagationMapOutputWithContext(context.Context) TransitRouterRouteTablePropagationMapOutput
}

type TransitRouterRouteTablePropagationMap map[string]TransitRouterRouteTablePropagationInput

func (TransitRouterRouteTablePropagationMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*TransitRouterRouteTablePropagation)(nil))
}

func (i TransitRouterRouteTablePropagationMap) ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput {
	return i.ToTransitRouterRouteTablePropagationMapOutputWithContext(context.Background())
}

func (i TransitRouterRouteTablePropagationMap) ToTransitRouterRouteTablePropagationMapOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterRouteTablePropagationMapOutput)
}

type TransitRouterRouteTablePropagationOutput struct {
	*pulumi.OutputState
}

func (TransitRouterRouteTablePropagationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TransitRouterRouteTablePropagation)(nil))
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationOutput() TransitRouterRouteTablePropagationOutput {
	return o
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationOutput {
	return o
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationPtrOutput() TransitRouterRouteTablePropagationPtrOutput {
	return o.ToTransitRouterRouteTablePropagationPtrOutputWithContext(context.Background())
}

func (o TransitRouterRouteTablePropagationOutput) ToTransitRouterRouteTablePropagationPtrOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationPtrOutput {
	return o.ApplyT(func(v TransitRouterRouteTablePropagation) *TransitRouterRouteTablePropagation {
		return &v
	}).(TransitRouterRouteTablePropagationPtrOutput)
}

type TransitRouterRouteTablePropagationPtrOutput struct {
	*pulumi.OutputState
}

func (TransitRouterRouteTablePropagationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterRouteTablePropagation)(nil))
}

func (o TransitRouterRouteTablePropagationPtrOutput) ToTransitRouterRouteTablePropagationPtrOutput() TransitRouterRouteTablePropagationPtrOutput {
	return o
}

func (o TransitRouterRouteTablePropagationPtrOutput) ToTransitRouterRouteTablePropagationPtrOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationPtrOutput {
	return o
}

type TransitRouterRouteTablePropagationArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterRouteTablePropagationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]TransitRouterRouteTablePropagation)(nil))
}

func (o TransitRouterRouteTablePropagationArrayOutput) ToTransitRouterRouteTablePropagationArrayOutput() TransitRouterRouteTablePropagationArrayOutput {
	return o
}

func (o TransitRouterRouteTablePropagationArrayOutput) ToTransitRouterRouteTablePropagationArrayOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationArrayOutput {
	return o
}

func (o TransitRouterRouteTablePropagationArrayOutput) Index(i pulumi.IntInput) TransitRouterRouteTablePropagationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) TransitRouterRouteTablePropagation {
		return vs[0].([]TransitRouterRouteTablePropagation)[vs[1].(int)]
	}).(TransitRouterRouteTablePropagationOutput)
}

type TransitRouterRouteTablePropagationMapOutput struct{ *pulumi.OutputState }

func (TransitRouterRouteTablePropagationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]TransitRouterRouteTablePropagation)(nil))
}

func (o TransitRouterRouteTablePropagationMapOutput) ToTransitRouterRouteTablePropagationMapOutput() TransitRouterRouteTablePropagationMapOutput {
	return o
}

func (o TransitRouterRouteTablePropagationMapOutput) ToTransitRouterRouteTablePropagationMapOutputWithContext(ctx context.Context) TransitRouterRouteTablePropagationMapOutput {
	return o
}

func (o TransitRouterRouteTablePropagationMapOutput) MapIndex(k pulumi.StringInput) TransitRouterRouteTablePropagationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) TransitRouterRouteTablePropagation {
		return vs[0].(map[string]TransitRouterRouteTablePropagation)[vs[1].(string)]
	}).(TransitRouterRouteTablePropagationOutput)
}

func init() {
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationOutput{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationPtrOutput{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterRouteTablePropagationMapOutput{})
}
