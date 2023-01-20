// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ess.ScalingGroupArgs;
import com.pulumi.alicloud.ess.inputs.ScalingGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ESS scaling group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ess/scalingGroup:ScalingGroup example asg-abc123456
 * ```
 * 
 */
@ResourceType(type="alicloud:ess/scalingGroup:ScalingGroup")
public class ScalingGroup extends com.pulumi.resources.CustomResource {
    /**
     * If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     * 
     */
    @Export(name="dbInstanceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dbInstanceIds;

    /**
     * @return If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     * 
     */
    public Output<Optional<List<String>>> dbInstanceIds() {
        return Codegen.optional(this.dbInstanceIds);
    }
    /**
     * Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     * 
     */
    @Export(name="defaultCooldown", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> defaultCooldown;

    /**
     * @return Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     * 
     */
    public Output<Optional<Integer>> defaultCooldown() {
        return Codegen.optional(this.defaultCooldown);
    }
    /**
     * Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> desiredCapacity;

    /**
     * @return Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
     * 
     */
    public Output<Optional<Integer>> desiredCapacity() {
        return Codegen.optional(this.desiredCapacity);
    }
    /**
     * Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
     * 
     */
    @Export(name="groupDeletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> groupDeletionProtection;

    /**
     * @return Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
     * 
     */
    public Output<Optional<Boolean>> groupDeletionProtection() {
        return Codegen.optional(this.groupDeletionProtection);
    }
    /**
     * Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
     * 
     */
    @Export(name="groupType", type=String.class, parameters={})
    private Output<String> groupType;

    /**
     * @return Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
     * 
     */
    public Output<String> groupType() {
        return this.groupType;
    }
    /**
     * Resource type within scaling group. Optional values: ECS, NONE. Default to ECS.
     * 
     */
    @Export(name="healthCheckType", type=String.class, parameters={})
    private Output<String> healthCheckType;

    /**
     * @return Resource type within scaling group. Optional values: ECS, NONE. Default to ECS.
     * 
     */
    public Output<String> healthCheckType() {
        return this.healthCheckType;
    }
    /**
     * Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
     * 
     */
    @Export(name="launchTemplateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchTemplateId;

    /**
     * @return Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
     * 
     */
    public Output<Optional<String>> launchTemplateId() {
        return Codegen.optional(this.launchTemplateId);
    }
    /**
     * The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
     * 
     */
    @Export(name="launchTemplateVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchTemplateVersion;

    /**
     * @return The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
     * 
     */
    public Output<Optional<String>> launchTemplateVersion() {
        return Codegen.optional(this.launchTemplateVersion);
    }
    /**
     * If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     * 
     */
    @Export(name="loadbalancerIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> loadbalancerIds;

    /**
     * @return If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     * 
     */
    public Output<Optional<List<String>>> loadbalancerIds() {
        return Codegen.optional(this.loadbalancerIds);
    }
    /**
     * Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    @Export(name="maxSize", type=Integer.class, parameters={})
    private Output<Integer> maxSize;

    /**
     * @return Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    /**
     * Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    @Export(name="minSize", type=Integer.class, parameters={})
    private Output<Integer> minSize;

    /**
     * @return Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }
    /**
     * Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
     * 
     */
    @Export(name="multiAzPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> multiAzPolicy;

    /**
     * @return Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
     * 
     */
    public Output<Optional<String>> multiAzPolicy() {
        return Codegen.optional(this.multiAzPolicy);
    }
    /**
     * The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
     * 
     */
    @Export(name="onDemandBaseCapacity", type=Integer.class, parameters={})
    private Output<Integer> onDemandBaseCapacity;

    /**
     * @return The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
     * 
     */
    public Output<Integer> onDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }
    /**
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * 
     */
    @Export(name="onDemandPercentageAboveBaseCapacity", type=Integer.class, parameters={})
    private Output<Integer> onDemandPercentageAboveBaseCapacity;

    /**
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * 
     */
    public Output<Integer> onDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }
    /**
     * Set or unset instances within group into protected status.
     * 
     */
    @Export(name="protectedInstances", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> protectedInstances;

    /**
     * @return Set or unset instances within group into protected status.
     * 
     */
    public Output<Optional<List<String>>> protectedInstances() {
        return Codegen.optional(this.protectedInstances);
    }
    /**
     * RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
     * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
     * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
     * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
     * 
     */
    @Export(name="removalPolicies", type=List.class, parameters={String.class})
    private Output<List<String>> removalPolicies;

    /**
     * @return RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
     * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
     * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
     * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
     * 
     */
    public Output<List<String>> removalPolicies() {
        return this.removalPolicies;
    }
    /**
     * Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
     * 
     */
    @Export(name="scalingGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> scalingGroupName;

    /**
     * @return Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
     * 
     */
    public Output<Optional<String>> scalingGroupName() {
        return Codegen.optional(this.scalingGroupName);
    }
    /**
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
     * 
     */
    @Export(name="spotInstancePools", type=Integer.class, parameters={})
    private Output<Integer> spotInstancePools;

    /**
     * @return The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
     * 
     */
    public Output<Integer> spotInstancePools() {
        return this.spotInstancePools;
    }
    /**
     * Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
     * 
     */
    @Export(name="spotInstanceRemedy", type=Boolean.class, parameters={})
    private Output<Boolean> spotInstanceRemedy;

    /**
     * @return Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
     * 
     */
    public Output<Boolean> spotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
     * 
     * @deprecated
     * Field &#39;vswitch_id&#39; has been deprecated from provider version 1.7.1, and new field &#39;vswitch_ids&#39; can replace it.
     * 
     */
    @Deprecated /* Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it. */
    @Export(name="vswitchId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vswitchId;

    /**
     * @return It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
     * 
     */
    public Output<Optional<String>> vswitchId() {
        return Codegen.optional(this.vswitchId);
    }
    /**
     * List of virtual switch IDs in which the ecs instances to be launched.
     * 
     */
    @Export(name="vswitchIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vswitchIds;

    /**
     * @return List of virtual switch IDs in which the ecs instances to be launched.
     * 
     */
    public Output<Optional<List<String>>> vswitchIds() {
        return Codegen.optional(this.vswitchIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScalingGroup(String name) {
        this(name, ScalingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScalingGroup(String name, ScalingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScalingGroup(String name, ScalingGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingGroup:ScalingGroup", name, args == null ? ScalingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScalingGroup(String name, Output<String> id, @Nullable ScalingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ess/scalingGroup:ScalingGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ScalingGroup get(String name, Output<String> id, @Nullable ScalingGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScalingGroup(name, id, state, options);
    }
}
