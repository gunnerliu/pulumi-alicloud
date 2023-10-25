// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the ots tables of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.40.0+.
 */
export function getTables(args: GetTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetTablesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ots/getTables:getTables", {
        "ids": args.ids,
        "instanceName": args.instanceName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesArgs {
    /**
     * A list of table IDs.
     */
    ids?: string[];
    /**
     * The name of OTS instance.
     */
    instanceName: string;
    /**
     * A regex string to filter results by table name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getTables.
 */
export interface GetTablesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of table IDs.
     */
    readonly ids: string[];
    /**
     * The OTS instance name.
     */
    readonly instanceName: string;
    readonly nameRegex?: string;
    /**
     * A list of table names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of tables. Each element contains the following attributes:
     */
    readonly tables: outputs.ots.GetTablesTable[];
}
/**
 * This data source provides the ots tables of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.40.0+.
 */
export function getTablesOutput(args: GetTablesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTablesResult> {
    return pulumi.output(args).apply((a: any) => getTables(a, opts))
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesOutputArgs {
    /**
     * A list of table IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of OTS instance.
     */
    instanceName: pulumi.Input<string>;
    /**
     * A regex string to filter results by table name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
