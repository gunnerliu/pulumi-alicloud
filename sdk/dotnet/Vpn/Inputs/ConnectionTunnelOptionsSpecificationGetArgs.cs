// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Inputs
{

    public sealed class ConnectionTunnelOptionsSpecificationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the customer gateway in Tunnel.
        /// </summary>
        [Input("customerGatewayId")]
        public Input<string>? CustomerGatewayId { get; set; }

        /// <summary>
        /// Wether enable Dpd detection.
        /// </summary>
        [Input("enableDpd")]
        public Input<bool>? EnableDpd { get; set; }

        /// <summary>
        /// enable nat traversal.
        /// </summary>
        [Input("enableNatTraversal")]
        public Input<bool>? EnableNatTraversal { get; set; }

        /// <summary>
        /// The local internet IP in Tunnel.
        /// </summary>
        [Input("internetIp")]
        public Input<string>? InternetIp { get; set; }

        /// <summary>
        /// The role of Tunnel.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The state of Tunnel.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The negotiation status of Tunnel.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The bgp config of Tunnel. See `tunnel_bgp_config` below.
        /// </summary>
        [Input("tunnelBgpConfig")]
        public Input<Inputs.ConnectionTunnelOptionsSpecificationTunnelBgpConfigGetArgs>? TunnelBgpConfig { get; set; }

        /// <summary>
        /// The tunnel ID of IPsec-VPN connection.
        /// </summary>
        [Input("tunnelId")]
        public Input<string>? TunnelId { get; set; }

        /// <summary>
        /// The configuration of Phase 1 negotiations in Tunnel. See `tunnel_ike_config` below.
        /// </summary>
        [Input("tunnelIkeConfig")]
        public Input<Inputs.ConnectionTunnelOptionsSpecificationTunnelIkeConfigGetArgs>? TunnelIkeConfig { get; set; }

        /// <summary>
        /// IPsec configuration in Tunnel. See `tunnel_ipsec_config` below.
        /// </summary>
        [Input("tunnelIpsecConfig")]
        public Input<Inputs.ConnectionTunnelOptionsSpecificationTunnelIpsecConfigGetArgs>? TunnelIpsecConfig { get; set; }

        /// <summary>
        /// The zoneNo of tunnel.
        /// </summary>
        [Input("zoneNo")]
        public Input<string>? ZoneNo { get; set; }

        public ConnectionTunnelOptionsSpecificationGetArgs()
        {
        }
        public static new ConnectionTunnelOptionsSpecificationGetArgs Empty => new ConnectionTunnelOptionsSpecificationGetArgs();
    }
}
