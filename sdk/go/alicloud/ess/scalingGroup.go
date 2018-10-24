// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a ESS scaling group resource which is a collection of ECS instances with the same application scenarios.
// 
// It defines the maximum and minimum numbers of ECS instances in the group, and their associated Server Load Balancer instances, RDS instances, and other attributes.
// 
// ~> **NOTE:** You can launch an ESS scaling group for a VPC network via specifying parameter `vswitch_ids`.
type ScalingGroup struct {
	s *pulumi.ResourceState
}

// NewScalingGroup registers a new resource with the given unique name, arguments, and options.
func NewScalingGroup(ctx *pulumi.Context,
	name string, args *ScalingGroupArgs, opts ...pulumi.ResourceOpt) (*ScalingGroup, error) {
	if args == nil || args.MaxSize == nil {
		return nil, errors.New("missing required argument 'MaxSize'")
	}
	if args == nil || args.MinSize == nil {
		return nil, errors.New("missing required argument 'MinSize'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["dbInstanceIds"] = nil
		inputs["defaultCooldown"] = nil
		inputs["loadbalancerIds"] = nil
		inputs["maxSize"] = nil
		inputs["minSize"] = nil
		inputs["multiAzPolicy"] = nil
		inputs["removalPolicies"] = nil
		inputs["scalingGroupName"] = nil
		inputs["vswitchId"] = nil
		inputs["vswitchIds"] = nil
	} else {
		inputs["dbInstanceIds"] = args.DbInstanceIds
		inputs["defaultCooldown"] = args.DefaultCooldown
		inputs["loadbalancerIds"] = args.LoadbalancerIds
		inputs["maxSize"] = args.MaxSize
		inputs["minSize"] = args.MinSize
		inputs["multiAzPolicy"] = args.MultiAzPolicy
		inputs["removalPolicies"] = args.RemovalPolicies
		inputs["scalingGroupName"] = args.ScalingGroupName
		inputs["vswitchId"] = args.VswitchId
		inputs["vswitchIds"] = args.VswitchIds
	}
	s, err := ctx.RegisterResource("alicloud:ess/scalingGroup:ScalingGroup", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ScalingGroup{s: s}, nil
}

// GetScalingGroup gets an existing ScalingGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScalingGroup(ctx *pulumi.Context,
	name string, id pulumi.ID, state *ScalingGroupState, opts ...pulumi.ResourceOpt) (*ScalingGroup, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["dbInstanceIds"] = state.DbInstanceIds
		inputs["defaultCooldown"] = state.DefaultCooldown
		inputs["loadbalancerIds"] = state.LoadbalancerIds
		inputs["maxSize"] = state.MaxSize
		inputs["minSize"] = state.MinSize
		inputs["multiAzPolicy"] = state.MultiAzPolicy
		inputs["removalPolicies"] = state.RemovalPolicies
		inputs["scalingGroupName"] = state.ScalingGroupName
		inputs["vswitchId"] = state.VswitchId
		inputs["vswitchIds"] = state.VswitchIds
	}
	s, err := ctx.ReadResource("alicloud:ess/scalingGroup:ScalingGroup", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &ScalingGroup{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *ScalingGroup) URN() *pulumi.URNOutput {
	return r.s.URN
}

// ID is this resource's unique identifier assigned by its provider.
func (r *ScalingGroup) ID() *pulumi.IDOutput {
	return r.s.ID
}

// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
// - The specified RDS instance must be in running status.
// - The specified RDS instance’s whitelist must have room for more IP addresses.
func (r *ScalingGroup) DbInstanceIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["dbInstanceIds"])
}

// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
func (r *ScalingGroup) DefaultCooldown() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["defaultCooldown"])
}

// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
// - The Server Load Balancer instance must be enabled.
// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
// targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
func (r *ScalingGroup) LoadbalancerIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["loadbalancerIds"])
}

// Maximum number of ECS instances in the scaling group. Value range: [0, 100].
func (r *ScalingGroup) MaxSize() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["maxSize"])
}

// Minimum number of ECS instances in the scaling group. Value range: [0, 100].
func (r *ScalingGroup) MinSize() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["minSize"])
}

// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
func (r *ScalingGroup) MultiAzPolicy() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["multiAzPolicy"])
}

// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
// - OldestInstance: removes the first ECS instance attached to the scaling group.
// - NewestInstance: removes the first ECS instance attached to the scaling group.
// - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
// - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
func (r *ScalingGroup) RemovalPolicies() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["removalPolicies"])
}

// Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
func (r *ScalingGroup) ScalingGroupName() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["scalingGroupName"])
}

// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
func (r *ScalingGroup) VswitchId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["vswitchId"])
}

// List of virtual switch IDs in which the ecs instances to be launched.
func (r *ScalingGroup) VswitchIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["vswitchIds"])
}

// Input properties used for looking up and filtering ScalingGroup resources.
type ScalingGroupState struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds interface{}
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown interface{}
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
	// targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds interface{}
	// Maximum number of ECS instances in the scaling group. Value range: [0, 100].
	MaxSize interface{}
	// Minimum number of ECS instances in the scaling group. Value range: [0, 100].
	MinSize interface{}
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
	MultiAzPolicy interface{}
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the first ECS instance attached to the scaling group.
	// - NewestInstance: removes the first ECS instance attached to the scaling group.
	// - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
	// - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
	RemovalPolicies interface{}
	// Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName interface{}
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	VswitchId interface{}
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds interface{}
}

// The set of arguments for constructing a ScalingGroup resource.
type ScalingGroupArgs struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds interface{}
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown interface{}
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
	// targeting your `alicloud_slb_listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds interface{}
	// Maximum number of ECS instances in the scaling group. Value range: [0, 100].
	MaxSize interface{}
	// Minimum number of ECS instances in the scaling group. Value range: [0, 100].
	MinSize interface{}
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY or BALANCE.
	MultiAzPolicy interface{}
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the first ECS instance attached to the scaling group.
	// - NewestInstance: removes the first ECS instance attached to the scaling group.
	// - OldestScalingConfiguration: removes the ECS instance with the oldest scaling configuration.
	// - Default values: OldestScalingConfiguration and OldestInstance. You can enter up to two removal policies.
	RemovalPolicies interface{}
	// Name shown for the scaling group, which must contain 2-40 characters (English or Chinese). If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName interface{}
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	VswitchId interface{}
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds interface{}
}