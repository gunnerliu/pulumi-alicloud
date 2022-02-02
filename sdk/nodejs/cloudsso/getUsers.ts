// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Cloud Sso Users of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.140.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cloudsso.getUsers({
 *     directoryId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const cloudSsoUserId1 = ids.then(ids => ids.users?[0]?.id);
 * const nameRegex = alicloud.cloudsso.getUsers({
 *     directoryId: "example_value",
 *     nameRegex: "^my-User",
 * });
 * export const cloudSsoUserId2 = nameRegex.then(nameRegex => nameRegex.users?[0]?.id);
 * const provisionType = alicloud.cloudsso.getUsers({
 *     directoryId: "example_value",
 *     ids: ["example_value-1"],
 *     provisionType: "Manual",
 * });
 * export const cloudSsoUserId3 = provisionType.then(provisionType => provisionType.users?[0]?.id);
 * const status = alicloud.cloudsso.getUsers({
 *     directoryId: "example_value",
 *     ids: ["example_value-1"],
 *     status: "Enabled",
 * });
 * export const cloudSsoUserId4 = status.then(status => status.users?[0]?.id);
 * ```
 */
export function getUsers(args: GetUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cloudsso/getUsers:getUsers", {
        "directoryId": args.directoryId,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "provisionType": args.provisionType,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: string;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of User IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by User name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * ProvisionType.
     */
    provisionType?: string;
    /**
     * User status. Valid values: `Enabled` and `Disabled`.
     */
    status?: string;
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    readonly directoryId: string;
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly provisionType?: string;
    readonly status?: string;
    readonly users: outputs.cloudsso.GetUsersUser[];
}

export function getUsersOutput(args: GetUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUsersResult> {
    return pulumi.output(args).apply(a => getUsers(a, opts))
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersOutputArgs {
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of User IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by User name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * ProvisionType.
     */
    provisionType?: pulumi.Input<string>;
    /**
     * User status. Valid values: `Enabled` and `Disabled`.
     */
    status?: pulumi.Input<string>;
}
