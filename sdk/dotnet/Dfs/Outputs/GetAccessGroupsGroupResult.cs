// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs.Outputs
{

    [OutputType]
    public sealed class GetAccessGroupsGroupResult
    {
        /// <summary>
        /// The length of `description` does not exceed 100 bytes.
        /// </summary>
        public readonly string AccessGroupId;
        /// <summary>
        /// The Name of Access Group. The length Of `access_group_name` does not exceed 100 bytes.
        /// </summary>
        public readonly string AccessGroupName;
        /// <summary>
        /// The CreateTime of Access Group.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The Description of Access Group. The length Of `description` does not exceed 100 bytes.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Access Group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Number of attached mountpoint.
        /// </summary>
        public readonly int MountPointCount;
        /// <summary>
        /// The NetworkType of Access Group. Valid values: `VPC`.
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The Number of access rule.
        /// </summary>
        public readonly int RuleCount;

        [OutputConstructor]
        private GetAccessGroupsGroupResult(
            string accessGroupId,

            string accessGroupName,

            string createTime,

            string description,

            string id,

            int mountPointCount,

            string networkType,

            int ruleCount)
        {
            AccessGroupId = accessGroupId;
            AccessGroupName = accessGroupName;
            CreateTime = createTime;
            Description = description;
            Id = id;
            MountPointCount = mountPointCount;
            NetworkType = networkType;
            RuleCount = ruleCount;
        }
    }
}
