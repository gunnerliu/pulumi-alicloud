// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Using this data source can open VPC Traffic Mirror service automatically. If the service has been opened, it will return opened.
 *
 * For information about VPC Traffic Mirror and how to use it, see [What is VPC Traffic Mirror](https://www.alibabacloud.com/help/en/doc-detail/207513.htm).
 *
 * > **NOTE:** Available in v1.141.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const open = pulumi.output(alicloud.vpc.getTrafficMirrorService({
 *     enable: "On",
 * }));
 * ```
 */
export function getTrafficMirrorService(args?: GetTrafficMirrorServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetTrafficMirrorServiceResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:vpc/getTrafficMirrorService:getTrafficMirrorService", {
        "enable": args.enable,
    }, opts);
}

/**
 * A collection of arguments for invoking getTrafficMirrorService.
 */
export interface GetTrafficMirrorServiceArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     */
    enable?: string;
}

/**
 * A collection of values returned by getTrafficMirrorService.
 */
export interface GetTrafficMirrorServiceResult {
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

export function getTrafficMirrorServiceOutput(args?: GetTrafficMirrorServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTrafficMirrorServiceResult> {
    return pulumi.output(args).apply(a => getTrafficMirrorService(a, opts))
}

/**
 * A collection of arguments for invoking getTrafficMirrorService.
 */
export interface GetTrafficMirrorServiceOutputArgs {
    /**
     * Setting the value to `On` to enable the service. If has been enabled, return the result. Valid values: `On` or `Off`. Default to `Off`.
     */
    enable?: pulumi.Input<string>;
}