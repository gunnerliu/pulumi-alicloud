// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Dedicated Host Clusters of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.146.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ecs.getEcsDedicatedHostClusters({
 *     ids: ["example_id"],
 * });
 * export const ecsDedicatedHostClusterId1 = ids.then(ids => ids.clusters?.[0]?.id);
 * const nameRegex = alicloud.ecs.getEcsDedicatedHostClusters({
 *     nameRegex: "^my-DedicatedHostCluster",
 * });
 * export const ecsDedicatedHostClusterId2 = nameRegex.then(nameRegex => nameRegex.clusters?.[0]?.id);
 * const zoneId = alicloud.ecs.getEcsDedicatedHostClusters({
 *     zoneId: "example_value",
 * });
 * export const ecsDedicatedHostClusterId3 = zoneId.then(zoneId => zoneId.clusters?.[0]?.id);
 * const clusterName = alicloud.ecs.getEcsDedicatedHostClusters({
 *     dedicatedHostClusterName: "example_value",
 * });
 * export const ecsDedicatedHostClusterId4 = clusterName.then(clusterName => clusterName.clusters?.[0]?.id);
 * const clusterIds = alicloud.ecs.getEcsDedicatedHostClusters({
 *     dedicatedHostClusterIds: ["example_id"],
 * });
 * export const ecsDedicatedHostClusterId5 = clusterIds.then(clusterIds => clusterIds.clusters?.[0]?.id);
 * ```
 */
export function getEcsDedicatedHostClusters(args?: GetEcsDedicatedHostClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsDedicatedHostClustersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEcsDedicatedHostClusters:getEcsDedicatedHostClusters", {
        "dedicatedHostClusterIds": args.dedicatedHostClusterIds,
        "dedicatedHostClusterName": args.dedicatedHostClusterName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "tags": args.tags,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsDedicatedHostClusters.
 */
export interface GetEcsDedicatedHostClustersArgs {
    /**
     * The IDs of dedicated host clusters.
     */
    dedicatedHostClusterIds?: string[];
    /**
     * The name of the dedicated host cluster.
     */
    dedicatedHostClusterName?: string;
    /**
     * A list of Dedicated Host Cluster IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Dedicated Host Cluster name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
    /**
     * The zone ID of the dedicated host cluster.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getEcsDedicatedHostClusters.
 */
export interface GetEcsDedicatedHostClustersResult {
    readonly clusters: outputs.ecs.GetEcsDedicatedHostClustersCluster[];
    readonly dedicatedHostClusterIds?: string[];
    readonly dedicatedHostClusterName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly tags?: {[key: string]: any};
    readonly zoneId?: string;
}
/**
 * This data source provides the Ecs Dedicated Host Clusters of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.146.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ecs.getEcsDedicatedHostClusters({
 *     ids: ["example_id"],
 * });
 * export const ecsDedicatedHostClusterId1 = ids.then(ids => ids.clusters?.[0]?.id);
 * const nameRegex = alicloud.ecs.getEcsDedicatedHostClusters({
 *     nameRegex: "^my-DedicatedHostCluster",
 * });
 * export const ecsDedicatedHostClusterId2 = nameRegex.then(nameRegex => nameRegex.clusters?.[0]?.id);
 * const zoneId = alicloud.ecs.getEcsDedicatedHostClusters({
 *     zoneId: "example_value",
 * });
 * export const ecsDedicatedHostClusterId3 = zoneId.then(zoneId => zoneId.clusters?.[0]?.id);
 * const clusterName = alicloud.ecs.getEcsDedicatedHostClusters({
 *     dedicatedHostClusterName: "example_value",
 * });
 * export const ecsDedicatedHostClusterId4 = clusterName.then(clusterName => clusterName.clusters?.[0]?.id);
 * const clusterIds = alicloud.ecs.getEcsDedicatedHostClusters({
 *     dedicatedHostClusterIds: ["example_id"],
 * });
 * export const ecsDedicatedHostClusterId5 = clusterIds.then(clusterIds => clusterIds.clusters?.[0]?.id);
 * ```
 */
export function getEcsDedicatedHostClustersOutput(args?: GetEcsDedicatedHostClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEcsDedicatedHostClustersResult> {
    return pulumi.output(args).apply((a: any) => getEcsDedicatedHostClusters(a, opts))
}

/**
 * A collection of arguments for invoking getEcsDedicatedHostClusters.
 */
export interface GetEcsDedicatedHostClustersOutputArgs {
    /**
     * The IDs of dedicated host clusters.
     */
    dedicatedHostClusterIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the dedicated host cluster.
     */
    dedicatedHostClusterName?: pulumi.Input<string>;
    /**
     * A list of Dedicated Host Cluster IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Dedicated Host Cluster name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The zone ID of the dedicated host cluster.
     */
    zoneId?: pulumi.Input<string>;
}
