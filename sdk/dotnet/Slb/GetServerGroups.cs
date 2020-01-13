// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Slb
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides the VServer groups related to a server load balancer.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/slb_server_groups.html.markdown.
        /// </summary>
        public static Task<GetServerGroupsResult> GetServerGroups(GetServerGroupsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServerGroupsResult>("alicloud:slb/getServerGroups:getServerGroups", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetServerGroupsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VServer group IDs to filter results.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// ID of the SLB.
        /// </summary>
        [Input("loadBalancerId", required: true)]
        public string LoadBalancerId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by VServer group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetServerGroupsArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetServerGroupsResult
    {
        /// <summary>
        /// A list of SLB VServer groups IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string LoadBalancerId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of SLB VServer groups names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of SLB VServer groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerGroupsSlbServerGroupsResult> SlbServerGroups;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetServerGroupsResult(
            ImmutableArray<string> ids,
            string loadBalancerId,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            ImmutableArray<Outputs.GetServerGroupsSlbServerGroupsResult> slbServerGroups,
            string id)
        {
            Ids = ids;
            LoadBalancerId = loadBalancerId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            SlbServerGroups = slbServerGroups;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetServerGroupsSlbServerGroupsResult
    {
        /// <summary>
        /// VServer group ID.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// VServer group name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// ECS instances associated to the group. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<GetServerGroupsSlbServerGroupsServersResult> Servers;

        [OutputConstructor]
        private GetServerGroupsSlbServerGroupsResult(
            string id,
            string name,
            ImmutableArray<GetServerGroupsSlbServerGroupsServersResult> servers)
        {
            Id = id;
            Name = name;
            Servers = servers;
        }
    }

    [OutputType]
    public sealed class GetServerGroupsSlbServerGroupsServersResult
    {
        /// <summary>
        /// ID of the attached ECS instance.
        /// </summary>
        public readonly string InstanceId;
        /// <summary>
        /// Weight associated to the ECS instance.
        /// </summary>
        public readonly int Weight;

        [OutputConstructor]
        private GetServerGroupsSlbServerGroupsServersResult(
            string instanceId,
            int weight)
        {
            InstanceId = instanceId;
            Weight = weight;
        }
    }
    }
}