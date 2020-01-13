// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Attaches/Detaches vserver groups to a specified scaling group.
// 
// > **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.
// 
// > **NOTE:** If scaling group's network type is `VPC`, the vserver groups must be in the same `VPC`.
//  
// > **NOTE:** A scaling group can have at most 5 vserver groups attached by default.
// 
// > **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.
// 
// > **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.
// 
// > **NOTE:** Detach action will be executed before attach action.
// 
// > **NOTE:** Vserver group is defined uniquely by `loadbalancerId`, `vserverGroupId`, `port`.
// 
// > **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.
// 
// > **NOTE:** Resource `ess.ScalingGroupVServerGroups` is available in 1.53.0+.
// 
// ## Block vserverGroup
// 
// the vserverGroup supports the following:
// 
// * `loadbalancerId` - (Required) Loadbalancer server ID of VServer Group.
// * `vserverAttributes` - (Required) A list of VServer Group attributes. See Block vserverAttribute below for details.
// 
// ## Block vserverAttribute
// 
// * `vserverGroupId` - (Required) ID of VServer Group.
// * `port` - (Required) - The port will be used for VServer Group backend server.
// * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/ess_scalinggroup_vserver_groups.html.markdown.
type ScalingGroupVServerGroups struct {
	s *pulumi.ResourceState
}

// NewScalingGroupVServerGroups registers a new resource with the given unique name, arguments, and options.
func NewScalingGroupVServerGroups(ctx *pulumi.Context,
	name string, args *ScalingGroupVServerGroupsArgs, opts ...pulumi.ResourceOpt) (*ScalingGroupVServerGroups, error) {
	if args == nil || args.ScalingGroupId == nil {
		return nil, errors.New("missing required argument 'ScalingGroupId'")
	}
	if args == nil || args.VserverGroups == nil {
		return nil, errors.New("missing required argument 'VserverGroups'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["force"] = nil
		inputs["scalingGroupId"] = nil
		inputs["vserverGroups"] = nil
	} else {
		inputs["force"] = args.Force
		inputs["scalingGroupId"] = args.ScalingGroupId
		inputs["vserverGroups"] = args.VserverGroups
	}
	s, err := ctx.RegisterResource("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ScalingGroupVServerGroups{s: s}, nil
}

// GetScalingGroupVServerGroups gets an existing ScalingGroupVServerGroups resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScalingGroupVServerGroups(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ScalingGroupVServerGroupsState, opts ...pulumi.ResourceOpt) (*ScalingGroupVServerGroups, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["force"] = state.Force
		inputs["scalingGroupId"] = state.ScalingGroupId
		inputs["vserverGroups"] = state.VserverGroups
	}
	s, err := ctx.ReadResource("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ScalingGroupVServerGroups{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *ScalingGroupVServerGroups) URN() pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *ScalingGroupVServerGroups) ID() pulumi.IDOutput {
	return r.s.ID()
}

// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
func (r *ScalingGroupVServerGroups) Force() pulumi.BoolOutput {
	return (pulumi.BoolOutput)(r.s.State["force"])
}

// ID of the scaling group.
func (r *ScalingGroupVServerGroups) ScalingGroupId() pulumi.StringOutput {
	return (pulumi.StringOutput)(r.s.State["scalingGroupId"])
}

// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
func (r *ScalingGroupVServerGroups) VserverGroups() pulumi.ArrayOutput {
	return (pulumi.ArrayOutput)(r.s.State["vserverGroups"])
}

// Input properties used for looking up and filtering ScalingGroupVServerGroups resources.
type ScalingGroupVServerGroupsState struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force interface{}
	// ID of the scaling group.
	ScalingGroupId interface{}
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups interface{}
}

// The set of arguments for constructing a ScalingGroupVServerGroups resource.
type ScalingGroupVServerGroupsArgs struct {
	// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
	Force interface{}
	// ID of the scaling group.
	ScalingGroupId interface{}
	// A list of vserver groups attached on scaling group. See Block vserverGroup below for details.
	VserverGroups interface{}
}