// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetPolicyVersions
    {
        /// <summary>
        /// This data source provides the Resource Manager Policy Versions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.85.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.ResourceManager.GetPolicyVersions.InvokeAsync(new AliCloud.ResourceManager.GetPolicyVersionsArgs
        ///         {
        ///             PolicyName = "tftest",
        ///             PolicyType = "Custom",
        ///         }));
        ///         this.FirstPolicyVersionId = @default.Apply(@default =&gt; @default.Versions?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstPolicyVersionId")]
        ///     public Output&lt;string&gt; FirstPolicyVersionId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPolicyVersionsResult> InvokeAsync(GetPolicyVersionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetPolicyVersionsResult>("alicloud:resourcemanager/getPolicyVersions:getPolicyVersions", args ?? new GetPolicyVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Policy Versions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.85.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var @default = Output.Create(AliCloud.ResourceManager.GetPolicyVersions.InvokeAsync(new AliCloud.ResourceManager.GetPolicyVersionsArgs
        ///         {
        ///             PolicyName = "tftest",
        ///             PolicyType = "Custom",
        ///         }));
        ///         this.FirstPolicyVersionId = @default.Apply(@default =&gt; @default.Versions?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstPolicyVersionId")]
        ///     public Output&lt;string&gt; FirstPolicyVersionId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPolicyVersionsResult> Invoke(GetPolicyVersionsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetPolicyVersionsResult>("alicloud:resourcemanager/getPolicyVersions:getPolicyVersions", args ?? new GetPolicyVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPolicyVersionsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// -(Optional, Available in v1.114.0+) Default to `false`. Set it to true can output more details.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of policy version IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public string PolicyName { get; set; } = null!;

        /// <summary>
        /// The type of the policy. Valid values:`Custom` and `System`.
        /// </summary>
        [Input("policyType", required: true)]
        public string PolicyType { get; set; } = null!;

        public GetPolicyVersionsArgs()
        {
        }
    }

    public sealed class GetPolicyVersionsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// -(Optional, Available in v1.114.0+) Default to `false`. Set it to true can output more details.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of policy version IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The name of the policy.
        /// </summary>
        [Input("policyName", required: true)]
        public Input<string> PolicyName { get; set; } = null!;

        /// <summary>
        /// The type of the policy. Valid values:`Custom` and `System`.
        /// </summary>
        [Input("policyType", required: true)]
        public Input<string> PolicyType { get; set; } = null!;

        public GetPolicyVersionsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetPolicyVersionsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of policy version IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string PolicyName;
        public readonly string PolicyType;
        /// <summary>
        /// A list of policy versions. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPolicyVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetPolicyVersionsResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string policyName,

            string policyType,

            ImmutableArray<Outputs.GetPolicyVersionsVersionResult> versions)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PolicyName = policyName;
            PolicyType = policyType;
            Versions = versions;
        }
    }
}
