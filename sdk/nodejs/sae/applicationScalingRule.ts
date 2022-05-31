// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Serverless App Engine (SAE) Application Scaling Rule resource.
 *
 * For information about Serverless App Engine (SAE) Application Scaling Rule and how to use it, see [What is Application Scaling Rule](https://help.aliyun.com/document_detail/134120.html).
 *
 * > **NOTE:** Available in v1.159.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultNetworks = alicloud.vpc.getNetworks({
 *     nameRegex: "default-NODELETING",
 * });
 * const defaultSwitches = defaultNetworks.then(defaultNetworks => alicloud.vpc.getSwitches({
 *     vpcId: defaultNetworks.ids?[0],
 * }));
 * const defaultNamespace = new alicloud.sae.Namespace("defaultNamespace", {
 *     namespaceDescription: "example_value",
 *     namespaceId: "example_value",
 *     namespaceName: "example_value",
 * });
 * const defaultApplication = new alicloud.sae.Application("defaultApplication", {
 *     appDescription: "example_value",
 *     appName: "example_value",
 *     namespaceId: defaultNamespace.namespaceId,
 *     imageUrl: "registry-vpc.cn-hangzhou.aliyuncs.com/lxepoo/apache-php5",
 *     packageType: "Image",
 *     jdk: "Open JDK 8",
 *     vswitchId: defaultSwitches.then(defaultSwitches => defaultSwitches.ids?[0]),
 *     vpcId: defaultNetworks.then(defaultNetworks => defaultNetworks.ids?[0]),
 *     timezone: "Asia/Shanghai",
 *     replicas: 5,
 *     cpu: 500,
 *     memory: 2048,
 * });
 * const example = new alicloud.sae.ApplicationScalingRule("example", {
 *     appId: defaultApplication.id,
 *     scalingRuleName: "example-value",
 *     scalingRuleEnable: true,
 *     scalingRuleType: "mix",
 *     scalingRuleTimer: {
 *         beginDate: "2022-02-25",
 *         endDate: "2022-03-25",
 *         period: "* * *",
 *         schedules: [
 *             {
 *                 atTime: "08:00",
 *                 maxReplicas: 10,
 *                 minReplicas: 3,
 *             },
 *             {
 *                 atTime: "20:00",
 *                 maxReplicas: 50,
 *                 minReplicas: 3,
 *             },
 *         ],
 *     },
 *     scalingRuleMetric: {
 *         maxReplicas: 50,
 *         minReplicas: 3,
 *         metrics: [
 *             {
 *                 metricType: "CPU",
 *                 metricTargetAverageUtilization: 20,
 *             },
 *             {
 *                 metricType: "MEMORY",
 *                 metricTargetAverageUtilization: 30,
 *             },
 *             {
 *                 metricType: "tcpActiveConn",
 *                 metricTargetAverageUtilization: 20,
 *             },
 *         ],
 *         scaleUpRules: {
 *             step: 10,
 *             disabled: false,
 *             stabilizationWindowSeconds: 0,
 *         },
 *         scaleDownRules: {
 *             step: 10,
 *             disabled: false,
 *             stabilizationWindowSeconds: 10,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Serverless App Engine (SAE) Application Scaling Rule can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:sae/applicationScalingRule:ApplicationScalingRule example <app_id>:<scaling_rule_name>
 * ```
 */
export class ApplicationScalingRule extends pulumi.CustomResource {
    /**
     * Get an existing ApplicationScalingRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationScalingRuleState, opts?: pulumi.CustomResourceOptions): ApplicationScalingRule {
        return new ApplicationScalingRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:sae/applicationScalingRule:ApplicationScalingRule';

    /**
     * Returns true if the given object is an instance of ApplicationScalingRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApplicationScalingRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApplicationScalingRule.__pulumiType;
    }

    /**
     * Application ID.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The min ready instance ratio.
     */
    public readonly minReadyInstanceRatio!: pulumi.Output<number | undefined>;
    /**
     * The min ready instances.
     */
    public readonly minReadyInstances!: pulumi.Output<number | undefined>;
    /**
     * True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
     */
    public readonly scalingRuleEnable!: pulumi.Output<boolean>;
    /**
     * Monitor the configuration of the indicator elasticity strategy. See the following `Block scalingRuleMetric`.
     */
    public readonly scalingRuleMetric!: pulumi.Output<outputs.sae.ApplicationScalingRuleScalingRuleMetric | undefined>;
    /**
     * The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
     */
    public readonly scalingRuleName!: pulumi.Output<string>;
    /**
     * Configuration of Timing Resilient Policies. See the following `Block scalingRuleTimer`.
     */
    public readonly scalingRuleTimer!: pulumi.Output<outputs.sae.ApplicationScalingRuleScalingRuleTimer | undefined>;
    /**
     * Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
     */
    public readonly scalingRuleType!: pulumi.Output<string>;

    /**
     * Create a ApplicationScalingRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApplicationScalingRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationScalingRuleArgs | ApplicationScalingRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationScalingRuleState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["minReadyInstanceRatio"] = state ? state.minReadyInstanceRatio : undefined;
            resourceInputs["minReadyInstances"] = state ? state.minReadyInstances : undefined;
            resourceInputs["scalingRuleEnable"] = state ? state.scalingRuleEnable : undefined;
            resourceInputs["scalingRuleMetric"] = state ? state.scalingRuleMetric : undefined;
            resourceInputs["scalingRuleName"] = state ? state.scalingRuleName : undefined;
            resourceInputs["scalingRuleTimer"] = state ? state.scalingRuleTimer : undefined;
            resourceInputs["scalingRuleType"] = state ? state.scalingRuleType : undefined;
        } else {
            const args = argsOrState as ApplicationScalingRuleArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.scalingRuleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingRuleName'");
            }
            if ((!args || args.scalingRuleType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scalingRuleType'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["minReadyInstanceRatio"] = args ? args.minReadyInstanceRatio : undefined;
            resourceInputs["minReadyInstances"] = args ? args.minReadyInstances : undefined;
            resourceInputs["scalingRuleEnable"] = args ? args.scalingRuleEnable : undefined;
            resourceInputs["scalingRuleMetric"] = args ? args.scalingRuleMetric : undefined;
            resourceInputs["scalingRuleName"] = args ? args.scalingRuleName : undefined;
            resourceInputs["scalingRuleTimer"] = args ? args.scalingRuleTimer : undefined;
            resourceInputs["scalingRuleType"] = args ? args.scalingRuleType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ApplicationScalingRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApplicationScalingRule resources.
 */
export interface ApplicationScalingRuleState {
    /**
     * Application ID.
     */
    appId?: pulumi.Input<string>;
    /**
     * The min ready instance ratio.
     */
    minReadyInstanceRatio?: pulumi.Input<number>;
    /**
     * The min ready instances.
     */
    minReadyInstances?: pulumi.Input<number>;
    /**
     * True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
     */
    scalingRuleEnable?: pulumi.Input<boolean>;
    /**
     * Monitor the configuration of the indicator elasticity strategy. See the following `Block scalingRuleMetric`.
     */
    scalingRuleMetric?: pulumi.Input<inputs.sae.ApplicationScalingRuleScalingRuleMetric>;
    /**
     * The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
     */
    scalingRuleName?: pulumi.Input<string>;
    /**
     * Configuration of Timing Resilient Policies. See the following `Block scalingRuleTimer`.
     */
    scalingRuleTimer?: pulumi.Input<inputs.sae.ApplicationScalingRuleScalingRuleTimer>;
    /**
     * Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
     */
    scalingRuleType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApplicationScalingRule resource.
 */
export interface ApplicationScalingRuleArgs {
    /**
     * Application ID.
     */
    appId: pulumi.Input<string>;
    /**
     * The min ready instance ratio.
     */
    minReadyInstanceRatio?: pulumi.Input<number>;
    /**
     * The min ready instances.
     */
    minReadyInstances?: pulumi.Input<number>;
    /**
     * True whether the auto scaling policy is enabled. The value description is as follows: true: enabled state. false: disabled status. Valid values: `false`, `true`.
     */
    scalingRuleEnable?: pulumi.Input<boolean>;
    /**
     * Monitor the configuration of the indicator elasticity strategy. See the following `Block scalingRuleMetric`.
     */
    scalingRuleMetric?: pulumi.Input<inputs.sae.ApplicationScalingRuleScalingRuleMetric>;
    /**
     * The name of a custom elastic scaling policy. In the application, the policy name cannot be repeated. It must start with a lowercase letter, and can only contain lowercase letters, numbers, and dashes (-), and no more than 32 characters. After the scaling policy is successfully created, the policy name cannot be modified.
     */
    scalingRuleName: pulumi.Input<string>;
    /**
     * Configuration of Timing Resilient Policies. See the following `Block scalingRuleTimer`.
     */
    scalingRuleTimer?: pulumi.Input<inputs.sae.ApplicationScalingRuleScalingRuleTimer>;
    /**
     * Flexible strategy type. Valid values: `mix`, `timing` and `metric`.
     */
    scalingRuleType: pulumi.Input<string>;
}
