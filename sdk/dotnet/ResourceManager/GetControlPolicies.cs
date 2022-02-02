// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetControlPolicies
    {
        /// <summary>
        /// This data source provides the Resource Manager Control Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.ResourceManager.GetControlPolicies.InvokeAsync(new AliCloud.ResourceManager.GetControlPoliciesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///             NameRegex = "the_resource_name",
        ///         }));
        ///         this.FirstResourceManagerControlPolicyId = example.Apply(example =&gt; example.Policies?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstResourceManagerControlPolicyId")]
        ///     public Output&lt;string&gt; FirstResourceManagerControlPolicyId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetControlPoliciesResult> InvokeAsync(GetControlPoliciesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetControlPoliciesResult>("alicloud:resourcemanager/getControlPolicies:getControlPolicies", args ?? new GetControlPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Control Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.120.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.ResourceManager.GetControlPolicies.InvokeAsync(new AliCloud.ResourceManager.GetControlPoliciesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///             NameRegex = "the_resource_name",
        ///         }));
        ///         this.FirstResourceManagerControlPolicyId = example.Apply(example =&gt; example.Policies?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstResourceManagerControlPolicyId")]
        ///     public Output&lt;string&gt; FirstResourceManagerControlPolicyId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetControlPoliciesResult> Invoke(GetControlPoliciesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetControlPoliciesResult>("alicloud:resourcemanager/getControlPolicies:getControlPolicies", args ?? new GetControlPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetControlPoliciesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Control Policy IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
        /// </summary>
        [Input("language")]
        public string? Language { get; set; }

        /// <summary>
        /// A regex string to filter results by Control Policy name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The type of policy.
        /// </summary>
        [Input("policyType")]
        public string? PolicyType { get; set; }

        public GetControlPoliciesArgs()
        {
        }
    }

    public sealed class GetControlPoliciesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Control Policy IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The language. Valid value `zh-CN`, `en`, and `ja`. Default value `zh-CN`.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// A regex string to filter results by Control Policy name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The type of policy.
        /// </summary>
        [Input("policyType")]
        public Input<string>? PolicyType { get; set; }

        public GetControlPoliciesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetControlPoliciesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Language;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetControlPoliciesPolicyResult> Policies;
        public readonly string? PolicyType;

        [OutputConstructor]
        private GetControlPoliciesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? language,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetControlPoliciesPolicyResult> policies,

            string? policyType)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Language = language;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Policies = policies;
            PolicyType = policyType;
        }
    }
}
