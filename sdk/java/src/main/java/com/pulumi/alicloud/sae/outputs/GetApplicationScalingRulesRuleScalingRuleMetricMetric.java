// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationScalingRulesRuleScalingRuleMetricMetric {
    /**
     * @return The target value of the monitoring indicator.
     * 
     */
    private final Integer metricTargetAverageUtilization;
    /**
     * @return The metric type of the Application Scaling Rule.
     * 
     */
    private final String metricType;

    @CustomType.Constructor
    private GetApplicationScalingRulesRuleScalingRuleMetricMetric(
        @CustomType.Parameter("metricTargetAverageUtilization") Integer metricTargetAverageUtilization,
        @CustomType.Parameter("metricType") String metricType) {
        this.metricTargetAverageUtilization = metricTargetAverageUtilization;
        this.metricType = metricType;
    }

    /**
     * @return The target value of the monitoring indicator.
     * 
     */
    public Integer metricTargetAverageUtilization() {
        return this.metricTargetAverageUtilization;
    }
    /**
     * @return The metric type of the Application Scaling Rule.
     * 
     */
    public String metricType() {
        return this.metricType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationScalingRulesRuleScalingRuleMetricMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer metricTargetAverageUtilization;
        private String metricType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationScalingRulesRuleScalingRuleMetricMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTargetAverageUtilization = defaults.metricTargetAverageUtilization;
    	      this.metricType = defaults.metricType;
        }

        public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
            this.metricTargetAverageUtilization = Objects.requireNonNull(metricTargetAverageUtilization);
            return this;
        }
        public Builder metricType(String metricType) {
            this.metricType = Objects.requireNonNull(metricType);
            return this;
        }        public GetApplicationScalingRulesRuleScalingRuleMetricMetric build() {
            return new GetApplicationScalingRulesRuleScalingRuleMetricMetric(metricTargetAverageUtilization, metricType);
        }
    }
}
