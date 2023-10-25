// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ddos
{
    /// <summary>
    /// Provides a Anti-DDoS Pro Port resource.
    /// 
    /// For information about Anti-DDoS Pro Port and how to use it, see [What is Port](https://www.alibabacloud.com/help/en/ddos-protection/latest/api-ddoscoo-2020-01-01-createport).
    /// 
    /// &gt; **NOTE:** Available since v1.123.0.
    /// 
    /// ## Import
    /// 
    /// Anti-DDoS Pro Port can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ddos/port:Port example &lt;instance_id&gt;:&lt;frontend_port&gt;:&lt;frontend_protocol&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ddos/port:Port")]
    public partial class Port : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The port of the origin server. Valid values: [1~65535].
        /// </summary>
        [Output("backendPort")]
        public Output<string?> BackendPort { get; private set; } = null!;

        /// <summary>
        /// The forwarding port. Valid values: [1~65535].
        /// </summary>
        [Output("frontendPort")]
        public Output<string> FrontendPort { get; private set; } = null!;

        /// <summary>
        /// The forwarding protocol. Valid values `tcp` and `udp`.
        /// </summary>
        [Output("frontendProtocol")]
        public Output<string> FrontendProtocol { get; private set; } = null!;

        /// <summary>
        /// The ID of Ddoscoo instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// List of source IP addresses.
        /// </summary>
        [Output("realServers")]
        public Output<ImmutableArray<string>> RealServers { get; private set; } = null!;


        /// <summary>
        /// Create a Port resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Port(string name, PortArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ddos/port:Port", name, args ?? new PortArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Port(string name, Input<string> id, PortState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ddos/port:Port", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Port resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Port Get(string name, Input<string> id, PortState? state = null, CustomResourceOptions? options = null)
        {
            return new Port(name, id, state, options);
        }
    }

    public sealed class PortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port of the origin server. Valid values: [1~65535].
        /// </summary>
        [Input("backendPort")]
        public Input<string>? BackendPort { get; set; }

        /// <summary>
        /// The forwarding port. Valid values: [1~65535].
        /// </summary>
        [Input("frontendPort", required: true)]
        public Input<string> FrontendPort { get; set; } = null!;

        /// <summary>
        /// The forwarding protocol. Valid values `tcp` and `udp`.
        /// </summary>
        [Input("frontendProtocol", required: true)]
        public Input<string> FrontendProtocol { get; set; } = null!;

        /// <summary>
        /// The ID of Ddoscoo instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("realServers", required: true)]
        private InputList<string>? _realServers;

        /// <summary>
        /// List of source IP addresses.
        /// </summary>
        public InputList<string> RealServers
        {
            get => _realServers ?? (_realServers = new InputList<string>());
            set => _realServers = value;
        }

        public PortArgs()
        {
        }
        public static new PortArgs Empty => new PortArgs();
    }

    public sealed class PortState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The port of the origin server. Valid values: [1~65535].
        /// </summary>
        [Input("backendPort")]
        public Input<string>? BackendPort { get; set; }

        /// <summary>
        /// The forwarding port. Valid values: [1~65535].
        /// </summary>
        [Input("frontendPort")]
        public Input<string>? FrontendPort { get; set; }

        /// <summary>
        /// The forwarding protocol. Valid values `tcp` and `udp`.
        /// </summary>
        [Input("frontendProtocol")]
        public Input<string>? FrontendProtocol { get; set; }

        /// <summary>
        /// The ID of Ddoscoo instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        [Input("realServers")]
        private InputList<string>? _realServers;

        /// <summary>
        /// List of source IP addresses.
        /// </summary>
        public InputList<string> RealServers
        {
            get => _realServers ?? (_realServers = new InputList<string>());
            set => _realServers = value;
        }

        public PortState()
        {
        }
        public static new PortState Empty => new PortState();
    }
}
