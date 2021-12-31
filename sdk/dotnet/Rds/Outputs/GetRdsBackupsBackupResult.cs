// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds.Outputs
{

    [OutputType]
    public sealed class GetRdsBackupsBackupResult
    {
        /// <summary>
        /// The backup download url.
        /// </summary>
        public readonly string BackupDownloadUrl;
        /// <summary>
        /// BackupEndTime.
        /// </summary>
        public readonly string BackupEndTime;
        /// <summary>
        /// BackupId.
        /// </summary>
        public readonly string BackupId;
        /// <summary>
        /// The initiator of the backup task. Value:
        /// * **System**: automatically initiated by the System
        /// * **User**: manually initiated by the User.
        /// </summary>
        public readonly string BackupInitiator;
        /// <summary>
        /// The backup intranet download url.
        /// </summary>
        public readonly string BackupIntranetDownloadUrl;
        /// <summary>
        /// BackupMethod.
        /// </summary>
        public readonly string BackupMethod;
        /// <summary>
        /// BackupMode.
        /// </summary>
        public readonly string BackupMode;
        /// <summary>
        /// BackupSize.
        /// </summary>
        public readonly string BackupSize;
        /// <summary>
        /// BackupStartTime.
        /// </summary>
        public readonly string BackupStartTime;
        /// <summary>
        /// Backup task status. **NOTE:** This parameter will only be returned when a task is executed. Value:
        /// * **NoStart**: Not started
        /// * **Checking**: check the backup
        /// * **Preparing**: Prepare a backup
        /// * **Waiting**: Waiting for backup
        /// * **Uploading**: Upload backup
        /// * **Finished**: Complete backup
        /// * **Failed**: backup Failed
        /// </summary>
        public readonly string BackupStatus;
        /// <summary>
        /// BackupType.
        /// </summary>
        public readonly string BackupType;
        /// <summary>
        /// The consistency point of the backup set. The return value is a timestamp. **NOTE:** only MySQL 5.6 returns this parameter, and other versions return 0.
        /// </summary>
        public readonly string ConsistentTime;
        /// <summary>
        /// The backup mode is divided into the normal backup mode (full and incremental recovery is supported) and the replication-only mode (full recovery is supported only). **NOTE:** Only SQL Server returns this parameter. Valid values:
        /// * **0**: General Backup Mode
        /// * **1**: Copy only mode
        /// </summary>
        public readonly string CopyOnlyBackup;
        /// <summary>
        /// The db instance id.
        /// </summary>
        public readonly string DbInstanceId;
        /// <summary>
        /// The encrypted information of the backup set.
        /// </summary>
        public readonly string Encryption;
        /// <summary>
        /// HostInstanceID.
        /// </summary>
        public readonly string HostInstanceId;
        /// <summary>
        /// The ID of the Backup.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the backup set is available, the value is:
        /// * **0**: Not available
        /// * **1**: Available.
        /// </summary>
        public readonly int IsAvail;
        /// <summary>
        /// The backup set status of the database table. **NOTE:** an empty string indicates that the backup set for database table recovery is not enabled. Valid values:
        /// * **OK**: normal.
        /// * **LARGE**: There are too many tables that cannot be used for database and table recovery.
        /// * **EMPTY**: The backup set that failed to be backed up.
        /// </summary>
        public readonly string MetaStatus;
        /// <summary>
        /// The storage medium for the backup set. Valid values:
        /// * **0**: Regular storage
        /// * **1**: Archive storage.
        /// </summary>
        public readonly string StorageClass;
        /// <summary>
        /// StoreStatus.
        /// </summary>
        public readonly string StoreStatus;

        [OutputConstructor]
        private GetRdsBackupsBackupResult(
            string backupDownloadUrl,

            string backupEndTime,

            string backupId,

            string backupInitiator,

            string backupIntranetDownloadUrl,

            string backupMethod,

            string backupMode,

            string backupSize,

            string backupStartTime,

            string backupStatus,

            string backupType,

            string consistentTime,

            string copyOnlyBackup,

            string dbInstanceId,

            string encryption,

            string hostInstanceId,

            string id,

            int isAvail,

            string metaStatus,

            string storageClass,

            string storeStatus)
        {
            BackupDownloadUrl = backupDownloadUrl;
            BackupEndTime = backupEndTime;
            BackupId = backupId;
            BackupInitiator = backupInitiator;
            BackupIntranetDownloadUrl = backupIntranetDownloadUrl;
            BackupMethod = backupMethod;
            BackupMode = backupMode;
            BackupSize = backupSize;
            BackupStartTime = backupStartTime;
            BackupStatus = backupStatus;
            BackupType = backupType;
            ConsistentTime = consistentTime;
            CopyOnlyBackup = copyOnlyBackup;
            DbInstanceId = dbInstanceId;
            Encryption = encryption;
            HostInstanceId = hostInstanceId;
            Id = id;
            IsAvail = isAvail;
            MetaStatus = metaStatus;
            StorageClass = storageClass;
            StoreStatus = storeStatus;
        }
    }
}
