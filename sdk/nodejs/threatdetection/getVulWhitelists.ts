// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Threat Detection Vul Whitelists of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.threatdetection.getVulWhitelists({
 *     ids: ["example_id"],
 * });
 * export const alicloudThreatDetectionVulWhitelistExampleId = _default.then(_default => _default.whitelists?.[0]?.id);
 * ```
 */
export function getVulWhitelists(args?: GetVulWhitelistsArgs, opts?: pulumi.InvokeOptions): Promise<GetVulWhitelistsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:threatdetection/getVulWhitelists:getVulWhitelists", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
    }, opts);
}

/**
 * A collection of arguments for invoking getVulWhitelists.
 */
export interface GetVulWhitelistsArgs {
    /**
     * A list of Threat Detection Vul Whitelist IDs.
     */
    ids?: string[];
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
}

/**
 * A collection of values returned by getVulWhitelists.
 */
export interface GetVulWhitelistsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * A list of Vul Whitelist Entries. Each element contains the following attributes:
     */
    readonly whitelists: outputs.threatdetection.GetVulWhitelistsWhitelist[];
}
/**
 * This data source provides Threat Detection Vul Whitelists of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.195.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const default = alicloud.threatdetection.getVulWhitelists({
 *     ids: ["example_id"],
 * });
 * export const alicloudThreatDetectionVulWhitelistExampleId = _default.then(_default => _default.whitelists?.[0]?.id);
 * ```
 */
export function getVulWhitelistsOutput(args?: GetVulWhitelistsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVulWhitelistsResult> {
    return pulumi.output(args).apply((a: any) => getVulWhitelists(a, opts))
}

/**
 * A collection of arguments for invoking getVulWhitelists.
 */
export interface GetVulWhitelistsOutputArgs {
    /**
     * A list of Threat Detection Vul Whitelist IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
}
