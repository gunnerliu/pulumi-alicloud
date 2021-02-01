// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    /// <summary>
    /// This resource used to create a flow log function in Cloud Enterprise Network (CEN).
    /// By using the flow log function, you can capture the traffic data of the network instances in different regions of a CEN.
    /// You can also use the data aggregated in flow logs to analyze cross-region traffic flows, minimize traffic costs, and troubleshoot network faults.
    /// 
    /// For information about CEN flow log and how to use it, see [Manage CEN flowlog](https://www.alibabacloud.com/help/doc-detail/123006.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.73.0+
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
    ///         // Create a cen flowlog resource and use it to publish a route entry pointing to an ECS.
    ///         var defaultInstance = new AliCloud.Cen.Instance("defaultInstance", new AliCloud.Cen.InstanceArgs
    ///         {
    ///         });
    ///         var defaultProject = new AliCloud.Log.Project("defaultProject", new AliCloud.Log.ProjectArgs
    ///         {
    ///             Description = "create by terraform",
    ///         });
    ///         var defaultStore = new AliCloud.Log.Store("defaultStore", new AliCloud.Log.StoreArgs
    ///         {
    ///             Project = defaultProject.Name,
    ///             RetentionPeriod = 3650,
    ///             ShardCount = 3,
    ///             AutoSplit = true,
    ///             MaxSplitShardCount = 60,
    ///             AppendMeta = true,
    ///         });
    ///         var defaultFlowLog = new AliCloud.Cen.FlowLog("defaultFlowLog", new AliCloud.Cen.FlowLogArgs
    ///         {
    ///             FlowLogName = "my-flowlog",
    ///             CenId = defaultInstance.Id,
    ///             ProjectName = defaultProject.Name,
    ///             LogStoreName = defaultStore.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// CEN flowlog can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/flowLog:FlowLog default flowlog-tig1xxxxxx
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/flowLog:FlowLog")]
    public partial class FlowLog : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CEN Instance.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The description of flowlog.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of flowlog.
        /// </summary>
        [Output("flowLogName")]
        public Output<string?> FlowLogName { get; private set; } = null!;

        /// <summary>
        /// The name of the log store which is in the  `project_name` SLS project.
        /// </summary>
        [Output("logStoreName")]
        public Output<string> LogStoreName { get; private set; } = null!;

        /// <summary>
        /// The name of the SLS project.
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        /// </summary>
        [Output("status")]
        public Output<string?> Status { get; private set; } = null!;


        /// <summary>
        /// Create a FlowLog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlowLog(string name, FlowLogArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/flowLog:FlowLog", name, args ?? new FlowLogArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlowLog(string name, Input<string> id, FlowLogState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/flowLog:FlowLog", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FlowLog resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FlowLog Get(string name, Input<string> id, FlowLogState? state = null, CustomResourceOptions? options = null)
        {
            return new FlowLog(name, id, state, options);
        }
    }

    public sealed class FlowLogArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN Instance.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The description of flowlog.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of flowlog.
        /// </summary>
        [Input("flowLogName")]
        public Input<string>? FlowLogName { get; set; }

        /// <summary>
        /// The name of the log store which is in the  `project_name` SLS project.
        /// </summary>
        [Input("logStoreName", required: true)]
        public Input<string> LogStoreName { get; set; } = null!;

        /// <summary>
        /// The name of the SLS project.
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        /// <summary>
        /// The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public FlowLogArgs()
        {
        }
    }

    public sealed class FlowLogState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN Instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The description of flowlog.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of flowlog.
        /// </summary>
        [Input("flowLogName")]
        public Input<string>? FlowLogName { get; set; }

        /// <summary>
        /// The name of the log store which is in the  `project_name` SLS project.
        /// </summary>
        [Input("logStoreName")]
        public Input<string>? LogStoreName { get; set; }

        /// <summary>
        /// The name of the SLS project.
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// The status of flowlog. Valid values: ["Active", "Inactive"]. Default to "Active".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public FlowLogState()
        {
        }
    }
}
