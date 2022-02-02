// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Simple Application Server Snapshots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.143.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.simpleapplicationserver.getServerSnapshots({
 *     ids: ["example_id"],
 * });
 * export const simpleApplicationServerSnapshotId1 = ids.then(ids => ids.snapshots?[0]?.id);
 * const nameRegex = alicloud.simpleapplicationserver.getServerSnapshots({
 *     nameRegex: "^my-Snapshot",
 * });
 * export const simpleApplicationServerSnapshotId2 = nameRegex.then(nameRegex => nameRegex.snapshots?[0]?.id);
 * const diskIdConf = alicloud.simpleapplicationserver.getServerSnapshots({
 *     ids: ["example_id"],
 *     diskId: "example_value",
 * });
 * export const simpleApplicationServerSnapshotId3 = diskIdConf.then(diskIdConf => diskIdConf.snapshots?[0]?.id);
 * const instanceIdConf = alicloud.simpleapplicationserver.getServerSnapshots({
 *     ids: ["example_id"],
 *     instanceId: "example_value",
 * });
 * export const simpleApplicationServerSnapshotId4 = instanceIdConf.then(instanceIdConf => instanceIdConf.snapshots?[0]?.id);
 * ```
 */
export function getServerSnapshots(args?: GetServerSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerSnapshotsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:simpleapplicationserver/getServerSnapshots:getServerSnapshots", {
        "diskId": args.diskId,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerSnapshots.
 */
export interface GetServerSnapshotsArgs {
    /**
     * The ID of the source disk. This parameter has a value even after the source disk is released.
     */
    diskId?: string;
    /**
     * A list of Snapshot IDs.
     */
    ids?: string[];
    /**
     * The ID of the simple application server.
     */
    instanceId?: string;
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
     */
    status?: string;
}

/**
 * A collection of values returned by getServerSnapshots.
 */
export interface GetServerSnapshotsResult {
    readonly diskId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly snapshots: outputs.simpleapplicationserver.GetServerSnapshotsSnapshot[];
    readonly status?: string;
}

export function getServerSnapshotsOutput(args?: GetServerSnapshotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerSnapshotsResult> {
    return pulumi.output(args).apply(a => getServerSnapshots(a, opts))
}

/**
 * A collection of arguments for invoking getServerSnapshots.
 */
export interface GetServerSnapshotsOutputArgs {
    /**
     * The ID of the source disk. This parameter has a value even after the source disk is released.
     */
    diskId?: pulumi.Input<string>;
    /**
     * A list of Snapshot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the simple application server.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the snapshots. Valid values: `Progressing`, `Accomplished` and `Failed`.
     */
    status?: pulumi.Input<string>;
}
