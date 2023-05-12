// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecd Ad Connector Directories of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.174.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.eds.getAdConnectorDirectories({
 *     ids: ["example_id"],
 * });
 * export const ecdAdConnectorDirectoryId1 = ids.then(ids => ids.directories?.[0]?.id);
 * ```
 */
export function getAdConnectorDirectories(args?: GetAdConnectorDirectoriesArgs, opts?: pulumi.InvokeOptions): Promise<GetAdConnectorDirectoriesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:eds/getAdConnectorDirectories:getAdConnectorDirectories", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getAdConnectorDirectories.
 */
export interface GetAdConnectorDirectoriesArgs {
    /**
     * A list of Ad Connector Directory IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Ad Connector Directory name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of directory.
     */
    status?: string;
}

/**
 * A collection of values returned by getAdConnectorDirectories.
 */
export interface GetAdConnectorDirectoriesResult {
    readonly directories: outputs.eds.GetAdConnectorDirectoriesDirectory[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly status?: string;
}
/**
 * This data source provides the Ecd Ad Connector Directories of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.174.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.eds.getAdConnectorDirectories({
 *     ids: ["example_id"],
 * });
 * export const ecdAdConnectorDirectoryId1 = ids.then(ids => ids.directories?.[0]?.id);
 * ```
 */
export function getAdConnectorDirectoriesOutput(args?: GetAdConnectorDirectoriesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAdConnectorDirectoriesResult> {
    return pulumi.output(args).apply((a: any) => getAdConnectorDirectories(a, opts))
}

/**
 * A collection of arguments for invoking getAdConnectorDirectories.
 */
export interface GetAdConnectorDirectoriesOutputArgs {
    /**
     * A list of Ad Connector Directory IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Ad Connector Directory name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of directory.
     */
    status?: pulumi.Input<string>;
}
