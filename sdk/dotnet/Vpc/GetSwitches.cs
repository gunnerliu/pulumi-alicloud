// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetSwitches
    {
        /// <summary>
        /// This data source provides a list of VSwitches owned by an Alibaba Cloud account.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSwitchesResult> InvokeAsync(GetSwitchesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSwitchesResult>("alicloud:vpc/getSwitches:getSwitches", args ?? new GetSwitchesArgs(), options.WithVersion());
    }


    public sealed class GetSwitchesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Filter results by a specific CIDR block. For example: "172.16.0.0/12".
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of VSwitch IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Indicate whether the VSwitch is created by the system.
        /// </summary>
        [Input("isDefault")]
        public bool? IsDefault { get; set; }

        /// <summary>
        /// A regex string to filter results by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which VSWitch belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

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
        /// ID of the VPC that owns the VSwitch.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        /// <summary>
        /// The availability zone of the VSwitch.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetSwitchesArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSwitchesResult
    {
        /// <summary>
        /// CIDR block of the VSwitch.
        /// </summary>
        public readonly string? CidrBlock;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of VSwitch IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Whether the VSwitch is the default one in the region.
        /// </summary>
        public readonly bool? IsDefault;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of VSwitch names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly ImmutableDictionary<string, object>? Tags;
        /// <summary>
        /// ID of the VPC that owns the VSwitch.
        /// </summary>
        public readonly string? VpcId;
        /// <summary>
        /// A list of VSwitches. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSwitchesVswitchResult> Vswitches;
        /// <summary>
        /// ID of the availability zone where the VSwitch is located.
        /// </summary>
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetSwitchesResult(
            string? cidrBlock,

            string id,

            ImmutableArray<string> ids,

            bool? isDefault,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            ImmutableDictionary<string, object>? tags,

            string? vpcId,

            ImmutableArray<Outputs.GetSwitchesVswitchResult> vswitches,

            string? zoneId)
        {
            CidrBlock = cidrBlock;
            Id = id;
            Ids = ids;
            IsDefault = isDefault;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Tags = tags;
            VpcId = vpcId;
            Vswitches = vswitches;
            ZoneId = zoneId;
        }
    }
}
