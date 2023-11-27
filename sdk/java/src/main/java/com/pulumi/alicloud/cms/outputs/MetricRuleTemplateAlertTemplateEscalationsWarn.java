// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricRuleTemplateAlertTemplateEscalationsWarn {
    /**
     * @return The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    private @Nullable String comparisonOperator;
    /**
     * @return The statistical aggregation method for critical-level alerts.
     * 
     */
    private @Nullable String statistics;
    /**
     * @return The threshold for critical-level alerts.
     * 
     */
    private @Nullable String threshold;
    /**
     * @return The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
     * 
     */
    private @Nullable String times;

    private MetricRuleTemplateAlertTemplateEscalationsWarn() {}
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

    public static Builder builder(MetricRuleTemplateAlertTemplateEscalationsWarn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparisonOperator;
        private @Nullable String statistics;
        private @Nullable String threshold;
        private @Nullable String times;
        public Builder() {}
        public Builder(MetricRuleTemplateAlertTemplateEscalationsWarn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.statistics = defaults.statistics;
    	      this.threshold = defaults.threshold;
    	      this.times = defaults.times;
        }

        @CustomType.Setter
        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        @CustomType.Setter
        public Builder statistics(@Nullable String statistics) {
            this.statistics = statistics;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(@Nullable String threshold) {
            this.threshold = threshold;
            return this;
        }
        @CustomType.Setter
        public Builder times(@Nullable String times) {
            this.times = times;
            return this;
        }
        public MetricRuleTemplateAlertTemplateEscalationsWarn build() {
            final var _resultValue = new MetricRuleTemplateAlertTemplateEscalationsWarn();
            _resultValue.comparisonOperator = comparisonOperator;
            _resultValue.statistics = statistics;
            _resultValue.threshold = threshold;
            _resultValue.times = times;
            return _resultValue;
        }
    }
}
