// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Adb
{
    public static class GetDBClusterLakeVersions
    {
        /// <summary>
        /// This data source provides the Adb DBCluster Lake Versions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.190.0+.
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
        ///     var ids = AliCloud.Adb.GetDBClusterLakeVersions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["adbDbClusterLakeVersionId1"] = ids.Apply(getDBClusterLakeVersionsResult =&gt; getDBClusterLakeVersionsResult.Versions[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDBClusterLakeVersionsResult> InvokeAsync(GetDBClusterLakeVersionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDBClusterLakeVersionsResult>("alicloud:adb/getDBClusterLakeVersions:getDBClusterLakeVersions", args ?? new GetDBClusterLakeVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Adb DBCluster Lake Versions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.190.0+.
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
        ///     var ids = AliCloud.Adb.GetDBClusterLakeVersions.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "example_id",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["adbDbClusterLakeVersionId1"] = ids.Apply(getDBClusterLakeVersionsResult =&gt; getDBClusterLakeVersionsResult.Versions[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDBClusterLakeVersionsResult> Invoke(GetDBClusterLakeVersionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDBClusterLakeVersionsResult>("alicloud:adb/getDBClusterLakeVersions:getDBClusterLakeVersions", args ?? new GetDBClusterLakeVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDBClusterLakeVersionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of DBCluster IDs.
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

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetDBClusterLakeVersionsArgs()
        {
        }
        public static new GetDBClusterLakeVersionsArgs Empty => new GetDBClusterLakeVersionsArgs();
    }

    public sealed class GetDBClusterLakeVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of DBCluster IDs.
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

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetDBClusterLakeVersionsInvokeArgs()
        {
        }
        public static new GetDBClusterLakeVersionsInvokeArgs Empty => new GetDBClusterLakeVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDBClusterLakeVersionsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? ResourceGroupId;
        public readonly string? Status;
        public readonly ImmutableArray<Outputs.GetDBClusterLakeVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetDBClusterLakeVersionsResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? resourceGroupId,

            string? status,

            ImmutableArray<Outputs.GetDBClusterLakeVersionsVersionResult> versions)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Versions = versions;
        }
    }
}
