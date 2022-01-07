// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    /// <summary>
    /// Provides a RDS Backup resource.
    /// 
    /// For information about RDS Backup and how to use it, see [What is Backup](https://www.alibabacloud.com/help/doc-detail/26272.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.149.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var exampleInstance = new AliCloud.Rds.Instance("exampleInstance", new AliCloud.Rds.InstanceArgs
    ///         {
    ///             Engine = "MySQL",
    ///             EngineVersion = "5.6",
    ///             InstanceType = "rds.mysql.t1.small",
    ///             InstanceStorage = 30,
    ///             InstanceChargeType = "Postpaid",
    ///             DbInstanceStorageType = "local_ssd",
    ///         });
    ///         var exampleRdsBackup = new AliCloud.Rds.RdsBackup("exampleRdsBackup", new AliCloud.Rds.RdsBackupArgs
    ///         {
    ///             DbInstanceId = exampleInstance.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// RDS Backup can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:rds/rdsBackup:RdsBackup example &lt;db_instance_id&gt;:&lt;backup_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:rds/rdsBackup:RdsBackup")]
    public partial class RdsBackup : Pulumi.CustomResource
    {
        /// <summary>
        /// The backup id.
        /// </summary>
        [Output("backupId")]
        public Output<string> BackupId { get; private set; } = null!;

        /// <summary>
        /// The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        /// </summary>
        [Output("backupMethod")]
        public Output<string> BackupMethod { get; private set; } = null!;

        /// <summary>
        /// The policy that you want to use for the backup task. Valid values:
        /// * **db**: specifies to perform a database-level backup.
        /// * **instance**: specifies to perform an instance-level backup.
        /// </summary>
        [Output("backupStrategy")]
        public Output<string?> BackupStrategy { get; private set; } = null!;

        /// <summary>
        /// The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        /// * **Auto**: specifies to automatically perform a full or incremental backup.
        /// * **FullBackup**: specifies to perform a full backup.
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Output("dbInstanceId")]
        public Output<string> DbInstanceId { get; private set; } = null!;

        /// <summary>
        /// The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        /// </summary>
        [Output("dbName")]
        public Output<string?> DbName { get; private set; } = null!;

        /// <summary>
        /// Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        /// </summary>
        [Output("removeFromState")]
        public Output<bool?> RemoveFromState { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        /// </summary>
        [Output("storeStatus")]
        public Output<string> StoreStatus { get; private set; } = null!;


        /// <summary>
        /// Create a RdsBackup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RdsBackup(string name, RdsBackupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:rds/rdsBackup:RdsBackup", name, args ?? new RdsBackupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RdsBackup(string name, Input<string> id, RdsBackupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:rds/rdsBackup:RdsBackup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RdsBackup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RdsBackup Get(string name, Input<string> id, RdsBackupState? state = null, CustomResourceOptions? options = null)
        {
            return new RdsBackup(name, id, state, options);
        }
    }

    public sealed class RdsBackupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        /// </summary>
        [Input("backupMethod")]
        public Input<string>? BackupMethod { get; set; }

        /// <summary>
        /// The policy that you want to use for the backup task. Valid values:
        /// * **db**: specifies to perform a database-level backup.
        /// * **instance**: specifies to perform an instance-level backup.
        /// </summary>
        [Input("backupStrategy")]
        public Input<string>? BackupStrategy { get; set; }

        /// <summary>
        /// The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        /// * **Auto**: specifies to automatically perform a full or incremental backup.
        /// * **FullBackup**: specifies to perform a full backup.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        /// <summary>
        /// The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        /// </summary>
        [Input("removeFromState")]
        public Input<bool>? RemoveFromState { get; set; }

        public RdsBackupArgs()
        {
        }
    }

    public sealed class RdsBackupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The backup id.
        /// </summary>
        [Input("backupId")]
        public Input<string>? BackupId { get; set; }

        /// <summary>
        /// The type of backup that you want to perform. Default value: `Physical`. Valid values: `Logical`, `Physical` and `Snapshot`.
        /// </summary>
        [Input("backupMethod")]
        public Input<string>? BackupMethod { get; set; }

        /// <summary>
        /// The policy that you want to use for the backup task. Valid values:
        /// * **db**: specifies to perform a database-level backup.
        /// * **instance**: specifies to perform an instance-level backup.
        /// </summary>
        [Input("backupStrategy")]
        public Input<string>? BackupStrategy { get; set; }

        /// <summary>
        /// The method that you want to use for the backup task. Default value: `Auto`. Valid values:
        /// * **Auto**: specifies to automatically perform a full or incremental backup.
        /// * **FullBackup**: specifies to perform a full backup.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId")]
        public Input<string>? DbInstanceId { get; set; }

        /// <summary>
        /// The names of the databases whose data you want to back up. Separate the names of the databases with commas (,).
        /// </summary>
        [Input("dbName")]
        public Input<string>? DbName { get; set; }

        /// <summary>
        /// Remove form state when resource cannot be deleted. Valid values: `true` and `false`.
        /// </summary>
        [Input("removeFromState")]
        public Input<bool>? RemoveFromState { get; set; }

        /// <summary>
        /// Indicates whether the data backup file can be deleted. Valid values: `Enabled` and `Disabled`.
        /// </summary>
        [Input("storeStatus")]
        public Input<string>? StoreStatus { get; set; }

        public RdsBackupState()
        {
        }
    }
}