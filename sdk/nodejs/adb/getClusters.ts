// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

export function getClusters(args?: GetClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetClustersResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:adb/getClusters:getClusters", {
        "description": args.description,
        "descriptionRegex": args.descriptionRegex,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersArgs {
    /**
     * The description of the ADB cluster.
     */
    description?: string;
    /**
     * A regex string to filter results by cluster description.
     */
    descriptionRegex?: string;
    enableDetails?: boolean;
    /**
     * A list of ADB cluster IDs.
     */
    ids?: string[];
    outputFile?: string;
    resourceGroupId?: string;
    /**
     * The status of the cluster. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`. For more information, see [Cluster status](https://www.alibabacloud.com/help/doc-detail/143075.htm).
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getClusters.
 */
export interface GetClustersResult {
    /**
     * A list of ADB clusters. Each element contains the following attributes:
     */
    readonly clusters: outputs.adb.GetClustersCluster[];
    /**
     * The description of the ADB cluster.
     */
    readonly description?: string;
    readonly descriptionRegex?: string;
    /**
     * A list of ADB cluster descriptions.
     */
    readonly descriptions: string[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of ADB cluster IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    /**
     * Status of the cluster.
     */
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}

export function getClustersOutput(args?: GetClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClustersResult> {
    return pulumi.output(args).apply(a => getClusters(a, opts))
}

/**
 * A collection of arguments for invoking getClusters.
 */
export interface GetClustersOutputArgs {
    /**
     * The description of the ADB cluster.
     */
    description?: pulumi.Input<string>;
    /**
     * A regex string to filter results by cluster description.
     */
    descriptionRegex?: pulumi.Input<string>;
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of ADB cluster IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of the cluster. Valid values: `Preparing`, `Creating`, `Restoring`, `Running`, `Deleting`, `ClassChanging`, `NetAddressCreating`, `NetAddressDeleting`. For more information, see [Cluster status](https://www.alibabacloud.com/help/doc-detail/143075.htm).
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     * - Key: It can be up to 64 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It cannot be a null string.
     * - Value: It can be up to 128 characters in length. It cannot begin with "aliyun", "acs:", "http://", or "https://". It can be a null string.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
