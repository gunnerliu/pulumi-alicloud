// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS.Outputs
{

    [OutputType]
    public sealed class NodePoolRolloutPolicy
    {
        /// <summary>
        /// Maximum number of unavailable nodes during rolling upgrade. The value of this field should be greater than `0`, and if it's set to a number less than or equal to `0`, the default setting will be used. Please use `max_parallelism` to instead it from provider version 1.185.0.
        /// </summary>
        public readonly int? MaxUnavailable;

        [OutputConstructor]
        private NodePoolRolloutPolicy(int? maxUnavailable)
        {
            MaxUnavailable = maxUnavailable;
        }
    }
}