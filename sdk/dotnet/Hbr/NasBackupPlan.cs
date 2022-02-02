// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    /// <summary>
    /// Provides a HBR Nas Backup Plan resource.
    /// 
    /// For information about HBR Nas Backup Plan and how to use it, see [What is Nas Backup Plan](https://www.alibabacloud.com/help/doc-detail/132248.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.132.0+.
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
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "tf-testAccHBRNas";
    ///         var defaultVault = new AliCloud.Hbr.Vault("defaultVault", new AliCloud.Hbr.VaultArgs
    ///         {
    ///             VaultName = name,
    ///         });
    ///         var defaultFileSystem = new AliCloud.Nas.FileSystem("defaultFileSystem", new AliCloud.Nas.FileSystemArgs
    ///         {
    ///             ProtocolType = "NFS",
    ///             StorageType = "Performance",
    ///             Description = name,
    ///             EncryptType = 1,
    ///         });
    ///         var defaultFileSystems = defaultFileSystem.Description.Apply(description =&gt; AliCloud.Nas.GetFileSystems.Invoke(new AliCloud.Nas.GetFileSystemsInvokeArgs
    ///         {
    ///             ProtocolType = "NFS",
    ///             DescriptionRegex = description,
    ///         }));
    ///         var defaultNasBackupPlan = new AliCloud.Hbr.NasBackupPlan("defaultNasBackupPlan", new AliCloud.Hbr.NasBackupPlanArgs
    ///         {
    ///             NasBackupPlanName = name,
    ///             FileSystemId = defaultFileSystem.Id,
    ///             Schedule = "I|1602673264|PT2H",
    ///             BackupType = "COMPLETE",
    ///             VaultId = defaultVault.Id,
    ///             CreateTime = defaultFileSystems.Apply(defaultFileSystems =&gt; defaultFileSystems.Systems?[0]?.CreateTime),
    ///             Retention = "2",
    ///             Paths = 
    ///             {
    ///                 "/",
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 "alicloud_nas_file_system.default",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// HBR Nas Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/nasBackupPlan:NasBackupPlan example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/nasBackupPlan:NasBackupPlan")]
    public partial class NasBackupPlan : Pulumi.CustomResource
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

        /// <summary>
        /// File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        [Output("detail")]
        public Output<string?> Detail { get; private set; } = null!;

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        [Output("exclude")]
        public Output<string?> Exclude { get; private set; } = null!;

        /// <summary>
        /// The File System ID of Nas.
        /// </summary>
        [Output("fileSystemId")]
        public Output<string> FileSystemId { get; private set; } = null!;

        [Output("include")]
        public Output<string?> Include { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Output("nasBackupPlanName")]
        public Output<string> NasBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// Windows operating system with application consistency using VSS, e.g: `{"UseVSS":false}`.
        /// </summary>
        [Output("options")]
        public Output<string?> Options { get; private set; } = null!;

        /// <summary>
        /// List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
        /// </summary>
        [Output("paths")]
        public Output<ImmutableArray<string>> Paths { get; private set; } = null!;

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Output("retention")]
        public Output<string> Retention { get; private set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// </summary>
        [Output("schedule")]
        public Output<string> Schedule { get; private set; } = null!;

        [Output("speedLimit")]
        public Output<string?> SpeedLimit { get; private set; } = null!;

        [Output("updatePaths")]
        public Output<bool?> UpdatePaths { get; private set; } = null!;

        /// <summary>
        /// The ID of Backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a NasBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NasBackupPlan(string name, NasBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/nasBackupPlan:NasBackupPlan", name, args ?? new NasBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NasBackupPlan(string name, Input<string> id, NasBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/nasBackupPlan:NasBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NasBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NasBackupPlan Get(string name, Input<string> id, NasBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new NasBackupPlan(name, id, state, options);
        }
    }

    public sealed class NasBackupPlanArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType", required: true)]
        public Input<string> BackupType { get; set; } = null!;

        /// <summary>
        /// File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
        /// </summary>
        [Input("createTime", required: true)]
        public Input<string> CreateTime { get; set; } = null!;

        [Input("detail")]
        public Input<string>? Detail { get; set; }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The File System ID of Nas.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("nasBackupPlanName", required: true)]
        public Input<string> NasBackupPlanName { get; set; } = null!;

        /// <summary>
        /// Windows operating system with application consistency using VSS, e.g: `{"UseVSS":false}`.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("paths", required: true)]
        private InputList<string>? _paths;

        /// <summary>
        /// List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention", required: true)]
        public Input<string> Retention { get; set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        [Input("updatePaths")]
        public Input<bool>? UpdatePaths { get; set; }

        /// <summary>
        /// The ID of Backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public NasBackupPlanArgs()
        {
        }
    }

    public sealed class NasBackupPlanState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("detail")]
        public Input<string>? Detail { get; set; }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The File System ID of Nas.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("nasBackupPlanName")]
        public Input<string>? NasBackupPlanName { get; set; }

        /// <summary>
        /// Windows operating system with application consistency using VSS, e.g: `{"UseVSS":false}`.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// List of backup path. Up to 65536 characters. e.g.`["/home", "/var"]`. **Note** You should at least specify a backup path, empty array not allowed here.
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1.
        /// </summary>
        [Input("retention")]
        public Input<string>? Retention { get; set; }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        [Input("updatePaths")]
        public Input<bool>? UpdatePaths { get; set; }

        /// <summary>
        /// The ID of Backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public NasBackupPlanState()
        {
        }
    }
}
