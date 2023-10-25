// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    public static class GetTopics
    {
        /// <summary>
        /// This data source provides a list of ALIKAFKA Topics in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.56.0+
        /// </summary>
        public static Task<GetTopicsResult> InvokeAsync(GetTopicsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTopicsResult>("alicloud:actiontrail/getTopics:getTopics", args ?? new GetTopicsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of ALIKAFKA Topics in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.56.0+
        /// </summary>
        public static Output<GetTopicsResult> Invoke(GetTopicsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTopicsResult>("alicloud:actiontrail/getTopics:getTopics", args ?? new GetTopicsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTopicsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of ALIKAFKA Topics IDs, It is formatted to `&lt;instance_id&gt;:&lt;topic&gt;`.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by the topic name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

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
        /// A topic to filter results by the topic name.
        /// </summary>
        [Input("topic")]
        public string? Topic { get; set; }

        public GetTopicsArgs()
        {
        }
        public static new GetTopicsArgs Empty => new GetTopicsArgs();
    }

    public sealed class GetTopicsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of ALIKAFKA Topics IDs, It is formatted to `&lt;instance_id&gt;:&lt;topic&gt;`.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by the topic name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

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
        /// A topic to filter results by the topic name.
        /// </summary>
        [Input("topic")]
        public Input<string>? Topic { get; set; }

        public GetTopicsInvokeArgs()
        {
        }
        public static new GetTopicsInvokeArgs Empty => new GetTopicsInvokeArgs();
    }


    [OutputType]
    public sealed class GetTopicsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The instance_id of the instance.
        /// </summary>
        public readonly string InstanceId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of topic names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// The name of the topic.
        /// </summary>
        public readonly string? Topic;
        /// <summary>
        /// A list of topics. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicsTopicResult> Topics;
        public readonly int TotalCount;

        [OutputConstructor]
        private GetTopicsResult(
            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? topic,

            ImmutableArray<Outputs.GetTopicsTopicResult> topics,

            int totalCount)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            Topic = topic;
            Topics = topics;
            TotalCount = totalCount;
        }
    }
}
