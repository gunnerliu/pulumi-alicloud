// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides resource groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.84.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = pulumi.output(alicloud.resourcemanager.getResourceGroups({
 *     nameRegex: "tftest",
 * }));
 *
 * export const firstResourceGroupId = example.groups[0].id;
 * ```
 */
export function getResourceGroups(args?: GetResourceGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetResourceGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:resourcemanager/getResourceGroups:getResourceGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourceGroups.
 */
export interface GetResourceGroupsArgs {
    /**
     * -(Optional, Available in v1.114.0+) Default to `false`. Set it to true can output more details.
     */
    enableDetails?: boolean;
    /**
     * A list of resource group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by resource group name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of the resource group. Possible values:`Creating`,`Deleted`,`Deleting`(Available 1.114.0+) `OK` and `PendingDelete`.
     */
    status?: string;
}

/**
 * A collection of values returned by getResourceGroups.
 */
export interface GetResourceGroupsResult {
    readonly enableDetails?: boolean;
    /**
     * A list of resource groups. Each element contains the following attributes:
     */
    readonly groups: outputs.resourcemanager.GetResourceGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of resource group IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of resource group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the regional resource group.
     */
    readonly status?: string;
}

export function getResourceGroupsOutput(args?: GetResourceGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResourceGroupsResult> {
    return pulumi.output(args).apply(a => getResourceGroups(a, opts))
}

/**
 * A collection of arguments for invoking getResourceGroups.
 */
export interface GetResourceGroupsOutputArgs {
    /**
     * -(Optional, Available in v1.114.0+) Default to `false`. Set it to true can output more details.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of resource group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by resource group name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource group. Possible values:`Creating`,`Deleted`,`Deleting`(Available 1.114.0+) `OK` and `PendingDelete`.
     */
    status?: pulumi.Input<string>;
}
