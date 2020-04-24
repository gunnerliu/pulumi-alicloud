// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oss.Outputs
{

    [OutputType]
    public sealed class BucketRefererConfig
    {
        /// <summary>
        /// Allows referer to be empty. Defaults false.
        /// </summary>
        public readonly bool? AllowEmpty;
        /// <summary>
        /// The list of referer.
        /// </summary>
        public readonly ImmutableArray<string> Referers;

        [OutputConstructor]
        private BucketRefererConfig(
            bool? allowEmpty,

            ImmutableArray<string> referers)
        {
            AllowEmpty = allowEmpty;
            Referers = referers;
        }
    }
}
