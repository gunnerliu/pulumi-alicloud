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
// Router entry can be imported using the id, e.g (formatted as<route_table_id:router_id:destination_cidrblock:nexthop_type:nexthop_id>).
//
// ```sh
//  $ pulumi import alicloud:vpc/routeEntry:RouteEntry example vtb-123456:vrt-123456:0.0.0.0/0:NatGateway:ngw-123456
// ```
type RouteEntry struct {
	pulumi.CustomResourceState

	// The RouteEntry's target network segment.
	DestinationCidrblock pulumi.StringPtrOutput `pulumi:"destinationCidrblock"`
	// The name of the route entry. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	Name pulumi.StringOutput `pulumi:"name"`
	// The route entry's next hop. ECS instance ID or VPC router interface ID.
	NexthopId pulumi.StringPtrOutput `pulumi:"nexthopId"`
	// The next hop type. Available values:
	NexthopType pulumi.StringPtrOutput `pulumi:"nexthopType"`
	// The ID of the route table.
	RouteTableId pulumi.StringOutput `pulumi:"routeTableId"`
	// This argument has beeb deprecated. Please use other arguments to launch a custom route entry.
	//
	// Deprecated: Attribute router_id has been deprecated and suggest removing it from your template.
	RouterId pulumi.StringOutput `pulumi:"routerId"`
}

// NewRouteEntry registers a new resource with the given unique name, arguments, and options.
func NewRouteEntry(ctx *pulumi.Context,
	name string, args *RouteEntryArgs, opts ...pulumi.ResourceOption) (*RouteEntry, error) {
	if args == nil || args.RouteTableId == nil {
		return nil, errors.New("missing required argument 'RouteTableId'")
	}
	if args == nil {
		args = &RouteEntryArgs{}
	}
	var resource RouteEntry
	err := ctx.RegisterResource("alicloud:vpc/routeEntry:RouteEntry", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouteEntry gets an existing RouteEntry resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouteEntry(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouteEntryState, opts ...pulumi.ResourceOption) (*RouteEntry, error) {
	var resource RouteEntry
	err := ctx.ReadResource("alicloud:vpc/routeEntry:RouteEntry", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouteEntry resources.
type routeEntryState struct {
	// The RouteEntry's target network segment.
	DestinationCidrblock *string `pulumi:"destinationCidrblock"`
	// The name of the route entry. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	Name *string `pulumi:"name"`
	// The route entry's next hop. ECS instance ID or VPC router interface ID.
	NexthopId *string `pulumi:"nexthopId"`
	// The next hop type. Available values:
	NexthopType *string `pulumi:"nexthopType"`
	// The ID of the route table.
	RouteTableId *string `pulumi:"routeTableId"`
	// This argument has beeb deprecated. Please use other arguments to launch a custom route entry.
	//
	// Deprecated: Attribute router_id has been deprecated and suggest removing it from your template.
	RouterId *string `pulumi:"routerId"`
}

type RouteEntryState struct {
	// The RouteEntry's target network segment.
	DestinationCidrblock pulumi.StringPtrInput
	// The name of the route entry. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	Name pulumi.StringPtrInput
	// The route entry's next hop. ECS instance ID or VPC router interface ID.
	NexthopId pulumi.StringPtrInput
	// The next hop type. Available values:
	NexthopType pulumi.StringPtrInput
	// The ID of the route table.
	RouteTableId pulumi.StringPtrInput
	// This argument has beeb deprecated. Please use other arguments to launch a custom route entry.
	//
	// Deprecated: Attribute router_id has been deprecated and suggest removing it from your template.
	RouterId pulumi.StringPtrInput
}

func (RouteEntryState) ElementType() reflect.Type {
	return reflect.TypeOf((*routeEntryState)(nil)).Elem()
}

type routeEntryArgs struct {
	// The RouteEntry's target network segment.
	DestinationCidrblock *string `pulumi:"destinationCidrblock"`
	// The name of the route entry. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	Name *string `pulumi:"name"`
	// The route entry's next hop. ECS instance ID or VPC router interface ID.
	NexthopId *string `pulumi:"nexthopId"`
	// The next hop type. Available values:
	NexthopType *string `pulumi:"nexthopType"`
	// The ID of the route table.
	RouteTableId string `pulumi:"routeTableId"`
	// This argument has beeb deprecated. Please use other arguments to launch a custom route entry.
	//
	// Deprecated: Attribute router_id has been deprecated and suggest removing it from your template.
	RouterId *string `pulumi:"routerId"`
}

// The set of arguments for constructing a RouteEntry resource.
type RouteEntryArgs struct {
	// The RouteEntry's target network segment.
	DestinationCidrblock pulumi.StringPtrInput
	// The name of the route entry. This name can have a string of 2 to 128 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin or end with a hyphen, and must not begin with http:// or https://.
	Name pulumi.StringPtrInput
	// The route entry's next hop. ECS instance ID or VPC router interface ID.
	NexthopId pulumi.StringPtrInput
	// The next hop type. Available values:
	NexthopType pulumi.StringPtrInput
	// The ID of the route table.
	RouteTableId pulumi.StringInput
	// This argument has beeb deprecated. Please use other arguments to launch a custom route entry.
	//
	// Deprecated: Attribute router_id has been deprecated and suggest removing it from your template.
	RouterId pulumi.StringPtrInput
}

func (RouteEntryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routeEntryArgs)(nil)).Elem()
}

type RouteEntryInput interface {
	pulumi.Input

	ToRouteEntryOutput() RouteEntryOutput
	ToRouteEntryOutputWithContext(ctx context.Context) RouteEntryOutput
}

func (RouteEntry) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteEntry)(nil)).Elem()
}

func (i RouteEntry) ToRouteEntryOutput() RouteEntryOutput {
	return i.ToRouteEntryOutputWithContext(context.Background())
}

func (i RouteEntry) ToRouteEntryOutputWithContext(ctx context.Context) RouteEntryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouteEntryOutput)
}

type RouteEntryOutput struct {
	*pulumi.OutputState
}

func (RouteEntryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*RouteEntryOutput)(nil)).Elem()
}

func (o RouteEntryOutput) ToRouteEntryOutput() RouteEntryOutput {
	return o
}

func (o RouteEntryOutput) ToRouteEntryOutputWithContext(ctx context.Context) RouteEntryOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(RouteEntryOutput{})
}
