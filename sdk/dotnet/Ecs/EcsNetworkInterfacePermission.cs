// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a ECS Network Interface Permission resource.
    /// 
    /// For information about ECS Network Interface Permission and how to use it, see [What is Network Interface Permission](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/elastic-network-interfaces-overview).
    /// 
    /// &gt; **NOTE:** Available in v1.166.0+.
    /// 
    /// ## Import
    /// 
    /// ECS Network Interface Permission can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission")]
    public partial class EcsNetworkInterfacePermission : Pulumi.CustomResource
    {
        /// <summary>
        /// Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// Whether to force deletion of Network Interface Permission. Default value: `true`.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// The ID of the network interface.
        /// </summary>
        [Output("networkInterfaceId")]
        public Output<string> NetworkInterfaceId { get; private set; } = null!;

        /// <summary>
        /// The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
        /// </summary>
        [Output("permission")]
        public Output<string> Permission { get; private set; } = null!;

        /// <summary>
        /// The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a EcsNetworkInterfacePermission resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EcsNetworkInterfacePermission(string name, EcsNetworkInterfacePermissionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission", name, args ?? new EcsNetworkInterfacePermissionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EcsNetworkInterfacePermission(string name, Input<string> id, EcsNetworkInterfacePermissionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/ecsNetworkInterfacePermission:EcsNetworkInterfacePermission", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EcsNetworkInterfacePermission resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EcsNetworkInterfacePermission Get(string name, Input<string> id, EcsNetworkInterfacePermissionState? state = null, CustomResourceOptions? options = null)
        {
            return new EcsNetworkInterfacePermission(name, id, state, options);
        }
    }

    public sealed class EcsNetworkInterfacePermissionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// Whether to force deletion of Network Interface Permission. Default value: `true`.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The ID of the network interface.
        /// </summary>
        [Input("networkInterfaceId", required: true)]
        public Input<string> NetworkInterfaceId { get; set; } = null!;

        /// <summary>
        /// The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        public EcsNetworkInterfacePermissionArgs()
        {
        }
    }

    public sealed class EcsNetworkInterfacePermissionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Alibaba Cloud Partner (Certified ISV) account ID or individual user ID.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Whether to force deletion of Network Interface Permission. Default value: `true`.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// The ID of the network interface.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        /// <summary>
        /// The permissions of the Network Interface. Valid values: `InstanceAttach`. `InstanceAttach`: Allows authorized users to mount your ENI to the other ECS instance. The ECS instance must be in the same zone as the ENI.
        /// </summary>
        [Input("permission")]
        public Input<string>? Permission { get; set; }

        /// <summary>
        /// The Status of the Network Interface Permissions. Valid values: `Pending`, `Granted`, `Revoking`, `Revoked`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public EcsNetworkInterfacePermissionState()
        {
        }
    }
}