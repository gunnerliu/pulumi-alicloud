// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetEndpointGroups
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.113.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var region = config.Get("region") ?? "cn-hangzhou";
        ///     var name = config.Get("name") ?? "tf-example";
        ///     var defaultAccelerators = AliCloud.Ga.GetAccelerators.Invoke(new()
        ///     {
        ///         Status = "active",
        ///     });
        /// 
        ///     var defaultBandwidthPackage = new AliCloud.Ga.BandwidthPackage("defaultBandwidthPackage", new()
        ///     {
        ///         Bandwidth = 100,
        ///         Type = "Basic",
        ///         BandwidthType = "Basic",
        ///         PaymentType = "PayAsYouGo",
        ///         BillingType = "PayBy95",
        ///         Ratio = 30,
        ///         BandwidthPackageName = name,
        ///         AutoPay = true,
        ///         AutoUseCoupon = true,
        ///     });
        /// 
        ///     var defaultBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment", new()
        ///     {
        ///         AcceleratorId = defaultAccelerators.Apply(getAcceleratorsResult =&gt; getAcceleratorsResult.Ids[0]),
        ///         BandwidthPackageId = defaultBandwidthPackage.Id,
        ///     });
        /// 
        ///     var defaultListener = new AliCloud.Ga.Listener("defaultListener", new()
        ///     {
        ///         AcceleratorId = defaultBandwidthPackageAttachment.AcceleratorId,
        ///         ClientAffinity = "SOURCE_IP",
        ///         Protocol = "UDP",
        ///         PortRanges = new[]
        ///         {
        ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
        ///             {
        ///                 FromPort = 60,
        ///                 ToPort = 70,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var defaultEipAddress = new AliCloud.Ecs.EipAddress("defaultEipAddress", new()
        ///     {
        ///         Bandwidth = "10",
        ///         InternetChargeType = "PayByBandwidth",
        ///         AddressName = name,
        ///     });
        /// 
        ///     var defaultEndpointGroup = new AliCloud.Ga.EndpointGroup("defaultEndpointGroup", new()
        ///     {
        ///         AcceleratorId = defaultListener.AcceleratorId,
        ///         ListenerId = defaultListener.Id,
        ///         Description = name,
        ///         ThresholdCount = 4,
        ///         TrafficPercentage = 20,
        ///         EndpointGroupRegion = "cn-hangzhou",
        ///         HealthCheckIntervalSeconds = 3,
        ///         HealthCheckPath = "/healthcheck",
        ///         HealthCheckPort = 9999,
        ///         HealthCheckProtocol = "http",
        ///         PortOverrides = new AliCloud.Ga.Inputs.EndpointGroupPortOverridesArgs
        ///         {
        ///             EndpointPort = 10,
        ///             ListenerPort = 60,
        ///         },
        ///         EndpointConfigurations = new[]
        ///         {
        ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
        ///             {
        ///                 Endpoint = defaultEipAddress.IpAddress,
        ///                 Type = "PublicIp",
        ///                 Weight = 20,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var defaultEndpointGroups = AliCloud.Ga.GetEndpointGroups.Invoke(new()
        ///     {
        ///         AcceleratorId = defaultEndpointGroup.AcceleratorId,
        ///         Ids = new[]
        ///         {
        ///             defaultEndpointGroup.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGaEndpointGroupId"] = defaultEndpointGroups.Apply(getEndpointGroupsResult =&gt; getEndpointGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEndpointGroupsResult> InvokeAsync(GetEndpointGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEndpointGroupsResult>("alicloud:ga/getEndpointGroups:getEndpointGroups", args ?? new GetEndpointGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Endpoint Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.113.0.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///     var region = config.Get("region") ?? "cn-hangzhou";
        ///     var name = config.Get("name") ?? "tf-example";
        ///     var defaultAccelerators = AliCloud.Ga.GetAccelerators.Invoke(new()
        ///     {
        ///         Status = "active",
        ///     });
        /// 
        ///     var defaultBandwidthPackage = new AliCloud.Ga.BandwidthPackage("defaultBandwidthPackage", new()
        ///     {
        ///         Bandwidth = 100,
        ///         Type = "Basic",
        ///         BandwidthType = "Basic",
        ///         PaymentType = "PayAsYouGo",
        ///         BillingType = "PayBy95",
        ///         Ratio = 30,
        ///         BandwidthPackageName = name,
        ///         AutoPay = true,
        ///         AutoUseCoupon = true,
        ///     });
        /// 
        ///     var defaultBandwidthPackageAttachment = new AliCloud.Ga.BandwidthPackageAttachment("defaultBandwidthPackageAttachment", new()
        ///     {
        ///         AcceleratorId = defaultAccelerators.Apply(getAcceleratorsResult =&gt; getAcceleratorsResult.Ids[0]),
        ///         BandwidthPackageId = defaultBandwidthPackage.Id,
        ///     });
        /// 
        ///     var defaultListener = new AliCloud.Ga.Listener("defaultListener", new()
        ///     {
        ///         AcceleratorId = defaultBandwidthPackageAttachment.AcceleratorId,
        ///         ClientAffinity = "SOURCE_IP",
        ///         Protocol = "UDP",
        ///         PortRanges = new[]
        ///         {
        ///             new AliCloud.Ga.Inputs.ListenerPortRangeArgs
        ///             {
        ///                 FromPort = 60,
        ///                 ToPort = 70,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var defaultEipAddress = new AliCloud.Ecs.EipAddress("defaultEipAddress", new()
        ///     {
        ///         Bandwidth = "10",
        ///         InternetChargeType = "PayByBandwidth",
        ///         AddressName = name,
        ///     });
        /// 
        ///     var defaultEndpointGroup = new AliCloud.Ga.EndpointGroup("defaultEndpointGroup", new()
        ///     {
        ///         AcceleratorId = defaultListener.AcceleratorId,
        ///         ListenerId = defaultListener.Id,
        ///         Description = name,
        ///         ThresholdCount = 4,
        ///         TrafficPercentage = 20,
        ///         EndpointGroupRegion = "cn-hangzhou",
        ///         HealthCheckIntervalSeconds = 3,
        ///         HealthCheckPath = "/healthcheck",
        ///         HealthCheckPort = 9999,
        ///         HealthCheckProtocol = "http",
        ///         PortOverrides = new AliCloud.Ga.Inputs.EndpointGroupPortOverridesArgs
        ///         {
        ///             EndpointPort = 10,
        ///             ListenerPort = 60,
        ///         },
        ///         EndpointConfigurations = new[]
        ///         {
        ///             new AliCloud.Ga.Inputs.EndpointGroupEndpointConfigurationArgs
        ///             {
        ///                 Endpoint = defaultEipAddress.IpAddress,
        ///                 Type = "PublicIp",
        ///                 Weight = 20,
        ///             },
        ///         },
        ///     });
        /// 
        ///     var defaultEndpointGroups = AliCloud.Ga.GetEndpointGroups.Invoke(new()
        ///     {
        ///         AcceleratorId = defaultEndpointGroup.AcceleratorId,
        ///         Ids = new[]
        ///         {
        ///             defaultEndpointGroup.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGaEndpointGroupId"] = defaultEndpointGroups.Apply(getEndpointGroupsResult =&gt; getEndpointGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEndpointGroupsResult> Invoke(GetEndpointGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEndpointGroupsResult>("alicloud:ga/getEndpointGroups:getEndpointGroups", args ?? new GetEndpointGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public string AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
        /// </summary>
        [Input("endpointGroupType")]
        public string? EndpointGroupType { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Endpoint Group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId")]
        public string? ListenerId { get; set; }

        /// <summary>
        /// A regex string to filter results by Endpoint Group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetEndpointGroupsArgs()
        {
        }
        public static new GetEndpointGroupsArgs Empty => new GetEndpointGroupsArgs();
    }

    public sealed class GetEndpointGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator instance to which the endpoint group will be added.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The endpoint group type. Default value: `default`. Valid values: `default`, `virtual`.
        /// </summary>
        [Input("endpointGroupType")]
        public Input<string>? EndpointGroupType { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Endpoint Group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        [Input("listenerId")]
        public Input<string>? ListenerId { get; set; }

        /// <summary>
        /// A regex string to filter results by Endpoint Group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the endpoint group. Valid values: `active`, `configuring`, `creating`, `init`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetEndpointGroupsInvokeArgs()
        {
        }
        public static new GetEndpointGroupsInvokeArgs Empty => new GetEndpointGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEndpointGroupsResult
    {
        public readonly string AcceleratorId;
        public readonly string? EndpointGroupType;
        /// <summary>
        /// A list of Ga Endpoint Groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEndpointGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The ID of the listener that is associated with the endpoint group.
        /// </summary>
        public readonly string? ListenerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Endpoint Group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the endpoint group.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetEndpointGroupsResult(
            string acceleratorId,

            string? endpointGroupType,

            ImmutableArray<Outputs.GetEndpointGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? listenerId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            AcceleratorId = acceleratorId;
            EndpointGroupType = endpointGroupType;
            Groups = groups;
            Id = id;
            Ids = ids;
            ListenerId = listenerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
