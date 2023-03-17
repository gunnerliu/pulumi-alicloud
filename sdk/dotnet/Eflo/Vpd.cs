// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo
{
    /// <summary>
    /// Provides a Eflo Vpd resource.
    /// 
    /// For information about Eflo Vpd and how to use it, see [What is Vpd](https://help.aliyun.com/document_detail/604976.html).
    /// 
    /// &gt; **NOTE:** Available in v1.201.0+.
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
    ///     var @default = new AliCloud.Eflo.Vpd("default", new()
    ///     {
    ///         Cidr = "10.0.0.0/8",
    ///         VpdName = "RMC-Terraform-Test",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Eflo Vpd can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:eflo/vpd:Vpd example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:eflo/vpd:Vpd")]
    public partial class Vpd : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CIDR network segment
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Modification time
        /// </summary>
        [Output("gmtModified")]
        public Output<string> GmtModified { get; private set; } = null!;

        /// <summary>
        /// The Resource group id
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The Vpd status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        [Output("vpdName")]
        public Output<string> VpdName { get; private set; } = null!;


        /// <summary>
        /// Create a Vpd resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Vpd(string name, VpdArgs args, CustomResourceOptions? options = null)
            : base("alicloud:eflo/vpd:Vpd", name, args ?? new VpdArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Vpd(string name, Input<string> id, VpdState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:eflo/vpd:Vpd", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Vpd resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Vpd Get(string name, Input<string> id, VpdState? state = null, CustomResourceOptions? options = null)
        {
            return new Vpd(name, id, state, options);
        }
    }

    public sealed class VpdArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR network segment
        /// </summary>
        [Input("cidr", required: true)]
        public Input<string> Cidr { get; set; } = null!;

        /// <summary>
        /// The Resource group id
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        [Input("vpdName", required: true)]
        public Input<string> VpdName { get; set; } = null!;

        public VpdArgs()
        {
        }
        public static new VpdArgs Empty => new VpdArgs();
    }

    public sealed class VpdState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR network segment
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The creation time of the resource
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Modification time
        /// </summary>
        [Input("gmtModified")]
        public Input<string>? GmtModified { get; set; }

        /// <summary>
        /// The Resource group id
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The Vpd status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        [Input("vpdName")]
        public Input<string>? VpdName { get; set; }

        public VpdState()
        {
        }
        public static new VpdState Empty => new VpdState();
    }
}
