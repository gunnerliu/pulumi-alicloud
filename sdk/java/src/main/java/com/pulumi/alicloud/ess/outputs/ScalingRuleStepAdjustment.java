// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalingRuleStepAdjustment {
    private @Nullable String metricIntervalLowerBound;
    private @Nullable String metricIntervalUpperBound;
    private @Nullable Integer scalingAdjustment;

    private ScalingRuleStepAdjustment() {}
    public Optional<String> metricIntervalLowerBound() {
        return Optional.ofNullable(this.metricIntervalLowerBound);
    }
    public Optional<String> metricIntervalUpperBound() {
        return Optional.ofNullable(this.metricIntervalUpperBound);
    }
    public Optional<Integer> scalingAdjustment() {
        return Optional.ofNullable(this.scalingAdjustment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingRuleStepAdjustment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metricIntervalLowerBound;
        private @Nullable String metricIntervalUpperBound;
        private @Nullable Integer scalingAdjustment;
        public Builder() {}
        public Builder(ScalingRuleStepAdjustment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricIntervalLowerBound = defaults.metricIntervalLowerBound;
    	      this.metricIntervalUpperBound = defaults.metricIntervalUpperBound;
    	      this.scalingAdjustment = defaults.scalingAdjustment;
        }

        @CustomType.Setter
        public Builder metricIntervalLowerBound(@Nullable String metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }
        @CustomType.Setter
        public Builder metricIntervalUpperBound(@Nullable String metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }
        @CustomType.Setter
        public Builder scalingAdjustment(@Nullable Integer scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }
        public ScalingRuleStepAdjustment build() {
            final var o = new ScalingRuleStepAdjustment();
            o.metricIntervalLowerBound = metricIntervalLowerBound;
            o.metricIntervalUpperBound = metricIntervalUpperBound;
            o.scalingAdjustment = scalingAdjustment;
            return o;
        }
    }
}