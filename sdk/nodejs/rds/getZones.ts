// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides availability zones for RDS that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available in v1.73.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const zonesIds = alicloud.rds.getZones({});
 * // Create an RDS instance with the first matched zone
 * const db = new alicloud.rds.Instance("db", {zoneId: zonesIds.then(zonesIds => zonesIds.zones[0])});
 * // Other properties...
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:rds/getZones:getZones", {
        "instanceChargeType": args.instanceChargeType,
        "multi": args.multi,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    readonly instanceChargeType?: string;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch RDS instances.
     */
    readonly multi?: boolean;
    readonly outputFile?: string;
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
    readonly instanceChargeType?: string;
    readonly multi?: boolean;
    readonly outputFile?: string;
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: outputs.rds.GetZonesZone[];
}
