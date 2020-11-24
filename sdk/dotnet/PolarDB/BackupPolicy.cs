// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    /// <summary>
    /// ## Import
    /// 
    /// PolarDB backup policy can be imported using the id or cluster id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:polardb/backupPolicy:BackupPolicy example "rm-12345678"
    /// ```
    /// </summary>
    public partial class BackupPolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// Cluster backup retention days, Fixed for 7 days, not modified.
        /// </summary>
        [Output("backupRetentionPeriod")]
        public Output<string> BackupRetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// PolarDB Cluster backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]. Default to ["Tuesday", "Thursday", "Saturday"].
        /// </summary>
        [Output("preferredBackupPeriods")]
        public Output<ImmutableArray<string>> PreferredBackupPeriods { get; private set; } = null!;

        /// <summary>
        /// PolarDB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
        /// </summary>
        [Output("preferredBackupTime")]
        public Output<string?> PreferredBackupTime { get; private set; } = null!;


        /// <summary>
        /// Create a BackupPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BackupPolicy(string name, BackupPolicyArgs args, CustomResourceOptions? options = null)
            : base("alicloud:polardb/backupPolicy:BackupPolicy", name, args ?? new BackupPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BackupPolicy(string name, Input<string> id, BackupPolicyState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:polardb/backupPolicy:BackupPolicy", name, state, MakeResourceOptions(options, id))
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

    public sealed class BackupPolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        [Input("preferredBackupPeriods")]
        private InputList<string>? _preferredBackupPeriods;

        /// <summary>
        /// PolarDB Cluster backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]. Default to ["Tuesday", "Thursday", "Saturday"].
        /// </summary>
        public InputList<string> PreferredBackupPeriods
        {
            get => _preferredBackupPeriods ?? (_preferredBackupPeriods = new InputList<string>());
            set => _preferredBackupPeriods = value;
        }

        /// <summary>
        /// PolarDB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
        /// </summary>
        [Input("preferredBackupTime")]
        public Input<string>? PreferredBackupTime { get; set; }

        public BackupPolicyArgs()
        {
        }
    }

    public sealed class BackupPolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cluster backup retention days, Fixed for 7 days, not modified.
        /// </summary>
        [Input("backupRetentionPeriod")]
        public Input<string>? BackupRetentionPeriod { get; set; }

        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        [Input("preferredBackupPeriods")]
        private InputList<string>? _preferredBackupPeriods;

        /// <summary>
        /// PolarDB Cluster backup period. Valid values: ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]. Default to ["Tuesday", "Thursday", "Saturday"].
        /// </summary>
        public InputList<string> PreferredBackupPeriods
        {
            get => _preferredBackupPeriods ?? (_preferredBackupPeriods = new InputList<string>());
            set => _preferredBackupPeriods = value;
        }

        /// <summary>
        /// PolarDB Cluster backup time, in the format of HH:mmZ- HH:mmZ. Time setting interval is one hour. Default to "02:00Z-03:00Z". China time is 8 hours behind it.
        /// </summary>
        [Input("preferredBackupTime")]
        public Input<string>? PreferredBackupTime { get; set; }

        public BackupPolicyState()
        {
        }
    }
}
