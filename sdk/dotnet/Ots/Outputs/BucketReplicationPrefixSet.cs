// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots.Outputs
{

    [OutputType]
    public sealed class BucketReplicationPrefixSet
    {
        /// <summary>
        /// The list of object key name prefix identifying one or more objects to which the rule applies.
        /// </summary>
        public readonly ImmutableArray<string> Prefixes;

        [OutputConstructor]
        private BucketReplicationPrefixSet(ImmutableArray<string> prefixes)
        {
            Prefixes = prefixes;
        }
    }
}
