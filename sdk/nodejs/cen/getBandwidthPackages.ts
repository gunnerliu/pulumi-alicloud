// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Bandwidth Packages available to the user.
 */
export function getBandwidthPackages(args?: GetBandwidthPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetBandwidthPackagesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getBandwidthPackages:getBandwidthPackages", {
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getBandwidthPackages.
 */
export interface GetBandwidthPackagesArgs {
    /**
     * Limit search to a list of specific CEN Bandwidth Package IDs.
     */
    ids?: string[];
    /**
     * Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
     */
    includeReservationData?: boolean;
    /**
     * ID of a CEN instance.
     */
    instanceId?: string;
    /**
     * A regex string to filter CEN Bandwidth Package by name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
     */
    status?: string;
}

/**
 * A collection of values returned by getBandwidthPackages.
 */
export interface GetBandwidthPackagesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of specific CEN Bandwidth Package IDs.
     */
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    /**
     * The ID of the CEN instance that are associated with the bandwidth package.
     */
    readonly instanceId?: string;
    readonly nameRegex?: string;
    /**
     * (Available in 1.98.0+) - A list of CEN Bandwidth Package Names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of CEN bandwidth package. Each element contains the following attributes:
     */
    readonly packages: outputs.cen.GetBandwidthPackagesPackage[];
    /**
     * Status of the CEN Bandwidth Package in CEN instance, including `Idle` and `InUse`.
     */
    readonly status?: string;
}
/**
 * This data source provides CEN Bandwidth Packages available to the user.
 */
export function getBandwidthPackagesOutput(args?: GetBandwidthPackagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBandwidthPackagesResult> {
    return pulumi.output(args).apply((a: any) => getBandwidthPackages(a, opts))
}

/**
 * A collection of arguments for invoking getBandwidthPackages.
 */
export interface GetBandwidthPackagesOutputArgs {
    /**
     * Limit search to a list of specific CEN Bandwidth Package IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether to include renewal data. Valid values: `true`: Return renewal data in the response. `false`: Do not return renewal data in the response.
     */
    includeReservationData?: pulumi.Input<boolean>;
    /**
     * ID of a CEN instance.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * A regex string to filter CEN Bandwidth Package by name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Status of the CEN Bandwidth Package in CEN instance, Valid value: `Idle` and `InUse`.
     */
    status?: pulumi.Input<string>;
}
