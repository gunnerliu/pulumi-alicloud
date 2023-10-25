// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Rds Parameter Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.196.0+.
 */
export function getCrossRegionBackups(args: GetCrossRegionBackupsArgs, opts?: pulumi.InvokeOptions): Promise<GetCrossRegionBackupsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:rds/getCrossRegionBackups:getCrossRegionBackups", {
        "backupId": args.backupId,
        "crossBackupId": args.crossBackupId,
        "crossBackupRegion": args.crossBackupRegion,
        "dbInstanceId": args.dbInstanceId,
        "endTime": args.endTime,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "startTime": args.startTime,
    }, opts);
}

/**
 * A collection of arguments for invoking getCrossRegionBackups.
 */
export interface GetCrossRegionBackupsArgs {
    /**
     * The ID of the cross-region data backup file.
     */
    backupId?: string;
    /**
     * The ID of the cross-region data backup file.
     */
    crossBackupId?: string;
    /**
     * The ID of the destination region where the cross-region data backup file of the instance is stored.
     */
    crossBackupRegion?: string;
    /**
     * The db instance id.
     */
    dbInstanceId: string;
    /**
     * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    endTime?: string;
    /**
     * A list of Cross Region Backup IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    startTime?: string;
}

/**
 * A collection of values returned by getCrossRegionBackups.
 */
export interface GetCrossRegionBackupsResult {
    readonly backupId?: string;
    readonly backups: outputs.rds.GetCrossRegionBackupsBackup[];
    readonly crossBackupId?: string;
    readonly crossBackupRegion?: string;
    readonly dbInstanceId: string;
    readonly endTime?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly startTime?: string;
}
/**
 * This data source provides the Rds Parameter Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.196.0+.
 */
export function getCrossRegionBackupsOutput(args: GetCrossRegionBackupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCrossRegionBackupsResult> {
    return pulumi.output(args).apply((a: any) => getCrossRegionBackups(a, opts))
}

/**
 * A collection of arguments for invoking getCrossRegionBackups.
 */
export interface GetCrossRegionBackupsOutputArgs {
    /**
     * The ID of the cross-region data backup file.
     */
    backupId?: pulumi.Input<string>;
    /**
     * The ID of the cross-region data backup file.
     */
    crossBackupId?: pulumi.Input<string>;
    /**
     * The ID of the destination region where the cross-region data backup file of the instance is stored.
     */
    crossBackupRegion?: pulumi.Input<string>;
    /**
     * The db instance id.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    endTime?: pulumi.Input<string>;
    /**
     * A list of Cross Region Backup IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     */
    startTime?: pulumi.Input<string>;
}
