// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides VPCs available to the user.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/vpcs.html.markdown.
        /// </summary>
        public static Task<GetNetworksResult> GetNetworks(GetNetworksArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworksResult>("alicloud:vpc/getNetworks:getNetworks", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetNetworksArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific CIDR block. For example: "172.16.0.0/12".
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VPC IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Indicate whether the VPC is the default one in the specified region.
        /// </summary>
        [Input("isDefault")]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// A regex string to filter VPCs by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which VPC belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// Filter results by a specific status. Valid value are `Pending` and `Available`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// Filter results by the specified VSwitch.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        public GetNetworksArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetNetworksResult
    {
        /// <summary>
        /// CIDR block of the VPC.
        /// </summary>
        public readonly string? CidrBlock;
        /// <summary>
        /// A list of VPC IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Whether the VPC is the default VPC in the region.
        /// </summary>
        public readonly bool? IsDefault;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of VPC names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        /// <summary>
        /// Status of the VPC.
        /// </summary>
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// A list of VPCs. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNetworksVpcsResult> Vpcs;
        public readonly string? VswitchId;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetNetworksResult(
            string? cidrBlock,
            ImmutableArray<string> ids,
            bool? isDefault,
            string? nameRegex,
            ImmutableArray<string> names,
            string? outputFile,
            string? resourceGroupId,
            string? status,
            ImmutableDictionary<string, object>? tags,
            ImmutableArray<Outputs.GetNetworksVpcsResult> vpcs,
            string? vswitchId,
            string id)
        {
            CidrBlock = cidrBlock;
            Ids = ids;
            IsDefault = isDefault;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            Vpcs = vpcs;
            VswitchId = vswitchId;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetNetworksVpcsResult
    {
        /// <summary>
        /// Filter results by a specific CIDR block. For example: "172.16.0.0/12".
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// Time of creation.
        /// </summary>
        public readonly string CreationTime;
        /// <summary>
        /// Description of the VPC
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// ID of the VPC.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Indicate whether the VPC is the default one in the specified region.
        /// </summary>
        public readonly bool IsDefault;
        /// <summary>
        /// ID of the region where the VPC is located.
        /// </summary>
        public readonly string RegionId;
        /// <summary>
        /// Route table ID of the VRouter.
        /// </summary>
        public readonly string RouteTableId;
        /// <summary>
        /// Filter results by a specific status. Valid value are `Pending` and `Available`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Name of the VPC.
        /// </summary>
        public readonly string VpcName;
        /// <summary>
        /// ID of the VRouter.
        /// </summary>
        public readonly string VrouterId;
        /// <summary>
        /// List of VSwitch IDs in the specified VPC
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;

        [OutputConstructor]
        private GetNetworksVpcsResult(
            string cidrBlock,
            string creationTime,
            string description,
            string id,
            bool isDefault,
            string regionId,
            string routeTableId,
            string status,
            string vpcName,
            string vrouterId,
            ImmutableArray<string> vswitchIds)
        {
            CidrBlock = cidrBlock;
            CreationTime = creationTime;
            Description = description;
            Id = id;
            IsDefault = isDefault;
            RegionId = regionId;
            RouteTableId = routeTableId;
            Status = status;
            VpcName = vpcName;
            VrouterId = vrouterId;
            VswitchIds = vswitchIds;
        }
    }
    }
}