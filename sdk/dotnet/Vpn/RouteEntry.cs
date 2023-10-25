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
    /// ## Import
    /// 
    /// VPN route entry can be imported using the id(VpnGatewayId +":"+ NextHop +":"+ RouteDest), e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpn/routeEntry:RouteEntry example vpn-abc123456:vco-abc123456:10.0.0.10/24
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpn/routeEntry:RouteEntry")]
    public partial class RouteEntry : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The next hop of the destination route.
        /// </summary>
        [Output("nextHop")]
        public Output<string> NextHop { get; private set; } = null!;

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Output("publishVpc")]
        public Output<bool> PublishVpc { get; private set; } = null!;

        /// <summary>
        /// The destination network segment of the destination route.
        /// </summary>
        [Output("routeDest")]
        public Output<string> RouteDest { get; private set; } = null!;

        /// <summary>
        /// (Available in 1.161.0+) The type of the vpn route entry.
        /// </summary>
        [Output("routeEntryType")]
        public Output<string> RouteEntryType { get; private set; } = null!;

        /// <summary>
        /// (Available in 1.161.0+) The status of the vpn route entry.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The id of the vpn gateway.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string> VpnGatewayId { get; private set; } = null!;

        /// <summary>
        /// The value should be 0 or 100.
        /// </summary>
        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a RouteEntry resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteEntry(string name, RouteEntryArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpn/routeEntry:RouteEntry", name, args ?? new RouteEntryArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteEntry(string name, Input<string> id, RouteEntryState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpn/routeEntry:RouteEntry", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouteEntry resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteEntry Get(string name, Input<string> id, RouteEntryState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteEntry(name, id, state, options);
        }
    }

    public sealed class RouteEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The next hop of the destination route.
        /// </summary>
        [Input("nextHop", required: true)]
        public Input<string> NextHop { get; set; } = null!;

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Input("publishVpc", required: true)]
        public Input<bool> PublishVpc { get; set; } = null!;

        /// <summary>
        /// The destination network segment of the destination route.
        /// </summary>
        [Input("routeDest", required: true)]
        public Input<string> RouteDest { get; set; } = null!;

        /// <summary>
        /// The id of the vpn gateway.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        /// <summary>
        /// The value should be 0 or 100.
        /// </summary>
        [Input("weight", required: true)]
        public Input<int> Weight { get; set; } = null!;

        public RouteEntryArgs()
        {
        }
        public static new RouteEntryArgs Empty => new RouteEntryArgs();
    }

    public sealed class RouteEntryState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The next hop of the destination route.
        /// </summary>
        [Input("nextHop")]
        public Input<string>? NextHop { get; set; }

        /// <summary>
        /// Whether to issue the destination route to the VPC.
        /// </summary>
        [Input("publishVpc")]
        public Input<bool>? PublishVpc { get; set; }

        /// <summary>
        /// The destination network segment of the destination route.
        /// </summary>
        [Input("routeDest")]
        public Input<string>? RouteDest { get; set; }

        /// <summary>
        /// (Available in 1.161.0+) The type of the vpn route entry.
        /// </summary>
        [Input("routeEntryType")]
        public Input<string>? RouteEntryType { get; set; }

        /// <summary>
        /// (Available in 1.161.0+) The status of the vpn route entry.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The id of the vpn gateway.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        /// <summary>
        /// The value should be 0 or 100.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public RouteEntryState()
        {
        }
        public static new RouteEntryState Empty => new RouteEntryState();
    }
}
