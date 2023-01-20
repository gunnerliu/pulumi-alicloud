// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list Container Service Kubernetes Clusters on Alibaba Cloud.
 *
 * > **NOTE:** Available in v1.34.0+.
 *
 * > **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kubeConfigFilePrefix`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const k8sClusters = alicloud.cs.getKubernetesClusters({
 *     kubeConfigFilePrefix: "~/.kube/k8s",
 *     nameRegex: "my-first-k8s",
 *     outputFile: "my-first-k8s-json",
 * });
 * export const output = k8sClusters.then(k8sClusters => k8sClusters.clusters);
 * ```
 */
export function getKubernetesClusters(args?: GetKubernetesClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesClustersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cs/getKubernetesClusters:getKubernetesClusters", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "kubeConfigFilePrefix": args.kubeConfigFilePrefix,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesClusters.
 */
export interface GetKubernetesClustersArgs {
    enableDetails?: boolean;
    /**
     * Cluster IDs to filter.
     */
    ids?: string[];
    /**
     * The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
     */
    kubeConfigFilePrefix?: string;
    /**
     * A regex string to filter results by cluster name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getKubernetesClusters.
 */
export interface GetKubernetesClustersResult {
    /**
     * A list of matched Kubernetes clusters. Each element contains the following attributes:
     */
    readonly clusters: outputs.cs.GetKubernetesClustersCluster[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of matched Kubernetes clusters' ids.
     */
    readonly ids: string[];
    readonly kubeConfigFilePrefix?: string;
    readonly nameRegex?: string;
    /**
     * A list of matched Kubernetes clusters' names.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides a list Container Service Kubernetes Clusters on Alibaba Cloud.
 *
 * > **NOTE:** Available in v1.34.0+.
 *
 * > **NOTE:** From version 1.177.0+, We supported batch export of clusters' kube config information by `kubeConfigFilePrefix`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const k8sClusters = alicloud.cs.getKubernetesClusters({
 *     kubeConfigFilePrefix: "~/.kube/k8s",
 *     nameRegex: "my-first-k8s",
 *     outputFile: "my-first-k8s-json",
 * });
 * export const output = k8sClusters.then(k8sClusters => k8sClusters.clusters);
 * ```
 */
export function getKubernetesClustersOutput(args?: GetKubernetesClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesClustersResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesClusters(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesClusters.
 */
export interface GetKubernetesClustersOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * Cluster IDs to filter.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The path prefix of kube config. You could store kube config in a specified directory by specifying this field, like `~/.kube/k8s`, then it will be named with `~/.kube/k8s-clusterID-kubeconfig`. From version 1.187.0+, kubeConfig will not export kubeConfig if this field is not set.
     */
    kubeConfigFilePrefix?: pulumi.Input<string>;
    /**
     * A regex string to filter results by cluster name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
