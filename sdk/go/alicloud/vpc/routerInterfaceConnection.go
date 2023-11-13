// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vpc

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a VPC router interface connection resource to connect two router interfaces which are in two different VPCs.
// After that, all of the two router interfaces will be active.
//
// > **DEPRECATED:**  This resource  has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interface.
//
// > **NOTE:** At present, Router interface does not support changing opposite router interface, the connection delete action is only deactivating it to inactive, not modifying the connection to empty.
//
// > **NOTE:** If you want to changing opposite router interface, you can delete router interface and re-build them.
//
// > **NOTE:** A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
//
// > **NOTE:** Please remember to add a `dependsOn` clause in the router interface connection from the InitiatingSide to the AcceptingSide, because the connection from the AcceptingSide to the InitiatingSide must be done first.
//
// ## Example Usage
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
//			region := "cn-hangzhou"
//			if param := cfg.Get("region"); param != "" {
//				region = param
//			}
//			name := "alicloudRouterInterfaceConnectionBasic"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			fooNetwork, err := vpc.NewNetwork(ctx, "fooNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("172.16.0.0/12"),
//			})
//			if err != nil {
//				return err
//			}
//			barNetwork, err := vpc.NewNetwork(ctx, "barNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("192.168.0.0/16"),
//			}, pulumi.Provider(alicloud))
//			if err != nil {
//				return err
//			}
//			initiate, err := vpc.NewRouterInterface(ctx, "initiate", &vpc.RouterInterfaceArgs{
//				OppositeRegion:     pulumi.String(region),
//				RouterType:         pulumi.String("VRouter"),
//				RouterId:           fooNetwork.RouterId,
//				Role:               pulumi.String("InitiatingSide"),
//				Specification:      pulumi.String("Large.2"),
//				Description:        pulumi.String(name),
//				InstanceChargeType: pulumi.String("PostPaid"),
//			})
//			if err != nil {
//				return err
//			}
//			opposite, err := vpc.NewRouterInterface(ctx, "opposite", &vpc.RouterInterfaceArgs{
//				OppositeRegion: pulumi.String(region),
//				RouterType:     pulumi.String("VRouter"),
//				RouterId:       barNetwork.RouterId,
//				Role:           pulumi.String("AcceptingSide"),
//				Specification:  pulumi.String("Large.1"),
//				Description:    pulumi.String(fmt.Sprintf("%v-opposite", name)),
//			}, pulumi.Provider(alicloud))
//			if err != nil {
//				return err
//			}
//			barRouterInterfaceConnection, err := vpc.NewRouterInterfaceConnection(ctx, "barRouterInterfaceConnection", &vpc.RouterInterfaceConnectionArgs{
//				InterfaceId:         opposite.ID(),
//				OppositeInterfaceId: initiate.ID(),
//			}, pulumi.Provider(alicloud))
//			if err != nil {
//				return err
//			}
//			_, err = vpc.NewRouterInterfaceConnection(ctx, "fooRouterInterfaceConnection", &vpc.RouterInterfaceConnectionArgs{
//				InterfaceId:         initiate.ID(),
//				OppositeInterfaceId: opposite.ID(),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				barRouterInterfaceConnection,
//			}))
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
// The router interface connection can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection foo ri-abc123456
//
// ```
type RouterInterfaceConnection struct {
	pulumi.CustomResourceState

	// One side router interface ID.
	InterfaceId pulumi.StringOutput `pulumi:"interfaceId"`
	// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
	OppositeInterfaceId pulumi.StringOutput `pulumi:"oppositeInterfaceId"`
	// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
	OppositeInterfaceOwnerId pulumi.StringOutput `pulumi:"oppositeInterfaceOwnerId"`
	// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
	OppositeRouterId pulumi.StringOutput `pulumi:"oppositeRouterId"`
	// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
	//
	// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
	OppositeRouterType pulumi.StringPtrOutput `pulumi:"oppositeRouterType"`
}

// NewRouterInterfaceConnection registers a new resource with the given unique name, arguments, and options.
func NewRouterInterfaceConnection(ctx *pulumi.Context,
	name string, args *RouterInterfaceConnectionArgs, opts ...pulumi.ResourceOption) (*RouterInterfaceConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'InterfaceId'")
	}
	if args.OppositeInterfaceId == nil {
		return nil, errors.New("invalid value for required argument 'OppositeInterfaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RouterInterfaceConnection
	err := ctx.RegisterResource("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRouterInterfaceConnection gets an existing RouterInterfaceConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRouterInterfaceConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RouterInterfaceConnectionState, opts ...pulumi.ResourceOption) (*RouterInterfaceConnection, error) {
	var resource RouterInterfaceConnection
	err := ctx.ReadResource("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RouterInterfaceConnection resources.
type routerInterfaceConnectionState struct {
	// One side router interface ID.
	InterfaceId *string `pulumi:"interfaceId"`
	// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
	OppositeInterfaceId *string `pulumi:"oppositeInterfaceId"`
	// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
	OppositeInterfaceOwnerId *string `pulumi:"oppositeInterfaceOwnerId"`
	// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
	OppositeRouterId *string `pulumi:"oppositeRouterId"`
	// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
	//
	// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
	OppositeRouterType *string `pulumi:"oppositeRouterType"`
}

type RouterInterfaceConnectionState struct {
	// One side router interface ID.
	InterfaceId pulumi.StringPtrInput
	// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
	OppositeInterfaceId pulumi.StringPtrInput
	// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
	OppositeInterfaceOwnerId pulumi.StringPtrInput
	// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
	OppositeRouterId pulumi.StringPtrInput
	// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
	//
	// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
	OppositeRouterType pulumi.StringPtrInput
}

func (RouterInterfaceConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*routerInterfaceConnectionState)(nil)).Elem()
}

type routerInterfaceConnectionArgs struct {
	// One side router interface ID.
	InterfaceId string `pulumi:"interfaceId"`
	// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
	OppositeInterfaceId string `pulumi:"oppositeInterfaceId"`
	// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
	OppositeInterfaceOwnerId *string `pulumi:"oppositeInterfaceOwnerId"`
	// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
	OppositeRouterId *string `pulumi:"oppositeRouterId"`
	// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
	//
	// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
	OppositeRouterType *string `pulumi:"oppositeRouterType"`
}

// The set of arguments for constructing a RouterInterfaceConnection resource.
type RouterInterfaceConnectionArgs struct {
	// One side router interface ID.
	InterfaceId pulumi.StringInput
	// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
	OppositeInterfaceId pulumi.StringInput
	// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
	OppositeInterfaceOwnerId pulumi.StringPtrInput
	// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
	OppositeRouterId pulumi.StringPtrInput
	// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
	//
	// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
	OppositeRouterType pulumi.StringPtrInput
}

func (RouterInterfaceConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*routerInterfaceConnectionArgs)(nil)).Elem()
}

type RouterInterfaceConnectionInput interface {
	pulumi.Input

	ToRouterInterfaceConnectionOutput() RouterInterfaceConnectionOutput
	ToRouterInterfaceConnectionOutputWithContext(ctx context.Context) RouterInterfaceConnectionOutput
}

func (*RouterInterfaceConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterInterfaceConnection)(nil)).Elem()
}

func (i *RouterInterfaceConnection) ToRouterInterfaceConnectionOutput() RouterInterfaceConnectionOutput {
	return i.ToRouterInterfaceConnectionOutputWithContext(context.Background())
}

func (i *RouterInterfaceConnection) ToRouterInterfaceConnectionOutputWithContext(ctx context.Context) RouterInterfaceConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterInterfaceConnectionOutput)
}

// RouterInterfaceConnectionArrayInput is an input type that accepts RouterInterfaceConnectionArray and RouterInterfaceConnectionArrayOutput values.
// You can construct a concrete instance of `RouterInterfaceConnectionArrayInput` via:
//
//	RouterInterfaceConnectionArray{ RouterInterfaceConnectionArgs{...} }
type RouterInterfaceConnectionArrayInput interface {
	pulumi.Input

	ToRouterInterfaceConnectionArrayOutput() RouterInterfaceConnectionArrayOutput
	ToRouterInterfaceConnectionArrayOutputWithContext(context.Context) RouterInterfaceConnectionArrayOutput
}

type RouterInterfaceConnectionArray []RouterInterfaceConnectionInput

func (RouterInterfaceConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterInterfaceConnection)(nil)).Elem()
}

func (i RouterInterfaceConnectionArray) ToRouterInterfaceConnectionArrayOutput() RouterInterfaceConnectionArrayOutput {
	return i.ToRouterInterfaceConnectionArrayOutputWithContext(context.Background())
}

func (i RouterInterfaceConnectionArray) ToRouterInterfaceConnectionArrayOutputWithContext(ctx context.Context) RouterInterfaceConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterInterfaceConnectionArrayOutput)
}

// RouterInterfaceConnectionMapInput is an input type that accepts RouterInterfaceConnectionMap and RouterInterfaceConnectionMapOutput values.
// You can construct a concrete instance of `RouterInterfaceConnectionMapInput` via:
//
//	RouterInterfaceConnectionMap{ "key": RouterInterfaceConnectionArgs{...} }
type RouterInterfaceConnectionMapInput interface {
	pulumi.Input

	ToRouterInterfaceConnectionMapOutput() RouterInterfaceConnectionMapOutput
	ToRouterInterfaceConnectionMapOutputWithContext(context.Context) RouterInterfaceConnectionMapOutput
}

type RouterInterfaceConnectionMap map[string]RouterInterfaceConnectionInput

func (RouterInterfaceConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterInterfaceConnection)(nil)).Elem()
}

func (i RouterInterfaceConnectionMap) ToRouterInterfaceConnectionMapOutput() RouterInterfaceConnectionMapOutput {
	return i.ToRouterInterfaceConnectionMapOutputWithContext(context.Background())
}

func (i RouterInterfaceConnectionMap) ToRouterInterfaceConnectionMapOutputWithContext(ctx context.Context) RouterInterfaceConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RouterInterfaceConnectionMapOutput)
}

type RouterInterfaceConnectionOutput struct{ *pulumi.OutputState }

func (RouterInterfaceConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RouterInterfaceConnection)(nil)).Elem()
}

func (o RouterInterfaceConnectionOutput) ToRouterInterfaceConnectionOutput() RouterInterfaceConnectionOutput {
	return o
}

func (o RouterInterfaceConnectionOutput) ToRouterInterfaceConnectionOutputWithContext(ctx context.Context) RouterInterfaceConnectionOutput {
	return o
}

// One side router interface ID.
func (o RouterInterfaceConnectionOutput) InterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterInterfaceConnection) pulumi.StringOutput { return v.InterfaceId }).(pulumi.StringOutput)
}

// Another side router interface ID. It must belong the specified "oppositeInterfaceOwnerId" account.
func (o RouterInterfaceConnectionOutput) OppositeInterfaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterInterfaceConnection) pulumi.StringOutput { return v.OppositeInterfaceId }).(pulumi.StringOutput)
}

// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info > Account Management to check the account ID. Default to Provider account_id.
func (o RouterInterfaceConnectionOutput) OppositeInterfaceOwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterInterfaceConnection) pulumi.StringOutput { return v.OppositeInterfaceOwnerId }).(pulumi.StringOutput)
}

// Another side router ID. It must belong the specified "oppositeInterfaceOwnerId" account. It is valid when field "oppositeInterfaceOwnerId" is specified.
func (o RouterInterfaceConnectionOutput) OppositeRouterId() pulumi.StringOutput {
	return o.ApplyT(func(v *RouterInterfaceConnection) pulumi.StringOutput { return v.OppositeRouterId }).(pulumi.StringOutput)
}

// Another side router Type. Optional value: VRouter, VBR. It is valid when field "oppositeInterfaceOwnerId" is specified.
//
// > **NOTE:** The value of "oppositeInterfaceOwnerId" or "accountId" must be main account and not be sub account.
func (o RouterInterfaceConnectionOutput) OppositeRouterType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RouterInterfaceConnection) pulumi.StringPtrOutput { return v.OppositeRouterType }).(pulumi.StringPtrOutput)
}

type RouterInterfaceConnectionArrayOutput struct{ *pulumi.OutputState }

func (RouterInterfaceConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RouterInterfaceConnection)(nil)).Elem()
}

func (o RouterInterfaceConnectionArrayOutput) ToRouterInterfaceConnectionArrayOutput() RouterInterfaceConnectionArrayOutput {
	return o
}

func (o RouterInterfaceConnectionArrayOutput) ToRouterInterfaceConnectionArrayOutputWithContext(ctx context.Context) RouterInterfaceConnectionArrayOutput {
	return o
}

func (o RouterInterfaceConnectionArrayOutput) Index(i pulumi.IntInput) RouterInterfaceConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RouterInterfaceConnection {
		return vs[0].([]*RouterInterfaceConnection)[vs[1].(int)]
	}).(RouterInterfaceConnectionOutput)
}

type RouterInterfaceConnectionMapOutput struct{ *pulumi.OutputState }

func (RouterInterfaceConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RouterInterfaceConnection)(nil)).Elem()
}

func (o RouterInterfaceConnectionMapOutput) ToRouterInterfaceConnectionMapOutput() RouterInterfaceConnectionMapOutput {
	return o
}

func (o RouterInterfaceConnectionMapOutput) ToRouterInterfaceConnectionMapOutputWithContext(ctx context.Context) RouterInterfaceConnectionMapOutput {
	return o
}

func (o RouterInterfaceConnectionMapOutput) MapIndex(k pulumi.StringInput) RouterInterfaceConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RouterInterfaceConnection {
		return vs[0].(map[string]*RouterInterfaceConnection)[vs[1].(string)]
	}).(RouterInterfaceConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RouterInterfaceConnectionInput)(nil)).Elem(), &RouterInterfaceConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterInterfaceConnectionArrayInput)(nil)).Elem(), RouterInterfaceConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RouterInterfaceConnectionMapInput)(nil)).Elem(), RouterInterfaceConnectionMap{})
	pulumi.RegisterOutputType(RouterInterfaceConnectionOutput{})
	pulumi.RegisterOutputType(RouterInterfaceConnectionArrayOutput{})
	pulumi.RegisterOutputType(RouterInterfaceConnectionMapOutput{})
}
