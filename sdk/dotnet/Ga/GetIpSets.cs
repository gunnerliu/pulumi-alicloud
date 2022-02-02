// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetIpSets
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
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
        ///         var example = Output.Create(AliCloud.Ga.GetIpSets.InvokeAsync(new AliCloud.Ga.GetIpSetsArgs
        ///         {
        ///             AcceleratorId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.FirstGaIpSetId = example.Apply(example =&gt; example.Sets?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstGaIpSetId")]
        ///     public Output&lt;string&gt; FirstGaIpSetId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpSetsResult> InvokeAsync(GetIpSetsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetIpSetsResult>("alicloud:ga/getIpSets:getIpSets", args ?? new GetIpSetsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.113.0+.
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
        ///         var example = Output.Create(AliCloud.Ga.GetIpSets.InvokeAsync(new AliCloud.Ga.GetIpSetsArgs
        ///         {
        ///             AcceleratorId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.FirstGaIpSetId = example.Apply(example =&gt; example.Sets?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstGaIpSetId")]
        ///     public Output&lt;string&gt; FirstGaIpSetId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpSetsResult> Invoke(GetIpSetsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetIpSetsResult>("alicloud:ga/getIpSets:getIpSets", args ?? new GetIpSetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpSetsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator (GA) instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public string AcceleratorId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Ip Set IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the acceleration region.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetIpSetsArgs()
        {
        }
    }

    public sealed class GetIpSetsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Global Accelerator (GA) instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Ip Set IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the acceleration region.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetIpSetsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetIpSetsResult
    {
        public readonly string AcceleratorId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetIpSetsSetResult> Sets;
        public readonly string? Status;

        [OutputConstructor]
        private GetIpSetsResult(
            string acceleratorId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetIpSetsSetResult> sets,

            string? status)
        {
            AcceleratorId = acceleratorId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Sets = sets;
            Status = status;
        }
    }
}
