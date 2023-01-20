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
    public sealed class GetBackupJobsJobResult
    {
        /// <summary>
        /// The actual data volume of the backup task (After deduplication) . Unit byte.
        /// </summary>
        public readonly string ActualBytes;
        /// <summary>
        /// The actual number of items in the backup task. (Currently only file backup is available).
        /// </summary>
        public readonly string ActualItems;
        /// <summary>
        /// The name of backup job.
        /// </summary>
        public readonly string BackJobName;
        /// <summary>
        /// The ID of the backup job.
        /// </summary>
        public readonly string BackupJobId;
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`(full backup).
        /// </summary>
        public readonly string BackupType;
        /// <summary>
        /// The name of target OSS bucket.
        /// </summary>
        public readonly string Bucket;
        /// <summary>
        /// The amount of backup data (Incremental). Unit byte.
        /// </summary>
        public readonly string BytesDone;
        /// <summary>
        /// The total amount of data sources. Unit byte.
        /// </summary>
        public readonly string BytesTotal;
        /// <summary>
        /// The completion time of backup job. UNIX time seconds.
        /// </summary>
        public readonly string CompleteTime;
        /// <summary>
        /// The creation time of backup job. UNIX time seconds.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account. It is valid only when `source_type` is `ECS_FILE`, `NAS`, `OSS` or `OTS`.
        /// </summary>
        public readonly string CrossAccountRoleName;
        /// <summary>
        /// The type of the cross account backup. It is valid only when `source_type` is `ECS_FILE`, `NAS`, `OSS` or `OTS`.
        /// </summary>
        public readonly string CrossAccountType;
        /// <summary>
        /// The original account ID of the cross account backup managed by the current account. It is valid only when `source_type` is `ECS_FILE`, `NAS`, `OSS` or `OTS`.
        /// </summary>
        public readonly int CrossAccountUserId;
        /// <summary>
        /// Error message.
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Exclude path. String of Json list. Up to 255 characters. e.g. `"[\"/home/work\"]"`
        /// </summary>
        public readonly string Exclude;
        /// <summary>
        /// The ID of destination file system.
        /// </summary>
        public readonly string FileSystemId;
        /// <summary>
        /// The ID of the backup job.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Include path. String of Json list. Up to 255 characters. e.g. `"[\"/var\"]"`
        /// </summary>
        public readonly string Include;
        /// <summary>
        /// The ID of target ECS instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// The number of items restore job recovered.
        /// </summary>
        public readonly string ItemsDone;
        /// <summary>
        /// The total number of items restore job recovered.
        /// </summary>
        public readonly string ItemsTotal;
        /// <summary>
        /// File system creation time. UNIX time in seconds.
        /// </summary>
        public readonly string NasCreateTime;
        public readonly ImmutableArray<Outputs.GetBackupJobsJobOtsDetailResult> OtsDetails;
        /// <summary>
        /// List of backup path. e.g. `["/home", "/var"]`.
        /// </summary>
        public readonly ImmutableArray<string> Paths;
        /// <summary>
        /// The ID of a backup plan.
        /// </summary>
        public readonly string PlanId;
        /// <summary>
        /// The prefix of Oss bucket files.
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// Backup progress. The value is 100%*100.
        /// </summary>
        public readonly string Progress;
        /// <summary>
        /// The type of data source. Valid Values: `ECS_FILE`, `OSS`, `NAS`, `UDM_DISK`.
        /// </summary>
        public readonly string SourceType;
        /// <summary>
        /// The scheduled backup start time. UNIX time seconds.
        /// </summary>
        public readonly string StartTime;
        /// <summary>
        /// The status of restore job. Valid values: `COMPLETE` , `PARTIAL_COMPLETE`, `FAILED`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The update time of backup job. UNIX time seconds.
        /// </summary>
        public readonly string UpdatedTime;
        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        public readonly string VaultId;

        [OutputConstructor]
        private GetBackupJobsJobResult(
            string actualBytes,

            string actualItems,

            string backJobName,

            string backupJobId,

            string backupType,

            string bucket,

            string bytesDone,

            string bytesTotal,

            string completeTime,

            string createTime,

            string crossAccountRoleName,

            string crossAccountType,

            int crossAccountUserId,

            string errorMessage,

            string exclude,

            string fileSystemId,

            string id,

            string include,

            string instanceId,

            string itemsDone,

            string itemsTotal,

            string nasCreateTime,

            ImmutableArray<Outputs.GetBackupJobsJobOtsDetailResult> otsDetails,

            ImmutableArray<string> paths,

            string planId,

            string prefix,

            string progress,

            string sourceType,

            string startTime,

            string status,

            string updatedTime,

            string vaultId)
        {
            ActualBytes = actualBytes;
            ActualItems = actualItems;
            BackJobName = backJobName;
            BackupJobId = backupJobId;
            BackupType = backupType;
            Bucket = bucket;
            BytesDone = bytesDone;
            BytesTotal = bytesTotal;
            CompleteTime = completeTime;
            CreateTime = createTime;
            CrossAccountRoleName = crossAccountRoleName;
            CrossAccountType = crossAccountType;
            CrossAccountUserId = crossAccountUserId;
            ErrorMessage = errorMessage;
            Exclude = exclude;
            FileSystemId = fileSystemId;
            Id = id;
            Include = include;
            InstanceId = instanceId;
            ItemsDone = itemsDone;
            ItemsTotal = itemsTotal;
            NasCreateTime = nasCreateTime;
            OtsDetails = otsDetails;
            Paths = paths;
            PlanId = planId;
            Prefix = prefix;
            Progress = progress;
            SourceType = sourceType;
            StartTime = startTime;
            Status = status;
            UpdatedTime = updatedTime;
            VaultId = vaultId;
        }
    }
}
