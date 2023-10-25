// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **DEPRECATED:**  This datasource has been deprecated from version `1.126.0`. Please use new datasource alicloud_eip_addresses.
 *
 * This data source provides a list of EIPs (Elastic IP address) owned by an Alibaba Cloud account.
 */
/** @deprecated This function has been deprecated in favour of the getEipAddresses function */
export function getEips(args?: GetEipsArgs, opts?: pulumi.InvokeOptions): Promise<GetEipsResult> {
    pulumi.log.warn("getEips is deprecated: This function has been deprecated in favour of the getEipAddresses function")
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getEips:getEips", {
        "addressName": args.addressName,
        "associatedInstanceId": args.associatedInstanceId,
        "associatedInstanceType": args.associatedInstanceType,
        "dryRun": args.dryRun,
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "includeReservationData": args.includeReservationData,
        "ipAddress": args.ipAddress,
        "ipAddresses": args.ipAddresses,
        "isp": args.isp,
        "lockReason": args.lockReason,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "paymentType": args.paymentType,
        "resourceGroupId": args.resourceGroupId,
        "segmentInstanceId": args.segmentInstanceId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEips.
 */
export interface GetEipsArgs {
    addressName?: string;
    associatedInstanceId?: string;
    associatedInstanceType?: string;
    dryRun?: boolean;
    enableDetails?: boolean;
    /**
     * A list of EIP IDs.
     */
    ids?: string[];
    includeReservationData?: boolean;
    /**
     * Public IP Address of the the EIP.
     */
    ipAddress?: string;
    /**
     * A list of EIP public IP addresses.
     *
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    ipAddresses?: string[];
    isp?: string;
    lockReason?: string;
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    paymentType?: string;
    /**
     * The Id of resource group which the eips belongs.
     */
    resourceGroupId?: string;
    segmentInstanceId?: string;
    /**
     * EIP status. Possible values are: `Associating`, `Unassociating`, `InUse` and `Available`.
     */
    status?: string;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getEips.
 */
export interface GetEipsResult {
    readonly addressName?: string;
    readonly addresses: outputs.ecs.GetEipsAddress[];
    readonly associatedInstanceId?: string;
    readonly associatedInstanceType?: string;
    readonly dryRun?: boolean;
    /**
     * A list of EIPs. Each element contains the following attributes:
     *
     * @deprecated Field 'eips' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'addresses' instead.
     */
    readonly eips: outputs.ecs.GetEipsEip[];
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional) A list of EIP IDs.
     */
    readonly ids: string[];
    readonly includeReservationData?: boolean;
    /**
     * Public IP Address of the the EIP.
     */
    readonly ipAddress?: string;
    /**
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    readonly ipAddresses?: string[];
    readonly isp?: string;
    readonly lockReason?: string;
    readonly nameRegex?: string;
    /**
     * (Optional) A list of EIP names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly paymentType?: string;
    /**
     * The Id of resource group which the eips belongs.
     */
    readonly resourceGroupId?: string;
    readonly segmentInstanceId?: string;
    /**
     * EIP status. Possible values are: `Associating`, `Unassociating`, `InUse` and `Available`.
     */
    readonly status?: string;
    readonly tags?: {[key: string]: any};
}
/**
 * > **DEPRECATED:**  This datasource has been deprecated from version `1.126.0`. Please use new datasource alicloud_eip_addresses.
 *
 * This data source provides a list of EIPs (Elastic IP address) owned by an Alibaba Cloud account.
 */
/** @deprecated This function has been deprecated in favour of the getEipAddresses function */
export function getEipsOutput(args?: GetEipsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEipsResult> {
    return pulumi.output(args).apply((a: any) => getEips(a, opts))
}

/**
 * A collection of arguments for invoking getEips.
 */
export interface GetEipsOutputArgs {
    addressName?: pulumi.Input<string>;
    associatedInstanceId?: pulumi.Input<string>;
    associatedInstanceType?: pulumi.Input<string>;
    dryRun?: pulumi.Input<boolean>;
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of EIP IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    includeReservationData?: pulumi.Input<boolean>;
    /**
     * Public IP Address of the the EIP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * A list of EIP public IP addresses.
     *
     * @deprecated Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead.
     */
    ipAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    isp?: pulumi.Input<string>;
    lockReason?: pulumi.Input<string>;
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    paymentType?: pulumi.Input<string>;
    /**
     * The Id of resource group which the eips belongs.
     */
    resourceGroupId?: pulumi.Input<string>;
    segmentInstanceId?: pulumi.Input<string>;
    /**
     * EIP status. Possible values are: `Associating`, `Unassociating`, `InUse` and `Available`.
     */
    status?: pulumi.Input<string>;
    /**
     * A mapping of tags to assign to the resource.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
