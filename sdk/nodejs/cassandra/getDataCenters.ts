// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * The `alicloud.cassandra.getDataCenters` data source provides a collection of Cassandra Data Centers available in Alicloud account.
 * Filters support regular expression for the cluster name or ids.
 *
 * > **NOTE:**  Available in 1.88.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const cassandra = pulumi.output(alicloud.cassandra.getDataCenters({
 *     clusterId: "cds-xxxxx",
 *     nameRegex: "tf_testAccCassandra_dc",
 * }));
 * ```
 */
export function getDataCenters(args: GetDataCentersArgs, opts?: pulumi.InvokeOptions): Promise<GetDataCentersResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cassandra/getDataCenters:getDataCenters", {
        "clusterId": args.clusterId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getDataCenters.
 */
export interface GetDataCentersArgs {
    /**
     * The cluster id of dataCenters belongs to.
     */
    clusterId: string;
    /**
     * The list of Cassandra data center ids.
     */
    ids?: string[];
    /**
     * A regex string to apply to the cluster name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getDataCenters.
 */
export interface GetDataCentersResult {
    /**
     * A list of Cassandra data centers. Its every element contains the following attributes:
     */
    readonly centers: outputs.cassandra.GetDataCentersCenter[];
    /**
     * The ID of the Cassandra cluster.
     */
    readonly clusterId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The list of Cassandra data center ids.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * The name list of Cassandra data centers.
     */
    readonly names: string[];
    readonly outputFile?: string;
}

export function getDataCentersOutput(args: GetDataCentersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDataCentersResult> {
    return pulumi.output(args).apply(a => getDataCenters(a, opts))
}

/**
 * A collection of arguments for invoking getDataCenters.
 */
export interface GetDataCentersOutputArgs {
    /**
     * The cluster id of dataCenters belongs to.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The list of Cassandra data center ids.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to apply to the cluster name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
