// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ClickHouse
{
    public static class GetBackupPolicies
    {
        /// <summary>
        /// This data source provides the Click House Backup Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.147.0+.
        /// </summary>
        public static Task<GetBackupPoliciesResult> InvokeAsync(GetBackupPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBackupPoliciesResult>("alicloud:clickhouse/getBackupPolicies:getBackupPolicies", args ?? new GetBackupPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Click House Backup Policies of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.147.0+.
        /// </summary>
        public static Output<GetBackupPoliciesResult> Invoke(GetBackupPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBackupPoliciesResult>("alicloud:clickhouse/getBackupPolicies:getBackupPolicies", args ?? new GetBackupPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBackupPoliciesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db cluster id.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public string DbClusterId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBackupPoliciesArgs()
        {
        }
        public static new GetBackupPoliciesArgs Empty => new GetBackupPoliciesArgs();
    }

    public sealed class GetBackupPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The db cluster id.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetBackupPoliciesInvokeArgs()
        {
        }
        public static new GetBackupPoliciesInvokeArgs Empty => new GetBackupPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetBackupPoliciesResult
    {
        public readonly string DbClusterId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetBackupPoliciesPolicyResult> Policies;

        [OutputConstructor]
        private GetBackupPoliciesResult(
            string dbClusterId,

            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetBackupPoliciesPolicyResult> policies)
        {
            DbClusterId = dbClusterId;
            Id = id;
            OutputFile = outputFile;
            Policies = policies;
        }
    }
}
