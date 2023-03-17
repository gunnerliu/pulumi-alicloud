// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo.Outputs
{

    [OutputType]
    public sealed class GetVpdsVpdResult
    {
        /// <summary>
        /// CIDR network segment
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// The creation time of the resource
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Modification time
        /// </summary>
        public readonly string GmtModified;
        /// <summary>
        /// The id of the vpd.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Resource group id
        /// </summary>
        public readonly string ResourceGroupId;
        /// <summary>
        /// The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The id of the vpd.
        /// </summary>
        public readonly string VpdId;
        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        public readonly string VpdName;

        [OutputConstructor]
        private GetVpdsVpdResult(
            string cidr,

            string createTime,

            string gmtModified,

            string id,

            string resourceGroupId,

            string status,

            string vpdId,

            string vpdName)
        {
            Cidr = cidr;
            CreateTime = createTime;
            GmtModified = gmtModified;
            Id = id;
            ResourceGroupId = resourceGroupId;
            Status = status;
            VpdId = vpdId;
            VpdName = vpdName;
        }
    }
}
