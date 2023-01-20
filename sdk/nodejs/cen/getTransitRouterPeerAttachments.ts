// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides CEN Transit Router peer attachments available to the user.
 *
 * > **NOTE:** Available in 1.128.0+
 */
export function getTransitRouterPeerAttachments(args: GetTransitRouterPeerAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetTransitRouterPeerAttachmentsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getTransitRouterPeerAttachments:getTransitRouterPeerAttachments", {
        "cenId": args.cenId,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "transitRouterAttachmentId": args.transitRouterAttachmentId,
        "transitRouterId": args.transitRouterId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTransitRouterPeerAttachments.
 */
export interface GetTransitRouterPeerAttachmentsArgs {
    /**
     * ID of the CEN instance.
     */
    cenId: string;
    /**
     * A list of CEN Transit Router peer attachments IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter CEN Transit Router peer attachments by name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
     */
    status?: string;
    /**
     * The ID of CEN Transit Router peer attachments.
     */
    transitRouterAttachmentId?: string;
    /**
     * The ID of transit router.
     */
    transitRouterId?: string;
}

/**
 * A collection of values returned by getTransitRouterPeerAttachments.
 */
export interface GetTransitRouterPeerAttachmentsResult {
    readonly attachments: outputs.cen.GetTransitRouterPeerAttachmentsAttachment[];
    readonly cenId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of CEN Transit Router peer attachments IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of CEN Transit Router peer attachments names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the transit router attachment.
     */
    readonly status?: string;
    /**
     * ID of the transit router attachment.
     */
    readonly transitRouterAttachmentId?: string;
    /**
     * ID of the transit router.
     */
    readonly transitRouterId?: string;
}
/**
 * This data source provides CEN Transit Router peer attachments available to the user.
 *
 * > **NOTE:** Available in 1.128.0+
 */
export function getTransitRouterPeerAttachmentsOutput(args: GetTransitRouterPeerAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTransitRouterPeerAttachmentsResult> {
    return pulumi.output(args).apply((a: any) => getTransitRouterPeerAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getTransitRouterPeerAttachments.
 */
export interface GetTransitRouterPeerAttachmentsOutputArgs {
    /**
     * ID of the CEN instance.
     */
    cenId: pulumi.Input<string>;
    /**
     * A list of CEN Transit Router peer attachments IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter CEN Transit Router peer attachments by name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of CEN Transit Router peer attachment. Valid values `Attached`, `Attaching` and `Detaching`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of CEN Transit Router peer attachments.
     */
    transitRouterAttachmentId?: pulumi.Input<string>;
    /**
     * The ID of transit router.
     */
    transitRouterId?: pulumi.Input<string>;
}
