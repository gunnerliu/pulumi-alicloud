// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the available zones with the Private Zone Resolver of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.143.0+.
 */
export function getResolverZones(args?: GetResolverZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetResolverZonesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:pvtz/getResolverZones:getResolverZones", {
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getResolverZones.
 */
export interface GetResolverZonesArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the Zone.
     */
    status?: string;
}

/**
 * A collection of values returned by getResolverZones.
 */
export interface GetResolverZonesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly status?: string;
    readonly zones: outputs.pvtz.GetResolverZonesZone[];
}
/**
 * This data source provides the available zones with the Private Zone Resolver of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.143.0+.
 */
export function getResolverZonesOutput(args?: GetResolverZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResolverZonesResult> {
    return pulumi.output(args).apply((a: any) => getResolverZones(a, opts))
}

/**
 * A collection of arguments for invoking getResolverZones.
 */
export interface GetResolverZonesOutputArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the Zone.
     */
    status?: pulumi.Input<string>;
}
