// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Config Aggregators of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.124.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cfg.getAggregators({
 *     ids: ["ca-3ce2626622af0005****"],
 *     nameRegex: "the_resource_name",
 * });
 * export const firstConfigAggregatorId = example.then(example => example.aggregators[0].id);
 * ```
 */
export function getAggregators(args?: GetAggregatorsArgs, opts?: pulumi.InvokeOptions): Promise<GetAggregatorsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cfg/getAggregators:getAggregators", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getAggregators.
 */
export interface GetAggregatorsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of aggregator ids.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by aggregator name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The status of the resource.
     */
    readonly status?: string;
}

/**
 * A collection of values returned by getAggregators.
 */
export interface GetAggregatorsResult {
    readonly aggregators: outputs.cfg.GetAggregatorsAggregator[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}