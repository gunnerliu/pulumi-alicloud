// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB.Outputs
{

    [OutputType]
    public sealed class GetParameterGroupsGroupResult
    {
        /// <summary>
        /// The time when the parameter template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The type of the database engine.
        /// </summary>
        public readonly string DbType;
        /// <summary>
        /// The version number of the database engine.
        /// </summary>
        public readonly string DbVersion;
        /// <summary>
        /// Indicates whether to restart the cluster when this parameter template is applied.
        /// </summary>
        public readonly string ForceRestart;
        /// <summary>
        /// The ID of the Parameter Group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The number of parameters in the parameter template.
        /// </summary>
        public readonly int ParameterCounts;
        /// <summary>
        /// The description of the parameter template.
        /// </summary>
        public readonly string ParameterGroupDesc;
        /// <summary>
        /// The ID of the Parameter Group.
        /// </summary>
        public readonly string ParameterGroupId;
        /// <summary>
        /// The name of the parameter template.
        /// </summary>
        public readonly string ParameterGroupName;
        /// <summary>
        /// The type of the parameter template.
        /// </summary>
        public readonly string ParameterGroupType;

        [OutputConstructor]
        private GetParameterGroupsGroupResult(
            string createTime,

            string dbType,

            string dbVersion,

            string forceRestart,

            string id,

            int parameterCounts,

            string parameterGroupDesc,

            string parameterGroupId,

            string parameterGroupName,

            string parameterGroupType)
        {
            CreateTime = createTime;
            DbType = dbType;
            DbVersion = dbVersion;
            ForceRestart = forceRestart;
            Id = id;
            ParameterCounts = parameterCounts;
            ParameterGroupDesc = parameterGroupDesc;
            ParameterGroupId = parameterGroupId;
            ParameterGroupName = parameterGroupName;
            ParameterGroupType = parameterGroupType;
        }
    }
}
