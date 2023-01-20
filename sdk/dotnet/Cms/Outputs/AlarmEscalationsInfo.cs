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
        /// It has been deprecated from provider version 1.94.0 and 'escalations_critical.statistics' instead.
        /// </summary>
        public readonly string? Statistics;
        /// <summary>
        /// It has been deprecated from provider version 1.94.0 and 'escalations_critical.threshold' instead.
        /// </summary>
        public readonly string? Threshold;
        /// <summary>
        /// Critical level alarm retry times. Default to 3.
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
