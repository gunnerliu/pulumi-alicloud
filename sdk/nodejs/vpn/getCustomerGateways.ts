// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * The VPN customers gateways data source lists a number of VPN customer gateways resource information owned by an Alicloud account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const foo = pulumi.output(alicloud.vpn.getCustomerGateways({
 *     ids: [
 *         "fake-id1",
 *         "fake-id2",
 *     ],
 *     nameRegex: "testAcc*",
 *     outputFile: "/tmp/cgws",
 * }));
 * ```
 */
export function getCustomerGateways(args?: GetCustomerGatewaysArgs, opts?: pulumi.InvokeOptions): Promise<GetCustomerGatewaysResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:vpn/getCustomerGateways:getCustomerGateways", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getCustomerGateways.
 */
export interface GetCustomerGatewaysArgs {
    /**
     * ID of the VPN customer gateways.
     */
    ids?: string[];
    /**
     * A regex string of VPN customer gateways name.
     */
    nameRegex?: string;
    /**
     * Save the result to the file.
     */
    outputFile?: string;
}

/**
 * A collection of values returned by getCustomerGateways.
 */
export interface GetCustomerGatewaysResult {
    /**
     * A list of VPN customer gateways. Each element contains the following attributes:
     */
    readonly gateways: outputs.vpn.GetCustomerGatewaysGateway[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}

export function getCustomerGatewaysOutput(args?: GetCustomerGatewaysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetCustomerGatewaysResult> {
    return pulumi.output(args).apply(a => getCustomerGateways(a, opts))
}

/**
 * A collection of arguments for invoking getCustomerGateways.
 */
export interface GetCustomerGatewaysOutputArgs {
    /**
     * ID of the VPN customer gateways.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string of VPN customer gateways name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * Save the result to the file.
     */
    outputFile?: pulumi.Input<string>;
}
