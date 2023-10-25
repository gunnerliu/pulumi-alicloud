// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mns
{
    public static class GetTopics
    {
        /// <summary>
        /// This data source provides a list of MNS topics in an Alibaba Cloud account according to the specified parameters.
        /// 
        /// &gt; **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_topics.
        /// </summary>
        public static Task<GetTopicsResult> InvokeAsync(GetTopicsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTopicsResult>("alicloud:mns/getTopics:getTopics", args ?? new GetTopicsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of MNS topics in an Alibaba Cloud account according to the specified parameters.
        /// 
        /// &gt; **DEPRECATED:**  This datasource has been deprecated from version `1.188.0`. Please use new datasource message_service_topics.
        /// </summary>
        public static Output<GetTopicsResult> Invoke(GetTopicsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTopicsResult>("alicloud:mns/getTopics:getTopics", args ?? new GetTopicsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTopicsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A string to filter resulting topics by their name prefixs.
        /// </summary>
        [Input("namePrefix")]
        public string? NamePrefix { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetTopicsArgs()
        {
        }
        public static new GetTopicsArgs Empty => new GetTopicsArgs();
    }

    public sealed class GetTopicsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A string to filter resulting topics by their name prefixs.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

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
        public readonly string? NamePrefix;
        /// <summary>
        /// A list of topic names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of topics. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicsTopicResult> Topics;

        [OutputConstructor]
        private GetTopicsResult(
            string id,

            string? namePrefix,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetTopicsTopicResult> topics)
        {
            Id = id;
            NamePrefix = namePrefix;
            Names = names;
            OutputFile = outputFile;
            Topics = topics;
        }
    }
}
