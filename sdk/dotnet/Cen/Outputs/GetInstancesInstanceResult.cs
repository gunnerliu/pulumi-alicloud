// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// List of CEN Bandwidth Package IDs in the specified CEN instance.
        /// </summary>
        public readonly ImmutableArray<string> CenBandwidthPackageIds;
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        public readonly string CenId;
        /// <summary>
        /// Description of the CEN instance.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the CEN instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates the allowed level of CIDR block overlapping.
        /// </summary>
        public readonly string ProtectionLevel;
        /// <summary>
        /// Status of the CEN instance, including "Creating", "Active" and "Deleting".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, object> Tags;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            ImmutableArray<string> cenBandwidthPackageIds,

            string cenId,

            string description,

            string id,

            string name,

            string protectionLevel,

            string status,

            ImmutableDictionary<string, object> tags)
        {
            CenBandwidthPackageIds = cenBandwidthPackageIds;
            CenId = cenId;
            Description = description;
            Id = id;
            Name = name;
            ProtectionLevel = protectionLevel;
            Status = status;
            Tags = tags;
        }
    }
}
