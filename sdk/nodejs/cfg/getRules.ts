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
 * > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-northeast-1`.
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
 * export const firstConfigRuleId = example.then(example => example.rules[0].id);
 * ```
 */
export function getRules(args?: GetRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetRulesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cfg/getRules:getRules", {
        "configRuleState": args.configRuleState,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "memberId": args.memberId,
        "multiAccount": args.multiAccount,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "riskLevel": args.riskLevel,
    }, opts);
}

/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesArgs {
    /**
     * The state of the config rule, valid values: `ACTIVE`, `DELETING`, `DELETING_RESULTS`, `EVALUATING` and `INACTIVE`.
     */
    readonly configRuleState?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of Config Rule IDs.
     */
    readonly ids?: string[];
    /**
     * The ID of the member account to which the rule to be queried belongs. The default is empty. When `multiAccount` is set to true, this parameter is valid.
     */
    readonly memberId?: number;
    /**
     * Whether the enterprise management account queries the rule details of member accounts.
     */
    readonly multiAccount?: boolean;
    /**
     * A regex string to filter results by rule name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The risk level of Config Rule. Valid values: `1`: Critical ,`2`: Warning , `3`: Info.
     */
    readonly riskLevel?: number;
}

/**
 * A collection of values returned by getRules.
 */
export interface GetRulesResult {
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
    readonly memberId?: number;
    readonly multiAccount?: boolean;
    readonly nameRegex?: string;
    /**
     * A list of Config Rule names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly riskLevel?: number;
    /**
     * A list of Config Rules. Each element contains the following attributes:
     */
    readonly rules: outputs.cfg.GetRulesRule[];
}
