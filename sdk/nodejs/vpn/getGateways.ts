// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * The VPNs data source lists a number of VPNs resource information owned by an Alicloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const vpnGateways = pulumi.output(alicloud.vpn.getGateways({
 *     businessStatus: "Normal",
 *     enableIpsec: true,
 *     ids: [
 *         "fake-vpn-id1",
 *         "fake-vpn-id2",
 *     ],
 *     nameRegex: "testAcc*",
 *     outputFile: "/tmp/vpns",
 *     status: "active",
 *     vpcId: "fake-vpc-id",
 * }));
 * ```
 */
export function getGateways(args?: GetGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetGatewaysResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:vpn/getGateways:getGateways", {
        "businessStatus": args.businessStatus,
        "enableIpsec": args.enableIpsec,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysArgs {
    /**
     * Limit search to specific business status - valid value is "Normal", "FinancialLocked".
     */
    businessStatus?: string;
    /**
     * Indicates whether the IPsec-VPN feature is enabled.
     */
    enableIpsec?: boolean;
    /**
     * IDs of the VPN.
     */
    ids?: string[];
    /**
     * A regex string of VPN name.
     */
    nameRegex?: string;
    /**
     * Save the result to the file.
     */
    outputFile?: string;
    /**
     * Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
     */
    status?: string;
    /**
     * Use the VPC ID as the search key.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getGateways.
 */
export interface GetGatewaysResult {
    /**
     * The business status of the VPN gateway.
     */
    readonly businessStatus?: string;
    /**
     * Whether the ipsec function is enabled.
     */
    readonly enableIpsec?: boolean;
    /**
     * A list of VPN gateways. Each element contains the following attributes:
     */
    readonly gateways: outputs.vpn.GetGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IDs of the VPN.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * names of the VPN.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The status of the VPN
     */
    readonly status?: string;
    /**
     * ID of the VPC that the VPN belongs.
     */
    readonly vpcId?: string;
}

export function getGatewaysOutput(args?: GetGatewaysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGatewaysResult> {
    return pulumi.output(args).apply(a => getGateways(a, opts))
}

/**
 * A collection of arguments for invoking getGateways.
 */
export interface GetGatewaysOutputArgs {
    /**
     * Limit search to specific business status - valid value is "Normal", "FinancialLocked".
     */
    businessStatus?: pulumi.Input<string>;
    /**
     * Indicates whether the IPsec-VPN feature is enabled.
     */
    enableIpsec?: pulumi.Input<boolean>;
    /**
     * IDs of the VPN.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string of VPN name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * Save the result to the file.
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Limit search to specific status - valid value is "Init", "Provisioning", "Active", "Updating", "Deleting".
     */
    status?: pulumi.Input<string>;
    /**
     * Use the VPC ID as the search key.
     */
    vpcId?: pulumi.Input<string>;
}
