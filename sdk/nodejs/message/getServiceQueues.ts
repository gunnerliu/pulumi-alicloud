// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Message Notification Service Queues of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.188.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.message.getServiceQueues({
 *     ids: ["example_id"],
 * });
 * export const queueId1 = ids.then(ids => ids.queues?.[0]?.id);
 * const name = alicloud.message.getServiceQueues({
 *     queueName: "tf-example",
 * });
 * export const queueId2 = name.then(name => name.queues?.[0]?.id);
 * ```
 */
export function getServiceQueues(args?: GetServiceQueuesArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceQueuesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:message/getServiceQueues:getServiceQueues", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "queueName": args.queueName,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceQueues.
 */
export interface GetServiceQueuesArgs {
    /**
     * A list of Queue IDs. Its element value is same as Queue Name.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Queue name.
     */
    nameRegex?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The name of the queue.
     */
    queueName?: string;
}

/**
 * A collection of values returned by getServiceQueues.
 */
export interface GetServiceQueuesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Queue names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The name of the queue.
     */
    readonly queueName?: string;
    /**
     * A list of Queues. Each element contains the following attributes:
     */
    readonly queues: outputs.message.GetServiceQueuesQueue[];
}
/**
 * This data source provides the Message Notification Service Queues of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.188.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.message.getServiceQueues({
 *     ids: ["example_id"],
 * });
 * export const queueId1 = ids.then(ids => ids.queues?.[0]?.id);
 * const name = alicloud.message.getServiceQueues({
 *     queueName: "tf-example",
 * });
 * export const queueId2 = name.then(name => name.queues?.[0]?.id);
 * ```
 */
export function getServiceQueuesOutput(args?: GetServiceQueuesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceQueuesResult> {
    return pulumi.output(args).apply((a: any) => getServiceQueues(a, opts))
}

/**
 * A collection of arguments for invoking getServiceQueues.
 */
export interface GetServiceQueuesOutputArgs {
    /**
     * A list of Queue IDs. Its element value is same as Queue Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Queue name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The name of the queue.
     */
    queueName?: pulumi.Input<string>;
}
