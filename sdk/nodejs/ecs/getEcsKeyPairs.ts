// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Key Pairs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.121.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsKeyPairs({
 *     ids: ["key_pair_name"],
 *     nameRegex: "key_pair_name",
 * });
 * export const firstEcsKeyPairId = example.then(example => example.pairs?.[0]?.id);
 * ```
 */
export function getEcsKeyPairs(args?: GetEcsKeyPairsArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsKeyPairsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEcsKeyPairs:getEcsKeyPairs", {
        "fingerPrint": args.fingerPrint,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsKeyPairs.
 */
export interface GetEcsKeyPairsArgs {
    /**
     * The finger print of the key pair.
     */
    fingerPrint?: string;
    /**
     * A list of Key Pair IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Key Pair name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The Resource Group Id.
     */
    resourceGroupId?: string;
    /**
     * The tags.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getEcsKeyPairs.
 */
export interface GetEcsKeyPairsResult {
    readonly fingerPrint?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    /**
     * @deprecated Field 'key_pairs' has been deprecated from provider version 1.121.0. New field 'pairs' instead.
     */
    readonly keyPairs: outputs.ecs.GetEcsKeyPairsKeyPair[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pairs: outputs.ecs.GetEcsKeyPairsPair[];
    readonly resourceGroupId?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides the Ecs Key Pairs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.121.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsKeyPairs({
 *     ids: ["key_pair_name"],
 *     nameRegex: "key_pair_name",
 * });
 * export const firstEcsKeyPairId = example.then(example => example.pairs?.[0]?.id);
 * ```
 */
export function getEcsKeyPairsOutput(args?: GetEcsKeyPairsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEcsKeyPairsResult> {
    return pulumi.output(args).apply((a: any) => getEcsKeyPairs(a, opts))
}

/**
 * A collection of arguments for invoking getEcsKeyPairs.
 */
export interface GetEcsKeyPairsOutputArgs {
    /**
     * The finger print of the key pair.
     */
    fingerPrint?: pulumi.Input<string>;
    /**
     * A list of Key Pair IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Key Pair name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The Resource Group Id.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The tags.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
