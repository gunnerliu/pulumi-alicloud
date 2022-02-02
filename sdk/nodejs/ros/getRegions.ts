// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ros Regions of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.145.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const all = alicloud.ros.getRegions({});
 * export const rosRegionRegionId1 = all.then(all => all.regions?[0]?.regionId);
 * ```
 */
export function getRegions(args?: GetRegionsArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ros/getRegions:getRegions", {
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsArgs {
    outputFile?: string;
}

/**
 * A collection of values returned by getRegions.
 */
export interface GetRegionsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly regions: outputs.ros.GetRegionsRegion[];
}

export function getRegionsOutput(args?: GetRegionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionsResult> {
    return pulumi.output(args).apply(a => getRegions(a, opts))
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsOutputArgs {
    outputFile?: pulumi.Input<string>;
}
