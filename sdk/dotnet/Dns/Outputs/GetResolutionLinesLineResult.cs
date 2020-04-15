// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns.Outputs
{

    [OutputType]
    public sealed class GetResolutionLinesLineResult
    {
        public readonly string LineCode;
        /// <summary>
        /// Line display name.
        /// </summary>
        public readonly string LineDisplayName;
        /// <summary>
        /// Line name.
        /// </summary>
        public readonly string LineName;

        [OutputConstructor]
        private GetResolutionLinesLineResult(
            string lineCode,

            string lineDisplayName,

            string lineName)
        {
            LineCode = lineCode;
            LineDisplayName = lineDisplayName;
            LineName = lineName;
        }
    }
}
