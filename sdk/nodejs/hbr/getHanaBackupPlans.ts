// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Hana Backup Plans of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.179.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getHanaBackupPlans({
 *     clusterId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const hbrHanaBackupPlanId1 = ids.then(ids => ids.plans?[0]?.id);
 * ```
 */
export function getHanaBackupPlans(args: GetHanaBackupPlansArgs, opts?: pulumi.InvokeOptions): Promise<GetHanaBackupPlansResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbr/getHanaBackupPlans:getHanaBackupPlans", {
        "clusterId": args.clusterId,
        "databaseName": args.databaseName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHanaBackupPlans.
 */
export interface GetHanaBackupPlansArgs {
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId: string;
    /**
     * The name of the database.
     */
    databaseName?: string;
    /**
     * A list of Hana Backup Plan IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Hana Backup Plan name.
     */
    nameRegex?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The ID of the backup vault.
     */
    vaultId?: string;
}

/**
 * A collection of values returned by getHanaBackupPlans.
 */
export interface GetHanaBackupPlansResult {
    readonly clusterId: string;
    readonly databaseName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly plans: outputs.hbr.GetHanaBackupPlansPlan[];
    readonly vaultId?: string;
}

export function getHanaBackupPlansOutput(args: GetHanaBackupPlansOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHanaBackupPlansResult> {
    return pulumi.output(args).apply(a => getHanaBackupPlans(a, opts))
}

/**
 * A collection of arguments for invoking getHanaBackupPlans.
 */
export interface GetHanaBackupPlansOutputArgs {
    /**
     * The ID of the SAP HANA instance.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The name of the database.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * A list of Hana Backup Plan IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Hana Backup Plan name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The ID of the backup vault.
     */
    vaultId?: pulumi.Input<string>;
}
