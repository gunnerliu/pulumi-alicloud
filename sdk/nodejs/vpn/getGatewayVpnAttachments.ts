// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpn Gateway Vpn Attachments of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.181.0+.
 */
export function getGatewayVpnAttachments(args?: GetGatewayVpnAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewayVpnAttachmentsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpn/getGatewayVpnAttachments:getGatewayVpnAttachments", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "vpnGatewayId": args.vpnGatewayId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGatewayVpnAttachments.
 */
export interface GetGatewayVpnAttachmentsArgs {
    /**
     * A list of Vpn Attachment IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Vpn Attachment name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the resource.
     */
    status?: string;
    /**
     * The parameter 'vpn_gateway_id' has been deprecated from 1.194.0.
     *
     * @deprecated The parameter 'vpn_gateway_id' has been deprecated from 1.194.0.
     */
    vpnGatewayId?: string;
}

/**
 * A collection of values returned by getGatewayVpnAttachments.
 */
export interface GetGatewayVpnAttachmentsResult {
    readonly attachments: outputs.vpn.GetGatewayVpnAttachmentsAttachment[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly status?: string;
    /**
     * @deprecated The parameter 'vpn_gateway_id' has been deprecated from 1.194.0.
     */
    readonly vpnGatewayId?: string;
}
/**
 * This data source provides the Vpn Gateway Vpn Attachments of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.181.0+.
 */
export function getGatewayVpnAttachmentsOutput(args?: GetGatewayVpnAttachmentsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGatewayVpnAttachmentsResult> {
    return pulumi.output(args).apply((a: any) => getGatewayVpnAttachments(a, opts))
}

/**
 * A collection of arguments for invoking getGatewayVpnAttachments.
 */
export interface GetGatewayVpnAttachmentsOutputArgs {
    /**
     * A list of Vpn Attachment IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Vpn Attachment name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * The parameter 'vpn_gateway_id' has been deprecated from 1.194.0.
     *
     * @deprecated The parameter 'vpn_gateway_id' has been deprecated from 1.194.0.
     */
    vpnGatewayId?: pulumi.Input<string>;
}
