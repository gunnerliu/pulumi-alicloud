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
        public readonly ImmutableArray<string> BandwidthPackageIds;
        /// <summary>
        /// List of child instance IDs in the specified CEN instance.
        /// </summary>
        public readonly ImmutableArray<string> ChildInstanceIds;
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
        /// Status of the CEN instance, including "Creating", "Active" and "Deleting".
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            ImmutableArray<string> bandwidthPackageIds,

            ImmutableArray<string> childInstanceIds,

            string description,

            string id,

            string name,

            string status)
        {
            BandwidthPackageIds = bandwidthPackageIds;
            ChildInstanceIds = childInstanceIds;
            Description = description;
            Id = id;
            Name = name;
            Status = status;
        }
    }
}
