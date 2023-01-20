// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
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
 * const ids = alicloud.iot.getDeviceGroups({});
 * export const iotDeviceGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getDeviceGroups(args?: GetDeviceGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:iot/getDeviceGroups:getDeviceGroups", {
        "enableDetails": args.enableDetails,
        "groupName": args.groupName,
        "ids": args.ids,
        "iotInstanceId": args.iotInstanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "superGroupId": args.superGroupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceGroups.
 */
export interface GetDeviceGroupsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * The GroupName of the device group.
     */
    groupName?: string;
    /**
     * A list of device group IDs.
     */
    ids?: string[];
    /**
     * The id of the Iot Instance.
     */
    iotInstanceId?: string;
    /**
     * A regex string to filter CEN instances by name.
     */
    nameRegex?: string;
    outputFile?: string;
    /**
     * The id of the SuperGroup.
     */
    superGroupId?: string;
}

/**
 * A collection of values returned by getDeviceGroups.
 */
export interface GetDeviceGroupsResult {
    readonly enableDetails?: boolean;
    readonly groupName?: string;
    readonly groups: outputs.iot.GetDeviceGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly iotInstanceId?: string;
    readonly nameRegex?: string;
    readonly outputFile?: string;
    readonly superGroupId?: string;
}
/**
 * This data source provides the Iot Device Groups of the current Alibaba Cloud user.
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
 * const ids = alicloud.iot.getDeviceGroups({});
 * export const iotDeviceGroupId1 = ids.then(ids => ids.groups?.[0]?.id);
 * ```
 */
export function getDeviceGroupsOutput(args?: GetDeviceGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeviceGroupsResult> {
    return pulumi.output(args).apply((a: any) => getDeviceGroups(a, opts))
}

/**
 * A collection of arguments for invoking getDeviceGroups.
 */
export interface GetDeviceGroupsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * The GroupName of the device group.
     */
    groupName?: pulumi.Input<string>;
    /**
     * A list of device group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The id of the Iot Instance.
     */
    iotInstanceId?: pulumi.Input<string>;
    /**
     * A regex string to filter CEN instances by name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The id of the SuperGroup.
     */
    superGroupId?: pulumi.Input<string>;
}
