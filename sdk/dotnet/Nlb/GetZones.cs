// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb
{
    public static class GetZones
    {
        /// <summary>
        /// This data source provides the available zones with the Network Load Balancer (NLB) Instance of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.191.0+.
        /// </summary>
        public static Task<GetZonesResult> InvokeAsync(GetZonesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetZonesResult>("alicloud:nlb/getZones:getZones", args ?? new GetZonesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the available zones with the Network Load Balancer (NLB) Instance of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.191.0+.
        /// </summary>
        public static Output<GetZonesResult> Invoke(GetZonesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetZonesResult>("alicloud:nlb/getZones:getZones", args ?? new GetZonesInvokeArgs(), options.WithDefaults());
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
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetZonesZoneResult> Zones;

        [OutputConstructor]
        private GetZonesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetZonesZoneResult> zones)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Zones = zones;
        }
    }
}
