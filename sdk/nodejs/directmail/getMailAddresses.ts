// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Direct Mail Mail Addresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.134.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.directmail.getMailAddresses({
 *     ids: ["example_id"],
 * });
 * export const directMailMailAddressId1 = ids.then(ids => ids.addresses?[0]?.id);
 * ```
 */
export function getMailAddresses(args?: GetMailAddressesArgs, opts?: pulumi.InvokeOptions): Promise<GetMailAddressesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:directmail/getMailAddresses:getMailAddresses", {
        "ids": args.ids,
        "keyWord": args.keyWord,
        "outputFile": args.outputFile,
        "sendtype": args.sendtype,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getMailAddresses.
 */
export interface GetMailAddressesArgs {
    /**
     * A list of Mail Address IDs.
     */
    ids?: string[];
    /**
     * The key word about account email address.
     */
    keyWord?: string;
    outputFile?: string;
    /**
     * Account type.
     */
    sendtype?: string;
    /**
     * Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     */
    status?: string;
}

/**
 * A collection of values returned by getMailAddresses.
 */
export interface GetMailAddressesResult {
    readonly addresses: outputs.directmail.GetMailAddressesAddress[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly keyWord?: string;
    readonly outputFile?: string;
    readonly sendtype?: string;
    readonly status?: string;
}

export function getMailAddressesOutput(args?: GetMailAddressesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMailAddressesResult> {
    return pulumi.output(args).apply(a => getMailAddresses(a, opts))
}

/**
 * A collection of arguments for invoking getMailAddresses.
 */
export interface GetMailAddressesOutputArgs {
    /**
     * A list of Mail Address IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The key word about account email address.
     */
    keyWord?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * Account type.
     */
    sendtype?: pulumi.Input<string>;
    /**
     * Account Status. Valid values: `0`, `1`. Freeze: 1, normal: 0.
     */
    status?: pulumi.Input<string>;
}
