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
    /// Provides a CEN transit router resource that associate the transitRouter with the CEN instance.[What is Cen Transit Router](https://help.aliyun.com/document_detail/261169.html)
    /// 
    /// &gt; **NOTE:** Available in 1.126.0+
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
    ///         var name = config.Get("name") ?? "tf-testAccCenTransitRouter";
    ///         var defaultInstance = new AliCloud.Cen.Instance("defaultInstance", new AliCloud.Cen.InstanceArgs
    ///         {
    ///             CenInstanceName = name,
    ///             Description = "terraform01",
    ///         });
    ///         var defaultTransitRouter = new AliCloud.Cen.TransitRouter("defaultTransitRouter", new AliCloud.Cen.TransitRouterArgs
    ///         {
    ///             TransitRouterName = name,
    ///             CenId = defaultInstance.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// CEN instance can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cen/transitRouter:TransitRouter default cen-*****:tr-*******
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cen/transitRouter:TransitRouter")]
    public partial class TransitRouter : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Output("cenId")]
        public Output<string> CenId { get; private set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The associating status of the Transit Router.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The description of the transit router.
        /// </summary>
        [Output("transitRouterDescription")]
        public Output<string?> TransitRouterDescription { get; private set; } = null!;

        [Output("transitRouterId")]
        public Output<string> TransitRouterId { get; private set; } = null!;

        /// <summary>
        /// The name of the transit router.
        /// </summary>
        [Output("transitRouterName")]
        public Output<string?> TransitRouterName { get; private set; } = null!;

        /// <summary>
        /// The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a TransitRouter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TransitRouter(string name, TransitRouterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouter:TransitRouter", name, args ?? new TransitRouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TransitRouter(string name, Input<string> id, TransitRouterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cen/transitRouter:TransitRouter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TransitRouter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TransitRouter Get(string name, Input<string> id, TransitRouterState? state = null, CustomResourceOptions? options = null)
        {
            return new TransitRouter(name, id, state, options);
        }
    }

    public sealed class TransitRouterArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId", required: true)]
        public Input<string> CenId { get; set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The description of the transit router.
        /// </summary>
        [Input("transitRouterDescription")]
        public Input<string>? TransitRouterDescription { get; set; }

        /// <summary>
        /// The name of the transit router.
        /// </summary>
        [Input("transitRouterName")]
        public Input<string>? TransitRouterName { get; set; }

        public TransitRouterArgs()
        {
        }
    }

    public sealed class TransitRouterState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the CEN.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The associating status of the Transit Router.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The description of the transit router.
        /// </summary>
        [Input("transitRouterDescription")]
        public Input<string>? TransitRouterDescription { get; set; }

        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        /// <summary>
        /// The name of the transit router.
        /// </summary>
        [Input("transitRouterName")]
        public Input<string>? TransitRouterName { get; set; }

        /// <summary>
        /// The Type of the Transit Router. Valid values: `Enterprise`, `Basic`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TransitRouterState()
        {
        }
    }
}
