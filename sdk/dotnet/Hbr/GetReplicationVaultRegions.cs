// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Hbr
{
    public static class GetReplicationVaultRegions
    {
        /// <summary>
        /// This data source provides the HBR Replication Vault Regions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
        /// </summary>
        public static Task<GetReplicationVaultRegionsResult> InvokeAsync(GetReplicationVaultRegionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetReplicationVaultRegionsResult>("alicloud:hbr/getReplicationVaultRegions:getReplicationVaultRegions", args ?? new GetReplicationVaultRegionsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the HBR Replication Vault Regions of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.152.0+.
        /// </summary>
        public static Output<GetReplicationVaultRegionsResult> Invoke(GetReplicationVaultRegionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetReplicationVaultRegionsResult>("alicloud:hbr/getReplicationVaultRegions:getReplicationVaultRegions", args ?? new GetReplicationVaultRegionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetReplicationVaultRegionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetReplicationVaultRegionsArgs()
        {
        }
        public static new GetReplicationVaultRegionsArgs Empty => new GetReplicationVaultRegionsArgs();
    }

    public sealed class GetReplicationVaultRegionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetReplicationVaultRegionsInvokeArgs()
        {
        }
        public static new GetReplicationVaultRegionsInvokeArgs Empty => new GetReplicationVaultRegionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetReplicationVaultRegionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetReplicationVaultRegionsRegionResult> Regions;

        [OutputConstructor]
        private GetReplicationVaultRegionsResult(
            string id,

            string? outputFile,

            ImmutableArray<Outputs.GetReplicationVaultRegionsRegionResult> regions)
        {
            Id = id;
            OutputFile = outputFile;
            Regions = regions;
        }
    }
}
