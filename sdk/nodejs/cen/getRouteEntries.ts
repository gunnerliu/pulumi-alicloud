// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Route Entries available to the user.
 */
export function getRouteEntries(args: GetRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteEntriesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getRouteEntries:getRouteEntries", {
        "cidrBlock": args.cidrBlock,
        "instanceId": args.instanceId,
        "outputFile": args.outputFile,
        "routeTableId": args.routeTableId,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesArgs {
    /**
     * The destination CIDR block of the route entry to query.
     */
    cidrBlock?: string;
    /**
     * ID of the CEN instance.
     */
    instanceId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * ID of the route table of the VPC or VBR.
     */
    routeTableId: string;
}

/**
 * A collection of values returned by getRouteEntries.
 */
export interface GetRouteEntriesResult {
    /**
     * The destination CIDR block of the conflicted route entry.
     */
    readonly cidrBlock?: string;
    /**
     * A list of CEN Route Entries. Each element contains the following attributes:
     */
    readonly entries: outputs.cen.GetRouteEntriesEntry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * ID of the CEN child instance.
     */
    readonly instanceId: string;
    readonly outputFile?: string;
    /**
     * ID of the route table.
     */
    readonly routeTableId: string;
}
/**
 * This data source provides CEN Route Entries available to the user.
 */
export function getRouteEntriesOutput(args: GetRouteEntriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteEntriesResult> {
    return pulumi.output(args).apply((a: any) => getRouteEntries(a, opts))
}

/**
 * A collection of arguments for invoking getRouteEntries.
 */
export interface GetRouteEntriesOutputArgs {
    /**
     * The destination CIDR block of the route entry to query.
     */
    cidrBlock?: pulumi.Input<string>;
    /**
     * ID of the CEN instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * ID of the route table of the VPC or VBR.
     */
    routeTableId: pulumi.Input<string>;
}
