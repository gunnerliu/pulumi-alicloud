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
    ///         var example = new AliCloud.Hbr.NasBackupPlan("example", new AliCloud.Hbr.NasBackupPlanArgs
    ///         {
    ///             BackupType = "COMPLETE",
    ///             CreateTime = "1603163444",
    ///             Exclude = @"  [""/home/exclude""]
    ///   
    /// ",
    ///             FileSystemId = "031cf4964f",
    ///             Include = @"  [""/home/include""]
    ///   
    /// ",
    ///             NasBackupPlanName = "example_value",
    ///             Paths = 
    ///             {
    ///                 "/home",
    ///                 "/var",
    ///             },
    ///             Retention = "1",
    ///             Schedule = "I|1602673264|PT2H",
    ///             SpeedLimit = "I|1602673264|PT2H",
    ///             VaultId = "v-0003gxoksflhu46w185s",
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
        /// Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
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
        /// Whether to Disable the Backup Task. Valid Values: true, false.
        /// </summary>
        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// The exclude path. String of Json List, most 255 Characters. e.g. `"[\"/var\"]"`
        /// </summary>
        [Output("exclude")]
        public Output<string?> Exclude { get; private set; } = null!;

        /// <summary>
        /// The File System ID.
        /// </summary>
        [Output("fileSystemId")]
        public Output<string?> FileSystemId { get; private set; } = null!;

        /// <summary>
        /// The include path. String of Json List, most 255 Characters. e.g. `"[\"/home/work\"]"`
        /// </summary>
        [Output("include")]
        public Output<string?> Include { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("nasBackupPlanName")]
        public Output<string> NasBackupPlanName { get; private set; } = null!;

        /// <summary>
        /// Options. NAS Backup Plan Does Not Support Yet.
        /// </summary>
        [Output("options")]
        public Output<string?> Options { get; private set; } = null!;

        /// <summary>
        /// Backup Path. Up to 65536 Characters. e.g.`["/home", "/var"]`
        /// </summary>
        [Output("paths")]
        public Output<ImmutableArray<string>> Paths { get; private set; } = null!;

        /// <summary>
        /// Backup Retention Period, the Minimum Value of 1.
        /// </summary>
        [Output("retention")]
        public Output<string> Retention { get; private set; } = null!;

        /// <summary>
        /// The Backup Policy. Formats: I | {Range Specified by the StartTime }|{ Interval}\n* The Time Range Specified by the StartTime Backup Start Time in Unix Time Seconds.\n* Interval ISO8601 Time Intervals. For Example:\n**PT1H Interval for an Hour.\n**P1D Interval Day.\nMeaning from {Range Specified by the Starttime} Every {Interval} of the Time Where We Took Backups Once a Task. Does Not Compensate the Has Elapsed Time the Backup Task. If the Last Backup Has Not Been Completed without Triggering the next Backup.
        /// </summary>
        [Output("schedule")]
        public Output<string> Schedule { get; private set; } = null!;

        /// <summary>
        /// flow control. The format is: {start}|{end}|{bandwidth} * start starting hour * end end hour * bandwidth limit rate, in KiB ** Use | to separate multiple flow control configurations; ** Multiple flow control configurations are not allowed to have overlapping times.
        /// </summary>
        [Output("speedLimit")]
        public Output<string?> SpeedLimit { get; private set; } = null!;

        [Output("updatePaths")]
        public Output<bool?> UpdatePaths { get; private set; } = null!;

        [Output("vaultId")]
        public Output<string?> VaultId { get; private set; } = null!;


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
        /// Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
        /// </summary>
        [Input("backupType")]
        public Input<string>? BackupType { get; set; }

        /// <summary>
        /// File System Creation Time. **Note** The time format of the API adopts the ISO 8601 format, such as `2021-07-09T15:45:30CST` or `2021-07-09T07:45:30Z`.
        /// </summary>
        [Input("createTime", required: true)]
        public Input<string> CreateTime { get; set; } = null!;

        [Input("detail")]
        public Input<string>? Detail { get; set; }

        /// <summary>
        /// Whether to Disable the Backup Task. Valid Values: true, false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The exclude path. String of Json List, most 255 Characters. e.g. `"[\"/var\"]"`
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The File System ID.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// The include path. String of Json List, most 255 Characters. e.g. `"[\"/home/work\"]"`
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("nasBackupPlanName", required: true)]
        public Input<string> NasBackupPlanName { get; set; } = null!;

        /// <summary>
        /// Options. NAS Backup Plan Does Not Support Yet.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// Backup Path. Up to 65536 Characters. e.g.`["/home", "/var"]`
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// Backup Retention Period, the Minimum Value of 1.
        /// </summary>
        [Input("retention", required: true)]
        public Input<string> Retention { get; set; } = null!;

        /// <summary>
        /// The Backup Policy. Formats: I | {Range Specified by the StartTime }|{ Interval}\n* The Time Range Specified by the StartTime Backup Start Time in Unix Time Seconds.\n* Interval ISO8601 Time Intervals. For Example:\n**PT1H Interval for an Hour.\n**P1D Interval Day.\nMeaning from {Range Specified by the Starttime} Every {Interval} of the Time Where We Took Backups Once a Task. Does Not Compensate the Has Elapsed Time the Backup Task. If the Last Backup Has Not Been Completed without Triggering the next Backup.
        /// </summary>
        [Input("schedule", required: true)]
        public Input<string> Schedule { get; set; } = null!;

        /// <summary>
        /// flow control. The format is: {start}|{end}|{bandwidth} * start starting hour * end end hour * bandwidth limit rate, in KiB ** Use | to separate multiple flow control configurations; ** Multiple flow control configurations are not allowed to have overlapping times.
        /// </summary>
        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        [Input("updatePaths")]
        public Input<bool>? UpdatePaths { get; set; }

        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public NasBackupPlanArgs()
        {
        }
    }

    public sealed class NasBackupPlanState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Backup Type. Valid Values: * Complete. Valid values: `COMPLETE`.
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
        /// Whether to Disable the Backup Task. Valid Values: true, false.
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The exclude path. String of Json List, most 255 Characters. e.g. `"[\"/var\"]"`
        /// </summary>
        [Input("exclude")]
        public Input<string>? Exclude { get; set; }

        /// <summary>
        /// The File System ID.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// The include path. String of Json List, most 255 Characters. e.g. `"[\"/home/work\"]"`
        /// </summary>
        [Input("include")]
        public Input<string>? Include { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("nasBackupPlanName")]
        public Input<string>? NasBackupPlanName { get; set; }

        /// <summary>
        /// Options. NAS Backup Plan Does Not Support Yet.
        /// </summary>
        [Input("options")]
        public Input<string>? Options { get; set; }

        [Input("paths")]
        private InputList<string>? _paths;

        /// <summary>
        /// Backup Path. Up to 65536 Characters. e.g.`["/home", "/var"]`
        /// </summary>
        public InputList<string> Paths
        {
            get => _paths ?? (_paths = new InputList<string>());
            set => _paths = value;
        }

        /// <summary>
        /// Backup Retention Period, the Minimum Value of 1.
        /// </summary>
        [Input("retention")]
        public Input<string>? Retention { get; set; }

        /// <summary>
        /// The Backup Policy. Formats: I | {Range Specified by the StartTime }|{ Interval}\n* The Time Range Specified by the StartTime Backup Start Time in Unix Time Seconds.\n* Interval ISO8601 Time Intervals. For Example:\n**PT1H Interval for an Hour.\n**P1D Interval Day.\nMeaning from {Range Specified by the Starttime} Every {Interval} of the Time Where We Took Backups Once a Task. Does Not Compensate the Has Elapsed Time the Backup Task. If the Last Backup Has Not Been Completed without Triggering the next Backup.
        /// </summary>
        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        /// <summary>
        /// flow control. The format is: {start}|{end}|{bandwidth} * start starting hour * end end hour * bandwidth limit rate, in KiB ** Use | to separate multiple flow control configurations; ** Multiple flow control configurations are not allowed to have overlapping times.
        /// </summary>
        [Input("speedLimit")]
        public Input<string>? SpeedLimit { get; set; }

        [Input("updatePaths")]
        public Input<bool>? UpdatePaths { get; set; }

        [Input("vaultId")]
        public Input<string>? VaultId { get; set; }

        public NasBackupPlanState()
        {
        }
    }
}
