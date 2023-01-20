// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudFirewall
{
    /// <summary>
    /// Provides a Cloud Firewall Vpc Firewall resource.
    /// 
    /// For information about Cloud Firewall Vpc Firewall and how to use it, see [What is Vpc Firewall](https://help.aliyun.com/document_detail/342893.html).
    /// 
    /// &gt; **NOTE:** Available in v1.194.0+.
    /// 
    /// ## Import
    /// 
    /// Cloud Firewall Vpc Firewall can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall")]
    public partial class FirewallVpcFirewall : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Bandwidth specifications for high-speed channels. Unit: Mbps.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The communication type of the VPC firewall. Valid value: **expressconnect**, which indicates Express Connect.
        /// </summary>
        [Output("connectType")]
        public Output<string> ConnectType { get; private set; } = null!;

        /// <summary>
        /// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
        /// </summary>
        [Output("lang")]
        public Output<string> Lang { get; private set; } = null!;

        /// <summary>
        /// The details of the local VPC. See the following `Block LocalVpc`.
        /// </summary>
        [Output("localVpc")]
        public Output<Outputs.FirewallVpcFirewallLocalVpc> LocalVpc { get; private set; } = null!;

        /// <summary>
        /// The UID of the Alibaba Cloud member account.
        /// </summary>
        [Output("memberUid")]
        public Output<string?> MemberUid { get; private set; } = null!;

        /// <summary>
        /// The details of the peer VPC. See the following `Block PeerVpc`.
        /// </summary>
        [Output("peerVpc")]
        public Output<Outputs.FirewallVpcFirewallPeerVpc> PeerVpc { get; private set; } = null!;

        /// <summary>
        /// The region is open. Value:-**enable**: is enabled, indicating that VPC firewall can be configured in this region.-**disable**: indicates that VPC firewall cannot be configured in this region.
        /// </summary>
        [Output("regionStatus")]
        public Output<string> RegionStatus { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC firewall instance.
        /// </summary>
        [Output("vpcFirewallId")]
        public Output<string> VpcFirewallId { get; private set; } = null!;

        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        [Output("vpcFirewallName")]
        public Output<string> VpcFirewallName { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallVpcFirewall resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallVpcFirewall(string name, FirewallVpcFirewallArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall", name, args ?? new FirewallVpcFirewallArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallVpcFirewall(string name, Input<string> id, FirewallVpcFirewallState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudfirewall/firewallVpcFirewall:FirewallVpcFirewall", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallVpcFirewall resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallVpcFirewall Get(string name, Input<string> id, FirewallVpcFirewallState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallVpcFirewall(name, id, state, options);
        }
    }

    public sealed class FirewallVpcFirewallArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The details of the local VPC. See the following `Block LocalVpc`.
        /// </summary>
        [Input("localVpc", required: true)]
        public Input<Inputs.FirewallVpcFirewallLocalVpcArgs> LocalVpc { get; set; } = null!;

        /// <summary>
        /// The UID of the Alibaba Cloud member account.
        /// </summary>
        [Input("memberUid")]
        public Input<string>? MemberUid { get; set; }

        /// <summary>
        /// The details of the peer VPC. See the following `Block PeerVpc`.
        /// </summary>
        [Input("peerVpc", required: true)]
        public Input<Inputs.FirewallVpcFirewallPeerVpcArgs> PeerVpc { get; set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        [Input("vpcFirewallName", required: true)]
        public Input<string> VpcFirewallName { get; set; } = null!;

        public FirewallVpcFirewallArgs()
        {
        }
        public static new FirewallVpcFirewallArgs Empty => new FirewallVpcFirewallArgs();
    }

    public sealed class FirewallVpcFirewallState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Bandwidth specifications for high-speed channels. Unit: Mbps.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The communication type of the VPC firewall. Valid value: **expressconnect**, which indicates Express Connect.
        /// </summary>
        [Input("connectType")]
        public Input<string>? ConnectType { get; set; }

        /// <summary>
        /// The language type of the requested and received messages. Value:**zh** (default): Chinese.**en**: English.
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The details of the local VPC. See the following `Block LocalVpc`.
        /// </summary>
        [Input("localVpc")]
        public Input<Inputs.FirewallVpcFirewallLocalVpcGetArgs>? LocalVpc { get; set; }

        /// <summary>
        /// The UID of the Alibaba Cloud member account.
        /// </summary>
        [Input("memberUid")]
        public Input<string>? MemberUid { get; set; }

        /// <summary>
        /// The details of the peer VPC. See the following `Block PeerVpc`.
        /// </summary>
        [Input("peerVpc")]
        public Input<Inputs.FirewallVpcFirewallPeerVpcGetArgs>? PeerVpc { get; set; }

        /// <summary>
        /// The region is open. Value:-**enable**: is enabled, indicating that VPC firewall can be configured in this region.-**disable**: indicates that VPC firewall cannot be configured in this region.
        /// </summary>
        [Input("regionStatus")]
        public Input<string>? RegionStatus { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the VPC firewall instance.
        /// </summary>
        [Input("vpcFirewallId")]
        public Input<string>? VpcFirewallId { get; set; }

        /// <summary>
        /// The name of the VPC firewall instance.
        /// </summary>
        [Input("vpcFirewallName")]
        public Input<string>? VpcFirewallName { get; set; }

        public FirewallVpcFirewallState()
        {
        }
        public static new FirewallVpcFirewallState Empty => new FirewallVpcFirewallState();
    }
}
