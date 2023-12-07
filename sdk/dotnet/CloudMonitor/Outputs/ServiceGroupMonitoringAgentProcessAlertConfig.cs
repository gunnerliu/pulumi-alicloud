// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudMonitor.Outputs
{

    [OutputType]
    public sealed class ServiceGroupMonitoringAgentProcessAlertConfig
    {
        /// <summary>
        /// The operator that is used to compare the metric value with the threshold. Valid values: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanOrEqualToThreshold`, `LessThanThreshold`, `NotEqualToThreshold`, `GreaterThanYesterday`, `LessThanYesterday`, `GreaterThanLastWeek`, `LessThanLastWeek`, `GreaterThanLastPeriod`, `LessThanLastPeriod`.
        /// </summary>
        public readonly string ComparisonOperator;
        /// <summary>
        /// The time period during which the alert rule is effective.
        /// </summary>
        public readonly string? EffectiveInterval;
        /// <summary>
        /// The alert level. Valid values: `critical`, `warn`, `info`.
        /// </summary>
        public readonly string EscalationsLevel;
        /// <summary>
        /// The mute period during which new alert notifications are not sent even if the trigger conditions are met. Unit: seconds.
        /// </summary>
        public readonly int? SilenceTime;
        /// <summary>
        /// The statistical method for alerts. Valid values: `Average`.
        /// </summary>
        public readonly string Statistics;
        /// <summary>
        /// The alert triggers. See `target_list` below.
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceGroupMonitoringAgentProcessAlertConfigTargetList> TargetLists;
        /// <summary>
        /// The alert threshold.
        /// </summary>
        public readonly string Threshold;
        /// <summary>
        /// The number of times for which the threshold can be consecutively exceeded.
        /// </summary>
        public readonly string Times;
        /// <summary>
        /// The callback URL.
        /// </summary>
        public readonly string? Webhook;

        [OutputConstructor]
        private ServiceGroupMonitoringAgentProcessAlertConfig(
            string comparisonOperator,

            string? effectiveInterval,

            string escalationsLevel,

            int? silenceTime,

            string statistics,

            ImmutableArray<Outputs.ServiceGroupMonitoringAgentProcessAlertConfigTargetList> targetLists,

            string threshold,

            string times,

            string? webhook)
        {
            ComparisonOperator = comparisonOperator;
            EffectiveInterval = effectiveInterval;
            EscalationsLevel = escalationsLevel;
            SilenceTime = silenceTime;
            Statistics = statistics;
            TargetLists = targetLists;
            Threshold = threshold;
            Times = times;
            Webhook = webhook;
        }
    }
}