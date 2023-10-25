// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a ESS scaling rule resource.
 *
 * For information about ess scaling rule, see [CreateScalingRule](https://www.alibabacloud.com/help/en/auto-scaling/latest/createscalingrule).
 *
 * > **NOTE:** Available since v1.39.0.
 *
 * ## Module Support
 *
 * You can use to the existing autoscaling-rule module
 * to create different type rules, alarm task and scheduled task one-click.
 *
 * ## Import
 *
 * ESS scaling rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ess/scalingRule:ScalingRule example abc123456
 * ```
 */
export class ScalingRule extends pulumi.CustomResource {
    /**
     * Get an existing ScalingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScalingRuleState, opts?: pulumi.CustomResourceOptions): ScalingRule {
        return new ScalingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ess/scalingRule:ScalingRule';

    /**
     * Returns true if the given object is an instance of ScalingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScalingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScalingRule.__pulumiType;
    }

    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    public readonly adjustmentType!: pulumi.Output<string | undefined>;
    /**
     * The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
     * - QuantityChangeInCapacity：(0, 500] U (-500, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-100, 0]
     * - TotalCapacity：[0, 1000]
     */
    public readonly adjustmentValue!: pulumi.Output<number | undefined>;
    /**
     * The unique identifier of the scaling rule.
     */
    public /*out*/ readonly ari!: pulumi.Output<string>;
    /**
     * The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
     */
    public readonly cooldown!: pulumi.Output<number | undefined>;
    /**
     * Indicates whether scale in by the target tracking policy is disabled. Default to false.
     */
    public readonly disableScaleIn!: pulumi.Output<boolean | undefined>;
    /**
     * The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
     */
    public readonly estimatedInstanceWarmup!: pulumi.Output<number>;
    /**
     * A CloudMonitor metric name.
     */
    public readonly metricName!: pulumi.Output<string | undefined>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    public readonly scalingGroupId!: pulumi.Output<string>;
    /**
     * Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
     */
    public readonly scalingRuleName!: pulumi.Output<string>;
    /**
     * The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
     */
    public readonly scalingRuleType!: pulumi.Output<string | undefined>;
    /**
     * Steps for StepScalingRule. See `stepAdjustment` below.
     */
    public readonly stepAdjustments!: pulumi.Output<outputs.ess.ScalingRuleStepAdjustment[] | undefined>;
    /**
     * The target value for the metric.
     */
    public readonly targetValue!: pulumi.Output<number | undefined>;

    /**
     * Create a ScalingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScalingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScalingRuleArgs | ScalingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScalingRuleState | undefined;
            resourceInputs["adjustmentType"] = state ? state.adjustmentType : undefined;
            resourceInputs["adjustmentValue"] = state ? state.adjustmentValue : undefined;
            resourceInputs["ari"] = state ? state.ari : undefined;
            resourceInputs["cooldown"] = state ? state.cooldown : undefined;
            resourceInputs["disableScaleIn"] = state ? state.disableScaleIn : undefined;
            resourceInputs["estimatedInstanceWarmup"] = state ? state.estimatedInstanceWarmup : undefined;
            resourceInputs["metricName"] = state ? state.metricName : undefined;
            resourceInputs["scalingGroupId"] = state ? state.scalingGroupId : undefined;
            resourceInputs["scalingRuleName"] = state ? state.scalingRuleName : undefined;
            resourceInputs["scalingRuleType"] = state ? state.scalingRuleType : undefined;
            resourceInputs["stepAdjustments"] = state ? state.stepAdjustments : undefined;
            resourceInputs["targetValue"] = state ? state.targetValue : undefined;
        } else {
            const args = argsOrState as ScalingRuleArgs | undefined;
            if ((!args || args.scalingGroupId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingGroupId'");
            }
            resourceInputs["adjustmentType"] = args ? args.adjustmentType : undefined;
            resourceInputs["adjustmentValue"] = args ? args.adjustmentValue : undefined;
            resourceInputs["cooldown"] = args ? args.cooldown : undefined;
            resourceInputs["disableScaleIn"] = args ? args.disableScaleIn : undefined;
            resourceInputs["estimatedInstanceWarmup"] = args ? args.estimatedInstanceWarmup : undefined;
            resourceInputs["metricName"] = args ? args.metricName : undefined;
            resourceInputs["scalingGroupId"] = args ? args.scalingGroupId : undefined;
            resourceInputs["scalingRuleName"] = args ? args.scalingRuleName : undefined;
            resourceInputs["scalingRuleType"] = args ? args.scalingRuleType : undefined;
            resourceInputs["stepAdjustments"] = args ? args.stepAdjustments : undefined;
            resourceInputs["targetValue"] = args ? args.targetValue : undefined;
            resourceInputs["ari"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ScalingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScalingRule resources.
 */
export interface ScalingRuleState {
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    adjustmentType?: pulumi.Input<string>;
    /**
     * The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
     * - QuantityChangeInCapacity：(0, 500] U (-500, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-100, 0]
     * - TotalCapacity：[0, 1000]
     */
    adjustmentValue?: pulumi.Input<number>;
    /**
     * The unique identifier of the scaling rule.
     */
    ari?: pulumi.Input<string>;
    /**
     * The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
     */
    cooldown?: pulumi.Input<number>;
    /**
     * Indicates whether scale in by the target tracking policy is disabled. Default to false.
     */
    disableScaleIn?: pulumi.Input<boolean>;
    /**
     * The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
     */
    estimatedInstanceWarmup?: pulumi.Input<number>;
    /**
     * A CloudMonitor metric name.
     */
    metricName?: pulumi.Input<string>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    scalingGroupId?: pulumi.Input<string>;
    /**
     * Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
     */
    scalingRuleName?: pulumi.Input<string>;
    /**
     * The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
     */
    scalingRuleType?: pulumi.Input<string>;
    /**
     * Steps for StepScalingRule. See `stepAdjustment` below.
     */
    stepAdjustments?: pulumi.Input<pulumi.Input<inputs.ess.ScalingRuleStepAdjustment>[]>;
    /**
     * The target value for the metric.
     */
    targetValue?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ScalingRule resource.
 */
export interface ScalingRuleArgs {
    /**
     * Adjustment mode of a scaling rule. Optional values:
     * - QuantityChangeInCapacity: It is used to increase or decrease a specified number of ECS instances.
     * - PercentChangeInCapacity: It is used to increase or decrease a specified proportion of ECS instances.
     * - TotalCapacity: It is used to adjust the quantity of ECS instances in the current scaling group to a specified value.
     */
    adjustmentType?: pulumi.Input<string>;
    /**
     * The number of ECS instances to be adjusted in the scaling rule. This parameter is required and applicable only to simple scaling rules. The number of ECS instances to be adjusted in a single scaling activity cannot exceed 500. Value range:
     * - QuantityChangeInCapacity：(0, 500] U (-500, 0]
     * - PercentChangeInCapacity：[0, 10000] U [-100, 0]
     * - TotalCapacity：[0, 1000]
     */
    adjustmentValue?: pulumi.Input<number>;
    /**
     * The cooldown time of the scaling rule. This parameter is applicable only to simple scaling rules. Value range: [0, 86,400], in seconds. The default value is empty，if not set, the return value will be 0, which is the default value of integer.
     */
    cooldown?: pulumi.Input<number>;
    /**
     * Indicates whether scale in by the target tracking policy is disabled. Default to false.
     */
    disableScaleIn?: pulumi.Input<boolean>;
    /**
     * The estimated time, in seconds, until a newly launched instance will contribute CloudMonitor metrics. Default to 300.
     */
    estimatedInstanceWarmup?: pulumi.Input<number>;
    /**
     * A CloudMonitor metric name.
     */
    metricName?: pulumi.Input<string>;
    /**
     * ID of the scaling group of a scaling rule.
     */
    scalingGroupId: pulumi.Input<string>;
    /**
     * Name shown for the scaling rule, which must contain 2-64 characters (English or Chinese), starting with numbers, English letters or Chinese characters, and can contain number, underscores `_`, hypens `-`, and decimal point `.`. If this parameter value is not specified, the default value is scaling rule id.
     */
    scalingRuleName?: pulumi.Input<string>;
    /**
     * The scaling rule type, either "SimpleScalingRule", "TargetTrackingScalingRule", "StepScalingRule". Default to "SimpleScalingRule".
     */
    scalingRuleType?: pulumi.Input<string>;
    /**
     * Steps for StepScalingRule. See `stepAdjustment` below.
     */
    stepAdjustments?: pulumi.Input<pulumi.Input<inputs.ess.ScalingRuleStepAdjustment>[]>;
    /**
     * The target value for the metric.
     */
    targetValue?: pulumi.Input<number>;
}
