// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Sddp Configs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultConfig = new alicloud.sddp.Config("defaultConfig", {
 *     code: "access_failed_cnt",
 *     value: "10",
 * });
 * const defaultConfigs = alicloud.sddp.getConfigsOutput({
 *     ids: [defaultConfig.id],
 *     outputFile: "./t.json",
 * });
 * export const sddpConfigId = defaultConfigs.apply(defaultConfigs => defaultConfigs.ids);
 * ```
 */
export function getConfigs(args?: GetConfigsArgs, opts?: pulumi.InvokeOptions): Promise<GetConfigsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:sddp/getConfigs:getConfigs", {
        "ids": args.ids,
        "lang": args.lang,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getConfigs.
 */
export interface GetConfigsArgs {
    /**
     * A list of Config IDs.
     */
    ids?: string[];
    lang?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getConfigs.
 */
export interface GetConfigsResult {
    readonly configs: outputs.sddp.GetConfigsConfig[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly lang?: string;
    readonly outputFile?: string;
}
/**
 * This data source provides the Sddp Configs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultConfig = new alicloud.sddp.Config("defaultConfig", {
 *     code: "access_failed_cnt",
 *     value: "10",
 * });
 * const defaultConfigs = alicloud.sddp.getConfigsOutput({
 *     ids: [defaultConfig.id],
 *     outputFile: "./t.json",
 * });
 * export const sddpConfigId = defaultConfigs.apply(defaultConfigs => defaultConfigs.ids);
 * ```
 */
export function getConfigsOutput(args?: GetConfigsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConfigsResult> {
    return pulumi.output(args).apply((a: any) => getConfigs(a, opts))
}

/**
 * A collection of arguments for invoking getConfigs.
 */
export interface GetConfigsOutputArgs {
    /**
     * A list of Config IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    lang?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
