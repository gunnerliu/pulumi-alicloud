// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class AlarmEscalationsInfo
    {
        /// <summary>
        /// Critical level alarm comparison operator. Valid values: ["&lt;=", "&lt;", "&gt;", "&gt;=", "==", "!="]. Default to "==".
        /// </summary>
        public readonly string? ComparisonOperator;
        /// <summary>
        /// Critical level alarm statistics method. It must be consistent with that defined for metrics. Valid values: ["Availability","Average", "Minimum", "Maximum", "Value", "ErrorCodeMaximum", "Sum", "Count"]. Default to "Average".
        /// </summary>
        public readonly string? Statistics;
        /// <summary>
        /// Critical level alarm threshold value, which must be a numeric value currently.
        /// </summary>
        public readonly string? Threshold;
        /// <summary>
        /// The number of consecutive triggers. If the number of times that the metric values meet the trigger conditions reaches the value of this parameter, CloudMonitor sends alert notifications.
        /// </summary>
        public readonly int? Times;

        [OutputConstructor]
        private AlarmEscalationsInfo(
            string? comparisonOperator,

            string? statistics,

            string? threshold,

            int? times)
        {
            ComparisonOperator = comparisonOperator;
            Statistics = statistics;
            Threshold = threshold;
            Times = times;
        }
    }
}
