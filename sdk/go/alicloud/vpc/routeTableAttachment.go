// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// The route table attachment can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:vpc/routeTableAttachment:RouteTableAttachment foo vtb-abc123456:vsw-abc123456
// ```
type RouteTableAttachment struct {
	pulumi.CustomResourceState

	// The routeTableId of the route table attachment, the field can't be changed.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// The vswitchId of the route table attachment, the field can't be changed.
	VswitchId pulumi.StringOutput `pulumi:"vswitchId"`
}

// NewRouteTableAttachment registers a new resource with the given unique name, arguments, and options.
func NewRouteTableAttachment(ctx *pulumi.Context,
	name string, args *RouteTableAttachmentArgs, opts ...pulumi.ResourceOption) (*RouteTableAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	if args.VswitchId == nil {
		return nil, errors.New("invalid value for required argument 'VswitchId'")
	}
	var resource RouteTableAttachment
	err := ctx.RegisterResource("alicloud:vpc/routeTableAttachment:RouteTableAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteTableAttachment gets an existing RouteTableAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteTableAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteTableAttachmentState, opts ...pulumi.ResourceOption) (*RouteTableAttachment, error) {
	var resource RouteTableAttachment
	err := ctx.ReadResource("alicloud:vpc/routeTableAttachment:RouteTableAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteTableAttachment resources.
type routeTableAttachmentState struct {
	// The routeTableId of the route table attachment, the field can't be changed.
	RouteTableId *string `pulumi:"routeTableId"`
	// The vswitchId of the route table attachment, the field can't be changed.
	VswitchId *string `pulumi:"vswitchId"`
}

type RouteTableAttachmentState struct {
	// The routeTableId of the route table attachment, the field can't be changed.
	RouteTableId pulumi.StringPtrInput
	// The vswitchId of the route table attachment, the field can't be changed.
	VswitchId pulumi.StringPtrInput
}

func (RouteTableAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableAttachmentState)(nil)).Elem()
}

type routeTableAttachmentArgs struct {
	// The routeTableId of the route table attachment, the field can't be changed.
	RouteTableId string `pulumi:"routeTableId"`
	// The vswitchId of the route table attachment, the field can't be changed.
	VswitchId string `pulumi:"vswitchId"`
}

// The set of arguments for constructing a RouteTableAttachment resource.
type RouteTableAttachmentArgs struct {
	// The routeTableId of the route table attachment, the field can't be changed.
	RouteTableId pulumi.StringInput
	// The vswitchId of the route table attachment, the field can't be changed.
	VswitchId pulumi.StringInput
}

func (RouteTableAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableAttachmentArgs)(nil)).Elem()
}

type RouteTableAttachmentInput interface {
	pulumi.Input

	ToRouteTableAttachmentOutput() RouteTableAttachmentOutput
	ToRouteTableAttachmentOutputWithContext(ctx context.Context) RouteTableAttachmentOutput
}

func (*RouteTableAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTableAttachment)(nil))
}

func (i *RouteTableAttachment) ToRouteTableAttachmentOutput() RouteTableAttachmentOutput {
	return i.ToRouteTableAttachmentOutputWithContext(context.Background())
}

func (i *RouteTableAttachment) ToRouteTableAttachmentOutputWithContext(ctx context.Context) RouteTableAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableAttachmentOutput)
}

func (i *RouteTableAttachment) ToRouteTableAttachmentPtrOutput() RouteTableAttachmentPtrOutput {
	return i.ToRouteTableAttachmentPtrOutputWithContext(context.Background())
}

func (i *RouteTableAttachment) ToRouteTableAttachmentPtrOutputWithContext(ctx context.Context) RouteTableAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableAttachmentPtrOutput)
}

type RouteTableAttachmentPtrInput interface {
	pulumi.Input

	ToRouteTableAttachmentPtrOutput() RouteTableAttachmentPtrOutput
	ToRouteTableAttachmentPtrOutputWithContext(ctx context.Context) RouteTableAttachmentPtrOutput
}

type routeTableAttachmentPtrType RouteTableAttachmentArgs

func (*routeTableAttachmentPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTableAttachment)(nil))
}

func (i *routeTableAttachmentPtrType) ToRouteTableAttachmentPtrOutput() RouteTableAttachmentPtrOutput {
	return i.ToRouteTableAttachmentPtrOutputWithContext(context.Background())
}

func (i *routeTableAttachmentPtrType) ToRouteTableAttachmentPtrOutputWithContext(ctx context.Context) RouteTableAttachmentPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableAttachmentPtrOutput)
}

// RouteTableAttachmentArrayInput is an input type that accepts RouteTableAttachmentArray and RouteTableAttachmentArrayOutput values.
// You can construct a concrete instance of `RouteTableAttachmentArrayInput` via:
//
//          RouteTableAttachmentArray{ RouteTableAttachmentArgs{...} }
type RouteTableAttachmentArrayInput interface {
	pulumi.Input

	ToRouteTableAttachmentArrayOutput() RouteTableAttachmentArrayOutput
	ToRouteTableAttachmentArrayOutputWithContext(context.Context) RouteTableAttachmentArrayOutput
}

type RouteTableAttachmentArray []RouteTableAttachmentInput

func (RouteTableAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouteTableAttachment)(nil)).Elem()
}

func (i RouteTableAttachmentArray) ToRouteTableAttachmentArrayOutput() RouteTableAttachmentArrayOutput {
	return i.ToRouteTableAttachmentArrayOutputWithContext(context.Background())
}

func (i RouteTableAttachmentArray) ToRouteTableAttachmentArrayOutputWithContext(ctx context.Context) RouteTableAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableAttachmentArrayOutput)
}

// RouteTableAttachmentMapInput is an input type that accepts RouteTableAttachmentMap and RouteTableAttachmentMapOutput values.
// You can construct a concrete instance of `RouteTableAttachmentMapInput` via:
//
//          RouteTableAttachmentMap{ "key": RouteTableAttachmentArgs{...} }
type RouteTableAttachmentMapInput interface {
	pulumi.Input

	ToRouteTableAttachmentMapOutput() RouteTableAttachmentMapOutput
	ToRouteTableAttachmentMapOutputWithContext(context.Context) RouteTableAttachmentMapOutput
}

type RouteTableAttachmentMap map[string]RouteTableAttachmentInput

func (RouteTableAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouteTableAttachment)(nil)).Elem()
}

func (i RouteTableAttachmentMap) ToRouteTableAttachmentMapOutput() RouteTableAttachmentMapOutput {
	return i.ToRouteTableAttachmentMapOutputWithContext(context.Background())
}

func (i RouteTableAttachmentMap) ToRouteTableAttachmentMapOutputWithContext(ctx context.Context) RouteTableAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableAttachmentMapOutput)
}

type RouteTableAttachmentOutput struct{ *pulumi.OutputState }

func (RouteTableAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTableAttachment)(nil))
}

func (o RouteTableAttachmentOutput) ToRouteTableAttachmentOutput() RouteTableAttachmentOutput {
	return o
}

func (o RouteTableAttachmentOutput) ToRouteTableAttachmentOutputWithContext(ctx context.Context) RouteTableAttachmentOutput {
	return o
}

func (o RouteTableAttachmentOutput) ToRouteTableAttachmentPtrOutput() RouteTableAttachmentPtrOutput {
	return o.ToRouteTableAttachmentPtrOutputWithContext(context.Background())
}

func (o RouteTableAttachmentOutput) ToRouteTableAttachmentPtrOutputWithContext(ctx context.Context) RouteTableAttachmentPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v RouteTableAttachment) *RouteTableAttachment {
		return &v
	}).(RouteTableAttachmentPtrOutput)
}

type RouteTableAttachmentPtrOutput struct{ *pulumi.OutputState }

func (RouteTableAttachmentPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTableAttachment)(nil))
}

func (o RouteTableAttachmentPtrOutput) ToRouteTableAttachmentPtrOutput() RouteTableAttachmentPtrOutput {
	return o
}

func (o RouteTableAttachmentPtrOutput) ToRouteTableAttachmentPtrOutputWithContext(ctx context.Context) RouteTableAttachmentPtrOutput {
	return o
}

func (o RouteTableAttachmentPtrOutput) Elem() RouteTableAttachmentOutput {
	return o.ApplyT(func(v *RouteTableAttachment) RouteTableAttachment {
		if v != nil {
			return *v
		}
		var ret RouteTableAttachment
		return ret
	}).(RouteTableAttachmentOutput)
}

type RouteTableAttachmentArrayOutput struct{ *pulumi.OutputState }

func (RouteTableAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RouteTableAttachment)(nil))
}

func (o RouteTableAttachmentArrayOutput) ToRouteTableAttachmentArrayOutput() RouteTableAttachmentArrayOutput {
	return o
}

func (o RouteTableAttachmentArrayOutput) ToRouteTableAttachmentArrayOutputWithContext(ctx context.Context) RouteTableAttachmentArrayOutput {
	return o
}

func (o RouteTableAttachmentArrayOutput) Index(i pulumi.IntInput) RouteTableAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RouteTableAttachment {
		return vs[0].([]RouteTableAttachment)[vs[1].(int)]
	}).(RouteTableAttachmentOutput)
}

type RouteTableAttachmentMapOutput struct{ *pulumi.OutputState }

func (RouteTableAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RouteTableAttachment)(nil))
}

func (o RouteTableAttachmentMapOutput) ToRouteTableAttachmentMapOutput() RouteTableAttachmentMapOutput {
	return o
}

func (o RouteTableAttachmentMapOutput) ToRouteTableAttachmentMapOutputWithContext(ctx context.Context) RouteTableAttachmentMapOutput {
	return o
}

func (o RouteTableAttachmentMapOutput) MapIndex(k pulumi.StringInput) RouteTableAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RouteTableAttachment {
		return vs[0].(map[string]RouteTableAttachment)[vs[1].(string)]
	}).(RouteTableAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouteTableAttachmentInput)(nil)).Elem(), &RouteTableAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteTableAttachmentPtrInput)(nil)).Elem(), &RouteTableAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteTableAttachmentArrayInput)(nil)).Elem(), RouteTableAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouteTableAttachmentMapInput)(nil)).Elem(), RouteTableAttachmentMap{})
	pulumi.RegisterOutputType(RouteTableAttachmentOutput{})
	pulumi.RegisterOutputType(RouteTableAttachmentPtrOutput{})
	pulumi.RegisterOutputType(RouteTableAttachmentArrayOutput{})
	pulumi.RegisterOutputType(RouteTableAttachmentMapOutput{})
}
