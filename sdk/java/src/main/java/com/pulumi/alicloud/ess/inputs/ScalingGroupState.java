// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScalingGroupState extends com.pulumi.resources.ResourceArgs {

    public static final ScalingGroupState Empty = new ScalingGroupState();

    /**
     * If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     * 
     */
    @Import(name="dbInstanceIds")
    private @Nullable Output<List<String>> dbInstanceIds;

    /**
     * @return If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
     * - The specified RDS instance must be in running status.
     * - The specified RDS instance’s whitelist must have room for more IP addresses.
     * 
     */
    public Optional<Output<List<String>>> dbInstanceIds() {
        return Optional.ofNullable(this.dbInstanceIds);
    }

    /**
     * Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     * 
     */
    @Import(name="defaultCooldown")
    private @Nullable Output<Integer> defaultCooldown;

    /**
     * @return Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
     * 
     */
    public Optional<Output<Integer>> defaultCooldown() {
        return Optional.ofNullable(this.defaultCooldown);
    }

    /**
     * Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
     * 
     */
    @Import(name="desiredCapacity")
    private @Nullable Output<Integer> desiredCapacity;

    /**
     * @return Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
     * 
     */
    public Optional<Output<Integer>> desiredCapacity() {
        return Optional.ofNullable(this.desiredCapacity);
    }

    /**
     * Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
     * 
     */
    @Import(name="groupDeletionProtection")
    private @Nullable Output<Boolean> groupDeletionProtection;

    /**
     * @return Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
     * 
     */
    public Optional<Output<Boolean>> groupDeletionProtection() {
        return Optional.ofNullable(this.groupDeletionProtection);
    }

    /**
     * Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
     * 
     */
    @Import(name="groupType")
    private @Nullable Output<String> groupType;

    /**
     * @return Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
     * 
     */
    public Optional<Output<String>> groupType() {
        return Optional.ofNullable(this.groupType);
    }

    /**
     * Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
     * 
     */
    @Import(name="launchTemplateId")
    private @Nullable Output<String> launchTemplateId;

    /**
     * @return Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
     * 
     */
    public Optional<Output<String>> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }

    /**
     * The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
     * 
     */
    @Import(name="launchTemplateVersion")
    private @Nullable Output<String> launchTemplateVersion;

    /**
     * @return The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
     * 
     */
    public Optional<Output<String>> launchTemplateVersion() {
        return Optional.ofNullable(this.launchTemplateVersion);
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
    @Import(name="loadbalancerIds")
    private @Nullable Output<List<String>> loadbalancerIds;

    /**
     * @return If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
     * - The Server Load Balancer instance must be enabled.
     * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
     *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
     * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
     * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
     * 
     */
    public Optional<Output<List<String>>> loadbalancerIds() {
        return Optional.ofNullable(this.loadbalancerIds);
    }

    /**
     * Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    @Import(name="maxSize")
    private @Nullable Output<Integer> maxSize;

    /**
     * @return Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    public Optional<Output<Integer>> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }

    /**
     * Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    @Import(name="minSize")
    private @Nullable Output<Integer> minSize;

    /**
     * @return Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
     * 
     */
    public Optional<Output<Integer>> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    /**
     * Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
     * 
     */
    @Import(name="multiAzPolicy")
    private @Nullable Output<String> multiAzPolicy;

    /**
     * @return Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
     * 
     */
    public Optional<Output<String>> multiAzPolicy() {
        return Optional.ofNullable(this.multiAzPolicy);
    }

    /**
     * The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
     * 
     */
    @Import(name="onDemandBaseCapacity")
    private @Nullable Output<Integer> onDemandBaseCapacity;

    /**
     * @return The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
     * 
     */
    public Optional<Output<Integer>> onDemandBaseCapacity() {
        return Optional.ofNullable(this.onDemandBaseCapacity);
    }

    /**
     * Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * 
     */
    @Import(name="onDemandPercentageAboveBaseCapacity")
    private @Nullable Output<Integer> onDemandPercentageAboveBaseCapacity;

    /**
     * @return Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
     * 
     */
    public Optional<Output<Integer>> onDemandPercentageAboveBaseCapacity() {
        return Optional.ofNullable(this.onDemandPercentageAboveBaseCapacity);
    }

    /**
     * RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
     * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
     * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
     * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
     * 
     */
    @Import(name="removalPolicies")
    private @Nullable Output<List<String>> removalPolicies;

    /**
     * @return RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
     * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
     * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
     * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
     * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
     * 
     */
    public Optional<Output<List<String>>> removalPolicies() {
        return Optional.ofNullable(this.removalPolicies);
    }

    /**
     * Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
     * 
     */
    @Import(name="scalingGroupName")
    private @Nullable Output<String> scalingGroupName;

    /**
     * @return Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
     * 
     */
    public Optional<Output<String>> scalingGroupName() {
        return Optional.ofNullable(this.scalingGroupName);
    }

    /**
     * The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
     * 
     */
    @Import(name="spotInstancePools")
    private @Nullable Output<Integer> spotInstancePools;

    /**
     * @return The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
     * 
     */
    public Optional<Output<Integer>> spotInstancePools() {
        return Optional.ofNullable(this.spotInstancePools);
    }

    /**
     * Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
     * 
     */
    @Import(name="spotInstanceRemedy")
    private @Nullable Output<Boolean> spotInstanceRemedy;

    /**
     * @return Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
     * 
     */
    public Optional<Output<Boolean>> spotInstanceRemedy() {
        return Optional.ofNullable(this.spotInstanceRemedy);
    }

    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
     * 
     * @deprecated
     * Field &#39;vswitch_id&#39; has been deprecated from provider version 1.7.1, and new field &#39;vswitch_ids&#39; can replace it.
     * 
     */
    @Deprecated /* Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it. */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
     * 
     * @deprecated
     * Field &#39;vswitch_id&#39; has been deprecated from provider version 1.7.1, and new field &#39;vswitch_ids&#39; can replace it.
     * 
     */
    @Deprecated /* Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it. */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * List of virtual switch IDs in which the ecs instances to be launched.
     * 
     */
    @Import(name="vswitchIds")
    private @Nullable Output<List<String>> vswitchIds;

    /**
     * @return List of virtual switch IDs in which the ecs instances to be launched.
     * 
     */
    public Optional<Output<List<String>>> vswitchIds() {
        return Optional.ofNullable(this.vswitchIds);
    }

    private ScalingGroupState() {}

    private ScalingGroupState(ScalingGroupState $) {
        this.dbInstanceIds = $.dbInstanceIds;
        this.defaultCooldown = $.defaultCooldown;
        this.desiredCapacity = $.desiredCapacity;
        this.groupDeletionProtection = $.groupDeletionProtection;
        this.groupType = $.groupType;
        this.launchTemplateId = $.launchTemplateId;
        this.launchTemplateVersion = $.launchTemplateVersion;
        this.loadbalancerIds = $.loadbalancerIds;
        this.maxSize = $.maxSize;
        this.minSize = $.minSize;
        this.multiAzPolicy = $.multiAzPolicy;
        this.onDemandBaseCapacity = $.onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = $.onDemandPercentageAboveBaseCapacity;
        this.removalPolicies = $.removalPolicies;
        this.scalingGroupName = $.scalingGroupName;
        this.spotInstancePools = $.spotInstancePools;
        this.spotInstanceRemedy = $.spotInstanceRemedy;
        this.tags = $.tags;
        this.vswitchId = $.vswitchId;
        this.vswitchIds = $.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingGroupState $;

        public Builder() {
            $ = new ScalingGroupState();
        }

        public Builder(ScalingGroupState defaults) {
            $ = new ScalingGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceIds If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
         * - The specified RDS instance must be in running status.
         * - The specified RDS instance’s whitelist must have room for more IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIds(@Nullable Output<List<String>> dbInstanceIds) {
            $.dbInstanceIds = dbInstanceIds;
            return this;
        }

        /**
         * @param dbInstanceIds If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
         * - The specified RDS instance must be in running status.
         * - The specified RDS instance’s whitelist must have room for more IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIds(List<String> dbInstanceIds) {
            return dbInstanceIds(Output.of(dbInstanceIds));
        }

        /**
         * @param dbInstanceIds If an RDS instance is specified in the scaling group, the scaling group automatically attaches the Intranet IP addresses of its ECS instances to the RDS access whitelist.
         * - The specified RDS instance must be in running status.
         * - The specified RDS instance’s whitelist must have room for more IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceIds(String... dbInstanceIds) {
            return dbInstanceIds(List.of(dbInstanceIds));
        }

        /**
         * @param defaultCooldown Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
         * 
         * @return builder
         * 
         */
        public Builder defaultCooldown(@Nullable Output<Integer> defaultCooldown) {
            $.defaultCooldown = defaultCooldown;
            return this;
        }

        /**
         * @param defaultCooldown Default cool-down time (in seconds) of the scaling group. Value range: [0, 86400]. The default value is 300s.
         * 
         * @return builder
         * 
         */
        public Builder defaultCooldown(Integer defaultCooldown) {
            return defaultCooldown(Output.of(defaultCooldown));
        }

        /**
         * @param desiredCapacity Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(@Nullable Output<Integer> desiredCapacity) {
            $.desiredCapacity = desiredCapacity;
            return this;
        }

        /**
         * @param desiredCapacity Expected number of ECS instances in the scaling group. Value range: [min_size, max_size].
         * 
         * @return builder
         * 
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            return desiredCapacity(Output.of(desiredCapacity));
        }

        /**
         * @param groupDeletionProtection Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder groupDeletionProtection(@Nullable Output<Boolean> groupDeletionProtection) {
            $.groupDeletionProtection = groupDeletionProtection;
            return this;
        }

        /**
         * @param groupDeletionProtection Specifies whether the scaling group deletion protection is enabled. `true` or `false`, Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
            return groupDeletionProtection(Output.of(groupDeletionProtection));
        }

        /**
         * @param groupType Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
         * 
         * @return builder
         * 
         */
        public Builder groupType(@Nullable Output<String> groupType) {
            $.groupType = groupType;
            return this;
        }

        /**
         * @param groupType Resource type within scaling group. Optional values: ECS, ECI. Default to ECS.
         * 
         * @return builder
         * 
         */
        public Builder groupType(String groupType) {
            return groupType(Output.of(groupType));
        }

        /**
         * @param launchTemplateId Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            $.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * @param launchTemplateId Instance launch template ID, scaling group obtains launch configuration from instance launch template, see [Launch Template](https://www.alibabacloud.com/help/doc-detail/73916.html). Creating scaling group from launch template enable group automatically.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(String launchTemplateId) {
            return launchTemplateId(Output.of(launchTemplateId));
        }

        /**
         * @param launchTemplateVersion The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateVersion(@Nullable Output<String> launchTemplateVersion) {
            $.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * @param launchTemplateVersion The version number of the launch template. Valid values are the version number, `Latest`, or `Default`, Default value: `Default`.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            return launchTemplateVersion(Output.of(launchTemplateVersion));
        }

        /**
         * @param loadbalancerIds If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
         * - The Server Load Balancer instance must be enabled.
         * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
         *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
         * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
         * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerIds(@Nullable Output<List<String>> loadbalancerIds) {
            $.loadbalancerIds = loadbalancerIds;
            return this;
        }

        /**
         * @param loadbalancerIds If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
         * - The Server Load Balancer instance must be enabled.
         * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
         *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
         * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
         * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerIds(List<String> loadbalancerIds) {
            return loadbalancerIds(Output.of(loadbalancerIds));
        }

        /**
         * @param loadbalancerIds If a Server Load Balancer instance is specified in the scaling group, the scaling group automatically attaches its ECS instances to the Server Load Balancer instance.
         * - The Server Load Balancer instance must be enabled.
         * - At least one listener must be configured for each Server Load Balancer and it HealthCheck must be on. Otherwise, creation will fail (it may be useful to add a `depends_on` argument
         *   targeting your `alicloud.slb.Listener` in order to make sure the listener with its HealthCheck configuration is ready before creating your scaling group).
         * - The Server Load Balancer instance attached with VPC-type ECS instances cannot be attached to the scaling group.
         * - The default weight of an ECS instance attached to the Server Load Balancer instance is 50.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerIds(String... loadbalancerIds) {
            return loadbalancerIds(List.of(loadbalancerIds));
        }

        /**
         * @param maxSize Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
         * 
         * @return builder
         * 
         */
        public Builder maxSize(@Nullable Output<Integer> maxSize) {
            $.maxSize = maxSize;
            return this;
        }

        /**
         * @param maxSize Maximum number of ECS instances in the scaling group. Value range: [0, 1000].
         * 
         * @return builder
         * 
         */
        public Builder maxSize(Integer maxSize) {
            return maxSize(Output.of(maxSize));
        }

        /**
         * @param minSize Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
         * 
         * @return builder
         * 
         */
        public Builder minSize(@Nullable Output<Integer> minSize) {
            $.minSize = minSize;
            return this;
        }

        /**
         * @param minSize Minimum number of ECS instances in the scaling group. Value range: [0, 1000].
         * 
         * @return builder
         * 
         */
        public Builder minSize(Integer minSize) {
            return minSize(Output.of(minSize));
        }

        /**
         * @param multiAzPolicy Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
         * 
         * @return builder
         * 
         */
        public Builder multiAzPolicy(@Nullable Output<String> multiAzPolicy) {
            $.multiAzPolicy = multiAzPolicy;
            return this;
        }

        /**
         * @param multiAzPolicy Multi-AZ scaling group ECS instance expansion and contraction strategy. PRIORITY, BALANCE or COST_OPTIMIZED(Available in 1.54.0+).
         * 
         * @return builder
         * 
         */
        public Builder multiAzPolicy(String multiAzPolicy) {
            return multiAzPolicy(Output.of(multiAzPolicy));
        }

        /**
         * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
         * 
         * @return builder
         * 
         */
        public Builder onDemandBaseCapacity(@Nullable Output<Integer> onDemandBaseCapacity) {
            $.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }

        /**
         * @param onDemandBaseCapacity The minimum amount of the Auto Scaling group&#39;s capacity that must be fulfilled by On-Demand Instances. This base portion is provisioned first as your group scales.
         * 
         * @return builder
         * 
         */
        public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
            return onDemandBaseCapacity(Output.of(onDemandBaseCapacity));
        }

        /**
         * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
         * 
         * @return builder
         * 
         */
        public Builder onDemandPercentageAboveBaseCapacity(@Nullable Output<Integer> onDemandPercentageAboveBaseCapacity) {
            $.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }

        /**
         * @param onDemandPercentageAboveBaseCapacity Controls the percentages of On-Demand Instances and Spot Instances for your additional capacity beyond OnDemandBaseCapacity.
         * 
         * @return builder
         * 
         */
        public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
            return onDemandPercentageAboveBaseCapacity(Output.of(onDemandPercentageAboveBaseCapacity));
        }

        /**
         * @param removalPolicies RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
         * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
         * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
         * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
         * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
         * 
         * @return builder
         * 
         */
        public Builder removalPolicies(@Nullable Output<List<String>> removalPolicies) {
            $.removalPolicies = removalPolicies;
            return this;
        }

        /**
         * @param removalPolicies RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
         * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
         * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
         * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
         * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
         * 
         * @return builder
         * 
         */
        public Builder removalPolicies(List<String> removalPolicies) {
            return removalPolicies(Output.of(removalPolicies));
        }

        /**
         * @param removalPolicies RemovalPolicy is used to select the ECS instances you want to remove from the scaling group when multiple candidates for removal exist. Optional values:
         * - OldestInstance: removes the ECS instance that is added to the scaling group at the earliest point in time.
         * - NewestInstance: removes the ECS instance that is added to the scaling group at the latest point in time.
         * - OldestScalingConfiguration: removes the ECS instance that is created based on the earliest scaling configuration.
         * - Default values: Default value of RemovalPolicy.1: OldestScalingConfiguration. Default value of RemovalPolicy.2: OldestInstance.
         * 
         * @return builder
         * 
         */
        public Builder removalPolicies(String... removalPolicies) {
            return removalPolicies(List.of(removalPolicies));
        }

        /**
         * @param scalingGroupName Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupName(@Nullable Output<String> scalingGroupName) {
            $.scalingGroupName = scalingGroupName;
            return this;
        }

        /**
         * @param scalingGroupName Name shown for the scaling group, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain numbers, underscores `_`, hyphens `-`, and decimal points `.`. If this parameter is not specified, the default value is ScalingGroupId.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupName(String scalingGroupName) {
            return scalingGroupName(Output.of(scalingGroupName));
        }

        /**
         * @param spotInstancePools The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePools(@Nullable Output<Integer> spotInstancePools) {
            $.spotInstancePools = spotInstancePools;
            return this;
        }

        /**
         * @param spotInstancePools The number of Spot pools to use to allocate your Spot capacity. The Spot pools is composed of instance types of lowest price.
         * 
         * @return builder
         * 
         */
        public Builder spotInstancePools(Integer spotInstancePools) {
            return spotInstancePools(Output.of(spotInstancePools));
        }

        /**
         * @param spotInstanceRemedy Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
         * 
         * @return builder
         * 
         */
        public Builder spotInstanceRemedy(@Nullable Output<Boolean> spotInstanceRemedy) {
            $.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * @param spotInstanceRemedy Whether to replace spot instances with newly created spot/onDemand instance when receive a spot recycling message.
         * 
         * @return builder
         * 
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            return spotInstanceRemedy(Output.of(spotInstanceRemedy));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * - Key: It can be up to 64 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It cannot be a null string.
         * - Value: It can be up to 128 characters in length. It cannot begin with &#34;aliyun&#34;, &#34;acs:&#34;, &#34;http://&#34;, or &#34;https://&#34;. It can be a null string.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vswitchId It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;vswitch_id&#39; has been deprecated from provider version 1.7.1, and new field &#39;vswitch_ids&#39; can replace it.
         * 
         */
        @Deprecated /* Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it. */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId It has been deprecated from version 1.7.1 and new field &#39;vswitch_ids&#39; replaces it.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;vswitch_id&#39; has been deprecated from provider version 1.7.1, and new field &#39;vswitch_ids&#39; can replace it.
         * 
         */
        @Deprecated /* Field 'vswitch_id' has been deprecated from provider version 1.7.1, and new field 'vswitch_ids' can replace it. */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param vswitchIds List of virtual switch IDs in which the ecs instances to be launched.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(@Nullable Output<List<String>> vswitchIds) {
            $.vswitchIds = vswitchIds;
            return this;
        }

        /**
         * @param vswitchIds List of virtual switch IDs in which the ecs instances to be launched.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(List<String> vswitchIds) {
            return vswitchIds(Output.of(vswitchIds));
        }

        /**
         * @param vswitchIds List of virtual switch IDs in which the ecs instances to be launched.
         * 
         * @return builder
         * 
         */
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }

        public ScalingGroupState build() {
            return $;
        }
    }

}
