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
    public sealed class GetTransitRouterRouteTablesTableResult
    {
        /// <summary>
        /// ID of resource.
        /// </summary>
        public readonly string Id;
        public readonly string Status;
        /// <summary>
        /// The description of the transit router route table.
        /// </summary>
        public readonly string TransitRouterRouteTableDescription;
        /// <summary>
        /// ID of the trabsit router route table.
        /// </summary>
        public readonly string TransitRouterRouteTableId;
        /// <summary>
        /// Name of the transit router route table.
        /// </summary>
        public readonly string TransitRouterRouteTableName;
        /// <summary>
        /// The type of the transit router route table to query. Valid values `Creating`, `Active` and `Deleting`..
        /// </summary>
        public readonly string TransitRouterRouteTableType;

        [OutputConstructor]
        private GetTransitRouterRouteTablesTableResult(
            string id,

            string status,

            string transitRouterRouteTableDescription,

            string transitRouterRouteTableId,

            string transitRouterRouteTableName,

            string transitRouterRouteTableType)
        {
            Id = id;
            Status = status;
            TransitRouterRouteTableDescription = transitRouterRouteTableDescription;
            TransitRouterRouteTableId = transitRouterRouteTableId;
            TransitRouterRouteTableName = transitRouterRouteTableName;
            TransitRouterRouteTableType = transitRouterRouteTableType;
        }
    }
}
