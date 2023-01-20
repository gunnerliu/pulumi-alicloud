// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Express Connect Virtual Physical Connection available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getVirtualPhysicalConnections(args?: GetVirtualPhysicalConnectionsArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualPhysicalConnectionsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:expressconnect/getVirtualPhysicalConnections:getVirtualPhysicalConnections", {
        "businessStatus": args.businessStatus,
        "ids": args.ids,
        "isConfirmed": args.isConfirmed,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "parentPhysicalConnectionId": args.parentPhysicalConnectionId,
        "virtualPhysicalConnectionIds": args.virtualPhysicalConnectionIds,
        "virtualPhysicalConnectionStatus": args.virtualPhysicalConnectionStatus,
        "vlanIds": args.vlanIds,
        "vpconnAliUid": args.vpconnAliUid,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualPhysicalConnections.
 */
export interface GetVirtualPhysicalConnectionsArgs {
    /**
     * The commercial status of the physical line. Value:
     * - **Normal**: activated.
     * - **Financialized**: Arrears locked.
     * - **SecurityLocked**: locked for security reasons.
     */
    businessStatus?: string;
    /**
     * A list of Virtual Physical Connection IDs.
     */
    ids?: string[];
    isConfirmed?: boolean;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The ID of the instance of the physical connection.
     */
    parentPhysicalConnectionId?: string;
    /**
     * The ID of the hosted connection. You can specify multiple hosted connection IDs.
     */
    virtualPhysicalConnectionIds?: string[];
    /**
     * The business status of the shared line. Value:
     * - **Confirmed**: The shared line has been Confirmed to receive.
     * - **UnConfirmed**: The shared line has not been confirmed to be received.
     * - **Deleted**: The shared line has been Deleted.
     */
    virtualPhysicalConnectionStatus?: string;
    /**
     * The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
     */
    vlanIds?: number[];
    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     */
    vpconnAliUid?: string;
}

/**
 * A collection of values returned by getVirtualPhysicalConnections.
 */
export interface GetVirtualPhysicalConnectionsResult {
    /**
     * The commercial status of the physical line. Value:-**Normal**: activated.-**Financialized**: Arrears locked.-**SecurityLocked**: locked for security reasons.
     */
    readonly businessStatus?: string;
    /**
     * A list of Virtual Physical Connection Entries. Each element contains the following attributes:
     */
    readonly connections: outputs.expressconnect.GetVirtualPhysicalConnectionsConnection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Virtual Physical Connection IDs.
     */
    readonly ids: string[];
    readonly isConfirmed?: boolean;
    readonly nameRegex?: string;
    /**
     * A list of name of Virtual Physical Connections.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The ID of the instance of the physical connection.
     */
    readonly parentPhysicalConnectionId?: string;
    readonly virtualPhysicalConnectionIds?: string[];
    /**
     * The business status of the shared line. Value:-**Confirmed**: The shared line has been Confirmed to receive.-**UnConfirmed**: The shared line has not been confirmed to be received.-**Deleted**: The shared line has been Deleted.
     */
    readonly virtualPhysicalConnectionStatus?: string;
    readonly vlanIds?: number[];
    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     */
    readonly vpconnAliUid?: string;
}
/**
 * This data source provides Express Connect Virtual Physical Connection available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getVirtualPhysicalConnectionsOutput(args?: GetVirtualPhysicalConnectionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualPhysicalConnectionsResult> {
    return pulumi.output(args).apply((a: any) => getVirtualPhysicalConnections(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualPhysicalConnections.
 */
export interface GetVirtualPhysicalConnectionsOutputArgs {
    /**
     * The commercial status of the physical line. Value:
     * - **Normal**: activated.
     * - **Financialized**: Arrears locked.
     * - **SecurityLocked**: locked for security reasons.
     */
    businessStatus?: pulumi.Input<string>;
    /**
     * A list of Virtual Physical Connection IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    isConfirmed?: pulumi.Input<boolean>;
    /**
     * A regex string to filter results by Group Metric Rule name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the instance of the physical connection.
     */
    parentPhysicalConnectionId?: pulumi.Input<string>;
    /**
     * The ID of the hosted connection. You can specify multiple hosted connection IDs.
     */
    virtualPhysicalConnectionIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The business status of the shared line. Value:
     * - **Confirmed**: The shared line has been Confirmed to receive.
     * - **UnConfirmed**: The shared line has not been confirmed to be received.
     * - **Deleted**: The shared line has been Deleted.
     */
    virtualPhysicalConnectionStatus?: pulumi.Input<string>;
    /**
     * The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
     */
    vlanIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     */
    vpconnAliUid?: pulumi.Input<string>;
}
