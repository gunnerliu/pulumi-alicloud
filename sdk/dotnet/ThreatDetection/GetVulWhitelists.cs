// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ThreatDetection
{
    public static class GetVulWhitelists
    {
        /// <summary>
        /// This data source provides Threat Detection Vul Whitelists of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.195.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.ThreatDetection.GetVulWhitelists.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudThreatDetectionVulWhitelistExampleId"] = @default.Apply(getVulWhitelistsResult =&gt; getVulWhitelistsResult).Apply(@default =&gt; @default.Apply(getVulWhitelistsResult =&gt; getVulWhitelistsResult.Whitelists[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVulWhitelistsResult> InvokeAsync(GetVulWhitelistsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVulWhitelistsResult>("alicloud:threatdetection/getVulWhitelists:getVulWhitelists", args ?? new GetVulWhitelistsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Threat Detection Vul Whitelists of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.195.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = AliCloud.ThreatDetection.GetVulWhitelists.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudThreatDetectionVulWhitelistExampleId"] = @default.Apply(getVulWhitelistsResult =&gt; getVulWhitelistsResult).Apply(@default =&gt; @default.Apply(getVulWhitelistsResult =&gt; getVulWhitelistsResult.Whitelists[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVulWhitelistsResult> Invoke(GetVulWhitelistsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVulWhitelistsResult>("alicloud:threatdetection/getVulWhitelists:getVulWhitelists", args ?? new GetVulWhitelistsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVulWhitelistsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Threat Detection Vul Whitelist IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        public GetVulWhitelistsArgs()
        {
        }
        public static new GetVulWhitelistsArgs Empty => new GetVulWhitelistsArgs();
    }

    public sealed class GetVulWhitelistsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Threat Detection Vul Whitelist IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        public GetVulWhitelistsInvokeArgs()
        {
        }
        public static new GetVulWhitelistsInvokeArgs Empty => new GetVulWhitelistsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVulWhitelistsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// A list of Vul Whitelist Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVulWhitelistsWhitelistResult> Whitelists;

        [OutputConstructor]
        private GetVulWhitelistsResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            ImmutableArray<Outputs.GetVulWhitelistsWhitelistResult> whitelists)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Whitelists = whitelists;
        }
    }
}
