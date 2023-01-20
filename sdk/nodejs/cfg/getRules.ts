// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Config Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.99.0+.
 *
 * > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cfg.getRules({
 *     ids: ["cr-ed4bad756057********"],
 *     nameRegex: "tftest",
 * });
 * export const firstConfigRuleId = example.then(example => example.rules?.[0]?.id);
 * ```
 */
export function getRules(args?: GetRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cfg/getRules:getRules", {
        "configRuleState": args.configRuleState,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "riskLevel": args.riskLevel,
        "ruleName": args.ruleName,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesArgs {
    /**
     * Field `configRuleState` has been deprecated from provider version 1.124.1. New field `status` instead.
     *
     * @deprecated Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead.
     */
    configRuleState?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Config Rule IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by rule name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
     */
    riskLevel?: number;
    /**
     * The name of config rule.
     */
    ruleName?: string;
    /**
     * The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     */
    status?: string;
}

/**
 * A collection of values returned by getRules.
 */
export interface GetRulesResult {
    /**
     * The state of the Config Rule.
     *
     * @deprecated Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead.
     */
    readonly configRuleState?: string;
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Config Rule IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Config Rule names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The risk level of the Config Rule.
     */
    readonly riskLevel?: number;
    /**
     * The name of the Config Rule.
     */
    readonly ruleName?: string;
    /**
     * A list of Config Rules. Each element contains the following attributes:
     */
    readonly rules: outputs.cfg.GetRulesRule[];
    /**
     * (Available in 1.124.1+) The status of config rule.
     */
    readonly status?: string;
}
/**
 * This data source provides the Config Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.99.0+.
 *
 * > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-southeast-1`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cfg.getRules({
 *     ids: ["cr-ed4bad756057********"],
 *     nameRegex: "tftest",
 * });
 * export const firstConfigRuleId = example.then(example => example.rules?.[0]?.id);
 * ```
 */
export function getRulesOutput(args?: GetRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRulesResult> {
    return pulumi.output(args).apply((a: any) => getRules(a, opts))
}

/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesOutputArgs {
    /**
     * Field `configRuleState` has been deprecated from provider version 1.124.1. New field `status` instead.
     *
     * @deprecated Field 'config_rule_state' has been deprecated from provider version 1.124.1. New field 'status' instead.
     */
    configRuleState?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Config Rule IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
     */
    riskLevel?: pulumi.Input<number>;
    /**
     * The name of config rule.
     */
    ruleName?: pulumi.Input<string>;
    /**
     * The status of the config rule, valid values: `ACTIVE`, `DELETING`, `EVALUATING` and `INACTIVE`.
     */
    status?: pulumi.Input<string>;
}
