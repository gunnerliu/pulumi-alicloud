// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection
{
    /// <summary>
    /// Provides a Threat Detection Honey Pot resource.
    /// 
    /// For information about Threat Detection Honey Pot and how to use it, see [What is Honey Pot](https://www.alibabacloud.com/help/en/security-center/latest/api-doc-sas-2018-12-03-api-doc-createhoneypot).
    /// 
    /// &gt; **NOTE:** Available in v1.195.0+.
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
    ///     var @default = new AliCloud.ThreatDetection.HoneyPot("default", new()
    ///     {
    ///         HoneypotImageId = "sha256:007095d6de9c7a343e9fc1f74a7efc9c5de9d5454789d2fa505a1b3fc623730c",
    ///         HoneypotImageName = "ruoyi",
    ///         HoneypotName = "huangtiong-test",
    ///         NodeId = "a44e1ab3-6945-444c-889d-5bacee7056e8",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Threat Detection Honey Pot can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:threatdetection/honeyPot:HoneyPot example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:threatdetection/honeyPot:HoneyPot")]
    public partial class HoneyPot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        [Output("honeypotId")]
        public Output<string> HoneypotId { get; private set; } = null!;

        /// <summary>
        /// The image ID of the honeypot.
        /// </summary>
        [Output("honeypotImageId")]
        public Output<string> HoneypotImageId { get; private set; } = null!;

        /// <summary>
        /// Honeypot mirror name.
        /// </summary>
        [Output("honeypotImageName")]
        public Output<string> HoneypotImageName { get; private set; } = null!;

        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        [Output("honeypotName")]
        public Output<string> HoneypotName { get; private set; } = null!;

        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        [Output("nodeId")]
        public Output<string> NodeId { get; private set; } = null!;

        /// <summary>
        /// The custom parameter ID of honeypot.
        /// </summary>
        [Output("presetId")]
        public Output<string> PresetId { get; private set; } = null!;

        /// <summary>
        /// Honeypot status.
        /// </summary>
        [Output("states")]
        public Output<ImmutableArray<string>> States { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a HoneyPot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HoneyPot(string name, HoneyPotArgs args, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/honeyPot:HoneyPot", name, args ?? new HoneyPotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HoneyPot(string name, Input<string> id, HoneyPotState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/honeyPot:HoneyPot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HoneyPot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HoneyPot Get(string name, Input<string> id, HoneyPotState? state = null, CustomResourceOptions? options = null)
        {
            return new HoneyPot(name, id, state, options);
        }
    }

    public sealed class HoneyPotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The image ID of the honeypot.
        /// </summary>
        [Input("honeypotImageId", required: true)]
        public Input<string> HoneypotImageId { get; set; } = null!;

        /// <summary>
        /// Honeypot mirror name.
        /// </summary>
        [Input("honeypotImageName", required: true)]
        public Input<string> HoneypotImageName { get; set; } = null!;

        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        [Input("honeypotName", required: true)]
        public Input<string> HoneypotName { get; set; } = null!;

        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        [Input("nodeId", required: true)]
        public Input<string> NodeId { get; set; } = null!;

        public HoneyPotArgs()
        {
        }
        public static new HoneyPotArgs Empty => new HoneyPotArgs();
    }

    public sealed class HoneyPotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Honeypot ID.
        /// </summary>
        [Input("honeypotId")]
        public Input<string>? HoneypotId { get; set; }

        /// <summary>
        /// The image ID of the honeypot.
        /// </summary>
        [Input("honeypotImageId")]
        public Input<string>? HoneypotImageId { get; set; }

        /// <summary>
        /// Honeypot mirror name.
        /// </summary>
        [Input("honeypotImageName")]
        public Input<string>? HoneypotImageName { get; set; }

        /// <summary>
        /// Honeypot custom name.
        /// </summary>
        [Input("honeypotName")]
        public Input<string>? HoneypotName { get; set; }

        /// <summary>
        /// The ID of the honeypot management node.
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// The custom parameter ID of honeypot.
        /// </summary>
        [Input("presetId")]
        public Input<string>? PresetId { get; set; }

        [Input("states")]
        private InputList<string>? _states;

        /// <summary>
        /// Honeypot status.
        /// </summary>
        public InputList<string> States
        {
            get => _states ?? (_states = new InputList<string>());
            set => _states = value;
        }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public HoneyPotState()
        {
        }
        public static new HoneyPotState Empty => new HoneyPotState();
    }
}
