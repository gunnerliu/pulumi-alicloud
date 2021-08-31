// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Alb Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.alb.getRules({
 *     ids: ["example_id"],
 * });
 * export const albRuleId1 = ids.then(ids => ids.rules[0].id);
 * const nameRegex = alicloud.alb.getRules({
 *     nameRegex: "^my-Rule",
 * });
 * export const albRuleId2 = nameRegex.then(nameRegex => nameRegex.rules[0].id);
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
    return pulumi.runtime.invoke("alicloud:alb/getRules:getRules", {
        "ids": args.ids,
        "listenerId": args.listenerId,
        "listenerIds": args.listenerIds,
        "loadBalancerIds": args.loadBalancerIds,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "ruleIds": args.ruleIds,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getRules.
 */
export interface GetRulesArgs {
    /**
     * A list of Rule IDs.
     */
    readonly ids?: string[];
    /**
     * The ID of the listener to which the forwarding rule belongs.
     */
    readonly listenerId?: string;
    /**
     * The listener ids.
     */
    readonly listenerIds?: string[];
    /**
     * The load balancer ids.
     */
    readonly loadBalancerIds?: string[];
    /**
     * A regex string to filter results by Rule name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The rule ids.
     */
    readonly ruleIds?: string[];
    /**
     * The status of the resource.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getRules.
 */
export interface GetRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly listenerId?: string;
    readonly listenerIds?: string[];
    readonly loadBalancerIds?: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly ruleIds?: string[];
    readonly rules: outputs.alb.GetRulesRule[];
    readonly status?: string;
}
