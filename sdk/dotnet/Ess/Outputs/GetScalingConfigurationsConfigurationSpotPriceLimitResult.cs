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
    public sealed class GetScalingConfigurationsConfigurationSpotPriceLimitResult
    {
        /// <summary>
        /// Resource type of an ECS instance.
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// Price limit hourly of instance type.
        /// </summary>
        public readonly double? PriceLimit;

        [OutputConstructor]
        private GetScalingConfigurationsConfigurationSpotPriceLimitResult(
            string? instanceType,

            double? priceLimit)
        {
            InstanceType = instanceType;
            PriceLimit = priceLimit;
        }
    }
}
