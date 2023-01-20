// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallCenLocalVpcEniListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the instance of the ENI in the VPC.
        /// </summary>
        [Input("eniId")]
        public Input<string>? EniId { get; set; }

        /// <summary>
        /// The private IP address of the ENI in the VPC.
        /// </summary>
        [Input("eniPrivateIpAddress")]
        public Input<string>? EniPrivateIpAddress { get; set; }

        public FirewallVpcFirewallCenLocalVpcEniListArgs()
        {
        }
        public static new FirewallVpcFirewallCenLocalVpcEniListArgs Empty => new FirewallVpcFirewallCenLocalVpcEniListArgs();
    }
}
