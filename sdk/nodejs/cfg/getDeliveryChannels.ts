// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Config Delivery Channels of the current Alibaba Cloud user.
 *
 * > **NOTE:**  Available in 1.99.0+.
 *
 * > **NOTE:** The Cloud Config region only support `cn-shanghai` and `ap-northeast-1`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.cfg.getDeliveryChannels({
 *     ids: ["cdc-49a2ad756057********"],
 *     nameRegex: "tftest",
 * });
 * export const firstConfigDeliveryChannelId = example.then(example => example.channels[0].id);
 * ```
 */
export function getDeliveryChannels(args?: GetDeliveryChannelsArgs, opts?: pulumi.InvokeOptions): Promise<GetDeliveryChannelsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cfg/getDeliveryChannels:getDeliveryChannels", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeliveryChannels.
 */
export interface GetDeliveryChannelsArgs {
    /**
     * A list of Config Delivery Channel IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by delivery channel name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The status of the config delivery channel. Valid values `0`: Disable delivery channel, `1`: Enable delivery channel.
     */
    readonly status?: number;
}

/**
 * A collection of values returned by getDeliveryChannels.
 */
export interface GetDeliveryChannelsResult {
    /**
     * A list of Config Delivery Channels. Each element contains the following attributes:
     */
    readonly channels: outputs.cfg.GetDeliveryChannelsChannel[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Config Delivery Channel IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Config Delivery Channel names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the delivery method.
     */
    readonly status?: number;
}
