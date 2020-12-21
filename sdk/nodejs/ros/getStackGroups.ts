// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ros Stack Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.107.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ros.getStackGroups({
 *     ids: ["example_value"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstRosStackGroupId = example.then(example => example.groups[0].id);
 * ```
 */
export function getStackGroups(args?: GetStackGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetStackGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ros/getStackGroups:getStackGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackGroups.
 */
export interface GetStackGroupsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of Stack Group IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by Stack Group name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The status of Stack Group.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getStackGroups.
 */
export interface GetStackGroupsResult {
    readonly enableDetails?: boolean;
    readonly groups: outputs.ros.GetStackGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}