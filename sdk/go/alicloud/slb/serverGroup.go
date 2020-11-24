// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
// and to meet the personalized requirements of domain name and URL forwarding.
//
// > **NOTE:** One ECS instance can be added into multiple virtual server groups.
//
// > **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.
//
// > **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.
//
// > **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.
//
// > **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.
//
// ## Block servers
//
// The servers mapping supports the following:
//
// * `serverIds` - (Required) A list backend server ID (ECS instance ID).
// * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
// * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
// * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.
//
// ## Import
//
// Load balancer backend server group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:slb/serverGroup:ServerGroup example abc123456
// ```
type ServerGroup struct {
	pulumi.CustomResourceState

	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrOutput `pulumi:"deleteProtectionValidation"`
	// The Load Balancer ID which is used to launch a new virtual server group.
	LoadBalancerId pulumi.StringOutput `pulumi:"loadBalancerId"`
	// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
	Servers ServerGroupServerArrayOutput `pulumi:"servers"`
}

// NewServerGroup registers a new resource with the given unique name, arguments, and options.
func NewServerGroup(ctx *pulumi.Context,
	name string, args *ServerGroupArgs, opts ...pulumi.ResourceOption) (*ServerGroup, error) {
	if args == nil || args.LoadBalancerId == nil {
		return nil, errors.New("missing required argument 'LoadBalancerId'")
	}
	if args == nil {
		args = &ServerGroupArgs{}
	}
	var resource ServerGroup
	err := ctx.RegisterResource("alicloud:slb/serverGroup:ServerGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerGroup gets an existing ServerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerGroupState, opts ...pulumi.ResourceOption) (*ServerGroup, error) {
	var resource ServerGroup
	err := ctx.ReadResource("alicloud:slb/serverGroup:ServerGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerGroup resources.
type serverGroupState struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation *bool `pulumi:"deleteProtectionValidation"`
	// The Load Balancer ID which is used to launch a new virtual server group.
	LoadBalancerId *string `pulumi:"loadBalancerId"`
	// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
	Name *string `pulumi:"name"`
	// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
	Servers []ServerGroupServer `pulumi:"servers"`
}

type ServerGroupState struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrInput
	// The Load Balancer ID which is used to launch a new virtual server group.
	LoadBalancerId pulumi.StringPtrInput
	// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
	Name pulumi.StringPtrInput
	// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
	Servers ServerGroupServerArrayInput
}

func (ServerGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverGroupState)(nil)).Elem()
}

type serverGroupArgs struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation *bool `pulumi:"deleteProtectionValidation"`
	// The Load Balancer ID which is used to launch a new virtual server group.
	LoadBalancerId string `pulumi:"loadBalancerId"`
	// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
	Name *string `pulumi:"name"`
	// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
	Servers []ServerGroupServer `pulumi:"servers"`
}

// The set of arguments for constructing a ServerGroup resource.
type ServerGroupArgs struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation pulumi.BoolPtrInput
	// The Load Balancer ID which is used to launch a new virtual server group.
	LoadBalancerId pulumi.StringInput
	// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
	Name pulumi.StringPtrInput
	// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
	Servers ServerGroupServerArrayInput
}

func (ServerGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverGroupArgs)(nil)).Elem()
}

type ServerGroupInput interface {
	pulumi.Input

	ToServerGroupOutput() ServerGroupOutput
	ToServerGroupOutputWithContext(ctx context.Context) ServerGroupOutput
}

func (ServerGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerGroup)(nil)).Elem()
}

func (i ServerGroup) ToServerGroupOutput() ServerGroupOutput {
	return i.ToServerGroupOutputWithContext(context.Background())
}

func (i ServerGroup) ToServerGroupOutputWithContext(ctx context.Context) ServerGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerGroupOutput)
}

type ServerGroupOutput struct {
	*pulumi.OutputState
}

func (ServerGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServerGroupOutput)(nil)).Elem()
}

func (o ServerGroupOutput) ToServerGroupOutput() ServerGroupOutput {
	return o
}

func (o ServerGroupOutput) ToServerGroupOutputWithContext(ctx context.Context) ServerGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ServerGroupOutput{})
}
