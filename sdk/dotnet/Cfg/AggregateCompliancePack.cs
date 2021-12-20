// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    /// <summary>
    /// Provides a Cloud Config Aggregate Compliance Pack resource.
    /// 
    /// For information about Cloud Config Aggregate Compliance Pack and how to use it, see [What is Aggregate Compliance Pack](https://www.alibabacloud.com/help/en/doc-detail/194753.html).
    /// 
    /// &gt; **NOTE:** Available in v1.124.0+.
    /// 
    /// ## Example Usage
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
    ///         var config = new Config();
    ///         var name = config.Get("name") ?? "example_name";
    ///         var defaultResourceGroups = Output.Create(AliCloud.ResourceManager.GetResourceGroups.InvokeAsync(new AliCloud.ResourceManager.GetResourceGroupsArgs
    ///         {
    ///             Status = "OK",
    ///         }));
    ///         var defaultInstances = Output.Create(AliCloud.Ecs.GetInstances.InvokeAsync());
    ///         var defaultAggregator = new AliCloud.Cfg.Aggregator("defaultAggregator", new AliCloud.Cfg.AggregatorArgs
    ///         {
    ///             AggregatorAccounts = 
    ///             {
    ///                 new AliCloud.Cfg.Inputs.AggregatorAggregatorAccountArgs
    ///                 {
    ///                     AccountId = "140278452670****",
    ///                     AccountName = "test-2",
    ///                     AccountType = "ResourceDirectory",
    ///                 },
    ///             },
    ///             AggregatorName = "tf-testaccaggregator",
    ///             Description = "tf-testaccaggregator",
    ///         });
    ///         var defaultAggregateConfigRule = new AliCloud.Cfg.AggregateConfigRule("defaultAggregateConfigRule", new AliCloud.Cfg.AggregateConfigRuleArgs
    ///         {
    ///             AggregatorId = defaultAggregator.Id,
    ///             AggregateConfigRuleName = name,
    ///             SourceOwner = "ALIYUN",
    ///             SourceIdentifier = "ecs-cpu-min-count-limit",
    ///             ConfigRuleTriggerTypes = "ConfigurationItemChangeNotification",
    ///             ResourceTypesScopes = 
    ///             {
    ///                 "ACS::ECS::Instance",
    ///             },
    ///             RiskLevel = 1,
    ///             Description = name,
    ///             ExcludeResourceIdsScope = defaultInstances.Apply(defaultInstances =&gt; defaultInstances.Ids?[0]),
    ///             InputParameters = 
    ///             {
    ///                 { "cpuCount", "4" },
    ///             },
    ///             RegionIdsScope = "cn-hangzhou",
    ///             ResourceGroupIdsScope = defaultResourceGroups.Apply(defaultResourceGroups =&gt; defaultResourceGroups.Ids?[0]),
    ///             TagKeyScope = "tFTest",
    ///             TagValueScope = "forTF 123",
    ///         });
    ///         var defaultAggregateCompliancePack = new AliCloud.Cfg.AggregateCompliancePack("defaultAggregateCompliancePack", new AliCloud.Cfg.AggregateCompliancePackArgs
    ///         {
    ///             AggregateCompliancePackName = "tf-testaccConfig1234",
    ///             AggregatorId = defaultAggregator.Id,
    ///             Description = "tf-testaccConfig1234",
    ///             RiskLevel = 1,
    ///             ConfigRuleIds = 
    ///             {
    ///                 new AliCloud.Cfg.Inputs.AggregateCompliancePackConfigRuleIdArgs
    ///                 {
    ///                     ConfigRuleId = defaultAggregateConfigRule.ConfigRuleId,
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Config Aggregate Compliance Pack can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack example &lt;aggregator_id&gt;:&lt;aggregator_compliance_pack_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack")]
    public partial class AggregateCompliancePack : Pulumi.CustomResource
    {
        /// <summary>
        /// The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
        /// </summary>
        [Output("aggregateCompliancePackName")]
        public Output<string> AggregateCompliancePackName { get; private set; } = null!;

        /// <summary>
        /// The ID of aggregator.
        /// </summary>
        [Output("aggregatorId")]
        public Output<string> AggregatorId { get; private set; } = null!;

        /// <summary>
        /// The Template ID of compliance package.
        /// </summary>
        [Output("compliancePackTemplateId")]
        public Output<string?> CompliancePackTemplateId { get; private set; } = null!;

        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        [Output("configRuleIds")]
        public Output<ImmutableArray<Outputs.AggregateCompliancePackConfigRuleId>> ConfigRuleIds { get; private set; } = null!;

        /// <summary>
        /// A list of Config Rules.
        /// </summary>
        [Output("configRules")]
        public Output<ImmutableArray<Outputs.AggregateCompliancePackConfigRule>> ConfigRules { get; private set; } = null!;

        /// <summary>
        /// The description of compliance package.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
        /// </summary>
        [Output("riskLevel")]
        public Output<int> RiskLevel { get; private set; } = null!;

        /// <summary>
        /// The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a AggregateCompliancePack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AggregateCompliancePack(string name, AggregateCompliancePackArgs args, CustomResourceOptions? options = null)
            : base("alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack", name, args ?? new AggregateCompliancePackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AggregateCompliancePack(string name, Input<string> id, AggregateCompliancePackState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AggregateCompliancePack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AggregateCompliancePack Get(string name, Input<string> id, AggregateCompliancePackState? state = null, CustomResourceOptions? options = null)
        {
            return new AggregateCompliancePack(name, id, state, options);
        }
    }

    public sealed class AggregateCompliancePackArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
        /// </summary>
        [Input("aggregateCompliancePackName", required: true)]
        public Input<string> AggregateCompliancePackName { get; set; } = null!;

        /// <summary>
        /// The ID of aggregator.
        /// </summary>
        [Input("aggregatorId", required: true)]
        public Input<string> AggregatorId { get; set; } = null!;

        /// <summary>
        /// The Template ID of compliance package.
        /// </summary>
        [Input("compliancePackTemplateId")]
        public Input<string>? CompliancePackTemplateId { get; set; }

        [Input("configRuleIds")]
        private InputList<Inputs.AggregateCompliancePackConfigRuleIdArgs>? _configRuleIds;

        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        public InputList<Inputs.AggregateCompliancePackConfigRuleIdArgs> ConfigRuleIds
        {
            get => _configRuleIds ?? (_configRuleIds = new InputList<Inputs.AggregateCompliancePackConfigRuleIdArgs>());
            set => _configRuleIds = value;
        }

        [Input("configRules")]
        private InputList<Inputs.AggregateCompliancePackConfigRuleArgs>? _configRules;

        /// <summary>
        /// A list of Config Rules.
        /// </summary>
        [Obsolete(@"Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.")]
        public InputList<Inputs.AggregateCompliancePackConfigRuleArgs> ConfigRules
        {
            get => _configRules ?? (_configRules = new InputList<Inputs.AggregateCompliancePackConfigRuleArgs>());
            set => _configRules = value;
        }

        /// <summary>
        /// The description of compliance package.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
        /// </summary>
        [Input("riskLevel", required: true)]
        public Input<int> RiskLevel { get; set; } = null!;

        public AggregateCompliancePackArgs()
        {
        }
    }

    public sealed class AggregateCompliancePackState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of compliance package name. **NOTE:** the `aggregate_compliance_pack_name` supports modification since V1.145.0.
        /// </summary>
        [Input("aggregateCompliancePackName")]
        public Input<string>? AggregateCompliancePackName { get; set; }

        /// <summary>
        /// The ID of aggregator.
        /// </summary>
        [Input("aggregatorId")]
        public Input<string>? AggregatorId { get; set; }

        /// <summary>
        /// The Template ID of compliance package.
        /// </summary>
        [Input("compliancePackTemplateId")]
        public Input<string>? CompliancePackTemplateId { get; set; }

        [Input("configRuleIds")]
        private InputList<Inputs.AggregateCompliancePackConfigRuleIdGetArgs>? _configRuleIds;

        /// <summary>
        /// A list of Config Rule IDs.
        /// </summary>
        public InputList<Inputs.AggregateCompliancePackConfigRuleIdGetArgs> ConfigRuleIds
        {
            get => _configRuleIds ?? (_configRuleIds = new InputList<Inputs.AggregateCompliancePackConfigRuleIdGetArgs>());
            set => _configRuleIds = value;
        }

        [Input("configRules")]
        private InputList<Inputs.AggregateCompliancePackConfigRuleGetArgs>? _configRules;

        /// <summary>
        /// A list of Config Rules.
        /// </summary>
        [Obsolete(@"Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.")]
        public InputList<Inputs.AggregateCompliancePackConfigRuleGetArgs> ConfigRules
        {
            get => _configRules ?? (_configRules = new InputList<Inputs.AggregateCompliancePackConfigRuleGetArgs>());
            set => _configRules = value;
        }

        /// <summary>
        /// The description of compliance package.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The Risk Level. Valid values: `1`: critical `2`: warning `3`: info.
        /// </summary>
        [Input("riskLevel")]
        public Input<int>? RiskLevel { get; set; }

        /// <summary>
        /// The status of the resource. The valid values: `CREATING`, `ACTIVE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public AggregateCompliancePackState()
        {
        }
    }
}
