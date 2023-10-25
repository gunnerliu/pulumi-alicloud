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
    /// Provides a HBR Oss Backup Plan resource.
    /// 
    /// For information about HBR Oss Backup Plan and how to use it, see [What is Oss Backup Plan](https://www.alibabacloud.com/help/doc-detail/130040.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.131.0+.
    /// 
    /// ## Import
    /// 
    /// HBR Oss Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/ossBackupPlan:OssBackupPlan example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/ossBackupPlan:OssBackupPlan")]
    public partial class OssBackupPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

        /// <summary>
        /// The name of OSS bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Output("crossAccountRoleName")]
        public Output<string?> CrossAccountRoleName { get; private set; } = null!;

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Output("crossAccountType")]
        public Output<string> CrossAccountType { get; private set; } = null!;

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Output("crossAccountUserId")]
        public Output<int?> CrossAccountUserId { get; private set; } = null!;

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Output("ossBackupPlanName")]
        public Output<string> OssBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
        /// </summary>
        [Output("prefix")]
        public Output<string?> Prefix { get; private set; } = null!;

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

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a OssBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OssBackupPlan(string name, OssBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/ossBackupPlan:OssBackupPlan", name, args ?? new OssBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OssBackupPlan(string name, Input<string> id, OssBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/ossBackupPlan:OssBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OssBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OssBackupPlan Get(string name, Input<string> id, OssBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new OssBackupPlan(name, id, state, options);
        }
    }

    public sealed class OssBackupPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType", required: true)]
        public Input<string> BackupType { get; set; } = null!;

        /// <summary>
        /// The name of OSS bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("ossBackupPlanName", required: true)]
        public Input<string> OssBackupPlanName { get; set; } = null!;

        /// <summary>
        /// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

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

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public OssBackupPlanArgs()
        {
        }
        public static new OssBackupPlanArgs Empty => new OssBackupPlanArgs();
    }

    public sealed class OssBackupPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup type. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// The name of OSS bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The role name created in the original account RAM backup by the cross account managed by the current account.
        /// </summary>
        [Input("crossAccountRoleName")]
        public Input<string>? CrossAccountRoleName { get; set; }

        /// <summary>
        /// The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
        /// </summary>
        [Input("crossAccountType")]
        public Input<string>? CrossAccountType { get; set; }

        /// <summary>
        /// The original account ID of the cross account backup managed by the current account.
        /// </summary>
        [Input("crossAccountUserId")]
        public Input<int>? CrossAccountUserId { get; set; }

        /// <summary>
        /// Whether to disable the backup task. Valid values: `true`, `false`.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("ossBackupPlanName")]
        public Input<string>? OssBackupPlanName { get; set; }

        /// <summary>
        /// Backup prefix. Once specified, only objects with matching prefixes will be backed up.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

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

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public OssBackupPlanState()
        {
        }
        public static new OssBackupPlanState Empty => new OssBackupPlanState();
    }
}
