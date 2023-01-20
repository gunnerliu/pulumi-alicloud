// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target network segment of the local VPC.
        /// </summary>
        [Input("localDestinationCidr", required: true)]
        public Input<string> LocalDestinationCidr { get; set; } = null!;

        /// <summary>
        /// The ID of the next-hop instance in the local VPC.
        /// </summary>
        [Input("localNextHopInstanceId", required: true)]
        public Input<string> LocalNextHopInstanceId { get; set; } = null!;

        public FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs()
        {
        }
        public static new FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs Empty => new FirewallVpcFirewallLocalVpcLocalVpcCidrTableListLocalRouteEntryListArgs();
    }
}
