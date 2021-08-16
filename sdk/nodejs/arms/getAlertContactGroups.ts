// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Arms Alert Contact Groups of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.131.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const nameRegex = alicloud.arms.getAlertContactGroups({
 *     nameRegex: "^my-AlertContactGroup",
 * });
 * export const armsAlertContactGroupId = nameRegex.then(nameRegex => nameRegex.groups[0].id);
 * ```
 */
export function getAlertContactGroups(args?: GetAlertContactGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertContactGroupsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:arms/getAlertContactGroups:getAlertContactGroups", {
        "alertContactGroupName": args.alertContactGroupName,
        "contactId": args.contactId,
        "contactName": args.contactName,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertContactGroups.
 */
export interface GetAlertContactGroupsArgs {
    /**
     * The name of the resource.
     */
    readonly alertContactGroupName?: string;
    /**
     * The contact id.
     */
    readonly contactId?: string;
    /**
     * The contact name.
     */
    readonly contactName?: string;
    /**
     * A list of Alert Contact Group IDs.
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by Alert Contact Group name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getAlertContactGroups.
 */
export interface GetAlertContactGroupsResult {
    readonly alertContactGroupName?: string;
    readonly contactId?: string;
    readonly contactName?: string;
    readonly groups: outputs.arms.GetAlertContactGroupsGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
}
