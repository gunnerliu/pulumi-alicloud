// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Log Stores of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.126.0+.
 */
export function getStores(args: GetStoresArgs, opts?: pulumi.InvokeOptions): Promise<GetStoresResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:log/getStores:getStores", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getStores.
 */
export interface GetStoresArgs {
    /**
     * A list of store IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by store name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    project: string;
}

/**
 * A collection of values returned by getStores.
 */
export interface GetStoresResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly project: string;
    readonly stores: outputs.log.GetStoresStore[];
}
/**
 * This data source provides the Log Stores of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.126.0+.
 */
export function getStoresOutput(args: GetStoresOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStoresResult> {
    return pulumi.output(args).apply((a: any) => getStores(a, opts))
}

/**
 * A collection of arguments for invoking getStores.
 */
export interface GetStoresOutputArgs {
    /**
     * A list of store IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by store name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    project: pulumi.Input<string>;
}
