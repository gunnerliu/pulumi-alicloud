// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Bandwidth Packages available to the user.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const bwp = pulumi.output(alicloud.cen.getBandwidthPackages({
 *     instanceId: "cen-id1",
 *     nameRegex: "^foo",
 * }, { async: true }));
 *
 * export const firstCenBandwidthPackageId = bwp.packages[0].id;
 * ```
 */
export function getBandwidthPackages(args?: GetBandwidthPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetBandwidthPackagesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cen/getBandwidthPackages:getBandwidthPackages", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBandwidthPackages.
 */
export interface GetBandwidthPackagesArgs {
    /**
     * Limit search to a list of specific CEN Bandwidth Package IDs.
     */
    readonly ids?: string[];
    /**
     * ID of a CEN instance.
     */
    readonly instanceId?: string;
    /**
     * A regex string to filter CEN Bandwidth Package by name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getBandwidthPackages.
 */
export interface GetBandwidthPackagesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * ID of CEN instance that owns the CEN Bandwidth Package.
     */
    readonly instanceId?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of CEN bandwidth package. Each element contains the following attributes:
     */
    readonly packages: outputs.cen.GetBandwidthPackagesPackage[];
}
