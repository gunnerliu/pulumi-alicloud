// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Log.Outputs
{

    [OutputType]
    public sealed class StoreShard
    {
        /// <summary>
        /// The begin value of the shard range(MD5), included in the shard range.
        /// </summary>
        public readonly string? BeginKey;
        /// <summary>
        /// The end value of the shard range(MD5), not included in shard range.
        /// </summary>
        public readonly string? EndKey;
        /// <summary>
        /// The ID of the shard.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// Shard status, only two status of `readwrite` and `readonly`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private StoreShard(
            string? beginKey,

            string? endKey,

            int? id,

            string? status)
        {
            BeginKey = beginKey;
            EndKey = endKey;
            Id = id;
            Status = status;
        }
    }
}
