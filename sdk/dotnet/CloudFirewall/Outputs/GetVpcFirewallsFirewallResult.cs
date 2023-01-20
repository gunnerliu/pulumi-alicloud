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
    public sealed class GetVpcFirewallsFirewallResult
    {
        /// <summary>
        /// Bandwidth specifications for high-speed channels. Unit: Mbps.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// The communication type of the VPC firewall. Valid value: **expressconnect**, which indicates Express Connect.
        /// </summary>
        public readonly string ConnectType;
        /// <summary>
        /// The name of the VPC firewall instance and the value same as `vpc_firewall_id`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The details of the local VPC.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcFirewallsFirewallLocalVpcResult> LocalVpcs;
        /// <summary>
        /// The details of the peer VPC.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcFirewallsFirewallPeerVpcResult> PeerVpcs;
        /// <summary>
        /// The region is open. Value:-**enable**: is enabled, indicating that VPC firewall can be configured in this region.-**disable**: indicates that VPC firewall cannot be configured in this region.
        /// </summary>
        public readonly string RegionStatus;
        /// <summary>
        /// The status of the resource
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The ID of the VPC firewall instance.
        /// </summary>
        public readonly string VpcFirewallId;
        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        public readonly string VpcFirewallName;

        [OutputConstructor]
        private GetVpcFirewallsFirewallResult(
            int bandwidth,

            string connectType,

            string id,

            ImmutableArray<Outputs.GetVpcFirewallsFirewallLocalVpcResult> localVpcs,

            ImmutableArray<Outputs.GetVpcFirewallsFirewallPeerVpcResult> peerVpcs,

            string regionStatus,

            string status,

            string vpcFirewallId,

            string vpcFirewallName)
        {
            Bandwidth = bandwidth;
            ConnectType = connectType;
            Id = id;
            LocalVpcs = localVpcs;
            PeerVpcs = peerVpcs;
            RegionStatus = regionStatus;
            Status = status;
            VpcFirewallId = vpcFirewallId;
            VpcFirewallName = vpcFirewallName;
        }
    }
}
