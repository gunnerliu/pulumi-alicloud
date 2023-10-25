// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Brain
{
    /// <summary>
    /// Provides a Brain Industrial Pid Loop resource.
    /// 
    /// &gt; **NOTE:** Available in v1.117.0+.
    /// 
    /// ## Import
    /// 
    /// Brain Industrial Pid Loop can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:brain/industrialPidLoop:IndustrialPidLoop example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:brain/industrialPidLoop:IndustrialPidLoop")]
    public partial class IndustrialPidLoop : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Pid Loop Configuration.
        /// </summary>
        [Output("pidLoopConfiguration")]
        public Output<string> PidLoopConfiguration { get; private set; } = null!;

        /// <summary>
        /// The dcs type of Pid Loop. Valid values: `standard`.
        /// </summary>
        [Output("pidLoopDcsType")]
        public Output<string> PidLoopDcsType { get; private set; } = null!;

        /// <summary>
        /// The desc of Pid Loop.
        /// </summary>
        [Output("pidLoopDesc")]
        public Output<string?> PidLoopDesc { get; private set; } = null!;

        /// <summary>
        /// Whether is crucial Pid Loop.
        /// </summary>
        [Output("pidLoopIsCrucial")]
        public Output<bool> PidLoopIsCrucial { get; private set; } = null!;

        /// <summary>
        /// The name of Pid Loop.
        /// </summary>
        [Output("pidLoopName")]
        public Output<string> PidLoopName { get; private set; } = null!;

        /// <summary>
        /// The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        /// </summary>
        [Output("pidLoopType")]
        public Output<string> PidLoopType { get; private set; } = null!;

        /// <summary>
        /// The pid project id.
        /// </summary>
        [Output("pidProjectId")]
        public Output<string> PidProjectId { get; private set; } = null!;

        /// <summary>
        /// The status of Pid Loop.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a IndustrialPidLoop resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IndustrialPidLoop(string name, IndustrialPidLoopArgs args, CustomResourceOptions? options = null)
            : base("alicloud:brain/industrialPidLoop:IndustrialPidLoop", name, args ?? new IndustrialPidLoopArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IndustrialPidLoop(string name, Input<string> id, IndustrialPidLoopState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:brain/industrialPidLoop:IndustrialPidLoop", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IndustrialPidLoop resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IndustrialPidLoop Get(string name, Input<string> id, IndustrialPidLoopState? state = null, CustomResourceOptions? options = null)
        {
            return new IndustrialPidLoop(name, id, state, options);
        }
    }

    public sealed class IndustrialPidLoopArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Pid Loop Configuration.
        /// </summary>
        [Input("pidLoopConfiguration", required: true)]
        public Input<string> PidLoopConfiguration { get; set; } = null!;

        /// <summary>
        /// The dcs type of Pid Loop. Valid values: `standard`.
        /// </summary>
        [Input("pidLoopDcsType", required: true)]
        public Input<string> PidLoopDcsType { get; set; } = null!;

        /// <summary>
        /// The desc of Pid Loop.
        /// </summary>
        [Input("pidLoopDesc")]
        public Input<string>? PidLoopDesc { get; set; }

        /// <summary>
        /// Whether is crucial Pid Loop.
        /// </summary>
        [Input("pidLoopIsCrucial", required: true)]
        public Input<bool> PidLoopIsCrucial { get; set; } = null!;

        /// <summary>
        /// The name of Pid Loop.
        /// </summary>
        [Input("pidLoopName", required: true)]
        public Input<string> PidLoopName { get; set; } = null!;

        /// <summary>
        /// The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        /// </summary>
        [Input("pidLoopType", required: true)]
        public Input<string> PidLoopType { get; set; } = null!;

        /// <summary>
        /// The pid project id.
        /// </summary>
        [Input("pidProjectId", required: true)]
        public Input<string> PidProjectId { get; set; } = null!;

        public IndustrialPidLoopArgs()
        {
        }
        public static new IndustrialPidLoopArgs Empty => new IndustrialPidLoopArgs();
    }

    public sealed class IndustrialPidLoopState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Pid Loop Configuration.
        /// </summary>
        [Input("pidLoopConfiguration")]
        public Input<string>? PidLoopConfiguration { get; set; }

        /// <summary>
        /// The dcs type of Pid Loop. Valid values: `standard`.
        /// </summary>
        [Input("pidLoopDcsType")]
        public Input<string>? PidLoopDcsType { get; set; }

        /// <summary>
        /// The desc of Pid Loop.
        /// </summary>
        [Input("pidLoopDesc")]
        public Input<string>? PidLoopDesc { get; set; }

        /// <summary>
        /// Whether is crucial Pid Loop.
        /// </summary>
        [Input("pidLoopIsCrucial")]
        public Input<bool>? PidLoopIsCrucial { get; set; }

        /// <summary>
        /// The name of Pid Loop.
        /// </summary>
        [Input("pidLoopName")]
        public Input<string>? PidLoopName { get; set; }

        /// <summary>
        /// The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
        /// </summary>
        [Input("pidLoopType")]
        public Input<string>? PidLoopType { get; set; }

        /// <summary>
        /// The pid project id.
        /// </summary>
        [Input("pidProjectId")]
        public Input<string>? PidProjectId { get; set; }

        /// <summary>
        /// The status of Pid Loop.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public IndustrialPidLoopState()
        {
        }
        public static new IndustrialPidLoopState Empty => new IndustrialPidLoopState();
    }
}
