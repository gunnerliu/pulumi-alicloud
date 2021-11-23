// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Restore Jobs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultEcsBackupPlans = alicloud.hbr.getEcsBackupPlans({
 *     nameRegex: "plan-name",
 * });
 * const defaultRestoreJobs = Promise.all([defaultEcsBackupPlans, defaultEcsBackupPlans]).then(([defaultEcsBackupPlans, defaultEcsBackupPlans1]) => alicloud.hbr.getRestoreJobs({
 *     restoreType: "ECS_FILE",
 *     vaultIds: [defaultEcsBackupPlans.plans?[0]?.vaultId],
 *     targetInstanceIds: [defaultEcsBackupPlans1.plans?[0]?.instanceId],
 * }));
 * ```
 */
export function getRestoreJobs(args: GetRestoreJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetRestoreJobsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:hbr/getRestoreJobs:getRestoreJobs", {
        "outputFile": args.outputFile,
        "restoreIds": args.restoreIds,
        "restoreType": args.restoreType,
        "sourceTypes": args.sourceTypes,
        "status": args.status,
        "targetBuckets": args.targetBuckets,
        "targetFileSystemIds": args.targetFileSystemIds,
        "targetInstanceIds": args.targetInstanceIds,
        "vaultIds": args.vaultIds,
    }, opts);
}

/**
 * A collection of arguments for invoking getRestoreJobs.
 */
export interface GetRestoreJobsArgs {
    outputFile?: string;
    /**
     * The ID of restore job.
     */
    restoreIds?: string[];
    /**
     * The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
     */
    restoreType: string;
    /**
     * The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
     */
    sourceTypes?: string[];
    /**
     * The status of restore job.
     */
    status?: string;
    /**
     * The name of target ofo OSS bucket.
     */
    targetBuckets?: string[];
    /**
     * The ID of destination file system.
     */
    targetFileSystemIds?: string[];
    /**
     * The ID of target ECS instance.
     */
    targetInstanceIds?: string[];
    /**
     * The ID of backup vault.
     */
    vaultIds?: string[];
}

/**
 * A collection of values returned by getRestoreJobs.
 */
export interface GetRestoreJobsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly jobs: outputs.hbr.GetRestoreJobsJob[];
    readonly outputFile?: string;
    readonly restoreIds?: string[];
    readonly restoreType: string;
    readonly sourceTypes?: string[];
    readonly status?: string;
    readonly targetBuckets?: string[];
    readonly targetFileSystemIds?: string[];
    readonly targetInstanceIds?: string[];
    readonly vaultIds?: string[];
}

export function getRestoreJobsOutput(args: GetRestoreJobsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRestoreJobsResult> {
    return pulumi.output(args).apply(a => getRestoreJobs(a, opts))
}

/**
 * A collection of arguments for invoking getRestoreJobs.
 */
export interface GetRestoreJobsOutputArgs {
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of restore job.
     */
    restoreIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of recovery destination. Valid Values: `ECS_FILE`, `OSS`, `NAS`.
     */
    restoreType: pulumi.Input<string>;
    /**
     * The type of data source. Valid values: `ECS_FILE`, `NAS`, `OSS`.
     */
    sourceTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The status of restore job.
     */
    status?: pulumi.Input<string>;
    /**
     * The name of target ofo OSS bucket.
     */
    targetBuckets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of destination file system.
     */
    targetFileSystemIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of target ECS instance.
     */
    targetInstanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of backup vault.
     */
    vaultIds?: pulumi.Input<pulumi.Input<string>[]>;
}