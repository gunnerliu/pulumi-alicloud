// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Arms Dispatch Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.136.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.arms.getDispatchRules({});
 * export const armsDispatchRuleId1 = ids.then(ids => ids.rules?[0]?.id);
 * const nameRegex = alicloud.arms.getDispatchRules({
 *     nameRegex: "^my-DispatchRule",
 * });
 * export const armsDispatchRuleId2 = nameRegex.then(nameRegex => nameRegex.rules?[0]?.id);
 * ```
 */
export function getDispatchRules(args?: GetDispatchRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetDispatchRulesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:arms/getDispatchRules:getDispatchRules", {
        "dispatchRuleName": args.dispatchRuleName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDispatchRules.
 */
export interface GetDispatchRulesArgs {
    /**
     * The name of the dispatch rule.
     */
    dispatchRuleName?: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of dispatch rule id.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Dispatch Rule name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getDispatchRules.
 */
export interface GetDispatchRulesResult {
    readonly dispatchRuleName?: string;
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly rules: outputs.arms.GetDispatchRulesRule[];
}

export function getDispatchRulesOutput(args?: GetDispatchRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDispatchRulesResult> {
    return pulumi.output(args).apply(a => getDispatchRules(a, opts))
}

/**
 * A collection of arguments for invoking getDispatchRules.
 */
export interface GetDispatchRulesOutputArgs {
    /**
     * The name of the dispatch rule.
     */
    dispatchRuleName?: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of dispatch rule id.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Dispatch Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
