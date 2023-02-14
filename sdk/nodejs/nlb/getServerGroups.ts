// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nlb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.186.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nlb.getServerGroups({});
 * export const nlbServerGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.nlb.getServerGroups({
 *     nameRegex: "^my-ServerGroup",
 * });
 * export const nlbServerGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getServerGroups(args?: GetServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nlb/getServerGroups:getServerGroups", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "serverGroupNames": args.serverGroupNames,
        "serverGroupType": args.serverGroupType,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsArgs {
    /**
     * A list of Server Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The ID of the resource group to which the security group belongs.
     */
    resourceGroupId?: string;
    /**
     * The names of the server groups to be queried.
     */
    serverGroupNames?: string[];
    /**
     * The type of the server group.
     */
    serverGroupType?: string;
    /**
     * The status of the server group.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getServerGroups.
 */
export interface GetServerGroupsResult {
    readonly groups: outputs.nlb.GetServerGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly serverGroupNames?: string[];
    readonly serverGroupType?: string;
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Nlb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.186.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nlb.getServerGroups({});
 * export const nlbServerGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * const nameRegex = alicloud.nlb.getServerGroups({
 *     nameRegex: "^my-ServerGroup",
 * });
 * export const nlbServerGroupId2 = nameRegex.then(nameRegex => nameRegex.groups?.[0]?.id);
 * ```
 */
export function getServerGroupsOutput(args?: GetServerGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerGroupsResult> {
    return pulumi.output(args).apply((a: any) => getServerGroups(a, opts))
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsOutputArgs {
    /**
     * A list of Server Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource group to which the security group belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The names of the server groups to be queried.
     */
    serverGroupNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type of the server group.
     */
    serverGroupType?: pulumi.Input<string>;
    /**
     * The status of the server group.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}