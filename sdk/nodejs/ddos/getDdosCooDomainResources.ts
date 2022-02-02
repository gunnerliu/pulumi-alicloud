// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.123.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ddos.getDdosCooDomainResources({
 *     ids: ["tftestacc1234.abc"],
 * });
 * export const firstDdoscooDomainResourceId = example.then(example => example.resources?[0]?.id);
 * ```
 */
export function getDdosCooDomainResources(args?: GetDdosCooDomainResourcesArgs, opts?: pulumi.InvokeOptions): Promise<GetDdosCooDomainResourcesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:ddos/getDdosCooDomainResources:getDdosCooDomainResources", {
        "ids": args.ids,
        "instanceIds": args.instanceIds,
        "outputFile": args.outputFile,
        "queryDomainPattern": args.queryDomainPattern,
    }, opts);
}

/**
 * A collection of arguments for invoking getDdosCooDomainResources.
 */
export interface GetDdosCooDomainResourcesArgs {
    /**
     * A list of Domain Resource IDs.
     */
    ids?: string[];
    /**
     * A list ID of instance that you want to associate.
     */
    instanceIds?: string[];
    outputFile?: string;
    /**
     * Match the pattern.
     */
    queryDomainPattern?: string;
}

/**
 * A collection of values returned by getDdosCooDomainResources.
 */
export interface GetDdosCooDomainResourcesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceIds?: string[];
    readonly outputFile?: string;
    readonly queryDomainPattern?: string;
    readonly resources: outputs.ddos.GetDdosCooDomainResourcesResource[];
}

export function getDdosCooDomainResourcesOutput(args?: GetDdosCooDomainResourcesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDdosCooDomainResourcesResult> {
    return pulumi.output(args).apply(a => getDdosCooDomainResources(a, opts))
}

/**
 * A collection of arguments for invoking getDdosCooDomainResources.
 */
export interface GetDdosCooDomainResourcesOutputArgs {
    /**
     * A list of Domain Resource IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list ID of instance that you want to associate.
     */
    instanceIds?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * Match the pattern.
     */
    queryDomainPattern?: pulumi.Input<string>;
}
