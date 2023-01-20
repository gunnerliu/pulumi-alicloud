// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetInstanceAttachments
    {
        /// <summary>
        /// This data source provides Cen Instance Attachments of the current Alibaba Cloud User.
        /// 
        /// &gt; **NOTE:** Available in v1.97.0+.
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
        ///     var example = AliCloud.Cen.GetInstanceAttachments.Invoke(new()
        ///     {
        ///         InstanceId = "cen-o40h17ll9w********",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["theFirstAttachmentedInstanceId"] = example.Apply(getInstanceAttachmentsResult =&gt; getInstanceAttachmentsResult.Attachments[0]?.ChildInstanceId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetInstanceAttachmentsResult> InvokeAsync(GetInstanceAttachmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceAttachmentsResult>("alicloud:cen/getInstanceAttachments:getInstanceAttachments", args ?? new GetInstanceAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cen Instance Attachments of the current Alibaba Cloud User.
        /// 
        /// &gt; **NOTE:** Available in v1.97.0+.
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
        ///     var example = AliCloud.Cen.GetInstanceAttachments.Invoke(new()
        ///     {
        ///         InstanceId = "cen-o40h17ll9w********",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["theFirstAttachmentedInstanceId"] = example.Apply(getInstanceAttachmentsResult =&gt; getInstanceAttachmentsResult.Attachments[0]?.ChildInstanceId),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetInstanceAttachmentsResult> Invoke(GetInstanceAttachmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceAttachmentsResult>("alicloud:cen/getInstanceAttachments:getInstanceAttachments", args ?? new GetInstanceAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region to which the network to be queried belongs.
        /// </summary>
        [Input("childInstanceRegionId")]
        public string? ChildInstanceRegionId { get; set; }

        /// <summary>
        /// The type of the associated network. Valid values: `VPC`, `VBR` and `CCN`.
        /// </summary>
        [Input("childInstanceType")]
        public string? ChildInstanceType { get; set; }

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the Cen Child Instance Attachment. Valid value: `Attaching`, `Attached` and `Aetaching`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetInstanceAttachmentsArgs()
        {
        }
        public static new GetInstanceAttachmentsArgs Empty => new GetInstanceAttachmentsArgs();
    }

    public sealed class GetInstanceAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The region to which the network to be queried belongs.
        /// </summary>
        [Input("childInstanceRegionId")]
        public Input<string>? ChildInstanceRegionId { get; set; }

        /// <summary>
        /// The type of the associated network. Valid values: `VPC`, `VBR` and `CCN`.
        /// </summary>
        [Input("childInstanceType")]
        public Input<string>? ChildInstanceType { get; set; }

        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the Cen Child Instance Attachment. Valid value: `Attaching`, `Attached` and `Aetaching`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetInstanceAttachmentsInvokeArgs()
        {
        }
        public static new GetInstanceAttachmentsInvokeArgs Empty => new GetInstanceAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceAttachmentsResult
    {
        /// <summary>
        /// A list of CEN Instance Attachments. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceAttachmentsAttachmentResult> Attachments;
        /// <summary>
        /// The ID of the region to which the network belongs.
        /// </summary>
        public readonly string? ChildInstanceRegionId;
        /// <summary>
        /// The type of the associated network.
        /// </summary>
        public readonly string? ChildInstanceType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of CEN Instance Attachment IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        public readonly string InstanceId;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the network.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetInstanceAttachmentsResult(
            ImmutableArray<Outputs.GetInstanceAttachmentsAttachmentResult> attachments,

            string? childInstanceRegionId,

            string? childInstanceType,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? outputFile,

            string? status)
        {
            Attachments = attachments;
            ChildInstanceRegionId = childInstanceRegionId;
            ChildInstanceType = childInstanceType;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
