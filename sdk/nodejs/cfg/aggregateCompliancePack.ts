// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Config Aggregate Compliance Pack resource.
 *
 * For information about Cloud Config Aggregate Compliance Pack and how to use it, see [What is Aggregate Compliance Pack](https://help.aliyun.com/).
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
 * const config = new pulumi.Config();
 * const name = config.get("name") || "example_name";
 * const defaultResourceGroups = alicloud.resourcemanager.getResourceGroups({
 *     status: "OK",
 * });
 * const defaultInstances = alicloud.ecs.getInstances({});
 * const defaultAggregator = new alicloud.cfg.Aggregator("defaultAggregator", {
 *     aggregatorAccounts: [{
 *         accountId: "140278452670****",
 *         accountName: "test-2",
 *         accountType: "ResourceDirectory",
 *     }],
 *     aggregatorName: "tf-testaccaggregator",
 *     description: "tf-testaccaggregator",
 * });
 * const defaultAggregateConfigRule = new alicloud.cfg.AggregateConfigRule("defaultAggregateConfigRule", {
 *     aggregatorId: defaultAggregator.id,
 *     aggregateConfigRuleName: name,
 *     sourceOwner: "ALIYUN",
 *     sourceIdentifier: "ecs-cpu-min-count-limit",
 *     configRuleTriggerTypes: "ConfigurationItemChangeNotification",
 *     resourceTypesScopes: ["ACS::ECS::Instance"],
 *     riskLevel: 1,
 *     description: name,
 *     excludeResourceIdsScope: defaultInstances.then(defaultInstances => defaultInstances.ids?[0]),
 *     inputParameters: {
 *         cpuCount: "4",
 *     },
 *     regionIdsScope: "cn-hangzhou",
 *     resourceGroupIdsScope: defaultResourceGroups.then(defaultResourceGroups => defaultResourceGroups.ids?[0]),
 *     tagKeyScope: "tFTest",
 *     tagValueScope: "forTF 123",
 * });
 * const defaultAggregateCompliancePack = new alicloud.cfg.AggregateCompliancePack("defaultAggregateCompliancePack", {
 *     aggregateCompliancePackName: "tf-testaccConfig1234",
 *     aggregatorId: defaultAggregator.id,
 *     description: "tf-testaccConfig1234",
 *     riskLevel: 1,
 *     configRuleIds: [{
 *         configRuleId: defaultAggregateConfigRule.configRuleId,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Config Aggregate Compliance Pack can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack example <aggregator_id>:<aggregator_compliance_pack_id>
 * ```
 */
export class AggregateCompliancePack extends pulumi.CustomResource {
    /**
     * Get an existing AggregateCompliancePack resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AggregateCompliancePackState, opts?: pulumi.CustomResourceOptions): AggregateCompliancePack {
        return new AggregateCompliancePack(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cfg/aggregateCompliancePack:AggregateCompliancePack';

    /**
     * Returns true if the given object is an instance of AggregateCompliancePack.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AggregateCompliancePack {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AggregateCompliancePack.__pulumiType;
    }

    /**
     * The name of compliance package name.
     */
    public readonly aggregateCompliancePackName!: pulumi.Output<string>;
    /**
     * The ID of aggregator.
     */
    public readonly aggregatorId!: pulumi.Output<string>;
    /**
     * The Template ID of compliance package.
     */
    public readonly compliancePackTemplateId!: pulumi.Output<string | undefined>;
    /**
     * A list of Config Rule IDs.
     */
    public readonly configRuleIds!: pulumi.Output<outputs.cfg.AggregateCompliancePackConfigRuleId[] | undefined>;
    /**
     * A list of Config Rules.
     *
     * @deprecated Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.
     */
    public readonly configRules!: pulumi.Output<outputs.cfg.AggregateCompliancePackConfigRule[] | undefined>;
    /**
     * The description of compliance package.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The Risk Level. Valid values: `1`, `2`, `3`.
     */
    public readonly riskLevel!: pulumi.Output<number>;
    /**
     * The status of the resource.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;

    /**
     * Create a AggregateCompliancePack resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AggregateCompliancePackArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AggregateCompliancePackArgs | AggregateCompliancePackState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AggregateCompliancePackState | undefined;
            inputs["aggregateCompliancePackName"] = state ? state.aggregateCompliancePackName : undefined;
            inputs["aggregatorId"] = state ? state.aggregatorId : undefined;
            inputs["compliancePackTemplateId"] = state ? state.compliancePackTemplateId : undefined;
            inputs["configRuleIds"] = state ? state.configRuleIds : undefined;
            inputs["configRules"] = state ? state.configRules : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["riskLevel"] = state ? state.riskLevel : undefined;
            inputs["status"] = state ? state.status : undefined;
        } else {
            const args = argsOrState as AggregateCompliancePackArgs | undefined;
            if ((!args || args.aggregateCompliancePackName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregateCompliancePackName'");
            }
            if ((!args || args.aggregatorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aggregatorId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.riskLevel === undefined) && !opts.urn) {
                throw new Error("Missing required property 'riskLevel'");
            }
            inputs["aggregateCompliancePackName"] = args ? args.aggregateCompliancePackName : undefined;
            inputs["aggregatorId"] = args ? args.aggregatorId : undefined;
            inputs["compliancePackTemplateId"] = args ? args.compliancePackTemplateId : undefined;
            inputs["configRuleIds"] = args ? args.configRuleIds : undefined;
            inputs["configRules"] = args ? args.configRules : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["riskLevel"] = args ? args.riskLevel : undefined;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AggregateCompliancePack.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AggregateCompliancePack resources.
 */
export interface AggregateCompliancePackState {
    /**
     * The name of compliance package name.
     */
    aggregateCompliancePackName?: pulumi.Input<string>;
    /**
     * The ID of aggregator.
     */
    aggregatorId?: pulumi.Input<string>;
    /**
     * The Template ID of compliance package.
     */
    compliancePackTemplateId?: pulumi.Input<string>;
    /**
     * A list of Config Rule IDs.
     */
    configRuleIds?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRuleId>[]>;
    /**
     * A list of Config Rules.
     *
     * @deprecated Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.
     */
    configRules?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRule>[]>;
    /**
     * The description of compliance package.
     */
    description?: pulumi.Input<string>;
    /**
     * The Risk Level. Valid values: `1`, `2`, `3`.
     */
    riskLevel?: pulumi.Input<number>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AggregateCompliancePack resource.
 */
export interface AggregateCompliancePackArgs {
    /**
     * The name of compliance package name.
     */
    aggregateCompliancePackName: pulumi.Input<string>;
    /**
     * The ID of aggregator.
     */
    aggregatorId: pulumi.Input<string>;
    /**
     * The Template ID of compliance package.
     */
    compliancePackTemplateId?: pulumi.Input<string>;
    /**
     * A list of Config Rule IDs.
     */
    configRuleIds?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRuleId>[]>;
    /**
     * A list of Config Rules.
     *
     * @deprecated Field 'config_rules' has been deprecated from provider version 1.141.0. New field 'config_rule_ids' instead.
     */
    configRules?: pulumi.Input<pulumi.Input<inputs.cfg.AggregateCompliancePackConfigRule>[]>;
    /**
     * The description of compliance package.
     */
    description: pulumi.Input<string>;
    /**
     * The Risk Level. Valid values: `1`, `2`, `3`.
     */
    riskLevel: pulumi.Input<number>;
}
