// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetRegionRouteEntries
    {
        /// <summary>
        /// This data source provides CEN Regional Route Entries available to the user.
        /// </summary>
        public static Task<GetRegionRouteEntriesResult> InvokeAsync(GetRegionRouteEntriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRegionRouteEntriesResult>("alicloud:cen/getRegionRouteEntries:getRegionRouteEntries", args ?? new GetRegionRouteEntriesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Regional Route Entries available to the user.
        /// </summary>
        public static Output<GetRegionRouteEntriesResult> Invoke(GetRegionRouteEntriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRegionRouteEntriesResult>("alicloud:cen/getRegionRouteEntries:getRegionRouteEntries", args ?? new GetRegionRouteEntriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegionRouteEntriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// ID of the region.
        /// </summary>
        [Input("regionId", required: true)]
        public string RegionId { get; set; } = null!;

        public GetRegionRouteEntriesArgs()
        {
        }
        public static new GetRegionRouteEntriesArgs Empty => new GetRegionRouteEntriesArgs();
    }

    public sealed class GetRegionRouteEntriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// ID of the region.
        /// </summary>
        [Input("regionId", required: true)]
        public Input<string> RegionId { get; set; } = null!;

        public GetRegionRouteEntriesInvokeArgs()
        {
        }
        public static new GetRegionRouteEntriesInvokeArgs Empty => new GetRegionRouteEntriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegionRouteEntriesResult
    {
        /// <summary>
        /// A list of CEN Route Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRegionRouteEntriesEntryResult> Entries;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        public readonly string? OutputFile;
        public readonly string RegionId;

        [OutputConstructor]
        private GetRegionRouteEntriesResult(
            ImmutableArray<Outputs.GetRegionRouteEntriesEntryResult> entries,

            string id,

            string instanceId,

            string? outputFile,

            string regionId)
        {
            Entries = entries;
            Id = id;
            InstanceId = instanceId;
            OutputFile = outputFile;
            RegionId = regionId;
        }
    }
}
