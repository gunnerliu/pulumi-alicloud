// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    /// <summary>
    /// Provides a Click House Backup Policy resource.
    /// 
    /// For information about Click House Backup Policy and how to use it, see [What is Backup Policy](https://www.alibabacloud.com/help/en/clickhouse/latest/api-clickhouse-2019-11-11-createbackuppolicy).
    /// 
    /// &gt; **NOTE:** Available since v1.147.0.
    /// 
    /// &gt; **NOTE:** Only the cloud database ClickHouse cluster version `20.3` supports data backup.
    /// 
    /// ## Import
    /// 
    /// Click House Backup Policy can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:clickhouse/backupPolicy:BackupPolicy example &lt;db_cluster_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:clickhouse/backupPolicy:BackupPolicy")]
    public partial class BackupPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Data backup days. Valid values: `7` to `730`.
        /// </summary>
        [Output("backupRetentionPeriod")]
        public Output<int?> BackupRetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The id of the DBCluster.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        /// </summary>
        [Output("preferredBackupPeriods")]
        public Output<ImmutableArray<string>> PreferredBackupPeriods { get; private set; } = null!;

        /// <summary>
        /// DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        /// </summary>
        [Output("preferredBackupTime")]
        public Output<string> PreferredBackupTime { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a BackupPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupPolicy(string name, BackupPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/backupPolicy:BackupPolicy", name, args ?? new BackupPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupPolicy(string name, Input<string> id, BackupPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:clickhouse/backupPolicy:BackupPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BackupPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BackupPolicy Get(string name, Input<string> id, BackupPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new BackupPolicy(name, id, state, options);
        }
    }

    public sealed class BackupPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data backup days. Valid values: `7` to `730`.
        /// </summary>
        [Input("backupRetentionPeriod")]
        public Input<int>? BackupRetentionPeriod { get; set; }

        /// <summary>
        /// The id of the DBCluster.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        [Input("preferredBackupPeriods", required: true)]
        private InputList<string>? _preferredBackupPeriods;

        /// <summary>
        /// DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        /// </summary>
        public InputList<string> PreferredBackupPeriods
        {
            get => _preferredBackupPeriods ?? (_preferredBackupPeriods = new InputList<string>());
            set => _preferredBackupPeriods = value;
        }

        /// <summary>
        /// DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        /// </summary>
        [Input("preferredBackupTime", required: true)]
        public Input<string> PreferredBackupTime { get; set; } = null!;

        public BackupPolicyArgs()
        {
        }
        public static new BackupPolicyArgs Empty => new BackupPolicyArgs();
    }

    public sealed class BackupPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data backup days. Valid values: `7` to `730`.
        /// </summary>
        [Input("backupRetentionPeriod")]
        public Input<int>? BackupRetentionPeriod { get; set; }

        /// <summary>
        /// The id of the DBCluster.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        [Input("preferredBackupPeriods")]
        private InputList<string>? _preferredBackupPeriods;

        /// <summary>
        /// DBCluster Backup period. A list of DBCluster Backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"].
        /// </summary>
        public InputList<string> PreferredBackupPeriods
        {
            get => _preferredBackupPeriods ?? (_preferredBackupPeriods = new InputList<string>());
            set => _preferredBackupPeriods = value;
        }

        /// <summary>
        /// DBCluster backup time, in the format of `HH:mmZ-HH:mmZ`. Time setting interval is one hour. China time is 8 hours behind it.
        /// </summary>
        [Input("preferredBackupTime")]
        public Input<string>? PreferredBackupTime { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public BackupPolicyState()
        {
        }
        public static new BackupPolicyState Empty => new BackupPolicyState();
    }
}
