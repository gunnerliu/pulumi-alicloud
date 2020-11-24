// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of Nat Gateways owned by an Alibaba Cloud account.
 *
 * > **NOTE:** Available in 1.37.0+.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "natGatewaysDatasource";
 *
 * const defaultZones = pulumi.output(alicloud.getZones({
 *     availableResourceCreation: "VSwitch",
 * }, { async: true }));
 * const fooNetwork = new alicloud.vpc.Network("foo", {
 *     cidrBlock: "172.16.0.0/12",
 * });
 * const fooNatGateway = new alicloud.vpc.NatGateway("foo", {
 *     specification: "Small",
 *     vpcId: fooNetwork.id,
 * });
 * const fooNatGateways = pulumi.all([fooNatGateway.id, fooNatGateway.name, fooNetwork.id]).apply(([fooNatGatewayId, name, fooNetworkId]) => alicloud.vpc.getNatGateways({
 *     ids: [fooNatGatewayId],
 *     nameRegex: name,
 *     vpcId: fooNetworkId,
 * }, { async: true }));
 * ```
 */
export function getNatGateways(args?: GetNatGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetNatGatewaysResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:vpc/getNatGateways:getNatGateways", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNatGateways.
 */
export interface GetNatGatewaysArgs {
    /**
     * A list of NAT gateways IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter nat gateways by name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The ID of the VPC.
     */
    readonly vpcId?: string;
}

/**
 * A collection of values returned by getNatGateways.
 */
export interface GetNatGatewaysResult {
    /**
     * A list of Nat gateways. Each element contains the following attributes:
     */
    readonly gateways: outputs.vpc.GetNatGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Optional) A list of Nat gateways IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Nat gateways names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The ID of the VPC.
     */
    readonly vpcId?: string;
}
