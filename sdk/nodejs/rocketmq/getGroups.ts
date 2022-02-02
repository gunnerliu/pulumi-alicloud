// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides a list of ONS Groups in an Alibaba Cloud account according to the specified filters.
 *
 * > **NOTE:** Available in 1.53.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "onsInstanceName";
 * const groupName = config.get("groupName") || "GID-onsGroupDatasourceName";
 * const defaultInstance = new alicloud.rocketmq.Instance("defaultInstance", {
 *     instanceName: name,
 *     remark: "default_ons_instance_remark",
 * });
 * const defaultGroup = new alicloud.rocketmq.Group("defaultGroup", {
 *     groupName: groupName,
 *     instanceId: defaultInstance.id,
 *     remark: "dafault_ons_group_remark",
 * });
 * const groupsDs = defaultGroup.instanceId.apply(instanceId => alicloud.rocketmq.getGroupsOutput({
 *     instanceId: instanceId,
 *     nameRegex: _var.group_id,
 *     outputFile: "groups.txt",
 * }));
 * export const firstGroupName = groupsDs.apply(groupsDs => groupsDs.groups?[0]?.groupName);
 * ```
 */
export function getGroups(args: GetGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:rocketmq/getGroups:getGroups", {
        "groupIdRegex": args.groupIdRegex,
        "groupType": args.groupType,
        "ids": args.ids,
        "instanceId": args.instanceId,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsArgs {
    /**
     * A regex string to filter results by the group name.
     */
    groupIdRegex?: string;
    /**
     * Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
     */
    groupType?: string;
    /**
     * A list of group names.
     */
    ids?: string[];
    /**
     * ID of the ONS Instance that owns the groups.
     */
    instanceId: string;
    nameRegex?: string;
    outputFile?: string;
    /**
     * A map of tags assigned to the Ons instance.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getGroups.
 */
export interface GetGroupsResult {
    readonly groupIdRegex?: string;
    /**
     * Specify the protocol applicable to the created Group ID.
     */
    readonly groupType?: string;
    /**
     * A list of groups. Each element contains the following attributes:
     */
    readonly groups: outputs.rocketmq.GetGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of group names.
     */
    readonly ids: string[];
    readonly instanceId: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * A map of tags assigned to the Ons group.
     */
    readonly tags?: {[key: string]: any};
}

export function getGroupsOutput(args: GetGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGroupsResult> {
    return pulumi.output(args).apply(a => getGroups(a, opts))
}

/**
 * A collection of arguments for invoking getGroups.
 */
export interface GetGroupsOutputArgs {
    /**
     * A regex string to filter results by the group name.
     */
    groupIdRegex?: pulumi.Input<string>;
    /**
     * Specify the protocol applicable to the created Group ID. Valid values: `tcp`, `http`. Default to `tcp`.
     */
    groupType?: pulumi.Input<string>;
    /**
     * A list of group names.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the ONS Instance that owns the groups.
     */
    instanceId: pulumi.Input<string>;
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * A map of tags assigned to the Ons instance.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
