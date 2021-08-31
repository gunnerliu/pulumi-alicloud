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
    /// Provides a Hybrid Backup Recovery (HBR) Restore Job resource.
    /// 
    /// For information about Hybrid Backup Recovery (HBR) Restore Job and how to use it, see [What is Restore Job](https://help.aliyun.com/document_detail/62361.html).
    /// 
    /// &gt; **NOTE:** Available in v1.133.0+.
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
    ///         var defaultNasBackupPlans = Output.Create(AliCloud.Hbr.GetNasBackupPlans.InvokeAsync(new AliCloud.Hbr.GetNasBackupPlansArgs
    ///         {
    ///             NameRegex = "plan-tf-used-dont-delete",
    ///         }));
    ///         var nasSnapshots = Output.Tuple(defaultNasBackupPlans, defaultNasBackupPlans, defaultNasBackupPlans).Apply(values =&gt;
    ///         {
    ///             var defaultNasBackupPlans = values.Item1;
    ///             var defaultNasBackupPlans1 = values.Item2;
    ///             var defaultNasBackupPlans2 = values.Item3;
    ///             return Output.Create(AliCloud.Hbr.GetSnapshots.InvokeAsync(new AliCloud.Hbr.GetSnapshotsArgs
    ///             {
    ///                 SourceType = "NAS",
    ///                 VaultId = defaultNasBackupPlans.Plans[0].VaultId,
    ///                 FileSystemId = defaultNasBackupPlans1.Plans[0].FileSystemId,
    ///                 CreateTime = defaultNasBackupPlans2.Plans[0].CreateTime,
    ///             }));
    ///         });
    ///         var defaultRestoreJob = new AliCloud.Hbr.RestoreJob("defaultRestoreJob", new AliCloud.Hbr.RestoreJobArgs
    ///         {
    ///             RestoreJobId = "tftestacc112358",
    ///             SnapshotHash = nasSnapshots.Apply(nasSnapshots =&gt; nasSnapshots.Snapshots[0].SnapshotHash),
    ///             VaultId = defaultNasBackupPlans.Apply(defaultNasBackupPlans =&gt; defaultNasBackupPlans.Plans[0].VaultId),
    ///             SourceType = "NAS",
    ///             RestoreType = "NAS",
    ///             SnapshotId = nasSnapshots.Apply(nasSnapshots =&gt; nasSnapshots.Snapshots[0].SnapshotId),
    ///             TargetFileSystemId = defaultNasBackupPlans.Apply(defaultNasBackupPlans =&gt; defaultNasBackupPlans.Plans[0].FileSystemId),
    ///             TargetCreateTime = defaultNasBackupPlans.Apply(defaultNasBackupPlans =&gt; defaultNasBackupPlans.Plans[0].CreateTime),
    ///             TargetPath = "/",
    ///             Options = @"    {""includes"":[], ""excludes"":[]}
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// &gt; **NOTE:** This resource can only be created, cannot be modified or deleted. Therefore, any modification of the resource attribute will not affect exist resource.
    /// 
    /// ## Import
    /// 
    /// Hybrid Backup Recovery (HBR) Restore Job can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/restoreJob:RestoreJob example &lt;restore_job_id&gt;:&lt;restore_type&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/restoreJob:RestoreJob")]
    public partial class RestoreJob : Pulumi.CustomResource
    {
        /// <summary>
        /// The exclude path. It's a json string with format:`["/home", "/exclude"]`.
        /// </summary>
        [Output("exclude")]
        public Output<string?> Exclude { get; private set; } = null!;

        /// <summary>
        /// The include path. It's a json string with format:`["/home", "/include"]`.
        /// </summary>
        [Output("include")]
        public Output<string?> Include { get; private set; } = null!;

        /// <summary>
        /// Recovery Options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
        /// </summary>
        [Output("options")]
        public Output<string?> Options { get; private set; } = null!;

        /// <summary>
        /// Restore Job ID. It's the unique key of this resource, you must specify a unique keyword.
        /// </summary>
        [Output("restoreJobId")]
        public Output<string> RestoreJobId { get; private set; } = null!;

        /// <summary>
        /// The Recovery Destination Types. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
        /// </summary>
        [Output("restoreType")]
        public Output<string> RestoreType { get; private set; } = null!;

        /// <summary>
        /// Restore Snapshot of HashCode.
        /// </summary>
        [Output("snapshotHash")]
        public Output<string> SnapshotHash { get; private set; } = null!;

        /// <summary>
        /// The ID of Snapshot.
        /// </summary>
        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// The Type of Data Source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
        /// </summary>
        [Output("sourceType")]
        public Output<string> SourceType { get; private set; } = null!;

        /// <summary>
        /// The Restore Job Status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The Target ofo OSS Bucket Name.
        /// </summary>
        [Output("targetBucket")]
        public Output<string?> TargetBucket { get; private set; } = null!;

        [Output("targetClientId")]
        public Output<string?> TargetClientId { get; private set; } = null!;

        [Output("targetContainer")]
        public Output<string?> TargetContainer { get; private set; } = null!;

        [Output("targetContainerClusterId")]
        public Output<string?> TargetContainerClusterId { get; private set; } = null!;

        /// <summary>
        /// The Destination File System Creation Time.
        /// </summary>
        [Output("targetCreateTime")]
        public Output<string?> TargetCreateTime { get; private set; } = null!;

        [Output("targetDataSourceId")]
        public Output<string?> TargetDataSourceId { get; private set; } = null!;

        /// <summary>
        /// The Destination File System ID.
        /// </summary>
        [Output("targetFileSystemId")]
        public Output<string?> TargetFileSystemId { get; private set; } = null!;

        /// <summary>
        /// Objective to ECS Instance Id.
        /// </summary>
        [Output("targetInstanceId")]
        public Output<string?> TargetInstanceId { get; private set; } = null!;

        /// <summary>
        /// The Target of (ECS) Instance Changes the ECS File Path.
        /// </summary>
        [Output("targetPath")]
        public Output<string?> TargetPath { get; private set; } = null!;

        /// <summary>
        /// The Target of the OSS Object Prefix.
        /// </summary>
        [Output("targetPrefix")]
        public Output<string?> TargetPrefix { get; private set; } = null!;

        /// <summary>
        /// The ID of Vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a RestoreJob resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RestoreJob(string name, RestoreJobArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/restoreJob:RestoreJob", name, args ?? new RestoreJobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RestoreJob(string name, Input<string> id, RestoreJobState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/restoreJob:RestoreJob", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RestoreJob resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RestoreJob Get(string name, Input<string> id, RestoreJobState? state = null, CustomResourceOptions? options = null)
        {
            return new RestoreJob(name, id, state, options);
        }
    }

    public sealed class RestoreJobArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exclude path. It's a json string with format:`["/home", "/exclude"]`.
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The include path. It's a json string with format:`["/home", "/include"]`.
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// Recovery Options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        /// <summary>
        /// Restore Job ID. It's the unique key of this resource, you must specify a unique keyword.
        /// </summary>
        [Input("restoreJobId", required: true)]
        public Input<string> RestoreJobId { get; set; } = null!;

        /// <summary>
        /// The Recovery Destination Types. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
        /// </summary>
        [Input("restoreType", required: true)]
        public Input<string> RestoreType { get; set; } = null!;

        /// <summary>
        /// Restore Snapshot of HashCode.
        /// </summary>
        [Input("snapshotHash", required: true)]
        public Input<string> SnapshotHash { get; set; } = null!;

        /// <summary>
        /// The ID of Snapshot.
        /// </summary>
        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        /// <summary>
        /// The Type of Data Source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
        /// </summary>
        [Input("sourceType", required: true)]
        public Input<string> SourceType { get; set; } = null!;

        /// <summary>
        /// The Target ofo OSS Bucket Name.
        /// </summary>
        [Input("targetBucket")]
        public Input<string>? TargetBucket { get; set; }

        [Input("targetClientId")]
        public Input<string>? TargetClientId { get; set; }

        [Input("targetContainer")]
        public Input<string>? TargetContainer { get; set; }

        [Input("targetContainerClusterId")]
        public Input<string>? TargetContainerClusterId { get; set; }

        /// <summary>
        /// The Destination File System Creation Time.
        /// </summary>
        [Input("targetCreateTime")]
        public Input<string>? TargetCreateTime { get; set; }

        [Input("targetDataSourceId")]
        public Input<string>? TargetDataSourceId { get; set; }

        /// <summary>
        /// The Destination File System ID.
        /// </summary>
        [Input("targetFileSystemId")]
        public Input<string>? TargetFileSystemId { get; set; }

        /// <summary>
        /// Objective to ECS Instance Id.
        /// </summary>
        [Input("targetInstanceId")]
        public Input<string>? TargetInstanceId { get; set; }

        /// <summary>
        /// The Target of (ECS) Instance Changes the ECS File Path.
        /// </summary>
        [Input("targetPath")]
        public Input<string>? TargetPath { get; set; }

        /// <summary>
        /// The Target of the OSS Object Prefix.
        /// </summary>
        [Input("targetPrefix")]
        public Input<string>? TargetPrefix { get; set; }

        /// <summary>
        /// The ID of Vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public RestoreJobArgs()
        {
        }
    }

    public sealed class RestoreJobState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The exclude path. It's a json string with format:`["/home", "/exclude"]`.
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The include path. It's a json string with format:`["/home", "/include"]`.
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// Recovery Options. It's a json string with format:`"{"includes":[],"excludes":[]}",`.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        /// <summary>
        /// Restore Job ID. It's the unique key of this resource, you must specify a unique keyword.
        /// </summary>
        [Input("restoreJobId")]
        public Input<string>? RestoreJobId { get; set; }

        /// <summary>
        /// The Recovery Destination Types. Valid values: `ECS_FILE`, `NAS`, `OSS`. **Note**: Currently, there is a one-to-one correspondence between the data source type with the recovery destination type.
        /// </summary>
        [Input("restoreType")]
        public Input<string>? RestoreType { get; set; }

        /// <summary>
        /// Restore Snapshot of HashCode.
        /// </summary>
        [Input("snapshotHash")]
        public Input<string>? SnapshotHash { get; set; }

        /// <summary>
        /// The ID of Snapshot.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// The Type of Data Source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// The Restore Job Status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The Target ofo OSS Bucket Name.
        /// </summary>
        [Input("targetBucket")]
        public Input<string>? TargetBucket { get; set; }

        [Input("targetClientId")]
        public Input<string>? TargetClientId { get; set; }

        [Input("targetContainer")]
        public Input<string>? TargetContainer { get; set; }

        [Input("targetContainerClusterId")]
        public Input<string>? TargetContainerClusterId { get; set; }

        /// <summary>
        /// The Destination File System Creation Time.
        /// </summary>
        [Input("targetCreateTime")]
        public Input<string>? TargetCreateTime { get; set; }

        [Input("targetDataSourceId")]
        public Input<string>? TargetDataSourceId { get; set; }

        /// <summary>
        /// The Destination File System ID.
        /// </summary>
        [Input("targetFileSystemId")]
        public Input<string>? TargetFileSystemId { get; set; }

        /// <summary>
        /// Objective to ECS Instance Id.
        /// </summary>
        [Input("targetInstanceId")]
        public Input<string>? TargetInstanceId { get; set; }

        /// <summary>
        /// The Target of (ECS) Instance Changes the ECS File Path.
        /// </summary>
        [Input("targetPath")]
        public Input<string>? TargetPath { get; set; }

        /// <summary>
        /// The Target of the OSS Object Prefix.
        /// </summary>
        [Input("targetPrefix")]
        public Input<string>? TargetPrefix { get; set; }

        /// <summary>
        /// The ID of Vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public RestoreJobState()
        {
        }
    }
}
