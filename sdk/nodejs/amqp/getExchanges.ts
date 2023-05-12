// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Amqp Exchanges of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.128.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.amqp.getExchanges({
 *     instanceId: "amqp-abc12345",
 *     virtualHostName: "my-VirtualHost",
 *     ids: [
 *         "my-Exchange-1",
 *         "my-Exchange-2",
 *     ],
 * });
 * export const amqpExchangeId1 = ids.then(ids => ids.exchanges?.[0]?.id);
 * const nameRegex = alicloud.amqp.getExchanges({
 *     instanceId: "amqp-abc12345",
 *     virtualHostName: "my-VirtualHost",
 *     nameRegex: "^my-Exchange",
 * });
 * export const amqpExchangeId2 = nameRegex.then(nameRegex => nameRegex.exchanges?.[0]?.id);
 * ```
 */
export function getExchanges(args: GetExchangesArgs, opts?: pulumi.InvokeOptions): Promise<GetExchangesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:amqp/getExchanges:getExchanges", {
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "virtualHostName": args.virtualHostName,
    }, opts);
}

/**
 * A collection of arguments for invoking getExchanges.
 */
export interface GetExchangesArgs {
    /**
     * A list of Exchange IDs. Its element value is same as Exchange Name.
     */
    ids?: string[];
    /**
     * The ID of the instance.
     */
    instanceId: string;
    /**
     * A regex string to filter results by Exchange name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The name of virtual host where an exchange resides.
     */
    virtualHostName: string;
}

/**
 * A collection of values returned by getExchanges.
 */
export interface GetExchangesResult {
    readonly exchanges: outputs.amqp.GetExchangesExchange[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly virtualHostName: string;
}
/**
 * This data source provides the Amqp Exchanges of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.128.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.amqp.getExchanges({
 *     instanceId: "amqp-abc12345",
 *     virtualHostName: "my-VirtualHost",
 *     ids: [
 *         "my-Exchange-1",
 *         "my-Exchange-2",
 *     ],
 * });
 * export const amqpExchangeId1 = ids.then(ids => ids.exchanges?.[0]?.id);
 * const nameRegex = alicloud.amqp.getExchanges({
 *     instanceId: "amqp-abc12345",
 *     virtualHostName: "my-VirtualHost",
 *     nameRegex: "^my-Exchange",
 * });
 * export const amqpExchangeId2 = nameRegex.then(nameRegex => nameRegex.exchanges?.[0]?.id);
 * ```
 */
export function getExchangesOutput(args: GetExchangesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetExchangesResult> {
    return pulumi.output(args).apply((a: any) => getExchanges(a, opts))
}

/**
 * A collection of arguments for invoking getExchanges.
 */
export interface GetExchangesOutputArgs {
    /**
     * A list of Exchange IDs. Its element value is same as Exchange Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the instance.
     */
    instanceId: pulumi.Input<string>;
    /**
     * A regex string to filter results by Exchange name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The name of virtual host where an exchange resides.
     */
    virtualHostName: pulumi.Input<string>;
}
