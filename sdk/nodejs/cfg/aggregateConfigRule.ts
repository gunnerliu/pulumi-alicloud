// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Config Aggregate Config Rule resource.
 *
 * For information about Cloud Config Aggregate Config Rule and how to use it, see [What is Aggregate Config Rule](https://www.alibabacloud.com/help/doc-detail/154216.html).
 *
 * > **NOTE:** Available in v1.124.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const exampleAggregator = new alicloud.cfg.Aggregator("exampleAggregator", {
 *     aggregatorAccounts: [{
 *         accountId: "140278452670****",
 *         accountName: "test-2",
 *         accountType: "ResourceDirectory",
 *     }],
 *     aggregatorName: "tf-testaccaggregator",
 *     description: "tf-testaccaggregator",
 * });
 * const exampleAggregateConfigRule = new alicloud.cfg.AggregateConfigRule("exampleAggregateConfigRule", {
 *     aggregateConfigRuleName: "tf-testaccconfig1234",
 *     aggregatorId: exampleAggregator.id,
 *     configRuleTriggerTypes: "ConfigurationItemChangeNotification",
 *     sourceOwner: "ALIYUN",
 *     sourceIdentifier: "ecs-cpu-min-count-limit",
 *     riskLevel: 1,
 *     resourceTypesScopes: ["ACS::ECS::Instance"],
 *     inputParameters: {
 *         cpuCount: "4",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Config Aggregate Config Rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cfg/aggregateConfigRule:AggregateConfigRule example <aggregator_id>:<config_rule_id>
 * ```
 */
export class AggregateConfigRule extends pulumi.CustomResource {
    /**
     * Get an existing AggregateConfigRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AggregateConfigRuleState, opts?: pulumi.CustomResourceOptions): AggregateConfigRule {
        return new AggregateConfigRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/aggregateConfigRule:AggregateConfigRule';

    /**
     * Returns true if the given object is an instance of AggregateConfigRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AggregateConfigRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AggregateConfigRule.__pulumiType;
    }

    /**
     * The name of the rule.
     */
    public readonly aggregateConfigRuleName!: pulumi.Output<string>;
    /**
     * The Aggregator Id.
     */
    public readonly aggregatorId!: pulumi.Output<string>;
    /**
     * (Available in 1.141.0+) The rule ID of Aggregate Config Rule.
     */
    public /*out*/ readonly configRuleId!: pulumi.Output<string>;
    /**
     * The trigger type of the rule. Valid values: `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    public readonly configRuleTriggerTypes!: pulumi.Output<string>;
    /**
     * The description of the rule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    public readonly excludeResourceIdsScope!: pulumi.Output<string | undefined>;
    /**
     * The settings map of the input parameters for the rule.
     */
    public readonly inputParameters!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The frequency of the compliance evaluations. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`. System default value is `TwentyFour_Hours` and valid when the `configRuleTriggerTypes` is `ScheduledNotification`.
     */
    public readonly maximumExecutionFrequency!: pulumi.Output<string>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    public readonly regionIdsScope!: pulumi.Output<string | undefined>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    public readonly resourceGroupIdsScope!: pulumi.Output<string | undefined>;
    /**
     * Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     */
    public readonly resourceTypesScopes!: pulumi.Output<string[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info.
     */
    public readonly riskLevel!: pulumi.Output<number>;
    /**
     * The identifier of the rule. For a managed rule, the value is the identifier of the managed rule. For a custom rule, the value is the ARN of the custom rule. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
     */
    public readonly sourceIdentifier!: pulumi.Output<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values: `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule.
     */
    public readonly sourceOwner!: pulumi.Output<string>;
    /**
     * The rule status. The valid values: `ACTIVE`, `INACTIVE`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    public readonly tagKeyScope!: pulumi.Output<string | undefined>;
    /**
     * The rule monitors the tag value, use with the `tagKeyScope` options. only applies to rules created based on managed rules.
     */
    public readonly tagValueScope!: pulumi.Output<string | undefined>;

    /**
     * Create a AggregateConfigRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AggregateConfigRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AggregateConfigRuleArgs | AggregateConfigRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AggregateConfigRuleState | undefined;
            inputs["aggregateConfigRuleName"] = state ? state.aggregateConfigRuleName : undefined;
            inputs["aggregatorId"] = state ? state.aggregatorId : undefined;
            inputs["configRuleId"] = state ? state.configRuleId : undefined;
            inputs["configRuleTriggerTypes"] = state ? state.configRuleTriggerTypes : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["excludeResourceIdsScope"] = state ? state.excludeResourceIdsScope : undefined;
            inputs["inputParameters"] = state ? state.inputParameters : undefined;
            inputs["maximumExecutionFrequency"] = state ? state.maximumExecutionFrequency : undefined;
            inputs["regionIdsScope"] = state ? state.regionIdsScope : undefined;
            inputs["resourceGroupIdsScope"] = state ? state.resourceGroupIdsScope : undefined;
            inputs["resourceTypesScopes"] = state ? state.resourceTypesScopes : undefined;
            inputs["riskLevel"] = state ? state.riskLevel : undefined;
            inputs["sourceIdentifier"] = state ? state.sourceIdentifier : undefined;
            inputs["sourceOwner"] = state ? state.sourceOwner : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["tagKeyScope"] = state ? state.tagKeyScope : undefined;
            inputs["tagValueScope"] = state ? state.tagValueScope : undefined;
        } else {
            const args = argsOrState as AggregateConfigRuleArgs | undefined;
            if ((!args || args.aggregateConfigRuleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregateConfigRuleName'");
            }
            if ((!args || args.aggregatorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregatorId'");
            }
            if ((!args || args.configRuleTriggerTypes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configRuleTriggerTypes'");
            }
            if ((!args || args.resourceTypesScopes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'resourceTypesScopes'");
            }
            if ((!args || args.riskLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'riskLevel'");
            }
            if ((!args || args.sourceIdentifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceIdentifier'");
            }
            if ((!args || args.sourceOwner === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sourceOwner'");
            }
            inputs["aggregateConfigRuleName"] = args ? args.aggregateConfigRuleName : undefined;
            inputs["aggregatorId"] = args ? args.aggregatorId : undefined;
            inputs["configRuleTriggerTypes"] = args ? args.configRuleTriggerTypes : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["excludeResourceIdsScope"] = args ? args.excludeResourceIdsScope : undefined;
            inputs["inputParameters"] = args ? args.inputParameters : undefined;
            inputs["maximumExecutionFrequency"] = args ? args.maximumExecutionFrequency : undefined;
            inputs["regionIdsScope"] = args ? args.regionIdsScope : undefined;
            inputs["resourceGroupIdsScope"] = args ? args.resourceGroupIdsScope : undefined;
            inputs["resourceTypesScopes"] = args ? args.resourceTypesScopes : undefined;
            inputs["riskLevel"] = args ? args.riskLevel : undefined;
            inputs["sourceIdentifier"] = args ? args.sourceIdentifier : undefined;
            inputs["sourceOwner"] = args ? args.sourceOwner : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["tagKeyScope"] = args ? args.tagKeyScope : undefined;
            inputs["tagValueScope"] = args ? args.tagValueScope : undefined;
            inputs["configRuleId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AggregateConfigRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AggregateConfigRule resources.
 */
export interface AggregateConfigRuleState {
    /**
     * The name of the rule.
     */
    aggregateConfigRuleName?: pulumi.Input<string>;
    /**
     * The Aggregator Id.
     */
    aggregatorId?: pulumi.Input<string>;
    /**
     * (Available in 1.141.0+) The rule ID of Aggregate Config Rule.
     */
    configRuleId?: pulumi.Input<string>;
    /**
     * The trigger type of the rule. Valid values: `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    configRuleTriggerTypes?: pulumi.Input<string>;
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    excludeResourceIdsScope?: pulumi.Input<string>;
    /**
     * The settings map of the input parameters for the rule.
     */
    inputParameters?: pulumi.Input<{[key: string]: any}>;
    /**
     * The frequency of the compliance evaluations. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`. System default value is `TwentyFour_Hours` and valid when the `configRuleTriggerTypes` is `ScheduledNotification`.
     */
    maximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    regionIdsScope?: pulumi.Input<string>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    resourceGroupIdsScope?: pulumi.Input<string>;
    /**
     * Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     */
    resourceTypesScopes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info.
     */
    riskLevel?: pulumi.Input<number>;
    /**
     * The identifier of the rule. For a managed rule, the value is the identifier of the managed rule. For a custom rule, the value is the ARN of the custom rule. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
     */
    sourceIdentifier?: pulumi.Input<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values: `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule.
     */
    sourceOwner?: pulumi.Input<string>;
    /**
     * The rule status. The valid values: `ACTIVE`, `INACTIVE`.
     */
    status?: pulumi.Input<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    tagKeyScope?: pulumi.Input<string>;
    /**
     * The rule monitors the tag value, use with the `tagKeyScope` options. only applies to rules created based on managed rules.
     */
    tagValueScope?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AggregateConfigRule resource.
 */
export interface AggregateConfigRuleArgs {
    /**
     * The name of the rule.
     */
    aggregateConfigRuleName: pulumi.Input<string>;
    /**
     * The Aggregator Id.
     */
    aggregatorId: pulumi.Input<string>;
    /**
     * The trigger type of the rule. Valid values: `ConfigurationItemChangeNotification`: The rule is triggered upon configuration changes. `ScheduledNotification`: The rule is triggered as scheduled.
     */
    configRuleTriggerTypes: pulumi.Input<string>;
    /**
     * The description of the rule.
     */
    description?: pulumi.Input<string>;
    /**
     * The rule monitors excluded resource IDs, multiple of which are separated by commas, only applies to rules created based on managed rules, , custom rule this field is empty.
     */
    excludeResourceIdsScope?: pulumi.Input<string>;
    /**
     * The settings map of the input parameters for the rule.
     */
    inputParameters?: pulumi.Input<{[key: string]: any}>;
    /**
     * The frequency of the compliance evaluations. Valid values:  `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, `TwentyFour_Hours`. System default value is `TwentyFour_Hours` and valid when the `configRuleTriggerTypes` is `ScheduledNotification`.
     */
    maximumExecutionFrequency?: pulumi.Input<string>;
    /**
     * The rule monitors region IDs, separated by commas, only applies to rules created based on managed rules.
     */
    regionIdsScope?: pulumi.Input<string>;
    /**
     * The rule monitors resource group IDs, separated by commas, only applies to rules created based on managed rules.
     */
    resourceGroupIdsScope?: pulumi.Input<string>;
    /**
     * Resource types to be evaluated. [Alibaba Cloud services that support Cloud Config.](https://www.alibabacloud.com/help/en/doc-detail/127411.htm)
     */
    resourceTypesScopes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The risk level of the resources that are not compliant with the rule. Valid values:  `1`: critical `2`: warning `3`: info.
     */
    riskLevel: pulumi.Input<number>;
    /**
     * The identifier of the rule. For a managed rule, the value is the identifier of the managed rule. For a custom rule, the value is the ARN of the custom rule. Using managed rules, refer to [List of Managed rules.](https://www.alibabacloud.com/help/en/doc-detail/127404.htm)
     */
    sourceIdentifier: pulumi.Input<string>;
    /**
     * Specifies whether you or Alibaba Cloud owns and manages the rule. Valid values: `CUSTOM_FC`: The rule is a custom rule and you own the rule. `ALIYUN`: The rule is a managed rule and Alibaba Cloud owns the rule.
     */
    sourceOwner: pulumi.Input<string>;
    /**
     * The rule status. The valid values: `ACTIVE`, `INACTIVE`.
     */
    status?: pulumi.Input<string>;
    /**
     * The rule monitors the tag key, only applies to rules created based on managed rules.
     */
    tagKeyScope?: pulumi.Input<string>;
    /**
     * The rule monitors the tag value, use with the `tagKeyScope` options. only applies to rules created based on managed rules.
     */
    tagValueScope?: pulumi.Input<string>;
}
