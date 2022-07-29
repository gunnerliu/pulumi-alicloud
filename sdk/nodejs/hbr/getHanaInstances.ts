// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Hbr Hana Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.178.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.hbr.getHanaInstances({
 *     ids: ["example_id"],
 * });
 * export const hbrHanaInstanceId1 = ids.then(ids => ids.instances?[0]?.id);
 * ```
 */
export function getHanaInstances(args?: GetHanaInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetHanaInstancesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:hbr/getHanaInstances:getHanaInstances", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "status": args.status,
        "vaultId": args.vaultId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHanaInstances.
 */
export interface GetHanaInstancesArgs {
    /**
     * A list of Hana Instance IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Hana Instance name.
     */
    nameRegex?: string;
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The status of the SAP HANA instance.
     */
    status?: string;
    /**
     * The ID of the backup vault.
     */
    vaultId?: string;
}

/**
 * A collection of values returned by getHanaInstances.
 */
export interface GetHanaInstancesResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instances: outputs.hbr.GetHanaInstancesInstance[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly status?: string;
    readonly vaultId?: string;
}

export function getHanaInstancesOutput(args?: GetHanaInstancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetHanaInstancesResult> {
    return pulumi.output(args).apply(a => getHanaInstances(a, opts))
}

/**
 * A collection of arguments for invoking getHanaInstances.
 */
export interface GetHanaInstancesOutputArgs {
    /**
     * A list of Hana Instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Hana Instance name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The status of the SAP HANA instance.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the backup vault.
     */
    vaultId?: pulumi.Input<string>;
}
