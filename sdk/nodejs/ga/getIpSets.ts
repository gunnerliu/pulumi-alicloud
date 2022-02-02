// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Ip Sets of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.113.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ga.getIpSets({
 *     acceleratorId: "example_value",
 *     ids: ["example_value"],
 * });
 * export const firstGaIpSetId = example.then(example => example.sets?[0]?.id);
 * ```
 */
export function getIpSets(args: GetIpSetsArgs, opts?: pulumi.InvokeOptions): Promise<GetIpSetsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ga/getIpSets:getIpSets", {
        "acceleratorId": args.acceleratorId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpSets.
 */
export interface GetIpSetsArgs {
    /**
     * The ID of the Global Accelerator (GA) instance.
     */
    acceleratorId: string;
    /**
     * A list of Ip Set IDs.
     */
    ids?: string[];
    outputFile?: string;
    /**
     * The status of the acceleration region.
     */
    status?: string;
}

/**
 * A collection of values returned by getIpSets.
 */
export interface GetIpSetsResult {
    readonly acceleratorId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly sets: outputs.ga.GetIpSetsSet[];
    readonly status?: string;
}

export function getIpSetsOutput(args: GetIpSetsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpSetsResult> {
    return pulumi.output(args).apply(a => getIpSets(a, opts))
}

/**
 * A collection of arguments for invoking getIpSets.
 */
export interface GetIpSetsOutputArgs {
    /**
     * The ID of the Global Accelerator (GA) instance.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * A list of Ip Set IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the acceleration region.
     */
    status?: pulumi.Input<string>;
}
