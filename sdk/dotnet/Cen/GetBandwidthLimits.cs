// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cen
{
    public static class GetBandwidthLimits
    {
        /// <summary>
        /// This data source provides CEN Bandwidth Limits available to the user.
        /// 
        /// {{% examples %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetBandwidthLimitsResult> InvokeAsync(GetBandwidthLimitsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetBandwidthLimitsResult>("alicloud:cen/getBandwidthLimits:getBandwidthLimits", args ?? new GetBandwidthLimitsArgs(), options.WithVersion());
    }


    public sealed class GetBandwidthLimitsArgs : Pulumi.InvokeArgs
    {
        [Input("instanceIds")]
        private List<string>? _instanceIds;

        /// <summary>
        /// A list of CEN instances IDs.
        /// </summary>
        public List<string> InstanceIds
        {
            get => _instanceIds ?? (_instanceIds = new List<string>());
            set => _instanceIds = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetBandwidthLimitsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetBandwidthLimitsResult
    {
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> InstanceIds;
        /// <summary>
        /// A list of CEN Bandwidth Limits. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetBandwidthLimitsLimitResult> Limits;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetBandwidthLimitsResult(
            string id,

            ImmutableArray<string> instanceIds,

            ImmutableArray<Outputs.GetBandwidthLimitsLimitResult> limits,

            string? outputFile)
        {
            Id = id;
            InstanceIds = instanceIds;
            Limits = limits;
            OutputFile = outputFile;
        }
    }
}
