// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetEips
    {
        /// <summary>
        /// This data source provides a list of EIPs (Elastic IP address) owned by an Alibaba Cloud account.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEipsResult> InvokeAsync(GetEipsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEipsResult>("alicloud:ecs/getEips:getEips", args ?? new GetEipsArgs(), options.WithVersion());
    }


    public sealed class GetEipsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of EIP IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Deprecated since the version 1.8.0 of this provider.
        /// </summary>
        [Input("inUse")]
        public bool? InUse { get; set; }

        [Input("ipAddresses")]
        private List<string>? _ipAddresses;

        /// <summary>
        /// A list of EIP public IP addresses.
        /// </summary>
        public List<string> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new List<string>());
            set => _ipAddresses = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which the eips belongs.
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

        public GetEipsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEipsResult
    {
        /// <summary>
        /// A list of EIPs. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEipsEipResult> Eips;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Optional) A list of EIP IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly bool? InUse;
        public readonly ImmutableArray<string> IpAddresses;
        /// <summary>
        /// (Optional) A list of EIP names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The Id of resource group which the eips belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetEipsResult(
            ImmutableArray<Outputs.GetEipsEipResult> eips,

            string id,

            ImmutableArray<string> ids,

            bool? inUse,

            ImmutableArray<string> ipAddresses,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            ImmutableDictionary<string, object>? tags)
        {
            Eips = eips;
            Id = id;
            Ids = ids;
            InUse = inUse;
            IpAddresses = ipAddresses;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Tags = tags;
        }
    }
}
