// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.185.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.apigateway.getLogConfigs({
 *     ids: ["example_id"],
 * });
 * export const apiGatewayLogConfigId1 = ids.then(ids => ids.configs?.[0]?.id);
 * const logType = alicloud.apigateway.getLogConfigs({
 *     logType: "PROVIDER",
 * });
 * export const apiGatewayLogConfigId2 = logType.then(logType => logType.configs?.[0]?.id);
 * ```
 */
export function getLogConfigs(args?: GetLogConfigsArgs, opts?: pulumi.InvokeOptions): Promise<GetLogConfigsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:apigateway/getLogConfigs:getLogConfigs", {
        "ids": args.ids,
        "logType": args.logType,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getLogConfigs.
 */
export interface GetLogConfigsArgs {
    /**
     * A list of Log Config IDs.
     */
    ids?: string[];
    /**
     * The type the of log.
     */
    logType?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getLogConfigs.
 */
export interface GetLogConfigsResult {
    readonly configs: outputs.apigateway.GetLogConfigsConfig[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly logType?: string;
    readonly outputFile?: string;
}
/**
 * This data source provides the Api Gateway Log Configs of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.185.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.apigateway.getLogConfigs({
 *     ids: ["example_id"],
 * });
 * export const apiGatewayLogConfigId1 = ids.then(ids => ids.configs?.[0]?.id);
 * const logType = alicloud.apigateway.getLogConfigs({
 *     logType: "PROVIDER",
 * });
 * export const apiGatewayLogConfigId2 = logType.then(logType => logType.configs?.[0]?.id);
 * ```
 */
export function getLogConfigsOutput(args?: GetLogConfigsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLogConfigsResult> {
    return pulumi.output(args).apply((a: any) => getLogConfigs(a, opts))
}

/**
 * A collection of arguments for invoking getLogConfigs.
 */
export interface GetLogConfigsOutputArgs {
    /**
     * A list of Log Config IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The type the of log.
     */
    logType?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}