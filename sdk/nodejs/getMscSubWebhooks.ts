// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This data source provides the Msc Sub Webhooks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.141.0+.
 */
export function getMscSubWebhooks(args?: GetMscSubWebhooksArgs, opts?: pulumi.InvokeOptions): Promise<GetMscSubWebhooksResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:index/getMscSubWebhooks:getMscSubWebhooks", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getMscSubWebhooks.
 */
export interface GetMscSubWebhooksArgs {
    /**
     * A list of Webhook IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Webhook name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getMscSubWebhooks.
 */
export interface GetMscSubWebhooksResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly webhooks: outputs.GetMscSubWebhooksWebhook[];
}
/**
 * This data source provides the Msc Sub Webhooks of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.141.0+.
 */
export function getMscSubWebhooksOutput(args?: GetMscSubWebhooksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMscSubWebhooksResult> {
    return pulumi.output(args).apply((a: any) => getMscSubWebhooks(a, opts))
}

/**
 * A collection of arguments for invoking getMscSubWebhooks.
 */
export interface GetMscSubWebhooksOutputArgs {
    /**
     * A list of Webhook IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Webhook name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
}
