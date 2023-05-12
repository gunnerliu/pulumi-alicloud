// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    public static class GetDbClusters
    {
        /// <summary>
        /// This data source provides the Click House DBCluster of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var defaultDbCluster = new AliCloud.ClickHouse.DbCluster("defaultDbCluster", new()
        ///     {
        ///         DbClusterVersion = "20.3.10.75",
        ///         Category = "Basic",
        ///         DbClusterClass = "S8",
        ///         DbClusterNetworkType = "vpc",
        ///         DbNodeGroupCount = 1,
        ///         PaymentType = "PayAsYouGo",
        ///         DbNodeStorage = "500",
        ///         StorageType = "cloud_essd",
        ///         VswitchId = "your_vswitch_id",
        ///     });
        /// 
        ///     var defaultDbClusters = AliCloud.ClickHouse.GetDbClusters.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultDbCluster.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dbCluster"] = defaultDbClusters.Apply(getDbClustersResult =&gt; getDbClustersResult.Ids[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDbClustersResult> InvokeAsync(GetDbClustersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDbClustersResult>("alicloud:clickhouse/getDbClusters:getDbClusters", args ?? new GetDbClustersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Click House DBCluster of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
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
        ///     var defaultDbCluster = new AliCloud.ClickHouse.DbCluster("defaultDbCluster", new()
        ///     {
        ///         DbClusterVersion = "20.3.10.75",
        ///         Category = "Basic",
        ///         DbClusterClass = "S8",
        ///         DbClusterNetworkType = "vpc",
        ///         DbNodeGroupCount = 1,
        ///         PaymentType = "PayAsYouGo",
        ///         DbNodeStorage = "500",
        ///         StorageType = "cloud_essd",
        ///         VswitchId = "your_vswitch_id",
        ///     });
        /// 
        ///     var defaultDbClusters = AliCloud.ClickHouse.GetDbClusters.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultDbCluster.Id,
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dbCluster"] = defaultDbClusters.Apply(getDbClustersResult =&gt; getDbClustersResult.Ids[0]),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDbClustersResult> Invoke(GetDbClustersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDbClustersResult>("alicloud:clickhouse/getDbClusters:getDbClusters", args ?? new GetDbClustersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbClustersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The DBCluster description.
        /// </summary>
        [Input("dbClusterDescription")]
        public string? DbClusterDescription { get; set; }

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

        /// <summary>
        /// The status of the DBCluster. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetDbClustersArgs()
        {
        }
        public static new GetDbClustersArgs Empty => new GetDbClustersArgs();
    }

    public sealed class GetDbClustersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The DBCluster description.
        /// </summary>
        [Input("dbClusterDescription")]
        public Input<string>? DbClusterDescription { get; set; }

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

        /// <summary>
        /// The status of the DBCluster. Valid values: `Running`,`Creating`,`Deleting`,`Restarting`,`Preparing`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetDbClustersInvokeArgs()
        {
        }
        public static new GetDbClustersInvokeArgs Empty => new GetDbClustersInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbClustersResult
    {
        public readonly ImmutableArray<Outputs.GetDbClustersClusterResult> Clusters;
        public readonly string? DbClusterDescription;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetDbClustersResult(
            ImmutableArray<Outputs.GetDbClustersClusterResult> clusters,

            string? dbClusterDescription,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? status)
        {
            Clusters = clusters;
            DbClusterDescription = dbClusterDescription;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
