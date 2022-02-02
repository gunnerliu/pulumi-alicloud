// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetTransitRouterRouteTableAssociations
    {
        /// <summary>
        /// This data source provides CEN Transit Router Route Table Associations available to the user.[What is Cen Transit Router Route Table Associations](https://help.aliyun.com/document_detail/261243.html)
        /// 
        /// &gt; **NOTE:** Available in 1.126.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.Cen.GetTransitRouterRouteTableAssociations.InvokeAsync(new AliCloud.Cen.GetTransitRouterRouteTableAssociationsArgs
        ///         {
        ///             TransitRouterRouteTableId = "rtb-id1",
        ///         }));
        ///         this.FirstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType = @default.Apply(@default =&gt; @default.Associations?[0]?.ResourceType);
        ///     }
        /// 
        ///     [Output("firstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType")]
        ///     public Output&lt;string&gt; FirstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTransitRouterRouteTableAssociationsResult> InvokeAsync(GetTransitRouterRouteTableAssociationsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTransitRouterRouteTableAssociationsResult>("alicloud:cen/getTransitRouterRouteTableAssociations:getTransitRouterRouteTableAssociations", args ?? new GetTransitRouterRouteTableAssociationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides CEN Transit Router Route Table Associations available to the user.[What is Cen Transit Router Route Table Associations](https://help.aliyun.com/document_detail/261243.html)
        /// 
        /// &gt; **NOTE:** Available in 1.126.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.Cen.GetTransitRouterRouteTableAssociations.InvokeAsync(new AliCloud.Cen.GetTransitRouterRouteTableAssociationsArgs
        ///         {
        ///             TransitRouterRouteTableId = "rtb-id1",
        ///         }));
        ///         this.FirstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType = @default.Apply(@default =&gt; @default.Associations?[0]?.ResourceType);
        ///     }
        /// 
        ///     [Output("firstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType")]
        ///     public Output&lt;string&gt; FirstTransitRouterPeerAttachmentsTransitRouterAttachmentResourceType { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTransitRouterRouteTableAssociationsResult> Invoke(GetTransitRouterRouteTableAssociationsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTransitRouterRouteTableAssociationsResult>("alicloud:cen/getTransitRouterRouteTableAssociations:getTransitRouterRouteTableAssociations", args ?? new GetTransitRouterRouteTableAssociationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTransitRouterRouteTableAssociationsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of CEN Transit Router Route Table Association IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the route table, including `Active`, `Associating`, `Dissociating`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// ID of the route table of the VPC or VBR.
        /// </summary>
        [Input("transitRouterRouteTableId", required: true)]
        public string TransitRouterRouteTableId { get; set; } = null!;

        public GetTransitRouterRouteTableAssociationsArgs()
        {
        }
    }

    public sealed class GetTransitRouterRouteTableAssociationsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of CEN Transit Router Route Table Association IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the route table, including `Active`, `Associating`, `Dissociating`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// ID of the route table of the VPC or VBR.
        /// </summary>
        [Input("transitRouterRouteTableId", required: true)]
        public Input<string> TransitRouterRouteTableId { get; set; } = null!;

        public GetTransitRouterRouteTableAssociationsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetTransitRouterRouteTableAssociationsResult
    {
        /// <summary>
        /// A list of CEN Transit Router Route Table Associations. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTransitRouterRouteTableAssociationsAssociationResult> Associations;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of CEN Transit Router Route Table Association IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// The status of the route table.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// ID of the transit router route table.
        /// </summary>
        public readonly string TransitRouterRouteTableId;

        [OutputConstructor]
        private GetTransitRouterRouteTableAssociationsResult(
            ImmutableArray<Outputs.GetTransitRouterRouteTableAssociationsAssociationResult> associations,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? status,

            string transitRouterRouteTableId)
        {
            Associations = associations;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
            TransitRouterRouteTableId = transitRouterRouteTableId;
        }
    }
}
