// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Cloud Monitor Service Group Metric Rule resource.
 *
 * For information about Cloud Monitor Service Group Metric Rule and how to use it, see [What is Group Metric Rule](https://www.alibabacloud.com/help/en/doc-detail/114943.htm).
 *
 * > **NOTE:** Available in v1.104.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * import * as random from "@pulumi/random";
 *
 * const thisRandomUuid = new random.RandomUuid("thisRandomUuid", {});
 * const thisGroupMetricRule = new alicloud.cms.GroupMetricRule("thisGroupMetricRule", {
 *     groupId: "539****",
 *     ruleId: thisRandomUuid.id,
 *     category: "ecs",
 *     namespace: "acs_ecs_dashboard",
 *     metricName: "cpu_total",
 *     period: "60",
 *     groupMetricRuleName: "tf-testacc-rule-name",
 *     emailSubject: "tf-testacc-rule-name-warning",
 *     interval: "3600",
 *     silenceTime: 85800,
 *     noEffectiveInterval: "00:00-05:30",
 *     webhook: "http://www.aliyun.com",
 *     escalations: {
 *         warn: {
 *             comparisonOperator: "GreaterThanOrEqualToThreshold",
 *             statistics: "Average",
 *             threshold: "90",
 *             times: 3,
 *         },
 *         info: {
 *             comparisonOperator: "LessThanLastWeek",
 *             statistics: "Average",
 *             threshold: "90",
 *             times: 5,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Monitor Service Group Metric Rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cms/groupMetricRule:GroupMetricRule example <rule_id>
 * ```
 */
export class GroupMetricRule extends pulumi.CustomResource {
    /**
     * Get an existing GroupMetricRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GroupMetricRuleState, opts?: pulumi.CustomResourceOptions): GroupMetricRule {
        return new GroupMetricRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cms/groupMetricRule:GroupMetricRule';

    /**
     * Returns true if the given object is an instance of GroupMetricRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GroupMetricRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GroupMetricRule.__pulumiType;
    }

    /**
     * The abbreviation of the service name.
     */
    public readonly category!: pulumi.Output<string>;
    /**
     * Alarm contact group.
     */
    public readonly contactGroups!: pulumi.Output<string>;
    /**
     * The dimensions that specify the resources to be associated with the alert rule.
     */
    public readonly dimensions!: pulumi.Output<string>;
    /**
     * The time period during which the alert rule is effective.
     */
    public readonly effectiveInterval!: pulumi.Output<string | undefined>;
    /**
     * The subject of the alert notification email.                                         .
     */
    public readonly emailSubject!: pulumi.Output<string>;
    /**
     * Alarm level. See the block for escalations.
     */
    public readonly escalations!: pulumi.Output<outputs.cms.GroupMetricRuleEscalations>;
    /**
     * The ID of the application group.
     */
    public readonly groupId!: pulumi.Output<string>;
    /**
     * The name of the alert rule.
     */
    public readonly groupMetricRuleName!: pulumi.Output<string>;
    /**
     * The interval at which Cloud Monitor checks whether the alert rule is triggered. Unit: seconds.
     */
    public readonly interval!: pulumi.Output<string | undefined>;
    /**
     * The name of the metric.
     */
    public readonly metricName!: pulumi.Output<string>;
    /**
     * The namespace of the service.
     */
    public readonly namespace!: pulumi.Output<string>;
    /**
     * The time period during which the alert rule is ineffective.
     */
    public readonly noEffectiveInterval!: pulumi.Output<string | undefined>;
    /**
     * The aggregation period of the monitoring data. Unit: seconds. The value is an integral multiple of 60. Default value: `300`.
     */
    public readonly period!: pulumi.Output<number | undefined>;
    /**
     * The ID of the alert rule.
     */
    public readonly ruleId!: pulumi.Output<string>;
    /**
     * The mute period during which new alerts are not reported even if the alert trigger conditions are met. Unit: seconds. Default value: `86400`, which is equivalent to one day.
     */
    public readonly silenceTime!: pulumi.Output<number | undefined>;
    /**
     * The status of Group Metric Rule.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The callback URL.
     */
    public readonly webhook!: pulumi.Output<string | undefined>;

    /**
     * Create a GroupMetricRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GroupMetricRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GroupMetricRuleArgs | GroupMetricRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GroupMetricRuleState | undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["contactGroups"] = state ? state.contactGroups : undefined;
            resourceInputs["dimensions"] = state ? state.dimensions : undefined;
            resourceInputs["effectiveInterval"] = state ? state.effectiveInterval : undefined;
            resourceInputs["emailSubject"] = state ? state.emailSubject : undefined;
            resourceInputs["escalations"] = state ? state.escalations : undefined;
            resourceInputs["groupId"] = state ? state.groupId : undefined;
            resourceInputs["groupMetricRuleName"] = state ? state.groupMetricRuleName : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["metricName"] = state ? state.metricName : undefined;
            resourceInputs["namespace"] = state ? state.namespace : undefined;
            resourceInputs["noEffectiveInterval"] = state ? state.noEffectiveInterval : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["ruleId"] = state ? state.ruleId : undefined;
            resourceInputs["silenceTime"] = state ? state.silenceTime : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["webhook"] = state ? state.webhook : undefined;
        } else {
            const args = argsOrState as GroupMetricRuleArgs | undefined;
            if ((!args || args.category === undefined) && !opts.urn) {
                throw new Error("Missing required property 'category'");
            }
            if ((!args || args.escalations === undefined) && !opts.urn) {
                throw new Error("Missing required property 'escalations'");
            }
            if ((!args || args.groupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupId'");
            }
            if ((!args || args.groupMetricRuleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'groupMetricRuleName'");
            }
            if ((!args || args.metricName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricName'");
            }
            if ((!args || args.namespace === undefined) && !opts.urn) {
                throw new Error("Missing required property 'namespace'");
            }
            if ((!args || args.ruleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ruleId'");
            }
            resourceInputs["category"] = args ? args.category : undefined;
            resourceInputs["contactGroups"] = args ? args.contactGroups : undefined;
            resourceInputs["dimensions"] = args ? args.dimensions : undefined;
            resourceInputs["effectiveInterval"] = args ? args.effectiveInterval : undefined;
            resourceInputs["emailSubject"] = args ? args.emailSubject : undefined;
            resourceInputs["escalations"] = args ? args.escalations : undefined;
            resourceInputs["groupId"] = args ? args.groupId : undefined;
            resourceInputs["groupMetricRuleName"] = args ? args.groupMetricRuleName : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["metricName"] = args ? args.metricName : undefined;
            resourceInputs["namespace"] = args ? args.namespace : undefined;
            resourceInputs["noEffectiveInterval"] = args ? args.noEffectiveInterval : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["ruleId"] = args ? args.ruleId : undefined;
            resourceInputs["silenceTime"] = args ? args.silenceTime : undefined;
            resourceInputs["webhook"] = args ? args.webhook : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GroupMetricRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GroupMetricRule resources.
 */
export interface GroupMetricRuleState {
    /**
     * The abbreviation of the service name.
     */
    category?: pulumi.Input<string>;
    /**
     * Alarm contact group.
     */
    contactGroups?: pulumi.Input<string>;
    /**
     * The dimensions that specify the resources to be associated with the alert rule.
     */
    dimensions?: pulumi.Input<string>;
    /**
     * The time period during which the alert rule is effective.
     */
    effectiveInterval?: pulumi.Input<string>;
    /**
     * The subject of the alert notification email.                                         .
     */
    emailSubject?: pulumi.Input<string>;
    /**
     * Alarm level. See the block for escalations.
     */
    escalations?: pulumi.Input<inputs.cms.GroupMetricRuleEscalations>;
    /**
     * The ID of the application group.
     */
    groupId?: pulumi.Input<string>;
    /**
     * The name of the alert rule.
     */
    groupMetricRuleName?: pulumi.Input<string>;
    /**
     * The interval at which Cloud Monitor checks whether the alert rule is triggered. Unit: seconds.
     */
    interval?: pulumi.Input<string>;
    /**
     * The name of the metric.
     */
    metricName?: pulumi.Input<string>;
    /**
     * The namespace of the service.
     */
    namespace?: pulumi.Input<string>;
    /**
     * The time period during which the alert rule is ineffective.
     */
    noEffectiveInterval?: pulumi.Input<string>;
    /**
     * The aggregation period of the monitoring data. Unit: seconds. The value is an integral multiple of 60. Default value: `300`.
     */
    period?: pulumi.Input<number>;
    /**
     * The ID of the alert rule.
     */
    ruleId?: pulumi.Input<string>;
    /**
     * The mute period during which new alerts are not reported even if the alert trigger conditions are met. Unit: seconds. Default value: `86400`, which is equivalent to one day.
     */
    silenceTime?: pulumi.Input<number>;
    /**
     * The status of Group Metric Rule.
     */
    status?: pulumi.Input<string>;
    /**
     * The callback URL.
     */
    webhook?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GroupMetricRule resource.
 */
export interface GroupMetricRuleArgs {
    /**
     * The abbreviation of the service name.
     */
    category: pulumi.Input<string>;
    /**
     * Alarm contact group.
     */
    contactGroups?: pulumi.Input<string>;
    /**
     * The dimensions that specify the resources to be associated with the alert rule.
     */
    dimensions?: pulumi.Input<string>;
    /**
     * The time period during which the alert rule is effective.
     */
    effectiveInterval?: pulumi.Input<string>;
    /**
     * The subject of the alert notification email.                                         .
     */
    emailSubject?: pulumi.Input<string>;
    /**
     * Alarm level. See the block for escalations.
     */
    escalations: pulumi.Input<inputs.cms.GroupMetricRuleEscalations>;
    /**
     * The ID of the application group.
     */
    groupId: pulumi.Input<string>;
    /**
     * The name of the alert rule.
     */
    groupMetricRuleName: pulumi.Input<string>;
    /**
     * The interval at which Cloud Monitor checks whether the alert rule is triggered. Unit: seconds.
     */
    interval?: pulumi.Input<string>;
    /**
     * The name of the metric.
     */
    metricName: pulumi.Input<string>;
    /**
     * The namespace of the service.
     */
    namespace: pulumi.Input<string>;
    /**
     * The time period during which the alert rule is ineffective.
     */
    noEffectiveInterval?: pulumi.Input<string>;
    /**
     * The aggregation period of the monitoring data. Unit: seconds. The value is an integral multiple of 60. Default value: `300`.
     */
    period?: pulumi.Input<number>;
    /**
     * The ID of the alert rule.
     */
    ruleId: pulumi.Input<string>;
    /**
     * The mute period during which new alerts are not reported even if the alert trigger conditions are met. Unit: seconds. Default value: `86400`, which is equivalent to one day.
     */
    silenceTime?: pulumi.Input<number>;
    /**
     * The callback URL.
     */
    webhook?: pulumi.Input<string>;
}
