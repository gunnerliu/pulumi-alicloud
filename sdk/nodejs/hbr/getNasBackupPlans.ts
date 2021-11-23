// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr NasBackupPlans of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getNasBackupPlans({
 *     nameRegex: "^my-NasBackupPlan",
 * });
 * export const hbrNasBackupPlanId = ids.then(ids => ids.plans?[0]?.id);
 * ```
 */
export function getNasBackupPlans(args?: GetNasBackupPlansArgs, opts?: pulumi.InvokeOptions): Promise<GetNasBackupPlansResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:hbr/getNasBackupPlans:getNasBackupPlans", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNasBackupPlans.
 */
export interface GetNasBackupPlansArgs {
    /**
     * The File System ID of Nas.
     */
    fileSystemId?: string;
    /**
     * A list of NasBackupPlan IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by NasBackupPlan name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The ID of backup vault.
     */
    vaultId?: string;
}

/**
 * A collection of values returned by getNasBackupPlans.
 */
export interface GetNasBackupPlansResult {
    readonly fileSystemId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly plans: outputs.hbr.GetNasBackupPlansPlan[];
    readonly vaultId?: string;
}

export function getNasBackupPlansOutput(args?: GetNasBackupPlansOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNasBackupPlansResult> {
    return pulumi.output(args).apply(a => getNasBackupPlans(a, opts))
}

/**
 * A collection of arguments for invoking getNasBackupPlans.
 */
export interface GetNasBackupPlansOutputArgs {
    /**
     * The File System ID of Nas.
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * A list of NasBackupPlan IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by NasBackupPlan name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of backup vault.
     */
    vaultId?: pulumi.Input<string>;
}