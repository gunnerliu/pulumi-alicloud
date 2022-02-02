// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of RAM Roles in an Alibaba Cloud account according to the specified filters.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const rolesDs = pulumi.output(alicloud.ram.getRoles({
 *     nameRegex: ".*test.*",
 *     outputFile: "roles.txt",
 *     policyName: "AliyunACSDefaultAccess",
 *     policyType: "Custom",
 * }));
 *
 * export const firstRoleId = rolesDs.roles[0].id;
 * ```
 */
export function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ram/getRoles:getRoles", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "policyName": args.policyName,
        "policyType": args.policyType,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * - A list of ram role IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by the role name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * Filter results by a specific policy name. If you set this parameter without setting `policyType`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     */
    policyName?: string;
    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policyName` as well.
     */
    policyType?: string;
}

/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of ram role IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of ram role names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly policyName?: string;
    readonly policyType?: string;
    /**
     * A list of roles. Each element contains the following attributes:
     */
    readonly roles: outputs.ram.GetRolesRole[];
}

export function getRolesOutput(args?: GetRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesResult> {
    return pulumi.output(args).apply(a => getRoles(a, opts))
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    /**
     * - A list of ram role IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by the role name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * Filter results by a specific policy name. If you set this parameter without setting `policyType`, the later will be automatically set to `System`. The resulting roles will be attached to the specified policy.
     */
    policyName?: pulumi.Input<string>;
    /**
     * Filter results by a specific policy type. Valid values are `Custom` and `System`. If you set this parameter, you must set `policyName` as well.
     */
    policyType?: pulumi.Input<string>;
}
