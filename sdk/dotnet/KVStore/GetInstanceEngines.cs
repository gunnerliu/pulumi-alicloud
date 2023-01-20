// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.KVStore
{
    public static class GetInstanceEngines
    {
        /// <summary>
        /// This data source provides the KVStore instance engines resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.51.0+
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
        ///     var resourcesZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "KVStore",
        ///     });
        /// 
        ///     var resourcesInstanceEngines = AliCloud.KVStore.GetInstanceEngines.Invoke(new()
        ///     {
        ///         Engine = "Redis",
        ///         EngineVersion = "5.0",
        ///         InstanceChargeType = "PrePaid",
        ///         OutputFile = "./engines.txt",
        ///         ZoneId = resourcesZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstKvstoreInstanceClass"] = resourcesInstanceEngines.Apply(getInstanceEnginesResult =&gt; getInstanceEnginesResult.InstanceEngines[0]?.Engine),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceEnginesResult> InvokeAsync(GetInstanceEnginesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceEnginesResult>("alicloud:kvstore/getInstanceEngines:getInstanceEngines", args ?? new GetInstanceEnginesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the KVStore instance engines resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.51.0+
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
        ///     var resourcesZones = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableResourceCreation = "KVStore",
        ///     });
        /// 
        ///     var resourcesInstanceEngines = AliCloud.KVStore.GetInstanceEngines.Invoke(new()
        ///     {
        ///         Engine = "Redis",
        ///         EngineVersion = "5.0",
        ///         InstanceChargeType = "PrePaid",
        ///         OutputFile = "./engines.txt",
        ///         ZoneId = resourcesZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstKvstoreInstanceClass"] = resourcesInstanceEngines.Apply(getInstanceEnginesResult =&gt; getInstanceEnginesResult.InstanceEngines[0]?.Engine),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceEnginesResult> Invoke(GetInstanceEnginesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceEnginesResult>("alicloud:kvstore/getInstanceEngines:getInstanceEngines", args ?? new GetInstanceEnginesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceEnginesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
        /// </summary>
        [Input("engine")]
        public string? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
        /// </summary>
        [Input("engineVersion")]
        public string? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public string? InstanceChargeType { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Zone to launch the KVStore instance.
        /// </summary>
        [Input("zoneId", required: true)]
        public string ZoneId { get; set; } = null!;

        public GetInstanceEnginesArgs()
        {
        }
        public static new GetInstanceEnginesArgs Empty => new GetInstanceEnginesArgs();
    }

    public sealed class GetInstanceEnginesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Zone to launch the KVStore instance.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public GetInstanceEnginesInvokeArgs()
        {
        }
        public static new GetInstanceEnginesInvokeArgs Empty => new GetInstanceEnginesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceEnginesResult
    {
        /// <summary>
        /// Database type.
        /// </summary>
        public readonly string? Engine;
        /// <summary>
        /// KVStore Instance version.
        /// </summary>
        public readonly string? EngineVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? InstanceChargeType;
        /// <summary>
        /// A list of KVStore available instance engines. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceEnginesInstanceEngineResult> InstanceEngines;
        public readonly string? OutputFile;
        /// <summary>
        /// The Zone to launch the KVStore instance.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetInstanceEnginesResult(
            string? engine,

            string? engineVersion,

            string id,

            string? instanceChargeType,

            ImmutableArray<Outputs.GetInstanceEnginesInstanceEngineResult> instanceEngines,

            string? outputFile,

            string zoneId)
        {
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            InstanceChargeType = instanceChargeType;
            InstanceEngines = instanceEngines;
            OutputFile = outputFile;
            ZoneId = zoneId;
        }
    }
}
