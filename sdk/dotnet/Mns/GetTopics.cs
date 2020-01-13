// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mns
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides a list of MNS topics in an Alibaba Cloud account according to the specified parameters.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/mns_topics.html.markdown.
        /// </summary>
        public static Task<GetTopicsResult> GetTopics(GetTopicsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTopicsResult>("alicloud:mns/getTopics:getTopics", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetTopicsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A string to filter resulting topics by their name prefixs.
        /// </summary>
        [Input("namePrefix")]
        public string? NamePrefix { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetTopicsArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetTopicsResult
    {
        public readonly string? NamePrefix;
        /// <summary>
        /// A list of topic names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of topics. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetTopicsTopicsResult> Topics;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetTopicsResult(
            string? namePrefix,
            ImmutableArray<string> names,
            string? outputFile,
            ImmutableArray<Outputs.GetTopicsTopicsResult> topics,
            string id)
        {
            NamePrefix = namePrefix;
            Names = names;
            OutputFile = outputFile;
            Topics = topics;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetTopicsTopicsResult
    {
        /// <summary>
        /// The id of the topic. The value is set to `name`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether to enable logging.
        /// </summary>
        public readonly bool LoggingEnabled;
        /// <summary>
        /// This indicates the maximum length, in bytes, of any message body sent to the topic.
        /// </summary>
        public readonly int MaximumMessageSize;
        /// <summary>
        /// The name of the topic.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetTopicsTopicsResult(
            string id,
            bool loggingEnabled,
            int maximumMessageSize,
            string name)
        {
            Id = id;
            LoggingEnabled = loggingEnabled;
            MaximumMessageSize = maximumMessageSize;
            Name = name;
        }
    }
    }
}