// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Drds.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceResult
    {
        /// <summary>
        /// Creation time of the instance.
        /// </summary>
        public readonly int CreateTime;
        /// <summary>
        /// The DRDS instance description.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the DRDS instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// `Classic` for public classic network or `VPC` for private network.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// Status of the instance.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The DRDS Instance type.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The DRDS Instance version.
        /// </summary>
        public readonly int Version;
        /// <summary>
        /// Zone ID the instance belongs to.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetInstancesInstanceResult(
            int createTime,

            string description,

            string id,

            string networkType,

            string status,

            string type,

            int version,

            string zoneId)
        {
            CreateTime = createTime;
            Description = description;
            Id = id;
            NetworkType = networkType;
            Status = status;
            Type = type;
            Version = version;
            ZoneId = zoneId;
        }
    }
}
