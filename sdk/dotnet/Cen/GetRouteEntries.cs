// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetRouteEntries
    {
        /// <summary>
        /// This data source provides CEN Route Entries available to the user.
        /// </summary>
        public static Task<GetRouteEntriesResult> InvokeAsync(GetRouteEntriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteEntriesResult>("alicloud:cen/getRouteEntries:getRouteEntries", args ?? new GetRouteEntriesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Route Entries available to the user.
        /// </summary>
        public static Output<GetRouteEntriesResult> Invoke(GetRouteEntriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteEntriesResult>("alicloud:cen/getRouteEntries:getRouteEntries", args ?? new GetRouteEntriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteEntriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The destination CIDR block of the route entry to query.
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// ID of the route table of the VPC or VBR.
        /// </summary>
        [Input("routeTableId", required: true)]
        public string RouteTableId { get; set; } = null!;

        public GetRouteEntriesArgs()
        {
        }
        public static new GetRouteEntriesArgs Empty => new GetRouteEntriesArgs();
    }

    public sealed class GetRouteEntriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The destination CIDR block of the route entry to query.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// ID of the route table of the VPC or VBR.
        /// </summary>
        [Input("routeTableId", required: true)]
        public Input<string> RouteTableId { get; set; } = null!;

        public GetRouteEntriesInvokeArgs()
        {
        }
        public static new GetRouteEntriesInvokeArgs Empty => new GetRouteEntriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteEntriesResult
    {
        /// <summary>
        /// The destination CIDR block of the conflicted route entry.
        /// </summary>
        public readonly string? CidrBlock;
        /// <summary>
        /// A list of CEN Route Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouteEntriesEntryResult> Entries;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the CEN child instance.
        /// </summary>
        public readonly string InstanceId;
        public readonly string? OutputFile;
        /// <summary>
        /// ID of the route table.
        /// </summary>
        public readonly string RouteTableId;

        [OutputConstructor]
        private GetRouteEntriesResult(
            string? cidrBlock,

            ImmutableArray<Outputs.GetRouteEntriesEntryResult> entries,

            string id,

            string instanceId,

            string? outputFile,

            string routeTableId)
        {
            CidrBlock = cidrBlock;
            Entries = entries;
            Id = id;
            InstanceId = instanceId;
            OutputFile = outputFile;
            RouteTableId = routeTableId;
        }
    }
}
