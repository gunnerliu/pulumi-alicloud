// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Click House Backup Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.147.0+.
 */
export function getBackupPolicies(args: GetBackupPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetBackupPoliciesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:clickhouse/getBackupPolicies:getBackupPolicies", {
        "dbClusterId": args.dbClusterId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getBackupPolicies.
 */
export interface GetBackupPoliciesArgs {
    /**
     * The db cluster id.
     */
    dbClusterId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getBackupPolicies.
 */
export interface GetBackupPoliciesResult {
    readonly dbClusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly policies: outputs.clickhouse.GetBackupPoliciesPolicy[];
}
/**
 * This data source provides the Click House Backup Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.147.0+.
 */
export function getBackupPoliciesOutput(args: GetBackupPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBackupPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getBackupPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getBackupPolicies.
 */
export interface GetBackupPoliciesOutputArgs {
    /**
     * The db cluster id.
     */
    dbClusterId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
