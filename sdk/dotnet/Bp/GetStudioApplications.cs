// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Bp
{
    public static class GetStudioApplications
    {
        /// <summary>
        /// This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.192.0+.
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
        ///     var ids = AliCloud.Bp.GetStudioApplications.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Bp.GetStudioApplications.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Application",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bpStudioApplicationId1"] = ids.Apply(getStudioApplicationsResult =&gt; getStudioApplicationsResult.Applications[0]?.Id),
        ///         ["bpStudioApplicationId2"] = nameRegex.Apply(getStudioApplicationsResult =&gt; getStudioApplicationsResult.Applications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetStudioApplicationsResult> InvokeAsync(GetStudioApplicationsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStudioApplicationsResult>("alicloud:bp/getStudioApplications:getStudioApplications", args ?? new GetStudioApplicationsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.192.0+.
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
        ///     var ids = AliCloud.Bp.GetStudioApplications.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Bp.GetStudioApplications.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Application",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["bpStudioApplicationId1"] = ids.Apply(getStudioApplicationsResult =&gt; getStudioApplicationsResult.Applications[0]?.Id),
        ///         ["bpStudioApplicationId2"] = nameRegex.Apply(getStudioApplicationsResult =&gt; getStudioApplicationsResult.Applications[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetStudioApplicationsResult> Invoke(GetStudioApplicationsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStudioApplicationsResult>("alicloud:bp/getStudioApplications:getStudioApplications", args ?? new GetStudioApplicationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStudioApplicationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Application IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The keyword of the Application.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        [Input("maxResults")]
        public int? MaxResults { get; set; }

        /// <summary>
        /// A regex string to filter results by Application name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The order type of the Application. Valid values:
        /// </summary>
        [Input("orderType")]
        public int? OrderType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the Application. Valid values: `success`, `release`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetStudioApplicationsArgs()
        {
        }
        public static new GetStudioApplicationsArgs Empty => new GetStudioApplicationsArgs();
    }

    public sealed class GetStudioApplicationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Application IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The keyword of the Application.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        [Input("maxResults")]
        public Input<int>? MaxResults { get; set; }

        /// <summary>
        /// A regex string to filter results by Application name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The order type of the Application. Valid values:
        /// </summary>
        [Input("orderType")]
        public Input<int>? OrderType { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the Application. Valid values: `success`, `release`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetStudioApplicationsInvokeArgs()
        {
        }
        public static new GetStudioApplicationsInvokeArgs Empty => new GetStudioApplicationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetStudioApplicationsResult
    {
        /// <summary>
        /// A list of Cloud Architect Design Tools (BPStudio) Applications. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStudioApplicationsApplicationResult> Applications;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly int? MaxResults;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Application names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly int? OrderType;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// The status of the Application.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetStudioApplicationsResult(
            ImmutableArray<Outputs.GetStudioApplicationsApplicationResult> applications,

            string id,

            ImmutableArray<string> ids,

            string? keyword,

            int? maxResults,

            string? nameRegex,

            ImmutableArray<string> names,

            int? orderType,

            string? outputFile,

            string? resourceGroupId,

            string? status)
        {
            Applications = applications;
            Id = id;
            Ids = ids;
            Keyword = keyword;
            MaxResults = maxResults;
            NameRegex = nameRegex;
            Names = names;
            OrderType = orderType;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
        }
    }
}
