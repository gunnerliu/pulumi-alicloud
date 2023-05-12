// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ExpressConnect
{
    public static class GetGrantRuleToCens
    {
        /// <summary>
        /// This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.ExpressConnect.GetGrantRuleToCens.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         InstanceId = "your_vbr_instance_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["expressConnectGrantRuleToCenId0"] = ids.Apply(getGrantRuleToCensResult =&gt; getGrantRuleToCensResult.Cens[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetGrantRuleToCensResult> InvokeAsync(GetGrantRuleToCensArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetGrantRuleToCensResult>("alicloud:expressconnect/getGrantRuleToCens:getGrantRuleToCens", args ?? new GetGrantRuleToCensArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Express Connect Grant Rule To Cens of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.ExpressConnect.GetGrantRuleToCens.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///         InstanceId = "your_vbr_instance_id",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["expressConnectGrantRuleToCenId0"] = ids.Apply(getGrantRuleToCensResult =&gt; getGrantRuleToCensResult.Cens[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetGrantRuleToCensResult> Invoke(GetGrantRuleToCensInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetGrantRuleToCensResult>("alicloud:expressconnect/getGrantRuleToCens:getGrantRuleToCens", args ?? new GetGrantRuleToCensInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGrantRuleToCensArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Grant Rule To Cen IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the VBR.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetGrantRuleToCensArgs()
        {
        }
        public static new GetGrantRuleToCensArgs Empty => new GetGrantRuleToCensArgs();
    }

    public sealed class GetGrantRuleToCensInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Grant Rule To Cen IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the VBR.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetGrantRuleToCensInvokeArgs()
        {
        }
        public static new GetGrantRuleToCensInvokeArgs Empty => new GetGrantRuleToCensInvokeArgs();
    }


    [OutputType]
    public sealed class GetGrantRuleToCensResult
    {
        /// <summary>
        /// A list of Express Connect Grant Rule To Cens. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGrantRuleToCensCenResult> Cens;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;

        [OutputConstructor]
        private GetGrantRuleToCensResult(
            ImmutableArray<Outputs.GetGrantRuleToCensCenResult> cens,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? outputFile,

            int? pageNumber,

            int? pageSize)
        {
            Cens = cens;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
        }
    }
}
