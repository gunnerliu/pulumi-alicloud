// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Route Entries available to the user.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const entry = pulumi.output(alicloud.cen.getRouteEntries({
 *     instanceId: "cen-id1",
 *     routeTableId: "vtb-id1",
 * }, { async: true }));
 *
 * export const firstRouteEntriesRouteEntryCidrBlock = entry.entries[0].cidrBlock;
 * ```
 */
export function getRouteEntries(args: GetRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteEntriesResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cen/getRouteEntries:getRouteEntries", {
        "cidrBlock": args.cidrBlock,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "routeTableId": args.routeTableId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesArgs {
    /**
     * The destination CIDR block of the route entry to query.
     */
    readonly cidrBlock?: string;
    /**
     * ID of the CEN instance.
     */
    readonly instanceId: string;
    readonly outputFile?: string;
    /**
     * ID of the route table of the VPC or VBR.
     */
    readonly routeTableId: string;
}

/**
 * A collection of values returned by getRouteEntries.
 */
export interface GetRouteEntriesResult {
    /**
     * The destination CIDR block of the conflicted route entry.
     */
    readonly cidrBlock?: string;
    /**
     * A list of CEN Route Entries. Each element contains the following attributes:
     */
    readonly entries: outputs.cen.GetRouteEntriesEntry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ID of the CEN child instance.
     */
    readonly instanceId: string;
    readonly outputFile?: string;
    /**
     * ID of the route table.
     */
    readonly routeTableId: string;
}
