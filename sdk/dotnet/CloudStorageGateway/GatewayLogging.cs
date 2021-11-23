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
    /// Provides a Cloud Storage Gateway Gateway Logging resource.
    /// 
    /// For information about Cloud Storage Gateway Gateway Logging and how to use it, see [What is Gateway Logging](https://www.alibabacloud.com/help/en/doc-detail/108299.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.144.0+.
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
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "example";
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             VpcName = name,
    ///             CidrBlock = "172.16.0.0/12",
    ///         });
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableResourceCreation = "VSwitch",
    ///         }));
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/21",
    ///             ZoneId = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
    ///             VswitchName = name,
    ///         });
    ///         var defaultStorageBundle = new AliCloud.CloudStorageGateway.StorageBundle("defaultStorageBundle", new AliCloud.CloudStorageGateway.StorageBundleArgs
    ///         {
    ///             StorageBundleName = name,
    ///         });
    ///         var defaultGateway = new AliCloud.CloudStorageGateway.Gateway("defaultGateway", new AliCloud.CloudStorageGateway.GatewayArgs
    ///         {
    ///             Description = "tf-acctestDesalone",
    ///             GatewayClass = "Basic",
    ///             Type = "File",
    ///             PaymentType = "PayAsYouGo",
    ///             VswitchId = defaultSwitch.Id,
    ///             ReleaseAfterExpiration = true,
    ///             PublicNetworkBandwidth = 10,
    ///             StorageBundleId = defaultStorageBundle.Id,
    ///             Location = "Cloud",
    ///             GatewayName = name,
    ///         });
    ///         var defaultProject = new AliCloud.Log.Project("defaultProject", new AliCloud.Log.ProjectArgs
    ///         {
    ///             Description = "created by terraform",
    ///         });
    ///         var defaultStore = new AliCloud.Log.Store("defaultStore", new AliCloud.Log.StoreArgs
    ///         {
    ///             Project = defaultProject.Name,
    ///             ShardCount = 3,
    ///             AutoSplit = true,
    ///             MaxSplitShardCount = 60,
    ///             AppendMeta = true,
    ///         });
    ///         var defaultGatewayLogging = new AliCloud.CloudStorageGateway.GatewayLogging("defaultGatewayLogging", new AliCloud.CloudStorageGateway.GatewayLoggingArgs
    ///         {
    ///             GatewayId = defaultGateway.Id,
    ///             SlsLogstore = defaultStore.Name,
    ///             SlsProject = defaultProject.Name,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Storage Gateway Gateway Logging can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging example &lt;gateway_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging")]
    public partial class GatewayLogging : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Gateway.
        /// </summary>
        [Output("gatewayId")]
        public Output<string> GatewayId { get; private set; } = null!;

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Output("slsLogstore")]
        public Output<string> SlsLogstore { get; private set; } = null!;

        /// <summary>
        /// The name of the Project.
        /// </summary>
        [Output("slsProject")]
        public Output<string> SlsProject { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disable`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a GatewayLogging resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GatewayLogging(string name, GatewayLoggingArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, args ?? new GatewayLoggingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GatewayLogging(string name, Input<string> id, GatewayLoggingState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cloudstoragegateway/gatewayLogging:GatewayLogging", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GatewayLogging resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GatewayLogging Get(string name, Input<string> id, GatewayLoggingState? state = null, CustomResourceOptions? options = null)
        {
            return new GatewayLogging(name, id, state, options);
        }
    }

    public sealed class GatewayLoggingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Gateway.
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Input("slsLogstore", required: true)]
        public Input<string> SlsLogstore { get; set; } = null!;

        /// <summary>
        /// The name of the Project.
        /// </summary>
        [Input("slsProject", required: true)]
        public Input<string> SlsProject { get; set; } = null!;

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disable`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GatewayLoggingArgs()
        {
        }
    }

    public sealed class GatewayLoggingState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Gateway.
        /// </summary>
        [Input("gatewayId")]
        public Input<string>? GatewayId { get; set; }

        /// <summary>
        /// The name of the Log Store.
        /// </summary>
        [Input("slsLogstore")]
        public Input<string>? SlsLogstore { get; set; }

        /// <summary>
        /// The name of the Project.
        /// </summary>
        [Input("slsProject")]
        public Input<string>? SlsProject { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Enabled`, `Disable`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GatewayLoggingState()
        {
        }
    }
}
