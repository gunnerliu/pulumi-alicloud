// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetSlots
    {
        /// <summary>
        /// This data source provides the Rds Replication Slots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.204.0+.
        /// </summary>
        public static Task<GetSlotsResult> InvokeAsync(GetSlotsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSlotsResult>("alicloud:rds/getSlots:getSlots", args ?? new GetSlotsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Rds Replication Slots of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.204.0+.
        /// </summary>
        public static Output<GetSlotsResult> Invoke(GetSlotsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSlotsResult>("alicloud:rds/getSlots:getSlots", args ?? new GetSlotsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSlotsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public string DbInstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The resource group id.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        public GetSlotsArgs()
        {
        }
        public static new GetSlotsArgs Empty => new GetSlotsArgs();
    }

    public sealed class GetSlotsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db instance id.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The resource group id.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public GetSlotsInvokeArgs()
        {
        }
        public static new GetSlotsInvokeArgs Empty => new GetSlotsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSlotsResult
    {
        public readonly string DbInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        /// <summary>
        /// A list of Rds Replication Slots. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSlotsSlotResult> Slots;

        [OutputConstructor]
        private GetSlotsResult(
            string dbInstanceId,

            string id,

            string? outputFile,

            string? resourceGroupId,

            ImmutableArray<Outputs.GetSlotsSlotResult> slots)
        {
            DbInstanceId = dbInstanceId;
            Id = id;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Slots = slots;
        }
    }
}
