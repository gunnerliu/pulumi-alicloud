// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.CloudStorageGateway
{
    public static class GetGatewayCacheDisks
    {
        /// <summary>
        /// This data source provides the Cloud Storage Gateway Gateway Cache Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.144.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.CloudStorageGateway.GetGatewayCacheDisks.InvokeAsync(new AliCloud.CloudStorageGateway.GetGatewayCacheDisksArgs
        ///         {
        ///             GatewayId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.CloudStorageGatewayGatewayCacheDiskId1 = ids.Apply(ids =&gt; ids.Disks?[0]?.Id);
        ///         var status = Output.Create(AliCloud.CloudStorageGateway.GetGatewayCacheDisks.InvokeAsync(new AliCloud.CloudStorageGateway.GetGatewayCacheDisksArgs
        ///         {
        ///             GatewayId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///             Status = 0,
        ///         }));
        ///         this.CloudStorageGatewayGatewayCacheDiskId2 = status.Apply(status =&gt; status.Disks?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cloudStorageGatewayGatewayCacheDiskId1")]
        ///     public Output&lt;string&gt; CloudStorageGatewayGatewayCacheDiskId1 { get; set; }
        ///     [Output("cloudStorageGatewayGatewayCacheDiskId2")]
        ///     public Output&lt;string&gt; CloudStorageGatewayGatewayCacheDiskId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGatewayCacheDisksResult> InvokeAsync(GetGatewayCacheDisksArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGatewayCacheDisksResult>("alicloud:cloudstoragegateway/getGatewayCacheDisks:getGatewayCacheDisks", args ?? new GetGatewayCacheDisksArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Cloud Storage Gateway Gateway Cache Disks of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.144.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.CloudStorageGateway.GetGatewayCacheDisks.InvokeAsync(new AliCloud.CloudStorageGateway.GetGatewayCacheDisksArgs
        ///         {
        ///             GatewayId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.CloudStorageGatewayGatewayCacheDiskId1 = ids.Apply(ids =&gt; ids.Disks?[0]?.Id);
        ///         var status = Output.Create(AliCloud.CloudStorageGateway.GetGatewayCacheDisks.InvokeAsync(new AliCloud.CloudStorageGateway.GetGatewayCacheDisksArgs
        ///         {
        ///             GatewayId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///             Status = 0,
        ///         }));
        ///         this.CloudStorageGatewayGatewayCacheDiskId2 = status.Apply(status =&gt; status.Disks?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cloudStorageGatewayGatewayCacheDiskId1")]
        ///     public Output&lt;string&gt; CloudStorageGatewayGatewayCacheDiskId1 { get; set; }
        ///     [Output("cloudStorageGatewayGatewayCacheDiskId2")]
        ///     public Output&lt;string&gt; CloudStorageGatewayGatewayCacheDiskId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGatewayCacheDisksResult> Invoke(GetGatewayCacheDisksInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetGatewayCacheDisksResult>("alicloud:cloudstoragegateway/getGatewayCacheDisks:getGatewayCacheDisks", args ?? new GetGatewayCacheDisksInvokeArgs(), options.WithVersion());
    }


    public sealed class GetGatewayCacheDisksArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the gateway.
        /// </summary>
        [Input("gatewayId", required: true)]
        public string GatewayId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Gateway Cache Disk IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public int? Status { get; set; }

        public GetGatewayCacheDisksArgs()
        {
        }
    }

    public sealed class GetGatewayCacheDisksInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the gateway.
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Gateway Cache Disk IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public GetGatewayCacheDisksInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetGatewayCacheDisksResult
    {
        public readonly ImmutableArray<Outputs.GetGatewayCacheDisksDiskResult> Disks;
        public readonly string GatewayId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? Status;

        [OutputConstructor]
        private GetGatewayCacheDisksResult(
            ImmutableArray<Outputs.GetGatewayCacheDisksDiskResult> disks,

            string gatewayId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? status)
        {
            Disks = disks;
            GatewayId = gatewayId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
        }
    }
}