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
    /// Provides a VPC router interface connection resource to connect two router interfaces which are in two different VPCs.
    /// After that, all of the two router interfaces will be active.
    /// 
    /// &gt; **DEPRECATED:**  This resource  has been deprecated from version `1.199.0`. Please use new resource alicloud_express_connect_router_interface.
    /// 
    /// &gt; **NOTE:** At present, Router interface does not support changing opposite router interface, the connection delete action is only deactivating it to inactive, not modifying the connection to empty.
    /// 
    /// &gt; **NOTE:** If you want to changing opposite router interface, you can delete router interface and re-build them.
    /// 
    /// &gt; **NOTE:** A integrated router interface connection tunnel requires both InitiatingSide and AcceptingSide configuring opposite router interface.
    /// 
    /// &gt; **NOTE:** Please remember to add a `depends_on` clause in the router interface connection from the InitiatingSide to the AcceptingSide, because the connection from the AcceptingSide to the InitiatingSide must be done first.
    /// 
    /// ## Import
    /// 
    /// The router interface connection can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection foo ri-abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection")]
    public partial class RouterInterfaceConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// One side router interface ID.
        /// </summary>
        [Output("interfaceId")]
        public Output<string> InterfaceId { get; private set; } = null!;

        /// <summary>
        /// Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
        /// </summary>
        [Output("oppositeInterfaceId")]
        public Output<string> OppositeInterfaceId { get; private set; } = null!;

        /// <summary>
        /// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info &gt; Account Management to check the account ID. Default to Provider account_id.
        /// </summary>
        [Output("oppositeInterfaceOwnerId")]
        public Output<string> OppositeInterfaceOwnerId { get; private set; } = null!;

        /// <summary>
        /// Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
        /// </summary>
        [Output("oppositeRouterId")]
        public Output<string> OppositeRouterId { get; private set; } = null!;

        /// <summary>
        /// Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
        /// 
        /// &gt; **NOTE:** The value of "opposite_interface_owner_id" or "account_id" must be main account and not be sub account.
        /// </summary>
        [Output("oppositeRouterType")]
        public Output<string?> OppositeRouterType { get; private set; } = null!;


        /// <summary>
        /// Create a RouterInterfaceConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouterInterfaceConnection(string name, RouterInterfaceConnectionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, args ?? new RouterInterfaceConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouterInterfaceConnection(string name, Input<string> id, RouterInterfaceConnectionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:vpc/routerInterfaceConnection:RouterInterfaceConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouterInterfaceConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouterInterfaceConnection Get(string name, Input<string> id, RouterInterfaceConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new RouterInterfaceConnection(name, id, state, options);
        }
    }

    public sealed class RouterInterfaceConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One side router interface ID.
        /// </summary>
        [Input("interfaceId", required: true)]
        public Input<string> InterfaceId { get; set; } = null!;

        /// <summary>
        /// Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
        /// </summary>
        [Input("oppositeInterfaceId", required: true)]
        public Input<string> OppositeInterfaceId { get; set; } = null!;

        /// <summary>
        /// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info &gt; Account Management to check the account ID. Default to Provider account_id.
        /// </summary>
        [Input("oppositeInterfaceOwnerId")]
        public Input<string>? OppositeInterfaceOwnerId { get; set; }

        /// <summary>
        /// Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
        /// </summary>
        [Input("oppositeRouterId")]
        public Input<string>? OppositeRouterId { get; set; }

        /// <summary>
        /// Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
        /// 
        /// &gt; **NOTE:** The value of "opposite_interface_owner_id" or "account_id" must be main account and not be sub account.
        /// </summary>
        [Input("oppositeRouterType")]
        public Input<string>? OppositeRouterType { get; set; }

        public RouterInterfaceConnectionArgs()
        {
        }
        public static new RouterInterfaceConnectionArgs Empty => new RouterInterfaceConnectionArgs();
    }

    public sealed class RouterInterfaceConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// One side router interface ID.
        /// </summary>
        [Input("interfaceId")]
        public Input<string>? InterfaceId { get; set; }

        /// <summary>
        /// Another side router interface ID. It must belong the specified "opposite_interface_owner_id" account.
        /// </summary>
        [Input("oppositeInterfaceId")]
        public Input<string>? OppositeInterfaceId { get; set; }

        /// <summary>
        /// Another side router interface account ID. Log on to the Alibaba Cloud console, select User Info &gt; Account Management to check the account ID. Default to Provider account_id.
        /// </summary>
        [Input("oppositeInterfaceOwnerId")]
        public Input<string>? OppositeInterfaceOwnerId { get; set; }

        /// <summary>
        /// Another side router ID. It must belong the specified "opposite_interface_owner_id" account. It is valid when field "opposite_interface_owner_id" is specified.
        /// </summary>
        [Input("oppositeRouterId")]
        public Input<string>? OppositeRouterId { get; set; }

        /// <summary>
        /// Another side router Type. Optional value: VRouter, VBR. It is valid when field "opposite_interface_owner_id" is specified.
        /// 
        /// &gt; **NOTE:** The value of "opposite_interface_owner_id" or "account_id" must be main account and not be sub account.
        /// </summary>
        [Input("oppositeRouterType")]
        public Input<string>? OppositeRouterType { get; set; }

        public RouterInterfaceConnectionState()
        {
        }
        public static new RouterInterfaceConnectionState Empty => new RouterInterfaceConnectionState();
    }
}
