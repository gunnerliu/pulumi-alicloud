// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ens
{
    /// <summary>
    /// Provides a ENS Vswitch resource.
    /// 
    /// For information about ENS Vswitch and how to use it, see [What is Vswitch](https://www.alibabacloud.com/help/en/ens/developer-reference/api-createvswitch).
    /// 
    /// &gt; **NOTE:** Available since v1.213.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "terraform-example";
    ///     var defaultNetwork = new AliCloud.Ens.Network("defaultNetwork", new()
    ///     {
    ///         NetworkName = name,
    ///         Description = name,
    ///         CidrBlock = "192.168.2.0/24",
    ///         EnsRegionId = "cn-chenzhou-telecom_unicom_cmcc",
    ///     });
    /// 
    ///     var defaultVswitch = new AliCloud.Ens.Vswitch("defaultVswitch", new()
    ///     {
    ///         Description = name,
    ///         CidrBlock = "192.168.2.0/24",
    ///         VswitchName = name,
    ///         EnsRegionId = "cn-chenzhou-telecom_unicom_cmcc",
    ///         NetworkId = defaultNetwork.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ENS Vswitch can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:ens/vswitch:Vswitch example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ens/vswitch:Vswitch")]
    public partial class Vswitch : global::Pulumi.CustomResource
    {
        /// <summary>
        /// IPv4 CIDR block of the VSwitch instance.
        /// </summary>
        [Output("cidrBlock")]
        public Output<string> CidrBlock { get; private set; } = null!;

        /// <summary>
        /// The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Description of the VSwitch Instance.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// ENS Region ID.
        /// </summary>
        [Output("ensRegionId")]
        public Output<string> EnsRegionId { get; private set; } = null!;

        /// <summary>
        /// Network ID of the VSwitch instance.
        /// </summary>
        [Output("networkId")]
        public Output<string> NetworkId { get; private set; } = null!;

        /// <summary>
        /// Status of the switch instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Name of the switch instance.
        /// </summary>
        [Output("vswitchName")]
        public Output<string?> VswitchName { get; private set; } = null!;


        /// <summary>
        /// Create a Vswitch resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vswitch(string name, VswitchArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ens/vswitch:Vswitch", name, args ?? new VswitchArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vswitch(string name, Input<string> id, VswitchState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ens/vswitch:Vswitch", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vswitch resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vswitch Get(string name, Input<string> id, VswitchState? state = null, CustomResourceOptions? options = null)
        {
            return new Vswitch(name, id, state, options);
        }
    }

    public sealed class VswitchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 CIDR block of the VSwitch instance.
        /// </summary>
        [Input("cidrBlock", required: true)]
        public Input<string> CidrBlock { get; set; } = null!;

        /// <summary>
        /// Description of the VSwitch Instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// ENS Region ID.
        /// </summary>
        [Input("ensRegionId", required: true)]
        public Input<string> EnsRegionId { get; set; } = null!;

        /// <summary>
        /// Network ID of the VSwitch instance.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Name of the switch instance.
        /// </summary>
        [Input("vswitchName")]
        public Input<string>? VswitchName { get; set; }

        public VswitchArgs()
        {
        }
        public static new VswitchArgs Empty => new VswitchArgs();
    }

    public sealed class VswitchState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 CIDR block of the VSwitch instance.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// The creation time of the VSwitch instance, in the UTC time format, yyyy-MM-ddTHH:mm:ssZ.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Description of the VSwitch Instance.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// ENS Region ID.
        /// </summary>
        [Input("ensRegionId")]
        public Input<string>? EnsRegionId { get; set; }

        /// <summary>
        /// Network ID of the VSwitch instance.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        /// <summary>
        /// Status of the switch instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Name of the switch instance.
        /// </summary>
        [Input("vswitchName")]
        public Input<string>? VswitchName { get; set; }

        public VswitchState()
        {
        }
        public static new VswitchState Empty => new VswitchState();
    }
}
