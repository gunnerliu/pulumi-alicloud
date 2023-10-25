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
    /// Provides a Threat Detection Honeypot Preset resource.
    /// 
    /// For information about Threat Detection Honeypot Preset and how to use it, see [What is Honeypot Preset](https://www.alibabacloud.com/help/en/security-center/developer-reference/api-sas-2018-12-03-createhoneypotpreset).
    /// 
    /// &gt; **NOTE:** Available since v1.195.0.
    /// 
    /// ## Import
    /// 
    /// Threat Detection Honeypot Preset can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:threatdetection/honeypotPreset:HoneypotPreset example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:threatdetection/honeypotPreset:HoneypotPreset")]
    public partial class HoneypotPreset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Honeypot mirror name
        /// </summary>
        [Output("honeypotImageName")]
        public Output<string> HoneypotImageName { get; private set; } = null!;

        /// <summary>
        /// Unique ID of honeypot Template
        /// </summary>
        [Output("honeypotPresetId")]
        public Output<string> HoneypotPresetId { get; private set; } = null!;

        /// <summary>
        /// Honeypot template custom parameters. See `meta` below.
        /// </summary>
        [Output("meta")]
        public Output<Outputs.HoneypotPresetMeta> Meta { get; private set; } = null!;

        /// <summary>
        /// Unique id of management node
        /// </summary>
        [Output("nodeId")]
        public Output<string> NodeId { get; private set; } = null!;

        /// <summary>
        /// Honeypot template custom name
        /// </summary>
        [Output("presetName")]
        public Output<string> PresetName { get; private set; } = null!;


        /// <summary>
        /// Create a HoneypotPreset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public HoneypotPreset(string name, HoneypotPresetArgs args, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, args ?? new HoneypotPresetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private HoneypotPreset(string name, Input<string> id, HoneypotPresetState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:threatdetection/honeypotPreset:HoneypotPreset", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing HoneypotPreset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static HoneypotPreset Get(string name, Input<string> id, HoneypotPresetState? state = null, CustomResourceOptions? options = null)
        {
            return new HoneypotPreset(name, id, state, options);
        }
    }

    public sealed class HoneypotPresetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Honeypot mirror name
        /// </summary>
        [Input("honeypotImageName", required: true)]
        public Input<string> HoneypotImageName { get; set; } = null!;

        /// <summary>
        /// Honeypot template custom parameters. See `meta` below.
        /// </summary>
        [Input("meta", required: true)]
        public Input<Inputs.HoneypotPresetMetaArgs> Meta { get; set; } = null!;

        /// <summary>
        /// Unique id of management node
        /// </summary>
        [Input("nodeId", required: true)]
        public Input<string> NodeId { get; set; } = null!;

        /// <summary>
        /// Honeypot template custom name
        /// </summary>
        [Input("presetName", required: true)]
        public Input<string> PresetName { get; set; } = null!;

        public HoneypotPresetArgs()
        {
        }
        public static new HoneypotPresetArgs Empty => new HoneypotPresetArgs();
    }

    public sealed class HoneypotPresetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Honeypot mirror name
        /// </summary>
        [Input("honeypotImageName")]
        public Input<string>? HoneypotImageName { get; set; }

        /// <summary>
        /// Unique ID of honeypot Template
        /// </summary>
        [Input("honeypotPresetId")]
        public Input<string>? HoneypotPresetId { get; set; }

        /// <summary>
        /// Honeypot template custom parameters. See `meta` below.
        /// </summary>
        [Input("meta")]
        public Input<Inputs.HoneypotPresetMetaGetArgs>? Meta { get; set; }

        /// <summary>
        /// Unique id of management node
        /// </summary>
        [Input("nodeId")]
        public Input<string>? NodeId { get; set; }

        /// <summary>
        /// Honeypot template custom name
        /// </summary>
        [Input("presetName")]
        public Input<string>? PresetName { get; set; }

        public HoneypotPresetState()
        {
        }
        public static new HoneypotPresetState Empty => new HoneypotPresetState();
    }
}
