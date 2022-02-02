// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Function Compute services of the current Alibaba Cloud user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const fcServicesDs = pulumi.output(alicloud.fc.getServices({
 *     nameRegex: "sample_fc_service",
 * }));
 *
 * export const firstFcServiceName = fcServicesDs.services[0].name;
 * ```
 */
export function getServices(args?: GetServicesArgs, opts?: pulumi.InvokeOptions): Promise<GetServicesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:fc/getServices:getServices", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getServices.
 */
export interface GetServicesArgs {
    /**
     * - A list of FC services ids.
     */
    ids?: string[];
    /**
     * A regex string to filter results by FC service name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getServices.
 */
export interface GetServicesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of FC services ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of FC services names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of FC services. Each element contains the following attributes:
     */
    readonly services: outputs.fc.GetServicesService[];
}

export function getServicesOutput(args?: GetServicesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServicesResult> {
    return pulumi.output(args).apply(a => getServices(a, opts))
}

/**
 * A collection of arguments for invoking getServices.
 */
export interface GetServicesOutputArgs {
    /**
     * - A list of FC services ids.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by FC service name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
