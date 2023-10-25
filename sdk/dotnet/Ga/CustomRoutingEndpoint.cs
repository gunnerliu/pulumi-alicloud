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
    /// Provides a Global Accelerator (GA) Custom Routing Endpoint resource.
    /// 
    /// For information about Global Accelerator (GA) Custom Routing Endpoint and how to use it, see [What is Custom Routing Endpoint](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createcustomroutingendpoints).
    /// 
    /// &gt; **NOTE:** Available since v1.197.0.
    /// 
    /// ## Import
    /// 
    /// Global Accelerator (GA) Custom Routing Endpoint can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint example &lt;endpoint_group_id&gt;:&lt;custom_routing_endpoint_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint")]
    public partial class CustomRoutingEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the GA instance with which the endpoint is associated.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Custom Routing Endpoint.
        /// </summary>
        [Output("customRoutingEndpointId")]
        public Output<string> CustomRoutingEndpointId { get; private set; } = null!;

        /// <summary>
        /// The ID of the endpoint (vSwitch).
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The ID of the endpoint group in which to create endpoints.
        /// </summary>
        [Output("endpointGroupId")]
        public Output<string> EndpointGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the listener with which the endpoint is associated.
        /// </summary>
        [Output("listenerId")]
        public Output<string> ListenerId { get; private set; } = null!;

        /// <summary>
        /// The status of the Custom Routing Endpoint.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        /// </summary>
        [Output("trafficToEndpointPolicy")]
        public Output<string> TrafficToEndpointPolicy { get; private set; } = null!;

        /// <summary>
        /// The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a CustomRoutingEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomRoutingEndpoint(string name, CustomRoutingEndpointArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint", name, args ?? new CustomRoutingEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomRoutingEndpoint(string name, Input<string> id, CustomRoutingEndpointState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/customRoutingEndpoint:CustomRoutingEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomRoutingEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomRoutingEndpoint Get(string name, Input<string> id, CustomRoutingEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomRoutingEndpoint(name, id, state, options);
        }
    }

    public sealed class CustomRoutingEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the endpoint (vSwitch).
        /// </summary>
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        /// <summary>
        /// The ID of the endpoint group in which to create endpoints.
        /// </summary>
        [Input("endpointGroupId", required: true)]
        public Input<string> EndpointGroupId { get; set; } = null!;

        /// <summary>
        /// The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        /// </summary>
        [Input("trafficToEndpointPolicy")]
        public Input<string>? TrafficToEndpointPolicy { get; set; }

        /// <summary>
        /// The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CustomRoutingEndpointArgs()
        {
        }
        public static new CustomRoutingEndpointArgs Empty => new CustomRoutingEndpointArgs();
    }

    public sealed class CustomRoutingEndpointState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the GA instance with which the endpoint is associated.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The ID of the Custom Routing Endpoint.
        /// </summary>
        [Input("customRoutingEndpointId")]
        public Input<string>? CustomRoutingEndpointId { get; set; }

        /// <summary>
        /// The ID of the endpoint (vSwitch).
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The ID of the endpoint group in which to create endpoints.
        /// </summary>
        [Input("endpointGroupId")]
        public Input<string>? EndpointGroupId { get; set; }

        /// <summary>
        /// The ID of the listener with which the endpoint is associated.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// The status of the Custom Routing Endpoint.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The access policy of traffic to the endpoint. Default value: `DenyAll`. Valid values:
        /// </summary>
        [Input("trafficToEndpointPolicy")]
        public Input<string>? TrafficToEndpointPolicy { get; set; }

        /// <summary>
        /// The backend service type of the endpoint. Valid values: `PrivateSubNet`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public CustomRoutingEndpointState()
        {
        }
        public static new CustomRoutingEndpointState Empty => new CustomRoutingEndpointState();
    }
}
