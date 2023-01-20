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
    ///     var foo = new AliCloud.Vpc.HAVip("foo", new()
    ///     {
    ///         Description = "test_havip",
    ///         VswitchId = "vsw-fakeid",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The havip can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpc/hAVip:HAVip foo havip-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/hAVip:HAVip")]
    public partial class HAVip : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the HaVip instance.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the HaVip instance.
        /// </summary>
        [Output("havipName")]
        public Output<string?> HavipName { get; private set; } = null!;

        /// <summary>
        /// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// (Available in v1.120.0+) The status of the HaVip instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The vswitch_id of the HaVip, the field can't be changed.
        /// </summary>
        [Output("vswitchId")]
        public Output<string> VswitchId { get; private set; } = null!;


        /// <summary>
        /// Create a HAVip resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HAVip(string name, HAVipArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/hAVip:HAVip", name, args ?? new HAVipArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HAVip(string name, Input<string> id, HAVipState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/hAVip:HAVip", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HAVip resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HAVip Get(string name, Input<string> id, HAVipState? state = null, CustomResourceOptions? options = null)
        {
            return new HAVip(name, id, state, options);
        }
    }

    public sealed class HAVipArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the HaVip instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the HaVip instance.
        /// </summary>
        [Input("havipName")]
        public Input<string>? HavipName { get; set; }

        /// <summary>
        /// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The vswitch_id of the HaVip, the field can't be changed.
        /// </summary>
        [Input("vswitchId", required: true)]
        public Input<string> VswitchId { get; set; } = null!;

        public HAVipArgs()
        {
        }
        public static new HAVipArgs Empty => new HAVipArgs();
    }

    public sealed class HAVipState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the HaVip instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the HaVip instance.
        /// </summary>
        [Input("havipName")]
        public Input<string>? HavipName { get; set; }

        /// <summary>
        /// The ip address of the HaVip. If not filled, the default will be assigned one from the vswitch.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// (Available in v1.120.0+) The status of the HaVip instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The vswitch_id of the HaVip, the field can't be changed.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        public HAVipState()
        {
        }
        public static new HAVipState Empty => new HAVipState();
    }
}
