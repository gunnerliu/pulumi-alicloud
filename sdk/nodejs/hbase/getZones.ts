// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides availability zones for HBase that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available in v1.73.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const zonesIds = alicloud.hbase.getZones({});
 * const hbase = new alicloud.hbase.Instance("hbase", {zoneId: zonesIds.then(zonesIds => zonesIds.zones?[0]?.id)});
 * // Other properties...
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbase/getZones:getZones", {
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    outputFile?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of zone IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: outputs.hbase.GetZonesZone[];
}

export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    return pulumi.output(args).apply(a => getZones(a, opts))
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    outputFile?: pulumi.Input<string>;
}
