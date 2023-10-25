// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Database Gateway Gateways of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.135.0+.
 */
export function getGateways(args?: GetGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaysResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:databasegateway/getGateways:getGateways", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "searchKey": args.searchKey,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Gateway IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Gateway name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The search key.
     */
    searchKey?: string;
    /**
     * The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     */
    status?: string;
}

/**
 * A collection of values returned by getGateways.
 */
export interface GetGatewaysResult {
    readonly enableDetails?: boolean;
    readonly gateways: outputs.databasegateway.GetGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly searchKey?: string;
    readonly status?: string;
}
/**
 * This data source provides the Database Gateway Gateways of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.135.0+.
 */
export function getGatewaysOutput(args?: GetGatewaysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGatewaysResult> {
    return pulumi.output(args).apply((a: any) => getGateways(a, opts))
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Gateway IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Gateway name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The search key.
     */
    searchKey?: pulumi.Input<string>;
    /**
     * The status of gateway. Valid values: `EXCEPTION`, `NEW`, `RUNNING`, `STOPPED`.
     */
    status?: pulumi.Input<string>;
}
