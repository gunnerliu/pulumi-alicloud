// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Outputs
{

    [OutputType]
    public sealed class ScalingConfigurationInstancePatternInfo
    {
        /// <summary>
        /// The number of vCPUs that are specified for an instance type in instancePatternInfo.
        /// </summary>
        public readonly int? Cores;
        /// <summary>
        /// The instance family level in instancePatternInfo.
        /// </summary>
        public readonly string? InstanceFamilyLevel;
        /// <summary>
        /// The maximum hourly price for a pay-as-you-go instance or a preemptible instance in instancePatternInfo.
        /// </summary>
        public readonly double? MaxPrice;
        /// <summary>
        /// The memory size that is specified for an instance type in instancePatternInfo.
        /// </summary>
        public readonly double? Memory;

        [OutputConstructor]
        private ScalingConfigurationInstancePatternInfo(
            int? cores,

            string? instanceFamilyLevel,

            double? maxPrice,

            double? memory)
        {
            Cores = cores;
            InstanceFamilyLevel = instanceFamilyLevel;
            MaxPrice = maxPrice;
            Memory = memory;
        }
    }
}
