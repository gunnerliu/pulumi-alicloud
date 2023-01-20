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
    /// Provides a Hybrid Backup Recovery (HBR) Hana Backup Plan resource.
    /// 
    /// For information about Hybrid Backup Recovery (HBR) Hana Backup Plan and how to use it, see [What is Hana Backup Plan](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/api-doc-hbr-2017-09-08-api-doc-createhanabackupplan).
    /// 
    /// &gt; **NOTE:** Available in v1.179.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultVault = new AliCloud.Hbr.Vault("defaultVault", new()
    ///     {
    ///         VaultName = @var.Name,
    ///     });
    /// 
    ///     var defaultResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke(new()
    ///     {
    ///         Status = "OK",
    ///     });
    /// 
    ///     var defaultHanaInstance = new AliCloud.Hbr.HanaInstance("defaultHanaInstance", new()
    ///     {
    ///         AlertSetting = "INHERITED",
    ///         HanaName = @var.Name,
    ///         Host = "1.1.1.1",
    ///         InstanceNumber = 1,
    ///         Password = "YouPassword123",
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         Sid = "HXE",
    ///         UseSsl = false,
    ///         UserName = "admin",
    ///         ValidateCertificate = false,
    ///         VaultId = defaultVault.Id,
    ///     });
    /// 
    ///     var defaultHanaBackupPlan = new AliCloud.Hbr.HanaBackupPlan("defaultHanaBackupPlan", new()
    ///     {
    ///         BackupPrefix = "DIFF_DATA_BACKUP",
    ///         BackupType = "COMPLETE",
    ///         ClusterId = defaultHanaInstance.HanaInstanceId,
    ///         DatabaseName = "SYSTEMDB",
    ///         PlanName = @var.Name,
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         Schedule = "I|1602673264|P1D",
    ///         VaultId = defaultHanaInstance.VaultId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Hybrid Backup Recovery (HBR) Hana Backup Plan can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:hbr/hanaBackupPlan:HanaBackupPlan example &lt;plan_id&gt;:&lt;vault_id&gt;:&lt;cluster_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:hbr/hanaBackupPlan:HanaBackupPlan")]
    public partial class HanaBackupPlan : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The backup prefix.
        /// </summary>
        [Output("backupPrefix")]
        public Output<string?> BackupPrefix { get; private set; } = null!;

        /// <summary>
        /// The backup type. Valid values:
        /// </summary>
        [Output("backupType")]
        public Output<string> BackupType { get; private set; } = null!;

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The name of the database.
        /// </summary>
        [Output("databaseName")]
        public Output<string> DatabaseName { get; private set; } = null!;

        /// <summary>
        /// The id of the plan.
        /// </summary>
        [Output("planId")]
        public Output<string> PlanId { get; private set; } = null!;

        /// <summary>
        /// The name of the backup plan.
        /// </summary>
        [Output("planName")]
        public Output<string> PlanName { get; private set; } = null!;

        /// <summary>
        /// The resource attribute field that represents the resource group ID.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
        /// </summary>
        [Output("schedule")]
        public Output<string> Schedule { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Output("vaultId")]
        public Output<string> VaultId { get; private set; } = null!;


        /// <summary>
        /// Create a HanaBackupPlan resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HanaBackupPlan(string name, HanaBackupPlanArgs args, CustomResourceOptions? options = null)
            : base("alicloud:hbr/hanaBackupPlan:HanaBackupPlan", name, args ?? new HanaBackupPlanArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HanaBackupPlan(string name, Input<string> id, HanaBackupPlanState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:hbr/hanaBackupPlan:HanaBackupPlan", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HanaBackupPlan resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HanaBackupPlan Get(string name, Input<string> id, HanaBackupPlanState? state = null, CustomResourceOptions? options = null)
        {
            return new HanaBackupPlan(name, id, state, options);
        }
    }

    public sealed class HanaBackupPlanArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The backup prefix.
        /// </summary>
        [Input("backupPrefix")]
        public Input<string>? BackupPrefix { get; set; }

        /// <summary>
        /// The backup type. Valid values:
        /// </summary>
        [Input("backupType", required: true)]
        public Input<string> BackupType { get; set; } = null!;

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The name of the database.
        /// </summary>
        [Input("databaseName", required: true)]
        public Input<string> DatabaseName { get; set; } = null!;

        /// <summary>
        /// The name of the backup plan.
        /// </summary>
        [Input("planName", required: true)]
        public Input<string> PlanName { get; set; } = null!;

        /// <summary>
        /// The resource attribute field that represents the resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId", required: true)]
        public Input<string> VaultId { get; set; } = null!;

        public HanaBackupPlanArgs()
        {
        }
        public static new HanaBackupPlanArgs Empty => new HanaBackupPlanArgs();
    }

    public sealed class HanaBackupPlanState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The backup prefix.
        /// </summary>
        [Input("backupPrefix")]
        public Input<string>? BackupPrefix { get; set; }

        /// <summary>
        /// The backup type. Valid values:
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// The ID of the SAP HANA instance.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The name of the database.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        /// <summary>
        /// The id of the plan.
        /// </summary>
        [Input("planId")]
        public Input<string>? PlanId { get; set; }

        /// <summary>
        /// The name of the backup plan.
        /// </summary>
        [Input("planName")]
        public Input<string>? PlanName { get; set; }

        /// <summary>
        /// The resource attribute field that represents the resource group ID.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, I|1631685600|P1D specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disabled`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the backup vault.
        /// </summary>
        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public HanaBackupPlanState()
        {
        }
        public static new HanaBackupPlanState Empty => new HanaBackupPlanState();
    }
}
