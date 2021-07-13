// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Transit Router VBR Attachments available to the user.[What is Cen Transit Router VBR Attachments](https://help.aliyun.com/document_detail/261226.html)
 *
 * > **NOTE:** Available in 1.126.0+
 */
export function getTransitRouterVbrAttachments(args: GetTransitRouterVbrAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterVbrAttachmentsResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterVbrAttachments:getTransitRouterVbrAttachments", {
        "cenId": args.cenId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterVbrAttachments.
 */
export interface GetTransitRouterVbrAttachmentsArgs {
    /**
     * ID of the CEN instance.
     */
    readonly cenId: string;
    /**
     * A list of resource id. The element value is same as `transitRouterId`.
     */
    readonly ids?: string[];
    readonly outputFile?: string;
    /**
     * The status of the resource. Valid values `Attached`, `Attaching` and `Detaching`.
     */
    readonly status?: string;
    /**
     * ID of the transit router.
     */
    readonly transitRouterId?: string;
}

/**
 * A collection of values returned by getTransitRouterVbrAttachments.
 */
export interface GetTransitRouterVbrAttachmentsResult {
    /**
     * A list of CEN Transit Router VBR Attachments. Each element contains the following attributes:
     */
    readonly attachments: outputs.cen.GetTransitRouterVbrAttachmentsAttachment[];
    readonly cenId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN Transit Router VBR attachment IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The status of the transit router attachment.
     */
    readonly status?: string;
    readonly transitRouterId?: string;
}
