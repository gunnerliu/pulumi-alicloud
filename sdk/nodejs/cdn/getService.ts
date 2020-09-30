// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Using this data source can enable CDN service automatically. If the service has been enabled, it will return `Opened`.
 *
 * For information about CDN and how to use it, see [What is CDN](https://www.alibabacloud.com/help/product/27099.htm).
 *
 * > **NOTE:** Available in v1.98.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const open = pulumi.output(alicloud.cdn.getService({
 *     enable: "On",
 *     internetChargeType: "PayByTraffic",
 * }, { async: true }));
 * ```
 */
export function getService(args?: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cdn/getService:getService", {
        "enable": args.enable,
        "internetChargeType": args.internetChargeType,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: "On" or "Off".
     */
    readonly enable?: string;
    /**
     * The new billing method. Valid values: `PayByTraffic` and `PayByBandwidth`. Default value: `PayByTraffic`.
     * It is required when `enable = on`. If the CDN service has been opened and you can update its internet charge type by modifying the filed `internetChargeType`.
     * As a note, the updated internet charge type will be effective in the next day zero time.
     */
    readonly internetChargeType?: string;
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    /**
     * The time when the change of the billing method starts to take effect. The time is displayed in GMT.
     */
    readonly changingAffectTime: string;
    /**
     * The billing method to be effective.
     */
    readonly changingChargeType: string;
    readonly enable?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly internetChargeType?: string;
    /**
     * The time when the CDN service was activated. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mmZ format.
     */
    readonly openingTime: string;
    /**
     * The current service enable status.
     */
    readonly status: string;
}