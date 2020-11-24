// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN instances available to the user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const cenInstancesDs = alicloud.cen.getInstances({
 *     ids: ["cen-id1"],
 *     nameRegex: "^foo",
 * });
 * export const firstCenInstanceId = cenInstancesDs.then(cenInstancesDs => cenInstancesDs.instances[0].id);
 * ```
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cen/getInstances:getInstances", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    /**
     * A list of CEN instances IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter CEN instances by name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The status of CEN instance. Valid value: `Active`, `Creating` and `Deleting`.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    readonly tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN instances IDs.
     */
    readonly ids: string[];
    /**
     * A list of CEN instances. Each element contains the following attributes:
     */
    readonly instances: outputs.cen.GetInstancesInstance[];
    readonly nameRegex?: string;
    /**
     * A list of CEN instances names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * Status of the CEN instance, including "Creating", "Active" and "Deleting".
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the Cen Instance.
     */
    readonly tags?: {[key: string]: any};
}
