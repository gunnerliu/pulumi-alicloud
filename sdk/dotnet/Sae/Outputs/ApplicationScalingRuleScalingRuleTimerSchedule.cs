// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae.Outputs
{

    [OutputType]
    public sealed class ApplicationScalingRuleScalingRuleTimerSchedule
    {
        /// <summary>
        /// Trigger point in time. When supporting format: minutes, for example: `08:00`.
        /// </summary>
        public readonly string? AtTime;
        /// <summary>
        /// Maximum number of instances applied.
        /// </summary>
        public readonly int? MaxReplicas;
        /// <summary>
        /// Minimum number of instances applied.
        /// </summary>
        public readonly int? MinReplicas;
        /// <summary>
        /// This parameter can specify the number of instances to be applied or the minimum number of surviving instances per deployment. value range [1,50]. &gt; **NOTE:** The attribute is valid when the attribute `scaling_rule_type` is `timing`.
        /// </summary>
        public readonly int? TargetReplicas;

        [OutputConstructor]
        private ApplicationScalingRuleScalingRuleTimerSchedule(
            string? atTime,

            int? maxReplicas,

            int? minReplicas,

            int? targetReplicas)
        {
            AtTime = atTime;
            MaxReplicas = maxReplicas;
            MinReplicas = minReplicas;
            TargetReplicas = targetReplicas;
        }
    }
}
