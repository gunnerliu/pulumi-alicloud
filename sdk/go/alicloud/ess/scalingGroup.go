// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ess

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// ESS scaling group can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:ess/scalingGroup:ScalingGroup example asg-abc123456
// ```
type ScalingGroup struct {
	pulumi.CustomResourceState

	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds pulumi.StringArrayOutput `pulumi:"dbInstanceIds"`
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown pulumi.IntPtrOutput `pulumi:"defaultCooldown"`
	// Expected number of ECS instances in the scaling group. Value range: [min_size, maxSize].
	DesiredCapacity pulumi.IntPtrOutput `pulumi:"desiredCapacity"`
	// Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
	GroupDeletionProtection pulumi.BoolPtrOutput `pulumi:"groupDeletionProtection"`
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `dependsOn` argument
	//   targeting your `slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds pulumi.StringArrayOutput `pulumi:"loadbalancerIds"`
	// Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
	MaxSize pulumi.IntOutput `pulumi:"maxSize"`
	// Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
	MinSize pulumi.IntOutput `pulumi:"minSize"`
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
	MultiAzPolicy pulumi.StringPtrOutput `pulumi:"multiAzPolicy"`
	// The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
	OnDemandBaseCapacity pulumi.IntOutput `pulumi:"onDemandBaseCapacity"`
	// Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
	OnDemandPercentageAboveBaseCapacity pulumi.IntOutput `pulumi:"onDemandPercentageAboveBaseCapacity"`
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
	// - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
	// - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
	// - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
	RemovalPolicies pulumi.StringArrayOutput `pulumi:"removalPolicies"`
	// Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName pulumi.StringPtrOutput `pulumi:"scalingGroupName"`
	// The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
	SpotInstancePools pulumi.IntOutput `pulumi:"spotInstancePools"`
	// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
	SpotInstanceRemedy pulumi.BoolOutput `pulumi:"spotInstanceRemedy"`
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	//
	// Deprecated: Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it.
	VswitchId pulumi.StringPtrOutput `pulumi:"vswitchId"`
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds pulumi.StringArrayOutput `pulumi:"vswitchIds"`
}

// NewScalingGroup registers a new resource with the given unique name, arguments, and options.
func NewScalingGroup(ctx *pulumi.Context,
	name string, args *ScalingGroupArgs, opts ...pulumi.ResourceOption) (*ScalingGroup, error) {
	if args == nil || args.MaxSize == nil {
		return nil, errors.New("missing required argument 'MaxSize'")
	}
	if args == nil || args.MinSize == nil {
		return nil, errors.New("missing required argument 'MinSize'")
	}
	if args == nil {
		args = &ScalingGroupArgs{}
	}
	var resource ScalingGroup
	err := ctx.RegisterResource("alicloud:ess/scalingGroup:ScalingGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScalingGroup gets an existing ScalingGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScalingGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScalingGroupState, opts ...pulumi.ResourceOption) (*ScalingGroup, error) {
	var resource ScalingGroup
	err := ctx.ReadResource("alicloud:ess/scalingGroup:ScalingGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScalingGroup resources.
type scalingGroupState struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds []string `pulumi:"dbInstanceIds"`
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown *int `pulumi:"defaultCooldown"`
	// Expected number of ECS instances in the scaling group. Value range: [min_size, maxSize].
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
	GroupDeletionProtection *bool `pulumi:"groupDeletionProtection"`
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `dependsOn` argument
	//   targeting your `slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds []string `pulumi:"loadbalancerIds"`
	// Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
	MaxSize *int `pulumi:"maxSize"`
	// Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
	MinSize *int `pulumi:"minSize"`
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
	MultiAzPolicy *string `pulumi:"multiAzPolicy"`
	// The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
	OnDemandBaseCapacity *int `pulumi:"onDemandBaseCapacity"`
	// Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
	OnDemandPercentageAboveBaseCapacity *int `pulumi:"onDemandPercentageAboveBaseCapacity"`
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
	// - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
	// - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
	// - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
	RemovalPolicies []string `pulumi:"removalPolicies"`
	// Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName *string `pulumi:"scalingGroupName"`
	// The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
	SpotInstancePools *int `pulumi:"spotInstancePools"`
	// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
	SpotInstanceRemedy *bool `pulumi:"spotInstanceRemedy"`
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	//
	// Deprecated: Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it.
	VswitchId *string `pulumi:"vswitchId"`
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds []string `pulumi:"vswitchIds"`
}

type ScalingGroupState struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds pulumi.StringArrayInput
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown pulumi.IntPtrInput
	// Expected number of ECS instances in the scaling group. Value range: [min_size, maxSize].
	DesiredCapacity pulumi.IntPtrInput
	// Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
	GroupDeletionProtection pulumi.BoolPtrInput
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `dependsOn` argument
	//   targeting your `slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds pulumi.StringArrayInput
	// Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
	MaxSize pulumi.IntPtrInput
	// Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
	MinSize pulumi.IntPtrInput
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
	MultiAzPolicy pulumi.StringPtrInput
	// The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
	OnDemandBaseCapacity pulumi.IntPtrInput
	// Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
	OnDemandPercentageAboveBaseCapacity pulumi.IntPtrInput
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
	// - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
	// - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
	// - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
	RemovalPolicies pulumi.StringArrayInput
	// Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName pulumi.StringPtrInput
	// The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
	SpotInstancePools pulumi.IntPtrInput
	// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
	SpotInstanceRemedy pulumi.BoolPtrInput
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	//
	// Deprecated: Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it.
	VswitchId pulumi.StringPtrInput
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds pulumi.StringArrayInput
}

func (ScalingGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingGroupState)(nil)).Elem()
}

type scalingGroupArgs struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds []string `pulumi:"dbInstanceIds"`
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown *int `pulumi:"defaultCooldown"`
	// Expected number of ECS instances in the scaling group. Value range: [min_size, maxSize].
	DesiredCapacity *int `pulumi:"desiredCapacity"`
	// Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
	GroupDeletionProtection *bool `pulumi:"groupDeletionProtection"`
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `dependsOn` argument
	//   targeting your `slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds []string `pulumi:"loadbalancerIds"`
	// Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
	MaxSize int `pulumi:"maxSize"`
	// Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
	MinSize int `pulumi:"minSize"`
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
	MultiAzPolicy *string `pulumi:"multiAzPolicy"`
	// The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
	OnDemandBaseCapacity *int `pulumi:"onDemandBaseCapacity"`
	// Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
	OnDemandPercentageAboveBaseCapacity *int `pulumi:"onDemandPercentageAboveBaseCapacity"`
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
	// - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
	// - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
	// - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
	RemovalPolicies []string `pulumi:"removalPolicies"`
	// Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName *string `pulumi:"scalingGroupName"`
	// The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
	SpotInstancePools *int `pulumi:"spotInstancePools"`
	// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
	SpotInstanceRemedy *bool `pulumi:"spotInstanceRemedy"`
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	//
	// Deprecated: Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it.
	VswitchId *string `pulumi:"vswitchId"`
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds []string `pulumi:"vswitchIds"`
}

// The set of arguments for constructing a ScalingGroup resource.
type ScalingGroupArgs struct {
	// If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
	// - The specified RDS instance must be in running status.
	// - The specified RDS instance’s whitelist must have room for more IP addresses.
	DbInstanceIds pulumi.StringArrayInput
	// Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
	DefaultCooldown pulumi.IntPtrInput
	// Expected number of ECS instances in the scaling group. Value range: [min_size, maxSize].
	DesiredCapacity pulumi.IntPtrInput
	// Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
	GroupDeletionProtection pulumi.BoolPtrInput
	// If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
	// - The Server Load Balancer instance must be enabled.
	// - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `dependsOn` argument
	//   targeting your `slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
	// - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
	// - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
	LoadbalancerIds pulumi.StringArrayInput
	// Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
	MaxSize pulumi.IntInput
	// Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
	MinSize pulumi.IntInput
	// Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
	MultiAzPolicy pulumi.StringPtrInput
	// The minimum amount of the Auto Scaling group's capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
	OnDemandBaseCapacity pulumi.IntPtrInput
	// Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
	OnDemandPercentageAboveBaseCapacity pulumi.IntPtrInput
	// RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
	// - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
	// - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
	// - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
	// - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
	RemovalPolicies pulumi.StringArrayInput
	// Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
	ScalingGroupName pulumi.StringPtrInput
	// The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
	SpotInstancePools pulumi.IntPtrInput
	// Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
	SpotInstanceRemedy pulumi.BoolPtrInput
	// It has been deprecated from version 1.7.1 and new field 'vswitch_ids' replaces it.
	//
	// Deprecated: Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it.
	VswitchId pulumi.StringPtrInput
	// List of virtual switch IDs in which the ecs instances to be launched.
	VswitchIds pulumi.StringArrayInput
}

func (ScalingGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scalingGroupArgs)(nil)).Elem()
}

type ScalingGroupInput interface {
	pulumi.Input

	ToScalingGroupOutput() ScalingGroupOutput
	ToScalingGroupOutputWithContext(ctx context.Context) ScalingGroupOutput
}

func (ScalingGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*ScalingGroup)(nil)).Elem()
}

func (i ScalingGroup) ToScalingGroupOutput() ScalingGroupOutput {
	return i.ToScalingGroupOutputWithContext(context.Background())
}

func (i ScalingGroup) ToScalingGroupOutputWithContext(ctx context.Context) ScalingGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScalingGroupOutput)
}

type ScalingGroupOutput struct {
	*pulumi.OutputState
}

func (ScalingGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ScalingGroupOutput)(nil)).Elem()
}

func (o ScalingGroupOutput) ToScalingGroupOutput() ScalingGroupOutput {
	return o
}

func (o ScalingGroupOutput) ToScalingGroupOutputWithContext(ctx context.Context) ScalingGroupOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ScalingGroupOutput{})
}
