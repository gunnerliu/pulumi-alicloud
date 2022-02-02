// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecd Desktops of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.144.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const defaultSimpleOfficeSite = new alicloud.eds.SimpleOfficeSite("defaultSimpleOfficeSite", {
 *     cidrBlock: "172.16.0.0/12",
 *     desktopAccessType: "Internet",
 *     officeSiteName: "your_office_site_name",
 * });
 * const defaultBundles = alicloud.eds.getBundles({
 *     bundleType: "SYSTEM",
 * });
 * const defaultEcdPolicyGroup = new alicloud.eds.EcdPolicyGroup("defaultEcdPolicyGroup", {
 *     policyGroupName: "your_policy_group_name",
 *     clipboard: "readwrite",
 *     localDrive: "read",
 *     authorizeAccessPolicyRules: [{
 *         description: "example_value",
 *         cidrIp: "1.2.3.4/24",
 *     }],
 *     authorizeSecurityPolicyRules: [{
 *         type: "inflow",
 *         policy: "accept",
 *         description: "example_value",
 *         portRange: "80/80",
 *         ipProtocol: "TCP",
 *         priority: "1",
 *         cidrIp: "0.0.0.0/0",
 *     }],
 * });
 * const defaultUser = new alicloud.eds.User("defaultUser", {
 *     endUserId: "your_end_user_id",
 *     email: "your_email",
 *     phone: "your_phone",
 *     password: "your_password",
 * });
 * const defaultDesktop = new alicloud.eds.Desktop("defaultDesktop", {
 *     officeSiteId: defaultSimpleOfficeSite.id,
 *     policyGroupId: defaultEcdPolicyGroup.id,
 *     bundleId: defaultBundles.then(defaultBundles => defaultBundles.bundles?[0]?.id),
 *     desktopName: "your_desktop_name",
 *     endUserIds: [defaultUser.id],
 * });
 * const ids = alicloud.eds.getDesktopsOutput({
 *     ids: [defaultDesktop.id],
 * });
 * export const ecdDesktopId1 = ids.apply(ids => ids.desktops?[0]?.id);
 * const nameRegex = defaultDesktop.desktopName.apply(desktopName => alicloud.eds.getDesktopsOutput({
 *     nameRegex: desktopName,
 * }));
 * export const ecdDesktopId2 = nameRegex.apply(nameRegex => nameRegex.desktops?[0]?.id);
 * ```
 */
export function getDesktops(args?: GetDesktopsArgs, opts?: pulumi.InvokeOptions): Promise<GetDesktopsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:eds/getDesktops:getDesktops", {
        "desktopName": args.desktopName,
        "endUserIds": args.endUserIds,
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "officeSiteId": args.officeSiteId,
        "outputFile": args.outputFile,
        "policyGroupId": args.policyGroupId,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getDesktops.
 */
export interface GetDesktopsArgs {
    /**
     * The desktop name of the Desktop.
     */
    desktopName?: string;
    /**
     * The desktop end user id of the Desktop.
     */
    endUserIds?: string[];
    /**
     * A list of Desktop IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Desktop name.
     */
    nameRegex?: string;
    /**
     * The ID of the Simple Office Site.
     */
    officeSiteId?: string;
    outputFile?: string;
    /**
     * The policy group id of the Desktop.
     */
    policyGroupId?: string;
    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     */
    status?: string;
}

/**
 * A collection of values returned by getDesktops.
 */
export interface GetDesktopsResult {
    readonly desktopName?: string;
    readonly desktops: outputs.eds.GetDesktopsDesktop[];
    readonly endUserIds?: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly officeSiteId?: string;
    readonly outputFile?: string;
    readonly policyGroupId?: string;
    readonly status?: string;
}

export function getDesktopsOutput(args?: GetDesktopsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDesktopsResult> {
    return pulumi.output(args).apply(a => getDesktops(a, opts))
}

/**
 * A collection of arguments for invoking getDesktops.
 */
export interface GetDesktopsOutputArgs {
    /**
     * The desktop name of the Desktop.
     */
    desktopName?: pulumi.Input<string>;
    /**
     * The desktop end user id of the Desktop.
     */
    endUserIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Desktop IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Desktop name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * The ID of the Simple Office Site.
     */
    officeSiteId?: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
    /**
     * The policy group id of the Desktop.
     */
    policyGroupId?: pulumi.Input<string>;
    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     */
    status?: pulumi.Input<string>;
}
