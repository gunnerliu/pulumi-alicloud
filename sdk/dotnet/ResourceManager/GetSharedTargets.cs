// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetSharedTargets
    {
        /// <summary>
        /// This data source provides the Resource Manager Shared Targets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.111.0.
        /// </summary>
        public static Task<GetSharedTargetsResult> InvokeAsync(GetSharedTargetsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSharedTargetsResult>("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args ?? new GetSharedTargetsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Shared Targets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available since v1.111.0.
        /// </summary>
        public static Output<GetSharedTargetsResult> Invoke(GetSharedTargetsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSharedTargetsResult>("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args ?? new GetSharedTargetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharedTargetsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Shared Target IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The resource share ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public string? ResourceShareId { get; set; }

        /// <summary>
        /// The status of share resource. Valid values: `Associated`, `Associating`, `Disassociated`, `Disassociating` and `Failed`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetSharedTargetsArgs()
        {
        }
        public static new GetSharedTargetsArgs Empty => new GetSharedTargetsArgs();
    }

    public sealed class GetSharedTargetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Shared Target IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The resource share ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public Input<string>? ResourceShareId { get; set; }

        /// <summary>
        /// The status of share resource. Valid values: `Associated`, `Associating`, `Disassociated`, `Disassociating` and `Failed`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetSharedTargetsInvokeArgs()
        {
        }
        public static new GetSharedTargetsInvokeArgs Empty => new GetSharedTargetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSharedTargetsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// The resource shared ID of resource manager.
        /// </summary>
        public readonly string? ResourceShareId;
        /// <summary>
        /// The status of shared target.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// A list of Resource Manager Shared Targets. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSharedTargetsTargetResult> Targets;

        [OutputConstructor]
        private GetSharedTargetsResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? resourceShareId,

            string? status,

            ImmutableArray<Outputs.GetSharedTargetsTargetResult> targets)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ResourceShareId = resourceShareId;
            Status = status;
            Targets = targets;
        }
    }
}
