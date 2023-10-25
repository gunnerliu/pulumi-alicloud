// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Cassandra Backup Plans of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.128.0+.
 */
export function getBackupPlans(args: GetBackupPlansArgs, opts?: pulumi.InvokeOptions): Promise<GetBackupPlansResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cassandra/getBackupPlans:getBackupPlans", {
        "clusterId": args.clusterId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackupPlans.
 */
export interface GetBackupPlansArgs {
    /**
     * The ID of the cluster for the backup.
     */
    clusterId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getBackupPlans.
 */
export interface GetBackupPlansResult {
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly plans: outputs.cassandra.GetBackupPlansPlan[];
}
/**
 * This data source provides the Cassandra Backup Plans of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.128.0+.
 */
export function getBackupPlansOutput(args: GetBackupPlansOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBackupPlansResult> {
    return pulumi.output(args).apply((a: any) => getBackupPlans(a, opts))
}

/**
 * A collection of arguments for invoking getBackupPlans.
 */
export interface GetBackupPlansOutputArgs {
    /**
     * The ID of the cluster for the backup.
     */
    clusterId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
