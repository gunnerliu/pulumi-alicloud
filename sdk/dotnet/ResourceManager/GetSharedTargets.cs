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
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///         var example = Output.Create(AliCloud.ResourceManager.GetSharedTargets.InvokeAsync(new AliCloud.ResourceManager.GetSharedTargetsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "15681091********",
        ///             },
        ///         }));
        ///         this.FirstResourceManagerSharedTargetId = example.Apply(example =&gt; example.Targets?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstResourceManagerSharedTargetId")]
        ///     public Output&lt;string&gt; FirstResourceManagerSharedTargetId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSharedTargetsResult> InvokeAsync(GetSharedTargetsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSharedTargetsResult>("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args ?? new GetSharedTargetsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Shared Targets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
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
        ///         var example = Output.Create(AliCloud.ResourceManager.GetSharedTargets.InvokeAsync(new AliCloud.ResourceManager.GetSharedTargetsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "15681091********",
        ///             },
        ///         }));
        ///         this.FirstResourceManagerSharedTargetId = example.Apply(example =&gt; example.Targets?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstResourceManagerSharedTargetId")]
        ///     public Output&lt;string&gt; FirstResourceManagerSharedTargetId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSharedTargetsResult> Invoke(GetSharedTargetsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSharedTargetsResult>("alicloud:resourcemanager/getSharedTargets:getSharedTargets", args ?? new GetSharedTargetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSharedTargetsArgs : Pulumi.InvokeArgs
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

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The resource shared ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public string? ResourceShareId { get; set; }

        /// <summary>
        /// The status of shared target.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetSharedTargetsArgs()
        {
        }
    }

    public sealed class GetSharedTargetsInvokeArgs : Pulumi.InvokeArgs
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

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The resource shared ID of resource manager.
        /// </summary>
        [Input("resourceShareId")]
        public Input<string>? ResourceShareId { get; set; }

        /// <summary>
        /// The status of shared target.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetSharedTargetsInvokeArgs()
        {
        }
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
        public readonly string? ResourceShareId;
        public readonly string? Status;
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
