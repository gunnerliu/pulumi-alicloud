// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc.Outputs
{

    [OutputType]
    public sealed class GetRouteEntriesEntryResult
    {
        /// <summary>
        /// The destination CIDR block of the route entry.
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// The instance ID of the next hop.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The type of the next hop.
        /// </summary>
        public readonly string NextHopType;
        /// <summary>
        /// The ID of the router table to which the route entry belongs.
        /// </summary>
        public readonly string RouteTableId;
        /// <summary>
        /// The status of the route entry.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The type of the route entry.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetRouteEntriesEntryResult(
            string cidrBlock,

            string instanceId,

            string nextHopType,

            string routeTableId,

            string status,

            string type)
        {
            CidrBlock = cidrBlock;
            InstanceId = instanceId;
            NextHopType = nextHopType;
            RouteTableId = routeTableId;
            Status = status;
            Type = type;
        }
    }
}
