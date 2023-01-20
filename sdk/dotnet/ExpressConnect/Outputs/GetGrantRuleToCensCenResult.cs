// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect.Outputs
{

    [OutputType]
    public sealed class GetGrantRuleToCensCenResult
    {
        /// <summary>
        /// The ID of the authorized CEN instance.
        /// </summary>
        public readonly string CenId;
        /// <summary>
        /// The user ID (UID) of the Alibaba Cloud account to which the CEN instance belongs.
        /// </summary>
        public readonly int CenOwnerId;
        /// <summary>
        /// The time when the instance was created.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The ID of the Grant Rule To Cen. It formats as `&lt;cen_id&gt;:&lt;cen_owner_id&gt;:&lt;instance_id&gt;`.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGrantRuleToCensCenResult(
            string cenId,

            int cenOwnerId,

            string createTime,

            string id)
        {
            CenId = cenId;
            CenOwnerId = cenOwnerId;
            CreateTime = createTime;
            Id = id;
        }
    }
}
