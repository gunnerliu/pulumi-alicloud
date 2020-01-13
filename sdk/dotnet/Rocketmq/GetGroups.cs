// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.RocketMQ
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides a list of ONS Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.53.0+
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/ons_groups.html.markdown.
        /// </summary>
        public static Task<GetGroupsResult> GetGroups(GetGroupsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGroupsResult>("alicloud:rocketmq/getGroups:getGroups", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetGroupsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// A regex string to filter results by the group name. 
        /// </summary>
        [Input("groupIdRegex")]
        public string? GroupIdRegex { get; set; }

        /// <summary>
        /// ID of the ONS Instance that owns the groups.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetGroupsArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetGroupsResult
    {
        public readonly string? GroupIdRegex;
        /// <summary>
        /// A list of groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetGroupsGroupsResult> Groups;
        /// <summary>
        /// A list of group names.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? OutputFile;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetGroupsResult(
            string? groupIdRegex,
            ImmutableArray<Outputs.GetGroupsGroupsResult> groups,
            ImmutableArray<string> ids,
            string instanceId,
            string? outputFile,
            string id)
        {
            GroupIdRegex = groupIdRegex;
            Groups = groups;
            Ids = ids;
            InstanceId = instanceId;
            OutputFile = outputFile;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetGroupsGroupsResult
    {
        /// <summary>
        /// The name of the group.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Indicates whether namespaces are available. Read [Fields in SubscribeInfoDo](https://www.alibabacloud.com/help/doc-detail/29619.html) for further details.
        /// </summary>
        public readonly bool IndependentNaming;
        /// <summary>
        /// The ID of the group owner, which is the Alibaba Cloud UID.
        /// </summary>
        public readonly string Owner;
        /// <summary>
        /// Remark of the group.
        /// </summary>
        public readonly string Remark;

        [OutputConstructor]
        private GetGroupsGroupsResult(
            string id,
            bool independentNaming,
            string owner,
            string remark)
        {
            Id = id;
            IndependentNaming = independentNaming;
            Owner = owner;
            Remark = remark;
        }
    }
    }
}