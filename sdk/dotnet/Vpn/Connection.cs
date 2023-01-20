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
    ///     var fooGateway = new AliCloud.Vpn.Gateway("fooGateway", new()
    ///     {
    ///         VpcId = "vpc-fake-id",
    ///         Bandwidth = 10,
    ///         EnableSsl = true,
    ///         InstanceChargeType = "PostPaid",
    ///         Description = "test_create_description",
    ///     });
    /// 
    ///     var fooCustomerGateway = new AliCloud.Vpn.CustomerGateway("fooCustomerGateway", new()
    ///     {
    ///         IpAddress = "42.104.22.228",
    ///         Description = "testAccVpnCgwDesc",
    ///     });
    /// 
    ///     var fooConnection = new AliCloud.Vpn.Connection("fooConnection", new()
    ///     {
    ///         VpnGatewayId = fooGateway.Id,
    ///         CustomerGatewayId = fooCustomerGateway.Id,
    ///         LocalSubnets = new[]
    ///         {
    ///             "172.16.0.0/24",
    ///             "172.16.1.0/24",
    ///         },
    ///         RemoteSubnets = new[]
    ///         {
    ///             "10.0.0.0/24",
    ///             "10.0.1.0/24",
    ///         },
    ///         EffectImmediately = true,
    ///         IkeConfig = new AliCloud.Vpn.Inputs.ConnectionIkeConfigArgs
    ///         {
    ///             IkeAuthAlg = "md5",
    ///             IkeEncAlg = "des",
    ///             IkeVersion = "ikev1",
    ///             IkeMode = "main",
    ///             IkeLifetime = 86400,
    ///             Psk = "tf-testvpn2",
    ///             IkePfs = "group1",
    ///             IkeRemoteId = "testbob2",
    ///             IkeLocalId = "testalice2",
    ///         },
    ///         IpsecConfig = new AliCloud.Vpn.Inputs.ConnectionIpsecConfigArgs
    ///         {
    ///             IpsecPfs = "group5",
    ///             IpsecEncAlg = "des",
    ///             IpsecAuthAlg = "md5",
    ///             IpsecLifetime = 8640,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// VPN connection can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpn/connection:Connection example vco-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpn/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The configurations of the BGP routing protocol. See the following `Block bgp_config`.
        /// </summary>
        [Output("bgpConfig")]
        public Output<Outputs.ConnectionBgpConfig> BgpConfig { get; private set; } = null!;

        /// <summary>
        /// The ID of the customer gateway.
        /// </summary>
        [Output("customerGatewayId")]
        public Output<string> CustomerGatewayId { get; private set; } = null!;

        /// <summary>
        /// Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
        /// </summary>
        [Output("effectImmediately")]
        public Output<bool?> EffectImmediately { get; private set; } = null!;

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Output("enableDpd")]
        public Output<bool> EnableDpd { get; private set; } = null!;

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Output("enableNatTraversal")]
        public Output<bool> EnableNatTraversal { get; private set; } = null!;

        /// <summary>
        /// The health check configurations. See the following `Block health_check_config`.
        /// </summary>
        [Output("healthCheckConfig")]
        public Output<Outputs.ConnectionHealthCheckConfig> HealthCheckConfig { get; private set; } = null!;

        /// <summary>
        /// The configurations of phase-one negotiation. See the following `Block ike_config`.
        /// </summary>
        [Output("ikeConfig")]
        public Output<Outputs.ConnectionIkeConfig> IkeConfig { get; private set; } = null!;

        /// <summary>
        /// The configurations of phase-two negotiation. See the following `Block ipsec_config`.
        /// </summary>
        [Output("ipsecConfig")]
        public Output<Outputs.ConnectionIpsecConfig> IpsecConfig { get; private set; } = null!;

        /// <summary>
        /// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        [Output("localSubnets")]
        public Output<ImmutableArray<string>> LocalSubnets { get; private set; } = null!;

        /// <summary>
        /// The name of the IPsec connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        [Output("remoteSubnets")]
        public Output<ImmutableArray<string>> RemoteSubnets { get; private set; } = null!;

        /// <summary>
        /// The status of VPN connection.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPN gateway.
        /// </summary>
        [Output("vpnGatewayId")]
        public Output<string> VpnGatewayId { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpn/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpn/connection:Connection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configurations of the BGP routing protocol. See the following `Block bgp_config`.
        /// </summary>
        [Input("bgpConfig")]
        public Input<Inputs.ConnectionBgpConfigArgs>? BgpConfig { get; set; }

        /// <summary>
        /// The ID of the customer gateway.
        /// </summary>
        [Input("customerGatewayId", required: true)]
        public Input<string> CustomerGatewayId { get; set; } = null!;

        /// <summary>
        /// Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
        /// </summary>
        [Input("effectImmediately")]
        public Input<bool>? EffectImmediately { get; set; }

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Input("enableDpd")]
        public Input<bool>? EnableDpd { get; set; }

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Input("enableNatTraversal")]
        public Input<bool>? EnableNatTraversal { get; set; }

        /// <summary>
        /// The health check configurations. See the following `Block health_check_config`.
        /// </summary>
        [Input("healthCheckConfig")]
        public Input<Inputs.ConnectionHealthCheckConfigArgs>? HealthCheckConfig { get; set; }

        /// <summary>
        /// The configurations of phase-one negotiation. See the following `Block ike_config`.
        /// </summary>
        [Input("ikeConfig")]
        public Input<Inputs.ConnectionIkeConfigArgs>? IkeConfig { get; set; }

        /// <summary>
        /// The configurations of phase-two negotiation. See the following `Block ipsec_config`.
        /// </summary>
        [Input("ipsecConfig")]
        public Input<Inputs.ConnectionIpsecConfigArgs>? IpsecConfig { get; set; }

        [Input("localSubnets", required: true)]
        private InputList<string>? _localSubnets;

        /// <summary>
        /// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        public InputList<string> LocalSubnets
        {
            get => _localSubnets ?? (_localSubnets = new InputList<string>());
            set => _localSubnets = value;
        }

        /// <summary>
        /// The name of the IPsec connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("remoteSubnets", required: true)]
        private InputList<string>? _remoteSubnets;

        /// <summary>
        /// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        public InputList<string> RemoteSubnets
        {
            get => _remoteSubnets ?? (_remoteSubnets = new InputList<string>());
            set => _remoteSubnets = value;
        }

        /// <summary>
        /// The ID of the VPN gateway.
        /// </summary>
        [Input("vpnGatewayId", required: true)]
        public Input<string> VpnGatewayId { get; set; } = null!;

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configurations of the BGP routing protocol. See the following `Block bgp_config`.
        /// </summary>
        [Input("bgpConfig")]
        public Input<Inputs.ConnectionBgpConfigGetArgs>? BgpConfig { get; set; }

        /// <summary>
        /// The ID of the customer gateway.
        /// </summary>
        [Input("customerGatewayId")]
        public Input<string>? CustomerGatewayId { get; set; }

        /// <summary>
        /// Whether to delete a successfully negotiated IPsec tunnel and initiate a negotiation again. Valid value:true,false.
        /// </summary>
        [Input("effectImmediately")]
        public Input<bool>? EffectImmediately { get; set; }

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Input("enableDpd")]
        public Input<bool>? EnableDpd { get; set; }

        /// <summary>
        /// Whether to enable NAT traversal.
        /// </summary>
        [Input("enableNatTraversal")]
        public Input<bool>? EnableNatTraversal { get; set; }

        /// <summary>
        /// The health check configurations. See the following `Block health_check_config`.
        /// </summary>
        [Input("healthCheckConfig")]
        public Input<Inputs.ConnectionHealthCheckConfigGetArgs>? HealthCheckConfig { get; set; }

        /// <summary>
        /// The configurations of phase-one negotiation. See the following `Block ike_config`.
        /// </summary>
        [Input("ikeConfig")]
        public Input<Inputs.ConnectionIkeConfigGetArgs>? IkeConfig { get; set; }

        /// <summary>
        /// The configurations of phase-two negotiation. See the following `Block ipsec_config`.
        /// </summary>
        [Input("ipsecConfig")]
        public Input<Inputs.ConnectionIpsecConfigGetArgs>? IpsecConfig { get; set; }

        [Input("localSubnets")]
        private InputList<string>? _localSubnets;

        /// <summary>
        /// The CIDR block of the VPC to be connected with the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        public InputList<string> LocalSubnets
        {
            get => _localSubnets ?? (_localSubnets = new InputList<string>());
            set => _localSubnets = value;
        }

        /// <summary>
        /// The name of the IPsec connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("remoteSubnets")]
        private InputList<string>? _remoteSubnets;

        /// <summary>
        /// The CIDR block of the local data center. This parameter is used for phase-two negotiation.
        /// </summary>
        public InputList<string> RemoteSubnets
        {
            get => _remoteSubnets ?? (_remoteSubnets = new InputList<string>());
            set => _remoteSubnets = value;
        }

        /// <summary>
        /// The status of VPN connection.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VPN gateway.
        /// </summary>
        [Input("vpnGatewayId")]
        public Input<string>? VpnGatewayId { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
