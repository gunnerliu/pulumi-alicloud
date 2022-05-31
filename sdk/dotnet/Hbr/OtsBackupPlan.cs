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
    /// Provides a HBR Ots Backup Plan resource.
    /// 
    /// For information about HBR Ots Backup Plan and how to use it, see [What is Ots Backup Plan](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/overview).
    /// 
    /// &gt; **NOTE:** Available in v1.163.0+.
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
    ///         var name = config.Get("name") ?? "testAcc";
    ///         var @default = new AliCloud.Hbr.Vault("default", new AliCloud.Hbr.VaultArgs
    ///         {
    ///             VaultName = name,
    ///             VaultType = "OTS_BACKUP",
    ///         });
    ///         var foo = new AliCloud.Ots.Instance("foo", new AliCloud.Ots.InstanceArgs
    ///         {
    ///             Description = name,
    ///             AccessedBy = "Any",
    ///             Tags = 
    ///             {
    ///                 { "Created", "TF" },
    ///                 { "For", "acceptance test" },
    ///             },
    ///         });
    ///         var basic = new AliCloud.Ots.Table("basic", new AliCloud.Ots.TableArgs
    ///         {
    ///             InstanceName = foo.Name,
    ///             TableName = name,
    ///             PrimaryKeys = 
    ///             {
    ///                 new AliCloud.Ots.Inputs.TablePrimaryKeyArgs
    ///                 {
    ///                     Name = "pk1",
    ///                     Type = "Integer",
    ///                 },
    ///             },
    ///             TimeToLive = -1,
    ///             MaxVersion = 1,
    ///             DeviationCellVersionInSec = "1",
    ///         });
    ///         var example = new AliCloud.Hbr.OtsBackupPlan("example", new AliCloud.Hbr.OtsBackupPlanArgs
    ///         {
    ///             OtsBackupPlanName = name,
    ///             VaultId = @default.Id,
    ///             BackupType = "COMPLETE",
    ///             Schedule = "I|1602673264|PT2H",
    ///             Retention = "2",
    ///             InstanceName = foo.Name,
    ///             OtsDetails = 
    ///             {
    ///                 new AliCloud.Hbr.Inputs.OtsBackupPlanOtsDetailArgs
    ///                 {
    ///                     TableNames = 
    ///                     {
    ///                         basic.TableName,
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// HBR Ots Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/otsBackupPlan:OtsBackupPlan example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/otsBackupPlan:OtsBackupPlan")]
    public partial class OtsBackupPlan : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

        /// <summary>
        /// Whether to disable the backup task. Valid values: true, false.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("instanceName")]
        public Output<string?> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Output("otsBackupPlanName")]
        public Output<string> OtsBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("otsDetails")]
        public Output<ImmutableArray<Outputs.OtsBackupPlanOtsDetail>> OtsDetails { get; private set; } = null!;

        /// <summary>
        /// Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("retention")]
        public Output<string> Retention { get; private set; } = null!;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.OtsBackupPlanRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Output("schedule")]
        public Output<string?> Schedule { get; private set; } = null!;

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string?> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a OtsBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OtsBackupPlan(string name, OtsBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, args ?? new OtsBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OtsBackupPlan(string name, Input<string> id, OtsBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OtsBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OtsBackupPlan Get(string name, Input<string> id, OtsBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new OtsBackupPlan(name, id, state, options);
        }
    }

    public sealed class OtsBackupPlanArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("backupType", required: true)]
        public Input<string> BackupType { get; set; } = null!;

        /// <summary>
        /// Whether to disable the backup task. Valid values: true, false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("otsBackupPlanName", required: true)]
        public Input<string> OtsBackupPlanName { get; set; } = null!;

        [Input("otsDetails")]
        private InputList<Inputs.OtsBackupPlanOtsDetailArgs>? _otsDetails;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanOtsDetailArgs> OtsDetails
        {
            get => _otsDetails ?? (_otsDetails = new InputList<Inputs.OtsBackupPlanOtsDetailArgs>());
            set => _otsDetails = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("retention", required: true)]
        public Input<string> Retention { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.OtsBackupPlanRuleArgs>? _rules;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.OtsBackupPlanRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public OtsBackupPlanArgs()
        {
        }
    }

    public sealed class OtsBackupPlanState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the tableStore instance. Valid values: `COMPLETE`, `INCREMENTAL`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// Whether to disable the backup task. Valid values: true, false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
        /// </summary>
        [Input("otsBackupPlanName")]
        public Input<string>? OtsBackupPlanName { get; set; }

        [Input("otsDetails")]
        private InputList<Inputs.OtsBackupPlanOtsDetailGetArgs>? _otsDetails;

        /// <summary>
        /// The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanOtsDetailGetArgs> OtsDetails
        {
            get => _otsDetails ?? (_otsDetails = new InputList<Inputs.OtsBackupPlanOtsDetailGetArgs>());
            set => _otsDetails = value;
        }

        /// <summary>
        /// Backup retention days, the minimum is 1. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("retention")]
        public Input<string>? Retention { get; set; }

        [Input("rules")]
        private InputList<Inputs.OtsBackupPlanRuleGetArgs>? _rules;

        /// <summary>
        /// The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        public InputList<Inputs.OtsBackupPlanRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.OtsBackupPlanRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered. **Note:** Required while source_type equals `OTS_TABLE`.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The ID of backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public OtsBackupPlanState()
        {
        }
    }
}
