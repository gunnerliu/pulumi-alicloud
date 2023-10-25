// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Alb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.131.0.
 */
export function getServerGroups(args?: GetServerGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetServerGroupsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:alb/getServerGroups:getServerGroups", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "resourceGroupId": args.resourceGroupId,
        "serverGroupIds": args.serverGroupIds,
        "serverGroupName": args.serverGroupName,
        "status": args.status,
        "tags": args.tags,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Server Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The server group ids.
     */
    serverGroupIds?: string[];
    /**
     * The name of the resource.
     */
    serverGroupName?: string;
    /**
     * The status of the resource.
     */
    status?: string;
    /**
     * A map of tags assigned to the group.
     */
    tags?: {[key: string]: any};
    /**
     * The ID of the VPC that you want to access.
     */
    vpcId?: string;
}

/**
 * A collection of values returned by getServerGroups.
 */
export interface GetServerGroupsResult {
    readonly enableDetails?: boolean;
    /**
     * A list of Alb Server Groups. Each element contains the following attributes:
     */
    readonly groups: outputs.alb.GetServerGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Server Group names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly resourceGroupId?: string;
    readonly serverGroupIds?: string[];
    /**
     * The name of the resource.
     */
    readonly serverGroupName?: string;
    /**
     * The status of the resource. Valid values: `Provisioning`, `Available` and `Configuring`.
     */
    readonly status?: string;
    /**
     * The tags of the resource.
     */
    readonly tags?: {[key: string]: any};
    /**
     * The ID of the VPC that you want to access.
     */
    readonly vpcId?: string;
}
/**
 * This data source provides the Alb Server Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available since v1.131.0.
 */
export function getServerGroupsOutput(args?: GetServerGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServerGroupsResult> {
    return pulumi.output(args).apply((a: any) => getServerGroups(a, opts))
}

/**
 * A collection of arguments for invoking getServerGroups.
 */
export interface GetServerGroupsOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Server Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Server Group name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The server group ids.
     */
    serverGroupIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the resource.
     */
    serverGroupName?: pulumi.Input<string>;
    /**
     * The status of the resource.
     */
    status?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the group.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
    /**
     * The ID of the VPC that you want to access.
     */
    vpcId?: pulumi.Input<string>;
}
