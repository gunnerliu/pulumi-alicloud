// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Waf
{
    public static class GetDomains
    {
        /// <summary>
        /// Provides a WAF datasource to retrieve domains.
        /// 
        /// For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).
        /// 
        /// &gt; **NOTE:** Available in 1.86.0+ .
        /// </summary>
        public static Task<GetDomainsResult> InvokeAsync(GetDomainsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainsResult>("alicloud:waf/getDomains:getDomains", args ?? new GetDomainsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a WAF datasource to retrieve domains.
        /// 
        /// For information about WAF and how to use it, see [What is Alibaba Cloud WAF](https://www.alibabacloud.com/help/doc-detail/28517.htm).
        /// 
        /// &gt; **NOTE:** Available in 1.86.0+ .
        /// </summary>
        public static Output<GetDomainsResult> Invoke(GetDomainsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainsResult>("alicloud:waf/getDomains:getDomains", args ?? new GetDomainsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to false and only output `id`, `domain_name`. Set it to true can output more details.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of WAF domain names. Each item is domain name.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The Id of waf instance to which waf domain belongs.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by domain name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the queried domain belongs in Resource Management.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        public GetDomainsArgs()
        {
        }
        public static new GetDomainsArgs Empty => new GetDomainsArgs();
    }

    public sealed class GetDomainsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to false and only output `id`, `domain_name`. Set it to true can output more details.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of WAF domain names. Each item is domain name.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The Id of waf instance to which waf domain belongs.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by domain name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the queried domain belongs in Resource Management.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        public GetDomainsInvokeArgs()
        {
        }
        public static new GetDomainsInvokeArgs Empty => new GetDomainsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainsResult
    {
        /// <summary>
        /// A list of Domains. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDomainsDomainResult> Domains;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of WAF domain self ID, value as `domain_name`.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of WAF domain names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The ID of the resource group to which the queried domain belongs in Resource Management.
        /// </summary>
        public readonly string? ResourceGroupId;

        [OutputConstructor]
        private GetDomainsResult(
            ImmutableArray<Outputs.GetDomainsDomainResult> domains,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId)
        {
            Domains = domains;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
        }
    }
}
