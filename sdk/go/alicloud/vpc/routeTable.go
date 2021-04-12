// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// The route table can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:vpc/routeTable:RouteTable foo vtb-abc123456
// ```
type RouteTable struct {
	pulumi.CustomResourceState

	// The description of the route table instance.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `routeTableName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the route table.
	RouteTableName pulumi.StringOutput `pulumi:"routeTableName"`
	// (Available in v1.119.1+) The status of the route table.
	Status pulumi.StringOutput `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapOutput `pulumi:"tags"`
	// The vpcId of the route table, the field can't be changed.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewRouteTable registers a new resource with the given unique name, arguments, and options.
func NewRouteTable(ctx *pulumi.Context,
	name string, args *RouteTableArgs, opts ...pulumi.ResourceOption) (*RouteTable, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	var resource RouteTable
	err := ctx.RegisterResource("alicloud:vpc/routeTable:RouteTable", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteTable gets an existing RouteTable resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteTableState, opts ...pulumi.ResourceOption) (*RouteTable, error) {
	var resource RouteTable
	err := ctx.ReadResource("alicloud:vpc/routeTable:RouteTable", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteTable resources.
type routeTableState struct {
	// The description of the route table instance.
	Description *string `pulumi:"description"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `routeTableName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.
	Name *string `pulumi:"name"`
	// The name of the route table.
	RouteTableName *string `pulumi:"routeTableName"`
	// (Available in v1.119.1+) The status of the route table.
	Status *string `pulumi:"status"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vpcId of the route table, the field can't be changed.
	VpcId *string `pulumi:"vpcId"`
}

type RouteTableState struct {
	// The description of the route table instance.
	Description pulumi.StringPtrInput
	// Field `name` has been deprecated from provider version 1.119.1. New field `routeTableName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.
	Name pulumi.StringPtrInput
	// The name of the route table.
	RouteTableName pulumi.StringPtrInput
	// (Available in v1.119.1+) The status of the route table.
	Status pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The vpcId of the route table, the field can't be changed.
	VpcId pulumi.StringPtrInput
}

func (RouteTableState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableState)(nil)).Elem()
}

type routeTableArgs struct {
	// The description of the route table instance.
	Description *string `pulumi:"description"`
	// Field `name` has been deprecated from provider version 1.119.1. New field `routeTableName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.
	Name *string `pulumi:"name"`
	// The name of the route table.
	RouteTableName *string `pulumi:"routeTableName"`
	// A mapping of tags to assign to the resource.
	Tags map[string]interface{} `pulumi:"tags"`
	// The vpcId of the route table, the field can't be changed.
	VpcId string `pulumi:"vpcId"`
}

// The set of arguments for constructing a RouteTable resource.
type RouteTableArgs struct {
	// The description of the route table instance.
	Description pulumi.StringPtrInput
	// Field `name` has been deprecated from provider version 1.119.1. New field `routeTableName` instead.
	//
	// Deprecated: Field 'name' has been deprecated from provider version 1.119.1. New field 'route_table_name' instead.
	Name pulumi.StringPtrInput
	// The name of the route table.
	RouteTableName pulumi.StringPtrInput
	// A mapping of tags to assign to the resource.
	Tags pulumi.MapInput
	// The vpcId of the route table, the field can't be changed.
	VpcId pulumi.StringInput
}

func (RouteTableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeTableArgs)(nil)).Elem()
}

type RouteTableInput interface {
	pulumi.Input

	ToRouteTableOutput() RouteTableOutput
	ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput
}

func (*RouteTable) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTable)(nil))
}

func (i *RouteTable) ToRouteTableOutput() RouteTableOutput {
	return i.ToRouteTableOutputWithContext(context.Background())
}

func (i *RouteTable) ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableOutput)
}

func (i *RouteTable) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return i.ToRouteTablePtrOutputWithContext(context.Background())
}

func (i *RouteTable) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTablePtrOutput)
}

type RouteTablePtrInput interface {
	pulumi.Input

	ToRouteTablePtrOutput() RouteTablePtrOutput
	ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput
}

type routeTablePtrType RouteTableArgs

func (*routeTablePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTable)(nil))
}

func (i *routeTablePtrType) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return i.ToRouteTablePtrOutputWithContext(context.Background())
}

func (i *routeTablePtrType) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTablePtrOutput)
}

// RouteTableArrayInput is an input type that accepts RouteTableArray and RouteTableArrayOutput values.
// You can construct a concrete instance of `RouteTableArrayInput` via:
//
//          RouteTableArray{ RouteTableArgs{...} }
type RouteTableArrayInput interface {
	pulumi.Input

	ToRouteTableArrayOutput() RouteTableArrayOutput
	ToRouteTableArrayOutputWithContext(context.Context) RouteTableArrayOutput
}

type RouteTableArray []RouteTableInput

func (RouteTableArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*RouteTable)(nil))
}

func (i RouteTableArray) ToRouteTableArrayOutput() RouteTableArrayOutput {
	return i.ToRouteTableArrayOutputWithContext(context.Background())
}

func (i RouteTableArray) ToRouteTableArrayOutputWithContext(ctx context.Context) RouteTableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableArrayOutput)
}

// RouteTableMapInput is an input type that accepts RouteTableMap and RouteTableMapOutput values.
// You can construct a concrete instance of `RouteTableMapInput` via:
//
//          RouteTableMap{ "key": RouteTableArgs{...} }
type RouteTableMapInput interface {
	pulumi.Input

	ToRouteTableMapOutput() RouteTableMapOutput
	ToRouteTableMapOutputWithContext(context.Context) RouteTableMapOutput
}

type RouteTableMap map[string]RouteTableInput

func (RouteTableMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*RouteTable)(nil))
}

func (i RouteTableMap) ToRouteTableMapOutput() RouteTableMapOutput {
	return i.ToRouteTableMapOutputWithContext(context.Background())
}

func (i RouteTableMap) ToRouteTableMapOutputWithContext(ctx context.Context) RouteTableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteTableMapOutput)
}

type RouteTableOutput struct {
	*pulumi.OutputState
}

func (RouteTableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteTable)(nil))
}

func (o RouteTableOutput) ToRouteTableOutput() RouteTableOutput {
	return o
}

func (o RouteTableOutput) ToRouteTableOutputWithContext(ctx context.Context) RouteTableOutput {
	return o
}

func (o RouteTableOutput) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return o.ToRouteTablePtrOutputWithContext(context.Background())
}

func (o RouteTableOutput) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return o.ApplyT(func(v RouteTable) *RouteTable {
		return &v
	}).(RouteTablePtrOutput)
}

type RouteTablePtrOutput struct {
	*pulumi.OutputState
}

func (RouteTablePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouteTable)(nil))
}

func (o RouteTablePtrOutput) ToRouteTablePtrOutput() RouteTablePtrOutput {
	return o
}

func (o RouteTablePtrOutput) ToRouteTablePtrOutputWithContext(ctx context.Context) RouteTablePtrOutput {
	return o
}

type RouteTableArrayOutput struct{ *pulumi.OutputState }

func (RouteTableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]RouteTable)(nil))
}

func (o RouteTableArrayOutput) ToRouteTableArrayOutput() RouteTableArrayOutput {
	return o
}

func (o RouteTableArrayOutput) ToRouteTableArrayOutputWithContext(ctx context.Context) RouteTableArrayOutput {
	return o
}

func (o RouteTableArrayOutput) Index(i pulumi.IntInput) RouteTableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) RouteTable {
		return vs[0].([]RouteTable)[vs[1].(int)]
	}).(RouteTableOutput)
}

type RouteTableMapOutput struct{ *pulumi.OutputState }

func (RouteTableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]RouteTable)(nil))
}

func (o RouteTableMapOutput) ToRouteTableMapOutput() RouteTableMapOutput {
	return o
}

func (o RouteTableMapOutput) ToRouteTableMapOutputWithContext(ctx context.Context) RouteTableMapOutput {
	return o
}

func (o RouteTableMapOutput) MapIndex(k pulumi.StringInput) RouteTableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) RouteTable {
		return vs[0].(map[string]RouteTable)[vs[1].(string)]
	}).(RouteTableOutput)
}

func init() {
	pulumi.RegisterOutputType(RouteTableOutput{})
	pulumi.RegisterOutputType(RouteTablePtrOutput{})
	pulumi.RegisterOutputType(RouteTableArrayOutput{})
	pulumi.RegisterOutputType(RouteTableMapOutput{})
}
