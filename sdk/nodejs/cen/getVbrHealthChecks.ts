// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN VBR Health Checks available to the user.
 *
 * > **NOTE:** Available in 1.98.0+
 */
export function getVbrHealthChecks(args: GetVbrHealthChecksArgs, opts?: pulumi.InvokeOptions): Promise<GetVbrHealthChecksResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cen/getVbrHealthChecks:getVbrHealthChecks", {
        "cenId": args.cenId,
        "outputFile": args.outputFile,
        "vbrInstanceId": args.vbrInstanceId,
        "vbrInstanceOwnerId": args.vbrInstanceOwnerId,
        "vbrInstanceRegionId": args.vbrInstanceRegionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVbrHealthChecks.
 */
export interface GetVbrHealthChecksArgs {
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     */
    cenId?: string;
    outputFile?: string;
    /**
     * The ID of the VBR instance.
     */
    vbrInstanceId?: string;
    /**
     * The User ID (UID) of the account to which the VBR instance belongs.
     */
    vbrInstanceOwnerId?: number;
    /**
     * The ID of the region where the VBR instance is deployed.
     */
    vbrInstanceRegionId: string;
}

/**
 * A collection of values returned by getVbrHealthChecks.
 */
export interface GetVbrHealthChecksResult {
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     */
    readonly cenId?: string;
    /**
     * A list of CEN VBR Heath Checks. Each element contains the following attributes:
     */
    readonly checks: outputs.cen.GetVbrHealthChecksCheck[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of the CEN VBR Heath Check IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The ID of the VBR instance.
     */
    readonly vbrInstanceId?: string;
    readonly vbrInstanceOwnerId?: number;
    /**
     * The ID of the region where the VBR instance is deployed.
     */
    readonly vbrInstanceRegionId: string;
}

export function getVbrHealthChecksOutput(args: GetVbrHealthChecksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVbrHealthChecksResult> {
    return pulumi.output(args).apply(a => getVbrHealthChecks(a, opts))
}

/**
 * A collection of arguments for invoking getVbrHealthChecks.
 */
export interface GetVbrHealthChecksOutputArgs {
    /**
     * The ID of the Cloud Enterprise Network (CEN) instance.
     */
    cenId?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the VBR instance.
     */
    vbrInstanceId?: pulumi.Input<string>;
    /**
     * The User ID (UID) of the account to which the VBR instance belongs.
     */
    vbrInstanceOwnerId?: pulumi.Input<number>;
    /**
     * The ID of the region where the VBR instance is deployed.
     */
    vbrInstanceRegionId: pulumi.Input<string>;
}
