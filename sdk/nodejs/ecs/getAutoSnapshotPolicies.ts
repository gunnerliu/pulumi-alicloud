// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Auto Snapshot Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.117.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getAutoSnapshotPolicies({
 *     ids: ["sp-bp14e66xxxxxxxx"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstEcsAutoSnapshotPolicyId = example.then(example => example.policies?.[0]?.id);
 * ```
 */
export function getAutoSnapshotPolicies(args?: GetAutoSnapshotPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetAutoSnapshotPoliciesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getAutoSnapshotPolicies:getAutoSnapshotPolicies", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getAutoSnapshotPolicies.
 */
export interface GetAutoSnapshotPoliciesArgs {
    /**
     * A list of Auto Snapshot Policy IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Auto Snapshot Policy name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of Auto Snapshot Policy.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getAutoSnapshotPolicies.
 */
export interface GetAutoSnapshotPoliciesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly policies: outputs.ecs.GetAutoSnapshotPoliciesPolicy[];
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Ecs Auto Snapshot Policies of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.117.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getAutoSnapshotPolicies({
 *     ids: ["sp-bp14e66xxxxxxxx"],
 *     nameRegex: "tf-testAcc",
 * });
 * export const firstEcsAutoSnapshotPolicyId = example.then(example => example.policies?.[0]?.id);
 * ```
 */
export function getAutoSnapshotPoliciesOutput(args?: GetAutoSnapshotPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAutoSnapshotPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getAutoSnapshotPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getAutoSnapshotPolicies.
 */
export interface GetAutoSnapshotPoliciesOutputArgs {
    /**
     * A list of Auto Snapshot Policy IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Auto Snapshot Policy name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of Auto Snapshot Policy.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
