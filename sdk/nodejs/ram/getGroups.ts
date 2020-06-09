// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of RAM Groups in an Alibaba Cloud account according to the specified filters.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const groupsDs = pulumi.output(alicloud.ram.getGroups({
 *     nameRegex: "^group[0-9]*",
 *     outputFile: "groups.txt",
 *     userName: "user1",
 * }, { async: true }));
 *
 * export const firstGroupName = groupsDs.groups[0].name;
 * ```
 */
export function getGroups(args?: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ram/getGroups:getGroups", {
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "policyName": args.policyName,
        "policyType": args.policyType,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * A regex string to filter the returned groups by their names.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * Filter the results by a specific policy name. If you set this parameter without setting `policyType`, it will be automatically set to `System`.
     */
    readonly policyName?: string;
    /**
     * Filter the results by a specific policy type. Valid items are `Custom` and `System`. If you set this parameter, you must set `policyName` as well.
     */
    readonly policyType?: string;
    /**
     * Filter the results by a specific the user name.
     */
    readonly userName?: string;
}

/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    /**
     * A list of groups. Each element contains the following attributes:
     */
    readonly groups: outputs.ram.GetGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly nameRegex?: string;
    /**
     * A list of ram group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly policyName?: string;
    readonly policyType?: string;
    readonly userName?: string;
}
