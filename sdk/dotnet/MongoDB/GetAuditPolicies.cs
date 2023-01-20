// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    public static class GetAuditPolicies
    {
        /// <summary>
        /// This data source provides the Mongodb Audit Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var example = AliCloud.MongoDB.GetAuditPolicies.Invoke(new()
        ///     {
        ///         DbInstanceId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbAuditPolicyId1"] = example.Apply(getAuditPoliciesResult =&gt; getAuditPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAuditPoliciesResult> InvokeAsync(GetAuditPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAuditPoliciesResult>("alicloud:mongodb/getAuditPolicies:getAuditPolicies", args ?? new GetAuditPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Mongodb Audit Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.148.0+.
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
        ///     var example = AliCloud.MongoDB.GetAuditPolicies.Invoke(new()
        ///     {
        ///         DbInstanceId = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbAuditPolicyId1"] = example.Apply(getAuditPoliciesResult =&gt; getAuditPoliciesResult.Policies[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAuditPoliciesResult> Invoke(GetAuditPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAuditPoliciesResult>("alicloud:mongodb/getAuditPolicies:getAuditPolicies", args ?? new GetAuditPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAuditPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public string DbInstanceId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetAuditPoliciesArgs()
        {
        }
        public static new GetAuditPoliciesArgs Empty => new GetAuditPoliciesArgs();
    }

    public sealed class GetAuditPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the instance.
        /// </summary>
        [Input("dbInstanceId", required: true)]
        public Input<string> DbInstanceId { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetAuditPoliciesInvokeArgs()
        {
        }
        public static new GetAuditPoliciesInvokeArgs Empty => new GetAuditPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAuditPoliciesResult
    {
        public readonly string DbInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetAuditPoliciesPolicyResult> Policies;

        [OutputConstructor]
        private GetAuditPoliciesResult(
            string dbInstanceId,

            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetAuditPoliciesPolicyResult> policies)
        {
            DbInstanceId = dbInstanceId;
            Id = id;
            OutputFile = outputFile;
            Policies = policies;
        }
    }
}
