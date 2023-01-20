// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Outputs
{

    [OutputType]
    public sealed class FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryList
    {
        /// <summary>
        /// The target network segment of the peer VPC.
        /// </summary>
        public readonly string PeerDestinationCidr;
        /// <summary>
        /// The ID of the next-hop instance in the peer VPC.
        /// </summary>
        public readonly string PeerNextHopInstanceId;

        [OutputConstructor]
        private FirewallVpcFirewallPeerVpcPeerVpcCidrTableListPeerRouteEntryList(
            string peerDestinationCidr,

            string peerNextHopInstanceId)
        {
            PeerDestinationCidr = peerDestinationCidr;
            PeerNextHopInstanceId = peerNextHopInstanceId;
        }
    }
}
