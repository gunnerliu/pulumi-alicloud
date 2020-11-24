// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Route Maps available to the user.
 *
 * > **NOTE:** Available in v1.87.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const thisRouteMaps = pulumi.output(alicloud.cen.getRouteMaps({
 *     cenId: "cen-ihdlgo87ai********",
 *     cenRegionId: "cn-hangzhou",
 *     descriptionRegex: "datasource_test",
 *     ids: ["cenrmap-bnh97kb3mn********"],
 *     status: "Active",
 *     transmitDirection: "RegionIn",
 * }, { async: true }));
 *
 * export const firstCenRouteMapId = thisRouteMaps.maps[0].id;
 * ```
 */
export function getRouteMaps(args: GetRouteMapsArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteMapsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cen/getRouteMaps:getRouteMaps", {
        "cenId": args.cenId,
        "cenRegionId": args.cenRegionId,
        "descriptionRegex": args.descriptionRegex,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
        "transmitDirection": args.transmitDirection,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteMaps.
 */
export interface GetRouteMapsArgs {
    /**
     * The ID of the CEN instance.
     */
    readonly cenId: string;
    /**
     * The ID of the region to which the CEN instance belongs.
     */
    readonly cenRegionId?: string;
    /**
     * A regex string to filter CEN route map by description.
     */
    readonly descriptionRegex?: string;
    /**
     * A list of CEN route map IDs.
     */
    readonly ids?: string[];
    readonly outputFile?: string;
    /**
     * The status of the route map, including `Creating`, `Active` and `Deleting`.
     */
    readonly status?: string;
    /**
     * The direction in which the route map is applied, including `RegionIn` and `RegionOut`.
     */
    readonly transmitDirection?: string;
}

/**
 * A collection of values returned by getRouteMaps.
 */
export interface GetRouteMapsResult {
    /**
     * The ID of the CEN instance.
     */
    readonly cenId: string;
    /**
     * The ID of the region to which the CEN instance belongs.
     */
    readonly cenRegionId?: string;
    readonly descriptionRegex?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN route map IDs.
     */
    readonly ids: string[];
    /**
     * A list of CEN instances. Each element contains the following attributes:
     */
    readonly maps: outputs.cen.GetRouteMapsMap[];
    readonly outputFile?: string;
    /**
     * The status of the route map.
     */
    readonly status?: string;
    /**
     * The direction in which the route map is applied.
     */
    readonly transmitDirection?: string;
}
