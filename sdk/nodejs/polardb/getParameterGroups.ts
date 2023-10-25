// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the PolarDB Parameter Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.183.0+.
 */
export function getParameterGroups(args?: GetParameterGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetParameterGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:polardb/getParameterGroups:getParameterGroups", {
        "dbType": args.dbType,
        "dbVersion": args.dbVersion,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterGroups.
 */
export interface GetParameterGroupsArgs {
    /**
     * The type of the database engine. Only `MySQL` is supported.
     */
    dbType?: string;
    /**
     * The version number of the database engine. Valid values: `5.6`, `5.7`, `8.0`.
     */
    dbVersion?: string;
    /**
     * A list of Parameter Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Parameter Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getParameterGroups.
 */
export interface GetParameterGroupsResult {
    /**
     * The type of the database engine.
     */
    readonly dbType?: string;
    /**
     * The version number of the database engine.
     */
    readonly dbVersion?: string;
    /**
     * A list of PolarDB Parameter Groups. Each element contains the following attributes:
     */
    readonly groups: outputs.polardb.GetParameterGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Parameter Group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the PolarDB Parameter Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.183.0+.
 */
export function getParameterGroupsOutput(args?: GetParameterGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetParameterGroupsResult> {
    return pulumi.output(args).apply((a: any) => getParameterGroups(a, opts))
}

/**
 * A collection of arguments for invoking getParameterGroups.
 */
export interface GetParameterGroupsOutputArgs {
    /**
     * The type of the database engine. Only `MySQL` is supported.
     */
    dbType?: pulumi.Input<string>;
    /**
     * The version number of the database engine. Valid values: `5.6`, `5.7`, `8.0`.
     */
    dbVersion?: pulumi.Input<string>;
    /**
     * A list of Parameter Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Parameter Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
