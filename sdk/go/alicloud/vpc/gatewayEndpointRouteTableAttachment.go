// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a VPC Gateway Endpoint Route Table Attachment resource. VPC gateway node association route.
//
// For information about VPC Gateway Endpoint Route Table Attachment and how to use it, see [What is Gateway Endpoint Route Table Attachment](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/311148).
//
// > **NOTE:** Available since v1.208.0.
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
//	"fmt"
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
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
//			defaulteVpc, err := vpc.NewNetwork(ctx, "defaulteVpc", &vpc.NetworkArgs{
//				Description: pulumi.String("test"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultGE, err := vpc.NewGatewayEndpoint(ctx, "defaultGE", &vpc.GatewayEndpointArgs{
//				ServiceName:               pulumi.String("com.aliyun.cn-hangzhou.oss"),
//				PolicyDocument:            pulumi.String("{ \"Version\" : \"1\", \"Statement\" : [ { \"Effect\" : \"Allow\", \"Resource\" : [ \"*\" ], \"Action\" : [ \"*\" ], \"Principal\" : [ \"*\" ] } ] }"),
//				VpcId:                     defaulteVpc.ID(),
//				GatewayEndpointDescrption: pulumi.String("test-gateway-endpoint"),
//				GatewayEndpointName:       pulumi.String(fmt.Sprintf("%v1", name)),
//			})
//			if err != nil {
//				return err
//			}
//			defaultRT, err := vpc.NewRouteTable(ctx, "defaultRT", &vpc.RouteTableArgs{
//				VpcId:          defaulteVpc.ID(),
//				RouteTableName: pulumi.String(fmt.Sprintf("%v2", name)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewGatewayEndpointRouteTableAttachment(ctx, "default", &vpc.GatewayEndpointRouteTableAttachmentArgs{
//				GatewayEndpointId: defaultGE.ID(),
//				RouteTableId:      defaultRT.ID(),
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
// VPC Gateway Endpoint Route Table Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/gatewayEndpointRouteTableAttachment:GatewayEndpointRouteTableAttachment example <gateway_endpoint_id>:<route_table_id>
//
// ```
type GatewayEndpointRouteTableAttachment struct {
	pulumi.CustomResourceState

	// The ID of the gateway endpoint instance to which you want to associate the route table.
	GatewayEndpointId pulumi.StringOutput `pulumi:"gatewayEndpointId"`
	// Routing table ID.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// Status of the gateway endpoint.
	Status pulumi.StringOutput `pulumi:"status"`
}

// NewGatewayEndpointRouteTableAttachment registers a new resource with the given unique name, arguments, and options.
func NewGatewayEndpointRouteTableAttachment(ctx *pulumi.Context,
	name string, args *GatewayEndpointRouteTableAttachmentArgs, opts ...pulumi.ResourceOption) (*GatewayEndpointRouteTableAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GatewayEndpointId == nil {
		return nil, errors.New("invalid value for required argument 'GatewayEndpointId'")
	}
	if args.RouteTableId == nil {
		return nil, errors.New("invalid value for required argument 'RouteTableId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GatewayEndpointRouteTableAttachment
	err := ctx.RegisterResource("alicloud:vpc/gatewayEndpointRouteTableAttachment:GatewayEndpointRouteTableAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGatewayEndpointRouteTableAttachment gets an existing GatewayEndpointRouteTableAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGatewayEndpointRouteTableAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GatewayEndpointRouteTableAttachmentState, opts ...pulumi.ResourceOption) (*GatewayEndpointRouteTableAttachment, error) {
	var resource GatewayEndpointRouteTableAttachment
	err := ctx.ReadResource("alicloud:vpc/gatewayEndpointRouteTableAttachment:GatewayEndpointRouteTableAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GatewayEndpointRouteTableAttachment resources.
type gatewayEndpointRouteTableAttachmentState struct {
	// The ID of the gateway endpoint instance to which you want to associate the route table.
	GatewayEndpointId *string `pulumi:"gatewayEndpointId"`
	// Routing table ID.
	RouteTableId *string `pulumi:"routeTableId"`
	// Status of the gateway endpoint.
	Status *string `pulumi:"status"`
}

type GatewayEndpointRouteTableAttachmentState struct {
	// The ID of the gateway endpoint instance to which you want to associate the route table.
	GatewayEndpointId pulumi.StringPtrInput
	// Routing table ID.
	RouteTableId pulumi.StringPtrInput
	// Status of the gateway endpoint.
	Status pulumi.StringPtrInput
}

func (GatewayEndpointRouteTableAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayEndpointRouteTableAttachmentState)(nil)).Elem()
}

type gatewayEndpointRouteTableAttachmentArgs struct {
	// The ID of the gateway endpoint instance to which you want to associate the route table.
	GatewayEndpointId string `pulumi:"gatewayEndpointId"`
	// Routing table ID.
	RouteTableId string `pulumi:"routeTableId"`
}

// The set of arguments for constructing a GatewayEndpointRouteTableAttachment resource.
type GatewayEndpointRouteTableAttachmentArgs struct {
	// The ID of the gateway endpoint instance to which you want to associate the route table.
	GatewayEndpointId pulumi.StringInput
	// Routing table ID.
	RouteTableId pulumi.StringInput
}

func (GatewayEndpointRouteTableAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gatewayEndpointRouteTableAttachmentArgs)(nil)).Elem()
}

type GatewayEndpointRouteTableAttachmentInput interface {
	pulumi.Input

	ToGatewayEndpointRouteTableAttachmentOutput() GatewayEndpointRouteTableAttachmentOutput
	ToGatewayEndpointRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentOutput
}

func (*GatewayEndpointRouteTableAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (i *GatewayEndpointRouteTableAttachment) ToGatewayEndpointRouteTableAttachmentOutput() GatewayEndpointRouteTableAttachmentOutput {
	return i.ToGatewayEndpointRouteTableAttachmentOutputWithContext(context.Background())
}

func (i *GatewayEndpointRouteTableAttachment) ToGatewayEndpointRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointRouteTableAttachmentOutput)
}

func (i *GatewayEndpointRouteTableAttachment) ToOutput(ctx context.Context) pulumix.Output[*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[*GatewayEndpointRouteTableAttachment]{
		OutputState: i.ToGatewayEndpointRouteTableAttachmentOutputWithContext(ctx).OutputState,
	}
}

// GatewayEndpointRouteTableAttachmentArrayInput is an input type that accepts GatewayEndpointRouteTableAttachmentArray and GatewayEndpointRouteTableAttachmentArrayOutput values.
// You can construct a concrete instance of `GatewayEndpointRouteTableAttachmentArrayInput` via:
//
//	GatewayEndpointRouteTableAttachmentArray{ GatewayEndpointRouteTableAttachmentArgs{...} }
type GatewayEndpointRouteTableAttachmentArrayInput interface {
	pulumi.Input

	ToGatewayEndpointRouteTableAttachmentArrayOutput() GatewayEndpointRouteTableAttachmentArrayOutput
	ToGatewayEndpointRouteTableAttachmentArrayOutputWithContext(context.Context) GatewayEndpointRouteTableAttachmentArrayOutput
}

type GatewayEndpointRouteTableAttachmentArray []GatewayEndpointRouteTableAttachmentInput

func (GatewayEndpointRouteTableAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (i GatewayEndpointRouteTableAttachmentArray) ToGatewayEndpointRouteTableAttachmentArrayOutput() GatewayEndpointRouteTableAttachmentArrayOutput {
	return i.ToGatewayEndpointRouteTableAttachmentArrayOutputWithContext(context.Background())
}

func (i GatewayEndpointRouteTableAttachmentArray) ToGatewayEndpointRouteTableAttachmentArrayOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointRouteTableAttachmentArrayOutput)
}

func (i GatewayEndpointRouteTableAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[[]*GatewayEndpointRouteTableAttachment]{
		OutputState: i.ToGatewayEndpointRouteTableAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// GatewayEndpointRouteTableAttachmentMapInput is an input type that accepts GatewayEndpointRouteTableAttachmentMap and GatewayEndpointRouteTableAttachmentMapOutput values.
// You can construct a concrete instance of `GatewayEndpointRouteTableAttachmentMapInput` via:
//
//	GatewayEndpointRouteTableAttachmentMap{ "key": GatewayEndpointRouteTableAttachmentArgs{...} }
type GatewayEndpointRouteTableAttachmentMapInput interface {
	pulumi.Input

	ToGatewayEndpointRouteTableAttachmentMapOutput() GatewayEndpointRouteTableAttachmentMapOutput
	ToGatewayEndpointRouteTableAttachmentMapOutputWithContext(context.Context) GatewayEndpointRouteTableAttachmentMapOutput
}

type GatewayEndpointRouteTableAttachmentMap map[string]GatewayEndpointRouteTableAttachmentInput

func (GatewayEndpointRouteTableAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (i GatewayEndpointRouteTableAttachmentMap) ToGatewayEndpointRouteTableAttachmentMapOutput() GatewayEndpointRouteTableAttachmentMapOutput {
	return i.ToGatewayEndpointRouteTableAttachmentMapOutputWithContext(context.Background())
}

func (i GatewayEndpointRouteTableAttachmentMap) ToGatewayEndpointRouteTableAttachmentMapOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GatewayEndpointRouteTableAttachmentMapOutput)
}

func (i GatewayEndpointRouteTableAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[map[string]*GatewayEndpointRouteTableAttachment]{
		OutputState: i.ToGatewayEndpointRouteTableAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type GatewayEndpointRouteTableAttachmentOutput struct{ *pulumi.OutputState }

func (GatewayEndpointRouteTableAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (o GatewayEndpointRouteTableAttachmentOutput) ToGatewayEndpointRouteTableAttachmentOutput() GatewayEndpointRouteTableAttachmentOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentOutput) ToGatewayEndpointRouteTableAttachmentOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[*GatewayEndpointRouteTableAttachment]{
		OutputState: o.OutputState,
	}
}

// The ID of the gateway endpoint instance to which you want to associate the route table.
func (o GatewayEndpointRouteTableAttachmentOutput) GatewayEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpointRouteTableAttachment) pulumi.StringOutput { return v.GatewayEndpointId }).(pulumi.StringOutput)
}

// Routing table ID.
func (o GatewayEndpointRouteTableAttachmentOutput) RouteTableId() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpointRouteTableAttachment) pulumi.StringOutput { return v.RouteTableId }).(pulumi.StringOutput)
}

// Status of the gateway endpoint.
func (o GatewayEndpointRouteTableAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *GatewayEndpointRouteTableAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

type GatewayEndpointRouteTableAttachmentArrayOutput struct{ *pulumi.OutputState }

func (GatewayEndpointRouteTableAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (o GatewayEndpointRouteTableAttachmentArrayOutput) ToGatewayEndpointRouteTableAttachmentArrayOutput() GatewayEndpointRouteTableAttachmentArrayOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentArrayOutput) ToGatewayEndpointRouteTableAttachmentArrayOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentArrayOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[[]*GatewayEndpointRouteTableAttachment]{
		OutputState: o.OutputState,
	}
}

func (o GatewayEndpointRouteTableAttachmentArrayOutput) Index(i pulumi.IntInput) GatewayEndpointRouteTableAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GatewayEndpointRouteTableAttachment {
		return vs[0].([]*GatewayEndpointRouteTableAttachment)[vs[1].(int)]
	}).(GatewayEndpointRouteTableAttachmentOutput)
}

type GatewayEndpointRouteTableAttachmentMapOutput struct{ *pulumi.OutputState }

func (GatewayEndpointRouteTableAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GatewayEndpointRouteTableAttachment)(nil)).Elem()
}

func (o GatewayEndpointRouteTableAttachmentMapOutput) ToGatewayEndpointRouteTableAttachmentMapOutput() GatewayEndpointRouteTableAttachmentMapOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentMapOutput) ToGatewayEndpointRouteTableAttachmentMapOutputWithContext(ctx context.Context) GatewayEndpointRouteTableAttachmentMapOutput {
	return o
}

func (o GatewayEndpointRouteTableAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*GatewayEndpointRouteTableAttachment] {
	return pulumix.Output[map[string]*GatewayEndpointRouteTableAttachment]{
		OutputState: o.OutputState,
	}
}

func (o GatewayEndpointRouteTableAttachmentMapOutput) MapIndex(k pulumi.StringInput) GatewayEndpointRouteTableAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GatewayEndpointRouteTableAttachment {
		return vs[0].(map[string]*GatewayEndpointRouteTableAttachment)[vs[1].(string)]
	}).(GatewayEndpointRouteTableAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointRouteTableAttachmentInput)(nil)).Elem(), &GatewayEndpointRouteTableAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointRouteTableAttachmentArrayInput)(nil)).Elem(), GatewayEndpointRouteTableAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GatewayEndpointRouteTableAttachmentMapInput)(nil)).Elem(), GatewayEndpointRouteTableAttachmentMap{})
	pulumi.RegisterOutputType(GatewayEndpointRouteTableAttachmentOutput{})
	pulumi.RegisterOutputType(GatewayEndpointRouteTableAttachmentArrayOutput{})
	pulumi.RegisterOutputType(GatewayEndpointRouteTableAttachmentMapOutput{})
}
