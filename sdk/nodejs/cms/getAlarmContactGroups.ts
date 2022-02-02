// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the CMS Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.101.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = pulumi.output(alicloud.cms.getAlarmContactGroups({
 *     nameRegex: "tf-testacc",
 * }));
 * ```
 */
export function getAlarmContactGroups(args?: GetAlarmContactGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlarmContactGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:cms/getAlarmContactGroups:getAlarmContactGroups", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlarmContactGroups.
 */
export interface GetAlarmContactGroupsArgs {
    /**
     * A list of Alarm Contact Group IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Alarm Contact Group name.
     */
    nameRegex?: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getAlarmContactGroups.
 */
export interface GetAlarmContactGroupsResult {
    readonly groups: outputs.cms.GetAlarmContactGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}

export function getAlarmContactGroupsOutput(args?: GetAlarmContactGroupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlarmContactGroupsResult> {
    return pulumi.output(args).apply(a => getAlarmContactGroups(a, opts))
}

/**
 * A collection of arguments for invoking getAlarmContactGroups.
 */
export interface GetAlarmContactGroupsOutputArgs {
    /**
     * A list of Alarm Contact Group IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Alarm Contact Group name.
     */
    nameRegex?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
