// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dcdn
{
    public static class GetWafRules
    {
        /// <summary>
        /// This data source provides Dcdn Waf Rule available to the user.[What is Waf Rule](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-batchcreatedcdnwafrules)
        /// 
        /// &gt; **NOTE:** Available since v1.201.0.
        /// </summary>
        public static Task<GetWafRulesResult> InvokeAsync(GetWafRulesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetWafRulesResult>("alicloud:dcdn/getWafRules:getWafRules", args ?? new GetWafRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Dcdn Waf Rule available to the user.[What is Waf Rule](https://www.alibabacloud.com/help/en/dcdn/developer-reference/api-dcdn-2018-01-15-batchcreatedcdnwafrules)
        /// 
        /// &gt; **NOTE:** Available since v1.201.0.
        /// </summary>
        public static Output<GetWafRulesResult> Invoke(GetWafRulesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetWafRulesResult>("alicloud:dcdn/getWafRules:getWafRules", args ?? new GetWafRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetWafRulesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Waf Rule IDs.
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

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The query conditions. The value is a string in the JSON format.
        /// </summary>
        [Input("queryArgs")]
        public string? QueryArgs { get; set; }

        public GetWafRulesArgs()
        {
        }
        public static new GetWafRulesArgs Empty => new GetWafRulesArgs();
    }

    public sealed class GetWafRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Waf Rule IDs.
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

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The query conditions. The value is a string in the JSON format.
        /// </summary>
        [Input("queryArgs")]
        public Input<string>? QueryArgs { get; set; }

        public GetWafRulesInvokeArgs()
        {
        }
        public static new GetWafRulesInvokeArgs Empty => new GetWafRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetWafRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? QueryArgs;
        /// <summary>
        /// A list of Waf Rule Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetWafRulesWafRuleResult> WafRules;

        [OutputConstructor]
        private GetWafRulesResult(
            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? queryArgs,

            ImmutableArray<Outputs.GetWafRulesWafRuleResult> wafRules)
        {
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            QueryArgs = queryArgs;
            WafRules = wafRules;
        }
    }
}
