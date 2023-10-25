// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetChildInstanceRouteEntryToAttachments
    {
        /// <summary>
        /// This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcenchildinstancerouteentrytoattachment)
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
        /// </summary>
        public static Task<GetChildInstanceRouteEntryToAttachmentsResult> InvokeAsync(GetChildInstanceRouteEntryToAttachmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetChildInstanceRouteEntryToAttachmentsResult>("alicloud:cen/getChildInstanceRouteEntryToAttachments:getChildInstanceRouteEntryToAttachments", args ?? new GetChildInstanceRouteEntryToAttachmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcenchildinstancerouteentrytoattachment)
        /// 
        /// &gt; **NOTE:** Available in 1.195.0+
        /// </summary>
        public static Output<GetChildInstanceRouteEntryToAttachmentsResult> Invoke(GetChildInstanceRouteEntryToAttachmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetChildInstanceRouteEntryToAttachmentsResult>("alicloud:cen/getChildInstanceRouteEntryToAttachments:getChildInstanceRouteEntryToAttachments", args ?? new GetChildInstanceRouteEntryToAttachmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetChildInstanceRouteEntryToAttachmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public string? CenId { get; set; }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("childInstanceRouteTableId", required: true)]
        public string ChildInstanceRouteTableId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// Limit search to a list of specific IDs.The value is formulated as `&lt;cen_id&gt;:&lt;child_instance_route_table_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;destination_cidr_block&gt;`.
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
        /// ServiceType
        /// </summary>
        [Input("serviceType")]
        public string? ServiceType { get; set; }

        /// <summary>
        /// TransitRouterAttachmentId
        /// </summary>
        [Input("transitRouterAttachmentId", required: true)]
        public string TransitRouterAttachmentId { get; set; } = null!;

        public GetChildInstanceRouteEntryToAttachmentsArgs()
        {
        }
        public static new GetChildInstanceRouteEntryToAttachmentsArgs Empty => new GetChildInstanceRouteEntryToAttachmentsArgs();
    }

    public sealed class GetChildInstanceRouteEntryToAttachmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        [Input("cenId")]
        public Input<string>? CenId { get; set; }

        /// <summary>
        /// The first ID of the resource
        /// </summary>
        [Input("childInstanceRouteTableId", required: true)]
        public Input<string> ChildInstanceRouteTableId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// Limit search to a list of specific IDs.The value is formulated as `&lt;cen_id&gt;:&lt;child_instance_route_table_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;destination_cidr_block&gt;`.
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
        /// ServiceType
        /// </summary>
        [Input("serviceType")]
        public Input<string>? ServiceType { get; set; }

        /// <summary>
        /// TransitRouterAttachmentId
        /// </summary>
        [Input("transitRouterAttachmentId", required: true)]
        public Input<string> TransitRouterAttachmentId { get; set; } = null!;

        public GetChildInstanceRouteEntryToAttachmentsInvokeArgs()
        {
        }
        public static new GetChildInstanceRouteEntryToAttachmentsInvokeArgs Empty => new GetChildInstanceRouteEntryToAttachmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetChildInstanceRouteEntryToAttachmentsResult
    {
        /// <summary>
        /// A list of Child Instance Route Entry To Attachment Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetChildInstanceRouteEntryToAttachmentsAttachmentResult> Attachments;
        /// <summary>
        /// The ID of the CEN instance.
        /// </summary>
        public readonly string? CenId;
        /// <summary>
        /// The first ID of the resource
        /// </summary>
        public readonly string ChildInstanceRouteTableId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Limit search to a list of specific IDs.The value is formulated as `&lt;cen_id&gt;:&lt;child_instance_route_table_id&gt;:&lt;transit_router_attachment_id&gt;:&lt;destination_cidr_block&gt;`.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// ServiceType
        /// </summary>
        public readonly string? ServiceType;
        /// <summary>
        /// TransitRouterAttachmentId
        /// </summary>
        public readonly string TransitRouterAttachmentId;

        [OutputConstructor]
        private GetChildInstanceRouteEntryToAttachmentsResult(
            ImmutableArray<Outputs.GetChildInstanceRouteEntryToAttachmentsAttachmentResult> attachments,

            string? cenId,

            string childInstanceRouteTableId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? serviceType,

            string transitRouterAttachmentId)
        {
            Attachments = attachments;
            CenId = cenId;
            ChildInstanceRouteTableId = childInstanceRouteTableId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            ServiceType = serviceType;
            TransitRouterAttachmentId = transitRouterAttachmentId;
        }
    }
}
