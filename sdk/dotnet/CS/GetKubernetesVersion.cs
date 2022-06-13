// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CS
{
    public static class GetKubernetesVersion
    {
        /// <summary>
        /// This data source provides the details of the Kubernetes version supported by ACK.
        /// 
        /// &gt; **NOTE:** Available in 1.170.0+.
        /// </summary>
        public static Task<GetKubernetesVersionResult> InvokeAsync(GetKubernetesVersionArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesVersionResult>("alicloud:cs/getKubernetesVersion:getKubernetesVersion", args ?? new GetKubernetesVersionArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the details of the Kubernetes version supported by ACK.
        /// 
        /// &gt; **NOTE:** Available in 1.170.0+.
        /// </summary>
        public static Output<GetKubernetesVersionResult> Invoke(GetKubernetesVersionInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetKubernetesVersionResult>("alicloud:cs/getKubernetesVersion:getKubernetesVersion", args ?? new GetKubernetesVersionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubernetesVersionArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of cluster. Its valid value are `Kubernetes` and `ManagedKubernetes`.
        /// </summary>
        [Input("clusterType", required: true)]
        public string ClusterType { get; set; } = null!;

        [Input("kubernetesVersion")]
        public string? KubernetesVersion { get; set; }

        /// <summary>
        /// The profile of cluster. Its valid value are `Default`, `Serverless` and `Edge`.
        /// </summary>
        [Input("profile")]
        public string? Profile { get; set; }

        public GetKubernetesVersionArgs()
        {
        }
    }

    public sealed class GetKubernetesVersionInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The type of cluster. Its valid value are `Kubernetes` and `ManagedKubernetes`.
        /// </summary>
        [Input("clusterType", required: true)]
        public Input<string> ClusterType { get; set; } = null!;

        [Input("kubernetesVersion")]
        public Input<string>? KubernetesVersion { get; set; }

        /// <summary>
        /// The profile of cluster. Its valid value are `Default`, `Serverless` and `Edge`.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        public GetKubernetesVersionInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetKubernetesVersionResult
    {
        public readonly string ClusterType;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? KubernetesVersion;
        /// <summary>
        /// A list of metadata of kubernetes version.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKubernetesVersionMetadataResult> Metadatas;
        public readonly string? Profile;

        [OutputConstructor]
        private GetKubernetesVersionResult(
            string clusterType,

            string id,

            string? kubernetesVersion,

            ImmutableArray<Outputs.GetKubernetesVersionMetadataResult> metadatas,

            string? profile)
        {
            ClusterType = clusterType;
            Id = id;
            KubernetesVersion = kubernetesVersion;
            Metadatas = metadatas;
            Profile = profile;
        }
    }
}
