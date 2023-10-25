// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dfs
{
    public static class GetZones
    {
        /// <summary>
        /// This data source provides the DFS Zones And Configurations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("alicloud:dfs/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the DFS Zones And Configurations of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("alicloud:dfs/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetZonesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
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
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
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
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            Id = id;
            OutputFile = outputFile;
            Zones = zones;
        }
    }
}
