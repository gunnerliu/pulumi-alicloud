// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nlb
{
    public static class GetSecurityPolicies
    {
        /// <summary>
        /// This data source provides the Nlb Security Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.187.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Nlb.GetSecurityPolicies.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Nlb.GetSecurityPolicies.Invoke(new()
        ///     {
        ///         NameRegex = "^my-SecurityPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nlbSecurityPolicyId1"] = ids.Apply(getSecurityPoliciesResult =&gt; getSecurityPoliciesResult.Policies[0]?.Id),
        ///         ["nlbSecurityPolicyId2"] = nameRegex.Apply(getSecurityPoliciesResult =&gt; getSecurityPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetSecurityPoliciesResult> InvokeAsync(GetSecurityPoliciesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecurityPoliciesResult>("alicloud:nlb/getSecurityPolicies:getSecurityPolicies", args ?? new GetSecurityPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Nlb Security Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.187.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Nlb.GetSecurityPolicies.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Nlb.GetSecurityPolicies.Invoke(new()
        ///     {
        ///         NameRegex = "^my-SecurityPolicy",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nlbSecurityPolicyId1"] = ids.Apply(getSecurityPoliciesResult =&gt; getSecurityPoliciesResult.Policies[0]?.Id),
        ///         ["nlbSecurityPolicyId2"] = nameRegex.Apply(getSecurityPoliciesResult =&gt; getSecurityPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetSecurityPoliciesResult> Invoke(GetSecurityPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityPoliciesResult>("alicloud:nlb/getSecurityPolicies:getSecurityPolicies", args ?? new GetSecurityPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecurityPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Security Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Security Policy name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        [Input("securityPolicyNames")]
        private List<string>? _securityPolicyNames;

        /// <summary>
        /// The names of the TLS security policies.
        /// </summary>
        public List<string> SecurityPolicyNames
        {
            get => _securityPolicyNames ?? (_securityPolicyNames = new List<string>());
            set => _securityPolicyNames = value;
        }

        /// <summary>
        /// The status of the resource.
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

        public GetSecurityPoliciesArgs()
        {
        }
        public static new GetSecurityPoliciesArgs Empty => new GetSecurityPoliciesArgs();
    }

    public sealed class GetSecurityPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Security Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Security Policy name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("securityPolicyNames")]
        private InputList<string>? _securityPolicyNames;

        /// <summary>
        /// The names of the TLS security policies.
        /// </summary>
        public InputList<string> SecurityPolicyNames
        {
            get => _securityPolicyNames ?? (_securityPolicyNames = new InputList<string>());
            set => _securityPolicyNames = value;
        }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public GetSecurityPoliciesInvokeArgs()
        {
        }
        public static new GetSecurityPoliciesInvokeArgs Empty => new GetSecurityPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecurityPoliciesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetSecurityPoliciesPolicyResult> Policies;
        public readonly string? ResourceGroupId;
        public readonly ImmutableArray<string> SecurityPolicyNames;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetSecurityPoliciesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetSecurityPoliciesPolicyResult> policies,

            string? resourceGroupId,

            ImmutableArray<string> securityPolicyNames,

            string? status,

            ImmutableDictionary<string, object>? tags)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Policies = policies;
            ResourceGroupId = resourceGroupId;
            SecurityPolicyNames = securityPolicyNames;
            Status = status;
            Tags = tags;
        }
    }
}