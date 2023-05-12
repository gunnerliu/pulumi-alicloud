// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nlb Server Group Server Attachments of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.192.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nlb.getServerGroupServerAttachments({
 *     ids: ["example_value"],
 * });
 * export const nlbServerGroupServerAttachmentId1 = ids.then(ids => ids.attachments?.[0]?.id);
 * ```
 */
export function getServerGroupServerAttachments(args?: GetServerGroupServerAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupServerAttachmentsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nlb/getServerGroupServerAttachments:getServerGroupServerAttachments", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "serverGroupId": args.serverGroupId,
        "serverIds": args.serverIds,
        "serverIps": args.serverIps,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroupServerAttachments.
 */
export interface GetServerGroupServerAttachmentsArgs {
    /**
     * A list of Server Group Server Attachment IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the server group.
     */
    serverGroupId?: string;
    /**
     * The IDs of the servers. You can specify at most 40 server IDs in each call.
     */
    serverIds?: string[];
    /**
     * The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
     */
    serverIps?: string[];
}

/**
 * A collection of values returned by getServerGroupServerAttachments.
 */
export interface GetServerGroupServerAttachmentsResult {
    readonly attachments: outputs.nlb.GetServerGroupServerAttachmentsAttachment[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly serverGroupId?: string;
    readonly serverIds?: string[];
    readonly serverIps?: string[];
}
/**
 * This data source provides the Nlb Server Group Server Attachments of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.192.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.nlb.getServerGroupServerAttachments({
 *     ids: ["example_value"],
 * });
 * export const nlbServerGroupServerAttachmentId1 = ids.then(ids => ids.attachments?.[0]?.id);
 * ```
 */
export function getServerGroupServerAttachmentsOutput(args?: GetServerGroupServerAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerGroupServerAttachmentsResult> {
    return pulumi.output(args).apply((a: any) => getServerGroupServerAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getServerGroupServerAttachments.
 */
export interface GetServerGroupServerAttachmentsOutputArgs {
    /**
     * A list of Server Group Server Attachment IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the server group.
     */
    serverGroupId?: pulumi.Input<string>;
    /**
     * The IDs of the servers. You can specify at most 40 server IDs in each call.
     */
    serverIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The IP addresses of the servers. You can specify at most 40 server IP addresses in each call.
     */
    serverIps?: pulumi.Input<pulumi.Input<string>[]>;
}
