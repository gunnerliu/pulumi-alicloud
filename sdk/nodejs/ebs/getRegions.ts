// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ebs Regions of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.187.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.ebs.getRegions({
 *     regionId: "cn-hangzhou",
 * });
 * export const regions = _default.then(_default => _default.regions);
 * ```
 */
export function getRegions(args?: GetRegionsArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ebs/getRegions:getRegions", {
        "outputFile": args.outputFile,
        "regionId": args.regionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the region.
     */
    regionId?: string;
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
    readonly regionId?: string;
    readonly regions: outputs.ebs.GetRegionsRegion[];
}
/**
 * This data source provides the Ebs Regions of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.187.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.ebs.getRegions({
 *     regionId: "cn-hangzhou",
 * });
 * export const regions = _default.then(_default => _default.regions);
 * ```
 */
export function getRegionsOutput(args?: GetRegionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionsResult> {
    return pulumi.output(args).apply((a: any) => getRegions(a, opts))
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsOutputArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the region.
     */
    regionId?: pulumi.Input<string>;
}
