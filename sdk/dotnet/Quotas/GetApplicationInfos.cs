// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Quotas
{
    public static class GetApplicationInfos
    {
        public static Task<GetApplicationInfosResult> InvokeAsync(GetApplicationInfosArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetApplicationInfosResult>("alicloud:quotas/getApplicationInfos:getApplicationInfos", args ?? new GetApplicationInfosArgs(), options.WithVersion());
    }


    public sealed class GetApplicationInfosArgs : Pulumi.InvokeArgs
    {
        [Input("dimensions")]
        private List<Inputs.GetApplicationInfosDimensionArgs>? _dimensions;
        public List<Inputs.GetApplicationInfosDimensionArgs> Dimensions
        {
            get => _dimensions ?? (_dimensions = new List<Inputs.GetApplicationInfosDimensionArgs>());
            set => _dimensions = value;
        }

        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("keyWord")]
        public string? KeyWord { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("productCode", required: true)]
        public string ProductCode { get; set; } = null!;

        [Input("quotaActionCode")]
        public string? QuotaActionCode { get; set; }

        [Input("quotaCategory")]
        public string? QuotaCategory { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        public GetApplicationInfosArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetApplicationInfosResult
    {
        public readonly ImmutableArray<Outputs.GetApplicationInfosApplicationResult> Applications;
        public readonly ImmutableArray<Outputs.GetApplicationInfosDimensionResult> Dimensions;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? KeyWord;
        public readonly string? OutputFile;
        public readonly string ProductCode;
        public readonly string? QuotaActionCode;
        public readonly string? QuotaCategory;
        public readonly string? Status;

        [OutputConstructor]
        private GetApplicationInfosResult(
            ImmutableArray<Outputs.GetApplicationInfosApplicationResult> applications,

            ImmutableArray<Outputs.GetApplicationInfosDimensionResult> dimensions,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? keyWord,

            string? outputFile,

            string productCode,

            string? quotaActionCode,

            string? quotaCategory,

            string? status)
        {
            Applications = applications;
            Dimensions = dimensions;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            KeyWord = keyWord;
            OutputFile = outputFile;
            ProductCode = productCode;
            QuotaActionCode = quotaActionCode;
            QuotaCategory = quotaCategory;
            Status = status;
        }
    }
}
