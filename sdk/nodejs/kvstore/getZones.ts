// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides availability zones for KVStore that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available in v1.73.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const zonesIds = alicloud.kvstore.getZones({});
 * // Create an KVStore instance with the first matched zone
 * const kvstore = new alicloud.kvstore.Instance("kvstore", {availabilityZone: zonesIds.then(zonesIds => zonesIds.zones?.[0]?.id)});
 * // Other properties...
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kvstore/getZones:getZones", {
        "engine": args.engine,
        "instanceChargeType": args.instanceChargeType,
        "multi": args.multi,
        "outputFile": args.outputFile,
        "productType": args.productType,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * * productType - (Optional, Available in v1.130.0+) The type of the service. Valid values:
     * * Local: an ApsaraDB for Redis instance with a local disk.
     * * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     */
    engine?: string;
    /**
     * Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    instanceChargeType?: string;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch KVStore instances.
     */
    multi?: boolean;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    productType?: string;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    readonly engine?: string;
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
    readonly productType?: string;
    /**
     * A list of availability zones. Each element contains the following attributes:
     */
    readonly zones: outputs.kvstore.GetZonesZone[];
}
/**
 * This data source provides availability zones for KVStore that can be accessed by an Alibaba Cloud account within the region configured in the provider.
 *
 * > **NOTE:** Available in v1.73.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const zonesIds = alicloud.kvstore.getZones({});
 * // Create an KVStore instance with the first matched zone
 * const kvstore = new alicloud.kvstore.Instance("kvstore", {availabilityZone: zonesIds.then(zonesIds => zonesIds.zones?.[0]?.id)});
 * // Other properties...
 * ```
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    return pulumi.output(args).apply((a: any) => getZones(a, opts))
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * * productType - (Optional, Available in v1.130.0+) The type of the service. Valid values:
     * * Local: an ApsaraDB for Redis instance with a local disk.
     * * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     */
    engine?: pulumi.Input<string>;
    /**
     * Filter the results by a specific instance charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * Indicate whether the zones can be used in a multi AZ configuration. Default to `false`. Multi AZ is usually used to launch KVStore instances.
     */
    multi?: pulumi.Input<boolean>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    productType?: pulumi.Input<string>;
}
