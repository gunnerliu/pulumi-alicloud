// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationScalingRuleScalingRuleMetricScaleDownRules {
    /**
     * @return Whether shrinkage is prohibited.
     * 
     */
    private @Nullable Boolean disabled;
    /**
     * @return Cooling time for expansion or contraction. Valid values: `0` to `3600`. Unit: seconds. The default is `0` seconds.
     * 
     */
    private @Nullable Integer stabilizationWindowSeconds;
    /**
     * @return Elastic expansion or contraction step size. the maximum number of instances to be scaled in per unit time.
     * 
     */
    private @Nullable Integer step;

    private ApplicationScalingRuleScalingRuleMetricScaleDownRules() {}
    /**
     * @return Whether shrinkage is prohibited.
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return Cooling time for expansion or contraction. Valid values: `0` to `3600`. Unit: seconds. The default is `0` seconds.
     * 
     */
    public Optional<Integer> stabilizationWindowSeconds() {
        return Optional.ofNullable(this.stabilizationWindowSeconds);
    }
    /**
     * @return Elastic expansion or contraction step size. the maximum number of instances to be scaled in per unit time.
     * 
     */
    public Optional<Integer> step() {
        return Optional.ofNullable(this.step);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationScalingRuleScalingRuleMetricScaleDownRules defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disabled;
        private @Nullable Integer stabilizationWindowSeconds;
        private @Nullable Integer step;
        public Builder() {}
        public Builder(ApplicationScalingRuleScalingRuleMetricScaleDownRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.stabilizationWindowSeconds = defaults.stabilizationWindowSeconds;
    	      this.step = defaults.step;
        }

        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder stabilizationWindowSeconds(@Nullable Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder step(@Nullable Integer step) {
            this.step = step;
            return this;
        }
        public ApplicationScalingRuleScalingRuleMetricScaleDownRules build() {
            final var _resultValue = new ApplicationScalingRuleScalingRuleMetricScaleDownRules();
            _resultValue.disabled = disabled;
            _resultValue.stabilizationWindowSeconds = stabilizationWindowSeconds;
            _resultValue.step = step;
            return _resultValue;
        }
    }
}
