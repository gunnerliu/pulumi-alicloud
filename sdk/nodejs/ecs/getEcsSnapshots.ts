// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Snapshots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.120.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsSnapshots({
 *     ids: ["s-bp1fvuxxxxxxxx"],
 *     nameRegex: "tf-test",
 * });
 * export const firstEcsSnapshotId = example.then(example => example.snapshots?[0]?.id);
 * ```
 */
export function getEcsSnapshots(args?: GetEcsSnapshotsArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsSnapshotsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ecs/getEcsSnapshots:getEcsSnapshots", {
        "category": args.category,
        "dryRun": args.dryRun,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "snapshotLinkId": args.snapshotLinkId,
        "snapshotName": args.snapshotName,
        "snapshotType": args.snapshotType,
        "sourceDiskType": args.sourceDiskType,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "usage": args.usage,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsSnapshots.
 */
export interface GetEcsSnapshotsArgs {
    /**
     * The category of the snapshot.
     */
    category?: string;
    /**
     * Specifies whether to check the validity of the request without actually making the request.
     */
    dryRun?: boolean;
    /**
     * Whether the snapshot is encrypted.
     */
    encrypted?: boolean;
    /**
     * A list of Snapshot IDs.
     */
    ids?: string[];
    /**
     * The kms key id.
     */
    kmsKeyId?: string;
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The resource group id.
     */
    resourceGroupId?: string;
    /**
     * The snapshot link id.
     */
    snapshotLinkId?: string;
    /**
     * Snapshot Display Name.
     */
    snapshotName?: string;
    /**
     * Snapshot creation type.
     */
    snapshotType?: string;
    /**
     * Source disk attributes.
     */
    sourceDiskType?: string;
    /**
     * The status of the snapshot.
     */
    status?: string;
    /**
     * The tags.
     */
    tags?: {[key: string]: any};
    type?: string;
    /**
     * A resource type that has a reference relationship.
     */
    usage?: string;
}

/**
 * A collection of values returned by getEcsSnapshots.
 */
export interface GetEcsSnapshotsResult {
    readonly category?: string;
    readonly dryRun?: boolean;
    readonly encrypted?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly kmsKeyId?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly snapshotLinkId?: string;
    readonly snapshotName?: string;
    readonly snapshotType?: string;
    readonly snapshots: outputs.ecs.GetEcsSnapshotsSnapshot[];
    readonly sourceDiskType?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
    readonly type?: string;
    readonly usage?: string;
}

export function getEcsSnapshotsOutput(args?: GetEcsSnapshotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEcsSnapshotsResult> {
    return pulumi.output(args).apply(a => getEcsSnapshots(a, opts))
}

/**
 * A collection of arguments for invoking getEcsSnapshots.
 */
export interface GetEcsSnapshotsOutputArgs {
    /**
     * The category of the snapshot.
     */
    category?: pulumi.Input<string>;
    /**
     * Specifies whether to check the validity of the request without actually making the request.
     */
    dryRun?: pulumi.Input<boolean>;
    /**
     * Whether the snapshot is encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * A list of Snapshot IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The kms key id.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Snapshot name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The snapshot link id.
     */
    snapshotLinkId?: pulumi.Input<string>;
    /**
     * Snapshot Display Name.
     */
    snapshotName?: pulumi.Input<string>;
    /**
     * Snapshot creation type.
     */
    snapshotType?: pulumi.Input<string>;
    /**
     * Source disk attributes.
     */
    sourceDiskType?: pulumi.Input<string>;
    /**
     * The status of the snapshot.
     */
    status?: pulumi.Input<string>;
    /**
     * The tags.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    type?: pulumi.Input<string>;
    /**
     * A resource type that has a reference relationship.
     */
    usage?: pulumi.Input<string>;
}
