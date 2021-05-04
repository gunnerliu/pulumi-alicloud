// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getDisks(args?: GetDisksArgs, opts?: pulumi.InvokeOptions): Promise<GetDisksResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ecs/getDisks:getDisks", {
        "additionalAttributes": args.additionalAttributes,
        "autoSnapshotPolicyId": args.autoSnapshotPolicyId,
        "availabilityZone": args.availabilityZone,
        "category": args.category,
        "deleteAutoSnapshot": args.deleteAutoSnapshot,
        "deleteWithInstance": args.deleteWithInstance,
        "diskName": args.diskName,
        "diskType": args.diskType,
        "dryRun": args.dryRun,
        "enableAutoSnapshot": args.enableAutoSnapshot,
        "enableAutomatedSnapshotPolicy": args.enableAutomatedSnapshotPolicy,
        "enableShared": args.enableShared,
        "encrypted": args.encrypted,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "kmsKeyId": args.kmsKeyId,
        "nameRegex": args.nameRegex,
        "operationLocks": args.operationLocks,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "portable": args.portable,
        "resourceGroupId": args.resourceGroupId,
        "snapshotId": args.snapshotId,
        "status": args.status,
        "tags": args.tags,
        "type": args.type,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDisks.
 */
export interface GetDisksArgs {
    readonly additionalAttributes?: string[];
    readonly autoSnapshotPolicyId?: string;
    /**
     * Availability zone of the disk.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
     */
    readonly availabilityZone?: string;
    /**
     * Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
     */
    readonly category?: string;
    readonly deleteAutoSnapshot?: boolean;
    readonly deleteWithInstance?: boolean;
    readonly diskName?: string;
    readonly diskType?: string;
    readonly dryRun?: boolean;
    readonly enableAutoSnapshot?: boolean;
    readonly enableAutomatedSnapshotPolicy?: boolean;
    readonly enableShared?: boolean;
    /**
     * Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     */
    readonly encrypted?: string;
    /**
     * A list of disks IDs.
     */
    readonly ids?: string[];
    /**
     * Filter the results by the specified ECS instance ID.
     */
    readonly instanceId?: string;
    readonly kmsKeyId?: string;
    /**
     * A regex string to filter results by disk name.
     */
    readonly nameRegex?: string;
    readonly operationLocks?: inputs.ecs.GetDisksOperationLock[];
    readonly outputFile?: string;
    readonly paymentType?: string;
    readonly portable?: boolean;
    /**
     * The Id of resource group which the disk belongs.
     */
    readonly resourceGroupId?: string;
    /**
     * Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     */
    readonly snapshotId?: string;
    /**
     * Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the disks. It must be in the format:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * import * as alicloud from "@pulumi/alicloud";
     *
     * const disksDs = pulumi.output(alicloud.ecs.getDisks({
     *     tags: {
     *         tagKey1: "tagValue1",
     *         tagKey2: "tagValue2",
     *     },
     * }, { async: true }));
     * ```
     */
    readonly tags?: {[key: string]: any};
    /**
     * Disk type. Possible values: `system` and `data`.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
     */
    readonly type?: string;
    readonly zoneId?: string;
}

/**
 * A collection of values returned by getDisks.
 */
export interface GetDisksResult {
    readonly additionalAttributes?: string[];
    readonly autoSnapshotPolicyId?: string;
    /**
     * Availability zone of the disk.
     *
     * @deprecated Field 'availability_zone' has been deprecated from provider version 1.122.0. New field 'zone_id' instead
     */
    readonly availabilityZone?: string;
    /**
     * Disk category. Possible values: `cloud` (basic cloud disk), `cloudEfficiency` (ultra cloud disk), `ephemeralSsd` (local SSD cloud disk), `cloudSsd` (SSD cloud disk), and `cloudEssd` (ESSD cloud disk).
     */
    readonly category?: string;
    readonly deleteAutoSnapshot?: boolean;
    readonly deleteWithInstance?: boolean;
    readonly diskName?: string;
    readonly diskType?: string;
    /**
     * A list of disks. Each element contains the following attributes:
     */
    readonly disks: outputs.ecs.GetDisksDisk[];
    readonly dryRun?: boolean;
    readonly enableAutoSnapshot?: boolean;
    readonly enableAutomatedSnapshotPolicy?: boolean;
    readonly enableShared?: boolean;
    /**
     * Indicate whether the disk is encrypted or not. Possible values: `on` and `off`.
     */
    readonly encrypted?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * ID of the related instance. It is `null` unless the `status` is `In_use`.
     */
    readonly instanceId?: string;
    readonly kmsKeyId?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly operationLocks?: outputs.ecs.GetDisksOperationLock[];
    readonly outputFile?: string;
    readonly paymentType?: string;
    readonly portable?: boolean;
    /**
     * The Id of resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * Snapshot used to create the disk. It is null if no snapshot is used to create the disk.
     */
    readonly snapshotId?: string;
    /**
     * Current status. Possible values: `In_use`, `Available`, `Attaching`, `Detaching`, `Creating` and `ReIniting`.
     */
    readonly status?: string;
    /**
     * A map of tags assigned to the disk.
     */
    readonly tags?: {[key: string]: any};
    /**
     * Disk type. Possible values: `system` and `data`.
     *
     * @deprecated Field 'type' has been deprecated from provider version 1.122.0. New field 'disk_type' instead.
     */
    readonly type?: string;
    readonly zoneId?: string;
}
