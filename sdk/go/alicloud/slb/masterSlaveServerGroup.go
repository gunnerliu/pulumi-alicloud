// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package slb

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// A master slave server group contains two ECS instances. The master slave server group can help you to define multiple listening dimension.
// 
// > **NOTE:** One ECS instance can be added into multiple master slave server groups.
// 
// > **NOTE:** One master slave server group can only add two ECS instances, which are master server and slave server.
// 
// > **NOTE:** One master slave server group can be attached with tcp/udp listeners in one load balancer.
// 
// > **NOTE:** One Classic and Internet load balancer, its master slave server group can add Classic and VPC ECS instances.
// 
// > **NOTE:** One Classic and Intranet load balancer, its master slave server group can only add Classic ECS instances.
// 
// > **NOTE:** One VPC load balancer, its master slave server group can only add the same VPC ECS instances.
// 
// > **NOTE:** Available in 1.54.0+
// 
// ## Block servers
// 
// The servers mapping supports the following:
// 
// * `serverIds` - (Required) A list backend server ID (ECS instance ID).
// * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
// * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
// * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.
// * `serverType` - (Optional) The server type of the backend server. Valid value Master, Slave.
// * `isBackup` - (Removed from v1.63.0) Determine if the server is executing. Valid value 0, 1. 
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/slb_master_slave_server_group.html.markdown.
type MasterSlaveServerGroup struct {
	s *pulumi.ResourceState
}

// NewMasterSlaveServerGroup registers a new resource with the given unique name, arguments, and options.
func NewMasterSlaveServerGroup(ctx *pulumi.Context,
	name string, args *MasterSlaveServerGroupArgs, opts ...pulumi.ResourceOpt) (*MasterSlaveServerGroup, error) {
	if args == nil || args.LoadBalancerId == nil {
		return nil, errors.New("missing required argument 'LoadBalancerId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["deleteProtectionValidation"] = nil
		inputs["loadBalancerId"] = nil
		inputs["name"] = nil
		inputs["servers"] = nil
	} else {
		inputs["deleteProtectionValidation"] = args.DeleteProtectionValidation
		inputs["loadBalancerId"] = args.LoadBalancerId
		inputs["name"] = args.Name
		inputs["servers"] = args.Servers
	}
	s, err := ctx.RegisterResource("alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MasterSlaveServerGroup{s: s}, nil
}

// GetMasterSlaveServerGroup gets an existing MasterSlaveServerGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMasterSlaveServerGroup(ctx *pulumi.Context,
	name string, id pulumi.ID, state *MasterSlaveServerGroupState, opts ...pulumi.ResourceOpt) (*MasterSlaveServerGroup, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["deleteProtectionValidation"] = state.DeleteProtectionValidation
		inputs["loadBalancerId"] = state.LoadBalancerId
		inputs["name"] = state.Name
		inputs["servers"] = state.Servers
	}
	s, err := ctx.ReadResource("alicloud:slb/masterSlaveServerGroup:MasterSlaveServerGroup", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &MasterSlaveServerGroup{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *MasterSlaveServerGroup) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *MasterSlaveServerGroup) ID() pulumi.IDOutput {
	return r.s.ID()
}

// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
func (r *MasterSlaveServerGroup) DeleteProtectionValidation() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["deleteProtectionValidation"])
}

// The Load Balancer ID which is used to launch a new master slave server group.
func (r *MasterSlaveServerGroup) LoadBalancerId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["loadBalancerId"])
}

// Name of the master slave server group. 
func (r *MasterSlaveServerGroup) Name() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["name"])
}

// A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
func (r *MasterSlaveServerGroup) Servers() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["servers"])
}

// Input properties used for looking up and filtering MasterSlaveServerGroup resources.
type MasterSlaveServerGroupState struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation interface{}
	// The Load Balancer ID which is used to launch a new master slave server group.
	LoadBalancerId interface{}
	// Name of the master slave server group. 
	Name interface{}
	// A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
	Servers interface{}
}

// The set of arguments for constructing a MasterSlaveServerGroup resource.
type MasterSlaveServerGroupArgs struct {
	// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
	DeleteProtectionValidation interface{}
	// The Load Balancer ID which is used to launch a new master slave server group.
	LoadBalancerId interface{}
	// Name of the master slave server group. 
	Name interface{}
	// A list of ECS instances to be added. Only two ECS instances can be supported in one resource. It contains six sub-fields as `Block server` follows.
	Servers interface{}
}