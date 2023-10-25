// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Assigns a RAM role to ApsaraDB for Redis.
 *
 * The log management feature of ApsaraDB for Redis requires the resources of [Log Service](https://www.alibabacloud.com/help/doc-detail/48869.htm).
 * To use the log management feature of ApsaraDB for Redis, you can call this operation to associate the RAM role named AliyunServiceRoleForKvstore with the ApsaraDB for Redis instance.
 * For more information, see [Associated RAM roles of ApsaraDB for Redis](https://www.alibabacloud.com/help/doc-detail/184337.htm)
 *
 * > **NOTE:** Available since v1.128.0
 */
export function getPermission(args?: GetPermissionArgs, opts?: pulumi.InvokeOptions): Promise<GetPermissionResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kvstore/getPermission:getPermission", {
        "enable": args.enable,
    }, opts);
}

/**
 * A collection of arguments for invoking getPermission.
 */
export interface GetPermissionArgs {
    /**
     * Setting the value to `On` to assigns a RAM role to ApsaraDB for Redis. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
     */
    enable?: string;
}

/**
 * A collection of values returned by getPermission.
 */
export interface GetPermissionResult {
    readonly enable?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The current service enable status.
     */
    readonly status: string;
}
/**
 * Assigns a RAM role to ApsaraDB for Redis.
 *
 * The log management feature of ApsaraDB for Redis requires the resources of [Log Service](https://www.alibabacloud.com/help/doc-detail/48869.htm).
 * To use the log management feature of ApsaraDB for Redis, you can call this operation to associate the RAM role named AliyunServiceRoleForKvstore with the ApsaraDB for Redis instance.
 * For more information, see [Associated RAM roles of ApsaraDB for Redis](https://www.alibabacloud.com/help/doc-detail/184337.htm)
 *
 * > **NOTE:** Available since v1.128.0
 */
export function getPermissionOutput(args?: GetPermissionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPermissionResult> {
    return pulumi.output(args).apply((a: any) => getPermission(a, opts))
}

/**
 * A collection of arguments for invoking getPermission.
 */
export interface GetPermissionOutputArgs {
    /**
     * Setting the value to `On` to assigns a RAM role to ApsaraDB for Redis. If has been enabled, return the result. Valid values: "On" or "Off". Default to "Off".
     */
    enable?: pulumi.Input<string>;
}
