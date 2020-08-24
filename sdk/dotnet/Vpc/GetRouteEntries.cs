// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetRouteEntries
    {
        /// <summary>
        /// This data source provides a list of Route Entries owned by an Alibaba Cloud account.
        /// 
        /// &gt; **NOTE:** Available in 1.37.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var defaultZones = Output.Create(AliCloud.GetZones.InvokeAsync(new AliCloud.GetZonesArgs
        ///         {
        ///             AvailableResourceCreation = "VSwitch",
        ///         }));
        ///         var defaultInstanceTypes = defaultZones.Apply(defaultZones =&gt; Output.Create(AliCloud.Ecs.GetInstanceTypes.InvokeAsync(new AliCloud.Ecs.GetInstanceTypesArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Zones[0].Id,
        ///             CpuCoreCount = 1,
        ///             MemorySize = 2,
        ///         })));
        ///         var defaultImages = Output.Create(AliCloud.Ecs.GetImages.InvokeAsync(new AliCloud.Ecs.GetImagesArgs
        ///         {
        ///             MostRecent = true,
        ///             NameRegex = "^ubuntu_18.*64",
        ///             Owners = "system",
        ///         }));
        ///         var config = new Config();
        ///         var name = config.Get("name") ?? "tf-testAccRouteEntryConfig";
        ///         var fooNetwork = new AliCloud.Vpc.Network("fooNetwork", new AliCloud.Vpc.NetworkArgs
        ///         {
        ///             CidrBlock = "10.1.0.0/21",
        ///         });
        ///         var fooSwitch = new AliCloud.Vpc.Switch("fooSwitch", new AliCloud.Vpc.SwitchArgs
        ///         {
        ///             AvailabilityZone = defaultZones.Apply(defaultZones =&gt; defaultZones.Zones[0].Id),
        ///             CidrBlock = "10.1.1.0/24",
        ///             VpcId = fooNetwork.Id,
        ///         });
        ///         var tfTestFoo = new AliCloud.Ecs.SecurityGroup("tfTestFoo", new AliCloud.Ecs.SecurityGroupArgs
        ///         {
        ///             Description = "foo",
        ///             VpcId = fooNetwork.Id,
        ///         });
        ///         var fooInstance = new AliCloud.Ecs.Instance("fooInstance", new AliCloud.Ecs.InstanceArgs
        ///         {
        ///             AllocatePublicIp = true,
        ///             ImageId = defaultImages.Apply(defaultImages =&gt; defaultImages.Images[0].Id),
        ///             InstanceChargeType = "PostPaid",
        ///             InstanceName = name,
        ///             InstanceType = defaultInstanceTypes.Apply(defaultInstanceTypes =&gt; defaultInstanceTypes.InstanceTypes[0].Id),
        ///             InternetChargeType = "PayByTraffic",
        ///             InternetMaxBandwidthOut = 5,
        ///             SecurityGroups = 
        ///             {
        ///                 tfTestFoo.Id,
        ///             },
        ///             SystemDiskCategory = "cloud_efficiency",
        ///             VswitchId = fooSwitch.Id,
        ///         });
        ///         var fooRouteEntry = new AliCloud.Vpc.RouteEntry("fooRouteEntry", new AliCloud.Vpc.RouteEntryArgs
        ///         {
        ///             DestinationCidrblock = "172.11.1.1/32",
        ///             NexthopId = fooInstance.Id,
        ///             NexthopType = "Instance",
        ///             RouteTableId = fooNetwork.RouteTableId,
        ///         });
        ///         var ingress = new AliCloud.Ecs.SecurityGroupRule("ingress", new AliCloud.Ecs.SecurityGroupRuleArgs
        ///         {
        ///             CidrIp = "0.0.0.0/0",
        ///             IpProtocol = "tcp",
        ///             NicType = "intranet",
        ///             Policy = "accept",
        ///             PortRange = "22/22",
        ///             Priority = 1,
        ///             SecurityGroupId = tfTestFoo.Id,
        ///             Type = "ingress",
        ///         });
        ///         var fooRouteEntries = fooRouteEntry.RouteTableId.Apply(routeTableId =&gt; AliCloud.Vpc.GetRouteEntries.InvokeAsync(new AliCloud.Vpc.GetRouteEntriesArgs
        ///         {
        ///             RouteTableId = routeTableId,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRouteEntriesResult> InvokeAsync(GetRouteEntriesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRouteEntriesResult>("alicloud:vpc/getRouteEntries:getRouteEntries", args ?? new GetRouteEntriesArgs(), options.WithVersion());
    }


    public sealed class GetRouteEntriesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The destination CIDR block of the route entry.
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        /// <summary>
        /// The instance ID of the next hop.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the router table to which the route entry belongs.
        /// </summary>
        [Input("routeTableId", required: true)]
        public string RouteTableId { get; set; } = null!;

        /// <summary>
        /// The type of the route entry.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetRouteEntriesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRouteEntriesResult
    {
        /// <summary>
        /// The destination CIDR block of the route entry.
        /// </summary>
        public readonly string? CidrBlock;
        /// <summary>
        /// A list of Route Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouteEntriesEntryResult> Entries;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The instance ID of the next hop.
        /// </summary>
        public readonly string? InstanceId;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the router table to which the route entry belongs.
        /// </summary>
        public readonly string RouteTableId;
        /// <summary>
        /// The type of the route entry.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private GetRouteEntriesResult(
            string? cidrBlock,

            ImmutableArray<Outputs.GetRouteEntriesEntryResult> entries,

            string id,

            string? instanceId,

            string? outputFile,

            string routeTableId,

            string? type)
        {
            CidrBlock = cidrBlock;
            Entries = entries;
            Id = id;
            InstanceId = instanceId;
            OutputFile = outputFile;
            RouteTableId = routeTableId;
            Type = type;
        }
    }
}
