// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationScalingRuleScalingRuleTimerSchedule {
    /**
     * @return Trigger point in time. When supporting format: minutes, for example: `08:00`.
     * 
     */
    private @Nullable String atTime;
    /**
     * @return Maximum number of instances applied.
     * 
     */
    private @Nullable Integer maxReplicas;
    /**
     * @return Minimum number of instances applied.
     * 
     */
    private @Nullable Integer minReplicas;
    /**
     * @return This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
     * 
     */
    private @Nullable Integer targetReplicas;

    private ApplicationScalingRuleScalingRuleTimerSchedule() {}
    /**
     * @return Trigger point in time. When supporting format: minutes, for example: `08:00`.
     * 
     */
    public Optional<String> atTime() {
        return Optional.ofNullable(this.atTime);
    }
    /**
     * @return Maximum number of instances applied.
     * 
     */
    public Optional<Integer> maxReplicas() {
        return Optional.ofNullable(this.maxReplicas);
    }
    /**
     * @return Minimum number of instances applied.
     * 
     */
    public Optional<Integer> minReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    /**
     * @return This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
     * 
     */
    public Optional<Integer> targetReplicas() {
        return Optional.ofNullable(this.targetReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScalingRuleScalingRuleTimerSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String atTime;
        private @Nullable Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private @Nullable Integer targetReplicas;
        public Builder() {}
        public Builder(ApplicationScalingRuleScalingRuleTimerSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atTime = defaults.atTime;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.targetReplicas = defaults.targetReplicas;
        }

        @CustomType.Setter
        public Builder atTime(@Nullable String atTime) {
            this.atTime = atTime;
            return this;
        }
        @CustomType.Setter
        public Builder maxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        @CustomType.Setter
        public Builder targetReplicas(@Nullable Integer targetReplicas) {
            this.targetReplicas = targetReplicas;
            return this;
        }
        public ApplicationScalingRuleScalingRuleTimerSchedule build() {
            final var o = new ApplicationScalingRuleScalingRuleTimerSchedule();
            o.atTime = atTime;
            o.maxReplicas = maxReplicas;
            o.minReplicas = minReplicas;
            o.targetReplicas = targetReplicas;
            return o;
        }
    }
}
