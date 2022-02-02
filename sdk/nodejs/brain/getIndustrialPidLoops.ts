// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Brain Industrial Pid Loops of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.117.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.brain.getIndustrialPidLoops({
 *     pidProjectId: "856c6b8f-ca63-40a4-xxxx-xxxx",
 *     ids: ["742a3d4e-d8b0-47c8-xxxx-xxxx"],
 *     nameRegex: "tf-testACC",
 * });
 * export const firstBrainIndustrialPidLoopId = example.then(example => example.loops?[0]?.id);
 * ```
 */
export function getIndustrialPidLoops(args: GetIndustrialPidLoopsArgs, opts?: pulumi.InvokeOptions): Promise<GetIndustrialPidLoopsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:brain/getIndustrialPidLoops:getIndustrialPidLoops", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pidLoopName": args.pidLoopName,
        "pidProjectId": args.pidProjectId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getIndustrialPidLoops.
 */
export interface GetIndustrialPidLoopsArgs {
    enableDetails?: boolean;
    /**
     * A list of Pid Loop IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Pid Loop name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The name of Pid Loop.
     */
    pidLoopName?: string;
    /**
     * The pid project id.
     */
    pidProjectId: string;
    /**
     * The status of Pid Loop.
     */
    status?: string;
}

/**
 * A collection of values returned by getIndustrialPidLoops.
 */
export interface GetIndustrialPidLoopsResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly loops: outputs.brain.GetIndustrialPidLoopsLoop[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pidLoopName?: string;
    readonly pidProjectId: string;
    readonly status?: string;
}

export function getIndustrialPidLoopsOutput(args: GetIndustrialPidLoopsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIndustrialPidLoopsResult> {
    return pulumi.output(args).apply(a => getIndustrialPidLoops(a, opts))
}

/**
 * A collection of arguments for invoking getIndustrialPidLoops.
 */
export interface GetIndustrialPidLoopsOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Pid Loop IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Pid Loop name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The name of Pid Loop.
     */
    pidLoopName?: pulumi.Input<string>;
    /**
     * The pid project id.
     */
    pidProjectId: pulumi.Input<string>;
    /**
     * The status of Pid Loop.
     */
    status?: pulumi.Input<string>;
}
