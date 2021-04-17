// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetHpcClusters
    {
        /// <summary>
        /// This data source provides the Ecs Hpc Clusters of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.116.0+.
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
        ///         var example = Output.Create(AliCloud.Ecs.GetHpcClusters.InvokeAsync(new AliCloud.Ecs.GetHpcClustersArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "hpc-bp1i09xxxxxxxx",
        ///             },
        ///             NameRegex = "tf-testAcc",
        ///         }));
        ///         this.FirstEcsHpcClusterId = example.Apply(example =&gt; example.Clusters[0].Id);
        ///     }
        /// 
        ///     [Output("firstEcsHpcClusterId")]
        ///     public Output&lt;string&gt; FirstEcsHpcClusterId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHpcClustersResult> InvokeAsync(GetHpcClustersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetHpcClustersResult>("alicloud:ecs/getHpcClusters:getHpcClusters", args ?? new GetHpcClustersArgs(), options.WithVersion());
    }


    public sealed class GetHpcClustersArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Hpc Cluster IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Hpc Cluster name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetHpcClustersArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetHpcClustersResult
    {
        public readonly ImmutableArray<Outputs.GetHpcClustersClusterResult> Clusters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetHpcClustersResult(
            ImmutableArray<Outputs.GetHpcClustersClusterResult> clusters,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Clusters = clusters;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}