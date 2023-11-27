// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos.Outputs
{

    [OutputType]
    public sealed class GetDdosBgpInstancesInstanceResult
    {
        /// <summary>
        /// The instance's elastic defend bandwidth.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// The instance's base defend bandwidth.
        /// </summary>
        public readonly int BaseBandwidth;
        /// <summary>
        /// The instance's id.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The instance's count of ip config.
        /// </summary>
        public readonly int IpCount;
        /// <summary>
        /// The instance's IP version.
        /// </summary>
        public readonly string IpType;
        /// <summary>
        /// The instance's remark.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Normal defend bandwidth of the instance. The unit is Gbps.
        /// </summary>
        public readonly int NormalBandwidth;
        /// <summary>
        /// The instance's region.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The instance's type.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDdosBgpInstancesInstanceResult(
            int bandwidth,

            int baseBandwidth,

            string id,

            int ipCount,

            string ipType,

            string name,

            int normalBandwidth,

            string region,

            string type)
        {
            Bandwidth = bandwidth;
            BaseBandwidth = baseBandwidth;
            Id = id;
            IpCount = ipCount;
            IpType = ipType;
            Name = name;
            NormalBandwidth = normalBandwidth;
            Region = region;
            Type = type;
        }
    }
}
