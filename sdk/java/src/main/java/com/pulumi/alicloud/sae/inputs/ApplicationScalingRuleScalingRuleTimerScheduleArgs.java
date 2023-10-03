// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScalingRuleScalingRuleTimerScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScalingRuleScalingRuleTimerScheduleArgs Empty = new ApplicationScalingRuleScalingRuleTimerScheduleArgs();

    /**
     * Trigger point in time. When supporting format: minutes, for example: `08:00`.
     * 
     */
    @Import(name="atTime")
    private @Nullable Output<String> atTime;

    /**
     * @return Trigger point in time. When supporting format: minutes, for example: `08:00`.
     * 
     */
    public Optional<Output<String>> atTime() {
        return Optional.ofNullable(this.atTime);
    }

    /**
     * Maximum number of instances applied.
     * 
     */
    @Import(name="maxReplicas")
    private @Nullable Output<Integer> maxReplicas;

    /**
     * @return Maximum number of instances applied.
     * 
     */
    public Optional<Output<Integer>> maxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }

    /**
     * Minimum number of instances applied.
     * 
     */
    @Import(name="minReplicas")
    private @Nullable Output<Integer> minReplicas;

    /**
     * @return Minimum number of instances applied.
     * 
     */
    public Optional<Output<Integer>> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }

    /**
     * This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
     * 
     */
    @Import(name="targetReplicas")
    private @Nullable Output<Integer> targetReplicas;

    /**
     * @return This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
     * 
     */
    public Optional<Output<Integer>> targetReplicas() {
        return Optional.ofNullable(this.targetReplicas);
    }

    private ApplicationScalingRuleScalingRuleTimerScheduleArgs() {}

    private ApplicationScalingRuleScalingRuleTimerScheduleArgs(ApplicationScalingRuleScalingRuleTimerScheduleArgs $) {
        this.atTime = $.atTime;
        this.maxReplicas = $.maxReplicas;
        this.minReplicas = $.minReplicas;
        this.targetReplicas = $.targetReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScalingRuleScalingRuleTimerScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScalingRuleScalingRuleTimerScheduleArgs $;

        public Builder() {
            $ = new ApplicationScalingRuleScalingRuleTimerScheduleArgs();
        }

        public Builder(ApplicationScalingRuleScalingRuleTimerScheduleArgs defaults) {
            $ = new ApplicationScalingRuleScalingRuleTimerScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atTime Trigger point in time. When supporting format: minutes, for example: `08:00`.
         * 
         * @return builder
         * 
         */
        public Builder atTime(@Nullable Output<String> atTime) {
            $.atTime = atTime;
            return this;
        }

        /**
         * @param atTime Trigger point in time. When supporting format: minutes, for example: `08:00`.
         * 
         * @return builder
         * 
         */
        public Builder atTime(String atTime) {
            return atTime(Output.of(atTime));
        }

        /**
         * @param maxReplicas Maximum number of instances applied.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicas(@Nullable Output<Integer> maxReplicas) {
            $.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * @param maxReplicas Maximum number of instances applied.
         * 
         * @return builder
         * 
         */
        public Builder maxReplicas(Integer maxReplicas) {
            return maxReplicas(Output.of(maxReplicas));
        }

        /**
         * @param minReplicas Minimum number of instances applied.
         * 
         * @return builder
         * 
         */
        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            $.minReplicas = minReplicas;
            return this;
        }

        /**
         * @param minReplicas Minimum number of instances applied.
         * 
         * @return builder
         * 
         */
        public Builder minReplicas(Integer minReplicas) {
            return minReplicas(Output.of(minReplicas));
        }

        /**
         * @param targetReplicas This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
         * 
         * @return builder
         * 
         */
        public Builder targetReplicas(@Nullable Output<Integer> targetReplicas) {
            $.targetReplicas = targetReplicas;
            return this;
        }

        /**
         * @param targetReplicas This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
         * 
         * @return builder
         * 
         */
        public Builder targetReplicas(Integer targetReplicas) {
            return targetReplicas(Output.of(targetReplicas));
        }

        public ApplicationScalingRuleScalingRuleTimerScheduleArgs build() {
            return $;
        }
    }

}
