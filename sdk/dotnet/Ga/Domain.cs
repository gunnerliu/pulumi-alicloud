// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Ga Domain resource.
    /// 
    /// For information about Ga Domain and how to use it, see [What is Domain](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createdomain).
    /// 
    /// &gt; **NOTE:** Available since v1.197.0.
    /// 
    /// ## Import
    /// 
    /// Ga Domain can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/domain:Domain example &lt;accelerator_id&gt;:&lt;domain&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/domain:Domain")]
    public partial class Domain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        /// </summary>
        [Output("domain")]
        public Output<string> AcceleratedDomain { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/domain:Domain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Domain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Domain Get(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
        {
            return new Domain(name, id, state, options);
        }
    }

    public sealed class DomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> AcceleratedDomain { get; set; } = null!;

        public DomainArgs()
        {
        }
        public static new DomainArgs Empty => new DomainArgs();
    }

    public sealed class DomainState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the global acceleration instance.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The accelerated domain name to be added. only top-level domain names are supported, such as 'example.com'.
        /// </summary>
        [Input("domain")]
        public Input<string>? AcceleratedDomain { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public DomainState()
        {
        }
        public static new DomainState Empty => new DomainState();
    }
}
