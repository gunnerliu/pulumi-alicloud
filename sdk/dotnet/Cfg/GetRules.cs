// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    public static class GetRules
    {
        /// <summary>
        /// This data source provides the Config Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.99.0+.
        /// 
        /// &gt; **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.
        /// </summary>
        public static Task<GetRulesResult> InvokeAsync(GetRulesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRulesResult>("alicloud:cfg/getRules:getRules", args ?? new GetRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Config Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:**  Available in 1.99.0+.
        /// 
        /// &gt; **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.
        /// </summary>
        public static Output<GetRulesResult> Invoke(GetRulesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRulesResult>("alicloud:cfg/getRules:getRules", args ?? new GetRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRulesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
        /// </summary>
        [Input("configRuleState")]
        public string? ConfigRuleState { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        [Input("riskLevel")]
        public int? RiskLevel { get; set; }

        /// <summary>
        /// The name of config rule.
        /// </summary>
        [Input("ruleName")]
        public string? RuleName { get; set; }

        /// <summary>
        /// The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetRulesArgs()
        {
        }
        public static new GetRulesArgs Empty => new GetRulesArgs();
    }

    public sealed class GetRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Field `config_rule_state` has been deprecated from provider version 1.124.1. New field `status` instead.
        /// </summary>
        [Input("configRuleState")]
        public Input<string>? ConfigRuleState { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
        /// </summary>
        [Input("riskLevel")]
        public Input<int>? RiskLevel { get; set; }

        /// <summary>
        /// The name of config rule.
        /// </summary>
        [Input("ruleName")]
        public Input<string>? RuleName { get; set; }

        /// <summary>
        /// The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetRulesInvokeArgs()
        {
        }
        public static new GetRulesInvokeArgs Empty => new GetRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetRulesResult
    {
        /// <summary>
        /// The state of the Config Rule.
        /// </summary>
        public readonly string? ConfigRuleState;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Config Rule names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// The risk level of the Config Rule.
        /// </summary>
        public readonly int? RiskLevel;
        /// <summary>
        /// The name of the Config Rule.
        /// </summary>
        public readonly string? RuleName;
        /// <summary>
        /// A list of Config Rules. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRulesRuleResult> Rules;
        /// <summary>
        /// (Available in 1.124.1+) The status of config rule.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private GetRulesResult(
            string? configRuleState,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? riskLevel,

            string? ruleName,

            ImmutableArray<Outputs.GetRulesRuleResult> rules,

            string? status)
        {
            ConfigRuleState = configRuleState;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            RiskLevel = riskLevel;
            RuleName = ruleName;
            Rules = rules;
            Status = status;
        }
    }
}
