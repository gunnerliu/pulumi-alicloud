// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcenchildinstancerouteentrytoattachment)
 *
 * > **NOTE:** Available in 1.195.0+
 */
export function getChildInstanceRouteEntryToAttachments(args: GetChildInstanceRouteEntryToAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetChildInstanceRouteEntryToAttachmentsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:cen/getChildInstanceRouteEntryToAttachments:getChildInstanceRouteEntryToAttachments", {
        "cenId": args.cenId,
        "childInstanceRouteTableId": args.childInstanceRouteTableId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "serviceType": args.serviceType,
        "transitRouterAttachmentId": args.transitRouterAttachmentId,
    }, opts);
}

/**
 * A collection of arguments for invoking getChildInstanceRouteEntryToAttachments.
 */
export interface GetChildInstanceRouteEntryToAttachmentsArgs {
    /**
     * The ID of the CEN instance.
     */
    cenId?: string;
    /**
     * The first ID of the resource
     */
    childInstanceRouteTableId: string;
    /**
     * Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * ServiceType
     */
    serviceType?: string;
    /**
     * TransitRouterAttachmentId
     */
    transitRouterAttachmentId: string;
}

/**
 * A collection of values returned by getChildInstanceRouteEntryToAttachments.
 */
export interface GetChildInstanceRouteEntryToAttachmentsResult {
    /**
     * A list of Child Instance Route Entry To Attachment Entries. Each element contains the following attributes:
     */
    readonly attachments: outputs.cen.GetChildInstanceRouteEntryToAttachmentsAttachment[];
    /**
     * The ID of the CEN instance.
     */
    readonly cenId?: string;
    /**
     * The first ID of the resource
     */
    readonly childInstanceRouteTableId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * ServiceType
     */
    readonly serviceType?: string;
    /**
     * TransitRouterAttachmentId
     */
    readonly transitRouterAttachmentId: string;
}
/**
 * This data source provides Cen Child Instance Route Entry To Attachment available to the user.[What is Child Instance Route Entry To Attachment](https://www.alibabacloud.com/help/en/cen/developer-reference/api-cbn-2017-09-12-createcenchildinstancerouteentrytoattachment)
 *
 * > **NOTE:** Available in 1.195.0+
 */
export function getChildInstanceRouteEntryToAttachmentsOutput(args: GetChildInstanceRouteEntryToAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetChildInstanceRouteEntryToAttachmentsResult> {
    return pulumi.output(args).apply((a: any) => getChildInstanceRouteEntryToAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getChildInstanceRouteEntryToAttachments.
 */
export interface GetChildInstanceRouteEntryToAttachmentsOutputArgs {
    /**
     * The ID of the CEN instance.
     */
    cenId?: pulumi.Input<string>;
    /**
     * The first ID of the resource
     */
    childInstanceRouteTableId: pulumi.Input<string>;
    /**
     * Limit search to a list of specific IDs.The value is formulated as `<cen_id>:<child_instance_route_table_id>:<transit_router_attachment_id>:<destination_cidr_block>`.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * ServiceType
     */
    serviceType?: pulumi.Input<string>;
    /**
     * TransitRouterAttachmentId
     */
    transitRouterAttachmentId: pulumi.Input<string>;
}
