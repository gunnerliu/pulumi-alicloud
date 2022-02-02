// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Ecs File Backup Clients of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.132.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.ecs.getInstances({
 *     nameRegex: "ecs_instance_name",
 *     status: "Running",
 * });
 * const ids = alicloud.hbr.getEcsBackupClients({
 *     ids: [alicloud_hbr_ecs_backup_client["default"].id],
 *     instanceIds: [alicloud_hbr_ecs_backup_client["default"].instance_id],
 * });
 * export const hbrEcsBackupClientId1 = ids.then(ids => ids.clients?[0]?.id);
 * ```
 */
export function getEcsBackupClients(args?: GetEcsBackupClientsArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsBackupClientsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbr/getEcsBackupClients:getEcsBackupClients", {
        "ids": args.ids,
        "instanceIds": args.instanceIds,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsBackupClients.
 */
export interface GetEcsBackupClientsArgs {
    /**
     * A list of Ecs Backup Client IDs.
     */
    ids?: string[];
    /**
     * A list of ECS Instance IDs.
     */
    instanceIds?: string[];
    outputFile?: string;
    /**
     * The status of the resource.
     */
    status?: string;
}

/**
 * A collection of values returned by getEcsBackupClients.
 */
export interface GetEcsBackupClientsResult {
    readonly clients: outputs.hbr.GetEcsBackupClientsClient[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceIds?: string[];
    readonly outputFile?: string;
    readonly status?: string;
}

export function getEcsBackupClientsOutput(args?: GetEcsBackupClientsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEcsBackupClientsResult> {
    return pulumi.output(args).apply(a => getEcsBackupClients(a, opts))
}

/**
 * A collection of arguments for invoking getEcsBackupClients.
 */
export interface GetEcsBackupClientsOutputArgs {
    /**
     * A list of Ecs Backup Client IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of ECS Instance IDs.
     */
    instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}
