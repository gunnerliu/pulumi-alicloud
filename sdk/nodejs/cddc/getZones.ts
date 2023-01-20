// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cddc Zones of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.147.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cddc.getZones({});
 * export const cddcZonesId1 = example.then(example => example.zones?.[0]?.id);
 * ```
 */
export function getZones(args?: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cddc/getZones:getZones", {
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
    readonly ids: string[];
    readonly outputFile?: string;
    readonly zones: outputs.cddc.GetZonesZone[];
}
/**
 * This data source provides the Cddc Zones of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.147.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cddc.getZones({});
 * export const cddcZonesId1 = example.then(example => example.zones?.[0]?.id);
 * ```
 */
export function getZonesOutput(args?: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    return pulumi.output(args).apply((a: any) => getZones(a, opts))
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    outputFile?: pulumi.Input<string>;
}
