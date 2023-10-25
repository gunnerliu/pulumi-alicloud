// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.136.0+.
 */
export function getAppGroups(args?: GetAppGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetAppGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:opensearch/getAppGroups:getAppGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "name": args.name,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getAppGroups.
 */
export interface GetAppGroupsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of App Group IDs. Its element value is same as App Group Name.
     */
    ids?: string[];
    /**
     * The Instance ID.
     */
    instanceId?: string;
    name?: string;
    /**
     * A regex string to filter results by App Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The Resource Group ID.
     */
    resourceGroupId?: string;
    /**
     * Application type. Valid Values: `standard`, `enhanced`.
     */
    type?: string;
}

/**
 * A collection of values returned by getAppGroups.
 */
export interface GetAppGroupsResult {
    readonly enableDetails?: boolean;
    readonly groups: outputs.opensearch.GetAppGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly instanceId?: string;
    readonly name?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly type?: string;
}
/**
 * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.136.0+.
 */
export function getAppGroupsOutput(args?: GetAppGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAppGroupsResult> {
    return pulumi.output(args).apply((a: any) => getAppGroups(a, opts))
}

/**
 * A collection of arguments for invoking getAppGroups.
 */
export interface GetAppGroupsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of App Group IDs. Its element value is same as App Group Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Instance ID.
     */
    instanceId?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    /**
     * A regex string to filter results by App Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The Resource Group ID.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * Application type. Valid Values: `standard`, `enhanced`.
     */
    type?: pulumi.Input<string>;
}
