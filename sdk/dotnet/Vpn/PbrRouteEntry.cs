// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn
{
    /// <summary>
    /// Provides a VPN Pbr Route Entry resource.
    /// 
    /// &gt; **NOTE:** Available in 1.162.0+.
    /// 
    /// For information about VPN Pbr Route Entry and how to use it, see [What is VPN Pbr Route Entry](https://www.alibabacloud.com/help/en/doc-detail/127248.html).
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "tfacc";
    ///     var defaultGateways = AliCloud.Vpn.GetGateways.Invoke();
    /// 
    ///     var defaultCustomerGateway = new AliCloud.Vpn.CustomerGateway("defaultCustomerGateway", new()
    ///     {
    ///         IpAddress = "192.168.1.1",
    ///     });
    /// 
    ///     var defaultConnection = new AliCloud.Vpn.Connection("defaultConnection", new()
    ///     {
    ///         CustomerGatewayId = defaultCustomerGateway.Id,
    ///         VpnGatewayId = defaultGateways.Apply(getGatewaysResult =&gt; getGatewaysResult.Ids[0]),
    ///         LocalSubnets = new[]
    ///         {
    ///             "192.168.2.0/24",
    ///         },
    ///         RemoteSubnets = new[]
    ///         {
    ///             "192.168.3.0/24",
    ///         },
    ///     });
    /// 
    ///     var defaultPbrRouteEntry = new AliCloud.Vpn.PbrRouteEntry("defaultPbrRouteEntry", new()
    ///     {
    ///         VpnGatewayId = defaultGateways.Apply(getGatewaysResult =&gt; getGatewaysResult.Ids[0]),
    ///         RouteSource = "192.168.1.0/24",
    ///         RouteDest = "10.0.0.0/24",
    ///         NextHop = defaultConnection.Id,
    ///         Weight = 0,
    ///         PublishVpc = false,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VPN Pbr route entry can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpn/pbrRouteEntry:PbrRouteEntry example &lt;vpn_gateway_id&gt;:&lt;next_hop&gt;:&lt;route_source&gt;:&lt;route_dest&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpn/pbrRouteEntry:PbrRouteEntry")]
    public partial class PbrRouteEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The next hop of the policy-based route.
        /// </summary>
        [Output("nextHop")]
        public Output<string> NextHop { get; private set; } = null!;

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Output("publishVpc")]
        public Output<bool> PublishVpc { get; private set; } = null!;

        /// <summary>
        /// The destination CIDR block of the policy-based route.
        /// </summary>
        [Output("routeDest")]
        public Output<string> RouteDest { get; private set; } = null!;

        /// <summary>
        /// The source CIDR block of the policy-based route.
        /// </summary>
        [Output("routeSource")]
        public Output<string> RouteSource { get; private set; } = null!;

        /// <summary>
        /// The status of the vpn pbr route entry.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the vpn gateway.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string> VpnGatewayId { get; private set; } = null!;

        /// <summary>
        /// The weight of the policy-based route. Valid values: 0 and 100.
        /// </summary>
        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a PbrRouteEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PbrRouteEntry(string name, PbrRouteEntryArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpn/pbrRouteEntry:PbrRouteEntry", name, args ?? new PbrRouteEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PbrRouteEntry(string name, Input<string> id, PbrRouteEntryState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpn/pbrRouteEntry:PbrRouteEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PbrRouteEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PbrRouteEntry Get(string name, Input<string> id, PbrRouteEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new PbrRouteEntry(name, id, state, options);
        }
    }

    public sealed class PbrRouteEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The next hop of the policy-based route.
        /// </summary>
        [Input("nextHop", required: true)]
        public Input<string> NextHop { get; set; } = null!;

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Input("publishVpc", required: true)]
        public Input<bool> PublishVpc { get; set; } = null!;

        /// <summary>
        /// The destination CIDR block of the policy-based route.
        /// </summary>
        [Input("routeDest", required: true)]
        public Input<string> RouteDest { get; set; } = null!;

        /// <summary>
        /// The source CIDR block of the policy-based route.
        /// </summary>
        [Input("routeSource", required: true)]
        public Input<string> RouteSource { get; set; } = null!;

        /// <summary>
        /// The ID of the vpn gateway.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        /// <summary>
        /// The weight of the policy-based route. Valid values: 0 and 100.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public PbrRouteEntryArgs()
        {
        }
        public static new PbrRouteEntryArgs Empty => new PbrRouteEntryArgs();
    }

    public sealed class PbrRouteEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The next hop of the policy-based route.
        /// </summary>
        [Input("nextHop")]
        public Input<string>? NextHop { get; set; }

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Input("publishVpc")]
        public Input<bool>? PublishVpc { get; set; }

        /// <summary>
        /// The destination CIDR block of the policy-based route.
        /// </summary>
        [Input("routeDest")]
        public Input<string>? RouteDest { get; set; }

        /// <summary>
        /// The source CIDR block of the policy-based route.
        /// </summary>
        [Input("routeSource")]
        public Input<string>? RouteSource { get; set; }

        /// <summary>
        /// The status of the vpn pbr route entry.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the vpn gateway.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        /// <summary>
        /// The weight of the policy-based route. Valid values: 0 and 100.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public PbrRouteEntryState()
        {
        }
        public static new PbrRouteEntryState Empty => new PbrRouteEntryState();
    }
}
