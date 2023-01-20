// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
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
 * const defaultSimpleOfficeSite = new alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite", {
 *     cidrBlock: "172.16.0.0/12",
 *     desktopAccessType: "Internet",
 *     officeSiteName: "example_value",
 * });
 * const defaultNetworkPackage = new alicloud.eds.NetworkPackage("defaultNetworkPackage", {
 *     bandwidth: 10,
 *     officeSiteId: defaultSimpleOfficeSite.id,
 * });
 * const defaultNetworkPackages = alicloud.eds.getNetworkPackagesOutput({
 *     ids: [defaultNetworkPackage.id],
 * });
 * export const ecdNetworkPackageId1 = defaultNetworkPackages.apply(defaultNetworkPackages => defaultNetworkPackages.packages?.[0]?.id);
 * ```
 */
export function getNetworkPackages(args?: GetNetworkPackagesArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkPackagesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eds/getNetworkPackages:getNetworkPackages", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkPackages.
 */
export interface GetNetworkPackagesArgs {
    /**
     * A list of Network Package IDs.
     */
    ids?: string[];
    outputFile?: string;
    /**
     * The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     */
    status?: string;
}

/**
 * A collection of values returned by getNetworkPackages.
 */
export interface GetNetworkPackagesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly packages: outputs.eds.GetNetworkPackagesPackage[];
    readonly status?: string;
}
/**
 * This data source provides the Ecd Network Packages of the current Alibaba Cloud user.
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
 * const defaultSimpleOfficeSite = new alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite", {
 *     cidrBlock: "172.16.0.0/12",
 *     desktopAccessType: "Internet",
 *     officeSiteName: "example_value",
 * });
 * const defaultNetworkPackage = new alicloud.eds.NetworkPackage("defaultNetworkPackage", {
 *     bandwidth: 10,
 *     officeSiteId: defaultSimpleOfficeSite.id,
 * });
 * const defaultNetworkPackages = alicloud.eds.getNetworkPackagesOutput({
 *     ids: [defaultNetworkPackage.id],
 * });
 * export const ecdNetworkPackageId1 = defaultNetworkPackages.apply(defaultNetworkPackages => defaultNetworkPackages.packages?.[0]?.id);
 * ```
 */
export function getNetworkPackagesOutput(args?: GetNetworkPackagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkPackagesResult> {
    return pulumi.output(args).apply((a: any) => getNetworkPackages(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkPackages.
 */
export interface GetNetworkPackagesOutputArgs {
    /**
     * A list of Network Package IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    outputFile?: pulumi.Input<string>;
    /**
     * The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     */
    status?: pulumi.Input<string>;
}
