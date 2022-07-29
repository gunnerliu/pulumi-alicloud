// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricRuleTemplateAlertTemplateEscalationsInfo {
    /**
     * @return The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    private final @Nullable String comparisonOperator;
    /**
     * @return The statistical aggregation method for critical-level alerts.
     * 
     */
    private final @Nullable String statistics;
    /**
     * @return The threshold for critical-level alerts.
     * 
     */
    private final @Nullable String threshold;
    /**
     * @return The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
     * 
     */
    private final @Nullable String times;

    @CustomType.Constructor
    private MetricRuleTemplateAlertTemplateEscalationsInfo(
        @CustomType.Parameter("comparisonOperator") @Nullable String comparisonOperator,
        @CustomType.Parameter("statistics") @Nullable String statistics,
        @CustomType.Parameter("threshold") @Nullable String threshold,
        @CustomType.Parameter("times") @Nullable String times) {
        this.comparisonOperator = comparisonOperator;
        this.statistics = statistics;
        this.threshold = threshold;
        this.times = times;
    }

    /**
     * @return The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    public Optional<String> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }
    /**
     * @return The statistical aggregation method for critical-level alerts.
     * 
     */
    public Optional<String> statistics() {
        return Optional.ofNullable(this.statistics);
    }
    /**
     * @return The threshold for critical-level alerts.
     * 
     */
    public Optional<String> threshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * @return The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
     * 
     */
    public Optional<String> times() {
        return Optional.ofNullable(this.times);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRuleTemplateAlertTemplateEscalationsInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comparisonOperator;
        private @Nullable String statistics;
        private @Nullable String threshold;
        private @Nullable String times;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricRuleTemplateAlertTemplateEscalationsInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.statistics = defaults.statistics;
    	      this.threshold = defaults.threshold;
    	      this.times = defaults.times;
        }

        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public Builder statistics(@Nullable String statistics) {
            this.statistics = statistics;
            return this;
        }
        public Builder threshold(@Nullable String threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder times(@Nullable String times) {
            this.times = times;
            return this;
        }        public MetricRuleTemplateAlertTemplateEscalationsInfo build() {
            return new MetricRuleTemplateAlertTemplateEscalationsInfo(comparisonOperator, statistics, threshold, times);
        }
    }
}
