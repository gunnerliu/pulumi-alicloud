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
    public sealed class GetTransitRoutersTransitRouterResult
    {
        /// <summary>
        /// The UID of the Aliyun.
        /// </summary>
        public readonly string AliUid;
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        public readonly string CenId;
        /// <summary>
        /// The ID of the resource, It is formatted to `&lt;cen_id&gt;:&lt;transit_router_id&gt;`. **NOTE:** Before 1.151.0, It is formatted to `&lt;transit_router_id&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The status of the resource. Valid values `Active`, `Creating`, `Deleting` and `Updating`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The description of the transit router.
        /// </summary>
        public readonly string TransitRouterDescription;
        /// <summary>
        /// The ID of the transit router.
        /// </summary>
        public readonly string TransitRouterId;
        /// <summary>
        /// The name of the transit router.
        /// </summary>
        public readonly string TransitRouterName;
        /// <summary>
        /// The Type of the transit router.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The vip of the XGW.
        /// </summary>
        public readonly string XgwVip;

        [OutputConstructor]
        private GetTransitRoutersTransitRouterResult(
            string aliUid,

            string cenId,

            string id,

            string status,

            string transitRouterDescription,

            string transitRouterId,

            string transitRouterName,

            string type,

            string xgwVip)
        {
            AliUid = aliUid;
            CenId = cenId;
            Id = id;
            Status = status;
            TransitRouterDescription = transitRouterDescription;
            TransitRouterId = transitRouterId;
            TransitRouterName = transitRouterName;
            Type = type;
            XgwVip = xgwVip;
        }
    }
}
