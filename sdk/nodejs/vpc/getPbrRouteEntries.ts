// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **NOTE:** Available in v1.162.0+.
 *
 * The data source lists a number of VPN Pbr Route Entries resource information owned by an Alicloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getPbrRouteEntries({
 *     vpnGatewayId: "example_vpn_gateway_id",
 *     ids: ["example_id"],
 * });
 * export const vpnIpsecServerId1 = ids.then(ids => ids.entries?.[0]?.id);
 * ```
 */
export function getPbrRouteEntries(args: GetPbrRouteEntriesArgs, opts?: pulumi.InvokeOptions): Promise<GetPbrRouteEntriesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:vpc/getPbrRouteEntries:getPbrRouteEntries", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "vpnGatewayId": args.vpnGatewayId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPbrRouteEntries.
 */
export interface GetPbrRouteEntriesArgs {
    /**
     * A list of VPN Pbr Route Entries IDs.
     */
    ids?: string[];
    outputFile?: string;
    /**
     * The ID of the VPN gateway.
     */
    vpnGatewayId: string;
}

/**
 * A collection of values returned by getPbrRouteEntries.
 */
export interface GetPbrRouteEntriesResult {
    /**
     * A list of VPN Pbr Route Entries. Each element contains the following attributes:
     */
    readonly entries: outputs.vpc.GetPbrRouteEntriesEntry[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * The ID of the vpn gateway.
     */
    readonly vpnGatewayId: string;
}
/**
 * > **NOTE:** Available in v1.162.0+.
 *
 * The data source lists a number of VPN Pbr Route Entries resource information owned by an Alicloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.vpc.getPbrRouteEntries({
 *     vpnGatewayId: "example_vpn_gateway_id",
 *     ids: ["example_id"],
 * });
 * export const vpnIpsecServerId1 = ids.then(ids => ids.entries?.[0]?.id);
 * ```
 */
export function getPbrRouteEntriesOutput(args: GetPbrRouteEntriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPbrRouteEntriesResult> {
    return pulumi.output(args).apply((a: any) => getPbrRouteEntries(a, opts))
}

/**
 * A collection of arguments for invoking getPbrRouteEntries.
 */
export interface GetPbrRouteEntriesOutputArgs {
    /**
     * A list of VPN Pbr Route Entries IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the VPN gateway.
     */
    vpnGatewayId: pulumi.Input<string>;
}
