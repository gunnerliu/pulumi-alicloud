// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.176.0+.
 */
export function getCustomProperties(args?: GetCustomPropertiesArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomPropertiesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eds/getCustomProperties:getCustomProperties", {
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomProperties.
 */
export interface GetCustomPropertiesArgs {
    /**
     * A list of Custom Property IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getCustomProperties.
 */
export interface GetCustomPropertiesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly properties: outputs.eds.GetCustomPropertiesProperty[];
}
/**
 * This data source provides the Ecd Custom Properties of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.176.0+.
 */
export function getCustomPropertiesOutput(args?: GetCustomPropertiesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCustomPropertiesResult> {
    return pulumi.output(args).apply((a: any) => getCustomProperties(a, opts))
}

/**
 * A collection of arguments for invoking getCustomProperties.
 */
export interface GetCustomPropertiesOutputArgs {
    /**
     * A list of Custom Property IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
