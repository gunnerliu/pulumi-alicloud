// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    /// <summary>
    /// Attaches/Detaches vserver groups to a specified scaling group.
    /// 
    /// &gt; **NOTE:** The load balancer of which vserver groups belongs to must be in `active` status.
    /// 
    /// &gt; **NOTE:** If scaling group's network type is `VPC`, the vserver groups must be in the same `VPC`.
    /// 
    /// &gt; **NOTE:** A scaling group can have at most 5 vserver groups attached by default.
    /// 
    /// &gt; **NOTE:** Vserver groups and the default group of loadbalancer share the same backend server quota.
    /// 
    /// &gt; **NOTE:** When attach vserver groups to scaling group, existing ECS instances will be added to vserver groups; Instead, ECS instances will be removed from vserver group when detach.
    /// 
    /// &gt; **NOTE:** Detach action will be executed before attach action.
    /// 
    /// &gt; **NOTE:** Vserver group is defined uniquely by `loadbalancer_id`, `vserver_group_id`, `port`.
    /// 
    /// &gt; **NOTE:** Modifing `weight` attribute means detach vserver group first and then, attach with new weight parameter.
    /// 
    /// &gt; **NOTE:** Resource `alicloud.ess.ScalingGroupVServerGroups` is available in 1.53.0+.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "testAccEssVserverGroupsAttachment";
    ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
    ///         {
    ///             AvailableDiskCategory = "cloud_efficiency",
    ///             AvailableResourceCreation = "VSwitch",
    ///         }));
    ///         var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new AliCloud.Vpc.NetworkArgs
    ///         {
    ///             CidrBlock = "172.16.0.0/16",
    ///         });
    ///         var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new AliCloud.Vpc.SwitchArgs
    ///         {
    ///             VpcId = defaultNetwork.Id,
    ///             CidrBlock = "172.16.0.0/24",
    ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
    ///         });
    ///         var defaultLoadBalancer = new AliCloud.Slb.LoadBalancer("defaultLoadBalancer", new AliCloud.Slb.LoadBalancerArgs
    ///         {
    ///             VswitchId = defaultSwitch.Id,
    ///         });
    ///         var defaultServerGroup = new AliCloud.Slb.ServerGroup("defaultServerGroup", new AliCloud.Slb.ServerGroupArgs
    ///         {
    ///             LoadBalancerId = defaultLoadBalancer.Id,
    ///         });
    ///         var defaultListener = new List&lt;AliCloud.Slb.Listener&gt;();
    ///         for (var rangeIndex = 0; rangeIndex &lt; 2; rangeIndex++)
    ///         {
    ///             var range = new { Value = rangeIndex };
    ///             defaultListener.Add(new AliCloud.Slb.Listener($"defaultListener-{range.Value}", new AliCloud.Slb.ListenerArgs
    ///             {
    ///                 LoadBalancerId = 
    ///                 {
    ///                     defaultLoadBalancer,
    ///                 }.Select(__item =&gt; __item.Id).ToList()[range.Value],
    ///                 BackendPort = 22,
    ///                 FrontendPort = 22,
    ///                 Protocol = "tcp",
    ///                 Bandwidth = 10,
    ///                 HealthCheckType = "tcp",
    ///             }));
    ///         }
    ///         var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("defaultScalingGroup", new AliCloud.Ess.ScalingGroupArgs
    ///         {
    ///             MinSize = 2,
    ///             MaxSize = 2,
    ///             ScalingGroupName = name,
    ///             VswitchIds = 
    ///             {
    ///                 defaultSwitch.Id,
    ///             },
    ///         });
    ///         var defaultScalingGroupVServerGroups = new AliCloud.Ess.ScalingGroupVServerGroups("defaultScalingGroupVServerGroups", new AliCloud.Ess.ScalingGroupVServerGroupsArgs
    ///         {
    ///             ScalingGroupId = defaultScalingGroup.Id,
    ///             VserverGroups = 
    ///             {
    ///                 new AliCloud.Ess.Inputs.ScalingGroupVServerGroupsVserverGroupArgs
    ///                 {
    ///                     LoadbalancerId = defaultLoadBalancer.Id,
    ///                     VserverAttributes = 
    ///                     {
    ///                         new AliCloud.Ess.Inputs.ScalingGroupVServerGroupsVserverGroupVserverAttributeArgs
    ///                         {
    ///                             VserverGroupId = defaultServerGroup.Id,
    ///                             Port = 100,
    ///                             Weight = 60,
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Block vserver_group
    /// 
    /// the vserver_group supports the following:
    /// 
    /// * `loadbalancer_id` - (Required) Loadbalancer server ID of VServer Group.
    /// * `vserver_attributes` - (Required) A list of VServer Group attributes. See Block vserver_attribute below for details.
    /// 
    /// ## Block vserver_attribute
    /// 
    /// * `vserver_group_id` - (Required) ID of VServer Group.
    /// * `port` - (Required) - The port will be used for VServer Group backend server.
    /// * `weight` - (Required) The weight of an ECS instance attached to the VServer Group.
    /// 
    /// ## Import
    /// 
    /// ESS vserver groups can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups example abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups")]
    public partial class ScalingGroupVServerGroups : Pulumi.CustomResource
    {
        /// <summary>
        /// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
        /// </summary>
        [Output("force")]
        public Output<bool?> Force { get; private set; } = null!;

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Output("scalingGroupId")]
        public Output<string> ScalingGroupId { get; private set; } = null!;

        /// <summary>
        /// A list of vserver groups attached on scaling group. See Block vserver_group below for details.
        /// </summary>
        [Output("vserverGroups")]
        public Output<ImmutableArray<Outputs.ScalingGroupVServerGroupsVserverGroup>> VserverGroups { get; private set; } = null!;


        /// <summary>
        /// Create a ScalingGroupVServerGroups resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScalingGroupVServerGroups(string name, ScalingGroupVServerGroupsArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, args ?? new ScalingGroupVServerGroupsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScalingGroupVServerGroups(string name, Input<string> id, ScalingGroupVServerGroupsState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ess/scalingGroupVServerGroups:ScalingGroupVServerGroups", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScalingGroupVServerGroups resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScalingGroupVServerGroups Get(string name, Input<string> id, ScalingGroupVServerGroupsState? state = null, CustomResourceOptions? options = null)
        {
            return new ScalingGroupVServerGroups(name, id, state, options);
        }
    }

    public sealed class ScalingGroupVServerGroupsArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Input("scalingGroupId", required: true)]
        public Input<string> ScalingGroupId { get; set; } = null!;

        [Input("vserverGroups", required: true)]
        private InputList<Inputs.ScalingGroupVServerGroupsVserverGroupArgs>? _vserverGroups;

        /// <summary>
        /// A list of vserver groups attached on scaling group. See Block vserver_group below for details.
        /// </summary>
        public InputList<Inputs.ScalingGroupVServerGroupsVserverGroupArgs> VserverGroups
        {
            get => _vserverGroups ?? (_vserverGroups = new InputList<Inputs.ScalingGroupVServerGroupsVserverGroupArgs>());
            set => _vserverGroups = value;
        }

        public ScalingGroupVServerGroupsArgs()
        {
        }
    }

    public sealed class ScalingGroupVServerGroupsState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// If instances of scaling group are attached/removed from slb backend server when attach/detach vserver group from scaling group. Default to true.
        /// </summary>
        [Input("force")]
        public Input<bool>? Force { get; set; }

        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        [Input("vserverGroups")]
        private InputList<Inputs.ScalingGroupVServerGroupsVserverGroupGetArgs>? _vserverGroups;

        /// <summary>
        /// A list of vserver groups attached on scaling group. See Block vserver_group below for details.
        /// </summary>
        public InputList<Inputs.ScalingGroupVServerGroupsVserverGroupGetArgs> VserverGroups
        {
            get => _vserverGroups ?? (_vserverGroups = new InputList<Inputs.ScalingGroupVServerGroupsVserverGroupGetArgs>());
            set => _vserverGroups = value;
        }

        public ScalingGroupVServerGroupsState()
        {
        }
    }
}
