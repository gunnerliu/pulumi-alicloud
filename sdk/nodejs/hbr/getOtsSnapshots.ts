// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Ots Snapshots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.164.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const snapshots = pulumi.output(alicloud.hbr.getOtsSnapshots());
 * ```
 */
export function getOtsSnapshots(args?: GetOtsSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetOtsSnapshotsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbr/getOtsSnapshots:getOtsSnapshots", {
        "endTime": args.endTime,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "startTime": args.startTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getOtsSnapshots.
 */
export interface GetOtsSnapshotsArgs {
    /**
     * The end time of the backup. This value must be a UNIX timestamp. Unit: milliseconds
     */
    endTime?: string;
    ids?: string[];
    outputFile?: string;
    /**
     * The start time of the backup snapshot. This value is a UNIX timestamp. Unit: seconds.
     */
    startTime?: string;
}

/**
 * A collection of values returned by getOtsSnapshots.
 */
export interface GetOtsSnapshotsResult {
    readonly endTime?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly snapshots: outputs.hbr.GetOtsSnapshotsSnapshot[];
    readonly startTime?: string;
}

export function getOtsSnapshotsOutput(args?: GetOtsSnapshotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetOtsSnapshotsResult> {
    return pulumi.output(args).apply(a => getOtsSnapshots(a, opts))
}

/**
 * A collection of arguments for invoking getOtsSnapshots.
 */
export interface GetOtsSnapshotsOutputArgs {
    /**
     * The end time of the backup. This value must be a UNIX timestamp. Unit: milliseconds
     */
    endTime?: pulumi.Input<string>;
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The start time of the backup snapshot. This value is a UNIX timestamp. Unit: seconds.
     */
    startTime?: pulumi.Input<string>;
}
