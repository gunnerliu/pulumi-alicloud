// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Common Bandwidth Packages owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.36.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fooCommonBandwithPackage = new alicloud.vpc.CommonBandwithPackage("foo", {
 *     bandwidth: "2",
 *     description: "tf-testAcc-CommonBandwidthPackage",
 * });
 * const fooCommonBandwidthPackages = fooCommonBandwithPackage.id.apply(id => alicloud.vpc.getCommonBandwidthPackages({
 *     ids: [id],
 *     nameRegex: "^tf-testAcc.*",
 * }, { async: true }));
 * ```
 * ## Public ip addresses Block
 *
 *   The public ip addresses mapping supports the following:
 *
 *   * `ipAddress`   - The address of the EIP.
 *   * `allocationId` - The ID of the EIP instance.
 *   * `bandwidthPackageIpRelationStatus` - The IP relation status of bandwidth package.
 */
export function getCommonBandwidthPackages(args?: GetCommonBandwidthPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetCommonBandwidthPackagesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:vpc/getCommonBandwidthPackages:getCommonBandwidthPackages", {
        "bandwidthPackageName": args.bandwidthPackageName,
        "dryRun": args.dryRun,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getCommonBandwidthPackages.
 */
export interface GetCommonBandwidthPackagesArgs {
    /**
     * The name of bandwidth package.
     */
    readonly bandwidthPackageName?: string;
    /**
     * Specifies whether to precheck only the request.
     */
    readonly dryRun?: boolean;
    /**
     * A list of Common Bandwidth Packages IDs.
     */
    readonly ids?: string[];
    /**
     * Specifies whether to return data of orders that have not taken effect.
     */
    readonly includeReservationData?: boolean;
    /**
     * A regex string to filter results by name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The Id of resource group which the common bandwidth package belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * The status of bandwidth package. Valid values: `Available` and `Pending`.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getCommonBandwidthPackages.
 */
export interface GetCommonBandwidthPackagesResult {
    /**
     * The name of bandwidth package.
     */
    readonly bandwidthPackageName?: string;
    readonly dryRun?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional) A list of Common Bandwidth Packages IDs.
     */
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    readonly nameRegex?: string;
    /**
     * A list of Common Bandwidth Packages names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of Common Bandwidth Packages. Each element contains the following attributes:
     */
    readonly packages: outputs.vpc.GetCommonBandwidthPackagesPackage[];
    /**
     * The Id of resource group which the common bandwidth package belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * Status of the Common Bandwidth Package.
     */
    readonly status?: string;
}
