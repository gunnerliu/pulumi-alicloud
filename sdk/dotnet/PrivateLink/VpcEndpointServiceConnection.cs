// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PrivateLink
{
    /// <summary>
    /// Provides a Private Link Vpc Endpoint Connection resource.
    /// 
    /// For information about Private Link Vpc Endpoint Connection and how to use it, see [What is Vpc Endpoint Connection](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-enablevpcendpointzoneconnection).
    /// 
    /// &gt; **NOTE:** Available since v1.110.0.
    /// 
    /// ## Import
    /// 
    /// Private Link Vpc Endpoint Connection can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection example &lt;service_id&gt;:&lt;endpoint_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection")]
    public partial class VpcEndpointServiceConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Bandwidth.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of the Vpc Endpoint.
        /// </summary>
        [Output("endpointId")]
        public Output<string> EndpointId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Vpc Endpoint Service.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// The status of Vpc Endpoint Connection.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpointServiceConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpointServiceConnection(string name, VpcEndpointServiceConnectionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection", name, args ?? new VpcEndpointServiceConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpointServiceConnection(string name, Input<string> id, VpcEndpointServiceConnectionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:privatelink/vpcEndpointServiceConnection:VpcEndpointServiceConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpointServiceConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpointServiceConnection Get(string name, Input<string> id, VpcEndpointServiceConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpointServiceConnection(name, id, state, options);
        }
    }

    public sealed class VpcEndpointServiceConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Bandwidth.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the Vpc Endpoint.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        /// <summary>
        /// The ID of the Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        public VpcEndpointServiceConnectionArgs()
        {
        }
        public static new VpcEndpointServiceConnectionArgs Empty => new VpcEndpointServiceConnectionArgs();
    }

    public sealed class VpcEndpointServiceConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Bandwidth.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the Vpc Endpoint.
        /// </summary>
        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        /// <summary>
        /// The ID of the Vpc Endpoint Service.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// The status of Vpc Endpoint Connection.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public VpcEndpointServiceConnectionState()
        {
        }
        public static new VpcEndpointServiceConnectionState Empty => new VpcEndpointServiceConnectionState();
    }
}
