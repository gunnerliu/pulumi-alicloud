// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Adb
{
    public static class GetClusters
    {
        /// <summary>
        /// The `alicloud.adb.getClusters` data source provides a collection of ADB clusters available in Alibaba Cloud account.
        /// Filters support regular expression for the cluster description, searches by tags, and other filters which are listed below.
        /// 
        /// &gt; **NOTE:** Available in v1.71.0+.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetClustersResult> InvokeAsync(GetClustersArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetClustersResult>("alicloud:adb/getClusters:getClusters", args ?? new GetClustersArgs(), options.WithVersion());
    }


    public sealed class GetClustersArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by cluster description.
        /// </summary>
        [Input("descriptionRegex")]
        public string? DescriptionRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ADB cluster IDs. 
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
        /// - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetClustersArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetClustersResult
    {
        /// <summary>
        /// A list of ADB clusters. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClustersClusterResult> Clusters;
        public readonly string? DescriptionRegex;
        /// <summary>
        /// A list of ADB cluster descriptions. 
        /// </summary>
        public readonly ImmutableArray<string> Descriptions;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of ADB cluster IDs. 
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetClustersResult(
            ImmutableArray<Outputs.GetClustersClusterResult> clusters,

            string? descriptionRegex,

            ImmutableArray<string> descriptions,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableDictionary<string, object>? tags)
        {
            Clusters = clusters;
            DescriptionRegex = descriptionRegex;
            Descriptions = descriptions;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Tags = tags;
        }
    }
}
