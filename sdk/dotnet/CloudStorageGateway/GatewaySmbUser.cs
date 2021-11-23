// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudStorageGateway
{
    /// <summary>
    /// Provides a Cloud Storage Gateway Gateway SMB User resource.
    /// 
    /// For information about Cloud Storage Gateway Gateway SMB User and how to use it, see [What is Gateway SMB User](https://www.alibabacloud.com/help/en/doc-detail/53972.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.142.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var defaultNetworks = Output.Create(AliCloud.Vpc.GetNetworks.InvokeAsync(new AliCloud.Vpc.GetNetworksArgs
    ///         {
    ///             NameRegex = "default-NODELETING",
    ///         }));
    ///         var defaultSwitches = defaultNetworks.Apply(defaultNetworks =&gt; Output.Create(AliCloud.Vpc.GetSwitches.InvokeAsync(new AliCloud.Vpc.GetSwitchesArgs
    ///         {
    ///             VpcId = defaultNetworks.Ids?[0],
    ///         })));
    ///         var example = new AliCloud.CloudStorageGateway.StorageBundle("example", new AliCloud.CloudStorageGateway.StorageBundleArgs
    ///         {
    ///             StorageBundleName = "example_value",
    ///         });
    ///         var defaultGateway = new AliCloud.CloudStorageGateway.Gateway("defaultGateway", new AliCloud.CloudStorageGateway.GatewayArgs
    ///         {
    ///             Description = "tf-acctestDesalone",
    ///             GatewayClass = "Standard",
    ///             Type = "File",
    ///             PaymentType = "PayAsYouGo",
    ///             VswitchId = defaultSwitches.Apply(defaultSwitches =&gt; defaultSwitches.Ids?[0]),
    ///             ReleaseAfterExpiration = false,
    ///             PublicNetworkBandwidth = 40,
    ///             StorageBundleId = example.Id,
    ///             Location = "Cloud",
    ///             GatewayName = "example_value",
    ///         });
    ///         var defaultGatewaySmbUser = new AliCloud.CloudStorageGateway.GatewaySmbUser("defaultGatewaySmbUser", new AliCloud.CloudStorageGateway.GatewaySmbUserArgs
    ///         {
    ///             Username = "your_username",
    ///             Password = "password",
    ///             GatewayId = defaultGateway.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Storage Gateway Gateway SMB User can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser example &lt;gateway_id&gt;:&lt;username&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser")]
    public partial class GatewaySmbUser : Pulumi.CustomResource
    {
        /// <summary>
        /// The Gateway ID of the Gateway SMB User.
        /// </summary>
        [Output("gatewayId")]
        public Output<string> GatewayId { get; private set; } = null!;

        /// <summary>
        /// The password of the Gateway SMB User.
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The username of the Gateway SMB User.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a GatewaySmbUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GatewaySmbUser(string name, GatewaySmbUserArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser", name, args ?? new GatewaySmbUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GatewaySmbUser(string name, Input<string> id, GatewaySmbUserState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudstoragegateway/gatewaySmbUser:GatewaySmbUser", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GatewaySmbUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GatewaySmbUser Get(string name, Input<string> id, GatewaySmbUserState? state = null, CustomResourceOptions? options = null)
        {
            return new GatewaySmbUser(name, id, state, options);
        }
    }

    public sealed class GatewaySmbUserArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Gateway ID of the Gateway SMB User.
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        /// <summary>
        /// The password of the Gateway SMB User.
        /// </summary>
        [Input("password", required: true)]
        public Input<string> Password { get; set; } = null!;

        /// <summary>
        /// The username of the Gateway SMB User.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GatewaySmbUserArgs()
        {
        }
    }

    public sealed class GatewaySmbUserState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Gateway ID of the Gateway SMB User.
        /// </summary>
        [Input("gatewayId")]
        public Input<string>? GatewayId { get; set; }

        /// <summary>
        /// The password of the Gateway SMB User.
        /// </summary>
        [Input("password")]
        public Input<string>? Password { get; set; }

        /// <summary>
        /// The username of the Gateway SMB User.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GatewaySmbUserState()
        {
        }
    }
}
