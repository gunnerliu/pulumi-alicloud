// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetZones
    {
        /// <summary>
        /// Provide  a data source to retrieve the type of zone used to create NAS file system.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///     var @default = AliCloud.Nas.GetZones.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudNasZonesId"] = @default.Apply(getZonesResult =&gt; getZonesResult).Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.ZoneId)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("alicloud:nas/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        /// <summary>
        /// Provide  a data source to retrieve the type of zone used to create NAS file system.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
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
        ///     var @default = AliCloud.Nas.GetZones.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudNasZonesId"] = @default.Apply(getZonesResult =&gt; getZonesResult).Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.ZoneId)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("alicloud:nas/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZonesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of the file system.  Valid values: `standard`, `extreme`, `cpfs`.
        /// </summary>
        [Input("fileSystemType")]
        public string? FileSystemType { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetZonesArgs()
        {
        }
        public static new GetZonesArgs Empty => new GetZonesArgs();
    }

    public sealed class GetZonesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of the file system.  Valid values: `standard`, `extreme`, `cpfs`.
        /// </summary>
        [Input("fileSystemType")]
        public Input<string>? FileSystemType { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetZonesInvokeArgs()
        {
        }
        public static new GetZonesInvokeArgs Empty => new GetZonesInvokeArgs();
    }


    [OutputType]
    public sealed class GetZonesResult
    {
        public readonly string? FileSystemType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of availability zone information collection.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            string? fileSystemType,

            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            FileSystemType = fileSystemType;
            Id = id;
            OutputFile = outputFile;
            Zones = zones;
        }
    }
}
