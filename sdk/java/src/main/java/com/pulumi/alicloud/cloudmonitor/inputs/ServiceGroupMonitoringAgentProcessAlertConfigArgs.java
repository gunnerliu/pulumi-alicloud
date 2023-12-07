// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.inputs;

import com.pulumi.alicloud.cloudmonitor.inputs.ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceGroupMonitoringAgentProcessAlertConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceGroupMonitoringAgentProcessAlertConfigArgs Empty = new ServiceGroupMonitoringAgentProcessAlertConfigArgs();

    /**
     * The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    @Import(name="comparisonOperator", required=true)
    private Output<String> comparisonOperator;

    /**
     * @return The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
     * 
     */
    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The time period during which the alert rule is effective.
     * 
     */
    @Import(name="effectiveInterval")
    private @Nullable Output<String> effectiveInterval;

    /**
     * @return The time period during which the alert rule is effective.
     * 
     */
    public Optional<Output<String>> effectiveInterval() {
        return Optional.ofNullable(this.effectiveInterval);
    }

    /**
     * The alert level. Valid values: `critical`, `warn`, `info`.
     * 
     */
    @Import(name="escalationsLevel", required=true)
    private Output<String> escalationsLevel;

    /**
     * @return The alert level. Valid values: `critical`, `warn`, `info`.
     * 
     */
    public Output<String> escalationsLevel() {
        return this.escalationsLevel;
    }

    /**
     * The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
     * 
     */
    @Import(name="silenceTime")
    private @Nullable Output<Integer> silenceTime;

    /**
     * @return The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
     * 
     */
    public Optional<Output<Integer>> silenceTime() {
        return Optional.ofNullable(this.silenceTime);
    }

    /**
     * The statistical method for alerts. Valid values: `Average`.
     * 
     */
    @Import(name="statistics", required=true)
    private Output<String> statistics;

    /**
     * @return The statistical method for alerts. Valid values: `Average`.
     * 
     */
    public Output<String> statistics() {
        return this.statistics;
    }

    /**
     * The alert triggers. See `target_list` below.
     * 
     */
    @Import(name="targetLists")
    private @Nullable Output<List<ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs>> targetLists;

    /**
     * @return The alert triggers. See `target_list` below.
     * 
     */
    public Optional<Output<List<ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs>>> targetLists() {
        return Optional.ofNullable(this.targetLists);
    }

    /**
     * The alert threshold.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<String> threshold;

    /**
     * @return The alert threshold.
     * 
     */
    public Output<String> threshold() {
        return this.threshold;
    }

    /**
     * The number of times for which the threshold can be consecutively exceeded.
     * 
     */
    @Import(name="times", required=true)
    private Output<String> times;

    /**
     * @return The number of times for which the threshold can be consecutively exceeded.
     * 
     */
    public Output<String> times() {
        return this.times;
    }

    /**
     * The callback URL.
     * 
     */
    @Import(name="webhook")
    private @Nullable Output<String> webhook;

    /**
     * @return The callback URL.
     * 
     */
    public Optional<Output<String>> webhook() {
        return Optional.ofNullable(this.webhook);
    }

    private ServiceGroupMonitoringAgentProcessAlertConfigArgs() {}

    private ServiceGroupMonitoringAgentProcessAlertConfigArgs(ServiceGroupMonitoringAgentProcessAlertConfigArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.effectiveInterval = $.effectiveInterval;
        this.escalationsLevel = $.escalationsLevel;
        this.silenceTime = $.silenceTime;
        this.statistics = $.statistics;
        this.targetLists = $.targetLists;
        this.threshold = $.threshold;
        this.times = $.times;
        this.webhook = $.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceGroupMonitoringAgentProcessAlertConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceGroupMonitoringAgentProcessAlertConfigArgs $;

        public Builder() {
            $ = new ServiceGroupMonitoringAgentProcessAlertConfigArgs();
        }

        public Builder(ServiceGroupMonitoringAgentProcessAlertConfigArgs defaults) {
            $ = new ServiceGroupMonitoringAgentProcessAlertConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comparisonOperator The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * @param comparisonOperator The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
         * 
         * @return builder
         * 
         */
        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        /**
         * @param effectiveInterval The time period during which the alert rule is effective.
         * 
         * @return builder
         * 
         */
        public Builder effectiveInterval(@Nullable Output<String> effectiveInterval) {
            $.effectiveInterval = effectiveInterval;
            return this;
        }

        /**
         * @param effectiveInterval The time period during which the alert rule is effective.
         * 
         * @return builder
         * 
         */
        public Builder effectiveInterval(String effectiveInterval) {
            return effectiveInterval(Output.of(effectiveInterval));
        }

        /**
         * @param escalationsLevel The alert level. Valid values: `critical`, `warn`, `info`.
         * 
         * @return builder
         * 
         */
        public Builder escalationsLevel(Output<String> escalationsLevel) {
            $.escalationsLevel = escalationsLevel;
            return this;
        }

        /**
         * @param escalationsLevel The alert level. Valid values: `critical`, `warn`, `info`.
         * 
         * @return builder
         * 
         */
        public Builder escalationsLevel(String escalationsLevel) {
            return escalationsLevel(Output.of(escalationsLevel));
        }

        /**
         * @param silenceTime The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(@Nullable Output<Integer> silenceTime) {
            $.silenceTime = silenceTime;
            return this;
        }

        /**
         * @param silenceTime The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
         * 
         * @return builder
         * 
         */
        public Builder silenceTime(Integer silenceTime) {
            return silenceTime(Output.of(silenceTime));
        }

        /**
         * @param statistics The statistical method for alerts. Valid values: `Average`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(Output<String> statistics) {
            $.statistics = statistics;
            return this;
        }

        /**
         * @param statistics The statistical method for alerts. Valid values: `Average`.
         * 
         * @return builder
         * 
         */
        public Builder statistics(String statistics) {
            return statistics(Output.of(statistics));
        }

        /**
         * @param targetLists The alert triggers. See `target_list` below.
         * 
         * @return builder
         * 
         */
        public Builder targetLists(@Nullable Output<List<ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs>> targetLists) {
            $.targetLists = targetLists;
            return this;
        }

        /**
         * @param targetLists The alert triggers. See `target_list` below.
         * 
         * @return builder
         * 
         */
        public Builder targetLists(List<ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs> targetLists) {
            return targetLists(Output.of(targetLists));
        }

        /**
         * @param targetLists The alert triggers. See `target_list` below.
         * 
         * @return builder
         * 
         */
        public Builder targetLists(ServiceGroupMonitoringAgentProcessAlertConfigTargetListArgs... targetLists) {
            return targetLists(List.of(targetLists));
        }

        /**
         * @param threshold The alert threshold.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The alert threshold.
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param times The number of times for which the threshold can be consecutively exceeded.
         * 
         * @return builder
         * 
         */
        public Builder times(Output<String> times) {
            $.times = times;
            return this;
        }

        /**
         * @param times The number of times for which the threshold can be consecutively exceeded.
         * 
         * @return builder
         * 
         */
        public Builder times(String times) {
            return times(Output.of(times));
        }

        /**
         * @param webhook The callback URL.
         * 
         * @return builder
         * 
         */
        public Builder webhook(@Nullable Output<String> webhook) {
            $.webhook = webhook;
            return this;
        }

        /**
         * @param webhook The callback URL.
         * 
         * @return builder
         * 
         */
        public Builder webhook(String webhook) {
            return webhook(Output.of(webhook));
        }

        public ServiceGroupMonitoringAgentProcessAlertConfigArgs build() {
            $.comparisonOperator = Objects.requireNonNull($.comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
            $.escalationsLevel = Objects.requireNonNull($.escalationsLevel, "expected parameter 'escalationsLevel' to be non-null");
            $.statistics = Objects.requireNonNull($.statistics, "expected parameter 'statistics' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.times = Objects.requireNonNull($.times, "expected parameter 'times' to be non-null");
            return $;
        }
    }

}