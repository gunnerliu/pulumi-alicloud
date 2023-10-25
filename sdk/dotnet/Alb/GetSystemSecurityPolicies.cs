// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetSystemSecurityPolicies
    {
        /// <summary>
        /// This data source provides the ALB System Security Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.183.0+.
        /// </summary>
        public static Task<GetSystemSecurityPoliciesResult> InvokeAsync(GetSystemSecurityPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemSecurityPoliciesResult>("alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies", args ?? new GetSystemSecurityPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the ALB System Security Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.183.0+.
        /// </summary>
        public static Output<GetSystemSecurityPoliciesResult> Invoke(GetSystemSecurityPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemSecurityPoliciesResult>("alicloud:alb/getSystemSecurityPolicies:getSystemSecurityPolicies", args ?? new GetSystemSecurityPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSystemSecurityPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of System Security Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetSystemSecurityPoliciesArgs()
        {
        }
        public static new GetSystemSecurityPoliciesArgs Empty => new GetSystemSecurityPoliciesArgs();
    }

    public sealed class GetSystemSecurityPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of System Security Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public GetSystemSecurityPoliciesInvokeArgs()
        {
        }
        public static new GetSystemSecurityPoliciesInvokeArgs Empty => new GetSystemSecurityPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSystemSecurityPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of System Security Policy IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of ALB Security Policies. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSystemSecurityPoliciesPolicyResult> Policies;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetSystemSecurityPoliciesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            ImmutableArray<Outputs.GetSystemSecurityPoliciesPolicyResult> policies,

            ImmutableDictionary<string, object>? tags)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Policies = policies;
            Tags = tags;
        }
    }
}
