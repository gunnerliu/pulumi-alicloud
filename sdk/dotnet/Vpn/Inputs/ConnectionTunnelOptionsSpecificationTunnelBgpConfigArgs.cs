// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpn.Inputs
{

    public sealed class ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether BGP function is turned on.
        /// </summary>
        [Input("bgpStatus")]
        public Input<string>? BgpStatus { get; set; }

        /// <summary>
        /// Local asn.
        /// </summary>
        [Input("localAsn")]
        public Input<string>? LocalAsn { get; set; }

        /// <summary>
        /// Local bgp IP.
        /// </summary>
        [Input("localBgpIp")]
        public Input<string>? LocalBgpIp { get; set; }

        /// <summary>
        /// Peer asn.
        /// </summary>
        [Input("peerAsn")]
        public Input<string>? PeerAsn { get; set; }

        /// <summary>
        /// Peer bgp ip.
        /// </summary>
        [Input("peerBgpIp")]
        public Input<string>? PeerBgpIp { get; set; }

        /// <summary>
        /// IPSec tunnel Cidr.
        /// </summary>
        [Input("tunnelCidr")]
        public Input<string>? TunnelCidr { get; set; }

        public ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs()
        {
        }
        public static new ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs Empty => new ConnectionTunnelOptionsSpecificationTunnelBgpConfigArgs();
    }
}