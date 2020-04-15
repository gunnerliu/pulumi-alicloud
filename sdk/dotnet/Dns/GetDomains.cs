// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dns
{
    public static class GetDomains
    {
        /// <summary>
        /// This data source provides a list of DNS Domains in an Alibaba Cloud account according to the specified filters.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDomainsResult> InvokeAsync(GetDomainsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainsResult>("alicloud:dns/getDomains:getDomains", args ?? new GetDomainsArgs(), options.WithVersion());
    }


    public sealed class GetDomainsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies whether the domain is from Alibaba Cloud or not.
        /// </summary>
        [Input("aliDomain")]
        public bool? AliDomain { get; set; }

        /// <summary>
        /// A regex string to filter results by the domain name. 
        /// </summary>
        [Input("domainNameRegex")]
        public string? DomainNameRegex { get; set; }

        /// <summary>
        /// A regex string to filter results by the group name.
        /// </summary>
        [Input("groupNameRegex")]
        public string? GroupNameRegex { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of domain IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Cloud analysis product ID.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Id of resource group which the dns belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// Cloud analysis version code.
        /// * `ids` (Optional, Available in 1.53.0+) - A list of domain IDs.
        /// </summary>
        [Input("versionCode")]
        public string? VersionCode { get; set; }

        public GetDomainsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDomainsResult
    {
        /// <summary>
        /// Indicates whether the domain is an Alibaba Cloud domain.
        /// </summary>
        public readonly bool? AliDomain;
        public readonly string? DomainNameRegex;
        /// <summary>
        /// A list of domains. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainsDomainResult> Domains;
        public readonly string? GroupNameRegex;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of domain IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Cloud analysis product ID of the domain.
        /// </summary>
        public readonly string? InstanceId;
        /// <summary>
        /// A list of domain names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The Id of resource group which the dns belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// Cloud analysis version code of the domain.
        /// </summary>
        public readonly string? VersionCode;

        [OutputConstructor]
        private GetDomainsResult(
            bool? aliDomain,

            string? domainNameRegex,

            ImmutableArray<Outputs.GetDomainsDomainResult> domains,

            string? groupNameRegex,

            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? versionCode)
        {
            AliDomain = aliDomain;
            DomainNameRegex = domainNameRegex;
            Domains = domains;
            GroupNameRegex = groupNameRegex;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            VersionCode = versionCode;
        }
    }
}
