// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Bandwidth Limits available to the user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const bwl = pulumi.output(alicloud.cen.getBandwidthLimits({
 *     instanceIds: ["cen-id1"],
 * }));
 *
 * export const firstCenBandwidthLimitsLocalRegionId = bwl.limits[0].localRegionId;
 * ```
 */
export function getBandwidthLimits(args?: GetBandwidthLimitsArgs, opts?: pulumi.InvokeOptions): Promise<GetBandwidthLimitsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cen/getBandwidthLimits:getBandwidthLimits", {
        "instanceIds": args.instanceIds,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBandwidthLimits.
 */
export interface GetBandwidthLimitsArgs {
    /**
     * A list of CEN instances IDs.
     */
    instanceIds?: string[];
    outputFile?: string;
}

/**
 * A collection of values returned by getBandwidthLimits.
 */
export interface GetBandwidthLimitsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceIds?: string[];
    /**
     * A list of CEN Bandwidth Limits. Each element contains the following attributes:
     */
    readonly limits: outputs.cen.GetBandwidthLimitsLimit[];
    readonly outputFile?: string;
}

export function getBandwidthLimitsOutput(args?: GetBandwidthLimitsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBandwidthLimitsResult> {
    return pulumi.output(args).apply(a => getBandwidthLimits(a, opts))
}

/**
 * A collection of arguments for invoking getBandwidthLimits.
 */
export interface GetBandwidthLimitsOutputArgs {
    /**
     * A list of CEN instances IDs.
     */
    instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
}
