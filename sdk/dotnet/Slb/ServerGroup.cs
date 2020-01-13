// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    /// <summary>
    /// A virtual server group contains several ECS instances. The virtual server group can help you to define multiple listening dimension,
    /// and to meet the personalized requirements of domain name and URL forwarding.
    /// 
    /// &gt; **NOTE:** One ECS instance can be added into multiple virtual server groups.
    /// 
    /// &gt; **NOTE:** One virtual server group can be attached with multiple listeners in one load balancer.
    /// 
    /// &gt; **NOTE:** One Classic and Internet load balancer, its virtual server group can add Classic and VPC ECS instances.
    /// 
    /// &gt; **NOTE:** One Classic and Intranet load balancer, its virtual server group can only add Classic ECS instances.
    /// 
    /// &gt; **NOTE:** One VPC load balancer, its virtual server group can only add the same VPC ECS instances.
    /// 
    /// ## Block servers
    /// 
    /// The servers mapping supports the following:
    /// 
    /// * `server_ids` - (Required) A list backend server ID (ECS instance ID).
    /// * `port` - (Required) The port used by the backend server. Valid value range: [1-65535].
    /// * `weight` - (Optional) Weight of the backend server. Valid value range: [0-100]. Default to 100.
    /// * `type` - (Optional, Available in 1.51.0+) Type of the backend server. Valid value ecs, eni. Default to eni.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/slb_server_group.html.markdown.
    /// </summary>
    public partial class ServerGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        /// </summary>
        [Output("deleteProtectionValidation")]
        public Output<bool?> DeleteProtectionValidation { get; private set; } = null!;

        /// <summary>
        /// The Load Balancer ID which is used to launch a new virtual server group.
        /// </summary>
        [Output("loadBalancerId")]
        public Output<string> LoadBalancerId { get; private set; } = null!;

        /// <summary>
        /// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        /// </summary>
        [Output("servers")]
        public Output<ImmutableArray<Outputs.ServerGroupServers>> Servers { get; private set; } = null!;


        /// <summary>
        /// Create a ServerGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerGroup(string name, ServerGroupArgs args, CustomResourceOptions? options = null)
            : base("alicloud:slb/serverGroup:ServerGroup", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private ServerGroup(string name, Input<string> id, ServerGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:slb/serverGroup:ServerGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerGroup Get(string name, Input<string> id, ServerGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerGroup(name, id, state, options);
        }
    }

    public sealed class ServerGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        /// </summary>
        [Input("deleteProtectionValidation")]
        public Input<bool>? DeleteProtectionValidation { get; set; }

        /// <summary>
        /// The Load Balancer ID which is used to launch a new virtual server group.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("servers")]
        private InputList<Inputs.ServerGroupServersArgs>? _servers;

        /// <summary>
        /// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        /// </summary>
        public InputList<Inputs.ServerGroupServersArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.ServerGroupServersArgs>());
            set => _servers = value;
        }

        public ServerGroupArgs()
        {
        }
    }

    public sealed class ServerGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Checking DeleteProtection of SLB instance before deleting. If true, this resource will not be deleted when its SLB instance enabled DeleteProtection. Default to false.
        /// </summary>
        [Input("deleteProtectionValidation")]
        public Input<bool>? DeleteProtectionValidation { get; set; }

        /// <summary>
        /// The Load Balancer ID which is used to launch a new virtual server group.
        /// </summary>
        [Input("loadBalancerId")]
        public Input<string>? LoadBalancerId { get; set; }

        /// <summary>
        /// Name of the virtual server group. Our plugin provides a default name: "tf-server-group".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("servers")]
        private InputList<Inputs.ServerGroupServersGetArgs>? _servers;

        /// <summary>
        /// A list of ECS instances to be added. At most 20 ECS instances can be supported in one resource. It contains three sub-fields as `Block server` follows.
        /// </summary>
        public InputList<Inputs.ServerGroupServersGetArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.ServerGroupServersGetArgs>());
            set => _servers = value;
        }

        public ServerGroupState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ServerGroupServersArgs : Pulumi.ResourceArgs
    {
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("serverIds", required: true)]
        private InputList<string>? _serverIds;
        public InputList<string> ServerIds
        {
            get => _serverIds ?? (_serverIds = new InputList<string>());
            set => _serverIds = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public ServerGroupServersArgs()
        {
        }
    }

    public sealed class ServerGroupServersGetArgs : Pulumi.ResourceArgs
    {
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        [Input("serverIds", required: true)]
        private InputList<string>? _serverIds;
        public InputList<string> ServerIds
        {
            get => _serverIds ?? (_serverIds = new InputList<string>());
            set => _serverIds = value;
        }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public ServerGroupServersGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ServerGroupServers
    {
        public readonly int Port;
        public readonly ImmutableArray<string> ServerIds;
        public readonly string? Type;
        public readonly int? Weight;

        [OutputConstructor]
        private ServerGroupServers(
            int port,
            ImmutableArray<string> serverIds,
            string? type,
            int? weight)
        {
            Port = port;
            ServerIds = serverIds;
            Type = type;
            Weight = weight;
        }
    }
    }
}