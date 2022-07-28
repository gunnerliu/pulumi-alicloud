// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricRuleTemplateAlertTemplateEscalationsInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricRuleTemplateAlertTemplateEscalationsInfoArgs Empty = new MetricRuleTemplateAlertTemplateEscalationsInfoArgs();

    /**
     * The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    @Import(name="comparisonOperator")
    private @Nullable Output<String> comparisonOperator;

    /**
     * @return The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    public Optional<Output<String>> comparisonOperator() {
        return Optional.ofNullable(this.comparisonOperator);
    }

    /**
     * The statistical aggregation method for critical-level alerts.
     * 
     */
    @Import(name="statistics")
    private @Nullable Output<String> statistics;

    /**
     * @return The statistical aggregation method for critical-level alerts.
     * 
     */
    public Optional<Output<String>> statistics() {
        return Optional.ofNullable(this.statistics);
    }

    /**
     * The threshold for critical-level alerts.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<String> threshold;

    /**
     * @return The threshold for critical-level alerts.
     * 
     */
    public Optional<Output<String>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    /**
     * The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
     * 
     */
    @Import(name="times")
    private @Nullable Output<String> times;

    /**
     * @return The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
     * 
     */
    public Optional<Output<String>> times() {
        return Optional.ofNullable(this.times);
    }

    private MetricRuleTemplateAlertTemplateEscalationsInfoArgs() {}

    private MetricRuleTemplateAlertTemplateEscalationsInfoArgs(MetricRuleTemplateAlertTemplateEscalationsInfoArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.statistics = $.statistics;
        this.threshold = $.threshold;
        this.times = $.times;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricRuleTemplateAlertTemplateEscalationsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricRuleTemplateAlertTemplateEscalationsInfoArgs $;

        public Builder() {
            $ = new MetricRuleTemplateAlertTemplateEscalationsInfoArgs();
        }

        public Builder(MetricRuleTemplateAlertTemplateEscalationsInfoArgs defaults) {
            $ = new MetricRuleTemplateAlertTemplateEscalationsInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonOperator The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The comparison operator of the threshold for critical-level alerts. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param statistics The statistical aggregation method for critical-level alerts.
         * 
         * @return builder
         * 
         */
        public Builder statistics(@Nullable Output<String> statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param statistics The statistical aggregation method for critical-level alerts.
         * 
         * @return builder
         * 
         */
        public Builder statistics(String statistics) {
            return statistics(Output.of(statistics));
        }

        /**
         * @param threshold The threshold for critical-level alerts.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The threshold for critical-level alerts.
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param times The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
         * 
         * @return builder
         * 
         */
        public Builder times(@Nullable Output<String> times) {
            $.times = times;
            return this;
        }

        /**
         * @param times The consecutive number of times for which the metric value is measured before a critical-level alert is triggered.
         * 
         * @return builder
         * 
         */
        public Builder times(String times) {
            return times(Output.of(times));
        }

        public MetricRuleTemplateAlertTemplateEscalationsInfoArgs build() {
            return $;
        }
    }

}
