// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.203.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ocean.getBaseInstances({});
 * export const oceanBaseInstanceId1 = ids.then(ids => ids.instances?.[0]?.id);
 * const nameRegex = alicloud.ocean.getBaseInstances({
 *     nameRegex: "^my-Instance",
 * });
 * export const oceanBaseInstanceId2 = nameRegex.then(nameRegex => nameRegex.instances?.[0]?.id);
 * ```
 */
export function getBaseInstances(args?: GetBaseInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetBaseInstancesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ocean/getBaseInstances:getBaseInstances", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "instanceName": args.instanceName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "resourceGroupId": args.resourceGroupId,
        "searchKey": args.searchKey,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getBaseInstances.
 */
export interface GetBaseInstancesArgs {
    enableDetails?: boolean;
    /**
     * A list of Instance IDs.
     */
    ids?: string[];
    /**
     * OceanBase cluster ID.
     */
    instanceId?: string;
    /**
     * OceanBase cluster name.
     */
    instanceName?: string;
    /**
     * A regex string to filter results by Instance name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The ID of the enterprise resource group to which the instance resides.
     */
    resourceGroupId?: string;
    /**
     * The filter keyword for the query list.
     */
    searchKey?: string;
    /**
     * The status of the resource.
     */
    status?: string;
}

/**
 * A collection of values returned by getBaseInstances.
 */
export interface GetBaseInstancesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId?: string;
    readonly instanceName?: string;
    readonly instances: outputs.ocean.GetBaseInstancesInstance[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    readonly resourceGroupId?: string;
    readonly searchKey?: string;
    readonly status?: string;
}
/**
 * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.203.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ids = alicloud.ocean.getBaseInstances({});
 * export const oceanBaseInstanceId1 = ids.then(ids => ids.instances?.[0]?.id);
 * const nameRegex = alicloud.ocean.getBaseInstances({
 *     nameRegex: "^my-Instance",
 * });
 * export const oceanBaseInstanceId2 = nameRegex.then(nameRegex => nameRegex.instances?.[0]?.id);
 * ```
 */
export function getBaseInstancesOutput(args?: GetBaseInstancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBaseInstancesResult> {
    return pulumi.output(args).apply((a: any) => getBaseInstances(a, opts))
}

/**
 * A collection of arguments for invoking getBaseInstances.
 */
export interface GetBaseInstancesOutputArgs {
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Instance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * OceanBase cluster ID.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * OceanBase cluster name.
     */
    instanceName?: pulumi.Input<string>;
    /**
     * A regex string to filter results by Instance name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The ID of the enterprise resource group to which the instance resides.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The filter keyword for the query list.
     */
    searchKey?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
}
