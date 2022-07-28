// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    public static class GetServerlessKubernetesClusters
    {
        /// <summary>
        /// This data source provides a list Container Service Serverless Kubernetes Clusters on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in 1.58.0+
        /// 
        /// &gt; **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kube_config_file_prefix`.
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
        ///         var k8sClusters = Output.Create(AliCloud.CS.GetServerlessKubernetesClusters.InvokeAsync(new AliCloud.CS.GetServerlessKubernetesClustersArgs
        ///         {
        ///             KubeConfigFilePrefix = "~/.kube/serverless",
        ///             NameRegex = "my-first-k8s",
        ///             OutputFile = "my-first-k8s-json",
        ///         }));
        ///         this.Output = k8sClusters.Apply(k8sClusters =&gt; k8sClusters.Clusters);
        ///     }
        /// 
        ///     [Output("output")]
        ///     public Output&lt;string&gt; Output { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServerlessKubernetesClustersResult> InvokeAsync(GetServerlessKubernetesClustersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServerlessKubernetesClustersResult>("alicloud:cs/getServerlessKubernetesClusters:getServerlessKubernetesClusters", args ?? new GetServerlessKubernetesClustersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list Container Service Serverless Kubernetes Clusters on Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in 1.58.0+
        /// 
        /// &gt; **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kube_config_file_prefix`.
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
        ///         var k8sClusters = Output.Create(AliCloud.CS.GetServerlessKubernetesClusters.InvokeAsync(new AliCloud.CS.GetServerlessKubernetesClustersArgs
        ///         {
        ///             KubeConfigFilePrefix = "~/.kube/serverless",
        ///             NameRegex = "my-first-k8s",
        ///             OutputFile = "my-first-k8s-json",
        ///         }));
        ///         this.Output = k8sClusters.Apply(k8sClusters =&gt; k8sClusters.Clusters);
        ///     }
        /// 
        ///     [Output("output")]
        ///     public Output&lt;string&gt; Output { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetServerlessKubernetesClustersResult> Invoke(GetServerlessKubernetesClustersInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServerlessKubernetesClustersResult>("alicloud:cs/getServerlessKubernetesClusters:getServerlessKubernetesClusters", args ?? new GetServerlessKubernetesClustersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerlessKubernetesClustersArgs : Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// Cluster IDs to filter.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. If you don't specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
        /// </summary>
        [Input("kubeConfigFilePrefix")]
        public string? KubeConfigFilePrefix { get; set; }

        /// <summary>
        /// A regex string to filter results by cluster name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetServerlessKubernetesClustersArgs()
        {
        }
    }

    public sealed class GetServerlessKubernetesClustersInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// Cluster IDs to filter.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/serverless`, then it will be named with `~/.kube/serverless-clusterID-kubeconfig`. If you don't specify this field, it will be stored in the current directory and named with `clusterID-kubeconfig`.
        /// </summary>
        [Input("kubeConfigFilePrefix")]
        public Input<string>? KubeConfigFilePrefix { get; set; }

        /// <summary>
        /// A regex string to filter results by cluster name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetServerlessKubernetesClustersInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServerlessKubernetesClustersResult
    {
        /// <summary>
        /// A list of matched Kubernetes clusters. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerlessKubernetesClustersClusterResult> Clusters;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of matched Kubernetes clusters' ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? KubeConfigFilePrefix;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of matched Kubernetes clusters' names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetServerlessKubernetesClustersResult(
            ImmutableArray<Outputs.GetServerlessKubernetesClustersClusterResult> clusters,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? kubeConfigFilePrefix,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Clusters = clusters;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            KubeConfigFilePrefix = kubeConfigFilePrefix;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
