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

// Provides a Cen Transit Router Multicast Domain Source resource.
//
// For information about Cen Transit Router Multicast Domain Source and how to use it, see [What is Transit Router Multicast Domain Source](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-cbn-2017-09-12-registertransitroutermulticastgroupsources).
//
// > **NOTE:** Available since v1.195.0.
//
// ## Import
//
// Cen Transit Router Multicast Domain Source can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource example <transit_router_multicast_domain_id>:<group_ip_address>:<network_interface_id>
//
// ```
type TransitRouterMulticastDomainSource struct {
	pulumi.CustomResourceState

	// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
	GroupIpAddress pulumi.StringOutput `pulumi:"groupIpAddress"`
	// ENI ID of the multicast source.
	NetworkInterfaceId pulumi.StringOutput `pulumi:"networkInterfaceId"`
	// The status of the resource
	Status pulumi.StringOutput `pulumi:"status"`
	// The ID of the multicast domain to which the multicast source belongs.
	TransitRouterMulticastDomainId pulumi.StringOutput `pulumi:"transitRouterMulticastDomainId"`
	// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
	VpcId pulumi.StringOutput `pulumi:"vpcId"`
}

// NewTransitRouterMulticastDomainSource registers a new resource with the given unique name, arguments, and options.
func NewTransitRouterMulticastDomainSource(ctx *pulumi.Context,
	name string, args *TransitRouterMulticastDomainSourceArgs, opts ...pulumi.ResourceOption) (*TransitRouterMulticastDomainSource, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GroupIpAddress == nil {
		return nil, errors.New("invalid value for required argument 'GroupIpAddress'")
	}
	if args.NetworkInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'NetworkInterfaceId'")
	}
	if args.TransitRouterMulticastDomainId == nil {
		return nil, errors.New("invalid value for required argument 'TransitRouterMulticastDomainId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TransitRouterMulticastDomainSource
	err := ctx.RegisterResource("alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTransitRouterMulticastDomainSource gets an existing TransitRouterMulticastDomainSource resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTransitRouterMulticastDomainSource(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TransitRouterMulticastDomainSourceState, opts ...pulumi.ResourceOption) (*TransitRouterMulticastDomainSource, error) {
	var resource TransitRouterMulticastDomainSource
	err := ctx.ReadResource("alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TransitRouterMulticastDomainSource resources.
type transitRouterMulticastDomainSourceState struct {
	// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
	GroupIpAddress *string `pulumi:"groupIpAddress"`
	// ENI ID of the multicast source.
	NetworkInterfaceId *string `pulumi:"networkInterfaceId"`
	// The status of the resource
	Status *string `pulumi:"status"`
	// The ID of the multicast domain to which the multicast source belongs.
	TransitRouterMulticastDomainId *string `pulumi:"transitRouterMulticastDomainId"`
	// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
	VpcId *string `pulumi:"vpcId"`
}

type TransitRouterMulticastDomainSourceState struct {
	// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
	GroupIpAddress pulumi.StringPtrInput
	// ENI ID of the multicast source.
	NetworkInterfaceId pulumi.StringPtrInput
	// The status of the resource
	Status pulumi.StringPtrInput
	// The ID of the multicast domain to which the multicast source belongs.
	TransitRouterMulticastDomainId pulumi.StringPtrInput
	// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
	VpcId pulumi.StringPtrInput
}

func (TransitRouterMulticastDomainSourceState) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterMulticastDomainSourceState)(nil)).Elem()
}

type transitRouterMulticastDomainSourceArgs struct {
	// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
	GroupIpAddress string `pulumi:"groupIpAddress"`
	// ENI ID of the multicast source.
	NetworkInterfaceId string `pulumi:"networkInterfaceId"`
	// The ID of the multicast domain to which the multicast source belongs.
	TransitRouterMulticastDomainId string `pulumi:"transitRouterMulticastDomainId"`
	// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
	VpcId *string `pulumi:"vpcId"`
}

// The set of arguments for constructing a TransitRouterMulticastDomainSource resource.
type TransitRouterMulticastDomainSourceArgs struct {
	// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
	GroupIpAddress pulumi.StringInput
	// ENI ID of the multicast source.
	NetworkInterfaceId pulumi.StringInput
	// The ID of the multicast domain to which the multicast source belongs.
	TransitRouterMulticastDomainId pulumi.StringInput
	// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
	VpcId pulumi.StringPtrInput
}

func (TransitRouterMulticastDomainSourceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*transitRouterMulticastDomainSourceArgs)(nil)).Elem()
}

type TransitRouterMulticastDomainSourceInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainSourceOutput() TransitRouterMulticastDomainSourceOutput
	ToTransitRouterMulticastDomainSourceOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceOutput
}

func (*TransitRouterMulticastDomainSource) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (i *TransitRouterMulticastDomainSource) ToTransitRouterMulticastDomainSourceOutput() TransitRouterMulticastDomainSourceOutput {
	return i.ToTransitRouterMulticastDomainSourceOutputWithContext(context.Background())
}

func (i *TransitRouterMulticastDomainSource) ToTransitRouterMulticastDomainSourceOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainSourceOutput)
}

// TransitRouterMulticastDomainSourceArrayInput is an input type that accepts TransitRouterMulticastDomainSourceArray and TransitRouterMulticastDomainSourceArrayOutput values.
// You can construct a concrete instance of `TransitRouterMulticastDomainSourceArrayInput` via:
//
//	TransitRouterMulticastDomainSourceArray{ TransitRouterMulticastDomainSourceArgs{...} }
type TransitRouterMulticastDomainSourceArrayInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainSourceArrayOutput() TransitRouterMulticastDomainSourceArrayOutput
	ToTransitRouterMulticastDomainSourceArrayOutputWithContext(context.Context) TransitRouterMulticastDomainSourceArrayOutput
}

type TransitRouterMulticastDomainSourceArray []TransitRouterMulticastDomainSourceInput

func (TransitRouterMulticastDomainSourceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (i TransitRouterMulticastDomainSourceArray) ToTransitRouterMulticastDomainSourceArrayOutput() TransitRouterMulticastDomainSourceArrayOutput {
	return i.ToTransitRouterMulticastDomainSourceArrayOutputWithContext(context.Background())
}

func (i TransitRouterMulticastDomainSourceArray) ToTransitRouterMulticastDomainSourceArrayOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainSourceArrayOutput)
}

// TransitRouterMulticastDomainSourceMapInput is an input type that accepts TransitRouterMulticastDomainSourceMap and TransitRouterMulticastDomainSourceMapOutput values.
// You can construct a concrete instance of `TransitRouterMulticastDomainSourceMapInput` via:
//
//	TransitRouterMulticastDomainSourceMap{ "key": TransitRouterMulticastDomainSourceArgs{...} }
type TransitRouterMulticastDomainSourceMapInput interface {
	pulumi.Input

	ToTransitRouterMulticastDomainSourceMapOutput() TransitRouterMulticastDomainSourceMapOutput
	ToTransitRouterMulticastDomainSourceMapOutputWithContext(context.Context) TransitRouterMulticastDomainSourceMapOutput
}

type TransitRouterMulticastDomainSourceMap map[string]TransitRouterMulticastDomainSourceInput

func (TransitRouterMulticastDomainSourceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (i TransitRouterMulticastDomainSourceMap) ToTransitRouterMulticastDomainSourceMapOutput() TransitRouterMulticastDomainSourceMapOutput {
	return i.ToTransitRouterMulticastDomainSourceMapOutputWithContext(context.Background())
}

func (i TransitRouterMulticastDomainSourceMap) ToTransitRouterMulticastDomainSourceMapOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TransitRouterMulticastDomainSourceMapOutput)
}

type TransitRouterMulticastDomainSourceOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainSourceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (o TransitRouterMulticastDomainSourceOutput) ToTransitRouterMulticastDomainSourceOutput() TransitRouterMulticastDomainSourceOutput {
	return o
}

func (o TransitRouterMulticastDomainSourceOutput) ToTransitRouterMulticastDomainSourceOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceOutput {
	return o
}

// The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
func (o TransitRouterMulticastDomainSourceOutput) GroupIpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainSource) pulumi.StringOutput { return v.GroupIpAddress }).(pulumi.StringOutput)
}

// ENI ID of the multicast source.
func (o TransitRouterMulticastDomainSourceOutput) NetworkInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainSource) pulumi.StringOutput { return v.NetworkInterfaceId }).(pulumi.StringOutput)
}

// The status of the resource
func (o TransitRouterMulticastDomainSourceOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainSource) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The ID of the multicast domain to which the multicast source belongs.
func (o TransitRouterMulticastDomainSourceOutput) TransitRouterMulticastDomainId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainSource) pulumi.StringOutput {
		return v.TransitRouterMulticastDomainId
	}).(pulumi.StringOutput)
}

// The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
func (o TransitRouterMulticastDomainSourceOutput) VpcId() pulumi.StringOutput {
	return o.ApplyT(func(v *TransitRouterMulticastDomainSource) pulumi.StringOutput { return v.VpcId }).(pulumi.StringOutput)
}

type TransitRouterMulticastDomainSourceArrayOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainSourceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (o TransitRouterMulticastDomainSourceArrayOutput) ToTransitRouterMulticastDomainSourceArrayOutput() TransitRouterMulticastDomainSourceArrayOutput {
	return o
}

func (o TransitRouterMulticastDomainSourceArrayOutput) ToTransitRouterMulticastDomainSourceArrayOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceArrayOutput {
	return o
}

func (o TransitRouterMulticastDomainSourceArrayOutput) Index(i pulumi.IntInput) TransitRouterMulticastDomainSourceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TransitRouterMulticastDomainSource {
		return vs[0].([]*TransitRouterMulticastDomainSource)[vs[1].(int)]
	}).(TransitRouterMulticastDomainSourceOutput)
}

type TransitRouterMulticastDomainSourceMapOutput struct{ *pulumi.OutputState }

func (TransitRouterMulticastDomainSourceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TransitRouterMulticastDomainSource)(nil)).Elem()
}

func (o TransitRouterMulticastDomainSourceMapOutput) ToTransitRouterMulticastDomainSourceMapOutput() TransitRouterMulticastDomainSourceMapOutput {
	return o
}

func (o TransitRouterMulticastDomainSourceMapOutput) ToTransitRouterMulticastDomainSourceMapOutputWithContext(ctx context.Context) TransitRouterMulticastDomainSourceMapOutput {
	return o
}

func (o TransitRouterMulticastDomainSourceMapOutput) MapIndex(k pulumi.StringInput) TransitRouterMulticastDomainSourceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TransitRouterMulticastDomainSource {
		return vs[0].(map[string]*TransitRouterMulticastDomainSource)[vs[1].(string)]
	}).(TransitRouterMulticastDomainSourceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainSourceInput)(nil)).Elem(), &TransitRouterMulticastDomainSource{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainSourceArrayInput)(nil)).Elem(), TransitRouterMulticastDomainSourceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TransitRouterMulticastDomainSourceMapInput)(nil)).Elem(), TransitRouterMulticastDomainSourceMap{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainSourceOutput{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainSourceArrayOutput{})
	pulumi.RegisterOutputType(TransitRouterMulticastDomainSourceMapOutput{})
}
