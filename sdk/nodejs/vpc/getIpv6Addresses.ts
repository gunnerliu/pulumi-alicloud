// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Vpc Ipv6 Addresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const associatedInstanceId = alicloud.vpc.getIpv6Addresses({
 *     associatedInstanceId: "example_value",
 * });
 * export const vpcIpv6AddressId1 = associatedInstanceId.then(associatedInstanceId => associatedInstanceId.addresses?.[0]?.id);
 * const vswitchId = alicloud.vpc.getIpv6Addresses({
 *     vswitchId: "example_value",
 * });
 * export const vpcIpv6AddressId2 = vswitchId.then(vswitchId => vswitchId.addresses?.[0]?.id);
 * const vpcId = alicloud.vpc.getIpv6Addresses({
 *     vpcId: "example_value",
 * });
 * export const vpcIpv6AddressId3 = vpcId.then(vpcId => vpcId.addresses?.[0]?.id);
 * const status = alicloud.vpc.getIpv6Addresses({
 *     status: "Available",
 * });
 * export const vpcIpv6AddressId4 = status.then(status => status.addresses?.[0]?.id);
 * ```
 */
export function getIpv6Addresses(args?: GetIpv6AddressesArgs, opts?: pulumi.InvokeOptions): Promise<GetIpv6AddressesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getIpv6Addresses:getIpv6Addresses", {
        "associatedInstanceId": args.associatedInstanceId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
        "vpcId": args.vpcId,
        "vswitchId": args.vswitchId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6Addresses.
 */
export interface GetIpv6AddressesArgs {
    /**
     * The ID of the instance that is assigned the IPv6 address.
     */
    associatedInstanceId?: string;
    ids?: string[];
    outputFile?: string;
    /**
     * The status of the IPv6 address. Valid values:`Pending` or `Available`.
     */
    status?: string;
    /**
     * The ID of the VPC to which the IPv6 address belongs.
     */
    vpcId?: string;
    /**
     * The ID of the vSwitch to which the IPv6 address belongs.
     */
    vswitchId?: string;
}

/**
 * A collection of values returned by getIpv6Addresses.
 */
export interface GetIpv6AddressesResult {
    readonly addresses: outputs.vpc.GetIpv6AddressesAddress[];
    readonly associatedInstanceId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
    readonly vpcId?: string;
    readonly vswitchId?: string;
}
/**
 * This data source provides the Vpc Ipv6 Addresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.142.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const associatedInstanceId = alicloud.vpc.getIpv6Addresses({
 *     associatedInstanceId: "example_value",
 * });
 * export const vpcIpv6AddressId1 = associatedInstanceId.then(associatedInstanceId => associatedInstanceId.addresses?.[0]?.id);
 * const vswitchId = alicloud.vpc.getIpv6Addresses({
 *     vswitchId: "example_value",
 * });
 * export const vpcIpv6AddressId2 = vswitchId.then(vswitchId => vswitchId.addresses?.[0]?.id);
 * const vpcId = alicloud.vpc.getIpv6Addresses({
 *     vpcId: "example_value",
 * });
 * export const vpcIpv6AddressId3 = vpcId.then(vpcId => vpcId.addresses?.[0]?.id);
 * const status = alicloud.vpc.getIpv6Addresses({
 *     status: "Available",
 * });
 * export const vpcIpv6AddressId4 = status.then(status => status.addresses?.[0]?.id);
 * ```
 */
export function getIpv6AddressesOutput(args?: GetIpv6AddressesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIpv6AddressesResult> {
    return pulumi.output(args).apply((a: any) => getIpv6Addresses(a, opts))
}

/**
 * A collection of arguments for invoking getIpv6Addresses.
 */
export interface GetIpv6AddressesOutputArgs {
    /**
     * The ID of the instance that is assigned the IPv6 address.
     */
    associatedInstanceId?: pulumi.Input<string>;
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the IPv6 address. Valid values:`Pending` or `Available`.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the VPC to which the IPv6 address belongs.
     */
    vpcId?: pulumi.Input<string>;
    /**
     * The ID of the vSwitch to which the IPv6 address belongs.
     */
    vswitchId?: pulumi.Input<string>;
}
