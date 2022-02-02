// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Cr Chart Repositories of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.149.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.cr.getChartRepositories({
 *     instanceId: "example_value",
 *     ids: [
 *         "example_value-1",
 *         "example_value-2",
 *     ],
 * });
 * export const crChartRepositoryId1 = data.alicloud_cr_chart_repositories["default"].ids[0];
 * ```
 */
export function getChartRepositories(args: GetChartRepositoriesArgs, opts?: pulumi.InvokeOptions): Promise<GetChartRepositoriesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cr/getChartRepositories:getChartRepositories", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getChartRepositories.
 */
export interface GetChartRepositoriesArgs {
    /**
     * A list of matched Container Registry Enterprise Edition repositories.
     */
    ids?: string[];
    /**
     * The ID of the Container Registry instance.
     */
    instanceId: string;
    /**
     * A regex string to filter results by repository name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getChartRepositories.
 */
export interface GetChartRepositoriesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly repositories: outputs.cr.GetChartRepositoriesRepository[];
}

export function getChartRepositoriesOutput(args: GetChartRepositoriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetChartRepositoriesResult> {
    return pulumi.output(args).apply(a => getChartRepositories(a, opts))
}

/**
 * A collection of arguments for invoking getChartRepositories.
 */
export interface GetChartRepositoriesOutputArgs {
    /**
     * A list of matched Container Registry Enterprise Edition repositories.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Container Registry instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A regex string to filter results by repository name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
