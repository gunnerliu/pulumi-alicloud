// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Alb Ascript available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 */
export function getAscripts(args?: GetAscriptsArgs, opts?: pulumi.InvokeOptions): Promise<GetAscriptsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:alb/getAscripts:getAscripts", {
        "ascriptName": args.ascriptName,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "listenerId": args.listenerId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAscripts.
 */
export interface GetAscriptsArgs {
    /**
     * Script name.
     */
    ascriptName?: string;
    enableDetails?: boolean;
    /**
     * A list of AScript IDs.
     */
    ids?: string[];
    /**
     * Listener ID of script attribution
     */
    listenerId?: string;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getAscripts.
 */
export interface GetAscriptsResult {
    /**
     * Script name.
     */
    readonly ascriptName?: string;
    /**
     * A list of AScript Entries. Each element contains the following attributes:
     */
    readonly ascripts: outputs.alb.GetAscriptsAscript[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of AScript IDs.
     */
    readonly ids: string[];
    /**
     * Listener ID of script attribution.
     */
    readonly listenerId?: string;
    readonly nameRegex?: string;
    /**
     * A list of name of AScripts.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides Alb Ascript available to the user.
 *
 * > **NOTE:** Available in 1.195.0+
 */
export function getAscriptsOutput(args?: GetAscriptsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAscriptsResult> {
    return pulumi.output(args).apply((a: any) => getAscripts(a, opts))
}

/**
 * A collection of arguments for invoking getAscripts.
 */
export interface GetAscriptsOutputArgs {
    /**
     * Script name.
     */
    ascriptName?: pulumi.Input<string>;
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of AScript IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Listener ID of script attribution
     */
    listenerId?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
