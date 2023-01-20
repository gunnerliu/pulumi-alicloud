// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cms Event Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.182.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cms.getEventRules({
 *     ids: ["example_id"],
 * });
 * export const cmsEventRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * const nameRegex = alicloud.cms.getEventRules({
 *     nameRegex: "^my-EventRule",
 * });
 * export const cmsEventRuleId2 = nameRegex.then(nameRegex => nameRegex.rules?.[0]?.id);
 * ```
 */
export function getEventRules(args?: GetEventRulesArgs, opts?: pulumi.InvokeOptions): Promise<GetEventRulesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cms/getEventRules:getEventRules", {
        "ids": args.ids,
        "namePrefix": args.namePrefix,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getEventRules.
 */
export interface GetEventRulesArgs {
    /**
     * A list of Event Rule IDs. Its element value is same as Event Rule Name.
     */
    ids?: string[];
    /**
     * The name prefix.
     */
    namePrefix?: string;
    /**
     * A regex string to filter results by Event Rule name.
     */
    nameRegex?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the resource.
     */
    status?: string;
}

/**
 * A collection of values returned by getEventRules.
 */
export interface GetEventRulesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly namePrefix?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly rules: outputs.cms.GetEventRulesRule[];
    readonly status?: string;
}
/**
 * This data source provides the Cms Event Rules of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.182.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cms.getEventRules({
 *     ids: ["example_id"],
 * });
 * export const cmsEventRuleId1 = ids.then(ids => ids.rules?.[0]?.id);
 * const nameRegex = alicloud.cms.getEventRules({
 *     nameRegex: "^my-EventRule",
 * });
 * export const cmsEventRuleId2 = nameRegex.then(nameRegex => nameRegex.rules?.[0]?.id);
 * ```
 */
export function getEventRulesOutput(args?: GetEventRulesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEventRulesResult> {
    return pulumi.output(args).apply((a: any) => getEventRules(a, opts))
}

/**
 * A collection of arguments for invoking getEventRules.
 */
export interface GetEventRulesOutputArgs {
    /**
     * A list of Event Rule IDs. Its element value is same as Event Rule Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name prefix.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Event Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}
