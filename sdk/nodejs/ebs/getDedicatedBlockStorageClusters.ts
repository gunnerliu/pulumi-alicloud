// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Ebs Dedicated Block Storage Cluster available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getDedicatedBlockStorageClusters(args?: GetDedicatedBlockStorageClustersArgs, opts?: pulumi.InvokeOptions): Promise<GetDedicatedBlockStorageClustersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ebs/getDedicatedBlockStorageClusters:getDedicatedBlockStorageClusters", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDedicatedBlockStorageClusters.
 */
export interface GetDedicatedBlockStorageClustersArgs {
    /**
     * A list of Dedicated Block Storage Cluster IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getDedicatedBlockStorageClusters.
 */
export interface GetDedicatedBlockStorageClustersResult {
    /**
     * A list of Dedicated Block Storage Cluster Entries. Each element contains the following attributes:
     */
    readonly clusters: outputs.ebs.GetDedicatedBlockStorageClustersCluster[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Dedicated Block Storage Cluster IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of name of Dedicated Block Storage Clusters.
     */
    readonly names: string[];
    readonly outputFile?: string;
}
/**
 * This data source provides Ebs Dedicated Block Storage Cluster available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getDedicatedBlockStorageClustersOutput(args?: GetDedicatedBlockStorageClustersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDedicatedBlockStorageClustersResult> {
    return pulumi.output(args).apply((a: any) => getDedicatedBlockStorageClusters(a, opts))
}

/**
 * A collection of arguments for invoking getDedicatedBlockStorageClusters.
 */
export interface GetDedicatedBlockStorageClustersOutputArgs {
    /**
     * A list of Dedicated Block Storage Cluster IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
