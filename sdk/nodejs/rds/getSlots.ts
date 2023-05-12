// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Rds Replication Slots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.204.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.rds.getSlots({
 *     dbInstanceId: "example_value",
 * });
 * export const firstRdsSlotsName = example.then(example => example.slots?.[0]?.slotName);
 * ```
 */
export function getSlots(args: GetSlotsArgs, opts?: pulumi.InvokeOptions): Promise<GetSlotsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:rds/getSlots:getSlots", {
        "dbInstanceId": args.dbInstanceId,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSlots.
 */
export interface GetSlotsArgs {
    /**
     * The db instance id.
     */
    dbInstanceId: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The resource group id.
     */
    resourceGroupId?: string;
}

/**
 * A collection of values returned by getSlots.
 */
export interface GetSlotsResult {
    readonly dbInstanceId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly slots: outputs.rds.GetSlotsSlot[];
}
/**
 * This data source provides the Rds Replication Slots of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.204.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.rds.getSlots({
 *     dbInstanceId: "example_value",
 * });
 * export const firstRdsSlotsName = example.then(example => example.slots?.[0]?.slotName);
 * ```
 */
export function getSlotsOutput(args: GetSlotsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSlotsResult> {
    return pulumi.output(args).apply((a: any) => getSlots(a, opts))
}

/**
 * A collection of arguments for invoking getSlots.
 */
export interface GetSlotsOutputArgs {
    /**
     * The db instance id.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The resource group id.
     */
    resourceGroupId?: pulumi.Input<string>;
}
