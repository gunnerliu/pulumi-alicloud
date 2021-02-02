// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager.Outputs
{

    [OutputType]
    public sealed class GetResourceGroupsGroupRegionStatusResult
    {
        /// <summary>
        /// The region ID.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// The status of the resource group. Possible values:`Creating`,`Deleted`,`Deleting`(Available 1.114.0+) `OK` and `PendingDelete`.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetResourceGroupsGroupRegionStatusResult(
            string regionId,

            string status)
        {
            RegionId = regionId;
            Status = status;
        }
    }
}
