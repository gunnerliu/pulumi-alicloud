// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ebs Disk Replica Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.187.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ebs.getDiskReplicaGroups({
 *     ids: ["example_id"],
 * });
 * export const ebsDiskReplicaGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getDiskReplicaGroups(args?: GetDiskReplicaGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDiskReplicaGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ebs/getDiskReplicaGroups:getDiskReplicaGroups", {
        "ids": args.ids,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDiskReplicaGroups.
 */
export interface GetDiskReplicaGroupsArgs {
    /**
     * A list of Disk Replica Group IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getDiskReplicaGroups.
 */
export interface GetDiskReplicaGroupsResult {
    readonly groups: outputs.ebs.GetDiskReplicaGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides the Ebs Disk Replica Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.187.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ebs.getDiskReplicaGroups({
 *     ids: ["example_id"],
 * });
 * export const ebsDiskReplicaGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getDiskReplicaGroupsOutput(args?: GetDiskReplicaGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDiskReplicaGroupsResult> {
    return pulumi.output(args).apply((a: any) => getDiskReplicaGroups(a, opts))
}

/**
 * A collection of arguments for invoking getDiskReplicaGroups.
 */
export interface GetDiskReplicaGroupsOutputArgs {
    /**
     * A list of Disk Replica Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
