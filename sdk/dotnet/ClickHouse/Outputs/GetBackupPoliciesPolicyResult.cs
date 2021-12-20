// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse.Outputs
{

    [OutputType]
    public sealed class GetBackupPoliciesPolicyResult
    {
        /// <summary>
        /// Data backup days. Valid values: `7` to `730`.
        /// </summary>
        public readonly int BackupRetentionPeriod;
        /// <summary>
        /// The db cluster id.
        /// </summary>
        public readonly string DbClusterId;
        /// <summary>
        /// The ID of the Backup Policy.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// DBCluster Backup period.
        /// </summary>
        public readonly ImmutableArray<string> PreferredBackupPeriods;
        /// <summary>
        /// Backup Time, UTC time.
        /// </summary>
        public readonly string PreferredBackupTime;
        /// <summary>
        /// The status of the resource.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetBackupPoliciesPolicyResult(
            int backupRetentionPeriod,

            string dbClusterId,

            string id,

            ImmutableArray<string> preferredBackupPeriods,

            string preferredBackupTime,

            string status)
        {
            BackupRetentionPeriod = backupRetentionPeriod;
            DbClusterId = dbClusterId;
            Id = id;
            PreferredBackupPeriods = preferredBackupPeriods;
            PreferredBackupTime = preferredBackupTime;
            Status = status;
        }
    }
}
