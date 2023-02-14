// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.servicecatalog.getProductAsEndUsers({
 *     nameRegex: "ram模板创建",
 * });
 * export const alicloudServiceCatalogProductAsEndUserExampleId = _default.then(_default => _default.users?.[0]?.id);
 * ```
 */
export function getProductAsEndUsers(args?: GetProductAsEndUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetProductAsEndUsersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:servicecatalog/getProductAsEndUsers:getProductAsEndUsers", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "sortBy": args.sortBy,
        "sortOrder": args.sortOrder,
    }, opts);
}

/**
 * A collection of arguments for invoking getProductAsEndUsers.
 */
export interface GetProductAsEndUsersArgs {
    /**
     * A list of Product As End User IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by product name.
     */
    nameRegex?: string;
    outputFile?: string;
    sortBy?: string;
    sortOrder?: string;
}

/**
 * A collection of values returned by getProductAsEndUsers.
 */
export interface GetProductAsEndUsersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Product As End User IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly sortBy?: string;
    readonly sortOrder?: string;
    /**
     * A list of Product As End User Entries. Each element contains the following attributes:
     */
    readonly users: outputs.servicecatalog.GetProductAsEndUsersUser[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.servicecatalog.getProductAsEndUsers({
 *     nameRegex: "ram模板创建",
 * });
 * export const alicloudServiceCatalogProductAsEndUserExampleId = _default.then(_default => _default.users?.[0]?.id);
 * ```
 */
export function getProductAsEndUsersOutput(args?: GetProductAsEndUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetProductAsEndUsersResult> {
    return pulumi.output(args).apply((a: any) => getProductAsEndUsers(a, opts))
}

/**
 * A collection of arguments for invoking getProductAsEndUsers.
 */
export interface GetProductAsEndUsersOutputArgs {
    /**
     * A list of Product As End User IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by product name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    sortBy?: pulumi.Input<string>;
    sortOrder?: pulumi.Input<string>;
}