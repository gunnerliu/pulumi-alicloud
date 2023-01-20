// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    /// <summary>
    /// Provides a ALB Server Group resource.
    /// 
    /// For information about ALB Server Group and how to use it,
    /// see [What is Server Group](https://www.alibabacloud.com/help/doc-detail/213627.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.131.0+.
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
    ///     var name = config.Get("name") ?? "example_value";
    ///     var defaultZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableDiskCategory = "cloud_efficiency",
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
    ///     {
    ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         CpuCoreCount = 1,
    ///         MemorySize = 2,
    ///     });
    /// 
    ///     var defaultImages = AliCloud.Ecs.GetImages.Invoke(new()
    ///     {
    ///         NameRegex = "^ubuntu_18.*64",
    ///         MostRecent = true,
    ///         Owners = "system",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("defaultNetwork", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "172.16.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("defaultSwitch", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///         CidrBlock = "172.16.0.0/16",
    ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         VswitchName = name,
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("defaultSecurityGroup", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultInstance = new AliCloud.Ecs.Instance("defaultInstance", new()
    ///     {
    ///         ImageId = defaultImages.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
    ///         InstanceType = defaultInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
    ///         InstanceName = name,
    ///         SecurityGroups = new[]
    ///         {
    ///             defaultSecurityGroup,
    ///         }.Select(__item =&gt; __item.Id).ToList(),
    ///         InternetChargeType = "PayByTraffic",
    ///         InternetMaxBandwidthOut = 10,
    ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///         InstanceChargeType = "PostPaid",
    ///         SystemDiskCategory = "cloud_efficiency",
    ///         VswitchId = defaultSwitch.Id,
    ///     });
    /// 
    ///     var defaultResourceGroups = AliCloud.ResourceManager.GetResourceGroups.Invoke();
    /// 
    ///     var defaultServerGroup = new AliCloud.Alb.ServerGroup("defaultServerGroup", new()
    ///     {
    ///         Protocol = "HTTP",
    ///         VpcId = defaultNetwork.Id,
    ///         ServerGroupName = name,
    ///         ResourceGroupId = defaultResourceGroups.Apply(getResourceGroupsResult =&gt; getResourceGroupsResult.Groups[0]?.Id),
    ///         HealthCheckConfig = new AliCloud.Alb.Inputs.ServerGroupHealthCheckConfigArgs
    ///         {
    ///             HealthCheckConnectPort = 46325,
    ///             HealthCheckEnabled = true,
    ///             HealthCheckHost = "tf-testAcc.com",
    ///             HealthCheckCodes = new[]
    ///             {
    ///                 "http_2xx",
    ///                 "http_3xx",
    ///                 "http_4xx",
    ///             },
    ///             HealthCheckHttpVersion = "HTTP1.1",
    ///             HealthCheckInterval = 2,
    ///             HealthCheckMethod = "HEAD",
    ///             HealthCheckPath = "/tf-testAcc",
    ///             HealthCheckProtocol = "HTTP",
    ///             HealthCheckTimeout = 5,
    ///             HealthyThreshold = 3,
    ///             UnhealthyThreshold = 3,
    ///         },
    ///         StickySessionConfig = new AliCloud.Alb.Inputs.ServerGroupStickySessionConfigArgs
    ///         {
    ///             StickySessionEnabled = true,
    ///             Cookie = "tf-testAcc",
    ///             StickySessionType = "Server",
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Created", "TF" },
    ///         },
    ///         Servers = new[]
    ///         {
    ///             new AliCloud.Alb.Inputs.ServerGroupServerArgs
    ///             {
    ///                 Description = name,
    ///                 Port = 80,
    ///                 ServerId = defaultInstance.Id,
    ///                 ServerIp = defaultInstance.PrivateIp,
    ///                 ServerType = "Ecs",
    ///                 Weight = 10,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ALB Server Group can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:alb/serverGroup:ServerGroup example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:alb/serverGroup:ServerGroup")]
    public partial class ServerGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Output("dryRun")]
        public Output<bool?> DryRun { get; private set; } = null!;

        /// <summary>
        /// The configuration of health checks.
        /// </summary>
        [Output("healthCheckConfig")]
        public Output<Outputs.ServerGroupHealthCheckConfig?> HealthCheckConfig { get; private set; } = null!;

        /// <summary>
        /// The server protocol. Valid values: ` HTTPS`, `HTTP`.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`.
        /// </summary>
        [Output("scheduler")]
        public Output<string> Scheduler { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("serverGroupName")]
        public Output<string?> ServerGroupName { get; private set; } = null!;

        /// <summary>
        /// The type of the server group. Valid values:
        /// </summary>
        [Output("serverGroupType")]
        public Output<string> ServerGroupType { get; private set; } = null!;

        /// <summary>
        /// The backend server.
        /// </summary>
        [Output("servers")]
        public Output<ImmutableArray<Outputs.ServerGroupServer>> Servers { get; private set; } = null!;

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The configuration of the sticky session.
        /// </summary>
        [Output("stickySessionConfig")]
        public Output<Outputs.ServerGroupStickySessionConfig?> StickySessionConfig { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC that you want to access.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a ServerGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerGroup(string name, ServerGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:alb/serverGroup:ServerGroup", name, args ?? new ServerGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerGroup(string name, Input<string> id, ServerGroupState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:alb/serverGroup:ServerGroup", name, state, MakeResourceOptions(options, id))
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

    public sealed class ServerGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The configuration of health checks.
        /// </summary>
        [Input("healthCheckConfig")]
        public Input<Inputs.ServerGroupHealthCheckConfigArgs>? HealthCheckConfig { get; set; }

        /// <summary>
        /// The server protocol. Valid values: ` HTTPS`, `HTTP`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`.
        /// </summary>
        [Input("scheduler")]
        public Input<string>? Scheduler { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("serverGroupName")]
        public Input<string>? ServerGroupName { get; set; }

        /// <summary>
        /// The type of the server group. Valid values:
        /// </summary>
        [Input("serverGroupType")]
        public Input<string>? ServerGroupType { get; set; }

        [Input("servers")]
        private InputList<Inputs.ServerGroupServerArgs>? _servers;

        /// <summary>
        /// The backend server.
        /// </summary>
        public InputList<Inputs.ServerGroupServerArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.ServerGroupServerArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// The configuration of the sticky session.
        /// </summary>
        [Input("stickySessionConfig")]
        public Input<Inputs.ServerGroupStickySessionConfigArgs>? StickySessionConfig { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPC that you want to access.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ServerGroupArgs()
        {
        }
        public static new ServerGroupArgs Empty => new ServerGroupArgs();
    }

    public sealed class ServerGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dry run.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// The configuration of health checks.
        /// </summary>
        [Input("healthCheckConfig")]
        public Input<Inputs.ServerGroupHealthCheckConfigGetArgs>? HealthCheckConfig { get; set; }

        /// <summary>
        /// The server protocol. Valid values: ` HTTPS`, `HTTP`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The scheduling algorithm. Valid values: ` Sch`, ` Wlc`, `Wrr`.
        /// </summary>
        [Input("scheduler")]
        public Input<string>? Scheduler { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("serverGroupName")]
        public Input<string>? ServerGroupName { get; set; }

        /// <summary>
        /// The type of the server group. Valid values:
        /// </summary>
        [Input("serverGroupType")]
        public Input<string>? ServerGroupType { get; set; }

        [Input("servers")]
        private InputList<Inputs.ServerGroupServerGetArgs>? _servers;

        /// <summary>
        /// The backend server.
        /// </summary>
        public InputList<Inputs.ServerGroupServerGetArgs> Servers
        {
            get => _servers ?? (_servers = new InputList<Inputs.ServerGroupServerGetArgs>());
            set => _servers = value;
        }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The configuration of the sticky session.
        /// </summary>
        [Input("stickySessionConfig")]
        public Input<Inputs.ServerGroupStickySessionConfigGetArgs>? StickySessionConfig { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the VPC that you want to access.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ServerGroupState()
        {
        }
        public static new ServerGroupState Empty => new ServerGroupState();
    }
}
