// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    /// <summary>
    /// Provides a DCDN Er resource.
    /// 
    /// For information about DCDN Er and how to use it, see [What is Er](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-createroutine).
    /// 
    /// &gt; **NOTE:** Available since v1.201.0.
    /// 
    /// ## Import
    /// 
    /// DCDN Er can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:dcdn/er:Er example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:dcdn/er:Er")]
    public partial class Er : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Routine The description of the routine.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The configurations of the specified environment. See `env_conf` below.
        /// </summary>
        [Output("envConf")]
        public Output<Outputs.ErEnvConf> EnvConf { get; private set; } = null!;

        /// <summary>
        /// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
        /// </summary>
        [Output("erName")]
        public Output<string> ErName { get; private set; } = null!;


        /// <summary>
        /// Create a Er resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Er(string name, ErArgs args, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/er:Er", name, args ?? new ErArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Er(string name, Input<string> id, ErState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:dcdn/er:Er", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Er resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Er Get(string name, Input<string> id, ErState? state = null, CustomResourceOptions? options = null)
        {
            return new Er(name, id, state, options);
        }
    }

    public sealed class ErArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Routine The description of the routine.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The configurations of the specified environment. See `env_conf` below.
        /// </summary>
        [Input("envConf")]
        public Input<Inputs.ErEnvConfArgs>? EnvConf { get; set; }

        /// <summary>
        /// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
        /// </summary>
        [Input("erName", required: true)]
        public Input<string> ErName { get; set; } = null!;

        public ErArgs()
        {
        }
        public static new ErArgs Empty => new ErArgs();
    }

    public sealed class ErState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Routine The description of the routine.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The configurations of the specified environment. See `env_conf` below.
        /// </summary>
        [Input("envConf")]
        public Input<Inputs.ErEnvConfGetArgs>? EnvConf { get; set; }

        /// <summary>
        /// The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
        /// </summary>
        [Input("erName")]
        public Input<string>? ErName { get; set; }

        public ErState()
        {
        }
        public static new ErState Empty => new ErState();
    }
}
