// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a VPC Flow Log resource.
    /// 
    /// For information about VPC Flow log and how to use it, see [Flow log overview](https://www.alibabacloud.com/help/doc-detail/127150.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.117.0+
    /// 
    /// &gt; **NOTE:** While it uses `alicloud.vpc.FlowLog` to build a vpc flow log resource, it will be active by default.
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
    ///         var name = config.Get("name") ?? "terratest_vpc_flow_log";
    ///         var logStoreName = config.Get("logStoreName") ?? "vpc-flow-log-for-vpc";
    ///         var projectName = config.Get("projectName") ?? "vpc-flow-log-for-vpc";
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "192.168.0.0/24",
    ///         });
    ///         var defaultFlowLog = new AliCloud.Vpc.FlowLog("defaultFlowLog", new AliCloud.Vpc.FlowLogArgs
    ///         {
    ///             ResourceId = defaultNetwork.Id,
    ///             ResourceType = "VPC",
    ///             TrafficType = "All",
    ///             LogStoreName = logStoreName,
    ///             ProjectName = projectName,
    ///             FlowLogName = name,
    ///             Status = "Active",
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn = 
    ///             {
    ///                 "alicloud_vpc.default",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// VPC Flow Log can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpc/flowLog:FlowLog example fl-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/flowLog:FlowLog")]
    public partial class FlowLog : Pulumi.CustomResource
    {
        /// <summary>
        /// The Description of the VPC Flow Log.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The Name of the VPC Flow Log.
        /// </summary>
        [Output("flowLogName")]
        public Output<string?> FlowLogName { get; private set; } = null!;

        /// <summary>
        /// The name of the logstore.
        /// </summary>
        [Output("logStoreName")]
        public Output<string> LogStoreName { get; private set; } = null!;

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Output("projectName")]
        public Output<string> ProjectName { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;

        /// <summary>
        /// The type of the resource to capture traffic. Valid values `NetworkInterface`, `VPC`, and `VSwitch`.
        /// </summary>
        [Output("resourceType")]
        public Output<string> ResourceType { get; private set; } = null!;

        /// <summary>
        /// The status of the VPC Flow Log. Valid values `Active` and `Inactive`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The type of traffic collected. Valid values `All`, `Drop` and `Allow`.
        /// </summary>
        [Output("trafficType")]
        public Output<string> TrafficType { get; private set; } = null!;


        /// <summary>
        /// Create a FlowLog resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FlowLog(string name, FlowLogArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/flowLog:FlowLog", name, args ?? new FlowLogArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FlowLog(string name, Input<string> id, FlowLogState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/flowLog:FlowLog", name, state, MakeResourceOptions(options, id))
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
        /// The Description of the VPC Flow Log.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Name of the VPC Flow Log.
        /// </summary>
        [Input("flowLogName")]
        public Input<string>? FlowLogName { get; set; }

        /// <summary>
        /// The name of the logstore.
        /// </summary>
        [Input("logStoreName", required: true)]
        public Input<string> LogStoreName { get; set; } = null!;

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("projectName", required: true)]
        public Input<string> ProjectName { get; set; } = null!;

        /// <summary>
        /// The ID of the resource.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        /// <summary>
        /// The type of the resource to capture traffic. Valid values `NetworkInterface`, `VPC`, and `VSwitch`.
        /// </summary>
        [Input("resourceType", required: true)]
        public Input<string> ResourceType { get; set; } = null!;

        /// <summary>
        /// The status of the VPC Flow Log. Valid values `Active` and `Inactive`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The type of traffic collected. Valid values `All`, `Drop` and `Allow`.
        /// </summary>
        [Input("trafficType", required: true)]
        public Input<string> TrafficType { get; set; } = null!;

        public FlowLogArgs()
        {
        }
    }

    public sealed class FlowLogState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Description of the VPC Flow Log.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Name of the VPC Flow Log.
        /// </summary>
        [Input("flowLogName")]
        public Input<string>? FlowLogName { get; set; }

        /// <summary>
        /// The name of the logstore.
        /// </summary>
        [Input("logStoreName")]
        public Input<string>? LogStoreName { get; set; }

        /// <summary>
        /// The name of the project.
        /// </summary>
        [Input("projectName")]
        public Input<string>? ProjectName { get; set; }

        /// <summary>
        /// The ID of the resource.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The type of the resource to capture traffic. Valid values `NetworkInterface`, `VPC`, and `VSwitch`.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        /// <summary>
        /// The status of the VPC Flow Log. Valid values `Active` and `Inactive`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The type of traffic collected. Valid values `All`, `Drop` and `Allow`.
        /// </summary>
        [Input("trafficType")]
        public Input<string>? TrafficType { get; set; }

        public FlowLogState()
        {
        }
    }
}
