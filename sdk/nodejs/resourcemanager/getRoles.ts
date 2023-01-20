// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Resource Manager Roles of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.86.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.resourcemanager.getRoles({
 *     nameRegex: "tftest",
 * });
 * export const firstRoleId = example.then(example => example.roles?.[0]?.id);
 * ```
 */
export function getRoles(args?: GetRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetRolesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:resourcemanager/getRoles:getRoles", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesArgs {
    /**
     * Default to `false`. Set it to true can output more details.
     */
    enableDetails?: boolean;
    /**
     * A list of Resource Manager Role IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by role name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getRoles.
 */
export interface GetRolesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of role IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of role names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A list of roles. Each element contains the following attributes:
     */
    readonly roles: outputs.resourcemanager.GetRolesRole[];
}
/**
 * This data source provides the Resource Manager Roles of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.86.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.resourcemanager.getRoles({
 *     nameRegex: "tftest",
 * });
 * export const firstRoleId = example.then(example => example.roles?.[0]?.id);
 * ```
 */
export function getRolesOutput(args?: GetRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRolesResult> {
    return pulumi.output(args).apply((a: any) => getRoles(a, opts))
}

/**
 * A collection of arguments for invoking getRoles.
 */
export interface GetRolesOutputArgs {
    /**
     * Default to `false`. Set it to true can output more details.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Resource Manager Role IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by role name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
