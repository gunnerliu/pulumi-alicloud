// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * The `alicloud.emr.getMainVersions` data source provides a collection of emr 
 * main versions available in Alibaba Cloud account when create a emr cluster.
 *
 * > **NOTE:** Available in 1.59.0+
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultMainVersions = pulumi.output(alicloud.emr.getMainVersions({
 *     clusterTypes: [
 *         "HADOOP",
 *         "ZOOKEEPER",
 *     ],
 *     emrVersion: "EMR-3.22.0",
 * }, { async: true }));
 *
 * export const firstMainVersion = defaultMainVersions.mainVersions[0].emrVersion;
 * export const thisClusterTypes = defaultMainVersions.mainVersions[0].clusterTypes;
 * ```
 */
export function getMainVersions(args?: GetMainVersionsArgs, opts?: pulumi.InvokeOptions): Promise<GetMainVersionsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:emr/getMainVersions:getMainVersions", {
        "clusterTypes": args.clusterTypes,
        "emrVersion": args.emrVersion,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getMainVersions.
 */
export interface GetMainVersionsArgs {
    /**
     * The supported clusterType of this emr version.
     * Possible values may be any one or combination of these: ["HADOOP", "DRUID", "KAFKA", "ZOOKEEPER", "FLINK", "CLICKHOUSE"]
     */
    readonly clusterTypes?: string[];
    /**
     * The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
     */
    readonly emrVersion?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getMainVersions.
 */
export interface GetMainVersionsResult {
    readonly clusterTypes?: string[];
    /**
     * The version of the emr cluster instance.
     */
    readonly emrVersion?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of emr instance types IDs. 
     */
    readonly ids: string[];
    /**
     * A list of versions of the emr cluster instance. Each element contains the following attributes:
     */
    readonly mainVersions: outputs.emr.GetMainVersionsMainVersion[];
    readonly outputFile?: string;
}
