// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr.Outputs
{

    [OutputType]
    public sealed class OtsBackupPlanRule
    {
        /// <summary>
        /// The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public readonly string? BackupType;
        /// <summary>
        /// Whether to disable the backup task. Valid values: true, false.
        /// </summary>
        public readonly bool? Disabled;
        /// <summary>
        /// Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public readonly string? Retention;
        /// <summary>
        /// The name of the backup rule.**Note:** Required while source_type equals `OTS_TABLE`. `rule_name` should be unique for the specific user.
        /// </summary>
        public readonly string? RuleName;
        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public readonly string? Schedule;

        [OutputConstructor]
        private OtsBackupPlanRule(
            string? backupType,

            bool? disabled,

            string? retention,

            string? ruleName,

            string? schedule)
        {
            BackupType = backupType;
            Disabled = disabled;
            Retention = retention;
            RuleName = ruleName;
            Schedule = schedule;
        }
    }
}
