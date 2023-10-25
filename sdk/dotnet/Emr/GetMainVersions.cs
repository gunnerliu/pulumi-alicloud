// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Emr
{
    public static class GetMainVersions
    {
        /// <summary>
        /// The `alicloud.emr.getMainVersions` data source provides a collection of emr 
        /// main versions available in Alibaba Cloud account when create a emr cluster.
        /// 
        /// &gt; **NOTE:** Available in 1.59.0+
        /// </summary>
        public static Task<GetMainVersionsResult> InvokeAsync(GetMainVersionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMainVersionsResult>("alicloud:emr/getMainVersions:getMainVersions", args ?? new GetMainVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// The `alicloud.emr.getMainVersions` data source provides a collection of emr 
        /// main versions available in Alibaba Cloud account when create a emr cluster.
        /// 
        /// &gt; **NOTE:** Available in 1.59.0+
        /// </summary>
        public static Output<GetMainVersionsResult> Invoke(GetMainVersionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMainVersionsResult>("alicloud:emr/getMainVersions:getMainVersions", args ?? new GetMainVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMainVersionsArgs : global::Pulumi.InvokeArgs
    {
        [Input("clusterTypes")]
        private List<string>? _clusterTypes;

        /// <summary>
        /// The supported clusterType of this emr version.
        /// Possible values may be any one or combination of these: ["HADOOP", "DRUID", "KAFKA", "ZOOKEEPER", "FLINK", "CLICKHOUSE"]
        /// </summary>
        public List<string> ClusterTypes
        {
            get => _clusterTypes ?? (_clusterTypes = new List<string>());
            set => _clusterTypes = value;
        }

        /// <summary>
        /// The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
        /// </summary>
        [Input("emrVersion")]
        public string? EmrVersion { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetMainVersionsArgs()
        {
        }
        public static new GetMainVersionsArgs Empty => new GetMainVersionsArgs();
    }

    public sealed class GetMainVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("clusterTypes")]
        private InputList<string>? _clusterTypes;

        /// <summary>
        /// The supported clusterType of this emr version.
        /// Possible values may be any one or combination of these: ["HADOOP", "DRUID", "KAFKA", "ZOOKEEPER", "FLINK", "CLICKHOUSE"]
        /// </summary>
        public InputList<string> ClusterTypes
        {
            get => _clusterTypes ?? (_clusterTypes = new InputList<string>());
            set => _clusterTypes = value;
        }

        /// <summary>
        /// The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
        /// </summary>
        [Input("emrVersion")]
        public Input<string>? EmrVersion { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetMainVersionsInvokeArgs()
        {
        }
        public static new GetMainVersionsInvokeArgs Empty => new GetMainVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetMainVersionsResult
    {
        public readonly ImmutableArray<string> ClusterTypes;
        /// <summary>
        /// The version of the emr cluster instance.
        /// </summary>
        public readonly string? EmrVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of emr instance types IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of versions of the emr cluster instance. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMainVersionsMainVersionResult> MainVersions;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetMainVersionsResult(
            ImmutableArray<string> clusterTypes,

            string? emrVersion,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetMainVersionsMainVersionResult> mainVersions,

            string? outputFile)
        {
            ClusterTypes = clusterTypes;
            EmrVersion = emrVersion;
            Id = id;
            Ids = ids;
            MainVersions = mainVersions;
            OutputFile = outputFile;
        }
    }
}
