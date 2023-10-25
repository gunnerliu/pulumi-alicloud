// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CR
{
    public static class GetChains
    {
        /// <summary>
        /// This data source provides the Cr Chains of the current Alibaba Cloud user.
        /// 
        /// For information about CR Chains and how to use it, see [What is Chain](https://www.alibabacloud.com/help/en/doc-detail/357821.html).
        /// 
        /// &gt; **NOTE:** Available in v1.161.0+.
        /// </summary>
        public static Task<GetChainsResult> InvokeAsync(GetChainsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetChainsResult>("alicloud:cr/getChains:getChains", args ?? new GetChainsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cr Chains of the current Alibaba Cloud user.
        /// 
        /// For information about CR Chains and how to use it, see [What is Chain](https://www.alibabacloud.com/help/en/doc-detail/357821.html).
        /// 
        /// &gt; **NOTE:** Available in v1.161.0+.
        /// </summary>
        public static Output<GetChainsResult> Invoke(GetChainsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetChainsResult>("alicloud:cr/getChains:getChains", args ?? new GetChainsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetChainsArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Chain IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of CR Enterprise Edition instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Chain name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of CR Enterprise Edition repository.
        /// </summary>
        [Input("repoName")]
        public string? RepoName { get; set; }

        /// <summary>
        /// The name of CR Enterprise Edition namespace.
        /// </summary>
        [Input("repoNamespaceName")]
        public string? RepoNamespaceName { get; set; }

        public GetChainsArgs()
        {
        }
        public static new GetChainsArgs Empty => new GetChainsArgs();
    }

    public sealed class GetChainsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Chain IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of CR Enterprise Edition instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Chain name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of CR Enterprise Edition repository.
        /// </summary>
        [Input("repoName")]
        public Input<string>? RepoName { get; set; }

        /// <summary>
        /// The name of CR Enterprise Edition namespace.
        /// </summary>
        [Input("repoNamespaceName")]
        public Input<string>? RepoNamespaceName { get; set; }

        public GetChainsInvokeArgs()
        {
        }
        public static new GetChainsInvokeArgs Empty => new GetChainsInvokeArgs();
    }


    [OutputType]
    public sealed class GetChainsResult
    {
        /// <summary>
        /// A list of Cr Chains. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetChainsChainResult> Chains;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Chain IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// The ID of CR Enterprise Edition instance.
        /// </summary>
        public readonly string InstanceId;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Chain names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? RepoName;
        public readonly string? RepoNamespaceName;

        [OutputConstructor]
        private GetChainsResult(
            ImmutableArray<Outputs.GetChainsChainResult> chains,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? repoName,

            string? repoNamespaceName)
        {
            Chains = chains;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            RepoName = repoName;
            RepoNamespaceName = repoNamespaceName;
        }
    }
}
