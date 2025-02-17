// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    /// <summary>
    /// Provides a Vpc Peer Connection Accepter resource.
    /// 
    /// For information about Vpc Peer Connection Accepter and how to use it, see [What is Peer Connection Accepter](https://www.alibabacloud.com/help/en/virtual-private-cloud/latest/AcceptVpcPeerConnection).
    /// 
    /// &gt; **NOTE:** Available since v1.196.0.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var acceptingRegion = config.Get("acceptingRegion") ?? "cn-beijing";
    ///     var acceptUid = config.Get("acceptUid") ?? "xxxx";
    ///     // Method 1: Use assume_role to operate resources in the target account, detail see https://registry.terraform.io/providers/aliyun/alicloud/latest/docs#assume-role
    ///     var accepting = new AliCloud.Provider("accepting", new()
    ///     {
    ///         Region = acceptingRegion,
    ///         AssumeRole = new AliCloud.Inputs.ProviderAssumeRoleArgs
    ///         {
    ///             RoleArn = $"acs:ram::{acceptUid}:role/terraform-example-assume-role",
    ///         },
    ///     });
    /// 
    ///     // Method 2: Use the target account's access_key, secret_key
    ///     // provider "alicloud" {
    ///     //   region     = "cn-hangzhou"
    ///     //   access_key = "access_key"
    ///     //   secret_key = "secret_key"
    ///     //   alias      = "accepting"
    ///     // }
    ///     var local = new AliCloud.Provider("local", new()
    ///     {
    ///         Region = "cn-hangzhou",
    ///     });
    /// 
    ///     var localNetwork = new AliCloud.Vpc.Network("localNetwork", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "10.4.0.0/16",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = alicloud.Local,
    ///     });
    /// 
    ///     var acceptingNetwork = new AliCloud.Vpc.Network("acceptingNetwork", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "192.168.0.0/16",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = alicloud.Accepting,
    ///     });
    /// 
    ///     var acceptingAccount = AliCloud.GetAccount.Invoke();
    /// 
    ///     var defaultPeerConnection = new AliCloud.Vpc.PeerConnection("defaultPeerConnection", new()
    ///     {
    ///         PeerConnectionName = name,
    ///         VpcId = localNetwork.Id,
    ///         AcceptingAliUid = acceptingAccount.Apply(getAccountResult =&gt; getAccountResult.Id),
    ///         AcceptingRegionId = acceptingRegion,
    ///         AcceptingVpcId = acceptingNetwork.Id,
    ///         Description = name,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = alicloud.Local,
    ///     });
    /// 
    ///     var defaultPeerConnectionAccepter = new AliCloud.Vpc.PeerConnectionAccepter("defaultPeerConnectionAccepter", new()
    ///     {
    ///         InstanceId = defaultPeerConnection.Id,
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = alicloud.Accepting,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Vpc Peer Connection Accepter can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter")]
    public partial class PeerConnectionAccepter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
        /// </summary>
        [Output("acceptingOwnerUid")]
        public Output<int> AcceptingOwnerUid { get; private set; } = null!;

        /// <summary>
        /// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
        /// </summary>
        [Output("acceptingRegionId")]
        public Output<string> AcceptingRegionId { get; private set; } = null!;

        /// <summary>
        /// The VPC ID of the receiving end of the VPC peer connection.
        /// </summary>
        [Output("acceptingVpcId")]
        public Output<string> AcceptingVpcId { get; private set; } = null!;

        /// <summary>
        /// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance of the created VPC peer connection.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Output("peerConnectionAccepterName")]
        public Output<string> PeerConnectionAccepterName { get; private set; } = null!;

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// You must create a VPC ID on the initiator of a VPC peer connection.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a PeerConnectionAccepter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PeerConnectionAccepter(string name, PeerConnectionAccepterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, args ?? new PeerConnectionAccepterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PeerConnectionAccepter(string name, Input<string> id, PeerConnectionAccepterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/peerConnectionAccepter:PeerConnectionAccepter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PeerConnectionAccepter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PeerConnectionAccepter Get(string name, Input<string> id, PeerConnectionAccepterState? state = null, CustomResourceOptions? options = null)
        {
            return new PeerConnectionAccepter(name, id, state, options);
        }
    }

    public sealed class PeerConnectionAccepterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the instance of the created VPC peer connection.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        public PeerConnectionAccepterArgs()
        {
        }
        public static new PeerConnectionAccepterArgs Empty => new PeerConnectionAccepterArgs();
    }

    public sealed class PeerConnectionAccepterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
        /// </summary>
        [Input("acceptingOwnerUid")]
        public Input<int>? AcceptingOwnerUid { get; set; }

        /// <summary>
        /// The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
        /// </summary>
        [Input("acceptingRegionId")]
        public Input<string>? AcceptingRegionId { get; set; }

        /// <summary>
        /// The VPC ID of the receiving end of the VPC peer connection.
        /// </summary>
        [Input("acceptingVpcId")]
        public Input<string>? AcceptingVpcId { get; set; }

        /// <summary>
        /// The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The ID of the instance of the created VPC peer connection.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The name of the resource
        /// </summary>
        [Input("peerConnectionAccepterName")]
        public Input<string>? PeerConnectionAccepterName { get; set; }

        /// <summary>
        /// The status of the resource
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// You must create a VPC ID on the initiator of a VPC peer connection.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public PeerConnectionAccepterState()
        {
        }
        public static new PeerConnectionAccepterState Empty => new PeerConnectionAccepterState();
    }
}
