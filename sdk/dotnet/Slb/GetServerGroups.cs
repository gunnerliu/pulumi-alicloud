// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static class GetServerGroups
    {
        /// <summary>
        /// This data source provides the VServer groups related to a server load balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var name = config.Get("name") ?? "slbservergroups";
        ///     var defaultZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
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
        ///     var defaultApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("defaultApplicationLoadBalancer", new()
        ///     {
        ///         LoadBalancerName = name,
        ///         VswitchId = defaultSwitch.Id,
        ///     });
        /// 
        ///     var defaultServerGroup = new AliCloud.Slb.ServerGroup("defaultServerGroup", new()
        ///     {
        ///         LoadBalancerId = defaultApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetServerGroups.Invoke(new()
        ///     {
        ///         LoadBalancerId = defaultApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbServerGroupId"] = sampleDs.Apply(getServerGroupsResult =&gt; getServerGroupsResult.SlbServerGroups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServerGroupsResult> InvokeAsync(GetServerGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerGroupsResult>("alicloud:slb/getServerGroups:getServerGroups", args ?? new GetServerGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the VServer groups related to a server load balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var name = config.Get("name") ?? "slbservergroups";
        ///     var defaultZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
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
        ///     var defaultApplicationLoadBalancer = new AliCloud.Slb.ApplicationLoadBalancer("defaultApplicationLoadBalancer", new()
        ///     {
        ///         LoadBalancerName = name,
        ///         VswitchId = defaultSwitch.Id,
        ///     });
        /// 
        ///     var defaultServerGroup = new AliCloud.Slb.ServerGroup("defaultServerGroup", new()
        ///     {
        ///         LoadBalancerId = defaultApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     var sampleDs = AliCloud.Slb.GetServerGroups.Invoke(new()
        ///     {
        ///         LoadBalancerId = defaultApplicationLoadBalancer.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstSlbServerGroupId"] = sampleDs.Apply(getServerGroupsResult =&gt; getServerGroupsResult.SlbServerGroups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetServerGroupsResult> Invoke(GetServerGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerGroupsResult>("alicloud:slb/getServerGroups:getServerGroups", args ?? new GetServerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VServer group IDs to filter results.
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
        /// A regex string to filter results by VServer group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetServerGroupsArgs()
        {
        }
        public static new GetServerGroupsArgs Empty => new GetServerGroupsArgs();
    }

    public sealed class GetServerGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of VServer group IDs to filter results.
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
        /// A regex string to filter results by VServer group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetServerGroupsInvokeArgs()
        {
        }
        public static new GetServerGroupsInvokeArgs Empty => new GetServerGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerGroupsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of SLB VServer groups IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of SLB VServer groups names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of SLB VServer groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerGroupsSlbServerGroupResult> SlbServerGroups;

        [OutputConstructor]
        private GetServerGroupsResult(
            string id,

            ImmutableArray<string> ids,

            string loadBalancerId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetServerGroupsSlbServerGroupResult> slbServerGroups)
        {
            Id = id;
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            SlbServerGroups = slbServerGroups;
        }
    }
}
