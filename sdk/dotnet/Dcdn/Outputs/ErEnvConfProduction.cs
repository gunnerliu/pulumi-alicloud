// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn.Outputs
{

    [OutputType]
    public sealed class ErEnvConfProduction
    {
        /// <summary>
        /// Allowed DCDN domain names.
        /// </summary>
        public readonly ImmutableArray<string> AllowedHosts;
        /// <summary>
        /// The version number of the code.
        /// </summary>
        public readonly string? CodeRev;
        /// <summary>
        /// The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
        /// </summary>
        public readonly string? SpecName;

        [OutputConstructor]
        private ErEnvConfProduction(
            ImmutableArray<string> allowedHosts,

            string? codeRev,

            string? specName)
        {
            AllowedHosts = allowedHosts;
            CodeRev = codeRev;
            SpecName = specName;
        }
    }
}
