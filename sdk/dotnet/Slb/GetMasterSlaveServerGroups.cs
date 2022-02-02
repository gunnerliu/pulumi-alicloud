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
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
        ///         {
        ///             AvailableDiskCategory = "cloud_efficiency",
        ///             AvailableResourceCreation = "VSwitch",
        ///         }));
        ///         var defaultInstanceTypes = defaultZones.Apply(defaultZones =&gt; Output.Create(AliCloud.Ecs.GetInstanceTypes.InvokeAsync(new AliCloud.Ecs.GetInstanceTypesArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Zones?[0]?.Id,
        ///             EniAmount = 2,
        ///         })));
        ///         var image = Output.Create(AliCloud.Ecs.GetImages.InvokeAsync(new AliCloud.Ecs.GetImagesArgs
        ///         {
        ///             NameRegex = "^ubuntu_18.*64",
        ///             MostRecent = true,
        ///             Owners = "system",
        ///         }));
        ///         var config = new Config();
        ///         var name = config.Get("name") ?? "tf-testAccSlbMasterSlaveServerGroupVpc";
        ///         var number = config.Get("number") ?? "1";
        ///         var mainNetwork = new AliCloud.Vpc.Network("mainNetwork", new AliCloud.Vpc.NetworkArgs
        ///         {
        ///             CidrBlock = "172.16.0.0/16",
        ///         });
        ///         var mainSwitch = new AliCloud.Vpc.Switch("mainSwitch", new AliCloud.Vpc.SwitchArgs
        ///         {
        ///             VpcId = mainNetwork.Id,
        ///             ZoneId = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
        ///             VswitchName = name,
        ///             CidrBlock = "172.16.0.0/16",
        ///         });
        ///         var groupSecurityGroup = new AliCloud.Ecs.SecurityGroup("groupSecurityGroup", new AliCloud.Ecs.SecurityGroupArgs
        ///         {
        ///             VpcId = mainNetwork.Id,
        ///         });
        ///         var instanceInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///         for (var rangeIndex = 0; rangeIndex &lt; "2"; rangeIndex++)
        ///         {
        ///             var range = new { Value = rangeIndex };
        ///             instanceInstance.Add(new AliCloud.Ecs.Instance($"instanceInstance-{range.Value}", new AliCloud.Ecs.InstanceArgs
        ///             {
        ///                 ImageId = image.Apply(image =&gt; image.Images?[0]?.Id),
        ///                 InstanceType = defaultInstanceTypes.Apply(defaultInstanceTypes =&gt; defaultInstanceTypes.InstanceTypes?[0]?.Id),
        ///                 InstanceName = name,
        ///                 SecurityGroups = 
        ///                 {
        ///                     groupSecurityGroup.Id,
        ///                 },
        ///                 InternetChargeType = "PayByTraffic",
        ///                 InternetMaxBandwidthOut = 10,
        ///                 AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
        ///                 InstanceChargeType = "PostPaid",
        ///                 SystemDiskCategory = "cloud_efficiency",
        ///                 VswitchId = mainSwitch.Id,
        ///             }));
        ///         }
        ///         var instanceApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer", new AliCloud.Slb.ApplicationLoadBalancerArgs
        ///         {
        ///             LoadBalancerName = name,
        ///             VswitchId = mainSwitch.Id,
        ///             LoadBalancerSpec = "slb.s2.small",
        ///         });
        ///         var groupMasterSlaveServerGroup = new AliCloud.Slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup", new AliCloud.Slb.MasterSlaveServerGroupArgs
        ///         {
        ///             LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///             Servers = 
        ///             {
        ///                 new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///                 {
        ///                     ServerId = instanceInstance[0].Id,
        ///                     Port = 100,
        ///                     Weight = 100,
        ///                     ServerType = "Master",
        ///                 },
        ///                 new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///                 {
        ///                     ServerId = instanceInstance[1].Id,
        ///                     Port = 100,
        ///                     Weight = 100,
        ///                     ServerType = "Slave",
        ///                 },
        ///             },
        ///         });
        ///         var sampleDs = AliCloud.Slb.GetMasterSlaveServerGroups.Invoke(new AliCloud.Slb.GetMasterSlaveServerGroupsInvokeArgs
        ///         {
        ///             LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///         });
        ///         this.FirstSlbServerGroupId = sampleDs.Apply(sampleDs =&gt; sampleDs.Groups?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstSlbServerGroupId")]
        ///     public Output&lt;string&gt; FirstSlbServerGroupId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMasterSlaveServerGroupsResult> InvokeAsync(GetMasterSlaveServerGroupsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMasterSlaveServerGroupsResult>("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", args ?? new GetMasterSlaveServerGroupsArgs(), options.WithDefaults());

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
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
        ///         {
        ///             AvailableDiskCategory = "cloud_efficiency",
        ///             AvailableResourceCreation = "VSwitch",
        ///         }));
        ///         var defaultInstanceTypes = defaultZones.Apply(defaultZones =&gt; Output.Create(AliCloud.Ecs.GetInstanceTypes.InvokeAsync(new AliCloud.Ecs.GetInstanceTypesArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Zones?[0]?.Id,
        ///             EniAmount = 2,
        ///         })));
        ///         var image = Output.Create(AliCloud.Ecs.GetImages.InvokeAsync(new AliCloud.Ecs.GetImagesArgs
        ///         {
        ///             NameRegex = "^ubuntu_18.*64",
        ///             MostRecent = true,
        ///             Owners = "system",
        ///         }));
        ///         var config = new Config();
        ///         var name = config.Get("name") ?? "tf-testAccSlbMasterSlaveServerGroupVpc";
        ///         var number = config.Get("number") ?? "1";
        ///         var mainNetwork = new AliCloud.Vpc.Network("mainNetwork", new AliCloud.Vpc.NetworkArgs
        ///         {
        ///             CidrBlock = "172.16.0.0/16",
        ///         });
        ///         var mainSwitch = new AliCloud.Vpc.Switch("mainSwitch", new AliCloud.Vpc.SwitchArgs
        ///         {
        ///             VpcId = mainNetwork.Id,
        ///             ZoneId = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
        ///             VswitchName = name,
        ///             CidrBlock = "172.16.0.0/16",
        ///         });
        ///         var groupSecurityGroup = new AliCloud.Ecs.SecurityGroup("groupSecurityGroup", new AliCloud.Ecs.SecurityGroupArgs
        ///         {
        ///             VpcId = mainNetwork.Id,
        ///         });
        ///         var instanceInstance = new List&lt;AliCloud.Ecs.Instance&gt;();
        ///         for (var rangeIndex = 0; rangeIndex &lt; "2"; rangeIndex++)
        ///         {
        ///             var range = new { Value = rangeIndex };
        ///             instanceInstance.Add(new AliCloud.Ecs.Instance($"instanceInstance-{range.Value}", new AliCloud.Ecs.InstanceArgs
        ///             {
        ///                 ImageId = image.Apply(image =&gt; image.Images?[0]?.Id),
        ///                 InstanceType = defaultInstanceTypes.Apply(defaultInstanceTypes =&gt; defaultInstanceTypes.InstanceTypes?[0]?.Id),
        ///                 InstanceName = name,
        ///                 SecurityGroups = 
        ///                 {
        ///                     groupSecurityGroup.Id,
        ///                 },
        ///                 InternetChargeType = "PayByTraffic",
        ///                 InternetMaxBandwidthOut = 10,
        ///                 AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones?[0]?.Id),
        ///                 InstanceChargeType = "PostPaid",
        ///                 SystemDiskCategory = "cloud_efficiency",
        ///                 VswitchId = mainSwitch.Id,
        ///             }));
        ///         }
        ///         var instanceApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("instanceApplicationLoadBalancer", new AliCloud.Slb.ApplicationLoadBalancerArgs
        ///         {
        ///             LoadBalancerName = name,
        ///             VswitchId = mainSwitch.Id,
        ///             LoadBalancerSpec = "slb.s2.small",
        ///         });
        ///         var groupMasterSlaveServerGroup = new AliCloud.Slb.MasterSlaveServerGroup("groupMasterSlaveServerGroup", new AliCloud.Slb.MasterSlaveServerGroupArgs
        ///         {
        ///             LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///             Servers = 
        ///             {
        ///                 new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///                 {
        ///                     ServerId = instanceInstance[0].Id,
        ///                     Port = 100,
        ///                     Weight = 100,
        ///                     ServerType = "Master",
        ///                 },
        ///                 new AliCloud.Slb.Inputs.MasterSlaveServerGroupServerArgs
        ///                 {
        ///                     ServerId = instanceInstance[1].Id,
        ///                     Port = 100,
        ///                     Weight = 100,
        ///                     ServerType = "Slave",
        ///                 },
        ///             },
        ///         });
        ///         var sampleDs = AliCloud.Slb.GetMasterSlaveServerGroups.Invoke(new AliCloud.Slb.GetMasterSlaveServerGroupsInvokeArgs
        ///         {
        ///             LoadBalancerId = instanceApplicationLoadBalancer.Id,
        ///         });
        ///         this.FirstSlbServerGroupId = sampleDs.Apply(sampleDs =&gt; sampleDs.Groups?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstSlbServerGroupId")]
        ///     public Output&lt;string&gt; FirstSlbServerGroupId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMasterSlaveServerGroupsResult> Invoke(GetMasterSlaveServerGroupsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetMasterSlaveServerGroupsResult>("alicloud:slb/getMasterSlaveServerGroups:getMasterSlaveServerGroups", args ?? new GetMasterSlaveServerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMasterSlaveServerGroupsArgs : Pulumi.InvokeArgs
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
    }

    public sealed class GetMasterSlaveServerGroupsInvokeArgs : Pulumi.InvokeArgs
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
