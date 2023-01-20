// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall.Inputs
{

    public sealed class FirewallVpcFirewallCenLocalVpcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The connection ID of the network instance.
        /// </summary>
        [Input("attachmentId")]
        public Input<string>? AttachmentId { get; set; }

        /// <summary>
        /// The connection name of the network instance.
        /// </summary>
        [Input("attachmentName")]
        public Input<string>? AttachmentName { get; set; }

        [Input("defendCidrLists")]
        private InputList<string>? _defendCidrLists;

        /// <summary>
        /// The list of network segments protected by the VPC firewall.
        /// </summary>
        public InputList<string> DefendCidrLists
        {
            get => _defendCidrLists ?? (_defendCidrLists = new InputList<string>());
            set => _defendCidrLists = value;
        }

        [Input("eniLists")]
        private InputList<Inputs.FirewallVpcFirewallCenLocalVpcEniListArgs>? _eniLists;

        /// <summary>
        /// List of elastic network cards.
        /// </summary>
        public InputList<Inputs.FirewallVpcFirewallCenLocalVpcEniListArgs> EniLists
        {
            get => _eniLists ?? (_eniLists = new InputList<Inputs.FirewallVpcFirewallCenLocalVpcEniListArgs>());
            set => _eniLists = value;
        }

        [Input("manualVswitchId")]
        public Input<string>? ManualVswitchId { get; set; }

        /// <summary>
        /// The ID of the VPC instance that created the VPC firewall.
        /// </summary>
        [Input("networkInstanceId", required: true)]
        public Input<string> NetworkInstanceId { get; set; } = null!;

        /// <summary>
        /// The name of the network instance.
        /// </summary>
        [Input("networkInstanceName")]
        public Input<string>? NetworkInstanceName { get; set; }

        /// <summary>
        /// The type of the network instance. Value: **VPC * *.
        /// </summary>
        [Input("networkInstanceType")]
        public Input<string>? NetworkInstanceType { get; set; }

        /// <summary>
        /// The UID of the Alibaba Cloud account to which the VPC belongs.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// The region ID of the VPC.
        /// </summary>
        [Input("regionNo")]
        public Input<string>? RegionNo { get; set; }

        /// <summary>
        /// Routing mode,. Value:-auto: indicates automatic mode.-manual: indicates manual mode.
        /// </summary>
        [Input("routeMode")]
        public Input<string>? RouteMode { get; set; }

        /// <summary>
        /// Whether routing mode supports manual mode. Value:-**1**: Supported.-**0**: Not supported.
        /// </summary>
        [Input("supportManualMode")]
        public Input<string>? SupportManualMode { get; set; }

        /// <summary>
        /// The ID of the CEN-TR instance.
        /// </summary>
        [Input("transitRouterId")]
        public Input<string>? TransitRouterId { get; set; }

        /// <summary>
        /// The version of the cloud enterprise network forwarding router (CEN-TR). Value:-**Basic**: Basic Edition.-**Enterprise**: Enterprise Edition.
        /// </summary>
        [Input("transitRouterType")]
        public Input<string>? TransitRouterType { get; set; }

        [Input("vpcCidrTableLists")]
        private InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs>? _vpcCidrTableLists;

        /// <summary>
        /// The VPC network segment list.
        /// </summary>
        public InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs> VpcCidrTableLists
        {
            get => _vpcCidrTableLists ?? (_vpcCidrTableLists = new InputList<Inputs.FirewallVpcFirewallCenLocalVpcVpcCidrTableListArgs>());
            set => _vpcCidrTableLists = value;
        }

        /// <summary>
        /// The ID of the VPC instance.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The instance name of the VPC.
        /// </summary>
        [Input("vpcName")]
        public Input<string>? VpcName { get; set; }

        public FirewallVpcFirewallCenLocalVpcArgs()
        {
        }
        public static new FirewallVpcFirewallCenLocalVpcArgs Empty => new FirewallVpcFirewallCenLocalVpcArgs();
    }
}
