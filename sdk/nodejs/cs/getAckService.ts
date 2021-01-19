// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Using this data source can open Container Service (CS) service automatically. If the service has been opened, it will return opened.
 *
 * For information about Container Service (CS) and how to use it, see [What is Container Service (CS)](https://www.alibabacloud.com/help/en/product/85222.htm).
 *
 * > **NOTE:** Available in v1.113.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const open = pulumi.output(alicloud.cs.getAckService({
 *     enable: "On",
 * }, { async: true }));
 * ```
 */
export function getAckService(args?: GetAckServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetAckServiceResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cs/getAckService:getAckService", {
        "enable": args.enable,
    }, opts);
}

/**
 * A collection of arguments for invoking getAckService.
 */
export interface GetAckServiceArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     */
    readonly enable?: string;
}

/**
 * A collection of values returned by getAckService.
 */
export interface GetAckServiceResult {
    readonly enable?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The current service enable status.
     */
    readonly status: string;
}
