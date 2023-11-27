// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection.Outputs
{

    [OutputType]
    public sealed class SasTrailServiceTrail
    {
        /// <summary>
        /// Service tracking on status. The value is:
        /// - **on:** Open
        /// - **off:** off.
        /// </summary>
        public readonly string? Config;
        /// <summary>
        /// The timestamp of the last service update. Unit: milliseconds.
        /// </summary>
        public readonly int? UpdateTime;

        [OutputConstructor]
        private SasTrailServiceTrail(
            string? config,

            int? updateTime)
        {
            Config = config;
            UpdateTime = updateTime;
        }
    }
}
