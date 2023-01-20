// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetMasterSlaveServerGroups
    {
        /// <summary>
        /// This data source provides the master slave server groups related to a server load balancer.
        /// 
        /// &gt; **NOTE:** Available in 1.54.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var defaultZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         EniAmount = 2,
        ///     });
        /// 
        ///     var image = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_18.*64",
        ///         MostRecent = true,
        ///         Owners = "system",
        ///     });
        /// 
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "tf-testAccSlbMasterSlaveServerGroupVpc";
        ///     var number = config.Get("number") ?? "1";
        ///     var mainNetwork = new AliCloud.Vpc.Network("mainNetwork", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var mainSwitch = new AliCloud.Vpc.Switch("mainSwitch", new()
        ///     {
        ///         VpcId = mainNetwork.Id,
        ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         VswitchName = name,
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var groupSecurityGroup = new AliCloud.Ecs.SecurityGroup("groupSecurityGroup", new()
        ///     {
        ///         VpcId = mainNetwork.Id,
        ///     });
        /// 
        ///     var instanceInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; "2"; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         instanceInstance.Add(new AliCloud.Ecs.Instance($"instanceInstance-{range.Value}", new()
        ///         {
        ///             ImageId = image.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///             InstanceType = defaultInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///             InstanceName = name,
        ///             SecurityGroups = new[]
        ///             {
        ///                 groupSecurityGroup.Id,
        ///             },
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 10,
        ///             AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///             InstanceChargeType = "PostPaid",
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = mainSwitch.Id,
        ///         }));
        ///     }
        ///     var instanceApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer", new()
        ///     {
        ///         LoadBalancerName = name,
        ///         VswitchId = mainSwitch.Id,
        ///         LoadBalancerSpec = "slb.s2.small",
        ///     });
        /// 
        ///     var groupMasterSlaveServerGroup = new AliCloud.Slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup", new()
        ///     {
        ///         LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///         Servers = new[]
        ///         {
        ///             new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///             {
        ///                 ServerId = instanceInstance[0].Id,
        ///                 Port = 100,
        ///                 Weight = 100,
        ///                 ServerType = "Master",
        ///             },
        ///             new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///             {
        ///                 ServerId = instanceInstance[1].Id,
        ///                 Port = 100,
        ///                 Weight = 100,
        ///                 ServerType = "Slave",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetMasterSlaveServerGroups.Invoke(new()
        ///     {
        ///         LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbServerGroupId"] = sampleDs.Apply(getMasterSlaveServerGroupsResult =&gt; getMasterSlaveServerGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMasterSlaveServerGroupsResult> InvokeAsync(GetMasterSlaveServerGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMasterSlaveServerGroupsResult>("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", args ?? new GetMasterSlaveServerGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the master slave server groups related to a server load balancer.
        /// 
        /// &gt; **NOTE:** Available in 1.54.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var defaultZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultInstanceTypes = AliCloud.Ecs.GetInstanceTypes.Invoke(new()
        ///     {
        ///         AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         EniAmount = 2,
        ///     });
        /// 
        ///     var image = AliCloud.Ecs.GetImages.Invoke(new()
        ///     {
        ///         NameRegex = "^ubuntu_18.*64",
        ///         MostRecent = true,
        ///         Owners = "system",
        ///     });
        /// 
        ///     var config = new Config();
        ///     var name = config.Get("name") ?? "tf-testAccSlbMasterSlaveServerGroupVpc";
        ///     var number = config.Get("number") ?? "1";
        ///     var mainNetwork = new AliCloud.Vpc.Network("mainNetwork", new()
        ///     {
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var mainSwitch = new AliCloud.Vpc.Switch("mainSwitch", new()
        ///     {
        ///         VpcId = mainNetwork.Id,
        ///         ZoneId = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///         VswitchName = name,
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var groupSecurityGroup = new AliCloud.Ecs.SecurityGroup("groupSecurityGroup", new()
        ///     {
        ///         VpcId = mainNetwork.Id,
        ///     });
        /// 
        ///     var instanceInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///     for (var rangeIndex = 0; rangeIndex &lt; "2"; rangeIndex++)
        ///     {
        ///         var range = new { Value = rangeIndex };
        ///         instanceInstance.Add(new AliCloud.Ecs.Instance($"instanceInstance-{range.Value}", new()
        ///         {
        ///             ImageId = image.Apply(getImagesResult =&gt; getImagesResult.Images[0]?.Id),
        ///             InstanceType = defaultInstanceTypes.Apply(getInstanceTypesResult =&gt; getInstanceTypesResult.InstanceTypes[0]?.Id),
        ///             InstanceName = name,
        ///             SecurityGroups = new[]
        ///             {
        ///                 groupSecurityGroup.Id,
        ///             },
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 10,
        ///             AvailabilityZone = defaultZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///             InstanceChargeType = "PostPaid",
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = mainSwitch.Id,
        ///         }));
        ///     }
        ///     var instanceApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer", new()
        ///     {
        ///         LoadBalancerName = name,
        ///         VswitchId = mainSwitch.Id,
        ///         LoadBalancerSpec = "slb.s2.small",
        ///     });
        /// 
        ///     var groupMasterSlaveServerGroup = new AliCloud.Slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup", new()
        ///     {
        ///         LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///         Servers = new[]
        ///         {
        ///             new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///             {
        ///                 ServerId = instanceInstance[0].Id,
        ///                 Port = 100,
        ///                 Weight = 100,
        ///                 ServerType = "Master",
        ///             },
        ///             new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///             {
        ///                 ServerId = instanceInstance[1].Id,
        ///                 Port = 100,
        ///                 Weight = 100,
        ///                 ServerType = "Slave",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetMasterSlaveServerGroups.Invoke(new()
        ///     {
        ///         LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbServerGroupId"] = sampleDs.Apply(getMasterSlaveServerGroupsResult =&gt; getMasterSlaveServerGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMasterSlaveServerGroupsResult> Invoke(GetMasterSlaveServerGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMasterSlaveServerGroupsResult>("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", args ?? new GetMasterSlaveServerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMasterSlaveServerGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of master slave server group IDs to filter results.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by master slave server group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetMasterSlaveServerGroupsArgs()
        {
        }
        public static new GetMasterSlaveServerGroupsArgs Empty => new GetMasterSlaveServerGroupsArgs();
    }

    public sealed class GetMasterSlaveServerGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of master slave server group IDs to filter results.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public Input<string> LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by master slave server group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetMasterSlaveServerGroupsInvokeArgs()
        {
        }
        public static new GetMasterSlaveServerGroupsInvokeArgs Empty => new GetMasterSlaveServerGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMasterSlaveServerGroupsResult
    {
        /// <summary>
        /// A list of SLB master slave server groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMasterSlaveServerGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of SLB master slave server groups IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of SLB master slave server groups names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetMasterSlaveServerGroupsResult(
            ImmutableArray<Outputs.GetMasterSlaveServerGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string loadBalancerId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Groups = groups;
            Id = id;
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
