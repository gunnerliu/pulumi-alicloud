// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric;
import com.pulumi.alicloud.sae.outputs.GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus {
    /**
     * @return The current monitoring indicator elasticity list.
     * 
     */
    private List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric> currentMetrics;
    /**
     * @return The number of current instances.
     * 
     */
    private Integer currentReplicas;
    /**
     * @return The number of target instances.
     * 
     */
    private Integer desiredReplicas;
    /**
     * @return The time of the last elastic expansion.
     * 
     */
    private String lastScaleTime;
    /**
     * @return The maximum number of instances.
     * 
     */
    private Integer maxReplicas;
    /**
     * @return The minimum number of instances.
     * 
     */
    private Integer minReplicas;
    /**
     * @return Next monitoring indicator elasticity list
     * 
     */
    private List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric> nextScaleMetrics;
    /**
     * @return The next cycle of monitoring indicator elasticity.
     * 
     */
    private Integer nextScaleTimePeriod;

    private GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus() {}
    /**
     * @return The current monitoring indicator elasticity list.
     * 
     */
    public List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric> currentMetrics() {
        return this.currentMetrics;
    }
    /**
     * @return The number of current instances.
     * 
     */
    public Integer currentReplicas() {
        return this.currentReplicas;
    }
    /**
     * @return The number of target instances.
     * 
     */
    public Integer desiredReplicas() {
        return this.desiredReplicas;
    }
    /**
     * @return The time of the last elastic expansion.
     * 
     */
    public String lastScaleTime() {
        return this.lastScaleTime;
    }
    /**
     * @return The maximum number of instances.
     * 
     */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }
    /**
     * @return The minimum number of instances.
     * 
     */
    public Integer minReplicas() {
        return this.minReplicas;
    }
    /**
     * @return Next monitoring indicator elasticity list
     * 
     */
    public List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric> nextScaleMetrics() {
        return this.nextScaleMetrics;
    }
    /**
     * @return The next cycle of monitoring indicator elasticity.
     * 
     */
    public Integer nextScaleTimePeriod() {
        return this.nextScaleTimePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric> currentMetrics;
        private Integer currentReplicas;
        private Integer desiredReplicas;
        private String lastScaleTime;
        private Integer maxReplicas;
        private Integer minReplicas;
        private List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric> nextScaleMetrics;
        private Integer nextScaleTimePeriod;
        public Builder() {}
        public Builder(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.nextScaleMetrics = defaults.nextScaleMetrics;
    	      this.nextScaleTimePeriod = defaults.nextScaleTimePeriod;
        }

        @CustomType.Setter
        public Builder currentMetrics(List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric> currentMetrics) {
            this.currentMetrics = Objects.requireNonNull(currentMetrics);
            return this;
        }
        public Builder currentMetrics(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusCurrentMetric... currentMetrics) {
            return currentMetrics(List.of(currentMetrics));
        }
        @CustomType.Setter
        public Builder currentReplicas(Integer currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }
        @CustomType.Setter
        public Builder desiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }
        @CustomType.Setter
        public Builder lastScaleTime(String lastScaleTime) {
            this.lastScaleTime = Objects.requireNonNull(lastScaleTime);
            return this;
        }
        @CustomType.Setter
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        @CustomType.Setter
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }
        @CustomType.Setter
        public Builder nextScaleMetrics(List<GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric> nextScaleMetrics) {
            this.nextScaleMetrics = Objects.requireNonNull(nextScaleMetrics);
            return this;
        }
        public Builder nextScaleMetrics(GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatusNextScaleMetric... nextScaleMetrics) {
            return nextScaleMetrics(List.of(nextScaleMetrics));
        }
        @CustomType.Setter
        public Builder nextScaleTimePeriod(Integer nextScaleTimePeriod) {
            this.nextScaleTimePeriod = Objects.requireNonNull(nextScaleTimePeriod);
            return this;
        }
        public GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus build() {
            final var _resultValue = new GetApplicationScalingRulesRuleScalingRuleMetricMetricsStatus();
            _resultValue.currentMetrics = currentMetrics;
            _resultValue.currentReplicas = currentReplicas;
            _resultValue.desiredReplicas = desiredReplicas;
            _resultValue.lastScaleTime = lastScaleTime;
            _resultValue.maxReplicas = maxReplicas;
            _resultValue.minReplicas = minReplicas;
            _resultValue.nextScaleMetrics = nextScaleMetrics;
            _resultValue.nextScaleTimePeriod = nextScaleTimePeriod;
            return _resultValue;
        }
    }
}
